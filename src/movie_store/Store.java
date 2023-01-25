package movie_store;

import java.util.Arrays;

public class Store {

    private Movie[] movies;

    public Store(){
      this.movies = new Movie[10];
    }

    public Movie getMovie(int index){
        Movie copyMovie = new Movie(this.movies[index]);
        return copyMovie;
    }

    public void setMovies(int index, Movie movie) {
//        Movie[] copyOfMovies = new Movie[this.movies.length];
//        copyOfMovies[index] = movie;

        this.movies[index] = new Movie(movie);



        /*for (int i = 0; i < copyOfMovies.length; i++) {
            copyOfMovies[i] = new Movie(this.movies[i]);
        }*/
    }

    @Override
    public String toString() {
        /*String s = "";
        for (Movie movie : movies) {
          //  s += movies[i].getRating() + " " + movies[i].getFormat() + " " + movies[i].getName() +  "";
            s += movie.toString() + "\n";
        }
        return s;*/


        /*return "Store{" +
                "movies=" + Arrays.toString(movies) +
                '}';*/

        String s = "\n********************************MOVIE STORE*******************************\n\n";
        
        for (int i = 0; i < movies.length; i++) {
//            if(movies[i].toString()==null){
//                s += "null";
//
//            }
//            else {
//                s += movies[i].toString() + "\n";
//
//            }

            if (movies[i]==null){
                s += "null\n";
            }
            else {

                s += movies[i].toString() + "\n";
            }

            }

        return  s;
    }
}



