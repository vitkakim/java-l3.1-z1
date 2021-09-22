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


        Radio radioSetNumber = new Radio(20);
        radioSetNumber.setMaxRadioStation();
        assertEquals(19, radioSetNumber.getMaxRadioStation());
        radioSetNumber.setCurrentRadioStation(15);
        radioSetNumber.increaseRadioStation();
        assertEquals(16, radioSetNumber.getCurrentRadioStation());


    }

    @Test
    void shouldBeMaxRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        Radio radioSetNumber = new Radio(15);
        radioSetNumber.setMaxRadioStation();
        radioSetNumber.setCurrentRadioStation(14);
        radioSetNumber.increaseRadioStation();
        assertEquals(0, radioSetNumber.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.decreaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.decreaseRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());

        Radio radioSetNumber = new Radio(25);
        radioSetNumber.setMaxRadioStation();
        radioSetNumber.setCurrentRadioStation(24);
        radioSetNumber.decreaseRadioStation();
        assertEquals(23, radioSetNumber.getCurrentRadioStation());
    }

    @Test
    void shouldBeMinRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

        Radio radioSetNumber = new Radio(30);
        radioSetNumber.setMaxRadioStation();
        radioSetNumber.setCurrentRadioStation(0);
        radioSetNumber.decreaseRadioStation();
        assertEquals(29, radioSetNumber.getCurrentRadioStation());

    }

    @Test
    void shouldNotBeMoreMaxAndMinMinRadioStation() {
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());

        Radio radioSetNumber = new Radio(5);
        radioSetNumber.setMaxRadioStation();
        radioSetNumber.setCurrentRadioStation(8);
        assertEquals(0, radioSetNumber.getCurrentRadioStation());
        radioSetNumber.setCurrentRadioStation(-1);
        assertEquals(0, radioSetNumber.getCurrentRadioStation());

    }
}