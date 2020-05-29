
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static  Scanner scanner = new Scanner(System.in);
    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println("Hello, World!");

        // gaji pokok
        // lembur (jam)
        // gaji per jam

        // hitung jumlah gaji-> gaji pokok + (gaji perjam + lembur )

        // int salary = 50_000;
        // int overtime = 5;
        // int payPerHour = 100;

        // System.out.println(calculate(salary, overtime, payPerHour));
        
        // var orang = new Employee();
        // orang.overtime = 5;
        // orang.payPerHour = 100;
        // orang.salary = 50_000;

        // Scanner scanner = new Scanner(System.in);
        // Employee orang = new Employee(50_000, 100);
        // Employee person = new Employee(10_000, 40);
        // System.out.print("Overtime : ");
        // orang.setOvertime(scanner.nextInt());

        // System.out.print("Pay per Hour : ");
        // orang.setPayPerHour(scanner.nextInt());

        // System.out.print("Salary : ");
        // orang.setSalary(scanner.nextInt());
        // orang.salary=scanner.nextInt();

        // int salary = scanner.nextInt();

        // System.out.println(calculate(orang.getSalary(), orang.getOvertime(), orang.getPayPerHour()));
        // System.out.println(orang.calculateWage());
        // System.out.println(orang.calculateWage(5));
        // System.out.println(Employee.employeeCount);
        // System.out.println(orang.ca);

        // boolean running = true;
        // String buah[] = {"Mangga", "Jeruk"};
        // while (running) {
        //     System.out.print("Menu :");
        //     System.out.print(" 1. Tambah Buah || 2. List Buah || 3. Exit ");
        //     System.out.print("Pilih menu nomor berapa: ");
        //     Scanner scanner = new Scanner(System.in);
        //     int input = scanner.nextInt();

        //     if (input == 1 ) {
               
        //     } else if (input == 2) {
        //         System.out.println(Arrays.toString(buah));
        //     } else {
        //         running = false;
        //     }
        // }
      
        //    listBuah.forEach(item -> {
        //     System.out.println("1. " + item.getNama() + " || " + item.getHarga() + " || " + item.getStock()+" pcs" );
        //    });
         // System.out.println("1. " + buah.getNama() + " || " + buah.getHarga() + " || " + buah.getStock()+"pcs" );

         while (true) {
             System.out.println("=== Menu Utama === ");
             System.out.println("1. Tambah buah || 2. List buah || 3. Exit");
             System.out.print("Pilih menu nomor berapa: ");
             int menu = scanner.nextInt();

             if (menu == 1 ) {
                Menu.tambahBuah();
             } else if (menu == 2){
                Menu.tampilListBuah();
             } else if (menu == 3){
                 break;
             } else {
                 System.out.println("menu yang anda pilih tidak tersedia");
             }

         }
          
            
            
           
    }

    
    // public static int calculate(int salary, int overtime, int payPerHour) {
    //     return salary + (overtime * payPerHour);
    // }

}
