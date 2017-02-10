/**
 * CheckDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CheckDTO  implements java.io.Serializable {
    private java.lang.String renewalFlag;

    private java.lang.String checkFlag;

    private java.lang.String querySequenceNo;

    private java.lang.String checkCode;

    private java.lang.String question;

    private java.lang.String answer;

    public CheckDTO() {
    }

    public CheckDTO(
           java.lang.String renewalFlag,
           java.lang.String checkFlag,
           java.lang.String querySequenceNo,
           java.lang.String checkCode,
           java.lang.String question,
           java.lang.String answer) {
           this.renewalFlag = renewalFlag;
           this.checkFlag = checkFlag;
           this.querySequenceNo = querySequenceNo;
           this.checkCode = checkCode;
           this.question = question;
           this.answer = answer;
    }


    /**
     * Gets the renewalFlag value for this CheckDTO.
     * 
     * @return renewalFlag
     */
    public java.lang.String getRenewalFlag() {
        return renewalFlag;
    }


    /**
     * Sets the renewalFlag value for this CheckDTO.
     * 
     * @param renewalFlag
     */
    public void setRenewalFlag(java.lang.String renewalFlag) {
        this.renewalFlag = renewalFlag;
    }


    /**
     * Gets the checkFlag value for this CheckDTO.
     * 
     * @return checkFlag
     */
    public java.lang.String getCheckFlag() {
        return checkFlag;
    }


    /**
     * Sets the checkFlag value for this CheckDTO.
     * 
     * @param checkFlag
     */
    public void setCheckFlag(java.lang.String checkFlag) {
        this.checkFlag = checkFlag;
    }


    /**
     * Gets the querySequenceNo value for this CheckDTO.
     * 
     * @return querySequenceNo
     */
    public java.lang.String getQuerySequenceNo() {
        return querySequenceNo;
    }


    /**
     * Sets the querySequenceNo value for this CheckDTO.
     * 
     * @param querySequenceNo
     */
    public void setQuerySequenceNo(java.lang.String querySequenceNo) {
        this.querySequenceNo = querySequenceNo;
    }


    /**
     * Gets the checkCode value for this CheckDTO.
     * 
     * @return checkCode
     */
    public java.lang.String getCheckCode() {
        return checkCode;
    }


    /**
     * Sets the checkCode value for this CheckDTO.
     * 
     * @param checkCode
     */
    public void setCheckCode(java.lang.String checkCode) {
        this.checkCode = checkCode;
    }


    /**
     * Gets the question value for this CheckDTO.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this CheckDTO.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the answer value for this CheckDTO.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this CheckDTO.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckDTO)) return false;
        CheckDTO other = (CheckDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.renewalFlag==null && other.getRenewalFlag()==null) || 
             (this.renewalFlag!=null &&
              this.renewalFlag.equals(other.getRenewalFlag()))) &&
            ((this.checkFlag==null && other.getCheckFlag()==null) || 
             (this.checkFlag!=null &&
              this.checkFlag.equals(other.getCheckFlag()))) &&
            ((this.querySequenceNo==null && other.getQuerySequenceNo()==null) || 
             (this.querySequenceNo!=null &&
              this.querySequenceNo.equals(other.getQuerySequenceNo()))) &&
            ((this.checkCode==null && other.getCheckCode()==null) || 
             (this.checkCode!=null &&
              this.checkCode.equals(other.getCheckCode()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer())));
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
        if (getRenewalFlag() != null) {
            _hashCode += getRenewalFlag().hashCode();
        }
        if (getCheckFlag() != null) {
            _hashCode += getCheckFlag().hashCode();
        }
        if (getQuerySequenceNo() != null) {
            _hashCode += getQuerySequenceNo().hashCode();
        }
        if (getCheckCode() != null) {
            _hashCode += getCheckCode().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CheckDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "renewalFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "checkFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "querySequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "checkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "answer"));
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
