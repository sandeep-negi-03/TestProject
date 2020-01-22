
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
    "name",
    "skipAllParms",
    "parmToSkip"
})
public class ProcessToSkip {

    @JsonProperty("name")
    private String name;
    @JsonProperty("skipAllParms")
    private String skipAllParms;
    @JsonProperty("parmToSkip")
    private List<ParmToSkip> parmToSkip = new ArrayList<ParmToSkip>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("skipAllParms")
    public String getSkipAllParms() {
        return skipAllParms;
    }

    @JsonProperty("skipAllParms")
    public void setSkipAllParms(String skipAllParms) {
        this.skipAllParms = skipAllParms;
    }

    @JsonProperty("parmToSkip")
    public List<ParmToSkip> getParmToSkip() {
        return parmToSkip;
    }

    @JsonProperty("parmToSkip")
    public void setParmToSkip(List<ParmToSkip> parmToSkip) {
        this.parmToSkip = parmToSkip;
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
        return new ToStringBuilder(this).append("name", name).append("skipAllParms", skipAllParms).append("parmToSkip", parmToSkip).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(parmToSkip).append(additionalProperties).append(skipAllParms).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessToSkip) == false) {
            return false;
        }
        ProcessToSkip rhs = ((ProcessToSkip) other);
        return new EqualsBuilder().append(name, rhs.name).append(parmToSkip, rhs.parmToSkip).append(additionalProperties, rhs.additionalProperties).append(skipAllParms, rhs.skipAllParms).isEquals();
    }

}
