/**
 * ProfitDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ProfitDTO  implements java.io.Serializable {
    private java.lang.String profitCode;

    private java.lang.String profitRate;

    private java.lang.String profitReason;

    private java.lang.String noProfitReason;

    private java.lang.String profitRateUpper;

    private java.lang.String profitRateLower;

    private java.lang.String profitFlag;

    public ProfitDTO() {
    }

    public ProfitDTO(
           java.lang.String profitCode,
           java.lang.String profitRate,
           java.lang.String profitReason,
           java.lang.String noProfitReason,
           java.lang.String profitRateUpper,
           java.lang.String profitRateLower,
           java.lang.String profitFlag) {
           this.profitCode = profitCode;
           this.profitRate = profitRate;
           this.profitReason = profitReason;
           this.noProfitReason = noProfitReason;
           this.profitRateUpper = profitRateUpper;
           this.profitRateLower = profitRateLower;
           this.profitFlag = profitFlag;
    }


    /**
     * Gets the profitCode value for this ProfitDTO.
     * 
     * @return profitCode
     */
    public java.lang.String getProfitCode() {
        return profitCode;
    }


    /**
     * Sets the profitCode value for this ProfitDTO.
     * 
     * @param profitCode
     */
    public void setProfitCode(java.lang.String profitCode) {
        this.profitCode = profitCode;
    }


    /**
     * Gets the profitRate value for this ProfitDTO.
     * 
     * @return profitRate
     */
    public java.lang.String getProfitRate() {
        return profitRate;
    }


    /**
     * Sets the profitRate value for this ProfitDTO.
     * 
     * @param profitRate
     */
    public void setProfitRate(java.lang.String profitRate) {
        this.profitRate = profitRate;
    }


    /**
     * Gets the profitReason value for this ProfitDTO.
     * 
     * @return profitReason
     */
    public java.lang.String getProfitReason() {
        return profitReason;
    }


    /**
     * Sets the profitReason value for this ProfitDTO.
     * 
     * @param profitReason
     */
    public void setProfitReason(java.lang.String profitReason) {
        this.profitReason = profitReason;
    }


    /**
     * Gets the noProfitReason value for this ProfitDTO.
     * 
     * @return noProfitReason
     */
    public java.lang.String getNoProfitReason() {
        return noProfitReason;
    }


    /**
     * Sets the noProfitReason value for this ProfitDTO.
     * 
     * @param noProfitReason
     */
    public void setNoProfitReason(java.lang.String noProfitReason) {
        this.noProfitReason = noProfitReason;
    }


    /**
     * Gets the profitRateUpper value for this ProfitDTO.
     * 
     * @return profitRateUpper
     */
    public java.lang.String getProfitRateUpper() {
        return profitRateUpper;
    }


    /**
     * Sets the profitRateUpper value for this ProfitDTO.
     * 
     * @param profitRateUpper
     */
    public void setProfitRateUpper(java.lang.String profitRateUpper) {
        this.profitRateUpper = profitRateUpper;
    }


    /**
     * Gets the profitRateLower value for this ProfitDTO.
     * 
     * @return profitRateLower
     */
    public java.lang.String getProfitRateLower() {
        return profitRateLower;
    }


    /**
     * Sets the profitRateLower value for this ProfitDTO.
     * 
     * @param profitRateLower
     */
    public void setProfitRateLower(java.lang.String profitRateLower) {
        this.profitRateLower = profitRateLower;
    }


    /**
     * Gets the profitFlag value for this ProfitDTO.
     * 
     * @return profitFlag
     */
    public java.lang.String getProfitFlag() {
        return profitFlag;
    }


    /**
     * Sets the profitFlag value for this ProfitDTO.
     * 
     * @param profitFlag
     */
    public void setProfitFlag(java.lang.String profitFlag) {
        this.profitFlag = profitFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfitDTO)) return false;
        ProfitDTO other = (ProfitDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profitCode==null && other.getProfitCode()==null) || 
             (this.profitCode!=null &&
              this.profitCode.equals(other.getProfitCode()))) &&
            ((this.profitRate==null && other.getProfitRate()==null) || 
             (this.profitRate!=null &&
              this.profitRate.equals(other.getProfitRate()))) &&
            ((this.profitReason==null && other.getProfitReason()==null) || 
             (this.profitReason!=null &&
              this.profitReason.equals(other.getProfitReason()))) &&
            ((this.noProfitReason==null && other.getNoProfitReason()==null) || 
             (this.noProfitReason!=null &&
              this.noProfitReason.equals(other.getNoProfitReason()))) &&
            ((this.profitRateUpper==null && other.getProfitRateUpper()==null) || 
             (this.profitRateUpper!=null &&
              this.profitRateUpper.equals(other.getProfitRateUpper()))) &&
            ((this.profitRateLower==null && other.getProfitRateLower()==null) || 
             (this.profitRateLower!=null &&
              this.profitRateLower.equals(other.getProfitRateLower()))) &&
            ((this.profitFlag==null && other.getProfitFlag()==null) || 
             (this.profitFlag!=null &&
              this.profitFlag.equals(other.getProfitFlag())));
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
        if (getProfitCode() != null) {
            _hashCode += getProfitCode().hashCode();
        }
        if (getProfitRate() != null) {
            _hashCode += getProfitRate().hashCode();
        }
        if (getProfitReason() != null) {
            _hashCode += getProfitReason().hashCode();
        }
        if (getNoProfitReason() != null) {
            _hashCode += getNoProfitReason().hashCode();
        }
        if (getProfitRateUpper() != null) {
            _hashCode += getProfitRateUpper().hashCode();
        }
        if (getProfitRateLower() != null) {
            _hashCode += getProfitRateLower().hashCode();
        }
        if (getProfitFlag() != null) {
            _hashCode += getProfitFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfitDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ProfitDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noProfitReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "noProfitReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitRateUpper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitRateUpper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitRateLower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitRateLower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitFlag"));
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
