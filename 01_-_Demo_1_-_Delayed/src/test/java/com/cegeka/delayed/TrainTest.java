package com.cegeka.delayed;

import com.cegeka.delayed.Train;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class TrainTest {

    private Train train;

    @Before
    public void setUp() throws Exception {
        train = new Train();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void delay_HoursDelayedIsSet() {
        train.delay(2);

        assertThat(train.getHoursDelayed()).isEqualTo(2);
    }

}
