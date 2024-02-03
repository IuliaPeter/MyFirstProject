public class myArray {
    public static void main(String[] args) {
        int myArray [] = {1, 2, 3, 4};
        String[] myStringArray = {"Unu", "Doi", "Trei"};
        System.out.println(myArray[3]);
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        // 20 Sep Ex 4
        int mysecondArray[] = {5, 6, 7, 8};
        System.out.println(mysecondArray[1]);
        System.out.println(mysecondArray[3]);
        int lungimemysecondArray = mysecondArray.length;
        System.out.println(lungimemysecondArray);


        //27 Sep Ex 5
        char myArray1[] = {'a', 'b', 'c', 'd'};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[3]);
        for (int i=0; i<myArray1.length; i++) {
            System.out.println(myArray1[i]);
        }
    }
}



