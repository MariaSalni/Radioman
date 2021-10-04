package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStationValid() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(5);
        assertEquals(5, music.getCurrentStation());


    }

    @Test
    void setCurrentStationInvalidMax() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(10);
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentStationInvalidMin() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(-1);
        assertEquals(0, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValid() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(5);
        music.increaseStation();
        assertEquals(6, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValidMax() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(9);
        music.increaseStation();
        assertEquals(0, music.getCurrentStation());

    }

    @Test
    void setCurrentStationDecreaseValid() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(5);
        music.decreaseStation();
        assertEquals(4, music.getCurrentStation());


    }

    @Test
    void setCurrentStationDecreaseValidMin() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentStation(0);
        music.decreaseStation();
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentVolume() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(5);
        assertEquals(5, music.getCurrentVolume());

    }

    @Test
    void setCurrentVolumeInvalidMax() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(11);
        assertEquals(10, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMin() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(-1);
        assertEquals(0, music.getCurrentVolume());
    }


    @Test
    void setCurrentVolumeIncreaseMax() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(10);
        music.increaseVolume();
        assertEquals(10, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncrease() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(5);
        music.increaseVolume();
        assertEquals(6, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecrease() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(5);
        music.decreaseVolume();
        assertEquals(4, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecreaseMin() {
        Radio music = new Radio();
        music.setOn(true);
        music.setCurrentVolume(0);
        music.decreaseVolume();
        assertEquals(0, music.getCurrentVolume());
    }


}