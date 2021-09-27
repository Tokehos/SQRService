package ru.netology.sqr;

public class SQRService {

    public int calculate(int upperValue, int underValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int SQR = i * i;
            if ((underValue < SQR) && (SQR < upperValue)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}