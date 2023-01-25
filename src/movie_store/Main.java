package movie_store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("********************************MOVIE STORE*******************************");


        Movie shawshank = new Movie("The Shawshank Redemption", "BlueRay", 9.2);
        Movie the_godfather = new Movie("The Godfather", "BlueRay", 9.1);
        Movie the_godfather_part_II = new Movie("The Godfather: Part II", "DVD", 9.0);
        Movie the_dark_knight = new Movie("The Dark Knight", "BlueRay", 9.0);
        Movie schindler_s_list = new Movie("Schindler's List", "DVD", 8.9);
        Movie the_lord_of_the_rings_I = new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9);
        Movie pulp_fiction = new Movie("Pulp Fiction", "DVD", 8.8);
        Movie the_lord_of_the_rings_II = new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8);
        Movie good_bad_ugly = new Movie("The Good, the Bad and the Ugly","DVD", 8.8);
        Movie the_lord_of_the_rings_III = new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8);

        Movie[] movies = new Movie[] {
                shawshank,
                the_godfather,
                the_godfather_part_II,
                the_dark_knight,
                schindler_s_list,
                the_lord_of_the_rings_I,
                pulp_fiction,
                the_lord_of_the_rings_II,
                good_bad_ugly,
                the_lord_of_the_rings_III
        };

//        for (int i = 0; i < movies.length; i++) {
//            System.out.println(movies[i]);
//        }

        Store movie_store = new Store();

        /*movie_store.setMovies(0,shawshank);
        movie_store.setMovies(1, the_godfather);
        movie_store.setMovies(2, the_godfather_part_II);
        movie_store.setMovies(3, the_dark_knight);
        movie_store.setMovies(4, schindler_s_list);
        movie_store.setMovies(5, the_lord_of_the_rings_I);
        movie_store.setMovies(6, pulp_fiction);
        movie_store.setMovies(7, the_lord_of_the_rings_II);
        */

        for (int i = 0; i < movies.length; i++) {
            movie_store.setMovies(i, movies[i]);
        }



        System.out.println(movie_store);

        while(true){
            System.out.print("To edit another rating, type: 'continue': ");
            String answer = scan.next();

            if (!answer.equalsIgnoreCase("continue")){
                break;
            }

            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scan.nextInt();

            if (!(choice < 0 || choice > 9)) {
               Movie chosenMovie = new Movie(movie_store.getMovie(choice));
               System.out.print("Set a new rating for " + chosenMovie.getName() + ": ");
                double newRating = scan.nextDouble();
                chosenMovie.setRating(newRating);
                movie_store.setMovies(choice, chosenMovie);

//                System.out.print("Set a new rating for " + movie_store.getMovie(choice).getName() + ": ");
//                double newRating = scan.nextDouble();
//                movie_store.getMovie(choice).setRating(newRating);
//                movie_store.setMovies(choice, movie_store.getMovie(choice));

                System.out.println(movie_store);





            }

            else {
                System.out.print("Invalid integer, press 1 to try again: ");
                int choose1 = scan.nextInt();

                if (choose1 != 1) {
                    break;
                }

            }

        }

        scan.close();

    }
}
