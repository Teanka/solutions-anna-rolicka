package pl.coderstrust.solutions.udemy.section3;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myMinValue= -2_147_483_648 ;
        int myMaxValue= 2_147_483_647 ;

        // int has a width of 32

        int myTotalInt =(myMinValue + myMaxValue)/2;
        System.out.println("My Int Total = " + myTotalInt);

        byte myByteValue = 127;
        byte myAvgByte = (byte) (myByteValue/2);
        System.out.println("My Byte Total = " + myAvgByte);

        //  byte has a width of 8

        short myShortValue = 32767;
        short myAvgShort = (short)(myShortValue/2);
        System.out.println("My Short Total = " + myAvgShort);

        //short has a width of 16

        long myLongValue = -9_223_372_036_854_775_808L;
        long myAvgLong = (myLongValue/2);
        System.out.println("My long Total = " + myAvgLong);

        // long has a width of 64

        byte newByte = 100;
        short newShort = 10000;
        int newInt = 555;
        long newLong = 50000L+ 10L*(newByte + newShort + newInt);
        System.out.println("New Long totsl = " + newLong);
    }
}
