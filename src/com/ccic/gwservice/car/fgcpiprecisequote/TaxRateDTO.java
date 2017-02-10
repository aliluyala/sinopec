/**
 * TaxRateDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class TaxRateDTO  implements java.io.Serializable {
    private java.lang.String appliedArea;

    private java.lang.String taxRateIdentifier;

    private java.lang.String taxItemdetailCode;

    private java.lang.String taxUnittypeCode;

    private java.lang.String unitRate;

    private java.lang.String taxRateStartDate;

    private java.lang.String taxRateEndDate;

    public TaxRateDTO() {
    }

    public TaxRateDTO(
           java.lang.String appliedArea,
           java.lang.String taxRateIdentifier,
           java.lang.String taxItemdetailCode,
           java.lang.String taxUnittypeCode,
           java.lang.String unitRate,
           java.lang.String taxRateStartDate,
           java.lang.String taxRateEndDate) {
           this.appliedArea = appliedArea;
           this.taxRateIdentifier = taxRateIdentifier;
           this.taxItemdetailCode = taxItemdetailCode;
           this.taxUnittypeCode = taxUnittypeCode;
           this.unitRate = unitRate;
           this.taxRateStartDate = taxRateStartDate;
           this.taxRateEndDate = taxRateEndDate;
    }


    /**
     * Gets the appliedArea value for this TaxRateDTO.
     * 
     * @return appliedArea
     */
    public java.lang.String getAppliedArea() {
        return appliedArea;
    }


    /**
     * Sets the appliedArea value for this TaxRateDTO.
     * 
     * @param appliedArea
     */
    public void setAppliedArea(java.lang.String appliedArea) {
        this.appliedArea = appliedArea;
    }


    /**
     * Gets the taxRateIdentifier value for this TaxRateDTO.
     * 
     * @return taxRateIdentifier
     */
    public java.lang.String getTaxRateIdentifier() {
        return taxRateIdentifier;
    }


    /**
     * Sets the taxRateIdentifier value for this TaxRateDTO.
     * 
     * @param taxRateIdentifier
     */
    public void setTaxRateIdentifier(java.lang.String taxRateIdentifier) {
        this.taxRateIdentifier = taxRateIdentifier;
    }


    /**
     * Gets the taxItemdetailCode value for this TaxRateDTO.
     * 
     * @return taxItemdetailCode
     */
    public java.lang.String getTaxItemdetailCode() {
        return taxItemdetailCode;
    }


    /**
     * Sets the taxItemdetailCode value for this TaxRateDTO.
     * 
     * @param taxItemdetailCode
     */
    public void setTaxItemdetailCode(java.lang.String taxItemdetailCode) {
        this.taxItemdetailCode = taxItemdetailCode;
    }


    /**
     * Gets the taxUnittypeCode value for this TaxRateDTO.
     * 
     * @return taxUnittypeCode
     */
    public java.lang.String getTaxUnittypeCode() {
        return taxUnittypeCode;
    }


    /**
     * Sets the taxUnittypeCode value for this TaxRateDTO.
     * 
     * @param taxUnittypeCode
     */
    public void setTaxUnittypeCode(java.lang.String taxUnittypeCode) {
        this.taxUnittypeCode = taxUnittypeCode;
    }


    /**
     * Gets the unitRate value for this TaxRateDTO.
     * 
     * @return unitRate
     */
    public java.lang.String getUnitRate() {
        return unitRate;
    }


    /**
     * Sets the unitRate value for this TaxRateDTO.
     * 
     * @param unitRate
     */
    public void setUnitRate(java.lang.String unitRate) {
        this.unitRate = unitRate;
    }


    /**
     * Gets the taxRateStartDate value for this TaxRateDTO.
     * 
     * @return taxRateStartDate
     */
    public java.lang.String getTaxRateStartDate() {
        return taxRateStartDate;
    }


    /**
     * Sets the taxRateStartDate value for this TaxRateDTO.
     * 
     * @param taxRateStartDate
     */
    public void setTaxRateStartDate(java.lang.String taxRateStartDate) {
        this.taxRateStartDate = taxRateStartDate;
    }


    /**
     * Gets the taxRateEndDate value for this TaxRateDTO.
     * 
     * @return taxRateEndDate
     */
    public java.lang.String getTaxRateEndDate() {
        return taxRateEndDate;
    }


    /**
     * Sets the taxRateEndDate value for this TaxRateDTO.
     * 
     * @param taxRateEndDate
     */
    public void setTaxRateEndDate(java.lang.String taxRateEndDate) {
        this.taxRateEndDate = taxRateEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxRateDTO)) return false;
        TaxRateDTO other = (TaxRateDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appliedArea==null && other.getAppliedArea()==null) || 
             (this.appliedArea!=null &&
              this.appliedArea.equals(other.getAppliedArea()))) &&
            ((this.taxRateIdentifier==null && other.getTaxRateIdentifier()==null) || 
             (this.taxRateIdentifier!=null &&
              this.taxRateIdentifier.equals(other.getTaxRateIdentifier()))) &&
            ((this.taxItemdetailCode==null && other.getTaxItemdetailCode()==null) || 
             (this.taxItemdetailCode!=null &&
              this.taxItemdetailCode.equals(other.getTaxItemdetailCode()))) &&
            ((this.taxUnittypeCode==null && other.getTaxUnittypeCode()==null) || 
             (this.taxUnittypeCode!=null &&
              this.taxUnittypeCode.equals(other.getTaxUnittypeCode()))) &&
            ((this.unitRate==null && other.getUnitRate()==null) || 
             (this.unitRate!=null &&
              this.unitRate.equals(other.getUnitRate()))) &&
            ((this.taxRateStartDate==null && other.getTaxRateStartDate()==null) || 
             (this.taxRateStartDate!=null &&
              this.taxRateStartDate.equals(other.getTaxRateStartDate()))) &&
            ((this.taxRateEndDate==null && other.getTaxRateEndDate()==null) || 
             (this.taxRateEndDate!=null &&
              this.taxRateEndDate.equals(other.getTaxRateEndDate())));
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
        if (getAppliedArea() != null) {
            _hashCode += getAppliedArea().hashCode();
        }
        if (getTaxRateIdentifier() != null) {
            _hashCode += getTaxRateIdentifier().hashCode();
        }
        if (getTaxItemdetailCode() != null) {
            _hashCode += getTaxItemdetailCode().hashCode();
        }
        if (getTaxUnittypeCode() != null) {
            _hashCode += getTaxUnittypeCode().hashCode();
        }
        if (getUnitRate() != null) {
            _hashCode += getUnitRate().hashCode();
        }
        if (getTaxRateStartDate() != null) {
            _hashCode += getTaxRateStartDate().hashCode();
        }
        if (getTaxRateEndDate() != null) {
            _hashCode += getTaxRateEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxRateDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TaxRateDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "appliedArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxRateIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItemdetailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxItemdetailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxUnittypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxUnittypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "unitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxRateStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxRateEndDate"));
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
