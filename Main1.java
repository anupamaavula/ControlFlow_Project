import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        // System.out.println("HEllo world");

        // AsciiChars.printNumbers();
        // AsciiChars.printLowerCase();
        // AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please ENTER YOUR NAME: "); 
        String username = scanner.next();
        System.out.println(String.format("HELLO %s ", username));

        System.out.println("Please choose 'yes' or 'no'from the list to proceed");
        String choice=scanner.next();

        if(choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))){
            System.out.println("Please continue with the interactive portion.");
        }else{
            System.out.println("Please return later to complete the survey...");
            System.exit(0);

        }
        // Use a loop to repeatedly ask the user some questions.
        boolean repeat=true;
        
        do{
            String set="";
            String petName;
            int petAge;
            int luckyNumber;
            int jerseyNumber;
            int modelYear;
            String actorName;
            int randomNumber;

            do{
                System.out.print("What is the name of your favorite pet.");
                petName=scanner.next();

                System.out.print("What is the age of your favorite pet.");
                petAge=scanner.nextInt();

                System.out.print("What is your lucky number?");
                luckyNumber=scanner.nextInt();

                System.out.print("Do you have a favorite quarterback? Select (yes/no) ");
                String favQB=scanner.next();
                   
                    if(favQB.equalsIgnoreCase("yes") || (favQB.equalsIgnoreCase("y"))){
                        System.out.println("What is their jersey number");
                        jerseyNumber=scanner.nextInt();
                    }

                System.out.print("What is two-digit Model year of your car?");
                modelYear = scanner.nextInt();

                System.out.print("What is the name of  your favorite actor or actress?  ");
                actorName = scanner.next();

                System.out.print("Enter a random number between 1 and 50");
                randomNumber=scanner.nextInt();

                // System.out.print("Do you like to generate another set of numbers?");
                // set=scanner.next();
            }while(set.equalsIgnoreCase("yes") || (set.equalsIgnoreCase("y")));

            //Generating the random numbers

            Random random1= new Random();

            int random_int1=random1.nextInt(75);
            int random_int2=random1.nextInt(65);
            // int random_int3=random1.nextInt(0);

            System.out.println("RandomNumber1:"+random_int1);
            System.out.println("RandomNumber2:"+random_int2);


            //Generating Magic ball number:

            int magicBallNumber=random_int1 *luckyNumber;

            while(magicBallNumber>75){
                magicBallNumber = magicBallNumber-75;

            }
            System.out.println("Magic Ball Number is:"+magicBallNumber);
            

            //Lottery numbers.

            int lotteryNo1 =42;//Use the value 42.
            

            int lotteryNo2=petAge+modelYear;  // Use the age of their favorite pet + their car model year.
            

            int lotteryNo3=modelYear + luckyNumber;  //Use the two digit model year of their car and add their lucky number to it.

            

            int lotteryNo4=randomNumber-random_int2;  //Use the random number between 1 and 50, subtracting one of the generated random numbers.

            if(lotteryNo4<1){
                lotteryNo4=lotteryNo4+65;
            }

            int lotteryNo5=actorName.charAt(0);  //Convert the first letter of their favorite actor/actress to an integer and use that value.

            
            System.out.println("List of Lottery numbers:"+lotteryNo1+","+lotteryNo2+","+lotteryNo3+","+lotteryNo4+","+lotteryNo5);
            System.out.println("Do you want to continue playing:");

            String repeatAnswer=scanner.next();
            if(repeatAnswer.equalsIgnoreCase("yes")){
                repeat=true;
            }else{
                repeat=false;
                System.out.println("Thanks for playing");
            }


   }while(repeat);

scanner.close();
 }
}
    
