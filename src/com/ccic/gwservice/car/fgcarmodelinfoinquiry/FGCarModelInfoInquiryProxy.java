package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

public class FGCarModelInfoInquiryProxy implements com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiry {
  private String _endpoint = null;
  private com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiry fGCarModelInfoInquiry = null;
  
  public FGCarModelInfoInquiryProxy() {
    _initFGCarModelInfoInquiryProxy();
  }
  
  public FGCarModelInfoInquiryProxy(String endpoint) {
    _endpoint = endpoint;
    _initFGCarModelInfoInquiryProxy();
  }
  
  private void _initFGCarModelInfoInquiryProxy() {
    try {
      fGCarModelInfoInquiry = (new com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryServiceLocator()).getFGCarModelInfoInquiryEndpoint();
      if (fGCarModelInfoInquiry != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fGCarModelInfoInquiry)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fGCarModelInfoInquiry)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fGCarModelInfoInquiry != null)
      ((javax.xml.rpc.Stub)fGCarModelInfoInquiry)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiry getFGCarModelInfoInquiry() {
    if (fGCarModelInfoInquiry == null)
      _initFGCarModelInfoInquiryProxy();
    return fGCarModelInfoInquiry;
  }
  
  public com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse FGCarModelInfoInquiry(com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest FGCarModelInfoInquiryRequest) throws java.rmi.RemoteException{
    if (fGCarModelInfoInquiry == null)
      _initFGCarModelInfoInquiryProxy();
    return fGCarModelInfoInquiry.FGCarModelInfoInquiry(FGCarModelInfoInquiryRequest);
  }
  
  
}