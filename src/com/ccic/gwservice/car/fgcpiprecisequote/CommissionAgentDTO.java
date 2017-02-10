/**
 * CommissionAgentDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CommissionAgentDTO  implements java.io.Serializable {
    private java.lang.String agentTypeCode;

    private java.lang.String certificateNo;

    private java.lang.String individualProducerCode;

    private java.lang.String individualProducerName;

    private java.lang.String groupCompany;

    private java.lang.String practiceCertificateCode;

    private java.lang.String bankCode;

    private java.lang.String bankName;

    private java.lang.String accountNumber;

    private java.lang.String accountName;

    private com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO[] certificate;

    private com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO[] contract;

    public CommissionAgentDTO() {
    }

    public CommissionAgentDTO(
           java.lang.String agentTypeCode,
           java.lang.String certificateNo,
           java.lang.String individualProducerCode,
           java.lang.String individualProducerName,
           java.lang.String groupCompany,
           java.lang.String practiceCertificateCode,
           java.lang.String bankCode,
           java.lang.String bankName,
           java.lang.String accountNumber,
           java.lang.String accountName,
           com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO[] certificate,
           com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO[] contract) {
           this.agentTypeCode = agentTypeCode;
           this.certificateNo = certificateNo;
           this.individualProducerCode = individualProducerCode;
           this.individualProducerName = individualProducerName;
           this.groupCompany = groupCompany;
           this.practiceCertificateCode = practiceCertificateCode;
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.accountNumber = accountNumber;
           this.accountName = accountName;
           this.certificate = certificate;
           this.contract = contract;
    }


    /**
     * Gets the agentTypeCode value for this CommissionAgentDTO.
     * 
     * @return agentTypeCode
     */
    public java.lang.String getAgentTypeCode() {
        return agentTypeCode;
    }


    /**
     * Sets the agentTypeCode value for this CommissionAgentDTO.
     * 
     * @param agentTypeCode
     */
    public void setAgentTypeCode(java.lang.String agentTypeCode) {
        this.agentTypeCode = agentTypeCode;
    }


    /**
     * Gets the certificateNo value for this CommissionAgentDTO.
     * 
     * @return certificateNo
     */
    public java.lang.String getCertificateNo() {
        return certificateNo;
    }


    /**
     * Sets the certificateNo value for this CommissionAgentDTO.
     * 
     * @param certificateNo
     */
    public void setCertificateNo(java.lang.String certificateNo) {
        this.certificateNo = certificateNo;
    }


    /**
     * Gets the individualProducerCode value for this CommissionAgentDTO.
     * 
     * @return individualProducerCode
     */
    public java.lang.String getIndividualProducerCode() {
        return individualProducerCode;
    }


    /**
     * Sets the individualProducerCode value for this CommissionAgentDTO.
     * 
     * @param individualProducerCode
     */
    public void setIndividualProducerCode(java.lang.String individualProducerCode) {
        this.individualProducerCode = individualProducerCode;
    }


    /**
     * Gets the individualProducerName value for this CommissionAgentDTO.
     * 
     * @return individualProducerName
     */
    public java.lang.String getIndividualProducerName() {
        return individualProducerName;
    }


    /**
     * Sets the individualProducerName value for this CommissionAgentDTO.
     * 
     * @param individualProducerName
     */
    public void setIndividualProducerName(java.lang.String individualProducerName) {
        this.individualProducerName = individualProducerName;
    }


    /**
     * Gets the groupCompany value for this CommissionAgentDTO.
     * 
     * @return groupCompany
     */
    public java.lang.String getGroupCompany() {
        return groupCompany;
    }


    /**
     * Sets the groupCompany value for this CommissionAgentDTO.
     * 
     * @param groupCompany
     */
    public void setGroupCompany(java.lang.String groupCompany) {
        this.groupCompany = groupCompany;
    }


    /**
     * Gets the practiceCertificateCode value for this CommissionAgentDTO.
     * 
     * @return practiceCertificateCode
     */
    public java.lang.String getPracticeCertificateCode() {
        return practiceCertificateCode;
    }


    /**
     * Sets the practiceCertificateCode value for this CommissionAgentDTO.
     * 
     * @param practiceCertificateCode
     */
    public void setPracticeCertificateCode(java.lang.String practiceCertificateCode) {
        this.practiceCertificateCode = practiceCertificateCode;
    }


    /**
     * Gets the bankCode value for this CommissionAgentDTO.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this CommissionAgentDTO.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this CommissionAgentDTO.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this CommissionAgentDTO.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the accountNumber value for this CommissionAgentDTO.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CommissionAgentDTO.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountName value for this CommissionAgentDTO.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this CommissionAgentDTO.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the certificate value for this CommissionAgentDTO.
     * 
     * @return certificate
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO[] getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this CommissionAgentDTO.
     * 
     * @param certificate
     */
    public void setCertificate(com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO[] certificate) {
        this.certificate = certificate;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO getCertificate(int i) {
        return this.certificate[i];
    }

    public void setCertificate(int i, com.ccic.gwservice.car.fgcpiprecisequote.CertificateDTO _value) {
        this.certificate[i] = _value;
    }


    /**
     * Gets the contract value for this CommissionAgentDTO.
     * 
     * @return contract
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO[] getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this CommissionAgentDTO.
     * 
     * @param contract
     */
    public void setContract(com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO[] contract) {
        this.contract = contract;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO getContract(int i) {
        return this.contract[i];
    }

    public void setContract(int i, com.ccic.gwservice.car.fgcpiprecisequote.ContractDTO _value) {
        this.contract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommissionAgentDTO)) return false;
        CommissionAgentDTO other = (CommissionAgentDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentTypeCode==null && other.getAgentTypeCode()==null) || 
             (this.agentTypeCode!=null &&
              this.agentTypeCode.equals(other.getAgentTypeCode()))) &&
            ((this.certificateNo==null && other.getCertificateNo()==null) || 
             (this.certificateNo!=null &&
              this.certificateNo.equals(other.getCertificateNo()))) &&
            ((this.individualProducerCode==null && other.getIndividualProducerCode()==null) || 
             (this.individualProducerCode!=null &&
              this.individualProducerCode.equals(other.getIndividualProducerCode()))) &&
            ((this.individualProducerName==null && other.getIndividualProducerName()==null) || 
             (this.individualProducerName!=null &&
              this.individualProducerName.equals(other.getIndividualProducerName()))) &&
            ((this.groupCompany==null && other.getGroupCompany()==null) || 
             (this.groupCompany!=null &&
              this.groupCompany.equals(other.getGroupCompany()))) &&
            ((this.practiceCertificateCode==null && other.getPracticeCertificateCode()==null) || 
             (this.practiceCertificateCode!=null &&
              this.practiceCertificateCode.equals(other.getPracticeCertificateCode()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              java.util.Arrays.equals(this.certificate, other.getCertificate()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              java.util.Arrays.equals(this.contract, other.getContract())));
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
        if (getAgentTypeCode() != null) {
            _hashCode += getAgentTypeCode().hashCode();
        }
        if (getCertificateNo() != null) {
            _hashCode += getCertificateNo().hashCode();
        }
        if (getIndividualProducerCode() != null) {
            _hashCode += getIndividualProducerCode().hashCode();
        }
        if (getIndividualProducerName() != null) {
            _hashCode += getIndividualProducerName().hashCode();
        }
        if (getGroupCompany() != null) {
            _hashCode += getGroupCompany().hashCode();
        }
        if (getPracticeCertificateCode() != null) {
            _hashCode += getPracticeCertificateCode().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getCertificate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContract(), i);
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
        new org.apache.axis.description.TypeDesc(CommissionAgentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommissionAgentDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificateNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualProducerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "individualProducerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualProducerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "individualProducerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "groupCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("practiceCertificateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "practiceCertificateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "accountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CertificateDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ContractDTO"));
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
