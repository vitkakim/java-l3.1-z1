package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void shouldBeMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBeMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    //Radio

    @Test
    void shouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
//        radio.increaseRadioStation();
//        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void shouldBeMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void shouldDecreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldBeMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    void shouldNotBeMoreMaxAndMinMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);

        assertEquals(0, radio.getCurrentRadioStation());

    }
}