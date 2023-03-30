package Hashing.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Java {
    public static void main(String args[]) {
        Set<String> value = new HashSet<>();
        value.add("HI,");
        value.add("My");
        value.add("Name");
        value.add("Is");
        value.add("Vasundhara");
        value.add("Vasu");

        System.out.println(value);


        // you can perform various functions on set intersection,union,difference,add

        Set<Float> box1 = new HashSet<>();
        // adding all elements to box1 in form of arraylist
        box1.addAll(Arrays.asList(new Float[] {1.4f,4.6f,2.8f,7.4f,8.5f,9.5f,0.4f}));

        Set<Float> box2 = new HashSet<>();
        box2.addAll(Arrays.asList(new Float[]{2.7f,4.6f,3.9f,6.9f,7.4f,8.9f,9.0f}));

        // 1. TO FIND UNION
        Set <Float> union = new HashSet<>(box1);
        union.addAll(box2);
        System.out.println("Unions of box1 and box2 is = " + union);

        // 1. TO FIND INTERSECTION
        Set<Float> intersection=new HashSet<>();
        intersection.retainAll(box2);
        System.out.println("Intersection of box1 and box2 is = "+ intersection);

        // 1. TO FIND DIFFERENCE
        Set<Float> difference = new HashSet<>();
        difference.removeAll(box2);
        System.out.println("Difference of box1 and box2 is = " + difference);

    }
}
