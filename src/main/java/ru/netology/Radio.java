package ru.netology;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            setCurrentRadioStation(minRadioStation);
        }

    }

    public void decreaseRadioStation() {
        if (currentRadioStation == minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }


    }
}


