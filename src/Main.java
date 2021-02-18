import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

package com.crumble;

import java.util.Scanner;

        public class Section5 {

            public static void main(String[] args) {
                //Exercise 11
                System.out.println("Exercise 11");
                printNumberInWord(0);
                printNumberInWord(3);
                printNumberInWord(9);
                printNumberInWord(11);

                //Exercise 12
                System.out.println("\nExercise 12");
                System.out.println(getDaysInMonth(1,2020));
                System.out.println(getDaysInMonth(2,2020));
                System.out.println(getDaysInMonth(2,2018));
                System.out.println(getDaysInMonth(-1,2020));
                System.out.println(getDaysInMonth(1,-2020));

                //Sum 3 and 5 challenge (Section 5 Lecture 44)
                System.out.println("\nS5 L44 Challenge");
                int sum = 0;
                int count = 0;
                for(int i=1; i<=1000; i++){
                    if(i%3==0 && i%5==0){
                        sum += i;
                        System.out.println(i);
                        count++;
                        if(count==5){
                            break;
                        }
                    }
                }
                System.out.println("Sum = " + sum);

                //Exercise 13
                System.out.println("\nExercise 13");
                System.out.println(sumOdd(1,100));
                System.out.println(sumOdd(-1,100));
                System.out.println(sumOdd(100,100));
                System.out.println(sumOdd(100,-100));
                System.out.println(sumOdd(100,1000));

                //Section 5 Lecture 45 Challenge
                System.out.println("\nS5 L45 Challenge");
                int number = 4;
                int finishNumber = 20;
                int evenNumbersFound = 0;

                while(number <= finishNumber){      //current break condition
                    number++;                       // start with incrementation before executing any breaks
                    if(!isEvenNumber(number)){
                        continue;                   // bypass the rest of the code below and start loop again
                    }
                    System.out.println("Even number found = " + number);
                    evenNumbersFound++;
                    if(evenNumbersFound >= 5){
                        break;                      // additional break condition
                    }
                }
                System.out.println("Even numbers found " + evenNumbersFound);

                //Digit Sum Section 5 Lecture 47 Challenge
                System.out.println("\nS5 L47 Challenge");
                System.out.println(sumDigits(125));
                System.out.println(sumDigits(1));
                System.out.println(sumDigits(32123));

                //Exercise 14
                System.out.println("\nExercise 14");
                System.out.println(isPalindrome(-1221));
                System.out.println(isPalindrome(707));
                System.out.println(isPalindrome(11212));

                //Exercise 15
                System.out.println("\nExercise 15");
                System.out.println(sumFirstAndLastDigit(252));
                System.out.println(sumFirstAndLastDigit(257));
                System.out.println(sumFirstAndLastDigit(0));
                System.out.println(sumFirstAndLastDigit(5));
                System.out.println(sumFirstAndLastDigit(-10));

                //Exercise 16
                System.out.println("\nExercise 16");
                System.out.println(getEvenDigitSum(123456789));
                System.out.println(getEvenDigitSum(252));
                System.out.println(getEvenDigitSum(-22));

                //Exercise 17
                System.out.println("\nExercise 17");
                System.out.println(hasSharedDigit(12,23));
                System.out.println(hasSharedDigit(9,99));
                System.out.println(hasSharedDigit(15,55));

                //Exercise 18
                System.out.println("\nExercise 18");
                System.out.println(hasSameLastDigit(41, 22, 71));
                System.out.println(hasSameLastDigit(23, 32, 42));
                System.out.println(hasSameLastDigit(9, 99, 999));

                //Exercise 19
                System.out.println("\nExercise 19");
                System.out.println(getGreatestCommonDivisor(25,15));
                System.out.println(getGreatestCommonDivisor(12,30));
                System.out.println(getGreatestCommonDivisor(9,18));
                System.out.println(getGreatestCommonDivisor(81,153));

                //Exercise 20
                System.out.println("\nExercise 20");
                printFactors(6);
                printFactors(32);
                printFactors(10);
                printFactors(-1);

                //Exercise 21
                System.out.println("\nExercise 21");
                System.out.println(isPerfectNumber(6));
                System.out.println(isPerfectNumber(28));
                System.out.println(isPerfectNumber(5));
                System.out.println(isPerfectNumber(-1));

                //Exercise 22
                System.out.println("\nExercise 22");
                System.out.println(getDigitCount(0));
                System.out.println(getDigitCount(123));
                System.out.println(getDigitCount(-12));
                System.out.println(getDigitCount(5200));
                System.out.println("\n"+reverse(-121));
                System.out.println(reverse(1212));
                System.out.println(reverse(1234));
                System.out.println(reverse(100));
                System.out.println();
                numberToWords(123);
                numberToWords(1010);
                numberToWords(1000);
                numberToWords(-12);

                //Exercise 23
                System.out.println("\nExercise 23");
                System.out.println(canPack(1,0,4));
                System.out.println(canPack(1,0,5));
                System.out.println(canPack(0,5,4));
                System.out.println(canPack(2,2,12));
                System.out.println(canPack(-3,2,12));

                //Exercise 24
                System.out.println("\nExercise 24");
                System.out.println(getLargestPrime(21));
                System.out.println(getLargestPrime(217));
                System.out.println(getLargestPrime(0));
                System.out.println(getLargestPrime(45));
                System.out.println(getLargestPrime(-1));

                //Exercise 25
                System.out.println("\nExercise 25");
                printSquareStar(5);
                printSquareStar(8);

                //Section 5 Lecture 51 Challenge
                System.out.println("\nS5 L51 Challenge");
                sumFromUserInput();

                //Section 5 Lecture 52 Challenge
                System.out.println("\nS5 L52 Challenge");
                minAndMaxNum();
            }

            //Exercise 11
            private static void printNumberInWord(int number){
                switch(number){
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    default:
                        System.out.println("OTHER");
                        break;
                }
            }

            //Exercise 12
            private static boolean isLeapYear(int year){
                return (year >= 1 && year <= 9999 && (year%4 == 0 && year%100 != 0 || year%400==0));
            }

            private static int getDaysInMonth(int month, int year){
                if(year<0 || year>9999){
                    return -1;
                }

                boolean isLeap = isLeapYear(year);
                int days;
                switch(month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        days = 31;
                        break;

                    case 2:
                        days = 28;
                        if (isLeap) days += 1;
                        break;

                    case 4: case 6: case 9: case 11:
                        days = 30;
                        break;

                    default: days = -1;
                        break;
                }
                return days;
            }

            //Exercise 13
            private static boolean isOdd(int number){
                if(number<0){
                    return false;
                }
                if(number%2 == 1){
                    return true;
                }
                return false;
            }

            private static int sumOdd(int start, int end){
                if((start < 0) || (end < 0) || (start>end)){
                    return -1;
                }
                int sum = 0;
                for(int i = start; i<=end; i++){
                    if(isOdd(i)){
                        sum+=i;
                    }
                }
                return sum;
            }

            //Section 5 Lecture 45
            private static boolean isEvenNumber(int number){
                return number%2==0;
            }

            //Section 5 Lecture 47
            private static int sumDigits(int number){
                if(number<10){
                    return -1;
                }
                int sum = 0;
                while(number>0){
                    sum += number % 10;
                    number/=10;
                }

                return sum;
            }

            //Exercise 14
            private static boolean isPalindrome(int number){

                int copyNumber = number;
                int tempHold = 0;

                while(copyNumber!=0){
                    tempHold *= 10;
                    tempHold += copyNumber%10;
                    copyNumber /= 10;
                }
                return (tempHold == number);
            }

            //Exercise 15
            public static int sumFirstAndLastDigit(int number){
                if (number<0){
                    return -1;
                }
                int sum = number%10;
                while(number>=10){
                    number/=10;
                }
                return sum+number;
            }

            //Exercise 16
            public static int getEvenDigitSum(int number){
                if(number<0){
                    return -1;
                }
                int sum = 0;
                while(number>0){
                    if(number%2==0){
                        sum+=number%10;
                    }
                    number/=10;
                }
                return sum;
            }

            //Exercise 17
            public static boolean hasSharedDigit(int numOne, int numTwo){
                if(numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99){
                    return false;
                }
                return (numOne%10 == numTwo%10  || numOne%10 == (numTwo/10) || numOne/10 == numTwo%10  || numOne/10 == (numTwo/10));
            }

            //Exercise 18
            public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){
                if(numOne < 10 || numOne > 1000 ||numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000) return false;

                return (numOne%10 == numTwo%10 || numOne%10 == numThree%10 || numTwo%10 == numThree%10);
            }

            //Exercise 19
            public static int getGreatestCommonDivisor(int first, int second){
                if(first<10 || second<10){
                    return -1;
                }
                int gcd = -1;
                for(int i = 1; i <= Math.max(first,second)/2; i++){
                    if(first%i == 0 && second%i == 0){
                        gcd = i;
                    }
                }
                return gcd;
            }

            //Exercise 20
            public static void printFactors(int number){
                if(number < 1){
                    System.out.println("Invalid Value");
                }
                for(int i = 1; i<= number; i++){
                    if(number%i==0){
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }

            //Exercise 21
            public static boolean isPerfectNumber(int number) {
                if (number < 1) return false;
                int sum = 0;
                for(int i = 1; i<number; i++){
                    if(number % i == 0){
                        sum += i;
                    }
                }
                return (sum == number);
            }

            //Exercise 22
            public static void numberToWords(int number){
                if(number < 0) System.out.println("Invalid Value");
                int reversedNumber = reverse(number);
                int digitCount = getDigitCount(number);
                while(reversedNumber!=0 || digitCount>0){
                    switch(reversedNumber%10){
                        case 0:
                            System.out.print("Zero ");
                            break;
                        case 1:
                            System.out.print("One ");
                            break;
                        case 2:
                            System.out.print("Two ");
                            break;
                        case 3:
                            System.out.print("Three ");
                            break;
                        case 4:
                            System.out.print("Four ");
                            break;
                        case 5:
                            System.out.print("Five ");
                            break;
                        case 6:
                            System.out.print("Six ");
                            break;
                        case 7:
                            System.out.print("Seven ");
                            break;
                        case 8:
                            System.out.print("Eight ");
                            break;
                        case 9:
                            System.out.print("Nine ");
                            break;
                        default:
                            break;
                    }
                    reversedNumber/=10;
                    digitCount--;
                }
                System.out.println();
            }

            public static int reverse(int number){
                int newVal = 0;
                while(number!=0){
                    newVal = (newVal*10)+number%10;
                    number/=10;
                }
                return newVal;
            }

            public static int getDigitCount(int number){
                if(number<0) return -1;
                if(number == 0) return 1;

                int count = 0;
                while(number!=0){
                    count++;
                    number/=10;
                }
                return count;
            }

            //Exercise 23
            public static boolean canPack(int bigCount, int smallCount, int goal) {
                if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
                if(bigCount*5 + smallCount >= goal) goal%=5;
                return(smallCount >= goal);
            }

            //Exercise 24
            public static int getLargestPrime(int number){
                if(number<2) return -1;
                int count = 2;
                while(number>1){
                    if(number%count==0){
                        number/=count;
                    }
                    else{
                        count++;
                    }
                }
                return count;
            }

            //Exercise 25
            public static void printSquareStar(int number){
                if(number<5) System.out.println("Invalid Value");
                else{
                    for(int row = 0; row<number; row++){
                        for(int col = 0; col<number; col++){
                            if(row == 0 || col == 0 || row == col || row == number-1 || col == number-1 || number-1 == (row+col)){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }

            //Section 5 Lecture 51
            public static void sumFromUserInput(){
                Scanner scanner = new Scanner(System.in);
                int userInputs = 1;
                int sum = 0;
                while(userInputs<=10){
                    System.out.println("Enter number "+userInputs+"#: ");
                    boolean hasNextInt = scanner.hasNextInt();
                    if(hasNextInt){
                        sum +=  scanner.nextInt();
                        userInputs++;
                    } else {
                        System.out.println("Invalid Number");
                    }
                    scanner.nextLine();
                }
                System.out.println("Total sum = "+sum);
                scanner.close();
            }

            public static void minAndMaxNum(){
                Scanner scanner = new Scanner(System.in);
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                while(true){
                    System.out.println("Enter number: ");
                    boolean isInt = scanner.hasNextInt();

                    if(isInt){
                        int number = scanner.nextInt();
                        if(number> max) max = number;
                        if(number< min) min = number;
                    } else {
                        break;
                    }
                    scanner.nextLine();
                }
                System.out.println("Min: "+min+" Max: "+max);
                scanner.close();
            }
        }








    }

}
