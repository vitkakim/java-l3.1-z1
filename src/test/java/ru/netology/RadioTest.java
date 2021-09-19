package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();


    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void shouldBeMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(110);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBeMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    // Radio
    @Test
    void shouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setNumberRadioStation(-1);
        assertEquals(10, radio.getNumberRadioStation());
        radio.setNumberRadioStation(0);
        assertEquals(10, radio.getNumberRadioStation());

        radio.setNumberRadioStation(20);
        assertEquals(20, radio.getNumberRadioStation());
        radio.setMaxRadioStation();
        assertEquals(19, radio.getMaxRadioStation());
        radio.setCurrentRadioStation(15);
        radio.increaseRadioStation();
        assertEquals(16, radio.getCurrentRadioStation());


    }

    @Test
    void shouldBeMaxRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setNumberRadioStation(15);
        radio.setMaxRadioStation();
        radio.setCurrentRadioStation(14);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void shouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());

        radio.setNumberRadioStation(25);
        radio.setMaxRadioStation();
        radio.setCurrentRadioStation(24);
        radio.decreaseRadioStation();
        assertEquals(23, radio.getCurrentRadioStation());
    }

    @Test
    void shouldBeMinRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setNumberRadioStation(30);
        radio.setMaxRadioStation();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(29, radio.getCurrentRadioStation());

    }

    @Test
    void shouldNotBeMoreMaxAndMinMinRadioStation() {
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setNumberRadioStation(5);
        radio.setMaxRadioStation();
        radio.setCurrentRadioStation(8);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());

    }
}