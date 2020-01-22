
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
    "action",
    "isStubbed",
    "taskDesc",
    "reqLoc",
    "incrementParms",
    "compareTag",
    "compareValue",
    "comparisonType",
    "expectedReqLoc",
    "expectedResLoc",
    "verificationSequence"
})
public class Step {

    @JsonProperty("action")
    private String action;
    @JsonProperty("isStubbed")
    private String isStubbed;
    @JsonProperty("taskDesc")
    private String taskDesc;
    @JsonProperty("reqLoc")
    private String reqLoc;
    @JsonProperty("incrementParms")
    private String incrementParms;
    @JsonProperty("compareTag")
    private String compareTag;
    @JsonProperty("compareValue")
    private String compareValue;
    @JsonProperty("comparisonType")
    private String comparisonType;
    @JsonProperty("expectedReqLoc")
    private String expectedReqLoc;
    @JsonProperty("expectedResLoc")
    private String expectedResLoc;
    @JsonProperty("verificationSequence")
    private VerificationSequence verificationSequence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("isStubbed")
    public String getIsStubbed() {
        return isStubbed;
    }

    @JsonProperty("isStubbed")
    public void setIsStubbed(String isStubbed) {
        this.isStubbed = isStubbed;
    }

    @JsonProperty("taskDesc")
    public String getTaskDesc() {
        return taskDesc;
    }

    @JsonProperty("taskDesc")
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    @JsonProperty("reqLoc")
    public String getReqLoc() {
        return reqLoc;
    }

    @JsonProperty("reqLoc")
    public void setReqLoc(String reqLoc) {
        this.reqLoc = reqLoc;
    }

    @JsonProperty("incrementParms")
    public String getIncrementParms() {
        return incrementParms;
    }

    @JsonProperty("incrementParms")
    public void setIncrementParms(String incrementParms) {
        this.incrementParms = incrementParms;
    }

    @JsonProperty("compareTag")
    public String getCompareTag() {
        return compareTag;
    }

    @JsonProperty("compareTag")
    public void setCompareTag(String compareTag) {
        this.compareTag = compareTag;
    }

    @JsonProperty("compareValue")
    public String getCompareValue() {
        return compareValue;
    }

    @JsonProperty("compareValue")
    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    @JsonProperty("comparisonType")
    public String getComparisonType() {
        return comparisonType;
    }

    @JsonProperty("comparisonType")
    public void setComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
    }

    @JsonProperty("expectedReqLoc")
    public String getExpectedReqLoc() {
        return expectedReqLoc;
    }

    @JsonProperty("expectedReqLoc")
    public void setExpectedReqLoc(String expectedReqLoc) {
        this.expectedReqLoc = expectedReqLoc;
    }

    @JsonProperty("expectedResLoc")
    public String getExpectedResLoc() {
        return expectedResLoc;
    }

    @JsonProperty("expectedResLoc")
    public void setExpectedResLoc(String expectedResLoc) {
        this.expectedResLoc = expectedResLoc;
    }

    @JsonProperty("verificationSequence")
    public VerificationSequence getVerificationSequence() {
        return verificationSequence;
    }

    @JsonProperty("verificationSequence")
    public void setVerificationSequence(VerificationSequence verificationSequence) {
        this.verificationSequence = verificationSequence;
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
        return new ToStringBuilder(this).append("action", action).append("isStubbed", isStubbed).append("taskDesc", taskDesc).append("reqLoc", reqLoc).append("incrementParms", incrementParms).append("compareTag", compareTag).append("compareValue", compareValue).append("comparisonType", comparisonType).append("expectedReqLoc", expectedReqLoc).append("expectedResLoc", expectedResLoc).append("verificationSequence", verificationSequence).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(compareValue).append(expectedReqLoc).append(isStubbed).append(expectedResLoc).append(reqLoc).append(verificationSequence).append(incrementParms).append(taskDesc).append(comparisonType).append(action).append(additionalProperties).append(compareTag).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step) == false) {
            return false;
        }
        Step rhs = ((Step) other);
        return new EqualsBuilder().append(compareValue, rhs.compareValue).append(expectedReqLoc, rhs.expectedReqLoc).append(isStubbed, rhs.isStubbed).append(expectedResLoc, rhs.expectedResLoc).append(reqLoc, rhs.reqLoc).append(verificationSequence, rhs.verificationSequence).append(incrementParms, rhs.incrementParms).append(taskDesc, rhs.taskDesc).append(comparisonType, rhs.comparisonType).append(action, rhs.action).append(additionalProperties, rhs.additionalProperties).append(compareTag, rhs.compareTag).isEquals();
    }

}
