package ru.netology.domain;

public class Radio {

    private short stationsNumber = 10;
    private int currentStation = 10;
    private int currentVolume = 30;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public void Radio(short stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public Radio(short stationsNumber) {
        if (stationsNumber < 0) {
            return;
        }
        this.stationsNumber = stationsNumber;
    }

    public Radio(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public short getStationsNumber() {
        return stationsNumber;
    }

    public void next() {
        if (currentStation != 10) {
            switchStation(getCurrentStation() + 1);
        } else {
            switchStation(0);
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation -= 1;
        } else {
            currentStation = 10;
        }
    }

    public void switchStation(int x) {
        if (x >= 0 && x <= stationsNumber) {
            currentStation = x;
        }
    }

    public void plus() {
        if (currentVolume != 100) {
            currentVolume += 1;
        }
    }

    public void minus() {
        if (currentVolume != 0) {
            currentVolume -= 1;
        } else {
            currentVolume = 0;
        }
    }
}