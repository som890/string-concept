// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create a String and refer name to it
        String name = "Lò Văn ";

       //JVM creates new String with Lo VAn Som but nothing refer to it => second String is lost.
       name.concat("Sớm");

        System.out.println(name);
    }
}