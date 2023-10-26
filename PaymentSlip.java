import java.util.Scanner;
public class PaymentSlip {

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
}

