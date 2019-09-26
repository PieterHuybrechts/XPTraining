package introduceparameterobject;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class FlowBetweenTest {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @Test
    public void beforeIntervalIsExcluded() {
        Entry beforeInterval = new Entry(10.0, createDate(1, 3));
        account.getEntries().add(beforeInterval);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void onStartOfIntervalIsIncluded() {
        Entry startOfInterval = new Entry(10.0, createDate(1, 4));
        account.getEntries().add(startOfInterval);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void middleOfIntervalIsIncluded() {
        Entry middleOfInterval = new Entry(10.0, createDate(2, 2));
        account.getEntries().add(middleOfInterval);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void onEndOfIntervalIsIncluded() {
        Entry endOfInterval = new Entry(10.0, createDate(2, 4));
        account.getEntries().add(endOfInterval);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void afterIntervalIsExcluded() {
        Entry before = new Entry(10.0, createDate(2, 5));
        account.getEntries().add(before);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void multipleEntriesInIntervalAreAccumulated() {
        Entry middleOfInterval = new Entry(10.0, createDate(2, 2));
        Entry endOfInterval = new Entry(10.0, createDate(2, 4));
        account.getEntries().add(middleOfInterval);
        account.getEntries().add(endOfInterval);

        double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(20.0, result, 0.0);
    }

    private Date createDate(int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, month, day);
        return calendar.getTime();
    }


}
