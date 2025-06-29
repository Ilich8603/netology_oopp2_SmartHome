package ru.netology.oopp2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsQuantity = 10;

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public void setStationsQuantity(int stationsQuantity) {
        if (stationsQuantity > 50) {
            return;
        }
        if (stationsQuantity < 1) {
            return;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > stationsQuantity - 1) {
            setMaxStation();
            return;
        }
        this.currentStation = newStation;
    }

    public void setMaxStation() {
        currentStation = stationsQuantity - 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < stationsQuantity - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            setMaxStation();
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}