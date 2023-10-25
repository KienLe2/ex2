public class Mars {
    public static void main(String[] args) {
        float Mars;
        float Earths = 9.8F;//9,80665 m/s² float to double "."
        double marsDouble;
        int marsInt;
        char charA;

        //calculating Weight of Mars
        Mars = (Earths * 38F); //
        System.out.println("Earth is: " + Earths +"& Mars is: "+ Mars);

        //trans Float to Double on Mars
        marsDouble = Mars;//declearing
        System.out.println("Mars to Double Type: "+ Mars);

        //printing variable double to limiting its length to 4 decimal places
        System.out.printf("Mars limit length with 4DEC: "+ Mars);

        //printing Int from Double
        marsInt = (int) marsDouble;
        System.out.println("Mars to Int : "+ Mars);

        //printing Char from Int
        charA = (char) marsInt;
        System.out.println("Mars to Char : "+ Mars);

        //Math char type to int
        char a = 1;
        char b = 2;
        int c;
        c = a + b;
        System.out.println("Result : "+ c);
    }
}
