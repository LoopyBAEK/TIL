package godOfJava.accessModifier.c.impl.list;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);
    private int maxSalary;
    private double fatio;

    HealthInsurance(int maxSalary, double fatio){
        this.maxSalary = maxSalary;
        this.fatio = fatio;
    }

    public double getRatio(){
        return fatio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        HealthInsurance healthInsurance = null;
        switch (salary / 1000){
            case 1:
                healthInsurance = HealthInsurance.LEVEL_ONE;
                break;
            case 2:
                healthInsurance = HealthInsurance.LEVEL_TWO;
                break;
            case 3:
                healthInsurance = HealthInsurance.LEVEL_THREE;
                break;
            case 4:
                healthInsurance = HealthInsurance.LEVEL_FOUR;
                break;
            case 5:
                healthInsurance = HealthInsurance.LEVEL_FIVE;
                break;
            default:
                healthInsurance = HealthInsurance.LEVEL_SIX;
                break;
        }
        return healthInsurance;
    }

    public static void main(String[] args) {
        int[] salaryArray = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for(int loop = 0; loop < 3; loop++){
            System.out.println(salaryArray[loop] + "=" + insurances[loop] + "," + insurances[loop].getRatio());
        }
    }
}
