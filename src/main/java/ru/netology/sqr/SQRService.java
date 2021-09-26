package ru.netology.sqr;

public class SQRService {

    public int calculate(int upperValue, int underValue) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if ((underValue < i * i) && (i * i < upperValue)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}