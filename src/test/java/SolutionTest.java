import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void func() {
        List<String> res = Solution.func(105);
        assertEquals("Devhaus Learning", Solution.func(105).get(74));
        assertEquals("Devhaus Learning Model", Solution.func(105).get(104));

        for(int i = 1; i <= 105; i++){
            if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                assertEquals(String.valueOf(i), res.get(i-1));
            }
        }
    }

}