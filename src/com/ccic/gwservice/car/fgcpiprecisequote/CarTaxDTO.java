/**
 * CarTaxDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CarTaxDTO  implements java.io.Serializable {
    private java.lang.String taxFlag;

    private java.lang.Double benchmarkTax;

    private java.lang.Double tax;

    private java.lang.Double taxOverdue;

    private java.lang.Double surCharge;

    private java.lang.String startTaxDate;

    private java.lang.String sumPayment;

    private java.lang.String taxCertificateno1;

    private java.lang.String revenue;

    private java.lang.String refuseReason;

    private com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public CarTaxDTO() {
    }

    public CarTaxDTO(
           java.lang.String taxFlag,
           java.lang.Double benchmarkTax,
           java.lang.Double tax,
           java.lang.Double taxOverdue,
           java.lang.Double surCharge,
           java.lang.String startTaxDate,
           java.lang.String sumPayment,
           java.lang.String taxCertificateno1,
           java.lang.String revenue,
           java.lang.String refuseReason,
           com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.taxFlag = taxFlag;
           this.benchmarkTax = benchmarkTax;
           this.tax = tax;
           this.taxOverdue = taxOverdue;
           this.surCharge = surCharge;
           this.startTaxDate = startTaxDate;
           this.sumPayment = sumPayment;
           this.taxCertificateno1 = taxCertificateno1;
           this.revenue = revenue;
           this.refuseReason = refuseReason;
           this.currentTaxDue = currentTaxDue;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the taxFlag value for this CarTaxDTO.
     * 
     * @return taxFlag
     */
    public java.lang.String getTaxFlag() {
        return taxFlag;
    }


    /**
     * Sets the taxFlag value for this CarTaxDTO.
     * 
     * @param taxFlag
     */
    public void setTaxFlag(java.lang.String taxFlag) {
        this.taxFlag = taxFlag;
    }


    /**
     * Gets the benchmarkTax value for this CarTaxDTO.
     * 
     * @return benchmarkTax
     */
    public java.lang.Double getBenchmarkTax() {
        return benchmarkTax;
    }


    /**
     * Sets the benchmarkTax value for this CarTaxDTO.
     * 
     * @param benchmarkTax
     */
    public void setBenchmarkTax(java.lang.Double benchmarkTax) {
        this.benchmarkTax = benchmarkTax;
    }


    /**
     * Gets the tax value for this CarTaxDTO.
     * 
     * @return tax
     */
    public java.lang.Double getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this CarTaxDTO.
     * 
     * @param tax
     */
    public void setTax(java.lang.Double tax) {
        this.tax = tax;
    }


    /**
     * Gets the taxOverdue value for this CarTaxDTO.
     * 
     * @return taxOverdue
     */
    public java.lang.Double getTaxOverdue() {
        return taxOverdue;
    }


    /**
     * Sets the taxOverdue value for this CarTaxDTO.
     * 
     * @param taxOverdue
     */
    public void setTaxOverdue(java.lang.Double taxOverdue) {
        this.taxOverdue = taxOverdue;
    }


    /**
     * Gets the surCharge value for this CarTaxDTO.
     * 
     * @return surCharge
     */
    public java.lang.Double getSurCharge() {
        return surCharge;
    }


    /**
     * Sets the surCharge value for this CarTaxDTO.
     * 
     * @param surCharge
     */
    public void setSurCharge(java.lang.Double surCharge) {
        this.surCharge = surCharge;
    }


    /**
     * Gets the startTaxDate value for this CarTaxDTO.
     * 
     * @return startTaxDate
     */
    public java.lang.String getStartTaxDate() {
        return startTaxDate;
    }


    /**
     * Sets the startTaxDate value for this CarTaxDTO.
     * 
     * @param startTaxDate
     */
    public void setStartTaxDate(java.lang.String startTaxDate) {
        this.startTaxDate = startTaxDate;
    }


    /**
     * Gets the sumPayment value for this CarTaxDTO.
     * 
     * @return sumPayment
     */
    public java.lang.String getSumPayment() {
        return sumPayment;
    }


    /**
     * Sets the sumPayment value for this CarTaxDTO.
     * 
     * @param sumPayment
     */
    public void setSumPayment(java.lang.String sumPayment) {
        this.sumPayment = sumPayment;
    }


    /**
     * Gets the taxCertificateno1 value for this CarTaxDTO.
     * 
     * @return taxCertificateno1
     */
    public java.lang.String getTaxCertificateno1() {
        return taxCertificateno1;
    }


    /**
     * Sets the taxCertificateno1 value for this CarTaxDTO.
     * 
     * @param taxCertificateno1
     */
    public void setTaxCertificateno1(java.lang.String taxCertificateno1) {
        this.taxCertificateno1 = taxCertificateno1;
    }


    /**
     * Gets the revenue value for this CarTaxDTO.
     * 
     * @return revenue
     */
    public java.lang.String getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this CarTaxDTO.
     * 
     * @param revenue
     */
    public void setRevenue(java.lang.String revenue) {
        this.revenue = revenue;
    }


    /**
     * Gets the refuseReason value for this CarTaxDTO.
     * 
     * @return refuseReason
     */
    public java.lang.String getRefuseReason() {
        return refuseReason;
    }


    /**
     * Sets the refuseReason value for this CarTaxDTO.
     * 
     * @param refuseReason
     */
    public void setRefuseReason(java.lang.String refuseReason) {
        this.refuseReason = refuseReason;
    }


    /**
     * Gets the currentTaxDue value for this CarTaxDTO.
     * 
     * @return currentTaxDue
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO getCurrentTaxDue() {
        return currentTaxDue;
    }


    /**
     * Sets the currentTaxDue value for this CarTaxDTO.
     * 
     * @param currentTaxDue
     */
    public void setCurrentTaxDue(com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO currentTaxDue) {
        this.currentTaxDue = currentTaxDue;
    }


    /**
     * Gets the extendInfo value for this CarTaxDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this CarTaxDTO.
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
        if (!(obj instanceof CarTaxDTO)) return false;
        CarTaxDTO other = (CarTaxDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxFlag==null && other.getTaxFlag()==null) || 
             (this.taxFlag!=null &&
              this.taxFlag.equals(other.getTaxFlag()))) &&
            ((this.benchmarkTax==null && other.getBenchmarkTax()==null) || 
             (this.benchmarkTax!=null &&
              this.benchmarkTax.equals(other.getBenchmarkTax()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.taxOverdue==null && other.getTaxOverdue()==null) || 
             (this.taxOverdue!=null &&
              this.taxOverdue.equals(other.getTaxOverdue()))) &&
            ((this.surCharge==null && other.getSurCharge()==null) || 
             (this.surCharge!=null &&
              this.surCharge.equals(other.getSurCharge()))) &&
            ((this.startTaxDate==null && other.getStartTaxDate()==null) || 
             (this.startTaxDate!=null &&
              this.startTaxDate.equals(other.getStartTaxDate()))) &&
            ((this.sumPayment==null && other.getSumPayment()==null) || 
             (this.sumPayment!=null &&
              this.sumPayment.equals(other.getSumPayment()))) &&
            ((this.taxCertificateno1==null && other.getTaxCertificateno1()==null) || 
             (this.taxCertificateno1!=null &&
              this.taxCertificateno1.equals(other.getTaxCertificateno1()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              this.revenue.equals(other.getRevenue()))) &&
            ((this.refuseReason==null && other.getRefuseReason()==null) || 
             (this.refuseReason!=null &&
              this.refuseReason.equals(other.getRefuseReason()))) &&
            ((this.currentTaxDue==null && other.getCurrentTaxDue()==null) || 
             (this.currentTaxDue!=null &&
              this.currentTaxDue.equals(other.getCurrentTaxDue()))) &&
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
        if (getTaxFlag() != null) {
            _hashCode += getTaxFlag().hashCode();
        }
        if (getBenchmarkTax() != null) {
            _hashCode += getBenchmarkTax().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getTaxOverdue() != null) {
            _hashCode += getTaxOverdue().hashCode();
        }
        if (getSurCharge() != null) {
            _hashCode += getSurCharge().hashCode();
        }
        if (getStartTaxDate() != null) {
            _hashCode += getStartTaxDate().hashCode();
        }
        if (getSumPayment() != null) {
            _hashCode += getSumPayment().hashCode();
        }
        if (getTaxCertificateno1() != null) {
            _hashCode += getTaxCertificateno1().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getRefuseReason() != null) {
            _hashCode += getRefuseReason().hashCode();
        }
        if (getCurrentTaxDue() != null) {
            _hashCode += getCurrentTaxDue().hashCode();
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
        new org.apache.axis.description.TypeDesc(CarTaxDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarTaxDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benchmarkTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "benchmarkTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "surCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTaxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "startTaxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCertificateno1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxCertificateno1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refuseReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "refuseReason"));
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
