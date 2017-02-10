/**
 * 
 */
package pkg_auto.autobj.mySsl;

import java.io.IOException;
import java.util.Hashtable;

import javax.net.ssl.SSLContext;

import org.apache.axis.components.net.SecureSocketFactory;

import pkg_auto.autobj.mySsl.MyKeyStoreUtil.KeyStoreType;

/**
 * @author Administrator
 *
 */
public class MyCustomSSLSocketFactory extends org.apache.axis.components.net.JSSESocketFactory
 implements SecureSocketFactory {
	 /**
     * Constructor MyCustomSSLSocketFactory
     *
     * @param attributes
     */
    public MyCustomSSLSocketFactory(Hashtable attributes) {
        super(attributes);
        
    }
   private static String keystorefile="/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/autoinsurance/ccickey/test2.pfx";
   private static String trustfile="/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/autoinsurance/ccickey/ccictrues.jks";
  // private static String keystorefile="c:/test2.pfx";
  // private static String trustfile="C:/ccictrues.jks";
    /**
     * Read the keystore, init the SSL socket factory
     *
     * This overrides the parent class to provide our SocketFactory implementation.
     * @throws IOException
     */
    protected void initFactory() throws IOException {

        try {
			MyKeyManager keyManager = new MyKeyManager(KeyStoreType.PKCS12, keystorefile, "123456".toCharArray());
	        MyTrustManager trustManager = new MyTrustManager(trustfile, "123456".toCharArray());
            MySSLContext mcontext = new MySSLContext("TLS", keyManager, trustManager);
            SSLContext context = mcontext.getSSLContext();
            sslFactory = context.getSocketFactory();
        } catch (Exception e) {
       	 e.printStackTrace();
            if (e instanceof IOException) {
                throw (IOException) e;
            }
            throw new IOException(e.getMessage());
       	 
        }
    }	
	

}
