public class Main {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "Napkin Reveal";
        movie1.genre = "Comedy";
        movie1.duration = 111;
 
        Movie movie2 = new Movie();
        movie2.title = "";
        movie2.genre = "Action";
        movie2.duration = 129;
 
        Movie movie3 = new Movie();
        movie3.title = "The Matrix";
        movie3.genre = "Sci-Fi";
        movie3.duration = 136;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}