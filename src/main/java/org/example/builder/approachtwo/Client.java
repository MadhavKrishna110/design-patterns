package org.example.builder.approachtwo;

public class Client {
    public static void main(String[] args) {


        UserExam userExam ;
        try {
//            UserExam.UserExamBuilder userExamBuilder = UserExam.getBuilder();
//            userExamBuilder.setName("Madhav");
//            userExamBuilder.setEnglishMarks(70);
//            userExamBuilder.setMathMarks(60);
            userExam = UserExam.getBuilder()
                    .setEnglishMarks(70)
                    .setMathMarks(80)
                    .setName("Madhav").build();



            //Method chaining


        } catch (Exception e) {
            System.out.println("Some parameters are wrong");
        }



    }
}
