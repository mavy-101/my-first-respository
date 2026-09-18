public class Main {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "The Matrix";
        movie1.genre = "Action/Sci-Fi";
        movie1.duration = 136;
 
        Movie movie2 = new Movie();
        movie2.title = "Toy Story";
        movie2.genre = "Animation/Comedy";
        movie2.duration = 81;
 
        Movie movie3 = new Movie();
        movie3.title = "The Godfather";
        movie3.genre = "Crime/Drama";
        movie3.duration = 175;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}