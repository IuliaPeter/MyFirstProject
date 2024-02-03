public class myString
{
    public static void main(String[] args) {
        String myString = "This is a text";
        int lungime= myString.length();
        System.out.println("lungimea textului este " + lungime);

        String myName= "Iulia Peter";
        int lungimeanumelui=myName.length();
        System.out.println(lungimeanumelui);
        System.out.println("lungimea numelui \""+myName+"\" este "+lungimeanumelui);
        System.out.println(lungimeanumelui);

        String myNameWithoutSpace=myName.replace(" ", "");
        int lungimeaNumeluiFaraSpatii = myNameWithoutSpace.length();
        System.out.println(lungimeaNumeluiFaraSpatii);

        char aPatraLitera= myName.charAt(4);
        System.out.println(aPatraLitera);
        char PrimaLitera=myName.charAt(0);
        System.out.println(PrimaLitera);

        // 20 Sep Ex 3
        String tara="Norvegia";
        int lungimeastringului=tara.length();
        System.out.println(lungimeastringului);

        //27 Sep Ex 2
        String myFavouriteMovie="Everything Everywhere All at Once";
        System.out.println("My favourite movie is " + "\"" + myFavouriteMovie + "\"");


        //27 Sep Ex 3
        myFavouriteMovie.toUpperCase();
        myFavouriteMovie.toLowerCase();
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());

        //27 Sep Ex 4
        int lungimemyFavouriteMovie = myFavouriteMovie.length();
        System.out.println(lungimemyFavouriteMovie);
    }
}
