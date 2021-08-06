package Date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int year = date.getYear();
        System.out.println(year);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //달에 몇번째 월요일인지(몇째주인지)
        //요일은 1부터 7까지
        System.out.println(MyDate.getWeek(cal.get(Calendar.DAY_OF_WEEK)));
        System.out.println(cal.get(Calendar.AM_PM));  //0: 오전 /1:오후
        System.out.println(MyDate.getAmPm(cal.get(Calendar.AM_PM)));

        MyDate.getDate();
        System.out.println();
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        System.out.print(MyDate.getAmPm(cal.get(Calendar.AM_PM)));
        MyDate.getTime();
        System.out.println(MyDate.getFullTime());
    }

}

