package com.gtshub.orderprocess.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class VehicleOrderException extends RuntimeException {

    private final String status;
    private final String description;

}
