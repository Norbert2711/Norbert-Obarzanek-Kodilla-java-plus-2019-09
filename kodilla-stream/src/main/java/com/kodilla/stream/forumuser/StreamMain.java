package com.kodilla.stream.forumuser;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forumUser = new Forum();
        LocalDate actualDate = LocalDate.now();
        // LocalDate dateMinus20 = actualDate.minus(20, ChronoUnit.YEARS); // po odjeciu 20 ---> data 1999-12-02

        Map<Integer, ForumUser> userList = forumUser.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getPostsNumbers() != 0)
                .filter(user -> ChronoUnit.YEARS.between(user.dayOfBirth, LocalDate.now()) > 20)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        userList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
