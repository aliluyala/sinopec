/**
 * ReinsureDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ReinsureDTO  implements java.io.Serializable {
    private java.lang.String insurerCode;

    private java.lang.String policyNo;

    private java.lang.String coverageCode;

    private java.lang.String licenseNo;

    private java.lang.String licenseType;

    private java.lang.String vinNo;

    private java.lang.String engineNo;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String operateDate;

    private java.lang.String insurerArea;

    public ReinsureDTO() {
    }

    public ReinsureDTO(
           java.lang.String insurerCode,
           java.lang.String policyNo,
           java.lang.String coverageCode,
           java.lang.String licenseNo,
           java.lang.String licenseType,
           java.lang.String vinNo,
           java.lang.String engineNo,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String operateDate,
           java.lang.String insurerArea) {
           this.insurerCode = insurerCode;
           this.policyNo = policyNo;
           this.coverageCode = coverageCode;
           this.licenseNo = licenseNo;
           this.licenseType = licenseType;
           this.vinNo = vinNo;
           this.engineNo = engineNo;
           this.startDate = startDate;
           this.endDate = endDate;
           this.operateDate = operateDate;
           this.insurerArea = insurerArea;
    }


    /**
     * Gets the insurerCode value for this ReinsureDTO.
     * 
     * @return insurerCode
     */
    public java.lang.String getInsurerCode() {
        return insurerCode;
    }


    /**
     * Sets the insurerCode value for this ReinsureDTO.
     * 
     * @param insurerCode
     */
    public void setInsurerCode(java.lang.String insurerCode) {
        this.insurerCode = insurerCode;
    }


    /**
     * Gets the policyNo value for this ReinsureDTO.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this ReinsureDTO.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the coverageCode value for this ReinsureDTO.
     * 
     * @return coverageCode
     */
    public java.lang.String getCoverageCode() {
        return coverageCode;
    }


    /**
     * Sets the coverageCode value for this ReinsureDTO.
     * 
     * @param coverageCode
     */
    public void setCoverageCode(java.lang.String coverageCode) {
        this.coverageCode = coverageCode;
    }


    /**
     * Gets the licenseNo value for this ReinsureDTO.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this ReinsureDTO.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the licenseType value for this ReinsureDTO.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this ReinsureDTO.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the vinNo value for this ReinsureDTO.
     * 
     * @return vinNo
     */
    public java.lang.String getVinNo() {
        return vinNo;
    }


    /**
     * Sets the vinNo value for this ReinsureDTO.
     * 
     * @param vinNo
     */
    public void setVinNo(java.lang.String vinNo) {
        this.vinNo = vinNo;
    }


    /**
     * Gets the engineNo value for this ReinsureDTO.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this ReinsureDTO.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the startDate value for this ReinsureDTO.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ReinsureDTO.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ReinsureDTO.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ReinsureDTO.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the operateDate value for this ReinsureDTO.
     * 
     * @return operateDate
     */
    public java.lang.String getOperateDate() {
        return operateDate;
    }


    /**
     * Sets the operateDate value for this ReinsureDTO.
     * 
     * @param operateDate
     */
    public void setOperateDate(java.lang.String operateDate) {
        this.operateDate = operateDate;
    }


    /**
     * Gets the insurerArea value for this ReinsureDTO.
     * 
     * @return insurerArea
     */
    public java.lang.String getInsurerArea() {
        return insurerArea;
    }


    /**
     * Sets the insurerArea value for this ReinsureDTO.
     * 
     * @param insurerArea
     */
    public void setInsurerArea(java.lang.String insurerArea) {
        this.insurerArea = insurerArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReinsureDTO)) return false;
        ReinsureDTO other = (ReinsureDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insurerCode==null && other.getInsurerCode()==null) || 
             (this.insurerCode!=null &&
              this.insurerCode.equals(other.getInsurerCode()))) &&
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.coverageCode==null && other.getCoverageCode()==null) || 
             (this.coverageCode!=null &&
              this.coverageCode.equals(other.getCoverageCode()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.vinNo==null && other.getVinNo()==null) || 
             (this.vinNo!=null &&
              this.vinNo.equals(other.getVinNo()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.operateDate==null && other.getOperateDate()==null) || 
             (this.operateDate!=null &&
              this.operateDate.equals(other.getOperateDate()))) &&
            ((this.insurerArea==null && other.getInsurerArea()==null) || 
             (this.insurerArea!=null &&
              this.insurerArea.equals(other.getInsurerArea())));
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
        if (getInsurerCode() != null) {
            _hashCode += getInsurerCode().hashCode();
        }
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getCoverageCode() != null) {
            _hashCode += getCoverageCode().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getVinNo() != null) {
            _hashCode += getVinNo().hashCode();
        }
        if (getEngineNo() != null) {
            _hashCode += getEngineNo().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOperateDate() != null) {
            _hashCode += getOperateDate().hashCode();
        }
        if (getInsurerArea() != null) {
            _hashCode += getInsurerArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReinsureDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ReinsureDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("coverageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "coverageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "licenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vinNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "engineNo"));
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
        elemField.setFieldName("operateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "operateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurerArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insurerArea"));
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
