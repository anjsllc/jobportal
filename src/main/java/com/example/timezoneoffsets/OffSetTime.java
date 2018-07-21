package com.example.timezoneoffsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
 
public class OffSetTime {
      
          private final static long MSEC_PER_DAY = 3600L * 1000L * 24L;
      
          static String startDateString = "01/24/2018";
//        static String startDateString = "01/20/2018";
//        static String startDateString = "01/19/2018";
         static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
 
    public static  int getjobPortalSystemDate() throws Exception {
       df.setTimeZone(TimeZone.getTimeZone("UTC"));
       long msecs=df.parse(startDateString).getTime();
       // long msecs=new Date().getTime();
        int JobPortalDate = ((int) (msecs / MSEC_PER_DAY)) + 1;
        return JobPortalDate;
    }
   
    
    public static void main(String[] args) throws Exception {
              int value=getjobPortalSystemDate();
              System.out.println(value);
       }
 
}
