package intermediate_level.MultipleInheritances;

public class Main {

    public static void main(String[] args) {

        enginner employeeOne = new enginner();
        employeeOne.name = "Pedro Costa";
        employeeOne.age = 25;
        employeeOne.Employeepresentation();

        engineerSeniority enginnerJunior = new engineerSeniority();
        enginnerJunior.enginnerJR();

        System.out.println("___________________________________________");

        enginner employeeTwo = new enginner();
        employeeTwo .name = "Ivo Morais";
        employeeTwo .age = 32;
        employeeTwo .Employeepresentation();

        engineerSeniority enginnerPleno = new engineerSeniority();
        enginnerJunior.enginnerPL();

        System.out.println("___________________________________________");

        enginner employeeThree = new enginner();
        employeeThree .name = "Sandro Mesquita";
        employeeThree .age = 50;
        employeeThree .Employeepresentation();

        engineerSeniority enginnerSenior = new engineerSeniority();
        enginnerJunior.enginnerSR();

    }
}
