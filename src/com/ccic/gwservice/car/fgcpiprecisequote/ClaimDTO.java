/**
 * ClaimDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ClaimDTO  implements java.io.Serializable {
    private java.lang.String serialNo;

    private java.lang.String insurerCode;

    private java.lang.String policyNo;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String accidentTime;

    private java.lang.String endcaseTime;

    private java.lang.String personPayFlag;

    private java.lang.String coverageType;

    private java.lang.Double claimAmount;

    public ClaimDTO() {
    }

    public ClaimDTO(
           java.lang.String serialNo,
           java.lang.String insurerCode,
           java.lang.String policyNo,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String accidentTime,
           java.lang.String endcaseTime,
           java.lang.String personPayFlag,
           java.lang.String coverageType,
           java.lang.Double claimAmount) {
           this.serialNo = serialNo;
           this.insurerCode = insurerCode;
           this.policyNo = policyNo;
           this.startDate = startDate;
           this.endDate = endDate;
           this.accidentTime = accidentTime;
           this.endcaseTime = endcaseTime;
           this.personPayFlag = personPayFlag;
           this.coverageType = coverageType;
           this.claimAmount = claimAmount;
    }


    /**
     * Gets the serialNo value for this ClaimDTO.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this ClaimDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the insurerCode value for this ClaimDTO.
     * 
     * @return insurerCode
     */
    public java.lang.String getInsurerCode() {
        return insurerCode;
    }


    /**
     * Sets the insurerCode value for this ClaimDTO.
     * 
     * @param insurerCode
     */
    public void setInsurerCode(java.lang.String insurerCode) {
        this.insurerCode = insurerCode;
    }


    /**
     * Gets the policyNo value for this ClaimDTO.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this ClaimDTO.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the startDate value for this ClaimDTO.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ClaimDTO.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ClaimDTO.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ClaimDTO.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the accidentTime value for this ClaimDTO.
     * 
     * @return accidentTime
     */
    public java.lang.String getAccidentTime() {
        return accidentTime;
    }


    /**
     * Sets the accidentTime value for this ClaimDTO.
     * 
     * @param accidentTime
     */
    public void setAccidentTime(java.lang.String accidentTime) {
        this.accidentTime = accidentTime;
    }


    /**
     * Gets the endcaseTime value for this ClaimDTO.
     * 
     * @return endcaseTime
     */
    public java.lang.String getEndcaseTime() {
        return endcaseTime;
    }


    /**
     * Sets the endcaseTime value for this ClaimDTO.
     * 
     * @param endcaseTime
     */
    public void setEndcaseTime(java.lang.String endcaseTime) {
        this.endcaseTime = endcaseTime;
    }


    /**
     * Gets the personPayFlag value for this ClaimDTO.
     * 
     * @return personPayFlag
     */
    public java.lang.String getPersonPayFlag() {
        return personPayFlag;
    }


    /**
     * Sets the personPayFlag value for this ClaimDTO.
     * 
     * @param personPayFlag
     */
    public void setPersonPayFlag(java.lang.String personPayFlag) {
        this.personPayFlag = personPayFlag;
    }


    /**
     * Gets the coverageType value for this ClaimDTO.
     * 
     * @return coverageType
     */
    public java.lang.String getCoverageType() {
        return coverageType;
    }


    /**
     * Sets the coverageType value for this ClaimDTO.
     * 
     * @param coverageType
     */
    public void setCoverageType(java.lang.String coverageType) {
        this.coverageType = coverageType;
    }


    /**
     * Gets the claimAmount value for this ClaimDTO.
     * 
     * @return claimAmount
     */
    public java.lang.Double getClaimAmount() {
        return claimAmount;
    }


    /**
     * Sets the claimAmount value for this ClaimDTO.
     * 
     * @param claimAmount
     */
    public void setClaimAmount(java.lang.Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimDTO)) return false;
        ClaimDTO other = (ClaimDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.insurerCode==null && other.getInsurerCode()==null) || 
             (this.insurerCode!=null &&
              this.insurerCode.equals(other.getInsurerCode()))) &&
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.accidentTime==null && other.getAccidentTime()==null) || 
             (this.accidentTime!=null &&
              this.accidentTime.equals(other.getAccidentTime()))) &&
            ((this.endcaseTime==null && other.getEndcaseTime()==null) || 
             (this.endcaseTime!=null &&
              this.endcaseTime.equals(other.getEndcaseTime()))) &&
            ((this.personPayFlag==null && other.getPersonPayFlag()==null) || 
             (this.personPayFlag!=null &&
              this.personPayFlag.equals(other.getPersonPayFlag()))) &&
            ((this.coverageType==null && other.getCoverageType()==null) || 
             (this.coverageType!=null &&
              this.coverageType.equals(other.getCoverageType()))) &&
            ((this.claimAmount==null && other.getClaimAmount()==null) || 
             (this.claimAmount!=null &&
              this.claimAmount.equals(other.getClaimAmount())));
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
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getInsurerCode() != null) {
            _hashCode += getInsurerCode().hashCode();
        }
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAccidentTime() != null) {
            _hashCode += getAccidentTime().hashCode();
        }
        if (getEndcaseTime() != null) {
            _hashCode += getEndcaseTime().hashCode();
        }
        if (getPersonPayFlag() != null) {
            _hashCode += getPersonPayFlag().hashCode();
        }
        if (getCoverageType() != null) {
            _hashCode += getCoverageType().hashCode();
        }
        if (getClaimAmount() != null) {
            _hashCode += getClaimAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ClaimDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
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
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "policyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accidentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "accidentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endcaseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "endcaseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personPayFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "personPayFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "coverageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claimAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
