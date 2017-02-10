/**
 * PreciseQuoteRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PreciseQuoteRequestDTO  implements java.io.Serializable {
    private java.lang.String quotationType;

    private java.lang.String operateDate;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String lastYearEndDate;

    private java.lang.String limitType;

    private java.lang.String isRenewed;

    private java.lang.String renewPolicyNo;

    private java.lang.String contractNo;

    private java.lang.Double expectDiscount;

    private java.lang.Boolean isAboutAgri;

    private java.lang.String queryAreaCode;

    private com.ccic.gwservice.car.fgcpiprecisequote.CarDTO cars;

    private com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO[] devices;

    private com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax;

    private com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO[] privy;

    private com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] kinds;

    private com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] checks;

    private com.ccic.gwservice.car.fgcpiprecisequote.VehicleJingyouDTO vehicleJingyou;

    private com.ccic.gwservice.car.fgcpiprecisequote.OtherDTO other;

    private com.ccic.gwservice.car.fgcpiprecisequote.ProjectChannelDTO projectChannel;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    private com.ccic.gwservice.car.fgcpiprecisequote.AgentDTO agent;

    public PreciseQuoteRequestDTO() {
    }

    public PreciseQuoteRequestDTO(
           java.lang.String quotationType,
           java.lang.String operateDate,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String lastYearEndDate,
           java.lang.String limitType,
           java.lang.String isRenewed,
           java.lang.String renewPolicyNo,
           java.lang.String contractNo,
           java.lang.Double expectDiscount,
           java.lang.Boolean isAboutAgri,
           java.lang.String queryAreaCode,
           com.ccic.gwservice.car.fgcpiprecisequote.CarDTO cars,
           com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO[] devices,
           com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax,
           com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO[] privy,
           com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] kinds,
           com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] checks,
           com.ccic.gwservice.car.fgcpiprecisequote.VehicleJingyouDTO vehicleJingyou,
           com.ccic.gwservice.car.fgcpiprecisequote.OtherDTO other,
           com.ccic.gwservice.car.fgcpiprecisequote.ProjectChannelDTO projectChannel,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo,
           com.ccic.gwservice.car.fgcpiprecisequote.AgentDTO agent) {
           this.quotationType = quotationType;
           this.operateDate = operateDate;
           this.startDate = startDate;
           this.endDate = endDate;
           this.lastYearEndDate = lastYearEndDate;
           this.limitType = limitType;
           this.isRenewed = isRenewed;
           this.renewPolicyNo = renewPolicyNo;
           this.contractNo = contractNo;
           this.expectDiscount = expectDiscount;
           this.isAboutAgri = isAboutAgri;
           this.queryAreaCode = queryAreaCode;
           this.cars = cars;
           this.devices = devices;
           this.carTax = carTax;
           this.privy = privy;
           this.kinds = kinds;
           this.checks = checks;
           this.vehicleJingyou = vehicleJingyou;
           this.other = other;
           this.projectChannel = projectChannel;
           this.extendInfo = extendInfo;
           this.agent = agent;
    }


    /**
     * Gets the quotationType value for this PreciseQuoteRequestDTO.
     * 
     * @return quotationType
     */
    public java.lang.String getQuotationType() {
        return quotationType;
    }


    /**
     * Sets the quotationType value for this PreciseQuoteRequestDTO.
     * 
     * @param quotationType
     */
    public void setQuotationType(java.lang.String quotationType) {
        this.quotationType = quotationType;
    }


    /**
     * Gets the operateDate value for this PreciseQuoteRequestDTO.
     * 
     * @return operateDate
     */
    public java.lang.String getOperateDate() {
        return operateDate;
    }


    /**
     * Sets the operateDate value for this PreciseQuoteRequestDTO.
     * 
     * @param operateDate
     */
    public void setOperateDate(java.lang.String operateDate) {
        this.operateDate = operateDate;
    }


    /**
     * Gets the startDate value for this PreciseQuoteRequestDTO.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PreciseQuoteRequestDTO.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PreciseQuoteRequestDTO.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PreciseQuoteRequestDTO.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the lastYearEndDate value for this PreciseQuoteRequestDTO.
     * 
     * @return lastYearEndDate
     */
    public java.lang.String getLastYearEndDate() {
        return lastYearEndDate;
    }


    /**
     * Sets the lastYearEndDate value for this PreciseQuoteRequestDTO.
     * 
     * @param lastYearEndDate
     */
    public void setLastYearEndDate(java.lang.String lastYearEndDate) {
        this.lastYearEndDate = lastYearEndDate;
    }


    /**
     * Gets the limitType value for this PreciseQuoteRequestDTO.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this PreciseQuoteRequestDTO.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the isRenewed value for this PreciseQuoteRequestDTO.
     * 
     * @return isRenewed
     */
    public java.lang.String getIsRenewed() {
        return isRenewed;
    }


    /**
     * Sets the isRenewed value for this PreciseQuoteRequestDTO.
     * 
     * @param isRenewed
     */
    public void setIsRenewed(java.lang.String isRenewed) {
        this.isRenewed = isRenewed;
    }


    /**
     * Gets the renewPolicyNo value for this PreciseQuoteRequestDTO.
     * 
     * @return renewPolicyNo
     */
    public java.lang.String getRenewPolicyNo() {
        return renewPolicyNo;
    }


    /**
     * Sets the renewPolicyNo value for this PreciseQuoteRequestDTO.
     * 
     * @param renewPolicyNo
     */
    public void setRenewPolicyNo(java.lang.String renewPolicyNo) {
        this.renewPolicyNo = renewPolicyNo;
    }


    /**
     * Gets the contractNo value for this PreciseQuoteRequestDTO.
     * 
     * @return contractNo
     */
    public java.lang.String getContractNo() {
        return contractNo;
    }


    /**
     * Sets the contractNo value for this PreciseQuoteRequestDTO.
     * 
     * @param contractNo
     */
    public void setContractNo(java.lang.String contractNo) {
        this.contractNo = contractNo;
    }


    /**
     * Gets the expectDiscount value for this PreciseQuoteRequestDTO.
     * 
     * @return expectDiscount
     */
    public java.lang.Double getExpectDiscount() {
        return expectDiscount;
    }


    /**
     * Sets the expectDiscount value for this PreciseQuoteRequestDTO.
     * 
     * @param expectDiscount
     */
    public void setExpectDiscount(java.lang.Double expectDiscount) {
        this.expectDiscount = expectDiscount;
    }


    /**
     * Gets the isAboutAgri value for this PreciseQuoteRequestDTO.
     * 
     * @return isAboutAgri
     */
    public java.lang.Boolean getIsAboutAgri() {
        return isAboutAgri;
    }


    /**
     * Sets the isAboutAgri value for this PreciseQuoteRequestDTO.
     * 
     * @param isAboutAgri
     */
    public void setIsAboutAgri(java.lang.Boolean isAboutAgri) {
        this.isAboutAgri = isAboutAgri;
    }


    /**
     * Gets the queryAreaCode value for this PreciseQuoteRequestDTO.
     * 
     * @return queryAreaCode
     */
    public java.lang.String getQueryAreaCode() {
        return queryAreaCode;
    }


    /**
     * Sets the queryAreaCode value for this PreciseQuoteRequestDTO.
     * 
     * @param queryAreaCode
     */
    public void setQueryAreaCode(java.lang.String queryAreaCode) {
        this.queryAreaCode = queryAreaCode;
    }


    /**
     * Gets the cars value for this PreciseQuoteRequestDTO.
     * 
     * @return cars
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CarDTO getCars() {
        return cars;
    }


    /**
     * Sets the cars value for this PreciseQuoteRequestDTO.
     * 
     * @param cars
     */
    public void setCars(com.ccic.gwservice.car.fgcpiprecisequote.CarDTO cars) {
        this.cars = cars;
    }


    /**
     * Gets the devices value for this PreciseQuoteRequestDTO.
     * 
     * @return devices
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO[] getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this PreciseQuoteRequestDTO.
     * 
     * @param devices
     */
    public void setDevices(com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO[] devices) {
        this.devices = devices;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO getDevices(int i) {
        return this.devices[i];
    }

    public void setDevices(int i, com.ccic.gwservice.car.fgcpiprecisequote.DeviceDTO _value) {
        this.devices[i] = _value;
    }


    /**
     * Gets the carTax value for this PreciseQuoteRequestDTO.
     * 
     * @return carTax
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO getCarTax() {
        return carTax;
    }


    /**
     * Sets the carTax value for this PreciseQuoteRequestDTO.
     * 
     * @param carTax
     */
    public void setCarTax(com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax) {
        this.carTax = carTax;
    }


    /**
     * Gets the privy value for this PreciseQuoteRequestDTO.
     * 
     * @return privy
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO[] getPrivy() {
        return privy;
    }


    /**
     * Sets the privy value for this PreciseQuoteRequestDTO.
     * 
     * @param privy
     */
    public void setPrivy(com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO[] privy) {
        this.privy = privy;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO getPrivy(int i) {
        return this.privy[i];
    }

    public void setPrivy(int i, com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO _value) {
        this.privy[i] = _value;
    }


    /**
     * Gets the kinds value for this PreciseQuoteRequestDTO.
     * 
     * @return kinds
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] getKinds() {
        return kinds;
    }


    /**
     * Sets the kinds value for this PreciseQuoteRequestDTO.
     * 
     * @param kinds
     */
    public void setKinds(com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] kinds) {
        this.kinds = kinds;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.KindDTO getKinds(int i) {
        return this.kinds[i];
    }

    public void setKinds(int i, com.ccic.gwservice.car.fgcpiprecisequote.KindDTO _value) {
        this.kinds[i] = _value;
    }


    /**
     * Gets the checks value for this PreciseQuoteRequestDTO.
     * 
     * @return checks
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] getChecks() {
        return checks;
    }


    /**
     * Sets the checks value for this PreciseQuoteRequestDTO.
     * 
     * @param checks
     */
    public void setChecks(com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] checks) {
        this.checks = checks;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO getChecks(int i) {
        return this.checks[i];
    }

    public void setChecks(int i, com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO _value) {
        this.checks[i] = _value;
    }


    /**
     * Gets the vehicleJingyou value for this PreciseQuoteRequestDTO.
     * 
     * @return vehicleJingyou
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.VehicleJingyouDTO getVehicleJingyou() {
        return vehicleJingyou;
    }


    /**
     * Sets the vehicleJingyou value for this PreciseQuoteRequestDTO.
     * 
     * @param vehicleJingyou
     */
    public void setVehicleJingyou(com.ccic.gwservice.car.fgcpiprecisequote.VehicleJingyouDTO vehicleJingyou) {
        this.vehicleJingyou = vehicleJingyou;
    }


    /**
     * Gets the other value for this PreciseQuoteRequestDTO.
     * 
     * @return other
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.OtherDTO getOther() {
        return other;
    }


    /**
     * Sets the other value for this PreciseQuoteRequestDTO.
     * 
     * @param other
     */
    public void setOther(com.ccic.gwservice.car.fgcpiprecisequote.OtherDTO other) {
        this.other = other;
    }


    /**
     * Gets the projectChannel value for this PreciseQuoteRequestDTO.
     * 
     * @return projectChannel
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ProjectChannelDTO getProjectChannel() {
        return projectChannel;
    }


    /**
     * Sets the projectChannel value for this PreciseQuoteRequestDTO.
     * 
     * @param projectChannel
     */
    public void setProjectChannel(com.ccic.gwservice.car.fgcpiprecisequote.ProjectChannelDTO projectChannel) {
        this.projectChannel = projectChannel;
    }


    /**
     * Gets the extendInfo value for this PreciseQuoteRequestDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this PreciseQuoteRequestDTO.
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


    /**
     * Gets the agent value for this PreciseQuoteRequestDTO.
     * 
     * @return agent
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.AgentDTO getAgent() {
        return agent;
    }


    /**
     * Sets the agent value for this PreciseQuoteRequestDTO.
     * 
     * @param agent
     */
    public void setAgent(com.ccic.gwservice.car.fgcpiprecisequote.AgentDTO agent) {
        this.agent = agent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreciseQuoteRequestDTO)) return false;
        PreciseQuoteRequestDTO other = (PreciseQuoteRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotationType==null && other.getQuotationType()==null) || 
             (this.quotationType!=null &&
              this.quotationType.equals(other.getQuotationType()))) &&
            ((this.operateDate==null && other.getOperateDate()==null) || 
             (this.operateDate!=null &&
              this.operateDate.equals(other.getOperateDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.lastYearEndDate==null && other.getLastYearEndDate()==null) || 
             (this.lastYearEndDate!=null &&
              this.lastYearEndDate.equals(other.getLastYearEndDate()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.isRenewed==null && other.getIsRenewed()==null) || 
             (this.isRenewed!=null &&
              this.isRenewed.equals(other.getIsRenewed()))) &&
            ((this.renewPolicyNo==null && other.getRenewPolicyNo()==null) || 
             (this.renewPolicyNo!=null &&
              this.renewPolicyNo.equals(other.getRenewPolicyNo()))) &&
            ((this.contractNo==null && other.getContractNo()==null) || 
             (this.contractNo!=null &&
              this.contractNo.equals(other.getContractNo()))) &&
            ((this.expectDiscount==null && other.getExpectDiscount()==null) || 
             (this.expectDiscount!=null &&
              this.expectDiscount.equals(other.getExpectDiscount()))) &&
            ((this.isAboutAgri==null && other.getIsAboutAgri()==null) || 
             (this.isAboutAgri!=null &&
              this.isAboutAgri.equals(other.getIsAboutAgri()))) &&
            ((this.queryAreaCode==null && other.getQueryAreaCode()==null) || 
             (this.queryAreaCode!=null &&
              this.queryAreaCode.equals(other.getQueryAreaCode()))) &&
            ((this.cars==null && other.getCars()==null) || 
             (this.cars!=null &&
              this.cars.equals(other.getCars()))) &&
            ((this.devices==null && other.getDevices()==null) || 
             (this.devices!=null &&
              java.util.Arrays.equals(this.devices, other.getDevices()))) &&
            ((this.carTax==null && other.getCarTax()==null) || 
             (this.carTax!=null &&
              this.carTax.equals(other.getCarTax()))) &&
            ((this.privy==null && other.getPrivy()==null) || 
             (this.privy!=null &&
              java.util.Arrays.equals(this.privy, other.getPrivy()))) &&
            ((this.kinds==null && other.getKinds()==null) || 
             (this.kinds!=null &&
              java.util.Arrays.equals(this.kinds, other.getKinds()))) &&
            ((this.checks==null && other.getChecks()==null) || 
             (this.checks!=null &&
              java.util.Arrays.equals(this.checks, other.getChecks()))) &&
            ((this.vehicleJingyou==null && other.getVehicleJingyou()==null) || 
             (this.vehicleJingyou!=null &&
              this.vehicleJingyou.equals(other.getVehicleJingyou()))) &&
            ((this.other==null && other.getOther()==null) || 
             (this.other!=null &&
              this.other.equals(other.getOther()))) &&
            ((this.projectChannel==null && other.getProjectChannel()==null) || 
             (this.projectChannel!=null &&
              this.projectChannel.equals(other.getProjectChannel()))) &&
            ((this.extendInfo==null && other.getExtendInfo()==null) || 
             (this.extendInfo!=null &&
              java.util.Arrays.equals(this.extendInfo, other.getExtendInfo()))) &&
            ((this.agent==null && other.getAgent()==null) || 
             (this.agent!=null &&
              this.agent.equals(other.getAgent())));
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
        if (getQuotationType() != null) {
            _hashCode += getQuotationType().hashCode();
        }
        if (getOperateDate() != null) {
            _hashCode += getOperateDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLastYearEndDate() != null) {
            _hashCode += getLastYearEndDate().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getIsRenewed() != null) {
            _hashCode += getIsRenewed().hashCode();
        }
        if (getRenewPolicyNo() != null) {
            _hashCode += getRenewPolicyNo().hashCode();
        }
        if (getContractNo() != null) {
            _hashCode += getContractNo().hashCode();
        }
        if (getExpectDiscount() != null) {
            _hashCode += getExpectDiscount().hashCode();
        }
        if (getIsAboutAgri() != null) {
            _hashCode += getIsAboutAgri().hashCode();
        }
        if (getQueryAreaCode() != null) {
            _hashCode += getQueryAreaCode().hashCode();
        }
        if (getCars() != null) {
            _hashCode += getCars().hashCode();
        }
        if (getDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarTax() != null) {
            _hashCode += getCarTax().hashCode();
        }
        if (getPrivy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKinds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKinds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKinds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChecks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChecks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChecks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVehicleJingyou() != null) {
            _hashCode += getVehicleJingyou().hashCode();
        }
        if (getOther() != null) {
            _hashCode += getOther().hashCode();
        }
        if (getProjectChannel() != null) {
            _hashCode += getProjectChannel().hashCode();
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
        if (getAgent() != null) {
            _hashCode += getAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreciseQuoteRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PreciseQuoteRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "operateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastYearEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "lastYearEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRenewed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "isRenewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewPolicyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "renewPolicyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "contractNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "expectDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAboutAgri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "isAboutAgri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "queryAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "cars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "DeviceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarTaxDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "privy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PrivyDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kinds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "kinds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "KindDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "checks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CheckDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleJingyou");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vehicleJingyou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "VehicleJingyouDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "OtherDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "projectChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ProjectChannelDTO"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "AgentDTO"));
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
