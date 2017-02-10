package pkg_auto.autobj.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteProxy;
import com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteRequest;
import com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteResponse;
import pkg_auto.autobj.ccic.serverProcess.Ccic_CarFGPreciseQuoteIn;
import pkg_auto.autobj.ccic.serverProcess.Ccic_CarFGPreciseQuoteOut;
import pkg_auto.autobj.ccic.serverProcess.Ccic_CarKind;
import pkg_auto.autobj.pojo.Ccic_endpoint;

/**
 * Servlet implementation class AutoPreciseQuote
 */
//@WebServlet("/AutoPreciseQuote")
public class AutoPreciseQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(AutoPreciseQuote.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutoPreciseQuote() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String retu = "{\"flag\":\"false\",\"info\":\"保险公司接口异常\"}";
		boolean tag = true;
		// String cphm=(String)request.getParameter("cphm");
		String orgcode = (String) request.getParameter("org_code_des");
		String jycode = (String) request.getParameter("jycode");
		String serial_no = (String) request.getParameter("serial_no");
		Map<String, Object> map = new HashMap<String, Object>();
		Ccic_CarKind kind = new Ccic_CarKind();

		map = kind.saveCarKind(request);
		tag = (Boolean) map.get("tag");
		if (tag) {
			String quotationType = map.get("quotationType") + "";
			Ccic_CarFGPreciseQuoteIn ccic_carPQ = new Ccic_CarFGPreciseQuoteIn();
			FGPreciseQuoteRequest fgCarPQRequest = ccic_carPQ
					.getFGPreciseQuoteRequest(jycode, serial_no, quotationType,
							orgcode);
			if (null != fgCarPQRequest) {
				// AxisProperties.setProperty("axis.socketSecureFactory","pkg_sinopec.autobj.mySsl.MyCustomSSLSocketFactory");
				FGPreciseQuoteProxy proxy = new FGPreciseQuoteProxy(
						Ccic_endpoint.getUrlCcicCarfgprecisequote());
				FGPreciseQuoteResponse fgCarPQResponse = proxy
						.fgpreciseQuote(fgCarPQRequest);
				if (fgCarPQResponse != null) {
					log.error("精确报价：has response");
					Ccic_CarFGPreciseQuoteOut ccic_carPQRO = new Ccic_CarFGPreciseQuoteOut();
					retu = ccic_carPQRO.fgCarPQResponseToFront(fgCarPQResponse,
							serial_no, jycode, quotationType);
					

				}
			} else
				retu = "{\"flag\":\"false\",\"info\":\"询价请求组装失败。\"}";

		} else {
			retu = "{\"flag\":\"false\",\"info\":\"" + map.get("info") + "\"}";
		}
        log.error("精确报价返回："+retu);
		response.setContentType("text/x-json;charset=UTF-8");// 返回json格式
		response.getWriter().write(retu);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
