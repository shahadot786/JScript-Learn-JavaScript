package com.javascript.jscript.Interview;

public class BasicInterviewQA {
    //basics programs codes
    public static final String question ="";
    public static final String answer ="";
    public static final String question1 = "What is JavaScript?";
    public static final String answer1 = "JavaScript is a client-side and server-side \nscripting language " +
            "inserted into HTML pages and is \nunderstood by web browsers. JavaScript is \nalso an Object-based Programming language";

    public static final String question2 ="Enumerate the differences between Java and JavaScript?";
    public static final String answer2 ="Java is a complete programming language. In contrast, JavaScript is a coded program that can " +
            "be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for different intent. " +
            "Java is an object-oriented programming (OOPS) or structured programming languages like C++ or C, " +
            "whereas JavaScript is a client-side scripting language.";

    public static final String question3 ="Write the code for adding new elements dynamically?";
    public static final String answer3 ="<html> \n" +
            "<head> \n" +
            "<title>t1</title> \n" +
            "<script type=\"text/javascript\"> \n" +
            "    function addNode () { var newP = document. createElement(\"p\"); \n" +
            "    var textNode = document.createTextNode(\" This is a new text node\"); \n" +
            "    newP.appendChild(textNode); document.getElementById(\"firstP\").appendChild(newP); } \n" +
            "</script> </head> \n" +
            "<body> <p id=\"firstP\">firstP<p> </body> \n" +
            "</html>";

}
