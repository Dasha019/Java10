package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
            return;
        }
        currentVolume = 10;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {

        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}
