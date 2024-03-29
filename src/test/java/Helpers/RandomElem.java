package Helpers;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
public class RandomElem {
    public static int getRandomElem(List<WebElement> elems) {
        int max = elems.size();
        Random rand = new Random();
        int n = rand.nextInt(max);
        int arrLength = elems.size();
        return n;
    }
}
