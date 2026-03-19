package com.gtshub.orderprocess.controller;

import com.gtshub.orderprocess.dto.VehicleOrderRequest;
import com.gtshub.orderprocess.dto.VehicleOrderResponse;
import com.gtshub.orderprocess.exception.VehicleOrderException;
import com.gtshub.orderprocess.service.VehicleOrderProcessService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
@Tag(name = "Vehicle Order Processing", description = "API para procesar órdenes de vehículos")
public class VehicleOrderController {

    private final VehicleOrderProcessService vehicleOrderProcessService;

    public VehicleOrderController(VehicleOrderProcessService vehicleOrderProcessService) {
        this.vehicleOrderProcessService = vehicleOrderProcessService;
    }

    @PostMapping(value = "/process", consumes = "application/xml", produces = "application/json")
    @Operation(
            summary = "Procesa una orden de vehículo",
            description = "Recibe una orden de vehículo en formato XML y retorna el resultado del procesamiento en JSON"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Orden procesada exitosamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = VehicleOrderResponse.class),
                            examples = @ExampleObject(name = "Success Response", summary = "Respuesta exitosa", value = """
                                    {
                                      "status": "SUCCESS",
                                      "message": "Order processed successfully"
                                    }
                                    """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Error de validación en la orden",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = VehicleOrderResponse.class),
                            examples = @ExampleObject(name = "Validation Error", summary = "Error de validación", value = """
                                    {
                                      "status": "ERROR",
                                      "message": "FIELD validation failed: Invalid format"
                                    }
                                    """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = VehicleOrderResponse.class),
                            examples = @ExampleObject(name = "Internal Error", summary = "Error interno", value = """
                                    {
                                      "status": "INTERNAL_SERVER_ERROR",
                                      "message": "An unexpected error occurred"
                                    }
                                    """
                            )
                    )
            )
    })
    public ResponseEntity<VehicleOrderResponse> processVehicleOrder(@RequestBody VehicleOrderRequest vehicleOrderRequest) {
        try {
            return ResponseEntity.ok(vehicleOrderProcessService.processOrder(vehicleOrderRequest));
        } catch (VehicleOrderException voe) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new VehicleOrderResponse(voe.getStatus(), voe.getDescription()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new VehicleOrderResponse("INTERNAL_SERVER_ERROR", e.getMessage()));
        }
    }

}
