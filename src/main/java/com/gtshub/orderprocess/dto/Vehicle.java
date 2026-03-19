package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class Vehicle {

    @JacksonXmlProperty(localName = "VIN")
    private String vin;

    @JacksonXmlProperty(localName = "Model")
    private String model;

    @JacksonXmlProperty(localName = "Year")
    private Integer year;

    @JacksonXmlProperty(localName = "BodyStyle")
    private String bodyStyle;

    @JacksonXmlProperty(localName = "Color")
    private String color;
}
