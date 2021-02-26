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
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStationZero() {
        for (int i = 0; i < 11; i++) {
            radio.next();
        }
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void prev() {
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void prevToStationEight() {
        radio.prev();
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void prevToStationTen() {
        for (int i = 0; i < 11; i++) {
            radio.prev();
        }
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void switchStation() {
        radio.switchStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationAgain() {
        radio.switchStation(99);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationToNine() {
        radio.switchStation(-8);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void plus() {
        radio.plus();
        int expected = 31;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void plusVolume() {
        for (int i = 0; i < 100; i++) {
            radio.plus();
        }
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        radio.minus();
        int expected = 29;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void minusVolume() {
        radio.plus();
        radio.plus();
        radio.minus();
        int expected = 31;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void minusVolumeToZero() {
        for (int i = 0; i < 101; i++) {
            radio.minus();
        }
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
