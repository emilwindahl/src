/* 
import java.util.Scanner;

class PaymentSlip {
    private String employeeName;
    private int hourlyRate;
    private int hoursWorked;
    private static final double TAX_RATE = 0.30; 

    public PaymentSlip(String employeeName, int hourlyRate, int hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double calculateNetSalary() {
        double salaryBeforeTax = calculateSalary();
        return salaryBeforeTax - (salaryBeforeTax * TAX_RATE);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the employee name?: ");
        String employeeName = scanner.nextLine();

        System.out.println("What's their hourly rate? ");
        int hourlyRate = scanner.nextInt();

        System.out.println("How many hours did they work this month? ");
        int hoursWorked = scanner.nextInt();

        PaymentSlip paymentSlip = new PaymentSlip(employeeName, hourlyRate, hoursWorked);
        
        System.out.println("Calculating... ");
        System.out.println("-----------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println("Name: \t \t \t " + employeeName);
        System.out.println("Hourly rate: \t \t $"+hourlyRate);
        System.out.println("Hours worked: \t \t  " + hoursWorked + "\n");
        System.out.println("Salary before tax: \t $" + paymentSlip.calculateSalary());
        System.out.println("Salary after tax: \t $" + paymentSlip.calculateNetSalary()+ "\n");
        System.out.println("If you have any questions regarding your salary, contact Bob");
        System.out.println("-----------------------");
    }
}
 */