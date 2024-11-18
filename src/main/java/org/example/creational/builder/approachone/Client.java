package org.example.creational.builder.approachone;

public class Client {
    public static void main(String[] args) {

        UserExamParameters userExamParameters = new UserExamParameters();
        userExamParameters.setEnglishMarks(120);
        userExamParameters.setName("Madhav");

        UserExam userExam ;
        try {
            userExam = new UserExam(userExamParameters);
        } catch (Exception e) {
            System.out.println("Some parameters are wrong");
        }



    }
}
