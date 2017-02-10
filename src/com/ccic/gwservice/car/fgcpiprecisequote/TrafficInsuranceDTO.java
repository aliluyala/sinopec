/**
 * TrafficInsuranceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class TrafficInsuranceDTO  implements java.io.Serializable {
    private com.ccic.gwservice.car.fgcpiprecisequote.BZBastDTO BZBast;

    private com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] BZClaim;

    private com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] BZPecc;

    private com.ccic.gwservice.car.fgcpiprecisequote.TaxDTO carTax;

    private com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] BZRiskWarning;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    private com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission;

    private com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent;

    public TrafficInsuranceDTO() {
    }

    public TrafficInsuranceDTO(
           com.ccic.gwservice.car.fgcpiprecisequote.BZBastDTO BZBast,
           com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] BZClaim,
           com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] BZPecc,
           com.ccic.gwservice.car.fgcpiprecisequote.TaxDTO carTax,
           com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] BZRiskWarning,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo,
           com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission,
           com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent) {
           this.BZBast = BZBast;
           this.BZClaim = BZClaim;
           this.BZPecc = BZPecc;
           this.carTax = carTax;
           this.BZRiskWarning = BZRiskWarning;
           this.extendInfo = extendInfo;
           this.commission = commission;
           this.commissionAgent = commissionAgent;
    }


    /**
     * Gets the BZBast value for this TrafficInsuranceDTO.
     * 
     * @return BZBast
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.BZBastDTO getBZBast() {
        return BZBast;
    }


    /**
     * Sets the BZBast value for this TrafficInsuranceDTO.
     * 
     * @param BZBast
     */
    public void setBZBast(com.ccic.gwservice.car.fgcpiprecisequote.BZBastDTO BZBast) {
        this.BZBast = BZBast;
    }


    /**
     * Gets the BZClaim value for this TrafficInsuranceDTO.
     * 
     * @return BZClaim
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] getBZClaim() {
        return BZClaim;
    }


    /**
     * Sets the BZClaim value for this TrafficInsuranceDTO.
     * 
     * @param BZClaim
     */
    public void setBZClaim(com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] BZClaim) {
        this.BZClaim = BZClaim;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO getBZClaim(int i) {
        return this.BZClaim[i];
    }

    public void setBZClaim(int i, com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO _value) {
        this.BZClaim[i] = _value;
    }


    /**
     * Gets the BZPecc value for this TrafficInsuranceDTO.
     * 
     * @return BZPecc
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] getBZPecc() {
        return BZPecc;
    }


    /**
     * Sets the BZPecc value for this TrafficInsuranceDTO.
     * 
     * @param BZPecc
     */
    public void setBZPecc(com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] BZPecc) {
        this.BZPecc = BZPecc;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO getBZPecc(int i) {
        return this.BZPecc[i];
    }

    public void setBZPecc(int i, com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO _value) {
        this.BZPecc[i] = _value;
    }


    /**
     * Gets the carTax value for this TrafficInsuranceDTO.
     * 
     * @return carTax
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.TaxDTO getCarTax() {
        return carTax;
    }


    /**
     * Sets the carTax value for this TrafficInsuranceDTO.
     * 
     * @param carTax
     */
    public void setCarTax(com.ccic.gwservice.car.fgcpiprecisequote.TaxDTO carTax) {
        this.carTax = carTax;
    }


    /**
     * Gets the BZRiskWarning value for this TrafficInsuranceDTO.
     * 
     * @return BZRiskWarning
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] getBZRiskWarning() {
        return BZRiskWarning;
    }


    /**
     * Sets the BZRiskWarning value for this TrafficInsuranceDTO.
     * 
     * @param BZRiskWarning
     */
    public void setBZRiskWarning(com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] BZRiskWarning) {
        this.BZRiskWarning = BZRiskWarning;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO getBZRiskWarning(int i) {
        return this.BZRiskWarning[i];
    }

    public void setBZRiskWarning(int i, com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO _value) {
        this.BZRiskWarning[i] = _value;
    }


    /**
     * Gets the extendInfo value for this TrafficInsuranceDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this TrafficInsuranceDTO.
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


    /**
     * Gets the commission value for this TrafficInsuranceDTO.
     * 
     * @return commission
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this TrafficInsuranceDTO.
     * 
     * @param commission
     */
    public void setCommission(com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission) {
        this.commission = commission;
    }


    /**
     * Gets the commissionAgent value for this TrafficInsuranceDTO.
     * 
     * @return commissionAgent
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO getCommissionAgent() {
        return commissionAgent;
    }


    /**
     * Sets the commissionAgent value for this TrafficInsuranceDTO.
     * 
     * @param commissionAgent
     */
    public void setCommissionAgent(com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent) {
        this.commissionAgent = commissionAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficInsuranceDTO)) return false;
        TrafficInsuranceDTO other = (TrafficInsuranceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BZBast==null && other.getBZBast()==null) || 
             (this.BZBast!=null &&
              this.BZBast.equals(other.getBZBast()))) &&
            ((this.BZClaim==null && other.getBZClaim()==null) || 
             (this.BZClaim!=null &&
              java.util.Arrays.equals(this.BZClaim, other.getBZClaim()))) &&
            ((this.BZPecc==null && other.getBZPecc()==null) || 
             (this.BZPecc!=null &&
              java.util.Arrays.equals(this.BZPecc, other.getBZPecc()))) &&
            ((this.carTax==null && other.getCarTax()==null) || 
             (this.carTax!=null &&
              this.carTax.equals(other.getCarTax()))) &&
            ((this.BZRiskWarning==null && other.getBZRiskWarning()==null) || 
             (this.BZRiskWarning!=null &&
              java.util.Arrays.equals(this.BZRiskWarning, other.getBZRiskWarning()))) &&
            ((this.extendInfo==null && other.getExtendInfo()==null) || 
             (this.extendInfo!=null &&
              java.util.Arrays.equals(this.extendInfo, other.getExtendInfo()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.commissionAgent==null && other.getCommissionAgent()==null) || 
             (this.commissionAgent!=null &&
              this.commissionAgent.equals(other.getCommissionAgent())));
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
        if (getBZBast() != null) {
            _hashCode += getBZBast().hashCode();
        }
        if (getBZClaim() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBZClaim());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBZClaim(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBZPecc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBZPecc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBZPecc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarTax() != null) {
            _hashCode += getCarTax().hashCode();
        }
        if (getBZRiskWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBZRiskWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBZRiskWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getCommissionAgent() != null) {
            _hashCode += getCommissionAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficInsuranceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TrafficInsuranceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BZBast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZBast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZBastDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BZClaim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZClaim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ClaimDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BZPecc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZPecc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PeccDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TaxDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BZRiskWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "BZRiskWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "RiskWarningDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "extendInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ExtendInfoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommissionDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "commissionAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommissionAgentDTO"));
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
