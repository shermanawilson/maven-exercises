import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AssertsExamples {



    //TODO: @Before Annotation

    // Belongs to class
    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size()); // name was already added
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }






    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    // When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        int intPrice = 10;
        int intDiscount = 4;

        assertEquals(6, intPrice - intDiscount);
        assertNotEquals(5, intPrice - intDiscount); // true statement

        //(expected, actual, delta(Kinda like a + or - kinda of thing, wiggle room to play with, optional for int, not double))
        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5); // Unexpected value

        // Comparing what we expect to what we actually have or don't have
    }


    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object(); // new instance of object
        Object sheep = new Object(); // new instance of object
        Object clonnedSheep = sheep; // reassigning sheep to clonned sheep

        System.out.println("Dog to string " + dog.toString());
        System.out.println("Sheep to string " + sheep.toString());
        System.out.println("Cloned Sheep to string " + clonnedSheep.toString());



        assertNotSame(sheep, dog); // dog and sheep and two different things
        assertSame(sheep, clonnedSheep); // sheep and clonned sheep are the same
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        boolean needACookie = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);

        assertTrue(needACookie);
        assertTrue("I'm so hungry and cookies would be dope", 10 > 5);
        assertFalse("I'm broke so no cookies for me", 10 < 0);
    }


    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object(); // instantiated object
        Object laptop = null;
        assertNull(laptop);
        assertNotNull(phone);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }







}
