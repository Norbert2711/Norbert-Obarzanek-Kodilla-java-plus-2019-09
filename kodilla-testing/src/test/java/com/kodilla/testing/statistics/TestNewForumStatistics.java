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

    @Test
    public void testCalculateAdvWhenPostEqualsZeroCommentsEqualsZeroAndUsersEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

    @Test
    public void testCalculateAdvWhenPostEquals1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

    @Test
    public void testCalculateAdvWhenUsersAre100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = generateUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

    private List<String> generateUsers(int users) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            userNames.add("test");
        }
        return userNames;
    }

    @Test
    public void testCalculateAdvWhenCommentAreLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(50); //wiecej
        when(statisticsMock.commentsCount()).thenReturn(20); //mniej
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

    @Test
    public void testCalculateAdvWhenPostsAreLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

    @Test
    public void testCalculateAdvWhenUsersAre100AndPostsAre1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(10, newForumStatistisc.getAveragePostPerUser());
    }

    private List<String> geneUsers(int users) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            userNames.add("test");
        }
        return userNames;
    }
    @Test
    public void testCalculateAdvWhenUsersAre0AndPostsAre1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        NewForumStatistisc newForumStatistisc = new NewForumStatistisc();
        List<String> userNames = geneUsers(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForumStatistisc.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentsPerUser());
        Assert.assertEquals(0, newForumStatistisc.getAverageCommentPerPost());
        Assert.assertEquals(0, newForumStatistisc.getAveragePostPerUser());
    }

}
