package MentorLesson_2_2.Task3;

public class Engineer extends Employee {
    private String specialization;
    private int experienceYears;

    public Engineer(double salary, String specialization, int experienceYears) {
        super(salary);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "experienceYears=" + experienceYears +
                ", specialization='" + specialization + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
