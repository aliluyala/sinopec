/**
 * ContractDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ContractDTO  implements java.io.Serializable {
    private java.lang.String contractNo;

    private java.lang.String contractValidDate;

    private java.lang.String contractExpiredDate;

    public ContractDTO() {
    }

    public ContractDTO(
           java.lang.String contractNo,
           java.lang.String contractValidDate,
           java.lang.String contractExpiredDate) {
           this.contractNo = contractNo;
           this.contractValidDate = contractValidDate;
           this.contractExpiredDate = contractExpiredDate;
    }


    /**
     * Gets the contractNo value for this ContractDTO.
     * 
     * @return contractNo
     */
    public java.lang.String getContractNo() {
        return contractNo;
    }


    /**
     * Sets the contractNo value for this ContractDTO.
     * 
     * @param contractNo
     */
    public void setContractNo(java.lang.String contractNo) {
        this.contractNo = contractNo;
    }


    /**
     * Gets the contractValidDate value for this ContractDTO.
     * 
     * @return contractValidDate
     */
    public java.lang.String getContractValidDate() {
        return contractValidDate;
    }


    /**
     * Sets the contractValidDate value for this ContractDTO.
     * 
     * @param contractValidDate
     */
    public void setContractValidDate(java.lang.String contractValidDate) {
        this.contractValidDate = contractValidDate;
    }


    /**
     * Gets the contractExpiredDate value for this ContractDTO.
     * 
     * @return contractExpiredDate
     */
    public java.lang.String getContractExpiredDate() {
        return contractExpiredDate;
    }


    /**
     * Sets the contractExpiredDate value for this ContractDTO.
     * 
     * @param contractExpiredDate
     */
    public void setContractExpiredDate(java.lang.String contractExpiredDate) {
        this.contractExpiredDate = contractExpiredDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractDTO)) return false;
        ContractDTO other = (ContractDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractNo==null && other.getContractNo()==null) || 
             (this.contractNo!=null &&
              this.contractNo.equals(other.getContractNo()))) &&
            ((this.contractValidDate==null && other.getContractValidDate()==null) || 
             (this.contractValidDate!=null &&
              this.contractValidDate.equals(other.getContractValidDate()))) &&
            ((this.contractExpiredDate==null && other.getContractExpiredDate()==null) || 
             (this.contractExpiredDate!=null &&
              this.contractExpiredDate.equals(other.getContractExpiredDate())));
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
        if (getContractNo() != null) {
            _hashCode += getContractNo().hashCode();
        }
        if (getContractValidDate() != null) {
            _hashCode += getContractValidDate().hashCode();
        }
        if (getContractExpiredDate() != null) {
            _hashCode += getContractExpiredDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ContractDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "contractNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "contractValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractExpiredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "contractExpiredDate"));
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
