/**
 * CertificateDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CertificateDTO  implements java.io.Serializable {
    private java.lang.String certificateValidDate;

    private java.lang.String certificateExpireDate;

    public CertificateDTO() {
    }

    public CertificateDTO(
           java.lang.String certificateValidDate,
           java.lang.String certificateExpireDate) {
           this.certificateValidDate = certificateValidDate;
           this.certificateExpireDate = certificateExpireDate;
    }


    /**
     * Gets the certificateValidDate value for this CertificateDTO.
     * 
     * @return certificateValidDate
     */
    public java.lang.String getCertificateValidDate() {
        return certificateValidDate;
    }


    /**
     * Sets the certificateValidDate value for this CertificateDTO.
     * 
     * @param certificateValidDate
     */
    public void setCertificateValidDate(java.lang.String certificateValidDate) {
        this.certificateValidDate = certificateValidDate;
    }


    /**
     * Gets the certificateExpireDate value for this CertificateDTO.
     * 
     * @return certificateExpireDate
     */
    public java.lang.String getCertificateExpireDate() {
        return certificateExpireDate;
    }


    /**
     * Sets the certificateExpireDate value for this CertificateDTO.
     * 
     * @param certificateExpireDate
     */
    public void setCertificateExpireDate(java.lang.String certificateExpireDate) {
        this.certificateExpireDate = certificateExpireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificateDTO)) return false;
        CertificateDTO other = (CertificateDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateValidDate==null && other.getCertificateValidDate()==null) || 
             (this.certificateValidDate!=null &&
              this.certificateValidDate.equals(other.getCertificateValidDate()))) &&
            ((this.certificateExpireDate==null && other.getCertificateExpireDate()==null) || 
             (this.certificateExpireDate!=null &&
              this.certificateExpireDate.equals(other.getCertificateExpireDate())));
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
        if (getCertificateValidDate() != null) {
            _hashCode += getCertificateValidDate().hashCode();
        }
        if (getCertificateExpireDate() != null) {
            _hashCode += getCertificateExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CertificateDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificateValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificateExpireDate"));
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
