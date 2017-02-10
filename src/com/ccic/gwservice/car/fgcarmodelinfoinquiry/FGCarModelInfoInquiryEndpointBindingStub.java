/**
 * FGCarModelInfoInquiryEndpointBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;

public class FGCarModelInfoInquiryEndpointBindingStub extends org.apache.axis.client.Stub implements com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiry {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FGCarModelInfoInquiry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "FGCarModelInfoInquiryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryRequest"), com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryResponse"));
        oper.setReturnClass(com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "FGCarModelInfoInquiryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public FGCarModelInfoInquiryEndpointBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FGCarModelInfoInquiryEndpointBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FGCarModelInfoInquiryEndpointBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryRequest");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", ">FGCarModelInfoInquiryResponse");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryRequestDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "CarModelInfoInquiryResponseDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ExtendInfoDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.ExtendInfoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "RequestHeadDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "ResponseHeadDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fgcarmodelinfoinquiry.car.gwservice.ccic.com/", "VehicleJingyouDTO");
            cachedSerQNames.add(qName);
            cls = com.ccic.gwservice.car.fgcarmodelinfoinquiry.VehicleJingyouDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse FGCarModelInfoInquiry(com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest FGCarModelInfoInquiryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/car/fgcarModelInfoInquiry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        //_call.setProperty(MessageContext.HTTP_TRANSPORT_VERSION, HTTPConstants.HEADER_PROTOCOL_V11);//设置使用http1.1
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FGCarModelInfoInquiry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {FGCarModelInfoInquiryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
