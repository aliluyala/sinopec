/**
 * RequestHeadDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class RequestHeadDTO  implements java.io.Serializable {
    private java.lang.String channelCode;

    private java.lang.String channelName;

    private java.lang.String channelComCode;

    private java.lang.String channelComName;

    private java.lang.String channelProductCode;

    private java.lang.String operator;

    private java.lang.String trxCode;

    private java.lang.String channelSeqNo;

    private java.util.Date trxDate;

    private java.lang.String regionCode;

    private java.lang.String makeChannel;

    private java.lang.String passWord;

    public RequestHeadDTO() {
    }

    public RequestHeadDTO(
           java.lang.String channelCode,
           java.lang.String channelName,
           java.lang.String channelComCode,
           java.lang.String channelComName,
           java.lang.String channelProductCode,
           java.lang.String operator,
           java.lang.String trxCode,
           java.lang.String channelSeqNo,
           java.util.Date trxDate,
           java.lang.String regionCode,
           java.lang.String makeChannel,
           java.lang.String passWord) {
           this.channelCode = channelCode;
           this.channelName = channelName;
           this.channelComCode = channelComCode;
           this.channelComName = channelComName;
           this.channelProductCode = channelProductCode;
           this.operator = operator;
           this.trxCode = trxCode;
           this.channelSeqNo = channelSeqNo;
           this.trxDate = trxDate;
           this.regionCode = regionCode;
           this.makeChannel = makeChannel;
           this.passWord = passWord;
    }


    /**
     * Gets the channelCode value for this RequestHeadDTO.
     * 
     * @return channelCode
     */
    public java.lang.String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this RequestHeadDTO.
     * 
     * @param channelCode
     */
    public void setChannelCode(java.lang.String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the channelName value for this RequestHeadDTO.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this RequestHeadDTO.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the channelComCode value for this RequestHeadDTO.
     * 
     * @return channelComCode
     */
    public java.lang.String getChannelComCode() {
        return channelComCode;
    }


    /**
     * Sets the channelComCode value for this RequestHeadDTO.
     * 
     * @param channelComCode
     */
    public void setChannelComCode(java.lang.String channelComCode) {
        this.channelComCode = channelComCode;
    }


    /**
     * Gets the channelComName value for this RequestHeadDTO.
     * 
     * @return channelComName
     */
    public java.lang.String getChannelComName() {
        return channelComName;
    }


    /**
     * Sets the channelComName value for this RequestHeadDTO.
     * 
     * @param channelComName
     */
    public void setChannelComName(java.lang.String channelComName) {
        this.channelComName = channelComName;
    }


    /**
     * Gets the channelProductCode value for this RequestHeadDTO.
     * 
     * @return channelProductCode
     */
    public java.lang.String getChannelProductCode() {
        return channelProductCode;
    }


    /**
     * Sets the channelProductCode value for this RequestHeadDTO.
     * 
     * @param channelProductCode
     */
    public void setChannelProductCode(java.lang.String channelProductCode) {
        this.channelProductCode = channelProductCode;
    }


    /**
     * Gets the operator value for this RequestHeadDTO.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this RequestHeadDTO.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the trxCode value for this RequestHeadDTO.
     * 
     * @return trxCode
     */
    public java.lang.String getTrxCode() {
        return trxCode;
    }


    /**
     * Sets the trxCode value for this RequestHeadDTO.
     * 
     * @param trxCode
     */
    public void setTrxCode(java.lang.String trxCode) {
        this.trxCode = trxCode;
    }


    /**
     * Gets the channelSeqNo value for this RequestHeadDTO.
     * 
     * @return channelSeqNo
     */
    public java.lang.String getChannelSeqNo() {
        return channelSeqNo;
    }


    /**
     * Sets the channelSeqNo value for this RequestHeadDTO.
     * 
     * @param channelSeqNo
     */
    public void setChannelSeqNo(java.lang.String channelSeqNo) {
        this.channelSeqNo = channelSeqNo;
    }


    /**
     * Gets the trxDate value for this RequestHeadDTO.
     * 
     * @return trxDate
     */
    public java.util.Date getTrxDate() {
        return trxDate;
    }


    /**
     * Sets the trxDate value for this RequestHeadDTO.
     * 
     * @param trxDate
     */
    public void setTrxDate(java.util.Date trxDate) {
        this.trxDate = trxDate;
    }


    /**
     * Gets the regionCode value for this RequestHeadDTO.
     * 
     * @return regionCode
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this RequestHeadDTO.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the makeChannel value for this RequestHeadDTO.
     * 
     * @return makeChannel
     */
    public java.lang.String getMakeChannel() {
        return makeChannel;
    }


    /**
     * Sets the makeChannel value for this RequestHeadDTO.
     * 
     * @param makeChannel
     */
    public void setMakeChannel(java.lang.String makeChannel) {
        this.makeChannel = makeChannel;
    }


    /**
     * Gets the passWord value for this RequestHeadDTO.
     * 
     * @return passWord
     */
    public java.lang.String getPassWord() {
        return passWord;
    }


    /**
     * Sets the passWord value for this RequestHeadDTO.
     * 
     * @param passWord
     */
    public void setPassWord(java.lang.String passWord) {
        this.passWord = passWord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeadDTO)) return false;
        RequestHeadDTO other = (RequestHeadDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.channelComCode==null && other.getChannelComCode()==null) || 
             (this.channelComCode!=null &&
              this.channelComCode.equals(other.getChannelComCode()))) &&
            ((this.channelComName==null && other.getChannelComName()==null) || 
             (this.channelComName!=null &&
              this.channelComName.equals(other.getChannelComName()))) &&
            ((this.channelProductCode==null && other.getChannelProductCode()==null) || 
             (this.channelProductCode!=null &&
              this.channelProductCode.equals(other.getChannelProductCode()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.trxCode==null && other.getTrxCode()==null) || 
             (this.trxCode!=null &&
              this.trxCode.equals(other.getTrxCode()))) &&
            ((this.channelSeqNo==null && other.getChannelSeqNo()==null) || 
             (this.channelSeqNo!=null &&
              this.channelSeqNo.equals(other.getChannelSeqNo()))) &&
            ((this.trxDate==null && other.getTrxDate()==null) || 
             (this.trxDate!=null &&
              this.trxDate.equals(other.getTrxDate()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.makeChannel==null && other.getMakeChannel()==null) || 
             (this.makeChannel!=null &&
              this.makeChannel.equals(other.getMakeChannel()))) &&
            ((this.passWord==null && other.getPassWord()==null) || 
             (this.passWord!=null &&
              this.passWord.equals(other.getPassWord())));
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
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getChannelComCode() != null) {
            _hashCode += getChannelComCode().hashCode();
        }
        if (getChannelComName() != null) {
            _hashCode += getChannelComName().hashCode();
        }
        if (getChannelProductCode() != null) {
            _hashCode += getChannelProductCode().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getTrxCode() != null) {
            _hashCode += getTrxCode().hashCode();
        }
        if (getChannelSeqNo() != null) {
            _hashCode += getChannelSeqNo().hashCode();
        }
        if (getTrxDate() != null) {
            _hashCode += getTrxDate().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getMakeChannel() != null) {
            _hashCode += getMakeChannel().hashCode();
        }
        if (getPassWord() != null) {
            _hashCode += getPassWord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeadDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "RequestHeadDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelComCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelComCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelComName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelComName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "trxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelSeqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "channelSeqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "trxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "makeChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "passWord"));
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
