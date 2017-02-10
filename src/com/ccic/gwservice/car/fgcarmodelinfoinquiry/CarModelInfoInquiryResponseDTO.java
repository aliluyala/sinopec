/**
 * CarModelInfoInquiryResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class CarModelInfoInquiryResponseDTO  implements java.io.Serializable {
    private java.lang.String searchSequenceNo;

    private java.lang.String vehicleId;

    private java.lang.String licenseNo;

    private java.lang.String licenseType;

    private java.lang.String frameNo;

    private java.lang.String vinNo;

    private java.lang.String carOwner;

    private java.lang.String enrollDate;

    private java.lang.String engineNo;

    private java.lang.String useNatureCode;

    private java.lang.String vehicleType;

    private java.lang.String ineffectualDate;

    private java.lang.String rejectDate;

    private java.lang.String lastCheckDate;

    private java.lang.String transferDate;

    private java.lang.Double wholeWeight;

    private java.lang.Double ratedPassengerCapacity;

    private java.lang.Double tonnage;

    private java.lang.String madeFactory;

    private java.lang.String model;

    private java.lang.String brandCN;

    private java.lang.String brandEN;

    private java.lang.Double haulage;

    private java.lang.String status;

    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO[] carModel;

    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] extendInfo;

    public CarModelInfoInquiryResponseDTO() {
    }

    public CarModelInfoInquiryResponseDTO(
           java.lang.String searchSequenceNo,
           java.lang.String vehicleId,
           java.lang.String licenseNo,
           java.lang.String licenseType,
           java.lang.String frameNo,
           java.lang.String vinNo,
           java.lang.String carOwner,
           java.lang.String enrollDate,
           java.lang.String engineNo,
           java.lang.String useNatureCode,
           java.lang.String vehicleType,
           java.lang.String ineffectualDate,
           java.lang.String rejectDate,
           java.lang.String lastCheckDate,
           java.lang.String transferDate,
           java.lang.Double wholeWeight,
           java.lang.Double ratedPassengerCapacity,
           java.lang.Double tonnage,
           java.lang.String madeFactory,
           java.lang.String model,
           java.lang.String brandCN,
           java.lang.String brandEN,
           java.lang.Double haulage,
           java.lang.String status,
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO[] carModel,
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] extendInfo) {
           this.searchSequenceNo = searchSequenceNo;
           this.vehicleId = vehicleId;
           this.licenseNo = licenseNo;
           this.licenseType = licenseType;
           this.frameNo = frameNo;
           this.vinNo = vinNo;
           this.carOwner = carOwner;
           this.enrollDate = enrollDate;
           this.engineNo = engineNo;
           this.useNatureCode = useNatureCode;
           this.vehicleType = vehicleType;
           this.ineffectualDate = ineffectualDate;
           this.rejectDate = rejectDate;
           this.lastCheckDate = lastCheckDate;
           this.transferDate = transferDate;
           this.wholeWeight = wholeWeight;
           this.ratedPassengerCapacity = ratedPassengerCapacity;
           this.tonnage = tonnage;
           this.madeFactory = madeFactory;
           this.model = model;
           this.brandCN = brandCN;
           this.brandEN = brandEN;
           this.haulage = haulage;
           this.status = status;
           this.carModel = carModel;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the searchSequenceNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return searchSequenceNo
     */
    public java.lang.String getSearchSequenceNo() {
        return searchSequenceNo;
    }


    /**
     * Sets the searchSequenceNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param searchSequenceNo
     */
    public void setSearchSequenceNo(java.lang.String searchSequenceNo) {
        this.searchSequenceNo = searchSequenceNo;
    }


    /**
     * Gets the vehicleId value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return vehicleId
     */
    public java.lang.String getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param vehicleId
     */
    public void setVehicleId(java.lang.String vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the licenseNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the licenseType value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the frameNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return frameNo
     */
    public java.lang.String getFrameNo() {
        return frameNo;
    }


    /**
     * Sets the frameNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param frameNo
     */
    public void setFrameNo(java.lang.String frameNo) {
        this.frameNo = frameNo;
    }


    /**
     * Gets the vinNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return vinNo
     */
    public java.lang.String getVinNo() {
        return vinNo;
    }


    /**
     * Sets the vinNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param vinNo
     */
    public void setVinNo(java.lang.String vinNo) {
        this.vinNo = vinNo;
    }


    /**
     * Gets the carOwner value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return carOwner
     */
    public java.lang.String getCarOwner() {
        return carOwner;
    }


    /**
     * Sets the carOwner value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param carOwner
     */
    public void setCarOwner(java.lang.String carOwner) {
        this.carOwner = carOwner;
    }


    /**
     * Gets the enrollDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return enrollDate
     */
    public java.lang.String getEnrollDate() {
        return enrollDate;
    }


    /**
     * Sets the enrollDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param enrollDate
     */
    public void setEnrollDate(java.lang.String enrollDate) {
        this.enrollDate = enrollDate;
    }


    /**
     * Gets the engineNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the useNatureCode value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return useNatureCode
     */
    public java.lang.String getUseNatureCode() {
        return useNatureCode;
    }


    /**
     * Sets the useNatureCode value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param useNatureCode
     */
    public void setUseNatureCode(java.lang.String useNatureCode) {
        this.useNatureCode = useNatureCode;
    }


    /**
     * Gets the vehicleType value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }


    /**
     * Gets the ineffectualDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return ineffectualDate
     */
    public java.lang.String getIneffectualDate() {
        return ineffectualDate;
    }


    /**
     * Sets the ineffectualDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param ineffectualDate
     */
    public void setIneffectualDate(java.lang.String ineffectualDate) {
        this.ineffectualDate = ineffectualDate;
    }


    /**
     * Gets the rejectDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return rejectDate
     */
    public java.lang.String getRejectDate() {
        return rejectDate;
    }


    /**
     * Sets the rejectDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param rejectDate
     */
    public void setRejectDate(java.lang.String rejectDate) {
        this.rejectDate = rejectDate;
    }


    /**
     * Gets the lastCheckDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return lastCheckDate
     */
    public java.lang.String getLastCheckDate() {
        return lastCheckDate;
    }


    /**
     * Sets the lastCheckDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param lastCheckDate
     */
    public void setLastCheckDate(java.lang.String lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }


    /**
     * Gets the transferDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return transferDate
     */
    public java.lang.String getTransferDate() {
        return transferDate;
    }


    /**
     * Sets the transferDate value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param transferDate
     */
    public void setTransferDate(java.lang.String transferDate) {
        this.transferDate = transferDate;
    }


    /**
     * Gets the wholeWeight value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return wholeWeight
     */
    public java.lang.Double getWholeWeight() {
        return wholeWeight;
    }


    /**
     * Sets the wholeWeight value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param wholeWeight
     */
    public void setWholeWeight(java.lang.Double wholeWeight) {
        this.wholeWeight = wholeWeight;
    }


    /**
     * Gets the ratedPassengerCapacity value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return ratedPassengerCapacity
     */
    public java.lang.Double getRatedPassengerCapacity() {
        return ratedPassengerCapacity;
    }


    /**
     * Sets the ratedPassengerCapacity value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param ratedPassengerCapacity
     */
    public void setRatedPassengerCapacity(java.lang.Double ratedPassengerCapacity) {
        this.ratedPassengerCapacity = ratedPassengerCapacity;
    }


    /**
     * Gets the tonnage value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return tonnage
     */
    public java.lang.Double getTonnage() {
        return tonnage;
    }


    /**
     * Sets the tonnage value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param tonnage
     */
    public void setTonnage(java.lang.Double tonnage) {
        this.tonnage = tonnage;
    }


    /**
     * Gets the madeFactory value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return madeFactory
     */
    public java.lang.String getMadeFactory() {
        return madeFactory;
    }


    /**
     * Sets the madeFactory value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param madeFactory
     */
    public void setMadeFactory(java.lang.String madeFactory) {
        this.madeFactory = madeFactory;
    }


    /**
     * Gets the model value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the brandCN value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return brandCN
     */
    public java.lang.String getBrandCN() {
        return brandCN;
    }


    /**
     * Sets the brandCN value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param brandCN
     */
    public void setBrandCN(java.lang.String brandCN) {
        this.brandCN = brandCN;
    }


    /**
     * Gets the brandEN value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return brandEN
     */
    public java.lang.String getBrandEN() {
        return brandEN;
    }


    /**
     * Sets the brandEN value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param brandEN
     */
    public void setBrandEN(java.lang.String brandEN) {
        this.brandEN = brandEN;
    }


    /**
     * Gets the haulage value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return haulage
     */
    public java.lang.Double getHaulage() {
        return haulage;
    }


    /**
     * Sets the haulage value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param haulage
     */
    public void setHaulage(java.lang.Double haulage) {
        this.haulage = haulage;
    }


    /**
     * Gets the status value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the carModel value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return carModel
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO[] getCarModel() {
        return carModel;
    }


    /**
     * Sets the carModel value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param carModel
     */
    public void setCarModel(com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO[] carModel) {
        this.carModel = carModel;
    }

    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO getCarModel(int i) {
        return this.carModel[i];
    }

    public void setCarModel(int i, com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO _value) {
        this.carModel[i] = _value;
    }


    /**
     * Gets the extendInfo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this CarModelInfoInquiryResponseDTO.
     * 
     * @param extendInfo
     */
    public void setExtendInfo(com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] extendInfo) {
        this.extendInfo = extendInfo;
    }

    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO getExtendInfo(int i) {
        return this.extendInfo[i];
    }

    public void setExtendInfo(int i, com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO _value) {
        this.extendInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarModelInfoInquiryResponseDTO)) return false;
        CarModelInfoInquiryResponseDTO other = (CarModelInfoInquiryResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchSequenceNo==null && other.getSearchSequenceNo()==null) || 
             (this.searchSequenceNo!=null &&
              this.searchSequenceNo.equals(other.getSearchSequenceNo()))) &&
            ((this.vehicleId==null && other.getVehicleId()==null) || 
             (this.vehicleId!=null &&
              this.vehicleId.equals(other.getVehicleId()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.frameNo==null && other.getFrameNo()==null) || 
             (this.frameNo!=null &&
              this.frameNo.equals(other.getFrameNo()))) &&
            ((this.vinNo==null && other.getVinNo()==null) || 
             (this.vinNo!=null &&
              this.vinNo.equals(other.getVinNo()))) &&
            ((this.carOwner==null && other.getCarOwner()==null) || 
             (this.carOwner!=null &&
              this.carOwner.equals(other.getCarOwner()))) &&
            ((this.enrollDate==null && other.getEnrollDate()==null) || 
             (this.enrollDate!=null &&
              this.enrollDate.equals(other.getEnrollDate()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            ((this.useNatureCode==null && other.getUseNatureCode()==null) || 
             (this.useNatureCode!=null &&
              this.useNatureCode.equals(other.getUseNatureCode()))) &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType()))) &&
            ((this.ineffectualDate==null && other.getIneffectualDate()==null) || 
             (this.ineffectualDate!=null &&
              this.ineffectualDate.equals(other.getIneffectualDate()))) &&
            ((this.rejectDate==null && other.getRejectDate()==null) || 
             (this.rejectDate!=null &&
              this.rejectDate.equals(other.getRejectDate()))) &&
            ((this.lastCheckDate==null && other.getLastCheckDate()==null) || 
             (this.lastCheckDate!=null &&
              this.lastCheckDate.equals(other.getLastCheckDate()))) &&
            ((this.transferDate==null && other.getTransferDate()==null) || 
             (this.transferDate!=null &&
              this.transferDate.equals(other.getTransferDate()))) &&
            ((this.wholeWeight==null && other.getWholeWeight()==null) || 
             (this.wholeWeight!=null &&
              this.wholeWeight.equals(other.getWholeWeight()))) &&
            ((this.ratedPassengerCapacity==null && other.getRatedPassengerCapacity()==null) || 
             (this.ratedPassengerCapacity!=null &&
              this.ratedPassengerCapacity.equals(other.getRatedPassengerCapacity()))) &&
            ((this.tonnage==null && other.getTonnage()==null) || 
             (this.tonnage!=null &&
              this.tonnage.equals(other.getTonnage()))) &&
            ((this.madeFactory==null && other.getMadeFactory()==null) || 
             (this.madeFactory!=null &&
              this.madeFactory.equals(other.getMadeFactory()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.brandCN==null && other.getBrandCN()==null) || 
             (this.brandCN!=null &&
              this.brandCN.equals(other.getBrandCN()))) &&
            ((this.brandEN==null && other.getBrandEN()==null) || 
             (this.brandEN!=null &&
              this.brandEN.equals(other.getBrandEN()))) &&
            ((this.haulage==null && other.getHaulage()==null) || 
             (this.haulage!=null &&
              this.haulage.equals(other.getHaulage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.carModel==null && other.getCarModel()==null) || 
             (this.carModel!=null &&
              java.util.Arrays.equals(this.carModel, other.getCarModel()))) &&
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
        if (getSearchSequenceNo() != null) {
            _hashCode += getSearchSequenceNo().hashCode();
        }
        if (getVehicleId() != null) {
            _hashCode += getVehicleId().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getFrameNo() != null) {
            _hashCode += getFrameNo().hashCode();
        }
        if (getVinNo() != null) {
            _hashCode += getVinNo().hashCode();
        }
        if (getCarOwner() != null) {
            _hashCode += getCarOwner().hashCode();
        }
        if (getEnrollDate() != null) {
            _hashCode += getEnrollDate().hashCode();
        }
        if (getEngineNo() != null) {
            _hashCode += getEngineNo().hashCode();
        }
        if (getUseNatureCode() != null) {
            _hashCode += getUseNatureCode().hashCode();
        }
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        if (getIneffectualDate() != null) {
            _hashCode += getIneffectualDate().hashCode();
        }
        if (getRejectDate() != null) {
            _hashCode += getRejectDate().hashCode();
        }
        if (getLastCheckDate() != null) {
            _hashCode += getLastCheckDate().hashCode();
        }
        if (getTransferDate() != null) {
            _hashCode += getTransferDate().hashCode();
        }
        if (getWholeWeight() != null) {
            _hashCode += getWholeWeight().hashCode();
        }
        if (getRatedPassengerCapacity() != null) {
            _hashCode += getRatedPassengerCapacity().hashCode();
        }
        if (getTonnage() != null) {
            _hashCode += getTonnage().hashCode();
        }
        if (getMadeFactory() != null) {
            _hashCode += getMadeFactory().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getBrandCN() != null) {
            _hashCode += getBrandCN().hashCode();
        }
        if (getBrandEN() != null) {
            _hashCode += getBrandEN().hashCode();
        }
        if (getHaulage() != null) {
            _hashCode += getHaulage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCarModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarModel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(CarModelInfoInquiryResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "searchSequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "licenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "frameNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vinNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "carOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "enrollDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "engineNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "useNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vehicleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ineffectualDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ineffectualDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "RejectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCheckDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "lastCheckDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "transferDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholeWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "wholeWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratedPassengerCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ratedPassengerCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tonnage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "tonnage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madeFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "madeFactory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandCN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "brandCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandEN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "brandEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haulage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "haulage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "carModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "extendInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ExtendInfoDTO"));
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
