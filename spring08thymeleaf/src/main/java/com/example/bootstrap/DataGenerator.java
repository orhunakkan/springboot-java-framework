package com.example.bootstrap;

import java.util.Arrays;
import java.util.List;
import com.github.javafaker.Faker;

import com.example.model.Student;

public class DataGenerator {

    public static List<Student> createStudent(){

        List<Student> students = Arrays.asList(

            new Student("John","Doe",20,"CA"),
            new Student(new Faker().name().firstName(),new Faker().name().lastName(),20,new Faker().address().state()),
            new Student(new Faker().name().firstName(),new Faker().name().lastName(),20,new Faker().address().state()),
            new Student(new Faker().name().firstName(),new Faker().name().lastName(),20,new Faker().address().state()),
            new Student(new Faker().name().firstName(),new Faker().name().lastName(),20,new Faker().address().state())
            
            );

        return students;
        
    }
}
