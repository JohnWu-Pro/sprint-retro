package org.wjh.text;

import static java.text.MessageFormat.format;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Test;

public class MessageFormatTest {

    @Test
    public void run() {
        String pattern = "{0,date,yyyyMMdd}{1,number,0000}";

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2014);
        calendar.set(Calendar.MONDAY, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 7);

        assertThat(pattern, format(pattern, calendar.getTime(), 123), is("201405070123"));
    }
}
