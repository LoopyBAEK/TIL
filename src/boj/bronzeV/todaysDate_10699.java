package boj.bronzeV;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class todaysDate_10699 {
    public static void main(String[] args) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();

        System.out.println(fmt.format(today));

        // 2023-02-06
    }
}
