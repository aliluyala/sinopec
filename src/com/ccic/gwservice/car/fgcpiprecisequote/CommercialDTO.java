/**
 * CommercialDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CommercialDTO  implements java.io.Serializable {
    private com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO[] carModel;

    private com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO[] vehicleModel;

    private com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] violation;

    private com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] claim;

    private com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO[] profit;

    private com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO[] reinsure;

    private com.ccic.gwservice.car.fgcpiprecisequote.LastPolicyDTO lastPolicy;

    private com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] riskWarning;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    private com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission;

    private com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent;

    private com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO[] coveragePremium;

    public CommercialDTO() {
    }

    public CommercialDTO(
           com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO[] carModel,
           com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO[] vehicleModel,
           com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] violation,
           com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] claim,
           com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO[] profit,
           com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO[] reinsure,
           com.ccic.gwservice.car.fgcpiprecisequote.LastPolicyDTO lastPolicy,
           com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] riskWarning,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo,
           com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission,
           com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent,
           com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO[] coveragePremium) {
           this.carModel = carModel;
           this.vehicleModel = vehicleModel;
           this.violation = violation;
           this.claim = claim;
           this.profit = profit;
           this.reinsure = reinsure;
           this.lastPolicy = lastPolicy;
           this.riskWarning = riskWarning;
           this.extendInfo = extendInfo;
           this.commission = commission;
           this.commissionAgent = commissionAgent;
           this.coveragePremium = coveragePremium;
    }


    /**
     * Gets the carModel value for this CommercialDTO.
     * 
     * @return carModel
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO[] getCarModel() {
        return carModel;
    }


    /**
     * Sets the carModel value for this CommercialDTO.
     * 
     * @param carModel
     */
    public void setCarModel(com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO[] carModel) {
        this.carModel = carModel;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO getCarModel(int i) {
        return this.carModel[i];
    }

    public void setCarModel(int i, com.ccic.gwservice.car.fgcpiprecisequote.CarModelDTO _value) {
        this.carModel[i] = _value;
    }


    /**
     * Gets the vehicleModel value for this CommercialDTO.
     * 
     * @return vehicleModel
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO[] getVehicleModel() {
        return vehicleModel;
    }


    /**
     * Sets the vehicleModel value for this CommercialDTO.
     * 
     * @param vehicleModel
     */
    public void setVehicleModel(com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO[] vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO getVehicleModel(int i) {
        return this.vehicleModel[i];
    }

    public void setVehicleModel(int i, com.ccic.gwservice.car.fgcpiprecisequote.VehicleModelDTO _value) {
        this.vehicleModel[i] = _value;
    }


    /**
     * Gets the violation value for this CommercialDTO.
     * 
     * @return violation
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] getViolation() {
        return violation;
    }


    /**
     * Sets the violation value for this CommercialDTO.
     * 
     * @param violation
     */
    public void setViolation(com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO[] violation) {
        this.violation = violation;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO getViolation(int i) {
        return this.violation[i];
    }

    public void setViolation(int i, com.ccic.gwservice.car.fgcpiprecisequote.PeccDTO _value) {
        this.violation[i] = _value;
    }


    /**
     * Gets the claim value for this CommercialDTO.
     * 
     * @return claim
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] getClaim() {
        return claim;
    }


    /**
     * Sets the claim value for this CommercialDTO.
     * 
     * @param claim
     */
    public void setClaim(com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO[] claim) {
        this.claim = claim;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO getClaim(int i) {
        return this.claim[i];
    }

    public void setClaim(int i, com.ccic.gwservice.car.fgcpiprecisequote.ClaimDTO _value) {
        this.claim[i] = _value;
    }


    /**
     * Gets the profit value for this CommercialDTO.
     * 
     * @return profit
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO[] getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this CommercialDTO.
     * 
     * @param profit
     */
    public void setProfit(com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO[] profit) {
        this.profit = profit;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO getProfit(int i) {
        return this.profit[i];
    }

    public void setProfit(int i, com.ccic.gwservice.car.fgcpiprecisequote.ProfitDTO _value) {
        this.profit[i] = _value;
    }


    /**
     * Gets the reinsure value for this CommercialDTO.
     * 
     * @return reinsure
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO[] getReinsure() {
        return reinsure;
    }


    /**
     * Sets the reinsure value for this CommercialDTO.
     * 
     * @param reinsure
     */
    public void setReinsure(com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO[] reinsure) {
        this.reinsure = reinsure;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO getReinsure(int i) {
        return this.reinsure[i];
    }

    public void setReinsure(int i, com.ccic.gwservice.car.fgcpiprecisequote.ReinsureDTO _value) {
        this.reinsure[i] = _value;
    }


    /**
     * Gets the lastPolicy value for this CommercialDTO.
     * 
     * @return lastPolicy
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.LastPolicyDTO getLastPolicy() {
        return lastPolicy;
    }


    /**
     * Sets the lastPolicy value for this CommercialDTO.
     * 
     * @param lastPolicy
     */
    public void setLastPolicy(com.ccic.gwservice.car.fgcpiprecisequote.LastPolicyDTO lastPolicy) {
        this.lastPolicy = lastPolicy;
    }


    /**
     * Gets the riskWarning value for this CommercialDTO.
     * 
     * @return riskWarning
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] getRiskWarning() {
        return riskWarning;
    }


    /**
     * Sets the riskWarning value for this CommercialDTO.
     * 
     * @param riskWarning
     */
    public void setRiskWarning(com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO[] riskWarning) {
        this.riskWarning = riskWarning;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO getRiskWarning(int i) {
        return this.riskWarning[i];
    }

    public void setRiskWarning(int i, com.ccic.gwservice.car.fgcpiprecisequote.RiskWarningDTO _value) {
        this.riskWarning[i] = _value;
    }


    /**
     * Gets the extendInfo value for this CommercialDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this CommercialDTO.
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
     * Gets the commission value for this CommercialDTO.
     * 
     * @return commission
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this CommercialDTO.
     * 
     * @param commission
     */
    public void setCommission(com.ccic.gwservice.car.fgcpiprecisequote.CommissionDTO commission) {
        this.commission = commission;
    }


    /**
     * Gets the commissionAgent value for this CommercialDTO.
     * 
     * @return commissionAgent
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO getCommissionAgent() {
        return commissionAgent;
    }


    /**
     * Sets the commissionAgent value for this CommercialDTO.
     * 
     * @param commissionAgent
     */
    public void setCommissionAgent(com.ccic.gwservice.car.fgcpiprecisequote.CommissionAgentDTO commissionAgent) {
        this.commissionAgent = commissionAgent;
    }


    /**
     * Gets the coveragePremium value for this CommercialDTO.
     * 
     * @return coveragePremium
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO[] getCoveragePremium() {
        return coveragePremium;
    }


    /**
     * Sets the coveragePremium value for this CommercialDTO.
     * 
     * @param coveragePremium
     */
    public void setCoveragePremium(com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO[] coveragePremium) {
        this.coveragePremium = coveragePremium;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO getCoveragePremium(int i) {
        return this.coveragePremium[i];
    }

    public void setCoveragePremium(int i, com.ccic.gwservice.car.fgcpiprecisequote.CoveragePremiumDTO _value) {
        this.coveragePremium[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommercialDTO)) return false;
        CommercialDTO other = (CommercialDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carModel==null && other.getCarModel()==null) || 
             (this.carModel!=null &&
              java.util.Arrays.equals(this.carModel, other.getCarModel()))) &&
            ((this.vehicleModel==null && other.getVehicleModel()==null) || 
             (this.vehicleModel!=null &&
              java.util.Arrays.equals(this.vehicleModel, other.getVehicleModel()))) &&
            ((this.violation==null && other.getViolation()==null) || 
             (this.violation!=null &&
              java.util.Arrays.equals(this.violation, other.getViolation()))) &&
            ((this.claim==null && other.getClaim()==null) || 
             (this.claim!=null &&
              java.util.Arrays.equals(this.claim, other.getClaim()))) &&
            ((this.profit==null && other.getProfit()==null) || 
             (this.profit!=null &&
              java.util.Arrays.equals(this.profit, other.getProfit()))) &&
            ((this.reinsure==null && other.getReinsure()==null) || 
             (this.reinsure!=null &&
              java.util.Arrays.equals(this.reinsure, other.getReinsure()))) &&
            ((this.lastPolicy==null && other.getLastPolicy()==null) || 
             (this.lastPolicy!=null &&
              this.lastPolicy.equals(other.getLastPolicy()))) &&
            ((this.riskWarning==null && other.getRiskWarning()==null) || 
             (this.riskWarning!=null &&
              java.util.Arrays.equals(this.riskWarning, other.getRiskWarning()))) &&
            ((this.extendInfo==null && other.getExtendInfo()==null) || 
             (this.extendInfo!=null &&
              java.util.Arrays.equals(this.extendInfo, other.getExtendInfo()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.commissionAgent==null && other.getCommissionAgent()==null) || 
             (this.commissionAgent!=null &&
              this.commissionAgent.equals(other.getCommissionAgent()))) &&
            ((this.coveragePremium==null && other.getCoveragePremium()==null) || 
             (this.coveragePremium!=null &&
              java.util.Arrays.equals(this.coveragePremium, other.getCoveragePremium())));
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
        if (getCarModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarModel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleModel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViolation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViolation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViolation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClaim() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClaim());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClaim(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReinsure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReinsure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReinsure(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastPolicy() != null) {
            _hashCode += getLastPolicy().hashCode();
        }
        if (getRiskWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRiskWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRiskWarning(), i);
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
        if (getCoveragePremium() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoveragePremium());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoveragePremium(), i);
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
        new org.apache.axis.description.TypeDesc(CommercialDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommercialDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarModelDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vehicleModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "VehicleModelDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "violation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PeccDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ClaimDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ProfitDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reinsure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "reinsure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ReinsureDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "LastPolicyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "riskWarning"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coveragePremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "coveragePremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CoveragePremiumDTO"));
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
