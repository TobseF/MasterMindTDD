package de.tfr.dojo.mastermind;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class MindMasterTest {

    @Test
    public void testGameName() {
        Assertions.assertEquals("Master Mind", new MindMaster().gameName());
        MatcherAssert.assertThat(new MindMaster().gameName(), is("Master Mind"));
    }
}
