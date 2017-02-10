/**
 * CommissionDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CommissionDTO  implements java.io.Serializable {
    private java.lang.Double commissionRateUpper;

    private java.lang.Double companyCommissionRateUpper;

    private java.lang.String claimEffectReason;

    private java.lang.String newVehicleEffectReason;

    private java.lang.String producerEffectReason;

    public CommissionDTO() {
    }

    public CommissionDTO(
           java.lang.Double commissionRateUpper,
           java.lang.Double companyCommissionRateUpper,
           java.lang.String claimEffectReason,
           java.lang.String newVehicleEffectReason,
           java.lang.String producerEffectReason) {
           this.commissionRateUpper = commissionRateUpper;
           this.companyCommissionRateUpper = companyCommissionRateUpper;
           this.claimEffectReason = claimEffectReason;
           this.newVehicleEffectReason = newVehicleEffectReason;
           this.producerEffectReason = producerEffectReason;
    }


    /**
     * Gets the commissionRateUpper value for this CommissionDTO.
     * 
     * @return commissionRateUpper
     */
    public java.lang.Double getCommissionRateUpper() {
        return commissionRateUpper;
    }


    /**
     * Sets the commissionRateUpper value for this CommissionDTO.
     * 
     * @param commissionRateUpper
     */
    public void setCommissionRateUpper(java.lang.Double commissionRateUpper) {
        this.commissionRateUpper = commissionRateUpper;
    }


    /**
     * Gets the companyCommissionRateUpper value for this CommissionDTO.
     * 
     * @return companyCommissionRateUpper
     */
    public java.lang.Double getCompanyCommissionRateUpper() {
        return companyCommissionRateUpper;
    }


    /**
     * Sets the companyCommissionRateUpper value for this CommissionDTO.
     * 
     * @param companyCommissionRateUpper
     */
    public void setCompanyCommissionRateUpper(java.lang.Double companyCommissionRateUpper) {
        this.companyCommissionRateUpper = companyCommissionRateUpper;
    }


    /**
     * Gets the claimEffectReason value for this CommissionDTO.
     * 
     * @return claimEffectReason
     */
    public java.lang.String getClaimEffectReason() {
        return claimEffectReason;
    }


    /**
     * Sets the claimEffectReason value for this CommissionDTO.
     * 
     * @param claimEffectReason
     */
    public void setClaimEffectReason(java.lang.String claimEffectReason) {
        this.claimEffectReason = claimEffectReason;
    }


    /**
     * Gets the newVehicleEffectReason value for this CommissionDTO.
     * 
     * @return newVehicleEffectReason
     */
    public java.lang.String getNewVehicleEffectReason() {
        return newVehicleEffectReason;
    }


    /**
     * Sets the newVehicleEffectReason value for this CommissionDTO.
     * 
     * @param newVehicleEffectReason
     */
    public void setNewVehicleEffectReason(java.lang.String newVehicleEffectReason) {
        this.newVehicleEffectReason = newVehicleEffectReason;
    }


    /**
     * Gets the producerEffectReason value for this CommissionDTO.
     * 
     * @return producerEffectReason
     */
    public java.lang.String getProducerEffectReason() {
        return producerEffectReason;
    }


    /**
     * Sets the producerEffectReason value for this CommissionDTO.
     * 
     * @param producerEffectReason
     */
    public void setProducerEffectReason(java.lang.String producerEffectReason) {
        this.producerEffectReason = producerEffectReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommissionDTO)) return false;
        CommissionDTO other = (CommissionDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commissionRateUpper==null && other.getCommissionRateUpper()==null) || 
             (this.commissionRateUpper!=null &&
              this.commissionRateUpper.equals(other.getCommissionRateUpper()))) &&
            ((this.companyCommissionRateUpper==null && other.getCompanyCommissionRateUpper()==null) || 
             (this.companyCommissionRateUpper!=null &&
              this.companyCommissionRateUpper.equals(other.getCompanyCommissionRateUpper()))) &&
            ((this.claimEffectReason==null && other.getClaimEffectReason()==null) || 
             (this.claimEffectReason!=null &&
              this.claimEffectReason.equals(other.getClaimEffectReason()))) &&
            ((this.newVehicleEffectReason==null && other.getNewVehicleEffectReason()==null) || 
             (this.newVehicleEffectReason!=null &&
              this.newVehicleEffectReason.equals(other.getNewVehicleEffectReason()))) &&
            ((this.producerEffectReason==null && other.getProducerEffectReason()==null) || 
             (this.producerEffectReason!=null &&
              this.producerEffectReason.equals(other.getProducerEffectReason())));
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
        if (getCommissionRateUpper() != null) {
            _hashCode += getCommissionRateUpper().hashCode();
        }
        if (getCompanyCommissionRateUpper() != null) {
            _hashCode += getCompanyCommissionRateUpper().hashCode();
        }
        if (getClaimEffectReason() != null) {
            _hashCode += getClaimEffectReason().hashCode();
        }
        if (getNewVehicleEffectReason() != null) {
            _hashCode += getNewVehicleEffectReason().hashCode();
        }
        if (getProducerEffectReason() != null) {
            _hashCode += getProducerEffectReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommissionDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommissionDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionRateUpper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "commissionRateUpper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCommissionRateUpper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "companyCommissionRateUpper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimEffectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "claimEffectReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newVehicleEffectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "newVehicleEffectReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerEffectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "producerEffectReason"));
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
