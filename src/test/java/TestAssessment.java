import maven.AssessmentReview;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssessment {

    @Test
    public void testCubedMethod() {

        assertEquals(9, AssessmentReview.cubed(2), 3);

    }

    @Test
    public void testMultiplyMethod() {


        assertEquals(35.75, AssessmentReview.multiply(5.5, 6.5), 0);
    }

    @Test
    public void testDivideMethod() {
        assertEquals(10, AssessmentReview.divide(100,10), 0);
    }

}
