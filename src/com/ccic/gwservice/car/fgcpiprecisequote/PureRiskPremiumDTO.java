/**
 * PureRiskPremiumDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PureRiskPremiumDTO  implements java.io.Serializable {
    private java.lang.String modelCode;

    private java.lang.String pureRiskPremium;

    private java.lang.String pureRiskPremiumType;

    public PureRiskPremiumDTO() {
    }

    public PureRiskPremiumDTO(
           java.lang.String modelCode,
           java.lang.String pureRiskPremium,
           java.lang.String pureRiskPremiumType) {
           this.modelCode = modelCode;
           this.pureRiskPremium = pureRiskPremium;
           this.pureRiskPremiumType = pureRiskPremiumType;
    }


    /**
     * Gets the modelCode value for this PureRiskPremiumDTO.
     * 
     * @return modelCode
     */
    public java.lang.String getModelCode() {
        return modelCode;
    }


    /**
     * Sets the modelCode value for this PureRiskPremiumDTO.
     * 
     * @param modelCode
     */
    public void setModelCode(java.lang.String modelCode) {
        this.modelCode = modelCode;
    }


    /**
     * Gets the pureRiskPremium value for this PureRiskPremiumDTO.
     * 
     * @return pureRiskPremium
     */
    public java.lang.String getPureRiskPremium() {
        return pureRiskPremium;
    }


    /**
     * Sets the pureRiskPremium value for this PureRiskPremiumDTO.
     * 
     * @param pureRiskPremium
     */
    public void setPureRiskPremium(java.lang.String pureRiskPremium) {
        this.pureRiskPremium = pureRiskPremium;
    }


    /**
     * Gets the pureRiskPremiumType value for this PureRiskPremiumDTO.
     * 
     * @return pureRiskPremiumType
     */
    public java.lang.String getPureRiskPremiumType() {
        return pureRiskPremiumType;
    }


    /**
     * Sets the pureRiskPremiumType value for this PureRiskPremiumDTO.
     * 
     * @param pureRiskPremiumType
     */
    public void setPureRiskPremiumType(java.lang.String pureRiskPremiumType) {
        this.pureRiskPremiumType = pureRiskPremiumType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PureRiskPremiumDTO)) return false;
        PureRiskPremiumDTO other = (PureRiskPremiumDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modelCode==null && other.getModelCode()==null) || 
             (this.modelCode!=null &&
              this.modelCode.equals(other.getModelCode()))) &&
            ((this.pureRiskPremium==null && other.getPureRiskPremium()==null) || 
             (this.pureRiskPremium!=null &&
              this.pureRiskPremium.equals(other.getPureRiskPremium()))) &&
            ((this.pureRiskPremiumType==null && other.getPureRiskPremiumType()==null) || 
             (this.pureRiskPremiumType!=null &&
              this.pureRiskPremiumType.equals(other.getPureRiskPremiumType())));
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
        if (getModelCode() != null) {
            _hashCode += getModelCode().hashCode();
        }
        if (getPureRiskPremium() != null) {
            _hashCode += getPureRiskPremium().hashCode();
        }
        if (getPureRiskPremiumType() != null) {
            _hashCode += getPureRiskPremiumType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PureRiskPremiumDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PureRiskPremiumDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "modelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pureRiskPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "pureRiskPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pureRiskPremiumType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "pureRiskPremiumType"));
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
