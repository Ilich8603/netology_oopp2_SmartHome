package ru.netology.oopp2;

public class Radio {

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
    }

    public void decreaseVolume() {
         if (currentVolume > 0) {
             currentVolume --;
         }
    }
}
