package com.gtshub.orderprocess.dto;

import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
public class DistributionDealer {

    @JacksonXmlProperty(localName = "DealerCode")
    private String dealerCode;

    @JacksonXmlProperty(localName = "DealerName")
    private String dealerName;

    @JacksonXmlProperty(localName = "Region")
    private String region;

    @JacksonXmlProperty(localName = "Country")
    private String country;
}
