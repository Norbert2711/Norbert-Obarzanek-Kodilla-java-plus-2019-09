package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names
    double postsCount();          // total quantity of forum posts
    double commentsCount();       // total quantity of forum comments

}