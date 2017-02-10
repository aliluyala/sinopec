/**
 * PaidDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PaidDTO  implements java.io.Serializable {
    private java.lang.String taxDepartmentCode;

    private java.lang.String taxDepartment;

    private java.lang.String taxDocumentNumber;

    public PaidDTO() {
    }

    public PaidDTO(
           java.lang.String taxDepartmentCode,
           java.lang.String taxDepartment,
           java.lang.String taxDocumentNumber) {
           this.taxDepartmentCode = taxDepartmentCode;
           this.taxDepartment = taxDepartment;
           this.taxDocumentNumber = taxDocumentNumber;
    }


    /**
     * Gets the taxDepartmentCode value for this PaidDTO.
     * 
     * @return taxDepartmentCode
     */
    public java.lang.String getTaxDepartmentCode() {
        return taxDepartmentCode;
    }


    /**
     * Sets the taxDepartmentCode value for this PaidDTO.
     * 
     * @param taxDepartmentCode
     */
    public void setTaxDepartmentCode(java.lang.String taxDepartmentCode) {
        this.taxDepartmentCode = taxDepartmentCode;
    }


    /**
     * Gets the taxDepartment value for this PaidDTO.
     * 
     * @return taxDepartment
     */
    public java.lang.String getTaxDepartment() {
        return taxDepartment;
    }


    /**
     * Sets the taxDepartment value for this PaidDTO.
     * 
     * @param taxDepartment
     */
    public void setTaxDepartment(java.lang.String taxDepartment) {
        this.taxDepartment = taxDepartment;
    }


    /**
     * Gets the taxDocumentNumber value for this PaidDTO.
     * 
     * @return taxDocumentNumber
     */
    public java.lang.String getTaxDocumentNumber() {
        return taxDocumentNumber;
    }


    /**
     * Sets the taxDocumentNumber value for this PaidDTO.
     * 
     * @param taxDocumentNumber
     */
    public void setTaxDocumentNumber(java.lang.String taxDocumentNumber) {
        this.taxDocumentNumber = taxDocumentNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaidDTO)) return false;
        PaidDTO other = (PaidDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDepartmentCode==null && other.getTaxDepartmentCode()==null) || 
             (this.taxDepartmentCode!=null &&
              this.taxDepartmentCode.equals(other.getTaxDepartmentCode()))) &&
            ((this.taxDepartment==null && other.getTaxDepartment()==null) || 
             (this.taxDepartment!=null &&
              this.taxDepartment.equals(other.getTaxDepartment()))) &&
            ((this.taxDocumentNumber==null && other.getTaxDocumentNumber()==null) || 
             (this.taxDocumentNumber!=null &&
              this.taxDocumentNumber.equals(other.getTaxDocumentNumber())));
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
        if (getTaxDepartmentCode() != null) {
            _hashCode += getTaxDepartmentCode().hashCode();
        }
        if (getTaxDepartment() != null) {
            _hashCode += getTaxDepartment().hashCode();
        }
        if (getTaxDocumentNumber() != null) {
            _hashCode += getTaxDocumentNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaidDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PaidDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDepartmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxDepartmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDepartment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxDepartment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDocumentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxDocumentNumber"));
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
