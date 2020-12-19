package se.lexicon.arrays;


import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class App {

    public static int[] numberArr2 = new int[]{1, 15, 20};
    private static String[] names = new String[0];

    public static void main(String[] args) {
        System.out.println("***************************\n*     Array Exercises     *\n***************************\n");
        Scanner scanner = new Scanner(System.in);
        int scannerValue;
        int answer = 0;

        // Ex 1
        int[] numberArray = new int[]{38, 40, 52, 65, 67, 89, 90, 100};

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }

        // Ex 2
        System.out.println("\n" + "Search for the position in the array:");
        scannerValue = scanner.nextInt();
        answer = indexOf(numberArray, scannerValue);
        System.out.println("Index position of number " + scannerValue + " is: " + answer);


        // Ex 3
        String[] names2 = {"Paris", "London", "New York", "Stockholm"};
        System.out.print("String array: ");
        for (String name : names2) {
            System.out.print(name + " ");
        }
        //System.out.print("]");
        Arrays.sort(names2);
        System.out.println(" ");
        System.out.print("Sort string array: ");
        for (String name : names2) {
            System.out.print(name + " ");
        }
        //System.out.println("Sort string array: " + names2);


        // Ex 4  Write a program which will copy the elements of one array into another
        //array
        System.out.println(" ");
        System.out.printf("Elements from first array: ");
        printArray(numberArr2);
        System.out.println(" ");
        int[] copyOfArray = Arrays.copyOf(numberArr2, numberArr2.length);
        System.out.print("Elements from second array: ");
        printArray(copyOfArray);


        //Ex 5
        //Create a two-dimensional string array [2][2]. Assign values to the 2d
        //array containing any Country and City.
        System.out.println(" ");
        String[][] countryCityArr = new String[2][2];
        countryCityArr[0][0] = "France";
        countryCityArr[0][1] = "Paris";

        countryCityArr[1][0] = "Sweden";
        countryCityArr[1][1] = "Stockholm";

        for (int i = 0; i < countryCityArr.length; i++) {
            for (int j = 0; j < countryCityArr.length; j++) {
                System.out.print(countryCityArr[i][j] + " ");
            }
            System.out.println(" ");
        }


        //Ex 6
        // Write a program which will set up an array to hold the next values in this
        //order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        int[] numbers3Arr = new int[]{43, 5, 23, 17, 2, 14};
        double sumValue = 0.0;
        for (int tot : numbers3Arr) {
            sumValue = sumValue + tot;
        }

        double dAnswer = sumValue / numbers3Arr.length;
        dAnswer = Math.round(dAnswer * 10) / 10.0;
        System.out.println("Average is: " + dAnswer);


        // Ex 7
        //Write a program which will set up an array to hold 10 numbers and print
        //out only the uneven numbers.

        int[] number4Arr = new int[]{1, 2, 4, 7, 9, 12};
        System.out.printf("Array: ");
        printArray(number4Arr);

        System.out.printf("\nOdd Array: ");
        for (int number : number4Arr) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }


        //Ex 8
        //Write a program which will remove the duplicate elements of a given
        //array [20, 20, 40, 20, 30, 40, 50, 60, 50].
        System.out.println(" ");
        int[] number5Arr = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.printf("Array: ");
        printArray(number5Arr);
        Arrays.sort(number5Arr);
        System.out.printf("\nArray without duplicate values: ");
        int arrLength = number5Arr.length;
        arrLength = removeDuplicate(number5Arr, arrLength);

        for (int i = 0; i < arrLength; i++) {
            System.out.print(number5Arr[i] + " ");
        }


        // Ex 9
        //Write a method which will add elements in an array.
        //Remember that arrays are fixed in size so you need to come up with a
        //solution to “expand” the array.
        int[] numberArrZ = new int[]{11, 22, 34};
        System.out.println("Original array: " + Arrays.toString(numberArrZ));
        int addElement = 55;
        numberArrZ = addToArr(addElement, numberArrZ);
        //System.out.println("resultArr1: " + resultArr1);
        System.out.println("\n--------------------------\nAdded element 55 to the array: ");
        System.out.println(Arrays.toString(numberArrZ));


        // Ex 10
        //Write a program which will represent multiplication table stored in
        //multidimensional array.

        int[][] multidimArr0 = new int[10][10];

        multidimArr0 = timesTable(10, 10);

        for (int row = 0; row < multidimArr0.length; row++) {
            for (int column = 0; column < multidimArr0[row].length; column++) {
                System.out.printf("%2d ", multidimArr0[row][column]);
            }
            System.out.println();
        }

        //Ex 11
        //Write a program that ask the user for an integer and repeat that
        //question until user give you a specific value that user already has been
        //told about as a message in your program. Store these values in an array
        //and print that array. After that reverse the array elements so that the
        //first element becomes the last element, the second element becomes
        //the second to last element, etc. Do not just reverse the order in which
        //they are printed. You need to change the way they are stored in the
        //array.
        System.out.println(" ");
        int[] elemetsArr = new int[1];
        int store = 0;

        scannerValue = 4;
        int rolling = -1;

        while(scannerValue != 3) {
            if(rolling > 0) {
                //add variable to array
                int[] returnArray = Arrays.copyOf(elemetsArr, elemetsArr.length + 1);
                returnArray[returnArray.length - 1] = scannerValue;
                elemetsArr = returnArray;

                System.out.println("Array elements:");
                printArray(elemetsArr);
            }
            if(rolling == 0) {
                elemetsArr[0] = scannerValue;
                printArray(elemetsArr);
            }

            rolling++;
            System.out.println("\nType in an integer, type 3 to exit: ");
            scannerValue = scanner.nextInt();
        }

        // reverse the order of the array
        for(int i = 0; i < elemetsArr.length/2; i++) {
            store = elemetsArr[i];
            elemetsArr[i] = elemetsArr[elemetsArr.length -i -1];
            elemetsArr[elemetsArr.length -i -1] = store;
        }
        System.out.println("Array after reverse: " + Arrays.toString(elemetsArr));



        //Ex 12
        //Write a program which will print the diagonal elements of twodimensional array.
        int[][] multiDimArr2 = new int[3][3];
        multiDimArr2 = timesTable(3, 3);
        System.out.println("- Original array -");
        for (int row = 0; row < multiDimArr2.length; row++) {
            for (int column = 0; column < multiDimArr2[row].length; column++) {
                System.out.printf("%2d ", multiDimArr2[row][column]);
            }
            System.out.println();
        }
        System.out.println("-Diagonal elements -");
        for (int i = 0; i < multiDimArr2.length; i++) {
            for (int j = 0; j < multiDimArr2.length; j++) {
                System.out.print(multiDimArr2[i][i] + " ");
                break;
            }
        }



        //Ex 13
        //Create two arrays with arbitrary size and fill one with random numbers.
        //Then copy over the numbers from the array with random numbers so
        //that the even numbers are located in the rear (the right side) part of the
        //array and the odd numbers are located in the front part (the left side).

        System.out.println(" ");
        int[] multiDimArr3 = new int[25];
        int[] multiDimArr4 = new int[25];
        int countOdd = 0;
        Random rand = new Random(); //instance of random class
        int randomInt = 0;
        for(int i = 0; i < multiDimArr3.length; i++) {
            randomInt = rand.nextInt(100);
            multiDimArr3[i] = randomInt;
        }
        System.out.println("- Array filled with random numbers: -");
        printArray(multiDimArr3);
        for(int number : multiDimArr3) {
            if (number % 2 != 0) {
                multiDimArr4[countOdd] = number;
                countOdd++;
            }
        }
        for(int number : multiDimArr3) {
            if (number % 2 == 0) {
                multiDimArr4[countOdd] = number;
                countOdd++;
            }
        }
        System.out.println("\n- Copy of an array where odd numbers are located in the front part -");
        printArray(multiDimArr4);
    }



    public static int[][] timesTable(int r, int c) {
        int[][] multiArrX = new int[r][c];
        for (int row = 0; row < multiArrX.length; row++) {
            for (int column = 0; column < multiArrX[row].length; column++) {
                multiArrX[row][column] = (row + 1) * (column + 1);
            }
        }
        return multiArrX;
    }

    public static int removeDuplicate(int arr[], int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int[] temp = new int[num];
        int j = 0;
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[num - 1];
        // Changing original arr
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static int indexOf(int[] numbers, int scannerValue) {
        //return names.indexOf(scannerValue);
        int indexFound;
        Arrays.sort(numbers);
        indexFound = Arrays.binarySearch(numbers, scannerValue);
        if (indexFound > 0) {
            return indexFound;
        }
        return -1;
    }

    public static void printArray(int[] numberArray) {
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] addToArr(int newElement, int[] elemetsArr) {
        int[] returnArray = Arrays.copyOf(elemetsArr, elemetsArr.length + 1);
        returnArray[returnArray.length - 1] = newElement;
        return returnArray;
    }
}
