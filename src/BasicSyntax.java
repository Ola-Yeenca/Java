public class BasicSyntax {
    public static void  main (String[] args) {
        // this are the basic syntax in java for storing and getting datatypes.
        /*
        this style of comment is used for multiple lines and the one above is for
        single comments
         */


        String name = "Ola Yinka";
        int yearOfLearning = 2023;
        byte months = 9;
        String school = "IES Abastos";
        String city = "Valencia";
        double height = 5.7;
        long milleAwayFromHome = 212757589829L;
        boolean guess = false;

        System.out.println("Hello, World!");
        System.out.printf("My name is %s, I am currently learning Java in %d, " +
                "in %s, in the city of %s. Okay, I don't know what i meant by height %f but i know" +
                " I am  %d way from home. Okay, is all these true? Nah, some are %b%n! lol",
                name, yearOfLearning, school, city, height, milleAwayFromHome, guess);



    }
}
