package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam Malysz");
        User monika = new YGeneration("Monika Tobis");
        User zofia = new ZGeneration("Zofia Mialczynska");

        //When
        String adamsPost = adam.sharePost();
        String monikasPost = monika.sharePost();
        String zofiasPost = zofia.sharePost();
        System.out.println("Adam like: " + adamsPost);
        System.out.println("Monika like: " + monikasPost);
        System.out.println("Zofia like: " + zofiasPost);

        //Then
        Assert.assertEquals("Social: -> Facebook", adamsPost);
        Assert.assertEquals("Social: -> Snapchat", monikasPost);
        Assert.assertEquals("Social: -> Twitter", zofiasPost);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User adam = new Millenials("Adam Malysz");

        //When
        String adamsPost = adam.sharePost();
        System.out.println("Adam like: " + adamsPost);
        adam.setSocialPublisher(new TwitterPublisher());
        adamsPost = adam.sharePost();
        System.out.println("Adam dislike Facebook, Adam now like: " + adamsPost);

        //Then
        Assert.assertEquals("Social: -> Twitter", adamsPost);
    }
}
