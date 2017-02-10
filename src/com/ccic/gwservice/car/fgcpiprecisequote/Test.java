/**
 * 
 */
package com.ccic.gwservice.car.fgcpiprecisequote;

import java.rmi.RemoteException;
import org.apache.axis.AxisProperties;

import pkg_auto.autobj.ccic.serverProcess.Ccic_CarFGPreciseQuoteIn;
import pkg_auto.autobj.pojo.Ccic_endpoint;

/**
 * @author Administrator
 *
 */
public class Test {
	public static void testchx(){
		Ccic_CarFGPreciseQuoteIn ccic_carPQ= new Ccic_CarFGPreciseQuoteIn();
		String jycode="f937702c-5fd2-464d-a7f7-cd1c6b6b67e6";
    	FGPreciseQuoteRequest fgCarPQRequest = ccic_carPQ.getFGPreciseQuoteRequest(jycode,"1", "3","62601171");
    	try {
    	AxisProperties.setProperty("axis.socketSecureFactory","pkg_sinopec.autobj.mySsl.MyCustomSSLSocketFactory");
    	FGPreciseQuoteProxy proxy = new FGPreciseQuoteProxy(Ccic_endpoint.getUrlCcicCarfgprecisequote());
    	FGPreciseQuoteResponse fgCarPQResponse;
		System.out.println(fgCarPQRequest.getRequestBody().getStartDate());
			fgCarPQResponse = proxy.fgpreciseQuote(fgCarPQRequest);
		if (fgCarPQResponse!=null) {
    		System.out.println("has response");
    		com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO  responseHead = fgCarPQResponse.getResponseHead();
    		int mark = responseHead.getStatus();	
    		System.out.println("mark="+mark);
  		    if (mark==0){//≤È—Ø≥…π¶
  		    	
  		    }
    	}	
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	  public static void main(String[] args){
		  
		  testchx();
		  
	  }	
}
