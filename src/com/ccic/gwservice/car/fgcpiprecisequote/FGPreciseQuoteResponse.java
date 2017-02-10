/**
 * FGPreciseQuoteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class FGPreciseQuoteResponse  implements java.io.Serializable {
    private com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO responseHead;

    private com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteResponseDTO responseBody;

    public FGPreciseQuoteResponse() {
    }

    public FGPreciseQuoteResponse(
           com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO responseHead,
           com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteResponseDTO responseBody) {
           this.responseHead = responseHead;
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseHead value for this FGPreciseQuoteResponse.
     * 
     * @return responseHead
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO getResponseHead() {
        return responseHead;
    }


    /**
     * Sets the responseHead value for this FGPreciseQuoteResponse.
     * 
     * @param responseHead
     */
    public void setResponseHead(com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO responseHead) {
        this.responseHead = responseHead;
    }


    /**
     * Gets the responseBody value for this FGPreciseQuoteResponse.
     * 
     * @return responseBody
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteResponseDTO getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this FGPreciseQuoteResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteResponseDTO responseBody) {
        this.responseBody = responseBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FGPreciseQuoteResponse)) return false;
        FGPreciseQuoteResponse other = (FGPreciseQuoteResponse) obj;
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
        new org.apache.axis.description.TypeDesc(FGPreciseQuoteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", ">FGPreciseQuoteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "responseHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ResponseHeadDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "responseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PreciseQuoteResponseDTO"));
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
