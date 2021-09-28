package com.practice;

import com.practice.Builder.EmployeeBuilder;
import com.practice.DI.DI;
import com.practice.DI.EmailSevice;
import com.practice.model.AnimalFactory;
import com.practice.model.Employee;

public class Main {

    public static void main(String[] args) {

//        AnimalFactory animalFactory= new AnimalFactory();
//        animalFactory.create("Hen");
//        animalFactory.create("Dog");
        ;

        DI di=new DI(new EmailSevice());
        di.doSomeStuff();
        // write your code here
    }
}
