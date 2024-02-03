import org.w3c.dom.ls.LSOutput;

public class Exercitii {
    public static void main(String[] args) {

        // 18 Oct Ex 1
        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }

        // 18 Oct Ex 2
        for (int i=20; i>=10; i--) {
            System.out.println(i);
        }

        // 18 Oct Ex 3
        int number=100;
        System.out.println ("List of even numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++) {
            if (i%2==0) {
                System.out.println(i + " ");
            }
        }

        // 18 Oct Ex 4
        String fructe[] = {"mar", "capsuni", "pere", "banane"};
        //varianta 1 - FOR clasic
        for(int i=0; i<fructe.length; i++){
            System.out.println("Imi place sa mananc " +fructe[i]);
        }
        //varianta 2 - FOR EACH
        for (String f: fructe){
            System.out.println("Imi place sa mananc " +f);
        }

        // 18 Oct Ex 5
        int luna = 7;
        switch(luna){
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11: System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
        }

       //27 Oct Ex 1 op
       int temperature = 30;
        if(temperature<18){
            System.out.println("prea frig");
    }
        else if(temperature>=18&&temperature<=22){
            System.out.println("ok");
    }
        else
                System.out.println("too hot");


        //27 Oct Ex 2 op
        char gender = 'f';
        boolean married = true;
        //varianta 1
        if(gender=='m'){
        System.out.println("Domnul");
    }

    else if(gender=='f'&&married==false){
        System.out.println("Domnisoara");
    }
    else if(gender=='f'&&married==true){
        System.out.println("Doamna");
    }

       //varianta 2 IF in IF
    if(gender=='m'){
        System.out.println("Domnul");
    }
    else if(gender=='f'){
        if (married){
            System.out.println("Doamna");
        }
        else System.out.println("Domnisoara");
    }

       //varianta 3
        switch(gender){
            case 'm':
                System.out.println("Domnul"); break;
            case 'f': if(married) {
                System.out.println("Doamna");
            }   else System.out.println("Domnisoara");break;
        }

        //27 Oct Ex 3 op
        int x=55;
        int y=9;
        if (x>y) {
            System.out.println(x + " este mai mare decat " + y);
        }
        if (x == y) {
            System.out.println("sunt egale");
        }

        //27 Oct Ex 4 op
        int z=18;
        if (x>y&&x>z){
            System.out.println(x + " este cel mai mare");
        }
        else if (y>x&&y>z){
            System.out.println(y + " este cel mai mare");
        }
        else {
            System.out.println(z + " este cel mai mare");
        }
        }


        //27 Oct Ex 5 op
        char letter = 'u';
        //if(letter=='a'||
    //letter=='e'||
   // letter=='i'||
   // letter=='o'||
   // letter=='u'){
        //System.out.println(letter+" este vocala");

       // else System.out.println(letter+" este consoana");

}



