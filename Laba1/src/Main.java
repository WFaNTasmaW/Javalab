public class Main {

    public static void main(String[] args) {
        Game myGame = new Game() {
            String title = "The Witcher 3: Wild Hunt";
            int year = 2015;
            String genre = "action/RPG";
            String System_requirements = "Intel CPU Core i5-2500K 3.3GHz or AMD CPU Phenom II X4 940;\n" +
                    "video card Nvidia GPU GeForce GTX 660 or AMD GPU Radeon HD 7870;\n" +
                    "6 RAM memory;\n" +
                    "The operating system Windows 7/8 (8.1)/10;\n" +
                    "40 GB of free hard disk space";


            public void printGameInfo() {
                System.out.println("Game : ");
                System.out.println("Title: " + title);
                System.out.println("Year of publication: " + year);
                System.out.println("Genre: " + genre);
                System.out.println("System requirements: " + System_requirements);
            }
        };

        Developers myDevelopers = new Developers() {
            String Title = "\t\n" +
                    "CD Projekt RED\n" +
                    "Saber Interactive";
            int rating = 9;

            public void printDevelopersInfo() {
                System.out.println("Developers : ");
                System.out.println("Title: " + Title);
                System.out.println("Rating: " + rating);
            }
        };

        myGame.printGameInfo();
        myDevelopers.printDevelopersInfo();
    }
}

interface Game {
    void printGameInfo();
}

interface Developers {
    void printDevelopersInfo();
}

