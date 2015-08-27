package com.tw.introprogex;

public class IntroductoryProgrammingExercises {

    public void printOneAsterisk() {
        System.out.println("*");
    }

    public void printAsterisksOnOneLine(int length) {
        for (int i = 0; i < length; i++)
            System.out.print("*");
        System.out.println();
    }

    public void printAsterisksOnNewLines(int depth) {
        for (int i = 0; i < depth; i++)
            System.out.println("*");
    }

    public void printAsteriskRightTriangle(int depth) {
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void printAsteriskIsoscelesTriangle(int depth) {
        int baseSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (baseSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void printAsteriskDiamond(int depth) {
        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void printAsteriskDiamondWithName(int depth) {
        int centreSize = (2 * depth) - 1;

        for (int i = 0; i < depth; i++) {
            if (i == depth -1) {
                System.out.println("monica");
                break;
            }

            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = depth - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static class FizzBuzzPresenter {

        public void fizzBuzz() {
            for (int i = 1; i <= 100; i++) {
                if (divisibleByThree(i) && divisibleByFive(i)) {
                    print("FizzBuzz");
                } else if (divisibleByThree(i)) {
                    print("Fizz");
                } else if (divisibleByFive(i)) {
                    print("Buzz");
                } else {
                    print(i);
                }
            }
        }

        private boolean divisibleByThree(int number) {
            return number % 3 == 0;
        }

        private boolean divisibleByFive(int number) {
            return number % 5 == 0;
        }

        private void print(Object o) {
            System.out.println(o);
        }
    }

    public static class PrimeFactors{

        public int n;
        public void generate(int n){
            for (int factor = 2; factor <= n; factor++) {
                int exponent = 0;
                while (n % factor == 0) {
                    n /= factor;
                    exponent++;
                }
                if (exponent > 0) {
                    System.out.println(factor+ "^" + exponent);
                }
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("1. print an asterisk");
        IntroductoryProgrammingExercises ex1 = new IntroductoryProgrammingExercises();
        ex1.printOneAsterisk();
        System.out.println();

        System.out.println("2. print a horizontal line");
        IntroductoryProgrammingExercises ex2 = new IntroductoryProgrammingExercises();
        ex2.printAsterisksOnOneLine(3);
        System.out.println();

        System.out.println("print a vertical line");
        IntroductoryProgrammingExercises ex3 = new IntroductoryProgrammingExercises();
        ex3.printAsterisksOnNewLines(3);
        System.out.println();

        System.out.println("print a right triangle");
        IntroductoryProgrammingExercises ex4 = new IntroductoryProgrammingExercises();
        ex4.printAsteriskRightTriangle(3);
        System.out.println();

        System.out.println("print an isoceles triangle");
        IntroductoryProgrammingExercises ex5 = new IntroductoryProgrammingExercises();
        ex5.printAsteriskIsoscelesTriangle(3);
        System.out.println();

        System.out.println("print a diamond");
        IntroductoryProgrammingExercises ex7 = new IntroductoryProgrammingExercises();
        ex7.printAsteriskDiamond(3);
        System.out.println();

        System.out.println("print a diamond with name");
        IntroductoryProgrammingExercises ex8 = new IntroductoryProgrammingExercises();
        ex8.printAsteriskDiamondWithName(3);
        System.out.println();

        System.out.println("print Fiz Buzz pattern");
        FizzBuzzPresenter ex9 = new FizzBuzzPresenter();
        ex9.fizzBuzz();
        System.out.println();

        System.out.println("print prime factors");
        PrimeFactors ex10 = new PrimeFactors();
        ex10.generate(30);
        System.out.println();

    }
}
