package Employee;

public class Employeeinfo {
    private String firstname;
    private String lastname;
    private int salary;
    private int empexp;
    private long mobile;

    //constructor


    public Employeeinfo(String firstname, String lastname, int salary, int empexp, long mobile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.empexp = empexp;
        this.mobile = mobile;
    }


    //getters


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmpexp() {
        return empexp;
    }

    public long getMobile() {
        return mobile;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmpexp(int empexp) {
        this.empexp = empexp;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public String toString(){
    return firstname + ", " + lastname +", " + salary + ", " + empexp + ", " + mobile + ", " + "\n";

}
}