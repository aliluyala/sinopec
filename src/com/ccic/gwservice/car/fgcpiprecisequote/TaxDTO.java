/**
 * TaxDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class TaxDTO  implements java.io.Serializable {
    private java.lang.String payTaxWay;

    private java.lang.String taxPayerNo;

    private java.lang.String annualTaxDue;

    private java.lang.String sumTaxDefault;

    private java.lang.String sumOverdue;

    private java.lang.String sumTax;

    private com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue;

    private com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO[] delinquentTaxDue;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public TaxDTO() {
    }

    public TaxDTO(
           java.lang.String payTaxWay,
           java.lang.String taxPayerNo,
           java.lang.String annualTaxDue,
           java.lang.String sumTaxDefault,
           java.lang.String sumOverdue,
           java.lang.String sumTax,
           com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue,
           com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO[] delinquentTaxDue,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.payTaxWay = payTaxWay;
           this.taxPayerNo = taxPayerNo;
           this.annualTaxDue = annualTaxDue;
           this.sumTaxDefault = sumTaxDefault;
           this.sumOverdue = sumOverdue;
           this.sumTax = sumTax;
           this.currentTaxDue = currentTaxDue;
           this.delinquentTaxDue = delinquentTaxDue;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the payTaxWay value for this TaxDTO.
     * 
     * @return payTaxWay
     */
    public java.lang.String getPayTaxWay() {
        return payTaxWay;
    }


    /**
     * Sets the payTaxWay value for this TaxDTO.
     * 
     * @param payTaxWay
     */
    public void setPayTaxWay(java.lang.String payTaxWay) {
        this.payTaxWay = payTaxWay;
    }


    /**
     * Gets the taxPayerNo value for this TaxDTO.
     * 
     * @return taxPayerNo
     */
    public java.lang.String getTaxPayerNo() {
        return taxPayerNo;
    }


    /**
     * Sets the taxPayerNo value for this TaxDTO.
     * 
     * @param taxPayerNo
     */
    public void setTaxPayerNo(java.lang.String taxPayerNo) {
        this.taxPayerNo = taxPayerNo;
    }


    /**
     * Gets the annualTaxDue value for this TaxDTO.
     * 
     * @return annualTaxDue
     */
    public java.lang.String getAnnualTaxDue() {
        return annualTaxDue;
    }


    /**
     * Sets the annualTaxDue value for this TaxDTO.
     * 
     * @param annualTaxDue
     */
    public void setAnnualTaxDue(java.lang.String annualTaxDue) {
        this.annualTaxDue = annualTaxDue;
    }


    /**
     * Gets the sumTaxDefault value for this TaxDTO.
     * 
     * @return sumTaxDefault
     */
    public java.lang.String getSumTaxDefault() {
        return sumTaxDefault;
    }


    /**
     * Sets the sumTaxDefault value for this TaxDTO.
     * 
     * @param sumTaxDefault
     */
    public void setSumTaxDefault(java.lang.String sumTaxDefault) {
        this.sumTaxDefault = sumTaxDefault;
    }


    /**
     * Gets the sumOverdue value for this TaxDTO.
     * 
     * @return sumOverdue
     */
    public java.lang.String getSumOverdue() {
        return sumOverdue;
    }


    /**
     * Sets the sumOverdue value for this TaxDTO.
     * 
     * @param sumOverdue
     */
    public void setSumOverdue(java.lang.String sumOverdue) {
        this.sumOverdue = sumOverdue;
    }


    /**
     * Gets the sumTax value for this TaxDTO.
     * 
     * @return sumTax
     */
    public java.lang.String getSumTax() {
        return sumTax;
    }


    /**
     * Sets the sumTax value for this TaxDTO.
     * 
     * @param sumTax
     */
    public void setSumTax(java.lang.String sumTax) {
        this.sumTax = sumTax;
    }


    /**
     * Gets the currentTaxDue value for this TaxDTO.
     * 
     * @return currentTaxDue
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO getCurrentTaxDue() {
        return currentTaxDue;
    }


    /**
     * Sets the currentTaxDue value for this TaxDTO.
     * 
     * @param currentTaxDue
     */
    public void setCurrentTaxDue(com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue) {
        this.currentTaxDue = currentTaxDue;
    }


    /**
     * Gets the delinquentTaxDue value for this TaxDTO.
     * 
     * @return delinquentTaxDue
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO[] getDelinquentTaxDue() {
        return delinquentTaxDue;
    }


    /**
     * Sets the delinquentTaxDue value for this TaxDTO.
     * 
     * @param delinquentTaxDue
     */
    public void setDelinquentTaxDue(com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO[] delinquentTaxDue) {
        this.delinquentTaxDue = delinquentTaxDue;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO getDelinquentTaxDue(int i) {
        return this.delinquentTaxDue[i];
    }

    public void setDelinquentTaxDue(int i, com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO _value) {
        this.delinquentTaxDue[i] = _value;
    }


    /**
     * Gets the extendInfo value for this TaxDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this TaxDTO.
     * 
     * @param extendInfo
     */
    public void setExtendInfo(com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
        this.extendInfo = extendInfo;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO getExtendInfo(int i) {
        return this.extendInfo[i];
    }

    public void setExtendInfo(int i, com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO _value) {
        this.extendInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDTO)) return false;
        TaxDTO other = (TaxDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payTaxWay==null && other.getPayTaxWay()==null) || 
             (this.payTaxWay!=null &&
              this.payTaxWay.equals(other.getPayTaxWay()))) &&
            ((this.taxPayerNo==null && other.getTaxPayerNo()==null) || 
             (this.taxPayerNo!=null &&
              this.taxPayerNo.equals(other.getTaxPayerNo()))) &&
            ((this.annualTaxDue==null && other.getAnnualTaxDue()==null) || 
             (this.annualTaxDue!=null &&
              this.annualTaxDue.equals(other.getAnnualTaxDue()))) &&
            ((this.sumTaxDefault==null && other.getSumTaxDefault()==null) || 
             (this.sumTaxDefault!=null &&
              this.sumTaxDefault.equals(other.getSumTaxDefault()))) &&
            ((this.sumOverdue==null && other.getSumOverdue()==null) || 
             (this.sumOverdue!=null &&
              this.sumOverdue.equals(other.getSumOverdue()))) &&
            ((this.sumTax==null && other.getSumTax()==null) || 
             (this.sumTax!=null &&
              this.sumTax.equals(other.getSumTax()))) &&
            ((this.currentTaxDue==null && other.getCurrentTaxDue()==null) || 
             (this.currentTaxDue!=null &&
              this.currentTaxDue.equals(other.getCurrentTaxDue()))) &&
            ((this.delinquentTaxDue==null && other.getDelinquentTaxDue()==null) || 
             (this.delinquentTaxDue!=null &&
              java.util.Arrays.equals(this.delinquentTaxDue, other.getDelinquentTaxDue()))) &&
            ((this.extendInfo==null && other.getExtendInfo()==null) || 
             (this.extendInfo!=null &&
              java.util.Arrays.equals(this.extendInfo, other.getExtendInfo())));
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
        if (getPayTaxWay() != null) {
            _hashCode += getPayTaxWay().hashCode();
        }
        if (getTaxPayerNo() != null) {
            _hashCode += getTaxPayerNo().hashCode();
        }
        if (getAnnualTaxDue() != null) {
            _hashCode += getAnnualTaxDue().hashCode();
        }
        if (getSumTaxDefault() != null) {
            _hashCode += getSumTaxDefault().hashCode();
        }
        if (getSumOverdue() != null) {
            _hashCode += getSumOverdue().hashCode();
        }
        if (getSumTax() != null) {
            _hashCode += getSumTax().hashCode();
        }
        if (getCurrentTaxDue() != null) {
            _hashCode += getCurrentTaxDue().hashCode();
        }
        if (getDelinquentTaxDue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelinquentTaxDue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelinquentTaxDue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendInfo(), i);
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
        new org.apache.axis.description.TypeDesc(TaxDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TaxDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTaxWay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "payTaxWay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPayerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxPayerNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualTaxDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "annualTaxDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumTaxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumTaxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTaxDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "currentTaxDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "AnnualTaxDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delinquentTaxDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "delinquentTaxDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "AnnualTaxDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "extendInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ExtendInfoDTO"));
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
