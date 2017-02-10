/**
 * �����ձ���Ϣ�Ĺ���
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 * 
 */
public class Ccic_CarKind {
	private Logger log = Logger.getLogger(Ccic_CarKind.class);

	public Map<String, Object>  saveCarKind(HttpServletRequest request) {
		String info = "";
		boolean tag = true;
		Map<String, Object> map = new HashMap<String, Object>();
		Ccic_Kind kind = new Ccic_Kind();
		String jycode = (String) request.getParameter("jycode");
		String serial_no = (String) request.getParameter("serial_no");
		log.error("��ʼ����Ͷ�����֣�"+jycode);
		int syx =0;
		int quotationType =0 ;
		try {
			tag = kind.empty(jycode);
			if (tag) {
				String[] bjms = request.getParameterValues("x_bjm");
				String bjm = toString(bjms);// ��������
				int x_sunshi = Integer.parseInt(null==request.getParameter("x_sunshi")?"0":request.getParameter("x_sunshi"));//
				int x_3zhe = Integer.parseInt(null==request.getParameter("x_3zhe")?"0":request.getParameter("x_3zhe"));//
				int x_daoq = Integer.parseInt(null==request.getParameter("x_daoq")?"0":request.getParameter("x_daoq"));//
				int x_siji = Integer.parseInt(null==request.getParameter("x_siji")?"0":request.getParameter("x_siji"));//
				int x_chke = Integer.parseInt(null==request.getParameter("x_chke")?"0":request.getParameter("x_chke"));//
				int x_jq = Integer.parseInt(null==request.getParameter("x_jq")?"0":request.getParameter("x_jq"));//
				int x_chchsh = Integer.parseInt(null==request.getParameter("x_chchsh")?"0":request.getParameter("x_chchsh"));//
				int x_ziran = Integer.parseInt(null==request.getParameter("x_ziran")?"0":request.getParameter("x_ziran"));//
				int x_hhen = Integer.parseInt(null==request.getParameter("x_hhen")?"0":request.getParameter("x_hhen"));//
				int x_boli = Integer.parseInt(null==request.getParameter("x_boli")?"0":request.getParameter("x_boli"));//
				int x_3 = Integer.parseInt(null==request.getParameter("x_3")?"0":request.getParameter("x_3"));//
				/*log.error("=" + bjm);
				log.error("sunshi=" + x_sunshi + "/3zhe=" + x_3zhe + "/daoq="
						+ x_daoq + "/sj=" + x_siji + "/chke=" + x_chke + "/jq="
						+ x_jq + "/shui=" + x_chchsh + "/ziran=" + x_ziran);
				log.error("hhen=" + x_hhen + "/boli=" + x_boli + "/3=" + x_3
						+ "/");*/
                syx =  x_sunshi+x_3zhe+x_daoq+x_siji+x_chke+x_ziran+x_hhen+x_boli+x_3;
                if (x_jq>0&&syx>0) quotationType=3;
                if (x_jq>0&&syx==0) quotationType=1;
                if (x_jq==0&&syx>0) quotationType=2;
                log.error("Ͷ�����ͣ�"+quotationType);
				int tag_x = 0; 
				if (x_sunshi > 0) {
					tag_x = kind.setX_sunshi(x_sunshi, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info + "����:������ʧ��,�ύ����";
						tag = false;
					}
				}
				if (x_3zhe > 0) {
					tag_x = kind.setX_3zhe(x_3zhe, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:��������,�ύ����";
						tag = false;
					}
				}
				if (x_daoq > 0) {
					tag_x = kind.setX_daoq(x_daoq, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:������,�ύ����";
						tag = false;
					}
				}
				if (x_siji > 0) {
					tag_x = kind.setX_siji(x_siji, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:˾������,�ύ����";
						tag = false;
					}
				}
				if (x_chke > 0) {
					tag_x = kind.setX_chke(x_chke, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:�˿�����,�ύ����";
						tag = false;
					}
				}
				if (x_jq > 0) {
					tag_x = kind.setX_jq(x_jq, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:��ǿ��,�ύ����";
						tag = false;
					}					
				}
				if (x_chchsh > 0) {
					tag_x = kind.setTax(x_chchsh, jycode, serial_no);
					if (tag_x != 1) {
						info = info +"����:����˰,�ύ����";
						tag = false;
					}					
				}				
				if (x_ziran > 0) {
					tag_x = kind.setX_ziran(x_ziran, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:��ȼ��,�ύ����";
						tag = false;
					}
				}
				if (x_hhen > 0) {
					tag_x = kind.setX_hhen(x_hhen, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:������,�ύ����";
						tag = false;
					}
				}
				if (x_boli > 0) {
					tag_x = kind.setX_boli(x_boli, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:������,�ύ����";
						tag = false;
					}
				}
				if (x_3 > 0) {
					tag_x = kind.setX_3(x_3, jycode, serial_no, bjm);
					if (tag_x != 1) {
						info = info +"����:�޷��ҵ���������Լ��,�ύ����";
						tag = false;
					}
				}
				if (!"".equals(bjm)) {
					tag_x = kind.setX_bjm(1, jycode, serial_no, bjm);
					if (tag_x!=1) {
						info = info +"���֣��������⣬�ύ����";
						tag = false;
					}
				}
			} else
				info = "�ձ���Ϣ��������ʧ�ܡ�";
		} catch (Cls_exception e) {
			log.error("Ccic_CarKind.saveCarKind()" + e.toString());
			e.printStackTrace();
		}
		log.error("ccic_carKind����������Ϣ:"+tag+"/"+info);
        map.put("tag", tag);
        map.put("info", info);
        map.put("quotationType", quotationType);
		return map;
	}

	protected String toString(String[] bt) {
		StringBuffer sb = new StringBuffer();
		String st = "";
		if (bt != null && bt.length != 0) {
			for (String s : bt) {
				sb.append(s + ",");
			}
			st = sb.toString();
		}
		return st;
	}
}
