package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Nisa", "King", 22));
        myFamily.add( new Person("Lena", "Belton", 16));
        myFamily.add( new Person("Lisa", "Winkler", 41));
        myFamily.add( new Person("Brandon", "Belton", 38));
        myFamily.add( new Person("Donna", "Winkler", 65));
        myFamily.add( new Person("Midnight", "Star", 6));
    }
}
