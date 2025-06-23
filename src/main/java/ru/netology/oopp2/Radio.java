package ru.netology.oopp2;

public class Radio {

    private int currentStationNumber;

    private int currentVolume;

    private int maxStationNumber;

    public Radio() {
        this.maxStationNumber = 9;
    }

    public Radio(int countStations) {
        this.maxStationNumber = countStations - 1;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            setMinStationNumber();
            return;
        }
        if (newStationNumber > maxStationNumber) {
            setMaxStationNumber();
            return;
        }
        this.currentStationNumber = newStationNumber;
    }

    public void setMinStationNumber() {
        currentStationNumber = 0;
    }

    public void setMaxStationNumber() {
        currentStationNumber = maxStationNumber;
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
        if (currentStationNumber < maxStationNumber) {
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
