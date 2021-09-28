package ru.netology.sqr;

public class SQRService {

    public int calculate(int upperValue, int underValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if ((underValue <= sqr) && (sqr <= upperValue)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}