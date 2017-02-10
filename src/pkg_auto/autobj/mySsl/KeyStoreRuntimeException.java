/**
 * 
 */
package pkg_auto.autobj.mySsl;

/**
 * @author Administrator
 *
 */
public class KeyStoreRuntimeException  extends RuntimeException {
	 private static final long serialVersionUID = 1L;

     public KeyStoreRuntimeException(String message, Throwable cause) {
         super(message, cause);
     }

     public KeyStoreRuntimeException(Throwable cause) {
         super(cause);
     }
}
