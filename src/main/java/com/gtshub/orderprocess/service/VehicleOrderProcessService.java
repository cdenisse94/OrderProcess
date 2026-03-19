package com.gtshub.orderprocess.service;

import com.gtshub.orderprocess.dto.VehicleOrderRequest;
import com.gtshub.orderprocess.dto.VehicleOrderResponse;
import com.gtshub.orderprocess.exception.VehicleOrderException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VehicleOrderProcessService {

    public VehicleOrderResponse processOrder(VehicleOrderRequest vehicleOrderRequest) throws VehicleOrderException {
        log.info("Processing vehicle order: {}", vehicleOrderRequest);



        return new VehicleOrderResponse("SUCCESS","Order processed successfully");
    }

}
