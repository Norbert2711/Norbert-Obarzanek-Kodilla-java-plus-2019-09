package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewForumStatistisc {

    private List<String> userNames = new ArrayList<String>();
    private int postsCount;
    private int commentsCount;
    private int averagePostPerUser;
    private int averageCommentsPerUser;
    private int averageCommentPerPost;

    public List<String> getUserNames() {
        return userNames;
    }

    public int getSize() {
        return userNames.size();
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewForumStatistisc that = (NewForumStatistisc) o;
        return postsCount == that.postsCount &&
                commentsCount == that.commentsCount &&
                averagePostPerUser == that.averagePostPerUser &&
                averageCommentsPerUser == that.averageCommentsPerUser &&
                averageCommentPerPost == that.averageCommentPerPost &&
                Objects.equals(userNames, that.userNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNames, postsCount, commentsCount, averagePostPerUser, averageCommentsPerUser, averageCommentPerPost);
    }

    public void calculateAdvStatistics(Statistics statistics) {

        userNames = statistics.usersNames();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (userNames.size() > 0) {
            averagePostPerUser = (statistics.postsCount() / userNames.size());

        } else {
            averagePostPerUser = 0;
        }

        if (userNames.size() > 0) {
            averageCommentsPerUser = (statistics.commentsCount() / userNames.size());

        } else {
            averageCommentsPerUser = 0;
        }

        if (getPostsCount() > 0) {
            averageCommentPerPost = (statistics.commentsCount() / getPostsCount());

        } else {
            averageCommentPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println(averageCommentPerPost);
    }
}
