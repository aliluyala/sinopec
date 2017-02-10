package com.ccic.gwservice.car.fgcpiprecisequote;

public class FGPreciseQuoteProxy implements com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote {
  private String _endpoint = null;
  private com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote fGPreciseQuote = null;
  
  public FGPreciseQuoteProxy() {
    _initFGPreciseQuoteProxy();
  }
  
  public FGPreciseQuoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initFGPreciseQuoteProxy();
  }
  
  private void _initFGPreciseQuoteProxy() {
    try {
      fGPreciseQuote = (new com.ccic.gwservice.car.fgcpiprecisequote.FGCpiPreciseQuoteServiceLocator()).getFGCpiPreciseQuoteEndpoint();
      if (fGPreciseQuote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fGPreciseQuote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fGPreciseQuote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fGPreciseQuote != null)
      ((javax.xml.rpc.Stub)fGPreciseQuote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuote getFGPreciseQuote() {
    if (fGPreciseQuote == null)
      _initFGPreciseQuoteProxy();
    return fGPreciseQuote;
  }
  
  public com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteResponse fgpreciseQuote(com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteRequest preciseQuoteRequest) throws java.rmi.RemoteException{
    if (fGPreciseQuote == null)
      _initFGPreciseQuoteProxy();
    return fGPreciseQuote.fgpreciseQuote(preciseQuoteRequest);
  }
  
  
}