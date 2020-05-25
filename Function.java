import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Angka minimal :");
        // byte inputMin = scanner.nextByte();

        // System.out.print("Angka maksimal :");
        // byte inputMax = scanner.nextByte();

        // System.out.println(Arrays.toString(output));
        // System.out.println(generateArrayFromRange(inputMin, inputMax));

        System.out.print("Angka :");
        byte input = scanner.nextByte();

        System.out.println(findNumber(input));

    }

    public static boolean findNumber(int input) {
        int angka[] = { 3, 6, 8, 7, 2 };
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == input)
                return true;
        }
        return false;
    }
}

// public static ArrayList<Integer> generateArrayFromRange(int inputMin, int
// inputMax) {
// if (inputMin < inputMax) {
// ArrayList<Integer> output = new ArrayList<Integer>();

// for (int i = inputMin; i <= inputMax; i++) {
// output.add(i);
// }

// return output;
// }
// return new ArrayList<Integer>();

// }
// }