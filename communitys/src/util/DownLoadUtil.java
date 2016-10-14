package util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownLoadUtil {
	/**
	 * 网上获取文件
	 * 
	 * @param savepath 保存路径
	 * @param resurl  资源路径
	 * @param fileName  自定义资源名
	 */
	public void getInternetRes(String savepath, String resurl, String fileName) {
	        URL url = null;
	        HttpURLConnection con = null;
	        InputStream in = null;
	        FileOutputStream out = null;
	        try {
	            url = new URL(resurl);
	            //建立http连接，得到连接对象
	            con = (HttpURLConnection) url.openConnection();
	            //con.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
	            in = con.getInputStream();
	            byte[] data = getByteData(in);//转化为byte数组

	            File file = new File(savepath);
	            if (!file.exists()) {
	                file.mkdirs();
	            }

	            File res = new File(file + File.separator + fileName);
	            out = new FileOutputStream(res);
	            out.write(data);
	            System.out.println("downloaded successfully!");
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (null != out)
	                    out.close();
	                if (null != in)
	                    in.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }
	    }
	/**
     * 从输入流中获取字节数组
     * 
     * @param in
     * @return
     * @throws IOException
     */
	private byte[] getByteData(InputStream in) throws IOException {
		 byte[] b = new byte[1024];
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        int len = 0;
	        while ((len = in.read(b)) != -1) {
	            bos.write(b, 0, len);
	        }
	        if(null!=bos){
	            bos.close();
	        }
	        return bos.toByteArray();
	}
	
	
	/**
	   * 下载文件到本地
	   *
	   * @param urlString
	   *          被下载的文件地址
	   * @param filename
	   *          本地文件名
	   * @throws Exception
	   *           各种异常
	   */
	public static void download(String urlString, String filename) throws Exception {
	    // 构造URL
	    URL url = new URL(urlString);
	    // 打开连接
	    URLConnection con = url.openConnection();
	    // 输入流
	    InputStream is = con.getInputStream();
	    // 1K的数据缓冲
	    byte[] bs = new byte[1024];
	    // 读取到的数据长度
	    int len;
	    // 输出的文件流
	    OutputStream os = new FileOutputStream(filename);
	    // 开始读取
	    while ((len = is.read(bs)) != -1) {
	      os.write(bs, 0, len);
	    }
	    // 完毕，关闭所有链接
	    os.close();
	    is.close();
	}   
}
