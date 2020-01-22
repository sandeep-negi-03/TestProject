
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
    "allParmsAgainstExpected",
    "parm"
})
public class Process_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("allParmsAgainstExpected")
    private String allParmsAgainstExpected;
    @JsonProperty("parm")
    private List<Parm> parm = new ArrayList<Parm>();
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

    @JsonProperty("allParmsAgainstExpected")
    public String getAllParmsAgainstExpected() {
        return allParmsAgainstExpected;
    }

    @JsonProperty("allParmsAgainstExpected")
    public void setAllParmsAgainstExpected(String allParmsAgainstExpected) {
        this.allParmsAgainstExpected = allParmsAgainstExpected;
    }

    @JsonProperty("parm")
    public List<Parm> getParm() {
        return parm;
    }

    @JsonProperty("parm")
    public void setParm(List<Parm> parm) {
        this.parm = parm;
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
        return new ToStringBuilder(this).append("name", name).append("allParmsAgainstExpected", allParmsAgainstExpected).append("parm", parm).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(allParmsAgainstExpected).append(parm).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Process_) == false) {
            return false;
        }
        Process_ rhs = ((Process_) other);
        return new EqualsBuilder().append(name, rhs.name).append(allParmsAgainstExpected, rhs.allParmsAgainstExpected).append(parm, rhs.parm).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
