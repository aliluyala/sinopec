/**
 * RuleOutInfoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class RuleOutInfoDTO  implements java.io.Serializable {
    private java.lang.String ruleName;

    private java.lang.String ruleInfo;

    public RuleOutInfoDTO() {
    }

    public RuleOutInfoDTO(
           java.lang.String ruleName,
           java.lang.String ruleInfo) {
           this.ruleName = ruleName;
           this.ruleInfo = ruleInfo;
    }


    /**
     * Gets the ruleName value for this RuleOutInfoDTO.
     * 
     * @return ruleName
     */
    public java.lang.String getRuleName() {
        return ruleName;
    }


    /**
     * Sets the ruleName value for this RuleOutInfoDTO.
     * 
     * @param ruleName
     */
    public void setRuleName(java.lang.String ruleName) {
        this.ruleName = ruleName;
    }


    /**
     * Gets the ruleInfo value for this RuleOutInfoDTO.
     * 
     * @return ruleInfo
     */
    public java.lang.String getRuleInfo() {
        return ruleInfo;
    }


    /**
     * Sets the ruleInfo value for this RuleOutInfoDTO.
     * 
     * @param ruleInfo
     */
    public void setRuleInfo(java.lang.String ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleOutInfoDTO)) return false;
        RuleOutInfoDTO other = (RuleOutInfoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ruleName==null && other.getRuleName()==null) || 
             (this.ruleName!=null &&
              this.ruleName.equals(other.getRuleName()))) &&
            ((this.ruleInfo==null && other.getRuleInfo()==null) || 
             (this.ruleInfo!=null &&
              this.ruleInfo.equals(other.getRuleInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRuleName() != null) {
            _hashCode += getRuleName().hashCode();
        }
        if (getRuleInfo() != null) {
            _hashCode += getRuleInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleOutInfoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RuleOutInfoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ruleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ruleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
