/**
 * KindProfitDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class KindProfitDTO  implements java.io.Serializable {
    private java.lang.String profitCode;

    private java.lang.Integer serialNo;

    private java.lang.Double profitRate;

    private java.lang.String profitName;

    public KindProfitDTO() {
    }

    public KindProfitDTO(
           java.lang.String profitCode,
           java.lang.Integer serialNo,
           java.lang.Double profitRate,
           java.lang.String profitName) {
           this.profitCode = profitCode;
           this.serialNo = serialNo;
           this.profitRate = profitRate;
           this.profitName = profitName;
    }


    /**
     * Gets the profitCode value for this KindProfitDTO.
     * 
     * @return profitCode
     */
    public java.lang.String getProfitCode() {
        return profitCode;
    }


    /**
     * Sets the profitCode value for this KindProfitDTO.
     * 
     * @param profitCode
     */
    public void setProfitCode(java.lang.String profitCode) {
        this.profitCode = profitCode;
    }


    /**
     * Gets the serialNo value for this KindProfitDTO.
     * 
     * @return serialNo
     */
    public java.lang.Integer getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this KindProfitDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.Integer serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the profitRate value for this KindProfitDTO.
     * 
     * @return profitRate
     */
    public java.lang.Double getProfitRate() {
        return profitRate;
    }


    /**
     * Sets the profitRate value for this KindProfitDTO.
     * 
     * @param profitRate
     */
    public void setProfitRate(java.lang.Double profitRate) {
        this.profitRate = profitRate;
    }


    /**
     * Gets the profitName value for this KindProfitDTO.
     * 
     * @return profitName
     */
    public java.lang.String getProfitName() {
        return profitName;
    }


    /**
     * Sets the profitName value for this KindProfitDTO.
     * 
     * @param profitName
     */
    public void setProfitName(java.lang.String profitName) {
        this.profitName = profitName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KindProfitDTO)) return false;
        KindProfitDTO other = (KindProfitDTO) obj;
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
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.profitRate==null && other.getProfitRate()==null) || 
             (this.profitRate!=null &&
              this.profitRate.equals(other.getProfitRate()))) &&
            ((this.profitName==null && other.getProfitName()==null) || 
             (this.profitName!=null &&
              this.profitName.equals(other.getProfitName())));
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
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getProfitRate() != null) {
            _hashCode += getProfitRate().hashCode();
        }
        if (getProfitName() != null) {
            _hashCode += getProfitName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KindProfitDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "KindProfitDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitName"));
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
