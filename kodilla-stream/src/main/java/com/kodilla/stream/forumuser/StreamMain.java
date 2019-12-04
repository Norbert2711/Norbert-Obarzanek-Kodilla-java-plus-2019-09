package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forumUser = new Forum();
        LocalDate actualDate = LocalDate.now();
        LocalDate dateMinus20 = actualDate.minus(20, ChronoUnit.YEARS); // po odjeciu 20 ---> data 1999-12-02

        Map<Integer, ForumUser> userList = forumUser.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getPostsNumbers() != 0)
                .filter(user -> user.getDayOfBirth().isBefore(dateMinus20))
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        userList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        System.out.println(dateMinus20);

    }
}
