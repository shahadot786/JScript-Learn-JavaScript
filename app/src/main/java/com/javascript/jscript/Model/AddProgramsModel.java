package com.javascript.jscript.Model;

public class AddProgramsModel {
    private String subject,programTitle,program,output;

    public AddProgramsModel(String subject, String programTitle, String program, String output) {
        this.subject = subject;
        this.programTitle = programTitle;
        this.program = program;
        this.output = output;
    }

    public AddProgramsModel() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProgramTitle() {
        return programTitle;
    }

    public void setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
