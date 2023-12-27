package com.wang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SimpleMovieLister
 * @Description
 * @Author ww
 * @Time 2023/12/27 21:51
 */
public class SimpleMovieLister {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleMovieLister.class);


    // the SimpleMovieLister has a dependency on the MovieFinder
    private MovieFinder movieFinder;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void simpleMovieLister() {
        LOGGER.info("simpleMovieLister invoke");
        movieFinder.movieFinder();
    }
}
