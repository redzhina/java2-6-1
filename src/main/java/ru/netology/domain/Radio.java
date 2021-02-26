package ru.netology.domain;

public class Radio {
    private int currentStation = 10;

    private int currentVolume = 30;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStation != 10) {
            currentStation += 1;
        } else {
            currentStation = 0;
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
        if (x >= 0 && x <= 10) {
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