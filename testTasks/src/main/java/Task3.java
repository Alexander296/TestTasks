import java.util.Map;
import java.util.NoSuchElementException;

public class Task3 {
    public static Map<Long, Long> trucksToDriver;
    public static Map<Long, String> driversToTabelNumber;

    public static Long identifyTruckIdSuingTabelNum(String tabelNum) {
        for (Map.Entry<Long, String> entry1 : driversToTabelNumber.entrySet()) {
            if (entry1.getValue().contains(tabelNum)) {
                for (Map.Entry<Long, Long> entry2 : trucksToDriver.entrySet()) {
                    if (entry2.getValue().equals(entry1.getKey())) {
                        return entry2.getKey();
                    }
                }
            }
        }
        throw new NoSuchElementException();
    }
}
