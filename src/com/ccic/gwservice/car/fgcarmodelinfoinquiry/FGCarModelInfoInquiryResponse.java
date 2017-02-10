/**
 * FGCarModelInfoInquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class FGCarModelInfoInquiryResponse  implements java.io.Serializable {
    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO responseHead;

    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO responseBody;

    public FGCarModelInfoInquiryResponse() {
    }

    public FGCarModelInfoInquiryResponse(
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO responseHead,
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO responseBody) {
           this.responseHead = responseHead;
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseHead value for this FGCarModelInfoInquiryResponse.
     * 
     * @return responseHead
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO getResponseHead() {
        return responseHead;
    }


    /**
     * Sets the responseHead value for this FGCarModelInfoInquiryResponse.
     * 
     * @param responseHead
     */
    public void setResponseHead(com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO responseHead) {
        this.responseHead = responseHead;
    }


    /**
     * Gets the responseBody value for this FGCarModelInfoInquiryResponse.
     * 
     * @return responseBody
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this FGCarModelInfoInquiryResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO responseBody) {
        this.responseBody = responseBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FGCarModelInfoInquiryResponse)) return false;
        FGCarModelInfoInquiryResponse other = (FGCarModelInfoInquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHead==null && other.getResponseHead()==null) || 
             (this.responseHead!=null &&
              this.responseHead.equals(other.getResponseHead()))) &&
            ((this.responseBody==null && other.getResponseBody()==null) || 
             (this.responseBody!=null &&
              this.responseBody.equals(other.getResponseBody())));
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
        if (getResponseHead() != null) {
            _hashCode += getResponseHead().hashCode();
        }
        if (getResponseBody() != null) {
            _hashCode += getResponseBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FGCarModelInfoInquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "responseHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ResponseHeadDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "responseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryResponseDTO"));
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
