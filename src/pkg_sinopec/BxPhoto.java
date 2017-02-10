/**
 * 
 */
package pkg_sinopec;

//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.zip.GZIPOutputStream;

//import oracle.sql.BLOB;

//import org.apache.log4j.Logger;
/**
 * @author Administrator
 *
 */
public class BxPhoto {
	//private  Logger log = Logger.getLogger(BxPhoto.class);
	public boolean insert_lj(int xh,String id,String org_code,String filepath,int ddid,String lb) throws Exception {
		boolean tag=false;
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,dd_id,rq,zjh,wjm)values(?,?,?,?,sysdate,?,?)");
			stmt.setInt(1, xh);
			stmt.setString(2, lb);
			stmt.setString(3, org_code);
			stmt.setInt(4, ddid);
			stmt.setString(5, id);
			stmt.setString(6, filepath);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			try {
					if (con != null) {
					con.rollback();//出现sql异常，事务回滚
					con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (SQLException se) {
				se.printStackTrace();
				//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			}
		}
		return tag;
	}
/*	
 public  void insert(String mark,String org_code,String filepath,String zjh) throws Exception {
		Cls_connect cn = new Cls_connect();
		Connection con = cn.connect().getConnection();
		Cls_gg gg = new Cls_gg();
		int xh = gg.getint("select TFEE_ID.nextval from dual");
		con.setAutoCommit(false);//很关键，否则下面的update会抱错
		PreparedStatement p = null;
		p = con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq,zjh)values(?,?,?,?,sysdate,?)");
		p.setInt(1, xh);
		p.setString(2, mark);
		p.setString(3, org_code);
		p.setBlob(4, BLOB.empty_lob());//此BLOB乃oracle.sql.BLOB类
		p.setString(5, zjh);
		p.executeUpdate();
		p.close();
		p = con.prepareStatement("select PHOTO from kcs_specphoto where serial_no=? for update");
		// select for update的好处是先锁住此行，防止并发问题
		p.setInt(1, xh);
		ResultSet rs = p.executeQuery();
		rs.next();
		oracle.sql.BLOB blob = (oracle.sql.BLOB) rs.getBlob("PHOTO");//jboss
		//weblogic.jdbc.vendor.oracle.OracleThinBlob blob = (weblogic.jdbc.vendor.oracle.OracleThinBlob)rs.getBlob("PHOTO");//weblogic jndi
		FileInputStream in = new FileInputStream(filepath);
		GZIPOutputStream out = new GZIPOutputStream(blob.getBinaryOutputStream());
		byte[] buf = new byte[blob.getBufferSize()];//缓冲的大小用这种方式获得性能最好
		int len;
		while ((len = in.read(buf)) > 0) {
		out.write(buf, 0, len);
		}
		out.flush();
		out.close();
		in.close();
		p.close();
		con.commit();
		con.close();

		}
		*/
	/*public  void insert2(String mark,String org_code,String filepath,String zjh) throws Exception {
		Cls_connect cn = new Cls_connect();
		Connection con = cn.connect().getConnection();
		Cls_gg gg = new Cls_gg();
		int xh = gg.getint("select TFEE_ID.nextval from dual");
		con.setAutoCommit(false);//很关键，否则下面的update会抱错
		PreparedStatement p = null;
		p = con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq,zjh)values(?,?,?,?,sysdate,?)");
		p.setInt(1, xh);
		p.setString(2, mark);
		p.setString(3, org_code);
		p.setBlob(4, BLOB.empty_lob());//此BLOB乃oracle.sql.BLOB类
		p.setString(5, zjh);
		p.executeUpdate();
		p.close();
		p = con.prepareStatement("select PHOTO from kcs_specphoto where serial_no=? for update");
		// select for update的好处是先锁住此行，防止并发问题
		p.setInt(1, xh);
		ResultSet rs = p.executeQuery();
		rs.next();
		//oracle.sql.BLOB blob = (oracle.sql.BLOB) rs.getBlob("PHOTO");//jboss
		weblogic.jdbc.vendor.oracle.OracleThinBlob blob = (weblogic.jdbc.vendor.oracle.OracleThinBlob)rs.getBlob("PHOTO");//weblogic jndi
		FileInputStream in = new FileInputStream(filepath);
		GZIPOutputStream out = new GZIPOutputStream(blob.getBinaryOutputStream());
		byte[] buf = new byte[blob.getBufferSize()];//缓冲的大小用这种方式获得性能最好
		int len;
		while ((len = in.read(buf)) > 0) {
		out.write(buf, 0, len);
		}
		out.flush();
		out.close();
		in.close();
		p.close();
		con.commit();
		con.close();

		}	
	
	*/
	
}
