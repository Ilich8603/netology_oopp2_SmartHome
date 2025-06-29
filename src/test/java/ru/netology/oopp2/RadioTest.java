package ru.netology.oopp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadio_station.csv")
    public void shouldSetStation(int newStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newStation);


        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadio_volume.csv")
    public void shouldSetVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);


        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadio_station.csv")
    public void shouldNextStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);

        radio.nextStation();


        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/previousRadio_station.csv")
    public void shouldPreviousStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);

        radio.previousStation();


        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseRadio_volume.csv")
    public void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.increaseVolume();


        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseRadio_volume.csv")
    public void shouldDecreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.decreaseVolume();


        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleNextRadio_station.csv")
    public void multipleNextStation(int newStation, int expected, int steps) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);

        for (int i = 0; i < steps; i++) {
            radio.nextStation();
        }

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multiplePreviousRadio_station.csv")
    public void multiplePreviousStation(int newStation, int expected, int steps) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);

        for (int i = 0; i < steps; i++) {
            radio.previousStation();
        }

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleIncreaseRadio_volume.csv")
    public void multipleIncreasesVolume(int newCurrentVolume, int expected, int increases) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        for (int i = 0; i < increases; i++) {
            radio.increaseVolume();
        }

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/multipleDecreaseRadio_volume.csv")
    public void multipleDecreasesVolume(int newCurrentVolume, int expected, int decreases) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        for (int i = 0; i < decreases; i++) {
            radio.decreaseVolume();
        }

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/userCountStation.csv")
    public void shouldSetCountStationAboveMax(int countStations, int newStation, int expected) {
        Radio radio = new Radio(countStations);

        radio.setCurrentStation(newStation);


        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stationsQuantity.csv")
    void shouldSetStationsQuantity(int stationsQuantity, int expected) {
        Radio radio = new Radio();

        radio.setStationsQuantity(stationsQuantity);


        int actual = radio.getStationsQuantity();

        Assertions.assertEquals(expected, actual);

    }
}