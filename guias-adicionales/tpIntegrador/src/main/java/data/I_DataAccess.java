package data;

import domain.Movie;

import java.util.List;

public interface I_DataAccess {

    boolean exist(String fileName);
    List<Movie> list(String fileName);
    void write(Movie movie, String fileName);
    String search(String fileName, String movieName);
    void create(String fileName);
    void delete(String fileName);

}
