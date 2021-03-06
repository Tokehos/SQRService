package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'TotalSquare', 200, 400, 6",
            "'TotalSquare', 398, 399,0"})
    void shouldCalculate(String testName, int underValue, int upperValue, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long actual = service.calculate(upperValue, underValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}