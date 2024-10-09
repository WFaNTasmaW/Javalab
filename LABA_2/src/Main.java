import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Game {
    private String title;
    private int releaseYear;
    private String genre;
    private String systemRequirements;

    public Game(String title, int releaseYear, String genre, String systemRequirements) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.systemRequirements = systemRequirements;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getSystemRequirements() {
        return systemRequirements;
    }

    public String toString() {
        return "Игра: " + title + " (" + releaseYear + "), Жанр: " + genre + ", Системные требования: " + systemRequirements;
    }
}

class Developer {
    private String name;
    private int rating;

    public Developer(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return "Разработчик: " + name + ", Рейтинг: " + rating;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Game> games = new ArrayList<>();
        games.add(new Game("The Witcher 3: Wild Hunt", 2015, "Action/RPG", "Intel Core i5-2500K, GTX 660"));
        games.add(new Game("Cyberpunk 2077", 2020, "Action/RPG", "Intel Core i7-4790, GTX 1060"));
        games.add(new Game("Red Dead Redemption 2", 2018, "Action/Adventure", "Intel Core i7-4770K, GTX 1070"));

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("CD Projekt RED", 9));
        developers.add(new Developer("Rockstar Games", 10));

        Predicate<Game> isRPG = game -> game.getGenre().equals("Action/RPG");
        System.out.println("Игры жанра Action/RPG:");
        games.stream().filter(isRPG).forEach(System.out::println);

        Consumer<Developer> printDeveloperInfo = developer -> System.out.println(developer);
        System.out.println("\nРазработчики:");
        developers.forEach(printDeveloperInfo);

        games.sort((g1, g2) -> Integer.compare(g1.getReleaseYear(), g2.getReleaseYear()));
        System.out.println("\nИгры, отсортированные по году выпуска:");
        games.forEach(System.out::println);
    }
}
