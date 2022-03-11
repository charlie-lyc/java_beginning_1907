// import java.util.Date;
// import java.awt.*;       // Point Class
// import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello World");
        ///////////////////////////////////////////////

        /* Variables */
        // int age1 = 30, temperature1 = 20; // Possible but Not Recommended
        // System.out.println(age1);
        // System.out.println(temperature1);
        
        // int age2 = 30;
        // int temperature2 = 20;
        // System.out.println(age2);
        // System.out.println(temperature2);
        
        // age2 = 35;
        // temperature2 = 25;
        // System.out.println(age2);
        // System.out.println(temperature2);
        //////////////////////////////////////////////
        /* Types */

        /* Primitive */
        // byte age = 30;
        // int viewsCount = 123_456_789;     // <int> - Default
        // long bigNumber1 = 9_123_345_789L;
        // long bigNumber2 = 9_123_345_789l; // Possible but Not Recommended
        // System.out.println(age);
        // System.out.println(viewsCount);
        // System.out.println(bigNumber1);
        // System.out.println(bigNumber2);
        
        // double price = 10.99;     // <double> - Default
        // float newPrice1 = 10.99F;
        // float newPrice2 = 10.99f; // Possible
        // System.out.println(price);
        // System.out.println(newPrice1);
        // System.out.println(newPrice2);
        
        // boolean isEligible = true;
        // System.out.println(isEligible);
        // isEligible = false;
        // System.out.println(isEligible);
        
        // char letter = 'A';
        // System.out.println(letter);
        
        /* Reference */
        // Date now = new Date();
        // System.out.println(now);
        // System.out.println(now.getTime());
        
        /* Example: Primitive */
        // byte a = 1;
        // byte b = a;
        // a =2;
        // System.out.println(a);
        // System.out.println(b);
        
        /* Example: Reference */
        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // System.out.println(point1.x);
        // System.out.println(point2.x);

        // point1.x = 2;
        // System.out.println(point1.x);
        // System.out.println(point2.x);
        //////////////////////////////////////////////

        /* Strings */
        // String message1 = new String("Hello World"); // Possible
        // System.out.println(message1);
        
        // String message2 = "Hello World";
        // System.out.println(message2);
        // System.out.println(message2.length());
        // System.out.println(message2.toLowerCase());
        // System.out.println(message2.toUpperCase());
        // System.out.println(message2.startsWith("h"));
        // System.out.println(message2.endsWith("d"));
        // System.out.println(message2.indexOf("W"));
        // System.out.println(message2.indexOf("a"));
        // System.out.println(message2.replace("World","Sky"));
        
        // String message3 = " hello world ";
        // System.out.println(message3 + "!");
        // System.out.println(message3.trim() + "!");
        ////////////////////////////////////////////////////

        /* Escape Sequence */
        // String greeting = "Hello \"Charlie\"";
        // System.out.println(greeting);
        
        // String path = "c:\\Download\\...";
        // System.out.println(path);
        
        // String newLine = "Hello World.\nSee you again.";
        // System.out.println(newLine);
        
        // String tab = "Hello World.\tSee you again.";
        // System.out.println(tab);
        ///////////////////////////////////////////////////////

        /* Arrays */
        // int[] numbers1 = new int[3];
        
        // System.out.println(numbers1); // [I@4617c264
        // System.out.println(Arrays.toString(numbers1));
        
        // numbers1[0] = 1;
        // numbers1[1] = 2;
        // numbers1[2] = 3;
        
        // // numbers[3] = 4; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        
        // System.out.println(numbers1[0]);
        // System.out.println(numbers1[1]);
        // System.out.println(numbers1[2]);
        
        // // System.out.println(numbers[3]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        
        // System.out.println(Arrays.toString(numbers1));
        
        // int[] numbers2 = { 3, 7, 5, 6, 4 };
        
        // System.out.println(numbers2);
        // System.out.println(Arrays.toString(numbers2));
        // System.out.println(numbers2.length);
        
        // Arrays.sort(numbers2); // Mutable
        // System.out.println(Arrays.toString(numbers2));
        ///////////////////////////////////////////////////////

        /* Multi-dimensional Arrays */
        // int[][] numbers3 = new int[2][3]; // 2 Rows and 3 Columns' two-dimensional array
        
        // System.out.println(Arrays.toString(numbers3));
        
        // System.out.println(Arrays.deepToString(numbers3));
        // numbers3[0][0] = 1;
        // numbers3[0][1] = 2;
        // numbers3[0][2] = 3;
        // System.out.println(Arrays.deepToString(numbers3));
        
        // int[][][] numbers4 = new int[2][3][4];// 3 Rows, 4 Columns and 2 Heights' three-dimensional array
        
        // System.out.println(Arrays.deepToString(numbers4));
        // numbers4[0][0][0] = 1;
        // numbers4[0][0][1] = 2;
        // numbers4[0][0][2] = 3;
        // numbers4[0][0][3] = 4;
        // System.out.println(Arrays.deepToString(numbers4));
        
        // int[][] numbers5 = { {1, 2, 3}, {4, 5, 6} };
        // System.out.println(Arrays.deepToString(numbers5));
        ////////////////////////////////////////////////////////////

        /* Constants */
        // float pi = 3.14159F;
        // System.out.println(pi);
        
        // pi = 3.14F;
        // System.out.println(pi);
        
        // final float PI = 3.14159F;
        // System.out.println(PI);
        
        // // PI = 3.14F; // cannot assign a value to final variable PI
        ////////////////////////////////////////////////////////////

        /* Arithmetic Expressions */
        // int result1 = 10 + 3;
        // System.out.println(result1);
        
        // result1 = 10 - 3;
        // System.out.println(result1);
        
        // result1 = 10 * 3;
        // System.out.println(result1);
        
        // result1 = 10 / 3;
        // System.out.println(result1);
        
        // double result2 = (double) 10 / 3;
        // System.out.println(result2);
        
        // result1 = 10 % 3;
        // System.out.println(result1);

        // int x = 1;
        
        // ++x;
        // System.out.println(x);
        
        // x++;
        // System.out.println(x);
        
        // int y = x ++; // Later
        // System.out.println(y);
        // System.out.println(x);
        
        // y = ++ x; // In advance
        // System.out.println(y);
        // System.out.println(x);

        // int a = 1;
        // a = a + 2;
        // System.out.println(a);
        
        // int b = 1;
        // b += 2; // Shortcut
        // System.out.println(b);
        
        // int c = 1;
        // c -= 2; // Shortcut
        // System.out.println(c);
        
        // int d = 1;
        // d *= 2; // Shortcut
        // System.out.println(d);
        
        // int e = 4;
        // e /= 2; // Shortcut
        // System.out.println(e);
        ////////////////////////////////////////////////////////////

        /* Order of Operations: () => *,/ => +,- */
        // int x = 10 + 3 * 2;
        // System.out.println(x);
        
        // int y = (10 + 3) * 2;
        // System.out.println(y);
        ////////////////////////////////////////////////////////////
        /* Casting */

        /* Implicit Casting: byte => short => int => long => float => double */
        // short x = 1;
        // int y = x + 2; // Automatically cast 'x' and 2 to 'int'
        // System.out.println(y);
        
        // double a = 1.1;
        // double b = a + 2; // Automatically cast 2 and to 'double'
        // System.out.println(b);
        
        /* Explicit Casting */
        // double c = 1.1;
        // // int d = c + 2; // incompatible types: possible lossy conversion from double to int
        // int d = (int) c + 2;
        // System.out.println(d);
        
        // String e = "1";
        // // int f = e + 2; // incompatible types: java.lang.String cannot be converted to int
        // // int f = (int) e + 2; // incompatible types: java.lang.String cannot be converted to int
        // int f = Integer.parseInt(e) + 2;
        // System.out.println(f);
        
        // String g = "1.1";
        // float h = Float.parseFloat(g) + 2;
        // System.out.println(h);

        // String i = "1.11111";
        // double j = Double.parseDouble(i) + 2;
        // System.out.println(j);
        ////////////////////////////////////////////////////////////

        /* Math Class */
        // // short result1 = Math.round(1.1F); // incompatible types: possible lossy conversion from int to short
        // int result1 = Math.round(1.1F); // Math.round() returns <int>
        // System.out.println(result1);
        
        // // int result2 = Math.ceil(1.1F); // incompatible types: possible lossy conversion from double to int
        // // float result2 = Math.ceil(1.1F); // incompatible types: possible lossy conversion from double to float
        // double result2 = Math.ceil(1.1F); // Math.ceil() returns <double>
        // System.out.println(result2);
        
        // int result3 = (int) Math.ceil(1.1);
        // System.out.println(result3);
        
        // float result4 = (float) Math.ceil(1.1);
        // System.out.println(result4);
        
        // double result5 = Math.floor(1.1); // Math.floor() returns <double>
        // System.out.println(result5);
        
        // int result6 = Math.max(1, 2);
        // System.out.println(result6);
        
        // int result7 = Math.min(1, 2);
        // System.out.println(result7);
        
        // double result8 = Math.max(1, 0.9);
        // System.out.println(result8);
        
        // float result9 = Math.max(1, 0.9F); // Possible
        // System.out.println(result9);
        
        // double result10 = Math.random(); // Math.random() returns <double>
        // System.out.println(result10);
        
        // // int result11 = Math.round(Math.random() * 100); // incompatible types: possible lossy conversion from long to int
        // long result11 = Math.round(Math.random() * 100); // Math.round(Math.random()) returns <long>
        // System.out.println(result11);
        
        // int result12 = (int) Math.round(Math.random() * 100);
        // System.out.println(result12);
        
        /* Reference */
        // int result13 = (int) (Math.random() * 100); // Similar to Math.floor(Math.random() * 100)
        // System.out.println(result13);
        
        // int result14 = (int) 1.5;
        // System.out.println(result14);
        
        /* WARNING!!! */
        // int result15 = (int) Math.random() * 100;
        // System.out.println(result15);
        ////////////////////////////////////////////////////////////

        /* Formatting Numbers */
        // // NumberFormat currency = new NumberFormat(); // java.text.NumberFormat is abstract; cannot be instantiated
        
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result1 = currency.format(1234567.89);
        // System.out.println(result1);
        
        // System.out.println(currency);
        // System.out.println(currency.toString());
        // System.out.println(currency.getCurrency());
        
        // String result2 = NumberFormat.getPercentInstance().format(0.21543);
        // System.out.println(result2);
        ////////////////////////////////////////////////////////////

        /* Reading Input */
        // Scanner scanner1 = new Scanner(System.in);

        // System.out.print("Age: ");
        // // byte age1 = scanner1.nextByte();
        // // short age1 = scanner1.nextShort();
        // // long age1 = scanner1.nextLong();
        // // float age1 = scanner1.nextFloat();
        // String age1 = scanner1.next();
        // System.out.println("You are " + age1 + " years old.");

        // System.out.println("First Name: ");
        // String firstName = scanner1.next();
        // System.out.println("Last Name: ");
        // String lastName = scanner1.next();
        // System.out.println("Your are " + firstName + " " + lastName + ".");

        /* Reference */
        // Scanner scanner2 = new Scanner(System.in);

        // System.out.print("Age : ");
        // String age2 = scanner2.nextLine();
        // System.out.println("You are " + age2 + " years old.");

        // System.out.print("Full Name : ");
        // String fullName = scanner2.nextLine();
        // System.out.println("Your are " + fullName.trim() + ".");
        ////////////////////////////////////////////////////////////

        /* PROJECT: Mortgage Calculator - Part1 */
        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Principal: ");
        // int principal = scanner.nextInt();
        
        // System.out.print("Annual Interest Rate: ");
        // float annualInterest = scanner.nextFloat();
        // float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
        // System.out.print("Period (Years): ");
        // byte years = scanner.nextByte();
        // int numberOfPayments = years * MONTHS_IN_YEAR;
        // double mortgage = principal
        // * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        // / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        // String mortgageFormatted =
        // NumberFormat.getCurrencyInstance().format(mortgage);
        // System.out.println("Mortgage: " + mortgageFormatted);
        ////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        /* Control Flow */
        ///////////////////////////////////////////////////////////

        /* Comparison Operators */
        // int x = 1;
        // int y = 1;
        // System.out.println(x == y);
        // System.out.println(x != y);
        // System.out.println(x > y);
        // System.out.println(x < y);
        // System.out.println(x >= y);
        // System.out.println(x <= y);

        // int temperature = 21;
        // boolean isWarm = 20 < temperature && temperature < 30;
        // System.out.println(isWarm);

        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = true;
        // boolean hasCriminalRecord = false;
        // boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // System.out.println(isEligible);
        ///////////////////////////////////////////////////////////

        /* If Statements */
        // int temp = 32;

        // if (temp > 30) {
        //     System.out.println("It's a hot day");
        //     System.out.println("Drink water");
        // // } else if (20 < temp && temp <= 30) {
        // } else if (20 < temp) {
        //     System.out.println("Beautiful day");
        // } else {
        //     System.out.println("Cold day");
        // }
        
        /* Simplifying If Statements */
        // int income = 120_000;
        
        // // boolean hasHighIncome;
        // // if (income > 100_000) {
        // // hasHighIncome = true;
        // // } else {
        // // hasHighIncome = false;
        // // }
        // //////////////////////////////////////////////
        // // boolean hasHighIncome = false;
        // // if (income > 100_000) hasHighIncome = true;
        // //////////////////////////////////////////////
        // boolean hasHighIncome = income > 100_000;
        
        // System.out.println(hasHighIncome);
        ///////////////////////////////////////////////////////////

        /* Ternary Operator */
        // int income = 120_000;

        // // String className = "Economy";
        // // if (income > 100_000) className = "First";
        // //////////////////////////////////////////
        // String className = income > 100_000 ? "First" : "Economy";

        // System.out.println(className);
        ///////////////////////////////////////////////////////////
        
        /* Switch Statements */
        // String role = "admin";

        // // if (role == "admin")
        // // System.out.println("You're an administrator.");
        // // else if (role == "moder")
        // // System.out.println("You're a moderator.");
        // // else
        // // System.out.println("You're a guest.");
        // //////////////////////////////////////////////
        // switch (role) {
        //     case "admin":
        //         System.out.println("You're an administrator.");
        //         break;
        //     case "moder":
        //         System.out.println("You're a moderator.");
        //         break;
        //     default:
        //         System.out.println("You're a guest.");
        // }
        ///////////////////////////////////////////////////////////

        /* EXERCISE: FizzBuzz */
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Number: ");
        // int number = scanner.nextInt();

        // if (number % 5 == 0 && number % 3 == 0)
        //     System.out.println("FizzBuzz");
        // else if (number % 5 == 0)
        //     System.out.println("Fizz");
        // else if (number % 3 == 0)
        //     System.out.println("Buzz");
        // else
        //     System.out.println(number);
        ///////////////////////////////////////////////////////////

        /* For Loop */
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello World " + i);
        // }

        // for (int i = 5; i > 0; i--) {
        //     System.out.println("Hello World " + i);
        // }
        ///////////////////////////////////////////////////////////

        /* While Loops: condition check first! */
        // int i = 0;
        // while (i < 5) {
        //     System.out.println("Hello World " + i);
        //     i ++;
        // }
        
        // int j = 5;
        // while (j > 0) {
        //     System.out.println("Hello World " + j);
        //     j --;
        // }

        /* Example */
        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        
        // // while (true) {
        // //     System.out.print("Input: ");
        // //     input = scanner.next();
        // //     if (input.equals("quit")) break;
        // // }
        // ////////////////////////////////////
        // while (!input.equals("quit")) {
        //     System.out.print("Input: ");
        //     // input = scanner.next(); // Case sensitive
        //     input = scanner.next().toLowerCase(); // Case Not sensitive
        // }
        ///////////////////////////////////////////////////////////

        /* Do While Loops: execution first! */
        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        
        // do {
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        // } while (!input.equals("quit"));
        ///////////////////////////////////////////////////////////
        
        /* Break and Continue */
        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        
        // while (true) {
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        //     if (input.equals("quit"))
        //         break; // Break loop
        //     if (input.equals("pass"))
        //         continue; // Continue loop
        //     System.out.println(input);
        // }
        ///////////////////////////////////////////////////////////

        /* For-each Loop */
        // String[] fruits = { "Apple", "Mango", "Orange" };

        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }
        ///////////////////////////////////////////////////////////

        /* PROJECT: Mortgage Calculator - Part2 Completion */
        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;

        // Scanner scanner = new Scanner(System.in);

        // int principal = 0;
        // float monthlyInterest = 0;
        // int numberOfPayments = 0;

        // while (true) {
        //     System.out.print("Principal (1K ~ 1M): ");
        //     principal = scanner.nextInt();
        //     if (1000 <= principal && principal <= 1_000_000)
        //         break;
        //     System.out.println("Enter a value between 1,000 and 1,000,000");
        // }

        // float annualInterest = 0;
        // while (true) {
        //     System.out.print("Annual Interest Rate (1 ~ 30): ");
        //     annualInterest = scanner.nextFloat();
        //     if (1 <= annualInterest && annualInterest <= 30) {
        //         monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        //         break;
        //     }
        //     System.out.println("Enter a value between 1 and 30");
        // }

        // byte years = 0;
        // while (true) {
        //     System.out.print("Period (1 ~ 30 Years): ");
        //     years = scanner.nextByte();
        //     if (1 <= years && years <= 30) {
        //         numberOfPayments = years * MONTHS_IN_YEAR;
        //         break;
        //     }
        //     System.out.println("Enter a value between 1 and 30");
        // }

        // double mortgage = principal
        //         * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        //         / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        // System.out.println("Mortgage: " + mortgageFormatted);

    }
}
