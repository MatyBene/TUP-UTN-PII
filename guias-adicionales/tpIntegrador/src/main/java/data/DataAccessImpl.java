package data;

import domain.Movie;

import java.util.List;

public class DataAccessImpl implements I_DataAccess{
    @Override
    public boolean exist(String fileName) {
        return false;
    }

    @Override
    public List<Movie> list(String fileName) {
        return List.of();
    }

    @Override
    public void write(Movie movie, String fileName) {

    }

    @Override
    public String search(String fileName, String movieName) {
        return "";
    }

    @Override
    public void create(String fileName) {

    }

    @Override
    public void delete(String fileName) {

    }
}
