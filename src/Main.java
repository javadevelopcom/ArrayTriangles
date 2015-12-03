import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arrayLength = getArrayLength();

        printArray(arrayLength);

        rectangle(arrayLength);
        triangleOne(arrayLength);
        triangleTwo(arrayLength);
        triangleThree(arrayLength);
        triangleFour(arrayLength);
        triangleFloyds(arrayLength);

    }

    private static int getArrayLength() {
        Scanner inlength = new Scanner(System.in);

        System.out.println("enter array size: ");

        return inlength.nextInt();
    }

    private static void printArray(int arrayLength) {
        Scanner inarray = new Scanner(System.in);
        System.out.println("enter array values(numbers): ");
        Integer[] array = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = inarray.nextInt();
        }
        inarray.close();
        System.out.println(Arrays.toString(array));
    }

    private static void triangleOne(int arrayLength) {
        System.out.println("Building triangle: ");
        String[][] triangle = new String[arrayLength][arrayLength];
        for (int row = 0; row < triangle.length; row++) {
            for (int column = 0; column < triangle.length - row; column++) {
                System.out.print("*");
                triangle[row][column] = "*";
                triangle[0][column] = "c";
            }
            System.out.println();
            triangle[row][0] = "r";
        }
        System.out.println();
        System.out.println(Arrays.deepToString(triangle));
    }

    private static void triangleTwo(int arrayLength) {
        System.out.println("Building triangle: ");
        String[][] triangle = new String[arrayLength][arrayLength];
        for (int row = 0; row < triangle.length; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
                triangle[row][column] = "*";
                triangle[0][column] = "c";
            }
            System.out.println();
            triangle[row][0] = "r";
        }
        System.out.println();
        System.out.println(Arrays.deepToString(triangle));
    }

    private static void triangleThree(int arrayLength) {
        System.out.println("Building triangle: ");
        String[][] triangle = new String[arrayLength][arrayLength];
        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new String[row + 1];
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
                triangle[row][column] = "*";
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(triangle));
    }

    private static void triangleFour(int arrayLength) {
        int value = 1;
        System.out.println("Triangle: ");
        for (int i = 0; i <= arrayLength; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(value + "\t");
            }
            System.out.println("*");
        }
    }

    private static void triangleFloyds(int arrayLength) {
        int value = 1;
        System.out.println("Floyd’s Triangle: ");
        for (int i = 1; i <= arrayLength; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }
    }

    private static void rectangle(int arrayLength) {
        System.out.println("Building rectangle: ");
        String[][] rectangle = new String[arrayLength][arrayLength];
        System.out.println(Arrays.deepToString(rectangle));
        for (int row = 0; row < rectangle.length; row++) {
            for (int column = 0; column < rectangle.length; column++) {
                System.out.print("*");
                rectangle[row][column] = "*";
                rectangle[0][column] = "c";
            }
            System.out.println();
            rectangle[row][0] = "r";
        }
        System.out.println();
        System.out.println(Arrays.deepToString(rectangle));
    }
}

// http://javaconceptoftheday.com/how-to-print-floyds-triangle-in-java/