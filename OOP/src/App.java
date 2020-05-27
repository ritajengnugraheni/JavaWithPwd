public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // gaji pokok
        // lembur (jam)
        // gaji per jam

        // hitung jumlah gaji-> gaji pokok + (gaji perjam + lembur )

        int salary = 50_000;
        int overtime = 5;
        int payPerHour = 100;

        System.out.println(calculate(salary, overtime, payPerHour));

    }

    public static int calculate(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }
}
