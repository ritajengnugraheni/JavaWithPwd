import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hallo world");
        // System.out.println("hiya hiya");

        // umur
        // byte umur = 93;
        // System.out.println(umur);

        // primitive data type
        // byte short int long float double string char boolean

        // cara mengubah menjadi float nulisnya di belakang kasih f kapital contoh
        // i47.32F
        // double itu kayak decimal bisa nambah D di belakangnya
        // char grade ='B'
        // String nama ="ajeng"
        // long iniLong = 1232534657;

        // ========================//
        // REFERENCE DATA TYPE
        // String people[] = new String[5];
        // people[0] = "ajeng";

        // int people[] = { 3, 6, 8, 7, 2 };

        // int people[] = new int[5];

        // for (int i = 0; i < people.length; i++) {
        // people[i] = i * 3;
        // }
        // System.out.println(Arrays.toString(people));

        // int matrix[][] = new int[4][3];

        // matrix[0][1] = 17;
        // matrix[1][0] = 7;
        // System.out.println(Arrays.deepToString(matrix));

        // CONSTANT VARIABLE
        // final float PI = 3.14F;

        // Scanner scanner = new Scanner(System.in);
        // Byte inputAge = scanner.nextByte();
        // System.out.println("Age : " + inputAge);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String inputName = scanner.nextLine();

        Scanner scannerUmur = new Scanner(System.in);
        System.out.print("Umur : ");
        int inputUmur = scannerUmur.nextInt();

        Scanner scannerTempatTinggal = new Scanner(System.in);
        System.out.print("Tempat tinggal : ");
        String inputTempatTinggal = scannerTempatTinggal.nextLine();

        Scanner scannerLahirTahun = new Scanner(System.in);
        System.out.print("Lahir Tahun : ");
        int inputLahirTahun = scannerLahirTahun.nextInt();

        // System.out.println("Nama : " + inputName + "Umur : " + inputUmur);
        System.out.println("Nama : " + inputName + ", Umur : " + inputUmur + ", Tempat Tinggal :" + inputTempatTinggal
                + ", Tahun Lahir :" + inputLahirTahun);

        // PR nama umur tahun, tinggal di, lahir tahun

    }
}