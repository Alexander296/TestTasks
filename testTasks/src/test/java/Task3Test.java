import org.junit.Test;

import java.util.HashMap;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void identifyTruckIdSuingTabelNum() {
        HashMap<Long, String> map = new HashMap<>();
        map.put(1L, "111");
        map.put(2L, "222");
        map.put(3L, "333");
        Task3.driversToTabelNumber = map;
        HashMap<Long, Long> map2 = new HashMap<>();
        map2.put(1000L, 1L);
        map2.put(2000L, 2L);
        map2.put(3000L, 3L);
        Task3.trucksToDriver = map2;
        assertThat(Task3.identifyTruckIdSuingTabelNum("333"), is(3000L));
    }

    @Test(expected = NoSuchElementException.class)
    public void noElement() {
        HashMap<Long, String> map = new HashMap<>();
        map.put(1L, "111");
        map.put(2L, "222");
        map.put(3L, "333");
        Task3.driversToTabelNumber = map;
        HashMap<Long, Long> map2 = new HashMap<>();
        map2.put(1000L, 1L);
        map2.put(2000L, 2L);
        map2.put(3000L, 3L);
        Task3.trucksToDriver = map2;
        Task3.identifyTruckIdSuingTabelNum("444");
    }
}