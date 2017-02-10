package pkg_sinopec;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author Administrator
 * 
 */
public class ExcelToDb {
	private  Logger log = Logger.getLogger(ExcelToDb.class);

	public static void main(String[] args) throws Cls_exception {

		/*
		 * String name =
		 * "C:/jboss6/server/default/deploy/sinopec.war/common/khxxdrmb.xls";
		 * Map<String, Object> map = xx_check(name);
		 * System.out.println(map.get("tag").toString()); int[] poit = (int[])
		 * map.get("xl"); System.out.println(poit[0] + "/" + poit[1] + "/" +
		 * poit[2] + "/" + poit[3] + "/" + poit[4] + "/" + poit[5] + "/" +
		 * poit[6] + "/"+ poit[7] + "/");
		 */
		// System.out.println(isdate("20141001"));
	}

	public int[] toints(String args) {
		String[] arg = args.split(",");
		int[] a = new int[arg.length];
		for (int i = 0; i < arg.length; i++) {
			a[i] = Integer.parseInt(arg[i]);
		}
		return a;
	}

	public String tostring(int[] poit) {
		String str = "";
		int size = poit.length;
		for (int i = 0; i < size; i++) {
			str = str + poit[i] + ",";
		}
		return str;
	}

	@SuppressWarnings("unused")
	private  boolean isvalid(Cell cells) {
		boolean tag = false;
		String str = cells.getContents();
		str = str.replaceAll("\\s*", "");
		if (str != null && !str.equals(""))
			tag = true;
		return tag;
	}

	private  String strim(Cell cells) {
		String str = cells.getContents();
		str = str.replaceAll("\\s*", "");
		return str;
	}

	private  boolean istel(Cell cells) {
		boolean tag = false;
		String str = cells.getContents();
		str = str.replaceAll("\\s*", "");
		if (str != null && !str.equals("") && str.length() == 11
				&& str.matches("^[0-9]*$")) {
			tag = true;
		}
		return tag;
	}

	private  boolean isjgh(Cell cells) {
		boolean tag = false;
		String str = cells.getContents();
		str = str.replaceAll("\\s*", "");
		if (str != null && !str.equals("") && str.length() == 8
				&& str.matches("^[0-9]*$")) {
			tag = true;
		}
		return tag;
	}

