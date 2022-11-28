public class Supervisor extends Employees {

    int numberOfEmpoyeesSupervising;

    public Supervisor(String name, int age, String idNumber, String phoneNumbers, String email, String postcode, int yearsInCompany, int numberOfEmpoyeesSupervising) {
        super(name, age, idNumber, phoneNumbers, email, postcode, yearsInCompany);
        this.numberOfEmpoyeesSupervising = numberOfEmpoyeesSupervising;
    }

    public int getNumberOfEmpoyeesSupervising() {
        return numberOfEmpoyeesSupervising;
    }
}
