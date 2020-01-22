
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
    "desc",
    "suites"
})
public class SuiteCollection {

    @JsonProperty("desc")
    private String desc;
    @JsonProperty("suites")
    private List<Suite> suites = new ArrayList<Suite>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("suites")
    public List<Suite> getSuites() {
        return suites;
    }

    @JsonProperty("suites")
    public void setSuites(List<Suite> suites) {
        this.suites = suites;
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
        return new ToStringBuilder(this).append("desc", desc).append("suites", suites).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(suites).append(desc).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SuiteCollection) == false) {
            return false;
        }
        SuiteCollection rhs = ((SuiteCollection) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(suites, rhs.suites).append(desc, rhs.desc).isEquals();
    }

}
