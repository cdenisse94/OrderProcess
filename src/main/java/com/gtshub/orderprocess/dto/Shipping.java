package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class Shipping {

    @JacksonXmlProperty(localName = "OriginPoint")
    private String originPoint;

    @JacksonXmlProperty(localName = "DestinationPoint")
    private String destinationPoint;

    @JacksonXmlProperty(localName = "TransportMode")
    private String transportMode;
}
