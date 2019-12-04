package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;
public class ForumUser {

    int userID;
    String userName;
    char sex = 'M' / 'F';
    LocalDate dayOfBirth;
    int postsNumbers;

    public ForumUser(int userID, String userName, char sex, int year, int month, int day, int postsNumbers) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dayOfBirth = LocalDate.of(year,month,day);
        this.postsNumbers = postsNumbers;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }


    public int getPostsNumbers() {
        return postsNumbers;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dayOfBridth=" + dayOfBirth +
                ", postsNumbers=" + postsNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID &&
                sex == forumUser.sex &&
                postsNumbers == forumUser.postsNumbers &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(dayOfBirth, forumUser.dayOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, sex, dayOfBirth, postsNumbers);
    }
}
