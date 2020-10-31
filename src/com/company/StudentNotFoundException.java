package com.company;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

}
