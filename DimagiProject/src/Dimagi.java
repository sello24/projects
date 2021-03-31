import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dimagi {
	

		
	public static int cycle2(int num1) {
        if (num1 == 1) {
            return 0;
        } else {
            if (num1 % 2 > 0) {
                return 1 + cycle2(num1 * 3 + 1);
            } else {
                return 1 + cycle2(num1 / 2);
            }
        }

    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(cycle2(num));
    }

}