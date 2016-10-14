package filter;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.filter.GetRequest;

public class EncodingFilter  implements Filter{
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {


		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		//解决post中文乱码问题
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		//解决get中文乱码问题
		MyRequest myrequest = new MyRequest(request);  //自己定义一个request
		chain.doFilter( myrequest, response);   //servlet  myrequest.getParameter("username")
		}

		//继承HttpServletRequestWrapper ：//sun公司提供的包装类
		//自定义request,解决get中文乱码问题
		class MyRequest extends  HttpServletRequestWrapper{  //request
		private HttpServletRequest request;
		
		public MyRequest(HttpServletRequest request){
			super(request);
			this.request = request;
		}
		
		//重构方法
		public String getParameter(String name) {
			// 获取用户提交的数据 get乱码
			String value = this.request.getParameter(name);  
			if(value==null){
			return null;
		}
		//判断是否是get请求方式
		if(!request.getMethod().equals("GET")){
			return value;
		}
		
		try {
			value = new String(value.getBytes("iso8859-1"),this.request.getCharacterEncoding());
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
			return value;
		}
		//重构方法
		@Override
		public Map getParameterMap() {
			try{
				// 判断是否是get请求方式，不是get请求则直接返回
				if(!this.request.getMethod().equals("GET")){
					return this.request.getParameterMap();
				}
	
				Map<String,String[]> map = this.request.getParameterMap();  //接受客户端的数据
				Map<String,String[]> newmap = new HashMap();   
				for(Map.Entry<String, String[]> entry : map.entrySet()){
					String name = entry.getKey();
					String values[] = entry.getValue();
					if(values==null){
						newmap.put(name, new String[]{});
						continue;
					}
				String newvalues[] = new String[values.length];
				
				for(int i=0; i<values.length;i++){
					String value = values[i];
					value = new String(value.getBytes("iso8859-1"),this.request.getCharacterEncoding());
				// 解决乱码后封装到Map中
				newvalues[i] = value; 
				}
	
				newmap.put(name, newvalues);
			}
	
				return newmap;
			}catch (Exception e) {
				throw new RuntimeException(e);
			}
		}


		@Override
		public String[] getParameterValues(String name) {
		// TODO Auto-generated method stub
		return super.getParameterValues(name);
		}
	}


		public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		}
		
		public void destroy() {
		// TODO Auto-generated method stub
		}
}
