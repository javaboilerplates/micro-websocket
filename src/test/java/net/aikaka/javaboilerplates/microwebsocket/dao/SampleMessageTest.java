package net.aikaka.javaboilerplates.microwebsocket.dao;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SampleMessageTest {

    private final String DEFAULT_KEYWORD = "AAAAAA";
    private final String UPDATE_KEYWORD = "BBBBBB";

    private SampleMessage sampleMessage;

    @Before
    public void before() {
        sampleMessage = new SampleMessage();
        sampleMessage.setKeyword(DEFAULT_KEYWORD);
    }

    @Test
    public void testGetSetName() {
        assertNotNull(sampleMessage);
        assertEquals(DEFAULT_KEYWORD, sampleMessage.getKeyword());

        sampleMessage.setKeyword(UPDATE_KEYWORD);
        assertEquals(UPDATE_KEYWORD, sampleMessage.getKeyword());
    }
}
