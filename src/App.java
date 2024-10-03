public class App {
    public static void main(String[] args) throws Exception {
        
        //2. Start with this code:
        int age = 50;
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

        //5. Continue with at least some of the following.
        //a. If the age is equal to 18, print: ”You can drive a car”.

        if (age == 18) {
            System.out.println ("You can drive a car");
        }

        //b. If the age is 10,20,30,40,50,60,70,80,90, 100, 110 or 120, print: ”Anniversary Party!!”
        if (age==10 || age==20 || age==30 || age==40 || age==50 || age==60 || age==70 || age==80 || age==90 || age==100 || age==110 || age==120) {
            System.out.println ("Anniversary Party");
        }

        //c. If the age is 100, print three line congratulations!
        if (age == 100) {
            System.out.println ("Congratulations");
            System.out.println ("Congratulations");
            System.out.println ("Congratulations");
        }

        //d. If the age is between 40-50 wish happy mid-life.
        if (age >=40 && age <= 50) {
            System.out.println ("Happy mid-life");
        }

        

        
    }
}
