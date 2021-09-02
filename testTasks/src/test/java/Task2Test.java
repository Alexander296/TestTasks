import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void veryThinDogIs3() {
        Task2 task2 = new Task2();
        String str = "veryThinDog";
        assertThat(task2.wordsCount(str), is(3));
    }

    @Test
    public void veryIs1() {
        Task2 task2 = new Task2();
        String str = "very";
        assertThat(task2.wordsCount(str), is(1));
    }
}