package ru.netology.oopp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void shouldGetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();

        int expected = 0;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxStation() {
        Radio radio = new Radio();

        int expected = 9;

        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinStation() {
        Radio radio = new Radio();

        int expected = 0;

        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxVolume() {
        Radio radio = new Radio();

        int expected = 100;

        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinVolume() {
        Radio radio = new Radio();

        int expected = 0;

        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void setCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(25);

        int expected = 9;

        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        int expected = 0;

        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(120);

        int expected = 100;

        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 0;

        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }
}