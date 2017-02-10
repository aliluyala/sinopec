/**
 * AgentDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class AgentDTO  implements java.io.Serializable {
    private java.lang.String certificateNo;

    private java.lang.String agencyCode;

    private java.lang.String agencyName;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public AgentDTO() {
    }

    public AgentDTO(
           java.lang.String certificateNo,
           java.lang.String agencyCode,
           java.lang.String agencyName,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.certificateNo = certificateNo;
           this.agencyCode = agencyCode;
           this.agencyName = agencyName;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the certificateNo value for this AgentDTO.
     * 
     * @return certificateNo
     */
    public java.lang.String getCertificateNo() {
        return certificateNo;
    }


    /**
     * Sets the certificateNo value for this AgentDTO.
     * 
     * @param certificateNo
     */
    public void setCertificateNo(java.lang.String certificateNo) {
        this.certificateNo = certificateNo;
    }


    /**
     * Gets the agencyCode value for this AgentDTO.
     * 
     * @return agencyCode
     */
    public java.lang.String getAgencyCode() {
        return agencyCode;
    }


    /**
     * Sets the agencyCode value for this AgentDTO.
     * 
     * @param agencyCode
     */
    public void setAgencyCode(java.lang.String agencyCode) {
        this.agencyCode = agencyCode;
    }


    /**
     * Gets the agencyName value for this AgentDTO.
     * 
     * @return agencyName
     */
    public java.lang.String getAgencyName() {
        return agencyName;
    }


    /**
     * Sets the agencyName value for this AgentDTO.
     * 
     * @param agencyName
     */
    public void setAgencyName(java.lang.String agencyName) {
        this.agencyName = agencyName;
    }


    /**
     * Gets the extendInfo value for this AgentDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this AgentDTO.
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
        if (!(obj instanceof AgentDTO)) return false;
        AgentDTO other = (AgentDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateNo==null && other.getCertificateNo()==null) || 
             (this.certificateNo!=null &&
              this.certificateNo.equals(other.getCertificateNo()))) &&
            ((this.agencyCode==null && other.getAgencyCode()==null) || 
             (this.agencyCode!=null &&
              this.agencyCode.equals(other.getAgencyCode()))) &&
            ((this.agencyName==null && other.getAgencyName()==null) || 
             (this.agencyName!=null &&
              this.agencyName.equals(other.getAgencyName()))) &&
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
        if (getCertificateNo() != null) {
            _hashCode += getCertificateNo().hashCode();
        }
        if (getAgencyCode() != null) {
            _hashCode += getAgencyCode().hashCode();
        }
        if (getAgencyName() != null) {
            _hashCode += getAgencyName().hashCode();
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
        new org.apache.axis.description.TypeDesc(AgentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "AgentDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificateNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
