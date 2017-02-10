/**
 * KindDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class KindDTO  implements java.io.Serializable {
    private java.lang.String kindCode;

    private java.lang.String kindName;

    private int serialNo;

    private java.lang.Integer quantity;

    private java.lang.Double unitAmount;

    private java.lang.Double amount;

    private java.lang.Double value;

    private java.lang.Double deductibleRate;

    private java.lang.Double rate;

    private java.lang.Double disCount;

    private java.lang.Double adjustRate;

    private java.lang.Double benchmarkPremium;

    private java.lang.Double premium;

    private java.lang.String kindFlag;

    private java.lang.String modeCode;

    private com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO[] profitDTOs;

    public KindDTO() {
    }

    public KindDTO(
           java.lang.String kindCode,
           java.lang.String kindName,
           int serialNo,
           java.lang.Integer quantity,
           java.lang.Double unitAmount,
           java.lang.Double amount,
           java.lang.Double value,
           java.lang.Double deductibleRate,
           java.lang.Double rate,
           java.lang.Double disCount,
           java.lang.Double adjustRate,
           java.lang.Double benchmarkPremium,
           java.lang.Double premium,
           java.lang.String kindFlag,
           java.lang.String modeCode,
           com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO[] profitDTOs) {
           this.kindCode = kindCode;
           this.kindName = kindName;
           this.serialNo = serialNo;
           this.quantity = quantity;
           this.unitAmount = unitAmount;
           this.amount = amount;
           this.value = value;
           this.deductibleRate = deductibleRate;
           this.rate = rate;
           this.disCount = disCount;
           this.adjustRate = adjustRate;
           this.benchmarkPremium = benchmarkPremium;
           this.premium = premium;
           this.kindFlag = kindFlag;
           this.modeCode = modeCode;
           this.profitDTOs = profitDTOs;
    }


    /**
     * Gets the kindCode value for this KindDTO.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this KindDTO.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this KindDTO.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this KindDTO.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }


    /**
     * Gets the serialNo value for this KindDTO.
     * 
     * @return serialNo
     */
    public int getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this KindDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the quantity value for this KindDTO.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this KindDTO.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the unitAmount value for this KindDTO.
     * 
     * @return unitAmount
     */
    public java.lang.Double getUnitAmount() {
        return unitAmount;
    }


    /**
     * Sets the unitAmount value for this KindDTO.
     * 
     * @param unitAmount
     */
    public void setUnitAmount(java.lang.Double unitAmount) {
        this.unitAmount = unitAmount;
    }


    /**
     * Gets the amount value for this KindDTO.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this KindDTO.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the value value for this KindDTO.
     * 
     * @return value
     */
    public java.lang.Double getValue() {
        return value;
    }


    /**
     * Sets the value value for this KindDTO.
     * 
     * @param value
     */
    public void setValue(java.lang.Double value) {
        this.value = value;
    }


    /**
     * Gets the deductibleRate value for this KindDTO.
     * 
     * @return deductibleRate
     */
    public java.lang.Double getDeductibleRate() {
        return deductibleRate;
    }


    /**
     * Sets the deductibleRate value for this KindDTO.
     * 
     * @param deductibleRate
     */
    public void setDeductibleRate(java.lang.Double deductibleRate) {
        this.deductibleRate = deductibleRate;
    }


    /**
     * Gets the rate value for this KindDTO.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this KindDTO.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the disCount value for this KindDTO.
     * 
     * @return disCount
     */
    public java.lang.Double getDisCount() {
        return disCount;
    }


    /**
     * Sets the disCount value for this KindDTO.
     * 
     * @param disCount
     */
    public void setDisCount(java.lang.Double disCount) {
        this.disCount = disCount;
    }


    /**
     * Gets the adjustRate value for this KindDTO.
     * 
     * @return adjustRate
     */
    public java.lang.Double getAdjustRate() {
        return adjustRate;
    }


    /**
     * Sets the adjustRate value for this KindDTO.
     * 
     * @param adjustRate
     */
    public void setAdjustRate(java.lang.Double adjustRate) {
        this.adjustRate = adjustRate;
    }


    /**
     * Gets the benchmarkPremium value for this KindDTO.
     * 
     * @return benchmarkPremium
     */
    public java.lang.Double getBenchmarkPremium() {
        return benchmarkPremium;
    }


    /**
     * Sets the benchmarkPremium value for this KindDTO.
     * 
     * @param benchmarkPremium
     */
    public void setBenchmarkPremium(java.lang.Double benchmarkPremium) {
        this.benchmarkPremium = benchmarkPremium;
    }


    /**
     * Gets the premium value for this KindDTO.
     * 
     * @return premium
     */
    public java.lang.Double getPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this KindDTO.
     * 
     * @param premium
     */
    public void setPremium(java.lang.Double premium) {
        this.premium = premium;
    }


    /**
     * Gets the kindFlag value for this KindDTO.
     * 
     * @return kindFlag
     */
    public java.lang.String getKindFlag() {
        return kindFlag;
    }


    /**
     * Sets the kindFlag value for this KindDTO.
     * 
     * @param kindFlag
     */
    public void setKindFlag(java.lang.String kindFlag) {
        this.kindFlag = kindFlag;
    }


    /**
     * Gets the modeCode value for this KindDTO.
     * 
     * @return modeCode
     */
    public java.lang.String getModeCode() {
        return modeCode;
    }


    /**
     * Sets the modeCode value for this KindDTO.
     * 
     * @param modeCode
     */
    public void setModeCode(java.lang.String modeCode) {
        this.modeCode = modeCode;
    }


    /**
     * Gets the profitDTOs value for this KindDTO.
     * 
     * @return profitDTOs
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO[] getProfitDTOs() {
        return profitDTOs;
    }


    /**
     * Sets the profitDTOs value for this KindDTO.
     * 
     * @param profitDTOs
     */
    public void setProfitDTOs(com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO[] profitDTOs) {
        this.profitDTOs = profitDTOs;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO getProfitDTOs(int i) {
        return this.profitDTOs[i];
    }

    public void setProfitDTOs(int i, com.ccic.gwservice.car.fgcpiprecisequote.KindProfitDTO _value) {
        this.profitDTOs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KindDTO)) return false;
        KindDTO other = (KindDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName()))) &&
            this.serialNo == other.getSerialNo() &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.unitAmount==null && other.getUnitAmount()==null) || 
             (this.unitAmount!=null &&
              this.unitAmount.equals(other.getUnitAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.deductibleRate==null && other.getDeductibleRate()==null) || 
             (this.deductibleRate!=null &&
              this.deductibleRate.equals(other.getDeductibleRate()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.disCount==null && other.getDisCount()==null) || 
             (this.disCount!=null &&
              this.disCount.equals(other.getDisCount()))) &&
            ((this.adjustRate==null && other.getAdjustRate()==null) || 
             (this.adjustRate!=null &&
              this.adjustRate.equals(other.getAdjustRate()))) &&
            ((this.benchmarkPremium==null && other.getBenchmarkPremium()==null) || 
             (this.benchmarkPremium!=null &&
              this.benchmarkPremium.equals(other.getBenchmarkPremium()))) &&
            ((this.premium==null && other.getPremium()==null) || 
             (this.premium!=null &&
              this.premium.equals(other.getPremium()))) &&
            ((this.kindFlag==null && other.getKindFlag()==null) || 
             (this.kindFlag!=null &&
              this.kindFlag.equals(other.getKindFlag()))) &&
            ((this.modeCode==null && other.getModeCode()==null) || 
             (this.modeCode!=null &&
              this.modeCode.equals(other.getModeCode()))) &&
            ((this.profitDTOs==null && other.getProfitDTOs()==null) || 
             (this.profitDTOs!=null &&
              java.util.Arrays.equals(this.profitDTOs, other.getProfitDTOs())));
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
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        _hashCode += getSerialNo();
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnitAmount() != null) {
            _hashCode += getUnitAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDeductibleRate() != null) {
            _hashCode += getDeductibleRate().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getDisCount() != null) {
            _hashCode += getDisCount().hashCode();
        }
        if (getAdjustRate() != null) {
            _hashCode += getAdjustRate().hashCode();
        }
        if (getBenchmarkPremium() != null) {
            _hashCode += getBenchmarkPremium().hashCode();
        }
        if (getPremium() != null) {
            _hashCode += getPremium().hashCode();
        }
        if (getKindFlag() != null) {
            _hashCode += getKindFlag().hashCode();
        }
        if (getModeCode() != null) {
            _hashCode += getModeCode().hashCode();
        }
        if (getProfitDTOs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfitDTOs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfitDTOs(), i);
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
        new org.apache.axis.description.TypeDesc(KindDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "KindDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "kindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "kindName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "unitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductibleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deductibleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "disCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "adjustRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benchmarkPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "benchmarkPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "premium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "kindFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "modeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitDTOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitDTOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "KindProfitDTO"));
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
