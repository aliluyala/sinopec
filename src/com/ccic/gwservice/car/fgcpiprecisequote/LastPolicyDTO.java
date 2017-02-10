/**
 * LastPolicyDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class LastPolicyDTO  implements java.io.Serializable {
    private java.lang.String lastProducerCode;

    private java.lang.String lastPolicyQueryDate;

    private java.lang.String lastPolicyBillDate;

    private java.lang.String lastPolicyEffectiveDate;

    private java.lang.String lastPolicyExpireDate;

    private java.lang.String lastPolicyTotalPremium;

    private java.lang.String lastModelCode;

    private java.lang.String lastModel;

    private java.lang.String lastReplacementValue;

    public LastPolicyDTO() {
    }

    public LastPolicyDTO(
           java.lang.String lastProducerCode,
           java.lang.String lastPolicyQueryDate,
           java.lang.String lastPolicyBillDate,
           java.lang.String lastPolicyEffectiveDate,
           java.lang.String lastPolicyExpireDate,
           java.lang.String lastPolicyTotalPremium,
           java.lang.String lastModelCode,
           java.lang.String lastModel,
           java.lang.String lastReplacementValue) {
           this.lastProducerCode = lastProducerCode;
           this.lastPolicyQueryDate = lastPolicyQueryDate;
           this.lastPolicyBillDate = lastPolicyBillDate;
           this.lastPolicyEffectiveDate = lastPolicyEffectiveDate;
           this.lastPolicyExpireDate = lastPolicyExpireDate;
           this.lastPolicyTotalPremium = lastPolicyTotalPremium;
           this.lastModelCode = lastModelCode;
           this.lastModel = lastModel;
           this.lastReplacementValue = lastReplacementValue;
    }


    /**
     * Gets the lastProducerCode value for this LastPolicyDTO.
     * 
     * @return lastProducerCode
     */
    public java.lang.String getLastProducerCode() {
        return lastProducerCode;
    }


    /**
     * Sets the lastProducerCode value for this LastPolicyDTO.
     * 
     * @param lastProducerCode
     */
    public void setLastProducerCode(java.lang.String lastProducerCode) {
        this.lastProducerCode = lastProducerCode;
    }


    /**
     * Gets the lastPolicyQueryDate value for this LastPolicyDTO.
     * 
     * @return lastPolicyQueryDate
     */
    public java.lang.String getLastPolicyQueryDate() {
        return lastPolicyQueryDate;
    }


    /**
     * Sets the lastPolicyQueryDate value for this LastPolicyDTO.
     * 
     * @param lastPolicyQueryDate
     */
    public void setLastPolicyQueryDate(java.lang.String lastPolicyQueryDate) {
        this.lastPolicyQueryDate = lastPolicyQueryDate;
    }


    /**
     * Gets the lastPolicyBillDate value for this LastPolicyDTO.
     * 
     * @return lastPolicyBillDate
     */
    public java.lang.String getLastPolicyBillDate() {
        return lastPolicyBillDate;
    }


    /**
     * Sets the lastPolicyBillDate value for this LastPolicyDTO.
     * 
     * @param lastPolicyBillDate
     */
    public void setLastPolicyBillDate(java.lang.String lastPolicyBillDate) {
        this.lastPolicyBillDate = lastPolicyBillDate;
    }


    /**
     * Gets the lastPolicyEffectiveDate value for this LastPolicyDTO.
     * 
     * @return lastPolicyEffectiveDate
     */
    public java.lang.String getLastPolicyEffectiveDate() {
        return lastPolicyEffectiveDate;
    }


    /**
     * Sets the lastPolicyEffectiveDate value for this LastPolicyDTO.
     * 
     * @param lastPolicyEffectiveDate
     */
    public void setLastPolicyEffectiveDate(java.lang.String lastPolicyEffectiveDate) {
        this.lastPolicyEffectiveDate = lastPolicyEffectiveDate;
    }


    /**
     * Gets the lastPolicyExpireDate value for this LastPolicyDTO.
     * 
     * @return lastPolicyExpireDate
     */
    public java.lang.String getLastPolicyExpireDate() {
        return lastPolicyExpireDate;
    }


    /**
     * Sets the lastPolicyExpireDate value for this LastPolicyDTO.
     * 
     * @param lastPolicyExpireDate
     */
    public void setLastPolicyExpireDate(java.lang.String lastPolicyExpireDate) {
        this.lastPolicyExpireDate = lastPolicyExpireDate;
    }


    /**
     * Gets the lastPolicyTotalPremium value for this LastPolicyDTO.
     * 
     * @return lastPolicyTotalPremium
     */
    public java.lang.String getLastPolicyTotalPremium() {
        return lastPolicyTotalPremium;
    }


    /**
     * Sets the lastPolicyTotalPremium value for this LastPolicyDTO.
     * 
     * @param lastPolicyTotalPremium
     */
    public void setLastPolicyTotalPremium(java.lang.String lastPolicyTotalPremium) {
        this.lastPolicyTotalPremium = lastPolicyTotalPremium;
    }


    /**
     * Gets the lastModelCode value for this LastPolicyDTO.
     * 
     * @return lastModelCode
     */
    public java.lang.String getLastModelCode() {
        return lastModelCode;
    }


    /**
     * Sets the lastModelCode value for this LastPolicyDTO.
     * 
     * @param lastModelCode
     */
    public void setLastModelCode(java.lang.String lastModelCode) {
        this.lastModelCode = lastModelCode;
    }


    /**
     * Gets the lastModel value for this LastPolicyDTO.
     * 
     * @return lastModel
     */
    public java.lang.String getLastModel() {
        return lastModel;
    }


    /**
     * Sets the lastModel value for this LastPolicyDTO.
     * 
     * @param lastModel
     */
    public void setLastModel(java.lang.String lastModel) {
        this.lastModel = lastModel;
    }


    /**
     * Gets the lastReplacementValue value for this LastPolicyDTO.
     * 
     * @return lastReplacementValue
     */
    public java.lang.String getLastReplacementValue() {
        return lastReplacementValue;
    }


    /**
     * Sets the lastReplacementValue value for this LastPolicyDTO.
     * 
     * @param lastReplacementValue
     */
    public void setLastReplacementValue(java.lang.String lastReplacementValue) {
        this.lastReplacementValue = lastReplacementValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LastPolicyDTO)) return false;
        LastPolicyDTO other = (LastPolicyDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastProducerCode==null && other.getLastProducerCode()==null) || 
             (this.lastProducerCode!=null &&
              this.lastProducerCode.equals(other.getLastProducerCode()))) &&
            ((this.lastPolicyQueryDate==null && other.getLastPolicyQueryDate()==null) || 
             (this.lastPolicyQueryDate!=null &&
              this.lastPolicyQueryDate.equals(other.getLastPolicyQueryDate()))) &&
            ((this.lastPolicyBillDate==null && other.getLastPolicyBillDate()==null) || 
             (this.lastPolicyBillDate!=null &&
              this.lastPolicyBillDate.equals(other.getLastPolicyBillDate()))) &&
            ((this.lastPolicyEffectiveDate==null && other.getLastPolicyEffectiveDate()==null) || 
             (this.lastPolicyEffectiveDate!=null &&
              this.lastPolicyEffectiveDate.equals(other.getLastPolicyEffectiveDate()))) &&
            ((this.lastPolicyExpireDate==null && other.getLastPolicyExpireDate()==null) || 
             (this.lastPolicyExpireDate!=null &&
              this.lastPolicyExpireDate.equals(other.getLastPolicyExpireDate()))) &&
            ((this.lastPolicyTotalPremium==null && other.getLastPolicyTotalPremium()==null) || 
             (this.lastPolicyTotalPremium!=null &&
              this.lastPolicyTotalPremium.equals(other.getLastPolicyTotalPremium()))) &&
            ((this.lastModelCode==null && other.getLastModelCode()==null) || 
             (this.lastModelCode!=null &&
              this.lastModelCode.equals(other.getLastModelCode()))) &&
            ((this.lastModel==null && other.getLastModel()==null) || 
             (this.lastModel!=null &&
              this.lastModel.equals(other.getLastModel()))) &&
            ((this.lastReplacementValue==null && other.getLastReplacementValue()==null) || 
             (this.lastReplacementValue!=null &&
              this.lastReplacementValue.equals(other.getLastReplacementValue())));
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
        if (getLastProducerCode() != null) {
            _hashCode += getLastProducerCode().hashCode();
        }
        if (getLastPolicyQueryDate() != null) {
            _hashCode += getLastPolicyQueryDate().hashCode();
        }
        if (getLastPolicyBillDate() != null) {
            _hashCode += getLastPolicyBillDate().hashCode();
        }
        if (getLastPolicyEffectiveDate() != null) {
            _hashCode += getLastPolicyEffectiveDate().hashCode();
        }
        if (getLastPolicyExpireDate() != null) {
            _hashCode += getLastPolicyExpireDate().hashCode();
        }
        if (getLastPolicyTotalPremium() != null) {
            _hashCode += getLastPolicyTotalPremium().hashCode();
        }
        if (getLastModelCode() != null) {
            _hashCode += getLastModelCode().hashCode();
        }
        if (getLastModel() != null) {
            _hashCode += getLastModel().hashCode();
        }
        if (getLastReplacementValue() != null) {
            _hashCode += getLastReplacementValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LastPolicyDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "LastPolicyDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastProducerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastProducerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicyQueryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicyQueryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicyBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicyBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicyEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicyEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicyExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicyExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicyTotalPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicyTotalPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastModelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReplacementValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastReplacementValue"));
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
