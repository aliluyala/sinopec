/**
 * InsPlanMainDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class InsPlanMainDTO  implements java.io.Serializable {
    private java.lang.String quotationNoBI;

    private java.lang.String quotationNoCI;

    private java.lang.Double sumAmount;

    private java.lang.Double sumPremium;

    private java.lang.Double sumProfit;

    private com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] insPlankinds;

    private com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO[] insPlanCpiResult;

    public InsPlanMainDTO() {
    }

    public InsPlanMainDTO(
           java.lang.String quotationNoBI,
           java.lang.String quotationNoCI,
           java.lang.Double sumAmount,
           java.lang.Double sumPremium,
           java.lang.Double sumProfit,
           com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] insPlankinds,
           com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO[] insPlanCpiResult) {
           this.quotationNoBI = quotationNoBI;
           this.quotationNoCI = quotationNoCI;
           this.sumAmount = sumAmount;
           this.sumPremium = sumPremium;
           this.sumProfit = sumProfit;
           this.insPlankinds = insPlankinds;
           this.insPlanCpiResult = insPlanCpiResult;
    }


    /**
     * Gets the quotationNoBI value for this InsPlanMainDTO.
     * 
     * @return quotationNoBI
     */
    public java.lang.String getQuotationNoBI() {
        return quotationNoBI;
    }


    /**
     * Sets the quotationNoBI value for this InsPlanMainDTO.
     * 
     * @param quotationNoBI
     */
    public void setQuotationNoBI(java.lang.String quotationNoBI) {
        this.quotationNoBI = quotationNoBI;
    }


    /**
     * Gets the quotationNoCI value for this InsPlanMainDTO.
     * 
     * @return quotationNoCI
     */
    public java.lang.String getQuotationNoCI() {
        return quotationNoCI;
    }


    /**
     * Sets the quotationNoCI value for this InsPlanMainDTO.
     * 
     * @param quotationNoCI
     */
    public void setQuotationNoCI(java.lang.String quotationNoCI) {
        this.quotationNoCI = quotationNoCI;
    }


    /**
     * Gets the sumAmount value for this InsPlanMainDTO.
     * 
     * @return sumAmount
     */
    public java.lang.Double getSumAmount() {
        return sumAmount;
    }


    /**
     * Sets the sumAmount value for this InsPlanMainDTO.
     * 
     * @param sumAmount
     */
    public void setSumAmount(java.lang.Double sumAmount) {
        this.sumAmount = sumAmount;
    }


    /**
     * Gets the sumPremium value for this InsPlanMainDTO.
     * 
     * @return sumPremium
     */
    public java.lang.Double getSumPremium() {
        return sumPremium;
    }


    /**
     * Sets the sumPremium value for this InsPlanMainDTO.
     * 
     * @param sumPremium
     */
    public void setSumPremium(java.lang.Double sumPremium) {
        this.sumPremium = sumPremium;
    }


    /**
     * Gets the sumProfit value for this InsPlanMainDTO.
     * 
     * @return sumProfit
     */
    public java.lang.Double getSumProfit() {
        return sumProfit;
    }


    /**
     * Sets the sumProfit value for this InsPlanMainDTO.
     * 
     * @param sumProfit
     */
    public void setSumProfit(java.lang.Double sumProfit) {
        this.sumProfit = sumProfit;
    }


    /**
     * Gets the insPlankinds value for this InsPlanMainDTO.
     * 
     * @return insPlankinds
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] getInsPlankinds() {
        return insPlankinds;
    }


    /**
     * Sets the insPlankinds value for this InsPlanMainDTO.
     * 
     * @param insPlankinds
     */
    public void setInsPlankinds(com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] insPlankinds) {
        this.insPlankinds = insPlankinds;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.KindDTO getInsPlankinds(int i) {
        return this.insPlankinds[i];
    }

    public void setInsPlankinds(int i, com.ccic.gwservice.car.fgcpiprecisequote.KindDTO _value) {
        this.insPlankinds[i] = _value;
    }


    /**
     * Gets the insPlanCpiResult value for this InsPlanMainDTO.
     * 
     * @return insPlanCpiResult
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO[] getInsPlanCpiResult() {
        return insPlanCpiResult;
    }


    /**
     * Sets the insPlanCpiResult value for this InsPlanMainDTO.
     * 
     * @param insPlanCpiResult
     */
    public void setInsPlanCpiResult(com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO[] insPlanCpiResult) {
        this.insPlanCpiResult = insPlanCpiResult;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO getInsPlanCpiResult(int i) {
        return this.insPlanCpiResult[i];
    }

    public void setInsPlanCpiResult(int i, com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO _value) {
        this.insPlanCpiResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsPlanMainDTO)) return false;
        InsPlanMainDTO other = (InsPlanMainDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotationNoBI==null && other.getQuotationNoBI()==null) || 
             (this.quotationNoBI!=null &&
              this.quotationNoBI.equals(other.getQuotationNoBI()))) &&
            ((this.quotationNoCI==null && other.getQuotationNoCI()==null) || 
             (this.quotationNoCI!=null &&
              this.quotationNoCI.equals(other.getQuotationNoCI()))) &&
            ((this.sumAmount==null && other.getSumAmount()==null) || 
             (this.sumAmount!=null &&
              this.sumAmount.equals(other.getSumAmount()))) &&
            ((this.sumPremium==null && other.getSumPremium()==null) || 
             (this.sumPremium!=null &&
              this.sumPremium.equals(other.getSumPremium()))) &&
            ((this.sumProfit==null && other.getSumProfit()==null) || 
             (this.sumProfit!=null &&
              this.sumProfit.equals(other.getSumProfit()))) &&
            ((this.insPlankinds==null && other.getInsPlankinds()==null) || 
             (this.insPlankinds!=null &&
              java.util.Arrays.equals(this.insPlankinds, other.getInsPlankinds()))) &&
            ((this.insPlanCpiResult==null && other.getInsPlanCpiResult()==null) || 
             (this.insPlanCpiResult!=null &&
              java.util.Arrays.equals(this.insPlanCpiResult, other.getInsPlanCpiResult())));
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
        if (getQuotationNoBI() != null) {
            _hashCode += getQuotationNoBI().hashCode();
        }
        if (getQuotationNoCI() != null) {
            _hashCode += getQuotationNoCI().hashCode();
        }
        if (getSumAmount() != null) {
            _hashCode += getSumAmount().hashCode();
        }
        if (getSumPremium() != null) {
            _hashCode += getSumPremium().hashCode();
        }
        if (getSumProfit() != null) {
            _hashCode += getSumProfit().hashCode();
        }
        if (getInsPlankinds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsPlankinds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsPlankinds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInsPlanCpiResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsPlanCpiResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsPlanCpiResult(), i);
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
        new org.apache.axis.description.TypeDesc(InsPlanMainDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insPlanMainDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationNoBI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationNoBI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationNoCI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationNoCI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insPlankinds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insPlankinds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "KindDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insPlanCpiResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insPlanCpiResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CpiResultDTO"));
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
