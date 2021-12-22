package com.javascript.jscript.Model;

public class CourseProgress {
    private int learnCount;
    private int quizCount;
    private int programsCount;
    private int interviewCount;

    public CourseProgress() {
    }


    public int getLearnCount() {
        return learnCount;
    }

    public void setLearnCount(int learnCount) {
        this.learnCount = learnCount;
    }

    public int getQuizCount() {
        return quizCount;
    }

    public void setQuizCount(int quizCount) {
        this.quizCount = quizCount;
    }

    public int getProgramsCount() {
        return programsCount;
    }

    public void setProgramsCount(int programsCount) {
        this.programsCount = programsCount;
    }
}
