package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
@JacksonXmlRootElement(localName = "VehicleOrder")
public class VehicleOrderRequest {

    @JacksonXmlProperty(localName = "OrderIdentification")
    private OrderIdentification orderIdentification;

    @JacksonXmlProperty(localName = "OrderDetails")
    private OrderDetails orderDetails;

    @JacksonXmlProperty(localName = "Vehicle")
    private Vehicle vehicle;

    @JacksonXmlProperty(localName = "Manufacturing")
    private Manufacturing manufacturing;

    @JacksonXmlProperty(localName = "DistributionDealer")
    private DistributionDealer distributionDealer;

    @JacksonXmlProperty(localName = "Shipping")
    private Shipping shipping;
}
