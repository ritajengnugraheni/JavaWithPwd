public class Employee {
    
    // public int salary;

    //encaptulation = semua dimasukan ke kelas employee 
    //abstarction = menyembunyikan yang ga perlu di lihat programmer lain yang perlu diketahui cuma cara isinya aja 
    //method and constructor overloading satu method bisa dipakai dua kali yang dibagian employee 
    //coupling ketergantuangan dari satu kelas kekelas lainnya ini tidak bagus 
    private int salary;
    private int overtime;
    private int payPerHour;

    public static int employeeCount;

    public Employee(int salary, int payPerHour){
        setSalary(salary);
        setPayPerHour(payPerHour);
        employeeCount++;
    }

    public Employee(int salary){
        this(salary,0);
    }

    public void setSalary (int salary){
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary cannot be below 0");
        }
        this.salary= salary;
    };
    public int getSalary(){
        return this.salary;
    }

    private void setOvertime (int overtime){
        if (overtime < 0) {
            throw new IllegalArgumentException("overtime cannot");
        }
        this.overtime = overtime;
    };

    public int getOvertime(){
        return this.overtime;
    }

    public void setPayPerHour (int payPerHour){
        if (payPerHour <= 0) {
            throw new IllegalArgumentException("Pay per hour cannot");
        }
        this.payPerHour=payPerHour;
    };

    public int getPayPerHour(){
        return this.payPerHour;
    };

    public int calculateWage(int overtime){
        setOvertime(overtime);
        return this.salary + (this.overtime*this.payPerHour);
    }
    public int calculateWage(){
        // return this.salary ;
        return calculateWage(0);
    }

}