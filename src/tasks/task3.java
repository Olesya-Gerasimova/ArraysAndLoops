package tasks;

class Movie {
    String title;
    int rating;
    String genre;
    String country;
    boolean hasOscar;

    public Movie(String title, int rating, String genre, String country, boolean hasOscar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }
}

public class task3 {
    public static void main(String[] args) {
        // Массив фильмов
        Movie[] films = {
                new Movie("Inception", 9, "Sci-Fi", "USA", true),
                new Movie("The Grand Budapest Hotel", 8, "Comedy", "USA", false),
                new Movie("Parasite", 10, "Drama", "South Korea", true)
        };

        // Выводим информацию о фильмах
        for (Movie film : films) {
            System.out.println(film.title + " - Рейтинг: " + film.rating + " - Жанр: " + film.genre + " - Страна: " + film.country + " - Оскар: " + (film.hasOscar ? "Да" : "Нет"));
        }
        for (Movie film : films) {
            System.out.println("Название: " + film.title + " - Жанр: " + film.genre + " - Рейтинг: " + film.rating + " - Страна: " + film.country);
        }
    }
}
