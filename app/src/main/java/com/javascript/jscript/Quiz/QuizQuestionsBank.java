package com.javascript.jscript.Quiz;

import com.javascript.jscript.Model.QuizListModel;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestionsBank {

    private static List<QuizListModel> FundamentalQuiz1() {

        final List<QuizListModel> questionLists = new ArrayList<>();

        final QuizListModel q1 = new QuizListModel("Inside which HTML element do we put the JavaScript?",
                "<script>","<javascript>","<scripting>","<js>","<script>","");
        final QuizListModel q2 = new QuizListModel(
                "What is the correct JavaScript syntax to change the content of the HTML element below?",
                "document.getElementById(\"demo\").innerHTML = \"Hello World!\";",
                "document.getElementByName(\"p\").innerHTML = \"Hello World!\";",
                "document.getElement(\"p\").innerHTML = \"Hello World!\";",
                "#demo.innerHTML = \"Hello World!\";",
                "document.getElementById(\"demo\").innerHTML = \"Hello World!\";",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                 "Where is the correct place to insert a JavaScript?",
                "Both the <head> section and the <body> section are correct",
                "The <head> section",
                "The <body> section",
                "The <link> section",
                "Both the <head> section and the <body> section are correct",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                 "What is the correct syntax for referring to an external script called \"xxx.js\"?",
                "<script href=\"xxx.js\">",
                "<script name=\"xxx.js\">",
                "<script src=\"xxx.js\">",
                "<script style=\"xxx.js\">",
                "<script src=\"xxx.js\">",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                 "The external JavaScript file must contain the <script> tag.",
                "Undefined",
                "NaN",
                "True",
                "False",
                "False",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                 "How do you write \"Hello World\" in an alert box?",
                "alertBox(\"Hello World\"); ",
                "msg(\"Hello World\");",
                "msgBox(\"Hello World\");",
                "alert(\"Hello World\");",
                "alert(\"Hello World\");",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                 "How do you create a function in JavaScript?",
                "function:myFunction()",
                "function = myFunction()",
                "function myFunction()",
                "Function myFunction()",
                "function myFunction()",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                 "How do you call a function named \"myFunction\"?",
                "myFunction()",
                "call myFunction()",
                "call function myFunction()",
                "myFunction();",
                "myFunction()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                 "How to write an IF statement in JavaScript?",
                "if i = 5 then",
                "if (i == 5)",
                "if i = 5",
                "if i == 5 then",
                "if (i == 5)",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                 "How to write an IF statement for executing some code if \"i\" is NOT equal to 5?",
                "if (i != 5)",
                "if i <> 5",
                "if i =! 5 then",
                "if (i <> 5)",
                "if (i != 5)",
                ""
        );

        questionLists.add(q1);
        questionLists.add(q2);
        questionLists.add(q3);
        questionLists.add(q4);
        questionLists.add(q5);
        questionLists.add(q6);
        questionLists.add(q7);
        questionLists.add(q8);
        questionLists.add(q9);
        questionLists.add(q10);

        return questionLists;
    }

    private static List<QuizListModel> advancedQuestions() {

        final List<QuizListModel> questionLists = new ArrayList<>();

        final QuizListModel q1 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q2 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q3 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q4 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q5 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q6 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q7 = new QuizListModel("What is the size of int Advanced?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");

        questionLists.add(q1);
        questionLists.add(q2);
        questionLists.add(q3);
        questionLists.add(q4);
        questionLists.add(q5);
        questionLists.add(q6);
        questionLists.add(q7);

        return questionLists;
    }

    private static List<QuizListModel> angularQuestions() {

        final List<QuizListModel> questionLists = new ArrayList<>();

        final QuizListModel q1 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q2 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q3 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q4 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q5 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q6 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q7 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");

        questionLists.add(q1);
        questionLists.add(q2);
        questionLists.add(q3);
        questionLists.add(q4);
        questionLists.add(q5);
        questionLists.add(q6);
        questionLists.add(q7);

        return questionLists;
    }

    private static List<QuizListModel> quiz3Questions() {

        final List<QuizListModel> questionLists = new ArrayList<>();

        final QuizListModel q1 = new QuizListModel("What is the size of int Quiz 3?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q2 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q3 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q4 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q5 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q6 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");
        final QuizListModel q7 = new QuizListModel("What is the size of int Angular?", "16 bit", "12bit", "8bit", "32bit", "32bit", "");

        questionLists.add(q1);
        questionLists.add(q2);
        questionLists.add(q3);
        questionLists.add(q4);
        questionLists.add(q5);
        questionLists.add(q6);
        questionLists.add(q7);

        return questionLists;
    }


    public static List<QuizListModel> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Fundamental Quiz 1":
                return FundamentalQuiz1();
            case "Quiz 1":
                return advancedQuestions();
            case "Quiz Angular":
                return angularQuestions();
            default:
                return quiz3Questions();

        }
    }


}
