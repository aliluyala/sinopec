/**
 * FGCarModelInfoInquiryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class FGCarModelInfoInquiryRequest  implements java.io.Serializable {
    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO requestHead;

    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO requestBody;

    public FGCarModelInfoInquiryRequest() {
    }

    public FGCarModelInfoInquiryRequest(
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO requestHead,
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO requestBody) {
           this.requestHead = requestHead;
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestHead value for this FGCarModelInfoInquiryRequest.
     * 
     * @return requestHead
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO getRequestHead() {
        return requestHead;
    }


    /**
     * Sets the requestHead value for this FGCarModelInfoInquiryRequest.
     * 
     * @param requestHead
     */
    public void setRequestHead(com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO requestHead) {
        this.requestHead = requestHead;
    }


    /**
     * Gets the requestBody value for this FGCarModelInfoInquiryRequest.
     * 
     * @return requestBody
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this FGCarModelInfoInquiryRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO requestBody) {
        this.requestBody = requestBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FGCarModelInfoInquiryRequest)) return false;
        FGCarModelInfoInquiryRequest other = (FGCarModelInfoInquiryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHead==null && other.getRequestHead()==null) || 
             (this.requestHead!=null &&
              this.requestHead.equals(other.getRequestHead()))) &&
            ((this.requestBody==null && other.getRequestBody()==null) || 
             (this.requestBody!=null &&
              this.requestBody.equals(other.getRequestBody())));
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
        if (getRequestHead() != null) {
            _hashCode += getRequestHead().hashCode();
        }
        if (getRequestBody() != null) {
            _hashCode += getRequestBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FGCarModelInfoInquiryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "requestHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "RequestHeadDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "requestBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryRequestDTO"));
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
