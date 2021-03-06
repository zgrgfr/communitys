package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {
	
	/**
	 * java.util.Date 转化�?java.sql.Date
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static java.sql.Date getSqlDate(Date date){
		return new java.sql.Date(date.getTime());
	}
	
	/**
	 * 格式化日期时�?
	 * @param date
	 * @return
	 */
	public static String formatDateTime(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date).toString();
	}
	
	/**
	 * 格式化日期
	 * 传进来的参数是日期的格式
	 * @param date
	 * @return
	 */
	public static String formatDateTimeByFormat(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date).toString();
	}
	
	
	/**
	 * 格式化日期
	 * yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String formatDateTime2(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date).toString();
	}
	
	public static Date StringToDate(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if("".equals(time)){
			return sdf.parse((new Date()).toString());
		}
			return sdf.parse(time);

	}
	
	public static Date StringToDateYM(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		if("".equals(time)){
			return sdf.parse((new Date()).toString());
		}
			return sdf.parse(time);

	}
	
	public static Date StringToDateYMD(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if("".equals(time)){
			return sdf.parse((new Date()).toString());
		}
			return sdf.parse(time);

	}
	
	/**
	 * 格式化日�?
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date).toString();
	}

	
	public static String getDateForIndex(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd�?");
		return sdf.format(date).toString();
		
	}
	
	/**
	 * 按照yyyy-MM-dd hh:mm这个格式的时间与当前时间比大小
	 * >0说明比现在的时间靠后
	 * <0说明比现在的时间靠前
	 * =0说明跟现在的时间相等
	 * @param date
	 * @return
	 */
	public static int compareNowDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try{
			 Date d1 = sdf.parse(date);
			 Date d2 = sdf.parse(sdf.format(new Date()));
			 if(d1.getTime() > d2.getTime()){
				 return 1;
			 }else if(d1.getTime() < d2.getTime()){
				 return -1;
			 }else{
				 return 0;
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		return 0;
		 
	}
	
    /** 
     * 根据传入的时间获得当前时间所在周的第一天和第七天日期 
     * @param tm 时间 
     * @param firstday 周日作为周一为0，周一作为周一1。 
     * @return get(0)为周一，get(1)为周日
     */  
    public static List<Date> getWeek(Date tm,int firstday){  
        Calendar c = Calendar.getInstance();  
        c.setTime(tm);  
        if(c.get(Calendar.DAY_OF_WEEK)==1){  
            c.add(Calendar.DATE, -1);  
        }  
        List<Date> list = new ArrayList<Date>();  
        Calendar cf = Calendar.getInstance();  
        cf.setTime(c.getTime());  
        cf.set(Calendar.DAY_OF_WEEK, cf.getFirstDayOfWeek());  
        cf.add(Calendar.DATE, firstday);  
        Calendar ce = Calendar.getInstance();  
        ce.setTime(c.getTime());  
        ce.set(Calendar.DAY_OF_WEEK, cf.getFirstDayOfWeek()+6);  
        ce.add(Calendar.DATE, firstday);  
        list.add(cf.getTime());  
        list.add(ce.getTime());  
        return list;  
    } 
    /**
     * 把2016-5-5转换成
     * 2016-05-05的形式
     * @param date
     */
    public static String changeStringDate(String date){
    	String month = "";
    	String day = "";
    	if(Integer.parseInt(date.split("-")[1]) < 10 && date.split("-")[1].length() < 2){
    		month = "0".concat(date.split("-")[1]);
		}else{
			month = date.split("-")[1];
		}
    	if(Integer.parseInt(date.split("-")[2]) < 10 && date.split("-")[2].length() < 2){
    		day = "0".concat(date.split("-")[2]);
		}else{
			day = date.split("-")[2];
		}
    	return date.split("-")[0].concat("-").concat(month).concat("-").concat(day);
    }
    
    public static void main(String args[]){
    	System.out.println(DateUtil.changeStringDate("2016-7-8"));
//    	System.out.println(DateUtil.formatDate(DateUtil.getWeek(new Date(), 1).get(0)));
//    	System.out.println(DateUtil.formatDate(DateUtil.getWeek(new Date(), 1).get(1)));
    }
}
