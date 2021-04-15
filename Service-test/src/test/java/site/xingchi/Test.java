package site.xingchi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        Date date = new Date();

        System.out.println(date.getTime());
    }
}
