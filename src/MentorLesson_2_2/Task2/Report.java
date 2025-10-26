package MentorLesson_2_2.Task2;

public class Report {
    String title;
    String author;
    int pages;
    String summary;

    public Report(String title, String author, int pages, String summary) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", summary='" + summary + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
