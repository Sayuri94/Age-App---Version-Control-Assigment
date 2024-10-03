public class App {
    public static void main(String[] args) throws Exception {
        
        //2. Start with this code:
        int age = 17;
        if (age > 0 && age < 18) {
            System.out.println ("You are underage");
        }
        else {
            System.out.println ("You are an adult");
        }
        System.out.println ("Press space to exit.");

        //3. Let’s make the conditions a bit better…

        if (age > 0 && age < 18) {
            System.out.println ("You are underage.");
        }
        else if (age >= 65) {
            System.out.println ("You are retired.");
        }
        else {
            System.out.println ("You are an adult");
        }

        //4. And a bit further again…
        if (age > 0 && age < 18) {
            System.out.println ("You are underage");
            if (age >= 15) {
                System.out.println ("You can drive a moped.");
            }
        }
        else if (age >= 65) {
            System.out.println ("You are retired");
        }
        else {
            System.out.println ("You are an adult");
        }





        
    }
}
