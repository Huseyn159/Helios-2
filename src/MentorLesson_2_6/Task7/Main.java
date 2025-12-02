package MentorLesson_2_6.Task7;

import MentorLesson_2_6.Task6.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Film> films = List.of(
                new Film("Predator:Badlands", "Thomas Dandly", Genre.ACTION, 2025, 8.5),
                new Film("The Dark Knight", "Christopher Nolan", Genre.ACTION, 2008, 9.0),
                new Film("John Wick", "Chad Stahelski", Genre.ACTION, 2014, 7.9),

                new Film("Hereditary", "Ari Aster", Genre.HORROR, 2018, 7.3),
                new Film("The Conjuring", "James Wan", Genre.HORROR, 2013, 7.5),

                new Film("Titanic", "James Cameron", Genre.ROMANTIC, 1997, 7.9),
                new Film("La La Land", "Damien Chazelle", Genre.ROMANTIC, 2016, 8.0),

                new Film("The Revenant", "Alejandro G.", Genre.ADVENTURE, 2015, 8.0),
                new Film("Life of Pi", "Ang Lee", Genre.ADVENTURE, 2012, 7.9),

                new Film("Harry Potter and the Half-Blood Prince", "David Yates", Genre.FANTASY, 2009, 7.6),
                new Film("Dune: Part Two", "Denis Villeneuve", Genre.FANTASY, 2024, 8.7)

        );


        List<Film> films2010 = films.stream()
                .filter(n->n.getReleaseYear()>2010)
                .toList();

        System.out.println(films2010);

        films.stream()
                .sorted(Comparator.comparingInt(Film::getReleaseYear))
                .forEach(System.out::println);


        Map<Genre,List<Film>> byGenre = films.stream()
                .collect(Collectors.groupingBy(Film::getGenre));
        System.out.println(byGenre);

        Film mostRated = films.stream()
                .max(Comparator.comparingDouble(Film::getRating))
                .orElse(null);

        System.out.println("Most Rated Film: " + mostRated);



    }
}
