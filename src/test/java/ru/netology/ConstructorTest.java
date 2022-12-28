package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructorTest {

    @Test
    public void test() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
}