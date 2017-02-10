/**
 * ProjectChannelDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class ProjectChannelDTO  implements java.io.Serializable {
    private java.lang.String projectSerialNo;

    private java.lang.String projectName;

    private java.lang.String comboCode;

    private java.lang.String comboName;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public ProjectChannelDTO() {
    }

    public ProjectChannelDTO(
           java.lang.String projectSerialNo,
           java.lang.String projectName,
           java.lang.String comboCode,
           java.lang.String comboName,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.projectSerialNo = projectSerialNo;
           this.projectName = projectName;
           this.comboCode = comboCode;
           this.comboName = comboName;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the projectSerialNo value for this ProjectChannelDTO.
     * 
     * @return projectSerialNo
     */
    public java.lang.String getProjectSerialNo() {
        return projectSerialNo;
    }


    /**
     * Sets the projectSerialNo value for this ProjectChannelDTO.
     * 
     * @param projectSerialNo
     */
    public void setProjectSerialNo(java.lang.String projectSerialNo) {
        this.projectSerialNo = projectSerialNo;
    }


    /**
     * Gets the projectName value for this ProjectChannelDTO.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this ProjectChannelDTO.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the comboCode value for this ProjectChannelDTO.
     * 
     * @return comboCode
     */
    public java.lang.String getComboCode() {
        return comboCode;
    }


    /**
     * Sets the comboCode value for this ProjectChannelDTO.
     * 
     * @param comboCode
     */
    public void setComboCode(java.lang.String comboCode) {
        this.comboCode = comboCode;
    }


    /**
     * Gets the comboName value for this ProjectChannelDTO.
     * 
     * @return comboName
     */
    public java.lang.String getComboName() {
        return comboName;
    }


    /**
     * Sets the comboName value for this ProjectChannelDTO.
     * 
     * @param comboName
     */
    public void setComboName(java.lang.String comboName) {
        this.comboName = comboName;
    }


    /**
     * Gets the extendInfo value for this ProjectChannelDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this ProjectChannelDTO.
     * 
     * @param extendInfo
     */
    public void setExtendInfo(com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
        this.extendInfo = extendInfo;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO getExtendInfo(int i) {
        return this.extendInfo[i];
    }

    public void setExtendInfo(int i, com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO _value) {
        this.extendInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectChannelDTO)) return false;
        ProjectChannelDTO other = (ProjectChannelDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectSerialNo==null && other.getProjectSerialNo()==null) || 
             (this.projectSerialNo!=null &&
              this.projectSerialNo.equals(other.getProjectSerialNo()))) &&
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.comboCode==null && other.getComboCode()==null) || 
             (this.comboCode!=null &&
              this.comboCode.equals(other.getComboCode()))) &&
            ((this.comboName==null && other.getComboName()==null) || 
             (this.comboName!=null &&
              this.comboName.equals(other.getComboName()))) &&
            ((this.extendInfo==null && other.getExtendInfo()==null) || 
             (this.extendInfo!=null &&
              java.util.Arrays.equals(this.extendInfo, other.getExtendInfo())));
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
        if (getProjectSerialNo() != null) {
            _hashCode += getProjectSerialNo().hashCode();
        }
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getComboCode() != null) {
            _hashCode += getComboCode().hashCode();
        }
        if (getComboName() != null) {
            _hashCode += getComboName().hashCode();
        }
        if (getExtendInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectChannelDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ProjectChannelDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "projectSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "projectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comboCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "comboCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comboName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "comboName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "extendInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ExtendInfoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
