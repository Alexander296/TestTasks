public class Task1 {
    public String trucksAndCargo(int x1, int x2, int xCargo) {
        if (x1 == xCargo && x2 == x1) {
            return null;
        } else if (x1 > x2) {
            return "1";
        }
        else {
            return "2";
        }
    }

}
