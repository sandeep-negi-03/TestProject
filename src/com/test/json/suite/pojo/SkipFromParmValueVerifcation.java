
package com.test.json.suite.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "enableConfiguration",
    "processToSkip"
})
public class SkipFromParmValueVerifcation {

    @JsonProperty("enableConfiguration")
    private String enableConfiguration;
    @JsonProperty("processToSkip")
    private List<ProcessToSkip> processToSkip = new ArrayList<ProcessToSkip>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("enableConfiguration")
    public String getEnableConfiguration() {
        return enableConfiguration;
    }

    @JsonProperty("enableConfiguration")
    public void setEnableConfiguration(String enableConfiguration) {
        this.enableConfiguration = enableConfiguration;
    }

    @JsonProperty("processToSkip")
    public List<ProcessToSkip> getProcessToSkip() {
        return processToSkip;
    }

    @JsonProperty("processToSkip")
    public void setProcessToSkip(List<ProcessToSkip> processToSkip) {
        this.processToSkip = processToSkip;
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
        return new ToStringBuilder(this).append("enableConfiguration", enableConfiguration).append("processToSkip", processToSkip).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(enableConfiguration).append(processToSkip).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkipFromParmValueVerifcation) == false) {
            return false;
        }
        SkipFromParmValueVerifcation rhs = ((SkipFromParmValueVerifcation) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(enableConfiguration, rhs.enableConfiguration).append(processToSkip, rhs.processToSkip).isEquals();
    }

}
