public class BillTester
{
    public static void main(String[] args)
    {
        double cost = 125.45;
        //int numPeople = 10
        // Create a bill for a birthday dinner for 10 people
        Bill birthdayDinner = new Bill(cost,10);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 5 guests
        birthdayDinner = new Bill(cost, 5);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 2 guests
        birthdayDinner = new Bill(cost, 2);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);


    }
}
