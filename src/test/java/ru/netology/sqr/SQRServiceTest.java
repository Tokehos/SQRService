package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'SQR=10-17', 200, 300, 3, 10, 17",
                        "'SQR=20-30', 900, 900, 1, 20, 30"})
    void floor(String testName, int underValue, int upperValue, int expected, int startSqr, int stopSqr) {

        FloorService floorService = new FloorService();

        int actual = floorService.cntrl(underValue, upperValue, startSqr, stopSqr);
        assertEquals(expected, actual);
        System.out.println(testName + actual);
    }

}
