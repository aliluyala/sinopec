package pkg_sinopec;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.zip.GZIPOutputStream;
import oracle.sql.BLOB;

//import org.apache.log4j.Logger;

/**
 * @author Administrator
 * 
 */
public class photo {
	// private Logger log = Logger.getLogger(photo.class);
	public void insert(int xh, String mark, String org_code, String filepath)
			throws Exception {
		java.sql.Connection con = null;
		PreparedStatement p = null;
		java.sql.ResultSet rs = null;
		GZIPOutputStream out = null;
		FileInputStream in = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);// 很关键，否则下面的update会抱错
			p = null;
			p = con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq)values(?,?,?,?,sysdate)");
			p.setInt(1, xh);
			p.setString(2, mark);
			p.setString(3, org_code);
			p.setBlob(4, BLOB.empty_lob());// 此BLOB乃oracle.sql.BLOB类
			a = p.executeUpdate();
			p.close();
			if (a > 0) {
				p = con.prepareStatement("select PHOTO from kcs_specphoto where serial_no=? for update");
				// select for update的好处是先锁住此行，防止并发问题
				p.setInt(1, xh);
				rs = p.executeQuery();
				rs.next();
				oracle.sql.BLOB blob = (oracle.sql.BLOB) rs.getBlob("PHOTO");// jboss
				// weblogic.jdbc.vendor.oracle.OracleThinBlob blob =
				// (weblogic.jdbc.vendor.oracle.OracleThinBlob)rs.getBlob("PHOTO");//weblogic
				// jndi
				in = new FileInputStream(filepath);
				out = new GZIPOutputStream(blob.getBinaryOutputStream());
				byte[] buf = new byte[blob.getBufferSize()];// 缓冲的大小用这种方式获得性能最好
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
		} catch (SQLException se) {
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				rs = null;
			}
			if (p != null) {
				try {
					p.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				p = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				con = null;
			}
		}
	}

	public void insert2(int xh, String mark, String org_code, String filepath)
			throws Exception {
		java.sql.Connection con = null;
		PreparedStatement p = null;
		java.sql.ResultSet rs = null;
		GZIPOutputStream out = null;
		FileInputStream in = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();

			con.setAutoCommit(false);// 很关键，否则下面的update会抱错
			p = null;
			p = con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq)values(?,?,?,?,sysdate)");
			p.setInt(1, xh);
			p.setString(2, mark);
			p.setString(3, org_code);
			p.setBlob(4, BLOB.empty_lob());// 此BLOB乃oracle.sql.BLOB类
			// log.error("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq)values("+xh+","+mark+","+org_code+",?,sysdate)");
			a = p.executeUpdate();
			p.close();
			if (a > 0) {
				p = con.prepareStatement("select PHOTO from kcs_specphoto where serial_no=? for update");
				// select for update的好处是先锁住此行，防止并发问题
				p.setInt(1, xh);
				rs = p.executeQuery();
				rs.next();

				// Object obj = rs.getBlob("PHOTO");
				// Class clazz = obj.getClass();
				// Method method = clazz.getMethod("getBinaryOutputStream", new
				// Class[]{});
				// oracle.sql.BLOB blob = (oracle.sql.BLOB)method.invoke(obj,
				// new
				// Object[]{});
				weblogic.jdbc.vendor.oracle.OracleThinBlob blob = (weblogic.jdbc.vendor.oracle.OracleThinBlob) rs
						.getBlob("PHOTO");
				in = new FileInputStream(filepath);
				out = new GZIPOutputStream(blob.getBinaryOutputStream());
				byte[] buf = new byte[blob.getBufferSize()];// 缓冲的大小用这种方式获得性能最好
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				out.flush();
				out.close();
				in.close();
				p.close();
				// p =
				// con.prepareStatement("update KCS_ETCPHOTO set PHOTO =? where serial_no=?");
				// p.setBlob(1, blob);
				// p.setInt(2, xh);
				// p.executeUpdate();
				con.commit();
				con.close();
			}
		} catch (SQLException se) {
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				rs = null;
			}
			if (p != null) {
				try {
					p.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				p = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				con = null;
			}
		}
	}

	public void insert2(String mark, String org_code, String filepath)
			throws Exception {
		java.sql.Connection con = null;
		PreparedStatement p = null;
		java.sql.ResultSet rs = null;
		GZIPOutputStream out = null;
		FileInputStream in = null;
		Cls_gg gg = new Cls_gg();
		int xh = gg.getint("select TFEE_ID.nextval from dual");
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();

			con.setAutoCommit(false);// 很关键，否则下面的update会抱错
			p = null;
			p = con.prepareStatement("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq)values(?,?,?,?,sysdate)");
			p.setInt(1, xh);
			p.setString(2, mark);
			p.setString(3, org_code);
			p.setBlob(4, BLOB.empty_lob());// 此BLOB乃oracle.sql.BLOB类
			// log.error("INSERT INTO kcs_specphoto (serial_no,mark,ORG_CODE,PHOTO,rq)values("+xh+","+mark+","+org_code+",?,sysdate)");
			p.executeUpdate();
			p.close();
			p = con.prepareStatement("select PHOTO from kcs_specphoto where serial_no=? for update");
			// select for update的好处是先锁住此行，防止并发问题
			p.setInt(1, xh);
			// log.error("select PHOTO from kcs_specphoto where serial_no="+xh+" for update");
			rs = p.executeQuery();
			rs.next();

			// Object obj = rs.getBlob("PHOTO");
			// Class clazz = obj.getClass();
			// Method method = clazz.getMethod("getBinaryOutputStream", new
			// Class[]{});
			// oracle.sql.BLOB blob = (oracle.sql.BLOB)
			// rs.getBlob("PHOTO");//jboss
			weblogic.jdbc.vendor.oracle.OracleThinBlob blob = (weblogic.jdbc.vendor.oracle.OracleThinBlob) rs
					.getBlob("PHOTO");
			in = new FileInputStream(filepath);
			out = new GZIPOutputStream(blob.getBinaryOutputStream());
			byte[] buf = new byte[blob.getBufferSize()];// 缓冲的大小用这种方式获得性能最好
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			out.flush();
			out.close();
			in.close();
			p.close();
			// p =
			// con.prepareStatement("update KCS_ETCPHOTO set PHOTO =? where serial_no=?");
			// p.setBlob(1, blob);
			// p.setInt(2, xh);
			// p.executeUpdate();
			con.commit();
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				rs = null;
			}
			if (p != null) {
				try {
					p.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				p = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				con = null;
			}
		}

	}

	public void insertyt(int xh, String mark, String org_code, String filepath)
			throws Exception {
		java.sql.Connection con = null;
		PreparedStatement p = null;
		java.sql.ResultSet rs = null;
		GZIPOutputStream out = null;
		FileInputStream in = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);// 很关键，否则下面的update会抱错
			p = null;
			p = con.prepareStatement("INSERT INTO kcs_specphotoyt (serial_no,mark,ORG_CODE,PHOTO,rq)values(?,?,?,?,sysdate)");
			p.setInt(1, xh);
			p.setString(2, mark);
			p.setString(3, org_code);
			p.setBlob(4, BLOB.empty_lob());// 此BLOB乃oracle.sql.BLOB类
			p.executeUpdate();
			p.close();
			p = con.prepareStatement("select PHOTO from kcs_specphotoyt where serial_no=? for update");
			p.setInt(1, xh);
			rs = p.executeQuery();
			rs.next();
			weblogic.jdbc.vendor.oracle.OracleThinBlob blob = (weblogic.jdbc.vendor.oracle.OracleThinBlob) rs
					.getBlob("PHOTO");
			in = new FileInputStream(filepath);
			out = new GZIPOutputStream(blob.getBinaryOutputStream());
			byte[] buf = new byte[blob.getBufferSize()];// 缓冲的大小用这种方式获得性能最好
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
		} catch (SQLException se) {
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				rs = null;
			}
			if (p != null) {
				try {
					p.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				p = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("photo.insert2()" + e.toString());
				}
				con = null;
			}
		}

	}

	public boolean reset_byorgcode(String org_code, int ddid) throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		sqlUpdate.append("delete from kcs_specphoto where dd_id=" + ddid
				+ " and org_code='");
		sqlUpdate.append(org_code + "'");
		Cls_gg gg = new Cls_gg();
		boolean tag = gg.update(sqlUpdate.toString());
		gg = null;
		sqlUpdate = null;
		return tag;
	}

	public boolean reset_byorgcode(String org_code) throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		sqlUpdate
				.append("delete from kcs_specphoto where dd_id=0 and org_code='");
		sqlUpdate.append(org_code + "'");
		Cls_gg gg = new Cls_gg();
		boolean tag = gg.update(sqlUpdate.toString());
		gg = null;
		sqlUpdate = null;
		return tag;
	}

	public boolean resetyt_byorgcode(String org_code) throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		sqlUpdate
				.append("delete from kcs_specphotoyt where dd_id=0 and org_code='");
		sqlUpdate.append(org_code + "'");
		Cls_gg gg = new Cls_gg();
		boolean tag = gg.update(sqlUpdate.toString());
		gg = null;
		sqlUpdate = null;
		return tag;
	}

	public boolean keep_byorgcode(int dd_id, String org_code) throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		sqlUpdate.append("update kcs_specphoto set dd_id=" + dd_id);
		sqlUpdate.append("where dd_id=0 and org_code='" + org_code + "'");
		Cls_gg gg = new Cls_gg();
		boolean tag = gg.update(sqlUpdate.toString());
		gg = null;
		sqlUpdate = null;
		return tag;
	}

	public boolean keepyt_byorgcode(int dd_id, String org_code)
			throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		sqlUpdate.append("update kcs_specphotoyt set dd_id=" + dd_id);
		sqlUpdate.append("where dd_id=0 and org_code='" + org_code + "'");
		Cls_gg gg = new Cls_gg();
		boolean tag = gg.update(sqlUpdate.toString());
		gg = null;
		sqlUpdate = null;
		return tag;
	}

/*	public byte[] showphoto(String org_code, int mark, String dd_id)
			throws Exception {
		Cls_connect cn = new Cls_connect();
		Connection con = cn.connect().getConnection();
		PreparedStatement p = null;
		p = con.prepareStatement("select PHOTO from kcs_specphoto where org_code=? and mark=? and dd_id=?");
		p.setInt(2, mark);
		p.setString(1, org_code);
		p.setString(3, dd_id);
		ResultSet rs = p.executeQuery();
		rs.next();

		Object obj = rs.getBlob("PHOTO");
		Class clazz = obj.getClass();
		Method method = clazz
				.getMethod("getBinaryOutputStream", new Class[] {});
		oracle.sql.BLOB blob = (oracle.sql.BLOB) method.invoke(obj,
				new Object[] {});
		// oracle.sql.BLOB blob = (oracle.sql.BLOB) rs.getBlob("PHOTO");
		ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
		GZIPInputStream bos = new GZIPInputStream(blob.getBinaryStream());
		byte[] buf = new byte[blob.getBufferSize()];
		int len;
		while ((len = bos.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		bos.close();
		out.close();
		p.close();

		con.close();

		return out.toByteArray();

	}
*/
}
