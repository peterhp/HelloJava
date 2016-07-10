import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sora on 2016/7/9.
 */
public class HelloTest {

    @Test
    public void should_say_right_word_to_java()
            throws Exception {
        assertEquals("Hello, Java!", Hello.sayToJava());
    }

    @Test
    public void should_say_right_word_to_world()
            throws Exception {
        assertEquals("Hello, world!", Hello.sayToWorld());
    }

    @Test
    public void should_say_right_word_to_gradle()
            throws Exception {
        assertEquals("Hello, gradle!", Hello.sayToGradle());
    }

    @Test
    public void should_say_right_word_to_gradle_wrapper()
            throws Exception {
        assertEquals("Hello, gradlew!", Hello.sayToGradleWrapper());
    }
}