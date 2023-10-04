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

        String tara="Norvegia";
        int lungimeastringului=tara.length();
        System.out.println(lungimeastringului);

    }
}
