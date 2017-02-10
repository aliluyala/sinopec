/**
 * DeviceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class DeviceDTO  implements java.io.Serializable {
    private java.lang.Integer serialno;

    private java.lang.String deviceName;

    private java.lang.Integer deviceCount;

    private java.lang.Double devicePurchasePrice;

    private java.lang.String buydate;

    private java.lang.Double deviceActualValue;

    public DeviceDTO() {
    }

    public DeviceDTO(
           java.lang.Integer serialno,
           java.lang.String deviceName,
           java.lang.Integer deviceCount,
           java.lang.Double devicePurchasePrice,
           java.lang.String buydate,
           java.lang.Double deviceActualValue) {
           this.serialno = serialno;
           this.deviceName = deviceName;
           this.deviceCount = deviceCount;
           this.devicePurchasePrice = devicePurchasePrice;
           this.buydate = buydate;
           this.deviceActualValue = deviceActualValue;
    }


    /**
     * Gets the serialno value for this DeviceDTO.
     * 
     * @return serialno
     */
    public java.lang.Integer getSerialno() {
        return serialno;
    }


    /**
     * Sets the serialno value for this DeviceDTO.
     * 
     * @param serialno
     */
    public void setSerialno(java.lang.Integer serialno) {
        this.serialno = serialno;
    }


    /**
     * Gets the deviceName value for this DeviceDTO.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceDTO.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceCount value for this DeviceDTO.
     * 
     * @return deviceCount
     */
    public java.lang.Integer getDeviceCount() {
        return deviceCount;
    }


    /**
     * Sets the deviceCount value for this DeviceDTO.
     * 
     * @param deviceCount
     */
    public void setDeviceCount(java.lang.Integer deviceCount) {
        this.deviceCount = deviceCount;
    }


    /**
     * Gets the devicePurchasePrice value for this DeviceDTO.
     * 
     * @return devicePurchasePrice
     */
    public java.lang.Double getDevicePurchasePrice() {
        return devicePurchasePrice;
    }


    /**
     * Sets the devicePurchasePrice value for this DeviceDTO.
     * 
     * @param devicePurchasePrice
     */
    public void setDevicePurchasePrice(java.lang.Double devicePurchasePrice) {
        this.devicePurchasePrice = devicePurchasePrice;
    }


    /**
     * Gets the buydate value for this DeviceDTO.
     * 
     * @return buydate
     */
    public java.lang.String getBuydate() {
        return buydate;
    }


    /**
     * Sets the buydate value for this DeviceDTO.
     * 
     * @param buydate
     */
    public void setBuydate(java.lang.String buydate) {
        this.buydate = buydate;
    }


    /**
     * Gets the deviceActualValue value for this DeviceDTO.
     * 
     * @return deviceActualValue
     */
    public java.lang.Double getDeviceActualValue() {
        return deviceActualValue;
    }


    /**
     * Sets the deviceActualValue value for this DeviceDTO.
     * 
     * @param deviceActualValue
     */
    public void setDeviceActualValue(java.lang.Double deviceActualValue) {
        this.deviceActualValue = deviceActualValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceDTO)) return false;
        DeviceDTO other = (DeviceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialno==null && other.getSerialno()==null) || 
             (this.serialno!=null &&
              this.serialno.equals(other.getSerialno()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceCount==null && other.getDeviceCount()==null) || 
             (this.deviceCount!=null &&
              this.deviceCount.equals(other.getDeviceCount()))) &&
            ((this.devicePurchasePrice==null && other.getDevicePurchasePrice()==null) || 
             (this.devicePurchasePrice!=null &&
              this.devicePurchasePrice.equals(other.getDevicePurchasePrice()))) &&
            ((this.buydate==null && other.getBuydate()==null) || 
             (this.buydate!=null &&
              this.buydate.equals(other.getBuydate()))) &&
            ((this.deviceActualValue==null && other.getDeviceActualValue()==null) || 
             (this.deviceActualValue!=null &&
              this.deviceActualValue.equals(other.getDeviceActualValue())));
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
        if (getSerialno() != null) {
            _hashCode += getSerialno().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceCount() != null) {
            _hashCode += getDeviceCount().hashCode();
        }
        if (getDevicePurchasePrice() != null) {
            _hashCode += getDevicePurchasePrice().hashCode();
        }
        if (getBuydate() != null) {
            _hashCode += getBuydate().hashCode();
        }
        if (getDeviceActualValue() != null) {
            _hashCode += getDeviceActualValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "DeviceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "serialno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deviceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "devicePurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buydate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "buydate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceActualValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "deviceActualValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
