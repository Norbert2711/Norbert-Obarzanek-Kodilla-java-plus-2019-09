package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.NewForumStatistisc;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestNewForumStatistics {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests. Poczatek!");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished. Testy ZAKONCZONE");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test. Numer TESTU:  #" + testCounter);
    }

    @Test //1
    public void testCalculateAdvWhenPostEqualsZeroCommentsEqualsZeroAndUsersEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 0);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    @Test //2
    public void testCalculateAdvWhenPostEquals1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    @Test //3
    public void testCalculateAdvWhenUsersAre100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = generateUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 0);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    private List<String> generateUsers(int users) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            userNames.add("test");
        }
        return userNames;
    }

    @Test //4
    public void testCalculateAdvWhenCommentAreLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 50); //wiecej
        when(statisticsMock.commentsCount()).thenReturn((double) 20); //mniej
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0.4);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    @Test //5
    public void testCalculateAdvWhenPostsAreLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 100);
        when(statisticsMock.commentsCount()).thenReturn((double) 15);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0.15, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    @Test //6
    public void testCalculateAdvWhenUsersAre100AndPostsAre1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(10, newForumStatistisc.getAveragePostPerUser(),0);
    }

    private List<String> geneUsers(int users) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            userNames.add("test");
        }
        return userNames;
    }

    @Test //7
    public void testCalculateAdvWhenUsersAre0AndPostsAre1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }

    @Test  //8
    public void testCalculateAdvWhenComments0AndUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 0);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }
    @Test  //9
    public void testCalculateAdvWhenPosts0AndUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 0);
        when(statisticsMock.commentsCount()).thenReturn((double) 0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }
    @Test  //10
    public void testCalculateAdvWhenUsers100Posts1000AndPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 800);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(8, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0.8, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(10, newForumStatistisc.getAveragePostPerUser(),0);
    }
    @Test  //11
    public void testCalculateAdvWhenUsers100Posts1000AndPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 1200);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(12, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(1, newForumStatistisc.getAverageCommentPerPost(),0.8);
        Assert.assertEquals(10, newForumStatistisc.getAveragePostPerUser(),0);
    }
    @Test  //12
    public void testCalculateAdvWhenUsers100Posts0AndPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 0);
        when(statisticsMock.commentsCount()).thenReturn((double) 1200);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(12, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }
    @Test  //13
    public void testCalculateAdvWhenUsers0Posts1000AndCommentsAreLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn((double) 1000);
        when(statisticsMock.commentsCount()).thenReturn((double) 30);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0.03, newForumStatistisc.getAverageCommentPerPost(),0);
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser(),0);
    }
}
