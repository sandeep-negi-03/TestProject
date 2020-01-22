
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
    "expectedFileName",
    "outputFileName",
    "isImpacted",
    "verificationStatus",
    "stepNo",
    "verifyProcessParmValues",
    "verifyProcessDependency",
    "ignorableProcesses",
    "parmValueVerification"
})
public class WorkFlowVerification {

    @JsonProperty("expectedFileName")
    private String expectedFileName;
    @JsonProperty("outputFileName")
    private String outputFileName;
    @JsonProperty("isImpacted")
    private String isImpacted;
    @JsonProperty("verificationStatus")
    private String verificationStatus;
    @JsonProperty("stepNo")
    private String stepNo;
    @JsonProperty("verifyProcessParmValues")
    private String verifyProcessParmValues;
    @JsonProperty("verifyProcessDependency")
    private String verifyProcessDependency;
    @JsonProperty("ignorableProcesses")
    private IgnorableProcesses ignorableProcesses;
    @JsonProperty("parmValueVerification")
    private ParmValueVerification parmValueVerification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("expectedFileName")
    public String getExpectedFileName() {
        return expectedFileName;
    }

    @JsonProperty("expectedFileName")
    public void setExpectedFileName(String expectedFileName) {
        this.expectedFileName = expectedFileName;
    }

    @JsonProperty("outputFileName")
    public String getOutputFileName() {
        return outputFileName;
    }

    @JsonProperty("outputFileName")
    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    @JsonProperty("isImpacted")
    public String getIsImpacted() {
        return isImpacted;
    }

    @JsonProperty("isImpacted")
    public void setIsImpacted(String isImpacted) {
        this.isImpacted = isImpacted;
    }

    @JsonProperty("verificationStatus")
    public String getVerificationStatus() {
        return verificationStatus;
    }

    @JsonProperty("verificationStatus")
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    @JsonProperty("stepNo")
    public String getStepNo() {
        return stepNo;
    }

    @JsonProperty("stepNo")
    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    @JsonProperty("verifyProcessParmValues")
    public String getVerifyProcessParmValues() {
        return verifyProcessParmValues;
    }

    @JsonProperty("verifyProcessParmValues")
    public void setVerifyProcessParmValues(String verifyProcessParmValues) {
        this.verifyProcessParmValues = verifyProcessParmValues;
    }

    @JsonProperty("verifyProcessDependency")
    public String getVerifyProcessDependency() {
        return verifyProcessDependency;
    }

    @JsonProperty("verifyProcessDependency")
    public void setVerifyProcessDependency(String verifyProcessDependency) {
        this.verifyProcessDependency = verifyProcessDependency;
    }

    @JsonProperty("ignorableProcesses")
    public IgnorableProcesses getIgnorableProcesses() {
        return ignorableProcesses;
    }

    @JsonProperty("ignorableProcesses")
    public void setIgnorableProcesses(IgnorableProcesses ignorableProcesses) {
        this.ignorableProcesses = ignorableProcesses;
    }

    @JsonProperty("parmValueVerification")
    public ParmValueVerification getParmValueVerification() {
        return parmValueVerification;
    }

    @JsonProperty("parmValueVerification")
    public void setParmValueVerification(ParmValueVerification parmValueVerification) {
        this.parmValueVerification = parmValueVerification;
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
        return new ToStringBuilder(this).append("expectedFileName", expectedFileName).append("outputFileName", outputFileName).append("isImpacted", isImpacted).append("verificationStatus", verificationStatus).append("stepNo", stepNo).append("verifyProcessParmValues", verifyProcessParmValues).append("verifyProcessDependency", verifyProcessDependency).append("ignorableProcesses", ignorableProcesses).append("parmValueVerification", parmValueVerification).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parmValueVerification).append(isImpacted).append(stepNo).append(verifyProcessDependency).append(outputFileName).append(verificationStatus).append(expectedFileName).append(additionalProperties).append(verifyProcessParmValues).append(ignorableProcesses).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkFlowVerification) == false) {
            return false;
        }
        WorkFlowVerification rhs = ((WorkFlowVerification) other);
        return new EqualsBuilder().append(parmValueVerification, rhs.parmValueVerification).append(isImpacted, rhs.isImpacted).append(stepNo, rhs.stepNo).append(verifyProcessDependency, rhs.verifyProcessDependency).append(outputFileName, rhs.outputFileName).append(verificationStatus, rhs.verificationStatus).append(expectedFileName, rhs.expectedFileName).append(additionalProperties, rhs.additionalProperties).append(verifyProcessParmValues, rhs.verifyProcessParmValues).append(ignorableProcesses, rhs.ignorableProcesses).isEquals();
    }

}
