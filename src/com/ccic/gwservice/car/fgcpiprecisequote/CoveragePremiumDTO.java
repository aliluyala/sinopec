/**
 * CoveragePremiumDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CoveragePremiumDTO  implements java.io.Serializable {
    private java.lang.String coverageCode;

    private com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO[] pureRiskPremium;

    public CoveragePremiumDTO() {
    }

    public CoveragePremiumDTO(
           java.lang.String coverageCode,
           com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO[] pureRiskPremium) {
           this.coverageCode = coverageCode;
           this.pureRiskPremium = pureRiskPremium;
    }


    /**
     * Gets the coverageCode value for this CoveragePremiumDTO.
     * 
     * @return coverageCode
     */
    public java.lang.String getCoverageCode() {
        return coverageCode;
    }


    /**
     * Sets the coverageCode value for this CoveragePremiumDTO.
     * 
     * @param coverageCode
     */
    public void setCoverageCode(java.lang.String coverageCode) {
        this.coverageCode = coverageCode;
    }


    /**
     * Gets the pureRiskPremium value for this CoveragePremiumDTO.
     * 
     * @return pureRiskPremium
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO[] getPureRiskPremium() {
        return pureRiskPremium;
    }


    /**
     * Sets the pureRiskPremium value for this CoveragePremiumDTO.
     * 
     * @param pureRiskPremium
     */
    public void setPureRiskPremium(com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO[] pureRiskPremium) {
        this.pureRiskPremium = pureRiskPremium;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO getPureRiskPremium(int i) {
        return this.pureRiskPremium[i];
    }

    public void setPureRiskPremium(int i, com.ccic.gwservice.car.fgcpiprecisequote.PureRiskPremiumDTO _value) {
        this.pureRiskPremium[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoveragePremiumDTO)) return false;
        CoveragePremiumDTO other = (CoveragePremiumDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coverageCode==null && other.getCoverageCode()==null) || 
             (this.coverageCode!=null &&
              this.coverageCode.equals(other.getCoverageCode()))) &&
            ((this.pureRiskPremium==null && other.getPureRiskPremium()==null) || 
             (this.pureRiskPremium!=null &&
              java.util.Arrays.equals(this.pureRiskPremium, other.getPureRiskPremium())));
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
        if (getCoverageCode() != null) {
            _hashCode += getCoverageCode().hashCode();
        }
        if (getPureRiskPremium() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPureRiskPremium());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPureRiskPremium(), i);
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
        new org.apache.axis.description.TypeDesc(CoveragePremiumDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CoveragePremiumDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "coverageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pureRiskPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "pureRiskPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PureRiskPremiumDTO"));
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
