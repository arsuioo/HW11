import org.example.Movies;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesTest {

    @Test
    public void testFindeAll() {
        Movies name = new Movies();
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";

        name.add(movie1);
        name.add(movie2);
        name.add(movie3);
        String[] actual = name.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {
        Movies name = new Movies();
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";

        name.add(movie1);
        name.add(movie2);
        name.add(movie3);
        String[] actual = name.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMore() {
        Movies name = new Movies(7);
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";

        name.add(movie1);
        name.add(movie2);
        name.add(movie3);
        String[] actual = name.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLess() {
        Movies name = new Movies();
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";

        name.add(movie1);
        name.add(movie2);
        name.add(movie3);
        String[] actual = name.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLess1() {
        Movies name = new Movies(3);
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";

        name.add(movie1);
        name.add(movie2);
        name.add(movie3);
        name.add(movie4);
        name.add(movie5);
        name.add(movie6);
        String[] actual = name.findLast();
        String[] expected = {movie6, movie5, movie4};
        Assertions.assertArrayEquals(expected, actual);
    }
}


