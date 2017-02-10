/**
 * OtherDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class OtherDTO  implements java.io.Serializable {
    private java.lang.String agentCode;

    private java.lang.String agreementNum;

    private java.lang.String argueSolution;

    private java.lang.String arbitBoardname;

    public OtherDTO() {
    }

    public OtherDTO(
           java.lang.String agentCode,
           java.lang.String agreementNum,
           java.lang.String argueSolution,
           java.lang.String arbitBoardname) {
           this.agentCode = agentCode;
           this.agreementNum = agreementNum;
           this.argueSolution = argueSolution;
           this.arbitBoardname = arbitBoardname;
    }


    /**
     * Gets the agentCode value for this OtherDTO.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this OtherDTO.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the agreementNum value for this OtherDTO.
     * 
     * @return agreementNum
     */
    public java.lang.String getAgreementNum() {
        return agreementNum;
    }


    /**
     * Sets the agreementNum value for this OtherDTO.
     * 
     * @param agreementNum
     */
    public void setAgreementNum(java.lang.String agreementNum) {
        this.agreementNum = agreementNum;
    }


    /**
     * Gets the argueSolution value for this OtherDTO.
     * 
     * @return argueSolution
     */
    public java.lang.String getArgueSolution() {
        return argueSolution;
    }


    /**
     * Sets the argueSolution value for this OtherDTO.
     * 
     * @param argueSolution
     */
    public void setArgueSolution(java.lang.String argueSolution) {
        this.argueSolution = argueSolution;
    }


    /**
     * Gets the arbitBoardname value for this OtherDTO.
     * 
     * @return arbitBoardname
     */
    public java.lang.String getArbitBoardname() {
        return arbitBoardname;
    }


    /**
     * Sets the arbitBoardname value for this OtherDTO.
     * 
     * @param arbitBoardname
     */
    public void setArbitBoardname(java.lang.String arbitBoardname) {
        this.arbitBoardname = arbitBoardname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherDTO)) return false;
        OtherDTO other = (OtherDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.agreementNum==null && other.getAgreementNum()==null) || 
             (this.agreementNum!=null &&
              this.agreementNum.equals(other.getAgreementNum()))) &&
            ((this.argueSolution==null && other.getArgueSolution()==null) || 
             (this.argueSolution!=null &&
              this.argueSolution.equals(other.getArgueSolution()))) &&
            ((this.arbitBoardname==null && other.getArbitBoardname()==null) || 
             (this.arbitBoardname!=null &&
              this.arbitBoardname.equals(other.getArbitBoardname())));
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
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getAgreementNum() != null) {
            _hashCode += getAgreementNum().hashCode();
        }
        if (getArgueSolution() != null) {
            _hashCode += getArgueSolution().hashCode();
        }
        if (getArbitBoardname() != null) {
            _hashCode += getArbitBoardname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "OtherDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agreementNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argueSolution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "argueSolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arbitBoardname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "arbitBoardname"));
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
