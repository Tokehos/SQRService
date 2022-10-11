package ru.netology.sqr;

public class SQRService {

    int count;
    public int cntrl( int underValue, int upperValue, int startSqr, int stoSqr) {
        for (int i = startSqr; i <= stoSqr; i++) {
            if ((i * i >= underValue) && (i * i <= upperValue)) {
                count++;
            }
        }
        return count;

    }

}
