public class Operators {
    public static void main(String[] args) {
        int sum1=100+50;
        int sum2= sum1 +50;
        int sum3 =sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

        int number1=100;
        int number2=50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(9/2); //catul
        System.out.println(9%2); //restul impartirii
        System.out.println(10%7);
        System.out.println(++number1);
        //System.out.println(number1);
        System.out.println(number2+10);
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

        //number2 = number2+2;
        number2+=4; // echivalent cu number2=number2+4
        number2-=2;
        number2*=2;
        System.out.println(number2);
        System.out.println(number1<number2); //100<6
        System.out.println(10>5);
        System.out.println('A'<'B');
        System.out.println(!true);
        System.out.println(number1); //101
        System.out.println(number2); //6
        boolean condition = number1>number2 || number1<100;
        System.out.println(condition);
        if(!condition){
            System.out.println("Conditia este adevarata!");
        }
        else System.out.println("Conditia nu este adevarata");

        // 4 Oct Ex 1
        //varianta 1
        double result = 10*6;
        System.out.println(result);
        //varianta 2
        System.out.println(10*6);

        // 4 Oct Ex 2
        System.out.println(10/5);

        // 4 Oct Ex 3
        int x = 10;
        //++x;
        System.out.println(++x); //x=11

        // 4 Oct Ex 4
        x+=5; //x=16
        System.out.println(x);

        // 4 Oct Ex 5
        int y = 1;
        int z = 2;
        int k = y+z;
        if(k>=10){
            System.out.println("suma este mai mare decat 10");
        }
        else System.out.println("suma este mai mica decat 10");

        // 4 Oct Ex 6
        if (k%2==0){
            System.out.println("suma este nr par");
        }


        // 13 Oct Ex 1
        int var1=7;
        int var2=50;
        int var3=9;
        int var4=-8;
        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4%var2);

        // 13 Oct Ex 2
        ++var1;
        ++var1;
        ++var1;
        System.out.println(var1);

        //sau
        for(int i=0;i<3;i++){
            var1++;
        }

        // 13 Oct Ex 3
        var2+=2;
        var2+=2;
        System.out.println(var2);

        //sau
        for(int i=0;i<2;i++){
            var2-=2;
        }

        // 13 Oct Ex 4
        boolean cond1=true;
        boolean cond2=true;
        if (cond1=var1+var2+var3+var4>100);
        if (cond2=var1*var2*var3*var4>1000);
        System.out.println(cond1);
        System.out.println(cond2);

        // 13 Oct Ex 5
        System.out.println(cond1||cond2);
        System.out.println(cond1&&cond2);



    }
}
