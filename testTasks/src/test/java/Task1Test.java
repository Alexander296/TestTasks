import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class Task1Test {

    @Test
    public void x1CloserThanX2() {
        Task1 task1 = new Task1();
        int x1 = 20;
        int x2 = 10;
        int xCargo = 30;
        task1.trucksAndCargo(x1, x2, xCargo);
        assertThat(task1.trucksAndCargo(x1, x2, xCargo), is("1"));
    }

    @Test
    public void x2CloserThanX1() {
        Task1 task1 = new Task1();
        int x1 = 10;
        int x2 = 20;
        int xCargo = 30;
        task1.trucksAndCargo(x1, x2, xCargo);
        assertThat(task1.trucksAndCargo(x1, x2, xCargo), is("2"));
    }

    @Test
    public void x2AndX1CameSameTime() {
        Task1 task1 = new Task1();
        int x1 = 10;
        int x2 = 10;
        int xCargo = 10;
        task1.trucksAndCargo(x1, x2, xCargo);
        assertNull(task1.trucksAndCargo(x1, x2, xCargo));
    }
}