package MentorLesson_2_6.Task7;

public class Film {

    private final String title;
    private final String director;
    private final Genre genre;
    private final int releaseYear;
    private final double rating;

    public Film(String title, String director, Genre genre, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                " | Director: " + director +
                " | Genre: " + genre +
                " | Year: " + releaseYear +
                " | Rating: " + rating;
    }

}
