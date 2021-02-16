package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();
    @Test
    public void createRadio() {
    }

    @Test
    public void next() {
        int expected = 1;
        radio.next();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void prev() {
        int expected = 9;
        radio.prev();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void switchStation() {
        int expected = 1;
        radio.switchStation(1);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void plus() {
        int expected = 1;
        radio.plus();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        int expected = 0;
        radio.minus();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

}
