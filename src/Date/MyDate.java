package Date;

import java.util.Calendar;

public class MyDate {
    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)+"-"+twoDigit(cal.get(Calendar.DATE));
    }
    public static String getDate(Calendar cal) {
        return cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)+"-"+twoDigit(cal.get(Calendar.DATE));
    }
    public static String twoDigit(int num) {
        return num<10?"0"+num:num+"";
    }
    public static String getWeek(int week) {
//        String arr[] = {"일","월","화","수","목","금","토"};
//        return arr[week-1];
        return new String[]{"일","월","화","수","목","금","토"}[week-1];
    }
    public static String getAmPm(int ap) {
//        String arr[] = {"오전","오후"};
//        return arr[ap];
        return new String[]{"오전 ","오후 "}[ap];
    }
    public static String getTime(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.HOUR_OF_DAY)+":"+twoDigit(cal.get(Calendar.MINUTE))+":"+twoDigit(cal.get(Calendar.SECOND));
    }
    public static String getFullTime(){
        return getDate()+" "+getTime();
    }
}
