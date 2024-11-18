package org.example.creational.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private  int scienceMarks;
    private  int mathMarks;
    private String name;


    UserExam(UserExamParameters userExamParameters) {
        if(userExamParameters.englishMarks > 100 || userExamParameters.mathMarks > 100 || userExamParameters.scienceMarks>100){
            throw new InvalidParameterException("Marks cannot be greater than 100");
        }

        if(userExamParameters.name.startsWith("0")) {
            throw new InvalidParameterException("Name cannot start with 0");
        }
        this.englishMarks = userExamParameters.englishMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
        this.mathMarks = userExamParameters.mathMarks;
        this.name = userExamParameters.name;

    }
}
