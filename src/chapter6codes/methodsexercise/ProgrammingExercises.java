package chapter6codes.methodsexercise;

import java.util.Scanner;

public class ProgrammingExercises {
    public static void main(String[] args) {
        //   System.out.println();
        //  System.out.println(  getPentagonalNumber(2));
        // getPentagonalNumber(100);
        // System.out.println();
        // System.out.println(sumDigits(234));
        // System.out.println(isPalindrome(4554));
        //reverseSixPointFour();
        // displaySortedNumbers();
        //displayPattern(5);
        //printPrime();
        // sumSeries(20);

        // System.out.println(  totalDaysInYear(2014,2034));
        // callingMethod();


        // System.out.println( area(2,3,2));
        System.out.println();
        //area(-2,3,1);
        System.out.println();
        //area(3000,8,10);
        //   isPalindrome();
        int[] count = new int[256];
        count['c']++;
        int e = 'e';
        // callingMethodToCountLetters();
        //  System.out.println("value of c in ascii is "+count['c']);
        // System.out.println("here is value of e ----> "+e);
        //getOccuringChar("paalinnndrommmme");

        // System.out.println(getNumber('A'));
        //convertWordToNumbers();
        // passwordValidity();
        //  countLetterss("welcome");
        //notPalindromicPrime();
        //  emirpPrime(31);
        //  twinPrimes(1200);

        //areaCallingMethod();
        areaOfGeometry(5.5);
    }

