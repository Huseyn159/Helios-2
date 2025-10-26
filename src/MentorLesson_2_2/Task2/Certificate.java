package MentorLesson_2_2.Task2;

public class Certificate {

    private String recipientName;
    private String courseName;
    private String grade;

    public Certificate(String recipientName, String courseName, String grade) {
        this.recipientName = recipientName;
        this.courseName = courseName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "recipientName='" + recipientName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
