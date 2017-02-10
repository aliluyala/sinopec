/**
 * PeccDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PeccDTO  implements java.io.Serializable {
    private java.lang.String serialNo;

    private java.lang.String peccancyCode;

    private java.lang.String peccancyTime;

    private java.lang.String peccancydate;

    private java.lang.String peccancyPlace;

    private java.lang.String peccancyAction;

    private java.lang.String acceptDate;

    private java.lang.String adjustRate;

    public PeccDTO() {
    }

    public PeccDTO(
           java.lang.String serialNo,
           java.lang.String peccancyCode,
           java.lang.String peccancyTime,
           java.lang.String peccancydate,
           java.lang.String peccancyPlace,
           java.lang.String peccancyAction,
           java.lang.String acceptDate,
           java.lang.String adjustRate) {
           this.serialNo = serialNo;
           this.peccancyCode = peccancyCode;
           this.peccancyTime = peccancyTime;
           this.peccancydate = peccancydate;
           this.peccancyPlace = peccancyPlace;
           this.peccancyAction = peccancyAction;
           this.acceptDate = acceptDate;
           this.adjustRate = adjustRate;
    }


    /**
     * Gets the serialNo value for this PeccDTO.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this PeccDTO.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the peccancyCode value for this PeccDTO.
     * 
     * @return peccancyCode
     */
    public java.lang.String getPeccancyCode() {
        return peccancyCode;
    }


    /**
     * Sets the peccancyCode value for this PeccDTO.
     * 
     * @param peccancyCode
     */
    public void setPeccancyCode(java.lang.String peccancyCode) {
        this.peccancyCode = peccancyCode;
    }


    /**
     * Gets the peccancyTime value for this PeccDTO.
     * 
     * @return peccancyTime
     */
    public java.lang.String getPeccancyTime() {
        return peccancyTime;
    }


    /**
     * Sets the peccancyTime value for this PeccDTO.
     * 
     * @param peccancyTime
     */
    public void setPeccancyTime(java.lang.String peccancyTime) {
        this.peccancyTime = peccancyTime;
    }


    /**
     * Gets the peccancydate value for this PeccDTO.
     * 
     * @return peccancydate
     */
    public java.lang.String getPeccancydate() {
        return peccancydate;
    }


    /**
     * Sets the peccancydate value for this PeccDTO.
     * 
     * @param peccancydate
     */
    public void setPeccancydate(java.lang.String peccancydate) {
        this.peccancydate = peccancydate;
    }


    /**
     * Gets the peccancyPlace value for this PeccDTO.
     * 
     * @return peccancyPlace
     */
    public java.lang.String getPeccancyPlace() {
        return peccancyPlace;
    }


    /**
     * Sets the peccancyPlace value for this PeccDTO.
     * 
     * @param peccancyPlace
     */
    public void setPeccancyPlace(java.lang.String peccancyPlace) {
        this.peccancyPlace = peccancyPlace;
    }


    /**
     * Gets the peccancyAction value for this PeccDTO.
     * 
     * @return peccancyAction
     */
    public java.lang.String getPeccancyAction() {
        return peccancyAction;
    }


    /**
     * Sets the peccancyAction value for this PeccDTO.
     * 
     * @param peccancyAction
     */
    public void setPeccancyAction(java.lang.String peccancyAction) {
        this.peccancyAction = peccancyAction;
    }


    /**
     * Gets the acceptDate value for this PeccDTO.
     * 
     * @return acceptDate
     */
    public java.lang.String getAcceptDate() {
        return acceptDate;
    }


    /**
     * Sets the acceptDate value for this PeccDTO.
     * 
     * @param acceptDate
     */
    public void setAcceptDate(java.lang.String acceptDate) {
        this.acceptDate = acceptDate;
    }


    /**
     * Gets the adjustRate value for this PeccDTO.
     * 
     * @return adjustRate
     */
    public java.lang.String getAdjustRate() {
        return adjustRate;
    }


    /**
     * Sets the adjustRate value for this PeccDTO.
     * 
     * @param adjustRate
     */
    public void setAdjustRate(java.lang.String adjustRate) {
        this.adjustRate = adjustRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeccDTO)) return false;
        PeccDTO other = (PeccDTO) obj;
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
            ((this.peccancyCode==null && other.getPeccancyCode()==null) || 
             (this.peccancyCode!=null &&
              this.peccancyCode.equals(other.getPeccancyCode()))) &&
            ((this.peccancyTime==null && other.getPeccancyTime()==null) || 
             (this.peccancyTime!=null &&
              this.peccancyTime.equals(other.getPeccancyTime()))) &&
            ((this.peccancydate==null && other.getPeccancydate()==null) || 
             (this.peccancydate!=null &&
              this.peccancydate.equals(other.getPeccancydate()))) &&
            ((this.peccancyPlace==null && other.getPeccancyPlace()==null) || 
             (this.peccancyPlace!=null &&
              this.peccancyPlace.equals(other.getPeccancyPlace()))) &&
            ((this.peccancyAction==null && other.getPeccancyAction()==null) || 
             (this.peccancyAction!=null &&
              this.peccancyAction.equals(other.getPeccancyAction()))) &&
            ((this.acceptDate==null && other.getAcceptDate()==null) || 
             (this.acceptDate!=null &&
              this.acceptDate.equals(other.getAcceptDate()))) &&
            ((this.adjustRate==null && other.getAdjustRate()==null) || 
             (this.adjustRate!=null &&
              this.adjustRate.equals(other.getAdjustRate())));
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
        if (getPeccancyCode() != null) {
            _hashCode += getPeccancyCode().hashCode();
        }
        if (getPeccancyTime() != null) {
            _hashCode += getPeccancyTime().hashCode();
        }
        if (getPeccancydate() != null) {
            _hashCode += getPeccancydate().hashCode();
        }
        if (getPeccancyPlace() != null) {
            _hashCode += getPeccancyPlace().hashCode();
        }
        if (getPeccancyAction() != null) {
            _hashCode += getPeccancyAction().hashCode();
        }
        if (getAcceptDate() != null) {
            _hashCode += getAcceptDate().hashCode();
        }
        if (getAdjustRate() != null) {
            _hashCode += getAdjustRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeccDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PeccDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancydate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancydate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peccancyAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "peccancyAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "acceptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "adjustRate"));
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
