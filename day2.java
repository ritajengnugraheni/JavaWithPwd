import java.util.Scanner;

public class day2 {

    // PEMBAHASAN PR
    public static void main(String[] args) {
        System.out.println("Nama, Umur, Tinggal, Lahir tahun");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama :");
        String name = scanner.nextLine();
        System.out.print("Umur :");
        byte umur = scanner.nextByte();
        System.out.print("Tinggal :");
        String alamat = scanner.nextLine();

        System.out.println(name + umur + alamat);
    }
}