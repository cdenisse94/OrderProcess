package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class OrderIdentification {

    @JacksonXmlProperty(localName = "OrderNumber")
    private String orderNumber;

    @JacksonXmlProperty(localName = "ReferenceNumber")
    private String referenceNumber;

    @JacksonXmlProperty(localName = "DealerOrderNumber")
    private String dealerOrderNumber;
}
