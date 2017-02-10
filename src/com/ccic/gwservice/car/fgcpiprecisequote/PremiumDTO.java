/**
 * PremiumDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PremiumDTO  implements java.io.Serializable {
    private java.lang.String serialNo;

    private java.lang.String kindCode;

    private java.lang.String rate;

    private java.lang.String abatementRate;

    private java.lang.String basePremium;

    private java.lang.String standardPremium;

    public PremiumDTO() {
    }

    public PremiumDTO(
           java.lang.String serialNo,
           java.lang.String kindCode,
           java.lang.String rate,
           java.lang.String abatementRate,
           java.lang.String basePremium,
           java.lang.String standardPremium) {
           this.serialNo = serialNo;
           this.kindCode = kindCode;
           this.rate = rate;
           this.abatementRate = abatementRate;
           this.basePremium = basePremium;
           this.standardPremium = standardPremium;
    }


    /**
     * Gets the serialNo value for this PremiumDTO.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this PremiumDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the kindCode value for this PremiumDTO.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this PremiumDTO.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the rate value for this PremiumDTO.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PremiumDTO.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the abatementRate value for this PremiumDTO.
     * 
     * @return abatementRate
     */
    public java.lang.String getAbatementRate() {
        return abatementRate;
    }


    /**
     * Sets the abatementRate value for this PremiumDTO.
     * 
     * @param abatementRate
     */
    public void setAbatementRate(java.lang.String abatementRate) {
        this.abatementRate = abatementRate;
    }


    /**
     * Gets the basePremium value for this PremiumDTO.
     * 
     * @return basePremium
     */
    public java.lang.String getBasePremium() {
        return basePremium;
    }


    /**
     * Sets the basePremium value for this PremiumDTO.
     * 
     * @param basePremium
     */
    public void setBasePremium(java.lang.String basePremium) {
        this.basePremium = basePremium;
    }


    /**
     * Gets the standardPremium value for this PremiumDTO.
     * 
     * @return standardPremium
     */
    public java.lang.String getStandardPremium() {
        return standardPremium;
    }


    /**
     * Sets the standardPremium value for this PremiumDTO.
     * 
     * @param standardPremium
     */
    public void setStandardPremium(java.lang.String standardPremium) {
        this.standardPremium = standardPremium;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PremiumDTO)) return false;
        PremiumDTO other = (PremiumDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.abatementRate==null && other.getAbatementRate()==null) || 
             (this.abatementRate!=null &&
              this.abatementRate.equals(other.getAbatementRate()))) &&
            ((this.basePremium==null && other.getBasePremium()==null) || 
             (this.basePremium!=null &&
              this.basePremium.equals(other.getBasePremium()))) &&
            ((this.standardPremium==null && other.getStandardPremium()==null) || 
             (this.standardPremium!=null &&
              this.standardPremium.equals(other.getStandardPremium())));
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
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getAbatementRate() != null) {
            _hashCode += getAbatementRate().hashCode();
        }
        if (getBasePremium() != null) {
            _hashCode += getBasePremium().hashCode();
        }
        if (getStandardPremium() != null) {
            _hashCode += getStandardPremium().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PremiumDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "kindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abatementRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "abatementRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "basePremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "standardPremium"));
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
