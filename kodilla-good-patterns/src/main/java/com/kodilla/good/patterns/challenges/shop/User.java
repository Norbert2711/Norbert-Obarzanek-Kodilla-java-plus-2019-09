package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class User {

    private String userName;
    private String userSurmane;
    private String address;
    private int userYear;

    public User(String userName, String userSurmane, String adress, int userYear) {
        this.userName = userName;
        this.userSurmane = userSurmane;
        this.address = adress;
        this.userYear = userYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurmane='" + userSurmane + '\'' +
                ", address='" + address + '\'' +
                ", userYear=" + userYear +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurmane() {
        return userSurmane;
    }

    public String getAddress() {
        return address;
    }

    public int getUserYear() {
        return userYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userYear == user.userYear &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userSurmane, user.userSurmane) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurmane, address, userYear);
    }
}
