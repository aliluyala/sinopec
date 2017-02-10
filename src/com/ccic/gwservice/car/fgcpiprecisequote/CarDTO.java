/**
 * CarDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class CarDTO  implements java.io.Serializable {
    private java.lang.String pmQueryNo;

    private java.lang.String carinsureDrelation;

    private java.lang.String carOwner;

    private java.lang.String vehicleID;

    private java.lang.String licenseNo;

    private java.lang.String licenseColorcode;

    private java.lang.String licenseType;

    private java.lang.String importFlag;

    private java.lang.String carKindCode;

    private java.lang.String modelCode;

    private java.lang.String modelName;

    private java.lang.String frameNo;

    private java.lang.String vinNo;

    private java.lang.String engineNo;

    private java.lang.String useNatureCode;

    private java.lang.String vehicleCategory;

    private java.lang.String enrollDate;

    private java.lang.Integer userYear;

    private java.lang.Double runMiles;

    private java.lang.String colorCode;

    private java.lang.String runAreaCode;

    private java.lang.Double purchasePrice;

    private java.lang.Double actualValue;

    private java.lang.String clauseType;

    private java.lang.Integer violatedTimes;

    private java.lang.String ecdemicVehicle;

    private java.lang.String transferDate;

    private java.lang.String newVehicle;

    private java.lang.String noLicenseFlag;

    private java.lang.String chgOwnerFlag;

    private java.lang.String safeDevice;

    private java.lang.String parkSite;

    private java.lang.String certificateDate;

    private java.lang.String vehicleBrand;

    private java.lang.Integer noDamageYears;

    private java.lang.String loanVehicleFlag;

    private java.lang.String specialCarFlag;

    private java.lang.String fuelType;

    private java.lang.Double net;

    private java.lang.Double exhaustScale;

    private java.lang.Double powerScale;

    private java.lang.Integer seatCount;

    private java.lang.Double tonCount;

    private java.lang.String madeFactory;

    private java.lang.String status;

    private java.lang.String fleetFlag;

    private java.lang.String carChecker;

    private java.lang.String carCheckStatus;

    private java.lang.String uncheckReasonCode;

    private java.lang.String carCheckTime;

    private java.lang.String carRegiste;

    private java.lang.String carTypeAlias;

    private java.lang.String industryModelCode;

    private java.lang.String basicRateCode;

    private java.lang.String industryVehicleCode;

    private java.lang.String industryVehicleName;

    private java.lang.String specialModelFlag;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public CarDTO() {
    }

    public CarDTO(
           java.lang.String pmQueryNo,
           java.lang.String carinsureDrelation,
           java.lang.String carOwner,
           java.lang.String vehicleID,
           java.lang.String licenseNo,
           java.lang.String licenseColorcode,
           java.lang.String licenseType,
           java.lang.String importFlag,
           java.lang.String carKindCode,
           java.lang.String modelCode,
           java.lang.String modelName,
           java.lang.String frameNo,
           java.lang.String vinNo,
           java.lang.String engineNo,
           java.lang.String useNatureCode,
           java.lang.String vehicleCategory,
           java.lang.String enrollDate,
           java.lang.Integer userYear,
           java.lang.Double runMiles,
           java.lang.String colorCode,
           java.lang.String runAreaCode,
           java.lang.Double purchasePrice,
           java.lang.Double actualValue,
           java.lang.String clauseType,
           java.lang.Integer violatedTimes,
           java.lang.String ecdemicVehicle,
           java.lang.String transferDate,
           java.lang.String newVehicle,
           java.lang.String noLicenseFlag,
           java.lang.String chgOwnerFlag,
           java.lang.String safeDevice,
           java.lang.String parkSite,
           java.lang.String certificateDate,
           java.lang.String vehicleBrand,
           java.lang.Integer noDamageYears,
           java.lang.String loanVehicleFlag,
           java.lang.String specialCarFlag,
           java.lang.String fuelType,
           java.lang.Double net,
           java.lang.Double exhaustScale,
           java.lang.Double powerScale,
           java.lang.Integer seatCount,
           java.lang.Double tonCount,
           java.lang.String madeFactory,
           java.lang.String status,
           java.lang.String fleetFlag,
           java.lang.String carChecker,
           java.lang.String carCheckStatus,
           java.lang.String uncheckReasonCode,
           java.lang.String carCheckTime,
           java.lang.String carRegiste,
           java.lang.String carTypeAlias,
           java.lang.String industryModelCode,
           java.lang.String basicRateCode,
           java.lang.String industryVehicleCode,
           java.lang.String industryVehicleName,
           java.lang.String specialModelFlag,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.pmQueryNo = pmQueryNo;
           this.carinsureDrelation = carinsureDrelation;
           this.carOwner = carOwner;
           this.vehicleID = vehicleID;
           this.licenseNo = licenseNo;
           this.licenseColorcode = licenseColorcode;
           this.licenseType = licenseType;
           this.importFlag = importFlag;
           this.carKindCode = carKindCode;
           this.modelCode = modelCode;
           this.modelName = modelName;
           this.frameNo = frameNo;
           this.vinNo = vinNo;
           this.engineNo = engineNo;
           this.useNatureCode = useNatureCode;
           this.vehicleCategory = vehicleCategory;
           this.enrollDate = enrollDate;
           this.userYear = userYear;
           this.runMiles = runMiles;
           this.colorCode = colorCode;
           this.runAreaCode = runAreaCode;
           this.purchasePrice = purchasePrice;
           this.actualValue = actualValue;
           this.clauseType = clauseType;
           this.violatedTimes = violatedTimes;
           this.ecdemicVehicle = ecdemicVehicle;
           this.transferDate = transferDate;
           this.newVehicle = newVehicle;
           this.noLicenseFlag = noLicenseFlag;
           this.chgOwnerFlag = chgOwnerFlag;
           this.safeDevice = safeDevice;
           this.parkSite = parkSite;
           this.certificateDate = certificateDate;
           this.vehicleBrand = vehicleBrand;
           this.noDamageYears = noDamageYears;
           this.loanVehicleFlag = loanVehicleFlag;
           this.specialCarFlag = specialCarFlag;
           this.fuelType = fuelType;
           this.net = net;
           this.exhaustScale = exhaustScale;
           this.powerScale = powerScale;
           this.seatCount = seatCount;
           this.tonCount = tonCount;
           this.madeFactory = madeFactory;
           this.status = status;
           this.fleetFlag = fleetFlag;
           this.carChecker = carChecker;
           this.carCheckStatus = carCheckStatus;
           this.uncheckReasonCode = uncheckReasonCode;
           this.carCheckTime = carCheckTime;
           this.carRegiste = carRegiste;
           this.carTypeAlias = carTypeAlias;
           this.industryModelCode = industryModelCode;
           this.basicRateCode = basicRateCode;
           this.industryVehicleCode = industryVehicleCode;
           this.industryVehicleName = industryVehicleName;
           this.specialModelFlag = specialModelFlag;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the pmQueryNo value for this CarDTO.
     * 
     * @return pmQueryNo
     */
    public java.lang.String getPmQueryNo() {
        return pmQueryNo;
    }


    /**
     * Sets the pmQueryNo value for this CarDTO.
     * 
     * @param pmQueryNo
     */
    public void setPmQueryNo(java.lang.String pmQueryNo) {
        this.pmQueryNo = pmQueryNo;
    }


    /**
     * Gets the carinsureDrelation value for this CarDTO.
     * 
     * @return carinsureDrelation
     */
    public java.lang.String getCarinsureDrelation() {
        return carinsureDrelation;
    }


    /**
     * Sets the carinsureDrelation value for this CarDTO.
     * 
     * @param carinsureDrelation
     */
    public void setCarinsureDrelation(java.lang.String carinsureDrelation) {
        this.carinsureDrelation = carinsureDrelation;
    }


    /**
     * Gets the carOwner value for this CarDTO.
     * 
     * @return carOwner
     */
    public java.lang.String getCarOwner() {
        return carOwner;
    }


    /**
     * Sets the carOwner value for this CarDTO.
     * 
     * @param carOwner
     */
    public void setCarOwner(java.lang.String carOwner) {
        this.carOwner = carOwner;
    }


    /**
     * Gets the vehicleID value for this CarDTO.
     * 
     * @return vehicleID
     */
    public java.lang.String getVehicleID() {
        return vehicleID;
    }


    /**
     * Sets the vehicleID value for this CarDTO.
     * 
     * @param vehicleID
     */
    public void setVehicleID(java.lang.String vehicleID) {
        this.vehicleID = vehicleID;
    }


    /**
     * Gets the licenseNo value for this CarDTO.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this CarDTO.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the licenseColorcode value for this CarDTO.
     * 
     * @return licenseColorcode
     */
    public java.lang.String getLicenseColorcode() {
        return licenseColorcode;
    }


    /**
     * Sets the licenseColorcode value for this CarDTO.
     * 
     * @param licenseColorcode
     */
    public void setLicenseColorcode(java.lang.String licenseColorcode) {
        this.licenseColorcode = licenseColorcode;
    }


    /**
     * Gets the licenseType value for this CarDTO.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this CarDTO.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the importFlag value for this CarDTO.
     * 
     * @return importFlag
     */
    public java.lang.String getImportFlag() {
        return importFlag;
    }


    /**
     * Sets the importFlag value for this CarDTO.
     * 
     * @param importFlag
     */
    public void setImportFlag(java.lang.String importFlag) {
        this.importFlag = importFlag;
    }


    /**
     * Gets the carKindCode value for this CarDTO.
     * 
     * @return carKindCode
     */
    public java.lang.String getCarKindCode() {
        return carKindCode;
    }


    /**
     * Sets the carKindCode value for this CarDTO.
     * 
     * @param carKindCode
     */
    public void setCarKindCode(java.lang.String carKindCode) {
        this.carKindCode = carKindCode;
    }


    /**
     * Gets the modelCode value for this CarDTO.
     * 
     * @return modelCode
     */
    public java.lang.String getModelCode() {
        return modelCode;
    }


    /**
     * Sets the modelCode value for this CarDTO.
     * 
     * @param modelCode
     */
    public void setModelCode(java.lang.String modelCode) {
        this.modelCode = modelCode;
    }


    /**
     * Gets the modelName value for this CarDTO.
     * 
     * @return modelName
     */
    public java.lang.String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this CarDTO.
     * 
     * @param modelName
     */
    public void setModelName(java.lang.String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the frameNo value for this CarDTO.
     * 
     * @return frameNo
     */
    public java.lang.String getFrameNo() {
        return frameNo;
    }


    /**
     * Sets the frameNo value for this CarDTO.
     * 
     * @param frameNo
     */
    public void setFrameNo(java.lang.String frameNo) {
        this.frameNo = frameNo;
    }


    /**
     * Gets the vinNo value for this CarDTO.
     * 
     * @return vinNo
     */
    public java.lang.String getVinNo() {
        return vinNo;
    }


    /**
     * Sets the vinNo value for this CarDTO.
     * 
     * @param vinNo
     */
    public void setVinNo(java.lang.String vinNo) {
        this.vinNo = vinNo;
    }


    /**
     * Gets the engineNo value for this CarDTO.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this CarDTO.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the useNatureCode value for this CarDTO.
     * 
     * @return useNatureCode
     */
    public java.lang.String getUseNatureCode() {
        return useNatureCode;
    }


    /**
     * Sets the useNatureCode value for this CarDTO.
     * 
     * @param useNatureCode
     */
    public void setUseNatureCode(java.lang.String useNatureCode) {
        this.useNatureCode = useNatureCode;
    }


    /**
     * Gets the vehicleCategory value for this CarDTO.
     * 
     * @return vehicleCategory
     */
    public java.lang.String getVehicleCategory() {
        return vehicleCategory;
    }


    /**
     * Sets the vehicleCategory value for this CarDTO.
     * 
     * @param vehicleCategory
     */
    public void setVehicleCategory(java.lang.String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }


    /**
     * Gets the enrollDate value for this CarDTO.
     * 
     * @return enrollDate
     */
    public java.lang.String getEnrollDate() {
        return enrollDate;
    }


    /**
     * Sets the enrollDate value for this CarDTO.
     * 
     * @param enrollDate
     */
    public void setEnrollDate(java.lang.String enrollDate) {
        this.enrollDate = enrollDate;
    }


    /**
     * Gets the userYear value for this CarDTO.
     * 
     * @return userYear
     */
    public java.lang.Integer getUserYear() {
        return userYear;
    }


    /**
     * Sets the userYear value for this CarDTO.
     * 
     * @param userYear
     */
    public void setUserYear(java.lang.Integer userYear) {
        this.userYear = userYear;
    }


    /**
     * Gets the runMiles value for this CarDTO.
     * 
     * @return runMiles
     */
    public java.lang.Double getRunMiles() {
        return runMiles;
    }


    /**
     * Sets the runMiles value for this CarDTO.
     * 
     * @param runMiles
     */
    public void setRunMiles(java.lang.Double runMiles) {
        this.runMiles = runMiles;
    }


    /**
     * Gets the colorCode value for this CarDTO.
     * 
     * @return colorCode
     */
    public java.lang.String getColorCode() {
        return colorCode;
    }


    /**
     * Sets the colorCode value for this CarDTO.
     * 
     * @param colorCode
     */
    public void setColorCode(java.lang.String colorCode) {
        this.colorCode = colorCode;
    }


    /**
     * Gets the runAreaCode value for this CarDTO.
     * 
     * @return runAreaCode
     */
    public java.lang.String getRunAreaCode() {
        return runAreaCode;
    }


    /**
     * Sets the runAreaCode value for this CarDTO.
     * 
     * @param runAreaCode
     */
    public void setRunAreaCode(java.lang.String runAreaCode) {
        this.runAreaCode = runAreaCode;
    }


    /**
     * Gets the purchasePrice value for this CarDTO.
     * 
     * @return purchasePrice
     */
    public java.lang.Double getPurchasePrice() {
        return purchasePrice;
    }


    /**
     * Sets the purchasePrice value for this CarDTO.
     * 
     * @param purchasePrice
     */
    public void setPurchasePrice(java.lang.Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    /**
     * Gets the actualValue value for this CarDTO.
     * 
     * @return actualValue
     */
    public java.lang.Double getActualValue() {
        return actualValue;
    }


    /**
     * Sets the actualValue value for this CarDTO.
     * 
     * @param actualValue
     */
    public void setActualValue(java.lang.Double actualValue) {
        this.actualValue = actualValue;
    }


    /**
     * Gets the clauseType value for this CarDTO.
     * 
     * @return clauseType
     */
    public java.lang.String getClauseType() {
        return clauseType;
    }


    /**
     * Sets the clauseType value for this CarDTO.
     * 
     * @param clauseType
     */
    public void setClauseType(java.lang.String clauseType) {
        this.clauseType = clauseType;
    }


    /**
     * Gets the violatedTimes value for this CarDTO.
     * 
     * @return violatedTimes
     */
    public java.lang.Integer getViolatedTimes() {
        return violatedTimes;
    }


    /**
     * Sets the violatedTimes value for this CarDTO.
     * 
     * @param violatedTimes
     */
    public void setViolatedTimes(java.lang.Integer violatedTimes) {
        this.violatedTimes = violatedTimes;
    }


    /**
     * Gets the ecdemicVehicle value for this CarDTO.
     * 
     * @return ecdemicVehicle
     */
    public java.lang.String getEcdemicVehicle() {
        return ecdemicVehicle;
    }


    /**
     * Sets the ecdemicVehicle value for this CarDTO.
     * 
     * @param ecdemicVehicle
     */
    public void setEcdemicVehicle(java.lang.String ecdemicVehicle) {
        this.ecdemicVehicle = ecdemicVehicle;
    }


    /**
     * Gets the transferDate value for this CarDTO.
     * 
     * @return transferDate
     */
    public java.lang.String getTransferDate() {
        return transferDate;
    }


    /**
     * Sets the transferDate value for this CarDTO.
     * 
     * @param transferDate
     */
    public void setTransferDate(java.lang.String transferDate) {
        this.transferDate = transferDate;
    }


    /**
     * Gets the newVehicle value for this CarDTO.
     * 
     * @return newVehicle
     */
    public java.lang.String getNewVehicle() {
        return newVehicle;
    }


    /**
     * Sets the newVehicle value for this CarDTO.
     * 
     * @param newVehicle
     */
    public void setNewVehicle(java.lang.String newVehicle) {
        this.newVehicle = newVehicle;
    }


    /**
     * Gets the noLicenseFlag value for this CarDTO.
     * 
     * @return noLicenseFlag
     */
    public java.lang.String getNoLicenseFlag() {
        return noLicenseFlag;
    }


    /**
     * Sets the noLicenseFlag value for this CarDTO.
     * 
     * @param noLicenseFlag
     */
    public void setNoLicenseFlag(java.lang.String noLicenseFlag) {
        this.noLicenseFlag = noLicenseFlag;
    }


    /**
     * Gets the chgOwnerFlag value for this CarDTO.
     * 
     * @return chgOwnerFlag
     */
    public java.lang.String getChgOwnerFlag() {
        return chgOwnerFlag;
    }


    /**
     * Sets the chgOwnerFlag value for this CarDTO.
     * 
     * @param chgOwnerFlag
     */
    public void setChgOwnerFlag(java.lang.String chgOwnerFlag) {
        this.chgOwnerFlag = chgOwnerFlag;
    }


    /**
     * Gets the safeDevice value for this CarDTO.
     * 
     * @return safeDevice
     */
    public java.lang.String getSafeDevice() {
        return safeDevice;
    }


    /**
     * Sets the safeDevice value for this CarDTO.
     * 
     * @param safeDevice
     */
    public void setSafeDevice(java.lang.String safeDevice) {
        this.safeDevice = safeDevice;
    }


    /**
     * Gets the parkSite value for this CarDTO.
     * 
     * @return parkSite
     */
    public java.lang.String getParkSite() {
        return parkSite;
    }


    /**
     * Sets the parkSite value for this CarDTO.
     * 
     * @param parkSite
     */
    public void setParkSite(java.lang.String parkSite) {
        this.parkSite = parkSite;
    }


    /**
     * Gets the certificateDate value for this CarDTO.
     * 
     * @return certificateDate
     */
    public java.lang.String getCertificateDate() {
        return certificateDate;
    }


    /**
     * Sets the certificateDate value for this CarDTO.
     * 
     * @param certificateDate
     */
    public void setCertificateDate(java.lang.String certificateDate) {
        this.certificateDate = certificateDate;
    }


    /**
     * Gets the vehicleBrand value for this CarDTO.
     * 
     * @return vehicleBrand
     */
    public java.lang.String getVehicleBrand() {
        return vehicleBrand;
    }


    /**
     * Sets the vehicleBrand value for this CarDTO.
     * 
     * @param vehicleBrand
     */
    public void setVehicleBrand(java.lang.String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }


    /**
     * Gets the noDamageYears value for this CarDTO.
     * 
     * @return noDamageYears
     */
    public java.lang.Integer getNoDamageYears() {
        return noDamageYears;
    }


    /**
     * Sets the noDamageYears value for this CarDTO.
     * 
     * @param noDamageYears
     */
    public void setNoDamageYears(java.lang.Integer noDamageYears) {
        this.noDamageYears = noDamageYears;
    }


    /**
     * Gets the loanVehicleFlag value for this CarDTO.
     * 
     * @return loanVehicleFlag
     */
    public java.lang.String getLoanVehicleFlag() {
        return loanVehicleFlag;
    }


    /**
     * Sets the loanVehicleFlag value for this CarDTO.
     * 
     * @param loanVehicleFlag
     */
    public void setLoanVehicleFlag(java.lang.String loanVehicleFlag) {
        this.loanVehicleFlag = loanVehicleFlag;
    }


    /**
     * Gets the specialCarFlag value for this CarDTO.
     * 
     * @return specialCarFlag
     */
    public java.lang.String getSpecialCarFlag() {
        return specialCarFlag;
    }


    /**
     * Sets the specialCarFlag value for this CarDTO.
     * 
     * @param specialCarFlag
     */
    public void setSpecialCarFlag(java.lang.String specialCarFlag) {
        this.specialCarFlag = specialCarFlag;
    }


    /**
     * Gets the fuelType value for this CarDTO.
     * 
     * @return fuelType
     */
    public java.lang.String getFuelType() {
        return fuelType;
    }


    /**
     * Sets the fuelType value for this CarDTO.
     * 
     * @param fuelType
     */
    public void setFuelType(java.lang.String fuelType) {
        this.fuelType = fuelType;
    }


    /**
     * Gets the net value for this CarDTO.
     * 
     * @return net
     */
    public java.lang.Double getNet() {
        return net;
    }


    /**
     * Sets the net value for this CarDTO.
     * 
     * @param net
     */
    public void setNet(java.lang.Double net) {
        this.net = net;
    }


    /**
     * Gets the exhaustScale value for this CarDTO.
     * 
     * @return exhaustScale
     */
    public java.lang.Double getExhaustScale() {
        return exhaustScale;
    }


    /**
     * Sets the exhaustScale value for this CarDTO.
     * 
     * @param exhaustScale
     */
    public void setExhaustScale(java.lang.Double exhaustScale) {
        this.exhaustScale = exhaustScale;
    }


    /**
     * Gets the powerScale value for this CarDTO.
     * 
     * @return powerScale
     */
    public java.lang.Double getPowerScale() {
        return powerScale;
    }


    /**
     * Sets the powerScale value for this CarDTO.
     * 
     * @param powerScale
     */
    public void setPowerScale(java.lang.Double powerScale) {
        this.powerScale = powerScale;
    }


    /**
     * Gets the seatCount value for this CarDTO.
     * 
     * @return seatCount
     */
    public java.lang.Integer getSeatCount() {
        return seatCount;
    }


    /**
     * Sets the seatCount value for this CarDTO.
     * 
     * @param seatCount
     */
    public void setSeatCount(java.lang.Integer seatCount) {
        this.seatCount = seatCount;
    }


    /**
     * Gets the tonCount value for this CarDTO.
     * 
     * @return tonCount
     */
    public java.lang.Double getTonCount() {
        return tonCount;
    }


    /**
     * Sets the tonCount value for this CarDTO.
     * 
     * @param tonCount
     */
    public void setTonCount(java.lang.Double tonCount) {
        this.tonCount = tonCount;
    }


    /**
     * Gets the madeFactory value for this CarDTO.
     * 
     * @return madeFactory
     */
    public java.lang.String getMadeFactory() {
        return madeFactory;
    }


    /**
     * Sets the madeFactory value for this CarDTO.
     * 
     * @param madeFactory
     */
    public void setMadeFactory(java.lang.String madeFactory) {
        this.madeFactory = madeFactory;
    }


    /**
     * Gets the status value for this CarDTO.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CarDTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the fleetFlag value for this CarDTO.
     * 
     * @return fleetFlag
     */
    public java.lang.String getFleetFlag() {
        return fleetFlag;
    }


    /**
     * Sets the fleetFlag value for this CarDTO.
     * 
     * @param fleetFlag
     */
    public void setFleetFlag(java.lang.String fleetFlag) {
        this.fleetFlag = fleetFlag;
    }


    /**
     * Gets the carChecker value for this CarDTO.
     * 
     * @return carChecker
     */
    public java.lang.String getCarChecker() {
        return carChecker;
    }


    /**
     * Sets the carChecker value for this CarDTO.
     * 
     * @param carChecker
     */
    public void setCarChecker(java.lang.String carChecker) {
        this.carChecker = carChecker;
    }


    /**
     * Gets the carCheckStatus value for this CarDTO.
     * 
     * @return carCheckStatus
     */
    public java.lang.String getCarCheckStatus() {
        return carCheckStatus;
    }


    /**
     * Sets the carCheckStatus value for this CarDTO.
     * 
     * @param carCheckStatus
     */
    public void setCarCheckStatus(java.lang.String carCheckStatus) {
        this.carCheckStatus = carCheckStatus;
    }


    /**
     * Gets the uncheckReasonCode value for this CarDTO.
     * 
     * @return uncheckReasonCode
     */
    public java.lang.String getUncheckReasonCode() {
        return uncheckReasonCode;
    }


    /**
     * Sets the uncheckReasonCode value for this CarDTO.
     * 
     * @param uncheckReasonCode
     */
    public void setUncheckReasonCode(java.lang.String uncheckReasonCode) {
        this.uncheckReasonCode = uncheckReasonCode;
    }


    /**
     * Gets the carCheckTime value for this CarDTO.
     * 
     * @return carCheckTime
     */
    public java.lang.String getCarCheckTime() {
        return carCheckTime;
    }


    /**
     * Sets the carCheckTime value for this CarDTO.
     * 
     * @param carCheckTime
     */
    public void setCarCheckTime(java.lang.String carCheckTime) {
        this.carCheckTime = carCheckTime;
    }


    /**
     * Gets the carRegiste value for this CarDTO.
     * 
     * @return carRegiste
     */
    public java.lang.String getCarRegiste() {
        return carRegiste;
    }


    /**
     * Sets the carRegiste value for this CarDTO.
     * 
     * @param carRegiste
     */
    public void setCarRegiste(java.lang.String carRegiste) {
        this.carRegiste = carRegiste;
    }


    /**
     * Gets the carTypeAlias value for this CarDTO.
     * 
     * @return carTypeAlias
     */
    public java.lang.String getCarTypeAlias() {
        return carTypeAlias;
    }


    /**
     * Sets the carTypeAlias value for this CarDTO.
     * 
     * @param carTypeAlias
     */
    public void setCarTypeAlias(java.lang.String carTypeAlias) {
        this.carTypeAlias = carTypeAlias;
    }


    /**
     * Gets the industryModelCode value for this CarDTO.
     * 
     * @return industryModelCode
     */
    public java.lang.String getIndustryModelCode() {
        return industryModelCode;
    }


    /**
     * Sets the industryModelCode value for this CarDTO.
     * 
     * @param industryModelCode
     */
    public void setIndustryModelCode(java.lang.String industryModelCode) {
        this.industryModelCode = industryModelCode;
    }


    /**
     * Gets the basicRateCode value for this CarDTO.
     * 
     * @return basicRateCode
     */
    public java.lang.String getBasicRateCode() {
        return basicRateCode;
    }


    /**
     * Sets the basicRateCode value for this CarDTO.
     * 
     * @param basicRateCode
     */
    public void setBasicRateCode(java.lang.String basicRateCode) {
        this.basicRateCode = basicRateCode;
    }


    /**
     * Gets the industryVehicleCode value for this CarDTO.
     * 
     * @return industryVehicleCode
     */
    public java.lang.String getIndustryVehicleCode() {
        return industryVehicleCode;
    }


    /**
     * Sets the industryVehicleCode value for this CarDTO.
     * 
     * @param industryVehicleCode
     */
    public void setIndustryVehicleCode(java.lang.String industryVehicleCode) {
        this.industryVehicleCode = industryVehicleCode;
    }


    /**
     * Gets the industryVehicleName value for this CarDTO.
     * 
     * @return industryVehicleName
     */
    public java.lang.String getIndustryVehicleName() {
        return industryVehicleName;
    }


    /**
     * Sets the industryVehicleName value for this CarDTO.
     * 
     * @param industryVehicleName
     */
    public void setIndustryVehicleName(java.lang.String industryVehicleName) {
        this.industryVehicleName = industryVehicleName;
    }


    /**
     * Gets the specialModelFlag value for this CarDTO.
     * 
     * @return specialModelFlag
     */
    public java.lang.String getSpecialModelFlag() {
        return specialModelFlag;
    }


    /**
     * Sets the specialModelFlag value for this CarDTO.
     * 
     * @param specialModelFlag
     */
    public void setSpecialModelFlag(java.lang.String specialModelFlag) {
        this.specialModelFlag = specialModelFlag;
    }


    /**
     * Gets the extendInfo value for this CarDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this CarDTO.
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
        if (!(obj instanceof CarDTO)) return false;
        CarDTO other = (CarDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pmQueryNo==null && other.getPmQueryNo()==null) || 
             (this.pmQueryNo!=null &&
              this.pmQueryNo.equals(other.getPmQueryNo()))) &&
            ((this.carinsureDrelation==null && other.getCarinsureDrelation()==null) || 
             (this.carinsureDrelation!=null &&
              this.carinsureDrelation.equals(other.getCarinsureDrelation()))) &&
            ((this.carOwner==null && other.getCarOwner()==null) || 
             (this.carOwner!=null &&
              this.carOwner.equals(other.getCarOwner()))) &&
            ((this.vehicleID==null && other.getVehicleID()==null) || 
             (this.vehicleID!=null &&
              this.vehicleID.equals(other.getVehicleID()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.licenseColorcode==null && other.getLicenseColorcode()==null) || 
             (this.licenseColorcode!=null &&
              this.licenseColorcode.equals(other.getLicenseColorcode()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.importFlag==null && other.getImportFlag()==null) || 
             (this.importFlag!=null &&
              this.importFlag.equals(other.getImportFlag()))) &&
            ((this.carKindCode==null && other.getCarKindCode()==null) || 
             (this.carKindCode!=null &&
              this.carKindCode.equals(other.getCarKindCode()))) &&
            ((this.modelCode==null && other.getModelCode()==null) || 
             (this.modelCode!=null &&
              this.modelCode.equals(other.getModelCode()))) &&
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            ((this.frameNo==null && other.getFrameNo()==null) || 
             (this.frameNo!=null &&
              this.frameNo.equals(other.getFrameNo()))) &&
            ((this.vinNo==null && other.getVinNo()==null) || 
             (this.vinNo!=null &&
              this.vinNo.equals(other.getVinNo()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            ((this.useNatureCode==null && other.getUseNatureCode()==null) || 
             (this.useNatureCode!=null &&
              this.useNatureCode.equals(other.getUseNatureCode()))) &&
            ((this.vehicleCategory==null && other.getVehicleCategory()==null) || 
             (this.vehicleCategory!=null &&
              this.vehicleCategory.equals(other.getVehicleCategory()))) &&
            ((this.enrollDate==null && other.getEnrollDate()==null) || 
             (this.enrollDate!=null &&
              this.enrollDate.equals(other.getEnrollDate()))) &&
            ((this.userYear==null && other.getUserYear()==null) || 
             (this.userYear!=null &&
              this.userYear.equals(other.getUserYear()))) &&
            ((this.runMiles==null && other.getRunMiles()==null) || 
             (this.runMiles!=null &&
              this.runMiles.equals(other.getRunMiles()))) &&
            ((this.colorCode==null && other.getColorCode()==null) || 
             (this.colorCode!=null &&
              this.colorCode.equals(other.getColorCode()))) &&
            ((this.runAreaCode==null && other.getRunAreaCode()==null) || 
             (this.runAreaCode!=null &&
              this.runAreaCode.equals(other.getRunAreaCode()))) &&
            ((this.purchasePrice==null && other.getPurchasePrice()==null) || 
             (this.purchasePrice!=null &&
              this.purchasePrice.equals(other.getPurchasePrice()))) &&
            ((this.actualValue==null && other.getActualValue()==null) || 
             (this.actualValue!=null &&
              this.actualValue.equals(other.getActualValue()))) &&
            ((this.clauseType==null && other.getClauseType()==null) || 
             (this.clauseType!=null &&
              this.clauseType.equals(other.getClauseType()))) &&
            ((this.violatedTimes==null && other.getViolatedTimes()==null) || 
             (this.violatedTimes!=null &&
              this.violatedTimes.equals(other.getViolatedTimes()))) &&
            ((this.ecdemicVehicle==null && other.getEcdemicVehicle()==null) || 
             (this.ecdemicVehicle!=null &&
              this.ecdemicVehicle.equals(other.getEcdemicVehicle()))) &&
            ((this.transferDate==null && other.getTransferDate()==null) || 
             (this.transferDate!=null &&
              this.transferDate.equals(other.getTransferDate()))) &&
            ((this.newVehicle==null && other.getNewVehicle()==null) || 
             (this.newVehicle!=null &&
              this.newVehicle.equals(other.getNewVehicle()))) &&
            ((this.noLicenseFlag==null && other.getNoLicenseFlag()==null) || 
             (this.noLicenseFlag!=null &&
              this.noLicenseFlag.equals(other.getNoLicenseFlag()))) &&
            ((this.chgOwnerFlag==null && other.getChgOwnerFlag()==null) || 
             (this.chgOwnerFlag!=null &&
              this.chgOwnerFlag.equals(other.getChgOwnerFlag()))) &&
            ((this.safeDevice==null && other.getSafeDevice()==null) || 
             (this.safeDevice!=null &&
              this.safeDevice.equals(other.getSafeDevice()))) &&
            ((this.parkSite==null && other.getParkSite()==null) || 
             (this.parkSite!=null &&
              this.parkSite.equals(other.getParkSite()))) &&
            ((this.certificateDate==null && other.getCertificateDate()==null) || 
             (this.certificateDate!=null &&
              this.certificateDate.equals(other.getCertificateDate()))) &&
            ((this.vehicleBrand==null && other.getVehicleBrand()==null) || 
             (this.vehicleBrand!=null &&
              this.vehicleBrand.equals(other.getVehicleBrand()))) &&
            ((this.noDamageYears==null && other.getNoDamageYears()==null) || 
             (this.noDamageYears!=null &&
              this.noDamageYears.equals(other.getNoDamageYears()))) &&
            ((this.loanVehicleFlag==null && other.getLoanVehicleFlag()==null) || 
             (this.loanVehicleFlag!=null &&
              this.loanVehicleFlag.equals(other.getLoanVehicleFlag()))) &&
            ((this.specialCarFlag==null && other.getSpecialCarFlag()==null) || 
             (this.specialCarFlag!=null &&
              this.specialCarFlag.equals(other.getSpecialCarFlag()))) &&
            ((this.fuelType==null && other.getFuelType()==null) || 
             (this.fuelType!=null &&
              this.fuelType.equals(other.getFuelType()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              this.net.equals(other.getNet()))) &&
            ((this.exhaustScale==null && other.getExhaustScale()==null) || 
             (this.exhaustScale!=null &&
              this.exhaustScale.equals(other.getExhaustScale()))) &&
            ((this.powerScale==null && other.getPowerScale()==null) || 
             (this.powerScale!=null &&
              this.powerScale.equals(other.getPowerScale()))) &&
            ((this.seatCount==null && other.getSeatCount()==null) || 
             (this.seatCount!=null &&
              this.seatCount.equals(other.getSeatCount()))) &&
            ((this.tonCount==null && other.getTonCount()==null) || 
             (this.tonCount!=null &&
              this.tonCount.equals(other.getTonCount()))) &&
            ((this.madeFactory==null && other.getMadeFactory()==null) || 
             (this.madeFactory!=null &&
              this.madeFactory.equals(other.getMadeFactory()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.fleetFlag==null && other.getFleetFlag()==null) || 
             (this.fleetFlag!=null &&
              this.fleetFlag.equals(other.getFleetFlag()))) &&
            ((this.carChecker==null && other.getCarChecker()==null) || 
             (this.carChecker!=null &&
              this.carChecker.equals(other.getCarChecker()))) &&
            ((this.carCheckStatus==null && other.getCarCheckStatus()==null) || 
             (this.carCheckStatus!=null &&
              this.carCheckStatus.equals(other.getCarCheckStatus()))) &&
            ((this.uncheckReasonCode==null && other.getUncheckReasonCode()==null) || 
             (this.uncheckReasonCode!=null &&
              this.uncheckReasonCode.equals(other.getUncheckReasonCode()))) &&
            ((this.carCheckTime==null && other.getCarCheckTime()==null) || 
             (this.carCheckTime!=null &&
              this.carCheckTime.equals(other.getCarCheckTime()))) &&
            ((this.carRegiste==null && other.getCarRegiste()==null) || 
             (this.carRegiste!=null &&
              this.carRegiste.equals(other.getCarRegiste()))) &&
            ((this.carTypeAlias==null && other.getCarTypeAlias()==null) || 
             (this.carTypeAlias!=null &&
              this.carTypeAlias.equals(other.getCarTypeAlias()))) &&
            ((this.industryModelCode==null && other.getIndustryModelCode()==null) || 
             (this.industryModelCode!=null &&
              this.industryModelCode.equals(other.getIndustryModelCode()))) &&
            ((this.basicRateCode==null && other.getBasicRateCode()==null) || 
             (this.basicRateCode!=null &&
              this.basicRateCode.equals(other.getBasicRateCode()))) &&
            ((this.industryVehicleCode==null && other.getIndustryVehicleCode()==null) || 
             (this.industryVehicleCode!=null &&
              this.industryVehicleCode.equals(other.getIndustryVehicleCode()))) &&
            ((this.industryVehicleName==null && other.getIndustryVehicleName()==null) || 
             (this.industryVehicleName!=null &&
              this.industryVehicleName.equals(other.getIndustryVehicleName()))) &&
            ((this.specialModelFlag==null && other.getSpecialModelFlag()==null) || 
             (this.specialModelFlag!=null &&
              this.specialModelFlag.equals(other.getSpecialModelFlag()))) &&
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
        if (getPmQueryNo() != null) {
            _hashCode += getPmQueryNo().hashCode();
        }
        if (getCarinsureDrelation() != null) {
            _hashCode += getCarinsureDrelation().hashCode();
        }
        if (getCarOwner() != null) {
            _hashCode += getCarOwner().hashCode();
        }
        if (getVehicleID() != null) {
            _hashCode += getVehicleID().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLicenseColorcode() != null) {
            _hashCode += getLicenseColorcode().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getImportFlag() != null) {
            _hashCode += getImportFlag().hashCode();
        }
        if (getCarKindCode() != null) {
            _hashCode += getCarKindCode().hashCode();
        }
        if (getModelCode() != null) {
            _hashCode += getModelCode().hashCode();
        }
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        if (getFrameNo() != null) {
            _hashCode += getFrameNo().hashCode();
        }
        if (getVinNo() != null) {
            _hashCode += getVinNo().hashCode();
        }
        if (getEngineNo() != null) {
            _hashCode += getEngineNo().hashCode();
        }
        if (getUseNatureCode() != null) {
            _hashCode += getUseNatureCode().hashCode();
        }
        if (getVehicleCategory() != null) {
            _hashCode += getVehicleCategory().hashCode();
        }
        if (getEnrollDate() != null) {
            _hashCode += getEnrollDate().hashCode();
        }
        if (getUserYear() != null) {
            _hashCode += getUserYear().hashCode();
        }
        if (getRunMiles() != null) {
            _hashCode += getRunMiles().hashCode();
        }
        if (getColorCode() != null) {
            _hashCode += getColorCode().hashCode();
        }
        if (getRunAreaCode() != null) {
            _hashCode += getRunAreaCode().hashCode();
        }
        if (getPurchasePrice() != null) {
            _hashCode += getPurchasePrice().hashCode();
        }
        if (getActualValue() != null) {
            _hashCode += getActualValue().hashCode();
        }
        if (getClauseType() != null) {
            _hashCode += getClauseType().hashCode();
        }
        if (getViolatedTimes() != null) {
            _hashCode += getViolatedTimes().hashCode();
        }
        if (getEcdemicVehicle() != null) {
            _hashCode += getEcdemicVehicle().hashCode();
        }
        if (getTransferDate() != null) {
            _hashCode += getTransferDate().hashCode();
        }
        if (getNewVehicle() != null) {
            _hashCode += getNewVehicle().hashCode();
        }
        if (getNoLicenseFlag() != null) {
            _hashCode += getNoLicenseFlag().hashCode();
        }
        if (getChgOwnerFlag() != null) {
            _hashCode += getChgOwnerFlag().hashCode();
        }
        if (getSafeDevice() != null) {
            _hashCode += getSafeDevice().hashCode();
        }
        if (getParkSite() != null) {
            _hashCode += getParkSite().hashCode();
        }
        if (getCertificateDate() != null) {
            _hashCode += getCertificateDate().hashCode();
        }
        if (getVehicleBrand() != null) {
            _hashCode += getVehicleBrand().hashCode();
        }
        if (getNoDamageYears() != null) {
            _hashCode += getNoDamageYears().hashCode();
        }
        if (getLoanVehicleFlag() != null) {
            _hashCode += getLoanVehicleFlag().hashCode();
        }
        if (getSpecialCarFlag() != null) {
            _hashCode += getSpecialCarFlag().hashCode();
        }
        if (getFuelType() != null) {
            _hashCode += getFuelType().hashCode();
        }
        if (getNet() != null) {
            _hashCode += getNet().hashCode();
        }
        if (getExhaustScale() != null) {
            _hashCode += getExhaustScale().hashCode();
        }
        if (getPowerScale() != null) {
            _hashCode += getPowerScale().hashCode();
        }
        if (getSeatCount() != null) {
            _hashCode += getSeatCount().hashCode();
        }
        if (getTonCount() != null) {
            _hashCode += getTonCount().hashCode();
        }
        if (getMadeFactory() != null) {
            _hashCode += getMadeFactory().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFleetFlag() != null) {
            _hashCode += getFleetFlag().hashCode();
        }
        if (getCarChecker() != null) {
            _hashCode += getCarChecker().hashCode();
        }
        if (getCarCheckStatus() != null) {
            _hashCode += getCarCheckStatus().hashCode();
        }
        if (getUncheckReasonCode() != null) {
            _hashCode += getUncheckReasonCode().hashCode();
        }
        if (getCarCheckTime() != null) {
            _hashCode += getCarCheckTime().hashCode();
        }
        if (getCarRegiste() != null) {
            _hashCode += getCarRegiste().hashCode();
        }
        if (getCarTypeAlias() != null) {
            _hashCode += getCarTypeAlias().hashCode();
        }
        if (getIndustryModelCode() != null) {
            _hashCode += getIndustryModelCode().hashCode();
        }
        if (getBasicRateCode() != null) {
            _hashCode += getBasicRateCode().hashCode();
        }
        if (getIndustryVehicleCode() != null) {
            _hashCode += getIndustryVehicleCode().hashCode();
        }
        if (getIndustryVehicleName() != null) {
            _hashCode += getIndustryVehicleName().hashCode();
        }
        if (getSpecialModelFlag() != null) {
            _hashCode += getSpecialModelFlag().hashCode();
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
        new org.apache.axis.description.TypeDesc(CarDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmQueryNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "pmQueryNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carinsureDrelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carinsureDrelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vehicleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "licenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseColorcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "licenseColorcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "importFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carKindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carKindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "modelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "modelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "frameNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vinNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "engineNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "useNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vehicleCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "enrollDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "userYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runMiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "runMiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "colorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "runAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "purchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "actualValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clauseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "clauseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatedTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "violatedTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecdemicVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "ecdemicVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "transferDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newVehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "newVehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noLicenseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "noLicenseFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chgOwnerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "chgOwnerFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safeDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "safeDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkSite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "parkSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "certificateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "vehicleBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noDamageYears");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "noDamageYears"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanVehicleFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "loanVehicleFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialCarFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "specialCarFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "fuelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "net"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhaustScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "exhaustScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "powerScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "seatCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tonCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "tonCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madeFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "madeFactory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fleetFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "fleetFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carCheckStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carCheckStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncheckReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "uncheckReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carCheckTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carCheckTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carRegiste");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carRegiste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carTypeAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carTypeAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryModelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "industryModelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicRateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "basicRateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryVehicleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "industryVehicleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryVehicleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "industryVehicleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialModelFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "specialModelFlag"));
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
