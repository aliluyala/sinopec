/**
 * RiskWarningDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class RiskWarningDTO  implements java.io.Serializable {
    private java.lang.String riskWarningType;

    private com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO[] riskWarningClaim;

    public RiskWarningDTO() {
    }

    public RiskWarningDTO(
           java.lang.String riskWarningType,
           com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO[] riskWarningClaim) {
           this.riskWarningType = riskWarningType;
           this.riskWarningClaim = riskWarningClaim;
    }


    /**
     * Gets the riskWarningType value for this RiskWarningDTO.
     * 
     * @return riskWarningType
     */
    public java.lang.String getRiskWarningType() {
        return riskWarningType;
    }


    /**
     * Sets the riskWarningType value for this RiskWarningDTO.
     * 
     * @param riskWarningType
     */
    public void setRiskWarningType(java.lang.String riskWarningType) {
        this.riskWarningType = riskWarningType;
    }


    /**
     * Gets the riskWarningClaim value for this RiskWarningDTO.
     * 
     * @return riskWarningClaim
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO[] getRiskWarningClaim() {
        return riskWarningClaim;
    }


    /**
     * Sets the riskWarningClaim value for this RiskWarningDTO.
     * 
     * @param riskWarningClaim
     */
    public void setRiskWarningClaim(com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO[] riskWarningClaim) {
        this.riskWarningClaim = riskWarningClaim;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO getRiskWarningClaim(int i) {
        return this.riskWarningClaim[i];
    }

    public void setRiskWarningClaim(int i, com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningClaimDTO _value) {
        this.riskWarningClaim[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskWarningDTO)) return false;
        RiskWarningDTO other = (RiskWarningDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riskWarningType==null && other.getRiskWarningType()==null) || 
             (this.riskWarningType!=null &&
              this.riskWarningType.equals(other.getRiskWarningType()))) &&
            ((this.riskWarningClaim==null && other.getRiskWarningClaim()==null) || 
             (this.riskWarningClaim!=null &&
              java.util.Arrays.equals(this.riskWarningClaim, other.getRiskWarningClaim())));
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
        if (getRiskWarningType() != null) {
            _hashCode += getRiskWarningType().hashCode();
        }
        if (getRiskWarningClaim() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRiskWarningClaim());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRiskWarningClaim(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskWarningDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RiskWarningDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskWarningType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "riskWarningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskWarningClaim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "riskWarningClaim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RiskWarningClaimDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
