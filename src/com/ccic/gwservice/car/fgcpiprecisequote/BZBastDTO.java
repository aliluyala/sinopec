/**
 * BZBastDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class BZBastDTO  implements java.io.Serializable {
    private java.lang.Double limitAmount;

    private java.lang.Double standardPremium;

    private java.lang.Double basePremium;

    private java.lang.String rateFloatFlag;

    private java.lang.Double districtCoeff;

    private java.lang.String driverCoeff;

    private java.lang.Double peccancyAdjust;

    private java.lang.String peccancyAdjustReason;

    private java.lang.Double claimAdjust;

    private java.lang.String claimAdjustReason;

    private java.lang.String reinsureFlag;

    private java.lang.Double policyAdjustValue;

    private java.lang.Double driverAdjust;

    private java.lang.String lastBillDate;

    private java.lang.String lastStartDate;

    private java.lang.String lastEndDate;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public BZBastDTO() {
    }

    public BZBastDTO(
           java.lang.Double limitAmount,
           java.lang.Double standardPremium,
           java.lang.Double basePremium,
           java.lang.String rateFloatFlag,
           java.lang.Double districtCoeff,
           java.lang.String driverCoeff,
           java.lang.Double peccancyAdjust,
           java.lang.String peccancyAdjustReason,
           java.lang.Double claimAdjust,
           java.lang.String claimAdjustReason,
           java.lang.String reinsureFlag,
           java.lang.Double policyAdjustValue,
           java.lang.Double driverAdjust,
           java.lang.String lastBillDate,
           java.lang.String lastStartDate,
           java.lang.String lastEndDate,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.limitAmount = limitAmount;
           this.standardPremium = standardPremium;
           this.basePremium = basePremium;
           this.rateFloatFlag = rateFloatFlag;
           this.districtCoeff = districtCoeff;
           this.driverCoeff = driverCoeff;
           this.peccancyAdjust = peccancyAdjust;
           this.peccancyAdjustReason = peccancyAdjustReason;
           this.claimAdjust = claimAdjust;
           this.claimAdjustReason = claimAdjustReason;
           this.reinsureFlag = reinsureFlag;
           this.policyAdjustValue = policyAdjustValue;
           this.driverAdjust = driverAdjust;
           this.lastBillDate = lastBillDate;
           this.lastStartDate = lastStartDate;
           this.lastEndDate = lastEndDate;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the limitAmount value for this BZBastDTO.
     * 
     * @return limitAmount
     */
    public java.lang.Double getLimitAmount() {
        return limitAmount;
    }


    /**
     * Sets the limitAmount value for this BZBastDTO.
     * 
     * @param limitAmount
     */
    public void setLimitAmount(java.lang.Double limitAmount) {
        this.limitAmount = limitAmount;
    }


    /**
     * Gets the standardPremium value for this BZBastDTO.
     * 
     * @return standardPremium
     */
    public java.lang.Double getStandardPremium() {
        return standardPremium;
    }


    /**
     * Sets the standardPremium value for this BZBastDTO.
     * 
     * @param standardPremium
     */
    public void setStandardPremium(java.lang.Double standardPremium) {
        this.standardPremium = standardPremium;
    }


    /**
     * Gets the basePremium value for this BZBastDTO.
     * 
     * @return basePremium
     */
    public java.lang.Double getBasePremium() {
        return basePremium;
    }


    /**
     * Sets the basePremium value for this BZBastDTO.
     * 
     * @param basePremium
     */
    public void setBasePremium(java.lang.Double basePremium) {
        this.basePremium = basePremium;
    }


    /**
     * Gets the rateFloatFlag value for this BZBastDTO.
     * 
     * @return rateFloatFlag
     */
    public java.lang.String getRateFloatFlag() {
        return rateFloatFlag;
    }


    /**
     * Sets the rateFloatFlag value for this BZBastDTO.
     * 
     * @param rateFloatFlag
     */
    public void setRateFloatFlag(java.lang.String rateFloatFlag) {
        this.rateFloatFlag = rateFloatFlag;
    }


    /**
     * Gets the districtCoeff value for this BZBastDTO.
     * 
     * @return districtCoeff
     */
    public java.lang.Double getDistrictCoeff() {
        return districtCoeff;
    }


    /**
     * Sets the districtCoeff value for this BZBastDTO.
     * 
     * @param districtCoeff
     */
    public void setDistrictCoeff(java.lang.Double districtCoeff) {
        this.districtCoeff = districtCoeff;
    }


    /**
     * Gets the driverCoeff value for this BZBastDTO.
     * 
     * @return driverCoeff
     */
    public java.lang.String getDriverCoeff() {
        return driverCoeff;
    }


    /**
     * Sets the driverCoeff value for this BZBastDTO.
     * 
     * @param driverCoeff
     */
    public void setDriverCoeff(java.lang.String driverCoeff) {
        this.driverCoeff = driverCoeff;
    }


    /**
     * Gets the peccancyAdjust value for this BZBastDTO.
     * 
     * @return peccancyAdjust
     */
    public java.lang.Double getPeccancyAdjust() {
        return peccancyAdjust;
    }


    /**
     * Sets the peccancyAdjust value for this BZBastDTO.
     * 
     * @param peccancyAdjust
     */
    public void setPeccancyAdjust(java.lang.Double peccancyAdjust) {
        this.peccancyAdjust = peccancyAdjust;
    }


    /**
     * Gets the peccancyAdjustReason value for this BZBastDTO.
     * 
     * @return peccancyAdjustReason
     */
    public java.lang.String getPeccancyAdjustReason() {
        return peccancyAdjustReason;
    }


    /**
     * Sets the peccancyAdjustReason value for this BZBastDTO.
     * 
     * @param peccancyAdjustReason
     */
    public void setPeccancyAdjustReason(java.lang.String peccancyAdjustReason) {
        this.peccancyAdjustReason = peccancyAdjustReason;
    }


    /**
     * Gets the claimAdjust value for this BZBastDTO.
     * 
     * @return claimAdjust
     */
    public java.lang.Double getClaimAdjust() {
        return claimAdjust;
    }


    /**
     * Sets the claimAdjust value for this BZBastDTO.
     * 
     * @param claimAdjust
     */
    public void setClaimAdjust(java.lang.Double claimAdjust) {
        this.claimAdjust = claimAdjust;
    }


    /**
     * Gets the claimAdjustReason value for this BZBastDTO.
     * 
     * @return claimAdjustReason
     */
    public java.lang.String getClaimAdjustReason() {
        return claimAdjustReason;
    }


    /**
     * Sets the claimAdjustReason value for this BZBastDTO.
     * 
     * @param claimAdjustReason
     */
    public void setClaimAdjustReason(java.lang.String claimAdjustReason) {
        this.claimAdjustReason = claimAdjustReason;
    }


    /**
     * Gets the reinsureFlag value for this BZBastDTO.
     * 
     * @return reinsureFlag
     */
    public java.lang.String getReinsureFlag() {
        return reinsureFlag;
    }


    /**
     * Sets the reinsureFlag value for this BZBastDTO.
     * 
     * @param reinsureFlag
     */
    public void setReinsureFlag(java.lang.String reinsureFlag) {
        this.reinsureFlag = reinsureFlag;
    }


    /**
     * Gets the policyAdjustValue value for this BZBastDTO.
     * 
     * @return policyAdjustValue
     */
    public java.lang.Double getPolicyAdjustValue() {
        return policyAdjustValue;
    }


    /**
     * Sets the policyAdjustValue value for this BZBastDTO.
     * 
     * @param policyAdjustValue
     */
    public void setPolicyAdjustValue(java.lang.Double policyAdjustValue) {
        this.policyAdjustValue = policyAdjustValue;
    }


    /**
     * Gets the driverAdjust value for this BZBastDTO.
     * 
     * @return driverAdjust
     */
    public java.lang.Double getDriverAdjust() {
        return driverAdjust;
    }


    /**
     * Sets the driverAdjust value for this BZBastDTO.
     * 
     * @param driverAdjust
     */
    public void setDriverAdjust(java.lang.Double driverAdjust) {
        this.driverAdjust = driverAdjust;
    }


    /**
     * Gets the lastBillDate value for this BZBastDTO.
     * 
     * @return lastBillDate
     */
    public java.lang.String getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this BZBastDTO.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(java.lang.String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the lastStartDate value for this BZBastDTO.
     * 
     * @return lastStartDate
     */
    public java.lang.String getLastStartDate() {
        return lastStartDate;
    }


    /**
     * Sets the lastStartDate value for this BZBastDTO.
     * 
     * @param lastStartDate
     */
    public void setLastStartDate(java.lang.String lastStartDate) {
        this.lastStartDate = lastStartDate;
    }


    /**
     * Gets the lastEndDate value for this BZBastDTO.
     * 
     * @return lastEndDate
     */
    public java.lang.String getLastEndDate() {
        return lastEndDate;
    }


    /**
     * Sets the lastEndDate value for this BZBastDTO.
     * 
     * @param lastEndDate
     */
    public void setLastEndDate(java.lang.String lastEndDate) {
        this.lastEndDate = lastEndDate;
    }


    /**
     * Gets the extendInfo value for this BZBastDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this BZBastDTO.
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
        if (!(obj instanceof BZBastDTO)) return false;
        BZBastDTO other = (BZBastDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitAmount==null && other.getLimitAmount()==null) || 
             (this.limitAmount!=null &&
              this.limitAmount.equals(other.getLimitAmount()))) &&
            ((this.standardPremium==null && other.getStandardPremium()==null) || 
             (this.standardPremium!=null &&
              this.standardPremium.equals(other.getStandardPremium()))) &&
            ((this.basePremium==null && other.getBasePremium()==null) || 
             (this.basePremium!=null &&
              this.basePremium.equals(other.getBasePremium()))) &&
            ((this.rateFloatFlag==null && other.getRateFloatFlag()==null) || 
             (this.rateFloatFlag!=null &&
              this.rateFloatFlag.equals(other.getRateFloatFlag()))) &&
            ((this.districtCoeff==null && other.getDistrictCoeff()==null) || 
             (this.districtCoeff!=null &&
              this.districtCoeff.equals(other.getDistrictCoeff()))) &&
            ((this.driverCoeff==null && other.getDriverCoeff()==null) || 
             (this.driverCoeff!=null &&
              this.driverCoeff.equals(other.getDriverCoeff()))) &&
            ((this.peccancyAdjust==null && other.getPeccancyAdjust()==null) || 
             (this.peccancyAdjust!=null &&
              this.peccancyAdjust.equals(other.getPeccancyAdjust()))) &&
            ((this.peccancyAdjustReason==null && other.getPeccancyAdjustReason()==null) || 
             (this.peccancyAdjustReason!=null &&
              this.peccancyAdjustReason.equals(other.getPeccancyAdjustReason()))) &&
            ((this.claimAdjust==null && other.getClaimAdjust()==null) || 
             (this.claimAdjust!=null &&
              this.claimAdjust.equals(other.getClaimAdjust()))) &&
            ((this.claimAdjustReason==null && other.getClaimAdjustReason()==null) || 
             (this.claimAdjustReason!=null &&
              this.claimAdjustReason.equals(other.getClaimAdjustReason()))) &&
            ((this.reinsureFlag==null && other.getReinsureFlag()==null) || 
             (this.reinsureFlag!=null &&
              this.reinsureFlag.equals(other.getReinsureFlag()))) &&
            ((this.policyAdjustValue==null && other.getPolicyAdjustValue()==null) || 
             (this.policyAdjustValue!=null &&
              this.policyAdjustValue.equals(other.getPolicyAdjustValue()))) &&
            ((this.driverAdjust==null && other.getDriverAdjust()==null) || 
             (this.driverAdjust!=null &&
              this.driverAdjust.equals(other.getDriverAdjust()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.lastStartDate==null && other.getLastStartDate()==null) || 
             (this.lastStartDate!=null &&
              this.lastStartDate.equals(other.getLastStartDate()))) &&
            ((this.lastEndDate==null && other.getLastEndDate()==null) || 
             (this.lastEndDate!=null &&
              this.lastEndDate.equals(other.getLastEndDate()))) &&
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
        if (getLimitAmount() != null) {
            _hashCode += getLimitAmount().hashCode();
        }
        if (getStandardPremium() != null) {
            _hashCode += getStandardPremium().hashCode();
        }
        if (getBasePremium() != null) {
            _hashCode += getBasePremium().hashCode();
        }
        if (getRateFloatFlag() != null) {
            _hashCode += getRateFloatFlag().hashCode();
        }
        if (getDistrictCoeff() != null) {
            _hashCode += getDistrictCoeff().hashCode();
        }
        if (getDriverCoeff() != null) {
            _hashCode += getDriverCoeff().hashCode();
        }
        if (getPeccancyAdjust() != null) {
            _hashCode += getPeccancyAdjust().hashCode();
        }
        if (getPeccancyAdjustReason() != null) {
            _hashCode += getPeccancyAdjustReason().hashCode();
        }
        if (getClaimAdjust() != null) {
            _hashCode += getClaimAdjust().hashCode();
        }
        if (getClaimAdjustReason() != null) {
            _hashCode += getClaimAdjustReason().hashCode();
        }
        if (getReinsureFlag() != null) {
            _hashCode += getReinsureFlag().hashCode();
        }
        if (getPolicyAdjustValue() != null) {
            _hashCode += getPolicyAdjustValue().hashCode();
        }
        if (getDriverAdjust() != null) {
            _hashCode += getDriverAdjust().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getLastStartDate() != null) {
            _hashCode += getLastStartDate().hashCode();
        }
        if (getLastEndDate() != null) {
            _hashCode += getLastEndDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(BZBastDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZBastDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "limitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "standardPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "basePremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateFloatFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "rateFloatFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districtCoeff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "districtCoeff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverCoeff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "driverCoeff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyAdjustReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyAdjustReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claimAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimAdjustReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claimAdjustReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reinsureFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "reinsureFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyAdjustValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "policyAdjustValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "driverAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastEndDate"));
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
