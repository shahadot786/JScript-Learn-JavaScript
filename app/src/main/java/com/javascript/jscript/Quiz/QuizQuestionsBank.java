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
                "Which of the following is a server-side Java Script object?",
                "Function",
                "File",
                "FileUpload",
                "Date",
                "File",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Java script can be used for Storing the form's contents to a database file on the server",
                "False",
                "True",
                "Nan",
                "None",
                "False",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "To insert a JavaScript into an HTML page, which tag is used?",
                "<script=’java’>",
                "<javascript>",
                "<script>",
                "<js>",
                "<script>",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the below is used in Java script to insert special characters?",
                "&",
                "\\",
                "-",
                "%",
                "\\",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How does Java Script store dates in objects of Date type?",
                "The number of days since January 1st, 1900",
                "The number of seconds since January 1st, 1970",
                "The number of milliseconds since January 1st, 1970",
                "The number of picoseconds since January 1st, 1970",
                "The number of milliseconds since January 1st, 1970",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "C-style block-level scoping is not supported in Java script",
                "False",
                "No",
                "True",
                "None",
                "True",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "JavaScript ignores extra spaces",
                "False",
                "No",
                "True",
                "None",
                "False",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which is the correct way to write a JavaScript array?",
                "var txt = new Array(1:\"arr\",2:\"kim\",3:\"jim\")",
                "var txt = new Array:1=(\" arr \")2=(\"kim\")3=(\"jim\")",
                "var txt = new Array(\"arr \",\"kim\",\"jim\")",
                "var txt = new Array=\" arr \",\"kim\",\"jim\"",
                "var txt = new Array(\"arr \",\"kim\",\"jim\")",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is correct to write “Hello World” on the web page?",
                "System.out.println(“Hello World”)",
                "print(“Hello World”)",
                "document.write(“Hello World”)",
                "response.write(“Hello World”)",
                "document.write(“Hello World”)",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following is the tainted property of a window object in Java Script?",
                "Pathname",
                "Protocol",
                "Defaultstatus",
                "Host",
                "Defaultstatus",
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
                "Which attribute needs to be changed to make elements invisible?",
                "visibility",
                "visible",
                "invisibility",
                "invisible",
                "visibility",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is used to capture all click events in a window?",
                "window.captureEvents(Event.CLICK);",
                "window.routeEvents(Event.CLICK );",
                "window.handleEvents (Event.CLICK);",
                "window.raiseEvents(Event.CLICK );",
                "window.captureEvents(Event.CLICK);",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Javascript is an object oriented language?",
                "False",
                "None",
                "No",
                "True",
                "Ture",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following is not a valid JavaScript variable name?",
                "2java",
                "_java_and_ java _names",
                "javaandjava",
                "None of the above",
                "2java",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the ways below is incorrect of instantiating a date?",
                "new Date(dateString)",
                "new Date()",
                "new Date(seconds)",
                "new Date(year, month, day, hours, minutes, seconds, milliseconds)",
                "new Date(seconds)",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is negative infinity in Java script?",
                "Any of below",
                "number in JavaScript, derived by dividing number by a negative number.",
                "number in JavaScript, derived by dividing number by zero.",
                "number in JavaScript, derived by dividing negative number by zero",
                "number in JavaScript, derived by dividing negative number by zero",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "___________ JavaScript is also called client-side JavaScript",
                "Microsoft",
                "Navigator",
                "LiveWire",
                "Native",
                "Navigator",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What language defines the behavior of a web page?",
                "HTML",
                "CSS",
                "XML",
                "JavaScript",
                "JavaScript",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Why so Java and JavaScript have similar name?",
                "Java Script is a stripped-down version of Java",
                "The syntax of JavaScript is loosely based on Java syntax",
                "They both support Object Oriented Programming",
                "None of the above",
                "The syntax of JavaScript is loosely based on Java syntax",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "File is a server-side JavaScript object?",
                "False",
                "True",
                "No",
                "None",
                "True",
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
                "What is the alternate name for Java script?",
                "LimeScript",
                "Both a and d",
                "ECMScript",
                "ECMAScript",
                "ECMAScript",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is a client-side Java Script object?",
                "File",
                "Function",
                "FileUpload",
                "Time",
                "FileUpload",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What java wrapper type is created when a JavaScript object is sent to Java?",
                "ScriptObject",
                "JavaObject",
                "Jobject",
                "JSObject",
                "JSObject",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Is it possible to declare a variable in Java Script along its type?",
                "Yes",
                "False",
                "No",
                "None",
                "Yes",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "JavaScript ignores extra spaces",
                "True",
                "False",
                "No",
                "None",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following method is used to evaluate a string of Java Script code in the context of the specified object?",
                "Eval",
                "ParseDoule",
                "ParseObject",
                "Efloat",
                "Eval",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Java Script supports all boolean operators",
                "True",
                "False",
                "No",
                "None",
                "False",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Java Script entities start with ____________ and end with ______________",
                "Semicolon, colon",
                "Semicolon, Ampersand",
                "Ampersand, colon",
                "Ampersand, semicolon",
                "Ampersand, semicolon",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "How to append a value to an array of Java Script?",
                "arr[arr.length] = value",
                "arr[arr.length+1] = new Arrays()",
                "arr[arr.length-1] = value",
                "arr[arr.length*1] = value",
                "arr[arr.length] = value",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "If we declare a variable, let test = 1, then later, reassign, stating test = 2, what will happen?",
                "test will equal 2",
                "test will equal 1",
                "JavaScript will raise a TypeError",
                "test will equal undefined",
                "test will equal 2",
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
                "If we declare a variable, const test = 1, then later, reassign, stating test = 2, what will happen?",
                "test will equal 2",
                "test will equal 1",
                "JavaScript will raise a TypeError",
                "test will equal undefined",
                "JavaScript will raise a TypeError",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "If we declare a variable, let test = 1, then later, reassign, stating var test = 2, what will happen if both are in the same scope?",
                "both variables will be declared",
                "JavaScript will raise a SyntaxError",
                "var test will reassign let test",
                "var test will be ignored as test is already declared",
                "JavaScript will raise a SyntaxError",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "If we declare a variable, var test = 1, then later, reassign, stating var test = 2, what will happen?",
                "both variables will be declared",
                "JavaScript will raise a SyntaxError",
                "var test = 2 will reassign var test = 1",
                "var test will be ignored as test is already declared",
                "var test = 2 will reassign var test = 1",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What are the main differences between let and const?",
                "let can be reassigned, const cannot be reassigned",
                "let cannot be reassigned, const can be reassigned",
                "let is functional scope, while const is block scope",
                "let is block scope, while const is functional scope",
                "let can be reassigned, const cannot be reassigned",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "The != and !== symbols both work the same for inequality comparisons:",
                "True",
                "False",
                "None",
                "Both",
                "False",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "For strict equality comparisons, we should use:",
                "=",
                "==",
                "===",
                "====",
                "===",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "The expression 8 >= 8 evaluates to:",
                "True",
                "False",
                "Undefined",
                "Error",
                "True",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "The expression 8 > 8 evaluates to:",
                "True",
                "False",
                "Undefined",
                "Error",
                "False",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The expression 8 === \"8\" evaluates to:",
                "True",
                "False",
                "Undefined",
                "Error",
                "False",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "The expression 8 == \"8\" evaluates to:",
                "True",
                "False",
                "Undefined",
                "Error",
                "True",
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
                "What will the return value of the following expression be?\n" +
                        "if (5 > 0) {\n" +
                        "  return true;\n" +
                        "} else {\n" +
                        "  return false;\n" +
                        "}",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "True",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What will the return value of the following expression be?\n" +
                        "if !(10 > 5) {\n" +
                        "  return true;\n" +
                        "} else {\n" +
                        "  return false;\n" +
                        "}",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "False",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What will the return value of the following expression be?\n" +
                        "let str = \"hello\"\n" +
                        "if (!!str) {\n" +
                        "  return true;\n" +
                        "} else {\n" +
                        "  return false;\n" +
                        "}",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "True",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What will the return value of the following expression be?\n" +
                        "if (NaN) {\n" +
                        "  return true;\n" +
                        "} else {\n" +
                        "  return false;\n" +
                        "}",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "False",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What will the return value of the following expression be?\n" +
                        "if (typeof NaN) {\n" +
                        "  return true;\n" +
                        "} else {\n" +
                        "  return false;\n" +
                        "}",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What will the value of str be after the following expression runs?\n" +
                        "let str = \"hello\"\n" +
                        "if (0 > 5) {\n" +
                        "  str = \"world\"\n" +
                        "}",
                "\"hello\"",
                "\"world\"",
                "undefined",
                "null",
                "\"hello\"",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What will be the value of result when this code is run and the function, quizFunction, is called with the input of 5?\n" +
                        "function quizFunction(argument) {\n" +
                        "  return argument\n" +
                        "}\n" +
                        "\n" +
                        "const result = quizFunction(5);",
                "argument",
                "\"5\"",
                "\"argument\"",
                "5",
                "5",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What will be the value of result when this code is run and the function, quizFunction, is called with the input of 10?\n" +
                        "function quizFunction(argument) {\n" +
                        "  return argument/2\n" +
                        "}\n" +
                        "\n" +
                        "const result = quizFunction(10);",
                "argument/2",
                "5",
                "\"argument/2\"",
                "10/2",
                "5",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What will be the value of result when this code is run and the function, quizFunction, is called with the input of 10?\n" +
                        "function quizFunction(argument) {\n" +
                        "  if (argument < 5) {\n" +
                        "    return true\n" +
                        "  }\n" +
                        "  return false\n" +
                        "}\n" +
                        "\n" +
                        "const result = quizFunction(10);",
                "argument < 5",
                "true",
                "10",
                "false",
                "false",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What will be the value of result when this code is run and called with the input of 5?\n" +
                        "function triple(argument) {\n" +
                        "  return argument * 3\n" +
                        "}\n" +
                        "\n" +
                        "function minusTwo(argument) {\n" +
                        "  return argument - 2\n" +
                        "}\n" +
                        "\n" +
                        "const result = triple(minusTwo(5));",
                "9",
                "13",
                "TypeError",
                "undefined",
                "9",
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
                "What about if we flipped the order of the same functions?\n" +
                        "function triple(argument) {\n" +
                        "  return argument * 3\n" +
                        "}\n" +
                        "\n" +
                        "function minusTwo(argument) {\n" +
                        "  return argument - 2\n" +
                        "}\n" +
                        "\n" +
                        "minusTwo(triple(5));",
                "9",
                "13",
                "TypeError",
                "undefined",
                "13",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "If you type the following code in the console window, what result will you get?\n" +
                        "3 > 2 > 1 === false;",
                "True",
                "False",
                "Undefined",
                "SyntaxError",
                "True",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "JavaScript is a ___ -side programming language.",
                "Client",
                "Server",
                "Both",
                "None",
                "Both",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following will write the message “Hello DataFlair!” in an alert box?",
                "alertBox(“Hello DataFlair!”);",
                "alert(Hello DataFlair!);",
                "msgAlert(“Hello DataFlair!”);",
                "alert(“Hello DataFlair!”);",
                "alert(“Hello DataFlair!”);",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How do you find the minimum of x and y using JavaScript?",
                "min(x,y);",
                "Math.min(x,y)",
                "Math.min(xy)",
                "min(xy);",
                "Math.min(x,y)",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following statements will throw an error?",
                "var fun = function bar( ){ }",
                "var fun = function bar{ }",
                "function fun( ){ }",
                "Function()",
                "var fun = function bar{ }",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "If the value of x is 40, then what is the output of the following program?\n" +
                        "(x % 10 == 0)? console.log(“Divisible by 10”) : console.log(“Not divisible by 10”);",
                "ReferenceError",
                "Divisible by 10",
                "Not divisible by 10",
                "None of the above",
                "Divisible by 10",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which JavaScript label catches all the values, except for the ones specified?",
                "catch",
                "label",
                "try",
                "default",
                "default",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which are the correct “if” statements to execute certain code if “x” is equal to 2?",
                "if(x 2)",
                "if(x = 2)",
                "if(x == 2)",
                "if(x != 2 )",
                "if(x == 2)",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What will the code return?\n" +
                        "Boolean(3 < 7)",
                "true",
                "false",
                "NaN",
                "SyntaxError",
                "true",
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
                "What is the output of the following code in the console?\n" +
                        "var x = 0;\n" +
                        "function fun(){\n" +
                        "++x;\n" +
                        "this.x = x;\n" +
                        "return x;\n" +
                        "}\n" +
                        "var bar = new new fun;\n" +
                        "console.log(bar.x);",
                "ReferenceError",
                "undefined",
                "1",
                "TypeError",
                "TypeError",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which is the correct JavaScript syntax to change the HTML content given below?\n" +
                        "\n" +
                        "<p id=”test”>Hello World!</p>",
                "document.getElementById(“test”).innerHTML = “Hello DataFlair!”;",
                "document.getElementsById(“test”).innerHTML = “Hello DataFlair!”;",
                "document.getElementById(test).innerHTML = “Hello DataFlair!”;",
                "document.getElementByTagName(“p”)[0].innerHTML = “Hello DataFlair!”;",
                "document.getElementById(“test”).innerHTML = “Hello DataFlair!”;",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Predict the result:\n" +
                        "var bar = 1,\n" +
                        "fun = {};\n" +
                        "fun: {\n" +
                        "bar:2;\n" +
                        "x: ++bar;\n" +
                        "};\n" +
                        "fun.x + fun.bar + bar;",
                "undefined",
                "4",
                "5",
                "NaN",
                "NaN",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Determine the result – String(“Hello”) === “Hello”;",
                "true",
                "false",
                "SyntaxError",
                "ReferenceError",
                "true",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the correct JavaScript syntax to print “DataFlair” in the console?",
                "print(“DataFlair”);",
                "console.print(“DataFlair”);",
                "log.console(“DataFlair”);",
                "console.log(“DataFlair”);",
                "console.log(“DataFlair”);",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following print content on the browser window?",
                "document.write(“print content”);",
                "response.write(“print content”);",
                "document.write(print content);",
                "write(“print content”);",
                "document.write(“print content”);",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which method will you use to round the number 24.76 to the nearest integer?",
                "round(24.76);",
                "rnd(24.76);",
                "Math.round(24.76);",
                "Math.rnd(24.76);",
                "Math.round(24.76);",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following statements will show a message as well as ask for user input in a popup?",
                "alert()",
                "prompt()",
                "confirm()",
                "message()",
                "prompt()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is an event listener in JavaScript?",
                "onclick",
                "blur",
                "click",
                "Click()",
                "click",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "You are a web designer in your company and need to create a JavaScript project for form validation. What are the advantages that JavaScript provides for forms?",
                "Bandwidth conservation",
                "Form validation",
                "Increased user satisfaction",
                "All of the above",
                "All of the above",
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
                "What is the syntax of a “for” statement in JavaScript?",
                "for(increment; condition; initialization)",
                "for(initialization, condition, increment)",
                "for(condition; initialization; increment)",
                "for(initialization; condition; increment)",
                "for(initialization; condition; increment)",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the given options is an incorrect variable name?",
                "javascript",
                "_javascript",
                "$javascript",
                "-javascript",
                "-javascript",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is a JavaScript element that represents either TRUE or FALSE values?",
                "Boolean",
                "RegExp",
                "Event",
                "Condition",
                "Boolean",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What kind of statement is used to execute actions based on a trigger or condition?",
                "RegExp or Regular Expression",
                "Conditional Statement",
                "Fired Event",
                "Boolean Variable",
                "Conditional Statement",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What elements are used to test for TRUE or False values stored in variables?",
                "Conditional statements.",
                "RegExp or Regular Expressions.",
                "Trigger readers.",
                "Comparison and logical operators.",
                "Comparison and logical operators.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is the name of the object that allows you to perform mathematical tasks with the interpreter?",
                "Number",
                "Count",
                "Math",
                "Solve",
                "Math",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "This is what you call the guide that defines coding conventions for all projects.",
                "Coding dictionary",
                "Developer's reference",
                "Main textbook",
                "Style guide",
                "Style guide",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "In JavaScript, what element is used to store multiple values in a single variable?",
                "Strings",
                "Functions",
                "Arrays",
                "Variables",
                "Arrays",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Where is the JavaScript placed inside an HTML document or page?",
                "In the <title> section.",
                "In the <meta> section.",
                "In the <footer> section.",
                "In the <body> and <head> sections.",
                "In the <body> and <head> sections.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is the element called that is used to describe the set of variables, objects, and functions you explicitly have access to?",
                "Output Level",
                "Scope",
                "Restriction",
                "Range",
                "Scope",
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
                "What is the name of the statement that is used to exit or end a loop?",
                "Conditional statement",
                "Falter statement",
                "Break statement",
                "Close statement",
                "Break statement",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "In JavaScript, what is used in conjunction with HTML to “react” to certain elements?",
                "Condition",
                "Boolean",
                "RegExp",
                "Events",
                "Events",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What's the output?\n" +
                        "x = 90;\n" +
                        "function f() {\n" +
                        "  console.log(x);\n" +
                        "  var x = 100;\n" +
                        "}\n" +
                        "f();",
                "90",
                "100",
                "Null",
                "undefined",
                "undefined",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What surrounds an if/else statement?",
                "Quotations",
                "Parenthesis",
                "Curly Brackets",
                "Square Brackets",
                "Curly Brackets",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "A string;",
                "Expresses a true false statement",
                "can contain letters, numbers, spaces, and symbols.",
                "takes in an input, does something with it, and then returns an output.",
                "Runs a boolean (true/false) statement based on data entered",
                "can contain letters, numbers, spaces, and symbols.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "The conditional statement, in Javascript, begins with the word _______.",
                "Then",
                "Else",
                "If",
                "OK",
                "If",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Indicates the beginning  and the end of a JavaScript section.",
                "<html> </html>",
                "<article> </article>",
                "<style> </style>",
                "<script> </script>",
                "<script> </script>",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "A user-defined name for a memory location whose value can change over time.",
                "variable",
                "syntax",
                "operator",
                "token",
                "variable",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following formatting tags are HTML and DO NOT need to be inside of the <script> </script> tags?",
                "<div>",
                "<h1>",
                "<h3>",
                "all",
                "all",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "In JavaScript, you should include a semi-colon at the end of each statement.",
                "yes",
                "no",
                "false",
                "none",
                "yes",
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
                "JavaScript code is embedded in HTML documents between <script> and </script> tags.",
                "true",
                "false",
                "undefined",
                "Nan",
                "true",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Programming and scripting languages are translated into this machine-readable form.",
                "Syntax",
                "Binary Code",
                "Compiler",
                "Operator",
                "Binary Code",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "A JavaScript file has an extension name of",
                ".jscp",
                ".css",
                ".js",
                ".Jp",
                ".js",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What character do we use for multiplication?",
                "#",
                "x",
                "*",
                "/",
                "*",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What character do we use for division?",
                "#",
                "x",
                "*",
                "/",
                "/",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How do we count the number of characters in a string?",
                ".length",
                ".numberOfCharacters",
                ".textLength()",
                "String.characters()",
                ".length",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What punctuation do we use if we need to check 2 conditions in a single if/else statement and both of them need to be true?",
                "||",
                "*",
                "&",
                "&&",
                "&&",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What punctuation do we use if we need to check 2 conditions in a single if/else statement and either of them needs to be true?",
                "||",
                "*",
                "&",
                "&&",
                "||",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What type of quotation marks does JavaScript require?",
                "Single quotes (aka apostrophes)",
                "Double quotes",
                "Either single quotes or double quotes",
                "Neither single quotes or double quotes",
                "Either single quotes or double quotes",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How do we declare a variable that can change?",
                "constant",
                "const",
                "letter",
                "var",
                "var",
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
                "What type of variable is\n" +
                        "var typeOfApples=\"Fuji\";",
                "Int",
                "Float",
                "Boolean",
                "String",
                "String",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What type of variable is\n" +
                        "var age = \"5\"",
                "Int",
                "Float",
                "Boolean",
                "String",
                "String",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What type of variable is\n" +
                        "var numApples = 2;",
                "Int",
                "Float",
                "Boolean",
                "String",
                "Int",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What best describes a variable?",
                "they allow the user to change language settings",
                "they allow the user to change the variable's data type",
                "they allow the user to save and call values",
                "they allow the user to declare a new data type",
                "they allow the user to save and call values",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which one of the following is the symbol for implementing the OR operator?",
                "||",
                "!",
                "**",
                "&&",
                "||",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following will correctly comment the text?",
                "// \"the text\"",
                "/\"the text\"/",
                "*/\"the text\"/*",
                "\\\\\"the text",
                "// \"the text\"",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which one of the following is the symbol for implementing the AND operator?",
                "||",
                "++",
                "**",
                "&&",
                "&&",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the syntax for creating a function in JavaScript named as Geekfunc?",
                "function = Geekfunc()",
                "function Geekfunc()",
                "function := Geekfunc()",
                "function : Geekfunc()",
                "function Geekfunc()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "How is the function called in JavaScript?",
                "call Geekfunc();",
                "call function GeekFunc();",
                "Geekfunc();",
                "function Geekfunc();",
                "Geekfunc();",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How to write an ‘if’ statement for executing some code. If “i” is NOT equal to 5?",
                "if(i!=5)",
                "if(i< >5)",
                "if i!=5",
                "if i< >5",
                "if(i!=5)",
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
                "How to initialize an array in JavaScript?",
                "var Geeks= “Geek1”, “Geek2”, “Geek3”",
                "var Geeks=(1:Geek1, 2:Geek2, 3:Geek3)",
                "var Geeks=(1=Geek1, 2=Geek2, 3=Geek3)",
                "var Geeks=[“Geek1”, “Geek2”, “Geek3”]",
                "var Geeks=[“Geek1”, “Geek2”, “Geek3”]",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "A function;",
                "Expresses a true false statement",
                "can contain letters, numbers, spaces, and symbols.",
                "takes in an input, does something with it, and then returns an output.",
                "Runs a boolean (true/false) statement based on data entered",
                "takes in an input, does something with it, and then returns an output.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "An array is;",
                "Shapes",
                "Sizes",
                "Options",
                "Lists of data",
                "Lists of data",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What command draws a rectangle?",
                "rec (10, 20, 100, 200);",
                "rect (10, 20, 100, 200)",
                "rect (10, 20, 100, 200);",
                "ellipse (10, 20, 40, 40)",
                "rect (10, 20, 100, 200);",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which command colors the background of your canvas?",
                "background",
                "endShape",
                "var = color",
                "fill",
                "background",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What command removes the outlines from shapes?",
                "noOutline ();",
                "noColor();",
                "noBorder();",
                "noStroke ();",
                "noStroke ();",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What command draws a perfect circle?",
                "ellipse (80, 60, 100, 105);",
                "ellipse(80, 60, 100, 100);",
                "circle (80, 60, 80, 60):",
                "ellipse (80, 60, 105, 100);",
                "ellipse(80, 60, 100, 100);",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What command colors a shape?",
                "color (43, 255, 0);",
                "bucket (43, 255, 0);",
                "fill (43, 255, 0);",
                "bucket (43, 255, 0);",
                "fill (43, 255, 0);",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What command draws a line?",
                "stroke (200, 220, 275, 220);",
                "line (200, 220, 275, 220);",
                "horizontal (200, 220,  60, 75);",
                "pencil (200, 220, 275, 220);",
                "line (200, 220, 275, 220);",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is at the end of a line of code?",
                "#",
                ")",
                ">",
                ";",
                ";",
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
                "The \"stroke\" command means",
                "color inside shape",
                "color outside shape",
                "color of blocks",
                "border",
                "border",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What does the \"fill\" command do",
                "put letters in the shape",
                "put pictures in the shape",
                "put color in the shape",
                "put code in the shape",
                "put color in the shape",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Any code that is within the following draw function:\n" +
                        "draw = function(){\n" +
                        "......\n" +
                        "}",
                "Will be performed twice",
                "Will not be performed",
                "Will be performed once",
                "Will be repeated over and over again",
                "Will be repeated over and over again",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The following code will:\n" +
                        "x++;",
                "Add 1 to the previous value of x",
                "Add 1 to the previous value of y",
                "Subtract 1 from the previous value of x",
                "Give an error message",
                "Add 1 to the previous value of x",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "A variable is used to:",
                "Store a value in memory",
                "Draw a circle",
                "Store a value that does not change",
                "Draw a rectangle",
                "Store a value in memory",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "In a programming language, __________ are used to store data values.",
                "tags",
                "codes",
                "files",
                "variables",
                "variables",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "JavaScript uses the _______ keyword to define variables.",
                "vrb",
                "var",
                "vari",
                "va",
                "var",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "This saves a value, which can be then assigned when writing code",
                "Parameter",
                "Function",
                "Variable",
                "None",
                "Variable",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The Tag is used To Give Heading To The Table.",
                "Head",
                "Td",
                "Th",
                "Caption",
                "Caption",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "IsNaN() Evaluates And Argument To Determine if Given Value:",
                "Is Not a Null",
                "Is Not a Number",
                "Is Not a New Object",
                "None Of The Above",
                "Is Not a Number",
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
                "Function is Used To Parse a String To Int:",
                "Integer.Parse",
                "Int.Parse",
                "Parse.Int",
                "None",
                "Int.Parse",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Event is Used To Check An Empty Text Box:",
                "Onclick()",
                "OnFocus()",
                "OnBlur()",
                "None",
                "OnBlur()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Method Prompt() Contain ........Number of Parameters.",
                "One",
                "Two",
                "Three",
                "Zero",
                "Two",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "GetMonth() returns The Month as:",
                "Int",
                "Float",
                "Char",
                "String",
                "Int",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "If Button is clicked .......Event Handler is invoked.",
                "OnSubmit()",
                "OnLoad()",
                "IsPostBack()",
                "Onclick()",
                "Onclick()",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "A Function Associated With An object is Called:",
                "Function",
                "Method",
                "Link",
                "None",
                "Method",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Predict the output of the following JavaScript code.\n" +
                        "<script type=\"text/javascript\">\n" +
                        "a = 8 + \"8\";\n" +
                        "document.write(a);\n" +
                        "</script>",
                "16",
                "Compilation Error",
                "88",
                "Run Time Error",
                "88",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Predict the output of the following JavaScript code.\n" +
                        "<script type=\"text/javascript\">\n" +
                        "var a=\"shrcreation\";\n" +
                        "var x=a.lastIndexOf(\"i\");\n" +
                        "document.write(x);\n" +
                        "</script>",
                "8",
                "0",
                "9",
                "Error",
                "8",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is not a reserved word in JavaScript?",
                "interface",
                "throws",
                "program",
                "short",
                "program",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Predict the output of the following JavaScript code.\n" +
                        "<script type=\"text/javascript\" language=\"javascript\">\n" +
                        "  \n" +
                        "var a = \"shrcreation\";\n" +
                        "var result = a.substring(4, 5);\n" +
                        "document.write(result);\n" +
                        "  \n" +
                        "</script>",
                "rc",
                "hr",
                "r",
                "s",
                "r",
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
                "Predict the output of the following JavaScript code.\n" +
                        "<script type=\"text/javascript\" language=\"javascript\">\n" +
                        "  \n" +
                        "var x=5;\n" +
                        "var y=6;\n" +
                        "var res=eval(\"x*y\");\n" +
                        "document.write(res);\n" +
                        "  \n" +
                        "</script>",
                "“30”",
                "30",
                "5*6",
                "“5*6”",
                "30",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What will be the output of the following code?\n" +
                        "<script>\n" +
                        "document.write(typeof(24.49));\n" +
                        "</script>",
                "float",
                "number",
                "integer",
                "double",
                "number",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the method in JavaScript used to remove the whitespace at the beginning and end of any string?",
                "strip()",
                "trim()",
                "stripped()",
                "trimmed()",
                "trim()",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following is the pop() method does?",
                "Display the first element",
                "Increments length by 1",
                "Decrements length by 1",
                "None of the mentioned",
                "Decrements length by 1",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following option is correct if reverse() and join() are used together?",
                "Reverses and stores",
                "Reverses and concatenates",
                "Only Reverses",
                "None of the mentioned",
                "Reverses and stores",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following option is correct when a function with no return type is called?",
                "Dynamic function",
                "Static function",
                "Method",
                "Procedures",
                "Procedures",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following scope is used by the JavaScript?",
                "Segmental",
                "Literal",
                "Lexical",
                "Sequential",
                "Lexical",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following in reduce operation called?",
                "filter and fold",
                "inject and fold",
                "finger and fold",
                "fold",
                "inject and fold",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "In JavaScript, we do not have data types like integer and float. What is the function that can be used to check if the number is an integer or not?",
                "Integer(value)",
                "ifInteger(value)",
                "isInteger(value)",
                "ifinteger(value)",
                "isInteger(value)",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following is an advantage of using JavaScript?",
                "Increased interactivity.",
                "Less server interaction.",
                "Immediate feedback from the users.",
                "All of the above.",
                "All of the above.",
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
                "Which function of an Array object calls a function for each element in the array?",
                "forEach()",
                "every()",
                "forEvery()",
                "each()",
                "forEach()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "JavaScript is a ________ Side Scripting Language.",
                "Server",
                "ISP",
                "Browser",
                "None of the above",
                "Browser",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Predict the output on the console for the following JavaScript code.\n" +
                        "<script>\n" +
                        "     \n" +
                        "    function test() {\n" +
                        "    if(true) {\n" +
                        "        var a = 5;\n" +
                        "    }\n" +
                        "    document.write(a);\n" +
                        "}\n" +
                        "test();                   \n" +
                        " \n" +
                        "</script>",
                "Compilation Error",
                "Nothing will be printed as output",
                "5",
                "Runtime error",
                "5",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which was the first browser to support JavaScript?",
                "Mozilla Firefox",
                "Netscape",
                "Google Chrome",
                "IE",
                "Netscape",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "In JavaScript which of the following is done when the interpreter encounters an empty statement?",
                "Throws an error",
                "Shows a warning",
                "Prompts to complete the statement",
                "Ignores the statements",
                "Ignores the statements",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is not the JavaScript operator?",
                "typeof",
                "this",
                "delete",
                "new",
                "this",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is the use of the <noscript > tag?",
                "It prevents script for execution",
                "Displayed by non-JavaScript browsers",
                "It stops cookies",
                "All of the above",
                "Displayed by non-JavaScript browsers",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What happens when a document loads in javascript?",
                "window.onload = displayTime;",
                "onload = displayTime;",
                "window.onload = start;",
                "window. = displayTime;",
                "window.onload = displayTime;",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which command provides a random color?",
                "Randomizer.color",
                "RandColor;",
                "Randomizer.nextColor()",
                "nextColor.Randomizer()",
                "Randomizer.nextColor()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "His name is Fred and he is less than 16 years old",
                "if (name === \"fred\" && age < 16 )",
                "if (name = \"fred\" && age < 16 )",
                "if (name = \"fred\" || age < 16 )",
                "if (name === \"fred\" || age < 16 )",
                "if (name === \"fred\" && age < 16 )",
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
                "Which of the following is the literal way to create an object with a property x of value 10?",
                "{x: 10}",
                "new Object({x: 10})",
                "both a & b",
                "none",
                "{x: 10}",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Suppose that obj is a pure JavaScript object. What will typeof obj return?",
                "\"object\"",
                "\"obj\"",
                "\"pure object\"",
                "NONE",
                "\"object\"",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How can we access the property top-price of an object obj?",
                "bj.top-price",
                "obj[\"top-price\"]",
                "obj.accessProperty(\"top-price\")",
                "Both a & b",
                "obj[\"top-price\"]",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Objects can contain objects as property values. True or false?",
                "FALSE",
                "NONE",
                "TRUE",
                "Undefined",
                "TRUE",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Call the method greet shown below.\n" +
                        "var obj = {\n" +
                        "   x:10,\n" +
                        "   y:20,\n" +
                        "   fx:{\n" +
                        "       greet:function(){alert(\"Hello World!\");}\n" +
                        "   }\n" +
                        "}",
                "obj.greet()",
                "obj.fx.greet()",
                "obj.fx.greet",
                "NONE",
                "obj.fx.greet()",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "A method of an object is simply a property with a function definition as its value. True or false?",
                "FALSE",
                "NONE",
                "TRUE",
                "Undefined",
                "TRUE",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "It has been told to you that ele is an array. What will ele.constructor return?",
                "The Array constructor definition",
                "The Function constructor definition",
                "The Object constructor definition",
                "both a & c",
                "The Array constructor definition",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "In JavaScript, custom classes like those in PHP, Java, C++ can be emulated using what?",
                "Methods",
                "Constructors",
                "The Object() constructor",
                "NONE",
                "Constructors",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What are the two kinds of objects properties we can have in JavaScript?",
                "Accessor and successor",
                "Modifier and constant",
                "Literal and constructor",
                "Accessor and modifier",
                "Accessor and modifier",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which property is used to obtain browser vendor and version information?",
                "modal",
                "version",
                "navigator",
                "browser",
                "navigator",
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
                "Given a number of elements that need to stay in order, would you use an Object or an Array?",
                "Object",
                "Array",
                "Number",
                "String",
                "Array",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Given a collection of artists and lists of their songs, would you store the artist-song-list pairs in an Object or an Array?",
                "Object",
                "Array",
                "Number",
                "String",
                "Object",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "All the elements in an array must be of the same type",
                "True",
                "False",
                "Same",
                "None",
                "False",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "All keys in an object are strings",
                "True",
                "False",
                "Same",
                "None",
                "True",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What happens to the array in the following code snippet?\n" +
                        "const dogs = [\"Fido\", \"Odie\", \"Oscar\"]" +
                        "\n" +
                        "dogs.length" +
                        "\n" +
                        "dogs.length = 1" +
                        "\n" +
                        "dogs // What will the array contain here?",
                "Nothing",
                "The array becomes just [\"Oscar\"]",
                "The array becomes just [\"Fido\"]",
                "The array becomes just [\"Odie\", \"Oscar\"]",
                "The array becomes just [\"Fido\"]",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What are the keys in the object after running the code below?\n" +
                        "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Justin Bieber': [\"Baby\"]\n" +
                        "}" +
                        "\n" +
                        "artistsAndSongs['Daft Punk'] = [\"Harder, Better, Faster, Stronger\"]" +
                        "\n" +
                        "delete artistsAndSongs[\"Justin Bieber\"]",
                "['Prince', 'The Beatles', 'Joni Mitchell', 'Justin Bieber', 'Daft Punk']",
                "['Prince', 'The Beatles', 'Joni Mitchell', 'Justin Bieber']",
                "['Prince', 'The Beatles', 'Joni Mitchell']",
                "['Prince', 'The Beatles', 'Joni Mitchell', 'Daft Punk']",
                "['Prince', 'The Beatles', 'Joni Mitchell', 'Daft Punk']",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "If we run artistsAndSongs['Daft Punk'].push(\"Around the World\") after running the code below, what is the value of the object?\n" +
                        "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Justin Bieber': [\"Baby\"]\n" +
                        "}" +
                        "\n" +
                        "artistsAndSongs['Daft Punk'] = [\"Harder, Better, Faster, Stronger\"]" +
                        "\n" +
                        "delete artistsAndSongs[\"Justin Bieber\"]",
                "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Daft Punk': [\"Harder, Better, Faster, Stronger\"]\n" +
                        "}",
                "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Daft Punk': [\"Harder, Better, Faster, Stronger\", \"Around the World\"]\n" +
                        "}",
                "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Daft Punk': [\"Around the World\"]\n" +
                        "}",
                "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"]\n" +
                        "}",
                "const artistsAndSongs = {\n" +
                        "  'Prince': [\"Purple Rain\", \"When Doves Cry\"],\n" +
                        "  'The Beatles': [\"Revolution\", \"Norwegian Wood\"],\n" +
                        "  'Joni Mitchell': [\"A Case of You\", \"Sunny Sunday\"],\n" +
                        "  'Daft Punk': [\"Harder, Better, Faster, Stronger\", \"Around the World\"]\n" +
                        "}",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the result of the following code in a browser that supports the spread operator?\n" +
                        "const oneTwoThree = [1, 2, 3]\n" +
                        "const sevenEightNine = [7, 8, 9]" +
                        "\n" +
                        "[4, 5, 6, ...oneTwoThree, ...sevenEightNine]",
                "[4, 5, 6, 7, 8, 9, 1, 2, 3]",
                "[4, 5, 6, 1, 2, 3, 7, 8, 9]",
                "[1, 2, 3, 4, 5, 6, 7, 8, 9]",
                "Error",
                "[4, 5, 6, 1, 2, 3, 7, 8, 9]",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Given the array const letters = [\"alpha\", \"gamma\", \"delta\"], which operation(s) return the array [\"alpha\", \"beta\", \"gamma\", \"delta\"]?",
                "letters.push(\"beta\")",
                "[...letters.slice(0, 1), 'beta', ...letters.slice(1)]",
                "letters.splice(1, 1, 'beta')",
                "letters.splice(1, 0, 'beta')",
                "[...letters.slice(0, 1), 'beta', ...letters.slice(1)]",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "var person = {\n" +
                        "  name: \"Joe Camel\",\n" +
                        "  age: 42,\n" +
                        "  status: \"dead\"\n" +
                        "}\n" +
                        "console.log(typeof person);",
                "array",
                "string",
                "number",
                "object",
                "object",
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
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var hat = {\n" +
                        "  size: \"large\",\n" +
                        "  color: \"orange\"\n" +
                        "}\n" +
                        "console.log(hat.size);",
                "orange",
                "large",
                "TypeError",
                "undefined",
                "large",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What does the following code print to the console.\n" +
                        "\n" +
                        "var teddy_bear = {\n" +
                        "  texture: \"fluffy\"\n" +
                        "}\n" +
                        "console.log(teddy_bear[\"texture\"]);",
                "None",
                "Null",
                "undefined",
                "fluffy",
                "fluffy",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var fat_joe = {\n" +
                        "  crew: \"Terror Squad\"\n" +
                        "}\n" +
                        "fat_joe.crew = \"something\";\n" +
                        "console.log(fat_joe.crew);",
                "Terror Squad",
                "Terror",
                "something",
                "something Squad",
                "something",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var pen = {};\n" +
                        "pen.ink = \"blue\";\n" +
                        "console.log(pen.ink);",
                "blue",
                "Null",
                "Error",
                "None",
                "blue",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var walking_dead = {\n" +
                        "  topic: \"zombie apocalypse\"\n" +
                        "}\n" +
                        "console.log(walking_dead[\"main_character\"]);",
                "zombie apocalypse",
                "undefined",
                "SyntaxError",
                "zombie",
                "undefined",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var bottle = {\n" +
                        "  contents: function () { return \"some fine bubbly\" },\n" +
                        "  color: \"green\"\n" +
                        "}\n" +
                        "console.log(bottle.contents());",
                "some fine bubbly",
                "green",
                "Both",
                "None",
                "some fine bubbly",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var yao = {\n" +
                        "  self: function () { return this }\n" +
                        "}\n" +
                        "console.log(yao === yao.self());",
                "false",
                "null",
                "true",
                "undefined",
                "true",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var lebron = {\n" +
                        "  occupation: \"basketball\",\n" +
                        "  introduction: function () {\n" +
                        "    return \"My name is AnneMoore and I play \" + this.occupation\n" +
                        "  }\n" +
                        "}\n" +
                        "lebron.introduction();",
                "My name is AnneMoore and I play basketball",
                "My name is AnneMoore",
                "I play basketball",
                "None",
                "My name is AnneMoore and I play basketball",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var square = {\n" +
                        "  side_length: 4,\n" +
                        "  area: function () { \n" +
                        "    var l = this.side_length;\n" +
                        "    return l * l;\n" +
                        "  }\n" +
                        "}\n" +
                        "console.log(square.area());",
                "4",
                "32",
                "16",
                "0",
                "16",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var me = {\n" +
                        "  first_name: \"Matthew\",\n" +
                        "  last_name: \"Powers\",\n" +
                        "  full_name: function () {\n" +
                        "    return this.first_name + \" \" + this.last_name;\n" +
                        "  }\n" +
                        "}\n" +
                        "console.log(me.full_name());",
                "Matthew Powers",
                "Matthew",
                "SyntaxError",
                "Powers Matthew",
                "Matthew Powers",
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
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var mug = {\n" +
                        "  capacity: \"10 fluid ounces\",\n" +
                        "  customer_message: function (desired_size) {\n" +
                        "    if (desired_size > 10) { return \"This mug is not large enough for you\" };\n" +
                        "  }\n" +
                        "}\n" +
                        "console.log(customer_message(13));",
                "SyntaxError",
                "Undefined",
                "This mug is not large enough for you",
                "ReferenceError: customer_message is not defined",
                "ReferenceError: customer_message is not defined",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "function global_function () { return \"I can be called anywhere\" };\n" +
                        "var an_obj = {\n" +
                        "  something: global_function\n" +
                        "}\n" +
                        "console.log(an_obj.something());",
                "TypeError",
                "I can be called anywhere",
                "Undefined",
                "None",
                "I can be called anywhere",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var person = {\n" +
                        "  age: 32,\n" +
                        "  address: {\n" +
                        "    city: \"New York\",\n" +
                        "    state: \"NY\"\n" +
                        "  }\n" +
                        "}\n" +
                        "console.log(person.address.city);",
                "NY",
                "New York",
                "Both",
                "None",
                "New York",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var golf = {\n" +
                        "  type: \"sport\",\n" +
                        "  clubs: {\n" +
                        "    high_end: \"taylor made\",\n" +
                        "    low_end: \"rusty basement clubs\"\n" +
                        "  }\n" +
                        "}  \n" +
                        "golf.clubs.high_end = \"callaway\";\n" +
                        "console.log(golf.clubs.high_end);",
                "callaway",
                "taylor made",
                "rusty basement clubs",
                "None of the above",
                "callaway",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var game = { title: \"tic tac toe\" };\n" +
                        "var same_game = { title: \"tic tac toe\" };\n" +
                        "console.log(game === same_game );",
                "tic tac toe",
                "AssertionError",
                "false",
                "None of the above",
                "false",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var lyric = { lyric: \"right now, Eight\" };\n" +
                        "console.log(lyric === lyric);",
                "false",
                "true",
                "undefined",
                "None of the above",
                "true",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var ruff_ryders = {\n" +
                        "  dmx: {\n" +
                        "    birthplace: \"Mount Vernon, NY\"\n" +
                        "  }\n" +
                        "}\n" +
                        "console.log(ruff_ryders.lox.birthplace);",
                "TypeError",
                "undefined",
                "SyntaxError",
                "Mount Vernon, NY",
                "TypeError",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var a = {\n" +
                        "  x: \"y\"\n" +
                        "}\n" +
                        "console.log(\"x\" in a);",
                "false",
                "true",
                "undefined",
                "None of the above",
                "true",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What does the following code print to the console?\n" +
                        "\n" +
                        "var abc = {\n" +
                        "  zz: \"ll\"\n" +
                        "}\n" +
                        "console.log(abc.hasOwnProperty(\"zz\"));",
                "false",
                "true",
                "undefined",
                "None of the above",
                "true",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is the value of “a” in the following statement?" +
                        "\n" +
                        "var a;",
                "undefined",
                "null",
                "0",
                "NaN",
                "undefined",
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
                "Which of the following operator is used for the Assignment Operator?",
                "==",
                "!",
                "=",
                "+",
                "=",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the symbol pair used to write a new line within a string values?",
                "\\*",
                "\\'",
                "\n",
                "\\br",
                "\n",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the symbol used for the INCREMENT operator in JS?",
                "+",
                "++",
                "=",
                "==",
                "++",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Conditions return values of which data type?",
                "Integer",
                "boolean",
                "floating-point",
                "string",
                "boolean",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Built in object in JS that allows a script to perform mathematical task",
                "Arithmetic",
                "Math Object",
                "Operation Object",
                "Mathematics Object",
                "Math Object",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is the value of Z at the end of the code?" +
                        "\n" +
                        "var x = 5;" +
                        "\n" +
                        "var y = x;" +
                        "\n" +
                        "y++;" +
                        "\n" +
                        "x--;" +
                        "\n" +
                        "var z = x +y;" +
                        "\n" +
                        "z++;",
                "10",
                "9",
                "11",
                "12",
                "11",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which object method is used?",
                "Object.keys()",
                "Object.create()",
                "Object.assign()",
                "Object.values()",
                "Object.values()",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which one is the correct result?" +
                        "\n" +
                        "const person = {" +
                        "\n" +
                        "name: 'mostafa'," +
                        "\n" +
                        "email:'mostafa@me.com'," +
                        "\n" +
                        "phone: 23456" +
                        "\n" +
                        "}" +
                        "\n" +
                        "console.log( Object.keys());",
                "[name, email, phone]",
                "['mostafa', 'email', phone]",
                "[mostafa, mostafa@me.com, 23456]",
                "None of the above",
                "[name, email, phone]",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "which method is correct?" +
                        "\n" +
                        "let person = {" +
                        "\n" +
                        "name: 'katja'," +
                        "\n" +
                        "email:'katja@me.com'" +
                        "\n" +
                        "};" +
                        "\n" +
                        "let personAdd = {" +
                        "\n" +
                        "location: 'Espoo'" +
                        "\n" +
                        "};" +
                        "\n" +
                        "output: {name:'katja', email:'katja@me.com', location:'Espoo' }",
                "Object.create()",
                "object.keys()",
                "Object.assign()",
                "Object.add()",
                "Object.assign()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which method adds items to the end of an Array?",
                "array.pop()",
                "array.push()",
                "array.shift()",
                "array.add()",
                "array.push()",
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
                "Once you create an object, can we add, remove or change properties of that object at any time?",
                "For some objects",
                "For inherited class only",
                "No",
                "Yes",
                "Yes",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How do you check if an object is an instance of a particular class?",
                "By using the instance of operator.",
                "By using the instance of an object.",
                "None of these",
                "By using the instance of a class.",
                "By using the instance of a class.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the type of NaN?",
                "String",
                "Boolean",
                "Number",
                "none of these",
                "Number",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What will be the console output of the following code?\n" +
                        "(function(x) {\n" +
                        "    return (function(y) {\n" +
                        "        console.log(x);\n" +
                        "    })(2)\n" +
                        "})(1);",
                "1",
                "2",
                "0",
                "None of the above",
                "1",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How the objects are passed in JavaScript?",
                "by reference",
                "both by value and by reference",
                "by value",
                "none of these",
                "by reference",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following line will you will write to test whether or not x is null or not in JavaScript?",
                "console.print((x !== null) & (typeof x === &amp;ldquo;object'));\n",
                "console.print((x !== null) && (typeof x === &amp;ldquo;object'));",
                "console.log((x !== null) & (typeof x === &amp;ldquo;object'));",
                "console.log((x !== null) && (typeof x === &amp;ldquo;object'));",
                "console.log((x !== null) && (typeof x === &amp;ldquo;object'));",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What will the output of code below? \n" +
                        "console.log(0.1   0.2);   \n" +
                        "console.log(0.1   0.2 == 0.3);",
                "0.30000000000000004 true",
                "0.3 true",
                "0.30000000000000004 false",
                "0.3 false",
                "0.30000000000000004 false",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is an object in JavaScript?",
                "collection of classes",
                "collection of variables",
                "collection of values",
                "collection of properties",
                "collection of properties",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What will be the out of the following code?\n" +
                        "console.log((function f(n){return ((n > 1) ? n * f(n-1) : n)})(10));",
                "It will not print a factorial value.",
                "The code will output the value of 10 factorial.",
                "The code will output the value of 8 factorial.",
                "The code will output the value of 9 factorial.",
                "The code will output the value of 8 factorial.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "__________ is basically a JavaScript methodology that seeks to overcome browser inconsistencies by separating page functionality from structure.",
                "Unobtrusive Javascript",
                "Obtrusive Javascript",
                "NaN",
                "none of these",
                "Unobtrusive Javascript",
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
                "Which of the following popup box we can't create in JavaScript?",
                "Confirm Box",
                "Prompt Box",
                "Custom Dialog",
                "Alert Dialog",
                "Custom Dialog",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is the best example of automatic type conversion in JavaScript?",
                "\"5\" + cats = \"5 cats\"",
                "\"5\" + \"cats\" = \"5 cats\"",
                "\"5\" + cats = 5 cats",
                "5 + \"cats\" = \"5 cats\"",
                "5 + \"cats\" = \"5 cats\"",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What will be the output when the following code is executed?\n" +
                        "console.log(false == '0');  console.log(false === '0')",
                "true true",
                "true false",
                "false false",
                "false true",
                "true false",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Can a JavaScript constructor return a primitive value (e.g. a number or a string)?",
                "Yes",
                "No",
                "None of these",
                "False",
                "No",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "__________ is an expression (typically a function) that can have free variables together with an environment that binds those variables (that “closes” the expression).",
                "closure",
                "class",
                "object",
                "none of these",
                "closure",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which method is called when all the page elements have loaded(HTML, CSS, images)?",
                "window.delay()",
                "window.ondelay()",
                "window.laoded()",
                "window.onload()",
                "window.onload()",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What is the name of the property that allows you to add properties and methods to an object?",
                "The 'private' property",
                "The 'prototype' property",
                "The 'protected' property",
                "The 'public' property",
                "The 'prototype' property",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What will be the output of the following line in JavaScript?\n" +
                        "\"1\"+2+3",
                "14",
                "15",
                "23",
                "123",
                "123",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following datatype is not supported in Javascript?",
                "Boolean",
                "Varchar",
                "String",
                "Number",
                "Varchar",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What does the “this” keyword refer to in a function of a class?",
                "To the Class.",
                "To that function.",
                "To the object that a function is a method of.",
                "None of these.",
                "To the object that a function is a method of.",
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
                "In JavaScript, addEvent is a combination of __________ function?",
                "Event() and addEventListener()",
                "addEventListener()",
                "addEventListener() and attachEvent() function",
                "None of these",
                "addEventListener() and attachEvent() function",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What you have to instantiate first with constructor functions?",
                "class",
                "function",
                "object",
                "none of these",
                "object",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How remove 'Mona' and 'Kirsi' from the names list?" +
                        "\n" +
                        "const names = ['Mostafa', 'Mona', 'Kirsi', 'Katja'];",
                "names.push('Mona', 'Kirsi')",
                "names.slice(1, 3)",
                "names.unshift( 'Mona', 'Kirsi')",
                "names.slice(2,2)",
                "names.slice(1, 3)",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How remove 'Jessi' from the names list?" +
                        "\n" +
                        "const names = ['Mostafa', 'Jessi', 'John', 'Katja'];",
                "names.pop()",
                "names.slice('Jessi')",
                "names.slice(1, 2)",
                "names.splice(1,1);",
                "names.splice(1,1);",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How access to the car's model ?" +
                        "\n" +
                        "const car = {" +
                        "\n" +
                        "name: 'Nissan'," +
                        "\n" +
                        "model: ' audi'," +
                        "\n" +
                        "year: 2009" +
                        "\n" +
                        "};",
                "console.log(model)",
                "console.log('audi');",
                "console.log(car.model);",
                "console.log('model');",
                "console.log(car.model);",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How many values or properties can an Object contain",
                "One value/properties",
                "Two values/properties",
                "Multiple values/properties",
                "Multiple values",
                "Multiple values/properties",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Identify the name of the object in the following code:\n" +
                        "var car = { model: \"EXPLORER\", brand: \"Ford\", IntroductionYear: 2019 }",
                "car",
                "\"EXPLORER\"",
                "model",
                "var",
                "car",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Identify a key in the following code:\n" +
                        "var car = { model: \"EXPLORER\", brand: \"Ford\", IntroductionYear: 2019 }",
                "car",
                "\"EXPLORER\"",
                "model",
                "var",
                "model",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Identify a value in the following code:\n" +
                        "var car = { model: \"EXPLORER\", brand: \"Ford\", IntroductionYear: 2019 }",
                "car",
                "\"EXPLORER\"",
                "model",
                "var",
                "\"EXPLORER\"",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How would you access the value \"Ford\"\n" +
                        "var car = { model: \"EXPLORER\", brand: \"Ford\", IntroductionYear: 2019 }",
                "car.Ford;",
                "car[\"brand\"];",
                "car.getbrand;",
                "car[0]",
                "car[\"brand\"];",
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
                "What is DRIVE in the code below?\n" +
                        "var car = {" +
                        "\n" +
                        "DRIVE: function()" +
                        "\n" +
                        "alert(\"Drive\");" +
                        "\n" +
                        "}",
                "A property",
                "A method",
                "A variable",
                "A function",
                "A method",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the code that allows you to make use DRIVE?\n" +
                        "var car = {" +
                        "\n" +
                        "DRIVE: function()" +
                        "\n" +
                        "alert(\"Drive\");" +
                        "\n" +
                        "}",
                "drive()",
                "DRIVE()",
                "car.drive()",
                "car.DRIVE()",
                "car.DRIVE()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What does the following code do?\n" +
                        "var car = { model: \"EXPLORER\", brand: \"Ford\", IntroductionYear: 2019 }" +
                        "\n" +
                        "var text = \"\";" +
                        "\n" +
                        "for (var x in car) {" +
                        "\n" +
                        "text += car[x] + \" \";" +
                        "\n" +
                        "}",
                "Displays all the code in the object",
                "Displays all the values in the object",
                "Displays all the names of the keys in the object",
                "None of these",
                "Displays all the values in the object",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of these creates an array in Javascript named myNumber that contains the following numbers:\n" +
                        "5, 7, 11, 23, 1\n" +
                        "Use the var keyword to create variables",
                "var myNumber = [5, 7, 11, 23, 1]",
                "var myNumber=[5,7,11,23,1,2]",
                "var myNumber = [7, 5, 11, 23, 1];",
                "var myNumbers=[5,7,11,23,1];",
                "var myNumber = [5, 7, 11, 23, 1]",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which will retrieve the \"Singapore\" from the following array?\n" +
                        "var countries = [\"Thailand\", \"Myanmar\", \"Malaysia\", \"Singapore\", \"Indonesia\"]",
                "countries[3]",
                "countries[2]",
                "countries[0]",
                "countries[4]",
                "countries[3]",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Given the following array\n" +
                        "var numbers = [752, 363, 587, 423, 688, 999]\n" +
                        "What is the index of the number 999",
                "4",
                "5",
                "11",
                "2",
                "5",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of these lines of code will give you the number of elements in the numbers array?",
                "numbers.value",
                "numbers.innerHTML",
                "numbers.length",
                "None of these",
                "numbers.length",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Fill in the Blanks to allow the code to display an alert message for all the cars in the array\n" +
                        "var cars = [“Saab”, “Volvo”, “BMW”];\n" +
                        "for (var x = 0; x < cars.length; x++)" +
                        "\n" +
                        "alert(cars[_______]);",
                "cars",
                "x",
                "y",
                "length",
                "x",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Given the following object:\n" +
                        "var person = {" +
                        "\n" +
                        "fn: “Raymond”," +
                        "\n" +
                        "ln: “Chia”," +
                        "\n" +
                        "age: 25 };" +
                        "\n" +
                        "Which code will retrieve the value \"Chia\"",
                "person[1]",
                "person[\"ln\"]",
                "person.age",
                "person.fn",
                "person[\"ln\"]",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "You retrieve values from objects by passing in the ___________ of the value into the [ ]",
                "name",
                "string",
                "number",
                "None of these",
                "name",
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
                "Which of these ways of creating a new Array is valid?",
                "var x = [\"A\", \"B\", \"C\"];",
                "var x = new Array[\"A\", \"B\", \"C\"];",
                "var x = (A\", \"B\", \"C\");",
                "var x = (A\", \"B\", \"D\");",
                "var x = [\"A\", \"B\", \"C\"];",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How do we generate a random number?",
                "Math.random()",
                "random.number()",
                "number.random()",
                "Random.math()",
                "Math.random()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which attribute(s) of the FORM and INPUT tags become the properties of the created object?",
                "value",
                "value and name",
                "name",
                "name and type",
                "name",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "JavaScript is designed for following purpose -",
                "To Style HTML Pages",
                "To Perform Server Side Scripting Operation",
                "To add interactivity to HTML Pages.",
                "To Execute Query Related to DB on Server",
                "To add interactivity to HTML Pages.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which keyword do we need to define a function?",
                "function",
                "method",
                "onclick",
                "functionName()",
                "function",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which message will the user see?\n" +
                        "var message = \"Hello\"\n" +
                        "//message = \"Goodbye\"\n" +
                        "alert(message + \"user\");",
                "\"Hello user\"",
                "No message",
                "\"Goodbye user\"",
                "\"message + user\"",
                "\"Hello user\"",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "GetMonth() returns The Month as:",
                "Int",
                "Float",
                "Char",
                "String",
                "Int",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "If Button is clicked .......Event Handler is invoked.",
                "OnSubmit()",
                "OnLoad()",
                "IsPostBack()",
                "Onclick()",
                "Onclick()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "A Function Associated With An object is Called:",
                "Function",
                "Method",
                "Link",
                "None",
                "Method",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What attribute/value do we use to make a button execute JavaScript when clicked?",
                "onclick=\"doSomething;\"",
                "on-click=\"doSomething;\"",
                "onclick=\"doSomething();\"",
                "onclick=doSomething();",
                "onclick=\"doSomething();\"",
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
                "The display value of most DOM elements is either inline or block.",
                "True",
                "False",
                "None",
                "No",
                "True",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is an inline element:",
                "<p>",
                "<strong>",
                "<section>",
                "<body>",
                "<strong>",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "All visible content in an HTML document is written inside of the <body> tag.",
                "True",
                "False",
                "None",
                "No",
                "True",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Block elements can be nested inside of an inline element",
                "True",
                "False",
                "None",
                "No",
                "False",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Inline elements can be nested inside of a block element",
                "True",
                "False",
                "None",
                "No",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Inline elements can be nested inside of another inline element",
                "True",
                "False",
                "None",
                "No",
                "True",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Block elements can be nested in a block element",
                "True",
                "False",
                "None",
                "No",
                "True",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "<span> elements have display: block by default",
                "True",
                "False",
                "None",
                "No",
                "False",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following tags contains the main content of a table?",
                "tablebody",
                "thead",
                "tbody",
                "body",
                "tbody",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Indicates the beginning and the end of a JavaScript section.",
                "<html> </html>",
                "<style> </style>",
                "<article> </article>",
                "<script> </script>",
                "<script> </script>",
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
                "How can a developer show a pop-up message to the user on the browser window?",
                "alert",
                "prompt",
                "console.log",
                "<p> tag",
                "alert",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which message will the user see?\n" +
                        "var message = \"Hello\"\n" +
                        "//message = \"Goodbye\"\n" +
                        "alert(message + \"user\");",
                "\"Hello user\"",
                "No message",
                "\"Goodbye user\"",
                "\"message + user\"",
                "\"Hello user\"",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What DOM Property is used to update the text of an HTML tag?",
                "id",
                "innerHTML",
                "src",
                "style",
                "innerHTML",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What is one key characteristic of an id?",
                "It must be capitalized",
                "It must be unique to one tag",
                "It cannot include numbers",
                "It must go in the closing tag",
                "It must be unique to one tag",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following is the proper way to call the testFunction() function when a button is clicked?",
                "onclick=testFunction",
                "when button clicked = \"testFunction()\"",
                "onclick=\"testFunction()\"",
                "onclick=\"testFunction\"",
                "onclick=\"testFunction()\"",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "DOM get element by id is?",
                "Document.Getelementbyid()",
                "document.getElementById()",
                "Document.getElementByID()",
                "DOM.getElmentById()",
                "document.getElementById()",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What is output once the button is pressed?\n" +
                        "<button onclick=\"aFunction()\"> Click me </button>",
                "aFunction() is called and its code get executed",
                "Click me is displayed",
                "EventError",
                "None of these",
                "aFunction() is called and its code get executed",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What do \"purple\", \"green\" in this code refer to?\n" +
                        "var x1= document.getElementById(\"purple\")" +
                        "\n" +
                        "var x2= document.getElementById(\"green\")",
                "They are the names of the HTML",
                "They are the names of <h1> tags",
                "They are the names of <p> tags",
                "They are the IDs",
                "They are the IDs",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "How can a developer show a pop-up window input box that the user can type in?",
                "alert",
                "prompt",
                "console.log",
                "document.getElementById",
                "prompt",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Fill in the blank: \"The DOM is a structured representation of a ________ document\"",
                "JavaScript",
                "HTML",
                "CSS",
                "JSON",
                "HTML",
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
                "Which object in JavaScript can we use to access and modify the DOM?",
                "document",
                "dom",
                "model",
                "html",
                "document",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Can we change the contents of the HTML document using the DOM?",
                "Yes",
                "No",
                "Only when having the correct security rights",
                "Only in runtime i.e. the changes get lost when refreshing the page",
                "Only in runtime i.e. the changes get lost when refreshing the page",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Fill in the blank: \"The ______ node sits at the root of the DOM tree?",
                "top",
                "first",
                "html",
                "document",
                "document",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Consider the following HTML element:" +
                        "\n" +
                        "<p id=\"p_id\" class=\"p_class\" name=\"p_name\"></p>" +
                        "\n" +
                        "Which one of the following is correct syntax to select it using the DOM?",
                "html.getElementById(p_id)",
                "dom.getElementById(\"p_id\")",
                "document.getElementById(\"p_id\")",
                "document.getElementById(p_id)",
                "document.getElementById(\"p_id\")",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Consider the following HTML element:" +
                        "\n" +
                        "<p id=\"p_id\" class=\"p_class\" name=\"p_name\"></p>" +
                        "\n" +
                        "Which one of the following is correct syntax to select it using the DOM? NOTE: This is the only child to the <body> tag!",
                "document.getElementsByClassName(\"p_class\")",
                "document.getElementsByClassName(p_class)",
                "document.getFirstElementByClassName(\"p_class\")",
                "document.getElementsByClassName(\"p_class\")[0]",
                "document.getElementsByClassName(\"p_class\")[0]",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Consider the following HTML element:" +
                        "\n" +
                        "<p id=\"p_id\" class=\"p_class\" name=\"p_name\"></p>" +
                        "\n" +
                        "Which one of the following is correct syntax to select it using the DOM? NOTE: This is the only child to the <body> tag!",
                "document.getElementsByTagName(p_name)[0]",
                "document.getElementsByTagName(\"p\")",
                "document.getElementByName(\"p_name\")",
                "document.getElementsByTagName(\"p_name\")[0]",
                "document.getElementsByTagName(\"p\")",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Consider the following HTML element:" +
                        "\n" +
                        "<p id=\"p_id\" class=\"p_class\" name=\"p_name\"></p>" +
                        "\n" +
                        "Which one of the following is correct syntax to select it using the DOM? NOTE: This is the only child to the <body> tag!",
                "document.querySelector(\".p_class\")",
                "document.querySelectorAll(\"#p_id\")",
                "document.querySelector(\"p_class\")",
                "document.querySelector(\"#p_name\")",
                "document.querySelector(\".p_class\")",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which property do we use to change the text of an element?",
                "text",
                "innerText",
                "content",
                "value",
                "innerText",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The location object does not include:",
                "href",
                "reload",
                "replace",
                "open",
                "open",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Assess the truth of the statement:" +
                        "\n" +
                        "\"The history object is a child of the document object\"",
                "true",
                "false",
                "falsehood",
                "none of these",
                "falsehood",
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
                "To refresh the current document, use:",
                "document.open()",
                "document.reload()",
                "location.reload()",
                "location.open()",
                "location.reload()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "The appName property belongs to the object:",
                "document",
                "window",
                "location",
                "navigator",
                "navigator",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Assess the truth of the statement:" +
                        "\n" +
                        "\"The location.href property contains the same address as the document.url property\"",
                "true",
                "false",
                "falsehood",
                "none of these",
                "true",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The history object property is:",
                "forward",
                "go",
                "length",
                "back",
                "length",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "The host name for the current document is stored by:",
                "document.hostname",
                "location.hostname",
                "window.hostname",
                "url.hostname",
                "location.hostname",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Assess the truth of the statement:" +
                        "\n" +
                        "\"location.lastModified returns the date the page was last modified\"",
                "true",
                "false",
                "falsehood",
                "none of these",
                "falsehood",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "A reference to a collection of paragraphs in an HTML document can be:",
                "document.getElementById(\"p\")",
                "document.getElementByTagName(p)",
                "document.getElementByTagName(\"akapit\")\n",
                "document.getElementById(\"akapit\")",
                "document.getElementByTagName(p)",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Assess the correctness of the statement:" +
                        "\n" +
                        "\"The innerHTML property can only be used together with the getElementById () method\"",
                "true",
                "false",
                "falsehood",
                "none of these",
                "true",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "DOM stands for...",
                "Document Object Model",
                "Digital Object Model",
                "Documents Object Model",
                "Digital Optical Module",
                "Document Object Model",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Writing javascript code in an html file using the tag ...",
                "<javascript>",
                "<js>",
                "<java>",
                "<script>",
                "<script>",
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
                "The document related event is:",
                "onSelect",
                "onBlur",
                "onLoad",
                "onChange",
                "onLoad",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Not one of the events generated by form items",
                "onFocus",
                "onSelect",
                "onBlur",
                "onSubmit",
                "onSubmit",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "A fragment of html code is given, creating the form:" +
                        "\n" +
                        "<form id=\"f1\" name=\"form1\" method=\" \" actions=\" \">" +
                        "\n" +
                        "..." +
                        "\n" +
                        "</form>" +
                        "\n" +
                        "Please indicate an incorrect way to refer to this form. Assume that this is the only form on the page!",
                "document.forms[0]",
                "document.getElementById('form1')",
                "document.form1",
                "document.getElementById('f1')",
                "document.getElementById('form1')",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Document.forms.length specifies:",
                "number of fields in the active form",
                "number of characters stored in the forms field",
                "Number of forms in the document",
                "number of fields in the form named forms",
                "Number of forms in the document",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following methods returns an array of all the elements in a Webpage, with a specified class name?",
                "getElementsByName",
                "getElementsByTagName",
                "get Elements ByClassName",
                "get Element ByClassTagName",
                "get Elements ByClassName",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which method allows you to delete entire HTML attributes from an element?",
                "getElementById",
                "setAttribute",
                "innerHTML",
                "removeAttribute",
                "removeAttribute",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which method retrieves the corresponding value of an attribute?",
                "getAttribute",
                "setAttribute",
                "removeAttribute",
                "innerHTML",
                "getAttribute",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which property of the form object returns the number of elements in the form?",
                "target",
                "encoding",
                "elements",
                "length",
                "length",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which function among the following lets to register a function to be invoked once?",
                "setTimeout()",
                "setTotaltime ()",
                "setInterval()",
                "settime()",
                "setTimeout()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How is everything treated in HTML DOM?",
                "Attributes",
                "Elements",
                "Arrays",
                "Node",
                "Node",
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
                "Is the following code a valid way to create a regular expression?\n" +
                        "var newRegExp = /\\d/;",
                "No",
                "Yes",
                "Not right",
                "None of these",
                "Yes",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "We have a choice of 3 flags to use with regular expressions and all are mutually exclusive?",
                "False",
                "True",
                "None",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What symbol do we use to escape special characters when using the RegExp constructor?",
                "<",
                "$",
                "\\",
                "~",
                "\\",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What statement is used to pass a value back from a function?",
                "bind",
                "call",
                "return",
                "terminate",
                "return",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What method can we use for function chaining?",
                "apply()",
                "call()",
                "Neither of the above methods",
                "Both of the above methods",
                "Both of the above methods",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which is the least efficient way to create a function?",
                "Using the Function constructor",
                "Using the function special operator",
                "Using the function statement",
                "Using the function parameter",
                "Using the Function constructor",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "One advantage of using JSON is that code is more compact, what's another advantage?",
                "Easier to code",
                "Self documenting",
                "Code runs faster",
                "Visually more informative of object structure",
                "Visually more informative of object structure",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "When using the JSON style of coding what symbols do we use to mark object boundaries?",
                "''",
                "[]",
                "{}",
                "##",
                "{}",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What does the acronym JSON stand for?",
                "JavaScript Order Nodes",
                "JavaScript Object Nodes",
                "JavaScript Order Notation",
                "JavaScript Object Notation",
                "JavaScript Object Notation",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Care should be taken when using the IsNaN() function as results can be unexpected.?",
                "False",
                "True",
                "None",
                "None of these",
                "True",
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
                "What is the parseFloat() function used for?",
                "To convert a decimal to a string",
                "To convert an integer to a string",
                "To convert a string to a decimal",
                "To convert a string to an integer",
                "To convert a string to a decimal",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What happens when we try to create an array without passing any arguments?",
                "A RangeError exception is thrown",
                "An empty array is created",
                "An Error exception is thrown",
                "An array is created with a length of 1",
                "An empty array is created",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "When we create an array with one argument and the argument is not a number what happens?",
                "A RangeError exception is thrown",
                "An empty array is created with a length of 1 with undefined as the first elements value",
                "An Error exception is thrown",
                "An array is created with a length of 1 with the argument as the first elements value",
                "An array is created with a length of 1 with the argument as the first elements value",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "On array creation when one argument is passed and it is a number between 0 and 4,294,967,295 an array is created with that length. What happens when a number outside these parameters is passed?",
                "A RangeError exception is thrown",
                "An empty array is created",
                "An Error exception is thrown",
                "An array is created with a length of 1",
                "A RangeError exception is thrown",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "When creating an array using array literal syntax what symbols are used?",
                "{}",
                "()",
                "[]",
                "**",
                "[]",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Date creation using the milliseconds parameter starts from which date.?",
                "1 January 0000 00:00:00",
                "1 January 1970 00:00:00",
                "1 January 2000 00:00:00",
                "The current date and time",
                "1 January 1970 00:00:00",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Date creation using the milliseconds parameter can use negative as well as positive values?",
                "False",
                "True",
                "None",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Is the following code a valid way of creating a Date object?\n" +
                        "var aDate = new Date(Jan 1, 2022);",
                "No",
                "Yes",
                "Not right",
                "None of these",
                "Yes",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "We must always use an else with an if statement?",
                "False",
                "True",
                "None",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is output from the following conditional statement?\n" +
                        "var aVariable = false;\n" +
                        "if (aVariable = true) {\n" +
                        "alert('true');\n" +
                        "} else {\n" +
                        "alert('false');\n" +
                        "}",
                "False",
                "True",
                "None",
                "None of these",
                "True",
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
                "We can have an if statement with multiple if....else statements within it?",
                "False",
                "True",
                "None",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of these loop statements will always execute at least once?",
                "do....while",
                "while",
                "Neither",
                "Both",
                "do....while",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which statement allows us to exit a loop?",
                "break",
                "continue",
                "exit",
                "return",
                "break",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which statement allows us to carry on from the expression part of a loop?",
                "break",
                "continue",
                "exit",
                "return",
                "continue",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What would happen if we tried to run the following for loop code?\n" +
                        "for (;;) {\n" +
                        "alert('In loop');\n" +
                        "}",
                "The code throws an error",
                "The for loop code loops endlessly",
                "Nothing happens as the loop is never entered",
                "The for loop code alerts once and ends",
                "The for loop code loops endlessly",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How many times will the following for loop execute?\n" +
                        "for (var i=0; i<3; i++) {\n" +
                        "alert('The i variable is = ' + i);\n" +
                        "}",
                "0",
                "1",
                "2",
                "3",
                "3",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "We can use break statements within our for loops?",
                "False",
                "True",
                "None",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is generally returned from functions when a numerical value can't be derived or is unobtainable?",
                "Error",
                "isNaN",
                "NaN",
                "null",
                "NaN",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is alerted from the following code?\n" +
                        "nanResult = NaN == NaN;\n" +
                        "alert(nanResult);",
                "0",
                "false",
                "1",
                "true",
                "false",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What's the output?\n" +
                        "let person = { name:\"Anne\"};\n" +
                        "const members = [person];\n" +
                        "person = null;\n" +
                        "console.log(members);",
                "null",
                "[null]",
                "[{}]",
                "[{name: \"Anne\"}]",
                "[{name: \"Anne\"}]",
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
                "Number(\"1\")-1==0;\n" +
                        "What is the result?",
                "False",
                "True",
                "None",
                "AssertionError",
                "True",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "new Array(5).toString();\n" +
                        "What is the result?",
                "[]",
                "\"[]\"",
                "\"{}\"",
                "\",,,,\"",
                "\",,,,\"",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "var x = 3;\n" +
                        "var foo = {\n" +
                        "x:2,\n" +
                        "baz: {\n" +
                        "x:1,\n" +
                        "bar:function(){\n" +
                        "return this.x;\n" +
                        "}\n" +
                        "}\n" +
                        "}\n" +
                        "\n\n" +
                        "var go = foo.baz.bar;\n" +
                        "alert(go());\n" +
                        "alert(foo.baz.bar());\n" +
                        "What is the order of values alerted?",
                "1,2",
                "2,1",
                "2,2",
                "3,1",
                "3,1",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "function aaa(){\n" +
                        "return\n" +
                        "{\n" +
                        "test:1};" +
                        "}\n" +
                        "alert(typeof aaa());\n" +
                        "What does the above alert?",
                "function",
                "array",
                "undefined",
                "none of these",
                "undefined",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "var foo = function foo(){\n" +
                        "   console.log(foo===foo);\n" +
                        "};\n" +
                        "foo();\n" +
                        "What is printed in the console?",
                "False",
                "True",
                "None",
                "AssertionError",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "\"1\"--\"1\"\n" +
                        "What is the result?",
                "11",
                "\"11\"",
                "2",
                "0",
                "2",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "new string(\"This is a string\") instanceof String;\n" +
                        "What is the result?",
                "TypeError",
                "False",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "(true+false)>2+true;\n" +
                        "What is the result?",
                "TypeError",
                "False",
                "True",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "String('Hello')=== 'Hello';\n" +
                        "What is the result?",
                "TypeError",
                "False",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "function bar(){\n" +
                        "   return foo;\n" +
                        "   foo=10;\n" +
                        "   function foo(){\n" +
                        "       var foo = '11';\n" +
                        "       }\n" +
                        "alert(typeof bar());\n" +
                        "What is alerted?",
                "undefined",
                "false",
                "function",
                "none",
                "function",
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
                "let string = \"foo\"\n" +
                        "How to determine the length of the string?",
                "string.length",
                "string.add",
                "length",
                "string.lengths",
                "string.length",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "let string = \"The cat is black\"\n" +
                        "How to find the index/position of \"cat\" in the string",
                "string.indexOf(0)",
                "string.indexOf(1)",
                "Both",
                "string.indexOf(\"cat\")",
                "string.indexOf(\"cat\")",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of these lines of JS code properly store a string?",
                "var myName = 'Fox\";",
                "var myName = Fox;",
                "var myName = 'Fox';",
                "var myName = \"Fox';",
                "var myName = 'Fox';",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What operator do you use to combine strings together?",
                "++",
                "&",
                "&&",
                "+",
                "+",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of these lines of code display a string and have no errors?",
                "text(Heya, 10, 20);",
                "text(\"Heya\", 10, 20);",
                "text(\"Heya, 10, 20\");",
                "text(\"Heya, 10, 20);",
                "text(\"Heya\", 10, 20);",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What function do you call to change the size of text in your program?",
                "textSize();",
                "fontSize();",
                "textHeight();",
                "textWidth();",
                "textSize();",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What function can you call to change the font used by text in your program?",
                "fontFamily();",
                "textFont();",
                "changeFont();",
                "textFamily();",
                "textFont();",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is/are strings?",
                "4",
                "4.0",
                "'4'",
                "None of these",
                "'4'",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is the result of 80 + 71.2?",
                "151.2",
                "151",
                "8071.2",
                "545",
                "151.2",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is the result of \"80\" + 71.2?",
                "151.2",
                "151",
                "\"8071.2\"",
                "545",
                "\"8071.2\"",
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
                "Does 100 + 30 produce a number or a string?",
                "string",
                "number",
                "both",
                "none of these",
                "number",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following JavaScript statements use arrays?",
                "k = a(i)",
                "k = a >> i",
                "k = a[i]",
                "k = a & i",
                "k = a[i]",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following JavaScript statements are correct definitions of an array?",
                "var a = new Array[100]",
                "var a = new Array(100)",
                "var[] a = new String[100]",
                "a = new Array[100]",
                "var a = new Array(100)",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The JavaScript statement a = new Array(2,4)",
                "defines a new two-dimensional array a whose dimensions are 2 and 4.",
                "defines an array a and assigns the values 2 and 4 to a[1] and a[2]",
                "defines an array a and assigns the values 2 and 4 to a[0] and a[1].",
                "defines two four-element arrays",
                "defines an array a and assigns the values 2 and 4 to a[0] and a[1].",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Consider the following sequence of JavaScript statements:\n" +
                        "a = new Array();\n" +
                        "a[0] = 12;\n" +
                        "a[1] = false;\n" +
                        "a[2] = \"text\";\n" +
                        "a[3] = a;\n" +
                        "Which line in this code will cause an error?",
                "Line 3",
                "Line 4",
                "Line 5",
                "This code will execute without errors",
                "This code will execute without errors",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "After executing the JavaScript statement a=(new Array(10)).toString(), what's the value of a?",
                "null",
                "string \"10\"",
                "array of 10 empty strings",
                "string \",,,,,,,,,\"",
                "string \",,,,,,,,,\"",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Consider the following JavaScript code:\n" +
                        "a = new Array();\n" +
                        "b = new Array();\n" +
                        "a[1] = 3;\n" +
                        "b[2] = 5;\n" +
                        "a = b;\n" +
                        "Which values are contained in a[1] and a[2] after this code executes?",
                "a[1] is 3 and a[2] is 5",
                "a[1] is undefined and a[2] is 5",
                "both a[1] and a[2] are undefined",
                "This code will cause an error.",
                "a[1] is undefined and a[2] is 5",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following browsers support the sort() method for arrays?",
                "Netscape Navigator 2.0",
                "Microsoft Internet Explorer 3.0",
                "Netscape Navigator 4.0",
                "Firefox Navigator 4.0",
                "Netscape Navigator 4.0",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "After executing the JavaScript statement\n" +
                        "a=(new Array(\"test\",1,2,3,-1,-2,-3,0xFFFFF)).sort()\n" +
                        "what's the order of elements in the array a?\n" +
                        "(Hint: 0xFFFFF equals 1048575.)",
                "-1,-2,-3,1,1048575,2,3,\"test\"",
                "-1,-2,-3,1,2,3,1048575,\"test\"",
                "\"test\",-1,-2,-3,1,2,3,1048575",
                "-3,-2,-1,1,2,3,1048575,\"test\"",
                "-1,-2,-3,1,1048575,2,3,\"test\"",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Consider the following code:\n" +
                        "a = new Array(1,2,3);\n" +
                        "for (i in a) alert(\"a[i]=\"+a[i]);\n" +
                        "How many times will the alert box appear?",
                "3 times (one alert per element)",
                "4 times (one alert per element, plus an additional alert for the array's a.length property)",
                "either 3 or 4 times, depending on the browser",
                "This for...in loop will cause an error.",
                "either 3 or 4 times, depending on the browser",
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
                "Consider the following code:\n" +
                        "function myAdder(arr) {arr[1]++;arr=arr+arr}\n" +
                        "a = new Array(1,3,2,5);\n" +
                        "myAdder(a);\n" +
                        "What's the value of a after this code executes?",
                "a remains the original array 1,3,2,5",
                "a contains the array 1,4,2,5",
                "a becomes an 8-element array: 1,4,2,5,1,4,2,5",
                "a contains the string \"1,4,2,5,1,4,2,5\"",
                "a contains the array 1,4,2,5",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of these contains an executable statement?",
                "// var x = 10; // var y = 0;",
                "/* var x = 10; // var y = 0; */.",
                "/* var x = 10; */ var y = 0;",
                "// var x = 10; /* var y = 0; */",
                "/* var x = 10; */ var y = 0;",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Assume that a function myfunction is defined at some place . Which of the following is NOT a valid function call?",
                "var z = myfunction();",
                "myfunction;",
                "z = myfunction();",
                "myfunction();",
                "myfunction;",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Assume that value of A is 10 and value of B is 15. Which of the following returns a true value in if statement.",
                "if A not = B",
                "if A != B",
                "if (A not = B)",
                "if (A != B)",
                "if (A != B)",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following is not a builtin Javascript object?",
                "Time",
                "Array",
                "Date",
                "Math",
                "Time",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What command skips the rest of a case statement?",
                "return",
                "exit",
                "continue",
                "break",
                "break",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "How many parameters can be passed to one function?",
                "none",
                "as many as you like",
                "one for each argument",
                "one",
                "one for each argument",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Consider the following code for switch loop\n" +
                        "case 10:\n" +
                        "case 12:\n" +
                        "What will run next if the value is 10?",
                "the code following the case 12:",
                "the code following default:",
                "the code after the end of the switch",
                "this is a coding error",
                "the code following the case 12:",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What does ++ do?",
                "Adds two numbers together",
                "Joins two text strings together",
                "Adds 1 to a number",
                "Adds 2 to a number",
                "Adds 1 to a number",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is correct about a method.",
                "A method is the object oriented version of a function",
                "A method is the object oriented version ofa variable",
                "A method is the object oriented version ofa sequence",
                "A method is the object oriented version ofa program",
                "A method is the object oriented version of a function",
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
                "var a= 'Z'; var b = 32; a = b; Variable 'a' now contains?",
                "text",
                "a number",
                "true",
                "it is not possible to tell",
                "a number",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following JavaScript statements use arrays?",
                "x = a(i)",
                "x = a[i]",
                "x = a >> i",
                "x = a & i",
                "x = a[i]",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following JavaScript statements is NOT a correct definitions of an array?",
                "var a = new Array(100)",
                "var a = new Array[100]",
                "a = new Array(100)",
                "a = new Array(1,2,3,4)",
                "var a = new Array[100]",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The JavaScript statement x = new Array(2,3)",
                "defines a new two-dimensional array a whose dimensions are 2 and 3",
                "defines an array a with two elements with a[1]=2 and a[2]=3;",
                "defines an array a with two elements with a[0]=2 and a[1]=3",
                "It is an incorrect way of defining an array",
                "defines an array a with two elements with a[0]=2 and a[1]=3",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Consider the following JavaScript code:\n" +
                        "x = new Array();\n" +
                        "y = new Array();\n" +
                        "x[1] = 3;\n" +
                        "y[2] = 5;\n" +
                        "x = y;\n" +
                        "Which values are contained in x[1] and x[2] after this code executes?",
                "x[1] is 3 and x[2] is 5",
                "x[1] is undefined and x[2] is 5",
                "both x[1] and x[2] are undefined",
                "This code will cause an error",
                "x[1] is undefined and x[2] is 5",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Consider the following javascript code\n" +
                        "function myAdder(arr) {arr[1]++}\n" +
                        " a = new Array(1,3,2,5);" +
                        "\n" +
                        " myAdder(a);" +
                        "\n" +
                        "document.writeln(a);" +
                        "\n" +
                        "What is the output of the code.",
                "1,3,2,5",
                "1,4,2,5",
                "The code has error",
                "2,3,2,5",
                "1,4,2,5",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Consider the following\n" +
                        "var  a = new Array(12,false,\"text\");\n" +
                        "x=10;\n" +
                        "if (a[1]) x = 20;\n" +
                        "else x = 30;\n" +
                        "What is the value of x at the end of the execution",
                "10",
                "20",
                "30",
                "The code has error",
                "30",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Consider the initialization of the two dimensional array\n" +
                        "var iMax = 20;\n" +
                        "var jMax = 10;\n" +
                        "var f = new Array();" +
                        "\n" +
                        "for (i=0;i<iMax;i++) {\n" +
                        " f[i]=new Array();\n" +
                        " for (j=0;j<jMax;j++) {\n" +
                        "  f[i][j]=0;\n" +
                        " }\n" +
                        "}\n" +
                        "What is the value of f.length ?",
                "10",
                "20",
                "200",
                "The code has error",
                "20",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "How many buttons are there in an alert box?",
                "one",
                "two",
                "three",
                "four",
                "one",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following is not a mouse event?",
                "onmousescroller",
                "onclick",
                "onmouseover",
                "onmousemove",
                "onmousescroller",
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
                "Which of the following is not an event that can trigger a Javascript?",
                "mouse actions",
                "operating system actions",
                "keyboard actions",
                "timed actions",
                "timed actions",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which event is triggered if the browser window is resized ?",
                "onload",
                "onscroll",
                "onresize",
                "onnewsize",
                "onresize",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which event is triggered when a field loses the focus ?",
                "onmouseout",
                "onblur",
                "onunfocus",
                "onkeyup",
                "onblur",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "You define a method using ?",
                "obj.method",
                "obj.method[]",
                "obj.method()",
                "obj-method",
                "obj.method()",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of these statements is true ?",
                "arguments are parameters",
                "arguments and parameters must have the same name",
                "arguments are placeholders",
                "arguments are disagreements between parameters",
                "arguments are placeholders",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is NOT a valid Alert call?",
                "alert('A');",
                "alert(a);",
                "alert(a+b);",
                "alert(#);",
                "alert(#);",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which event tests if a form field has changed?",
                "onsubmit",
                "onblur",
                "onchange",
                "onclick",
                "onchange",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "When can you not trigger Javascript from an event handler ?",
                "when another event is still being processed",
                "when Javascript is disabled",
                "when the page uses stylesheets",
                "when it is running locally instead of on the web",
                "when Javascript is disabled",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is / are valid statement(s) to declare an array?\n" +
                        "A. const arr = [2, 4, 6];" +
                        "\n" +
                        "B. const arr = new Array(2, 4, 6);" +
                        "\n" +
                        "C. const arr = Array(2, 4, 6);",
                "A and B",
                "Only A",
                "B and C",
                "A, B and C",
                "A, B and C",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is the output?\n" +
                        "const arr = [2, , , 4];\n" +
                        "console.log(arr.length);",
                "5",
                "4",
                "2",
                "SyntaxError: Invalid operator ,",
                "4",
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
                "What is the output?\n" +
                        "const arr = Array(3);\n" +
                        "console.log(arr);",
                "undefined",
                "[3]",
                "[undefined, undefined, undefined]",
                "None of these",
                "[undefined, undefined, undefined]",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the output?\n" +
                        "const arr = [\"Mercedes\", \"BMW\", \"Porsche\"];\n" +
                        "console.log(arr[1000]);",
                "undefined",
                "ReferenceError: Array out of bound exception",
                "null",
                "\"\"",
                "undefined",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "In what all ways, we can check if a variable arr contains an array in JavaScript?\n" +
                        "A. Array.isArray(arr) === true" +
                        "\n" +
                        "B. arr.constructor.name === \"Array\"" +
                        "\n" +
                        "C. typeof arr === \"Array\"",
                "Only A",
                "A and B",
                "B and C",
                "A, B and C",
                "A and B",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What is the output?\n" +
                        "const arr1 = [1, 3, 5];\n" +
                        "const arr2 = [2, 4, 6];\n" +
                        "arr1.concat(arr2);\n" +
                        "console.log(arr1);",
                "[1, 2, 3, 4, 5, 6]",
                "[2, 4, 6]",
                "[1, 3, 5, 2, 4, 6]",
                "[1, 3, 5]",
                "[1, 3, 5]",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the output?\n" +
                        "const arr = [2, 4, 6];\n" +
                        "const result = arr.every((ele) => ele * 2);\n" +
                        "console.log(result);",
                "true",
                "[4, 8, 12]",
                "false",
                "[2, 4, 6]",
                "true",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of these for loops would iterate through each item of the nums array (no more, no less)?",
                "for (var i = 0; i < nums; i++) { }",
                "for (var i = 1; i < nums.length; i++) { }",
                "for (var i = 1; i < nums; i++) { }",
                "for (var i = 0; i < nums.length; i++) { }",
                "for (var i = 0; i < nums.length; i++) { }",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "In JavaScript, an array can be created using the:",
                "Array() constructor",
                "[] literals",
                "Both of the above",
                "None of these",
                "Both of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What would arr.indexOf(0) and arr.indexOf(1) return respectively, if arr holds the array [1, 5, 8]?",
                "1 and -1",
                "-1 and 1",
                "-1 and 0",
                "1 and 5",
                "-1 and 0",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "For a given array arr, the expressions arr[0] and arr.shift() both do the same thing. True or false?",
                "True",
                "False, arr[0] only returns whereas arr.shift() removes the first element",
                "False, arr[0] only returns whereas arr.shift() returns and removes first element",
                "None of these",
                "False, arr[0] only returns whereas arr.shift() returns and removes first element",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following code snippets logs a sparse array?\n" +
                        "Snippet 1:" +
                        "\n" +
                        "var nums = [1, 2, 3];\n" +
                        "delete nums[0];" +
                        "\n" +
                        "console.log(nums);\n" +
                        "Snippet 2:" +
                        "\n" +
                        "var nums = [1, 2, 3];\n" +
                        "nums.shift();" +
                        "\n" +
                        "console.log(nums);",
                "Snippet 1",
                "Snippet 2",
                "Both of the above",
                "None of the above",
                "Snippet 1",
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
                "Which  of the following is not the property of XMLHttp Object?",
                "onreadystatechange",
                "readystatechange",
                "status",
                "None of them.",
                "None of them.",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is the correct syntax for creating a  XMLHttpRequest Object?",
                "var xhr = new XMLHttpRequest();",
                "xhr = new XMLHttpRequest();",
                "var xhr = XMLHttpRequest();",
                "None of them.",
                "var xhr = new XMLHttpRequest();",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "_______________ is an API used for accessing & manipulating structured documents .",
                "SOAP",
                "DOM",
                "Json",
                "Rest",
                "DOM",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "_______________ is a java script object that performs asynchronous interaction with the server.",
                "XMLHttpRequest",
                "XMLHttp",
                "XMLHttpResponse",
                "None of them.",
                "XMLHttpRequest",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "_______________ holds the status of the XMLHttpRequest.",
                "status XMLHttp",
                "Request Object",
                "onreadystatechange",
                "readystate",
                "readystate",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "_______________ method specifies the type of the request.",
                "send",
                "connect",
                "open",
                "None of them.",
                "open",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "The word AJAX stands for _________________.",
                "Application of Java Script AND XML.",
                "Asynchronous Java Script AND XML.",
                "Application of Java AND X++.",
                "None of them.",
                "Asynchronous Java Script AND XML.",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following property of  a XMLHttp Object  is used to get the response data as a XML?",
                "receiveXML",
                "response Data",
                "response XML",
                "None of them.",
                "response XML",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "_______________ is  being called as a result of an event.",
                "Java Script function.",
                "XMLHttpResponse function.",
                "XMLHttpRequest function.",
                "None of them.",
                "Java Script function.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following methods are being used to send a request to the server?",
                "open( ) & connect( )",
                "open( )",
                "open( ) & established( )",
                "None of them.",
                "open( )",
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
                "Which of the following  is  the first step of an AJAX operation?",
                "HTML DOM is being updated.",
                "A client event occurs.",
                "XMLHttpRequest Object is created.",
                "None of them.",
                "A client event occurs.",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How many total  steps are there in an AJAX operation?",
                "3",
                "6",
                "7",
                "2",
                "7",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following  statement is correct about AJAX?",
                "Ajax is based on some internet standards.",
                "It is used for creating fast & dynamic web pages.",
                "It is used for dynamically updating the parts of the webpage without reloading the web page.",
                "All of them.",
                "All of them.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The word DOM stands for _________________.",
                "Dynamic Object Model.",
                "Dynamic Object Module.",
                "Document Object Model.",
                "None of them.",
                "None of them.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "_______________ event is triggered every time the ready state changes.",
                "start",
                "XMLHttpRequest",
                "readystatechange",
                "onreadystatechange",
                "onreadystatechange",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "By using AJAX,  web application can send",
                "As a stream",
                "Asynchronously",
                "Synchronously",
                "All of these.",
                "Asynchronously",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following property of  a XMLHttp Object  is used to get the response data as a String?",
                "response String",
                "response XML",
                "response Text",
                "response Data",
                "response Text",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following  is  the last step of an AJAX operation?",
                "XMLHttpRequest Object is created.",
                "Web Server returns the XML which contains the result.",
                "A client event occurs.",
                "HTML DOM is being updated.",
                "HTML DOM is being updated.",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following code snippet is representing that request is finished & status is ok?",
                "if(this.readyState ==3 && this.status == 200){ }",
                "if(this.readyState ==2 && this.status == 200){ }",
                "if(this.readyState ==4 && this.status == 200){ }",
                "if(this.readyState ==4 && this.status == 404){ }",
                "if(this.readyState ==4 && this.status == 200){ }",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following code snippet is representing that  server connection is established & status is ok?",
                "if(this.readyState ==4 && this.status == 200){ }",
                "if(this.readyState ==2 && this.status == 200){ }",
                "if(this.readyState ==3 && this.status == 200){ }",
                "if(this.readyState ==1 && this.status == 200){ }",
                "if(this.readyState ==1 && this.status == 200){ }",
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
                "Ajax initial release date ?",
                "2001",
                "2003",
                "2005",
                "2007",
                "2005",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is full form of Ajax?",
                "Asynchronous JavaScript And XML",
                "Asynchronous jQuery And XML",
                "Asynchronous JavaScript And XHTML",
                "None of these",
                "Asynchronous JavaScript And XML",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "In AJAX you can ?",
                "Update a web page without reloading the page",
                "Receive data from a server - after the page has loaded",
                "Send data to a server - in the background",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Implementing AJAX in our websites we can make our web pages ________ ?",
                "More Dynamic",
                "More interactive and faster",
                "More Responsive",
                "Easy to connect web page with server",
                "More interactive and faster",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the name of object used for AJAX request?",
                "XMLHttpRequest",
                "XMLHttp",
                "HttpRequest",
                "Request",
                "Request",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Ajax is a…",
                "Programing Language",
                "OOPs concepts",
                "Technology",
                "B and C",
                "Technology",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Ajax based on ?",
                "JavaScript and XML",
                "VB Script and XML",
                "JavaScript and jQuery",
                "Javascript and HTTP requests",
                "JavaScript and XML",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "AJAX allows web page to dynamically",
                "Change content",
                "Reload at times",
                "Control other pages",
                "Connect to other addresses",
                "Change content",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What server support AJAX?",
                "SMTP",
                "HTTP",
                "WWW",
                "All of the above",
                "HTTP",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which one of these technologies is NOT used in AJAX?",
                "CSS",
                "DOM",
                "DHTML",
                "Flash",
                "Flash",
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
                "Which Web browser is the least optimized for Microsoft's version of AJAX?",
                "Firefox",
                "Opera",
                "Safari",
                "Internet Explorer",
                "Safari",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What makes Ajax unique?",
                "It works as a stand-alone Web-development tool.",
                "It works the same with all Web browsers.",
                "It makes data requests asynchronously.",
                "It uses C++ as its programming language.",
                "It makes data requests asynchronously.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "_____ Of the following technologies, which one provides the ability to dynamically interact with Web page layout?",
                "XML",
                "HTML",
                "JavaScript",
                "Document Object Model",
                "Document Object Model",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The XMLHttpRequest object can be disabled via browser settings",
                "True",
                "False",
                "Error",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "AJAX made popular by______",
                "Microsoft",
                "Google",
                "IBM",
                "Sun Microsystems",
                "Google",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "With Ajax, which of these is no longer required for data manipulation?",
                "XML",
                "XSLT",
                "JASON",
                "HTML",
                "XSLT",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Select invalid type of trigger",
                "PostBackTrigger",
                "SyncPostBackTrigger",
                "AsyncPostBackTrigger",
                "None of the above",
                "SyncPostBackTrigger",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Google made a deployment of AJAX cross browser technology with Gmail in",
                "2003",
                "2009",
                "2004",
                "2007",
                "2004",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Google made a deployment of cross browser technology with GoogleMaps in",
                "2005",
                "2009",
                "2004",
                "2007",
                "2005",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Select an invalid control",
                "Timer",
                "Control",
                "UpdatePanel",
                "ScriptManagerProxy",
                "Control",
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
                "From the following which is/are not AJAX framework ?",
                "Google Web Toolkit",
                "Dojo Toolkit",
                "MooTools",
                "Foundation",
                "Foundation",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Using the AJAX, web applications can receive and send date asynchronously from a____",
                "Database",
                "Server",
                "Control",
                "Store",
                "Store",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the name of the DLL that contains Ajax control tool kit?",
                "Ajaxtoolkit.dll",
                "Ajaxcontrol.dll",
                "Ajaxcontroltoolkit.dll",
                "control.dll",
                "Ajaxcontroltoolkit.dll",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which property is used to control the duration of Ajax request.",
                "AsyncPostBackTimeout",
                "AsyncTimeout",
                "Timeout",
                "PostBackTimeout",
                "AsyncPostBackTimeout",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which one of these legendary greek mythical figures or places is the code name for Microsoft's version of Ajax?",
                "Delphi",
                "Oracle",
                "Atlas",
                "Hercules",
                "Atlas",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How can you test the Ajax code?",
                "JSU",
                "JSUnit",
                "AjaxJSU",
                "JSUnitAjax",
                "JSUnit",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "From the following what is/are the technologies used by AJAX ?",
                "HTML/XHTML and CSS",
                "DOM and XML",
                "XMLHttpRequest and JavaScript",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How can we cancel the XMLHttpRequest in AJAX?",
                "cancel()",
                "Abort()",
                "remove()",
                "none",
                "Abort()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which manager are use for pre-requisite Update Panel in Ajax.",
                "Ajax Manager",
                "Javascript Manager",
                "Options A & B",
                "Script Manager",
                "Script Manager",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which data types JSON does NOT supports?",
                "ENUM",
                "String",
                "Object",
                "Boolean",
                "ENUM",
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
                "The jQuery AJAX methods .get(), .post(), and .ajax() all require which parameter to be supplied?",
                "method",
                "url",
                "data",
                "headers",
                "url",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is not a restriction of JSON as a data interchange format relative to a plain object definition in JavaScript?",
                "Property names must be quoted.",
                "Single quotes may not be used as string delimiters.",
                "Properties may not include functions or expressions.",
                "Properties may only be objects, not arrays.",
                "Properties may only be objects, not arrays.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which statement about XML is false?",
                "Every XML document must have a DOCTYPE tag.",
                "Every XML document must have a root element.",
                "Every XML tag must have a closing tag.",
                "Every XML document must start with an XML prolog.",
                "Every XML document must have a DOCTYPE tag.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "If a condition has two choices, namely true and false, then the syntax used is ...",
                "IF",
                "IF ... ELSE",
                "IF - IF .. ELSE - ELSE",
                "SWITCH",
                "IF ... ELSE",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "PHP is a server-side programming, where the code will be executed on the server side. The following which one can act as a server on a local computer ...",
                "XAMPP",
                "HTDOCS",
                "APACHE",
                "MYSQL",
                "APACHE",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is not an advantage of Jquery ...",
                "Resolved inter-browser compatibility issues",
                "Speed up form processing",
                "Simple code",
                "Complete documentation",
                "Speed up form processing",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which is an AJAX function?",
                "can load data from the server to a web browser without reloading (refreshing)",
                "make code more concise",
                "add style to the web page",
                "create slide animations",
                "can load data from the server to a web browser without reloading (refreshing)",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Language to transport and store data. useful for updating services such as RSS feeds and blogs.",
                "Static",
                "HTML",
                "Dynamic",
                "XML",
                "XML",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Website get data from a server without reloading the whole webpage.",
                "JavaScript",
                "Code",
                "AJAX",
                "API",
                "AJAX",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Data is wrapped up with a set of functions into packages.",
                "Object- oriented",
                "Applications",
                "App",
                "Dynamic",
                "Object- oriented",
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
                "Who developed and designed TypeScript?",
                "Amazon",
                "Oracle",
                "TypeScript",
                "Microsoft",
                "Microsoft",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "When was the first time TypeScript was made public?",
                "December 2012",
                "October 2012",
                "October 2013",
                "November 2013",
                "October 2012",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following is the typing principle of typescript?",
                "Gradual",
                "Dynamic",
                "Duck",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following is a filename extension for typescript?",
                ".tsx",
                ".nod",
                ".txt",
                ".tt",
                ".tsx",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Among which of the following computer programming language influenced the creation of typescript?",
                "Java",
                "JavaScript",
                "C#",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "The following are backported features of typescript, except?",
                "Classes",
                "Methods",
                "Modules",
                "Arrow",
                "Methods",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "The ...... Service powers the interactive TypeScript experience in Visual Studio, Vs Code, Sublime, the TypeScript playground and other editor.",
                "Typescript language",
                "TypeScript compiler",
                "Typescript main",
                "TypeScript method",
                "Typescript language",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "A typescript can be installed or managed through?",
                "Void",
                "Space",
                "Nmp",
                "Tag",
                "Nmp",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which Object Oriented Terms are Supported by Typescript?",
                "Modulus",
                "Interface",
                "Classes",
                "All of the above",
                 "All of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "..... are the way to organise code in typescript.",
                "Modules",
                "Classes",
                "Method",
                "Arrow",
                "Modules",
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
                "Which are the different Data Types supported by Typescript?",
                "Boolean var bValue: boolean = false",
                "Number var age: number = 16",
                "String var name: string = \"jon\"",
                "All of the above mentioned",
                "All of the above mentioned",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which statements are true regarding JSX modes?",
                "These modes only affect the emit stage - type checking is unaffected",
                "The output of react mode will have a .jsx file extension",
                "The react mode will emit React.addElement",
                "The preserve mode will keep the JSX as part of the output to be further consumed by another transform step",
                "The preserve mode will keep the JSX as part of the output to be further consumed by another transform step",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What are variables in Typescript?",
                "A variable name should contain alphabets and numeric digits",
                "It cannot contain spaces and special characters except underscore (_) and dollar ($) sign",
                "A variable name cannot begin with a digit",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What are the variable scopes available in TypeScript?",
                "Global Scope",
                "Class Scope",
                "Local Scope",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What are the benefits of Typescript?",
                "It helps in code structuring",
                "Use class based object oriented programming",
                "Impose coding guidelines",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which object oriented terms are supported by Typescript?",
                "Modules",
                "Classes",
                "Interfaces",
                "All of these",
                "All of these",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "List some features of Typescript?",
                "Typescript can be compiled to all major versions of Javascript(ES3,ES5,ES6,ES7)",
                "Typescript can be used for cross \"“browser development and is an open source project",
                "Typescript is a superset of JavaScript that provides typed nature to your code",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What are the components of TypeScript?",
                "TypeScript Language",
                "TypeScript Compiler",
                "TypeScript Language Service",
                "All of these",
                "All of these",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What are the types of access modifiers supported by TypeScript?",
                "Public",
                "Private",
                "Protected",
                "All of these",
                "All of these",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Existing JavaScript programs are also valid TypeScript programs?",
                "Yes",
                "No",
                "None",
                "None of these",
                "Yes",
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
                "JavaScript features in which stage of TC39 process will be included in latest version of TypeScript?",
                "Stage 0",
                "Stage 1",
                "Stage 2,4",
                "Stage 3",
                "Stage 3",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which following one are valid types of TypeScript?",
                "string, integer, boolean, float",
                "string, number, boolean, bigint",
                "String, Number, Boolean, Float",
                "String, Integer, Boolean, BigInt",
                "string, number, boolean, bigint",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which statement is correct?",
                "A union type combines multiple types into one & An intersection type is a type formed from two or more other types, representing values that may be any one of those types.",
                "An intersection type combines multiple types into one & A union type is a type formed from two or more other types, representing values that may be any one of those types.",
                "Both are correct.",
                "Both are incorrect.",
                "An intersection type combines multiple types into one & A union type is a type formed from two or more other types, representing values that may be any one of those types.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How can we declare an Enum type?",
                "enum LOG_LEVEL = { 1 = ERROR, 2 = WARN }",
                "enum LOG_LEVEL { 1 = ERROR, 2 = WARN }",
                "enum LOG_LEVEL = { ERROR = 1, WARN = 2 }",
                "enum LOG_LEVEL { ERROR = 1, WARN = 2 }",
                "enum LOG_LEVEL { ERROR = 1, WARN = 2 }",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What was the first internet browser?",
                "Google Chrome",
                "Internet Explorer",
                "Mosaic",
                "Mozilla Firefox",
                "Mosaic",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which browsers were heavily influenced by Javascript in 1994?",
                "Internet Explorer & Safari",
                "Google Chrome & Mozilla Firefox",
                "Opera & Chromium",
                "Netscape & Yahoo!",
                "Netscape & Yahoo!",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Who was the developer that gave rise to the Javascript language?",
                "Brendan Eich",
                "Bill Gates",
                "Steve Jobs",
                "Elon Musk",
                "Brendan Eich",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What are the two main standardizations of the Javascript language?",
                "ECMA-263 & ISO 9001",
                "ECMA-999 & ISO 9999",
                "ECMA-262 & ISO/IEC 16262",
                "ECMA-262 & ISO/IEC 16261",
                "ECMA-262 & ISO/IEC 16262",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is ECMA International?",
                "US government agency",
                "European Computer Manufacturers Association",
                "for-profit organization",
                "None of the above alternatives",
                "European Computer Manufacturers Association",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is the main feature of Typescript?",
                "Allows better compilation than other languages.",
                "Static typing.",
                "Achieving full software performance.",
                "None of the above alternatives.",
                "Static typing.",
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
                "What other technologies are similar to Typescript?",
                "Java & CoffeeScript",
                "Python & Ruby",
                "CoffeeScript & Dart",
                "C & C++",
                "CoffeeScript & Dart",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the difference between Javascript & Typescript?",
                "None, as they are two scripting languages.",
                "Both run only on desktop applications.",
                "Javascript is the only language that can run on all browsers, while Typescript is a language that proposes better organization of existing JavaScript code.",
                "They have the same characteristics in terms of performance.",
                "Javascript is the only language that can run on all browsers, while Typescript is a language that proposes better organization of existing JavaScript code.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Where is Javascript used?",
                "Front-end",
                "Back-end",
                "mobile apps",
                "All",
                "All",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which companies use Javascript?",
                "Google",
                "Microsoft",
                "Facebook",
                "All",
                "All",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Browsers know and can interpret TypeScript",
                "True",
                "Wrong",
                "None",
                "Not valid",
                "Wrong",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which one is right?",
                "TypeScript bir JavaScript superset'idir",
                "Can generate all major JavaScript versions including TypeScript ES3, ES5, ES6, ES7",
                "TypeScript helps us to do multi-browser supported development",
                "all of it",
                "all of it",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which ones are TypeScript components?",
                "TypeScript compiler",
                "TypeScript Language",
                "TypeScript Language Service",
                "All",
                "All",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How to install TypeScript?",
                "with installer",
                "Chocolate home",
                "Npm how much",
                "Uninstallable bullshit",
                "Npm how much",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is TypeScript file extension?",
                ".ts",
                ".js",
                ".jsx",
                ".jx",
                ".ts",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which access tokens (Access modifiers) are supported?",
                "public/None",
                "private",
                "protected",
                "All",
                "All",
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
                "What type of variable is this:\n" +
                        "var version: {" +
                        "\n" +
                        "subVersion: number" +
                        "\n" +
                        "};",
                "boolean",
                "number",
                "object",
                "string",
                "object",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is a difference between the following:\n" +
                        "let a = 0;" +
                        "\n" +
                        "const a = 0;",
                "\"const a\" can be reassigned. \"let a\" cannot be reassigned.",
                "\"let a\" can be reassigned. \"const a\" cannot be reassigned.",
                "There is no difference",
                "None of these",
                "\"let a\" can be reassigned. \"const a\" cannot be reassigned.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How do you declare a variable inside a class?",
                "class MyCoolClass {" +
                        "\n" +
                        "let myCoolVariable;" +
                        "\n" +
                        "}",
                "class MyCoolClass {" +
                        "\n" +
                        "myCoolVariable;" +
                        "\n" +
                        "}",
                "Both",
                "None of these",
                "class MyCoolClass {" +
                        "\n" +
                        "myCoolVariable;" +
                        "\n" +
                        "}",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How does a TypeScript class implement an interface?",
                "class MyCoolClass implements IMyCoolInterface {" +
                        "\n" +
                        "}",
                "class MyCoolClass extends IMyCoolInterface {" +
                        "\n" +
                        "}",
                "interface IMyCoolInterface implemented by MyCoolClass {" +
                        "\n" +
                        "}",
                "A class implements an interface automatically.",
                "class MyCoolClass implements IMyCoolInterface {" +
                        "\n" +
                        "}",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the benefit of interfaces?",
                "They let you hide what the class is and reference an object via the interface.",
                "They let you define inline-objects with type safety, like so:\n" +
                        "let myObject: IMyCoolInterface = {" +
                        "\n" +
                        "myCoolVariable: 1\n" +
                        "}",
                "They let you change assign a different class to a variable as long as it implements the same interface.",
                "All of the above.",
                "All of the above.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Typescript is dynamically typed language",
                "True",
                "False",
                "Undefined",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Advantage of typescript are",
                "Type Checking and type inference",
                "Dynamically typed language",
                "No need to have any external compilers / interpreter",
                "None of these",
                "Type Checking and type inference",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "ECMAScript (ES) is a scripting language specification created to standardize JavaScript",
                "True",
                "False",
                "Undefined",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is the output of this code?" +
                        "\n" +
                        "function validate(){" +
                        "\n" +
                        "let a = 2;" +
                        "\n" +
                        "if(true){" +
                        "\n" +
                        "let a = 4;" +
                        "\n" +
                        "console.log(a);" +
                        "\n" +
                        "}" +
                        "\n" +
                        "console.log(a);" +
                        "\n" +
                        "}" +
                        "\n" +
                        "validate();",
                "2 2",
                "2 4",
                "4 2",
                "4 4",
                "4 2",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Fill in the blanks to iterate through all the characters using the for... of loop." +
                        "\n" +
                        "__ (let ch __ \"Hello\") {" +
                        "\n" +
                        "console.log(ch);" +
                        "\n" +
                        "}",
                "for in",
                "for of",
                "for at",
                "None of these",
                "for of",
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
                "Fill in the blanks to declare an arrow function that takes an array and prints the odd elements.\n" +
                        "const printOdds = (arr) __ {" +
                        "\n" +
                        "__ . forEach(__ => {" +
                        "\n" +
                        "if ( el % 2 != 0 ) console.log(el);" +
                        "\n" +
                        "});" +
                        "\n" +
                        "}",
                "arr el",
                "arrel",
                "arr",
                "None of these",
                "arr el",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the output of this code." +
                        "\n" +
                        "function test( a, b=3, c=42) {" +
                        "\n" +
                        "return a + b + c;" +
                        "\n" +
                        "}" +
                        "\n" +
                        "console.log(test(5));",
                "51",
                "50.0",
                "50",
                "5",
                "50",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the value of a, b, c and d?" +
                        "\n" +
                        "let a, b, c = 4, d=8;" +
                        "\n" +
                        "[a, b=6] = [2];" +
                        "\n" +
                        "[c, d] = [d, c];",
                "2,6,8,4",
                "2,6,4,8",
                "6,2,8,4",
                "8,2,6,4",
                "2,6,8,4",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What is the output of the following code?" +
                        "\n" +
                        "let names = ['John', 'Fred', 'Ann'];" +
                        "\n" +
                        "let[Ann, Fred, John] = names;" +
                        "\n" +
                        "console.log(John);",
                "John",
                "Ann",
                "Error",
                "Fred",
                "Ann",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the data type in TypeScript ?",
                "int",
                "float",
                "number",
                "All of the above answers are correct",
                "number",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is the data type that can store any data?",
                "enum",
                "any",
                "string",
                "number",
                "any",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Given the following code:" +
                        "\n" +
                        "interface Product{ id: number," +
                        "\n" +
                        "name: string, description: string }" +
                        "\n" +
                        "What is the correct syntax to declare the Product object for the above code?",
                "let product: Product = { id: 1," +
                        "\n" +
                        "name: “IPhone 12” }",
                "let product: Product = {" +
                        "\n" +
                        "id: 1, description: “New phone” }",
                "let product: Product = { id: 1, name: “IPhone 12”," +
                        "\n" +
                        "description: “New phone”}",
                "All answers above",
                "let product: Product = { id: 1, name: “IPhone 12”," +
                        "\n" +
                        "description: “New phone”}",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How many types of functions are there in TypeScript?",
                "1",
                "2",
                "3",
                "4",
                "2",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is Promise declaration syntax?",
                "let promise = Promise();",
                "let promise = new Promise(resolve, reject);",
                "let promise = new promise(resolve, reject)",
                "let promise = promise(resolve, reject)",
                "let promise = new Promise(resolve, reject);",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What method do we use to get the value from the fullfiled state of the Promise?",
                "then()",
                "catch()",
                "finally()",
                "get()",
                "then()",
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
                "What method do we use to get the value from the rejected state?",
                "then()",
                "catch()",
                "finally()",
                "get()",
                "catch()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "The different data types supported by Typescript are...",
                "Boolean. VD: let bValue: boolean = false;",
                "String. VD: let name: string = \"Jack\";",
                "Number. VD: let age: number = 5;",
                "All of the above ideas",
                "All of the above ideas",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Is it possible to use alert() in TypeScript?",
                "Yes",
                "Are not",
                "None",
                "None of these",
                "Yes",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What command to generate js file from ts file?",
                "npm fileName.ts",
                "tsc fileName.ts",
                "tsc fileName.js",
                "compile fileName.ts",
                "tsc fileName.ts",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following statements declares a variable in typescript?",
                "let myVar : number = 123",
                "var myVar = 123",
                "let myVar : number = 123",
                "All",
                "All",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is a difference between the following:\n" +
                        "let a = 0;" +
                        "\n" +
                        "const a = 0;",
                "\"const a\" can be reassigned. \"let a\" cannot be reassigned.",
                "\"let a\" can be reassigned. \"const a\" cannot be reassigned.",
                "Both",
                "There is no difference",
                "\"let a\" can be reassigned. \"const a\" cannot be reassigned.",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which is NOT considered as a type of heading?",
                "marginal",
                "shoulder",
                "paragraph",
                "indented",
                "indented",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "On which of the following declarations does the expression a.foo not return an error? (several possible)",
                "a: {};",
                "a: object;",
                "a: any;",
                "a: void;",
                "a: any;",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "I commit an immutable property in a class like this:",
                "const animal = 'dog';",
                "static animal = 'dog';",
                "readonly animal = 'dog';",
                "private animal = 'dog'",
                "readonly animal = 'dog';",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following declarations conforms to TypeScript standard linting rules?",
                "const seconds = 60 : number;",
                "const seconds: number = 60;",
                "const seconds = 60;",
                "None of these",
                "const seconds = 60;",
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
                "Which of the following directive bootstraps AngularJS framework?",
                "ng-init",
                "ng-app",
                "ng-controller",
                "ng-bootstrap",
                "ng-app",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the output of below code<div>{{ 'Hello! This is Angular Quiz' | uppercase | lowercase |titlecase }}</div>",
                "hello! this is angular quiz",
                "Hello! This Is Angular Quiz",
                "HELLO! THIS IS ANGULAR QUIZ",
                "Error -(Can't use multiple pipes for same element)",
                "Hello! This Is Angular Quiz",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which are the different Data Types supported by Typescript?",
                "Boolean var bValue: boolean = false",
                "Number var age: number = 16",
                "String var name: string = \"jon\"",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Cons of SPA - Single Page Application",
                "XSS",
                "SEO",
                "Lazy loading",
                "Both a & b",
                "Both a & b",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "PWA is type of",
                "web architecture",
                "web pattern",
                "web application",
                "Hybrid mobile app",
                "web application",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is true about lowercase filter?",
                "Lowercase filter converts a text to lower case text.",
                "Lowercase filter is a function which takes text as input.",
                "Both of the above.",
                "None of the above.",
                "Lowercase filter converts a text to lower case text.",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is true about ng-disabled directive?",
                "ng-disabled directive can enable a given control.",
                "ng-disabled directive can disable a given control.",
                "Both of the above.",
                "None of the above.",
                "Both of the above.",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is true about $invalid flag?",
                "$invalid flag states that value has been changed.",
                "$invalid flag states that form has invalid data.",
                "Both of the above.",
                "None of the above.",
                "$invalid flag states that form has invalid data.",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "On which of the following types of component can we create a custom directive?",
                "Element directives",
                "Attribute",
                "CSS",
                "All of the above.",
                "All of the above.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is deep linking in AngularJS?",
                "Deep linking allows you to encode the state of application in the URL so that it can be bookmarked.",
                "Deep linking is a SEO based technique.",
                "Deep linking refers to linking various views to a central page.",
                "None of the above.",
                "Deep linking allows you to encode the state of application in the URL so that it can be bookmarked.",
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
                "Which of the following is true about currency filter?",
                "Currency filter formats text in a currency format.",
                "Currency filter is a function which takes text as input.",
                "Both of the above.",
                "None of the above.",
                "Currency filter is a function which takes text as input.",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Father of AngularJs",
                "Igor Minor",
                "Misko Hevery",
                "Brad Green",
                "Gausling",
                "Misko Hevery",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Data Binding in AngularJs means",
                "Synchronization between model part and view part",
                "Synchronization between model part and controller part",
                "Synchronization between controller part and view part",
                "None of the above",
                "Synchronization between model part and view part",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "AngularJs is based on",
                "MVC Architecture",
                "MVVM Architectural pattern",
                "Decorator pattern",
                "Observer Pattern",
                "MVVM Architectural pattern",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "AngularJs is used in",
                "Model",
                "Controller",
                "Method",
                "View",
                "View",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which sign is used as prefix for the built-in objects in AngularJS?",
                "$",
                "#",
                "@",
                "*",
                "$",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Mark the invalid AngularJs filter",
                "currency",
                "orderby",
                "lowercase",
                "email",
                "email",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "The controller take the single parameter",
                "$control",
                "^scope",
                "$scope",
                "None of the above",
                "$scope",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "$routeprovider in AngularJs is",
                "A component",
                "A methods",
                "A service",
                "A model",
                "A service",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "AngularJs Works in",
                "angular.module is primarily used to create application module.",
                "angular.module is used to create AngularJS modules along with its dependent modules.",
                "None of the above",
                "None of the above",
                "None of the above",
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
                "No of $RootScope in angularJs",
                "1",
                "2",
                "3",
                "4",
                "1",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "MVVM stands for",
                "Model view controller",
                "Model-view",
                "Model–view–viewmodel",
                "View-Model",
                "Model–view–viewmodel",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How to combine filter with expression",
                "Using Dot {{expression. pipe}}",
                "Using Slash {{expression / pipe}}",
                "Using PIpe {{expression | pipe}}",
                "None of the above",
                "Using PIpe {{expression | pipe}}",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Controller in MVC is",
                "It is a software Code that controls the interactions between the Model and View",
                "It is a software Code that stores the data",
                "It is a software Code that renders the user interface",
                "all of the above",
                "It is a software Code that renders the user interface",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Controllers are responsible for",
                "Displaying the data",
                "Controlling the data",
                "Both",
                "None",
                "Controlling the data",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Angular.js is the combination of which of the following languages ?",
                "HTML and PHP",
                "HTML and CrossScript",
                "HTML and Bootstrap",
                "HTML and TypeScript",
                "HTML and TypeScript",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is a way for applying expression in AngularJS application ?",
                "(expression)",
                "{{expression}}",
                "{({expression})}",
                "[expression]",
                "{{expression}}",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is the way, used to manually start the application in Angular ?",
                "angular. bootstrap",
                "angular.element",
                "angular. copy",
                "None of the above",
                "angular. bootstrap",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is the correct syntax for the create module in angularJs ?",
                "ar myModule= module();",
                "var myModule= new Module();",
                "angular.module(\"app\", []);",
                "var Module= new Module(my);",
                "angular.module(\"app\", []);",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "The component which is used for adding the dependency in AngularJS application are:",
                "Value",
                "Factory",
                "Constant",
                "Application Module",
                "Application Module",
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
                "Which of the following is a way to push one HTML content into another HTML content?",
                "Server Side push",
                "Use of Comment",
                "Use of pushing",
                "Use of include",
                "Use of include",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "JQLite is used for ?",
                "Built-in subset of jQuery",
                "Built-in superset of jQuery",
                "KnockoutJS built-in subset of jQuery",
                "KnockoutJS built-in superset of jQuery",
                "Built-in subset of jQuery",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Can we extend AngularJS?",
                "True",
                "False",
                "None",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "In AngularJS, what is $scope variable used for?",
                "Store data",
                "Get/set values in a function call",
                "Get/set values for model, view and controller",
                "To get values of variables within the implementation scope",
                "Get/set values for model, view and controller",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following statements are invalid AngularJS filters?",
                "currency filter",
                "aggregate filter",
                "lowercase filter",
                "orderby filter",
                "aggregate filter",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Check whether the code below is correct\n" +
                        "app.config(function ($routeProvider) {\n" +
                        "   $routeProvider\n" +
                        "      .when('/inbox', {\n" +
                        "         templateUrl: 'views/inbox.html',\n" +
                        "         controller: 'InboxCtrl',\n" +
                        "         controllerAs: 'inbox'\n" +
                        "      })\n" +
                        "      .when('/inbox/email/:id', {\n" +
                        "         templateUrl: 'views/email.html',\n" +
                        "         controller: 'EmailCtrl',\n" +
                        "         controllerAs: 'email'\n" +
                        "      })\n" +
                        "      .otherwise({\n" +
                        "         redirectTo: '/inbox'\n" +
                        "        });\n" +
                        "    });",
                "May be",
                "Can be",
                "No",
                "Yes",
                "Yes",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "In context of AngularJS, what does SPA stand for?",
                "Single Page Application",
                "Software Publisher Association",
                "Software Product Assessment",
                "Single Point of Access",
                "Single Page Application",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the service modes can be easiest to test while using AngularJS?",
                "Event-driven",
                "Service Oriented Architecture",
                "Model View Controller",
                "N-Tier",
                "Service Oriented Architecture",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "For the script below.\n" +
                        "var application = angular.module('myTestApp', []);\n" +
                        "    application.controller('MyTestController', function($scope) {\n" +
                        "        $scope.firstName = \"Michael\";\n" +
                        "        $scope.lastName = \"Stephany\";\n" +
                        "        $scope.fullName = function() {\n" +
                        "            return $scope.firstName + \" \" + $scope.lastName;\n" +
                        "        };\n" +
                        "    });\n" +
                        "Assuming that myTestApp has previously been defined. The above script will",
                "Will show warnings",
                "Runtime errors",
                "Will run successfully",
                "Give compilation errors",
                "Will run successfully",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is AngularJS?",
                "A simplified JavaScript framework, used binding for HTML User Interface Elements with JavaScript binding.",
                "An MVC JavaScript framework, used for information security",
                "A simplified JavaScript framework, used for modifiability.",
                "A modifiable JavaScript framework, used for information security.",
                "A simplified JavaScript framework, used binding for HTML User Interface Elements with JavaScript binding.",
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
                "In AngularJS data binding is __________.",
                "one way",
                "simplex",
                "sychronous",
                "two way",
                "two way",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Using filters AngularJS cannot use _____________.",
                "orderby",
                "json",
                "Special characters",
                "limitTo",
                "Special characters",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the parent of $scope in AngualarJS?",
                "@super",
                "$super",
                "$rootScope",
                "$root",
                "$rootScope",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Check whether the code syntax is correct\n" +
                        "app.factory('TestFactory', function myTestFactory($rootScope, $http, $location) {\n" +
                        "        return function myTestReusable() {\n" +
                        "        // processing goes here\n" +
                        "        };\n" +
                        "    });",
                "Can be",
                "No",
                "May be",
                "Yes",
                "Yes",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the purpose of $destroy method in AngularJS?",
                "Remove Dangling Pointers",
                "Cleanup Resources",
                "All of above",
                "None of above",
                "Cleanup Resources",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How to use dependency injection in AngularJS ?",
                "Pass scope and http variables as a parameter in the Controller function",
                "Create JSONs and inject through a function call",
                "Create JSONs and inject through a function call",
                "Create two classes, one extends the other. Pass the child as a parameter to the parent class",
                "Create two classes, one extends the other. Pass the child as a parameter to the parent class",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What is the correct syntax for a variable “a” in AngularJS?",
                "[{a}]",
                "{(a)}",
                "{{a}}",
                "{[a]}",
                "{{a}}",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "For the code below\n" +
                        "<html ng-app=\"myApp\">\n" +
                        "    <head>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <div ng-view></div>\n" +
                        "    </body>\n" +
                        "    </html>\n" +
                        "Is the syntax current",
                "May be",
                "No",
                "Can be",
                "Yes",
                "Yes",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Elements of AngularJS MVC views are rendered in which order?",
                "Priotization",
                "Sequential",
                "Random",
                "Not listed above",
                "Random",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What are NOT an AngularJS directive?",
                "ng-loop",
                "ng-if",
                "ng-bind",
                "ng-app",
                "ng-loop",
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
                "What is Vue.js?",
                "It is an open-source javascript library for developing user interfaces.",
                "It is an open-source front-end javascript framework for developing user interfaces",
                "It is an open-source, cross-platform, javascript run-time situations that perform the JavaScript program outside a web browser",
                "It is a JavaScript library constructed to facilitate HTML DOM tree traversal and administration, and event handling, CSS activity, and Ajax.",
                "It is an open-source front-end javascript framework for developing user interfaces",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is Vue.js used for?",
                "It is a dynamic javascript framework that is frequently used for developing user interfaces",
                "It is a JavaScript library that makes user interfaces for single-page applications by dividing UI into composable components",
                "It uses the MVVM pattern to bind data to certain DOM elements",
                "All of Above",
                "It is a dynamic javascript framework that is frequently used for developing user interfaces",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which data binding interpolation is also known as “Mustache” syntax?",
                "v-on",
                "v-model",
                "{{}}",
                "[]",
                "{{}}",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How to use for loop in Vue.js?",
                "vFor",
                "v-for",
                "*v-for",
                "None of these",
                "v-for",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Once a View Model is lost, all the event listeners are automatically removed.",
                "False",
                "None",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How to create a Vue.js instance?",
                "var text = new object ({//options}).",
                "var text = new class ({//options}).",
                "var text = new text ({//options})",
                "var text = new Vue({// options }).",
                "var text = new Vue({// options }).",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which modifier is very useful for improving the performance of mobile devices?",
                ".directive",
                ".once",
                ".passive",
                ".capture",
                ".passive",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which event modifier is used for only prevent clicks on the element itself?",
                "@click.self.",
                "@click.prevent.",
                "click@.self.",
                "@click.self.prevent.",
                "@click.self.prevent.",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The updated hook is terminated after modifications have been written to the DOM",
                "False",
                "None",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How to install vue resources?",
                "$ yarn add vue-resource",
                "# yarn add vue-resource",
                "@ yarn add vue-resource",
                "& yarn add vue-resource",
                "$ yarn add vue-resource",
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
                "How to install vue plugins?",
                "MyPlugin.install = function (Vue, options[]) {}.",
                "MyPlugin.install = function (Vue, options) {}",
                "MyPlugin.install = function () {}.",
                "None of these",
                "MyPlugin.install = function (Vue, options) {}",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which is used to Dynamically bind one or more attributes, or a component property to an expression?",
                "v-pre",
                "v-html",
                "v-bind",
                "v-once directive,",
                "v-bind",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "If we want to perform the click event only for one time.Which event modifier will be used?",
                "<a @:click.passive=\"dotask\"></a>",
                "<a @:click.once=\"dotask\"></a>",
                "<a @:click.prevent-once=\"dotask\"></a>",
                "<a @:click.prevent-once=\"dotask\"></a>",
                "<a @:click.once=\"dotask\"></a>",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How to represent filter in vue.js?",
                "::",
                "!",
                "||",
                "|",
                "|",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "v-show doest not support the <template> element?",
                "False",
                "None",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                ".prevent will be ignored if we use .passive and .prevent together and it will probably show you a warning?",
                "False",
                "None",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which keyword is used to create constant in vue.js?",
                "Const",
                "Constant",
                "Define",
                "None of these",
                "Const",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How many types of directive available in vue.js?",
                "6",
                "4",
                "7",
                "2",
                "4",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is the short form of v-bind?",
                "bind",
                ":",
                ";",
                "None of these",
                ":",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "The Following code represent the registered component.How we can call the custom component in my template\n" +
                        "Vue.component(‘my-component’, {\n" +
                        "template: ‘my own component!’\n" +
                        "})\n" +
                        "new Vue({\n" +
                        "el: ‘#demo’\n" +
                        "})",
                "v-bind:my-component",
                "<my-component></my-component>",
                "v-my-component",
                "@my-component",
                "<my-component></my-component>",
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
                "Which of the following is not represent the non mutating methods ?",
                "Reverse()",
                "Concat()",
                "Slice()",
                "Filter()",
                "Reverse()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the full form of MVVM?",
                "Model-Value-ValueModel",
                "Model-View-ValueModel",
                "Model-View-ViewModel",
                "Module-View-ViewModel",
                "Model-View-ViewModel",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "In how many way we can define filter in vue.js?",
                "4",
                "2",
                "3",
                "1",
                "2",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which directive is used for makes two-way binding ?",
                "v-on.",
                "v-model.",
                "no-one",
                "[].",
                "v-model.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Who is the main Author of Vuejs?",
                "Brendan Eich",
                "Evan You",
                "Rasmus Lerdorf",
                "Tim",
                "Evan You",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is the full form of HTTP?",
                "Hyper text transfer package",
                "Hyper text transfer protocol",
                "Hyphenation text test program",
                "None of the above",
                "Hyper text transfer protocol",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "HTML document start and end with which tag pairs?",
                "HTML",
                "WEB",
                "HEAD",
                "BODY",
                "HTML",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Consider the following code for switch loop\n" +
                        "case 10:\n" +
                        "case 12:\n" +
                        "What will run next if the value is 10?",
                "the code following the case 12:",
                "the code following default:",
                "the code after the end of the switch",
                "this is a coding error",
                "the code following the case 12:",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What does ++ do?",
                "Adds two numbers together",
                "Joins two text strings together",
                "Adds 1 to a number",
                "Adds 2 to a number",
                "Adds 1 to a number",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What is correct about a method.",
                "A method is the object oriented version of a function",
                "A method is the object oriented version ofa variable",
                "A method is the object oriented version ofa sequence",
                "A method is the object oriented version ofa program",
                "A method is the object oriented version of a function",
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
                "Vue.js is considered:",
                "progressive framework",
                "With a little active community",
                "All the code is not in a single file",
                "None of these",
                "progressive framework",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Of the following options, which is NOT a disadvantage of Vue.js:",
                "There is a risk of excessive flexibility",
                "Lack of documentation in English",
                "Very difficult tool to learn",
                "Tool with few resources",
                "Very difficult tool to learn",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Related to the emergence of Vue.js...",
                "It was developed from features considered interesting from other frameworks (mainly Angular).",
                "It was created from scratch with unique ideas, being an original framework.",
                "One of the first frameworks to be created, giving rise to Angular, React and other frameworks.",
                "None of these",
                "It was developed from features considered interesting from other frameworks (mainly Angular).",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Vue.js is referenced for being a framework...",
                "Just progressive.",
                "Just reactive.",
                "Progressive and Reactive.",
                "None of these",
                "Progressive and Reactive.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What knowledge is required to use Vue?",
                "CSS,JavaScript,HTML",
                "JavaScript",
                "TypeScript",
                "None of these",
                "CSS,JavaScript,HTML",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "By using ECMAScript 5 features, Vue ends up not supporting...",
                "Chrome 23.",
                "IE 8 and its earlier versions.",
                "Microsoft Edge.",
                "Firefox 21.",
                "IE 8 and its earlier versions.",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "One of the great features of Vue is the Single-File Component that allows...",
                "Allows you to write HTML, CSS and JavaScript in a single file.",
                "Allows you to instantiate components in multiple containers.",
                "Allows to separate all kinds of languages from our component to multiple files.",
                "None of these",
                "Allows you to write HTML, CSS and JavaScript in a single file.",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Vue.js was heavily inspired by what kind of architecture?",
                "MVC",
                "MVVM",
                "MVP",
                "SoC",
                "MVVM",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Two-way data binding is a feature of Vue.js that...",
                "Synchronizes your model with the interface.",
                "If there is any operation in the model, it reflects to the interface.",
                "If there are changes in the interface, it ends up saving in the model.",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Vue.js uses the componentization concept that has the advantage...",
                "Reuse and maintenance gain when several components break.",
                "Ease of localization when having a very large component.",
                "Fast maintenance by having only one block in a single JavaScript file.",
                "None of these",
                "Reuse and maintenance gain when several components break.",
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
                "What are other advantages that Vue.js offers?",
                "Accessibility",
                "Versatility",
                "Both A & B",
                "Flexibility",
                "Both A & B",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "About Vue Native we can say that...",
                "Developed by the company GeekyAnts for app development for Android and iOS.",
                "It was designed to connect React Native and Vue.js.",
                "Both",
                "None of the above",
                "Both",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the correct way to bind the data from the data property of the VUE model instance to an input element of a form?",
                "<input type = \"text\" v-bind = \"message\">",
                "<input type = \"text\" v-model = \"message\">",
                "<input type = \"text\" v-on: click = \"message\">",
                "None of these",
                "<input type = \"text\" v-model = \"message\">",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How to bind a click event?",
                "<button @ click = \"methodAccept\"> Accept </button>",
                "<button: click = \"methodAccept\"> Accept </button>",
                "Both of the above",
                "None of the above",
                "<button @ click = \"methodAccept\"> Accept </button>",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Vue is a framework designed for the frontend and the backend?",
                "False",
                "None",
                "True",
                "None of these",
                "False",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                 "Vue utilized JavaScript proxy which enables Vue to perform dependency tracking and change notification when properties are accessed or modified.",
                "False",
                "None",
                "True",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "JavaScript proxy parameter that holds the original object being proxied.",
                "target",
                "handler",
                "data",
                "key",
                "target",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the output of the following vanilla JavaScript code:\n" +
                        "const data = {" +
                        "\n" +
                        "name: \"Dave\"," +
                        "\n" +
                        "age: 26" +
                        "\n" +
                        "};" +
                        "\n" +
                        "let message = `Name is ${data.name}, age is ${data.age}`;" +
                        "\n" +
                        "data.age = 30;" +
                        "\n" +
                        "console.log(message) ;",
                "Name is Dave, age is 30",
                "Name is Dave, age is 26",
                "Error",
                "None of these",
                "Name is Dave, age is 26",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "This is used in the template property of the Vue instance to add/create HTML elements.",
                "template string literal",
                "Double quotes",
                "Directives",
                "String interpolation",
                "template string literal",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "In this lifecycle hook Templates and Virtual DOM are not yet mounted or rendered.",
                "created",
                "beforeCreate",
                "Update",
                "Mounted",
                "created",
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
                "What is the correct command to create a new React project?",
                "npx create-react-app",
                "npm create-react-app myReactApp",
                "npx create-react-app myReactApp",
                "npm create-react-app",
                "npx create-react-app myReactApp",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What does myReactApp refer to in the following command?",
                "The name you want to use for the new app",
                "The type of app to create",
                "A reference to an existing app",
                "The directory to create the new app in",
                "The name you want to use for the new app",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What command is used to start the React local development server?",
                "npm run dev",
                "npm serve",
                "npm start",
                "npm build",
                "npm start",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What is the default local host port that a React development server uses?",
                "8080",
                "3500",
                "5000",
                "3000",
                "3000",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "To develop and run React code, Node.js is required.",
                "True",
                "False",
                "Don't know",
                "None of these",
                "True",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What type of element will be rendered from the following code?\n" +
                        "function Car() {\n" +
                        "  return <h1>Ford Mustang</h1>;\n" +
                        "}\n" +
                        "ReactDOM.render(<Car />, document.getElementById('root'));",
                "div",
                "Component",
                "h1",
                "ReactDom",
                "h1",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What is the children prop?",
                "A property that lets you pass data to child components",
                "A property that lets you nest components in other components",
                "A property that lets you set an object as a property",
                "A property that adds child values to state",
                "A property that lets you nest components in other components",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which keyword creates a constant in JavaScript?",
                "constant",
                "let",
                "const",
                "var",
                "const",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "A copy of the 'real' DOM that is kept in memory is called what?",
                "Shadow DOM",
                "React DOM",
                "DOM",
                "Virtual DOM",
                "Virtual DOM",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "React component names must begin with an uppercase letter.",
                "True",
                "False",
                "Don't know",
                "None of these",
                "True",
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
                "Which operator can be used to conditionally render a React component?",
                "||",
                "&&",
                "??",
                "::",
                "&&",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "When rendering a list using the JavaScript map() method, what is required for each element rendered?",
                "data",
                "id",
                "key",
                "index",
                "key",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What tool does React use to compile JSX?",
                "ReactDOM",
                "React Router",
                "Babel",
                "JSX Compiler",
                "Babel",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How can you optimize performance for a function component that always renders the same way?",
                "Use the useMemo Hook.",
                "Wrap it in the React.memo higher-order component.",
                "Use the shouldComponentUpdate lifecycle method",
                "Use the useReducer Hook",
                "Wrap it in the React.memo higher-order component.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What props will be available to the following component?\n" +
                        "<Car {...props} />",
                "children",
                "only static ones",
                "only updated ones",
                "all of them",
                "all of them",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is a common use case for ref?",
                "To refer to a function",
                "To directly access a DOM node",
                "To refer to another JavaScript file",
                "To bind the function",
                "To directly access a DOM node",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "How can you combine the following arrays using the spread operator?\n" +
                        "const array1 = [1, 2, 3];\n" +
                        "const array2 = [4, 5, 6];",
                "const combined = [array1, array2];",
                "const combined = array1 + array2;",
                "const combined = ...array1 + ...array2;",
                "const combined = [...array1, ...array2];",
                "const combined = [...array1, ...array2];",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the correct syntax to import a Component from React?",
                "import Component from 'react'",
                "import { Component } from 'react'",
                "import [ Component ] from 'react'",
                "import React.Component from 'react'",
                "import { Component } from 'react'",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Find the bug in this code:\n" +
                        "function car({make, model}) {\n" +
                        "  return <h1>{make} {model}</h1>;\n" +
                        "};",
                "The first letter of the function must be capitalized",
                "Remove the return statement",
                "Wrap the return in a fragment",
                "Add parenthesis around the return value",
                "The first letter of the function must be capitalized",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "React separates the user interface into components. How are components combined to create a user interface?",
                "With code splitting",
                "With webpack",
                "By putting them in a folder structure",
                "By nesting components",
                "By nesting components",
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
                "Which of the following is NOT a rule for React Hooks?",
                "Hooks can only be called inside React Function components",
                "Hooks cannot be conditional",
                "Hooks can be called in Class or Function components",
                "Hooks can only be called at the top level of a component",
                "Hooks can be called in Class or Function components",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is the output of the following code?\n" +
                        "const make = 'Ford';\n" +
                        "const model = 'Mustang';\n" +
                        "const car = { make, model };\n" +
                        "console.log(car);",
                "{{make: 'Ford', model: 'Mustang'}}",
                "{car: 'Ford', car: 'Mustang'}}",
                "{car: {make: 'Ford', model: 'Mustang'}}",
                "{make: 'Ford', model: 'Mustang'}",
                "{make: 'Ford', model: 'Mustang'}",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Why should you avoid copying the values of props into a component's state?",
                "Because prop values cannot be stored in state",
                "Because that would create two instances of the same state that could become out of sync",
                "Because you want to allow data to flow back up to the parent",
                "Because you should never mutate state",
                "Because that would create two instances of the same state that could become out of sync",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following command is used to create react-js-app ?",
                "npx create-react-app appname",
                "npm install create-react-app",
                "npx install create-react-app -g",
                "install - l create-react-app",
                "npx create-react-app appname",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "In React.js which one of the following is used to create a class for Inheritance ?",
                "Create",
                "Inherits",
                "Delete",
                "Extends",
                "Extends",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is a way to handle data in React.js ?",
                "Services & Components",
                "State & Props",
                "State & Services",
                "State & Component",
                "State & Props",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following is must for the API in React.js ?",
                "SetinitialComponent",
                "render",
                "renderComponent",
                "All of the above",
                "renderComponent",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following function is true about changing the state in React.js ?",
                "this.State{}",
                "this.setState",
                "this.setChangeState",
                "All of the above",
                "this.setState",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following is true about key props ?",
                "\"Key\" props are used to look beauty",
                "It is one type of attribute of HTML",
                "\"Key\" prop is a way to identify the newly added element",
                "It is not used in the array",
                "\"Key\" prop is a way to identify the newly added element",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Everything in React is a _____________",
                "Module",
                "Component",
                "Package",
                "Class",
                "Component",
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
                "React.js is a free and open-source front-end .................",
                "JavaScript library",
                "Bootstrap library",
                "CSS library",
                "None of the Above",
                "JavaScript library",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "React.js was Initially released in ................",
                "May 29, 2013",
                "April 29, 2013",
                "June 29, 2013",
                "May 29, 2014",
                "May 29, 2013",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "A state in React.js is also known is ..............",
                "A permanent storage.",
                "An Internal storage of the component.",
                "An External storage of the component.",
                "All of the above",
                "An Internal storage of the component.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How can you access the state of a component from inside of a member function?",
                "this.getState()",
                "this.values",
                "this.prototype.stateValue",
                "this.state",
                "this.values",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Props are __________ into other components",
                "Methods",
                "Injected",
                "Both 1 & 2",
                "All of the above",
                "Methods",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is a react.js in MVC?",
                "Middleware",
                "Controller",
                "Model",
                "Router",
                "Controller",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Keys are given to a list of elements in react. These keys should be -",
                "Do not requires to be unique",
                "Unique in the DOM",
                "Unique among the siblings only",
                "All of the above",
                "Unique among the siblings only",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is the correct data flow sequence of flux concept?",
                "Dispatcher->Action->Store->View",
                "Action->Dispatcher->View->Store",
                "Action->Store->Dispatcher->View",
                "Action->Dispatcher->Store->View",
                "Action->Dispatcher->Store->View",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                ".............. helps react for keeping their data unidirectional.",
                "JSX",
                "Flux",
                "Dom",
                "Props",
                "Flux",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "We can prevent default behavior in React using ............",
                "revokeDefault()",
                "avoidDefault()",
                "preventDefault()",
                "None of the Above",
                "preventDefault()",
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
                "What is the smallest building block of ReactJS?",
                "props",
                "components",
                "elements",
                "None of the Above",
                "components",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What does the \"webpack\" command do?",
                "A module bundler",
                "Runs react local development server.",
                "Transpiles all the Javascript down into one file",
                "None of the Above",
                "A module bundler",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What are the limitations of ReactJS?",
                "React is only for view layer of the app so we still need the help of other technologies to get a complete tooling set for development",
                "React is using inline templating and JSX. This can seem awkward to some developers",
                "The library of react is too large",
                "All of these",
                "All of these",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What are the advantages of React JS?",
                "React can be used on client and as well as server side too",
                "Using React increases readability and makes maintainability easier. Component, Data patterns improves readability and thus makes it easier for maintaining larger apps",
                "React can be used with any other framework (Backbone.js, Angular.js) as it is only a view layer",
                "All of the above",
                "Using React increases readability and makes maintainability easier. Component, Data patterns improves readability and thus makes it easier for maintaining larger apps",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Life cycle methods of a components fall under following categories?",
                "Mounting, Updating, Unmounting",
                "Mounting, Updating",
                "Mounting, Unmounting",
                "None of these",
                "Mounting, Unmounting",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is not components of Redux?",
                "Action",
                "State",
                "Reducer",
                "View",
                "Reducer",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following represented the Pre and post life cycle methods of components ?",
                "Will, Did",
                "Before, After",
                "Mounting, Unmounting",
                "getInitialState, componentWillMount",
                "getInitialState, componentWillMount",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How do you fix the syntax error that results from running this code?\n" +
                        "const person =(firstName, lastName) =>\n" +
                        " { \n" +
                        "   first: firstName, \n" +
                        "   last: lastName } \n" +
                        "console.log(person(\"jhon\", \"Wolson\"))",
                "Wrap the object in parentheses.",
                "Call the function from another file.",
                "Replace the with an array",
                "Add a return statement before the first curly brace.",
                "Wrap the object in parentheses.",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "If you see the following import in a file, what is being used for state management in the component?\n" +
                        "import React, {useState} from 'react';",
                "stateful components",
                "class components",
                "math",
                "React Hooks",
                "React Hooks",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What happens when the following render() method executes?\n" +
                        "render(){\n" +
                        "  let langs = [\"Ruby\",\"ES6\",\"Scala\"] \n" +
                        "    return (<div> \n" +
                        "      {langs.map(it => <p>{it}</p>)}\n" +
                        "    </div>) \n" +
                        "}",
                "Error. Cannot use direct JavaScript code in JSX",
                "Error. Should be replaced with a for..loop for correct output",
                "Displays the list of languages in the array",
                "Displays nothing",
                "Displays the list of languages in the array",
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
                "What are the three parts built for an ember route?",
                "An entry in the Ember router which maps between our route name and a specific URI",
                "A route handler file, which sets up what should happen when that route is loaded",
                "A route template, which is where we display the actual content for the page",
                "All the above",
                "All the above",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What are the main components of Ember.js?",
                "Models",
                "The Router",
                "Controllers",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Ember.js is which type of framework?",
                "server-side framework",
                "client-side framework",
                "both a and b",
                "None of the above",
                "client-side framework",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Who designed Ember.js framework?",
                "James Gausling",
                "Hakon Wium Lee",
                "Yehuda katz",
                "Tee Berners-lee",
                "Yehuda katz",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How ember applications are structured?",
                "Models",
                "Controllers",
                "Views",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is Git?",
                "It tracks the changes made into the file",
                "It changes the content of the file.",
                "It is just a dependency an Ember.js uses.",
                "None of the above",
                "It tracks the changes made into the file",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which command is used to install the Ember CLI",
                "npm ember.js install",
                "npm install -g ember-cli",
                "install ember-cli",
                "npm ember-cli",
                "npm install -g ember-cli",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What is the use of Router?",
                "It used to keep the tracks",
                "It is used to name the class in ember.js",
                "It is used to map the route to route handler",
                "None of the above",
                "It is used to map the route to route handler",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What are the uses of Ember.js services?",
                "Logging",
                "User/session authentication",
                "Geolocation",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What are the features of Emberjs?",
                "Creating reusable modules",
                "Handlebars Templates",
                "Automatic determines the route and controller during declaration of the route resources",
                "All of the above",
                "All of the above",
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
                "Tick the main component of Ember.js",
                "Router",
                "Controllers",
                "Models",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Name the file loaded the ember application",
                "application.js",
                "application/application.js",
                "App/app.js",
                "None of the above",
                "App/app.js",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which command is used to check the ember in our system",
                "ember check",
                "ember -v",
                "ember.js",
                "ember/ember.check",
                "ember -v",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which command is used to start and stop development server in Ember.js?",
                "Ember server",
                "cd ember-quickstart",
                "both a and b",
                "None of the above",
                "both a and b",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What are the different common functions of Ember.js packages?",
                "Empty",
                " Log Binding",
                "isArray",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is the command to start and stop development server in Ember.js?",
                "Cd ember-quickstart",
                "Ember serve",
                "Both A and B",
                "None",
                "Both A and B",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Basic model of ember.js is/are",
                "Routes",
                "Models",
                "Templates",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What are the common functions of ember.js packages",
                "isArray()",
                "log Binding",
                "Empty",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Tick the recent version of ember.js",
                "2.1",
                "4.1",
                "3.2",
                "3.9",
                "4.1",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Is it possible to store the cache",
                "Yes",
                "No",
                "Maybe",
                "Possible in some cases",
                "Yes",
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
                "Uses of Ember.js services is/are",
                "User/session authentication",
                "Logging",
                "Geolocation",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which language is used for static development",
                "Java",
                "CSS",
                "HTML",
                "Python",
                "HTML",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is template?",
                "It is just a name of the class",
                "It is specified layout for all the pages",
                "It is the functions name",
                "None of the above",
                "It is specified layout for all the pages",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "The framework is for which language",
                "JavaScript",
                "CSS",
                "HTML",
                "Angular",
                "JavaScript",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Command to create a applications",
                "create application.js",
                "ember application",
                "ember new application",
                "None of the above",
                "ember new application",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Three parts built for an ember route are: ",
                "A route handler file, which sets up what should happen when that route is loaded",
                "An entry in the Ember router which maps between our route name and a specific URI",
                "A route template, which is where we display the actual content for the page",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Explain how Router and {{outlet}} tag can be useful in ember.js?",
                "Router allows you to specify all the possible states of an app and map them to urls",
                "To build a hierarchy of sections by providing a mean for a container template to include a child template the {{outlet}} tag is used",
                "Both a & b",
                "None of the above",
                "Both a & b",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Explain how you can add data using fixture into an application?",
                "First update js/application.js to indicate that your application’s application adapter is an extension of the DS.FixtureAdapter.  Adapters are used for communicating with a source of data for your application.  Usually, this will be a web service API.",
                "Next, update the file at js/models/todo.js",
                "Both a & b",
                "None of the above",
                "Both a & b",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What are the features of Ember.js?",
                "It contains HTML and CSS at the core of the development model.",
                "It is used to develop reusable JavaScript web applications.",
                "It provides the instance initializers.",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Explain the architectural structure of Ember.js applications?",
                "Models define the data that is used in an application.",
                "Controllers are used to modifying the queries, edit the data and provide user interactions.",
                "Both a & b",
                "None of the above",
                "Both a & b",
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
                "Bootstrap's global default line-height",
                "1.128",
                "1.428",
                "1.228",
                "1.8",
                "1.428",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is correct about bootstrap wells?",
                "You can change the size of well using the optional classes such as, well-lg or well-sm",
                "well-lg or well-sm classes are used in conjunction with .well class",
                "Both of the above",
                "None of the above",
                "Both of the above",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Glyphicons is mainly used for?",
                "Slideshow",
                "graphic images",
                "animation",
                "providing different icons",
                "providing different icons",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following class styles a table as a nice basic table with stripes on rows?",
                "table",
                ".table-striped",
                ".table-bordered",
                ".table-hover",
                ".table-striped",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What layout is used for providing 100% width in Bootstrap?",
                "Fixed layout",
                "Fluid layout",
                "Both (a)and (b)",
                "None of the above",
                "Fluid layout",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "In Bootstrap we can add for",
                "Proper Rendering and Zooming in mobile",
                "Make SEO",
                "Make proper view of labels",
                "None",
                "Proper Rendering and Zooming in mobile",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following class makes thumbnail image",
                ".img-tmbnail",
                ".img-thumbnail-image",
                ".img-thumb",
                ".img-thumbnail",
                ".img-thumbnail",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which plugin is used to create a modal window?",
                "modal",
                "window",
                "dialog Box",
                "popup",
                "modal",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The .container class provides",
                "Full width container",
                "Fixed width container",
                "Table format",
                "To create a Form",
                "Fixed width container",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following contextual class is used for warning purpose?",
                ".active",
                ".warning",
                ".danger",
                "All of the above",
                ".warning",
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
                "Which of the following is correct about data-trigger Data attribute of popover Plugin?",
                "Sets the default title value if the title attribute isn't present",
                "Defines default content value if data-content attribute isn't present",
                "Defines how the popover is triggered",
                "Delays showing and hiding the popover in ms",
                "Defines how the popover is triggered",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Bootstrap Is Developed By",
                "James Gosling",
                "Mark Otto And Jacob Thornton",
                "Mark Jukervich",
                "None Of Them",
                "Mark Otto And Jacob Thornton",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which Of The Following Is Correct About Bootstrap Jumbotron?",
                "This Component Can Optionally Increase The Size Of Headings And Add A Lot Of Margin For Landing Page Content.",
                "To Use The Jumbotron: Create A Container With The Class Of .jumbotron.",
                "Both A And B",
                "None Of The Above",
                "Both A And B",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which Class Indicates A Dropdown Menu?",
                ".dropdown",
                ".select",
                ".dropdown-list",
                ".dropup-list",
                ".dropdown",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "A Standard Navigation Tab Is Created With:",
                "<ul Class=\"navigation-tabs\">",
                "<ul Class=\"nav Tabs\">",
                "<ul Class=\"navnav-tabs\">",
                "<ul Class=\"navnav-navbar\">",
                "<ul Class=\"nav Tabs\">",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Bootstrap's Grid System Allows Up To",
                "6 Columns Across The Page",
                "8 Columns Across The Page",
                "12 Columns Across The Page",
                "24 Columns Across The Page",
                "12 Columns Across The Page",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Default Size Of H5 Bootstrap Heading",
                "14px",
                "16px",
                "18px",
                "20px",
                "14px",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "The Bootstrap Class Xs Means For",
                "Tablets",
                "Desktop",
                "Phones",
                "Larger Desktops",
                "Phones",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which Of The Following Contextual Class Is Used For Warning Purpose?",
                ".active",
                ".warning",
                ".danger",
                "All Of The Above",
                ".warning",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which Plugin Is Used To Cycle Through Elements, Like A Slideshow?",
                "Orbit",
                "Scrollspy",
                "Slideshow",
                "Carousel",
                "Carousel",
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
                "Which Of The Following Class Is Used To Create A Button As A Link In Bootstrap?",
                ".btn-hyperlink",
                ".btn-link",
                ".btn-anchor",
                "None Of These",
                ".btn-link",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which Class Creates A List Of Items?",
                "Lst-group",
                "List-group",
                "List-grp",
                "Menu-group",
                "List-group",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Medium Devices Are Defined As Having A Screen Width From",
                "900 Pixels To 1000 Pixels",
                "768 Pixels To 991 Pixels",
                "512 Pixels To 2048 Pixels",
                "992 Pixels To 1199 Pixels",
                "992 Pixels To 1199 Pixels",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Bootstrap is used for",
                "Data",
                "IoT",
                "Bigdata",
                "Web applications",
                "Web applications",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Sass stands for .........",
                "Scripting awesome Stylesheets",
                "Scripting awesome Spreadsheets",
                "Syntactically awesome Stylesheets",
                "Syntactically awesome Spreadsheets",
                "Syntactically awesome Stylesheets",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which class provides a responsive fixed width container?",
                ".container-fluid",
                ".container-fixed",
                ".container",
                "None of the above",
                ".container",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which class adds zebra-stripes to a table?",
                ".table-striped",
                ".table-zebra",
                ".even and .odd",
                ".table-bordered",
                ".table-striped",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which class shapes an image to a circle?",
                ".img-rounded",
                ".img-round",
                ".img-thumbnail",
                ".img-circle",
                ".img-circle",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "How can you insert a search icon?",
                "<span class=\"glyphicon-search\"></span>",
                "<span class=\"glyphicon search\"></span>",
                "<span class=\"glyphicon glyphicon-search\"></span>",
                "<span class=\"glyph glyph-search\"></span>",
                "<span class=\"glyphicon glyphicon-search\"></span>",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which class is used to create a badge?",
                ".flag",
                ".tag",
                ".label",
                ".badge",
                ".badge",
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
                "Which class is used to create a basic pagination?",
                ".navigation",
                ".pages",
                ".pagination",
                ".page",
                ".pagination",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which class adds a heading to a panel?",
                ".panel-heading",
                ".panel-head",
                ".panel-footer",
                ".panel-header",
                ".panel-heading",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "In the following code, what does the number 4 represent?\n" +"<div class=\"col-md-4\">",
                "the span of the column",
                "the height of the column",
                "the responsiveness",
                "how many columns are in a row",
                "the span of the column",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What are the Bootstrap classes for creating columns?",
                ".#-col .sm-#-col .md-#-col .lg-#-col .xl-#-col",
                ".large .medium ,small .extrasmall",
                ".col-1 .col-2 .col-3 .col-4",
                ".col-# .col-sm-# .col-md-# .col-lg-# .col-xl-#",
                ".col-# .col-sm-# .col-md-# .col-lg-# .col-xl-#",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "A standard navigation bar is created with:",
                "<nav class=\"nav navbar\">",
                "<nav class=\"navigationbar navbar-default\">",
                "<nav class=\"navbar navbar-default\">",
                "<nav class=\"navbar default-navbar\">",
                "<nav class=\"navbar navbar-default\">",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which class is used to create a black navigation bar?",
                ".navbar-inverse",
                ".navbar-black",
                ".navbar-dark",
                ".navbar-default",
                ".navbar-inverse",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which plugin is used to create a modal window?",
                "Dialog Box",
                "Modal",
                "Popup",
                "Window",
                "Modal",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which contextual class indicates a successful or positive action?",
                ".text-primary",
                ".text-warning",
                ".text-success",
                ".text-info",
                ".text-success",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which class is used to create a big box for calling extra attention?",
                ".bigbox",
                ".jumbotron",
                "There is no such class",
                ".container",
                "There is no such class",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which button class is used to create a large button?",
                ".btn-l",
                ".btn-lg",
                ".btn-large",
                ".btn-l2",
                ".btn-lg",
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
                "Which class is used to create a loader?",
                ".loader",
                ".spinner",
                ".spinner-loader",
                ".spinner-border",
                ".spinner-border",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which class can be used to float an element to the right of the page?",
                ".float-end",
                ".float-right",
                ".float-r",
                ".float-start",
                ".float-end",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is Bootstrap's homepage ?",
                "https://w3schools.com",
                "https://bootstrap.com",
                "https://getbootstrap.com",
                "https://getbootstrap.net",
                "https://getbootstrap.com",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Different screen sizes are specified by Bootstrap with symbols?",
                "very small, small, medium, big, very big",
                "xs, sm, md, lg, xl",
                "mobile, tablet, computer, monitor",
                "None of the above",
                "xs, sm, md, lg, xl",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Where is the HTML + Bootstrap code for a yellow orange button ?",
                "<button class=\"btn btn-warning\">",
                "<a href=\"#\" class=\"btn btn-outline-warning\">",
                "<button class=\"btn-success\">",
                "<a href=\"#\" class=\"btn-primary\">",
                "<button class=\"btn btn-warning\">",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "<div class=“row”>" +
                        "\n" +
                        "<div class=“col-sm-6”>1</div>" +
                        "\n" +
                        "<div class=“col-sm-6”>2</div>" +
                        "\n" +
                        "</div>" +
                        "\n" +
                        "In the above code, what is the smallest screen size to divide the screen width into 2 equal columns ?",
                "Desktop",
                "Laptop",
                "Tablet",
                "Phone",
                "Tablet",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Where is the HTML + Bootstrap code that creates a table that is compatible with different screen sizes?",
                "<div class=“table-responsive”>" +
                        "\n" +
                        "..." +
                        "\n" +
                        "</div>",
                "<table class=“table-responsive”>" +
                        "\n" +
                        "..." +
                        "\n" +
                        "</table>",
                "<div class=“table-responsive”>" +
                        "\n" +
                        "<table class=“table”>" +
                        "\n" +
                        "..." +
                        "\n" +
                        "</table>" +
                        "\n" +
                        "</div>",
                "None of the above",
                "<div class=“table-responsive”>" +
                        "\n" +
                        "<table class=“table”>" +
                        "\n" +
                        "..." +
                        "\n" +
                        "</table>" +
                        "\n" +
                        "</div>",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which Bootstrap class is used to display a message ?",
                ".message",
                ".alert",
                ".table",
                ".are not",
                ".alert",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is Bootstrap's modal object used for?",
                "Show a message",
                "Create a compatibility table",
                "Create a menu",
                "None of the above",
                "Show a message",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What class in Bootstrap is used to group objects in a form?",
                ".form-control",
                ".group-form",
                ".form-group",
                ".form-input",
                ".form-group",
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
                "In which of the following areas, Node.js is not advised to be used?",
                "Single Page Applications",
                "JSON APIs based Applications",
                "CPU intensive applications",
                "Data Intensive Realtime Applications (DIRT)",
                "CPU intensive applications",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What npm stands for?",
                "Node Package Manager",
                "Node Project Manager",
                "New Project Manager",
                "New Package Manager",
                "Node Package Manager",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Buffer class is a global class and can be accessed in application without importing buffer module.",
                "true",
                "false",
                "don't know",
                "none of these",
                "true",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which method of fs module is used to close a file?",
                "fs.close(fd, callback)",
                "fs.closeFile(fd, callback)",
                "fs.closePath(fd, callback)",
                "None of the above.",
                "fs.close(fd, callback)",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following is true about setTimeout(cb, ms) global function?",
                "The setTimeout(cb, ms) global function is used to run callback cb after at least ms milliseconds.",
                "The setTimeout(cb, ms) function returns an opaque value that represents the timer which can be used to clear the timer",
                "Both of the above.",
                "None of the above.",
                "Both of the above.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Is process a global object?",
                "true",
                "false",
                "don't know",
                "none of these",
                "true",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following API creates a server?",
                "net.createServer([options][, connectionListener])",
                "net.connect(options[, connectionListener])",
                "net.createConnection(port[, host][, connectListener])",
                "None of the above.",
                "net.createServer([options][, connectionListener])",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "net.isIP(input) returns 0 for invalid input.",
                "true",
                "false",
                "don't know",
                "none of these",
                "true",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following module is required to create a web server?",
                "url module",
                "net module",
                "http module",
                "web module",
                "http module",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "A stream fires data event when there is data available to read.",
                "true",
                "false",
                "don't know",
                "none of these",
                "true",
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
                "Which of the following is true about Node.JS?",
                "Node.js is a JavaScript based framework/platform built on Google Chrome's JavaScript V8 Engine.",
                "Node.JS is used to develop I/O intensive web applications like video streaming sites, single page applications and other web application.",
                "Node.js is open source and is completely free to use.",
                "All of the above.",
                "All of the above.",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is use of Underscore Variable in REPL session?",
                "to get the last command used.",
                "to get the last result.",
                "to store the result.",
                "None of the above.",
                "to get the last result.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following is true with respect to Node.",
                "Every API of Node js are asynchronous.",
                "Node being a single thread, and uses async function calls to maintain the concurrency.",
                "Node thread keeps an event loop and whenever any task get completed, it fires the corresponding event which signals the event listener function to get executed.",
                "All of the above.",
                "Node being a single thread, and uses async function calls to maintain the concurrency.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following is true about File I/O in Node applications?",
                "Node implements File I/O using simple wrappers around standard POSIX functions.",
                "Node File System (fs) module should be imported for File I/O operations.",
                "Both of the above.",
                "None of the above.",
                "Both of the above.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following is true about __filename global object?",
                "The __filename represents the filename of the code being executed.",
                "The __filename represents the resolved absolute path of code file.",
                "Both of the above.",
                "None of the above.",
                "Both of the above.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following code prints current directory?",
                "console.log('Current directory: ' + process.cwd());",
                "console.log('Current directory: ' + console.cwd());",
                "console.log('Current directory: ' + process.currenWorkingDirectory());",
                "None of the above.",
                "console.log('Current directory: ' + process.cwd());",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following code print the platform of operating system?",
                "console.log('platform : ' + os.platform);",
                "console.log('platform : ' + os.platform());",
                "console.log('platform : ' + os.getPlatform());\n",
                "None of the above.",
                "console.log('platform : ' + os.platform());",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following is true about internal binding with respect to domain module?",
                "Error emmitter is executing its code within run method of a domain.",
                "Error emmitter is added explicitly to a domain using its add method.",
                "Both of the above.",
                "None of the above.",
                "Error emmitter is executing its code within run method of a domain.",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Node.js is ___________ Language.",
                "Server Side",
                "Client Side",
                "Both",
                "None of these",
                "Server Side",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Node.js is written in _____________ .",
                "Javascript",
                "C",
                "C++",
                "All of the Above",
                "All of the Above",
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
                "Is node js multithreaded?",
                "Yes",
                "No",
                "Nothing",
                "None of these",
                "No",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which extension is used to save NodeJs files?",
                ".js",
                ".node",
                ".java",
                ".txt",
                ".js",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Node.js is ________ by default.",
                "Synchronous",
                "Multi-threaded",
                "Asynchronous",
                "None of the above",
                "Asynchronous",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How many Node object methods are available?",
                "19",
                "18",
                "20",
                "21",
                "18",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the default scope in Node.js application",
                "Global",
                "Local",
                "Global Function",
                "Local to object",
                "Local",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Why a Node.JS code is pretty fast although being written in JavaScript?",
                "Node.JS internally converts JavaScript code to Java based code and then execute the same",
                "Node.JS internally converts JavaScript code to C based code and then execute the same",
                "Being built on Google Chrome's V8 JavaScript Engine",
                "None of the above",
                "Being built on Google Chrome's V8 JavaScript Engine",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "How to test if two nodes are equal?",
                "isEqualNode()",
                "equal()",
                "==",
                "None of the above",
                "isEqualNode()",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which module is used to serve static resources in Node.js?",
                "node-static",
                "http",
                "node-resource",
                "static",
                "node-static",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Node.js supports which of the following platform?",
                "Windows",
                "Macintosh",
                "Unix/Linux",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "The Node.js modules can be exposed using _________.",
                "module.expose",
                "module",
                "module.exports",
                "All of the above",
                "module.exports",
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
                "Third-party packages can be install/update/delete using ________.",
                "Node Package Manager",
                "Node.exe",
                "module.exports",
                "REPL",
                "Node Package Manager",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Node.js application runs on __________.",
                "Multiple threads",
                "Single thread",
                "Multiple Processes",
                "Single Process",
                "Single thread",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following core module is used to create a web server in Node.js?",
                "fs",
                "url",
                "connect",
                "http",
                "http",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Simple or complex functionality organized in a single or multiple JavaScript files which can be reused throughout your Node.js application is called",
                "Module",
                "Library",
                "Package",
                "Function",
                "Module",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following class is used to create and consume custom events in Node.js?",
                "EventEmitter",
                "Events",
                "NodeEvent",
                "None of the above",
                "EventEmitter",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following is a GUI-based debugging tool for Node.js?",
                "Core node debugger",
                "Console",
                "REPL",
                "Node Inspector",
                "Node Inspector",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the followings are web application frameworks for Node.js?",
                "Express.js",
                "Geddy",
                "Locomotive",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following types of application can be built using Node.js?",
                "Web Application",
                "Chat Application",
                "RESTful Service",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Node.js application can access which of the following databases?",
                "NoSQL databases",
                "Relational databases",
                "All of the above",
                "None of the above",
                "None of the above",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following template engines can be used with Node.js?",
                "Jade",
                "Vash",
                "Handlebars",
                "All of the above",
                "All of the above",
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
                "The Node.js modules can be exposed using",
                "module.expose",
                "module",
                "module.exports",
                "All of the above",
                "",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which statement executes the code of sample.js file?",
                "nodejs sample.js",
                "node sample.js",
                "sample.js",
                "None of the above",
                "node sample.js",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How can we check the current version of NPM?",
                "npm --version",
                "npm --ver",
                "npm help",
                "None of the above",
                "npm --version",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How can we create instance of http module?",
                "var http = require(\"http\")",
                "var http = new require(\"http\")",
                "var http = new http()",
                "None of the above",
                "None of the above",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of following are a valid form of route path?",
                "strings",
                "string patterns",
                "regular expressions",
                "All of above",
                "All of above",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following shortcut command is used to kill a process in Node.js?",
                "Ctrl + B",
                "Ctrl + K",
                "Ctrl + T",
                "Ctrl + C",
                "Ctrl + C",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following tool is used to automate the various tasks of the Node.js application?",
                "Express.js",
                "GruntJS",
                "NPM",
                "None of the above",
                "GruntJS",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following areas, Node.js, is not advised to be used?",
                "Single Page Applications",
                "JSON APIs based Applications",
                "CPU intensive applications",
                "Data-Intensive Real-time Applications (DIRT)",
                "CPU intensive applications",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following route parameter formats are valid?",
                "/books/!:from-:to",
                "/flights/:from-:to",
                "/users/:userId/books/:bookId",
                "None of the above.",
                "/books/!:from-:to",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following method is used to compare the placement of two nodes in the DOM hierarchy (document)?",
                "cloneNode()",
                "compareDocumentPosition()",
                "getFeature()",
                "getUserData()",
                "compareDocumentPosition()",
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
                "Express is a minimal and flexible _______ web application framework.",
                "Node.js",
                "React.js",
                "Redux.js",
                "Angular.js",
                "Node.js",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Express.js, or simply Express, is a _________ web application framework for Node.js",
                "Front-end",
                "Back-end",
                "Database",
                "None of the above",
                "Back-end",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Pug earlier known as ?",
                "Terse",
                "DRY",
                "Express",
                "Jade",
                "Jade",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Backlog arguments defines as?",
                "A port number on which the server should accept incoming requests.",
                "Name of the domain",
                "The maximum number of queued pending connections",
                "An asynchronous function that is called when the server starts listening for requests.",
                "The maximum number of queued pending connections",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which method requests that the server accept the data enclosed in the request as a modification to existing object identified by the URI?",
                "GET",
                "DELETE",
                "PUT",
                "POST",
                "PUT",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "This method of using values is called ?",
                "filters",
                "interpolation",
                "inheritance",
                "includes",
                "interpolation",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What are core features of Express framework?",
                "Allows to set up middlewares to respond to HTTP Requests",
                "Defines a routing table which can works as per HTTP Method and URL",
                "Dynamically render HTML Pages",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "_________ is a middleware which parses cookies attached to the client request object.",
                "cookie",
                "req.cookies",
                "cookie-parser",
                "None of the above",
                "cookie-parser",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "_____________ allows us to easily create a skeleton for a web application",
                "Authentication",
                "APIs",
                "Debugging",
                "Scaffolding",
                "Scaffolding",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "In order to use Mongo with Express, we need a client API for node.",
                "TRUE",
                "FALSE",
                "Can be true or false",
                "Can not say",
                "TRUE",
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
                "Who was developed by Express.Js ?",
                "Larry wall",
                "TJ Holowaychuk",
                "Rob Pike",
                "Rich Hikey",
                "TJ Holowaychuk",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Express.Js was initially released in",
                "November 2010",
                "November 2011",
                "December 2010",
                "December 2011",
                "November 2010",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How to store local variables that can be access within the application?",
                "Config file",
                "Using database",
                "Using app.locals",
                "Using app.storage",
                "Using app.locals",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Where is captured values are populated regarding route parameters are:",
                "req.data",
                "app.locals",
                "req.params",
                "Both A & B",
                "req.params",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How can we create chainable route handlers for a route path in ExpressJs ?",
                "Using app.route()",
                "Using app.routes()",
                "Using app.router()",
                "Using app.routing()",
                "Using app.route()",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is Scaffolding in Express.js?",
                "Yeoman",
                "Express application generator",
                "Handler functions",
                "Both A & B",
                "Both A & B",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What is middleware in ExpressJs ?",
                "function(req){ }",
                "method(req){ }",
                "function(req,res,next){ }",
                "method(req,res,next){ }",
                "function(req,res,next){ }",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Define templating in ExpressJs ?",
                "Pug",
                "EJS",
                "Mustache",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "In ExpressJS, the method app.all(path, callback [, callback ...])",
                "TRUE",
                "FALSE",
                "Can be true or false",
                "Can not say",
                "TRUE",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How to use express js in node?",
                "var = require('express')();",
                "var_require('express')();",
                "var app = require('express')();",
                "None of them",
                "var app = require('express')();",
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
                "What will be the output of the following code in the console?\n" +
                        "File: my_module.js  \n" +
                        "exports.name = 'Zeus';  \n" +
                        "Code:  \n" +
                        "var my_module = require('./mymodule');  \n" +
                        "console.log((function(settings){  \n" +
                        "    return settings.split('').reverse().join('')  \n" +
                        "})(my_module.name));",
                "Error",
                "Zeus",
                "undefined",
                "sueZ",
                "Error",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following function arguments are available to Express.js Route handlers?",
                "req - the request object",
                "res - the response object",
                "next",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following is the correct statement in the context of Express.js?",
                "Express is a minimal and flexible Node.js web application framework.",
                "Express is a minimal and flexible React.js web application framework.",
                "Express is a minimal and flexible Redux.js web application framework.",
                "Express is a minimal and flexible Angular.js web application framework.",
                "Express is a minimal and flexible Node.js web application framework.",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Cookies are the complex, large files/data sent to the server with a client request and stored on the server-side.",
                "This statement is true.",
                "This statement is false.",
                "Can be true or false",
                "Cannot say.",
                "This statement is false.",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "HTTP is stateless.",
                "This statement is true.",
                "This statement is false.",
                "Can be true or false",
                "Cannot say.",
                "This statement is true.",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                " Imagine that you sent following ajax request:\n" +
                        "$.post(\"/process\", {name:'john'}, function(data){\n" +
                        "    // Do some stuff\n" +
                        "});" +
                        " \n" +
                        "What will be the answer from the server?\n" +
                        "Tip: On server side, we have the code which is given below" +
                        " \n" +
                        "Code:\n" +
                        "app.post('/process', function(req, res){\n" +
                        "    var data = '';" +
                        " \n" +
                        "    if(req.xhr){\n" +
                        "        data += 'One';\n" +
                        "    }" +
                        " \n" +
                        "    if(req.body.name){\n" +
                        "        data += 'Two';\n" +
                        "    }" +
                        " \n" +
                        "    res.send(data);\n" +
                        "});",
                "OneTwo'",
                "'One'",
                "'Two'",
                "All of these",
                "OneTwo'",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Express is based on :",
                "Python",
                "React.js",
                "Node.js",
                "C",
                "Node.js",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What web server is Node.js on by default?",
                "Nginx",
                "Npm",
                "Apache",
                "Its own web server",
                "Its own web server",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is the terminal command to run a server file?",
                "node server.js",
                "npm server.js",
                "call app.use()",
                "node run()",
                "node server.js",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What are middleware functions for?",
                "To run the codes, make changes to  the request and response  object, etc.",
                "To use static files in your application.",
                "Both",
                "None of them",
                "To run the codes, make changes to  the request and response  object, etc.",
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
                "All Node.js APIs are:",
                "Synchronous",
                "Asynchronous",
                "Both",
                "Neither of the two.",
                "Both",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "In ExpressJs what is the response that accepts all HTTP methods?",
                "methode app.all(path, callback [,callback...])",
                "methode app.one(path, callback [,callback...])",
                "methode app.many(path, callback [,callback...])",
                "methode app.none(path, callback [,callback...])",
                "methode app.all(path, callback [,callback...])",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "How to install Nodemon using Node.js?",
                "node install nodemon",
                "npm install --save -dev nodemon",
                "node install -g nodemon",
                "node i nodemon",
                "npm install --save -dev nodemon",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What function arguments are available to Express.js Route handlers?",
                "req - the request object",
                "res - the response object",
                "next",
                "All of the above",
                "All of the above",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following is part of the Back end?",
                "HTML",
                "API",
                "CSS",
                "None of them",
                "API",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What is Back End?",
                "It is a framework from NodeJS which is designed flexibly and simply to assist the back end application development stage .",
                "Is part of the application that is visible and used directly by the user ( end-user ).",
                "Is part of a computer system or application that is not directly accessed by the user, is responsible for storing and manipulating data.",
                "It is an open-source and cross-platform runtime environment for JavaScript.",
                "Is part of a computer system or application that is not directly accessed by the user, is responsible for storing and manipulating data.",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What does API stand for?",
                "Application Programming Interface",
                "Application Programmer Interface",
                "Applicator Programmer Interface",
                "Application Programming Internal",
                "Application Programming Interface",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "The task to serve between client and server is a function of ?",
                "CSS",
                "HTML",
                "ExpressJS",
                "API",
                "API",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Below are the advantages of using expressJS in the backend, Except ?",
                "Express can create simple APIs",
                "Easily connect with databases like MySQL and MongoDB",
                "Can create web or application automatically",
                "Easy to configure and customize",
                "Can create web or application automatically",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following must be installed to use expressJS in this workshop?",
                "Adobe Photoshop",
                "Adobe Premiere",
                "Sublime",
                "NodeJS",
                "NodeJS",
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
                "Which of the following statements is correct about Express.JS",
                "Express.JS is a framework for creating HTTP Servers using Node.JS",
                "Express.JS is a javascript runtime environment that runs in an Operating System",
                "Express.JS is a library used to create client side applications",
                "None of them",
                "Express.JS is a framework for creating HTTP Servers using Node.JS",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following commands is correct to install express in a node.js project?",
                "npm install express",
                "npm install -g express",
                "Both",
                "None of them",
                "npm install express",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the code below is correct to import express module inside node.js?",
                "use \"express\"",
                "require(\"express\")",
                "require(\"./express\")",
                "None of them",
                "require(\"express\")",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "To run the HTTP server from the express application instance , what method do we use?",
                "listen",
                "start",
                "run",
                "spin",
                "listen",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What method do we use to respond to the client in HTML which has dynamically rendered content in express?",
                "send",
                "json",
                "render",
                "None of them",
                "render",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How to install the jsonwebtoken package ?",
                "npm i --save jsonwebtoken",
                "npm i --save jwt",
                "npm i --save express-jwt",
                "None of them",
                "npm i --save jsonwebtoken",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "How long is the token generated below?\n" +
                        "const token = jwt.sign(" +
                        "\n" +
                        "{ exp: Math.floor(Date.now() / 1000) + 300, data: user[0], }, secretKey )",
                "300 ms",
                "5 min",
                "5 s",
                "300 s",
                "5 min",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which method of the jsonwebtoken component takes care of determining if a token is valid?",
                "validate",
                "sign",
                "verify",
                "None of them",
                "verify",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What is express-fileupload?",
                "It is a plugin that is mainly used to provide our server with the functionality of creating files on the backend side and saving them on disk",
                "It is a plugin that is mainly used to provide our server with the “Upload File” functionality.",
                "It is a plugin that is mainly used to provide our server with the “Download File” functionality.",
                "None of them",
                "It is a plugin that is mainly used to provide our server with the “Upload File” functionality.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How is Express-fileupload integrated?",
                "node install --save express-fileupload",
                "npm install --load express-fileupload",
                "npm install --save express-fileupload",
                "None of them",
                "npm install --save express-fileupload",
                ""
        );
        final QuizListModel q11 = new QuizListModel(
                 "In the Express-fileupload configuration object, the \"limits\" property is used to:",
                "It is a property that receives a boolean value and prohibits the upload of files when the defined limit is exceeded",
                "It is an object in which we can define, through the “fileSize” attribute, the maximum number of Bytes that the package will allow for file uploads.",
                "Its value will be a string that will be returned to the client when the weight of the file that is trying to be loaded is exceeded.",
                "None of them",
                "It is an object in which we can define, through the “fileSize” attribute, the maximum number of Bytes that the package will allow for file uploads.",
                ""
        );
        final QuizListModel q12 = new QuizListModel(
                "The proper way to occupy the body-parser component is:",
                "app.get(bodyParser.urlencoded({ extended: true })); app.get(bodyParser.json());",
                "app.use(bodyParser.urlencoded({ extended: true })); app.use(bodyParser.json());",
                "app.activate(bodyParser.urlencoded({ extended: true })); app.activate(bodyParser.json());",
                "None of them",
                "app.use(bodyParser.urlencoded({ extended: true })); app.use(bodyParser.json());",
                ""
        );
        final QuizListModel q13 = new QuizListModel(
                "The correct way to delete an image file on the server (from the Express.js environment), could be:",
                "fs.delete(`${__dirname}/public/images/${name}.jpg`, (err) => { res.send(`Image ${name} deleted successfully`);",
                "fs.erase(`${__dirname}/public/images/${name}.jpg`, (err) => { res.send(`Image ${name} was deleted successfully`);",
                "fs.unlink(`${__dirname}/public/images/${name}.jpg`, (err) => { res.send(`Image ${name} was successfully removed`);",
                "None of them",
                "fs.unlink(`${__dirname}/public/images/${name}.jpg`, (err) => { res.send(`Image ${name} was successfully removed`);",
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
                "The _______ directory contains your project’s cache, session and log data.",
                "Database",
                "Public",
                "Resources",
                "Storage",
                "Storage",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Laravel is based on___________________",
                "MVVM Design Pattern",
                "Composite Design Pattern",
                "MVC Design Pattern",
                "Singleton Design Pattern",
                "MVC Design Pattern",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which one Laravel command line interface?",
                "composer",
                "php artisan",
                "git",
                "CLI",
                "php artisan",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of following command is used to remove the compiled class file in Laravel?",
                "php artisan clear-compiled",
                "php artisan down",
                "php artisan clear-class",
                "php artisan inspire",
                "php artisan clear-compiled",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "How to define an mutator in Laravel?",
                "setNameAttribute method inside controller",
                "setNameAttribute method inside model",
                "setMutator method inside controller",
                "None of them",
                "setNameAttribute method inside model",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Does Laravel Support Caching?",
                "Yes",
                "No",
                "May be",
                "None of them",
                "Yes",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Where do we need to set database connection in Laravel?",
                "config.php",
                "setting.php",
                ".ENV file",
                "In seed files",
                ".ENV file",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "What would this touch() function do? $obj= User::find(1); $obj->touch();",
                "store a user object in cache",
                "created a new filed in database",
                "update updated_at to current timestamp",
                "None of the Above",
                "update updated_at to current timestamp",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which command is used to start laravel server?",
                "php artisan serve",
                "php artisan project_name",
                "php artisan start php",
                "artisan start-server",
                "php artisan serve",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which command is used to create a new project in Laravel?",
                "php composer.phar create-project --pref-dist laravel/laravel lar-project \"5.7.*\"",
                "php composer.phar create-project --prefer-dist laravel/laravel lar-project \"5.7.*\"",
                "php compose.phar create-project --prefer-dist laravel/laravel lar-project \"5.7.*\"",
                "php composer.phar create-project --prefer-di laravel/laravel lar-project \"5.7.*\"",
                "php composer.phar create-project --prefer-dist laravel/laravel lar-project \"5.7.*\"",
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
                "Composer is a tool for ______ in PHP.",
                "Interpolation",
                "configuration",
                "dependency management",
                "None of the above",
                "dependency management",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "What is it Blade?",
                "Template Engine",
                "package",
                "view file",
                "framework",
                "Template Engine",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Where is routing file located in Laravel?",
                "public/",
                "routes/",
                "view/",
                "None of the above",
                "routes/",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which command is used to create migrations in Laravel?",
                "php artisan make:migration create_users_table",
                "php artisan make:migrate create_users_table",
                "php artisan migration create_users_table",
                "All are Correct",
                "php artisan make:migration create_users_table",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "The vendor directory contains ___.",
                "Third-party code",
                "Configuration files",
                "Assets",
                "Laravel Framework code",
                "Third-party code",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of following Collection method returns all records from Laravel collection?",
                "->get()",
                "whereAll()",
                "->where()",
                "->all()",
                "->all()",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which one of the following command is used to create middleware in Laravel?",
                "php artisan: middleware",
                "php artisan make: middleware",
                "php arti make: middleware",
                "None of the above",
                "php artisan make: middleware",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How to remove a complied class file?",
                "clear-compiled command",
                "flush-compiled command",
                "cache-compiled command",
                "All are Correct",
                "clear-compiled command",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "What do you mean by dd() function?",
                "The full form of dd is Date and Day.",
                "The full form of dd is Directory and Door.",
                "The full form of dd is Diel and Deal.",
                "The full form of dd is Dump and Die.",
                "The full form of dd is Dump and Die.",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following function in Laravel checks that the desired table is exists in the database or not?",
                "hasTab()",
                "hashTable()",
                "hasTable()",
                "None of the above",
                "hasTable()",
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
                "Which class is used in Laravel to handle exceptions?",
                "App\\Exceptions\\Handler",
                "App\\Exception\\Handler",
                "App\\Exceptions\\Handle",
                "None of the above",
                "App\\Exceptions\\Handler",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which method is used in Laravel to method to check request is ajax or not?",
                "$request->ajaxRun()",
                "$request->ajaxs()",
                "$request->ajax()",
                "None of the above",
                "$request->ajax()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Laravel is written in __ language.",
                "PHP",
                "JSP",
                "ASP",
                "All are Correct",
                "PHP",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Query scope is a feature of Laravel where we can ____.",
                "reuse similar queries",
                "routes queries",
                "seed queries",
                "None of the above",
                "reuse similar queries",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "In which directory controllers are kept in Laravel?",
                "app/http/Views",
                "app/http/Controllers",
                "app/http/Model",
                "app/http/routes",
                "app/http/Controllers",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How to get current environment in Laravel?",
                "$environment = App::environment();",
                "$environment = App::environ();",
                "$environment = App::environments();",
                "None of the above",
                "$environment = App::environment();",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "In Laravel, @yield used for?",
                "to extend an layout",
                "to include a file",
                "to display the contents of a given section",
                "None of the above",
                "to display the contents of a given section",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "After running \"artisan down\", The project will show the maintenance page. What would be HTTP Status return Code?",
                "400",
                "503",
                "501",
                "None",
                "503",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which directory contains “robot.txt” file ?",
                "public",
                "route",
                "view",
                "All are Correct",
                "public",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "How to get current route name?",
                "request()->route->getName()",
                "request()->getName()",
                "request()->route()->getName()",
                "None of them",
                "request()->route()->getName()",
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
                "What is the minimum PHP version required to install Laravel 5.3?",
                "5.6.4",
                "5.4.3",
                "5.4.1",
                "None of the above",
                "5.6.4",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "How to get current action name in Laravel?",
                "request()->getActionMethod()",
                "request()->route()->getActionMethod()",
                "request()->DB->getActionMethod()",
                "None of the above",
                "request()->route()->getActionMethod()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What is the latest version of Laravel?er 2020.",
                "8.0, released on 8th September",
                "7.0, released on 8th September",
                "6.0, released on 8th September",
                "None of the above",
                "8.0, released on 8th September",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "When was Laravel first released?",
                "June 2009",
                "June 2011",
                "June 2007",
                "All are Correct",
                "June 2011",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What does ORM stands for in laravel?",
                "Object-Rotational Mechanism",
                "Overloaded-relational Mapping",
                "Object-relational Mapping",
                "Object-related Modifier",
                "Object-relational Mapping",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How to check current laravel version install your system?",
                "php artisan check --version",
                "php artisan make --version",
                "php artisan --version",
                "None of the above",
                "php artisan --version",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Controller is create in laravel by using ____ command.",
                "php artisan make:controller --plain",
                "php artisan make:request controller_name create",
                "php artisan make: generate controller contoller_name",
                "php artisan make:controller generate",
                "php artisan make:controller --plain",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How to set a session data in Laravel?",
                "$request->session()->set('key', 'value');",
                "$request->session()->put('key', 'value');",
                "$request->db->session('key', 'value');",
                "None of These",
                "$request->session()->put('key', 'value');",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Interpolation of variable in laravel is done using ___.",
                "{{}}",
                "compact",
                "helpers",
                "None of the above",
                "{{}}",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following methods are used in Database Migrations classes?",
                "execute() and rollback()",
                "save() and update()",
                "up() and down()",
                " run() and delete()",
                "up() and down()",
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
                "If you want to customize what file is generated via \"php artisan make:model\" command, what Artisan command you need to run?",
                "php artisan stub:publish",
                "php artisan make:publish",
                "php artisan model:publish",
                "php artisan publish",
                "php artisan stub:publish",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Look at the code snippet. From Laravel 7, you can prepare your own casting mechanism, in a class. What should be the name of the methods, behind XXXXXXXX?\n" +
                        "class Json implements CastsAttributes" +
                        "{\n" +
                        "    /**\n" +
                        "     * Cast the given value.\n" +
                        "     */\n" +
                        "    public function XXXXXXXX($model, $key, $value, $attributes)\n" +
                        "    {\n" +
                        "        return json_decode($value, true);\n" +
                        "    }" +
                        "\n" +
                        "    /**\n" +
                        "     * Prepare the given value for storage.\n" +
                        "     */\n" +
                        "    public function XXXXXXXX($model, $key, $value, $attributes)\n" +
                        "    {\n" +
                        "        return json_encode($value);\n" +
                        "    }\n" +
                        "}",
                "put() and pull()",
                "in() and out()",
                "from() and to()",
                "get() and set()",
                "get() and set()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "What new array appeared in Laravel 7 in config/mail.php to configure multiple mail drivers?",
                "drivers",
                "vendors",
                "mailers",
                "services",
                "mailers",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "What is the name of a new package for SPA Authentication that came out with Laravel 7?",
                "Laravel Airwave",
                "Laravel Sanctum",
                "Laravel Dusk",
                "Laravel Cors",
                "Laravel Sanctum",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Route Model Binding in Laravel 7 gives us the ability to customize the field for the binding directly in the routes, instead of default \"id\". Look at the code snippet - what would you change to have post \"slug\" as a field for binding?\n" +
                        "Route::get('api/posts/{post}', function (App\\Post $post) {\n" +
                        "    return $post;\n" +
                        "});",
                "{post} to {slug}",
                "{post} to {post:slug}",
                "{post} to {post}/{slug}",
                "\"return $post\" to \"return $post->slug\"",
                "{post} to {post:slug}",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Laravel 7 now includes first-party support for... what?",
                "CORS",
                "Email sending",
                "Tailwind UI",
                "Algolia",
                "CORS",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "In Laravel 7, you don't need to manually install Guzzle to make external requests. Look at the code snippet - what is hiding behind XXXXXXXX?\n" +
                        "use Illuminate\\Support\\Facades\\XXXXXXXX;\n" +
                        "// ...\n" +
                        "$response = XXXXXXXX::get('http://test.com');",
                "Guzzle",
                "Request",
                "Http",
                "Response",
                "Http",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Look at the code snippet for a Job. From Laravel 7, you can customize that command should fail if the retries are triggered by a given number of exceptions. What's the variable name behind XXXXXXXX?\n" +
                        "namespace App\\Jobs;" +
                        "\n" +
                        "class ProcessPodcast implements ShouldQueue" +
                        "{\n" +
                        "    /**\n" +
                        "     * The number of times the job may be attempted.\n" +
                        "     */\n" +
                        "    public $tries = 25;" +
                        "\n" +
                        "    /**\n" +
                        "     * The maximum number of exceptions to allow before failing.\n" +
                        "     */\n" +
                        "    public $XXXXXXXX = 3;",
                "maxErrors",
                "maxExceptions",
                "maxLimit",
                "maxFailures",
                "maxExceptions",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which new Artisan command appeared in Laravel 7?",
                "php artisan make:component",
                "php artisan test",
                "php artisan version",
                "php artisan blade",
                "php artisan test",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "With Blade Components: if the component is defined in a class \"class Alert extends Component\", how that component can be called from Blade tag?",
                "<x-alert />",
                "<alert />",
                "<Alert />",
                "<blade-alert />",
                "<x-alert />",
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
                "Which of the following is correct about jQuery?",
                "The jQuery made it easy to select DOM elements, traverse them and modifying their content by using cross-browser open source selector engine called Sizzle.",
                "The jQuery helps you a lot to develop a responsive and feature-rich site using AJAX technology.",
                "The jQuery comes with plenty of built-in animation effects which you can use in your websites.",
                "All of the above.",
                "All of the above.",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which of the following is correct about callbacks?",
                "A callback is a plain JavaScript function passed to some method as an argument or option.",
                "Some callbacks are just events, called to give the user a chance to react when a certain state is triggered.",
                "Both of the above.",
                "None of the above.",
                "Both of the above.",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which of the following jQuery selector selects all elements available in a DOM?",
                "$('*')",
                "$('?')",
                "$('#')",
                "None of the above.",
                "$('*')",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following jQuery method sets attributes of an element?",
                "attr(name, value)",
                "setAttr(name, value)",
                "setAttributes(name, value)",
                "None of the above.",
                "attr(name, value)",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Which of the following jQuery method checks the current selection against an expression?",
                "getIs( selector )",
                "is( selector )",
                "checkIs( selector )",
                "None of the above.",
                "is( selector )",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "Which of the following jQuery method finds all sibling elements after the current element?",
                "locateNextAll( selector )",
                "getNextAll( selector)",
                "nextAll( selector )",
                "None of the above.",
                "nextAll( selector )",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "Which of the following jQuery method gets a set of elements containing all of the unique siblings of each of the matched set of elements?",
                "parents( selector )",
                "prevAll( selector)",
                "siblings( selector )",
                "None of the above.",
                "siblings( selector )",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Which of the following jQuery method removes all child nodes from the set of matched elements?",
                "empty( )",
                "delete( )",
                "remove( expr )",
                "None of the above.",
                "empty( )",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Which of the following jQuery method can be used to attach a function to be executed whenever an AJAX request fails?",
                "ajaxStart( callback )",
                "ajaxComplete( callback )",
                "ajaxSend( callback )",
                "ajaxError(callback)",
                "ajaxError(callback)",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which of the following jQuery method serializes all forms and form elements like the .serialize() method but returns a JSON data structure for you to work with?",
                "jQuery.ajax( options )",
                "jQuery.ajaxSetup( options )",
                "serialize( )",
                "serializeArray( )",
                "serializeArray( )",
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
                "________________ is use for alternately expand and collapse a page element",
                ".hover()",
                "stopPropagation()",
                ".toggle()",
                ".trigger()",
                ".trigger()",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "jQuery ______is used to set/return arbitrary data to/from an element.",
                ".data()",
                ".item()",
                ".all",
                "All of these",
                ".data()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "The ________ method acts on JQuery objects and translate the match DOM element into query string that can be pass along with AJAX request.",
                ".serialize()",
                ".serializeAll()",
                ".synchronized()",
                "none of these",
                ".serialize()",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "Which of the following method is used to hide the selected elements?",
                "visible(false)",
                "hidden()",
                "display(none)",
                "hide()",
                "hide()",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "What is the file size of minified version of jQuery.x.x.x-min.js?",
                "178KB",
                "76.7 KB",
                "180 KB",
                "None of these",
                "76.7 KB",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "How many ways are there to change the width of the element in jquery.",
                "Two",
                "Three",
                "Four",
                "None of these",
                "Two",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What does .size() method of jquery returns?",
                "No. of variable in object",
                "No. of element in object",
                "Both a and b",
                "None of these",
                "No. of element in object",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Jquery is a library for _______ scripting",
                "Client",
                "Server",
                "Both a and b",
                "None of these",
                "Client",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "CDN stands for_______",
                "Common Distribution Network",
                "Collective Distribution Network",
                "Content Distribution Network",
                "None of these",
                "Content Distribution Network",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Highlight page element under mouse cursor by using ________",
                ".hover()",
                "stopPropagation()",
                ".toggle()",
                ".trigger()",
                ".hover()",
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
                "jquery written in which scripting language?",
                "VBscript",
                "java script",
                "HTML",
                "None of these",
                "java script",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "1)jquery.size() 2) jquery.length Which is faster?",
                "1",
                "2",
                "Both",
                "None of them",
                "2",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "The ______ Method acts as explicit iterator",
                ".hover()",
                ".all()",
                ".toggle()",
                ".each()",
                ".each()",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "How many types of selectors available in jquery",
                "1",
                "2",
                "3",
                "4",
                "3",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "By default .clone() method copy any event",
                "Yes",
                "No",
                "Nothing",
                "None of them",
                "No",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "There are how many ways to check or unchecked the radio button",
                "1",
                "2",
                "3",
                "4",
                "2",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "To deal with cookies in jQuery we have to use ______ cookie plugin",
                "Dough",
                "Session",
                "Dazzler",
                "None of these",
                "Dough",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "Using ________ function, we can hold or release the execution of jQuery’s ready event",
                "jQuery.ready()",
                "jQuery.holdReady()",
                "jQuery.hold()",
                "jQuery.holdready()",
                "jQuery.holdReady()",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "The ________ method works for accepting an array of DOM elements and pushes them into a stack",
                "push()",
                "pop()",
                "pushStack()",
                "popStack()",
                "pushStack()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which method is provided by the jquery to create our own custom animation with fine-grained control",
                ".animation()",
                "stopPropagation()",
                ".toggle()",
                ".animate()",
                ".animate()",
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
                "Use __________ event handlers to reach to a user click on page element with .bind() or .click().",
                "mouse",
                "windows",
                "click",
                "None of these",
                "mouse",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Jquery library is ____________ file.",
                ".html",
                ".XML",
                ".js",
                ".lib",
                ".js",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "jquery has _______ method for inserting element before other element.",
                "1",
                "2",
                "3",
                "4",
                "2",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "For the purposes of selecting specific class, class must contain prefix as “__“.",
                "$",
                "#",
                ".",
                "%",
                ".",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "AHAH means ________",
                "Asynchronous HTTP and HTML",
                "Asynchronous HTTP and HTTPs",
                "Alternate HTTP and HTML",
                "None of these",
                "Asynchronous HTTP and HTML",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "For coping the element ________ method is used.",
                ".copy()",
                ".clone()",
                ".coping()",
                "None of these",
                ".clone()",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "In which version of the jquery, efficiency of the web page increased",
                "minified version",
                "normal version",
                "Both",
                "None of them",
                "minified version",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "The .each method is the more convenient form of _______ loop.",
                "do while",
                "for",
                "for each",
                "None of these",
                "for",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Multiple javascript library coexist on single page using ___________________",
                "conflict()",
                "noConflict()",
                "unbind()",
                "die()",
                "noConflict()",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "Which statement is true?",
                "To use jQuery, you do not have to do anything. Most browsers (Internet Explorer, Chrome, Firefox and Opera) have the jQuery library built in the browser",
                "To use jQuery, you can refer to a hosted jQuery library at Google",
                "To use jQuery, you must buy the jQuery library at www.jquery.com",
                "None of them",
                "To use jQuery, you can refer to a hosted jQuery library at Google",
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
                "What scripting language is jQuery written in?",
                "C#",
                "VBScript",
                "JavaScript",
                "C++",
                "JavaScript",
                ""
        );
        final QuizListModel q2 = new QuizListModel(
                "Which jQuery function is used to prevent code from running, before the document is finished loading?",
                "$(document).load()",
                "$(document).ready()",
                "$(body).onload()",
                "None of them",
                "$(document).ready()",
                ""
        );
        final QuizListModel q3 = new QuizListModel(
                "Which jQuery method should be used to deal with name conflicts?\n" +
                        "What is the following code for:\\n\" +\n" +
                        "   \"$( document ).ready( function (){\" +\n" +
                        "   \" \\n\" +\n" +
                        "   \"\\\\\\n // Actions to execute\\n\" +\n" +
                        "   \"});",
                "To save to disk the result of an execution of a list of actions.",
                "To  wait for the document to be fully loaded and ready before working on it",
                "To select the entire DOM document and generate an effect",
                "None of them",
                "To  wait for the document to be fully loaded and ready before working on it",
                ""
        );
        final QuizListModel q4 = new QuizListModel(
                "In JQuery, the show() effect :",
                "Show selected items",
                "Animate selected elements",
                "Hide selected items",
                "Show matching elements, dimming them to opaque",
                "Show selected items",
                ""
        );
        final QuizListModel q5 = new QuizListModel(
                "Use the correct selector to hide an element with id-\"test\".\n" +
                        "$(\" \").hide();",
                ".test",
                "#test",
                "id.test",
                "id#test",
                "#test",
                ""
        );
        final QuizListModel q6 = new QuizListModel(
                "What event is used to hide all elements with a \"click\" ?\n" +
                        "$(\"p\").evento(function(){" +
                        " \n" +
                        "\\\n $(this).hide();\n" +
                        "});",
                "show",
                "hide",
                "click",
                "toggle",
                "click",
                ""
        );
        final QuizListModel q7 = new QuizListModel(
                "What does the $(this) selector allow you to do?",
                "Select multiple elements with the same class",
                "Select the particular element that triggered the event handler, without referring to an ID",
                "Select multiple elements with the same ID",
                "Select an element by its ID and not its class",
                "Select the particular element that triggered the event handler, without referring to an ID",
                ""
        );
        final QuizListModel q8 = new QuizListModel(
                "How do I set the background of all paragraphs to red?",
                "$(\"p\").css(\"background-color\", \"red\");",
                "$(\"p\").css(background-color : \"red\");",
                "$(\"p\").css(\"background-color : red\");",
                "$(\"p\").css(\"color: red\");",
                "$(\"p\").css(\"background-color\", \"red\");",
                ""
        );
        final QuizListModel q9 = new QuizListModel(
                "Each odd table row can be selected with...",
                "$('tr:nth-child(odd)')",
                "$('tr:nth-child(even)')",
                "$('tr:nth-child(2)')",
                "$('tr').row()",
                "$('tr:nth-child(odd)')",
                ""
        );
        final QuizListModel q10 = new QuizListModel(
                "What statement can be used to make a visible element invisible and an invisible element visible?",
                "$('#my-element').switch();",
                "$('#my-element').change();",
                "You can't do that, you have to write a JavaScript function for that.",
                "$('#my-element').toggle();",
                "$('#my-element').toggle();",
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
            //EmberJsQuiz
            case "EmberJs Quiz 1":
                return EmberJsQuiz1();
            case "EmberJs Quiz 2":
                return EmberJsQuiz2();
            case "EmberJs Quiz 3":
                return EmberJsQuiz3();
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

            default:
                return defaultQuestions();

        }
    }


}
