/**
 * CpiResultDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CpiResultDTO  implements java.io.Serializable {
    private java.lang.String tradeNo;

    private java.lang.String returnType;

    private java.lang.Double discount;

    private java.lang.Double compDiscount;

    private java.lang.Double profDiscount;

    private java.lang.String limitType;

    private java.lang.String isSpecifyProfit;

    private java.lang.Double taxAmount;

    private com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] checkInfos;

    private com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] ruleInfos;

    private com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO[] premiums;

    private com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO[] profits;

    private com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] profitRules;

    public CpiResultDTO() {
    }

    public CpiResultDTO(
           java.lang.String tradeNo,
           java.lang.String returnType,
           java.lang.Double discount,
           java.lang.Double compDiscount,
           java.lang.Double profDiscount,
           java.lang.String limitType,
           java.lang.String isSpecifyProfit,
           java.lang.Double taxAmount,
           com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] checkInfos,
           com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] ruleInfos,
           com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO[] premiums,
           com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO[] profits,
           com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] profitRules) {
           this.tradeNo = tradeNo;
           this.returnType = returnType;
           this.discount = discount;
           this.compDiscount = compDiscount;
           this.profDiscount = profDiscount;
           this.limitType = limitType;
           this.isSpecifyProfit = isSpecifyProfit;
           this.taxAmount = taxAmount;
           this.checkInfos = checkInfos;
           this.ruleInfos = ruleInfos;
           this.premiums = premiums;
           this.profits = profits;
           this.profitRules = profitRules;
    }


    /**
     * Gets the tradeNo value for this CpiResultDTO.
     * 
     * @return tradeNo
     */
    public java.lang.String getTradeNo() {
        return tradeNo;
    }


    /**
     * Sets the tradeNo value for this CpiResultDTO.
     * 
     * @param tradeNo
     */
    public void setTradeNo(java.lang.String tradeNo) {
        this.tradeNo = tradeNo;
    }


    /**
     * Gets the returnType value for this CpiResultDTO.
     * 
     * @return returnType
     */
    public java.lang.String getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this CpiResultDTO.
     * 
     * @param returnType
     */
    public void setReturnType(java.lang.String returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the discount value for this CpiResultDTO.
     * 
     * @return discount
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this CpiResultDTO.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the compDiscount value for this CpiResultDTO.
     * 
     * @return compDiscount
     */
    public java.lang.Double getCompDiscount() {
        return compDiscount;
    }


    /**
     * Sets the compDiscount value for this CpiResultDTO.
     * 
     * @param compDiscount
     */
    public void setCompDiscount(java.lang.Double compDiscount) {
        this.compDiscount = compDiscount;
    }


    /**
     * Gets the profDiscount value for this CpiResultDTO.
     * 
     * @return profDiscount
     */
    public java.lang.Double getProfDiscount() {
        return profDiscount;
    }


    /**
     * Sets the profDiscount value for this CpiResultDTO.
     * 
     * @param profDiscount
     */
    public void setProfDiscount(java.lang.Double profDiscount) {
        this.profDiscount = profDiscount;
    }


    /**
     * Gets the limitType value for this CpiResultDTO.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this CpiResultDTO.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the isSpecifyProfit value for this CpiResultDTO.
     * 
     * @return isSpecifyProfit
     */
    public java.lang.String getIsSpecifyProfit() {
        return isSpecifyProfit;
    }


    /**
     * Sets the isSpecifyProfit value for this CpiResultDTO.
     * 
     * @param isSpecifyProfit
     */
    public void setIsSpecifyProfit(java.lang.String isSpecifyProfit) {
        this.isSpecifyProfit = isSpecifyProfit;
    }


    /**
     * Gets the taxAmount value for this CpiResultDTO.
     * 
     * @return taxAmount
     */
    public java.lang.Double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this CpiResultDTO.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the checkInfos value for this CpiResultDTO.
     * 
     * @return checkInfos
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] getCheckInfos() {
        return checkInfos;
    }


    /**
     * Sets the checkInfos value for this CpiResultDTO.
     * 
     * @param checkInfos
     */
    public void setCheckInfos(com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] checkInfos) {
        this.checkInfos = checkInfos;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO getCheckInfos(int i) {
        return this.checkInfos[i];
    }

    public void setCheckInfos(int i, com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO _value) {
        this.checkInfos[i] = _value;
    }


    /**
     * Gets the ruleInfos value for this CpiResultDTO.
     * 
     * @return ruleInfos
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] getRuleInfos() {
        return ruleInfos;
    }


    /**
     * Sets the ruleInfos value for this CpiResultDTO.
     * 
     * @param ruleInfos
     */
    public void setRuleInfos(com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] ruleInfos) {
        this.ruleInfos = ruleInfos;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO getRuleInfos(int i) {
        return this.ruleInfos[i];
    }

    public void setRuleInfos(int i, com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO _value) {
        this.ruleInfos[i] = _value;
    }


    /**
     * Gets the premiums value for this CpiResultDTO.
     * 
     * @return premiums
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO[] getPremiums() {
        return premiums;
    }


    /**
     * Sets the premiums value for this CpiResultDTO.
     * 
     * @param premiums
     */
    public void setPremiums(com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO[] premiums) {
        this.premiums = premiums;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO getPremiums(int i) {
        return this.premiums[i];
    }

    public void setPremiums(int i, com.ccic.gwservice.car.fgcpiprecisequote.PremiumDTO _value) {
        this.premiums[i] = _value;
    }


    /**
     * Gets the profits value for this CpiResultDTO.
     * 
     * @return profits
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO[] getProfits() {
        return profits;
    }


    /**
     * Sets the profits value for this CpiResultDTO.
     * 
     * @param profits
     */
    public void setProfits(com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO[] profits) {
        this.profits = profits;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO getProfits(int i) {
        return this.profits[i];
    }

    public void setProfits(int i, com.ccic.gwservice.car.fgcpiprecisequote.RuleProfitDTO _value) {
        this.profits[i] = _value;
    }


    /**
     * Gets the profitRules value for this CpiResultDTO.
     * 
     * @return profitRules
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] getProfitRules() {
        return profitRules;
    }


    /**
     * Sets the profitRules value for this CpiResultDTO.
     * 
     * @param profitRules
     */
    public void setProfitRules(com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO[] profitRules) {
        this.profitRules = profitRules;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO getProfitRules(int i) {
        return this.profitRules[i];
    }

    public void setProfitRules(int i, com.ccic.gwservice.car.fgcpiprecisequote.RuleOutInfoDTO _value) {
        this.profitRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpiResultDTO)) return false;
        CpiResultDTO other = (CpiResultDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradeNo==null && other.getTradeNo()==null) || 
             (this.tradeNo!=null &&
              this.tradeNo.equals(other.getTradeNo()))) &&
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.compDiscount==null && other.getCompDiscount()==null) || 
             (this.compDiscount!=null &&
              this.compDiscount.equals(other.getCompDiscount()))) &&
            ((this.profDiscount==null && other.getProfDiscount()==null) || 
             (this.profDiscount!=null &&
              this.profDiscount.equals(other.getProfDiscount()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.isSpecifyProfit==null && other.getIsSpecifyProfit()==null) || 
             (this.isSpecifyProfit!=null &&
              this.isSpecifyProfit.equals(other.getIsSpecifyProfit()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.checkInfos==null && other.getCheckInfos()==null) || 
             (this.checkInfos!=null &&
              java.util.Arrays.equals(this.checkInfos, other.getCheckInfos()))) &&
            ((this.ruleInfos==null && other.getRuleInfos()==null) || 
             (this.ruleInfos!=null &&
              java.util.Arrays.equals(this.ruleInfos, other.getRuleInfos()))) &&
            ((this.premiums==null && other.getPremiums()==null) || 
             (this.premiums!=null &&
              java.util.Arrays.equals(this.premiums, other.getPremiums()))) &&
            ((this.profits==null && other.getProfits()==null) || 
             (this.profits!=null &&
              java.util.Arrays.equals(this.profits, other.getProfits()))) &&
            ((this.profitRules==null && other.getProfitRules()==null) || 
             (this.profitRules!=null &&
              java.util.Arrays.equals(this.profitRules, other.getProfitRules())));
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
        if (getTradeNo() != null) {
            _hashCode += getTradeNo().hashCode();
        }
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getCompDiscount() != null) {
            _hashCode += getCompDiscount().hashCode();
        }
        if (getProfDiscount() != null) {
            _hashCode += getProfDiscount().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getIsSpecifyProfit() != null) {
            _hashCode += getIsSpecifyProfit().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getCheckInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuleInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPremiums() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPremiums());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPremiums(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfitRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfitRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfitRules(), i);
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
        new org.apache.axis.description.TypeDesc(CpiResultDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CpiResultDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "tradeNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "returnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "compDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecifyProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "isSpecifyProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "checkInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RuleOutInfoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ruleInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RuleOutInfoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiums");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "premiums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PremiumDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RuleProfitDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profitRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RuleOutInfoDTO"));
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
