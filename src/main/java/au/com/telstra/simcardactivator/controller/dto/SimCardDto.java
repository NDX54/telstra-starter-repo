package au.com.telstra.simcardactivator.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimCardDto {

    private final String iccid;
    private final String customerEmail;

    @JsonCreator
    public SimCardDto(
            @JsonProperty("iccid") String iccid,
            @JsonProperty("customerEmail") String customerEmail
    ) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
    }

    public String getIccid() {
        return this.iccid;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
}
