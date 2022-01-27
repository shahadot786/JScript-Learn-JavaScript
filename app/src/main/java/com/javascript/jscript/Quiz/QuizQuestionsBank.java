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
