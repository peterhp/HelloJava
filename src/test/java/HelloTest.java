import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sora on 2016/7/9.
 */
public class HelloTest {

    @Test
    public void should_return_right_world() throws Exception {
        assertEquals("Hello, Java!", Hello.say());
    }
}