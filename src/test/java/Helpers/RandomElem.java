package Helpers;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomElem {

    public static WebElement getRandomElem(List<WebElement> elems){
        int max = elems.size();

        Random rand = new Random();
        int n = rand.nextInt(max+1);
        System.out.printf("Random int is %d, and the value is %d", n, elems.get(n));
        return elems.get(n);
    }

}
