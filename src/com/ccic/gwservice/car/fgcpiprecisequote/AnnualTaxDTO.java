/**
 * AnnualTaxDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class AnnualTaxDTO  implements java.io.Serializable {
    private java.lang.String taxType;

    private java.lang.String serialNo;

    private java.lang.String taxLocationCode;

    private java.lang.String taxStartDate;

    private java.lang.String taxEndDate;

    private java.lang.String taxUnitTypeCode;

    private java.lang.Double unitRate;

    private java.lang.String declareDate;

    private java.lang.Double annualTaxAmount;

    private java.lang.String exceedDate;

    private java.lang.Double exceedDaysCount;

    private com.ccic.gwservice.car.fgcpiprecisequote.PaidDTO paid;

    private com.ccic.gwservice.car.fgcpiprecisequote.TaxRateDTO taxRate;

    private com.ccic.gwservice.car.fgcpiprecisequote.DeRateDTO deRate;

    public AnnualTaxDTO() {
    }

    public AnnualTaxDTO(
           java.lang.String taxType,
           java.lang.String serialNo,
           java.lang.String taxLocationCode,
           java.lang.String taxStartDate,
           java.lang.String taxEndDate,
           java.lang.String taxUnitTypeCode,
           java.lang.Double unitRate,
           java.lang.String declareDate,
           java.lang.Double annualTaxAmount,
           java.lang.String exceedDate,
           java.lang.Double exceedDaysCount,
           com.ccic.gwservice.car.fgcpiprecisequote.PaidDTO paid,
           com.ccic.gwservice.car.fgcpiprecisequote.TaxRateDTO taxRate,
           com.ccic.gwservice.car.fgcpiprecisequote.DeRateDTO deRate) {
           this.taxType = taxType;
           this.serialNo = serialNo;
           this.taxLocationCode = taxLocationCode;
           this.taxStartDate = taxStartDate;
           this.taxEndDate = taxEndDate;
           this.taxUnitTypeCode = taxUnitTypeCode;
           this.unitRate = unitRate;
           this.declareDate = declareDate;
           this.annualTaxAmount = annualTaxAmount;
           this.exceedDate = exceedDate;
           this.exceedDaysCount = exceedDaysCount;
           this.paid = paid;
           this.taxRate = taxRate;
           this.deRate = deRate;
    }


    /**
     * Gets the taxType value for this AnnualTaxDTO.
     * 
     * @return taxType
     */
    public java.lang.String getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this AnnualTaxDTO.
     * 
     * @param taxType
     */
    public void setTaxType(java.lang.String taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the serialNo value for this AnnualTaxDTO.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this AnnualTaxDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the taxLocationCode value for this AnnualTaxDTO.
     * 
     * @return taxLocationCode
     */
    public java.lang.String getTaxLocationCode() {
        return taxLocationCode;
    }


    /**
     * Sets the taxLocationCode value for this AnnualTaxDTO.
     * 
     * @param taxLocationCode
     */
    public void setTaxLocationCode(java.lang.String taxLocationCode) {
        this.taxLocationCode = taxLocationCode;
    }


    /**
     * Gets the taxStartDate value for this AnnualTaxDTO.
     * 
     * @return taxStartDate
     */
    public java.lang.String getTaxStartDate() {
        return taxStartDate;
    }


    /**
     * Sets the taxStartDate value for this AnnualTaxDTO.
     * 
     * @param taxStartDate
     */
    public void setTaxStartDate(java.lang.String taxStartDate) {
        this.taxStartDate = taxStartDate;
    }


    /**
     * Gets the taxEndDate value for this AnnualTaxDTO.
     * 
     * @return taxEndDate
     */
    public java.lang.String getTaxEndDate() {
        return taxEndDate;
    }


    /**
     * Sets the taxEndDate value for this AnnualTaxDTO.
     * 
     * @param taxEndDate
     */
    public void setTaxEndDate(java.lang.String taxEndDate) {
        this.taxEndDate = taxEndDate;
    }


    /**
     * Gets the taxUnitTypeCode value for this AnnualTaxDTO.
     * 
     * @return taxUnitTypeCode
     */
    public java.lang.String getTaxUnitTypeCode() {
        return taxUnitTypeCode;
    }


    /**
     * Sets the taxUnitTypeCode value for this AnnualTaxDTO.
     * 
     * @param taxUnitTypeCode
     */
    public void setTaxUnitTypeCode(java.lang.String taxUnitTypeCode) {
        this.taxUnitTypeCode = taxUnitTypeCode;
    }


    /**
     * Gets the unitRate value for this AnnualTaxDTO.
     * 
     * @return unitRate
     */
    public java.lang.Double getUnitRate() {
        return unitRate;
    }


    /**
     * Sets the unitRate value for this AnnualTaxDTO.
     * 
     * @param unitRate
     */
    public void setUnitRate(java.lang.Double unitRate) {
        this.unitRate = unitRate;
    }


    /**
     * Gets the declareDate value for this AnnualTaxDTO.
     * 
     * @return declareDate
     */
    public java.lang.String getDeclareDate() {
        return declareDate;
    }


    /**
     * Sets the declareDate value for this AnnualTaxDTO.
     * 
     * @param declareDate
     */
    public void setDeclareDate(java.lang.String declareDate) {
        this.declareDate = declareDate;
    }


    /**
     * Gets the annualTaxAmount value for this AnnualTaxDTO.
     * 
     * @return annualTaxAmount
     */
    public java.lang.Double getAnnualTaxAmount() {
        return annualTaxAmount;
    }


    /**
     * Sets the annualTaxAmount value for this AnnualTaxDTO.
     * 
     * @param annualTaxAmount
     */
    public void setAnnualTaxAmount(java.lang.Double annualTaxAmount) {
        this.annualTaxAmount = annualTaxAmount;
    }


    /**
     * Gets the exceedDate value for this AnnualTaxDTO.
     * 
     * @return exceedDate
     */
    public java.lang.String getExceedDate() {
        return exceedDate;
    }


    /**
     * Sets the exceedDate value for this AnnualTaxDTO.
     * 
     * @param exceedDate
     */
    public void setExceedDate(java.lang.String exceedDate) {
        this.exceedDate = exceedDate;
    }


    /**
     * Gets the exceedDaysCount value for this AnnualTaxDTO.
     * 
     * @return exceedDaysCount
     */
    public java.lang.Double getExceedDaysCount() {
        return exceedDaysCount;
    }


    /**
     * Sets the exceedDaysCount value for this AnnualTaxDTO.
     * 
     * @param exceedDaysCount
     */
    public void setExceedDaysCount(java.lang.Double exceedDaysCount) {
        this.exceedDaysCount = exceedDaysCount;
    }


    /**
     * Gets the paid value for this AnnualTaxDTO.
     * 
     * @return paid
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PaidDTO getPaid() {
        return paid;
    }


    /**
     * Sets the paid value for this AnnualTaxDTO.
     * 
     * @param paid
     */
    public void setPaid(com.ccic.gwservice.car.fgcpiprecisequote.PaidDTO paid) {
        this.paid = paid;
    }


    /**
     * Gets the taxRate value for this AnnualTaxDTO.
     * 
     * @return taxRate
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.TaxRateDTO getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this AnnualTaxDTO.
     * 
     * @param taxRate
     */
    public void setTaxRate(com.ccic.gwservice.car.fgcpiprecisequote.TaxRateDTO taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the deRate value for this AnnualTaxDTO.
     * 
     * @return deRate
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.DeRateDTO getDeRate() {
        return deRate;
    }


    /**
     * Sets the deRate value for this AnnualTaxDTO.
     * 
     * @param deRate
     */
    public void setDeRate(com.ccic.gwservice.car.fgcpiprecisequote.DeRateDTO deRate) {
        this.deRate = deRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnnualTaxDTO)) return false;
        AnnualTaxDTO other = (AnnualTaxDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.taxLocationCode==null && other.getTaxLocationCode()==null) || 
             (this.taxLocationCode!=null &&
              this.taxLocationCode.equals(other.getTaxLocationCode()))) &&
            ((this.taxStartDate==null && other.getTaxStartDate()==null) || 
             (this.taxStartDate!=null &&
              this.taxStartDate.equals(other.getTaxStartDate()))) &&
            ((this.taxEndDate==null && other.getTaxEndDate()==null) || 
             (this.taxEndDate!=null &&
              this.taxEndDate.equals(other.getTaxEndDate()))) &&
            ((this.taxUnitTypeCode==null && other.getTaxUnitTypeCode()==null) || 
             (this.taxUnitTypeCode!=null &&
              this.taxUnitTypeCode.equals(other.getTaxUnitTypeCode()))) &&
            ((this.unitRate==null && other.getUnitRate()==null) || 
             (this.unitRate!=null &&
              this.unitRate.equals(other.getUnitRate()))) &&
            ((this.declareDate==null && other.getDeclareDate()==null) || 
             (this.declareDate!=null &&
              this.declareDate.equals(other.getDeclareDate()))) &&
            ((this.annualTaxAmount==null && other.getAnnualTaxAmount()==null) || 
             (this.annualTaxAmount!=null &&
              this.annualTaxAmount.equals(other.getAnnualTaxAmount()))) &&
            ((this.exceedDate==null && other.getExceedDate()==null) || 
             (this.exceedDate!=null &&
              this.exceedDate.equals(other.getExceedDate()))) &&
            ((this.exceedDaysCount==null && other.getExceedDaysCount()==null) || 
             (this.exceedDaysCount!=null &&
              this.exceedDaysCount.equals(other.getExceedDaysCount()))) &&
            ((this.paid==null && other.getPaid()==null) || 
             (this.paid!=null &&
              this.paid.equals(other.getPaid()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.deRate==null && other.getDeRate()==null) || 
             (this.deRate!=null &&
              this.deRate.equals(other.getDeRate())));
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
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getTaxLocationCode() != null) {
            _hashCode += getTaxLocationCode().hashCode();
        }
        if (getTaxStartDate() != null) {
            _hashCode += getTaxStartDate().hashCode();
        }
        if (getTaxEndDate() != null) {
            _hashCode += getTaxEndDate().hashCode();
        }
        if (getTaxUnitTypeCode() != null) {
            _hashCode += getTaxUnitTypeCode().hashCode();
        }
        if (getUnitRate() != null) {
            _hashCode += getUnitRate().hashCode();
        }
        if (getDeclareDate() != null) {
            _hashCode += getDeclareDate().hashCode();
        }
        if (getAnnualTaxAmount() != null) {
            _hashCode += getAnnualTaxAmount().hashCode();
        }
        if (getExceedDate() != null) {
            _hashCode += getExceedDate().hashCode();
        }
        if (getExceedDaysCount() != null) {
            _hashCode += getExceedDaysCount().hashCode();
        }
        if (getPaid() != null) {
            _hashCode += getPaid().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getDeRate() != null) {
            _hashCode += getDeRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnnualTaxDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "AnnualTaxDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxUnitTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxUnitTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "unitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declareDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "declareDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "annualTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "exceedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceedDaysCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "exceedDaysCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "Paid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PaidDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TaxRateDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "DeRateDTO"));
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
