package util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ibatis.common.resources.Resources;
public class GetSqlSession {
	private static SqlSessionFactory sqlSessionFactory;  
    
    private static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();  
  
      
    synchronized public static SqlSessionFactory getSqlSessionFactory() {  
  
        try {  
            InputStream isRef=GetSqlSession.class.getResourceAsStream("/db.properties");  
            Properties properties=new Properties();  
            properties.load(isRef);  
            //Log.getLog().info("properties="+properties);  
            if (sqlSessionFactory == null) {  
                String resource = "conf.xml";  
                InputStream inputStream = Resources  
                        .getResourceAsStream(resource);  
                sqlSessionFactory = new SqlSessionFactoryBuilder()  
                        .build(inputStream,properties);  
            } else {  
            }  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
  
        return sqlSessionFactory;  
    }  
      
    public static SqlSession getSqlSession() {  
        SqlSession sqlSession = tl.get();  
        if (sqlSession == null) {  
            sqlSession = getSqlSessionFactory()  
                    .openSession();  
            tl.set(sqlSession);  
        } else {  
  
        }  
        //System.out.println("获得的sqlSession对象的hashCode：" + sqlSession.hashCode());  
        return sqlSession;  
    }  
  
    public static void commit() {  
        if (tl.get() != null) {  
            tl.get().commit();  
            tl.get().close();  
            tl.set(null);  
            //System.out.println("提交了");  
        }  
    }  
  
    public static void rollback() {  
        if (tl.get() != null) {  
            tl.get().rollback();  
            tl.get().close();  
            tl.set(null);  
            //System.out.println("回滚了");  
        }  
    }  
}  

