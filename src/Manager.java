public class Manager extends Employees {

    boolean projectOnTrack;
    int numberOfTeamsManaging;

    public Manager(String name, int age, String idNumber, String phoneNumbers, String email, String postcode, int yearsInCompany, boolean projectOnTrack, int numberOfTeamsManaging) {
        super(name, age, idNumber, phoneNumbers, email, postcode, yearsInCompany);
        this.projectOnTrack = projectOnTrack;
        this.numberOfTeamsManaging = numberOfTeamsManaging;
    }

    public boolean isProjectOnTrack() {
        return projectOnTrack;
    }

    public void setProjectOnTrack(boolean projectOnTrack) {
        this.projectOnTrack = projectOnTrack;
    }

    public int getNumberOfTeamsManaging() {
        return numberOfTeamsManaging;
    }

    public void setNumberOfTeamsManaging(int numberOfTeamsManaging) {
        this.numberOfTeamsManaging = numberOfTeamsManaging;
    }
}
