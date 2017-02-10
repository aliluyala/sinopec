/**
 * ResponseHeadDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ResponseHeadDTO  implements java.io.Serializable {
    private java.lang.String messageId;

    private java.lang.String channelCode;

    private java.lang.String channelComCode;

    private java.lang.String channelProductCode;

    private java.lang.String trxCode;

    private java.lang.String channelSeqNo;

    private int status;

    private java.lang.String returnCode;

    private java.lang.String returnMessage;

    public ResponseHeadDTO() {
    }

    public ResponseHeadDTO(
           java.lang.String messageId,
           java.lang.String channelCode,
           java.lang.String channelComCode,
           java.lang.String channelProductCode,
           java.lang.String trxCode,
           java.lang.String channelSeqNo,
           int status,
           java.lang.String returnCode,
           java.lang.String returnMessage) {
           this.messageId = messageId;
           this.channelCode = channelCode;
           this.channelComCode = channelComCode;
           this.channelProductCode = channelProductCode;
           this.trxCode = trxCode;
           this.channelSeqNo = channelSeqNo;
           this.status = status;
           this.returnCode = returnCode;
           this.returnMessage = returnMessage;
    }


    /**
     * Gets the messageId value for this ResponseHeadDTO.
     * 
     * @return messageId
     */
    public java.lang.String getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this ResponseHeadDTO.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.String messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the channelCode value for this ResponseHeadDTO.
     * 
     * @return channelCode
     */
    public java.lang.String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this ResponseHeadDTO.
     * 
     * @param channelCode
     */
    public void setChannelCode(java.lang.String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the channelComCode value for this ResponseHeadDTO.
     * 
     * @return channelComCode
     */
    public java.lang.String getChannelComCode() {
        return channelComCode;
    }


    /**
     * Sets the channelComCode value for this ResponseHeadDTO.
     * 
     * @param channelComCode
     */
    public void setChannelComCode(java.lang.String channelComCode) {
        this.channelComCode = channelComCode;
    }


    /**
     * Gets the channelProductCode value for this ResponseHeadDTO.
     * 
     * @return channelProductCode
     */
    public java.lang.String getChannelProductCode() {
        return channelProductCode;
    }


    /**
     * Sets the channelProductCode value for this ResponseHeadDTO.
     * 
     * @param channelProductCode
     */
    public void setChannelProductCode(java.lang.String channelProductCode) {
        this.channelProductCode = channelProductCode;
    }


    /**
     * Gets the trxCode value for this ResponseHeadDTO.
     * 
     * @return trxCode
     */
    public java.lang.String getTrxCode() {
        return trxCode;
    }


    /**
     * Sets the trxCode value for this ResponseHeadDTO.
     * 
     * @param trxCode
     */
    public void setTrxCode(java.lang.String trxCode) {
        this.trxCode = trxCode;
    }


    /**
     * Gets the channelSeqNo value for this ResponseHeadDTO.
     * 
     * @return channelSeqNo
     */
    public java.lang.String getChannelSeqNo() {
        return channelSeqNo;
    }


    /**
     * Sets the channelSeqNo value for this ResponseHeadDTO.
     * 
     * @param channelSeqNo
     */
    public void setChannelSeqNo(java.lang.String channelSeqNo) {
        this.channelSeqNo = channelSeqNo;
    }


    /**
     * Gets the status value for this ResponseHeadDTO.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResponseHeadDTO.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the returnCode value for this ResponseHeadDTO.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ResponseHeadDTO.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnMessage value for this ResponseHeadDTO.
     * 
     * @return returnMessage
     */
    public java.lang.String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the returnMessage value for this ResponseHeadDTO.
     * 
     * @param returnMessage
     */
    public void setReturnMessage(java.lang.String returnMessage) {
        this.returnMessage = returnMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseHeadDTO)) return false;
        ResponseHeadDTO other = (ResponseHeadDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.channelComCode==null && other.getChannelComCode()==null) || 
             (this.channelComCode!=null &&
              this.channelComCode.equals(other.getChannelComCode()))) &&
            ((this.channelProductCode==null && other.getChannelProductCode()==null) || 
             (this.channelProductCode!=null &&
              this.channelProductCode.equals(other.getChannelProductCode()))) &&
            ((this.trxCode==null && other.getTrxCode()==null) || 
             (this.trxCode!=null &&
              this.trxCode.equals(other.getTrxCode()))) &&
            ((this.channelSeqNo==null && other.getChannelSeqNo()==null) || 
             (this.channelSeqNo!=null &&
              this.channelSeqNo.equals(other.getChannelSeqNo()))) &&
            this.status == other.getStatus() &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.returnMessage==null && other.getReturnMessage()==null) || 
             (this.returnMessage!=null &&
              this.returnMessage.equals(other.getReturnMessage())));
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
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getChannelComCode() != null) {
            _hashCode += getChannelComCode().hashCode();
        }
        if (getChannelProductCode() != null) {
            _hashCode += getChannelProductCode().hashCode();
        }
        if (getTrxCode() != null) {
            _hashCode += getTrxCode().hashCode();
        }
        if (getChannelSeqNo() != null) {
            _hashCode += getChannelSeqNo().hashCode();
        }
        _hashCode += getStatus();
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getReturnMessage() != null) {
            _hashCode += getReturnMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeadDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ResponseHeadDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "channelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelComCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "channelComCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "channelProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "trxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelSeqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "channelSeqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "returnMessage"));
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
