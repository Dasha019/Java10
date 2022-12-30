package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] expected = {"Film 1","Film 2","Film 3","Film 4","Film 5","Film 6","Film 7","Film 8","Film 9","Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindAllLimitFilm() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitFilm() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");


        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

