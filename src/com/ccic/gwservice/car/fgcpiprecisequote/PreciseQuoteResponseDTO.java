/**
 * PreciseQuoteResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcpiprecisequote;

public class PreciseQuoteResponseDTO  implements java.io.Serializable {
    private java.lang.String querySequenceNo;

    private java.lang.String queryPastDate;

    private java.lang.String querySequenceBZNo;

    private java.lang.String queryBZPastDate;

    private java.lang.String quotationBIId;

    private java.lang.String quotationBINo;

    private java.lang.String quotationCIId;

    private java.lang.String quotationCINo;

    private java.lang.String operateDate;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String sumAmount;

    private java.lang.String sumPremium;

    private java.lang.String sumProfit;

    private java.lang.String additionalRate;

    private java.lang.String payTax;

    private java.lang.String benchmarkTax;

    private java.lang.String taxOverdue;

    private java.lang.String surCharge;

    private java.lang.String sumTax;

    private com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] kinds;

    private com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax;

    private com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO cpiResult;

    private com.ccic.gwservice.car.fgcpiprecisequote.CarDTO car;

    private com.ccic.gwservice.car.fgcpiprecisequote.TrafficInsuranceDTO trafficInsurance;

    private com.ccic.gwservice.car.fgcpiprecisequote.CommercialDTO commercial;

    private com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] checks;

    private com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO[] insPlanMain;

    private com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo;

    public PreciseQuoteResponseDTO() {
    }

    public PreciseQuoteResponseDTO(
           java.lang.String querySequenceNo,
           java.lang.String queryPastDate,
           java.lang.String querySequenceBZNo,
           java.lang.String queryBZPastDate,
           java.lang.String quotationBIId,
           java.lang.String quotationBINo,
           java.lang.String quotationCIId,
           java.lang.String quotationCINo,
           java.lang.String operateDate,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String sumAmount,
           java.lang.String sumPremium,
           java.lang.String sumProfit,
           java.lang.String additionalRate,
           java.lang.String payTax,
           java.lang.String benchmarkTax,
           java.lang.String taxOverdue,
           java.lang.String surCharge,
           java.lang.String sumTax,
           com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] kinds,
           com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax,
           com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO cpiResult,
           com.ccic.gwservice.car.fgcpiprecisequote.CarDTO car,
           com.ccic.gwservice.car.fgcpiprecisequote.TrafficInsuranceDTO trafficInsurance,
           com.ccic.gwservice.car.fgcpiprecisequote.CommercialDTO commercial,
           com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] checks,
           com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO[] insPlanMain,
           com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] extendInfo) {
           this.querySequenceNo = querySequenceNo;
           this.queryPastDate = queryPastDate;
           this.querySequenceBZNo = querySequenceBZNo;
           this.queryBZPastDate = queryBZPastDate;
           this.quotationBIId = quotationBIId;
           this.quotationBINo = quotationBINo;
           this.quotationCIId = quotationCIId;
           this.quotationCINo = quotationCINo;
           this.operateDate = operateDate;
           this.startDate = startDate;
           this.endDate = endDate;
           this.sumAmount = sumAmount;
           this.sumPremium = sumPremium;
           this.sumProfit = sumProfit;
           this.additionalRate = additionalRate;
           this.payTax = payTax;
           this.benchmarkTax = benchmarkTax;
           this.taxOverdue = taxOverdue;
           this.surCharge = surCharge;
           this.sumTax = sumTax;
           this.kinds = kinds;
           this.carTax = carTax;
           this.cpiResult = cpiResult;
           this.car = car;
           this.trafficInsurance = trafficInsurance;
           this.commercial = commercial;
           this.checks = checks;
           this.insPlanMain = insPlanMain;
           this.extendInfo = extendInfo;
    }


    /**
     * Gets the querySequenceNo value for this PreciseQuoteResponseDTO.
     * 
     * @return querySequenceNo
     */
    public java.lang.String getQuerySequenceNo() {
        return querySequenceNo;
    }


    /**
     * Sets the querySequenceNo value for this PreciseQuoteResponseDTO.
     * 
     * @param querySequenceNo
     */
    public void setQuerySequenceNo(java.lang.String querySequenceNo) {
        this.querySequenceNo = querySequenceNo;
    }


    /**
     * Gets the queryPastDate value for this PreciseQuoteResponseDTO.
     * 
     * @return queryPastDate
     */
    public java.lang.String getQueryPastDate() {
        return queryPastDate;
    }


    /**
     * Sets the queryPastDate value for this PreciseQuoteResponseDTO.
     * 
     * @param queryPastDate
     */
    public void setQueryPastDate(java.lang.String queryPastDate) {
        this.queryPastDate = queryPastDate;
    }


    /**
     * Gets the querySequenceBZNo value for this PreciseQuoteResponseDTO.
     * 
     * @return querySequenceBZNo
     */
    public java.lang.String getQuerySequenceBZNo() {
        return querySequenceBZNo;
    }


    /**
     * Sets the querySequenceBZNo value for this PreciseQuoteResponseDTO.
     * 
     * @param querySequenceBZNo
     */
    public void setQuerySequenceBZNo(java.lang.String querySequenceBZNo) {
        this.querySequenceBZNo = querySequenceBZNo;
    }


    /**
     * Gets the queryBZPastDate value for this PreciseQuoteResponseDTO.
     * 
     * @return queryBZPastDate
     */
    public java.lang.String getQueryBZPastDate() {
        return queryBZPastDate;
    }


    /**
     * Sets the queryBZPastDate value for this PreciseQuoteResponseDTO.
     * 
     * @param queryBZPastDate
     */
    public void setQueryBZPastDate(java.lang.String queryBZPastDate) {
        this.queryBZPastDate = queryBZPastDate;
    }


    /**
     * Gets the quotationBIId value for this PreciseQuoteResponseDTO.
     * 
     * @return quotationBIId
     */
    public java.lang.String getQuotationBIId() {
        return quotationBIId;
    }


    /**
     * Sets the quotationBIId value for this PreciseQuoteResponseDTO.
     * 
     * @param quotationBIId
     */
    public void setQuotationBIId(java.lang.String quotationBIId) {
        this.quotationBIId = quotationBIId;
    }


    /**
     * Gets the quotationBINo value for this PreciseQuoteResponseDTO.
     * 
     * @return quotationBINo
     */
    public java.lang.String getQuotationBINo() {
        return quotationBINo;
    }


    /**
     * Sets the quotationBINo value for this PreciseQuoteResponseDTO.
     * 
     * @param quotationBINo
     */
    public void setQuotationBINo(java.lang.String quotationBINo) {
        this.quotationBINo = quotationBINo;
    }


    /**
     * Gets the quotationCIId value for this PreciseQuoteResponseDTO.
     * 
     * @return quotationCIId
     */
    public java.lang.String getQuotationCIId() {
        return quotationCIId;
    }


    /**
     * Sets the quotationCIId value for this PreciseQuoteResponseDTO.
     * 
     * @param quotationCIId
     */
    public void setQuotationCIId(java.lang.String quotationCIId) {
        this.quotationCIId = quotationCIId;
    }


    /**
     * Gets the quotationCINo value for this PreciseQuoteResponseDTO.
     * 
     * @return quotationCINo
     */
    public java.lang.String getQuotationCINo() {
        return quotationCINo;
    }


    /**
     * Sets the quotationCINo value for this PreciseQuoteResponseDTO.
     * 
     * @param quotationCINo
     */
    public void setQuotationCINo(java.lang.String quotationCINo) {
        this.quotationCINo = quotationCINo;
    }


    /**
     * Gets the operateDate value for this PreciseQuoteResponseDTO.
     * 
     * @return operateDate
     */
    public java.lang.String getOperateDate() {
        return operateDate;
    }


    /**
     * Sets the operateDate value for this PreciseQuoteResponseDTO.
     * 
     * @param operateDate
     */
    public void setOperateDate(java.lang.String operateDate) {
        this.operateDate = operateDate;
    }


    /**
     * Gets the startDate value for this PreciseQuoteResponseDTO.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PreciseQuoteResponseDTO.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PreciseQuoteResponseDTO.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PreciseQuoteResponseDTO.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the sumAmount value for this PreciseQuoteResponseDTO.
     * 
     * @return sumAmount
     */
    public java.lang.String getSumAmount() {
        return sumAmount;
    }


    /**
     * Sets the sumAmount value for this PreciseQuoteResponseDTO.
     * 
     * @param sumAmount
     */
    public void setSumAmount(java.lang.String sumAmount) {
        this.sumAmount = sumAmount;
    }


    /**
     * Gets the sumPremium value for this PreciseQuoteResponseDTO.
     * 
     * @return sumPremium
     */
    public java.lang.String getSumPremium() {
        return sumPremium;
    }


    /**
     * Sets the sumPremium value for this PreciseQuoteResponseDTO.
     * 
     * @param sumPremium
     */
    public void setSumPremium(java.lang.String sumPremium) {
        this.sumPremium = sumPremium;
    }


    /**
     * Gets the sumProfit value for this PreciseQuoteResponseDTO.
     * 
     * @return sumProfit
     */
    public java.lang.String getSumProfit() {
        return sumProfit;
    }


    /**
     * Sets the sumProfit value for this PreciseQuoteResponseDTO.
     * 
     * @param sumProfit
     */
    public void setSumProfit(java.lang.String sumProfit) {
        this.sumProfit = sumProfit;
    }


    /**
     * Gets the additionalRate value for this PreciseQuoteResponseDTO.
     * 
     * @return additionalRate
     */
    public java.lang.String getAdditionalRate() {
        return additionalRate;
    }


    /**
     * Sets the additionalRate value for this PreciseQuoteResponseDTO.
     * 
     * @param additionalRate
     */
    public void setAdditionalRate(java.lang.String additionalRate) {
        this.additionalRate = additionalRate;
    }


    /**
     * Gets the payTax value for this PreciseQuoteResponseDTO.
     * 
     * @return payTax
     */
    public java.lang.String getPayTax() {
        return payTax;
    }


    /**
     * Sets the payTax value for this PreciseQuoteResponseDTO.
     * 
     * @param payTax
     */
    public void setPayTax(java.lang.String payTax) {
        this.payTax = payTax;
    }


    /**
     * Gets the benchmarkTax value for this PreciseQuoteResponseDTO.
     * 
     * @return benchmarkTax
     */
    public java.lang.String getBenchmarkTax() {
        return benchmarkTax;
    }


    /**
     * Sets the benchmarkTax value for this PreciseQuoteResponseDTO.
     * 
     * @param benchmarkTax
     */
    public void setBenchmarkTax(java.lang.String benchmarkTax) {
        this.benchmarkTax = benchmarkTax;
    }


    /**
     * Gets the taxOverdue value for this PreciseQuoteResponseDTO.
     * 
     * @return taxOverdue
     */
    public java.lang.String getTaxOverdue() {
        return taxOverdue;
    }


    /**
     * Sets the taxOverdue value for this PreciseQuoteResponseDTO.
     * 
     * @param taxOverdue
     */
    public void setTaxOverdue(java.lang.String taxOverdue) {
        this.taxOverdue = taxOverdue;
    }


    /**
     * Gets the surCharge value for this PreciseQuoteResponseDTO.
     * 
     * @return surCharge
     */
    public java.lang.String getSurCharge() {
        return surCharge;
    }


    /**
     * Sets the surCharge value for this PreciseQuoteResponseDTO.
     * 
     * @param surCharge
     */
    public void setSurCharge(java.lang.String surCharge) {
        this.surCharge = surCharge;
    }


    /**
     * Gets the sumTax value for this PreciseQuoteResponseDTO.
     * 
     * @return sumTax
     */
    public java.lang.String getSumTax() {
        return sumTax;
    }


    /**
     * Sets the sumTax value for this PreciseQuoteResponseDTO.
     * 
     * @param sumTax
     */
    public void setSumTax(java.lang.String sumTax) {
        this.sumTax = sumTax;
    }


    /**
     * Gets the kinds value for this PreciseQuoteResponseDTO.
     * 
     * @return kinds
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.KindDTO[] getKinds() {
        return kinds;
    }


    /**
     * Sets the kinds value for this PreciseQuoteResponseDTO.
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
     * Gets the carTax value for this PreciseQuoteResponseDTO.
     * 
     * @return carTax
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO getCarTax() {
        return carTax;
    }


    /**
     * Sets the carTax value for this PreciseQuoteResponseDTO.
     * 
     * @param carTax
     */
    public void setCarTax(com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO carTax) {
        this.carTax = carTax;
    }


    /**
     * Gets the cpiResult value for this PreciseQuoteResponseDTO.
     * 
     * @return cpiResult
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO getCpiResult() {
        return cpiResult;
    }


    /**
     * Sets the cpiResult value for this PreciseQuoteResponseDTO.
     * 
     * @param cpiResult
     */
    public void setCpiResult(com.ccic.gwservice.car.fgcpiprecisequote.CpiResultDTO cpiResult) {
        this.cpiResult = cpiResult;
    }


    /**
     * Gets the car value for this PreciseQuoteResponseDTO.
     * 
     * @return car
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CarDTO getCar() {
        return car;
    }


    /**
     * Sets the car value for this PreciseQuoteResponseDTO.
     * 
     * @param car
     */
    public void setCar(com.ccic.gwservice.car.fgcpiprecisequote.CarDTO car) {
        this.car = car;
    }


    /**
     * Gets the trafficInsurance value for this PreciseQuoteResponseDTO.
     * 
     * @return trafficInsurance
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.TrafficInsuranceDTO getTrafficInsurance() {
        return trafficInsurance;
    }


    /**
     * Sets the trafficInsurance value for this PreciseQuoteResponseDTO.
     * 
     * @param trafficInsurance
     */
    public void setTrafficInsurance(com.ccic.gwservice.car.fgcpiprecisequote.TrafficInsuranceDTO trafficInsurance) {
        this.trafficInsurance = trafficInsurance;
    }


    /**
     * Gets the commercial value for this PreciseQuoteResponseDTO.
     * 
     * @return commercial
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CommercialDTO getCommercial() {
        return commercial;
    }


    /**
     * Sets the commercial value for this PreciseQuoteResponseDTO.
     * 
     * @param commercial
     */
    public void setCommercial(com.ccic.gwservice.car.fgcpiprecisequote.CommercialDTO commercial) {
        this.commercial = commercial;
    }


    /**
     * Gets the checks value for this PreciseQuoteResponseDTO.
     * 
     * @return checks
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.CheckDTO[] getChecks() {
        return checks;
    }


    /**
     * Sets the checks value for this PreciseQuoteResponseDTO.
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
     * Gets the insPlanMain value for this PreciseQuoteResponseDTO.
     * 
     * @return insPlanMain
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO[] getInsPlanMain() {
        return insPlanMain;
    }


    /**
     * Sets the insPlanMain value for this PreciseQuoteResponseDTO.
     * 
     * @param insPlanMain
     */
    public void setInsPlanMain(com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO[] insPlanMain) {
        this.insPlanMain = insPlanMain;
    }

    public com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO getInsPlanMain(int i) {
        return this.insPlanMain[i];
    }

    public void setInsPlanMain(int i, com.ccic.gwservice.car.fgcpiprecisequote.InsPlanMainDTO _value) {
        this.insPlanMain[i] = _value;
    }


    /**
     * Gets the extendInfo value for this PreciseQuoteResponseDTO.
     * 
     * @return extendInfo
     */
    public com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO[] getExtendInfo() {
        return extendInfo;
    }


    /**
     * Sets the extendInfo value for this PreciseQuoteResponseDTO.
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
        if (!(obj instanceof PreciseQuoteResponseDTO)) return false;
        PreciseQuoteResponseDTO other = (PreciseQuoteResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySequenceNo==null && other.getQuerySequenceNo()==null) || 
             (this.querySequenceNo!=null &&
              this.querySequenceNo.equals(other.getQuerySequenceNo()))) &&
            ((this.queryPastDate==null && other.getQueryPastDate()==null) || 
             (this.queryPastDate!=null &&
              this.queryPastDate.equals(other.getQueryPastDate()))) &&
            ((this.querySequenceBZNo==null && other.getQuerySequenceBZNo()==null) || 
             (this.querySequenceBZNo!=null &&
              this.querySequenceBZNo.equals(other.getQuerySequenceBZNo()))) &&
            ((this.queryBZPastDate==null && other.getQueryBZPastDate()==null) || 
             (this.queryBZPastDate!=null &&
              this.queryBZPastDate.equals(other.getQueryBZPastDate()))) &&
            ((this.quotationBIId==null && other.getQuotationBIId()==null) || 
             (this.quotationBIId!=null &&
              this.quotationBIId.equals(other.getQuotationBIId()))) &&
            ((this.quotationBINo==null && other.getQuotationBINo()==null) || 
             (this.quotationBINo!=null &&
              this.quotationBINo.equals(other.getQuotationBINo()))) &&
            ((this.quotationCIId==null && other.getQuotationCIId()==null) || 
             (this.quotationCIId!=null &&
              this.quotationCIId.equals(other.getQuotationCIId()))) &&
            ((this.quotationCINo==null && other.getQuotationCINo()==null) || 
             (this.quotationCINo!=null &&
              this.quotationCINo.equals(other.getQuotationCINo()))) &&
            ((this.operateDate==null && other.getOperateDate()==null) || 
             (this.operateDate!=null &&
              this.operateDate.equals(other.getOperateDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.sumAmount==null && other.getSumAmount()==null) || 
             (this.sumAmount!=null &&
              this.sumAmount.equals(other.getSumAmount()))) &&
            ((this.sumPremium==null && other.getSumPremium()==null) || 
             (this.sumPremium!=null &&
              this.sumPremium.equals(other.getSumPremium()))) &&
            ((this.sumProfit==null && other.getSumProfit()==null) || 
             (this.sumProfit!=null &&
              this.sumProfit.equals(other.getSumProfit()))) &&
            ((this.additionalRate==null && other.getAdditionalRate()==null) || 
             (this.additionalRate!=null &&
              this.additionalRate.equals(other.getAdditionalRate()))) &&
            ((this.payTax==null && other.getPayTax()==null) || 
             (this.payTax!=null &&
              this.payTax.equals(other.getPayTax()))) &&
            ((this.benchmarkTax==null && other.getBenchmarkTax()==null) || 
             (this.benchmarkTax!=null &&
              this.benchmarkTax.equals(other.getBenchmarkTax()))) &&
            ((this.taxOverdue==null && other.getTaxOverdue()==null) || 
             (this.taxOverdue!=null &&
              this.taxOverdue.equals(other.getTaxOverdue()))) &&
            ((this.surCharge==null && other.getSurCharge()==null) || 
             (this.surCharge!=null &&
              this.surCharge.equals(other.getSurCharge()))) &&
            ((this.sumTax==null && other.getSumTax()==null) || 
             (this.sumTax!=null &&
              this.sumTax.equals(other.getSumTax()))) &&
            ((this.kinds==null && other.getKinds()==null) || 
             (this.kinds!=null &&
              java.util.Arrays.equals(this.kinds, other.getKinds()))) &&
            ((this.carTax==null && other.getCarTax()==null) || 
             (this.carTax!=null &&
              this.carTax.equals(other.getCarTax()))) &&
            ((this.cpiResult==null && other.getCpiResult()==null) || 
             (this.cpiResult!=null &&
              this.cpiResult.equals(other.getCpiResult()))) &&
            ((this.car==null && other.getCar()==null) || 
             (this.car!=null &&
              this.car.equals(other.getCar()))) &&
            ((this.trafficInsurance==null && other.getTrafficInsurance()==null) || 
             (this.trafficInsurance!=null &&
              this.trafficInsurance.equals(other.getTrafficInsurance()))) &&
            ((this.commercial==null && other.getCommercial()==null) || 
             (this.commercial!=null &&
              this.commercial.equals(other.getCommercial()))) &&
            ((this.checks==null && other.getChecks()==null) || 
             (this.checks!=null &&
              java.util.Arrays.equals(this.checks, other.getChecks()))) &&
            ((this.insPlanMain==null && other.getInsPlanMain()==null) || 
             (this.insPlanMain!=null &&
              java.util.Arrays.equals(this.insPlanMain, other.getInsPlanMain()))) &&
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
        if (getQuerySequenceNo() != null) {
            _hashCode += getQuerySequenceNo().hashCode();
        }
        if (getQueryPastDate() != null) {
            _hashCode += getQueryPastDate().hashCode();
        }
        if (getQuerySequenceBZNo() != null) {
            _hashCode += getQuerySequenceBZNo().hashCode();
        }
        if (getQueryBZPastDate() != null) {
            _hashCode += getQueryBZPastDate().hashCode();
        }
        if (getQuotationBIId() != null) {
            _hashCode += getQuotationBIId().hashCode();
        }
        if (getQuotationBINo() != null) {
            _hashCode += getQuotationBINo().hashCode();
        }
        if (getQuotationCIId() != null) {
            _hashCode += getQuotationCIId().hashCode();
        }
        if (getQuotationCINo() != null) {
            _hashCode += getQuotationCINo().hashCode();
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
        if (getSumAmount() != null) {
            _hashCode += getSumAmount().hashCode();
        }
        if (getSumPremium() != null) {
            _hashCode += getSumPremium().hashCode();
        }
        if (getSumProfit() != null) {
            _hashCode += getSumProfit().hashCode();
        }
        if (getAdditionalRate() != null) {
            _hashCode += getAdditionalRate().hashCode();
        }
        if (getPayTax() != null) {
            _hashCode += getPayTax().hashCode();
        }
        if (getBenchmarkTax() != null) {
            _hashCode += getBenchmarkTax().hashCode();
        }
        if (getTaxOverdue() != null) {
            _hashCode += getTaxOverdue().hashCode();
        }
        if (getSurCharge() != null) {
            _hashCode += getSurCharge().hashCode();
        }
        if (getSumTax() != null) {
            _hashCode += getSumTax().hashCode();
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
        if (getCarTax() != null) {
            _hashCode += getCarTax().hashCode();
        }
        if (getCpiResult() != null) {
            _hashCode += getCpiResult().hashCode();
        }
        if (getCar() != null) {
            _hashCode += getCar().hashCode();
        }
        if (getTrafficInsurance() != null) {
            _hashCode += getTrafficInsurance().hashCode();
        }
        if (getCommercial() != null) {
            _hashCode += getCommercial().hashCode();
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
        if (getInsPlanMain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsPlanMain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsPlanMain(), i);
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
        new org.apache.axis.description.TypeDesc(PreciseQuoteResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "PreciseQuoteResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "querySequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPastDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "queryPastDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySequenceBZNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "querySequenceBZNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryBZPastDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "queryBZPastDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationBIId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationBIId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationBINo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationBINo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationCIId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationCIId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotationCINo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "quotationCINo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("sumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "additionalRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "payTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benchmarkTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "benchmarkTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "taxOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "surCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "sumTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("carTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "carTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarTaxDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpiResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CpiResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CpiResultDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("car");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "car"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CarDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficInsurance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "trafficInsurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "TrafficInsuranceDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "commercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "CommercialDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("insPlanMain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insPlanMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fgcpiprecisequote.car.gwservice.ccic.com", "insPlanMainDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
