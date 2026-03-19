package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class Manufacturing {

    @JacksonXmlProperty(localName = "ProductionPlant")
    private String productionPlant;

    @JacksonXmlProperty(localName = "ProductionLine")
    private String productionLine;

    @JacksonXmlProperty(localName = "ScheduledBuildDate")
    private String scheduledBuildDate;

    @JacksonXmlProperty(localName = "ActualBuildDate")
    private String actualBuildDate;

    @JacksonXmlProperty(localName = "ReleaseDate")
    private String releaseDate;
}
