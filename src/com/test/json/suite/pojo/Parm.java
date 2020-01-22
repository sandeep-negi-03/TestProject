
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
    "name",
    "verifyWithExpected",
    "startsWith",
    "endsWith",
    "containsString",
    "stringLength"
})
public class Parm {

    @JsonProperty("name")
    private String name;
    @JsonProperty("verifyWithExpected")
    private String verifyWithExpected;
    @JsonProperty("startsWith")
    private String startsWith;
    @JsonProperty("endsWith")
    private String endsWith;
    @JsonProperty("containsString")
    private String containsString;
    @JsonProperty("stringLength")
    private String stringLength;
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

    @JsonProperty("verifyWithExpected")
    public String getVerifyWithExpected() {
        return verifyWithExpected;
    }

    @JsonProperty("verifyWithExpected")
    public void setVerifyWithExpected(String verifyWithExpected) {
        this.verifyWithExpected = verifyWithExpected;
    }

    @JsonProperty("startsWith")
    public String getStartsWith() {
        return startsWith;
    }

    @JsonProperty("startsWith")
    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    @JsonProperty("endsWith")
    public String getEndsWith() {
        return endsWith;
    }

    @JsonProperty("endsWith")
    public void setEndsWith(String endsWith) {
        this.endsWith = endsWith;
    }

    @JsonProperty("containsString")
    public String getContainsString() {
        return containsString;
    }

    @JsonProperty("containsString")
    public void setContainsString(String containsString) {
        this.containsString = containsString;
    }

    @JsonProperty("stringLength")
    public String getStringLength() {
        return stringLength;
    }

    @JsonProperty("stringLength")
    public void setStringLength(String stringLength) {
        this.stringLength = stringLength;
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
        return new ToStringBuilder(this).append("name", name).append("verifyWithExpected", verifyWithExpected).append("startsWith", startsWith).append("endsWith", endsWith).append("containsString", containsString).append("stringLength", stringLength).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(endsWith).append(containsString).append(verifyWithExpected).append(additionalProperties).append(stringLength).append(startsWith).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parm) == false) {
            return false;
        }
        Parm rhs = ((Parm) other);
        return new EqualsBuilder().append(name, rhs.name).append(endsWith, rhs.endsWith).append(containsString, rhs.containsString).append(verifyWithExpected, rhs.verifyWithExpected).append(additionalProperties, rhs.additionalProperties).append(stringLength, rhs.stringLength).append(startsWith, rhs.startsWith).isEquals();
    }

}
