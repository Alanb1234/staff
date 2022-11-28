public class Director extends Manager{
    int NumberOfManagers;
    long companyRevnue;

    public Director(String name, int age, String idNumber, String phoneNumbers, String email, String postcode, int yearsInCompany, boolean projectOnTrack, int numberOfTeamsManaging, int numberOfManagers, long companyRevnue) {
        super(name, age, idNumber, phoneNumbers, email, postcode, yearsInCompany, projectOnTrack, numberOfTeamsManaging);
        NumberOfManagers = numberOfManagers;
        this.companyRevnue = companyRevnue;
    }


}
