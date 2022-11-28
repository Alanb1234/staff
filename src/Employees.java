public abstract class Employees {
    private String name;
    private int age;
    private String idNumber;
    private String phoneNumbers;
    private String email;
    private String postcode;
    private  int yearsInCompany;

    public Employees(String name, int age, String idNumber, String phoneNumbers, String email, String postcode, int yearsInCompany) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
        this.postcode = postcode;
        this.yearsInCompany = yearsInCompany;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }
    public void getsOlder() {
        age++;
    }
    public void  incYearsInCompany(){
        yearsInCompany++;

    }
}
