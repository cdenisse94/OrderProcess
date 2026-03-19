package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class OrderDetails {

    @JacksonXmlProperty(localName = "Type")
    private String type;

    @JacksonXmlProperty(localName = "Status")
    private String status;

    @JacksonXmlProperty(localName = "OrderDate")
    private String orderDate;

    @JacksonXmlProperty(localName = "EstimatedDeliveryDate")
    private String estimatedDeliveryDate;
}
