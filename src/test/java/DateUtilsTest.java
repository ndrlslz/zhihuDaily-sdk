import org.junit.Test;
import utils.DateUtils;

import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void testGetStringWith() throws Exception {
        final String expected = "20161205";
        String date = DateUtils.getStringWith(2016, 12, 5);

        assertEquals(expected, date);
    }

    @Test
    public void testGetStringOfNow() throws Exception {
        String today = DateUtils.getStringOfNow();

        assertNotNull(today);
    }

    @Test
    public void testGetDayBefore() throws Exception {
        final String oneDay = "20160701";
        final String expected = "20160630";
        String date = DateUtils.getDayBefore(oneDay);

        assertEquals(expected, date);
    }
}