	private  boolean isdate(Cell cells) {
		boolean tag = true;
		if (cells.getType() == CellType.DATE)
			tag = true;
		else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			df.setLenient(false);
			try {
				df.parse(cells.getContents());
				//log.error(cells.getContents());
				//log.error(df.parse(cells.getContents()));
			} catch (Exception ex) {
				tag = false;
			}
		}
		return tag;
	}

	private  String sdate(Cell cell) {
		String cellValue = "";
		if (cell.getType() == CellType.DATE) {
			DateCell dc = (DateCell) cell;
			Date date = dc.getDate();
			TimeZone zone = TimeZone.getTimeZone("GMT");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			sdf.setTimeZone(zone);
			cellValue = sdf.format(date);
		} else
			cellValue = strim(cell);
		return cellValue;
	}

	private  boolean check_cphm(Cell cells, Cell cells2) {
		boolean tag = false;
		Cls_gg gg = new Cls_gg();
		try {
			//int num = gg.getrow(" kcs_specbxkh where mark=1 and cphm='"	+ strim(cells) + "' and bxrq=to_date('" + sdate(cells2)	+ "','yyyy-mm-dd')");
			int num = gg.getrow(" kcs_specbxkh where mark=1 and cphm='"	+ strim(cells) + "'");

			if (num == 1)
				tag = true;
		} catch (Cls_exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tag;
	}

	public  Map<String, Object> xx_check(String wjm) throws Cls_exception {
		int a = 0;
		boolean tag = true;
		Map<String, Object> map = new HashMap<String, Object>();
		InputStream is = null;
		try {
			is = new FileInputStream(wjm);
			Workbook book = Workbook.getWorkbook(is);// 获得一个工作表对象
			Sheet sheet = book.getSheet(0);// 取得第一个工作表，也可用sheet名字获得。
			Cell[] cells = null;
			int[] poit = { -1, -1, -1, -1, -1, -1, -1, -1 };
			cells = sheet.getRow(0);
			a = cells.length;
			for (int i = 0; i < a; i++) {
				if ("车主姓名".equals(cells[i].getContents()))
					poit[0] = i;
				if ("联系电话".equals(cells[i].getContents()))
					poit[1] = i;
				if ("车牌号".equals(cells[i].getContents()))
					poit[2] = i;
				if ("保险到期日".equals(cells[i].getContents()))
					poit[3] = i;
				if ("投保公司".equals(cells[i].getContents()))
					poit[4] = i;
				if ("采集单位".equals(cells[i].getContents()))
					poit[5] = i;
				if ("采集人".equals(cells[i].getContents()))
					poit[6] = i;
				if ("采集人电话".equals(cells[i].getContents()))
					poit[7] = i;
			}
			for (int j = 0; j < 8; j++) {
				tag = tag && (poit[j] > -1);
			}
			is.close();
			map.put("xl", poit);
			map.put("tag", tag);
			log.error("车险客户信息文件检查：" + wjm);
			log.error("结果：" + tag);
		} catch (FileNotFoundException e1) {
			log.error(e1.toString());
			e1.printStackTrace();

		} catch (BiffException e) {
			log.error(e.toString());
			e.printStackTrace();

		} catch (IOException e) {
			log.error(e.toString());
			e.printStackTrace();

		} catch (Exception e) {
			log.error(e.toString());
			e.printStackTrace();

		} finally {
			if (is!=null)
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				is = null;
		}

		return map;

	}
	private  String getsql(Cell[] cells,int[] xl,String jgh,String czy) throws Cls_exception{
		String sql="",jgmch="";
		Cls_zd zd = new Cls_zd();
		if (isjgh(cells[xl[5]])) {
			jgmch=zd.GetJgname(strim(cells[xl[5]]));
			sql = "insert into kcs_specbxkh values(TFEE_ID.nextval,'"
					+ strim(cells[xl[5]])
					+ "','','"
					+ strim(cells[xl[0]])
					+ "','"
					+ strim(cells[xl[1]])
					+ "','"
					+ strim(cells[xl[2]])
					+ "',to_date('"
					+ sdate(cells[xl[3]])
					+ "','yyyy-mm-dd'),'"
					+ strim(cells[xl[4]])
					+ "','"
					+ jgh.substring(0, 2)
					+ "',sysdate,1,'"
					+ jgmch
					+ "','"
					+ strim(cells[xl[6]])
					+ "','"
					+ strim(cells[xl[7]]) + "',1,'"+jgh+"')";			
		} else {
			sql = "insert into kcs_specbxkh values(TFEE_ID.nextval,'','"
				+ czy+"','"
				+ strim(cells[xl[0]])
				+ "','"
				+ strim(cells[xl[1]])
				+ "','"
				+ strim(cells[xl[2]])
				+ "',to_date('"
				+ sdate(cells[xl[3]])
				+ "','yyyy-mm-dd'),'"
				+ strim(cells[xl[4]])
				+ "','"
				+ jgh.substring(0, 2)
				+ "',sysdate,1,'"
				+ strim(cells[xl[5]])
				+ "','"
				+ strim(cells[xl[6]])
				+ "','"
				+ strim(cells[xl[7]]) + "',1,'"+jgh+"')";
		}
		return sql;
	}
	public  Map<String, Object> chex_in(String wjm, int[] xl, String jgh,String czy)
			throws Cls_exception {
		log.error("车险客户信息文件导入：" + wjm);
		int empt = 0, a = 0, num = 0;
		String errinfo = "", sql = "";
		File file = new File(wjm.replace(".xls", ".txt"));
		Map<String, Object> map = new HashMap<String, Object>();
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		InputStream is = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			is = new FileInputStream(wjm);
			Workbook book = Workbook.getWorkbook(is);// 获得一个工作表对象
			Sheet sheet = book.getSheet(0);// 取得第一个工作表，也可用sheet名字获得。
			Cell[] cells = null;
			int len = sheet.getRows();// 取得行数
			for (int i = 1; i < len; i++) {
				cells = null;
				cells = sheet.getRow(i);
				log.error(i + "行，长度" + cells.length);
				if (cells.length == 0) { // 判断这行是不是空行，是空行的话就跳过
					continue;
				}
				if (istel(cells[xl[1]])) {
					if (isdate(cells[xl[3]])) {
						if (check_cphm(cells[xl[2]], cells[xl[3]])) {

							errinfo = errinfo + (i + 1) + "行车牌号["
									+ cells[xl[2]].getContents()
									+ "]的数据重复。\r\n";
							log.error((i + 1) + "行车牌号["
									+ cells[xl[2]].getContents()
									+ "]的数据重复。\r\n");
							empt = empt + 1;
						} else {
                            sql=getsql(cells,xl,jgh,czy);
							log.error(sql);
							stmt = con.prepareStatement(sql);
							a = stmt.executeUpdate();
							stmt.close();
							con.commit();
							if (a > 0)
								num = num + 1;
							else {
								errinfo = errinfo + (i + 1) + "行车牌号["
										+ cells[xl[2]].getContents()
										+ "]的数据导入失败。\r\n";
							    empt = empt + 1;
							}
						}
					} else {
						errinfo = errinfo + (i + 1) + "行车牌号["
								+ cells[xl[2]].getContents()
								+ "]的数据，字段[保险到期日]不是正确的日期时间。\r\n";
						empt = empt + 1;
					}

				} else {
					errinfo = errinfo + (i + 1) + "行车牌号["
							+ cells[xl[2]].getContents()
							+ "]的数据，字段[联系电话]为空或不是数字或不是11位电话号码。\r\n";
					empt = empt + 1;
				}

			}

			con.setAutoCommit(true);
			is.close();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(errinfo.toCharArray());
			bw.newLine();
			bw.flush();
			bw.close();
		    fw.close();
			file = null;
		} catch (SQLException se) {
			log.error(sql + se.toString());
			errinfo = errinfo + "导入数据异常;" + se.toString();
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			log.error(sql + e1.toString());
			e1.printStackTrace();
			errinfo = errinfo + e1.toString();
		} catch (BiffException e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} catch (IOException e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} catch (Exception e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} finally {
                is = null;
				file = null;
			try {
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
				// log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			}

		}
		map.put("num", num);
		map.put("empt", empt);
		log.error("结果：成功导入：" + num + "未导入：" + empt);
		return map;

	}

	public  Map<String, Object> chex62_in(String wjm, int[] xl, String jgh)
			throws Cls_exception {
		log.error("车险客户信息文件导入62：" + wjm);
		int empt = 0, a = 0, num = 0;
		String errinfo = "", sql = "",jgmch="";
		File file = new File(wjm.replace(".xls", ".txt"));
		Map<String, Object> map = new HashMap<String, Object>();
        Cls_zd zd = new Cls_zd();
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		InputStream is = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			is = new FileInputStream(wjm);
			Workbook book = Workbook.getWorkbook(is);// 获得一个工作表对象
			Sheet sheet = book.getSheet(0);// 取得第一个工作表，也可用sheet名字获得。
			Cell[] cells = null;
			int len = sheet.getRows();// 取得行数
			for (int i = 1; i < len; i++) {
				cells = null;
				cells = sheet.getRow(i);
				log.error(i + "行，长度" + cells.length);
				if (cells.length == 0) { // 判断这行是不是空行，是空行的话就跳过
					continue;
				}
				if (istel(cells[xl[1]])) {
					if (isdate(cells[xl[3]])) {
						if (isjgh(cells[xl[5]])) {
							if (check_cphm(cells[xl[2]], cells[xl[3]])) {
								errinfo = errinfo + (i + 1) + "行车牌号["
										+ cells[xl[2]].getContents()
										+ "]的数据重复。\r\n";
								empt = empt + 1;
							} else {
								jgmch=zd.GetJgname(strim(cells[xl[5]]));
								sql = "insert into kcs_specbxkh values(TFEE_ID.nextval,'"
										+ strim(cells[xl[5]])
										+ "','','"
										+ strim(cells[xl[0]])
										+ "','"
										+ strim(cells[xl[1]])
										+ "','"
										+ strim(cells[xl[2]])
										+ "',to_date('"
										+ sdate(cells[xl[3]])
										+ "','yyyy-mm-dd'),'"
										+ strim(cells[xl[4]])
										+ "','"
										+ jgh.substring(0, 2)
										+ "',sysdate,1,'"
										+ jgmch
										+ "','"
										+ strim(cells[xl[6]])
										+ "','"
										+ strim(cells[xl[7]]) + "',1)";
								//log.error(sql);
								stmt = con.prepareStatement(sql);
								a = stmt.executeUpdate();
								stmt.close();
								con.commit();
								if (a > 0)
									num = num + 1;
								else
									errinfo = errinfo + (i + 1) + "行车牌号["
											+ cells[xl[2]].getContents()
											+ "]的数据导入失败。\r\n";
								empt = empt + 1;
							}
						} else {
							errinfo = errinfo + (i + 1) + "行车牌号["
									+ cells[xl[2]].getContents()
									+ "]的数据，字段[采集单位]不是正确的便民站机构号。\r\n";
							empt = empt + 1;
						}
					} else {
						errinfo = errinfo + (i + 1) + "行车牌号["
								+ cells[xl[2]].getContents()
								+ "]的数据，字段[保险到期日]不是正确的日期时间。\r\n";
						empt = empt + 1;
					}

				} else {
					errinfo = errinfo + (i + 1) + "行车牌号["
							+ cells[xl[2]].getContents()
							+ "]的数据，字段[联系电话]为空或不是数字或不是11位电话号码。\r\n";
					empt = empt + 1;
				}

			}

			con.setAutoCommit(true);
			is.close();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(errinfo.toCharArray());
			bw.newLine();
			bw.flush();
		    bw.close();
		    fw.close();
		} catch (SQLException se) {
			log.error(sql + se.toString());
			errinfo = errinfo + "导入数据异常;" + se.toString();
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			log.error(sql + e1.toString());
			e1.printStackTrace();
			errinfo = errinfo + e1.toString();
		} catch (BiffException e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} catch (IOException e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} catch (Exception e) {
			log.error(sql + e.toString());
			e.printStackTrace();
			errinfo = errinfo + e.toString();
		} finally {
			  is = null;
			  file = null;
			try {
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
				// log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			}

		}
		map.put("num", num);
		map.put("empt", empt);
		log.error("结果：成功导入：" + num + "未导入：" + empt);
		return map;

	}

	@SuppressWarnings("unused")
	private  boolean Set_valid(Cell cell, int mark) throws Exception {
		// TODO Auto-generated method stub
		String cphm = strim(cell);
		boolean tag = false;
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement("update kcs_specbxkh set mark=" + mark
					+ " where  cphm='" + cphm + "'");
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				tag = true;
			}
		} catch (SQLException se) {
			se.printStackTrace();
			// log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
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
				// log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			}
		}
		return tag;

	}

}
