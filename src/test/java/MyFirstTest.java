import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {

    @Test
    public void companyNameEquals() {
        String company = "Codeup";
        String codeup = "CodeUp";

        assertEquals(company.toLowerCase(), codeup.toLowerCase());
    }

    @Test
    public void arrayListsAreNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void theseAreAllEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);

        // Both arrays contain 1,2,3
    }


    @Test
    public void isItInThere() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
       assertFalse( language.contains("J")); // use assertFalse for this statement

    }


}
