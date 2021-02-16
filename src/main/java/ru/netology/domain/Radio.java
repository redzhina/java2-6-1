package ru.netology.domain;

public class Radio {
    int currentStation = 0;
    int currentVolume = 0;

    public void next() {
        if (currentStation != 9)
            currentStation += 1;
        else
            currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0)
            currentStation -= 1;
        else
            currentStation = 9;
    }

    public void switchStation(int x) {
        if (x >= 0 && x <= 9)
            currentStation = x;
    }

    public void plus() {
        if (currentVolume != 10)
            currentVolume += 1;
    }

    public void minus() {
        if (currentVolume != 0)
            currentVolume -= 1;
    }
}
