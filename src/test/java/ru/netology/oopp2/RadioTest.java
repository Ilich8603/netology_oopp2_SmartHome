package ru.netology.oopp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadio_station.csv")
    public void shouldSetStationNumber(int newStationNumber, int expected) {
        Radio cond = new Radio();

        cond.setCurrentStationNumber(newStationNumber);


        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadio_volume.csv")
    public void shouldSetVolume(int newCurrentVolume, int expected) {
        Radio cond = new Radio();

        cond.setCurrentVolume(newCurrentVolume);


        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadio_station.csv")
    public void shouldNextStation(int newStationNumber, int expected) {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(newStationNumber);

        cond.nextStation();


        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/previousRadio_station.csv")
    public void shouldPreviousStation(int newStationNumber, int expected) {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(newStationNumber);

        cond.previousStation();


        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseRadio_volume.csv")
    public void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        cond.increaseVolume();


        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseRadio_volume.csv")
    public void shouldDecreaseVolume(int newCurrentVolume, int expected) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        cond.decreaseVolume();


        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleNextRadio_station.csv")
    public void multipleNextStation(int newStationNumber, int expected, int steps) {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(newStationNumber);

        for (int i = 0; i < steps; i++) {
            cond.nextStation();
        }

        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multiplePreviousRadio_station.csv")
    public void multiplePreviousStation(int newStationNumber, int expected, int steps) {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(newStationNumber);

        for (int i = 0; i < steps; i++) {
            cond.previousStation();
        }

        int actual = cond.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleIncreaseRadio_volume.csv")
    public void multipleIncreasesVolume(int newCurrentVolume, int expected, int increases) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        for (int i = 0; i < increases; i++) {
            cond.increaseVolume();
        }

        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleDecreaseRadio_volume.csv")
    public void multipleDecreasesVolume(int newCurrentVolume, int expected, int decreases) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        for (int i = 0; i < decreases; i++) {
            cond.decreaseVolume();
        }

        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/userCountStation.csv")
    public void shouldSetCountStationAboveMax(int countStations, int newStationNumber, int expected) {
        Radio cond = new Radio(countStations);

        cond.setCurrentStationNumber(newStationNumber);


        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldNotSetVolumeAboveMax() {
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(120);
//
//        int expected = 100;
//        int actual = cond.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void shouldSetMinVolume() {
//        Radio cond = new Radio();
//
//        cond.setMinVolume();
//
//        int expected = 0;
//        int actual = cond.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetMaxVolume() {
//        Radio cond = new Radio();
//
//        cond.setMaxVolume();
//
//        int expected = 100;
//        int actual = cond.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }


}
