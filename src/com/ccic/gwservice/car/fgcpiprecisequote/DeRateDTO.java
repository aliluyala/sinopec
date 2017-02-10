/**
 * DeRateDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class DeRateDTO  implements java.io.Serializable {
    private java.lang.String noTaxCarType;

    private java.lang.String deDuctiondueCode;

    private java.lang.String deDuctiondueType;

    private java.lang.String deDuctiondueProportion;

    private java.lang.Double deDuction;

    private java.lang.String deDuctionDocumentNumber;

    private java.lang.String taxDepartmentDode;

    private java.lang.String taxDepartment;

    public DeRateDTO() {
    }

    public DeRateDTO(
           java.lang.String noTaxCarType,
           java.lang.String deDuctiondueCode,
           java.lang.String deDuctiondueType,
           java.lang.String deDuctiondueProportion,
           java.lang.Double deDuction,
           java.lang.String deDuctionDocumentNumber,
           java.lang.String taxDepartmentDode,
           java.lang.String taxDepartment) {
           this.noTaxCarType = noTaxCarType;
           this.deDuctiondueCode = deDuctiondueCode;
           this.deDuctiondueType = deDuctiondueType;
           this.deDuctiondueProportion = deDuctiondueProportion;
           this.deDuction = deDuction;
           this.deDuctionDocumentNumber = deDuctionDocumentNumber;
           this.taxDepartmentDode = taxDepartmentDode;
           this.taxDepartment = taxDepartment;
    }


    /**
     * Gets the noTaxCarType value for this DeRateDTO.
     * 
     * @return noTaxCarType
     */
    public java.lang.String getNoTaxCarType() {
        return noTaxCarType;
    }


    /**
     * Sets the noTaxCarType value for this DeRateDTO.
     * 
     * @param noTaxCarType
     */
    public void setNoTaxCarType(java.lang.String noTaxCarType) {
        this.noTaxCarType = noTaxCarType;
    }


    /**
     * Gets the deDuctiondueCode value for this DeRateDTO.
     * 
     * @return deDuctiondueCode
     */
    public java.lang.String getDeDuctiondueCode() {
        return deDuctiondueCode;
    }


    /**
     * Sets the deDuctiondueCode value for this DeRateDTO.
     * 
     * @param deDuctiondueCode
     */
    public void setDeDuctiondueCode(java.lang.String deDuctiondueCode) {
        this.deDuctiondueCode = deDuctiondueCode;
    }


    /**
     * Gets the deDuctiondueType value for this DeRateDTO.
     * 
     * @return deDuctiondueType
     */
    public java.lang.String getDeDuctiondueType() {
        return deDuctiondueType;
    }


    /**
     * Sets the deDuctiondueType value for this DeRateDTO.
     * 
     * @param deDuctiondueType
     */
    public void setDeDuctiondueType(java.lang.String deDuctiondueType) {
        this.deDuctiondueType = deDuctiondueType;
    }


    /**
     * Gets the deDuctiondueProportion value for this DeRateDTO.
     * 
     * @return deDuctiondueProportion
     */
    public java.lang.String getDeDuctiondueProportion() {
        return deDuctiondueProportion;
    }


    /**
     * Sets the deDuctiondueProportion value for this DeRateDTO.
     * 
     * @param deDuctiondueProportion
     */
    public void setDeDuctiondueProportion(java.lang.String deDuctiondueProportion) {
        this.deDuctiondueProportion = deDuctiondueProportion;
    }


    /**
     * Gets the deDuction value for this DeRateDTO.
     * 
     * @return deDuction
     */
    public java.lang.Double getDeDuction() {
        return deDuction;
    }


    /**
     * Sets the deDuction value for this DeRateDTO.
     * 
     * @param deDuction
     */
    public void setDeDuction(java.lang.Double deDuction) {
        this.deDuction = deDuction;
    }


    /**
     * Gets the deDuctionDocumentNumber value for this DeRateDTO.
     * 
     * @return deDuctionDocumentNumber
     */
    public java.lang.String getDeDuctionDocumentNumber() {
        return deDuctionDocumentNumber;
    }


    /**
     * Sets the deDuctionDocumentNumber value for this DeRateDTO.
     * 
     * @param deDuctionDocumentNumber
     */
    public void setDeDuctionDocumentNumber(java.lang.String deDuctionDocumentNumber) {
        this.deDuctionDocumentNumber = deDuctionDocumentNumber;
    }


    /**
     * Gets the taxDepartmentDode value for this DeRateDTO.
     * 
     * @return taxDepartmentDode
     */
    public java.lang.String getTaxDepartmentDode() {
        return taxDepartmentDode;
    }


    /**
     * Sets the taxDepartmentDode value for this DeRateDTO.
     * 
     * @param taxDepartmentDode
     */
    public void setTaxDepartmentDode(java.lang.String taxDepartmentDode) {
        this.taxDepartmentDode = taxDepartmentDode;
    }


    /**
     * Gets the taxDepartment value for this DeRateDTO.
     * 
     * @return taxDepartment
     */
    public java.lang.String getTaxDepartment() {
        return taxDepartment;
    }


    /**
     * Sets the taxDepartment value for this DeRateDTO.
     * 
     * @param taxDepartment
     */
    public void setTaxDepartment(java.lang.String taxDepartment) {
        this.taxDepartment = taxDepartment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeRateDTO)) return false;
        DeRateDTO other = (DeRateDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noTaxCarType==null && other.getNoTaxCarType()==null) || 
             (this.noTaxCarType!=null &&
              this.noTaxCarType.equals(other.getNoTaxCarType()))) &&
            ((this.deDuctiondueCode==null && other.getDeDuctiondueCode()==null) || 
             (this.deDuctiondueCode!=null &&
              this.deDuctiondueCode.equals(other.getDeDuctiondueCode()))) &&
            ((this.deDuctiondueType==null && other.getDeDuctiondueType()==null) || 
             (this.deDuctiondueType!=null &&
              this.deDuctiondueType.equals(other.getDeDuctiondueType()))) &&
            ((this.deDuctiondueProportion==null && other.getDeDuctiondueProportion()==null) || 
             (this.deDuctiondueProportion!=null &&
              this.deDuctiondueProportion.equals(other.getDeDuctiondueProportion()))) &&
            ((this.deDuction==null && other.getDeDuction()==null) || 
             (this.deDuction!=null &&
              this.deDuction.equals(other.getDeDuction()))) &&
            ((this.deDuctionDocumentNumber==null && other.getDeDuctionDocumentNumber()==null) || 
             (this.deDuctionDocumentNumber!=null &&
              this.deDuctionDocumentNumber.equals(other.getDeDuctionDocumentNumber()))) &&
            ((this.taxDepartmentDode==null && other.getTaxDepartmentDode()==null) || 
             (this.taxDepartmentDode!=null &&
              this.taxDepartmentDode.equals(other.getTaxDepartmentDode()))) &&
            ((this.taxDepartment==null && other.getTaxDepartment()==null) || 
             (this.taxDepartment!=null &&
              this.taxDepartment.equals(other.getTaxDepartment())));
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
        if (getNoTaxCarType() != null) {
            _hashCode += getNoTaxCarType().hashCode();
        }
        if (getDeDuctiondueCode() != null) {
            _hashCode += getDeDuctiondueCode().hashCode();
        }
        if (getDeDuctiondueType() != null) {
            _hashCode += getDeDuctiondueType().hashCode();
        }
        if (getDeDuctiondueProportion() != null) {
            _hashCode += getDeDuctiondueProportion().hashCode();
        }
        if (getDeDuction() != null) {
            _hashCode += getDeDuction().hashCode();
        }
        if (getDeDuctionDocumentNumber() != null) {
            _hashCode += getDeDuctionDocumentNumber().hashCode();
        }
        if (getTaxDepartmentDode() != null) {
            _hashCode += getTaxDepartmentDode().hashCode();
        }
        if (getTaxDepartment() != null) {
            _hashCode += getTaxDepartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeRateDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "DeRateDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noTaxCarType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "noTaxCarType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deDuctiondueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deDuctiondueCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deDuctiondueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deDuctiondueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deDuctiondueProportion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deDuctiondueProportion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deDuction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deDuction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deDuctionDocumentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deDuctionDocumentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDepartmentDode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxDepartmentDode"));
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
