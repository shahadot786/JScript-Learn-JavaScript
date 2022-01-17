package com.javascript.jscript.Interview;

public class InterviewAnswers {
    public static final String What_is_JavaScript = "JavaScript is a client-side and server-side \nscripting language " +
            "inserted into HTML pages and is \nunderstood by web browsers. JavaScript is \nalso an Object-based Programming language";
    public static final String WhatareJavaScriptDataTypes = "Following are the JavaScript Data types:\n" +
            "\n" +
            "Number\n" +
            "String\n" +
            "Boolean\n" +
            "Object\n" +
            "Undefined";
    public static final String WhatistherealnameofJavaScript = "The original name was Mocha, a name chosen by Marc Andreessen, founder of Netscape. In September of 1995, the name was changed to LiveScript. In December 1995, after receiving a trademark license from Sun, the name JavaScript was adopted.";
    public static final String EnumeratethedifferencesbetweenjavaandJavaScript = "Java is a complete programming language. In contrast, JavaScript is a coded program that can be introduced to HTML pages. These two languages are not at all inter-dependent and are designed for different intent. Java is an object-oriented programming (OOPS) or structured programming languages like C++ or C, whereas JavaScript is a client-side scripting language.";
    public static final String WhatistheuseofisNaNfunction = "isNan function returns true if the argument is not a number; otherwise, it is false.";
    public static final String WhichisfasterbetweenjavaScriptandanASP = "JavaScript is faster. JavaScript is a client-side language,, and thus it does not need the assistance of the webserver to execute. On the other hand, ASP is a server-side language and hence is always slower than JavaScript. Javascript now is also a server-side language (nodejs).";
    public static final String WhatisnegativeInfinity = "Negative Infinity is a number in JavaScript which can be derived by dividing negative number by zero.";
    public static final String IsitpossibletobreakJavaScriptCode = "Breaking within a string statement can be done by using a backslash, ‘\\,’ at the end of the first line.\n" +
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
    public static final String WhichcompanydevelopedJavaScript = "Netscape is the software company that developed JavaScript.";
    public static final String Whatareundeclaredandundefinedvariables = "Undeclared variables are those that do not exist in a program and are not declared. If the program tries to read the value of an undeclared variable, then a runtime error is encountered.\n" +
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
    public static final String Whatisbreakandcontinuestatements = "Break statement exits from the current loop.\n" +
            "\n" +
            "Continue statement continues with next statement of the loop.";
    public static final String Whatarethetwobasicgroupsofdatatypes = "They are as—Primitive\n" +
            "Reference types\n" +
            "Primitive types are number and Boolean data types. Reference types are more complex types like strings and dates.";
    public static final String Whatistheuseofatypeofoperator = "‘Typeof’ is an operator used to return a string description of the type of a variable.";
    public static final String Whichkeywordisusedtoprintthtextonthescreen = "Document. Write (“Welcome”) is used to print the text–Welcome on the screen.";
    public static final String Whatisvariabletyping = "Variable typing assigns a number to a variable and then assigns a string to the same variable. An example is as follows:\n" +
            "\n" +
            "i= 8;\n" +
            "i=\"anne moore\";";
    public static final String WhatisthedifferencebetweenJavaScriptandJscript = "Both are almost similar. Netscape and Jscript develop JavaScript was developed by Microsoft.";
    public static final String WhatisthewaytogetthestatusofaCheckBox = "The status can be acquired as follows –\n" +
            "\n" +
            " alert(document.getElementById('checkbox1').checked); \n" +
            "If the CheckBox is checked, this alert will return TRUE.";
    public static final String WhatisforinloopinJavascript = "The for-in loop is used to loop through the properties of an object.\n" +
            "\n" +
            "The syntax for the for-in loop is –\n" +
            "\n" +
            "for (variable name in object){\n" +
            "    statement or block to execute\n" +
            "}";
    public static final String ExplainPopupMessageusingeventwithexample = "Display a simple message “Welcome!!!” on your demo webpage and when the user hovers over the message, a popup should be displayed with a message “Welcome to my WebPage!!!”.\n" +
            "\n" +
            "Example:\n\n" +
            "<html>\n" +
            "    <head>\n" +
            "\n" +
            "    <title>Event!!!</title>\n" +
            "\n" +
            "    <script type=\"text/javascript\">\n" +
            "\n" +
            "    function trigger()\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "    document.getElementById(\"hover\").addEventListener(\"mouseover\", popup);\n" +
            "\n" +
            "    function popup()\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "    alert(\"Welcome to my WebPage!!!\");\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    </script>\n" +
            "\n" +
            "    <style>\n" +
            "\n" +
            "    p{\n" +
            "         font-size:50px;\n" +
            "         position: fixed;\n" +
            "         left: 550px;\n" +
            "         top: 300px;\n" +
            "    }\n" +
            "    </style>\n" +
            "    </head>\n" +
            "    <body  onload=\"trigger();\">\n" +
            "    <p id=\"hover\">Welcome!!!</p>\n" +
            "    </body>\n" +
            "    </html>";
    public static final String Defineanonymousfunction = "It is a function that has no name. These functions are declared dynamically at runtime using the function operator instead of the function declaration. The function operator is more flexible than a function declaration. It can be easily used in the place of an expression. For example:\n" +
            "\n" +
            "var display=function()  \n" +
            "{  \n" +
            "  alert(\"Anonymous Function is invoked\");  \n" +
            "}  \n" +
            "display();  ";
    //advanced
    public static final String HowyoucansubmitaformusingJavaScript = "To submit a form using JavaScript use\n" +
            "\n" +
            "document.form[0].submit();\n" +
            "document.form[0].submit();";
    public static final String DoesJavaScriptsupportautomatictypeconversion = "Yes, JavaScript does support automatic type conversion. It is the common way of type conversion used by JavaScript developers";
    public static final String HowtoreadandwriteafileusingJavaScript = "There are two ways to read and write a file using JavaScript\n" +
            "\n" +
            "Using JavaScript extensions\n" +
            "Using a web page and Active X objects";
    public static final String HowcanyouconvertthestringofanybasetoanintegerinJavaScript = "The parseInt() function is used to convert numbers between different bases. parseInt() takes the string to be converted as its first parameter. The second parameter is the base of the given string.\n" +
            "\n" +
            "To convert 4F (or base 16) to integer, the code used will be –\n" +
            "\n" +
            "parseInt (\"4F\", 16);";
    public static final String answer40 = "“==” checks only for equality in value, whereas “===” is a stricter equality test and returns false if either the value or the type of the two variables are different.";
    public static final String answer41 = "In order to detect the operating system on the client machine, the navigator. Platform string (property) should be used.";
    public static final String answer42 = "The NULL value is used to represent no value or no object. It implies no object or null string, no valid boolean value, no number, and no array object.";
    public static final String answer43 = "Void(0) is used to prevent the page from refreshing, and parameter “zero” is passed while calling.\n" +
            "\n" +
            "Void(0) is used to call another method without refreshing the page.";
    public static final String answer44 = "The following code has to be inserted to achieve the desired effect:\n" +
            "\n" +
            "<script language=\"JavaScript\" type=\"text/javascript\" >\n" +
            "<!-- location. href=\"http://newhost/newpath/newfile.html\"; //--></script>";
    public static final String answer45 = "An alert box displays only one button, which is the OK button.\n" +
            "\n" +
            "But a Confirmation box displays two buttons, namely OK and cancel.";
    public static final String answer46 = "Escape characters (Backslash) is used when working with special characters like single quotes, double quotes, apostrophes, and ampersands. Place backslash before the characters to make it display.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "document. write \"I m a \"good\" boy.\"\n" +
            "document. write \"I m a \\\"good\\\" boy.\"";
    public static final String answer47 = "Cookies are the small test files stored in a computer, and they get created when the user visits the websites to store information that they need. Examples could be User Name details and shopping cart information from previous visits.";
    public static final String answer48 = "The pop() method is similar to the shift() method, but the difference is that the Shift method works at the array’s start. The pop() method takes the last element off of the given array and returns it. The array on which it is called is then altered.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "var cloths = [\"Shirt\", \"Pant\", \"TShirt\"];\n" +
            "cloths.pop();\n" +
            "//Now cloth becomes Shirt,Pant";
    public static final String answer49 = "No. JavaScript does not have concept-level scope. The variable declared inside the function has scope inside the function.";
    public static final String answer50 = "If you use innerHTML in JavaScript, the disadvantage is\n" +
            "\n" +
            "Content is replaced everywhere\n" +
            "We cannot use it like “appending to innerHTML\n" +
            "Even if you use +=like “innerHTML = innerHTML + ‘html'” still the old content is replaced by html\n" +
            "The entire innerHTML content is re-parsed and builds into elements. Therefore, it’s much slower\n" +
            "The innerHTML does not provide validation, and therefore we can potentially insert valid and broken HTML in the document and break it";
    public static final String answer51 = "Generic objects can be created as:\n" +
            "\n" +
            "var I = new object();";
    public static final String answer52 = "Try… Catch—finally is used to handle exceptions in the JavaScript\n" +
            "\n" +
            "Try{\n" +
            "    Code\n" +
            "}\n" +
            "Catch(exp){\n" +
            "    Code to throw an exception.\n" +
            "}\n" +
            "Finally{\n" +
            "    Code runs either it finishes successfully or after catch\n" +
            "}";
    public static final String answer53 = "Blur function is used to remove the focus from the specified object.";
    public static final String answer54 = "The ‘Navigator. the app version is used to find the operating system’s name in the client machine.";
    public static final String answer55 = "There are three types of errors:\n" +
            "\n" +
            "Load time errors: Errors that come up when loading a web page, like improper syntax errors, are known as Load time errors and generate the errors dynamically.\n" +
            "Runtime errors: Errors that come due to misuse of the command inside the HTML language.\n" +
            "Logical Errors: These are the errors that occur due to the bad logic performed on a function with a different operation.";
    public static final String answer56 = "The push method is used to add or append one or more elements to an Array end. Using this method, we can append multiple elements by passing multiple arguments.";
    public static final String answer57 = "Unshift method is like the push method, which works at the beginning of the array. This method is used to prepend one or more elements to the beginning of the array.";
    public static final String answer58 = "Strict Mode adds certain compulsions to JavaScript. Under the strict Mode, JavaScript shows errors for a piece of code, which did not show an error before, but might be problematic and potentially unsafe. Strict Mode also solves some mistakes that hamper the JavaScript engines from working efficiently.\n" +
            "\n" +
            "Strict mode can be enabled by adding the string literal “use strict” above the file. This can be illustrated by the given example:\n" +
            "\n" +
            "function myfunction() {\n" +
            "    \"use strict;\"\n" +
            "    var v = \"This is a strict mode function\";\n" +
            "}";
    public static final String answer59 = "The closure is a locally declared variable related to a function that stays in memory when it has returned.\n" +
            "\n" +
            "For example:\n" +
            "\n" +
            "function greet(message) {\n" +
            "    console.log(message);\n" +
            "}\n" +
            "function greeter(name, age) {\n" +
            "\n" +
            "    return name + \" says howdy!! He is \" + age + \" years old\";\n" +
            "}\n" +
            "// Generate the message\n" +
            "var message = greeter(\"James\", 23);\n" +
            "// Pass it explicitly to greet\n" +
            "greet(message);\n" +
            "This function can be better represented by using closures\n" +
            "function greeter(name, age) {\n" +
            "    var message = name + \" says howdy!! He is \" + age + \" years old\";\n" +
            "    return function greet() {\n" +
            "        console.log(message);\n" +
            "    };\n" +
            "}\n" +
            "// Generate the closure\n" +
            "var JamesGreeter = greeter(\"James\", 23);\n" +
            "// Use the closure\n" +
            "JamesGreeter();";
    public static final String answer60 = "A value can be appended to an array in the given manner –\n" +
            "\n" +
            " \n" +
            "arr[arr.length] = value;";
    public static final String answer61 = "A function that is declared without any named identifier is known as an anonymous function. In general, an anonymous function is inaccessible after its declaration.\n" +
            "\n" +
            "Anonymous function declaration –\n" +
            "\n" +
            "var anon = function() {\n" +
            "    alert('I am anonymous');\n" +
            "};\n" +
            "anon();";
    public static final String answer62 = "The function .call() and .apply() are very similar in their usage except a little difference. .call() is used when the number of the function’s arguments are known to the programmer, as they have to be mentioned as arguments in the call statement. On the other hand, .apply() is used when the number is not known. The function .apply() expects the argument to be an array.\n" +
            "\n" +
            "The basic difference between .call() and .apply() is in the way arguments are passed to the function. Their usage can be illustrated by the given example.\n" +
            "\n" +
            "var someObject = {\n" +
            "myProperty : 'Foo',\n" +
            "\n" +
            "myMethod : function(prefix, postfix) {\n" +
            "\n" +
            "    alert(prefix + this.myProperty + postfix);\n" +
            "}\n" +
            "};\n" +
            "someObject.myMethod('<', '>'); // alerts '<Foo>'\n" +
            "var someOtherObject  = {\n" +
            "\n" +
            "    myProperty : 'Bar.'\n" +
            "\n" +
            "};\n" +
            "someObject.myMethod.call(someOtherObject, '<', '>'); // alerts '<Bar>'\n" +
            "\n" +
            "someObject.myMethod.apply(someOtherObject, ['<', '>']); // alerts '<Bar>'";
    public static final String answer63 = "JavaScript allows DOM elements to be nested inside each other. In such a case, if the handler of the child is clicked, the handler of the parent will also work as if it were clicked too.";
    public static final String answer64 = "This can be done by including the name of the required frame in the hyperlink using the ‘target’ attribute.\n" +
            "\n" +
            "<a href=\"/newpage.htm\" target=\"newframe\">>New Page</a>";
    public static final String answer65 = "innerHTML content is refreshed every time and thus is slower. There is no scope for validation in innerHTML. Therefore, it is easier to insert rogue code in the document and make the web page unstable.";
    public static final String answer66 = "Namespacing is used for grouping the desired functions, variables, etc., under a unique name. It is a name that has been attached to the desired functions, objects, and properties. This improves modularity in the coding and enables code reuse.";
    public static final String answer67 = "For hiding JavaScript codes from old browsers:\n" +
            "\n" +
            "Add “<!–” without the quotes in the code just after the <script> tag.\n" +
            "\n" +
            "Add “//–>” without the quotes in the code just before the <script> tag.\n" +
            "\n" +
            "Old browsers will now treat this JavaScript code as a long HTML comment. While a browser that supports JavaScript will take the “<!–” and “//–>” as one-line comments.";
    public static final String answer68 = "Here, are example of simple multiplication table asking the user the number of rows and columns he wants.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "<html>\n" +
            "<head>\n" +
            "  <title>Multiplication Table</title>\n" +
            "  <script type=\"text/javascript\">\n" +
            "    var rows = prompt(\"How many rows for your multiplication table?\");\n" +
            "    var cols = prompt(\"How many columns for your multiplication table?\");\n" +
            "    if(rows == \"\" || rows == null)\n" +
            "            rows = 10;\n" +
            "    if(cols== \"\" || cols== null)\n" +
            "            cols = 10;\n" +
            "    createTable(rows, cols);\n" +
            "    function createTable(rows, cols)\n" +
            "    {\n" +
            "      var j=1;\n" +
            "      var output = \"<table border='1' width='500' cellspacing='0'cellpadding='5'>\";\n" +
            "      for(i=1;i<=rows;i++)\n" +
            "      {\n" +
            "        output = output + \"<tr>\";\n" +
            "        while(j<=cols)\n" +
            "        {\n" +
            "            output = output + \"<td>\" + i*j + \"</td>\";\n" +
            "             j = j+1;\n" +
            "           }\n" +
            "            output = output + \"</tr>\";\n" +
            "            j = 1;\n" +
            "    }\n" +
            "    output = output + \"</table>\";\n" +
            "    document.write(output);\n" +
            "    }\n" +
            "  </script>\n" +
            "</head>\n" +
            "<body>\n" +
            "</body>\n" +
            "</html>";
    public static final String answer69 = "Assigning properties to objects is done in the same way as a value is assigned to a variable. For example, a form object’s action value is assigned as ‘submit’ in the following manner – Document. form.action=”submit”" +
            "\n\n" +
            "Properties are assigned to objects in the following way –\n" +
            "\n" +
            "obj [\"class\"] = 12;\n" +
            "or\n" +
            "obj.class = 12;";
    public static final String answer70 = "There are 3 ways to create an object in JavaScript.\n" +
            "\n" +
            "By object literal\n" +
            "By creating an instance of Object\n" +
            "By Object Constructor\n" +
            "Let's see a simple code to create an object using object literal.\n" +
            "\n" +
            "emp={id:102,name:\"Anne Moore\",salary:5000}";
    public static final String answer71 = "This can be done by Using JavaScript extensions (runs from JavaScript Editor), for example, for the opening of a file –\n" +
            "\n" +
            " fh = fopen(getScriptPath(), 0);";
    public static final String answer72 = "Screen objects are used to read the information from the client’s screen. The properties of screen objects are –\n" +
            "\n" +
            "AvailHeight: Gives the height of the client’s screen\n" +
            "AvailWidth: Gives the width of the client’s screen\n" +
            "ColorDepth: Gives the bit depth of images on the client’s screen\n" +
            "Height: Gives the total height of the client’s screen, including the taskbar\n" +
            "Width: Gives the total width of the client’s screen, including the taskbar";
    public static final String answer73 = "This method is functional at the starting of the array, unlike the push(). It adds the desired number of elements to the top of an array. For example –\n" +
            "\n" +
            "var name = [ \"john\" ];\n" +
            "name.unshift( \"charlie\" );\n" +
            "name.unshift( \"joseph\", \"Jane\" );\n" +
            "console.log(name);\n" +
            "The output is shown below:\n" +
            "\n" +
            "[\" joseph ,\",\" Jane ,\", \" charlie \", \" john \"]";
    public static final String answer74 = "JavaScript Array Methods\n" +
            "The Array object has many properties and methods which help developers to handle arrays easily and efficiently. You can get the value of a property by specifying arrayname.property and the output of a method by specifying arrayname.method().\n" +
            "\n" +
            "length property –> If you want to know the number of elements in an array, you can use the length property.\n" +
            "prototype property –> If you want to add new properties and methods, you can use the prototype property.\n" +
            "reverse method –> You can reverse the order of items in an array using a reverse method.\n" +
            "sort method –> You can sort the items in an array using sort method.\n" +
            "pop method –> You can remove the last item of an array using a pop method.\n" +
            "shift method –> You can remove the first item of an array using shift method.\n" +
            "push method –> You can add a value as the last item of the array.\n\n" +
            "<html>\n" +
            "<head>\n" +
            "    <title>Arrays!!!</title>\n" +
            "    <script type=\"text/javascript\">\n" +
            "        var students = new Array(\"John\", \"Ann\", \"Aaron\", \"Edwin\", \"Elizabeth\");\n" +
            "        Array.prototype.displayItems=function(){\n" +
            "            for (i=0;i<this.length;i++){\n" +
            "                document.write(this[i] + \"<br />\");\n" +
            "            }\n" +
            "        }    \n" +
            "        document.write(\"students array<br />\");\n" +
            "        students.displayItems();\n" +
            "        document.write(\"<br />The number of items in students array is \" + students.length + \"<br />\");\n" +
            "        document.write(\"<br />The SORTED students array<br />\");\n" +
            "        students.sort();\n" +
            "        students.displayItems();\n" +
            "        document.write(\"<br />The REVERSED students array<br />\");\n" +
            "        students.reverse();\n" +
            "        students.displayItems();\n" +
            "        document.write(\"<br />THE students array after REMOVING the LAST item<br />\");\n" +
            "        students.pop();\n" +
            "        students.displayItems();\n" +
            "\t\tdocument.write(\"<br />THE students array after PUSH<br />\");\n" +
            "        students.push(\"New Stuff\");\n" +
            "        students.displayItems();\n" +
            "    </script>\n" +
            "</head>\n" +
            "<body>\n" +
            "</body>\n" +
            "</html>";
    public static final String answer75 = "The for/in a loop is usually used to loop through the properties of an object. You can give any name for the variable, but the object’s name should be the same as an already existing object you need to loop through.\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            "for (variablename in objectname)\n" +
            "\n" +
            "{\n" +
            "\n" +
            "lines of code to be executed\n" +
            "\n" +
            "}\n" +
            "Example:\n" +
            "\n" +
            "<html>\n" +
            "<head>\n" +
            "    <script type=\"text/javascript\">\n" +
            "        var employee={first:\"John\", last:\"Doe\", department:\"Accounts\"};\n" +
            "\t\tvar\t\tdetails = \"\";\n" +
            "\t\tdocument.write(\"<b>Using for/in loops </b><br />\");\n" +
            "        for (var x in employee)\n" +
            "        {\n" +
            "\t\tdetails = x + \": \" + employee[x];\n" +
            "\t\tdocument.write(details + \"<br />\");\n" +
            "        }\n" +
            "    </script>\n" +
            "</head>\n" +
            "<body>\n" +
            "</body>\n" +
            "</html>";
    public static final String answer76 = "The variables of JavaScript represent the arguments that are passed to a function.";
    public static final String answer77 = "The JavaScript string charAt() method is used to find out a char value present at the specified index. The index number starts from 0 and goes to n-1, where n is the length of the string. The index value can't be a negative, greater than or equal to the length of the string. For example:\n" +
            "\n" +
            "var str=\"SHR_Creation\";    \n" +
            "document.writeln(str.charAt(4));    ";
    public static final String answer78 = "The window object is created automatically by the browser that represents a window of a browser. It is not an object of JavaScript. It is a browser object.\n" +
            "\n" +
            "The window object is used to display the popup dialog box. Let's see with description." +
            "\n\n" +
            "alert() => displays the alert box containing the message with ok button.\n" +
            "confirm() => displays the confirm dialog box containing the message with ok and cancel button.\n" +
            "prompt() => displays a dialog box to get input from the user.\n" +
            "open() => opens the new window.\n" +
            "close() => closes the current window.\n" +
            "setTimeout() => performs the action after specified time like calling function, evaluating expressions." +
            "\n" +
            "More details: https://cutt.ly/5IxPTkM";
    public static final String answer79 = "The history object of a browser can be used to switch to history pages such as back and forward from the current page or another page. There are three methods of history object.\n" +
            "\n" +
            "history.back() - It loads the previous page.\n" +
            "history.forward() - It loads the next page.\n" +
            "history.go(number) - The number may be positive for forward, negative for backward. It loads the given page number." +
            "\n" +
            "More details: https://cutt.ly/ZIxPD6v";
    public static final String answer80 = "The cursor can be set to wait in JavaScript by using the property \"cursor\". The following example illustrates the usage:\n" +
            "\n" +
            "<script>  \n" +
            "window.document.body.style.cursor = \"wait\";   \n" +
            "</script>";
    public static final String answer81 = "This is a three-dimensional array.\n" +
            "\n" +
            "var myArray = [[[]]];";
    public static final String answer82 = "The JavaScript math object provides several constants and methods to perform a mathematical operation. Unlike date object, it doesn't have constructors. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "  document.writeln(Math.random());  \n" +
            "}  \n" +
            "display();";
    public static final String answer83 = "The JavaScript date object can be used to get a year, month and day. You can display a timer on the webpage by the help of JavaScript date object.\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "  var date=new Date();    \n" +
            "var day=date.getDate();    \n" +
            "var month=date.getMonth()+1;    \n" +
            "var year=date.getFullYear();    \n" +
            "document.write(\"<br>Date is: \"+day+\"/\"+month+\"/\"+year);    \n" +
            "}  \n" +
            "display();";
    public static final String answer84 = "The JavaScript number object enables you to represent a numeric value. It may be integer or floating-point. JavaScript number object follows the IEEE standard to represent the floating-point numbers.\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var x=102;//integer value    \n" +
            "var y=102.7;//floating point value    \n" +
            "var z=13e4;//exponent value, output: 130000    \n" +
            "var n=new Number(16);//integer value by number object    \n" +
            "document.write(x+\" \"+y+\" \"+z+\" \"+n);    \n" +
            "}     \n" +
            "display(); ";
    public static final String answer85 = "The JavaScript Boolean is an object that represents value in two states: true or false. You can create the JavaScript Boolean object by Boolean() constructor.\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "document.writeln(10<20);//true    \n" +
            "document.writeln(10<5);//false     \n" +
            "}     \n" +
            "display();";
    public static final String answer86 = "The JavaScript TypedArray object illustrates an array like a view of an underlying binary data buffer. There is any number of different global properties, whose values are TypedArray constructors for specific element types.\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var arr1= [1,2,3,4,5,6,7,8,9,10];     \n" +
            "       arr1.copyWithin(2) ;   \n" +
            "       document.write(arr1);    \n" +
            "}  \n" +
            "display();";
    public static final String answer87 = "The JavaScript Set object is used to store the elements with unique values. The values can be of any type i.e. whether primitive values or object references. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var set = new Set();    \n" +
            "set.add(\"jQuery\");    \n" +
            "set.add(\"AngularJS\");    \n" +
            "set.add(\"Bootstrap\");    \n" +
            "for (let elements of set) {    \n" +
            " document.writeln(elements+\"<br>\");    \n" +
            "}     \n" +
            "}  \n" +
            "display(); ";
    public static final String answer88 = "The JavaScript WeakSet object is the type of collection that allows us to store weakly held objects. Unlike Set, the WeakSet are the collections of objects only. It doesn't contain the arbitrary values. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var ws = new WeakSet();    \n" +
            "var obj1={};    \n" +
            "var obj2={};    \n" +
            "ws.add(obj1);    \n" +
            "ws.add(obj2);    \n" +
            "//Let's check whether the WeakSet object contains the added object    \n" +
            "document.writeln(ws.has(obj1)+\"<br>\");    \n" +
            "document.writeln(ws.has(obj2));     \n" +
            "}     \n" +
            "display();";
    public static final String answer89 = "The JavaScript Map object is used to map keys to values. It stores each element as key-value pair. It operates the elements such as search, update and delete on the basis of specified key. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var map=new Map();    \n" +
            "map.set(1,\"jQuery\");    \n" +
            "map.set(2,\"AngularJS\");    \n" +
            "map.set(3,\"Bootstrap\");    \n" +
            "document.writeln(map.get(1)+\"<br>\");    \n" +
            "document.writeln(map.get(2)+\"<br>\");    \n" +
            "document.writeln(map.get(3));    \n" +
            "}  \n" +
            "display();";
    public static final String answer90 = "The JavaScript WeakMap object is a type of collection which is almost similar to Map. It stores each element as a key-value pair where keys are weakly referenced. Here, the keys are objects and the values are arbitrary values. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "var wm = new WeakMap();    \n" +
            "var obj1 = {};    \n" +
            "var obj2 = {};    \n" +
            "var obj3= {};    \n" +
            "wm.set(obj1, \"jQuery\");    \n" +
            "wm.set(obj2, \"AngularJS\");    \n" +
            "wm.set(obj3,\"Bootstrap\");    \n" +
            "document.writeln(wm.has(obj2));     \n" +
            "}     \n" +
            "display();";
    public static final String answer91 = "Many times, variables or arrays are not sufficient to simulate real-life situations. JavaScript allows you to create objects that act like real-life objects. A student or a home can be an object that has many unique characteristics of its own. You can create properties and methods for your objects to make programming easier. If your object is a student, it will have properties like the first name, last name, id, etc., and methods like calculating rank, change address, etc. If your object is a home, it will have properties like a number of rooms, paint color, location, etc. The methods like to calculate area, change owner, etc.\n" +
            "\n" +
            "How to Create an Object\n" +
            "\n" +
            "You can create an object like this:\n" +
            "\n" +
            "var objName = new\t\tObject();\n" +
            "objName.property1 = value1;\n" +
            "objName.property2 = value2;\n" +
            "objName.method1 = function()\n" +
            "{\n" +
            "line of code\t\n" +
            "}\n" +
            "OR\n" +
            "\n" +
            "var objName= {property1:value1, property2:value2, method1: function()\n" +
            "\n" +
            "{ lines of code} };";
    public static final String answer92 = "Events are the actions that result from activities, such as clicking a link or filling a form by the user. An event handler is required to manage the proper execution of all these events. Event handlers are an extra attribute of the object. This attribute includes the event’s name and the action taken if the event takes place.";
    public static final String answer93 = "The HTML code’s parsing during page loading is paused by default until the script has not stopped executing. If the server is slow or the script is particularly heavy, then the web page is delayed.\n" +
            "\n" +
            "While using Deferred, scripts delays execution of the script till the time the HTML parser is running. This reduces the loading time of web pages, and they get displayed faster.";
    public static final String answer94 = "The different functional components in JavaScript are-\n" +
            "\n" +
            "First-class functions: Functions in JavaScript are utilized as first-class objects. This usually means that these functions can be passed as arguments to other functions, returned as values from other functions, assigned to variables, or can also be stored in data structures.\n" +
            "Nested functions: The functions, which are defined inside other functions, are called Nested functions. They are called ‘every time the main function is invoked.";
    public static final String answer95 = "JavaScript gives a message as if it encounters an error. The recognized errors are –\n" +
            "\n" +
            "Load-time errors: The errors shown at the time of the page loading are counted under Load-time errors. The use of improper syntax encounters these errors and is thus detected while the page is getting loaded.\n" +
            "Runtime errors: This is the error that comes up while the program is running. For example, illegal operations cause the division of a number by zero or access a non-existent area of the memory.\n" +
            "Logic errors: It is caused by syntactically correct code, which does not fulfill the required task—for example, an infinite loop.";
    public static final String answer96 = "The escape () function is responsible for coding a string to transfer the information from one computer to the other across a network.\n" +
            "\n" +
            "For Example:\n" +
            "\n" +
            "<script>\n" +
            "document.write(escape(\"Hello? How are you!\"));\n" +
            "</script>\n" +
            "Output: Hello%3F%20How%20are%20you%21\n" +
            "\n" +
            "The unescape() function is very important as it decodes the coded string.\n" +
            "\n" +
            "It works in the following way. For example:\n" +
            "\n" +
            "<script>\n" +
            "    document.write(unescape(\"Hello%3F%20How%20are%20you%21\"));\n" +
            "</script>\n" +
            "Output: Hello? How are you!";
    public static final String answer97 = "EncodeURl() is used to convert URL into their hex coding. And DecodeURI() is used to convert the encoded URL back to normal.\n" +
            "\n" +
            "<script>\n" +
            "   var uri=\"my test.asp?name=ståle&car=saab\";\n" +
            "\n" +
            "   document.write(encodeURI(uri)+ \"<br>\");\n" +
            "\n" +
            "    document.write(decodeURI(uri));\n" +
            "</script>\n" +
            "Output –\n" +
            "\n" +
            "my%20test.asp?name=st%C3%A5le&car=saab\n" +
            "\n" +
            "my test.asp?name=ståle&car=saab";
    public static final String answer98 = "JavaScript Unit Testing is a testing method in which JavaScript tests code written for a web page or web application module. It is combined with HTML as an inline event handler and executed in the browser to test if all functionalities work fine. These unit tests are then organized in the test suite.\n" +
            "\n" +
            "Every suite contains several tests designed to be executed for a separate module. Most importantly, they don’t conflict with any other module and run with fewer dependencies on each other (some critical situations may cause dependencies).\n" +
            "\n" +
            "Challenges of JavaScript Unit Testing:\n" +
            "\n" +
            "Here are important challenges of JavaScript Unit Testing:\n" +
            "\n" +
            "Many other languages support unit testing in browsers, in the stable as well as in runtime environment, but JavaScript can not\n" +
            "You can understand some system actions with other languages, but this is not the case with JavaScript\n" +
            "Some JavaScript are written for a web application that may have multiple dependencies.\n" +
            "JavaScript is good to use in combination with HTML and CSS rather than on the web\n" +
            "Difficulties with page rendering and DOM manipulation\n" +
            "Sometimes you find an error message on your screen regarding ‘Unable to load example.js’ or any other JavaScript error regarding version control. These vulnerabilities come under Unit Testing JavaScript\n" +
            "Solutions of JavaScript Unit Testing:\n" +
            "\n" +
            "To avoid such issues, what you can do is;\n" +
            "\n" +
            "Do not use global variables.\n" +
            "Do not manipulate predefined objects.\n" +
            "Design core functionalities based on the library.\n" +
            "Try to create small pieces of functionalities with lesser dependencies.";
    public static final String answer99 = "Following is a curated list of popular JavaScript Unit Testing Frameworks and Tools that are widely used :\n" +
            "\n" +
            "Unit.js: It is known as an open-source assertion library running on browser and Node.js. It is extremely compatible with other JavaScript Unit Testing frameworks like Mocha, Karma, Jasmine, QUnit, Protractor, etc. Provides the full documented API of assertion list.\n" +
            "\n" +
            "QUnit: It is used for both client-side and server-side JavaScript Unit Testing. This Free JavaScript testing framework is used for jQuery projects. It follows Common JS unit testing Specification for unit testing in JavaScript. It supports the Node Long-term Support Schedule.\n" +
            "\n" +
            "Jasmine: Jasmine is the behavior-driven development framework to unit test JavaScript. It is used for testing both synchronous and asynchronous JavaScript codes. It does not require DOM and comes with an easy syntax that can be written for any test.\n" +
            "\n" +
            "Karma: Karma is an open-source productive testing environment. Easy workflow control running on the command line. Offers the freedom to write the tests with Jasmine, Mocha, and QUnit. You can run the test on real devices with easy debugging.\n" +
            "\n" +
            "Mocha: Mocha runs on Node.js and in the browser. Mocha performs asynchronous testing more simply. Provides accuracy and flexibility in reporting. Provides tremendous support of rich features such as test-specific timeouts, JavaScript APIs.\n" +
            "\n" +
            "Jest: Facebook uses jest so far to test all the JavaScript code. It provides the ‘zero-configuration testing experience. Supports independent and non-interrupting running tests without any conflict. Do not require any other setup configuration and libraries.\n" +
            "\n" +
            "AVA: AVA is a simple JavaScript Unit Testing Framework. Tests are being run in parallel and serially. Parallel tests run without interrupting each other. This testing framework supports asynchronous testing as well. AVA uses subprocesses to run the unit test JavaScript.";
    public static final String answer100 = "Quick Sort algorithm follows Divide and Conquer approach. It divides elements into smaller parts based on some conditions and performing the sort of operations on those divided smaller parts.\n" +
            "\n" +
            "Quick Sort algorithm is one of the most used and popular algorithms in any programming language. If you are a JavaScript developer, you might have heard of sort() which is already available in JavaScript. Then, you might have been thinking about what the need for this Quick Sort algorithm is. To understand this, first, we need what is sorting and what is the default sorting in JavaScript.\n" +
            "\n" +
            "Quicksort follows the Divide-and-Conquer algorithm. It divides elements into smaller parts based on some conditions and performs the sort operations on those divided smaller parts. Hence, it works well for large datasets. So, here are the steps of how Quicksort works in simple words.\n" +
            "\n" +
            "First, select an element that is to be called the pivot element.\n" +
            "Next, compare all array elements with the selected pivot element and arrange them so that elements less than the pivot element are left. Greater than pivot is to its right.\n" +
            "Finally, perform the same operations on the left and right side elements to the pivot element.\n" +
            "So, that is the basic outline of Quicksort. Here are the steps which need to be followed one by one to perform Quicksort.";
    public static final String answer101 = "Step 1) First, find the “pivot” element in the array.\n" +
            "\n" +
            "Step 2) Start the left pointer at the first element of the array.\n" +
            "\n" +
            "Step 3) Start the right pointer at the last element of the array.\n" +
            "\n" +
            "Step 4) Compare the element pointing with the left pointer, and if it is less than the pivot element, then move the left pointer to the right (add 1 to the left index). Continue this until the left side element is greater than or equal to the pivot element.\n" +
            "\n" +
            "Step 5) Compare the element pointing with the right pointer. If it is greater than the pivot element, move the right pointer to the left (subtract 1 to the right index). Continue this until the right-side element is less than or equal to the pivot element.\n" +
            "\n" +
            "Step 6) Check if the left pointer is less than or equal to a right pointer, then saw the elements in these pointers’ locations.\n" +
            "\n" +
            "Step 7) Increment the left pointer and decrement the right pointer.\n" +
            "\n" +
            "Step 8) If the left pointer index is still less than the right pointer’s index, repeat the process; else, return the left pointer’s index." +
            "\n\n" +
            "So, let us see these steps with an example. Let us consider an array of elements which we need to sort is [5,3,7,6,2,9].\n" +
            "\n" +
            "Here are the steps to perform Quick sort that is being shown with an example [5,3,7,6,2,9].\n" +
            "\n" +
            "STEP 1) Determine pivot as a middle element. So, 7 is the pivot element.\n" +
            "\n" +
            "STEP 2) Start left and right pointers as first and last elements of the array, respectively. The left pointer points to 5 at index 0, and the right pointer points to 9 at index 5.\n" +
            "\n" +
            "STEP 3) Compare the left pointer element with the pivot element, since 5 < 6 shift left pointer to the right to index 1.\n" +
            "\n" +
            "STEP 4) Now, still 3 <6, so shift the left pointer to one more index to the right. Now 7 > 6 stops incrementing the left pointer, and now the left pointer is index 2.\n" +
            "\n" +
            "STEP 5) Now, compare the value at the right pointer with the pivot element. Since 9 > 6, move the right pointer to the left. Now, as 2 < 6, stop moving the right pointer.\n" +
            "\n" +
            "STEP 6) Swap both values present at left and right pointers with each other.\n" +
            "\n" +
            "STEP 7) Move both pointers one more step.\n" +
            "\n" +
            "STEP 8) Since 6 = 6, move pointers to one more step and stop as the left pointer crosses the right pointer and returns the left pointer’s index.\n" +
            "\n" +
            "Here, based on the above approach, we need to write code for swapping elements and partitioning the array as mentioned in the above steps.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "var items = [5,3,7,6,2,9];\n" +
            "function swap(items, leftIndex, rightIndex){\n" +
            "    var temp = items[leftIndex];\n" +
            "    items[leftIndex] = items[rightIndex];\n" +
            "    items[rightIndex] = temp;\n" +
            "}\n" +
            "function: partition(items, left, right) {\n" +
            "    var pivot   = items[Math.floor((right + left) / 2)], //middle element\n" +
            "        i       = left, //left pointer\n" +
            "        j       = right; //right pointer\n" +
            "    while (i <= j) {\n" +
            "        while (items[i] < pivot) {\n" +
            "            i++;\n" +
            "        }\n" +
            "        while (items[j] > pivot) {\n" +
            "            j--;\n" +
            "        }\n" +
            "        if (i <= j) {\n" +
            "            swap(items, i, j); //sawpping two elements\n" +
            "            i++;\n" +
            "            j--;\n" +
            "        }\n" +
            "    }\n" +
            "    return i;\n" +
            "}\n" +
            "\n" +
            "function quickSort(items, left, right) {\n" +
            "    var index;\n" +
            "    if (items.length > 1) {\n" +
            "        index = partition(items, left, right); //index returned from partition\n" +
            "        if (left < index - 1) { //more elements on the left side of the pivot\n" +
            "            quickSort(items, left index - 1);\n" +
            "        }\n" +
            "        if (index < right) { //more elements on the right side of the pivot\n" +
            "            quickSort(items, index, right);\n" +
            "        }\n" +
            "    }\n" +
            "    return items;\n" +
            "}\n" +
            "// first call to quick sort\n" +
            "var sortedArray = quickSort(items, 0, items.length - 1);\n" +
            "console.log(sortedArray); //prints [2,3,5,6,7,9]";
    public static final String answer102 = "Client-side JavaScript comprises the basic language and predefined objects which are relevant to running JavaScript in a browser. The client-side JavaScript is embedded directly by in the HTML pages. The browser interprets this script at runtime.\n" +
            "\n" +
            "Server-side JavaScript also resembles client-side JavaScript. It has a relevant JavaScript which is to run in a server. The server-side JavaScript are deployed only after compilation.";
    public static final String answer103 = "The storage of cookies on the hard disk depends on the OS and the browser.\n" +
            "\n" +
            "The Netscape Navigator on Windows uses a cookies.txt file that contains all the cookies. The path is c:\\Program Files\\Netscape\\Users\\username\\cookies.txt\n" +
            "\n" +
            "The Internet Explorer stores the cookies on a file username@website.txt. The path is: c:\\Windows\\Cookies\\username@Website.txt.";
    public static final String answer104 = "JavaScript didn't show any error message in a browser. However, these mistakes can affect the output. The best practice to find out the error is to debug the code. The code can be debugged easily by using web browsers like Google Chrome, Mozilla Firebox.\n" +
            "\n" +
            "To perform debugging, we can use any of the following approaches:\n" +
            "\n" +
            "Using console.log() method\n" +
            "Using debugger keyword";
    public static final String answer105 = "JavaScript debugger keyword sets the breakpoint through the code itself. The debugger stops the execution of the program at the position it is applied. Now, we can start the flow of execution manually. If an exception occurs, the execution will stop again on that particular line.. For example:\n" +
            "\n" +
            "function display()  \n" +
            "{  \n" +
            "x = 10;    \n" +
            "y = 15;    \n" +
            "z = x + y;    \n" +
            "debugger;    \n" +
            "document.write(z);    \n" +
            "document.write(a);     \n" +
            "}     \n" +
            "display();";
    public static final String answer106 = "A JavaScript Constructor is a function which is used as a constructor that allows you to create an object from a class. A constructor access is one of public, protected and private.\n" +
            "\n" +
            "Three ways to define a JavaScript class,\n" +
            "1.Using as a function\n" +
            "2.Using as Object Literals\n" +
            "3.Singleton using as a function" +
            "\n\n" +
            "The Syntax\n" +
            "\n" +
            "access NameOfAClass(parameters) {\n" +
            "   initialization code;\n" +
            "}\n" +
            "//Access as public \n" +
            "public customer(parameters) {\n" +
            "   initialization code;\n" +
            "}\n" +
            "//Access as protected \n" +
            "protected customer(parameters) {\n" +
            "   initialization code;\n" +
            "}\n" +
            "//Access as private \n" +
            "private customer(parameters) {\n" +
            "   initialization code;\n" +
            "}";
    public static final String answer107 = "There is no real function overloading in JavaScript and it allows to pass any number of parameters of any type." +
            "\n" +
            "You have to check inside the function how many arguments have been passed and what is the type arguments using typeof." +
            "\n" +
            "How to create function overloading in JavaScript?\n" +
            "\n" +
            "The example for function overloadingnot supporting in JavaScript as give below.\n" +
            "\n" +
            "function sum(a, b) {\n" +
            "    alert(a + b);\n" +
            "}\n" +
            "\n" +
            "function sum(c) {\n" +
            "    alert(c);\n" +
            "}\n" +
            "\n" +
            "sum(3);//The output is 3.\n" +
            "sum(2, 4);//The output is 2.\n" +
            "\n" +
            "In the JavaScript, when we write more than one functions with same name that time JavaScript consider the last define function and override the previous functions. You can see the above example output for the same." +
            "\n" +
            "We can achieve using the several different techniques as give below\n" +
            "\n" +
            "You can check the declared argument name value is undefined.\n" +
            "We can check the total arguments with arguments.length.\n" +
            "Checking the type of passing arguments.\n" +
            "Using number of arguments\n" +
            "Using optional arguments like x=x || 'default'\n" +
            "Using different name in the first place\n" +
            "We can use the arguments array to access any given argument by using arguments[i]";
    public static final String answer108 = "What is array? Array is a collection of index items and it is a number indexes.\n" +
            "\n" +
            "Some of programming language support array as named indexes and the JavaScript not support the array as name indexes and its provide only number indexes but provide this feature using the associative array.\n" +
            "\n" +
            "The array with name indexes are called associative array and the associative array is provide a ways to store the information.\n" +
            "\n" +
            "The number index array example as given below\n" +
            "\n" +
            "    var users = new Object();\n" +
            "    users[\"Name1\"] = \"Anne 1\";\n" +
            "    users[\"Name2\"] = \"Anne 2\";\n" +
            "    users[\"Age\"] = 33;\n" +
            "    alert(Object.keys(users).length); //output is 3.\n" +
            "    var length = Object.keys(users).length;  // 3\n" +
            "   \n" +
            "The name index array example as given below\n" +
            "\n" +
            "    var users = [];\n" +
            "    users[\"Name1\"] = \"Anne 1\";\n" +
            "    users[\"Name2\"] = \"Anne 2\";\n" +
            "    users[\"Age\"] = 33;\n" +
            "    var length = users.length;         // users.length will return 0\n" +
            "    var detail = users[0];             // users[0] will return undefined\n" +
            "\n" +
            "Where to use the associate array?\n" +
            "\n" +
            "I am going to explain the associate array over the database table columns. A table have some columns and its type. i.e.\n" +
            "\n" +
            "The empName as text type, empAge as number type and enpDOB as date type.\n" +
            "\n" +
            "If we need to find the type of a column that time we can create the associate array. i.e.\n" +
            "\n" +
            "var empDetailType = new Array();\n" +
            "\n" +
            "empDetailType[\"empName\"] = \"ANne\";\n" +
            "empDetailType[\"empAge\"] = 30;\n" +
            "empDetailType[\"empDOB\"] = \"10/03/1984\";\n" +
            "\n" +
            "console.log(\"Find the emp age type :\" + empDetailType[\"empAge\"]);";
    public static final String answer109 = "“Why self is needed instead of this in JavaScript?” and also what is the advantage of using “var self = this;”\n" +
            "\n" +
            "var self = this;\n" +
            "\n" +
            "In the JavaScript, “self” is a pattern to maintaining a reference to the original “this” keyword and also we can say that this is a technique to handle the events.\n" +
            "\n" +
            "Right now, “self” should not be used because modern browsers provide a “self” as global variable (window.self).\n" +
            "\n" +
            "Example [“self” keyword is needed instead of “this”],\n" +
            "\n" +
            "var employee = function (name) {\n" +
            "    var self = this;\n" +
            "    self.username = name;\n" +
            "};";
    public static final String answer110 = "In the JavaScript, we can implement the Inheritance using the some alternative ways and we can’t define a class keyword but we create a Constructor function and using new keyword achieves it.  \n" +
            "\n" +
            "The some Alternative ways As,\n" +
            "1.      Pseudo classical Inheritance\n" +
            "2.      Prototype Inheritance\n" +
            "\n" +
            "Pseudo classical Inheritance is the most popular way. In this way, create a constructor function using the new operator and add the members function with the help for constructor function prototype." +
            "\n\n" +
            "The Prototype based programming is a technique of object oriented programming. In this mechanism we can reuse the exiting objects as prototypes. \n" +
            "\n" +
            "The prototype inheritance also known as prototypal, classless or instance based inheritances." +
            "\n\n" +
            "Example as,\n" +
            "\n" +
            "// Create a helper function.\n" +
            "if (typeof Object.create !== 'function') {\n" +
            "\n" +
            "        Object.create = function (obj) {\n" +
            "            function fun() { };\n" +
            "            fun.prototype = obj;\n" +
            "            return new fun();\n" +
            "        };\n" +
            "}\n" +
            "\n" +
            "//This is a parent class.\n" +
            "var parent = {\n" +
            "        sayHi: function () {\n" +
            "            alert('Hi, I am parent!');\n" +
            "        },\n" +
            "        sayHiToWalk: function () {\n" +
            "            alert('Hi, I am parent! and going to walk!');\n" +
            "        }\n" +
            "};\n" +
            "\n" +
            "//This is child class and the parent class is inherited in the child class.\n" +
            "var child = Object.create(parent);\n" +
            "\n" +
            "child.sayHi = function () {\n" +
            "    alert('Hi, I am a child!');\n" +
            "};";
    public static final String answer111 = "Explained In detail as given below\n" +
            "Using Asynchronous code, we are able to execute multiple things/JavaScript call at the same-time without locking the DOM or main thread.\n" +
            "You can define a global variable for call-back method.\n" +
            "You can use call-back method because JavaScript is lexical scoped and can't define a variable in the call-back methods.\n" +
            "The response and data come from the parent's call-back method.\n" +
            "etc..";
    public static final String answer112 = "var userList =  ['anne','david','rohan','lucy','up','usa'];\n" +
            "\n" +
            "Answers:-\n" +
            "\n" +
            "Method 1: - userList =[];\n" +
            "\n" +
            "Method 2: - userList.length=0;\n" +
            "\n" +
            "Method 3: - userList.splice(0, userList.length);\n" +
            "\n" +
            "Method 4: -\n" +
            "while (userList.length > 0) {\n" +
            "    arrayList.pop();\n" +
            "}\n" +
            "\n" +
            "I am not recommended to use \"method 4\". You can use “method 2” and “method 3” because it is so fast.";
    public static final String answer113 = "In this article, I’m explaining the importance of these three keywords in JavaScript and TypeScript.  I also provided various examples to deeply understand and use them and what happened when?\n" +
            "\n" +
            "Let see about: Var vs. Let vs. Const\n" +
            "\n" +
            "var: -\n" +
            "1.      var is function-scoped\n" +
            "2.      var return undefined when accessing a variable before it's declared\n" +
            "\n" +
            "let: -\n" +
            "1.      let is block-scoped\n" +
            "2.      let throw ReferenceError when accessing a variable before it's declared\n" +
            "\n" +
            "const:-\n" +
            "1.      Const is block-scoped\n" +
            "2.      Const throw ReferenceError when accessing a variable before it's declared\n" +
            "3.      Const cannot be reassigned";
    public static final String answer114 = "Yes, it is definitely possible to use JavaScript to change the Meta tags of the page." +
            "\n\n" +
            "Change Meta tag content dynamically through JavaScript:\n" +
            "\n" +
            "Let’s see the Example,\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "    <meta name=\"viewport\" id=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n" +
            "    <title>dynamically add meta tag JavaScript</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\" async=\"async\"></script>\n" +
            "    <script>\n" +
            "        $(function(){\n" +
            "            //update Meta Tag in Header\n" +
            "           updateMetaTag(\"viewport\");\n" +
            "        });\n" +
            "\n" +
            "        var updateMetaTag = function (id) {\n" +
            "        var meta = document.getElementById(id);\n" +
            "        meta.setAttribute(\"content\", \"width=device-width, initial-scale=1.0\");\n" +
            "\n" +
            "        OR\n" +
            "\n" +
            "        //document.querySelector('meta[name=\"viewport\"]').setAttribute(\"content\", \"width=device-width, initial-scale=1.0\");\n" +
            "        }\n" +
            "    </script>\n" +
            "</body>\n" +
            "</html>";
    public static final String answer115 = "To modify the URL of page without reloading the page using the “push State” function.\n" +
            "\n" +
            "Example –\n" +
            "window.history.pushState('page1', 'This is page1 Title', '/index.htm');";
    public static final String answer116 = "Use the call or apply methods";
    public static final String answer117 = "DOM stands for Document Object Model and is responsible for how various objects in a document interact with each other. DOM is required for developing web pages, which includes objects like paragraphs, links, etc. These objects can be operated to include actions like add or delete. DOM is also required to add extra capabilities to a web page. On top of that, the use of API gives an advantage over other existing models.";
    public static final String answer118 = "JavaScript can access all the elements in a web page using the Document Object Model (DOM). The web browser creates a DOM of the webpage when the page is loaded.";
    public static final String answer119 = "Using DOM, JavaScript can perform multiple tasks. It can create new elements and attributes, change the existing elements and attributes and even remove existing elements and attributes. JavaScript can also react to existing events and create new events in the page.\n" +
            "\n" +
            "getElementById, innerHTML Example\n" +
            "getElementById: To access elements and attributes whose id is set.\n" +
            "innerHTML: To access the content of an element.\n" +
            "<html>\n" +
            "<head>\n" +
            "    <title>DOM!!!</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "  <h3 id=\"one\">Welcome</h3>\n" +
            "  <p>This is the welcome message.</p>\n" +
            "  <h3>Technology</h3>\n" +
            "  <p>This is the technology section.</p>\n" +
            "  <script type=\"text/javascript\">\n" +
            "        var text = document.getElementById(\"one\").innerHTML;\n" +
            "        alert(\"The first heading is \" + text);\n" +
            "  </script>\n" +
            "</body>\n" +
            "</html>";
    public static final String answer120 = "sk.\n" +
            "\n" +
            "So, save the JavaScript code in a new file with the extension .js. Then, add a line of code in all your web pages to point to your .js file like this:\n" +
            "\n" +
            "<script type=\"text/javascript,\" src=\"/currentdetails.js,\">\n" +
            "Note: It is assumed that the .js file and all your web pages are in the same folder. If the external.js file is in a different folder, you need to specify your file’s full path in the src attribute.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "var currentDate = new Date();\n" +
            "var day = currentDate.getDate();\n" +
            "Var month = currentDate.getMonth() + 1;\n" +
            "var monthName;\n" +
            "var hours = currentDate.getHours(); \n" +
            "var mins = currentDate.getMinutes(); \n" +
            "var secs = currentDate.getSeconds(); \n" +
            "var strToAppend;\n" +
            "It (hours >12 )\n" +
            "{\n" +
            "    hours1 = \"0\" + (hours - 12);\n" +
            "strToAppend = \"PM\";\n" +
            "}\n" +
            "else if (hours <12)\n" +
            "{\n" +
            "    hours1 = \"0\" + hours;\n" +
            "    strToAppend = \"AM\";\n" +
            "}\n" +
            "else\n" +
            "{\n" +
            "    hours1 = hours;\n" +
            "    strToAppend = \"PM\";\n" +
            "}\n" +
            "if(mins<10)\n" +
            "mins = \"0\" + mins;\n" +
            "if (secs<10)\n" +
            "    secs = \"0\" + secs;\n" +
            "switch (month)\n" +
            "{\n" +
            "    case 1:\n" +
            "        monthName = \"January\";\n" +
            "        break;\n" +
            "    case 2:\n" +
            "        monthName = \"February\";\n" +
            "        break;\n" +
            "    case 3:\n" +
            "        monthName = \"March\";\n" +
            "        break;\n" +
            "    case 4:\n" +
            "        monthName = \"April\";\n" +
            "        break;\n" +
            "    case 5:\n" +
            "        monthName = \"May\";\n" +
            "        break;\n" +
            "    case 6:\n" +
            "        monthName = \"June\";\n" +
            "        break;\n" +
            "    case 7:\n" +
            "        monthName = \"July\";\n" +
            "        break;\n" +
            "    case 8:\n" +
            "        monthName = \"August\";\n" +
            "        break;\n" +
            "    case 9:\n" +
            "        monthName = \"September\";\n" +
            "        break;\n" +
            "    case 10:\n" +
            "        monthName = \"October\";\n" +
            "        break;\n" +
            "    case 11:\n" +
            "        monthName = \"November\";\n" +
            "        break;\n" +
            "    case 12:\n" +
            "        monthName = \"December\";\n" +
            "        break;\n" +
            "}\n" +
            "\n" +
            "var year = currentDate.getFullYear();\n" +
            "var myString;\n" +
            "myString = \"Today is \" + day +  \" - \" + monthName + \" - \" + year + \".<br />Current time is \" + hours1 + \":\" + mins + \":\" + secs + \" \" + strToAppend + \".\";\n" +
            "document.write(myString);";
    public static final String answer121 = "Suppose you have only a few lines of code that is specific to a particular webpage. In that case, it is better to keep your JavaScript code internal within your HTML document.\n" +
            "\n" +
            "On the other hand, if your JavaScript code is used in many web pages, you should consider keeping your code in a separate file. If you wish to make some changes to your code, you have to change only one file, making code maintenance easy. If your code is too long, it is better to keep it in a separate file. This helps in easy debugging.";
    public static final String answer122 = "Yes. JavaScript has a global object and everything runs under it. window is that global object that holds global variables, global functions, location, history everything is under it. Besides, setTimeout, ajax call (XMLHttpRequest), console or localStorage are part of window.\n" +
            "\n" +
            "document is also under window. document is a property of the window object. document represents the DOM and DOM is the object oriented representation of the html markup you have written. All the nodes are part of document. Hence you can use getElementById or addEventListener on document. These methods are not present in the window object.\n" +
            "\n" +
            "\n" +
            "window.document === document; //true\n" +
            "window.getElementById; //undefined\n" +
            "document.getElementById; //function getElementById() { [native code] }";
    public static final String answer123 = "window.onload is fired when DOM is ready and all the contents including images, css, scripts, sub-frames, etc. finished loaded. This means everything is loaded.\n" +
            "\n" +
            "document.onload is fired when DOM (DOM tree built from markup code within the document)is ready which can be prior to images and other external content is loaded.\n" +
            "\n" +
            "Think about the differences between window and document, this would be easier for you.\n" +
            "\n" +
            "Bonus:document.readyState Returns \"loading\" while the Document is loading, \"interactive\" once it is finished parsing but still loading sub-resources, and \"complete\" once it has loaded. The readystatechange event fires on the Document object when this value changes.";
    public static final String answer124= "Attributes are just like attribute in your html tag (XML style attribute) inside the starting tag. html attributes are exposed to the DOM via property. Hence, a property is created when DOM is parsed for each attribute in the html tag. If you change an attribute only the value of the property will change. However, the value of attribute will remain same.";
    public static final String answer125 = "You can use the following methods in document\n" +
            "\n" +
            "getElementById to get a element that has the provided Id.\n" +
            "getElementsByClassName to get a nodelist (nodelist is not an array, rather it is array-like object) by providing a class name.\n" +
            "getElementsByTagName to get a nodelist by the provided tag name.\n" +
            "querySelector you will pass css style selector (jquery style) and this will retrurn first matched element in the DOM.\n" +
            "querySelectorAll will return a non-live nodelist by using depth-first pre order traversal of all the matched elements. Non-live means, any changes after selecting the elements will not be reflected.\n" +
            "There are two more options but I dont use them frequently-\n" +
            "\n" +
            "getElementsByName returns the list of elements by the provided name of the html tag\n" +
            "getElementsByTagNameNS returns elements with particular tag name within the provided namespace";
    public static final String answer126 = " It depends on what you are selecting. If you have an ID of an element getElmentById is the fastest way to select an element. However, you should not have so many ID in you document to avoid style repetition. css class getElementsByClassName is the second quickest way to select an element\n" +
            "\n" +
            "Here is the list. As we go downwards through the list, it takes more time to select elements.\n" +
            "\n" +
            "ID (#myID)\n" +
            "Class (.myClass)\n" +
            "Tag (div, p)\n" +
            "Sibling (div+p, div~p)\n" +
            "child (div>p)\n" +
            "Descendant (div p)\n" +
            "Universal (*)\n" +
            "Attribute (input[type=\"checkbox\"])\n" +
            "Pseudo (p:first-child)\n" +
            "If you have crazy long selectors to select element, think about your selectors and check whether you can use a class instead.";
    public static final String answer127 = "Yeah. Both array and nodeList have length and you can loop through elements but they are not same object.\n" +
            "\n" +
            "Both are inherited from Object. However array has different prototype object than nodeList. forEach, map, etc are on array.prototype which doesn't exist in the NodeList.prototype object. Hence, you don't have forEach on a nodeList\n" +
            "\n" +
            "\n" +
            "myArray --> Array.prototype --> Object.prototype --> null\n" +
            "\n" +
            "myNodeList --> NodeList.prototype --> Object.prototype --> null";
    public static final String answer128 = " First, get all the elements in the DOM. You can either get it by Tag Name '*' and then check whether they have the particular attribute. In this case, even if attribute is null that will be captured. If you need to check the value, you should be able to do it by passing one extra parameter and comparing it in the if block.\n" +
            "\n" +
            "\n" +
            "function getElementsByAttribute(attribute){\n" +
            "  var allElements = document.getElementsByTagName('*'), \n" +
            "      elm,\n" +
            "      found=[];\n" +
            "  for (var i = 0; i < allElements.length; i++)\n" +
            "   {\n" +
            "    elm = allElements[i];\n" +
            "    if (elm.getAttribute(attribute))\n" +
            "    {\n" +
            "      found.push(elm);\n" +
            "    }\n" +
            "  }\n" +
            "  return found;\n" +
            "}";
    public static final String answer129 = "Very simple. Just get the element and add the classname to the classlist.\n" +
            "\n" +
            "\n" +
            "function addClass(selector, className){\n" +
            "   var elm = document.querySelector(selector);\n" +
            "   if (elm){\n" +
            "      elm.classList.add(className);\n" +
            "   }\n" +
            "}\n" +
            "        \n" +
            "Similarly, you can implement removeClass, toggleClass and hasClass\n" +
            "\n" +
            "\n" +
            "//IE9+\n" +
            "el.classList.remove('my-class'); //removing a class\n" +
            "el.classList.toggle('my-class');  // toggling a class\n" +
            "el.classList.contains('my-class'); // checking whether class exists";
    public static final String answer130 = "First check whether the passed parent is the direct parent of the child. If not, keep moving upward to the root of the tree.\n" +
            "\n" +
            "\n" +
            "function isDescendant(parent, child){ \n" +
            "  while(child.parentNode ){ \n" +
            "    if(child.parentNode == parent)\n" +
            "      return true;\n" +
            "    else\n" +
            "      child = child.parentNode;\n" +
            "  }\n" +
            "  return false;\n" +
            "}";
    public static final String answer131 = "When you set innerHTML property, browser removes all the current children of the elements. Parse the string and assign the parsed string to the element as children.\n" +
            "\n" +
            "For example, if you want to add a list item to an unorderedList. You can get the element and set the innerHTML of the element like\n" +
            "\n" +
            "\n" +
            "var ul = document.getElementById('myList');\n" +
            "\n" +
            "el.innerHTML = '<li>Only one item</li>';              \n" +
            "      \n" +
            "Extra Credit: innerHTML could be slow while parsing a string. Browser has to deal with the string and if you have crappy html (invalid html).\n" +
            "\n" +
            "appendChild\n" +
            "On the other hand, while using appendChild, you create a new Element. Since you are creating it, browser doesn't have to parse string and there is no invalid html. And you can pass the child to the parent and child will be appended to the parent.\n" +
            "\n" +
            "\n" +
            "var li = document.createElement(\"li\");\n" +
            "var text = document.createTextNode('Only one Item');\n" +
            "\n" +
            "li.appendChild(text);\n" +
            "ul.appendChild(li);\n" +
            "      \n" +
            "Extra Credit: If you pass a reference to be appended as child other than creating a new element. The reference you are passing will be removed from the current parent and will be added to the new parent you are appending to.\n" +
            "\n" +
            "Though you would be writing couple more lines of JavaScript, it makes browsers life easier and your page faster.";
    public static final String answer132 = "documentFragment a very lightweight or minimal part of a DOM or a subtree of a DOM tree. It is very helpful when you are manipulating a part of DOM for multiple times. It becomes expensive to hit a certain portion of DOM for hundreds time. You might cause reflow for hundred times. Stay tuned for reflow.\n" +
            "\n" +
            "If you are changing dom that cause expensive reflow, you can avoid it by using documentFragment as it is managed in the memory.\n" +
            "\n" +
            "\n" +
            "//bad practice. you are hitting the DOM every single time\n" +
            "var list = ['foo', 'bar', 'baz', ... ],\n" +
            "    el, text;\n" +
            "for (var i = 0; i < list.length; i++) {\n" +
            "    el = document.createElement('li');\n" +
            "    text = document.createTextNode(list[i]);\n" +
            "    el.appendChild(text);\n" +
            "    document.body.appendChild(el);\n" +
            "}\n" +
            "      \n" +
            "\n" +
            "//good practice. you causing reflow one time\n" +
            "var fragment = document.createDocumentFragment(),\n" +
            "    list = ['foo', 'bar', 'baz', ...],\n" +
            "    el, text;\n" +
            "for (var i = 0; i < list.length; i++) {\n" +
            "    el = document.createElement('li');\n" +
            "    text = document.createTextNode(list[i]);\n" +
            "    el.appendChild(text);\n" +
            "    fragment.appendChild(el);\n" +
            "}\n" +
            "document.body.appendChild(fragment);\n" +
            "      ";
    public static final String answer133 = "Aha... so many questions at the same time. Take a breathe Mr. Interviewer.\n" +
            "\n" +
            "reflow: When you change size or position of an element in the page, all the elements after it has to change their position according to the changes you made. For example, if you change height on an element, all the elements under it has to move down in the page to accomodate a change in height. Hence, flow of the elements in the page is changed and this is called reflow.\n" +
            "\n" +
            "Why reflow is bad: Reflows could be very expensive and it might have a performance hit specially in the smaller devices like phone. As it might causes changes in the portion (or whole) layout of the page." +
            "\n\n" +
            "Reasons to reflow: The following cases causes reflow\n" +
            "\n" +
            "change layout (geometry of the page)\n" +
            "resize the window\n" +
            "change height/width of any element\n" +
            "changing font\n" +
            "change font size\n" +
            "move DOM element (animation)\n" +
            "adding or removing stylesheet\n" +
            "calculating offset height or offset width\n" +
            "display: none;\n" +
            "How to avoid: To avoid reflow, try to avoid doing things in the above list and some more in the below\n" +
            "\n" +
            "avoid setting multiple inline style\n" +
            "apply animation to the elements that are positioned fixed or absolute\n" +
            "avoid tables for layout";
    public static final String answer134 = "repaint happens when you change the look of an element without changing the size and shape. This doesn't cause reflow as geometry of the element didn't changed.\n" +
            "\n" +
            "How it happens:\n" +
            "\n" +
            "change background color\n" +
            "change text color\n" +
            "visibility hidden" +
            "\n" +
            "If possible, prefer repaint over reflow.";
    public static final String answer135 = "There are four different ways-\n" +
            "\n" +
            "option-1: Put your script in the last tag of html body element. DOM would be ready by the time browser hits the script tag.\n" +
            "\n" +
            "option-2: Place your code inside a DOMContentLoaded handler. This event will be fired when DOM is completely loaded.\n" +
            "\n" +
            "\n" +
            "document.addEventListener('DOMContentLoaded', function(){   \n" +
            "   //put your script here\n" +
            "});\n" +
            "      \n" +
            "option-3: Watch changes in the readyState of the document. And the last state is \"complete\" state, you can put your code there.\n" +
            "\n" +
            "\n" +
            "document.onreadystatechange = function () {  \n" +
            "  if (document.readyState == \"complete\") {\n" +
            "    //put your script here\n" +
            "  }\n" +
            "}\n" +
            "      \n" +
            "option-4: Search jquery source code and copy dom ready function. In that case you have a ready function that works in the older browsers as well without loading the whole jquery library.";
    public static final String answer136 = " If you have one hundred list items that have similar event to handle. You can write one hundred event handler (actually copy paste) same code in 99 places. This works but if something changes in the event handler, you have to change in one hundred places. This doesn't call job security. This is called screwed up.\n" +
            "\n" +
            "Second problem is if you want to dynamically add a new element, you have to make sure event handler is attached with the new element. More JavaScript code!" +
            "\n\n" +
            "Best Practice:\n" +
            "We can actually leverage event bubbling. You can have only one event handler attached to the parent element of one hundred list items. In this case, you can attach the event handler to the \"ul\" tag. After you click on a list item (list item does not have an event), event will bubble and \"ul\" has a handler. That handler will be fired.\n" +
            "\n" +
            "\n" +
            "<ul id=\"listToDestroy\">\n" +
            "    <li><a href=\"#\">first item</a></li>\n" +
            "    <li><a href=\"#\">second item</a></li>\n" +
            "    <li><a href=\"#\">third item</a></li>\n" +
            "    <li><a href=\"#\">forth item</a></li>\n" +
            "    <li><a href=\"#\">Fifth item</a></li>\n" +
            "</ul>\n" +
            "        \n" +
            "\n" +
            "document.getElementById('listToDestroy').addEventListener('click', function (e) { \n" +
            "    var elm = e.target.parentNode; \n" +
            "        elm.parentNode.removeChild(elm);\n" +
            "        e.preventDefault();\n" +
            "});";
    public static final String answer137 = "One way of solving is to attach a event handler with the button to destroy itself and append two. However, we can leverage event delegate. If we attach the event hander to the parent div instead of the button itself. We don't have to add the event handler to each button we create. So, we will take advantage of event bubbling.\n" +
            "\n" +
            "Try to be Smart: If both the newly created button is identical to one we are destroying, why interviewer wants to destroy exactly similar one and then create one. Why not just add one. And end result would be same, you will have two two buttons.\n" +
            "\n" +
            "Interviewer: I just want to see whether you can destroy any element. Make sure when you are destroying, there is no reference to the element, otherwise, you will have memory leak. If interviewer, says ok, just create one more button on click, then use your brain to change the following code.\n" +
            "\n" +
            "\n" +
            "<div id=\"doubleHolder\">\n" +
            "  <button class=\"double\">double</button>\n" +
            "</div>\n" +
            "        \n" +
            "\n" +
            "document.getElementById('doubleHolder').addEventListener('click', function (e) {   \n" +
            "   if(e.target.classList.contains('double')){\n" +
            "      var btn = document.createElement('button');\n" +
            "      btn.setAttribute('class', 'double');\n" +
            "      btn.innerHTML = 'double';\n" +
            "\n" +
            "      var btn2 = document.createElement('button');\n" +
            "      btn2.setAttribute('class', 'double');\n" +
            "      btn2.innerHTML = 'double';\n" +
            "     \n" +
            "      this.appendChild(btn);\n" +
            "      this.appendChild(btn2);\n" +
            "      this.removeChild(e.target);   \n" +
            "    }\n" +
            "  }); ";
    public static final String answer138 = "You can leverage, event bubble to capture all the clicks. As all the clicks will be bubbled up to the body.\n" +
            "\n" +
            "\n" +
            "document.querySelector('body').addEventListener('click', function(e){\n" +
            "  console.log('body clicked', e.target);\n" +
            "});\n" +
            "\n" +
            "//or\n" +
            "window.onclick =function(e){\n" +
            "  console.log('someone clicked', e.target)\n" +
            "}\n" +
            "          \n" +
            "However, if event bubbling is canceled by stopPropagation() your code will not work. Think about it.";
    public static final String answer139 = "The easiest way to get all the text is to get the innerText of body tag.\n" +
            "\n" +
            "\n" +
            "document.body.innerText;" +
            "\n\n\n" +
            "Question: Can you do by accessing DOM?\n" +
            "\n" +
            "Answer: Make it recursive. I used closure. There could be many other ways to implement.\n" +
            "\n" +
            "\n" +
            "function getAllText(node){\n" +
            "  var allText = [];\n" +
            "\n" +
            "  function getNodeText(node){\n" +
            "      if(node && node.childNodes && node.childNodes.length){\n" +
            "          for(var i = 0, len = node.childNodes.length; i<len; i++){\n" +
            "              getNodeText(node.childNodes[i]);\n" +
            "          }\n" +
            "      }\n" +
            "      else{\n" +
            "          allText.push(node.nodeValue);\n" +
            "     }\n" +
            "  }\n" +
            "  getNodeText(node);\n" +
            "  return allText.join('');\n" +
            "}\n" +
            "        \n" +
            "disclaimer: I didn't explicitly tested these two methods.";
    public static final String answer140 = "BOM stands for Browser Object Model. It provides interaction with the browser. The default object of a browser is a window. So, you can call all the functions of the window by specifying the window or directly. The window object provides various properties like document, history, screen, navigator, location, innerHeight, innerWidth.";
    public static final String answer141 = "The BOM (Browser Object Model) consists of the objects navigator, history, screen, location and document which are children of window. In the document node is the DOM (Document Object Model), the document object model, which represents the contents of the page. You can manipulate it using javascript.";
    public static final String answer142 = "window object\n" +
            "The top level object in the BOM is the window object. The window object represents the browser window. All other browser objects are contained within the window object. The window object includes a number of properties and methods that can be used to control the Web browser.";
    public static final String answer143 = "There are no official standards for the Browser Object Model (BOM).\n" +
            "\n" +
            "Since modern browsers have implemented (almost) the same methods and properties for JavaScript interactivity, it is often referred to, as methods and properties of the BOM.";
    public static final String answer144 = "Browser Object Model";
    public static final String answer145 = "This collection of browser objects is collectively known as the Browser Object Model, or BOM. BOM is not standardized by ECMAScript , though it is described as core part of JavaScript. The important BOM objects are as:\n" +
            "\n" +
            "document\n" +
            "location\n" +
            "history\n" +
            "navigator\n" +
            "screen\n" +
            "frames";
    public static final String answer146 = "Window Object: Window Object is always at top of the hierarchy. Document object: When an HTML document is loaded into a window, it becomes a document object.";
    public static final String answer147 = "The window object represents the web browser itself. All global JavaScript objects, functions, and variables automatically become members of the window object. Global variables are properties of the window object. Global functions are methods of the window object. The document property points to the DOM document loaded in that window.";
    public static final String answer148 = "Use the window object innerWidth and innerHeight property.\n" +
            "var w = window.innerWidth; //return the width of browser window including the vertical scrollbar.\n" +
            "var h = window.innerHeight; //return the height of browser window including the horizontal scrollbar.\n" +
            "\n" +
            "The innerWidth and innerHeight is not supported by in Internet Explorer < 9. To get the size of window in IE 6, 7, 8:\n" +
            "var w = document.documentElement.clientWidth;\n" +
            "var h = document.documentElement.clientHeight;";
    public static final String answer149 = "The navigator object contains information about the browser:\n" +
            "var browserName = navigator.appName; //returns the name of the browser.\n" +
            "var browserVersion = navigator.appVersion; //returns the version of the browser.\n" +
            "var userAgent = navigator.userAgent //returns the user agent string for the browser.\n" +
            "var cookieEnabled = navigator.cookieEnabled; //returns whether cookies are enabled in the browser.";
    public static final String answer150 = "It’s an Immediately-Invoked Function Expression, or IIFE for short. It executes immediately after it’s created:\n" +
            "\n" +
            "(function IIFE(){\n" +
            "    console.log( \"Hello!\" );\n" +
            "})();\n" +
            "// \"Hello!\"\n" +
            "This pattern is often used when trying to avoid polluting the global namespace, because all the variables used inside the IIFE (like in any other normal function) are not visible outside its scope.";
    public static final String answer151 = "const and Object.freeze are two completely different things.\n" +
            "\n" +
            "const applies to bindings (“variables”). It creates an immutable binding, i.e. you cannot assign a new value to the binding.\n" +
            "const person = {\n" +
            "    name: \"Leonardo\"\n" +
            "};\n" +
            "let animal = {\n" +
            "    species: \"snake\"\n" +
            "};\n" +
            "person = animal; // ERROR \"person\" is read-only\n" +
            "Object.freeze works on values, and more specifically, object values. It makes an object immutable, i.e. you cannot change its properties.\n" +
            "let person = {\n" +
            "    name: \"Leonardo\"\n" +
            "};\n" +
            "let animal = {\n" +
            "    species: \"snake\"\n" +
            "};\n" +
            "Object.freeze(person);\n" +
            "person.name = \"Lima\"; //TypeError: Cannot assign to read only property 'name' of object\n" +
            "console.log(person);";
    public static final String answer152 = "Generators are functions which can be exited and later re-entered. Their context (variable bindings) will be saved across re-entrances. Generator functions are written using the function* syntax. When called initially, generator functions do not execute any of their code, instead returning a type of iterator called a Generator. When a value is consumed by calling the generator’s next method, the Generator function executes until it encounters the yield keyword.\n" +
            "\n" +
            "The function can be called as many times as desired and returns a new Generator each time, however each Generator may only be iterated once.\n" +
            "\n" +
            "function* makeRangeIterator(start = 0, end = Infinity, step = 1) {\n" +
            "    let iterationCount = 0;\n" +
            "    for (let i = start; i < end; i += step) {\n" +
            "        iterationCount++;\n" +
            "        yield i;\n" +
            "    }\n" +
            "    return iterationCount;\n" +
            "}";
    public static final String answer153 = "To put it simple, generator has two features:\n" +
            "\n" +
            "one can choose to jump out of a function and let outer code to determine when to jump back into the function.\n" +
            "the control of asynchronous call can be done outside of your code\n" +
            "The most important feature in generators — we can get the next value in only when we really need it, not all the values at once. And in some situations it can be very convenient.";
    public static final String answer154 = "var output = (function(x) {\n" +
            "  delete x;\n" +
            "  return x;\n" +
            "})(0);\n" +
            "\n" +
            "console.log(output);\n" +
            "Above code will output 0 as output. delete operator is used to delete a property from an object. Here x is not an object it’s local variable. delete operator doesn’t affect local variable.";
    public static final String answer155 = "The Prototype Pattern creates new objects, but rather than creating non-initialized objects it returns objects that are initialized with values it copied from a prototype – or sample – object. The Prototype pattern is also referred to as the Properties pattern.\n" +
            "\n" +
            "An example of where the Prototype pattern is useful is the initialization of business objects with values that match the default values in the database. The prototype object holds the default values that are copied over into a newly created business object.\n" +
            "\n" +
            "Classical languages rarely use the Prototype pattern, but JavaScript being a prototypal language uses this pattern in the construction of new objects and their prototypes.";
    public static final String answer156 = "In ES6 let and const are hoisted (like var, class and function), but there is a period between entering scope and being declared where they cannot be accessed. This period is the temporal dead zone (TDZ).\n" +
            "\n" +
            "Consider:\n" +
            "\n" +
            "//console.log(aLet)  // would throw ReferenceError\n" +
            "\n" +
            "let aLet;\n" +
            "console.log(aLet); // undefined\n" +
            "aLet = 10;\n" +
            "console.log(aLet); // 10\n" +
            "In this example the TDZ ends when aLet is declared, rather than assigned.";
    public static final String answer157 = "To understand the differences between the two, let’s look at what each function does.\n" +
            "\n" +
            "forEach\n" +
            "\n" +
            "Iterates through the elements in an array.\n" +
            "Executes a callback for each element.\n" +
            "Does not return a value.\n" +
            "const a = [1, 2, 3];\n" +
            "const doubled = a.forEach((num, index) => {\n" +
            "  // Do something with num and/or index.\n" +
            "});\n" +
            "\n" +
            "// doubled = undefined\n" +
            "map\n" +
            "\n" +
            "Iterates through the elements in an array.\n" +
            "“Maps” each element to a new element by calling the function on each element, creating a new array as a result.\n" +
            "const a = [1, 2, 3];\n" +
            "const doubled = a.map(num => {\n" +
            "  return num * 2;\n" +
            "});\n" +
            "\n" +
            "// doubled = [2, 4, 6]\n" +
            "The main difference between .forEach and .map() is that .map() returns a new array. If you need the result, but do not wish to mutate the original array, .map() is the clear choice. If you simply need to iterate over an array, forEach is a fine choice.";
    public static final String answer158 = "A variation of the module pattern is called the Revealing Module Pattern. The purpose is to maintain encapsulation and reveal certain variables and methods returned in an object literal. The direct implementation looks like this:\n" +
            "\n" +
            "var Exposer = (function() {\n" +
            "  var privateVariable = 10;\n" +
            "\n" +
            "  var privateMethod = function() {\n" +
            "    console.log('Inside a private method!');\n" +
            "    privateVariable++;\n" +
            "  }\n" +
            "\n" +
            "  var methodToExpose = function() {\n" +
            "    console.log('This is a method I want to expose!');\n" +
            "  }\n" +
            "\n" +
            "  var otherMethodIWantToExpose = function() {\n" +
            "    privateMethod();\n" +
            "  }\n" +
            "\n" +
            "  return {\n" +
            "      first: methodToExpose,\n" +
            "      second: otherMethodIWantToExpose\n" +
            "  };\n" +
            "})();\n" +
            "\n" +
            "Exposer.first();        // Output: This is a method I want to expose!\n" +
            "Exposer.second();       // Output: Inside a private method!\n" +
            "Exposer.methodToExpose; // undefined\n" +
            "An obvious disadvantage of it is unable to reference the private methods";
    public static final String answer159 = "Ajax is abbreviated as Asynchronous Javascript and XML. It is new technique used to create better, faster and more interactive web systems or applications. Ajax uses asynchronous data transfer between the Browser and the web server.\n" +
            "\n" +
            "This technique is used to make internet faster and user friendly. It is not a programming language.";
    public static final String answer160 = "Browser based applications and platform independent applications are used by Ajax.";
    public static final String answer161 = "There are two types of triggers used in update panel:\n" +
            "\n" +
            "PostBackTrigger – This works as full postback and it cannot work asynchronously\n" +
            "AsyncPostBackTrigger – Partial post back asynchronously";
    public static final String answer162 = "Following are the controls of Ajax:\n" +
            "\n" +
            "ScriptManager\n" +
            "ScriptManagerProxy\n" +
            "UpdatePanel\n" +
            "UpdateProgress\n" +
            "Timer";
    public static final String answer163 = "Ajaxcontroltoolkit.dll is the DLL used for Ajax control tool kit and it can be downloaded from the internet. It can be added in the tool box or copied directly in the bin folder.";
    public static final String answer164 = "# is treated as fragment delimiter to delimit the history state and && precedes is used to check on the information in the query string.";
    public static final String answer165 = "AsyncPostBackTimeout property is used to control the duration of Ajax request. Deafult value of this property is 90 seconds.\n" +
            "\n" +
            "Example –\n" +
            "\n" +
            "<asp:ScriptManager runat=\"server\" id=\"sample\" AsyncPostBackTimeout=\"40\"/>";
    public static final String answer166 = "Following are the advantages of Ajax:\n" +
            "\n" +
            "Bandwidth utilization – It saves memory when the data is fetched from the same page.\n" +
            "More interactive\n" +
            "Speeder retrieval of data";
    public static final String answer167 = "Following are the disadvantages of Ajax:\n" +
            "\n" +
            "1.AJAX is dependent on Javascript. If there is some Javascript problem with the browser or in the OS, Ajax will not support\n" +
            "2.Ajax can be problematic in Search engines as it uses Javascript for most of its parts.\n" +
            "3.Source code written in AJAX is easily human readable. There will be some security issues in Ajax.\n" +
            "4.Debugging is difficult\n" +
            "5.Increases size of the requests\n" +
            "6.Slow and unreliable network connection.\n" +
            "7.Problem with browser back button when using AJAX enabled pages.";
    public static final String answer168 = "Update panel  is a server control used to update the specified portion of a web page. Script Manager needs to be used whenever update panel is used. Using update panel, user cannot handle outside controls.";
    public static final String answer169 = "There are two methods used to transfer data between the two more more security domains:\n" +
            "\n" +
            "CORS – Cross Origin Resource Sharing and it works with the HTTP web browsers\n" +
            "JSONP – JSON with Padding which works with the HTTP GET and on legacy browsers";
    public static final String answer170 = "AJAX uses following technologies:\n" +
            "\n" +
            "JavaScript\n" +
            "XMLHttpRequest\n" +
            "Document Object Model (DOM)\n" +
            "Extensible HTML (XHTML)\n" +
            "Cascading Style Sheets (CSS)";
    public static final String answer171 = "Following are the features of Ajax and they are as follows:\n" +
            "\n" +
            "Live data binding\n" +
            "Client-side template rendering\n" +
            "Declarative instantiation of client components\n" +
            "Observer pattern on JavaScript objects and arrays\n" +
            "Invoking ADO.NET data services and data contexts\n" +
            "DataView control";
    public static final String answer172 = "JSON is abbreviated as JavaScript Object Notation.\n" +
            "\n" +
            "JSON is a safe and reliable data interchange format in JavaScript, which is easy to understand for both users and machines.";
    public static final String answer173 = "There are two components of AJAX Architecture:\n" +
            "\n" +
            "AJAX client architecture\n" +
            "AJAX server architecture";
    public static final String answer174 = "AJAX Control Toolkit is one of the extenders that are used to extend or add the functionalities of the ASP.NET controls. The extenders use a block of JavaScript code to add new and enhanced capabilities to the ASP.NET controls.\n" +
            "\n" +
            "AJAX Control Extender Toolkit is a free download from site.";
    public static final String answer175 = "Users cannot use AJAX if\n" +
            "\n" +
            "If Page need to show in a search engine\n" +
            "If browser does not support JavaScript\n" +
            "If user wants to create secure application";
    public static final String answer176 = "AJAX is a built-in functionality of .NET Framework 4.0 and AJAX application can be executed by just installing Microsoft Visual Studio 2010. To use extenders in your applications, you are required to install AJAX Control Toolkit and copy the AjaxControlToolkit.dll file to the Bin directory of your application.";
    public static final String answer177 = "ASP.NET AJAX is a free framework to implement Ajax in asp.net web applications. It is used to quickly creating efficient and interactive Web applications that work across all browsers.";
    public static final String answer178 = "Absolutely. Java is a top-notch suit for AJAX! You can use Java Enterprise Edition servers to generate AJAX consumer pages and to serve incoming AJAX requests, manipulate server-aspect nations for AJAX customers, and join AJAX customers for your corporation resources. The JavaServer Faces aspect version is a top-notch suit for outlining and the use of AJAX additives.";
    public static final String answer179 = "An Asynchronous request is defined as the script execution which allows proceeding with the next line of execution irrespective of the response from the web server after a request, which can be handled later upon the receipt of the response from the web server. Asynchronous is the most important mechanism in responding to the user without any delay where a user can still interact with the web pages irrespective of the responses from the server for the previous requests.";
    public static final String answer180 = "The synchronous and Asynchronous type requests in AJAX are used based on the request priority of the web server request. They should be carefully configured to make the server respond to the user based on the user requirement. The synchronous request waits for the server’s response after requesting to proceed with the next part of the script execution, which is crucial in a fast response mechanism. This should be avoided frequently to make the server highly responsive. Wherever the synchronous request mechanism is essential or inevitable, it should be used.";
    public static final String answer181 = "If you haven’t selected a framework, but it’s encouraged, don’t forget to use JavaServer Faces or a JavaServer Faces-primarily based framework. JavaServer Faces additives may be created and used to summarise most of the information of producing JavaScript, AJAX interactions and therefore allow easy AJAX utilized by JSF utility builders plug-ins in JSF well suited IDE’s, inclusive of Sun Java Studio Creator.\n" +
            "\n" +
            "Neither Adaptive Path nor Google invented Ajax. Google’s current merchandise is the highest-profile example of Ajax programs. Adaptive Path changed into now no longer worried within's the improvement of Google’s Ajax programs. However, we were doing Ajax paintings for a number of our different customers.";
    public static final String answer182 = "If you propose now no longer to reuse a present AJAX aspect, right here are a number of the matters you may want to recognize.\n" +
            "\n" +
            "JavaScript: JavaScript is a loosely typed item-primarily based scripting language supported through all foremost browsers and crucial for AJAX interactions. JavaScript in a web page is referred to as whilst an occasion in a web page happens inclusive of a web page load, a mouse click, or a keypress in a shape element.\n" +
            "\n" +
            "Plan to research Dynamic HTML (DHTML), the generation this is the inspiration for AJAX. DHTML permits browser-primarily based real-time interplay between a person and an internet web page. DHTML is the aggregate of JavaScript, the Document Object Model (DOM), and Cascading Style Sheets (CSS).\n" +
            "\n" +
            "DOM: An API for getting access to and manipulating established documents. In maximum instances, DOM represents the shape of XML and HTML documents.\n" +
            "\n" +
            "CSS: This permits you to outline the presentation of a web page inclusive of fonts, colours, sizes, and positioning. CSS permits a clean separation of the presentation from the content material and can be modified programmatically through JavaScript.\n" +
            "\n" +
            "Understanding the simple request/reaction nature of HTTP is likewise critical. Many diffused insects can result in case you forget about the variations among the GET and OIst techniques whilst configuring XMLHttpRequest and HTTP reaction codes whilst processing callbacks.\n" +
            "\n" +
            "JavaScript is the consumer-aspect glue, in a sense. JavaScript is used to create the XMLHttpRequest Object and cause the asynchronous name. JavaScript is used to parse the back content material. JavaScript is used to investigate the back records and system back messages. JavaScript is used to inject the brand new content material into the HTML using the DOM API and to adjust the CSS.";
    public static final String answer183 = "It depends. The ‘X’ in AJAX stands for XML, however numerous AJAX proponents are short to factor out that not anything in AJAX, in keeping with se, precludes the use of different varieties of payload, inclusive of JavaScript, HTML, or simple textual content.\n" +
            "\n" +
            "HTML – Injecting server-generated HTML fragments without delay right into a file is usually a completely powerful AJAX technique. However, it is able to be complex to maintain the server-aspect aspect in sync with what’s displayed at the consumer.\n" +
            "\n" +
            "XML – Web Services and AJAX appear made for one any other. You can use consumer-aspect API for downloading and parsing the XML content material from RESTful Web Services. (However bear in mind with a few SOAP-primarily based totally Web Services architectures the payloads can get pretty massive and complicated, and consequently can be irrelevant with AJAX strategies.)\n" +
            "\n" +
            "Plain Text – In this case, server-generated textual content can be injected right into a file or evaluated through consumer-aspect common sense.\n" +
            "\n" +
            "JavaScript – This is an extension to the apparent textual content case with the exception that a server-aspect aspect passes a fraction of JavaScript inclusive of JavaScript item declarations. Using the JavaScript eval() feature you could then create the items at the consumer. JavaScript Object Notation (JSON), that’s a JavaScript item-primarily based totally records trade specification, is based on this technique.";
    public static final String answer184 = "A person may pick to apply the browser’s again or ahead buttons, bookmark a web page, reproduce the URL from the URL bar and percentage it with a chum thru an email or chat consumer, or print a web page at any given time. When designing an AJAX-primarily based totally utility, you want to don’t forget what the predicted conduct could be withinside the case of navigation, bookmarking, printing, and browser guide as defined underneath.\n" +
            "\n" +
            "Navigation – While you can put into effect records manipulation manually it can be less complicated to apply JavaScript frameworks inclusive of Dojo that offer API’s records manipulation and navigation manipulation.\n" +
            "\n" +
            "Bookmarking and URL sharing – Many customers need to bookmark or reduce and paste the URL from the browser bar. \n" +
            "\n" +
            "Printing – In a few instances printing dynamically rendered pages may be elaborate.\n" +
            "\n" +
            "Other issues as a developer whilst the use of AJAX are:\n" +
            "\n" +
            "Browser Support – Not all AJAX/DHTML functions are supported on all browsers or all variations of a browser. See quirksmode.org for a listing of browser guides and viable workarounds.\n" +
            "\n" +
            "JavaScript disabled – You need to additionally don’t forget what occurs if the person disables JavaScript. Additionally, there are numerous valid reasons why JavaScript and CSS guides can be unavailable on a person’s net browser.\n" +
            "\n" +
            "Latency – Keep in mind latency to your layout. A walking utility may be lots extra responsive than whilst it’s far deployed.\n" +
            "\n" +
            "Latency troubles: delusion or reality?\n" +
            "\n" +
            "Accessibility – \n" +
            "\n" +
            "Degradability is the time period used to explain strategies utilized by net programs to evolve to the huge variety of net browser capabilities. Many AJAX libraries have computerized degradability integrated. But in case you are coding your personal custom AJAX capability, clearly taking a few cares to comply with the quality practices promoted through requirements our bodies just like the World Wide Web Consortium (W3C), and grass-roots actions just like the Web Standards network and lots of others, your utility can run usefully on browsers which can be incapable of AJAX behaviours. Granted, your utility might also additionally lose a number of the “wow factor” on those much less successful browsers. However, your utility will nevertheless be useful.\n" +
            "\n" +
            "Remember to now no longer layout with AJAX only for the sake of coolness. The cause you constructed your utility is so human beings will use it. And human beings will now no longer use your utility in case your utility isn’t always well suited with their net browser.";
    public static final String answer185 = "AJAX requests need to use an HTTP GET request whilst retrieving records wherein the records will now no longer extrude for a given request URL. An HTTP POST needs to be used whilst a nation is up to date at the server. This is in keeping with HTTP idempotency pointers and is exceedingly encouraged for a constant net utility structure.";
    public static final String answer186 = "There isn’t that much equipment available with a purpose to guide each consumer-aspect and server-aspect debugging. I am sure this can extrude as AJAX programs proliferate. \n" +
            "\n" +
            "Firefox/Mozilla/Netscape – Have an integrated debugger Venkman which may be useful. However, there’s a Firefox upload referred to as FireBug, which gives all of the statistics an AJAX developer could ever want inclusive of the cap potential to investigate the browser DOM, console admission to to the JavaScript runtime withinside the browser, and the cap potential to look the HTTP requests and responses (inclusive of the ones made through an XMLHttpRequest). I generally tend to increase my programs to start with on Firefox the use of Firebug then mission out to the alternative browsers.\n" +
            "\n" +
            "Safari – Has a debugger that desires to be enabled. See the Safari FAQ for information.\n" +
            "\n" +
            "Internet Explorer – There is MSDN Documentation on debugging JavaScript. A developer toolbar for Internet Explorer will also be useful.";
    public static final String answer187 = "Step 1. Set the charset of the web page to an encoding this is supported through your goal languages. I generally tend to apply UTF-eight as it covers maximum languages. The following meta announcement in an HTML/JSP web page will set the content material kind:\n" +
            "\n" +
            "Step 2. In the web page JavaScript ensures to encode any parameters despatched to the server. JavaScript gives the getaway() feature which returns Unicode get away strings wherein localized textual content will seem in hexadecimal format. For extra information on JavaScript encoding see evaluating get away(), encodeURI(), and encode URI Component().\n" +
            "\n" +
            "Step 3. On the server-aspect aspect, set the man or woman encoding the use of the HttpServletRequest.setCharacterEncoding() approach. Before you get admission to the localized parameter the use of the HttpServletRequest.getParameter() name. In the case of UTF this will be request .set Character Encoding (“UTF-eight”);.\n" +
            "\n" +
            "A server- aspect returning AJAX responses desires to set the encoding of the reaction to the identical encoding used at the web page.\n" +
            "\n" +
            "reaction.setContentType(\"textual content/xml;charset=;UTF-eight\");\n" +
            "reaction.getWriter().write(\" invalid  \");";
    public static final String answer188 = "TypeScript is a typed superset of JavaScript that compiles to plain JavaScript. It is pure object-oriented with classes, interfaces and statically typed programming languages like C# or Java. You will need a compiler to compile and generate the code in the JavaScript file. Basically, TypeScript is the ES6 version of JavaScript with some additional features.\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            "var message:string = \"Welcome to Edureka!\"\n" +
            "console.log(message)\n" +
            "A TypeScript code is written in a file with .ts extension and then compiled into JavaScript using the compiler. You can write the file in any code editor and the compiler needs to be installed on your platform. After the installation, the command tsc <filename>.ts compiles the TypeScript code into a plain JavaScript file.";
    public static final String answer189 = "TypeScript:" +
            "\n" +
            "1.TypeScript is an Object-Oriented language" +
            "\n" +
            "2.It has a feature known as Static typing" +
            "\n" +
            "3.TypeScript gives support for modules" +
            "\n" +
            "4.It supports optional parameter function" +
            "\n\n" +
            "JavaScript:" +
            "\n" +
            "1.JavaScript is a Scripting language" +
            "\n" +
            "2.It does not have static typing" +
            "\n" +
            "3.JavaScript does not support modules" +
            "\n" +
            "4.It does not support optional parameter function\n";
    public static final String answer190 = "There are different reasons why a JavaScript developer should consider using TypeScript. Some of them include:\n" +
            "\n" +
            "Using new features of ECMAScript: TypeScript supports new ECMAScript standards and transpile them to ECMAScript targets of your choice. So, you can use features of ES2015 and beyond.\n" +
            "\n" +
            "Static Typing: JavaScript is dynamically typed and does not know what type a variable is until it is actually instantiated at run-time. TypeScript adds type support to JavaScript.\n" +
            "\n" +
            "Type Inference: TypeScript makes typing a bit easier and a lot less explicit by the usage of type inference. Even if you don’t explicitly type the types, they are still there to save you from doing something which otherwise would result in a run-time error.\n" +
            "\n" +
            "Better IDE Support: The development experience with TypeScript is a great improvement over JavaScript. There is a wide range of IDEs that have excellent support for TypeScript, like Visual Studio & VS code, Atom, Sublime, and IntelliJ/WebStorm.\n" +
            "\n" +
            "Strict Null Checking: Errors, like cannot read property ‘x’ of undefined, is common in JavaScript programming. You can avoid most of these kinds of errors since one cannot use a variable that is not known to the TypeScript compiler.\n" +
            "\n" +
            "Interoperability: TypeScript is closely related to JavaScript so it has great interoperability capabilities, but some extra work is required to work with JavaScript libraries in TypeScript.";
    public static final String answer191 = "Cross-Platform:  The TypeScript compiler can be installed on any Operating System such as Windows, MacOS, and Linux.\n" +
            "\n" +
            "Object-Oriented Language: TypeScript provides features like Classes, Interfaces, and Modules. Thus, it can write object-oriented code for client-side as well as server-side development.\n" +
            "\n" +
            "Static Type-Checking: TypeScript uses static typing and helps type checking at compile time. Thus, you can find errors while writing the code without running the script.\n" +
            "\n" +
            "Optional Static Typing: TypeScript also allows optional static typing in case you are using the dynamic typing of JavaScript.\n" +
            "\n" +
            "DOM Manipulation: You can use TypeScript to manipulate the DOM for adding or removing elements.\n" +
            "\n" +
            "ES 6 Features: TypeScript includes most features of planned ECMAScript 2015 (ES 6, 7) such as class, interface, Arrow functions, etc.";
    public static final String answer192 = "The Benefits of using TypeScript are:\n" +
            "\n" +
            "TypeScript is fast, simple, easy to learn and runs on any browser or JavaScript engine.\n" +
            "\n" +
            "It is similar to JavaScript and uses the same syntax and semantics.\n" +
            "\n" +
            "This helps backend developers write front-end code faster.\n" +
            "\n" +
            "You can call the TypeScript code from an existing JavaScript code. Also, it works with existing JavaScript frameworks and libraries without any issues.\n" +
            "\n" +
            "The Definition file, with .d.ts extension, provides support for existing JavaScript libraries like Jquery, D3.js, etc.\n" +
            "\n" +
            "It includes features from ES6 and ES7 that can run in ES5-level JavaScript engines like Node.js.";
    public static final String answer193 = "TypeScript has the following disadvantages:\n" +
            "\n" +
            "TypeScript takes a long time to compile the code.\n" +
            "\n" +
            "It does not support abstract classes.\n" +
            "\n" +
            "If we run the TypeScript application in the browser, a compilation step is required to transform TypeScript into JavaScript.\n" +
            "\n" +
            "Web developers are using JavaScript for decades and TypeScript doesn't bring anything new.\n" +
            "\n" +
            "To use any third party library, the definition file is a must.\n" +
            "\n" +
            "Quality of type definition files is a concern.";
    public static final String answer194 = "There are three different types of components in TypeScript which includes:" +
            "\n\n" +
            "Language − It comprises of the syntax, keywords, and type annotations.\n" +
            "\n" +
            "The TypeScript Compiler − This compiler (tsc) converts the instructions written in TypeScript to its JavaScript equivalent.\n" +
            "\n" +
            "The TypeScript Language Service − The Language Service exposes an additional layer around the core compiler pipeline, editor-like applications. The language service supports the common set of typical editor operations.";
    public static final String answer195 = "Anders Hejlsberg developed TypeScript. Also, he is one of the core members of the development team of C# language. The typescript was first released in the month of October 1st, 2012 and was labeled version 0.8. But, it is developed and maintained by Microsoft under the Apache 2 license. It was designed for the development of a large application.\n" +
            "\n" +
            "The current stable version of TypeScript is 3.2 which was released on September 30, 2018. Typescript compiles to simple JavaScript code which runs on any browser that supports the ECMAScript 2015 framework. Also, it offers support for the latest and evolving JavaScript features.";
    public static final String answer196 = "There are two main ways to install TypeScript tools such as:\n" +
            "\n" +
            " Via npm (Node.js Package Manager) command-line tool\n" +
            "\n" +
            "npm install -g typescript\n" +
            "\n" +
            "By installing TypeScript via Visual Studio.\n" +
            "\n" +
            "If you use Visual Studio or VS Code IDE, the easiest way to add to Visual Studio or VS Code is to search and add a package or download from the TypeScript website. Also, you can download TypeScript Tools for Visual Studio.";
    public static final String answer197 = "The extension for any TypeScript file is .ts. And any JavaScript file is a TypeScript file as it is a superset of JavaScript. So, once you change the extension of “.js” to “.ts”, your TypeScript file is ready. To compile any .ts file into .js use the following command:\n" +
            "\n" +
            "tsc <TypeScript File Name>\n" +
            "\n" +
            "For example, to compile “shrcreation.ts”\n" +
            "\n" +
            "tsc shrcreation.ts\n" +
            "\n" +
            "And the result would be shrcreation.js";
    public static final String answer198 = "Yes, we can combine multiple files. While compiling, we need to add –outFILE [OutputJSFileName] option.\n" +
            "\n" +
            "tsc --outFile comman.js file1.ts file2.ts file3.ts\n" +
            "\n" +
            "This will compile all 3 “.ts” file and output into a single “comman.js” file.\n" +
            "\n" +
            "tsc --outFile file1.ts file2.ts file3.ts\n" +
            "\n" +
            "If you don’t provide an output file name, file2.ts and file3.ts will be compiled and the output will be placed in file1.ts. So now your file1.ts contains JavaScript code.";
    public static final String answer199 = "The Type System represents the different types of values supported by the language. It checks the validity of the supplied values before they are stored or manipulated by the program." +
            "\n\n" +
            "It can be classified into two types such as:\n" +
            "\n" +
            "Built-in: This includes number, string, boolean, void, null and undefined.\n" +
            "User-defined: It includes Enumerations (enums), classes, interfaces, arrays, and tuple.";
    public static final String answer200 = "In TypeScript, the built-in data types are also known as primitive data types and the list include:\n" +
            "\n" +
            "Number: This represents number type values. The numbers are stored as floating-point values in TypeScript.\n" +
            "\n" +
            "String: A string represents a sequence of characters stored as Unicode UTF-16 code.\n" +
            "\n" +
            "Boolean: This represents a logical value. When we use the Boolean type, we get the output only in true or false.\n" +
            "\n" +
            "Null: Null represents a variable whose value is undefined. It is not possible to directly reference the null type value itself.\n" +
            "\n" +
            "Undefined: The Undefined type denotes all uninitialized variables.\n" +
            "\n" +
            "Void: A void is the return type of the functions that do not return any type of value.";
    public static final String answer201 = "A variable is a named space in the memory which is used to store values. The type syntax for declaring a variable in TypeScript includes a colon (:) after the variable name, followed by its type. Similar to JavaScript, we use the var keyword to declare a variable. While declaring a variable in Typescript, certain rules must be followed-" +
            "\n\n" +
            "The variable name must be an alphabet or numeric digits.\n" +
            "You cannot start the name with digits.\n" +
            "It cannot contain spaces and special characters, except the underscore(_) and the dollar($) sign.";
    public static final String answer202 = "TypeScript supports the following object-oriented terms:" +
            "\n\n" +
            "Modules\n" +
            "Classes\n" +
            "Interfaces\n" +
            "Inheritance\n" +
            "Data Types\n" +
            "Member functions";
    public static final String answer203 = "The interface is a structure that defines the contract in your application. It defines the syntax for classes to follow. It contains only the declaration of the members and it is the responsibility of the deriving class to define the members. The TypeScript compiler uses interface for type-checking and checks whether the object has a specific structure or not.\n" +
            "\n" +
            "Syntax:" +
            "\n" +
            "interface interface_name {\n" +
            "// variables' declaration\n" +
            "// methods' declaration\n" +
            "}";
    public static final String answer204 = "TypeScript introduced classes so that they can avail the benefits of object-oriented techniques like encapsulation and abstraction. The class in TypeScript is compiled to plain JavaScript functions by the TypeScript compiler to work across platforms and browsers.\n" +
            "\n" +
            "A class includes the following:\n" +
            "\n" +
            "Constructor\n" +
            "Properties\n" +
            "Methods\n" +
            "Example:" +
            "\n\n" +
            "class Employee {\n" +
            "empID: number;\n" +
            "empName: string;\n" +
            " \n" +
            "constructor(ID: number, name: string) {\n" +
            "this.empName = name;\n" +
            "this.empID = ID;\n" +
            "}\n" +
            " \n" +
            "getSalary() : number {\n" +
            "return 40000;\n" +
            "}\n" +
            "}\n" +
            "}" +
            "\n\n" +
            "Some of the features of a class are:\n" +
            "\n" +
            "Inheritance\n" +
            "Encapsulation\n" +
            "Polymorphism\n" +
            "Abstraction";
    public static final String answer205 = "TypeScript supports access modifiers public, private and protected which determine the accessibility of a class member as given below:\n" +
            "\n" +
            "Public – All the members of the class, its child classes, and the instance of the class can access.\n" +
            "\n" +
            "Protected – All the members of the class and its child classes can access them. But the instance of the class can not access.\n" +
            "\n" +
            "Private – Only the members of the class can access them.\n" +
            "\n" +
            "If an access modifier is not specified it is implicitly public as that matches the convenient nature of JavaScript.";
    public static final String answer206 = "TypeScript is referred to as optionally statically typed, which means you can ask the compiler to ignore the type of a variable. Using any data type, we can assign any type of value to the variable. TypeScript will not give any error checking during compilation.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "var unknownType: any = 4;\n" +
            "unknownType = \"Welcome to Edureka\"; //string\n" +
            "unknownType = false; // A boolean.";
    public static final String answer207 = "A module is a powerful way of creating a group of related variables, functions, classes, and interfaces, etc. It can be executed within its own scope, but not in the global scope. Basically, you cannot access the variables, functions, classes, and interfaces declared in a module outside the module directly.\n" +
            "\n" +
            "A module can be created by using the export keyword and can be used in other modules by using the import keyword.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "module module_name{\n" +
            "class xyz{\n" +
            "export sum(x, y){\n" +
            "return x+y;\n" +
            "}\n" +
            "}";
    public static final String answer208 = "Namespace groups functionalities logically. These maintain the legacy code of typescript internally. It encapsulates the features and objects that share certain relationships. A namespace is also known as internal modules. A namespace can also include interfaces, classes, functions, and variables to support a group of related functionalities.\n" +
            "\n" +
            "Syntax:" +
            "\n\n" +
            "namespace <namespace_name> {\n" +
            "export interface I1 { }\n" +
            "export class c1{ }\n" +
            "}";
    public static final String answer209 = "Yes, TypeScript supports function overloading. But the implementation is odd. So, when you overload in TypeScript you only have one implementation with multiple signatures.\n" +
            "\n" +
            "For example:" +
            "\n\n" +
            "class Customer {\n" +
            "name: string;\n" +
            "Id: number;\n" +
            "add(Id: number);\n" +
            "add(name:string);\n" +
            "add(value: any) {\n" +
            "if (value && typeof value == \"number\") {\n" +
            "//Do something\n" +
            "}\n" +
            "if (value && typeof value == \"string\") {\n" +
            "//Do Something\n" +
            "}" +
            "\n\n" +
            "The first signature has one parameter of type number whereas the second signature has a parameter of type string. The third function contains the actual implementation and has a parameter of type any. The implementation then checks for the type of the supplied parameter and executes a different piece of code based on the supplier parameter type.";
    public static final String answer210 = "A Decorator is a special kind of declaration that can be applied to classes, methods, accessor, property, or parameter. Decorators are functions that are prefixed @expression symbol, where expression must evaluate to a function that will be called at runtime with information about the decorated declaration.\n" +
            "\n" +
            "TypeScript Decorators serves the purpose of adding both annotations and metadata to the existing code in a declarative way. To enable experimental support for decorators,you need to enable the experimentalDecorators compiler option either on the command line or in our tsconfig.json:\n" +
            "\n" +
            "Command Line\n" +
            "\n" +
            "$tsc --target ES5 --experimentalDecorators" +
            "\n\n" +
            "{\n" +
            "\"compilerOptions\": {\n" +
            "\"target\": \"ES5\",\n" +
            "\"experimentalDecorators\": true\n" +
            "}\n" +
            "}";
    public static final String answer211 = "In Javascript, Mixins are a way of building up classes from reusable components and then build them by combining simpler partial classes.\n" +
            "\n" +
            "The idea is simple, instead of a class A extending class B to get its functionality, function B takes class A and returns a new class with this added functionality. Here, function B is a mixin.";
    public static final String answer212 = "Unlike JavaScript, the TypeScript compiler throws an error if you try to invoke a function without providing the exact number and types of parameters as declared in its function signature. To overcome this problem, you can use optional parameters by using a question mark sign (‘?’). It indicates that the parameters which may or may not receive a value can be appended with a ‘?’ to mark them optional.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "function Demo(arg1: number, arg2? :number) {\n" +
            "}So, arg1 is always required, and arg2 is an optional parameter." +
            "\n\n" +
            "In the above example, arg1 is always required, and arg2 is an optional parameter.";
    public static final String answer213 = "The scope is a set of objects, variables, and function and the JavaScript can have a global scope variable and local scope variable.\n" +
            "\n" +
            "You can declare a variable in two different scopes such as:\n" +
            "\n" +
            "Local Scope Variable – It is a function object which is used within the functions\n" +
            "\n" +
            "Global Scope Variable – You can use this window object out of function and within the functions";
    public static final String answer214 = "TypeScript Definition Manager (TSD) is a package manager used to search and install TypeScript definition files directly from the community-driven DefinitelyTyped repository.\n" +
            "\n" +
            "Now, if you want to use some jQuery code in your .ts file:\n" +
            "\n" +
            "$(document).ready(function() { //Your jQuery code });\n" +
            "\n" +
            "Here, when you try to compile it by using tsc, it will give a compile-time error: Cannot find the name “$”. So, you need to inform the TypeScript compiler that “$” is belongs to jQuery. To do this, TSD comes into play. You can download the jQuery Type Definition file and include it in our .ts file.";
    public static final String answer215 = "JavaScript libraries or frameworks don’t have TypeScript declaration files. But if you want to use them in the TypeScript file without any compilation error, you have to use the declare keyword. The declare keyword is used for ambient declarations and methods where you want to define a variable that may exist elsewhere.\n" +
            "\n" +
            "If you want to use the library in our TypeScript code, you can use the following code:\n" +
            "\n" +
            "declare var myLibrary;\n" +
            "TypeScript runtime will assign the myLibrary variable as any type.";
    public static final String answer216 = "Function parameters can be assigned values by default. A parameter can’t be declared as optional and default both at the same time.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "let discount = function (price: number, rate: number = 0.40) {\n" +
            "return price * rate;\n" +
            "}\n" +
            "discount(500); // Result - 200\n" +
            "discount(500, 0.45); // Result - 225" +
            "\n" +
            "In the above example, rate is a default param as number in discount function. If we pass the value in the discount’s rate param, it will use this otherwise use default value 0.40.";
    public static final String answer217 = "The tsconfig.json file is a file which is in JSON format. In the tsconfig.json file, you can specify different options to tell the compiler how to compile the current project. The presence of a tsconfig.json file in a directory indicates that the directory is the root of a TypeScript project.\n" +
            "\n" +
            "Example of a sample tsconfig.json file:" +
            "\n\n" +
            "{\n" +
            "\"compilerOptions\": {\n" +
            "\"declaration\": true,\n" +
            "\"emitDecoratorMetadata\": false,\n" +
            "\"experimentalDecorators\": false,\n" +
            "\"module\": \"none\",\n" +
            "\"moduleResolution\": \"node\"\n" +
            "\"removeComments\": true,\n" +
            "\"sourceMap\": true\n" +
            "},\n" +
            "\"files\": [\n" +
            "\"main.ts\",\n" +
            "\"othermodule.ts\"\n" +
            "]\n" +
            "}";
    public static final String answer218 = "TypeScript Generics is a tool that provides a way of creating reusable components. It is able to create components that can work with a variety of data types rather than a single data type. Also, it provides type safety without compromising the performance, or productivity. Generics allow us to create generic classes, generic functions, generic methods, and generic interfaces.\n" +
            "\n" +
            "In generics, a type parameter is written between the open (<) and close (>) brackets which makes it strongly typed collections. It uses a special kind of type variable <T> that denotes types.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "function identity<T>(arg: T): T {\n" +
            "return arg;\n" +
            "}\n" +
            "let output1 = identity<string>(\"shrcreation\");\n" +
            "let output2 = identity<number>( 117 );\n" +
            "console.log(output1);\n" +
            "console.log(output2);";
    public static final String answer219 = "JSX is an embeddable XML-like syntax and it is meant to be transformed into a valid JavaScript. JSX became popular with the React framework. TypeScript supports embedding, type checking, and compiling JSX directly into JavaScript.\n" +
            "\n" +
            "If you want to use JSX in your file, you need to name your file with a .tsx extension and enable jsx option.";
    public static final String answer220 = "TypeScript consists of three JSX modes:" +
            "\n\n" +
            "The preserve mode keeps the JSX as part of the output to be further consumed by another transform step. Also, the output will have a .jsx file extension. The react mode emits React.createElement, does not need to go through a JSX transformation before use, and the output will have a .js file extension. The react-native mode is the equivalent of the preserve and it keeps all JSX, but the output has a .js file extension instead.";
    public static final String answer221 = "Ambient declarations tell the compiler about the actual source code that exists elsewhere. If these source codes do not exist at runtime and we try to use them, then it will break without warning.\n" +
            "\n" +
            "Ambient declarations files are like docs files. If the source changes, the docs need to be kept updated and if the ambient declaration file is not updated, then you will get compiler errors. Also, it allows us to safely and easily use existing popular JavaScript libraries like jquery, angularjs, nodejs, etc.";
    public static final String answer222 = "TypeScript Map file is a source map file that holds information about our original files. The .map files are source map files that let tools map between the emitted JavaScript code and the TypeScript source files that created it. Also, debuggers can consume these files so we can debug the TypeScript file instead of the JavaScript file.";
    public static final String answer223 = "Type assertion works like a typecasting in other languages, but it doesn’t perform type checking or restructuring of data in other languages like C# and Java. The typecasting comes with runtime support whereas type assertion has no impact on runtime. However, type assertions are used purely by the compiler and provide hints to the compiler on how we want our code to be analyzed.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "let empCode: any = 007;\n" +
            "let employeeCode = <number> code;\n" +
            "console.log(typeof(employeeCode)); //Output: number";
    public static final String answer224 = "Enums or enumerations are a TypeScipt data type that allows us to define a set of named constants. Using enums make it easier to document intent, or create a set of distinct cases. It is a collection of related values that can be numeric or string values.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "enum Gender {\n" +
            "Male,\n" +
            "Female\n" +
            "Other\n" +
            "}\n" +
            "console.log(Gender.Male); // Output: 0\n" +
            "//We can also access an enum value by it's number value.\n" +
            "console.log(Gender[1]); // Output: Female";
    public static final String answer225 = "If the subclass or the child class has the same method as declared in the parent class, it is known as method overriding. Basically, it redefines the base class methods in the derived class or child class.\n" +
            "\n" +
            "Rules for Method Overriding:\n" +
            "\n" +
            "The method must have the same name as in the parent class\n" +
            "It must have the same parameter as in the parent class.\n" +
            "There must be an IS-A relationship or inheritance.";
    public static final String answer226 = "ES6 version of TypeScript provides shorthand syntax for defining the anonymous function, i.e., for function expressions. These arrow functions are also called lambda functions. A lambda function is a function without a name. Whereas, the arrow function omits the function keyword.\n" +
            "\n" +
            "Example:" +
            "\n\n" +
            "let sum = (x: number, y: number): number => { \n" +
            "return x + y; \n" +
            "} \n" +
            "console.log(sum(10, 20)); //returns 30" +
            "\n\n" +
            "In the above example, the ?=>? is a lambda operator and (x + y) is the body of the function and (x: number, y: number) are inline parameters.";
    public static final String answer227 = "Angular was introduced to create Single Page applications. This framework brings structure and consistency to web applications and provides excellent scalability and maintainability. \n" +
            "\n" +
            "Angular is an open-source, JavaScript framework wholly written in TypeScript. It uses HTML's syntax to express your application's components clearly. ";
    public static final String answer228 = "Data binding is a phenomenon that allows any internet user to manipulate Web page elements using a Web browser. It uses dynamic HTML and does not require complex scripting or programming. We use data binding in web pages that contain interactive components such as forms, calculators, tutorials, and games. Incremental display of a webpage makes data binding convenient when pages have an enormous amount of data. \n" +
            "\n" +
            "Angular uses the two-way binding. Any changes made to the user interface are reflected in the corresponding model state. Conversely, any changes in the model state are reflected in the UI state. This allows the framework to connect the DOM to the Model data via the controller. However, this approach affects performance since every change in the DOM has to be tracked.";
    public static final String answer229 = "Single-page applications are web applications that load once with new features just being mere additions to the user interface. It does not load new HTML pages to display the new page's content, instead generated dynamically. This is made possible through JavaScript's ability to manipulate the DOM elements on the existing page itself. A SPA approach is faster, thus providing a seamless user experience. ";
    public static final String answer230 = "Decorators are a design pattern or functions that define how Angular features work. They are used to make prior modifications to a class, service, or filter. Angular supports four types of decorators, they are:\n" +
            "\n" +
            "1.Class Decorators\n" +
            "2.Property Decorators\n" +
            "3.Method Decorators\n" +
            "4.Parameter Decorators";
    public static final String answer231 = "Some of the common advantages of Angular are - \n" +
            "\n" +
            "1.MVC architecture - Angular is a full-fledged MVC framework. It provides a firm opinion on how the application should be structured. It also offers bi-directional data flow and updates the real DOM. \n" +
            "2.Modules: Angular consists of different design patterns like components, directives, pipes, and services, which help in the smooth creation of applications.\n" +
            "3.Dependency injection: Components dependent on other components can be easily worked around using this feature. \n" +
            "4.Other generic advantages include clean and maintainable code, unit testing, reusable components, data binding, and excellent responsive experience.";
    public static final String answer232 = "Older versions of TypeScript not supported - Previous versions of Angular supported typescript 3.6, 3.7, and even 3.8. But with Angular 10, TypeScript bumped to TypeScript 3.9.\n" +
            "Warnings about CommonJS imports - Logging of unknown property bindings or element names in templates is increased to the \"error\" level, which was previously a \"warning\" before.\n" +
            "Optional strict setting - Version 10 offers a stricter project setup when you create a new workspace with ng new command.\n" +
            "ng new --strict\n" +
            "\n" +
            "NGCC Feature - Addition of NGCC features with a program based entry point finder. \n" +
            "\n" +
            "Updated URL routing\n" +
            "Deprecated APIs - Angular 10 has several deprecated APIs.\n" +
            "Bug fixes - With this Angular 10 version, there have been a number of bug fixes, important ones being the compiler avoiding undefined expressions and the core avoiding a migration error when a nonexistent symbol is imported.\n" +
            "New Default Browser Configuration - Browser configuration for new projects has been upgraded to outdo older and less used browsers. ";
    public static final String answer233 = "Angular Templates are written with HTML that contains Angular-specific elements and attributes. In combination with the model and controller's information, these templates are further rendered to provide a dynamic view to the user.";
    public static final String answer234 = "Annotations in Angular are used for creating an annotation array. They are the metadata set on the class that is used to reflect the Metadata library.";
    public static final String answer235 = "Directives are attributes that allow the user to write new HTML syntax specific to their applications. They execute whenever the Angular compiler finds them in the DOM. Angular supports three types of directives.  \n" +
            "\n" +
            "1.Component Directives\n" +
            "2.Structural Directives\n" +
            "3.Attribute Directives";
    public static final String answer236 = "The Ahead-of-time (AOT) compiler converts the Angular HTML and TypeScript code into JavaScript code during the build phase, i.e., before the browser downloads and runs the code.\n" +
            "\n" +
            "Some of its advantages are as follows. \n" +
            "\n" +
            "1.Faster rendering\n" +
            "2.Fewer asynchronous requests\n" +
            "3.Smaller Angular framework download size\n" +
            "4.Quick detection of template errors\n" +
            "5.Better security";
    public static final String answer237 = "Components are the basic building blocks of the user interface in an Angular application. Every component is associated with a template and is a subset of directives. An Angular application typically consists of a root component, which is the AppComponent, that then branches out into other components creating a hierarchy.";
    public static final String answer238 = "Pipes are simple functions designed to accept an input value, process, and return as an output, a transformed value in a more technical understanding. Angular supports several built-in pipes. However, you can also create custom pipes that cater to your needs. \n" +
            "\n" +
            "Some key features include: \n" +
            "\n" +
            "Pipes are defined using the pipe “|” symbol. \n" +
            "Pipes can be chained with other pipes.\n" +
            "Pipes can be provided with arguments by using the colon (:) sign.";
    public static final String answer239 = "NgModules are containers that reserve a block of code to an application domain or a workflow. @NgModule takes a metadata object that generally describes the way to compile the template of a component and to generate an injector at runtime. In addition, it identifies the module's components, directives, and pipes, making some of them public, through the export property so that external components can use them.";
    public static final String answer240 = "Filters are used to format an expression and present it to the user. They can be used in view templates, controllers, or services. Some inbuilt filters are as follows. \n" +
            "\n" +
            "date - Format a date to a specified format.\n" +
            "filter - Select a subset of items from an array.\n" +
            "Json - Format an object to a JSON string.\n" +
            "limitTo -  Limits an array/string, into a specified number of elements/characters.\n" +
            "lowercase - Format a string to lowercase.";
    public static final String answer241 = "View encapsulation defines whether the template and styles defined within the component can affect the whole application or vice versa. Angular provides three encapsulation strategies:\n" +
            "\n" +
            "Emulated - styles from the main HTML propagate to the component.\n" +
            "Native - styles from the main HTML do not propagate to the component. \n" +
            "None - styles from the component propagate back to the main HTML and therefore are visible to all components on the page.";
    public static final String answer242 = "AngularJS controllers control the data of AngularJS applications. They are regular JavaScript Objects. The ng-controller directive defines the application controller.";
    public static final String answer243 = "In Angular, every component has a lifecycle. Angular creates and renders these components and also destroys them before removing them from the DOM. This is achieved with the help of lifecycle hooks. Here's the list of them - \n" +
            "\n" +
            "ngOnChanges() - Responds when Angular sets/resets data-bound input properties.\n" +
            "ngOnInit() - Initialize the directive/component after Angular first displays the data-bound properties and sets the directive/component's input properties/\n" +
            "ngDoCheck() - Detect and act upon changes that Angular can't or won't detect on its own.\n" +
            "ngAfterContentInit() - Responds after Angular projects external content into the component's view.\n" +
            "ngAfterContentChecked() - Respond after Angular checks the content projected into the component.\n" +
            "ngAfterViewInit() - Respond after Angular initializes the component's views and child views.\n" +
            "ngAfterViewChecked() - Respond after Angular checks the component's views and child views.\n" +
            "ngOnDestroy - Cleanup just before Angular destroys the directive/component.";
    public static final String answer244 = "String Interpolation is a one-way data-binding technique that outputs the data from TypeScript code to HTML view. It is denoted using double curly braces. This template expression helps display the data from the component to the view. \n" +
            "\n" +
            "{{ data }}";
    public static final String answer245 = "Ahead of Time (AOT) compilation converts your code during the build time before the browser downloads and runs that code. This ensures faster rendering to the browser. To specify AOT compilation, include the --aot option with the ng build or ng serve command. \n" +
            "\n" +
            "The Just-in-Time (JIT) compilation process is a way of compiling computer code to machine code during execution or run time. It is also known as dynamic compilation. JIT compilation is the default when you run the ng build or ng serve CLI commands. ";
    public static final String answer246 = "TypeScript class is one that is used to create components. This genre of class is then decorated with the \"@Component\" decorator. The decorato’s purpose is to accept a metadata object that provides relevant information about the component.  " +
            "\n\n" +
            "The metadata object that gets accepted by the decorator provides properties like templateUrl, selector, and others, where the templateUrL property points to an HTML file defining what you see on the application. ";
    public static final String answer247 = "Angular Services perform tasks that are used by multiple components. These tasks could be data and image fetching, network connections, and database management among others. They perform all the operational tasks for the components and avoid rewriting of code. A service can be written once and injected into all the components that use that service. ";
    public static final String answer248 = "While both the concepts deal with Asynchronous events in Angular, Promises handle one such event at a time while observables handle a sequence of events over some time. \n" +
            "\n" +
            "Promises - They emit a single value at a time. They execute immediately after creation and are not cancellable. They are Push errors to the child promises. \n" +
            "\n" +
            "Observables - They are only executed when subscribed to them using the subscribe() method. They emit multiple values over a period of time. They help perform operations like forEach, filter, and retry, among others. They deliver errors to the subscribers. When the unsubscribe() method is called, the listener stops receiving further values.";
    public static final String answer249 = "Template-driven approach\n" +
            "\n" +
            "In this method, the conventional form tag is used to create forms. Angular automatically interprets and creates a form object representation for the tag. \n" +
            "Controls can be added to the form using the NGModel tag. Multiple controls can be grouped using the NGControlGroup module. \n" +
            "A form value can be generated using the “form.value” object. Form data is exported as JSON values when the submit method is called. \n" +
            "Basic HTML validations can be used to validate the form fields. In the case of custom validations, directives can be used. \n" +
            "Arguably, this method is the simplest way to create an Angular App. \n" +
            "Reactive Form Approach\n" +
            "\n" +
            "This approach is the programming paradigm oriented around data flows and propagation of change. \n" +
            "With Reactive forms, the component directly manages the data flows between the form controls and the data models. \n" +
            "Reactive forms are code-driven, unlike the template-driven approach. \n" +
            "Reactive forms break from the traditional declarative approach. \n" +
            "Reactive forms eliminate the anti-pattern of updating the data model via two-way data binding.\n" +
            "Typically, Reactive form control creation is synchronous and can be unit tested with synchronous programming techniques. ";
    public static final String answer250 = "Bootstrap is a powerful toolkit. It is a collection of HTML, CSS, and JavaScript tools for creating and building responsive web pages and web applications.\n" +
            "\n" +
            "There are two ways to embed the bootstrap library into your application. \n" +
            "\n" +
            "Angular Bootstrap via CDN - Bootstrap CDN is a public Content Delivery Network. It enables you to load the CSS and JavaScript files remotely from its servers. \n" +
            "Angular Bootstrap via NPM - Another way to add Bootstrap to your Angular project is to install it into your project folder by using NPM (Node Package Manager). \n" +
            "npm install bootstrap \n" +
            "\n" +
            "npm install jquery";
    public static final String answer251 = "DOM (Document Object Model) treats an XML or HTML document as a tree structure in which each node is an object representing a part of the document. \n" +
            "\n" +
            "Angular uses the regular DOM. This updates the entire tree structure of HTML tags until it reaches the data to be updated. However, to ensure that the speed and performance are not affected, Angular implements Change Detection.\n" +
            "\n" +
            "With this, you have reached the end of the article. We highly recommend brushing up on the core concepts for an interview. It’s always an added advantage to write the code in places necessary. ";
    public static final String answer252 = "Vue js is progressive javascript script used to create dynamic user interfaces.Vue js is very easy to learn.In order to work with Vue js you just need to add few dynamic features to a website.You don’t need to install any thing to use Vue js just need add Vue js library in your project.";
    public static final String answer253 = "Vue js comes with following features\n" +
            "Templates\n" +
            "Reactivity\n" +
            "Components\n" +
            "Transitions\n" +
            "Routing";
    public static final String answer254 = "The Life cycle of each Vue instance goes through a series of initialization steps when it is created.\n" +
            "– for example, it needs to set up data observation, compile the template, and create the necessary data bindings. Along the way, it will also invoke some lifecycle hooks, which give us the opportunity to execute custom logic. For example, the created hook is called after the instance is created:\n" +
            "new Vue({\n" +
            "  data: {\n" +
            "    a: 1\n" +
            "  },\n" +
            "  created: function () {\n" +
            "    // `this` points to the vm instance\n" +
            "    console.log('a is: ' + this.a)\n" +
            "  }\n" +
            "})\n" +
            "// => \"a is: 1\"\n" +
            "There are also other hooks which will be called at different stages of the instance’s lifecycle, for example compiled, ready and destroyed. All lifecycle hooks are called with their this context pointing to the Vue instance invoking it. Some users may have been wondering where the concept of “controllers” lives in the Vue.js world, and the answer is: there are no controllers in Vue.js. Your custom logic for a component would be split among these lifecycle hooks.";
    public static final String answer255 = "You can create Vue instance with the Vue function:\n" +
            "var vm = new Vue({\n" +
            "  // options\n" +
            "})";
    public static final String answer256 = "In one-way data flow the view(UI) part of application does not updates automatically when data Model is change we need to write some custom code to make it updated every time a data model is changed.\n" +
            "In Vue js v-bind is used for one-way data flow or binding.\n" +
            "\n" +
            "In two-way data binding the view(UI) part of application automatically updates when data Model is changed.\n" +
            "In Vue.js v-model directive is used for two way data binding.";
    public static final String answer257 = "v-model directive is used to create Two-Way Bindings in Vue js.In Two-Way Bindings data or model is bind with DOM and Dom is binded back to model.\n" +
            "In below example you can see how Two-Way Bindings is implemented.\n" +
            "\n" +
            "<div id=\"app\">\n" +
            "  {{message}}\n" +
            "  <input v-model=\"message\">\n" +
            "</div>\n" +
            "<script type=\"text/javascript\">\n" +
            "  var message = 'Vue.js is rad';\n" +
            "  new Vue({ el: '#app', data: { message } });\n" +
            "</script>";
    public static final String answer258 = "In Vue js filters are used to transform the output that are going to rendered on browser.\n" +
            "A Vue.js filter is essentially a function that takes a value, processes it, and then returns the processed value. In the markup it is denoted by a single pipe (|) and can be followed by one or more arguments:\n" +
            "<element directive=\"expression | filterId [args...]\"></element>\n" +
            "In Vue 2.0, there are no built-in filters are available, however you are free to create your own filters.";
    public static final String answer259 = "Vue.filter() method is used to create and register a custom filter in Vue js. Vue.filter() method takes two parameters a filterId that is usnique name to filter that you going to create and a filter function that takes a value as the argument and returns the transformed value.\n" +
            "Vue.filter('reverse', function (value) {\n" +
            "  return value.split('').reverse().join('')\n" +
            "})";
    public static final String answer260 = "Vue Components are one of most powerful features of Vue js.In Vue components are custom elements that help you extend basic HTML elements to encapsulate reusable code.\n" +
            "Following is the way to register a Vue component inside other component\n" +
            "export default {\n" +
            "  el: '#your-element'\n" +
            "  components: {\n" +
            "      'your-component'\n" +
            "  }\n" +
            "}";
    public static final String answer261 = "The concept of directive in Vue js is drastically simpler than that in Angular. Vue.js directives provides a way to extend HTML with new attributes and tags. Vue.js has a set of built-in directives which offers extended functionality to your applications.You can also write your custom directives in Vue.js .\n" +
            "Below are list of commonly used directives in Vue.js\n" +
            "\n" +
            "v-show\n" +
            "v-if\n" +
            "v-model\n" +
            "v-else\n" +
            "v-on";
    public static final String answer262 = "In Vue js following types of directives are available\n" +
            "General Directives\n" +
            "Literal Directives\n" +
            "Empty Directives\n" +
            "Custom Directives";
    public static final String answer263 = "VUE-resource is a plugin for vue.js that provides services for making web requests and handle responses using a XMLHttpRequest or JSONP\n" +
            "You can install it via yarn or NPM.\n" +
            "$ yarn add vue-resource\n" +
            "$ npm install vue-resource";
    public static final String answer264 = "To create constant const keyword is used.In Vue.js we suggest to create a seperate file for defining your consants.\n" +
            "Example:\n" +
            "Creating a Constant in Vue js.\n" +
            "export const SITE_URL = 'https://www.shrcreation.com';\n" +
            "Importing a Constant in Vue js.\n" +
            "import {SITE_URL} from './path/to/constants.js';";
    public static final String answer265 = "Virtual DOM in Vue is a JavaScript object that represents the Document Object Model (DOM). The application updates the Virtual DOM instead of the DOM directly. So, it minimizes the updating cost of the real DOM as it is computationally expensive. Virtual DOM offers the ability to control the timing at which the Virtual DOM is rendered. Virtual DOM will just maintain the state of the data without re-rendering until you choose it. Virtual DOM also offers the ability to optimize the performance of your web applications by minimizing the number of times the DOM has to be updated.";
    public static final String answer266 = "Mixins in Vue JS are a chunk of defined logic that is stored in a particular way. It can be re-used over and over to add functionality to your Vue instances and components. It is important that we need Vue JS because,\n" +
            "\n" +
            "You can easily adhere to the DRY principle with mixins. It ensures that you do not repeat yourself.\n" +
            "You get a lot of flexibility with mixins. Mixin contains options for Vue components.\n" +
            "Mixins are safe and they do not affect changes outside their defined scope.\n" +
            "Mixins in Vue JS are a great platform for code re-usability.";
    public static final String answer267 = "VueX is a state management pattern and library for the application using Vue JS. it acts as a centralized store for all the different components in your Vue JS application. It has rules to ensure that the state can be only mutated in a predictable fashion. It can be integrated with the official devtool extension of Vue to provide additional features. Vuex mainly helps in dealing with shared state management with the cost of more concepts and boilerplate.";
    public static final String answer268 = "Filters in Vue JS helps in applying common text formatting. It is used in two places, mustache interpolations, and v-bind expressions. It mainly filters the data on the DOM level. So you get data that is still intact in the storage but is represented in the custom specified manner. It enhances the presentation of the view layer. The filters are also reusable. You can declare a filter globally and use it on any desirable component. It gives you the power to format your data at the view level.";
    public static final String answer269 = "Components in Vue JS are a single, independent unit of an interface. They have their own state, markup, and style.\n" +
            "\n" +
            "A Vue component can be defined in four ways.\n" +
            "\n" +
            "The first is new Vue({ /*options */ }).\n" +
            "The second is Vue.component(‘component-name’, { /* options */ }).\n" +
            "The third way is by using the local components.\n" +
            "The fourth is in the .vue files or Single File Components.\n" +
            "The first two ways are the standard ways to use Vue when building an application that is not a SPA (Single Page Application). The Single File Components are uses in the Single Page Application.";
    public static final String answer270 = "There are two ways to import a JavaScript library to the Vue Component.\n" +
            "\n" +
            "The first is to import a local JavaScript library. Here, you can import the JavaScript library by using the 'import' keyword inside the script tag of your Vue file.\n" +
            "\n" +
            "import * as mykey from '../assets/js/mykey.js';\n" +
            "The second way is to include your external JavaScript file into the mounted hook of your Vue component.";
    public static final String answer271 = "We can use various HTTP libraries to call REST Api's from Vue JS. One of the popular libraries is Axios. It simple to use and lightweight. To include it in your project, execute the following command.\n" +
            "\n" +
            "npm install axios --save\n" +
            "Implementing GET method using Axios in Vue JS\n" +
            "\n" +
            "axios({ method: \"GET\", \"URL\": \"https://httpbin.org/ip\" }).then(result => {\n" +
            "                this.ip = result.data.origin;\n" +
            "            }, error => {\n" +
            "                console.error(error);\n" +
            "            });\n" +
            "\n" +
            "\n" +
            "We can send an HTTP request using Axios with a promise. If the request is successful, we’ll get the result.";
    public static final String answer272 = "Next.js is an open-source, lightweight React.js framework that facilitates developers to build static and server-side rendering web applications. It was created by Zeit. Next.js framework is based on React, Webpack, and Babel and allows us to write server-rendered React apps easily. It doesn't require any webpack configuration and only needs npm run dev start building your next feature-filled web application.";
    public static final String answer273 = "If you want to build a complete web application with React from scratch, you have to fulfill the following points:\n" +
            "\n" +
            "Your code has to be bundled using a bundler like webpack and transformed using a compiler like Babel.\n" +
            "You have to do production optimizations such as code splitting.\n" +
            "You have to pre-render some pages for performance and SEO statically. You might also want to use server-side rendering or client-side rendering.\n" +
            "You might have to write some server-side code to connect your React app to your data store.\n" +
            "Next.js fulfills the above all requirements." +
            "\n\n" +
            "Reasons why the world's leading companies prefer Next.js:\n" +
            "Zero Setup: Next.js provides automatic code-splitting, filesystem-based routing, hot code reloading, and universal rendering; that's why the world's leading companies prefer it.\n" +
            "\n" +
            "Fully Extensible: Next.js is fully extensible and has complete control over Babel and Webpack. It provides a customizable server, routing, and next plugins.\n" +
            "\n" +
            "Ready for Production: Next.js is optimized for smaller build sizes, faster dev compilation, and many other improvements, making it a popular choice.\n" +
            "\n" +
            "Next.js can Deploy Anywhere: Next.js is an open-source, lightweight React.js framework that facilitates developers to build static and server-side rendering web applications.";
    public static final String answer274 = "Before installing Next.js, you must have installed Node.js on your system. Learn how to install Node.js on your system.\n" +
            "\n" +
            "It requires NPM to start installing Next.js with all its dependencies.\n" +
            "\n" +
            "Follow the steps given below to install Next.js:\n" +
            "\n" +
            "First, create a directory to keep the Next.js project and go into it:\n" +
            "mkdir my-portfolio-site  \n" +
            "cd my-portfolio-site  \n" +
            "Now, initialize this with a package.json file.\n" +
            "Use the y flag by npm init -y\n" +
            "Use the following syntax to install Next.js\n" +
            "npm install react react-dom next  \n" +
            "Update package.json with run script languages to start the initialization of the Next.js application.\n" +
            "Now, find the package.json file on the root folder and add the below mentioned script\n" +
            "{  \n" +
            "  \"scripts\": {  \n" +
            "    \"dev\": \"next\",  \n" +
            "    \"build\": \"next build\",  \n" +
            "    \"start\": \"next start\"  \n" +
            "  }  \n" +
            "}  \n" +
            "After that, the filesystem is the main API. Every \".js\" file becomes a route that gets automatically processed and rendered.\n" +
            "Now, the process is completed, and Next.js is installed on your system.";
    public static final String answer275 = "Following is a list of the most prominent features of Next.js that excite the developers most:" +
            "\n" +
            "js provides the by default and easy server rendering.\n" +
            "js supports static exporting.\n" +
            "It provides a Webpack-based dev environment which supports Hot Module Replacement (HMR)\n" +
            "It seaports automatic code-splitting for faster page loads.\n" +
            "It supports simple client-side routing (page-based) or file system-based routing.\n" +
            "It provides complete Webpack and Babel control.\n" +
            "It provides a faster and optimized development compilation.\n" +
            "It can be implemented with Express or any other Node.js HTTP server.\n" +
            "You can easily customize it with your own Babel and Webpack configurations.\n" +
            "It supports hot code reloading.\n" +
            "Besides this, Next.js also has some awesome features such as:\n" +
            "\n" +
            "Dynamic styles and themes support\n" +
            "Built-in CSS vendor prefixing\n" +
            "CSS Preprocessing via Plugins\n" +
            "Full CSS support, no tradeoffs in power\n" +
            "Its runtime size is very small. It is just 3kb (zipped from 12kb)\n" +
            "It provides source maps support";
    public static final String answer276 = "Next.js is a popular framework of React.js that is most popularly used for building the following types of apps and websites:\n" +
            "\n" +
            "Static Websites\n" +
            "Desktop Websites\n" +
            "SEO Friendly Websites\n" +
            "Server Rendered Apps\n" +
            "Progressive Web Apps (PWA) etc.";
    public static final String answer277 = "Yes. You can easily use Next.js with Redux.";
    public static final String answer278 = "There are multiple ways to fetch data in Next.js, but Next.js itself recommends getInitialProps, an async function to retrieve data from anywhere. When we use getInitialProps to retrieve data, it receives a context object which has the following properties:\n" +
            "\n" +
            "pathname- It specifies the path section of the URL.\n" +
            "query- It is used to specify the query string section of URL parsed as an object.\n" +
            "asPath- It specifies the string of the actual path (including the query) shows in the browser.\n" +
            "req- It is used to specify the HTTP request object (server only).\n" +
            "res- It is used to specify the HTTP response object (server only).\n" +
            "err- It is used to specify the error object if any error is encountered during the rendering.";
    public static final String answer279 = "To setup CDN in Next.js, the developers have to follow the steps given below:" +
            "\n" +
            "To start, we have to first set up the \"assetPrefix\" setting and configure our CDN origin to support and resolve the domain that our Next.js is hosted on.\n" +
            "\n" +
            "const isProd = process.env.NODE_ENV === 'production';  \n" +
            " module.exports = {  \n" +
            "// You may only need to add assetPrefix in the production.  \n" +
            " assetPrefix: isProd ? 'https://cdn.mydomain.com' : ''  \n" +
            "};  \n" +
            "If the CDN is present on a separate domain, we have to set a configuration option as following:\n" +
            "\n" +
            "// next.config.js  \n" +
            "odule.exports = {  \n" +
            "crossOrigin: 'anonymous'  \n" +
            ";  ";
    public static final String answer280 = "The Create-React-App is basically React with an integrated build system. It acts like a good boilerplate, so we don't need to set up Webpack, Babel, and other dependent packages to run React. Other than that, if you require extra functionalities such as routing, server-side rendering, and so on, you just need to add packages on top of Create-React-App. On the other hand, The Next.js is an open-source, lightweight full-stack React framework that comes bundled with an efficient build system, server-side rendering, routing, API routing, and many other awesome features that make the production environment easy.";
    public static final String answer281 = "Generally, we use the app.disable('etag') syntax to disable the etag generation in Next.js. But, this may not work for all static contents. So, we should use the following syntax to disable the etag for all static contents.\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            "app.use(express.static(path.join(__dirname, 'public'), {  \n" +
            "etag: false  \n" +
            "}));  ";
    public static final String answer282 = "To configure the build-id in Next.js, we must configure a static ID between our builds. So, we have to provide the \"generateBuildId\" function with the following configuration." +
            "\n" +
            "// next.config.js  \n" +
            "module.exports = {  \n" +
            "   generateBuildId: async () => {  \n" +
            "  // For example get the latest git commit hash here  \n" +
            "  return 'my-build-id';  \n" +
            "  }  \n" +
            "}; ";
    public static final String answer283 = "To create a page directory inside our project we have to populate the ./pages/index.js with the following contents:\n" +
            "\n" +
            "function HomePage() {  \n" +
            "  return <div>Welcome to Next.js!</div>  \n" +
            "}  \n" +
            "To start developing our application, we have to run the npm run dev or yarn dev command. This will start the development server on http://localhost:3000. Now we can visit the localhost: http://localhost:3000 to view our application.";
    public static final String answer284 = "We can create our custom error page by defining a _error.js in the pages folder. See the following example:\n" +
            "\n" +
            "import React from \"react\";  \n" +
            "class Error extends React.Component {  \n" +
            "  static getInitialProps({ res, err }) {  \n" +
            "    const statusCode = res ? res.statusCode : err ? err.statusCode : null;  \n" +
            "    return { statusCode };  \n" +
            "  }  \n" +
            "  render() {  \n" +
            "    return (  \n" +
            "   \n" +
            "        {this.props.statusCode  \n" +
            "          ? `An error ${this.props.statusCode} has occurred on the server`  \n" +
            "          : \"An error occurred on client-side\"}  \n" +
            "        \n" +
            "    );  \n" +
            "  }  \n" +
            "}  \n" +
            "export default Error;";
    public static final String answer285 = "Generally, code splitting is one of the most compelling features of webpack. This feature facilitates us to split our code into various bundles, which can be loaded only on-demand or in parallel. This is mainly used to achieve the smaller bundles and facilitates us to control resource load prioritization which finally has a great impact on the load time.\n" +
            "\n" +
            "There are mainly three approaches to code splitting:\n" +
            "\n" +
            "Entry Points: It is used to split code using entry configuration manually.\n" +
            "Prevent Duplication: It uses Entry dependencies or SplitChunksPlugin to dedupe and split chunks.\n" +
            "Dynamic Imports: It splits the code via inline function calls within modules\n" +
            "It is mainly used to enable pages that can never load unnecessary code.";
    public static final String answer286 = "This is an important question and is asked in many Next.js interview questions. There are two ways to enable AMP in Next.js.\n" +
            "\n" +
            "AMP-First Pages\n" +
            "Hybrid AMP Pages\n" +
            "AMP-First Pages: The AMP-First Pages are served to the primary traffic of the website as well as traffic generated from the search engine. Use the following syntax to implement AMP-first pages.\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "// pages/index.js  \n" +
            "import { withAmp } from 'next/amp'  \n" +
            "function HomePage() {  \n" +
            "return <p> Welcome to AMP + Next.js.</p>  \n" +
            "}  \n" +
            "export default withAmp(HomePage)  \n" +
            "Hybrid AMP Pages: The Hybrid AMP pages allow the users to have coexisted AMP version of a traditional page so that the search engines can display the AMP version or the page in different mobile search results.\n" +
            "\n" +
            "See the following example to understand how to implement the Hybrid AMP to pages:\n" +
            "\n" +
            "Example:\n" +
            "\n" +
            "// pages/index.js  \n" +
            "import { withAmp } from 'next/amp'  \n" +
            "function HomePage() {  \n" +
            "return <p> Welcome to AMP + Next.js.</p>  \n" +
            "}  \n" +
            "export default withAmp(HomePage)";
    public static final String answer287 = "Next.js is not as simple as static html files. It requires an application server that runs Node.js to deploy and run a Next.js application. Here, we get requests that have to be processed on the server.";
    public static final String answer288 = "The Gatsby, while CRA offers client-side rendering and Next.js offers server-side rending, Gatsby is something called “Static Site Generator”. ... Similar to Next.js browser receives pre-rendered HTML code.\n" +
            "\n" +
            "At first glance, they both seem very similar.\n" +
            "1.Generate very performing websites.\n" +
            "2.Creates SPA out-of-the-box.\n" +
            "3.Creates good SEO out-of-the-box\n" +
            "4.Have an awesome developer experience.";
    public static final String answer289 = "React is a front-end JavaScript library developed by Facebook in 2011.\n" +
            "It follows the component based approach which helps in building reusable UI components.\n" +
            "It is used for developing complex and interactive web and mobile UI.\n" +
            "Even though it was open-sourced only in 2015, it has one of the largest communities supporting it.";
    public static final String answer290 = "Major features of React are listed below:" +
            "\n" +
            "1.It uses the virtual DOM instead of the real DOM.\n" +
            "2.It uses server-side rendering.\n" +
            "3.It follows uni-directional data flow or data binding.";
    public static final String answer291 = "Some of the major advantages of React are:\n" +
            "\n" +
            "1.It increases the application’s performance\n" +
            "2.It can be conveniently used on the client as well as server side\n" +
            "3.Because of JSX, code’s readability increases\n" +
            "4.React is easy to integrate with other frameworks like Meteor, Angular, etc\n" +
            "5.Using React, writing UI test cases become extremely easy";
    public static final String answer292 = "Limitations of React are listed below:\n" +
            "\n" +
            "1.React is just a library, not a full-blown framework\n" +
            "2.Its library is very large and takes time to understand\n" +
            "3.It can be little difficult for the novice programmers to understand\n" +
            "4.Coding gets complex as it uses inline templating and JSX";
    public static final String answer293 = "JSX is a shorthand for JavaScript XML. This is a type of file used by React which utilizes the expressiveness of JavaScript along with HTML like template syntax. This makes the HTML file really easy to understand. This file makes applications robust and boosts its performance. Below is an example of JSX:" +
            "\n\n" +
            "render(){\n" +
            "    return(        \n" +
            "          \n" +
            "<div>\n" +
            "             \n" +
            "<h1> Hello World from JScript!!</h1>\n" +
            " \n" +
            "         </div>\n" +
            " \n" +
            "    );\n" +
            "}";
    public static final String answer294 = "A virtual DOM is a lightweight JavaScript object which originally is just a copy of the real DOM. It is a node tree that lists the elements, their attributes and content as Objects and their properties. React’s render function creates a node tree out of the React components. It then updates this tree in response to the mutations in the data model which is caused by various actions done by the user or by the system.\n" +
            "This Virtual DOM works in three simple steps.." +
            "\n\n" +
            "1.Whenever any underlying data changes, the entire UI is re-rendered in Virtual DOM representation.\n" +
            "2.Then the difference between the previous DOM representation and the new one is calculated.\n" +
            "3.Once the calculations are done, the real DOM will be updated with only the things that have actually changed.";
    public static final String answer295 = "Browsers can only read JavaScript objects but JSX in not a regular JavaScript object. Thus to enable a browser to read JSX, first, we need to transform JSX file into a JavaScript object using JSX transformers like Babel and then pass it to the browser.";
    public static final String answer296 = "1.require vs import:" +
            "\n" +
            "// ES5\n" +
            "var React = require('react');\n" +
            " \n" +
            "// ES6\n" +
            "import React from 'react';" +
            "\n\n" +
            "2.export vs exports\n" +
            "// ES5\n" +
            "module.exports = Component;\n" +
            " \n" +
            "// ES6\n" +
            "export default Component;" +
            "\n\n" +
            "3.component and function\n" +
            "// ES5\n" +
            "var MyComponent = React.createClass({\n" +
            "    render: function() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello JScript!</h3>\n" +
            ";\n" +
            "    }\n" +
            "});\n" +
            " \n" +
            "// ES6\n" +
            "class MyComponent extends React.Component {\n" +
            "    render() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello JScript!</h3>\n" +
            ";\n" +
            "    }\n" +
            "}" +
            "\n\n" +
            "4.props\n" +
            "// ES5\n" +
            "var App = React.createClass({\n" +
            "    propTypes: { name: React.PropTypes.string },\n" +
            "    render: function() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello, {this.props.name}!</h3>\n" +
            ";\n" +
            "    }\n" +
            "});\n" +
            " \n" +
            "// ES6\n" +
            "class App extends React.Component {\n" +
            "    render() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello, {this.props.name}!</h3>\n" +
            ";\n" +
            "    }\n" +
            "}" +
            "\n\n" +
            "5.state\n" +
            "// ES5\n" +
            "var App = React.createClass({\n" +
            "    getInitialState: function() {\n" +
            "        return { name: 'world' };\n" +
            "    },\n" +
            "    render: function() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello, {this.state.name}!</h3>\n" +
            ";\n" +
            "    }\n" +
            "});\n" +
            " \n" +
            "// ES6\n" +
            "class App extends React.Component {\n" +
            "    constructor() {\n" +
            "        super();\n" +
            "        this.state = { name: 'world' };\n" +
            "    }\n" +
            "    render() {\n" +
            "        return\n" +
            " \n" +
            "<h3>Hello, {this.state.name}!</h3>\n" +
            ";\n" +
            "    }\n" +
            "}";
    public static final String answer297 = "Components are the building blocks of a React application’s UI. These components split up the entire UI into small independent and reusable pieces. Then it renders each of these components independent of each other without affecting the rest of the UI.";
    public static final String answer298 = "Each React component must have a render() mandatorily. It returns a single React element which is the representation of the native DOM component. If more than one HTML element needs to be rendered, then they must be grouped together inside one enclosing tag such as <form>, <group>,<div> etc. This function must be kept pure i.e., it must return the same result each time it is invoked.";
    public static final String answer299 = "We can embed components into one in the following way:" +
            "\n" +
            "class MyComponent extends React.Component{\n" +
            "    render(){\n" +
            "        return(          \n" +
            "             \n" +
            "<div>\n" +
            "               \n" +
            "<h1>Hello</h1>\n" +
            " \n" +
            "                <Header/>\n" +
            "            </div>\n" +
            " \n" +
            "        );\n" +
            "    }\n" +
            "}\n" +
            "class Header extends React.Component{\n" +
            "    render(){\n" +
            "        return\n" +
            " \n" +
            "<h1>Header Component</h1>\n" +
            "   \n" +
            "   };\n" +
            "}\n" +
            "ReactDOM.render(\n" +
            "    <MyComponent/>, document.getElementById('content')\n" +
            ");";
    public static final String answer300 = "Props is the shorthand for Properties in React. They are read-only components which must be kept pure i.e. immutable. They are always passed down from the parent to the child components throughout the application. A child component can never send a prop back to the parent component. This help in maintaining the unidirectional data flow and are generally used to render the dynamically generated data.";
    public static final String answer301 = "States are the heart of React components. States are the source of data and must be kept as simple as possible. Basically, states are the objects which determine components rendering and behavior. They are mutable unlike the props and create dynamic and interactive components. They are accessed via this.state().";
    public static final String answer302 = "State of a component can be updated using this.setState()." +
            "\n" +
            "class MyComponent extends React.Component {\n" +
            "    constructor() {\n" +
            "        super();\n" +
            "        this.state = {\n" +
            "            name: 'Anne',\n" +
            "            id: '101'\n" +
            "        }\n" +
            "    }\n" +
            "    render()\n" +
            "        {\n" +
            "            setTimeout(()=>{this.setState({name:'Mathew', id:'222'})},2000)\n" +
            "            return (                                 \n" +
            " \n" +
            "<div>\n" +
            "                   \n" +
            "<h1>Hello {this.state.name}</h1>\n" +
            "     \n" +
            "<h2>Your Id is {this.state.id}</h2>\n" +
            " \n" +
            "                   </div>\n" +
            " \n" +
            "            );\n" +
            "        }\n" +
            "    }\n" +
            "ReactDOM.render(\n" +
            "    <MyComponent/>, document.getElementById('content')\n" +
            ");";
    public static final String answer303 = "Arrow functions are more of brief syntax for writing the function expression. They are also called ‘fat arrow‘ (=>) the functions. These functions allow to bind the context of the components properly since in ES6 auto binding is not available by default. Arrow functions are mostly useful while working with the higher order functions." +
            "\n" +
            "//General way\n" +
            "render() {    \n" +
            "    return(\n" +
            "        <MyInput onChange={this.handleChange.bind(this) } />\n" +
            "    );\n" +
            "}\n" +
            "//With Arrow Function\n" +
            "render() {  \n" +
            "    return(\n" +
            "        <MyInput onChange={ (e) => this.handleOnChange(e) } />\n" +
            "    );\n" +
            "}";
    public static final String answer304 = "Some of the most important lifecycle methods are:\n" +
            "\n" +
            "componentWillMount() – Executed just before rendering takes place both on the client as well as server-side.\n" +
            "componentDidMount() – Executed on the client side only after the first render.\n" +
            "componentWillReceiveProps() – Invoked as soon as the props are received from the parent class and before another render is called.\n" +
            "shouldComponentUpdate() – Returns true or false value based on certain conditions. If you want your component to update, return true else return false. By default, it returns false.\n" +
            "componentWillUpdate() – Called just before rendering takes place in the DOM.\n" +
            "componentDidUpdate() – Called immediately after rendering takes place.\n" +
            "componentWillUnmount() – Called after the component is unmounted from the DOM. It is used to clear up the memory spaces.";
    public static final String answer305 = "n React, events are the triggered reactions to specific actions like mouse hover, mouse click, key press, etc. Handling these events are similar to handling events in DOM elements. But there are some syntactical differences like:\n" +
            "\n" +
            "1.Events are named using camel case instead of just using the lowercase.\n" +
            "2.Events are passed as functions instead of strings.\n\n" +
            "The event argument contains a set of properties, which are specific to an event. Each event type contains its own properties and behavior which can be accessed via its event handler only.";
    public static final String answer306 = "Refs is the short hand for References in React. It is an attribute which helps to store a reference to a particular React element or component, which will be returned by the components render configuration function. It is used to return references to a particular element or component returned by render(). They come in handy when we need DOM measurements or to add methods to the components." +
            "\n" +
            "class ReferenceDemo extends React.Component{\n" +
            "     display() {\n" +
            "         const name = this.inputDemo.value;\n" +
            "         document.getElementById('disp').innerHTML = name;\n" +
            "     }\n" +
            "render() {\n" +
            "    return(        \n" +
            "          \n" +
            "<div>\n" +
            "            Name: <input type=\"text\" ref={input => this.inputDemo = input} />\n" +
            "            <button name=\"Click\" onClick={this.display}>Click</button>            \n" +
            "          \n" +
            "<h2>Hello <span id=\"disp\"></span> !!!</h2>\n" +
            " \n" +
            "      </div>\n" +
            "    );\n" +
            "   }\n" +
            " }";
    public static final String answer307 = "We can modularize code by using the export and import properties. They help in writing the components separately in different files." +
            "\n" +
            "//ChildComponent.jsx\n" +
            "export default class ChildComponent extends React.Component {\n" +
            "    render() {\n" +
            "        return(           \n" +
            " \n" +
            "<div>\n" +
            "              \n" +
            "<h1>This is a child component</h1>\n" +
            " \n" +
            "           </div>\n" +
            " \n" +
            "        );\n" +
            "    }\n" +
            "}\n" +
            " \n" +
            "//ParentComponent.jsx\n" +
            "import ChildComponent from './childcomponent.js';\n" +
            "class ParentComponent extends React.Component {    \n" +
            "    render() {        \n" +
            "        return(           \n" +
            "             \n" +
            "<div>               \n" +
            "                <App />          \n" +
            "            </div>\n" +
            "      \n" +
            "        );  \n" +
            "    }\n" +
            "}";
    public static final String answer308 = "Higher Order Component is an advanced way of reusing the component logic. Basically, it’s a pattern that is derived from React’s compositional nature. HOC are custom components which wrap another component within it. They can accept any dynamically provided child component but they won’t modify or copy any behavior from their input components. You can say that HOC are ‘pure’ components.";
    public static final String answer309 = "Keys are used for identifying unique Virtual DOM Elements with their corresponding data driving the UI. They help React to optimize the rendering by recycling all the existing elements in the DOM. These keys must be a unique number or string, using which React just reorders the elements instead of re-rendering them. This leads to increase in application’s performance.";
    public static final String answer310 = "Following are some of the major problems with MVC framework:\n" +
            "\n" +
            "DOM manipulation was very expensive\n" +
            "Applications were slow and inefficient\n" +
            "There was huge memory wastage\n" +
            "Because of circular dependencies, a complicated model was created around models and views";
    public static final String answer311 = "Redux is one of the most trending libraries for front-end development in today’s marketplace. It is a predictable state container for JavaScript applications and is used for the entire applications state management. Applications developed with Redux are easy to test and can run in different environments showing consistent behavior.";
    public static final String answer312 = "1.Single source of truth: The state of the entire application is stored in an object/ state tree within a single store. The single state tree makes it easier to keep track of changes over time and debug or inspect the application.\n" +
            "2.State is read-only: The only way to change the state is to trigger an action. An action is a plain JS object describing the change. Just like state is the minimal representation of data, the action is the minimal representation of the change to that data. \n" +
            "3.Changes are made with pure functions: In order to specify how the state tree is transformed by actions, you need pure functions. Pure functions are those whose return value depends solely on the values of their arguments.";
    public static final String answer313 = "Redux uses ‘Store’ for storing the application’s entire state at one place. So all the component’s state are stored in the Store and they receive updates from the Store itself. The single state tree makes it easier to keep track of changes over time and debug or inspect the application.";
    public static final String answer314 = "Actions in React must have a type property that indicates the type of ACTION being performed. They must be defined as a String constant and you can add more properties to it as well. In Redux, actions are created using the functions called Action Creators. Below is an example of Action and Action Creator:\n" +
            "\n" +
            "function addTodo(text) {\n" +
            "       return {\n" +
            "                type: ADD_TODO,    \n" +
            "                 text    \n" +
            "    }\n" +
            "}";
    public static final String answer315 = "A store is a JavaScript object which can hold the application’s state and provide a few helper methods to access the state, dispatch actions and register listeners. The entire state/ object tree of an application is saved in a single store. As a result of this, Redux is very simple and predictable. We can pass middleware to the store to handle the processing of data as well as to keep a log of various actions that change the state of stores. All the actions return a new state via reducers.";
    public static final String answer316 = "React Router is a powerful routing library built on top of React, which helps in adding new screens and flows to the application. This keeps the URL in sync with data that’s being displayed on the web page. It maintains a standardized structure and behavior and is used for developing single page web applications. React Router has a simple API.";
    public static final String answer317 = "Although a <div> is used to encapsulate multiple routes inside the Router. The ‘switch’ keyword is used when you want to display only a single route to be rendered amongst the several defined routes. The <switch> tag when in use matches the typed URL with the defined routes in sequential order. When the first match is found, it renders the specified route. Thereby bypassing the remaining routes.";
    public static final String answer318 = "A Router is used to define multiple routes and when a user types a specific URL, if this URL matches the path of any ‘route’ defined inside the router, then the user is redirected to that particular route. So basically, we need to add a Router library to our app that allows creating multiple routes with each leading to us a unique view.\n" +
            "\n" +
            "<switch>\n" +
            "    <route exact path=’/’ component={Home}/>\n" +
            "    <route path=’/posts/:id’ component={Newpost}/>\n" +
            "    <route path=’/posts’   component={Post}/>\n" +
            "</switch>";
    public static final String answer319 = "Ember.js is used for creating web applications that eliminates boilerplate and at the same time provides a standard application architecture.\n" +
            "\n" +
            "Ember helps to create applications, whose logic runs in browser and also it does not require server requests to functions. Ember update the DOM directly and instantly when any user interacts with things like button and text boxes on the browser page.";
    public static final String answer320 = "The main components of Ember.js are\n" +
            "\n" +
            "Models\n" +
            "The Router\n" +
            "Controllers\n" +
            "Views\n" +
            "Components\n" +
            "Templates\n" +
            "Helpers";
    public static final String answer321 = "Within an Ember application a model object is used to store persistent state.  These model object back the templates and provide data to be displayed within the HTML.";
    public static final String answer322 = "The application ember.js is based on MVC  (Model, View, Controller) structure\n" +
            "\n" +
            "Models: It defines the data that is used in an application\n" +
            "Controllers: It modifies query and edit the data and provide user interactions\n" +
            "Views: It display the data and capture user actions";
    public static final String answer323 = "Controller does two thing in Ember.js\n" +
            "\n" +
            "First it can decorate the model returned by the route\n" +
            "It can listen to actions performed by users";
    public static final String answer324 = "In Ember.js, instead of majority of your application’s logic living on the server, an ember.js application downloads everything it required to run in the initial page load. So user does not have to load a new page while using the app and UI will responds quickly. The advantage of this architecture is that your web application uses the same REST API as your native App.";
    public static final String answer325 = "Router allows you to specify all the possible states of an app and map them to urls\n" +
            "To build a hierarchy of sections by providing a mean for a container template to include a child template the {{outlet}} tag is used";
    public static final String answer326 = "Router:  It is the connecting point between browser’s address bar and our application.  It translates address into Route\n" +
            "\n" +
            "Route: It is where a user request will land after it was translated by a Router.  Route decides what data should be provided to the Template";
    public static final String answer327 = "Ember-Data is a library that retrieve records from a server, store them, update them in the browser and save them back to the server.";
    public static final String answer328 = "Adapter queries the back end, each adapter is made up of particular back end.  For example Rest adapter deals with JSON APIs and LSAdapter deals with local storage.";
    public static final String answer329 = "First way\n" +
            "\n" +
            "By extending the Em.View class, you have to create an object in your JavaScript to define a view. You can declare your functions and variables inside that.\n" +
            "Now to insert a view in your template,  you have to follow the write the handlebar script {{ #view App.ViewName}}\n\n" +
            "Second Way\n" +
            "In this technique, the name of the view object is not required,while inserting into the template. But inside the object you have another property called as templateName which should be initialized with the value same as data template name attribute in handlebar’s script tag, in your template";
    public static final String answer330 = "When you have to handle a business logic you can use controller, a controller can represent a section of a page or entire part of it.  It is like a block of logical functionality.";
    public static final String answer331 = "The template components used in ember.js are\n" +
            "\n" +
            "Partial\n" +
            "View\n" +
            "Render\n" +
            "Yield\n" +
            "Outlet";
    public static final String answer332 = "For turning a raw JSON ( JavaScript Object Notation ) payload returned from your server into a record object a serializer is responsible.  JSON APIs may represent attributes and relationship in many different ways.";
    public static final String answer333 = "You can use call the extend () method on Ember.object to define a new ember class";
    public static final String answer334 = "Call Ember.Handlebars.Compile() to create an ember.handlebars template.  It will return a function which can be used by ember.view for rendering.";
    public static final String answer335 = "In order to put sample data into an application before connecting the application to long term persistence, fixtures are used.\n" +
            "\n" +
            "First update js/application.js to indicate that your application’s application adapter is an extension of the DS.FixtureAdapter.  Adapters are used for communicating with a source of data for your application.  Usually, this will be a web service API.\n" +
            "Next, update the file at js/models/todo.js";
    public static final String answer336 = "The Ember.Route class is used to define individual routes in Ember.js. An ember route is built with three parts:\n" +
            "\n" +
            "The first part is the entry in the Ember router (/app/router. js ), ) which maps between our route name and a specific URI.\n" +
            "The second one is the route handler file, which is used to set up what should happen when that route is loaded.\n" +
            "The third one is the route template, which is used to specify where we display the actual content for the page.\n" +
            "In Ember.js, when we want to make a new page that we can visit using a URL, we need to generate a \"route\" using Ember CLI. Hence the generator will print out:\n" +
            "\n" +
            "Installing route\n" +
            "Create app/routes/about.hbs\n" +
            "Create app/templates/about.hbs\n" +
            "Updating router\n" +
            "Add route about\n" +
            "Installing route test\n" +
            "If you want to define a route, run the following command:\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            "ember generate route route-name  \n" +
            "The above command will generate a file name route-name.js in app/routes/ folder, a template for the route at app/templates/route-name.hbs, and a unit test file at tests/unit/routes/route-name-test.js. It will also add the route to the router.";
    public static final String answer337 = "In Ember Data, an Adapter is used to determine how data is persisted to a backend data store. Things such as the backend host, URL format, and headers used to talk to a REST API can all be configured in an adapter. For example, the rest adapter is used to deal with JSON APIs, and LSAdapter deals with local storage.";
    public static final String answer338 = "None : Returns tur if argument is null or undefined\n" +
            "Empty: Utility function constrains the rules on ember.none by returning false for empty string and empty arrays\n" +
            "isArray: Use this to check whether the value is an array\n" +
            "MakeArray: This function is used when you want a given object in an array\n" +
            "Typeof: This is used to get the type of the passed argument\n" +
            "Compare: Used to compare two objects of possibly different types\n" +
            "isEqual: It checks whether the passed two arguments are logically equal\n" +
            "inspect: While debugging this function is useful. For a given object it returns the string description\n" +
            "Log_Binding:  Log binding is not a function but a Boolean function. If set true ember will log all the activity that is happening on the bindings";
    public static final String answer339 = "In Ember.js an enumerable is any object that contains a number of child objects, and enables you to work with those children using the Ember.Enumerable API. Native JavaScript array is the most common enumerable in majority of Apps.";
    public static final String answer340 = "Ember.ArrayController is a controller that wraps an underlying array and adds additional functionality for the view layer   .  The advantage is that you have to set up your view binding only once.";
    public static final String answer341 = "For array proxies Ember.SortableMixin provides a standard interface to specify a sort order and maintain this sorting when objects are updated, removed or added without changing the order of the underlying model array.";
    public static final String answer342 = "Ember supports observing any property which also includes computed properties. Observers are something which contains the behavior that reacts to the changes made in other properties. Observers are used when we need to perform some behavior after binding has finished synchronizing. New ember developers often use observers. Observers are mostly used within the ember framework and for that; computed properties are the appropriate solution. An observer can be set on an object using the following syntax- \"ember.observer\" Observers in ember are synchronous. They fire as soon as they observe a change in the properties. So, because of this, it is easy to introduce bugs where properties are not yet synchronized.";
    public static final String answer343 = "It follows:\n" +
            "Ember.View.create({  \n" +
            "   templateName: 'NameOfTemplate',     \n" +
            "});";
    public static final String answer344 = "Bootstrap is a platform for web development based on a front-end framework. It is used to create exceptional responsive designs using HTML, and CSS. These templates are used for forms, tables, buttons, typography, models, tables, navigation, carousels and images. Bootstrap also has Javascript plugins, which are optional. Bootstrap is mostly preferred for developing mobile web applications.";
    public static final String answer345 = "Bootstrap has better features as compared to other web development platforms. It provides extensive browser support for almost every known browser such as Opera, Chrome, Firefox, Safari, etc. If you are well-acquainted with CSS and HTML, web development becomes easy on Bootstrap.\n" +
            "Also, it supports mobile applications with the help of responsive design and can adjust CSS as per the device, screen size, etc. Instead of creating multiple files, it creates only a single file reducing the work of a developer.";
    public static final String answer346 = "The key components of Bootstrap include:\n" +
            "\n" +
            "CSS: It consists of  various CSS files\n" +
            "Scaffolding: It provides a basic structure with the Grid system, link styles, and background\n" +
            "Layout Components: This gives the list of layout components\n" +
            "JavaScript Plugins: It contains many jQuery and JavaScript plugins\n" +
            "Customize: To get your own version of the framework, you can customize your components";
    public static final String answer347 = "Some of the features of Bootstrap are:\n" +
            "\n" +
            "It provides an open-source for use\n" +
            "Bootstrap has Compatibility with all browsers\n" +
            "It has Responsive designs\n" +
            "Easy to use and fast";
    public static final String answer348 = "A class loader is a part of JRE or Java Runtime Environment which loads Java classes into Java virtual environment. Class loaders also perform the process of converting a named class into its equivalent binary form.";
    public static final String answer349 = "There are two major layouts for Bootstrap:\n" +
            "\n" +
            "Fluid Layout- This layout is necessary for creating an app that is 100 % wider and covers all the screen width.\n" +
            "Fixed Layout- It is used only for a standard screen (940px). Both layouts can be used for creating a responsive design.";
    public static final String answer350 = "Bootstrap includes a responsive, mobile-first fluid grid system that appropriately scales up to 12 columns as the device or viewport size increases. It includes predefined classes for easy layout options, as well as powerful mixins for generating more semantic layouts.";
    public static final String answer351 = "Example of a basic grid structure:\n" +
            "<div class = \"container\">\n" +
            "<div class = \"row\">\n" +
            "<div class = \"col-*-*\"></div>\n" +
            "<div class = \"col-*-*\"></div>\n" +
            "</div>\n" +
            " \n" +
            "<div class = \"row\">...</div>\n" +
            "</div>\n" +
            "<div class = \"container\">....";
    public static final String answer352 = "Jumbotron is used for highlighting content in bootstrap. It could either be a slogan or probably a headline. It increases the heading size and gives a margin for the content of the landing page. To implement Jumbotron in a Bootstrap, you have to use:\n" +
            "\n" +
            "Create a container <div> with the class of .jumbotron\n" +
            "For example, use <div class=”container”> if you don’t want Jumbotron to reach the screen’s edge.";
    public static final String answer353 = "There are two simple ways to display code in Bootstrap:\n" +
            "\n" +
            "<code> tag: This tag is used to display an inline code.\n" +
            "<pre> tag: If you have a code with several lines or even a block element, you can display it using this.";
    public static final String answer354 = "Bootstrap sets a basic global display (background), typography, and link styles.\n" +
            "\n" +
            "Basic Global display − It sets background-color: #fff; on the <body> element.\n" +
            "\n" +
            "Typography − This uses the @font-family-base, @font-size-base, and @line-height-base attributes as the typographic base\n" +
            "\n" +
            "Link styles − It sets the global link color via attribute @link-color and applies link underlines only on :hover.";
    public static final String answer355 = "Bootstrap supports three types of lists such as:\n" +
            "\n" +
            "Ordered lists − An ordered list is a list that falls in some sort of sequential order and is prefaced by numbers.\n" +
            "\n" +
            "Unordered lists − An unordered list is a list that doesn't have any particular order and is traditionally styled with bullets. If you do not want the bullets to appear then you can remove the styling by using the class .list-unstyled.\n" +
            "\n" +
            "Definition lists − In this type of list, each list item can consist of both the <dt> and the <dd> elements. <dt> stands for definition term. Subsequently, the <dd> is the definition of the <dt>.";
    public static final String answer356 = "Carousel plugin in bootstrap is used to make sliders in the web pages or your site. There are several carousel plugins that are used in bootstrap to display large contents within a small space by adding sliders.\n" +
            "\n" +
            "Examples: .carousel(options), .carousel(‘pause’), .carousel(cycle’), .carousel(‘prev’), .carousel(‘next’).";
    public static final String answer357 = "Glyphicons are icon fonts which can be used in your web projects. Glyphicons Halflings are not free and require licensing. However, their creator has made them available for Bootstrap projects without any cost.\n" +
            "\n" +
            "To use the icons, you just have to use the following code just about anywhere in your code. Leave a space between the icon and text for proper padding.\n" +
            "\n" +
            "<span class = \"glyphicon glyphicon-search\"></span>";
    public static final String answer358 = "Input groups are extended Form Controls. You can easily prepend and append text or buttons to the text-based inputs with the help of input groups. Also, you can add common elements to the user’s input. For example, you can add the dollar symbol, the @ for a Twitter username, or anything else that might be common for your application interface.\n" +
            "\n" +
            "To prepend or append elements to a .form-control you need to do the following:\n" +
            "\n" +
            "Wrap it in a <div> with class .input-group\n" +
            "\n" +
            "In the next step, place your extra content inside a <span> with class .input-group-addon.\n" +
            "\n" +
            "Now place this <span> either before or after the <input> element.";
    public static final String answer359 = "Breadcrumbs are a great way to show hierarchy-based information for a site. In the case of blogs, breadcrumbs can show the dates of publishing, categories, or tags. They indicate the current page’s location within a navigational hierarchy.\n" +
            "\n" +
            "A breadcrumb in Bootstrap is simply an unordered list with a class of .breadcrumb. The separator is automatically added by CSS.";
    public static final String answer360 = "Pagination is the handling of an unordered list by bootstrap. If you want to handle pagination, bootstrap provides the following classes:\n" +
            "\n" +
            ".pagination: To get pagination on your page you have to add this class\n" +
            "\n" +
            ".disabled, .active: Customize links by .disabled for unclickable links and .active to indicate the current page\n" +
            "\n" +
            ".pagination-Ig, .pagination-sm: Use these classes to get different size item";
    public static final String answer361 = "You need to follow a few steps to build a dismissal alert:\n" +
            "\n" +
            "First, you have to add a basic alert by creating a wrapper <div> and adding a class of .alert and one of the four contextual classes.\n" +
            "\n" +
            "Also add optional .alert-dismissable to the above <div> class.\n" +
            "\n" +
            "Next, you have to add a close button.\n" +
            "\n" +
            "Finally, use the <button> element with the data-dismiss = “alert” data attribute.";
    public static final String answer362 = "To create a basic progress bar, you need to do the following:\n" +
            "\n" +
            "Add a <div> with a class of .progress.\n" +
            "\n" +
            "Next, inside the above <div>, add an empty <div> with a class of .progress-bar.\n" +
            "\n" +
            "Add a style attribute with the width expressed as a percentage. For example, style = “40%”; indicates that the progress bar was at 40%.";
    public static final String answer363 = "Column ordering is one of the most interesting features found in bootstrap. By using appropriate functions, the columns can be written easily and also in a defined order. You can also show them in another column. In order to change or alter the order of the column easily, the functions .col-md-push-* and .col-md-pull-* can be used.";
    public static final String answer364 = "Bootstrap uses Normalize to establish cross-browser consistency.\n" +
            "\n" +
            "Normalize.css is a modern, HTML5-ready alternative to CSS resets. It is a small CSS file that provides better cross-browser consistency in the default styling of HTML elements.";
    public static final String answer365 = "Bootstrap panel components are used for putting your DOM component in a box. To get a basic panel, simply add .panel and .panel-default classes to the <div> element. There are two ways of adding panel heading to a Bootstrap panel:\n" +
            "\n" +
            "Use any of the <h1>, <h2>, <h3>, <h4>, <h5>, or <h6> tags with a .panel-title class\n" +
            "You can also use the .panel-heading class";
    public static final String answer366 = "The purpose of using the Scrollspy plugin in Bootstrap is that it allows you to target certain sections of the page based on the scroll position. Thereafter, you can add .active classes, based on the scroll position, to the Bootstrap navbar.";
    public static final String answer367 = "We use the affix plugin in Bootstrap for affixing a <div> to some certain location on a webpage. The plugin also allows toggling pinning on and off for the affixed <div>. Social icons are the most popular example of using the affix plugin in Bootstrap.\n" +
            "\n" +
            "The affixed <div> starts from a particular location on the webpage and scrolls with it. However, after a certain mark, it will be locked in place, thus stopping scrolling with the rest of the webpage.";
    public static final String answer368 = "Button groups allow multiple buttons to be stacked together on a single line. You can use this when you want to place items like alignment buttons together.\n" +
            "\n" +
            "For basic button group, .btn-group class is used. Here, you can wrap a series of buttons with class .btn in .btn-group.";
    public static final String answer369 = "<div class=\"alert\" role=\"alert\">Warning! I'm missing something.</div>\n" +
            "Alert messages are used to provide feedback message and they usually require the attention of the user. Here it is important to note that Bootstrap Alerts don’t have default class. If a contextual class such as .alert-success, .alert-info, .alert-warning, or .alert-danger, is not provided, a default gray alert will be created.";
    public static final String answer370 = "Badges are used to supplement any content with additional information. To make rectangular badges, use the .badge class with a contextual class (like .badge-secondary) within <span> elements. It's worth noting that badges scale to fit the parent element's size (if any).\n" +
            "\n" +
            "To make the badges more rounded, we use the .badge-pill class. ";
    public static final String answer371 = "The following three rules should be strictly kept in mind while using Grids in Bootstrap:-\n" +
            "\n" +
            "A row's immediate child must be a Column.\n" +
            "Rows are just used to contain Columns and are not utilized for anything else.\n" +
            "Rows should be put within a container.";
    public static final String answer372 = "Node.js is an open-source, cross-platform JavaScript runtime environment and library to run web applications outside the client’s browser. It is used to create server-side web applications.\n" +
            "\n" +
            "Node.js is perfect for data-intensive applications as it uses an asynchronous, event-driven model. You can use  I/O intensive web applications like video streaming sites. You can also use it for developing: Real-time web applications, Network applications, General-purpose applications, and Distributed systems.";
    public static final String answer373 = "Node.js makes building scalable network programs easy. Some of its advantages include:\n" +
            "\n" +
            "It is generally fast\n" +
            "It rarely blocks\n" +
            "It offers a unified programming language and data type\n" +
            "Everything is asynchronous \n" +
            "It yields great concurrency";
    public static final String answer374 = "A web server using Node.js typically has a workflow that is quite similar to the diagram illustrated below. Let’s explore this flow of operations in detail." +
            "\n" +
            "Clients send requests to the webserver to interact with the web application. Requests can be non-blocking or blocking:\n" +
            "Querying for data\n" +
            "Deleting data \n" +
            "Updating the data\n" +
            "Node.js retrieves the incoming requests and adds those to the Event Queue\n" +
            "The requests are then passed one-by-one through the Event Loop. It checks if the requests are simple enough not to require any external resources\n" +
            "The Event Loop processes simple requests (non-blocking operations), such as I/O Polling, and returns the responses to the corresponding clients\n" +
            "A single thread from the Thread Pool is assigned to a single complex request. This thread is responsible for completing a particular blocking request by accessing external resources, such as computation, database, file system, etc.\n" +
            "\n" +
            "Once the task is carried out completely, the response is sent to the Event Loop that sends that response back to the client.";
    public static final String answer375 = "Node.js is single-threaded for async processing. By doing async processing on a single-thread under typical web loads, more performance and scalability can be achieved instead of the typical thread-based implementation.";
    public static final String answer376 = "The Multi-Threaded Request/Response Stateless Model is not followed by the Node JS Platform, and it adheres to the Single-Threaded Event Loop Model. The Node JS Processing paradigm is heavily influenced by the JavaScript Event-based model and the JavaScript callback system. As a result, Node.js can easily manage more concurrent client requests. The event loop is the processing model's beating heart in Node.js.";
    public static final String answer377 = "A callback function is called after a given task. It allows other code to be run in the meantime and prevents any blocking.  Being an asynchronous platform, Node.js heavily relies on callback. All APIs of Node are written to support callbacks.";
    public static final String answer378 = "Node.js is widely used in the following applications:\n" +
            "\n" +
            "Real-time chats\n" +
            "Internet of Things\n" +
            "Complex SPAs (Single-Page Applications)\n" +
            "Real-time collaboration tools\n" +
            "Streaming applications\n" +
            "Microservices architecture";
    public static final String answer379 = "NPM stands for Node Package Manager, responsible for managing all the packages and modules for Node.js.\n" +
            "\n" +
            "Node Package Manager provides two main functionalities:\n" +
            "\n" +
            "Provides online repositories for node.js packages/modules, which are searchable on search.nodejs.org\n" +
            "Provides command-line utility to install Node.js packages and also manages Node.js versions and dependencies  ";
    public static final String answer380 = "In Node.js, Modules are the blocks of encapsulated code that communicates with an external application on the basis of their related functionality. Modules can be a single file or a collection of multiples files/folders. The reason programmers are heavily reliant on modules is because of their re-usability as well as the ability to break down a complex piece of code into manageable chunks.\n" +
            "\n" +
            "Modules are of three types:\n" +
            "\n" +
            "Core Modules\n" +
            "local Modules\n" +
            "Third-party Modules";
    public static final String answer381 = "Some of the reasons why Node.js is preferred include:\n" +
            "\n" +
            "Node.js is very fast\n" +
            "Node Package Manager has over 50,000 bundles available at the developer’s disposal\n" +
            "Perfect for data-intensive, real-time web applications, as Node.js never waits for an API to return data\n" +
            "Better synchronization of code between server and client due to same code base\n" +
            "Easy for web developers to start using Node.js in their projects as it is a JavaScript library";
    public static final String answer382 = "MongoDB is the most common database used with Node.js. It is a NoSQL, cross-platform, document-oriented database that provides high performance, high availability, and easy scalability.";
    public static final String answer383 = "There are two commonly used libraries in Node.js:\n" +
            "\n" +
            "ExpressJS - Express is a flexible Node.js web application framework that provides a wide set of features to develop web and mobile applications.\n" +
            "Mongoose - Mongoose is also a Node.js web application framework that makes it easy to connect an application to a database.";
    public static final String answer384 = "The “require” command is used for importing external libraries. For example - “var http=require (“HTTP”).”  This will load the HTTP library and the single exported object through the HTTP variable.\n" +
            "\n" +
            "Now that we have covered some of the important beginner-level Node.js interview questions let us look at some of the intermediate-level Node.js interview questions.";
    public static final String answer385 = "An event-driven programming approach uses events to trigger various functions. An event can be anything, such as typing a key or clicking a mouse button. A call-back function is already registered with the element executes whenever an event is triggered.";
    public static final String answer386 = "Event loops handle asynchronous callbacks in Node.js. It is the foundation of the non-blocking input/output in Node.js, making it one of the most important environmental features.";
    public static final String answer387 = "The distinction between method and product. This is accomplished through the use of nextTick() and setImmediate(). next Tick() postpones the execution of action until the next pass around the event loop, or it simply calls the callback function once the event loop's current execution is complete, whereas setImmediate() executes a callback on the next cycle of the event loop and returns control to the event loop for any I/O operations.";
    public static final String answer388 = "EventEmitter is a class that holds all the objects that can emit events\n" +
            "Whenever an object from the EventEmitter class throws an event, all attached functions are called upon synchronously";
    public static final String answer389 = "The two types of API functions in Node.js are:\n" +
            "\n" +
            "Asynchronous, non-blocking functions\n" +
            "Synchronous, blocking functions";
    public static final String answer390 = "The package.json file is the heart of a Node.js system. This file holds the metadata for a particular project. The package.json file is found in the root directory of any Node application or module\n" +
            "\n" +
            "This is what a package.json file looks like immediately after creating a Node.js project using the command: npm init\n" +
            "\n" +
            "You can edit the parameters when you create a Node.js project.";
    public static final String answer391 = "The request object represents the HTTP request and has properties for the request query string, parameters, body, HTTP headers, and so on\n" +
            "The response object represents the HTTP response that an Express app sends when it receives an HTTP request";
    public static final String answer392 = "Streams are objects that enable you to read data or write data continuously.\n" +
            "\n" +
            "There are four types of streams:\n" +
            "\n" +
            "Readable – Used for reading operations\n" +
            "\n" +
            "Writable − Used for write operations\n" +
            "\n" +
            "Duplex − Can be used for both reading and write operations\n" +
            "\n" +
            "Transform − A type of duplex stream where the output is computed based on input";
    public static final String answer393 = "All Node.js library APIs are asynchronous, which means they are also non-blocking\n" +
            "A Node.js-based server never waits for an API to return data. Instead, it moves to the next API after calling it, and a notification mechanism from a Node.js event responds to the server for the previous API call";
    public static final String answer394 = "REPL stands for Read Eval Print Loop, and it represents a computer environment. It’s similar to a Windows console or Unix/Linux shell in which a command is entered. Then, the system responds with an output";
    public static final String answer395 = "Buffer class stores raw data similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap. Buffer class is used because pure JavaScript is not compatible with binary data";
    public static final String answer396 = "Piping is a mechanism used to connect the output of one stream to another stream. It is normally used to retrieve data from one stream and pass output to another stream";
    public static final String answer397 = "Callback hell, also known as the pyramid of doom, is the result of intensively nested, unreadable, and unmanageable callbacks, which in turn makes the code harder to read and debug\n" +
            "improper implementation of the asynchronous logic causes callback hell";
    public static final String answer398 = "A reactor pattern is a concept of non-blocking I/O operations. This pattern provides a handler that is associated with each I/O operation. As soon as an I/O request is generated, it is then submitted to a de-multiplexer";
    public static final String answer399 = "The V8 engine, developed by Google, is open-source and written in C++. Google Chrome makes use of this engine. V8, unlike the other engines, is also utilized for the popular Node.js runtime. V8 was initially intended to improve the speed of JavaScript execution within web browsers. Instead of employing an interpreter, V8 converts JavaScript code into more efficient machine code to increase performance. It turns JavaScript code into machine code during execution by utilizing a JIT (Just-In-Time) compiler, as do many current JavaScript engines such as SpiderMonkey or Rhino (Mozilla).";
    public static final String answer400 = "Middleware is a function that receives the request and response objects. Most tasks that the middleware functions perform are:  \n" +
            "\n" +
            "Execute any code\n" +
            "Update or modify the request and the response objects\n" +
            "Finish the request-response cycle\n" +
            "Invoke the next middleware in the stack";
    public static final String answer401 = "The WASI class implements the WASI system called API and extra convenience methods for interacting with WASI-based applications. Every WASI instance represents a unique sandbox environment. Each WASI instance must specify its command-line parameters, environment variables, and sandbox directory structure for security reasons.";
    public static final String answer402 = "Express.js, or simply Express, is a free, open-source, lightweight, and fast backend web application framework for Node.js. It is released as open-source software under the MIT License.\n" +
            "\n" +
            "It is designed for building single-page, multi-page, and hybrid web applications and APIs. It is called the de facto standard server framework for Node.js. It was founded and developed by TJ Holowaychuk in 2010 and written in JavaScript.";
    public static final String answer403 = "As Express is a lightweight, minimal and flexible Node.js web application framework, it provides a robust set of features for web and mobile applications. Following is the list of some distinctive features of this framework:" +
            "\n" +
            "js can be used to design single-page, multi-page, and hybrid web applications and APIs.\n" +
            "It allows to set up middleware to respond to HTTP/RESTful Requests.\n" +
            "It defines a routing table to perform different HTTP operations (method and URL).\n" +
            "It allows to dynamically rendering HTML Pages based on passing arguments to templates.\n" +
            "It provides high performance because of its ultra-fast I/O. It prepares a thin layer; therefore, the performance is adequate.\n" +
            "Its MVC-like structure makes it organize the web application into MVC architecture.\n" +
            "It provides good database support. It supports RDBMS as well as NoSQL databases.\n" +
            "It is asynchronous and single-threaded.\n" +
            "Its robust API makes routing easy.";
    public static final String answer404 = "Express.js or Express is a JavaScript backend framework. It is mainly designed to develop complete web applications (single-page, multi-page, and hybrid web applications) and APIs. Express is the backend component of the MEAN stack where M stands for MongoDB, which handles database; E stands for Express, which handles backend; A stands for AngularJS, which is for the front-end, and N stands for Node.";
    public static final String answer405 = "Express.js is an automatically prebuilt Node.js framework that facilitates us to create server-side web applications faster and smarter. The main reason for choosing Express is its simplicity, minimalism, flexibility, and scalability characteristics.";
    public static final String answer406 = "Following are the steps accustomed for An Express JS application:\n" +
            "\n" +
            "A folder with a constant name because the project name is made.\n" +
            "A file named package.json is made within the folder created.\n" +
            "“npm install” command is run on the electronic communication. It installs all the libraries gift in package.json.\n" +
            "A file named server.js is made.\n" +
            "“Router” file is made within the package that consists of a folder named index.js.\n" +
            "“App” is made within the package that has the index.html file.";
    public static final String answer407 = "The arguments which are available to an Express JS route handler-function are-\n" +
            "\n" +
            "Req: the request object\n" +
            "Res: the response object\n" +
            "Next (optional): a function that is employed to pass management to 1 of the following route handlers.\n" +
            "The third argument is optional and should be omitted, however, in some cases, it’s helpful wherever there’s a series of handlers and management will be passed to 1 of the following route handlers skipping this one.";
    public static final String answer408 = "In Express JS, there are 2 ways that for configuring the properties:\n" +
            "\n" +
            "With process.ENV:\n" +
            "\n" +
            "A file with the name “.env” is to be created within the project folder.\n" +
            "All the properties are to be other within the “.env” file.\n" +
            "Any of the properties will be employed in server.js.\n" +
            "With require.JS:\n" +
            "\n" +
            "A file with the name “config.json” is to be created within the config folder within the project folder.\n" +
            "The config properties are to be present within the config.json file.\n" +
            "Now, ought to be accustomed access the config.json file.";
    public static final String answer409 = "var bodyParser = require('body-parser')  \n" +
            "app.use( bodyParser.json() );       // to support JSON-encoded   \n" +
            "app.use(bodyParser.urlencoded({     // to support URL-encoded   \n" +
            "  extended: true  \n" +
            "}));";
    public static final String answer410 = "Scaffolding is a technique used for creating the skeleton structure of an application. It facilitates users to easily create their public directories, routes, views, etc., or a web application skeleton. Generally, users manually create their public directory, add middleware, create separate route files, etc. Using a scaffolding tool, they can set up all these things to directly get started with building their application.\n" +
            "\n" +
            "There are two ways to install Scaffolding and use it in your application.\n" +
            "\n" +
            "Express application generator\n" +
            "Yeoman\n" +
            "Express application generator: This is used to create an application skeleton quickly. Use the following command to install the Express application generator.\n" +
            "\n" +
            "npm install express-generator -g  \n" +
            "express myApp  \n" +
            "By using the above command, a project named \"myApp\" will be created along with following the files/folders in the project.\n" +
            "\n" +
            "Bin: The bin folder contains one file called www is the main configuration file of the app.\n" +
            "Public: The public folder contains JavaScript, CSS, and images, etc.\n" +
            "Routes: This folder contains the routing files.\n" +
            "Views: The view folder contains the view files of the application.\n" +
            "js: The app.js file is the main file of the application.\n" +
            "json: The package.json file is the manifest file. It contains all metadata of the project, such as the packages used in the app (called dependencies) etc.\n" +
            "Now, we have to install all the dependencies mentioned in the package.json file by using the following command:\n" +
            "\n" +
            "cd myApp  \n" +
            "npm install  \n" +
            "Yeoman: Use the following command in your terminal to install Yeoman:\n" +
            "\n" +
            "npm install -g yeoman  \n" +
            "Yeoman uses generators to scaffold out applications.";
    public static final String answer411 = "The Scaffolding technique is also supported by other MVC frameworks other than Express. The following frameworks mainly support it: Ruby on Rails, OutSystems Platform, Play framework, Django, MonoRail, Brail, Symfony, Laravel, CodeIgniter, YII, CakePHP, Phalcon PHP, Model-Glue, PRADO, Grails, Catalyst, Seam Framework, Spring Roo, ASP.NET, etc.";
    public static final String answer412 = "We can allow CORS in Express.js, by adding the following code in server.js:\n" +
            "\n" +
            "app.all('*', function(req, res, next) {  \n" +
            "res.set('Access-Control-Allow-Origin', '*');  \n" +
            "res.set('Access-Control-Allow-Methods', 'GET, POST, DELETE, PUT');  \n" +
            "res.set('Access-Control-Allow-Headers', 'X-Requested-With, Content-Type');  \n" +
            "if ('OPTIONS' == req.method) return res.send(200);  \n" +
            "next();  \n" +
            "});";
    public static final String answer413 = "This is the basic Express JS Interview Questions asked in an interview. There is no definitive answer to the current question. The solution depends on the dimensions of your application and therefore the team that’s concerned.\n" +
            "Routes and alternative application-Express logic will board as several files as you would like, in any directory structure you favor. Read the subsequent examples for inspiration:\n" +
            "\n" +
            "Route listings\n" +
            "Route map\n" +
            "MVC vogue controllers\n" +
            "Also, there are third-party extensions for Express JS applications that modify a number of these patterns:\n" +
            "\n" +
            "Resourceful routing";
    public static final String answer414 = "Error handling is much easier in the Express versions over Express 4.0. Use the following steps to do the error handling:\n" +
            "\n" +
            "Create an Express.js application. There is no built-in middleware like error handler in express 4.0, so you have to either install a middleware or create a custom one.\n" +
            "\n" +
            "Create a Middleware:\n" +
            "\n" +
            "Create a middleware as following:\n" +
            "\n" +
            "// error handler  \n" +
            "app.use(function(err, req, res, next) {  \n" +
            "// set locals, only providing error in development  \n" +
            "res.locals.message = err.message;  \n" +
            "res.locals.error = req.app.get('env') === 'development' ? err : {};  \n" +
            "// render the error page  \n" +
            "res.status(err.status || 500);  \n" +
            "res.render('error');  \n" +
            "});  \n" +
            "Install Error Handler Middleware:\n" +
            "\n" +
            "Install the errorhandler as following:\n" +
            "\n" +
            "npm install errorhandler --save  \n" +
            "Create a variable:\n" +
            "\n" +
            "var errorhandler = require('errorhandler')  \n" +
            "Use the middleware as following:\n" +
            "\n" +
            "if (process.env.NODE_ENV === 'development') {  \n" +
            " // only use in development  \n" +
            "  app.use(errorhandler({log: errorNotification}))  \n" +
            "}  \n" +
            "function errorNotification(err, str, req) {  \n" +
            " var title = 'Error in ' + req.method + ' ' + req.url  \n" +
            " notifier.notify({  \n" +
            "   title: title,  \n" +
            "   message: str  \n" +
            " })  \n" +
            "}";
    public static final String answer415 = "There is no need to \"render\" HTML with the res.render() function. If you have a specific file, you can use the res.sendFile() function, but you should use the express if you serve many assets from a directory.static() middleware function.";
    public static final String answer416 = "In order to permit CORS in Express.js, add the subsequent code in server.js:\n" +
            "\n" +
            "For Example:\n" +
            "\n" +
            "app.all('*', function(req, res, next) {\n" +
            "res.set('Access-Control-Allow-Origin', '*');\n" +
            "res.set('Access-Control-Allow-Methods', 'GET, POST, DELETE, PUT');\n" +
            "res.set('Access-Control-Allow-Headers', 'X-Requested-With, Content-Type');\n" +
            "if ('OPTIONS' == req.method) return res.send(200);\n" +
            "next();\n" +
            "});";
    public static final String answer417 = "Next -It passes management to a consecutive matching route. OR a operate to pass management to 1 of the following route handlers.\n" +
            "The argument could also be omitted, however, is beneficial in cases wherever you have got a series of handlers and you’d wish to pass management to 1 of the following route handlers, and skip this one.\n" +
            "\n" +
            "app.get('/user details/:id?', function(req, res, next));\n" +
            "\n" +
            "Req and Res: It represents the request and response objects\n" +
            "Next: It passes management to a consecutive matching route.";
    public static final String answer418 = "In server.js add the subsequent code to send 404 errors back to a page in our ExpressJS App:\n" +
            "\n" +
            "/* Define fallback route */\n" +
            "app.use(function(req, res, next) {\n" +
            "res.status(404).json({errorCode: 404, errorMsg: \"route not found\"});\n" +
            "});";
    public static final String answer419 = "Laravel is an open-source and new generation web framework for PHP, developed by Taylor Otwell in 2011. It is specially designed to develop web-based applications, and follows the MVC model, suitable for creating simple, elegant, and well-structured applications. It has a current stable release with version 8 that was released on 8th Sept 2020. \n" +
            "\n" +
            "Laravel comes with a framework called Lumen built on top of the Laravel components, making it a perfect option for creating a Laravel based microservices application.";
    public static final String answer420 = "The following are the pros and cons of the Laravel framework.\n" +
            "\n" +
            "Pros of Laravel:\n" +
            "\n" +
            "For managing the project dependencies, Laravel uses the Composer allowing developers to mention the package name, version, and the pre-built functionalities that are ready for use in your project, resulting in faster development of the application\n" +
            "It comes with a blade templating engine that is easy to learn and understand. This is useful while working with the PHP/HTML languages. Web development via Laravel allows the composing of the plain PHP codes in a layout shape, thus helping in improving the execution of complex tasks.\n" +
            "You can learn Laravel via Laracast that comes with both free and paid videos for easy learning\n" +
            "Laravel has an object-relational mapper named Eloquent that helps implement the active record pattern and interact with the relational database. It is available as a package for Laravel.\n" +
            "Laravel has a built-in command-line tool called Artisan support, where users can carry out repetitive tasks quickly and effortlessly\n" +
            "With the help of the Laravel schema, developers can create database tables and add desired columns via writing a simple migration script\n" +
            "It comes with a reverse routing feature that makes your application more flexible\n" +
            " \n" +
            "\n" +
            "Cons of Laravel:\n" +
            "\n" +
            "It is challenging to migrate legacy system to Laravel\n" +
            "It comes with heavy documentation that might be difficult to understand for beginners\n" +
            "Upgrades aren't smooth";
    public static final String answer421 = "Events are actions recognized and handled by the program. These events work on the Observer-subscriber pattern. All the events in Laravel are stored within the app/Events directory, and the lists are stored within the app/listeners directory. Events can decouple the applications’ aspects as a single event, which is capable of handling multiple listeners. ";
    public static final String answer422 = "In Laravel, ValidatesRequests is a trait used by classes to validate the input provided by the user. To store the data, we normally use the create or store methods defined at the Laravel routes with the get method.\n" +
            "\n" +
            "You can get the Laravel validate method in the Illuminate\\Http\\Request object. If there is no error in the rule and it passes successfully, the code will execute as expected. But if there is any failure while validation, the code will not run and the user will get the error response for the HTTP request.\n" +
            "\n" +
            "Below is an example of how validation rules are defined in Laravel:\n" +
            "\n" +
            "/**\n" +
            "* Store a post.\n" +
            "*\n" +
            "* @param  Request $request\n" +
            "* @return Response\n" +
            "*/\n" +
            "public function store(Request $request)\n" +
            "{\n" +
            "  $validatedData = $request->validate([\n" +
            "      'title' => 'required|unique:posts|max:255',\n" +
            "      'body' => 'required',\n" +
            "  ]);\n" +
            "}\n" +
            "In the code above, the title and the body are the required fields. The validation rule is sequential, so if there is any failure in any validation, further validation will not be checked.";
    public static final String answer423 = "The composer comes as a dependency manager. If it is not installed on your system, you can install it using this link..https://cutt.ly/jImykv8\n" +
            "\n" +
            "After successfully installing the composer on your system, you need to create a project directory for your Laravel project. Later, you need to navigate the path where you have created the Laravel directory and run the following command:\n" +
            "\n" +
            "composer create-project laravel/laravel --prefer-dist\n" +
            "This command will help install the Laravel in the current directory. If you want to start Laravel, run the following command.\n" +
            "\n" +
            "\n" +
            "php artisan serve \n" +
            "Laravel will get started on the development server. Now, run http://localhost:8000/ on your browser. The server requirement is as follows for installing Laravel.\n" +
            "\n" +
            " \n" +
            "\n" +
            "PHP >= 7.1.3.\n" +
            "OpenSSL PHP Extension\n" +
            "PDO PHP Extension\n" +
            "Mbstring PHP Extension\n" +
            "Tokenizer PHP Extension\n" +
            "XML PHP Extension\n" +
            "Ctype PHP Extension\n" +
            "JSON PHP Extension";
    public static final String answer424 = "PHP artisan is a command-line tool available in Laravel that comes with a variety of useful commands which help create an application quickly and hassle-free. You will get commands for every important task by default, like database seeding, migration, configuring cache, and many others. \n" +
            "\n" +
            "The following are some important PHP artisan commands:\n" +
            "\n" +
            "php artisan make:controller : Used for creating a Controller file\n" +
            "php artisan make:model : Used for making a Model file\n" +
            "php artisan make:migration : Used for making the Migration file\n" +
            "php artisan make:seeder : Used for making the Seeder file\n" +
            "php artisan make:factory : Used for making the Factory file\n" +
            "php artisan make:policy : Used for making the Policy file\n" +
            "php artisan make:command : Used for making a new artisan command";
    public static final String answer425 = "Middleware provides a mechanism that helps filter the incoming HTTP request to your application. The basic middleware is explained with authentication. If the user is not authenticated, they will be redirected to the login page, and if the user is authenticated, they will be allowed for further processing. All this is possible with the help of the middleware.\n" +
            "\n" +
            "Laravel has a php artisan make:middleware <middleware_name> command, helping define the new middleware within your application. By default, the middleware will get stored in the app/Http/Middleware directory. \n" +
            "\n" +
            "If you want to run middleware for every HTTP request, list the middleware class within the $middleware property of the app/Http/Kernel.php class. If you want to assign middleware specifically, assign it in the key-value pair at the app/Http/Kernel.php class $routeMiddleware property.";
    public static final String answer426 = "Laravel comes with the Blade templating engine, which helps users use the plain PHP code in the view and then compiles and caches that view until the next modification. You can get the files related to the blade views in the resources/views directory with the extension .blade.php.\n" +
            "\n" +
            "Below is an example of the Blade file.\n" +
            "\n" +
            "<!-- /resources/views/alert.blade.php -->\n" +
            "<div class=\"alert alert-danger\">\n" +
            "  {{ $slot }}\n" +
            "</div>\n" +
            "In the variable $slot, you can assign any desired value to inject into the component. \n" +
            "The Component will look as follows:\n" +
            "\n" +
            "@component('alert')\n" +
            "  <strong>Whoops!</strong> Something went wrong!\n" +
            "@endcomponent\n" +
            "@component is the blade directive here.";
    public static final String answer427 = "CSRF is defined as a cross-site forgery attack, a type of malicious exploit where the authenticated users run unauthorized commands. In such a case, Laravel will generate CSRF tokens automatically for each active user’s session. This token will verify the authenticated user who is making that unauthorized request to the application.\n" +
            "\n" +
            "<form method=\"POST\" action=\"/profile\">\n" +
            "  @csrf\n" +
            "  ...\n" +
            "</form>\n" +
            "Suppose you are creating an HTML form for your application. Make sure to include a hidden CSRF token field in the form so that the middleware will check for the field and validate it. VerifyCsrfToken middleware is included within the web middleware group. You can use the @csrf blade directive for generating the token field on your application’s form.\n" +
            "\n" +
            "If you are using a JS-driven application, the JS HTTP library will automatically attach the CSRF token to every HTTP request.";
    public static final String answer428 = "The Laravel facade offers a static interface for the classes available in the service container of the application. In Laravel, all the facades are stored within the Illuminate\\Support\\Facades namespaces. You can implement the facades easily without the need for injection, allowing you to use multiple facades within the same class. It comes with an expressive syntax, ensuring higher flexibility than traditional static class’s methods.\n" +
            "\n" +
            "Access facade will look like:\n" +
            "\n" +
            "use Illuminate\\Support\\Facades\\Cache;\n" +
            "Route::get('/cache', function () {\n" +
            "  return Cache::get('key');\n" +
            "});";
    public static final String answer429 = "Before proceeding with the concept of Eloquent, it is important to understand what ORM (object-relational mapping) is. ORM is a programming method that helps users convert data between the relational database and object-oriented programming languages. You can refer to it as an object-relational mapper. \n" +
            "\n" +
            "Eloquent is a type of ORM commonly used in Laravel, allowing users to work with the database efficiently. Every database has a specific model for interacting with the tables. \n" +
            "\n" +
            "Eloquent has the following types of relationships:\n" +
            "\n" +
            "One to One\n" +
            "Many to One\n" +
            "One to Many\n" +
            "Many to Many\n" +
            "Has one Through\n" +
            "Has_many Through";
    public static final String answer430 = "The following are the advantages of using the Laravel framework:\n" +
            "\n" +
            "Free\n" +
            "Helpful for simple configurations of the applications\n" +
            "This framework is based on the MVC model\n" +
            "Comes with a wide range of modules and libraries, helping developers to speed up the development process\n" +
            "Ensures high performance and makes the routing process easier\n" +
            "Offers an Eloquent ORM, allowing you to handle various database-related tasks\n" +
            "Inbuilt facility for supporting the unit tests\n" +
            "Comes with strong community support";
    public static final String answer431 = "The following are the significant features of the Laravel framework:\n" +
            "\n" +
            "Offers Eloquent ORM for handling database-related tasks\n" +
            "Comes with a Query builder\n" +
            "Offers an easy process for Reverse routing\n" +
            "Offers Class auto-loading and comes with Restful controllers\n" +
            "Comes with the Blade template engine\n" +
            "You will have the option for the Lazy collection\n" +
            "Unit testing is easier\n" +
            "Offers Database seeding and supports easy migrations";
    public static final String answer432 = "The latest stable version of Laravel is Laravel 8. Here are some good features of Laravel 8:\n" +
            "\n" +
            "Laravel Jetstream\n" +
            "Models directory\n" +
            "Model factory classes\n" +
            "Migration squashing\n" +
            "Time testing helpers\n" +
            "Dynamic blade components\n" +
            "Rate limiting improvements";
    public static final String answer433 = "This is the directory structure of any Laravel project:\n" +
            "\n" +
            "app folder: It contains the source code of an application and consists of five sub-folders, namely the Console folder, Exceptions folder, Http folder, Models folder, and Providers folder. These sub-folders further contain exception handlers, controllers, middleware, service providers, and models.\n" +
            " \n" +
            "Note: In Laravel 7, you do not have any folder called Models. All model files are present inside the app folder rather than the app/Models folder.\n" +
            "\n" +
            "bootstrap folder: Contains the bootstrap files\n" +
            "config folder: Contains the configuration files\n" +
            "database folder: Includes the database-related files and three sub-folders, namely the factories folder, migrations folder, seeders folder, and the .gitignore file. These sub-folders further store the large set of data, database migrations, and seeds.\n" +
            "public folder: Has the files necessary for initializing the application\n" +
            "resources folder: Contains the files for the HTML, CSS, and JavaScript. It contains four sub-folders, namely the CSS folder, js folder, lang folder, and views folder.\n" +
            "routes folder: Contains the route definitions\n" +
            "storage folder: Consists of cache files, session files, and more\n" +
            "tests folder: Contains test files, like unit test files.\n" +
            "vendor folder: Contains all composer dependency packages\n" +
            ".env file: Contains the environmental variables\n" +
            "composer.json file: Contains dependencies\n" +
            "package.json file: This file is for an application’s frontend and is similar to the composer.json file";
    public static final String answer434 = "In Laravel, authentication is the process where you verify the users of an application. You can achieve this by identifying the username and password of users. Also, you can use another parameter for authentication. If the provided credentials are right, the user is authenticated; otherwise, the user is unauthenticated. \n" +
            "\n" +
            "Laravel uses guards and providers for the authentication process. Guards will specify how the users get authenticated for each request, whereas the providers will specify how the users get retrieved from the persistent storage.";
    public static final String answer435 = "Service providers in Laravel play a central role, helping configure all applications and core services. They are robust tools that help maintain class dependencies and perform an injection. It also provides instructions to Laravel for binding the various components within Laravel's service container. \n" +
            "\n" +
            "For generating a service provider, use the following artisan command:\n" +
            "\n" +
            "php artisan make: provider ClientsServiceProvider  \n" +
            "Every service provider in Laravel will extend the Illuminate\\Support\\ServiceProvider class and comes with the following two functions:\n" +
            "\n" +
            "Register()\n" +
            "Boot()";
    public static final String answer436 = "It is a pre-packed, official virtual machine, allowing developers to use all the necessary tools for developing Laravel. It comes with Ubuntu, Gulp, Bower, and other essential development tools allowing the development of full-scale web-based applications. It will provide a development environment used by developers without the need for installing PHP, a web server, or other server-related software on your machine.";
    public static final String answer437 = "Laravel provides the dd() function, allowing users to dump the content of variables to a browser and then stop the execution of the further script. The dd stands for the dump and dies, and it first dumps a variable or object and kills (die) the execution of the script. If you want, you can easily isolate this function in a reusable function file or a class.";
    public static final String answer438 = "Laravel provides @yield for defining a section in a layout, getting the content from the child page, and submitting it to a master page. So whenever you use Laravel to execute the blade file, it first checks whether you have extended the master layout or not. If so, it moves to the master layout and commences getting the @sections.";
    public static final String answer439 = "In Laravel, requests are used to interact with incoming HTTP requests, along with the sessions, cookies, and even files, if they are submitted with the requests. The class Illuminate\\Http\\Request is responsible for requests in Laravel. \n" +
            "\n" +
            "Whenever you submit any request to the Laravel route, it goes to the controller method, and with the help of the dependency injection, the object of that request will be available in the controller method. You can perform various actions with a request, such as validating and authorizing.\n" +
            "\n" +
            "You can even create a request validation class that will store validation rules and associated error messages. Consider the following example:\n" +
            "\n" +
            "/**\n" +
            "* Store a new blog post.\n" +
            "*\n" +
            "* @param  \\Illuminate\\Http\\Request  $request\n" +
            "* @return \\Illuminate\\Http\\Response\n" +
            "*/\n" +
            "public function store(Request $request)\n" +
            "{\n" +
            "    $validated = $request->validate([\n" +
            "        'title' => 'required|unique:posts|max:255',\n" +
            "        'body' => 'required',\n" +
            "    ]);\n" +
            "\n" +
            "    // The blog post is valid...\n" +
            "}";
    public static final String answer440 = "Closures are anonymous methods in Laravel used as a callback function, and you can also use it as a parameter in a function. \n" +
            "\n" +
            "You can easily pass parameters into closure by changing the closure function call in the handle() method. With the help of the closures, you can access variables present outside the scope of the variables. \n" +
            "\n" +
            "Example\n" +
            "\n" +
            "function handle(Closure $closure) { \n" +
            "    $closure(); \n" +
            "} \n" +
            "handle(function(){ \n" +
            "echo \"Hello\"'; \n" +
            "});   \n" +
            "You can add the closure parameter to the handle() method, and now you can call the handle() method and pass a service as a parameter.";
    public static final String answer441 = "In Laravel, soft delete is a feature that helps soft delete models rather than actually deleting them from the database. If you wish to enable the soft deletes for a model, you need to mention the soft delete property in the model, as shown below:\n" +
            "\n" +
            " \n" +
            "\n" +
            "use Illuminate\\Database\\Eloquent\\SoftDeletes;\n" +
            "\n" +
            "and you can use this\n" +
            "\n" +
            "use SoftDeletes; in our model property.\n" +
            "\n" +
            "After using the delete() query, the deleted_at timestamp is set on the record if the record is not removed from the database.";
    public static final String answer442 = "With the help of the repository pattern, you can use an object without knowing how it existed. It acts as an abstraction for the data layer, meaning there is no need to know how data persisted. Thus, the business logic depends on the repository for getting the right data. In simple words, it is used for decoupling the data access layers and the business logic in the application.";
    public static final String answer443 = "Normally, HTML forms do not support PUT, PATCH, or DELETE actions. So, if you want to call these actions from an HTML form, you need to define their routes by adding the hidden _method field to that form. Thus, the value you send with the _method field will be used as the HTTP request method, as shown below:                              \n" +
            "\n" +
            "<form action=\"/foo/bar\" method=\"POST\">\n" +
            "<input type=\"hidden\" name=\"_method\" value=\"PUT\">\n" +
            "<input type=\"hidden\" name=\"_token\" value=\"{{ csrf_token() }}\">\n" +
            "</form>\n" +
            "For generating the _method input, you need to use the @method Blade Directive, like this:\n" +
            "\n" +
            "<form action=\"/foo/bar\" method=\"POST\">\n" +
            "@method('PUT')\n" +
            "@csrf\n" +
            "</form>\n" +
            "This is called method spoofing in Laravel.";
    public static final String answer444 = "In Laravel, tinker is a powerful REPL tool used to interact with the Laravel application using the command line in an interactive shell. It comes with the release version of 5.4, extracted in a separate package.\n" +
            "\n" +
            "For installing Tinker, run the following command:\n" +
            "\n" +
            "composer require laravel/tinker\n" +
            "For executing Tinker, execute the following command:\n" +
            "\n" +
            "php artisan tinker";
    public static final String answer445 = "This method is used to update an existing record in a database if the condition is matched or created if there is no matching record. It will return the boolean value. \n" +
            "\n" +
            "You can use the following syntax:\n" +
            "\n" +
            "DB::table('blogs')->updateOrInsert([Conditions],[fields with value]);";
    public static final String answer446 = "You can stop an Artisan server in three steps, as follows:\n" +
            "\n" +
            "First, press Ctrl + Shift + ESC together. Locate the php system walking artisan and kill it with proper click -> kill process.\n" +
            "Later, reopen the command line and start the server again\n" +
            "You can kill the manner by sending a kill sign with Ctrl + C";
    public static final String answer447 = "If you want to extend the login expiration time, make the required changes to the config\\session.php file. You need to update the value of the variable “lifeline”, also you can update the variable as per your requirement.";
    public static final String answer448 = "You can use the following method to check the current route name:\n" +
            "\n" +
            "request()->route()->getName()\n" +
            "Laravel is one of the most commonly used web frameworks among all PHP web developers. There is a moderate difference between Laravel version 7 and Laravel version 8; however, the other features are still the same.";
    public static final String answer449 = "jQuery is an efficient & fast JavaScript Library created by John Resig in 2006. The motto of jQuery is – write less, do more. It is designed to simplify the client-side scripting of HTML. The main purpose of jQuery is to provide an easy way to use JavaScript on your website to make it more interactive and attractive.\n" +
            "It makes things like HTML document traversal and manipulation, event handling, animation, and Ajax much simpler with an easy-to-use API that works across a multitude of browsers.";
    public static final String answer450 = "Some of the key features of jQuery are:\n" +
            "DOM manipulation−  jQuery makes the selection of DOM elements easy, traverse them and modify their content by using cross-browser open source selector engine.\n" +
            "\n" +
            "Event handling− It provides an elegant way to capture a wide variety of events, such as a user clicking on a link, without the need to clutter the HTML code itself with event handlers.\n" +
            "\n" +
            "AJAX Support−  jQuery helps you to develop a responsive and feature-rich website with AJAX technology.\n" +
            "\n" +
            "Animations− This framework comes with plenty of built-in animation effects which you can use in your websites.\n" +
            "\n" +
            "Lightweight − It is a very lightweight library – about 19KB in size.\n" +
            "\n" +
            "Cross Browser Support−  jQuery has cross-browser support and works well in IE 6.0+, Safari 3.0+, Chrome and Opera 9.0+.";
    public static final String answer451 = "There are many advantages of using jQuery. Some of them include :\n" +
            "\n" +
            "It is like an enhanced version of JavaScript so there is no overhead in learning a new syntax.\n" +
            "\n" +
            "jQuery has the ability to keep the code simple, readable, clear and reusable.\n" +
            "\n" +
            "It has Cross-browser support.\n" +
            "\n" +
            "This would remove the requirement for writing complex loops and DOM scripting library calls.\n" +
            "\n" +
            " jQuery helps in event detection and handling.\n" +
            "\n" +
            "It provides tons of plug-ins for all kind of needs.";
    public static final String answer452 = "A jQuery Selector is a function that uses the expressions to find out matching elements from a DOM based on the given criteria. In a simple language, selectors are used to select one or more HTML elements using jQuery. Once an element is selected then we can perform various operations on that selected element.\n" +
            "\n" +
            "Selecting an element in DOM is done with the help of $() construct with a string parameter containing any CSS selector expression. $() will return zero or more DOM elements on which you can apply any effect or style.";
    public static final String answer453 = "jQuery no-conflict is an option given by jQuery to overcome the conflicts between the different javascript frameworks or libraries. When you use jQuery no-conflict mode, you replace the $ to a new variable and assign jQuery some other JavaScript libraries. Also, the $ is used as a function or variable name that jQuery has.";
    public static final String answer454 = ".empty() – This method is used to remove all the child elements from matched elements.\n" +
            "Syntax-\n" +
            "$(selector).empty();\n" +
            ".remove() – This method is used to remove all the matched element. It will remove all the jQuery data associated with the matched element.\n" +
            "Syntax-\n" +
            "$(selector).remove();\n" +
            ".detach() – This method is same as .remove() method except that the .detach() method doesn’t remove jQuery data associated with the matched elements.\n" +
            "Syntax-\n" +
            "$(selector).detach();";
    public static final String answer455 = "jQuery provides amazing effects and you can apply them quickly with a simple configuration. The effect can be either hiding, showing, toggling, fadeout, fadein, fadeto and many more. Some other methods to provide effects include the following:\n" +
            "\n" +
            "animate( params, [duration, easing, callback] ) This function makes custom animations for your HTML elements.\n" +
            "\n" +
            "fadeIn( speed, [callback] ) This function fades in all the matched elements by adjusting their opacity and firing an optional callback after completion.\n" +
            "\n" +
            "fadeOut( speed, [callback] ) This function is used to fade out all the matched elements by adjusting their opacity to 0, then setting the display to “none” and firing an optional callback after completion.\n" +
            "\n" +
            "fadeTo( speed, opacity, callback ) This function fade the opacity of all the matched elements to a specified opacity and firing an optional callback after completion.\n" +
            "\n" +
            "stop( [clearQueue, gotoEnd ]) This function stops all the currently running animations.";
    public static final String answer456 = "Ajax allows the user to exchange data with a server and update parts of a page without reloading the entire page. Some of the functions of ajax include:\n" +
            "\n" +
            "$.ajax() – This is considered to be the most low level and basic of functions. It is used to send requests. This function can be performed without a selector.\n" +
            "\n" +
            "$.ajaxSetup() – This function is used to define and set the options for various ajax calls.\n" +
            "\n" +
            "$.getJSON() – This is a special type of shorthand function which is used to accept the url to which the requests are sent. Optional data and optional callback functions are also possible in such functions.";
    public static final String answer457 = "There are two different methods in jQuery to change the width of an element. The first way is to use .css(‘width’) and other way is to use .width().\n" +
            "\n" +
            "For example-\n" +
            "\n" +
            "$('#mydiv').css('width','300px');\n" +
            "$('#mydiv').width(100);\n" +
            "The difference in .css(‘width’) and .width() is the data type of value we specify or return from both the functions. In .css(‘width’) we have to add px in the width value while in .width() we don’t have to add px.";
    public static final String answer458 = "A  jQuery connect is a plugin used to connect or bind a function with another function. Connect is used to execute a function from any other function or plugin.\n" +
            "\n" +
            "It can be used by downloading jQuery connect file from jQuery.com and then include that file in the HTML file. You have to use $.connect to connect one function to another.";
    public static final String answer459 = "jQuery .size() method gives the total number of element present in the object. But size() method is not preferred as jQuery has .length property. It does the same thing but the .length property does not have the overhead of a function call.";
    public static final String answer460 = "There are two ways to handle this issue:\n" +
            "\n" +
            "Use of event delegation – The event delegation technique works on principle by exploiting the event bubbling. It uses event bubbling to capture the events on elements which are present anywhere in the domain object model. In jQuery, the user can make use of the live and die methods for the event delegation which contains a subset of event types.\n" +
            "For example:\n" +
            "\n" +
            "$('#mydiv').click(function(e){\n" +
            "if( $(e.target).is('a') )\n" +
            "fn.call(e.target,e);\n" +
            "});\n" +
            "$('#mydiv').load('my.html')\n" +
            "Event rebinding usage – When this method is used it requires the user to call the bind method and the added new elements.\n" +
            "For example:\n" +
            "\n" +
            "$('a').click(fn);\n" +
            "$('#mydiv').load('my.html',function(){\n" +
            "$('#mydiv a').click(fn);\n" +
            "});";
    public static final String answer461 = "$(window).load is an event that fires when the DOM and other contents on the page is fully loaded. This event is fired after the ready event.\n" +
            "In most cases, the script can be executed as soon as the DOM is fully loaded. The ready() is usually the best place to write your JavaScript code. But there could be some scenario where you might need to write scripts in the load() function. For example, to get the actual width and height of an image.\n" +
            "\n" +
            "The $(window).load event is fired once the DOM and all the CSS, images and frames are fully loaded. So, it is the best place to write the jQuery code to get the actual image size or to get the details of anything that is loaded just before the load event is raised.";
    public static final String answer462 = "Content Delivery Network or Content Distribution Network(CDN) is a large distributed system of servers deployed in multiple data centers across the internet. It provides the files from servers at a higher bandwidth that leads to faster loading time. These are several companies that provide free public CDNs:\n" +
            "\n" +
            "Google\n" +
            "\n" +
            "Microsoft\n" +
            "\n" +
            "Yahoo" +
            "\n\n" +
            "Advantages of using CDN:\n" +
            "\n" +
            "It reduces the load from the server.\n" +
            "\n" +
            "CDN also saves bandwidth. jQuery framework is loaded faster from these CDN.\n" +
            "\n" +
            "If a user regularly visits a site which is using jQuery framework from any of these CDN, it will be cached.";
    public static final String answer463 = "jQuery library can be used in the ASP.Net project by downloading the latest jQuery library from jQuery.com and including the references to the jQuery library file in the HTML/PHP/JSP/Aspx page.\n" +
            "\n" +
            "For example-\n" +
            "\n" +
            "<script src=\"_scripts/jQuery-1.2.6.js\" type=\"text/javascript\"</script>\n" +
            "<script language=\"javascript\">\n" +
            "$(document).ready(function() {\n" +
            "alert('test');\n" +
            "});";
    public static final String answer464 = "The jQuery serialize() method is used to create a text string in standard URL-encoded notation. It serializes the form values so that its serialized values can be used in the URL query string while making an AJAX request.\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            "$(document).ready(function(){\n" +
            "$(\"button\").click(function(){\n" +
            "$(\"div\").text($(\"form\").serialize());\n" +
            "});\n" +
            "});";
    public static final String answer465 = "jQuery UI is a set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. jQuery UI works well for highly interactive web applications with different controls or simple pages with a date picker control.";
    public static final String answer466 = "The jQuery UI Datepicker is a highly configurable plugin that adds datepicker functionality to your pages. You can customize the date format and language, restrict the selectable date ranges and add in buttons and other navigation options easily.\n" +
            "\n" +
            "By default, the datepicker calendar opens in a small overlay when the associated text field gains focus. For an inline calendar, simply attach the datepicker to a div or span. You have to use the jQuery reference in your HTML code to make it work:\n" +
            "\n" +
            "<head>\n" +
            "<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n" +
            "<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n" +
            "<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n" +
            "</head>";
    public static final String answer467 = "The slice() method selects a subset of the matched elements by giving a range of indices. It gives the set of DOM elements on the basis of a parameter.\n" +
            "\n" +
            "Syntax:\n" +
            "\n" +
            ".slice( start, end[Optional] )\n" +
            "Start: This is the first and mandatory parameter of the slice method. This specifies from where to start to select the elements.\n" +
            "\n" +
            "End: This is an optional parameter. It specifies the range of the selection. This indicates where to stop the selection of elements, excluding end element.";
    public static final String answer468 = "Plugins are a piece of code. The jQuery plugins are a code written in a standard JavaScript file. These JavaScript files provide useful jQuery methods that can be used along with jQuery library methods." +
            "\n" +
            "Any method you use in plugins must have a semicolon (;) at the end. The method must return an object unless explicitly noted otherwise. It produces clean and compatible code that way. You have to prefix the filename with jQuery, follow that with the name of the plugin and conclude with .js.";
    public static final String answer469 = "In $.map() you need to loop over each element in an array and modify its value whilst the $.Grep() method returns the filtered array using some filter condition from an existing array. The basic structure of Map() is:\n" +
            "\n" +
            "$.map ( array, callback(elementOfArray, indexInArray) )\n" +
            "Syntax for $.Grep():\n" +
            "\n" +
            "jQuery $.grep() Method";
    public static final String answer470 = "$ has no special meaning in JavaScript. It can be used in object naming. In jQuery, it is simply used as an alias for the jQuery object and jQuery() function.\n" +
            "However, jQuery has no monopoly on use of $ which may create situations where you want to use it in conjunction with another JS library that also uses $. This would result in a naming conflict. jQuery provides the jQuery.noConflict() method for just this reason. Calling this method makes it necessary to use the underlying name jQuery instead in subsequent references to jQuery and its functions.";
    public static final String answer471 = "Method chaining is a feature of jQuery that allows several methods to be executed on a jQuery selection in sequence in a single code statement. For example, the following snippets of code are equivalent:\n" +
            "\n" +
            "Without chaining:\n" +
            "\n" +
            "$( \"button#play-movie\" ).on( \"click\", playMovie );\n" +
            "$( \"button#play-movie\" ).css( \"background-color\", \"red\" );\n" +
            "$( \"button#play-movie\" ).show();\n" +
            "With chaining:\n" +
            "\n" +
            "$( \"button#play-movie\" ).on( \"click\", playMovie )\n" +
            ".css( \"background-color\", \"red\" )\n" +
            ".show();\n" +
            "With chaining, the button only needs to be selected one time. Whereas, without chaining, jQuery must search the whole DOM and find the button before each method is applied.";
    public static final String answer472 = "The “jQuery.each()” function is a general function that will loop through a collection (object type or array type). Array-like objects with a length property are iterated by their index position and value. Other objects are iterated on their key-value properties. The “jQuery.each()” function however works differently from the $(selector).each() function that works on the DOM element using the selector. But both iterate over a jQuery object.\n" +
            "\n" +
            "If we pass an array to each function, it iterates over items in the array and accesses both the current item and its index position.\n" +
            "\n" +
            "Syntax-\n" +
            "\n" +
            "jQuery.each(collection, callback(indexInArray, valueOfElement))\n" +
            "< script type = \"text/javascript\" >\n" +
            "$(document).ready(function() {\n" +
            "var arr = [\"Mary\", \"John\", \"Garry\", \"Tina\", \"Daisy\"];\n" +
            "$.each(arr, function(index, value) {\n" +
            "alert('Position is : ' + index + ' And Value is : ' + value);\n" +
            "});\n" +
            "});\n" +
            "< /script>";
    public static final String answer473 = "jQuery.attr()- It gets the value of an attribute for the first element in the set of matched elements.\n" +
            "\n" +
            "jQuery. prop()– It gets the value of a property for the first element in the set of matched elements.\n" +
            "\n" +
            "Attributes carry additional information about an HTML element and come in name=”value” pairs. You can set an attribute for an HTML element and define it when writing the source code.\n" +
            "\n" +
            "For example-\n" +
            "\n" +
            "<input id=\"txtBox\" value=\"Jquery\" type=\"text\" readonly=\"readonly\" />\n" +
            "Here, “id”, “type” and “value” are attributes of the input elements.";
    public static final String answer474 = "Chaining is a  powerful feature of jQuery. This means specifying multiple functions and/or selectors to an element. Chaining reduces the code segment and keeps it very clean and easy to understand. Generally, chaining uses the jQuery built-in functions that make the compilation a bit faster.\n" +
            "\n" +
            "For example:\n" +
            "\n" +
            "$(document).ready(function() {\n" +
            "$(\"#div2\").html($(\"#txtBox\").prop(\"readonly\")) + '</br>';\n" +
            "$(\"#div3\").html($(\"#txtBox\").attr(\"readonly\"));\n" +
            "});";
    public static final String answer475 = "jQuery has some important features that are used in web applications such as:\n" +
            "\n" +
            "1. HTML/DOM Manipulation: JavaScript do not have any features related to the DOM, but JavaScript in the browser does include some intelligence about the DOM.\n" +
            "\n" +
            "2. Event Handling: jQuery introduced a feature called Event handling. You can write code that runs when a user clicks on a certain part of the page, or when the mouse is moved over a form element. jQuery contains many events, such as a user clicking on a button, moving a mouse over an element, etc.\n" +
            "\n" +
            "3. Ajax Support: When you select an item from a DropDownList or other control on the same page then that can cause loss of data. Ajax is used to update the part of the web page without reloading the page.\n" +
            "\n" +
            "4. Animations in jQuery: The jQuery comes with plenty of built-in animation effects that you can use in your websites. For example, animation, show, hide and so on. In jQuery, the animate() method is used to perform such tasks.";
}