    //6.1
    public static int getPentagonalNumber(int n) {
        int number = -1;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            number = i * (3 * i - 1) / 2;

            if (count % 10 == 0) {
                System.out.println();
                System.out.printf("%7d", number);
            } else {
                System.out.printf("%7d", number);
            }
            count++;
        }
        return number;

    }

    //6.2
    public static int sumDigits(long n) {

        int sum = 0;
        while (n > 0) {
            sum = sum + (int) n % 10;
            n = n / 10;
        }
        return sum;
    }

    // 6.3
    public static int reverse(int number) {

        String stringNumber = Integer.toString(number);
        int stringLength = stringNumber.length();
        String newString = new StringBuilder(stringNumber).reverse().toString();
        int reverseNumber = Integer.parseInt(newString);


        return reverseNumber;

    }


    public static boolean isPalindrome(int number) {

        return number == reverse(number);

    }

    //6.4
    public static void reverseSixPointFour() {

        System.out.println(reverse(3456));

    }

    //6.5
    public static void displaySortedNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("gib drei Nummer ein! ");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();

        sort(firstNum, secondNum, thirdNum);
    }

    // 6.5 helping methods
    public static void sort(double num1, double num2, double num3) {

        double biggest = 0;
        double lowest = 0;
        double middle = 0;


        biggest = findMax(findMax(num1, num2), num3);
        lowest = findLow(findLow(num1, num2), num3);
        middle = findMax(findLow(num1, num2), findLow(findMax(num1, num2), num3));


        System.out.println("Biggest ---> " + biggest);
        System.out.println("smallest ---> " + lowest);
        System.out.println("In middle ---> " + middle);
        System.out.println(" ---> ");
    }

    //6.5 helping methods
    public static double findMax(double num1, double num2) {
        double max;
        if (num1 >= num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    //6.5 helping methods
    public static double findLow(double num1, double num2) {
        double low;
        if (num1 >= num2) {
            low = num2;
        } else {
            low = num1;
        }
        return low;
    }

    //6.6
    public static void displayPattern(int n) {


    }

    // 6.10 Methods
    public static void printPrime() {
        int count = 1;
        for (int i = 2; i < 10000; i++) {

            if (isPrime(i)) {
                if (count % 10 == 0) {
                    System.out.println(i);

                } else {
                    System.out.printf("%4d ", i);

                }
                count++;
            }
        }


    }


    //6.10 helping methods
    public static boolean isPrime(int number) {
        boolean condition = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                condition = false;
            }
        }

        return condition;
    }


    // 6.13
    public static void sumSeries(int n) {
        double sum = 0;
        System.out.println("i            " + "m(i)");
        System.out.println("-----------------------");

        for (int i = 1; i <= n; i++) {
            sum += (i / (i + 2));
            System.out.println(i + "            " + sum);
        }
    }

    //6.16
    public static int numberOfDaysInYear(int year) {
        int days = 0;
        if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }

    //6.16 helping methods
    public static int totalDaysInYear(int startYear, int endYear) {

        int days = 0;
        for (int i = startYear; i <= endYear; i++) {
            days += numberOfDaysInYear(i);
        }
        return days;
    }

    //6.17
    public static void printMatrix(int n) {
        int size = n * n;
        for (int i = 1; i <= size; i++) {
            int j = (int) (Math.random() * 2);
            if (i % n == 0) {
                System.out.println(" " + j);
            } else {
                System.out.print(" " + j);
            }
        }
    }

    //6.17
    public static void callingMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("gib zahl ein!");
        int n = input.nextInt();
        printMatrix(n);
    }

    //6.18
    public static boolean isValidPassword(String password) {
        StringBuilder stringBuilder = new StringBuilder();
        if (password.length() >= 10) {


            return true;
        }
        return false;
    }

    public static boolean isValid(double side1, double side2, double side3) {

        boolean firstCondition = side1 + side2 > side3;
        boolean secondCondition = side1 + side3 > side2;
        boolean thirdCondition = side2 + side3 > side1;


        if (side1 > 0 && side2 > 0 && side3 > 0 && firstCondition
                && secondCondition
                && thirdCondition) {
            return true;
        }

        System.out.print("Input in invalid");
        return false;
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        if (isValid(side1, side2, side3)) {
            double areaSquare = (s - side1) * (s - side2) * (s - side3);
            double area = Math.sqrt(areaSquare);
            return area;
        }
        return -1;

    }

    public static void countLetters(String str) {
        int MAX_CHAR = 256;
//creating an array of size 256 (ASCII_SIZE)
        int count[] = new int[MAX_CHAR];
//finds the length of the string
        int len = str.length();

//initialize count array index
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
//create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
//if any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
//prints occurrence of the character
                System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
        }
    }

    public static void callingMethodToCountLetters() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib wort ein! ");
        String string = input.nextLine();
        countLetters(string);

    }

    public static boolean isPalindrome() {
        Scanner inpute = new Scanner(System.in);
        System.out.print("gib ein wort ein!");
        String word = inpute.nextLine();

        int length = word.length() - 1;
        for (int i = 0, j = length; i < j; i++, j--) {
            if (word.charAt(i) == word.charAt(j)) {

                System.out.println(word + " is palindrome.");
                return true;
            }

        }
        System.out.print(word + " is not palindrome.");
        return false;
    }

    public static int getNumber(char letter) {

        char lowerCaseLetter = Character.toLowerCase(letter);
        if (lowerCaseLetter == 'a' || lowerCaseLetter == 'b' || lowerCaseLetter == 'c') {
            return 2;
        } else if (lowerCaseLetter == 'd' || lowerCaseLetter == 'e' || lowerCaseLetter == 'f') {
            return 3;
        } else if (lowerCaseLetter == 'g' || lowerCaseLetter == 'h' || lowerCaseLetter == 'i') {
            return 4;
        } else if (lowerCaseLetter == 'j' || lowerCaseLetter == 'k' || lowerCaseLetter == 'l') {
            return 5;
        } else if (lowerCaseLetter == 'm' || lowerCaseLetter == 'n' || lowerCaseLetter == 'o') {
            return 6;
        } else if (lowerCaseLetter == 'p' || lowerCaseLetter == 'q' || lowerCaseLetter == 'r' || lowerCaseLetter == 's') {
            return 7;
        } else if (lowerCaseLetter == 'v' || lowerCaseLetter == 't' || lowerCaseLetter == 'u') {
            return 8;
        } else if (lowerCaseLetter == 'w' || lowerCaseLetter == 'x' || lowerCaseLetter == 'y' || lowerCaseLetter == 'z') {
            return 9;
        }

        return -100;
    }

    //6.21 garna baki xa
    public static void convertWordToNumbers() {
        System.out.println("Gib Word ein");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] chars = s.toCharArray();
        int size = chars.length;
        int sizeofString = s.length();
        String word = "";
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < sizeofString; i++) {
            if (Character.isDigit(chars[i])) {
                //   System.out.println("--->"+stringBuilder.toString());
                stringBuilder.append(s.charAt(i));
            }
            if (getNumber(s.charAt(i)) == -100) {
                continue;
            } else {
                word = "".concat(String.valueOf(getNumber(s.charAt(i))));
            }
            word = stringBuilder.toString().concat(word);

        }
        System.out.println("-->" + word);
        System.out.println("--->" + stringBuilder.toString());


    }

    //6.18
    public static boolean passwordValidity() {

        Scanner input = new Scanner(System.in);
        System.out.println("Gib Password ein!");
        String password = input.nextLine();

        System.out.println(validCharacters(password) && validDigitContain(password) && password.length() >= 10);

        return validCharacters(password) && validDigitContain(password) && password.length() >= 10;


    }

    public static boolean validCharacters(String password) {

        int count = 0;
        int size = password.length();
        char[] chars = password.toCharArray();
        for (int i = 0; i < size; i++) {
            if (((chars[i] >= ':' && chars[i] < 'A') || chars[i] <= '/') || chars[i] > 'z') {
                System.out.println("false");
                return false;
            }

        }
        //System.out.println("true");

        return true;
    }

    public static boolean validDigitContain(String password) {
        int size = password.length();
        char[] chars = password.toCharArray();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Character.isDigit(chars[i])) {

                count++;
            }

        }
        return count >= 3;
    }

    public static int count(String string, char a) {

        char[] chars = string.toCharArray();
        int size = string.length();
        int count = 0;
        for (int i = 0; i < size; i++) {

            if (chars[i] == a) {
                chars[i] = '#';
                count++;
            }

        }
        System.out.println("---->" + count);
        return count;
    }

    // 6.20
    public static int countLetterss(String s) {
        int size = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < size; i++) {
            count(s, chars[i]);
        }


        return 0;
    }


    // comprehensive
    //6.26

    public static void palindromicPrime() {
        int count = 0;
        int i = 2;
        while (count != 120) {

            if (isPalindrome(i) && isPrime(i)) {
                count++;

                if (count % 10 == 0) {
                    System.out.println(" " + i);
                } else {
                    System.out.print(" " + i);
                }
            }
            i++;

        }
    }

    public static void notPalindromicPrime() {
        int count = 0;
        int i = 2;
        while (count != 120) {

            if (!isPalindrome(i) && isPrime(i)) {
                count++;

                if (count % 10 == 0) {
                    System.out.println(" " + i);
                } else {
                    System.out.print(" " + i);
                }
            }
            i++;

        }
    }


    // 6.27
    public static void emirpPrime(int p) {
        int mersemePrime = 0;
        System.out.println("p" + "          2°p-1");

        for (int i = 2; i <= 31; i++) {
            if (isPrime(i)) {
                if (isPrime((int) Math.pow(2, i) - 1)) {
                    mersemePrime = (int) Math.pow(2, i) - 1;
                    System.out.println(i + "            " + mersemePrime);

                }
            }
        }

    }

    public static void twinPrimes(int number) {

        for (int i = 2; i < number; i++) {

            if (isPrime(i)) {
                int secondPrime = i + 2;

                if (isPrime(i) && isPrime(secondPrime)) {
                    System.out.println("(" + i + "," + secondPrime + ")");

                }
            }
        }


    }

    /**
     * //6.30 Craps
     * public static void crap(){
     * <p>
     * boolean condition = true;
     * int count = 0;
     * <p>
     * int firstDice = (int) (Math.random()*6);
     * int secondDice = (int) (Math.random()*6);
     * String status ="";
     * <p>
     * <p>
     * }
     * <p>
     * <p>
     * public static void crap(int count){
     * if(count == 0){
     * int sum =" ";
     * switch (sum){
     * case  2:
     * case 3:
     * case 12:
     * status ="lose";
     * break;
     * <p>
     * case  7:
     * case  11:
     * status="win";
     * break;
     * case   4:
     * case   5:
     * case   6:
     * case   8:
     * case   9:
     * case   10:
     * break;
     * <p>
     * <p>
     * <p>
     * }
     * }
     * }
     */

    //6.36
    public static double area(int n, double side) {

        double area = n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
        System.out.println(area);


        return area;
    }

    //6.35
        public static  double  areaOfGeometry(double side){
        double area = 5 * Math.pow(side,2)/(4*Math.tan(Math.PI/5));
        System.out.println(area);
        return  area;

    }

    public static void areaCallingMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("gib n ein!");
        int n = input.nextInt();
        System.out.println("gib side ein!");

        double side = input.nextDouble();

        area(n, side);


    }

    public static String format(int number, int width) {

        return "";
    }

}
