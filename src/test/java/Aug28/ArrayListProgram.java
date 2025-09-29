package Aug28;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;






public class ArrayListProgram {


    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(70,80,30,20,15));
        Collections.sort(numbers);
        System.out.println(numbers);















    }


}
