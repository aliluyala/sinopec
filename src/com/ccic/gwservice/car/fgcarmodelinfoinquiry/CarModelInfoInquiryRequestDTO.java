/**
 * CarModelInfoInquiryRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class CarModelInfoInquiryRequestDTO  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String licenseNo;

    private java.lang.String licenseType;

    private java.lang.String engineNo;

    private java.lang.String frameNo;

    private java.lang.String vinNo;

    private java.lang.String newVehicle;

    private java.lang.String ecdemicVehicle;

    private java.lang.String vehicleStyleDesc;

    private java.lang.String madeFactory;

    private java.lang.String brandEN;

    private java.lang.String vehicleBrand;

    private java.lang.String vehicleModel;

    private java.lang.String modelCode;

    private java.lang.Double net;

    private java.lang.String madeDate;

    private java.lang.String enrollDate;

    private java.lang.String vehicleType;

    private java.lang.Double tonCount;

    private java.lang.Integer seatCount;

    private java.lang.Double exhaustScale;

    private java.lang.String haulage;

    private com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] extendInfo;

    public CarModelInfoInquiryRequestDTO() {
    }

    public CarModelInfoInquiryRequestDTO(
           java.lang.String licenseNo,
           java.lang.String licenseType,
           java.lang.String engineNo,
           java.lang.String frameNo,
           java.lang.String vinNo,
           java.lang.String newVehicle,
           java.lang.String ecdemicVehicle,
           java.lang.String vehicleStyleDesc,
           java.lang.String madeFactory,
           java.lang.String brandEN,
           java.lang.String vehicleBrand,
           java.lang.String vehicleModel,
           java.lang.String modelCode,
           java.lang.Double net,
           java.lang.String madeDate,
           java.lang.String enrollDate,
           java.lang.String vehicleType,
           java.lang.Double tonCount,
           java.lang.Integer seatCount,
           java.lang.Double exhaustScale,
           java.lang.String haulage,
           com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] extendInfo) {
           this.licenseNo = licenseNo;
           this.licenseType = licenseType;
           this.engineNo = engineNo;
           this.frameNo = frameNo;
           this.vinNo = vinNo;
           this.newVehicle = newVehicle;
           this.ecdemicVehicle = ecdemicVehicle;
           this.vehicleStyleDesc = vehicleStyleDesc;
           this.madeFactory = madeFactory;
           this.brandEN = brandEN;
           this.vehicleBrand = vehicleBrand;
           this.vehicleModel = vehicleModel;
           this.modelCode = modelCode;
           this.net = net;
           this.madeDate = madeDate;
           this.enrollDate = enrollDate;
           this.vehicleType = vehicleType;
           this.tonCount = tonCount;
           this.seatCount = seatCount;
           this.exhaustScale = exhaustScale;
           this.haulage = haulage;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the licenseNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the licenseType value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the engineNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the frameNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return frameNo
     */
    public java.lang.String getFrameNo() {
        return frameNo;
    }


    /**
     * Sets the frameNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param frameNo
     */
    public void setFrameNo(java.lang.String frameNo) {
        this.frameNo = frameNo;
    }


    /**
     * Gets the vinNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return vinNo
     */
    public java.lang.String getVinNo() {
        return vinNo;
    }


    /**
     * Sets the vinNo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param vinNo
     */
    public void setVinNo(java.lang.String vinNo) {
        this.vinNo = vinNo;
    }


    /**
     * Gets the newVehicle value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return newVehicle
     */
    public java.lang.String getNewVehicle() {
        return newVehicle;
    }


    /**
     * Sets the newVehicle value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param newVehicle
     */
    public void setNewVehicle(java.lang.String newVehicle) {
        this.newVehicle = newVehicle;
    }


    /**
     * Gets the ecdemicVehicle value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return ecdemicVehicle
     */
    public java.lang.String getEcdemicVehicle() {
        return ecdemicVehicle;
    }


    /**
     * Sets the ecdemicVehicle value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param ecdemicVehicle
     */
    public void setEcdemicVehicle(java.lang.String ecdemicVehicle) {
        this.ecdemicVehicle = ecdemicVehicle;
    }


    /**
     * Gets the vehicleStyleDesc value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return vehicleStyleDesc
     */
    public java.lang.String getVehicleStyleDesc() {
        return vehicleStyleDesc;
    }


    /**
     * Sets the vehicleStyleDesc value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param vehicleStyleDesc
     */
    public void setVehicleStyleDesc(java.lang.String vehicleStyleDesc) {
        this.vehicleStyleDesc = vehicleStyleDesc;
    }


    /**
     * Gets the madeFactory value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return madeFactory
     */
    public java.lang.String getMadeFactory() {
        return madeFactory;
    }


    /**
     * Sets the madeFactory value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param madeFactory
     */
    public void setMadeFactory(java.lang.String madeFactory) {
        this.madeFactory = madeFactory;
    }


    /**
     * Gets the brandEN value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return brandEN
     */
    public java.lang.String getBrandEN() {
        return brandEN;
    }


    /**
     * Sets the brandEN value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param brandEN
     */
    public void setBrandEN(java.lang.String brandEN) {
        this.brandEN = brandEN;
    }


    /**
     * Gets the vehicleBrand value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return vehicleBrand
     */
    public java.lang.String getVehicleBrand() {
        return vehicleBrand;
    }


    /**
     * Sets the vehicleBrand value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param vehicleBrand
     */
    public void setVehicleBrand(java.lang.String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }


    /**
     * Gets the vehicleModel value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return vehicleModel
     */
    public java.lang.String getVehicleModel() {
        return vehicleModel;
    }


    /**
     * Sets the vehicleModel value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param vehicleModel
     */
    public void setVehicleModel(java.lang.String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }


    /**
     * Gets the modelCode value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return modelCode
     */
    public java.lang.String getModelCode() {
        return modelCode;
    }


    /**
     * Sets the modelCode value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param modelCode
     */
    public void setModelCode(java.lang.String modelCode) {
        this.modelCode = modelCode;
    }


    /**
     * Gets the net value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return net
     */
    public java.lang.Double getNet() {
        return net;
    }


    /**
     * Sets the net value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param net
     */
    public void setNet(java.lang.Double net) {
        this.net = net;
    }


    /**
     * Gets the madeDate value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return madeDate
     */
    public java.lang.String getMadeDate() {
        return madeDate;
    }


    /**
     * Sets the madeDate value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param madeDate
     */
    public void setMadeDate(java.lang.String madeDate) {
        this.madeDate = madeDate;
    }


    /**
     * Gets the enrollDate value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return enrollDate
     */
    public java.lang.String getEnrollDate() {
        return enrollDate;
    }


    /**
     * Sets the enrollDate value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param enrollDate
     */
    public void setEnrollDate(java.lang.String enrollDate) {
        this.enrollDate = enrollDate;
    }


    /**
     * Gets the vehicleType value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }


    /**
     * Gets the tonCount value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return tonCount
     */
    public java.lang.Double getTonCount() {
        return tonCount;
    }


    /**
     * Sets the tonCount value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param tonCount
     */
    public void setTonCount(java.lang.Double tonCount) {
        this.tonCount = tonCount;
    }


    /**
     * Gets the seatCount value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return seatCount
     */
    public java.lang.Integer getSeatCount() {
        return seatCount;
    }


    /**
     * Sets the seatCount value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param seatCount
     */
    public void setSeatCount(java.lang.Integer seatCount) {
        this.seatCount = seatCount;
    }


    /**
     * Gets the exhaustScale value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return exhaustScale
     */
    public java.lang.Double getExhaustScale() {
        return exhaustScale;
    }


    /**
     * Sets the exhaustScale value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param exhaustScale
     */
    public void setExhaustScale(java.lang.Double exhaustScale) {
        this.exhaustScale = exhaustScale;
    }


    /**
     * Gets the haulage value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return haulage
     */
    public java.lang.String getHaulage() {
        return haulage;
    }


    /**
     * Sets the haulage value for this CarModelInfoInquiryRequestDTO.
     * 
     * @param haulage
     */
    public void setHaulage(java.lang.String haulage) {
        this.haulage = haulage;
    }


    /**
     * Gets the extendInfo value for this CarModelInfoInquiryRequestDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this CarModelInfoInquiryRequestDTO.
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
        if (!(obj instanceof CarModelInfoInquiryRequestDTO)) return false;
        CarModelInfoInquiryRequestDTO other = (CarModelInfoInquiryRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            ((this.frameNo==null && other.getFrameNo()==null) || 
             (this.frameNo!=null &&
              this.frameNo.equals(other.getFrameNo()))) &&
            ((this.vinNo==null && other.getVinNo()==null) || 
             (this.vinNo!=null &&
              this.vinNo.equals(other.getVinNo()))) &&
            ((this.newVehicle==null && other.getNewVehicle()==null) || 
             (this.newVehicle!=null &&
              this.newVehicle.equals(other.getNewVehicle()))) &&
            ((this.ecdemicVehicle==null && other.getEcdemicVehicle()==null) || 
             (this.ecdemicVehicle!=null &&
              this.ecdemicVehicle.equals(other.getEcdemicVehicle()))) &&
            ((this.vehicleStyleDesc==null && other.getVehicleStyleDesc()==null) || 
             (this.vehicleStyleDesc!=null &&
              this.vehicleStyleDesc.equals(other.getVehicleStyleDesc()))) &&
            ((this.madeFactory==null && other.getMadeFactory()==null) || 
             (this.madeFactory!=null &&
              this.madeFactory.equals(other.getMadeFactory()))) &&
            ((this.brandEN==null && other.getBrandEN()==null) || 
             (this.brandEN!=null &&
              this.brandEN.equals(other.getBrandEN()))) &&
            ((this.vehicleBrand==null && other.getVehicleBrand()==null) || 
             (this.vehicleBrand!=null &&
              this.vehicleBrand.equals(other.getVehicleBrand()))) &&
            ((this.vehicleModel==null && other.getVehicleModel()==null) || 
             (this.vehicleModel!=null &&
              this.vehicleModel.equals(other.getVehicleModel()))) &&
            ((this.modelCode==null && other.getModelCode()==null) || 
             (this.modelCode!=null &&
              this.modelCode.equals(other.getModelCode()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              this.net.equals(other.getNet()))) &&
            ((this.madeDate==null && other.getMadeDate()==null) || 
             (this.madeDate!=null &&
              this.madeDate.equals(other.getMadeDate()))) &&
            ((this.enrollDate==null && other.getEnrollDate()==null) || 
             (this.enrollDate!=null &&
              this.enrollDate.equals(other.getEnrollDate()))) &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType()))) &&
            ((this.tonCount==null && other.getTonCount()==null) || 
             (this.tonCount!=null &&
              this.tonCount.equals(other.getTonCount()))) &&
            ((this.seatCount==null && other.getSeatCount()==null) || 
             (this.seatCount!=null &&
              this.seatCount.equals(other.getSeatCount()))) &&
            ((this.exhaustScale==null && other.getExhaustScale()==null) || 
             (this.exhaustScale!=null &&
              this.exhaustScale.equals(other.getExhaustScale()))) &&
            ((this.haulage==null && other.getHaulage()==null) || 
             (this.haulage!=null &&
              this.haulage.equals(other.getHaulage()))) &&
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
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getEngineNo() != null) {
            _hashCode += getEngineNo().hashCode();
        }
        if (getFrameNo() != null) {
            _hashCode += getFrameNo().hashCode();
        }
        if (getVinNo() != null) {
            _hashCode += getVinNo().hashCode();
        }
        if (getNewVehicle() != null) {
            _hashCode += getNewVehicle().hashCode();
        }
        if (getEcdemicVehicle() != null) {
            _hashCode += getEcdemicVehicle().hashCode();
        }
        if (getVehicleStyleDesc() != null) {
            _hashCode += getVehicleStyleDesc().hashCode();
        }
        if (getMadeFactory() != null) {
            _hashCode += getMadeFactory().hashCode();
        }
        if (getBrandEN() != null) {
            _hashCode += getBrandEN().hashCode();
        }
        if (getVehicleBrand() != null) {
            _hashCode += getVehicleBrand().hashCode();
        }
        if (getVehicleModel() != null) {
            _hashCode += getVehicleModel().hashCode();
        }
        if (getModelCode() != null) {
            _hashCode += getModelCode().hashCode();
        }
        if (getNet() != null) {
            _hashCode += getNet().hashCode();
        }
        if (getMadeDate() != null) {
            _hashCode += getMadeDate().hashCode();
        }
        if (getEnrollDate() != null) {
            _hashCode += getEnrollDate().hashCode();
        }
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        if (getTonCount() != null) {
            _hashCode += getTonCount().hashCode();
        }
        if (getSeatCount() != null) {
            _hashCode += getSeatCount().hashCode();
        }
        if (getExhaustScale() != null) {
            _hashCode += getExhaustScale().hashCode();
        }
        if (getHaulage() != null) {
            _hashCode += getHaulage().hashCode();
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
        new org.apache.axis.description.TypeDesc(CarModelInfoInquiryRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("engineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "engineNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "frameNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vinNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "newVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecdemicVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ecdemicVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleStyleDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vehicleStyleDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("brandEN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "brandEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vehicleBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "vehicleModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "modelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "net"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "madeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "enrollDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tonCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "tonCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "seatCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhaustScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "exhaustScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haulage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "haulage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
