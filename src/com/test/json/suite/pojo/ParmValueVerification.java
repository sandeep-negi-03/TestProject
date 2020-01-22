
package com.test.json.suite.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allProcessesAgainstExpected",
    "skipFromParmValueVerifcation",
    "customParmValueVerification"
})
public class ParmValueVerification {

    @JsonProperty("allProcessesAgainstExpected")
    private String allProcessesAgainstExpected;
    @JsonProperty("skipFromParmValueVerifcation")
    private SkipFromParmValueVerifcation skipFromParmValueVerifcation;
    @JsonProperty("customParmValueVerification")
    private CustomParmValueVerification customParmValueVerification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("allProcessesAgainstExpected")
    public String getAllProcessesAgainstExpected() {
        return allProcessesAgainstExpected;
    }

    @JsonProperty("allProcessesAgainstExpected")
    public void setAllProcessesAgainstExpected(String allProcessesAgainstExpected) {
        this.allProcessesAgainstExpected = allProcessesAgainstExpected;
    }

    @JsonProperty("skipFromParmValueVerifcation")
    public SkipFromParmValueVerifcation getSkipFromParmValueVerifcation() {
        return skipFromParmValueVerifcation;
    }

    @JsonProperty("skipFromParmValueVerifcation")
    public void setSkipFromParmValueVerifcation(SkipFromParmValueVerifcation skipFromParmValueVerifcation) {
        this.skipFromParmValueVerifcation = skipFromParmValueVerifcation;
    }

    @JsonProperty("customParmValueVerification")
    public CustomParmValueVerification getCustomParmValueVerification() {
        return customParmValueVerification;
    }

    @JsonProperty("customParmValueVerification")
    public void setCustomParmValueVerification(CustomParmValueVerification customParmValueVerification) {
        this.customParmValueVerification = customParmValueVerification;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allProcessesAgainstExpected", allProcessesAgainstExpected).append("skipFromParmValueVerifcation", skipFromParmValueVerifcation).append("customParmValueVerification", customParmValueVerification).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customParmValueVerification).append(allProcessesAgainstExpected).append(additionalProperties).append(skipFromParmValueVerifcation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParmValueVerification) == false) {
            return false;
        }
        ParmValueVerification rhs = ((ParmValueVerification) other);
        return new EqualsBuilder().append(customParmValueVerification, rhs.customParmValueVerification).append(allProcessesAgainstExpected, rhs.allProcessesAgainstExpected).append(additionalProperties, rhs.additionalProperties).append(skipFromParmValueVerifcation, rhs.skipFromParmValueVerifcation).isEquals();
    }

}
