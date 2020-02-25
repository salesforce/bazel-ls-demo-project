package hello;

import library.Greeting;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Iterables;

public class Hello {


    public static void main(String[] args) {
    	Greeting greeter = new Greeting();
        System.out.println(new mybuilder_sample_generation.MybuilderSampleGeneration());
        
        List<String> modules = Lists.newArrayList("module1", "module2");

        Iterable<String> result = Iterables.transform(modules, greeter::greet);
        
        result.forEach(System.out::println);
    }
}