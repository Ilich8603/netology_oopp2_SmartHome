package ru.netology.oopp2;

public class Radio {

    private int currentStationNumber;

    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            setMaxStationNumber();
            return;
        }
        if (newStationNumber > 9) {
            setMinStationNumber();
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void setMinStationNumber() {
        currentStationNumber = 0;
    }

    public void setMaxStationNumber() {
        currentStationNumber = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setMinVolume();
            return;
        }
        if (newCurrentVolume > 100) {
            setMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void nextStation() {
        if (currentStationNumber < 9) {
            currentStationNumber++;
        } else {
            setMinStationNumber();
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void previousStation() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            setMaxStationNumber();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
