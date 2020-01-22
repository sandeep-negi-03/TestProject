
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
    "workFlowVerification"
})
public class VerificationSequence {

    @JsonProperty("workFlowVerification")
    private WorkFlowVerification workFlowVerification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workFlowVerification")
    public WorkFlowVerification getWorkFlowVerification() {
        return workFlowVerification;
    }

    @JsonProperty("workFlowVerification")
    public void setWorkFlowVerification(WorkFlowVerification workFlowVerification) {
        this.workFlowVerification = workFlowVerification;
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
        return new ToStringBuilder(this).append("workFlowVerification", workFlowVerification).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(workFlowVerification).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerificationSequence) == false) {
            return false;
        }
        VerificationSequence rhs = ((VerificationSequence) other);
        return new EqualsBuilder().append(workFlowVerification, rhs.workFlowVerification).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
