package godOfJava.operator;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salary = new SalaryManager();
        salary.getMonthlySalary(20000000);
    }

    public double getMonthlySalary(int yearlySalary){
        double monthSalary = (double)yearlySalary / 12.0;
        System.out.println("월 급여 : " + monthSalary);
        double earnedIncomeTax = calculateTax(monthSalary);
        double nationalPension = calculateNationalPension(monthSalary);
        double healthInsurancePremiums = calculateHealthInsurance(monthSalary);
        double tax = earnedIncomeTax + nationalPension + healthInsurancePremiums;
        monthSalary -= tax;
        System.out.println(monthSalary);
        return  monthSalary;
    }

    public double calculateTax(double monthSalary){
        double earnedIncomeTax = monthSalary * 0.125;
        System.out.println("근로소득세 : " + earnedIncomeTax);
        return earnedIncomeTax;
    }

    public double calculateNationalPension(double monthSalary){
        double nationalPension = monthSalary * 0.081;
        System.out.println("국민연금 : " + nationalPension);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary){
        double healthInsurancePremiums = monthSalary * 0.135;
        System.out.println("건강보험료 : " + healthInsurancePremiums);
        return healthInsurancePremiums;
    }
}
