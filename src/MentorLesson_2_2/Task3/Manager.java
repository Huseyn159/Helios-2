package MentorLesson_2_2.Task3;

public class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(double salary, String department, int teamSize) {
        super(salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", teamSize=" + teamSize + "Salary: " +
                getSalary()+
                '}';
    }
}

