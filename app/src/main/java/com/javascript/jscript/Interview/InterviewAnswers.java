package com.javascript.jscript.Interview;

public class InterviewAnswers {
    public static final String What_is_JavaScript = "JavaScript is a client-side and server-side \nscripting language " +
            "inserted into HTML pages and is \nunderstood by web browsers. JavaScript is \nalso an Object-based Programming language";
    public static final String WhatareJavaScriptDataTypes ="Following are the JavaScript Data types:\n" +
            "\n" +
            "Number\n" +
            "String\n" +
            "Boolean\n" +
            "Object\n" +
            "Undefined";
    public static final String WhatistherealnameofJavaScript ="The original name was Mocha, a name chosen by Marc Andreessen, founder of Netscape. In September of 1995, the name was changed to LiveScript. In December 1995, after receiving a trademark license from Sun, the name JavaScript was adopted.";
    public static final String EnumeratethedifferencesbetweenjavaandJavaScript ="Java is a complete programming language. In contrast, JavaScript is a coded program that can be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for different intent. Java is an object-oriented programming (OOPS) or structured programming languages like C++ or C, whereas JavaScript is a client-side scripting language.";
    public static final String WhatistheuseofisNaNfunction ="isNan function returns true if the argument is not a number; otherwise, it is false.";
    public static final String WhichisfasterbetweenjavaScriptandanASP ="JavaScript is faster. JavaScript is a client-side language,, and thus it does not need the assistance of the webserver to execute. On the other hand, ASP is a server-side language and hence is always slower than JavaScript. Javascript now is also a server-side language (nodejs).";
    public static final String WhatisnegativeInfinity ="Negative Infinity is a number in JavaScript which can be derived by dividing negative number by zero.";
    public static final String IsitpossibletobreakJavaScriptCode ="Breaking within a string statement can be done by using a backslash, ‘\\,’ at the end of the first line.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "document. Write (\"This is \\a program,\");\n" +
            "And if you change to a new line when not within a string statement, then javaScript ignores the break in the line.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "var x=1, y=2,\n" +
            "z=\n" +
            "x+y;\n" +
            "The above code is perfectly fine, though not advisable as it hampers debugging.";
    public static final String WhichcompanydevelopedJavaScript ="Netscape is the software company that developed JavaScript.";
    public static final String Whatareundeclaredandundefinedvariables ="Undeclared variables are those that do not exist in a program and are not declared. If the program tries to read the value of an undeclared variable, then a runtime error is encountered.\n" +
            "\n" +
            "Undefined variables are those that are declared in the program but have not been given any value. If the program tries to read the value of an undefined variable, an undefined value is returned.";
    public static final String Writethecodeforaddingnewelementsdynamically = "<html> \n" +
            "<head> \n" +
            "<title>t1</title> \n" +
            "<script type=\"text/javascript\"> \n" +
            "    function addNode () { var newP = document. createElement(\"p\"); \n" +
            "    var textNode = document.createTextNode(\" This is a new text node\"); \n" +
            "    newP.appendChild(textNode); document.getElementById(\"firstP\").appendChild(newP); } \n" +
            "</script> </head> \n" +
            "<body> <p id=\"firstP\">firstP<p> </body> \n" +
            "</html>";
    public static final String WhatareglobalvariablesHowarethesevariabledeclared = "Global variables are available throughout the length of the code so that it has no scope. The var keyword is used to declare a local variable or object. If the var keyword is omitted, a global variable is declared.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "// Declare a global: globalVariable = “Test”;\n" +
            "\n" +
            "The problems faced by using global variables are the clash of variable names of local and global scope. Also, it is difficult to debug and test the code that relies on global variables.";
    public static final String Whatisapromptbox = "A prompt box is a box that allows the user to enter input by providing a text box. A label and box will be provided to enter the text or number.";
    public static final String WhatisthiskeywordinJavaScript = "‘This’ keyword refers to the object from where it was called.";
    public static final String WhatistheworkingoftimersinJavaScript = "Timers are used to execute a piece of code at a set time or repeat the code in a given interval. This is done by using the functions setTimeout, setInterval, and clearInterval.\n" +
            "\n" +
            "The setTimeout(function, delay) function is used to start a timer that calls a particular function after the mentioned delay. The setInterval(function, delay) function repeatedly executes the given function in the mentioned delay and only halts when canceled. The clearInterval(id) function instructs the timer to stop.\n" +
            "\n" +
            "Timers are operated within a single thread, and thus events might queue up, waiting to be executed.";
    public static final String WhichsymbolisusedforcommentsinJavascript = "// for Single line comments and\n" +
            "\n" +
            "/* Multi\n" +
            "\n" +
            "Line\n" +
            "\n" +
            "Comment\n" +
            "\n" +
            "*/";
    public static final String WhatisthedifferencebetweenViewStateandSessionState = "‘ViewState’ is specific to a page in a session.\n" +
            "‘SessionState’ is specific to user-specific data that can be accessed across all web application pages.";
    public static final String Whatisoperator = "=== is called a strict equality operator, which returns true when the two operands have the same value without conversion.";
    public static final String Howcanthestyleclassofanelementbechanged = "It can be done in the following way:\n" +
            "\n" +
            "document.getElementById(\"myText\"). style. fontSize = \"20\";\n" +
            "or\n" +
            "\n" +
            "document. getElementById (\"myText\"). className = \"anyclass\";";
    public static final String WhatarealltheloopingstructuresinjavaScript = "Following are looping structures in Javascript:\n" +
            "\n" +
            "For\n" +
            "While\n" +
            "Do-while loops";
    public static final String WhatiscalledVariabletypinginJavascript = "Variable typing is used to assign a number to a variable. The same variable can be assigned to a string.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "i = 10;\n" +
            "i = \"string;\"\n" +
            "This is called variable typing.";
    public static final String Whatwouldbetheresultof = "Since 3 and 2 are integers, they will be added numerically. And since 7 is a string, its concatenation will be done. So the result would be 57.";
    public static final String Whatisthefunctionofthedeleteoperator = "The delete keyword is used to delete the property as well as its value.\n" +
            "\n" +
            "Example\n" +
            "\n" +
            "var student= {age:20, batch:\"ABC\"};\n" +
            "Delete student. age;";
    public static final String WhatisanundefinedvalueinJavaScript = "Undefined value means the\n" +
            "\n" +
            "Variable used in the code doesn’t exist\n" +
            "Variable is not assigned to any value\n" +
            "Property does not exist.";
    public static final String WhatareallthetypesofPopupboxes = "Alert\n" +
            "Confirm and\n" +
            "Prompt";
    public static final String WhatisthedatatypeofvariablesinJavaScript = "All variables in JavaScript are object data types.";
    public static final String answer = "";




}
