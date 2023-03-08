package godOfJava.accessModifier.c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee){
        int type = employee.getType();
        long salary = employee.getSalary();
        long salaryIncrease = 0;
        switch (type){
            case 1:
                salaryIncrease = (long)(salary + salary * (-0.95));
                break;
            case 2:
                salaryIncrease = (long)(salary + salary * 0.1);
                break;
            case 3:
                salaryIncrease = (long)(salary + salary * 0.2);
                break;
            case 4:
                salaryIncrease = (long)(salary + salary * 0.3);
                break;
            default:
                salaryIncrease = salary + salary;
        }
        return salaryIncrease;
    }

    public void calculateSalaries(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
        employees[1] = new Employee("KimManager", 2, 100000000);
        employees[2] = new Employee("WhangDesign", 3, 70000000);
        employees[3] = new Employee("ParkArchi", 4, 80000000);
        employees[4] = new Employee("LeeDevelop", 5, 60000000);

        for(int i = 0; i < employees.length; i++){
            long salaryIncrease = getSalaryIncrease(employees[i]);
            System.out.println("이름 : " + employees[i].getName() + " = 계산된 연봉 금액 : " + salaryIncrease);
        }
    }
}
