package com.javascript.jscript.Quiz;

import com.javascript.jscript.Model.QuizListModel;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestionsBank {
    //FundamentalQuiz
    private static List<QuizListModel> FundamentalQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "Inside which HTML element do we put the JavaScript?",
                "<script>",
                "<javascript>",
                "<scripting>",
                "<js>","<script>",
                ""
        );
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
    private static List<QuizListModel> FundamentalQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "How does a WHILE loop start?",
                "while (i <= 10; i++)",
                "while (i <= 10)",
                "while i = 1 to 10",
                "while i = 1 to 10;",
                "while (i <= 10)",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How does a FOR loop start?",
                "for (i = 0; i <= 5; i++)",
                "for (i = 0; i <= 5)",
                "for i = 1 to 5",
                "for (i <= 5; i++)",
                "for (i = 0; i <= 5; i++)",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How can you add a comment in a JavaScript?",
                "//This is a comment",
                "'This is a comment",
                "<!--This is a comment-->",
                "/This is a comment",
                "//This is a comment",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How to insert a comment that has more than one line?",
                "<!--This comment has\n" +
                        "more than one line-->",
                "//This comment has\n" +
                        "more than one line//",
                "/This comment has\n" +
                        "more than one line/",
                "/*This comment has\n" +
                        "more than one line*/",
                "/*This comment has\n" +
                        "more than one line*/",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the correct way to write a JavaScript array?",
                "var colors = 1 = (\"red\"), 2 = (\"green\"), 3 = (\"blue\")",
                "var colors = [\"red\", \"green\", \"blue\"]",
                "var colors = (1:\"red\", 2:\"green\", 3:\"blue\")",
                "var colors = \"red\", \"green\", \"blue\"",
                "var colors = [\"red\", \"green\", \"blue\"]",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How do you round the number 7.25, to the nearest integer?",
                "Math.round(7.25)",
                "round(7.25)",
                "Math.rnd(7.25)",
                "rnd(7.25)",
                "Math.round(7.25)",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "How do you find the number with the highest value of x and y?",
                "Math.max(x, y)",
                "Math.ceil(x, y)",
                "top(x, y)",
                "ceil(x, y)",
                "Math.max(x, y)",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the correct JavaScript syntax for opening a new window called \"site\" ?",
                "site = window.new(\"http://www.shrcreation.com\");",
                "site = window.open(\"http://www.shrcreation.com\");",
                "site = window.close(\"http://www.shrcreation.com\");",
                "site = window.hide(\"http://www.shrcreation.com\");",
                "site = window.open(\"http://www.shrcreation.com\");",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "JavaScript is the same as Java.",
                "False",
                "True",
                "Both",
                "None",
                "False",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How can you detect the client's browser name?",
                "browser.name",
                "navigator.appName",
                "client.navName",
                "client.appName",
                "navigator.appName",
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
    private static List<QuizListModel> FundamentalQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "Which event occurs when the user clicks on an HTML element?",
                "onclick",
                "onmouseclick",
                "onmouseover",
                "onchange",
                "onclick",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How do you declare a JavaScript variable?",
                "variable carName;",
                "var carName;",
                "v carName;",
                "$var carName;",
                "var carName;",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which operator is used to assign a value to a variable?",
                "=",
                "-",
                "x",
                "*",
                "=",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What will the following code return: Boolean(10 > 9)",
                "NaN",
                "true",
                "false",
                "undefined",
                "true",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Is JavaScript case-sensitive?",
                "Yes",
                "No",
                "Both",
                "None",
                "Yes",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Inside which HTML element do we put the JavaScript?",
                "js tag",
                "javascript tag",
                "script tag",
                "scripting tag",
                "script tag",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is correct about features of JavaScript?",
                "JavaScript is is complementary to and integrated with HTML",
                "JavaScript is open and cross-platform.",
                "Both of the above",
                "All of the above",
                "Both of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is a valid type of function javascript supports?",
                "named function",
                "anonymous function",
                "Both of the above",
                "None of the above",
                "Both of the above",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which built-in method calls a function for each element in the array?",
                "while()",
                "loop()",
                "forEach()",
                "None of the above",
                "forEach()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following function of Number object formats a number with a specific number of digits to the right of the decimal?",
                "toExponential()",
                "toFixed()",
                "toPrecision()",
                "toLocaleString()",
                "toFixed()",
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
    private static List<QuizListModel> FundamentalQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "Which of the following function of String object returns a number indicating the Unicode value of the character at the given index?",
                "charAt()",
                "charCodeAt()",
                "concat()",
                "indexOf()",
                "charCodeAt()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following function of String object is used to match a regular expression against a string?",
                "concat()",
                "match()",
                "search()",
                "replace()",
                "match()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following function of String object returns the calling string value converted to upper case?",
                "toLocaleUpperCase()",
                "toUpperCase()",
                "toString()",
                "substring()",
                "toUpperCase()",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following function of String object causes a string to be displayed in fixed-pitch font as if it were in a <tt> tag?",
                "fixed()",
                "big()",
                "blink()",
                "bold()",
                "fixed()",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following function of Array object adds one or more elements to the end of an array and returns the new length of the array?",
                "pop()",
                "push()",
                "join()",
                "map()",
                "push()",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following function of Array object returns true if at least one element in this array satisfies the provided testing function?",
                "reverse()",
                "shift()",
                "slice()",
                "some()",
                "some()",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is correct about JavaScript?",
                "JavaScript is a lightweight, interpreted programming language.",
                "JavaScript has object-oriented capabilities that allows you to build interactivity into otherwise static HTML pages.",
                "The general-purpose core of the language has been embedded in Netscape, Internet Explorer, and other web browsers.",
                "All of the above.",
                "All of the above.",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is the correct syntax to create a cookie using JavaScript?",
                "document.cookie = 'key1 = value1; key2 = value2; expires = date';",
                "browser.cookie = 'key1 = value1; key2 = value2; expires = date';",
                "window.cookie = 'key1 = value1; key2 = value2; expires = date';",
                "navigator.cookie = 'key1 = value1; key2 = value2; expires = date';",
                "document.cookie = 'key1 = value1; key2 = value2; expires = date';",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which built-in method combines the text of two strings and returns a new string?",
                "append()",
                "concat()",
                "attach()",
                "None of the above.",
                "concat()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following code creates an object?",
                "var book = Object();",
                "var book = new Object();",
                "var book = new OBJECT();",
                "var book = new Book();",
                "var book = new Object();",
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
    private static List<QuizListModel> FundamentalQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> FundamentalQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> FundamentalQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> FundamentalQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> FundamentalQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> FundamentalQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //BasicQuiz
    private static List<QuizListModel> BasicQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BasicQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //ObjectsQuiz
    private static List<QuizListModel> ObjectsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ObjectsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //OOPsQuiz
    private static List<QuizListModel> OOPsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> OOPsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //DOMQuiz
    private static List<QuizListModel> DOMQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> DOMQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //BOMQuiz
    private static List<QuizListModel> BOMQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BOMQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //AdvancedQuiz
    private static List<QuizListModel> AdvancedQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AdvancedQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //AJAXQuiz
    private static List<QuizListModel> AJAXQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AJAXQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //TypescriptQuiz
    private static List<QuizListModel> TypescriptQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> TypescriptQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //AngularQuiz
    private static List<QuizListModel> AngularQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> AngularQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //VueJsQuiz
    private static List<QuizListModel> VueJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> VueJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //NextJsQuiz
    private static List<QuizListModel> NextJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NextJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //ReactJsQuiz
    private static List<QuizListModel> ReactJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ReactJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //EmberJsQuiz
    private static List<QuizListModel> EmberJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> EmberJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //BootstrapQuiz
    private static List<QuizListModel> BootstrapQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> BootstrapQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //NodeJsQuiz
    private static List<QuizListModel> NodeJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> NodeJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //ExpressJsQuiz
    private static List<QuizListModel> ExpressJsQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> ExpressJsQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //LaravelQuiz
    private static List<QuizListModel> LaravelQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> LaravelQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    //jQueryQuiz
    private static List<QuizListModel> jQueryQuiz1() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz2() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz3() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz4() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz5() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz6() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz7() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz8() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz9() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    private static List<QuizListModel> jQueryQuiz10() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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

    //default question
    private static List<QuizListModel> defaultQuestions() {
        final List<QuizListModel> questionLists = new ArrayList<>();
        final QuizListModel q1 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "",
                "",
                "",
                "",
                "",
                "",
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
    public static List<QuizListModel> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Fundamental Quiz 1":
                return FundamentalQuiz1();
            case "Fundamental Quiz 2":
                return FundamentalQuiz2();
            case "Fundamental Quiz 3":
                return FundamentalQuiz3();
            case "Fundamental Quiz 4":
                return FundamentalQuiz4();
            case "Fundamental Quiz 5":
                return FundamentalQuiz5();
            case "Fundamental Quiz 6":
                return FundamentalQuiz6();
            case "Fundamental Quiz 7":
                return FundamentalQuiz7();
            case "Fundamental Quiz 8":
                return FundamentalQuiz8();
            case "Fundamental Quiz 9":
                return FundamentalQuiz9();
            case "Fundamental Quiz 10":
                return FundamentalQuiz10();
            //Basic
            case "Basic Quiz 1":
                return BasicQuiz1();
            case "Basic Quiz 2":
                return BasicQuiz2();
            case "Basic Quiz 3":
                return BasicQuiz3();
            case "Basic Quiz 4":
                return BasicQuiz4();
            case "Basic Quiz 5":
                return BasicQuiz5();
            case "Basic Quiz 6":
                return BasicQuiz6();
            case "Basic Quiz 7":
                return BasicQuiz7();
            case "Basic Quiz 8":
                return BasicQuiz8();
            case "Basic Quiz 9":
                return BasicQuiz9();
            case "Basic Quiz 10":
                return BasicQuiz10();
            //ObjectsQuiz
            case "Objects Quiz 1":
                return ObjectsQuiz1();
            case "Objects Quiz 2":
                return ObjectsQuiz2();
            case "Objects Quiz 3":
                return ObjectsQuiz3();
            case "Objects Quiz 4":
                return ObjectsQuiz4();
            case "Objects Quiz 5":
                return ObjectsQuiz5();
            case "Objects Quiz 6":
                return ObjectsQuiz6();
            case "Objects Quiz 7":
                return ObjectsQuiz7();
            case "Objects Quiz 8":
                return ObjectsQuiz8();
            case "Objects Quiz 9":
                return ObjectsQuiz9();
            case "Objects Quiz 10":
                return ObjectsQuiz10();
            //OOPsQuiz
            case "OOPs Quiz 1":
                return OOPsQuiz1();
            case "OOPs Quiz 2":
                return OOPsQuiz2();
            case "OOPs Quiz 3":
                return OOPsQuiz3();
            case "OOPs Quiz 4":
                return OOPsQuiz4();
            case "OOPs Quiz 5":
                return OOPsQuiz5();
            case "OOPs Quiz 6":
                return OOPsQuiz6();
            case "OOPs Quiz 7":
                return OOPsQuiz7();
            case "OOPs Quiz 8":
                return OOPsQuiz8();
            case "OOPs Quiz 9":
                return OOPsQuiz9();
            case "OOPs Quiz 10":
                return OOPsQuiz10();
            //DOMQuiz
            case "DOM Quiz 1":
                return DOMQuiz1();
            case "DOM Quiz 2":
                return DOMQuiz2();
            case "DOM Quiz 3":
                return DOMQuiz3();
            case "DOM Quiz 4":
                return DOMQuiz4();
            case "DOM Quiz 5":
                return DOMQuiz5();
            case "DOM Quiz 6":
                return DOMQuiz6();
            case "DOM Quiz 7":
                return DOMQuiz7();
            case "DOM Quiz 8":
                return DOMQuiz8();
            case "DOM Quiz 9":
                return DOMQuiz9();
            case "DOM Quiz 10":
                return DOMQuiz10();
            //BOMQuiz
            case "BOM Quiz 1":
                return BOMQuiz1();
            case "BOM Quiz 2":
                return BOMQuiz2();
            case "BOM Quiz 3":
                return BOMQuiz3();
            case "BOM Quiz 4":
                return BOMQuiz4();
            case "BOM Quiz 5":
                return BOMQuiz5();
            case "BOM Quiz 6":
                return BOMQuiz6();
            case "BOM Quiz 7":
                return BOMQuiz7();
            case "BOM Quiz 8":
                return BOMQuiz8();
            case "BOM Quiz 9":
                return BOMQuiz9();
            case "BOM Quiz 10":
                return BOMQuiz10();
            //AdvancedQuiz
            case "Advanced Quiz 1":
                return AdvancedQuiz1();
            case "Advanced Quiz 2":
                return AdvancedQuiz2();
            case "Advanced Quiz 3":
                return AdvancedQuiz3();
            case "Advanced Quiz 4":
                return AdvancedQuiz4();
            case "Advanced Quiz 5":
                return AdvancedQuiz5();
            case "Advanced Quiz 6":
                return AdvancedQuiz6();
            case "Advanced Quiz 7":
                return AdvancedQuiz7();
            case "Advanced Quiz 8":
                return AdvancedQuiz8();
            case "Advanced Quiz 9":
                return AdvancedQuiz9();
            case "Advanced Quiz 10":
                return AdvancedQuiz10();
            //AJAXQuiz
            case "AJAX Quiz 1":
                return AJAXQuiz1();
            case "AJAX Quiz 2":
                return AJAXQuiz2();
            case "AJAX Quiz 3":
                return AJAXQuiz3();
            case "AJAX Quiz 4":
                return AJAXQuiz4();
            case "AJAX Quiz 5":
                return AJAXQuiz5();
            case "AJAX Quiz 6":
                return AJAXQuiz6();
            case "AJAX Quiz 7":
                return AJAXQuiz7();
            case "AJAX Quiz 8":
                return AJAXQuiz8();
            case "AJAX Quiz 9":
                return AJAXQuiz9();
            case "AJAX Quiz 10":
                return AJAXQuiz10();
            //TypescriptQuiz
            case "Typescript Quiz 1":
                return TypescriptQuiz1();
            case "Typescript Quiz 2":
                return TypescriptQuiz2();
            case "Typescript Quiz 3":
                return TypescriptQuiz3();
            case "Typescript Quiz 4":
                return TypescriptQuiz4();
            case "Typescript Quiz 5":
                return TypescriptQuiz5();
            case "Typescript Quiz 6":
                return TypescriptQuiz6();
            case "Typescript Quiz 7":
                return TypescriptQuiz7();
            case "Typescript Quiz 8":
                return TypescriptQuiz8();
            case "Typescript Quiz 9":
                return TypescriptQuiz9();
            case "Typescript Quiz 10":
                return TypescriptQuiz10();
            //AngularQuiz
            case "Angular Quiz 1":
                return AngularQuiz1();
            case "Angular Quiz 2":
                return AngularQuiz2();
            case "Angular Quiz 3":
                return AngularQuiz3();
            case "Angular Quiz 4":
                return AngularQuiz4();
            case "Angular Quiz 5":
                return AngularQuiz5();
            case "Angular Quiz 6":
                return AngularQuiz6();
            case "Angular Quiz 7":
                return AngularQuiz7();
            case "Angular Quiz 8":
                return AngularQuiz8();
            case "Angular Quiz 9":
                return AngularQuiz9();
            case "Angular Quiz 10":
                return AngularQuiz10();
            //VueJsQuiz
            case "VueJs Quiz 1":
                return VueJsQuiz1();
            case "VueJs Quiz 2":
                return VueJsQuiz2();
            case "VueJs Quiz 3":
                return VueJsQuiz3();
            case "VueJs Quiz 4":
                return VueJsQuiz4();
            case "VueJs Quiz 5":
                return VueJsQuiz5();
            case "VueJs Quiz 6":
                return VueJsQuiz6();
            case "VueJs Quiz 7":
                return VueJsQuiz7();
            case "VueJs Quiz 8":
                return VueJsQuiz8();
            case "VueJs Quiz 9":
                return VueJsQuiz9();
            case "VueJs Quiz 10":
                return VueJsQuiz10();
            //NextJsQuiz
            case "NextJs Quiz 1":
                return NextJsQuiz1();
            case "NextJs Quiz 2":
                return NextJsQuiz2();
            case "NextJs Quiz 3":
                return NextJsQuiz3();
            case "NextJs Quiz 4":
                return NextJsQuiz4();
            case "NextJs Quiz 5":
                return NextJsQuiz5();
            case "NextJs Quiz 6":
                return NextJsQuiz6();
            case "NextJs Quiz 7":
                return NextJsQuiz7();
            case "NextJs Quiz 8":
                return NextJsQuiz8();
            case "NextJs Quiz 9":
                return NextJsQuiz9();
            case "NextJs Quiz 10":
                return NextJsQuiz10();
            //ReactJsQuiz
            case "ReactJs Quiz 1":
                return ReactJsQuiz1();
            case "ReactJs Quiz 2":
                return ReactJsQuiz2();
            case "ReactJs Quiz 3":
                return ReactJsQuiz3();
            case "ReactJs Quiz 4":
                return ReactJsQuiz4();
            case "ReactJs Quiz 5":
                return ReactJsQuiz5();
            case "ReactJs Quiz 6":
                return ReactJsQuiz6();
            case "ReactJs Quiz 7":
                return ReactJsQuiz7();
            case "ReactJs Quiz 8":
                return ReactJsQuiz8();
            case "ReactJs Quiz 9":
                return ReactJsQuiz9();
            case "ReactJs Quiz 10":
                return ReactJsQuiz10();
            //EmberJsQuiz
            case "EmberJs Quiz 1":
                return EmberJsQuiz1();
            case "EmberJs Quiz 2":
                return EmberJsQuiz2();
            case "EmberJs Quiz 3":
                return EmberJsQuiz3();
            case "EmberJs Quiz 4":
                return EmberJsQuiz4();
            case "EmberJs Quiz 5":
                return EmberJsQuiz5();
            case "EmberJs Quiz 6":
                return EmberJsQuiz6();
            case "EmberJs Quiz 7":
                return EmberJsQuiz7();
            case "EmberJs Quiz 8":
                return EmberJsQuiz8();
            case "EmberJs Quiz 9":
                return EmberJsQuiz9();
            case "EmberJs Quiz 10":
                return EmberJsQuiz10();
            //BootstrapQuiz
            case "Bootstrap Quiz 1":
                return BootstrapQuiz1();
            case "Bootstrap Quiz 2":
                return BootstrapQuiz2();
            case "Bootstrap Quiz 3":
                return BootstrapQuiz3();
            case "Bootstrap Quiz 4":
                return BootstrapQuiz4();
            case "Bootstrap Quiz 5":
                return BootstrapQuiz5();
            case "Bootstrap Quiz 6":
                return BootstrapQuiz6();
            case "Bootstrap Quiz 7":
                return BootstrapQuiz7();
            case "Bootstrap Quiz 8":
                return BootstrapQuiz8();
            case "Bootstrap Quiz 9":
                return BootstrapQuiz9();
            case "Bootstrap Quiz 10":
                return BootstrapQuiz10();
            //NodeJsQuiz
            case "NodeJs Quiz 1":
                return NodeJsQuiz1();
            case "NodeJs Quiz 2":
                return NodeJsQuiz2();
            case "NodeJs Quiz 3":
                return NodeJsQuiz3();
            case "NodeJs Quiz 4":
                return NodeJsQuiz4();
            case "NodeJs Quiz 5":
                return NodeJsQuiz5();
            case "NodeJs Quiz 6":
                return NodeJsQuiz6();
            case "NodeJs Quiz 7":
                return NodeJsQuiz7();
            case "NodeJs Quiz 8":
                return NodeJsQuiz8();
            case "NodeJs Quiz 9":
                return NodeJsQuiz9();
            case "NodeJs Quiz 10":
                return NodeJsQuiz10();
            //ExpressJsQuiz
            case "ExpressJs Quiz 1":
                return ExpressJsQuiz1();
            case "ExpressJs Quiz 2":
                return ExpressJsQuiz2();
            case "ExpressJs Quiz 3":
                return ExpressJsQuiz3();
            case "ExpressJs Quiz 4":
                return ExpressJsQuiz4();
            case "ExpressJs Quiz 5":
                return ExpressJsQuiz5();
            case "ExpressJs Quiz 6":
                return ExpressJsQuiz6();
            case "ExpressJs Quiz 7":
                return ExpressJsQuiz7();
            case "ExpressJs Quiz 8":
                return ExpressJsQuiz8();
            case "ExpressJs Quiz 9":
                return ExpressJsQuiz9();
            case "ExpressJs Quiz 10":
                return ExpressJsQuiz10();
            //LaravelQuiz
            case "Laravel Quiz 1":
                return LaravelQuiz1();
            case "Laravel Quiz 2":
                return LaravelQuiz2();
            case "Laravel Quiz 3":
                return LaravelQuiz3();
            case "Laravel Quiz 4":
                return LaravelQuiz4();
            case "Laravel Quiz 5":
                return LaravelQuiz5();
            case "Laravel Quiz 6":
                return LaravelQuiz6();
            case "Laravel Quiz 7":
                return LaravelQuiz7();
            case "Laravel Quiz 8":
                return LaravelQuiz8();
            case "Laravel Quiz 9":
                return LaravelQuiz9();
            case "Laravel Quiz 10":
                return LaravelQuiz10();
            //jQueryQuiz
            case "jQuery Quiz 1":
                return jQueryQuiz1();
            case "jQuery Quiz 2":
                return jQueryQuiz2();
            case "jQuery Quiz 3":
                return jQueryQuiz3();
            case "jQuery Quiz 4":
                return jQueryQuiz4();
            case "jQuery Quiz 5":
                return jQueryQuiz5();
            case "jQuery Quiz 6":
                return jQueryQuiz6();
            case "jQuery Quiz 7":
                return jQueryQuiz7();
            case "jQuery Quiz 8":
                return jQueryQuiz8();
            case "jQuery Quiz 9":
                return jQueryQuiz9();
            case "jQuery Quiz 10":
                return jQueryQuiz10();

            default:
                return defaultQuestions();

        }
    }


}
