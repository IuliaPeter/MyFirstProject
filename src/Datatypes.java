import java.awt.print.Printable;

public class Datatypes {
    public static void main(String[] args) {
        boolean myBoolean=true;
        char myChar='a';
        byte myByte=57;
        short myShort=32767;
        int myInt=-32768;
        long myLong=2951119055071L;
        float myFloat=5.5f+8.5f;
        double myDouble=7.751564;

        int x =5;
        double y=7.5;
        double sum = x+y;

        double z=5.5;
        int w=(int)z;

        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        System.out.println(x+y);
        System.out.println(z);
        System.out.println(w);

        //20 Sep Ex 1
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";

        //20 Sep Ex 2a
        byte myotherByte=80;
        int q=7;
        q=myotherByte;
        System.out.println(q);

        //20 Sep Ex 2b
        float mysecondFloat= 3.2f;
        int v=20;
        v=(int) mysecondFloat;
        System.out.println(v);

        //27 Sep Ex 1
        float myFloatNum1=8.7f;
        float myFloatNum2=10.99f;
        System.out.println(myFloatNum1+myFloatNum2);
        System.out.println(myFloatNum1-myFloatNum2);
        System.out.println(myFloatNum1*myFloatNum2);

    }
}
