package br.com.pierrydev.meutreino.utilities;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {

    public static String obterDataAtual() {

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);

        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String year = String.valueOf(calendar.get(Calendar.YEAR));

        return day + "/" + month + "/" + year;
    }

}
