package org.example.creational.builder.approachtwo;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private  int scienceMarks;
    private  int mathMarks;
    private String name;

    UserExam(UserExamBuilder userExamParameters) {
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

    private UserExam() {}

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        public int getEnglishMarks() {
            return englishMarks;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public int getScienceMarks() {
            return scienceMarks;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public int getMathMarks() {
            return mathMarks;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        private int englishMarks;
        private int scienceMarks;
        private int mathMarks;
        private String name;

        public UserExam build() {
            // validation
            if(englishMarks > 100 || mathMarks > 100 || scienceMarks>100){
                throw new InvalidParameterException("Marks cannot be greater than 100");
            }

            if(name.startsWith("0")) {
                throw new InvalidParameterException("Name cannot start with 0");
            }
        // create parent
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathMarks = this.mathMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;

            return userExam;
        }
    }

}
