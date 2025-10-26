package MentorLesson_2_2.Task3;

public class Intern extends Employee{
    private String university;
    private String mentorName;
    private int internshipDuration;

    public Intern(double salary, String university, String mentorName, int internshipDuration) {
        super(salary);
        this.university = university;
        this.mentorName = mentorName;
        this.internshipDuration = internshipDuration;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "university='" + university + '\'' +
                ", mentorName='" + mentorName + '\'' +
                ", internshipDuration=" + internshipDuration +
                "Salary: " + getSalary() +
                '}';
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void setInternshipDuration(int internshipDuration) {
        this.internshipDuration = internshipDuration;
    }
}
