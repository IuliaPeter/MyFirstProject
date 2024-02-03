public class JavaMethods {
    //main
    public static void main(String[] args) {
        printHello();
        printHello();
        weLearn();
        helloName("Cristina");
        helloName("Lavinia");
        getSum(2,3);
        getSum(10,5);
        getProduct(2,3);
        getSum(2,3,5);
        getSum(2.3,5.6);
        helloNameAge("Cristina",19);
        printFriends("Cristina","Ioana");
        int result = getSumWithReturn(5,6);
        System.out.println(result);
        System.out.println(getSumWithReturn(7,9));
        System.out.println(getProductWithReturn(5,6));
        System.out.println(areMere("Ana"));
        System.out.println(areMere("Diana"));
        System.out.println(metodaEx6("abcdefg"));
        System.out.println(metodaEx5optionale(-5,7,1,87));
        System.out.println(metodaEx6optionale("Mesopotamia"));
        System.out.println(metodaEx6optionale("casa"));
        System.out.println(metodaEx8optionale(873));
    }

    private static void printHello(){
        System.out.println("Hello World");
    }

    private static void weLearn(){
        System.out.println("We learn about Methods");
    }

    private static void helloName(String name){
        System.out.println("Hello "+name);
    }

    private static void helloNameAge(String name, int age){
        System.out.println(name+" is "+age+" years old");
    }

    /*scrieti o metoda care primeste doi parametri de tip String - name1 si name2
    si afiseaza "name1 si name2 are friends"*/
    private static void printFriends(String name1, String name2){
        System.out.println(name1+" and "+name2+" are friends");
    }

    private static void getSum(int x, int y){
        System.out.println(x+y);
    }

    private static void getSum(double x, double y){
        System.out.println(x+y);
    }

    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    private static void getProduct(int x, int y){
        System.out.println(x*y);
    }

    // 28 Noi Ex 6

        private static String metodaex6(String cuvant){
        String cuvantInversat = "";
        int lungime=cuvant.length();
        for (int i=lungime-1; i>=0; i--){
            cuvantInversat=cuvantInversat+cuvant.charAt(i);
        }
        return cuvantInversat;
    }

    // 28 noi Ex 5
    private static int metodaEx5optionale (int a,int b, int c, int d){
        int max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        if (d>max){
            max=d;
        }
        return max;
    }

    // Ex 6 Optionale
    private static String metodaEx6optionale (String cuvant) {
        String litereleDinMijloc = "";
        int lungimeaCuvantului=cuvant.length();
        if (lungimeaCuvantului % 2 == 0) // daca avem un nr par de caractere
        {
            int pozitieLitera1 = lungimeaCuvantului/ 2 - 1;
            int pozitieLitera2 = lungimeaCuvantului/ 2;
            litereleDinMijloc = litereleDinMijloc + cuvant.charAt(pozitieLitera1) + cuvant.charAt(pozitieLitera2);
        } else litereleDinMijloc=litereleDinMijloc+cuvant.charAt(lungimeaCuvantului/2);

        return litereleDinMijloc;
    }

    // Ex 8 Optionale
    //873
    public static int metodaEx8optionale (int numar){
        int sum=0;
        while (numar!=0){
            sum=sum+numar%10;
            numar=numar/10;
        }

        return sum;
    }

}

