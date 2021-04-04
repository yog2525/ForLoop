        //Q1:- Print any 10 numbers between given/user input range.

import java.util.Scanner;

public class JavaHomeWorkMerged {

    public static void AnyNumber(){ //  instant method

       Scanner scanner = new Scanner(System.in); // Created Scanner Class
        System.out.println("Answer 1");
        System.out.println("Enter First Number");
        int a = scanner.nextInt(); // variable
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        for (int i = a; i <= b && i <= a + 10; i++) {    //for loop method


            System.out.println(i)  ; //Print out

        }}
        //Q2:- Print the sequence (Fibonacci number - limitation is n.)

        public static void fibonacciNumber (){  //instant method
            int n, a = 0, b = 0, c = 1;

          Scanner scanner = new Scanner(System.in);  //Created scanner class
            System.out.println("Answer 2");
            System.out.println("Enter value of n:");  // Input Data when printed

            n = scanner.nextInt();

            System.out.println("Fibonacci Series:");

            for (int i = 1; i <= n; i++) {   //for loop method
                a = b;

                b = c;

                c = a + b;

                System.out.println( " Fibonacci no are " + "    " + a);

            }
        }
        //Q3:- Program to check whether input number is prime or not

        public static void primeornot() { //instant method
            Scanner s = new Scanner(System.in);    //Created scanner class
            System.out.println("Answer 3");
            System.out.println("Enter a number : ");
            int n = s.nextInt(); // Input Data when printed
            if (isPrime(n)) { // Created If Else method
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }

        public static boolean isPrime ( int n){  //Condition
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


        //Q4:- Reverse a number using for Loop
        public static void Reverseanumber () { // Created method
            Scanner scanner = new Scanner(System.in);  //Created scanner class
            System.out.println("Answer 4");
            System.out.println("Enter Higher value Number");
            int a = (scanner.nextInt());
            System.out.println("Enter Lower Value Number");
            int b = (scanner.nextInt());
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
            for (int i = a; i <=b ; i++) {
                System.out.println( "Invalid Data Entered");


            }
        }

        //Q5:- Finding factorial of a number entered by user

        public static void findingfactorialnumber () {  // Created method
            int num1;
            int factorial = 1; // Declaring variable
            Scanner scanner = new Scanner(System.in);  //Created scanner class
            System.out.println("Answer 5");
            System.out.println("Enter The Number");
            num1 = scanner.nextInt();   // user enter value
            for (int i = num1; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("Factorial number of " + num1 + " is: " + factorial);
        }

                //Q6:- Display Sum of n Natural Number

        public static void naturalNumber () {  // Created method
            int n, sum = 0;  // Declaring variable
            Scanner scanner = new Scanner(System.in);  //Created scanner class
            System.out.println("Answer 6");
            System.out.println("Enter the Number");
            n = scanner.nextInt();  // user enter value
            for (int i = 1; i <= n; i++) {
                sum = sum + i;}

                System.out.println(sum);

        }

        // Q7:-Making Calculator using the switch statement

        public static void calculator () {  // Created method
            Scanner scanner = new Scanner(System.in); //Created scanner class
            System.out.println("Answer 7");
            System.out.println("Enter the First Number");
            Double no1 = scanner.nextDouble();  // user enter value
            System.out.println("Enter the Second Number");
            Double no2 = scanner.nextDouble(); // user enter value
            System.out.println("Select Symbol(+,-,/,*,%) ");
            String sym = scanner.next();  // user enter value
            Double res;
            switch (sym) {        // Used switch method

                case "+":
                    res = no1 + no2;
                    System.out.println("Answer is: " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Answer is: " + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Answer is: " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Answer is: " + res);
                    break;
                case "%":
                    res = no1 * no2/100;
                    System.out.println("Answer is: " + res);
                    break;
                default:
                    System.out.println("Invalid Symbol"); // Given extra condition
                    break;
            }
        }
        //Q8:- WAP a program that prints the sum of x ranging from 1 to 20.

        public static void sumofxrange () {  // created method


                Scanner scanner = new Scanner(System.in);
                System.out.println("Answer 8");
                System.out.println("Enter number:");
                int l = scanner.nextInt();
                int sum1 = 0; // Declaring variable

            for (int i = 1; i <=l; i++)
            { if (l>20) //if number is more then 20 then sum should not be printed
            {
                System.out.println("Please Enter Range between 1 to 20");
                break;}

                else;
                sum1 = sum1 + 1;
                System.out.println("Sum of "+l+" is: " + sum1);
                           }
            }
            //9:- WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

        public static void divideby3and5seperatly () {  // created method
            Scanner scanner = new Scanner(System.in); //Created scanner class
            System.out.println("Answer 9");
            System.out.println("Enter Number");
            int no1 = scanner.nextInt();  // user input value

            for (int i = 1; i <= 100; i++) //for loop method
                if (i % 3 == 0) {
                    System.out.println(i  + ", ");
                }

            for (int j = 1; j <= 100; j++)
                if (j % 5 == 0) {
                    System.out.println(j+ ", ");
                }
        }

        //Q10:- Java Program to Print Multiplication Table for any Number

        public static void multiplicationtTable () {  // created method
            Scanner scanner = new Scanner(System.in); //Created scanner class
            System.out.println("Answer 10");
            System.out.print("Enter number:");
            int n = scanner.nextInt();  // user input value
            scanner.nextLine();
            for (int i = 1; i <= 1; i++)  // for loop method
                for (int j = 1; j <= 10; j++) {
                    System.out.println(n + "x" + j + "=" + n * j);
                }
        }

        //Q11:- WAP to enter any String and count total number of 'a' in that String.

        public static void  CharacterFrequency(){ // created method
            Scanner scanner = new Scanner(System.in); //Created scanner class
            System.out.println("Answer 11");
            System.out.println("Enter Word");
            String p = scanner.nextLine();  // Created String value
            System.out.println("Character\tFrequency");
            int count = 0;
            for (int i = 0; i < p.length(); i++) { //for loop
                if (p.charAt(i) == 'a') count++;

            }
            System.out.println('a' + "\t          " + count);
        }

        //Q12:- Find out sum of numbers between a & b which are divisible by 9.
        //User should be able to input starting number a & end number b.

    public static void dividable() {
        int n1;  // created method
        int n2;

        Scanner scanner = new Scanner(System.in); //Created scanner class
        System.out.println("Answer 12");
        System.out.println("Enter First Number");
        n1 = scanner.nextInt(); // user input value
        System.out.println("Enter Second Number");
        n2 = scanner.nextInt();
        int sum=0; // declaring value
        for (int i = n1; i <=n2; i++) { // for loop
            if (i%9==0){
                sum=sum+i;
                System.out.println(i+ " ");
            }
        }

        System.out.println("Total Sum is: " + (sum));
    }

        //Q13:- Find min & maximum number from 3 numbers which user enters.

        public static void MinAndMaxNumber() {

                Scanner s = new Scanner(System.in); //Created scanner class
            System.out.println("Answer 13");
                System.out.println("Enter First Number");
                int no1 = s.nextInt();  // user input value
                System.out.println("Enter Second Number");
                int no2 = s.nextInt();  // user input value
                System.out.println("Enter Third Number");
                int no3 = s.nextInt(); // user input value

                if (no1 <= no2 && no1 <= no3) // if else method
                System.out.println( no1 + " is the minimum number.");
                if (no1 >= no2 && no1 >= no3 )
                System.out.println( no1 + " is the maximum number.");
                if (no2 <= no1 && no2 <= no3)
                System.out.println( no2 + " is the minimum number.");
                if (no2 >= no1 && no2 >= no3)
                System.out.println( no2 + " is the maximum number.");
                if (no3 <= no1 && no3 <= no2)
                System.out.println( no3 + " is the minimum number.");
                else if (no3 >= no1 && no3 >= no2)
                System.out.println( no3 + " is the maximum number.");
                else
                System.out.println( no3 + " inr.");
                }

        //Q:-14 Find the average & sum between two numbers which user enters (start number a & end number b)


                    public static void AverageNSum() {

                        Scanner s = new Scanner(System.in);  // create Scanner class object
                        double num1 = 0; // created double
                        double num2 = 0;
                        double loopCount = 0; // created loop
                        double sum = 0.0;
                        double avg = 0.0;
                        System.out.println("Answer 14");
                        System.out.println("Enter First numbers: ");
                        num1 = s.nextDouble(); // user enter value
                        System.out.println("Enter Second numbers: ");
                        num2 = s.nextDouble();
                        for (double i = num1; i <= num2; i++) {
                            sum = sum + i;

                            loopCount = num2 - num1 + 1;

                        }

                        System.out.println("Sum of " + num1 + " & " + num2 + " is: " + sum);
                        avg = sum / loopCount;   // calculate the average value

                        System.out.println("Average: " + avg);  // display result
                    }



                    //Q:-15. Print the following Triangular pattern where can input one number

        public static void TriangulerPattern () {  // created class

            Scanner scanner = new Scanner(System.in);  // create Scanner class object
            System.out.println("Answer 15");
            System.out.print("Enter number:");
             int i, j ;  //i for rows and j for columns
                int row= scanner.nextInt();
            for (i = 0; i < row; i++)  //outer loop for rows
            {

                for (j = 0; j <= i; j++)  //inner loop for columns
                {

                    System.out.print("* ");//prints stars
                }

                System.out.println();
            }
        }

        public static void main(String[] args){
            AnyNumber();                        //      ANS:   1
            fibonacciNumber ();                  //     ANS:   2
            primeornot();                        //     ANS:   3
            Reverseanumber ();                   //     ANS:   4
            findingfactorialnumber ();          //      ANS:   5
            naturalNumber();                    //      ANS:   6
            calculator ();                      //      ANS:   7
            sumofxrange ();                      //     ANS:   8
            divideby3and5seperatly ();           //     ANS:   9
            multiplicationtTable ();             //     ANS:  10
            CharacterFrequency ();              //      ANS:  11
            dividable();                        //      ANS:  12
            MinAndMaxNumber();                  //      ANS:  13
            AverageNSum();                      //      ANS:  14
            TriangulerPattern ();               //      ANS:  15
}}