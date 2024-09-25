package service;

public interface I_MovieCatalog {

    void addMovie(String movieName, String fileName);
    void movieList(String fileName);
    void movieSearch(String fileName, String movieName);
    void createCatalog(String fileName);

}
