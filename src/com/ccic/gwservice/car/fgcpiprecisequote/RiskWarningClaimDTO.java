/**
 * RiskWarningClaimDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class RiskWarningClaimDTO  implements java.io.Serializable {
    private java.lang.String claimSequenceNo;

    private java.lang.String insurerCode;

    private java.lang.String lossTime;

    private java.lang.String lossArea;

    public RiskWarningClaimDTO() {
    }

    public RiskWarningClaimDTO(
           java.lang.String claimSequenceNo,
           java.lang.String insurerCode,
           java.lang.String lossTime,
           java.lang.String lossArea) {
           this.claimSequenceNo = claimSequenceNo;
           this.insurerCode = insurerCode;
           this.lossTime = lossTime;
           this.lossArea = lossArea;
    }


    /**
     * Gets the claimSequenceNo value for this RiskWarningClaimDTO.
     * 
     * @return claimSequenceNo
     */
    public java.lang.String getClaimSequenceNo() {
        return claimSequenceNo;
    }


    /**
     * Sets the claimSequenceNo value for this RiskWarningClaimDTO.
     * 
     * @param claimSequenceNo
     */
    public void setClaimSequenceNo(java.lang.String claimSequenceNo) {
        this.claimSequenceNo = claimSequenceNo;
    }


    /**
     * Gets the insurerCode value for this RiskWarningClaimDTO.
     * 
     * @return insurerCode
     */
    public java.lang.String getInsurerCode() {
        return insurerCode;
    }


    /**
     * Sets the insurerCode value for this RiskWarningClaimDTO.
     * 
     * @param insurerCode
     */
    public void setInsurerCode(java.lang.String insurerCode) {
        this.insurerCode = insurerCode;
    }


    /**
     * Gets the lossTime value for this RiskWarningClaimDTO.
     * 
     * @return lossTime
     */
    public java.lang.String getLossTime() {
        return lossTime;
    }


    /**
     * Sets the lossTime value for this RiskWarningClaimDTO.
     * 
     * @param lossTime
     */
    public void setLossTime(java.lang.String lossTime) {
        this.lossTime = lossTime;
    }


    /**
     * Gets the lossArea value for this RiskWarningClaimDTO.
     * 
     * @return lossArea
     */
    public java.lang.String getLossArea() {
        return lossArea;
    }


    /**
     * Sets the lossArea value for this RiskWarningClaimDTO.
     * 
     * @param lossArea
     */
    public void setLossArea(java.lang.String lossArea) {
        this.lossArea = lossArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskWarningClaimDTO)) return false;
        RiskWarningClaimDTO other = (RiskWarningClaimDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimSequenceNo==null && other.getClaimSequenceNo()==null) || 
             (this.claimSequenceNo!=null &&
              this.claimSequenceNo.equals(other.getClaimSequenceNo()))) &&
            ((this.insurerCode==null && other.getInsurerCode()==null) || 
             (this.insurerCode!=null &&
              this.insurerCode.equals(other.getInsurerCode()))) &&
            ((this.lossTime==null && other.getLossTime()==null) || 
             (this.lossTime!=null &&
              this.lossTime.equals(other.getLossTime()))) &&
            ((this.lossArea==null && other.getLossArea()==null) || 
             (this.lossArea!=null &&
              this.lossArea.equals(other.getLossArea())));
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
        if (getClaimSequenceNo() != null) {
            _hashCode += getClaimSequenceNo().hashCode();
        }
        if (getInsurerCode() != null) {
            _hashCode += getInsurerCode().hashCode();
        }
        if (getLossTime() != null) {
            _hashCode += getLossTime().hashCode();
        }
        if (getLossArea() != null) {
            _hashCode += getLossArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskWarningClaimDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RiskWarningClaimDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimSequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claimSequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insurerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lossTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lossArea"));
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
