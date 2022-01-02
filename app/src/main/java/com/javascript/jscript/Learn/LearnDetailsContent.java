package com.javascript.jscript.Learn;

import com.javascript.jscript.Model.LearnDetailsModel;

import java.util.ArrayList;
import java.util.List;

public class LearnDetailsContent {
    //Fundamentals
    //introductions
    private static List<LearnDetailsModel> Introduction() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel("Hello, world!",
                "Anne wants to learn JavaScript. Before Anne started to learn JavaScript she needs to learn JavaScript fundamentals first. So, Anne started to learn JavaScript fundamentals." +
                        "\n\nDo you know about the script tag?" +
                        "\n\nJavaScript programs can be inserted almost anywhere into an HTML document using the <script> tag.\n" +
                        "You can place the <script> tags, containing your JavaScript, anywhere within your web page, but it is normally recommended that you should keep it within the <head> tags."
                , "<html>\n" +
                "   <body>   \n" +
                "      <script language = \"javascript\" type = \"text/javascript\">\n" +
                "            document.write(\"Hello World!\")\n" +
                "      </script>      \n" +
                "   </body>\n" +
                "</html>",
                "Hello World!");

        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Whitespace and Line Breaks",
                "Can I use white space or line breaks in JavaScript?\n\n" +
                        "JavaScript ignores spaces, tabs, and newlines that appear in JavaScript programs. You can use spaces, tabs, and newlines freely in your program and you are free to format and indent your programs in a neat and consistent way that makes the code easy to read and understand.",
                "",
                ""
        );

        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Case Sensitivity",
                "Did JavaScript case sensitive?\n\n" +
                        "JavaScript is a case-sensitive language. This means that the language keywords, variables, function names, and any other identifiers must always be typed with a consistent capitalization of letters.\n" +
                        "\n" +
                        "So the identifiers Time and TIME will convey different meanings in JavaScript.",
                "",
                ""
        );

        final LearnDetailsModel l4 = new LearnDetailsModel(
                "External scripts",
                "How do you use an external script?\n\n" +
                        "If we have a lot of JavaScript code, we can put it into a separate file.\n" +
                        "\n" +
                        "Script files are attached to HTML with the src attribute and To attach several scripts, use multiple tags:",
                "<script src=\"/js/script1.js\"></script>\n" +
                        "<script src=\"/js/script2.js\"></script>\n" +
                        "…",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Summary",
                "We can use a <script> tag to add JavaScript code to a page.\n" +
                        "The type and language attributes are not required.\n" +
                        "A script in an external file can be inserted with <script src=\"path/to/script.js\"></script>.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //CodeStructure
    private static List<LearnDetailsModel> CodeStructure() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Statements",
                "What are the statements?\n\n" +
                        "Statements are syntax constructs and commands that perform actions. We can have as many statements in our code as we want. Statements can be separated with a semicolon.",
                "document.write(\"Hello Anne!\");\n" +
                        "document.write(\"Hello Anne!\");",
                "Hello Anne!\nHello Anne!"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Without Semicolons",
                "Can I write a code without a semicolon?\n\n" +
                        "Yes!, A semicolon may be omitted in most cases when a line break exists. This would also work but best practice is always use semicolon.",
                "document.write(\"Hello Anne!\")\n" +
                        "document.write(\"Hello Anne!\")",
                "Hello Anne!\nHello Anne!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Single Line Comment",
                "How I use comments in my code?\n\n" +
                        "As time goes on, programs become more and more complex. It becomes necessary to add comments which describe what the code does and why. " +
                        "\nOne-line comments start with two forward slash characters //.",
                "// This comment occupies a line of its own\n" +
                        "document.write(\"Hello Anne!\");\n" +
                        "\n" +
                        "document.write(\"Hello Anne!\"); // This comment follows the statement",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Multiline Comments",
                "Multiline comments start with a forward slash and an asterisk /* and end with an asterisk and a forward slash */. Like this:",
                "/* An example with two messages.\n" +
                        "This is a multiline comment.\n" +
                        "*/\n" +
                        "document.write(\"Hello Anne!\");\n" +
                        "document.write(\"Hello Anne!\");",
                ""
        );

        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Summery",
                "Did comments are compulsory for JavaScript?\n\n" +
                        "No, but best practice are always use comments and don't hesitate.\n\n" +
                        "Comments increase the overall code footprint, but that’s not a problem at all. " +
                        "There are many tools which minify code before publishing to a production server. " +
                        "They remove comments, so they don’t appear in the working scripts. Therefore, " +
                        "comments do not have negative effects on production at all.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //useStrict
    private static List<LearnDetailsModel> useStrict() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "“use strict”",
                "What is “use strict”?\n\n" +
                        "For a long time, JavaScript didn't have to worry about backward compatibility. Why? Because feature releases never overlapped — until it did.\n" +
                        "In 2009, ECMAScript 5 (ES5) was released and new features modified some of the existing ones. By default, modifications are not applied unless you enable it using \"use strict\"" +
                        "\n\"use strict\" must be placed at the top of your JavaScript code or else it won’t get applied.\n" +
                        "Nowadays, always \"use strict\" because we don’t want to use the older implementations of JavaScript.",
                "\"use strict\";\n" +
                        "\n" +
                        "// this code works the modern way\n" +
                        "...",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Browser console",
                "When you use a developer console to run code, please note that it doesn't use strict by default." +
                        "So, how to actually use strict in the console?\n" +
                        "\n" +
                        "First, you can try to press Shift+Enter to input multiple lines, and put use strict on top, like this:",
                "'use strict'; <Shift+Enter for a newline>\n" +
                        "//  ...your code\n" +
                        "<Enter to run>",
                ""
        );

        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Should we use “use strict”?",
                "The question may sound obvious, but it’s not so.\n" +
                        "\n" +
                        "One could recommend to start scripts with \"use strict\"… But you know what’s cool?\n" +
                        "\n" +
                        "Modern JavaScript supports “classes” and “modules” – advanced language structures (we’ll surely get to them), that enable use strict automatically. So we don’t need to add the \"use strict\" directive, if we use them.\n" +
                        "\n" +
                        "So, for now \"use strict\"; is a welcome guest at the top of your scripts. Later, when your code is all in classes and modules, you may omit it.\n" +
                        "\n" +
                        "As of now, we’ve got to know about use strict in general.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //Variables
    private static List<LearnDetailsModel> Variables() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Variables",
                "Why variables are more important?\n\n" +
                        "Variables are placeholders for information. Think of it is a memory container that holds your data. It's the most important part of programming." +
                        "\nThere are 3 ways to declare a JavaScript variable:\n" +
                        "\n" +
                        "Using var\n" +
                        "Using let\n" +
                        "Using const\n" +
                        "This chapter uses let.\n" +
                        "\n" +
                        "The var and const keywords are explained in the next chapters.",
                "let user = 'John';\n" +
                        "let age = 25;\n" +
                        "let message = 'Hello';",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "A real-life analogy",
                "Variable has a cycle.\n\n" +
                        "We can easily grasp the concept of a “variable” if we imagine it as a “box” for data, with a uniquely-named sticker on it.\n" +
                        "\n" +
                        "For instance, the variable message can be imagined as a box labeled \"message\" with the value \"Hello!\" in it and\n" +
                        "We can put any value in the box. We can also change it as many times as we want and remember \n" +
                        "When the value is changed, the old data is removed from the variable.",
                "let message;" +
                        "\n" +
                        "message = 'Hello!';" +
                        "\n" +
                        "message = 'Anne!';" +
                        "\n\n" +
                        "document.write(message);" +
                        "\n\n" +
                        "let hello = 'Hello Anne!';" +
                        "\n" +
                        "let message;" +
                        "\n" +
                        "message = hello;" +
                        "\n\n" +
                        "document.write(hello);\n" +
                        "document.write(message);",
                "Anne!\n" +
                        "Hello Anne!" +
                        "\nHello Anne!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Variable naming",
                "There are two limitations on variable names in JavaScript:\n" +
                        "\n" +
                        "The name must contain only letters, digits, or the symbols $ and _.\n" +
                        "The first character must not be a digit.\n" +
                        "Examples of valid names:",
                "let userName;\n" +
                        "let test123;",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Constants",
                "To declare a constant (unchanging) variable, use const instead of let:",
                "const myBirthday = '18.04.1982';",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Uppercase constants",
                "What is an uppercase constants?\n\n" +
                        "There is a widespread practice to use constants as aliases for difficult-to-remember values that are known prior to execution.\n" +
                        "\n" +
                        "Such constants are named using capital letters and underscores.\n" +
                        "\n" +
                        "For instance, let’s make constants for colors in so-called “web” (hexadecimal) format:",
                "const COLOR_RED = \"#F00\";\n" +
                        "const COLOR_GREEN = \"#0F0\";\n" +
                        "const COLOR_BLUE = \"#00F\";\n" +
                        "const COLOR_ORANGE = \"#FF7F00\";\n" +
                        "\n" +
                        "let color = COLOR_ORANGE;\n" +
                        "alert(color);",
                "#FF7F00"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Summery",
                "Name things right.\n\n" +
                        "Talking about variables, there’s one more extremely important thing.\n" +
                        "\n" +
                        "A variable name should have a clean, obvious meaning, describing the data that it stores.\n" +
                        "\n" +
                        "Variable naming is one of the most important and complex skills in programming. A quick glance at variable " +
                        "names can reveal which code was written by a beginner versus an experienced developer." +
                        "Some good-to-follow rules are:\n\n" +
                        "1. Use human-readable names like userName or shoppingCart.\n\n" +
                        "2. Stay away from abbreviations or short names like a, b, c, unless you really know what you’re doing.\n\n" +
                        "3. Make names maximally descriptive and concise. Examples of bad names are data and value. Such names say nothing. " +
                        "It’s only okay to use them if the context of the code makes it exceptionally obvious which data or " +
                        "value the variable is referencing.\n\n" +
                        "4. Agree on terms within your team and in your own mind. If a site visitor is called a “user” then we " +
                        "should name related variables currentUser or newUser instead of currentVisitor or newManInCity.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }
    //Data types
    private static List<LearnDetailsModel> DataTypes() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Data types",
                "What are data types?\n\n" +
                        "A data type, in programming, is a classification that specifies which type of value a " +
                        "variable has and what type of mathematical, relational, or logical operations can be applied to it without causing an error.\n\n" +
                        "\nThere are eight basic data types in JavaScript. Here, we’ll cover them in general and in the next " +
                        "chapters we’ll talk about each of them in detail." +
                        "\nWe can put any type in a variable. For example, a variable can at one moment be a string and then store a number:" +
                        "" +
                        "",

                        "let message = \"hello\";\n" +
                        "message = 123456;",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Number",
                "No “quote marks” for numbers.The number type represents both integer and floating point numbers.\n" +
                        "\n" +
                        "There are many operations for numbers, e.g. multiplication *, division /, addition +, subtraction -, and so on." +
                        "\nThere’s also a special infinity number available. You just need to do 1/0 — so, one divided zero. This value is deemed to be the biggest number of all time and can not be viewed as the smaller outcome." +
                        "\nIf you get NaN — it means that you’ve hit a computational error. It also means that you’re trying to do a mathematical operation on something that doesn't make sense like dividing a string text with a number.",

                        "let n = 123;\n" +
                        "n = 12.345;\n" +
                        "\n" +
                        "document.write(1/0);\n" +
                        "\n" +
                        "document.write(\"not a number\"/4);",
                "Infinity" +
                        "\nNaN"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "BigInt",
                "In JavaScript, the “number” type cannot represent integer values larger than 16 digits or (253-1) (that’s 9007199254740991), " +
                        "or less than -(253-1) for negatives. It’s a technical limitation caused by their internal representation." +
                        "\nFor most purposes that’s quite enough, but sometimes we need really big numbers, e.g. for cryptography or microsecond-precision timestamps." +
                        "BigInt type was recently added to the language to represent integers of arbitrary length.\n" +
                        "\n" +
                        "A BigInt value is created by appending n to the end of an integer:" +
                        "",
                "// the \"n\" at the end means it's a BigInt\n" +
                        "const bigInt = 1234567890123456789012345678901234567890n;",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "String",
                "A string in JavaScript must be surrounded by quotes." +
                        "In JavaScript, there are 3 types of quotes.\n" +
                        "\n" +
                        "Double quotes: \"Hello\".\n" +
                        "Single quotes: 'Hello'.\n" +
                        "Backticks: `Hello`.\n" +
                        "\n" +
                        "Double and single quotes are “simple” quotes. There’s practically no difference between them in JavaScript.\n" +
                        "\n" +
                        "Backticks are “extended functionality” quotes. They allow us to embed variables and expressions " +
                        "into a string by wrapping them in ${…}, for example:\n" +
                        "\n",
                "let str = \"Hello\";\n" +
                        "let str2 = 'Single quotes are ok too';\n" +
                        "// embed a variable\n" +
                        "let phrase = `can embed another ${str}`;",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Boolean",
                "The boolean type has only two values: true and false.\n" +
                        "\n" +
                        "This type is commonly used to store yes/no values: true means “yes, correct”, and false means “no, incorrect”." +
                        "We’ll cover booleans more deeply in the chapter Logical operators.",
                "let emailFieldCheck = true; // yes, email field is checked\n" +
                        "let passwordFieldChecked = false; // no, password field is not checked",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "null value",
                "The special null(nothing) value does not belong to any of the types described above.\n" +
                        "\n" +
                        "It forms a separate type of its own which contains only the null(nothing) value." +
                        "In JavaScript, null is not a “reference to a non-existing object” or a “null pointer” like in some other languages." +
                        "It’s just a special value which represents “nothing”, “empty” or “value unknown”.",
                "let age = null;",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "undefined value",
                "The special value undefined also stands apart. It makes a type of its own, just like null.\n" +
                        "\n" +
                        "The meaning of undefined is “value is not assigned”.\n" +
                        "\n" +
                        "If a variable is declared, but not assigned, then its value is undefined:",
                "let age;\n" +
                        "\n" +
                        "document.write(age);",
                "undefined"
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "Objects and Symbols",
                "The object type is special.\n" +
                        "\n" +
                        "All other types are called “primitive” because their values can contain only a single thing " +
                        "(be it a string or a number or whatever). In contrast, objects are used to store collections of data and more complex entities.\n" +
                        "\n" +
                        "Being that important, objects deserve a special treatment. We’ll deal with them later in the chapter Objects, " +
                        "after we learn more about primitives.\n" +
                        "\n" +
                        "The symbol type is used to create unique identifiers for objects. We have to mention it here for the sake of completeness, " +
                        "but also postpone the details till we know objects.",
                "",
                ""
        );
        final LearnDetailsModel l9 = new LearnDetailsModel(
                "The typeof operator",
                "The typeof operator returns the type of the argument. It’s useful when we want to process values of different " +
                        "types differently or just want to do a quick check.\n" +
                        "\n" +
                        "A call to typeof x returns a string with the type name:",
                "typeof undefined // \"undefined\"\n" +
                        "\n" +
                        "typeof 0 // \"number\"\n" +
                        "\n" +
                        "typeof 10n // \"bigint\"\n" +
                        "\n" +
                        "typeof true // \"boolean\"\n" +
                        "\n" +
                        "typeof \"foo\" // \"string\"\n" +
                        "\n" +
                        "typeof Symbol(\"id\") // \"symbol\"\n" +
                        "\n" +
                        "typeof Math // \"object\"  (1)\n" +
                        "\n" +
                        "typeof null // \"object\"  (2)\n" +
                        "\n" +
                        "typeof alert // \"function\"  (3)",
                ""
        );
        final LearnDetailsModel l10 = new LearnDetailsModel(
                "Summary",
                "There are 8 basic data types in JavaScript.\n" +
                        "\n" +
                        "1.number: for numbers of any kind: integer or floating-point, integers are limited by ±(253-1).\n" +
                        "2.bigint: is for integer numbers of arbitrary length.\n" +
                        "3.string: for strings. A string may have zero or more characters, there’s no separate single-character type.\n" +
                        "4.boolean: for true/false.\n" +
                        "5.null: for unknown values – a standalone type that has a single value null.\n" +
                        "6.undefined: for unassigned values – a standalone type that has a single value undefined.\n" +
                        "7.object: for more complex data structures.\n" +
                        "8.symbol: for unique identifiers.\n" +
                        "The typeof operator allows us to see which type is stored in a variable.\n" +
                        "\n" +
                        "Usually used as typeof x, but typeof(x) is also possible.\n" +
                        "Returns a string with the name of the type, like \"string\".\n" +
                        "For null returns \"object\" – this is an error in the language, it’s not actually an object.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        list.add(l9);
        list.add(l10);

        return list;
    }
    //Interaction
    private static List<LearnDetailsModel> Interaction() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "alert",
                "What is JavaScript alert?\n\n" +
                        "It shows a message and waits for the user to press “OK”." +
                        "\nThe mini-window with the message is called a modal window. The word “modal” means that the visitor can’t" +
                        "interact with the rest of the page, press other buttons, etc, until they have dealt with the window. " +
                        "In this case – until they press “OK”.",
                "alert(\"Hello\");",
                "Hello"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "prompt",
                "How I use prompt?\n\n" +
                        "The function prompt accepts two arguments." +
                        "\n" +
                        "The visitor can type something in the prompt input field and press OK. Then we get that text in the result. Or they can cancel the input by pressing Cancel or hitting the Esc key, then we get null as the result.\n" +
                        "\n" +
                        "The call to prompt returns the text from the input field or null if the input was canceled.\n" +
                        "\n" +
                        "For instance:",
                "let age = prompt('Anne, How old are you?', 21);\n" +
                        "\n" +
                        "document.write(`You are ${age} years old!`);",
                "You are 21 years old!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "confirm",
                "The function confirm shows a modal window with a question and two buttons: OK and Cancel.\n" +
                        "\n" +
                        "The result is true if OK is pressed and false otherwise.\n" +
                        "\n" +
                        "For example:",
                "let isStudent = confirm(\"Are you a Student?\");\n" +
                        "\n" +
                        "document.write( isStudent ); // true if OK is pressed",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Summary",
                "We covered 3 browser-specific functions to interact with visitors:\n" +
                        "\n" +
                        "alert\n" +
                        "shows a message.\n" +
                        "prompt\n" +
                        "shows a message asking the user to input text. It returns the text or, if Cancel button or Esc is clicked, null.\n" +
                        "confirm\n" +
                        "shows a message and waits for the user to press “OK” or “Cancel”. It returns true for OK and false for Cancel/Esc.\n" +
                        "All these methods are modal: they pause script execution and don’t allow the visitor to interact with the rest of the page until the window has been dismissed.\n" +
                        "\n" +
                        "There are two limitations shared by all the methods above:\n" +
                        "\n" +
                        "The exact location of the modal window is determined by the browser. Usually, it’s in the center.\n" +
                        "The exact look of the window also depends on the browser. We can’t modify it.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //TypeConversion
    private static List<LearnDetailsModel> TypeConversion() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Type Conversions",
                "Why we need type conversion?\n\n" +
                        "Sometimes, you need to switch between the different types for whatever reason. There are many reason to convert one type to another type." +
                        "Please take note that converting random text into numbers doesn't work, and it doesn't make any sense, in general, to do so. You’ll end up with NaN",
                "let isBoxOpen = true;\n" +
                        "isBoxOpen = String(isBoxOpen);\n" +
                        "\n" +
                        "//using String() will convert your variable into a string\n" +
                        "let myIdNumber = \"181000602\";\n" +
                        "\n" +
                        "myIdNumber = Number(myIdNumber);\n" +
                        "//using Number() will convert your string into a number",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "String Conversion",
                "String conversion happens when we need the string form of a value. " +
                        "If you want to convert a number to a string use string conversion." +
                        "\nWe can also call the String(value) function to convert a value to a string:",
                "let value = true;\n" +
                        "document.write(typeof value);\n" +
                        "\n" +
                        "value = String(value);\n" +
                        "document.write(typeof value);",
                "boolean\nstring"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Numeric Conversion",
                "Numeric conversion happens in mathematical functions and expressions automatically." +
                        "\nWe can use the Number(value) function to explicitly convert a value to a number:" +
                        "",
                "let str = \"123\";\n" +
                        "document.write(typeof str);\n" +
                        "\n" +
                        "let num = Number(str);\n" +
                        "\n" +
                        "document.write(typeof num);",
                "string\nnumber"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Boolean Conversion",
                "Boolean conversion is the simplest one.\n" +
                        "\n" +
                        "It happens in logical operations (later we’ll meet condition tests and other similar things) but can also be performed explicitly with a call to Boolean(value).\n" +
                        "\n" +
                        "The conversion rule:\n" +
                        "\n" +
                        "Values that are intuitively “empty”, like 0, an empty string, null, undefined, and NaN, become false.\n" +
                        "Other values become true.\n" +
                        "For instance:",
                "document.write( Boolean(1) );\n" +
                        "document.write( Boolean(0) );\n" +
                        "\n" +
                        "document.write( Boolean(\"hello\") );\n" +
                        "document.write( Boolean(\"\") );",
                "true\n" +
                        "false\n" +
                        "true\n" +
                        "false"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Summary",
                "The three most widely used type conversions are to string, to number, and to boolean.\n" +
                        "\n" +
                        "String Conversion – Occurs when we output something. Can be performed with String(value). " +
                        "The conversion to string is usually obvious for primitive values.\n" +
                        "\n" +
                        "Numeric Conversion – Occurs in math operations. Can be performed with Number(value)." +
                        "\n" +
                        "Boolean Conversion – Occurs in logical operations. Can be performed with Boolean(value).",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //Operators
    private static List<LearnDetailsModel> Operators() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Operators",
                "What are operators and how we use in JavaScript?\n\n" +
                        "We know many operators from school. They are things like addition +, multiplication *, subtraction -, division /, and so on." +
                        "\n" +
                        "In this chapter, we’ll start with simple operators, then concentrate on JavaScript-specific aspects, " +
                        "not covered by school arithmetic." +
                        "\n\nTerms: “unary”, “binary”, “operand”\n" +
                        "Before we move on, let’s grasp some common terminology." +
                        "\n" +
                        "An operand – is what operators are applied to. For instance, in the multiplication of 5 * 2 there are two operands: " +
                        "the left operand is 5 and the right operand is 2. Sometimes, people call these “arguments” instead of “operands”." +
                        "\n" +
                        "An operator is unary if it has a single operand. For example, the unary negation - reverses the sign of a number." +
                        "\n" +
                        "An operator is binary if it has two operands. The same minus exists in binary form as well" +
                        "\n" +
                        "Formally, in the examples we have two different operators that share the same symbol: the negation operator, " +
                        "a unary operator that reverses the sign, and the subtraction operator, a binary operator that subtracts one number from another.",
                "let x = 1;\n" +
                        "\n" +
                        "x = -x;\n" +
                        "document.write( x );" +
                        "\n" +
                        "let x = 1, y = 3;\n" +
                        "document.write( y - x );",
                "-1\n" +
                        "2"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Maths",
                "The following math operations are supported:\n" +
                        "\n" +
                        "1. Addition +,\n" +
                        "2. Subtraction -,\n" +
                        "3. Multiplication *,\n" +
                        "4. Division /,\n" +
                        "5. Remainder %,\n" +
                        "6. Exponentiation **.\n" +
                        "\nThe first four are straightforward, while % and ** need a few words about them.\n" +
                        "\n" +
                        "Remainder %\n" +
                        "The remainder operator %, despite its appearance, is not related to percents.\n" +
                        "\n" +
                        "The result of a % b is the remainder of the integer division of a by b." +
                        "\n\n" +
                        "Exponentiation **\n" +
                        "The exponentiation operator a ** b raises a to the power of b.\n" +
                        "\n" +
                        "In school maths, we write that as a^b.",

                        "document.write( 5 % 2 );\n" +
                        "document.write( 8 % 3 );\n" +
                        "document.write( 2 ** 2 );\n" +
                        "document.write( 2 ** 3 );\n" +
                        "document.write( 2 ** 4 );",

                        "1\n" +
                        "2\n" +
                        "4\n" +
                        "8\n" +
                        "16"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Operator precedence",
                "What is operator precedence?\n\n" +
                        "If an expression has more than one operator, the execution order is defined by their precedence, or, " +
                        "in other words, the default priority order of operators." +
                        "\n\n" +
                        "From school, we all know that the multiplication in the expression 1 + 2 * 2 should be calculated before the addition. That’s exactly the precedence thing. The multiplication is said to have a higher precedence than the addition." +
                        "\n\n" +
                        "Parentheses override any precedence, so if we’re not satisfied with the default order, we can use them to change it. For example, write (1 + 2) * 2." +
                        "\n\n" +
                        "There are many operators in JavaScript. Every operator has a corresponding precedence number. The one with the larger number executes first. If the precedence is the same, the execution order is from left to right." +
                        "\n\n" +
                        "Here’s an extract from the precedence table (you don’t need to remember this, but note that unary operators are higher than corresponding binary ones):",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Bitwise operators",
                "Bitwise operators treat arguments as 32-bit integer numbers and work on the level of their binary representation.\n" +
                        "\n" +
                        "These operators are not JavaScript-specific. They are supported in most programming languages.\n" +
                        "\n" +
                        "The list of operators:\n" +
                        "\n" +
                        "AND ( & )\n" +
                        "OR ( | )\n" +
                        "XOR ( ^ )\n" +
                        "NOT ( ~ )\n" +
                        "LEFT SHIFT ( << )\n" +
                        "RIGHT SHIFT ( >> )\n" +
                        "ZERO-FILL RIGHT SHIFT ( >>> )\n\n" +
                        "These operators are used very rarely, when we need to fiddle with numbers on the very lowest (bitwise) level. We won’t need these operators any time soon, as web development has little use of them, but in some special areas, such as cryptography, they are useful. You can read the Bitwise Operators chapter on MDN when a need arises.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Comma",
                "The comma operator , is one of the rarest and most unusual operators. Sometimes, it’s used to write shorter code, so we need to know it in order to understand what’s going on.\n" +
                        "\n" +
                        "The comma operator allows us to evaluate several expressions, dividing them with a comma ,. Each of them is evaluated but only the result of the last one is returned.\n" +
                        "\n" +
                        "For example:" +
                        "\n" +
                        "Here, the first expression 1 + 2 is evaluated and its result is thrown away. Then, 3 + 4 is evaluated and returned as the result.",
                "let a = (1 + 2, 3 + 4);\n" +
                        "\n" +
                        "document.write( a );",
                "7"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //Comparisons
    private static List<LearnDetailsModel> Comparisons() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Comparisons",
                "What are Comparisons?\n\n" +
                        "Comparison operators are used in logical statements to determine equality or difference between variables or values.\n" +
                        "We know many comparison operators from maths.\n" +
                        "\n" +
                        "In JavaScript they are written like this:\n" +
                        "\n" +
                        "Greater/less than: a > b, a < b.\n" +
                        "Greater/less than or equals: a >= b, a <= b.\n" +
                        "Equals: a == b, please note the double equality sign == means the equality test, while a single one a = b means an assignment.\n" +
                        "Not equals: In maths the notation is ≠, but in JavaScript it’s written as a != b.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Boolean",
                "All comparison operators return a boolean value. Boolean is the result:" +
                        "\n" +
                        "true – means “yes”, “correct” or “the truth”.\n" +
                        "false – means “no”, “wrong” or “not the truth”.",
                "document.write( 2 > 1 );\n" +
                        "document.write( 2 == 1 );\n" +
                        "document.write( 2 != 1 );",
                "true\nfalse\ntrue"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "String",
                "To see whether a string is greater than another, JavaScript uses the so-called “dictionary” or “lexicographical” order.\n" +
                        "\n" +
                        "In other words, strings are compared letter-by-letter." +
                        "\n" +
                        "The algorithm to compare two strings is simple:\n" +
                        "\n" +
                        "Compare the first character of both strings.\n" +
                        "If the first character from the first string is greater (or less) than the other string’s, then the first string is greater (or less) than the second. We’re done.\n" +
                        "Otherwise, if both strings’ first characters are the same, compare the second characters the same way.\n" +
                        "Repeat until the end of either string.\n" +
                        "If both strings end at the same length, then they are equal. Otherwise, the longer string is greater.\n" +
                        "In the first example bellow, the comparison 'Z' > 'A' gets to a result at the first step.\n" +
                        "\n" +
                        "The second comparison 'Glow' and 'Glee' needs more steps as strings are compared character-by-character:\n" +
                        "\n" +
                        "G is the same as G.\n" +
                        "l is the same as l.\n" +
                        "o is greater than e. Stop here. The first string is greater.",
                "document.write( 'Z' > 'A' );\n" +
                        "document.write( 'Glow' > 'Glee' );\n" +
                        "document.write( 'Bee' > 'Be' );",
                "true\ntrue\ntrue"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Comparison with null and undefined",
                "There’s a non-intuitive behavior when null or undefined are compared to other values.\n" +
                        "\n" +
                        "For a strict equality check ===\n" +
                        "These values are different, because each of them is a different type." +
                        "\n\n" +
                        "For a non-strict check ==\n" +
                        "There’s a special rule. These two are a “sweet couple”: they equal each other (in the sense of ==), but not any other value." +
                        "\n\n" +
                        "For maths and other comparisons < > <= >=\n" +
                        "null/undefined are converted to numbers: null becomes 0, while undefined becomes NaN.",

                        "document.write( null === undefined );" +
                        "\n" +
                        "document.write( null == undefined );",

                        "false\n" +
                                "true"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Avoid problems",
                "Why did we go over these examples? Should we remember these peculiarities all the time? Well, not really. Actually, these tricky things will gradually become familiar over time, but there’s a solid way to avoid problems with them:\n" +
                        "\n" +
                        "Treat any comparison with undefined/null except the strict equality === with exceptional care.\n" +
                        "Don’t use comparisons >= > < <= with a variable which may be null/undefined, unless you’re really sure of what you’re doing. If a variable can have these values, check for them separately.",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Summary",
                "Comparison operators return a boolean value.\n" +
                        "Strings are compared letter-by-letter in the “dictionary” order.\n" +
                        "When values of different types are compared, they get converted to numbers (with the exclusion of a strict equality check).\n" +
                        "The values null and undefined equal == each other and do not equal any other value.\n" +
                        "Be careful when using comparisons like > or < with variables that can occasionally be null/undefined. Checking for null/undefined separately is a good idea.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }
    //Conditionals
    private static List<LearnDetailsModel> Conditionals() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Conditionals",
                "Conditional statements are used to perform different actions based on different conditions.\n" +
                        "The condition always returns a boolean as the final result. So you can have mathematical comparisons, checks and anything else you want in there, as long as it evaluates to a boolean." +
                        "\n" +
                        "Conditional Statements" +
                        "\n\n" +
                        "Very often when you write code, you want to perform different actions for different decisions.\n" +
                        "\n" +
                        "You can use conditional statements in your code to do this.\n" +
                        "\n" +
                        "In JavaScript we have the following conditional statements:\n" +
                        "\n" +
                        "Use if to specify a block of code to be executed, if a specified condition is true\n" +
                        "Use else to specify a block of code to be executed, if the same condition is false\n" +
                        "Use else if to specify a new condition to test, if the first condition is false\n" +
                        "Use switch to specify many alternative blocks of code to be executed",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The “if” statement",
                "The if(...) statement evaluates a condition in parentheses and, if the result is true, executes a block of code." +
                        "\n" +
                        "If we want to execute more than one statement, we have to wrap our code block inside curly braces." +
                        "\n" +
                        "We recommend wrapping your code block with curly braces {} every time you use an if statement, even if there is only one statement to execute. Doing so improves readability.",
                "if (year == 2021) {\n" +
                        " document.write( \"That's correct! \" );\n" +
                        " document.write( \"You're so smart!\" );\n" +
                        "}",
                "That's correct! You're so smart!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The “else” clause",
                "The if statement may contain an optional “else” block. It executes when the condition is false.",
                "let year = prompt('Anne, In which year were you born?', '2000');\n" +
                        "\n" +
                        "if (year == 2000) {\n" +
                        "  document.write( 'You guessed it right!' );\n" +
                        "} else {\n" +
                        "  document.write( 'How can you be so wrong?' );\n" +
                        "}",
                "You guessed it right!"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Several conditions: “else if”",
                "Sometimes, we’d like to test several variants of a condition. The else if clause lets us do that. If first condition is false execute 2nd and so on.",
                "let year = prompt('Anne, In which year were you born?', '1998');\n" +
                        "\n" +
                        "if (year < 2000) {\n" +
                        "  document.write( 'Too early...' );\n" +
                        "} else if (year > 2000) {\n" +
                        "  document.write( 'Too late' );\n" +
                        "} else {\n" +
                        "  document.write( 'Exactly!' );\n" +
                        "}",
                "Too early..."
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "“switch” Statement",
                "The switch statement is used to perform different actions based on different conditions." +
                        "\n" +
                        "Use the switch statement to select one of many code blocks to be executed." +
                        "\n" +
                        "This is how it works:\n" +
                        "\n" +
                        "The switch expression is evaluated once.\n" +
                        "The value of the expression is compared with the values of each case.\n" +
                        "If there is a match, the associated block of code is executed.\n" +
                        "If there is no match, the default code block is executed.",
                "let guessNumber = prompt('Anne, Please guess a number between 1-10?', '10');;\n" +
                        "switch(guessNumber) {\n" +
                        "  case 4:\n" +
                        "    document.write( 'You guess 4.' );\n" +
                        "    break;\n" +
                        "  case 10:\n" +
                        "    document.write( 'You guess 10.' );\n" +
                        "    break;\n" +
                        "  default:\n" +
                        "    document.write( 'You guess a wrong number.' );\n" +
                        "}",
                "You guess 10."
        );


        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //Loops
    private static List<LearnDetailsModel> Loops(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Loops",
                "The JavaScript loops are used to iterate the piece of code using for, while, do while or for-in loops. " +
                        "It makes the code compact. It is mostly used in array.\n" +
                        "\n" +
                        "There are four types of loops in JavaScript.\n" +
                        "\n" +
                        "1. for loop\n" +
                        "2. while loop\n" +
                        "3. do-while loop\n" +
                        "4. for-in loop",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "For Loop",
                "Loops are handy, if you want to run the same code over and over again, each time with a different value." +
                        "The for loop is more complex, but it’s also the most commonly used loop." +
                        "\n" +
                        "Let’s learn the meaning of these parts by example. The loop below runs document.write(i) for i from 0 up to (but not including) 3:",
                "for (let i = 0; i < 3; i++) {\n" +
                        "   document.write(i);\n" +
                        "}",
                "012"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "While Loop",
                "Loops can execute a block of code as long as a specified condition is true." +
                        "The while loop loops through a block of code as long as a specified condition is true." +
                        "While the condition is truthy, the code from the loop body is executed.\n" +
                        "\n" +
                        "For instance, the loop below outputs i while i < 3:",
                "let i = 0;\n" +
                        "while (i < 3) {\n" +
                        "  document.write( i );\n" +
                        "  i++;\n" +
                        "}",
                "012"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The “do…while” loop",
                "The do while loop is a variant of the while loop. This loop will execute the code block once, " +
                        "before checking if the condition is true, then it will repeat the loop as long as the condition is true.",
                "let i = 0;\n" +
                        "do {\n" +
                        "  document.write( i );\n" +
                        "  i++;\n" +
                        "} while (i < 3);",
                "012"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The for in Loop",
                "The JavaScript for in statement loops through the properties of an Object.",
                "const person = {firstName:\"Anne\", lastName:\"Moore\", age:21}; \n" +
                        "let txt = \"\";\n" +
                        "for (let x in person) {\n" +
                        "  txt += person[x] + \" \";\n" +
                        "}" +
                        "\n" +
                        "document.write(txt);",
                "Anne Moore 21"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //Functions
    private static List<LearnDetailsModel> Functions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Functions",
                "Quite often we need to perform a similar action in many places of the script.\n" +
                        "\n" +
                        "For example, we need to show a nice-looking message when a visitor logs in, logs out and maybe somewhere else.\n" +
                        "\n" +
                        "Functions are the main “building blocks” of the program. They allow the code to be called many times without repetition.\n" +
                        "\n" +
                        "We’ve already seen examples of built-in functions, like alert(message), prompt(message, default) and confirm(question). " +
                        "But we can create functions of our own as well." +
                        "\n\n" +
                        "To create a function we can use a function declaration.\n" +
                        "\n" +
                        "It looks like this:" +
                        "\n" +
                        "The function keyword goes first, then goes the name of the function, then a list of parameters between the parentheses " +
                        "(comma-separated, empty in the example above, we’ll see examples later) and finally the code of the function, also named " +
                        "“the function body”, between curly braces.\n" +
                        "\n",
                "function showMessage() {\n" +
                        "  document.write( 'Hello everyone!' );\n" +
                        "}\n" +
                        "\n" +
                        "showMessage();\n" +
                        "showMessage();",
                "Hello everyone!\n" +
                        "Hello everyone!"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Naming a function",
                "Functions are actions. So their name is usually a verb. It should be brief, as accurate as possible and describe what the function does, so that someone reading the code gets an indication of what the function does.\n" +
                        "\n" +
                        "It is a widespread practice to start a function with a verbal prefix which vaguely describes the action. There must be an agreement within the team on the meaning of the prefixes.\n" +
                        "\n" +
                        "For instance, functions that start with \"show\" usually show something.\n" +
                        "\n" +
                        "Function starting with…\n" +
                        "\n" +
                        "\"get…\" – return a value,\n" +
                        "\"calc…\" – calculate something,\n" +
                        "\"create…\" – create something,\n" +
                        "\"check…\" – check something and return a boolean, etc.\n" +
                        "Examples of such names:\n" +
                        "\n",
                "showMessage(..)  // shows a message\n" +
                        "getAge(..)  // returns the age (gets it somehow)\n" +
                        "calcSum(..)  // calculates a sum and returns the result\n" +
                        "createForm(..)  // creates a form (and usually returns it)\n" +
                        "checkPermission(..)  // checks a permission, returns true/false",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Summary",
                "To make the code clean and easy to understand, it’s recommended to use mainly local variables and parameters in the function, not outer variables." +
                        "\n" +
                        "Values passed to a function as parameters are copied to its local variables.\n" +
                        "A function may access outer variables. But it works only from inside out. The code outside of the function doesn’t see its local variables.\n" +
                        "A function can return a value. If it doesn’t, then its result is undefined." +
                        "\n" +
                        "It is always easier to understand a function which gets parameters, works with them and returns a result than a function which gets no parameters, but modifies outer variables as a side-effect.\n" +
                        "\n" +
                        "Function naming:\n" +
                        "\n" +
                        "A name should clearly describe what the function does. When we see a function call in the code, a good name instantly gives us an understanding what it does and returns.\n" +
                        "A function is an action, so function names are usually verbal.\n" +
                        "There exist many well-known function prefixes like create…, show…, get…, check… and so on. Use them to hint what a function does.\n" +
                        "Functions are the main building blocks of scripts. Now we’ve covered the basics, so we actually can start creating and " +
                        "using them. But that’s only the beginning of the path. We are going to return to them many times, going more deeply " +
                        "into their advanced features.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Arrow functions
    private static List<LearnDetailsModel> ArrowFunctions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Arrow functions, the basics",
                "There’s another very simple and concise syntax for creating functions, that’s often better than Function Expressions." +
                        "\n\n" +
                        "This creates a function func that accepts arguments arg1..argN, then evaluates the expression on the right " +
                        "side with their use and returns its result." +
                        "It’s called “arrow functions”, because it looks like this:",
                "let func = (arg1, arg2, ..., argN) => expression;",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Multiline arrow functions",
                "The examples previous took arguments from the left of => and evaluated the right-side expression with them.\n" +
                        "\n" +
                        "Sometimes we need something a little bit more complex, like multiple expressions or statements. " +
                        "It is also possible, but we should enclose them in curly braces. Then use a normal return within them.\n" +
                        "\n" +
                        "Like this:" +
                        "\n" +
                        "Note:  // if we use curly braces, then we need an explicit \"return\"",
                "let sum = (a, b) => {\n" +
                        "  let result = a + b;\n" +
                        "  return result;\n" +
                        "};\n" +
                        "\n" +
                        "document.write( sum(1, 2) );",
                "3"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Summary",
                "Anne, finished the fundamental and now she started to learn JavaScript Basic.\n\n" +
                        "Arrow functions are handy for one-liners. They come in two flavors:\n" +
                        "\n" +
                        "1. Without curly braces: (...args) => expression – the right side is an expression: the function evaluates it and returns the result.\n\n" +
                        "2. With curly braces: (...args) => { body } – brackets allow us to write multiple statements inside the function, but we need an explicit return to return something.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Basics
    //Introduction
    private static List<LearnDetailsModel> BasicIntroduction(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Learn JScript Tutorial",
                "Anne, started to learn basic of JavaScript.\n\n" +
                        "Our JScript tutorial is designed for beginners and professionals both." +
                        "JavaScript is used to create client-side dynamic pages." +
                        "JavaScript is an object-based scripting language which is lightweight and cross-platform." +
                        "JavaScript is not a compiled language, but it is a translated language. The JavaScript Translator (embedded in the browser) " +
                        "is responsible for translating the JavaScript code for the web browser.\n" +
                        "\n" +
                        "It is complimentary to and integrated with Java. JavaScript is very easy to implement because it is integrated with HTML." +
                        "\n" +
                        "It turns static HTML web pages into interactive web pages by dynamically updating content, validating form data, " +
                        "controlling multimedia, animate images, and almost everything else on the web pages." +
                        "\n\n" +
                        "These tutorials will help you learn JavaScript step by step starting from the basics to an advanced level. " +
                        "These tutorials are broken down into sections where each section contains a number of related topics that are packed with " +
                        "easy to understand explanations, real-world examples, tips, notes and useful references.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "What is JavaScript?",
                "JavaScript (js) is a lightweight object-oriented programming language that is used by several websites for scripting the webpages. " +
                        "It is an interpreted, full-fledged programming language that enables dynamic interactivity on websites when applied to an " +
                        "HTML document. It was introduced in the year 1995 for adding programs to the webpages in the Netscape Navigator browser. " +
                        "Since then, it has been adopted by all other graphical web browsers. With JavaScript, users can build modern web applications " +
                        "to interact directly without reloading the page every time. The traditional website uses js to provide several forms of " +
                        "interactivity and simplicity." +
                        "\n\n" +
                        "Although, JavaScript has no connectivity with the Java programming language. The name was suggested and provided in the times " +
                        "when Java was gaining popularity in the market. In addition to web browsers, databases such as CouchDB and MongoDB uses " +
                        "JavaScript as their scripting and query language." +
                        "\n\n" +
                        "JavaScript is the third most important web technology after HTML and CSS. JavaScript can be used to create " +
                        "web and mobile applications, build web servers, create games, etc." +
                        "\n\n" +
                        "JavaScript was first known as LiveScript, but Netscape changed its name to JavaScript, possibly because of " +
                        "the excitement being generated by Java. JavaScript made its first appearance in Netscape 2.0 in 1995 with the name LiveScript. " +
                        "The general-purpose core of the language has been embedded in Netscape, Internet Explorer, and other web browsers.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Why to Learn Javascript?",
                "Javascript is a MUST for students and working professionals to become a great Software Engineer specially when they are " +
                        "working in Web Development Domain. I will list down some of the key advantages of learning Javascript:" +
                        "\n\n" +
                        "1. Javascript is the most popular programming language in the world and that makes it a programmer’s great choice. Once you learnt Javascript, " +
                        "it helps you developing great front-end as well as back-end software using different Javascript based frameworks like jQuery, Node.JS etc." +
                        "\n\n" +
                        "2. Javascript is everywhere, it comes installed on every modern web browser and so to learn Javascript you really do not need any special environment setup. For example Chrome, Mozilla Firefox , Safari and every browser you know as of today, supports Javascript." +
                        "\n\n" +
                        "3. Javascript helps you create really beautiful and crazy fast websites. You can develop your website with a console like look and feel and give your users the best Graphical User Experience." +
                        "\n\n" +
                        "4. JavaScript usage has now extended to mobile app development, desktop app development, and game development. This opens many opportunities for you as Javascript Programmer." +
                        "\n\n" +
                        "5. Due to high demand, there is tons of job growth and high pay for those who know JavaScript. You can navigate over to different job sites to see what having JavaScript skills looks like in the job market." +
                        "\n\n" +
                        "6. Great thing about Javascript is that you will find tons of frameworks and Libraries already developed which can be used directly in your software development to reduce your time to market.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Applications of Javascript Programming",
                "As mentioned before, Javascript is one of the most widely used programming languages (Front-end as well as Back-end). " +
                        "It has it's presence in almost every area of software development. I'm going to list few of them here:" +
                        "\n\n" +
                        "1. Client side validation - This is really important to verify any user input before submitting it to the server and Javascript plays an important role in validating those inputs at front-end itself." +
                        "\n\n" +
                        "2. Manipulating HTML Pages - Javascript helps in manipulating HTML page on the fly. This helps in adding and deleting any HTML tag very easily using javascript and modify your HTML to change its look and feel based on different devices and requirements." +
                        "\n\n" +
                        "3. User Notifications - You can use Javascript to raise dynamic pop-ups on the webpages to give different types of notifications to your website visitors." +
                        "\n\n" +
                        "4. Back-end Data Loading - Javascript provides Ajax library which helps in loading back-end data while you are doing some other processing. This really gives an amazing experience to your website visitors." +
                        "\n\n" +
                        "5. Presentations - JavaScript also provides the facility of creating presentations which gives website look and feel. JavaScript provides RevealJS and BespokeJS libraries to build a web-based slide presentations." +
                        "\n\n" +
                        "6. Server Applications - Node JS is built on Chrome's Javascript runtime for building fast and scalable network applications. This is an event based library which helps in developing very sophisticated server applications including Web Servers." +
                        "\n\n" +
                        "This list goes on, there are various areas where millions of software developers are happily using Javascript to develop great websites and others software.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Advantages of JavaScript",
                "The merits of using JavaScript are −" +
                        "\n\n" +
                        "1. Less server interaction − You can validate user input before sending the page off to the server. This saves server traffic, which means less load on your server." +
                        "\n\n" +
                        "2. Immediate feedback to the visitors − They don't have to wait for a page reload to see if they have forgotten to enter something." +
                        "\n\n" +
                        "3. Increased interactivity − You can create interfaces that react when the user hovers over them with a mouse or activates them via the keyboard." +
                        "\n\n" +
                        "4. Richer interfaces − You can use JavaScript to include such items as drag-and-drop components and sliders to give a Rich Interface to your site visitors." +
                        "\n\n" +
                        "Limitations of JavaScript" +
                        "\n\n" +
                        "We cannot treat JavaScript as a full-fledged programming language. It lacks the following important features −" +
                        "\n\n" +
                        "1. Client-side JavaScript does not allow the reading or writing of files. This has been kept for security reason." +
                        "\n\n" +
                        "2. JavaScript cannot be used for networking applications because there is no such support available." +
                        "\n\n" +
                        "3. JavaScript doesn't have any multi-threading or multiprocessor capabilities." +
                        "\n\n" +
                        "Once again, JavaScript is a lightweight, interpreted programming language that allows you to build interactivity into otherwise static HTML pages.",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Where is JavaScript Today ?",
                "The ECMAScript Edition 5 standard will be the first update to be released in over four years. JavaScript 2.0 conforms to Edition 5 of the ECMAScript standard, and the difference between the two is extremely minor.\n" +
                        "\n" +
                        "The specification for JavaScript 2.0 can be found on the following site: http://www.ecmascript.org/\n" +
                        "\n" +
                        "Today, Netscape's JavaScript and Microsoft's JScript conform to the ECMAScript standard, although both the languages still support the features that are not a part of the standard.",
                "",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Audience",
                "This tutorial has been prepared for JavaScript beginners and professionals to help them understand the basic and advanced functionality of JavaScript to build dynamic web pages and web applications.",
                "",
                ""
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "Prerequisites",
                "For this Javascript tutorial, it is assumed that the reader have a prior knowledge of HTML coding. It would help if the reader had some prior exposure to object-oriented programming concepts and a general idea on creating online applications.",
                "",
                ""
        );


        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        return list;
    }
    //Syntax
    private static List<LearnDetailsModel> Syntax(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Syntax",
                "JavaScript syntax is the set of rules, how JavaScript programs are constructed." +
                        "\n\n" +
                        "JavaScript Values:" +
                        "\n\n" +
                        "The JavaScript syntax defines two types of values:\n" +
                        "\n" +
                        "Fixed values\n" +
                        "Variable values\n" +
                        "Fixed values are called Literals.\n" +
                        "\n" +
                        "Variable values are called Variables.",

                        "var x;\n" +
                        "let y;\n" +
                        "\n" +
                        "x = 4;\n" +
                        "y = 6;\n\n" +
                        "let z = x + y;\n" +
                        "document.write(z);",
                "10"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript Literals",
                "The two most important syntax rules for fixed values are:\n" +
                        "\n" +
                        "1. Numbers are written with or without decimals" +
                        "\n" +
                        "2. Strings are text, written within double or single quotes",

                        "\n" +
                        "var x = 10.5\n" +
                        "var y = 1024\n\n" +
                        "var firstName = \"Anne\"\n" +
                        "var lastName = 'Moore'\n\n" +
                        "document.write(x + y);\n" +
                        "document.write(lastName);",
                "1034.5\n" +
                        "Moore"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript Variables",
                "In a programming language, variables are used to store data values.\n" +
                        "\n" +
                        "JavaScript uses the keywords var, let and const to declare variables.\n" +
                        "\n" +
                        "An equal sign is used to assign values to variables.\n" +
                        "\n" +
                        "In this example, x is defined as a variable. Then, x is assigned (given) the value 10",
                "var x;\n" +
                        "x = 10;\n\n" +
                        "document.write(x);",
                "10"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //Enabling
    private static List<LearnDetailsModel> Enabling(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Enabling JavaScript in Browsers",
                "All the modern browsers come with built-in support for JavaScript. Frequently, you may need to enable or disable " +
                        "this support manually. This chapter explains the procedure of enabling and disabling JavaScript support in your " +
                        "browsers: Internet Explorer, Firefox, chrome, and Opera.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript in Internet Explorer",
                "Here are simple steps to turn on or turn off JavaScript in your Internet Explorer −\n" +
                        "\n" +
                        "Follow Tools → Internet Options from the menu.\n" +
                        "\n" +
                        "Select Security tab from the dialog box.\n" +
                        "\n" +
                        "Click the Custom Level button.\n" +
                        "\n" +
                        "Scroll down till you find Scripting option.\n" +
                        "\n" +
                        "Select Enable radio button under Active scripting.\n" +
                        "\n" +
                        "Finally click OK and come out\n" +
                        "\n" +
                        "To disable JavaScript support in your Internet Explorer, you need to select Disable radio button under Active scripting.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript in Firefox",
                "Here are the steps to turn on or turn off JavaScript in Firefox −\n" +
                        "\n" +
                        "Open a new tab → type about: config in the address bar.\n" +
                        "\n" +
                        "Then you will find the warning dialog. Select I’ll be careful, I promise!\n" +
                        "\n" +
                        "Then you will find the list of configure options in the browser.\n" +
                        "\n" +
                        "In the search bar, type javascript.enabled.\n" +
                        "\n" +
                        "There you will find the option to enable or disable javascript by right-clicking on the value of that option → select toggle.\n" +
                        "\n" +
                        "If javascript.enabled is true; it converts to false upon clicking toogle. If javascript is disabled; it gets enabled upon clicking toggle.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "JavaScript in Chrome",
                "Here are the steps to turn on or turn off JavaScript in Chrome −\n" +
                        "\n" +
                        "Click the Chrome menu at the top right hand corner of your browser.\n" +
                        "\n" +
                        "Select Settings.\n" +
                        "\n" +
                        "Click Show advanced settings at the end of the page.\n" +
                        "\n" +
                        "Under the Privacy section, click the Content settings button.\n" +
                        "\n" +
                        "In the \"Javascript\" section, select \"Do not allow any site to run JavaScript\" or \"Allow all sites to run JavaScript (recommended)\".",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "JavaScript in Opera",
                "Here are the steps to turn on or turn off JavaScript in Opera −\n" +
                        "\n" +
                        "Follow Tools → Preferences from the menu.\n" +
                        "\n" +
                        "Select Advanced option from the dialog box.\n" +
                        "\n" +
                        "Select Content from the listed items.\n" +
                        "\n" +
                        "Select Enable JavaScript checkbox.\n" +
                        "\n" +
                        "Finally click OK and come out.\n" +
                        "\n" +
                        "To disable JavaScript support in your Opera, you should not select the Enable JavaScript checkbox.",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Warning for Non-JavaScript Browsers",
                "If you have to do something important using JavaScript, then you can display a warning message to the user using <noscript> tags.\n" +
                        "\n" +
                        "You can add a noscript block immediately after the script block as follows −" +
                        "\n\n" +
                        "Now, if the user's browser does not support JavaScript or JavaScript is not enabled, then the message from </noscript> will be displayed on the screen.",
                "<html>\n" +
                        "   <body>\n" +
                        "      <script language = \"javascript\" type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            document.write(\"Hello World!\")\n" +
                        "         //-->\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <noscript>\n" +
                        "         Sorry...JavaScript is needed to go ahead.\n" +
                        "      </noscript>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        return list;
    }
    //Placement
    private static List<LearnDetailsModel> Placement(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript - Placement in HTML File",
                "There is a flexibility given to include JavaScript code anywhere in an HTML document. However the most preferred ways to include JavaScript in an HTML file are as follows −\n" +
                        "\n" +
                        "Script in <head>...</head> section.\n" +
                        "\n" +
                        "Script in <body>...</body> section.\n" +
                        "\n" +
                        "Script in <body>...</body> and <head>...</head> sections.\n" +
                        "\n" +
                        "Script in an external file and then include in <head>...</head> section.\n" +
                        "\n" +
                        "In the following section, we will see how we can place JavaScript in an HTML file in different ways.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript in <head>...</head> section",
                "If you want to have a script run on some event, such as when a user clicks somewhere, then you will place that script in the head as follows −",
                "<html>\n" +
                        "   <head>      \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "            function sayHello() {\n" +
                        "               document.write(\"Hello World!\")\n" +
                        "            }\n" +
                        "      </script>     \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <input type = \"button\" onclick = \"sayHello()\" value = \"Say Hello\" />\n" +
                        "   </body>  \n" +
                        "</html>",
                "Hello World!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript in <body>...</body> section",
                "If you need a script to run as the page loads so that the script generates content in the page, then the script goes in the <body> portion of the document. In this case, you would not have any function defined using JavaScript. Take a look at the following code.",
                "<html>\n" +
                        "   <head>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <script type = \"text/javascript\">\n" +
                        "            document.write(\"Hello World\")\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <p>This is web page body </p>\n" +
                        "   </body>\n" +
                        "</html>",
                "Hello World\n" +
                        "This is web page body"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "JavaScript in <body> and <head> Sections",
                "You can put your JavaScript code in <head> and <body> section altogether as follows −",
                "<html>\n" +
                        "   <head>\n" +
                        "      <script type = \"text/javascript\">\n" +
                        "            function sayHello() {\n" +
                        "               alert(\"Hello World\")\n" +
                        "            }\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <script type = \"text/javascript\">\n" +
                        "            document.write(\"Hello World\")\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <input type = \"button\" onclick = \"sayHello()\" value = \"Say Hello\" />\n" +
                        "   </body>\n" +
                        "</html>",
                "Hello World\n" +
                        "Hello World"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "JavaScript in External File",
                "As you begin to work more extensively with JavaScript, you will be likely to find that there are cases where you are reusing identical JavaScript code on multiple pages of a site.\n" +
                        "\n" +
                        "You are not restricted to be maintaining identical code in multiple HTML files. The script tag provides a mechanism to allow you to store JavaScript in an external file and then include it into your HTML files.\n" +
                        "\n" +
                        "Here is an example to show how you can include an external JavaScript file in your HTML code using script tag and its src attribute.",
                "<html>\n" +
                        "   <head>\n" +
                        "      <script type = \"text/javascript\" src = \"filename.js\" ></script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      .......\n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //BasicVariables
    private static List<LearnDetailsModel> BasicVariables(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Variable",
                "A JavaScript variable is simply a name of storage location. Where stored the data." +
                        "\n\n" +
                        "Before you use a variable in a JavaScript program, you must declare it. Variables are declared with the var,let and const keyword as follows." +
                        "3 Ways to Declare a JavaScript Variable:" +
                        "\n\n" +
                        "1. Using var\n" +
                        "2. Using let\n" +
                        "3. Using const\n",
                "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      var x;\n" +
                        "      let y;\n" +
                        "      const RED_COLOR;" +
                        "   //-->\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript Variable Scope",
                "The scope of a variable is the region of your program in which it is defined. JavaScript variables have only two scopes.\n" +
                        "\n" +
                        "Global Variables − A global variable has global scope which means it can be defined anywhere in your JavaScript code.\n" +
                        "\n" +
                        "Local Variables − A local variable will be visible only within a function where it is defined. Function parameters are always local to that function.\n" +
                        "\n" +
                        "Within the body of a function, a local variable takes precedence over a global variable with the same name. " +
                        "If you declare a local variable or function parameter with the same name as a global variable, you effectively hide the global variable. " +
                        "Take a look into the following example." +
                        "",
                "<html>\n" +
                        "   <body onload = checkScope();>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "            var myVar = \"global\";\n" +
                        "            function checkScope( ) {\n" +
                        "               var myVar = \"local\";\n" +
                        "               document.write(myVar);\n" +
                        "            }\n" +
                        "      </script>     \n" +
                        "   </body>\n" +
                        "</html>",
                "local"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript Variable Names",
                "While naming your variables in JavaScript, keep the following rules in mind.\n" +
                        "\n" +
                        "You should not use any of the JavaScript reserved keywords as a variable name. These keywords are mentioned in the next section. For example, break or boolean variable names are not valid.\n" +
                        "\n" +
                        "JavaScript variable names should not start with a numeral (0-9). They must begin with a letter or an underscore character. For example, 123test is an invalid variable name but _123test is a valid one.\n" +
                        "\n" +
                        "JavaScript variable names are case-sensitive. For example, Name and name are two different variables.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //Basic Data Types
    private static List<LearnDetailsModel> BasicDataTypes(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Javascript Data Types",
                "JavaScript provides different data types to hold different types of values. There are two types of data types in JavaScript.\n" +
                        "\n" +
                        "Primitive data type\n" +
                        "Non-primitive (reference) data type\n" +
                        "JavaScript is a dynamic type language, means you don't need to specify type of the variable because it " +
                        "is dynamically used by JavaScript engine. You need to use var here to specify the data type. " +
                        "It can hold any type of values such as numbers, strings etc." +
                        "\n\n" +
                        "For example:",
                "var a=24;//holding number  \n" +
                        "var b=\"Anne\";//holding string  ",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript primitive data types",
                "There are seven types of primitive data types in JavaScript. They are as follows:" +
                        "\n\n" +
                        "1. string " +
                        "\n//represents sequence of characters e.g. \"hello\"\n" +
                        "2. number " +
                        "\n//represents numeric values e.g. 1024\n" +
                        "3. boolean " +
                        "\n//represents boolean value either false or true\n" +
                        "4. bigint " +
                        "\n//represents a larger value e.g. 1254364594582312546987155n\n" +
                        "5. symbols " +
                        "\n//The symbol type is used to create unique identifiers for objects.\n" +
                        "6. null " +
                        "\n//represents null i.e. no value at all\n" +
                        "7. undefined " +
                        "\n//represents undefined value\n",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript non-primitive data types",
                "The non-primitive data types are as follows:" +
                        "\n\n" +
                        "1. Objects" +
                        "\n" +
                        "2. Array" +
                        "\n" +
                        "3. RegExp" +
                        "\n\n" +
                        "We will have great discussion on each data type later.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Basic Operators
    private static List<LearnDetailsModel> BasicOperators(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is an Operator?",
                "JavaScript operators are symbols that are used to perform operations on operands." +
                        "\n" +
                        "Let us take a simple expression 10 + 4 is equal to 14. Here 10 and 4 are called operands and ‘+’ is called the operator." +
                        "\n" +
                        "There are following types of operators in JavaScript.\n" +
                        "\n" +
                        "Arithmetic Operators\n" +
                        "Comparison (Relational) Operators\n" +
                        "Bitwise Operators\n" +
                        "Logical Operators\n" +
                        "Assignment Operators\n" +
                        "Special Operators",
                "var sum=10+4; ",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Arithmetic Operators",
                "Arithmetic operators are used to perform arithmetic operations on the operands. The following operators are known as JavaScript arithmetic operators." +
                        "Assume variable A holds 30 and variable B holds 10, then" +
                        "\n\n" +
                        "1. + (Addition)" +
                        "\n" +
                        "Adds two operands\n" +
                        "\n" +
                        "Ex: A + B will give 40" +
                        "\n\n" +
                        "2. - (Subtraction)" +
                        "\n" +
                        "Subtracts the second operand from the first\n" +
                        "\n" +
                        "Ex: A - B will give 20" +
                        "\n\n" +
                        "3. * (Multiplication)" +
                        "\n" +
                        "Multiply both operands\n" +
                        "\n" +
                        "Ex: A * B will give 300" +
                        "\n\n" +
                        "4. / (Division)" +
                        "\n" +
                        "Divide the numerator by the denominator\n" +
                        "\n" +
                        "Ex: A / B will give 3" +
                        "\n\n" +
                        "5. % (Modulus)" +
                        "\n" +
                        "Outputs the remainder of an integer division\n" +
                        "\n" +
                        "Ex: A % B will give 0" +
                        "\n\n" +
                        "6. ++ (Increment)" +
                        "\n" +
                        "Increases an integer value by one\n" +
                        "\n" +
                        "Ex: A++ will give 31" +
                        "\n\n" +
                        "7. -- (Decrement)" +
                        "\n" +
                        "Decreases an integer value by one\n" +
                        "\n" +
                        "Ex: B-- will give 9",
                "var a = 40;\n" +
                        "var b = 10;\n" +
                        "var c = \"Test\";\n" +
                        "var linebreak = \"<br />\";\n" +
                        "\n" +
                        "document.write(\"a + b = \");\n" +
                        "result = a + b;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"a - b = \");\n" +
                        "result = a - b;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"a / b = \");\n" +
                        "result = a / b;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"a % b = \");\n" +
                        "result = a % b;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"a + b + c = \");\n" +
                        "result = a + b + c;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "a = ++a;\n" +
                        "document.write(\"++a = \");\n" +
                        "result = ++a;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "b = --b;\n" +
                        "document.write(\"--b = \");\n" +
                        "result = --b;\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);",
                "a + b = 50\n" +
                        "a - b = 30\n" +
                        "a / b = 4\n" +
                        "a % b = 0\n" +
                        "a + b + c = 50Test\n" +
                        "++a = 42\n" +
                        "--b = 8"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Comparison Operators",
                "The JavaScript comparison operator compares the two operands. The comparison operators are as follows:" +
                        "\n" +
                        "Assume variable A holds 10 and variable B holds 20, then −" +
                        "\n\n" +
                        "1. = = (Equal)" +
                        "\n" +
                        "Checks if the value of two operands are equal or not, if yes, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A == B) is not true." +
                        "\n\n" +
                        "2. != (Not Equal)" +
                        "\n" +
                        "Checks if the value of two operands are equal or not, if the values are not equal, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A != B) is true." +
                        "\n\n" +
                        "3. > (Greater than)" +
                        "\n" +
                        "Checks if the value of the left operand is greater than the value of the right operand, if yes, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A > B) is not true." +
                        "\n\n" +
                        "4. < (Less than)" +
                        "\n" +
                        "Checks if the value of the left operand is less than the value of the right operand, if yes, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A < B) is true." +
                        "\n\n" +
                        "5. >= (Greater than or Equal to)" +
                        "\n" +
                        "Checks if the value of the left operand is greater than or equal to the value of the right operand, if yes, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A >= B) is not true." +
                        "\n\n" +
                        "6. <= (Less than or Equal to)" +
                        "\n" +
                        "Checks if the value of the left operand is less than or equal to the value of the right operand, if yes, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A <= B) is true.",
                "var a = 10;\n" +
                        "var b = 20;\n" +
                        "var linebreak = \"<br />\";\n" +
                        "\n" +
                        "document.write(\"(a == b) => \");\n" +
                        "result = (a == b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a < b) => \");\n" +
                        "result = (a < b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a > b) => \");\n" +
                        "result = (a > b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a != b) => \");\n" +
                        "result = (a != b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a >= b) => \");\n" +
                        "result = (a >= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a <= b) => \");\n" +
                        "result = (a <= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);",
                "(a == b) => false \n" +
                        "(a < b) => true \n" +
                        "(a > b) => false \n" +
                        "(a != b) => true \n" +
                        "(a >= b) => false \n" +
                        "a <= b) => true"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Bitwise Operators",
                "The bitwise operators perform bitwise operations on operands. The bitwise operators are as follows:" +
                        "\n" +
                        "Assume variable A holds 2 and variable B holds 3, then −" +
                        "\n\n" +
                        "1. & (Bitwise AND)" +
                        "\n" +
                        "It performs a Boolean AND operation on each bit of its integer arguments.\n" +
                        "\n" +
                        "Ex: (A & B) is 2." +
                        "\n\n" +
                        "2. | (BitWise OR)" +
                        "\n" +
                        "It performs a Boolean OR operation on each bit of its integer arguments.\n" +
                        "\n" +
                        "Ex: (A | B) is 3." +
                        "\n\n" +
                        "3. ^ (Bitwise XOR)" +
                        "\n" +
                        "It performs a Boolean exclusive OR operation on each bit of its integer arguments. Exclusive OR means that either operand one is true or operand two is true, but not both.\n" +
                        "\n" +
                        "Ex: (A ^ B) is 1." +
                        "\n\n" +
                        "4. ~ (Bitwise Not)" +
                        "\n" +
                        "It is a unary operator and operates by reversing all the bits in the operand.\n" +
                        "\n" +
                        "Ex: (~B) is -4." +
                        "\n\n" +
                        "5. << (Left Shift)" +
                        "\n" +
                        "It moves all the bits in its first operand to the left by the number of places specified in the second operand. New bits are filled with zeros. Shifting a value left by one position is equivalent to multiplying it by 2, shifting two positions is equivalent to multiplying by 4, and so on.\n" +
                        "\n" +
                        "Ex: (A << 1) is 4." +
                        "\n\n" +
                        "6. >> (Right Shift)" +
                        "\n" +
                        "Binary Right Shift Operator. The left operand’s value is moved right by the number of bits specified by the right operand.\n" +
                        "\n" +
                        "Ex: (A >> 1) is 1." +
                        "\n\n" +
                        "7. >>> (Right shift with Zero)" +
                        "\n" +
                        "This operator is just like the >> operator, except that the bits shifted in on the left are always zero.\n" +
                        "\n" +
                        "Ex: (A >>> 1) is 1.",
                "var a = 2; // Bit presentation 10\n" +
                        "var b = 3; // Bit presentation 11\n" +
                        "var linebreak = \"<br />\";\n" +
                        "\n" +
                        "document.write(\"(a & b) => \");\n" +
                        "result = (a & b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a | b) => \");\n" +
                        "result = (a | b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a ^ b) => \");\n" +
                        "result = (a ^ b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(~b) => \");\n" +
                        "result = (~b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a << b) => \");\n" +
                        "result = (a << b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a >> b) => \");\n" +
                        "result = (a >> b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);",
                "(a & b) => 2 \n" +
                        "(a | b) => 3 \n" +
                        "(a ^ b) => 1 \n" +
                        "(~b) => -4 \n" +
                        "(a << b) => 16 \n" +
                        "(a >> b) => 0"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Logical Operators",
                "JavaScript supports the following logical operators −\n" +
                        "\n" +
                        "Assume variable A holds 10 and variable B holds 20, then −" +
                        "\n\n" +
                        "1. && (Logical AND)" +
                        "\n" +
                        "If both the operands are non-zero, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A && B) is true." +
                        "\n\n" +
                        "2. || (Logical OR)" +
                        "\n" +
                        "If any of the two operands are non-zero, then the condition becomes true.\n" +
                        "\n" +
                        "Ex: (A || B) is true." +
                        "\n\n" +
                        "3. ! (Logical NOT)" +
                        "\n" +
                        "Reverses the logical state of its operand. If a condition is true, then the Logical NOT operator will make it false.\n" +
                        "\n" +
                        "Ex: ! (A && B) is false.",
                "var a = true;\n" +
                        "var b = false;\n" +
                        "var linebreak = \"<br />\";\n" +
                        "\n" +
                        "document.write(\"(a && b) => \");\n" +
                        "result = (a && b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"(a || b) => \");\n" +
                        "result = (a || b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"!(a && b) => \");\n" +
                        "result = (!(a && b));\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);",
                "(a && b) => false \n" +
                        "(a || b) => true \n" +
                        "!(a && b) => true"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Assignment Operators",
                "JavaScript supports the following assignment operators:" +
                        "\n\n" +
                        "1. = (Simple Assignment )" +
                        "\n" +
                        "Assigns values from the right side operand to the left side operand\n" +
                        "\n" +
                        "Ex: C = A + B will assign the value of A + B into C" +
                        "\n\n" +
                        "2. += (Add and Assignment)" +
                        "\n" +
                        "It adds the right operand to the left operand and assigns the result to the left operand.\n" +
                        "\n" +
                        "Ex: C += A is equivalent to C = C + A" +
                        "\n\n" +
                        "3. −= (Subtract and Assignment)" +
                        "\n" +
                        "It subtracts the right operand from the left operand and assigns the result to the left operand.\n" +
                        "\n" +
                        "Ex: C -= A is equivalent to C = C - A" +
                        "\n\n" +
                        "4. *= (Multiply and Assignment)" +
                        "\n" +
                        "It multiplies the right operand with the left operand and assigns the result to the left operand.\n" +
                        "\n" +
                        "Ex: C *= A is equivalent to C = C * A" +
                        "\n\n" +
                        "5. /= (Divide and Assignment)" +
                        "\n" +
                        "It divides the left operand with the right operand and assigns the result to the left operand.\n" +
                        "\n" +
                        "Ex: C /= A is equivalent to C = C / A" +
                        "\n\n" +
                        "6. %= (Modules and Assignment)" +
                        "\n" +
                        "It takes modulus using two operands and assigns the result to the left operand.\n" +
                        "\n" +
                        "Ex: C %= A is equivalent to C = C % A",
                "var a = 33;\n" +
                        "var b = 10;\n" +
                        "var linebreak = \"<br />\";\n" +
                        "\n" +
                        "document.write(\"Value of a => (a = b) => \");\n" +
                        "result = (a = b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"Value of a => (a += b) => \");\n" +
                        "result = (a += b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"Value of a => (a -= b) => \");\n" +
                        "result = (a -= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"Value of a => (a *= b) => \");\n" +
                        "result = (a *= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"Value of a => (a /= b) => \");\n" +
                        "result = (a /= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);\n" +
                        "\n" +
                        "document.write(\"Value of a => (a %= b) => \");\n" +
                        "result = (a %= b);\n" +
                        "document.write(result);\n" +
                        "document.write(linebreak);",
                "Value of a => (a = b) => 10\n" +
                        "Value of a => (a += b) => 20 \n" +
                        "Value of a => (a -= b) => 10 \n" +
                        "Value of a => (a *= b) => 100 \n" +
                        "Value of a => (a /= b) => 10\n" +
                        "Value of a => (a %= b) => 0"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }
    //Basic Conditions
    private static List<LearnDetailsModel> BasicConditions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Basic Conditions",
                "Conditional statements are used to perform different actions based on different conditions.\n" +
                        "The condition always returns a boolean as the final result. So you can have mathematical comparisons, checks and anything else you want in there, as long as it evaluates to a boolean." +
                        "\n" +
                        "Conditional Statements" +
                        "\n\n" +
                        "Very often when you write code, you want to perform different actions for different decisions.\n" +
                        "\n" +
                        "You can use conditional statements in your code to do this.\n" +
                        "\n" +
                        "In JavaScript we have the following conditional statements:\n" +
                        "\n" +
                        "Use if to specify a block of code to be executed, if a specified condition is true\n" +
                        "Use else to specify a block of code to be executed, if the same condition is false\n" +
                        "Use else if to specify a new condition to test, if the first condition is false",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The “if” statement",
                "The if(...) statement evaluates a condition in parentheses and, if the result is true, executes a block of code." +
                        "\n" +
                        "If we want to execute more than one statement, we have to wrap our code block inside curly braces." +
                        "\n" +
                        "We recommend wrapping your code block with curly braces {} every time you use an if statement, even if there is only one statement to execute. Doing so improves readability.",
                "if (year == 2021) {\n" +
                        " document.write( \"That's correct! \" );\n" +
                        " document.write( \"You're so smart!\" );\n" +
                        "}",
                "That's correct! You're so smart!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The “else” clause",
                "The if statement may contain an optional “else” block. It executes when the condition is false.",
                "let year = prompt('Anne, In which year were you born?', '2000');\n" +
                        "\n" +
                        "if (year == 2000) {\n" +
                        "  document.write( 'You guessed it right!' );\n" +
                        "} else {\n" +
                        "  document.write( 'How can you be so wrong?' );\n" +
                        "}",
                "You guessed it right!"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Several conditions: “else if”",
                "Sometimes, we’d like to test several variants of a condition. The else if clause lets us do that. If first condition is false execute 2nd and so on.",
                "let year = prompt('Anne, In which year were you born?', '1998');\n" +
                        "\n" +
                        "if (year < 2000) {\n" +
                        "  document.write( 'Too early...' );\n" +
                        "} else if (year > 2000) {\n" +
                        "  document.write( 'Too late' );\n" +
                        "} else {\n" +
                        "  document.write( 'Exactly!' );\n" +
                        "}",
                "Too early..."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //Switch
    private static List<LearnDetailsModel> Switch(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Switch Case",
                "You can use multiple if...else…if statements, as in the previous chapter, to perform a multiway branch. However, this is not always the best solution, especially when all of the branches depend on the value of a single variable.\n" +
                        "\n" +
                        "Starting with JavaScript 1.2, you can use a switch statement which handles exactly this situation, and it does so more efficiently than repeated if...else if statements." +
                        "\n\n" +
                        "Syntax:" +
                        "\n\n" +
                        "The objective of a switch statement is to give an expression to evaluate and several different statements to execute based on the value of the expression. The interpreter checks each case against the value of the expression until a match is found. If nothing matches, a default condition will be used." +
                        "\n\n" +
                        "switch (expression) {\n" +
                        "   case condition 1: statement(s)\n" +
                        "   break;\n" +
                        "   \n" +
                        "   case condition 2: statement(s)\n" +
                        "   break;\n" +
                        "   ...\n" +
                        "   \n" +
                        "   case condition n: statement(s)\n" +
                        "   break;\n" +
                        "   \n" +
                        "   default: statement(s)\n" +
                        "}",
                "switch(expression){  \n" +
                        "case value1:  \n" +
                        " code to be executed;  \n" +
                        " break;  \n" +
                        "case value2:  \n" +
                        " code to be executed;  \n" +
                        " break;  \n" +
                        "......  \n" +
                        "  \n" +
                        "default:   \n" +
                        " code to be executed if above values are not matched;  \n" +
                        "}  ",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Syntax",
                "The objective of a switch statement is to give an expression to evaluate and several different statements to execute based on the " +
                        "value of the expression. The interpreter checks each case against the value of the expression until a match is found. " +
                        "If nothing matches, a default condition will be used." +
                        "\n\n" +
                        "The break statements indicate the end of a particular case. If they were omitted, the interpreter would continue executing each statement in each of the following cases.\n" +
                        "\n" +
                        "We will explain break statement in Loop Control chapter." +
                        "\n\n" +
                        "switch (expression) {\n" +
                        "   case condition 1: statement(s)\n" +
                        "   break;\n" +
                        "   \n" +
                        "   case condition 2: statement(s)\n" +
                        "   break;\n" +
                        "   ...\n" +
                        "   \n" +
                        "   case condition n: statement(s)\n" +
                        "   break;\n" +
                        "   \n" +
                        "   default: statement(s)\n" +
                        "}",
                "var grade = 'A';\n" +
                        "document.write(\"Entering switch block<br />\");\n" +
                        "switch (grade) {\n" +
                        "case 'A': document.write(\"Good job<br />\");\n" +
                        "break;\n" +
                        "\n" +
                        "case 'B': document.write(\"Pretty good<br />\");\n" +
                        "break;\n" +
                        "\n" +
                        "case 'C': document.write(\"Passed<br />\");\n" +
                        "break;\n" +
                        "\n" +
                        "case 'D': document.write(\"Not so good<br />\");\n" +
                        "break;\n" +
                        "\n" +
                        "case 'F': document.write(\"Failed<br />\");\n" +
                        "break;\n" +
                        "\n" +
                        "default:  document.write(\"Unknown grade<br />\")\n" +
                        "}\n" +
                        "document.write(\"Exiting switch block\");",
                "Entering switch block\n" +
                        "Good job\n" +
                        "Exiting switch block"
        );

        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Without break",
                "Break statements play a major role in switch-case statements. Try the following code that uses switch-case statement without any break statement.",
                "var grade = 'A';\n" +
                        "document.write(\"Entering switch block<br />\");\n" +
                        "switch (grade) {\n" +
                        "case 'A': document.write(\"Good job<br />\");\n" +
                        "case 'B': document.write(\"Pretty good<br />\");\n" +
                        "case 'C': document.write(\"Passed<br />\");\n" +
                        "case 'D': document.write(\"Not so good<br />\");\n" +
                        "case 'F': document.write(\"Failed<br />\");\n" +
                        "default: document.write(\"Unknown grade<br />\")\n" +
                        "}\n" +
                        "document.write(\"Exiting switch block\");",
                "Entering switch block\n" +
                        "Good job\n" +
                        "Pretty good\n" +
                        "Passed\n" +
                        "Not so good\n" +
                        "Failed\n" +
                        "Unknown grade\n" +
                        "Exiting switch block"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //Basic Loops
    private static List<LearnDetailsModel> BasicLoops(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Loops",
                "The JavaScript loops are used to iterate the piece of code using for, while, do while or for-in loops. It makes the code compact. It is mostly used in array.\n" +
                        "\n" +
                        "There are four types of loops in JavaScript.\n" +
                        "\n" +
                        "1. for loop\n" +
                        "2. while loop\n" +
                        "3. do-while loop\n" +
                        "4. for-in loop",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "For loop",
                "The JavaScript for loop iterates the elements for the fixed number of times. It should be used if number of iteration is known. The syntax of for loop is given below." +
                        "\n\n" +
                        "for (initialization; condition; increment)  \n" +
                        "{  \n" +
                        "    code to be executed  \n" +
                        "}",
                "for (i=1; i<=5; i++)  \n" +
                        "{  \n" +
                        "document.write(i + \"<br/>\")  \n" +
                        "}",
                "1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n" +
                        "5"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "while loop",
                "The JavaScript while loop iterates the elements for the infinite number of times. It should be used if number of iteration is not known. The syntax of while loop is given below.\n" +
                        "\n" +
                        "while (condition)  \n" +
                        "{  \n" +
                        "    code to be executed  \n" +
                        "}  ",
                "var i=11;  \n" +
                        "while (i<=15)  \n" +
                        "{  \n" +
                        "document.write(i + \"<br/>\");  \n" +
                        "i++;  \n" +
                        "}",
                "11\n" +
                        "12\n" +
                        "13\n" +
                        "14\n" +
                        "15"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "do while loop",
                "The JavaScript do while loop iterates the elements for the infinite number of times like while loop. But, code is executed at least once whether condition is true or false. The syntax of do while loop is given below.\n" +
                        "\n" +
                        "do{  \n" +
                        "    code to be executed  \n" +
                        "}while (condition);  ",
                "var i=21;  \n" +
                        "do{  \n" +
                        "document.write(i + \"<br/>\");  \n" +
                        "i++;  \n" +
                        "}while (i<=25);",
                "21\n" +
                        "22\n" +
                        "23\n" +
                        "24\n" +
                        "25"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "for in loop",
                "The for...in loop is used to loop through an object's properties. As we have not discussed Objects yet, you may not feel comfortable with this loop. But once you understand how objects behave in JavaScript, you will find this loop very useful.\n" +
                        "\n" +
                        "Syntax\n" +
                        "The syntax of ‘for..in’ loop is −\n" +
                        "for (variableName in object) {\n" +
                        "   statement or block to execute\n" +
                        "}\n" +
                        "In each iteration, one property from object is assigned to variableName and this loop continues till all the properties of the object are exhausted.",
                "var aProperty;\n" +
                        "document.write(\"Navigator Object Properties<br /> \");        \n" +
                        "for (aProperty in navigator) {\n" +
                        "document.write(aProperty);\n" +
                        "document.write(\"<br />\");\n" +
                        "}\n" +
                        "document.write (\"Exiting from the loop!\");",
                "Navigator Object Properties \n" +
                        "serviceWorker \n" +
                        "webkitPersistentStorage \n" +
                        "webkitTemporaryStorage \n" +
                        "geolocation \n" +
                        "doNotTrack \n" +
                        "onLine \n" +
                        "languages \n" +
                        "language \n" +
                        "userAgent \n" +
                        "product \n" +
                        "platform \n" +
                        "appVersion \n" +
                        "appName \n" +
                        "appCodeName \n" +
                        "hardwareConcurrency \n" +
                        "maxTouchPoints \n" +
                        "vendorSub \n" +
                        "vendor \n" +
                        "productSub \n" +
                        "cookieEnabled \n" +
                        "mimeTypes \n" +
                        "plugins \n" +
                        "javaEnabled \n" +
                        "getStorageUpdates \n" +
                        "getGamepads \n" +
                        "webkitGetUserMedia \n" +
                        "vibrate \n" +
                        "getBattery \n" +
                        "sendBeacon \n" +
                        "registerProtocolHandler \n" +
                        "unregisterProtocolHandler \n" +
                        "Exiting from the loop!"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //Basic Functions
    private static List<LearnDetailsModel> BasicFunctions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Function Definition",
                "A function is a group of reusable code which can be called anywhere in your program. This eliminates the need of writing the same code again and again. It helps programmers in writing modular codes. Functions allow a programmer to divide a big program into a number of small and manageable functions.\n" +
                        "\n" +
                        "Like any other advanced programming language, JavaScript also supports all the features necessary to write modular code using functions. You must have seen functions like alert() and write() in the earlier chapters. We were using these functions again and again, but they had been written in core JavaScript only once.\n" +
                        "\n" +
                        "JavaScript allows us to write our own functions as well. This section explains how to write your own functions in JavaScript." +
                        "\n\n" +
                        "Before we use a function, we need to define it. The most common way to define a function in JavaScript is by using the function keyword, followed by a unique function name, a list of parameters (that might be empty), and a statement block surrounded by curly braces." +
                        "\n\n" +
                        "Syntax:\n" +
                        "The basic syntax is shown here.\n" +
                        "\n" +
                        "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      function functionName(parameter-list) {\n" +
                        "         statements\n" +
                        "      }\n" +
                        "   //-->\n" +
                        "</script>",
                "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      function sayHello() {\n" +
                        "         alert(\"Hello there!\");\n" +
                        "      }\n" +
                        "   //-->\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Calling a Function",
                "To invoke a function somewhere later in the script, you would simply need to write the name of that function as shown in the following code.",
                "<script type = \"text/javascript\">\n" +
                        "function sayHello() {\n" +
                        "  document.write (\"Hello there!\");\n" +
                        "}\n" +
                        "sayHello();\n" +
                        "</script>",
                "Hello there!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Function Parameters",
                "Till now, we have seen functions without parameters. But there is a facility to pass different parameters while calling a function. These passed parameters can be captured inside the function and any manipulation can be done over those parameters. A function can take multiple parameters separated by comma.",
                "<script type = \"text/javascript\">\n" +
                        "function sayHello(name, age) {\n" +
                        "document.write (name + \" is \" + age + \" years old.\");\n" +
                        "}\n" +
                        "sayHello('Anne', 21);\n" +
                        "</script> ",
                "Anne is 21 years old."
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The return Statement",
                "A JavaScript function can have an optional return statement. This is required if you want to return a value from a function. This statement should be the last statement in a function.\n" +
                        "\n" +
                        "For example, you can pass two numbers in a function and then you can expect the function to return their multiplication in your calling program.",
                "<script type = \"text/javascript\">\n" +
                        "function concatenate(first, last) {\n" +
                        "  var full;\n" +
                        "  full = first + last;\n" +
                        "  return full;\n" +
                        "}\n" +
                        "function secondFunction() {\n" +
                        "  var result;\n" +
                        "  result = concatenate('Anne', 'Moore');\n" +
                        "  document.write (result );\n" +
                        "}\n" +
                        "secondFunction();\n" +
                        "</script>",
                "AnneMoore"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //Events
    private static List<LearnDetailsModel> Events(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is an Event ?",
                "JavaScript's interaction with HTML is handled through events that occur when the user or the browser manipulates a page.\n" +
                        "\n" +
                        "When the page loads, it is called an event. When the user clicks a button, that click too is an event. Other examples include events like pressing any key, closing a window, resizing a window, etc.\n" +
                        "\n" +
                        "Developers can use these events to execute JavaScript coded responses, which cause buttons to close windows, messages to be displayed to users, data to be validated, and virtually any other type of response imaginable.\n" +
                        "\n" +
                        "Events are a part of the Document Object Model (DOM) Level 3 and every HTML element contains a set of events which can trigger JavaScript Code.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "onclick Event",
                "This is the most frequently used event type which occurs when a user clicks the left button of his mouse. You can put your validation, warning etc., against this event type.",
                "<script type = \"text/javascript\">\n" +
                        "<!--\n" +
                        "function sayHello() {\n" +
                        "  alert(\"Hello World!\")\n" +
                        "}\n" +
                        "//-->\n" +
                        "</script>" +
                        "\n\n" +
                        "<body>\n" +
                        "  <p>Click the following button and see result</p>      \n" +
                        "  <form>\n" +
                        "    <input type = \"button\" onclick = \"sayHello()\" value = \"Say Hello\" />\n" +
                        "  </form>      \n" +
                        "</body>",
                "Hello World!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "onsubmit Event",
                "onsubmit is an event that occurs when you try to submit a form. You can put your form validation against this event type." +
                        "\n\n" +
                        "The following example shows how to use onsubmit. Here we are calling a validate() function before submitting a form data to the webserver. If validate() function returns true, the form will be submitted, otherwise it will not submit the data.",
                "<html>\n" +
                        "   <head>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            function validation() {\n" +
                        "               all validation goes here\n" +
                        "               .........\n" +
                        "               return either true or false\n" +
                        "            }\n" +
                        "         //-->\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>   \n" +
                        "      <form method = \"POST\" action = \"t.cgi\" onsubmit = \"return validate()\">\n" +
                        "         .......\n" +
                        "         <input type = \"submit\" value = \"Submit\" />\n" +
                        "      </form>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "onmouseover and onmouseout",
                "These two event types will help you create nice effects with images or even with text as well. The onmouseover event triggers when you bring your mouse over any element and the onmouseout triggers when you move your mouse out from that element. Try the following example.",
                "<html>\n" +
                        "   <head>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            function over() {\n" +
                        "               document.write (\"Mouse Over\");\n" +
                        "            }            \n" +
                        "            function out() {\n" +
                        "               document.write (\"Mouse Out\");\n" +
                        "            }            \n" +
                        "         //-->\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <p>Bring your mouse inside the division to see the result:</p>      \n" +
                        "      <div onmouseover = \"over()\" onmouseout = \"out()\">\n" +
                        "         <h2> This is inside the division </h2>\n" +
                        "      </div>         \n" +
                        "   </body>\n" +
                        "</html>",
                "Mouse Over"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //JS Objects
    //Learn Objects
    private static List<LearnDetailsModel> LearnObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Objects",
                "JavaScript is an Object Oriented Programming (OOP) language. A programming language can be called object-oriented if it provides four basic capabilities to developers −\n" +
                        "\n" +
                        "Encapsulation − the capability to store related information, whether data or methods, together in an object.\n" +
                        "\n" +
                        "Aggregation − the capability to store one object inside another object.\n" +
                        "\n" +
                        "Inheritance − the capability of a class to rely upon another class (or number of classes) for some of its properties and methods.\n" +
                        "\n" +
                        "Polymorphism − the capability to write one function or method that works in a variety of different ways.\n" +
                        "\n" +
                        "Objects are composed of attributes. If an attribute contains a function, it is considered to be a method of the object, otherwise the attribute is considered a property.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Object Properties",
                "Object properties can be any of the three primitive data types, or any of the abstract data types, such as another object. Object properties are usually variables that are used internally in the object's methods, but can also be globally visible variables that are used throughout the page.\n" +
                        "\n" +
                        "The syntax for adding a property to an object is −\n" +
                        "\n" +
                        "objectName.objectProperty = propertyValue;\n" +
                        "For example − The following code gets the document title using the \"title\" property of the document object.",
                "var str = document.title;",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Object Methods",
                "Methods are the functions that let the object do something or let something be done to it. There is a small difference between a function and a method – at a function is a standalone unit of statements and a method is attached to an object and can be referenced by the this keyword.\n" +
                        "\n" +
                        "Methods are useful for everything from displaying the contents of the object to the screen to performing complex mathematical operations on a group of local properties and parameters.\n" +
                        "\n" +
                        "For example − Following is a simple example to show how to use the write() method of document object to write any content on the document.",
                "document.write(\"This is a test\");",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "User-Defined Objects",
                "All user-defined objects and built-in objects are descendants of an object called Object.\n" +
                        "\n" +
                        "The new Operator\n" +
                        "The new operator is used to create an instance of an object. To create an object, the new operator is followed by the constructor method.\n" +
                        "\n" +
                        "In the following example, the constructor methods are Object(), Array(), and Date(). These constructors are built-in JavaScript functions.",
                "var employee = new Object();\n" +
                        "var books = new Array(\"C\", \"Python\", \"Java\");\n" +
                        "var day = new Date(\"January 1, 2022\");",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The Object() Constructor",
                "A constructor is a function that creates and initializes an object. JavaScript provides a special constructor function called Object() to build the object. The return value of the Object() constructor is assigned to a variable.\n" +
                        "\n" +
                        "The variable contains a reference to the new object. The properties assigned to the object are not variables and are not defined with the var keyword.",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>User-defined objects</title>     \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         var book = new Object();   // Create the object\n" +
                        "         book.subject = \"JavaScript\";     // Assign properties to the object\n" +
                        "         book.author  = \"Anne Moore\";\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>  \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         document.write(\"Book name is : \" + book.subject + \"<br>\");\n" +
                        "         document.write(\"Book author is : \" + book.author + \"<br>\");\n" +
                        "      </script>   \n" +
                        "   </body>\n" +
                        "</html>",
                "Book name is : JavaScript \n" +
                        "Book author is : Anne Moore"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Defining Methods for an Object",
                "The previous examples demonstrate how the constructor creates the object and assigns properties. But we need to complete the definition of an object by assigning methods to it.",
                "<html>\n" +
                        "   \n" +
                        "   <head>\n" +
                        "   <title>User-defined objects</title>\n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         // Define a function which will work as a method\n" +
                        "         function addPrice(amount) {\n" +
                        "            this.price = amount; \n" +
                        "         }\n" +
                        "         \n" +
                        "         function book(title, author) {\n" +
                        "            this.title = title;\n" +
                        "            this.author  = author;\n" +
                        "            this.addPrice = addPrice;  // Assign that method as property.\n" +
                        "         }\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         var myBook = new book(\"JavaScript\", \"Anne Moore\");\n" +
                        "         myBook.addPrice(25);\n" +
                        "         \n" +
                        "         document.write(\"Book title is : \" + myBook.title + \"<br>\");\n" +
                        "         document.write(\"Book author is : \" + myBook.author + \"<br>\");\n" +
                        "         document.write(\"Book price is : \" + myBook.price + \"<br>\");\n" +
                        "      </script>      \n" +
                        "   </body>\n" +
                        "</html>",
                "Book title is : JavaScript \n" +
                        "Book author is : Anne Moore \n" +
                        "Book price is : 25"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "The 'with' Keyword",
                "The ‘with’ keyword is used as a kind of shorthand for referencing an object's properties or methods.\n" +
                        "\n" +
                        "The object specified as an argument to with becomes the default object for the duration of the block that follows. The properties and methods for the object can be used without naming the object.\n" +
                        "\n" +
                        "Syntax\n" +
                        "The syntax for with object is as follows −\n" +
                        "\n" +
                        "with (object) {\n" +
                        "   properties used without the object name and dot\n" +
                        "}",
                "<html>\n" +
                        "   <head>\n" +
                        "   <title>User-defined objects</title>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         // Define a function which will work as a method\n" +
                        "         function addPrice(amount) {\n" +
                        "            with(this) {\n" +
                        "               price = amount;\n" +
                        "            }\n" +
                        "         }\n" +
                        "         function book(title, author) {\n" +
                        "            this.title = title;\n" +
                        "            this.author = author;\n" +
                        "            this.price = 0;\n" +
                        "            this.addPrice = addPrice;  // Assign that method as property.\n" +
                        "         }\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>   \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         var myBook = new book(\"JavaScript\", \"Anne Moore\");\n" +
                        "         myBook.addPrice(25);\n" +
                        "         \n" +
                        "         document.write(\"Book title is : \" + myBook.title + \"<br>\");\n" +
                        "         document.write(\"Book author is : \" + myBook.author + \"<br>\");\n" +
                        "         document.write(\"Book price is : \" + myBook.price + \"<br>\");\n" +
                        "      </script>      \n" +
                        "   </body>\n" +
                        "</html>",
                "Book title is : JavaScript \n" +
                        "Book author is : Anne Moore \n" +
                        "Book price is : 25"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);

        return list;
    }
    //Number Objects
    private static List<LearnDetailsModel> NumberObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Number Object",
                "The JavaScript number object enables you to represent a numeric value. It may be integer or floating-point. JavaScript number object follows IEEE standard to represent the floating-point numbers.\n" +
                        "\n" +
                        "By the help of Number() constructor, you can create number object in JavaScript. For example:\n" +
                        "\n" +
                        "var n=new Number(value);  \n" +
                        "If value can't be converted to number, it returns NaN(Not a Number) that can be checked by isNaN() method.\n" +
                        "\n" +
                        "You can direct assign a number to a variable also. For example:",
                "var x=102;\n" +
                        "var y=102.7;\n" +
                        "var z=13e4;\n" +
                        "var n=new Number(16);",
                "102 102.7 130000 16 "
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Number Constants",
                "Let's see the list of JavaScript number constants with description." +
                        "\n\n" +
                        "1. MIN_VALUE => returns the largest minimum value." +
                        "\n" +
                        "2. MAX_VALUE => returns the largest maximum value." +
                        "\n" +
                        "3. POSITIVE_INFINITY => returns positive infinity, overflow value." +
                        "\n" +
                        "4. NEGATIVE_INFINITY => returns negative infinity, overflow value." +
                        "\n" +
                        "5. NaN => represents \"Not a Number\" value.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Number Methods",
                "Let's see the list of JavaScript number methods with their description." +
                        "\n\n" +
                        "1. isFinite()\n" +
                        "It determines whether the given value is a finite number.\n" +
                        "2. isInteger()\n" +
                        "It determines whether the given value is an integer.\n" +
                        "3. parseFloat()\n" +
                        "It converts the given string into a floating point number.\n" +
                        "4. parseInt()\n" +
                        "It converts the given string into an integer number.\n" +
                        "5. toExponential()\n" +
                        "It returns the string that represents exponential notation of the given number.\n" +
                        "6. toFixed()\n" +
                        "It returns the string that represents a number with exact digits after a decimal point.\n" +
                        "7. toPrecision()\n" +
                        "It returns the string representing a number of specified precision.\n" +
                        "8. toString()\n" +
                        "It returns the given number in the form of string.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Boolean Objects
    private static List<LearnDetailsModel> BooleanObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Boolean Objects",
                "JavaScript Boolean is an object that represents value in two states: true or false. You can create the JavaScript Boolean object by Boolean() constructor as given below." +
                        "\n" +
                        "The default value of JavaScript Boolean object is false.",
                "Boolean b=new Boolean(value);  ",
                "false"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Boolean Properties",
                "Here is a list of the properties of Boolean object −",
                "1. constructor => returns the reference of Boolean function that created Boolean object.\n\n" +
                        "2. prototype => enables you to add properties and methods in Boolean prototype.",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Boolean Methods",
                "1. toSource() => returns the source of Boolean object as a string.\n" +
                        "2. toString() => converts Boolean into String.\n" +
                        "3. valueOf() => converts other type into Boolean.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Strings Objects
    private static List<LearnDetailsModel> StringsObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Strings Objects",
                "The String object lets you work with a series of characters; it wraps Javascript's string primitive data type with a number of helper methods.\n" +
                        "\n" +
                        "As JavaScript automatically converts between string primitives and String objects, you can call any of the helper methods of the String object on a string primitive.\n" +
                        "\n" +
                        "Syntax\n" +
                        "Use the following syntax to create a String object −\n" +
                        "\n" +
                        "The String parameter is a series of characters that has been properly encoded.",
                "var val = new String(string);",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "String Properties",
                "Here is a list of the properties of String object and their description." +
                        "\n\n" +
                        "1. constructor\n" +
                        "Returns a reference to the String function that created the object.\n" +
                        "\n" +
                        "2. length\n" +
                        "Returns the length of the string.\n" +
                        "\n" +
                        "3. prototype\n" +
                        "The prototype property allows you to add properties and methods to an object.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "String Methods",
                "Here is a list of the methods available in String object along with their description." +
                        "\n\n" +
                        "1. charAt()\n" +
                        "Returns the character at the specified index.\n" +
                        "\n" +
                        "2. charCodeAt()\n" +
                        "Returns a number indicating the Unicode value of the character at the given index.\n" +
                        "\n" +
                        "3. concat()\n" +
                        "Combines the text of two strings and returns a new string.\n" +
                        "\n" +
                        "4. indexOf()\n" +
                        "Returns the index within the calling String object of the first occurrence of the specified value, or -1 if not found.\n" +
                        "\n" +
                        "5. lastIndexOf()\n" +
                        "Returns the index within the calling String object of the last occurrence of the specified value, or -1 if not found.\n" +
                        "\n" +
                        "6. localeCompare()\n" +
                        "Returns a number indicating whether a reference string comes before or after or is the same as the given string in sort order.\n" +
                        "\n" +
                        "7. match()\n" +
                        "Used to match a regular expression against a string.\n" +
                        "\n" +
                        "8. replace()\n" +
                        "Used to find a match between a regular expression and a string, and to replace the matched substring with a new substring.\n" +
                        "\n" +
                        "9. search()\n" +
                        "Executes the search for a match between a regular expression and a specified string.\n" +
                        "\n" +
                        "10. slice()\n" +
                        "Extracts a section of a string and returns a new string.\n" +
                        "\n" +
                        "11. split()\n" +
                        "Splits a String object into an array of strings by separating the string into substrings.\n" +
                        "\n" +
                        "12. substr()\n" +
                        "Returns the characters in a string beginning at the specified location through the specified number of characters.\n" +
                        "\n" +
                        "13. substring()\n" +
                        "Returns the characters in a string between two indexes into the string.\n" +
                        "\n" +
                        "14. toLocaleLowerCase()\n" +
                        "The characters within a string are converted to lower case while respecting the current locale.\n" +
                        "\n" +
                        "15. toLocaleUpperCase()\n" +
                        "The characters within a string are converted to upper case while respecting the current locale.\n" +
                        "\n" +
                        "16. toLowerCase()\n" +
                        "Returns the calling string value converted to lower case.\n" +
                        "\n" +
                        "17. toString()\n" +
                        "Returns a string representing the specified object.\n" +
                        "\n" +
                        "18. toUpperCase()\n" +
                        "Returns the calling string value converted to uppercase.\n" +
                        "\n" +
                        "19. valueOf()\n" +
                        "Returns the primitive value of the specified object.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "String HTML Wrappers",
                "Here is a list of the methods that return a copy of the string wrapped inside an appropriate HTML tag." +
                        "\n\n" +
                        "1. anchor()\n" +
                        "Creates an HTML anchor that is used as a hypertext target.\n" +
                        "\n" +
                        "2. big()\n" +
                        "Creates a string to be displayed in a big font as if it were in a <big> tag.\n" +
                        "\n" +
                        "3. blink()\n" +
                        "Creates a string to blink as if it were in a <blink> tag.\n" +
                        "\n" +
                        "4. bold()\n" +
                        "Creates a string to be displayed as bold as if it were in a <b> tag.\n" +
                        "\n" +
                        "5. fixed()\n" +
                        "Causes a string to be displayed in fixed-pitch font as if it were in a <tt> tag\n" +
                        "\n" +
                        "6. fontcolor()\n" +
                        "Causes a string to be displayed in the specified color as if it were in a <font color=\"color\"> tag.\n" +
                        "\n" +
                        "7. fontsize()\n" +
                        "Causes a string to be displayed in the specified font size as if it were in a <font size=\"size\"> tag.\n" +
                        "\n" +
                        "8. italics()\n" +
                        "Causes a string to be italic, as if it were in an <i> tag.\n" +
                        "\n" +
                        "9. link()\n" +
                        "Creates an HTML hypertext link that requests another URL.\n" +
                        "\n" +
                        "10. small()\n" +
                        "Causes a string to be displayed in a small font, as if it were in a <small> tag.\n" +
                        "\n" +
                        "11. strike()\n" +
                        "Causes a string to be displayed as struck-out text, as if it were in a <strike> tag.\n" +
                        "\n" +
                        "12. sub()\n" +
                        "Causes a string to be displayed as a subscript, as if it were in a <sub> tag\n" +
                        "\n" +
                        "13. sup()\n" +
                        "Causes a string to be displayed as a superscript, as if it were in a <sup> tag",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //Arrays Objects
    private static List<LearnDetailsModel> ArraysObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Arrays Objects",
                "The Array object lets you store multiple values in a single variable. It stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.\n" +
                        "\n" +
                        "Syntax\n" +
                        "Use the following syntax to create an Array object −\n" +
                        "\n" +
                        "var fruits = new Array( \"apple\", \"orange\", \"mango\" );\n" +
                        "The Array parameter is a list of strings or integers. When you specify a single numeric parameter with the Array constructor, you specify the initial length of the array. The maximum length allowed for an array is 4,294,967,295.\n" +
                        "\n" +
                        "You can create array by simply assigning values as follows −\n" +
                        "\n" +
                        "var fruits = [ \"apple\", \"orange\", \"mango\" ];\n" +
                        "You will use ordinal numbers to access and to set values inside an array as follows.\n" +
                        "\n" +
                        "fruits[0] is the first element\n" +
                        "fruits[1] is the second element\n" +
                        "fruits[2] is the third element",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Array Properties",
                "Here is a list of the properties of the Array object along with their description." +
                        "\n\n" +
                        "",
                "1. constructor\n" +
                        "Returns a reference to the array function that created the object.\n" +
                        "\n" +
                        "2. index\n" +
                        "\n" +
                        "The property represents the zero-based index of the match in the string\n" +
                        "\n" +
                        "3. input\n" +
                        "\n" +
                        "This property is only present in arrays created by regular expression matches.\n" +
                        "\n" +
                        "4. length\n" +
                        "Reflects the number of elements in an array.\n" +
                        "\n" +
                        "5. prototype\n" +
                        "The prototype property allows you to add properties and methods to an object.",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Array Methods",
                "Here is a list of the methods of the Array object along with their description." +
                        "\n\n" +
                        "1. concat()\n" +
                        "Returns a new array comprised of this array joined with other array(s) and/or value(s).\n" +
                        "\n" +
                        "2. every()\n" +
                        "Returns true if every element in this array satisfies the provided testing function.\n" +
                        "\n" +
                        "3. filter()\n" +
                        "Creates a new array with all of the elements of this array for which the provided filtering function returns true.\n" +
                        "\n" +
                        "4. forEach()\n" +
                        "Calls a function for each element in the array.\n" +
                        "\n" +
                        "5. indexOf()\n" +
                        "Returns the first (least) index of an element within the array equal to the specified value, or -1 if none is found.\n" +
                        "\n" +
                        "6. join()\n" +
                        "Joins all elements of an array into a string.\n" +
                        "\n" +
                        "7. lastIndexOf()\n" +
                        "Returns the last (greatest) index of an element within the array equal to the specified value, or -1 if none is found.\n" +
                        "\n" +
                        "8. map()\n" +
                        "Creates a new array with the results of calling a provided function on every element in this array.\n" +
                        "\n" +
                        "9. pop()\n" +
                        "Removes the last element from an array and returns that element.\n" +
                        "\n" +
                        "10. push()\n" +
                        "Adds one or more elements to the end of an array and returns the new length of the array.\n" +
                        "\n" +
                        "11. reduce()\n" +
                        "Apply a function simultaneously against two values of the array (from left-to-right) as to reduce it to a single value.\n" +
                        "\n" +
                        "12. reduceRight()\n" +
                        "Apply a function simultaneously against two values of the array (from right-to-left) as to reduce it to a single value.\n" +
                        "\n" +
                        "13. reverse()\n" +
                        "Reverses the order of the elements of an array -- the first becomes the last, and the last becomes the first.\n" +
                        "\n" +
                        "14. shift()\n" +
                        "Removes the first element from an array and returns that element.\n" +
                        "\n" +
                        "15. slice()\n" +
                        "Extracts a section of an array and returns a new array.\n" +
                        "\n" +
                        "16. some()\n" +
                        "Returns true if at least one element in this array satisfies the provided testing function.\n" +
                        "\n" +
                        "17. toSource()\n" +
                        "Represents the source code of an object\n" +
                        "\n" +
                        "18. sort()\n" +
                        "Sorts the elements of an array\n" +
                        "\n" +
                        "19. splice()\n" +
                        "Adds and/or removes elements from an array.\n" +
                        "\n" +
                        "20. toString()\n" +
                        "Returns a string representing the array and its elements.\n" +
                        "\n" +
                        "21. unshift()\n" +
                        "Adds one or more elements to the front of an array and returns the new length of the array.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Date Objects
    private static List<LearnDetailsModel> DateObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Date Objects",
                "The Date object is a datatype built into the JavaScript language. Date objects are created with the new Date( ) as shown below.\n" +
                        "\n" +
                        "Once a Date object is created, a number of methods allow you to operate on it. Most methods simply allow you to get and set the year, month, day, hour, minute, second, and millisecond fields of the object, using either local time or UTC (universal, or GMT) time.\n" +
                        "\n" +
                        "The ECMAScript standard requires the Date object to be able to represent any date and time, to millisecond precision, within 100 million days before or after 1/1/1970. This is a range of plus or minus 273,785 years, so JavaScript can represent date and time till the year 275755.\n" +
                        "\n" +
                        "Syntax\n" +
                        "You can use any of the following syntax's to create a Date object using Date() constructor.\n" +
                        "\n" +
                        "new Date( )\n" +
                        "new Date(milliseconds)\n" +
                        "new Date(datestring)\n" +
                        "new Date(year,month,date[,hour,minute,second,millisecond ])\n" +
                        "Note − Parameters in the brackets are always optional.\n" +
                        "\n" +
                        "Here is a description of the parameters −\n" +
                        "\n" +
                        "No Argument − With no arguments, the Date() constructor creates a Date object set to the current date and time.\n" +
                        "\n" +
                        "milliseconds − When one numeric argument is passed, it is taken as the internal numeric representation of the date in milliseconds, as returned by the getTime() method. For example, passing the argument 5000 creates a date that represents five seconds past midnight on 1/1/70.\n" +
                        "\n" +
                        "datestring − When one string argument is passed, it is a string representation of a date, in the format accepted by the Date.parse() method.\n" +
                        "\n" +
                        "7 arguments − To use the last form of the constructor shown above. Here is a description of each argument −\n" +
                        "\n" +
                        "year − Integer value representing the year. For compatibility (in order to avoid the Y2K problem), you should always specify the year in full; use 1998, rather than 98.\n" +
                        "\n" +
                        "month − Integer value representing the month, beginning with 0 for January to 11 for December.\n" +
                        "\n" +
                        "date − Integer value representing the day of the month.\n" +
                        "\n" +
                        "hour − Integer value representing the hour of the day (24-hour scale).\n" +
                        "\n" +
                        "minute − Integer value representing the minute segment of a time reading.\n" +
                        "\n" +
                        "second − Integer value representing the second segment of a time reading.\n" +
                        "\n" +
                        "millisecond − Integer value representing the millisecond segment of a time reading.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Date Properties",
                "Here is a list of the properties of the Date object along with their description." +
                        "\n\n" +
                        "1. constructor\n" +
                        "Specifies the function that creates an object's prototype.\n" +
                        "\n" +
                        "2. prototype\n" +
                        "The prototype property allows you to add properties and methods to an object",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Date Methods",
                "Here is a list of the methods used with Date and their description." +
                        "\n\n" +
                        "1. Date()\n" +
                        "Returns today's date and time\n" +
                        "\n" +
                        "2. getDate()\n" +
                        "Returns the day of the month for the specified date according to local time.\n" +
                        "\n" +
                        "3. getDay()\n" +
                        "Returns the day of the week for the specified date according to local time.\n" +
                        "\n" +
                        "4. getFullYear()\n" +
                        "Returns the year of the specified date according to local time.\n" +
                        "\n" +
                        "5. getHours()\n" +
                        "Returns the hour in the specified date according to local time.\n" +
                        "\n" +
                        "6. getMilliseconds()\n" +
                        "Returns the milliseconds in the specified date according to local time.\n" +
                        "\n" +
                        "7. getMinutes()\n" +
                        "Returns the minutes in the specified date according to local time.\n" +
                        "\n" +
                        "8. getMonth()\n" +
                        "Returns the month in the specified date according to local time.\n" +
                        "\n" +
                        "9. getSeconds()\n" +
                        "Returns the seconds in the specified date according to local time.\n" +
                        "\n" +
                        "10. getTime()\n" +
                        "Returns the numeric value of the specified date as the number of milliseconds since January 1, 1970, 00:00:00 UTC.\n" +
                        "\n" +
                        "11. getTimezoneOffset()\n" +
                        "Returns the time-zone offset in minutes for the current locale.\n" +
                        "\n" +
                        "12. getUTCDate()\n" +
                        "Returns the day (date) of the month in the specified date according to universal time.\n" +
                        "\n" +
                        "13. getUTCDay()\n" +
                        "Returns the day of the week in the specified date according to universal time.\n" +
                        "\n" +
                        "14. getUTCFullYear()\n" +
                        "Returns the year in the specified date according to universal time.\n" +
                        "\n" +
                        "15. getUTCHours()\n" +
                        "Returns the hours in the specified date according to universal time.\n" +
                        "\n" +
                        "16. getUTCMilliseconds()\n" +
                        "Returns the milliseconds in the specified date according to universal time.\n" +
                        "\n" +
                        "17. getUTCMinutes()\n" +
                        "Returns the minutes in the specified date according to universal time.\n" +
                        "\n" +
                        "18. getUTCMonth()\n" +
                        "Returns the month in the specified date according to universal time.\n" +
                        "\n" +
                        "19. getUTCSeconds()\n" +
                        "Returns the seconds in the specified date according to universal time.\n" +
                        "\n" +
                        "20. getYear()\n" +
                        "Deprecated - Returns the year in the specified date according to local time. Use getFullYear instead.\n" +
                        "\n" +
                        "21. setDate()\n" +
                        "Sets the day of the month for a specified date according to local time.\n" +
                        "\n" +
                        "22. setFullYear()\n" +
                        "Sets the full year for a specified date according to local time.\n" +
                        "\n" +
                        "23. setHours()\n" +
                        "Sets the hours for a specified date according to local time.\n" +
                        "\n" +
                        "24. setMilliseconds()\n" +
                        "Sets the milliseconds for a specified date according to local time.\n" +
                        "\n" +
                        "25. setMinutes()\n" +
                        "Sets the minutes for a specified date according to local time.\n" +
                        "\n" +
                        "26. setMonth()\n" +
                        "Sets the month for a specified date according to local time.\n" +
                        "\n" +
                        "27. setSeconds()\n" +
                        "Sets the seconds for a specified date according to local time.\n" +
                        "\n" +
                        "28. setTime()\n" +
                        "Sets the Date object to the time represented by a number of milliseconds since January 1, 1970, 00:00:00 UTC.\n" +
                        "\n" +
                        "29. setUTCDate()\n" +
                        "Sets the day of the month for a specified date according to universal time.\n" +
                        "\n" +
                        "30. setUTCFullYear()\n" +
                        "Sets the full year for a specified date according to universal time.\n" +
                        "\n" +
                        "31. setUTCHours()\n" +
                        "Sets the hour for a specified date according to universal time.\n" +
                        "\n" +
                        "32. setUTCMilliseconds()\n" +
                        "Sets the milliseconds for a specified date according to universal time.\n" +
                        "\n" +
                        "33. setUTCMinutes()\n" +
                        "Sets the minutes for a specified date according to universal time.\n" +
                        "\n" +
                        "34. setUTCMonth()\n" +
                        "Sets the month for a specified date according to universal time.\n" +
                        "\n" +
                        "35. setUTCSeconds()\n" +
                        "Sets the seconds for a specified date according to universal time.\n" +
                        "\n" +
                        "36. setYear()\n" +
                        "Deprecated - Sets the year for a specified date according to local time. Use setFullYear instead.\n" +
                        "\n" +
                        "37. toDateString()\n" +
                        "Returns the \"date\" portion of the Date as a human-readable string.\n" +
                        "\n" +
                        "38. toGMTString()\n" +
                        "Deprecated - Converts a date to a string, using the Internet GMT conventions. Use toUTCString instead.\n" +
                        "\n" +
                        "39. toLocaleDateString()\n" +
                        "Returns the \"date\" portion of the Date as a string, using the current locale's conventions.\n" +
                        "\n" +
                        "40. toLocaleFormat()\n" +
                        "Converts a date to a string, using a format string.\n" +
                        "\n" +
                        "41. toLocaleString()\n" +
                        "Converts a date to a string, using the current locale's conventions.\n" +
                        "\n" +
                        "42. toLocaleTimeString()\n" +
                        "Returns the \"time\" portion of the Date as a string, using the current locale's conventions.\n" +
                        "\n" +
                        "43. toSource()\n" +
                        "Returns a string representing the source for an equivalent Date object; you can use this value to create a new object.\n" +
                        "\n" +
                        "44. toString()\n" +
                        "Returns a string representing the specified Date object.\n" +
                        "\n" +
                        "45. toTimeString()\n" +
                        "Returns the \"time\" portion of the Date as a human-readable string.\n" +
                        "\n" +
                        "46. toUTCString()\n" +
                        "Converts a date to a string, using the universal time convention.\n" +
                        "\n" +
                        "47. valueOf()\n" +
                        "Returns the primitive value of a Date object.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Date Static Methods",
                "In addition to the many instance methods listed previously, the Date object also defines two static methods. These methods are invoked through the Date() constructor itself." +
                        "\n\n" +
                        "1. Date.parse( )\n" +
                        "Parses a string representation of a date and time and returns the internal millisecond representation of that date.\n" +
                        "\n" +
                        "2. Date.UTC( )\n" +
                        "Returns the millisecond representation of the specified UTC date and time.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //Math Objects
    private static List<LearnDetailsModel> MathObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Math Objects",
                "The math object provides you properties and methods for mathematical constants and functions. Unlike other global objects, Math is not a constructor. All the properties and methods of Math are static and can be called by using Math as an object without creating it.\n" +
                        "\n" +
                        "Thus, you refer to the constant pi as Math.PI and you call the sine function as Math.sin(x), where x is the method's argument.\n" +
                        "\n" +
                        "Syntax\n" +
                        "The syntax to call the properties and methods of Math are as follows",
                "var pi_val = Math.PI;\n" +
                        "var sine_val = Math.sin(30);",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Math Properties",
                "Here is a list of all the properties of Math and their description." +
                        "\n\n" +
                        "",
                "1. E \\\n" +
                        "Euler's constant and the base of natural logarithms, approximately 2.718.\n" +
                        "\n" +
                        "2. LN2\n" +
                        "Natural logarithm of 2, approximately 0.693.\n" +
                        "\n" +
                        "3. LN10\n" +
                        "Natural logarithm of 10, approximately 2.302.\n" +
                        "\n" +
                        "4. LOG2E\n" +
                        "Base 2 logarithm of E, approximately 1.442.\n" +
                        "\n" +
                        "5. LOG10E\n" +
                        "Base 10 logarithm of E, approximately 0.434.\n" +
                        "\n" +
                        "6. PI\n" +
                        "Ratio of the circumference of a circle to its diameter, approximately 3.14159.\n" +
                        "\n" +
                        "7. SQRT1_2\n" +
                        "Square root of 1/2; equivalently, 1 over the square root of 2, approximately 0.707.\n" +
                        "\n" +
                        "8. SQRT2\n" +
                        "Square root of 2, approximately 1.414.",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Math Methods",
                "Here is a list of the methods associated with Math object and their description." +
                        "\n\n" +
                        "1. abs()\n" +
                        "Returns the absolute value of a number.\n" +
                        "\n" +
                        "2. acos()\n" +
                        "Returns the arccosine (in radians) of a number.\n" +
                        "\n" +
                        "3. asin()\n" +
                        "Returns the arcsine (in radians) of a number.\n" +
                        "\n" +
                        "4. atan()\n" +
                        "Returns the arctangent (in radians) of a number.\n" +
                        "\n" +
                        "5. atan2()\n" +
                        "Returns the arctangent of the quotient of its arguments.\n" +
                        "\n" +
                        "6. ceil()\n" +
                        "Returns the smallest integer greater than or equal to a number.\n" +
                        "\n" +
                        "7. cos()\n" +
                        "Returns the cosine of a number.\n" +
                        "\n" +
                        "8. exp()\n" +
                        "Returns EN, where N is the argument, and E is Euler's constant, the base of the natural logarithm.\n" +
                        "\n" +
                        "9. floor()\n" +
                        "Returns the largest integer less than or equal to a number.\n" +
                        "\n" +
                        "10. log()\n" +
                        "Returns the natural logarithm (base E) of a number.\n" +
                        "\n" +
                        "11. max()\n" +
                        "Returns the largest of zero or more numbers.\n" +
                        "\n" +
                        "12. min()\n" +
                        "Returns the smallest of zero or more numbers.\n" +
                        "\n" +
                        "13. pow()\n" +
                        "Returns base to the exponent power, that is, base exponent.\n" +
                        "\n" +
                        "14. random()\n" +
                        "Returns a pseudo-random number between 0 and 1.\n" +
                        "\n" +
                        "15. round()\n" +
                        "Returns the value of a number rounded to the nearest integer.\n" +
                        "\n" +
                        "16. sin()\n" +
                        "Returns the sine of a number.\n" +
                        "\n" +
                        "17. sqrt()\n" +
                        "Returns the square root of a number.\n" +
                        "\n" +
                        "18. tan()\n" +
                        "Returns the tangent of a number.\n" +
                        "\n" +
                        "19. toSource()\n" +
                        "Returns the string \"Math\".",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //RegExp Objects
    private static List<LearnDetailsModel> RegExpObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "RegExp Objects",
                "A regular expression is an object that describes a pattern of characters.\n" +
                        "\n" +
                        "The JavaScript RegExp class represents regular expressions, and both String and RegExp define methods that use regular expressions to perform powerful pattern-matching and search-and-replace functions on text.\n" +
                        "\n" +
                        "Here is the description of the parameters −\n" +
                        "\n" +
                        "pattern − A string that specifies the pattern of the regular expression or another regular expression.\n" +
                        "\n" +
                        "attributes − An optional string containing any of the \"g\", \"i\", and \"m\" attributes that specify global, case-insensitive, and multi-line matches, respectively." +
                        "Syntax\n" +
                        "A regular expression could be defined with the RegExp () constructor, as follows −" +
                        "",
                "var pattern = new RegExp(pattern, attributes);\n" +
                        "or simply\n" +
                        "var pattern = /pattern/attributes;",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Brackets",
                "Brackets ([]) have a special meaning when used in the context of regular expressions. They are used to find a range of characters." +
                        "\n\n" +
                        "The ranges shown above are general; you could also use the range [0-3] to match any decimal digit ranging from 0 through 3, or the range [b-v] to match any lowercase character ranging from b through v." +
                        "\n\n" +
                        "1. [...]\n" +
                        "\n" +
                        "Any one character between the brackets.\n" +
                        "\n" +
                        "2. [^...]\n" +
                        "\n" +
                        "Any one character not between the brackets.\n" +
                        "\n" +
                        "3. [0-9]\n" +
                        "\n" +
                        "It matches any decimal digit from 0 through 9.\n" +
                        "\n" +
                        "4. [a-z]\n" +
                        "\n" +
                        "It matches any character from lowercase a through lowercase z.\n" +
                        "\n" +
                        "5. [A-Z]\n" +
                        "\n" +
                        "It matches any character from uppercase A through uppercase Z.\n" +
                        "\n" +
                        "6. [a-Z]\n" +
                        "\n" +
                        "It matches any character from lowercase a through uppercase Z.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Quantifiers",
                "The frequency or position of bracketed character sequences and single characters can be denoted by a special character. Each special character has a specific connotation. The +, *, ?, and $ flags all follow a character sequence." +
                        "\n\n" +
                        "1. p+\n" +
                        "\n" +
                        "It matches any string containing one or more p's.\n" +
                        "\n" +
                        "2. p*\n" +
                        "\n" +
                        "It matches any string containing zero or more p's.\n" +
                        "\n" +
                        "3. p?\n" +
                        "\n" +
                        "It matches any string containing at most one p.\n" +
                        "\n" +
                        "4. p{N}\n" +
                        "\n" +
                        "It matches any string containing a sequence of N p's\n" +
                        "\n" +
                        "5. p{2,3}\n" +
                        "\n" +
                        "It matches any string containing a sequence of two or three p's.\n" +
                        "\n" +
                        "6. p{2, }\n" +
                        "\n" +
                        "It matches any string containing a sequence of at least two p's.\n" +
                        "\n" +
                        "7. p$\n" +
                        "\n" +
                        "It matches any string with p at the end of it.\n" +
                        "\n" +
                        "8. ^p\n" +
                        "\n" +
                        "It matches any string with p at the beginning of it.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Examples",
                "Following examples explain more about matching characters." +
                        "\n\n" +
                        "1. [^a-zA-Z]\n" +
                        "\n" +
                        "It matches any string not containing any of the characters ranging from a through z and A through Z.\n" +
                        "\n" +
                        "2. p.p\n" +
                        "\n" +
                        "It matches any string containing p, followed by any character, in turn followed by another p.\n" +
                        "\n" +
                        "3. ^.{2}$\n" +
                        "\n" +
                        "It matches any string containing exactly two characters.\n" +
                        "\n" +
                        "4. <b>(.*)</b>\n" +
                        "\n" +
                        "It matches any string enclosed within <b> and </b>.\n" +
                        "\n" +
                        "5. p(hp)*\n" +
                        "\n" +
                        "It matches any string containing a p followed by zero or more instances of the sequence hp.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Literal characters",
                "1. Alphanumeric\n" +
                        "\n" +
                        "Itself\n" +
                        "\n" +
                        "2. \\0\n" +
                        "\n" +
                        "The NUL character (\\u0000)\n" +
                        "\n" +
                        "3. Tab (\\u0009\n" +
                        "\n" +
                        "4. \\n\n" +
                        "\n" +
                        "Newline (\\u000A)\n" +
                        "\n" +
                        "5. \\v\n" +
                        "\n" +
                        "Vertical tab (\\u000B)\n" +
                        "\n" +
                        "6. \\f\n" +
                        "\n" +
                        "Form feed (\\u000C)\n" +
                        "\n" +
                        "7. \\r\n" +
                        "\n" +
                        "Carriage return (\\u000D)\n" +
                        "\n" +
                        "8. \\xnn\n" +
                        "\n" +
                        "The Latin character specified by the hexadecimal number nn; for example, \\x0A is the same as \\n\n" +
                        "\n" +
                        "9. \\uxxxx\n" +
                        "\n" +
                        "The Unicode character specified by the hexadecimal number xxxx; for example, \\u0009 is the same as \\t  \n" +
                        "\n" +
                        "10. \\cX\n" +
                        "\n" +
                        "The control character ^X; for example, \\cJ is equivalent to the newline character \\n",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Metacharacters",
                "A metacharacter is simply an alphabetical character preceded by a backslash that acts to give the combination a special meaning.\n" +
                        "\n" +
                        "For instance, you can search for a large sum of money using the '\\d' metacharacter: /([\\d]+)000/, Here \\d will search for any string of numerical character.\n" +
                        "\n" +
                        "The following table lists a set of metacharacters which can be used in PERL Style Regular Expressions." +
                        "\n\n" +
                        "1. .\n" +
                        "\n" +
                        "a single character\n" +
                        "\n" +
                        "2. \\s\n" +
                        "\n" +
                        "a whitespace character (space, tab, newline)\n" +
                        "\n" +
                        "3. \\S\n" +
                        "\n" +
                        "non-whitespace character\n" +
                        "\n" +
                        "4. \\d\n" +
                        "\n" +
                        "a digit (0-9)\n" +
                        "\n" +
                        "5. \\D\n" +
                        "\n" +
                        "a non-digit\n" +
                        "\n" +
                        "6. \\w\n" +
                        "\n" +
                        "a word character (a-z, A-Z, 0-9, _)\n" +
                        "\n" +
                        "7. \\W\n" +
                        "\n" +
                        "a non-word character\n" +
                        "\n" +
                        "8. [\\b]\n" +
                        "\n" +
                        "a literal backspace (special case).\n" +
                        "\n" +
                        "9. [aeiou]\n" +
                        "\n" +
                        "matches a single character in the given set\n" +
                        "\n" +
                        "10. [^aeiou]\n" +
                        "\n" +
                        "matches a single character outside the given set\n" +
                        "\n" +
                        "11. (foo|bar|baz)\n" +
                        "\n" +
                        "matches any of the alternatives specified",
                "",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Modifiers",
                "Several modifiers are available that can simplify the way you work with regexps, like case sensitivity, searching in multiple lines, etc." +
                        "\n\n" +
                        "1. i\n" +
                        "\n" +
                        "Perform case-insensitive matching.\n" +
                        "\n" +
                        "2. m\n" +
                        "\n" +
                        "Specifies that if the string has newline or carriage return characters, the ^ and $ operators will now match against a newline boundary, instead of a string boundary\n" +
                        "\n" +
                        "3. g\n" +
                        "\n" +
                        "Performs a global matchthat is, find all matches rather than stopping after the first match.",
                "",
                ""
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "RegExp Properties",
                "Here is a list of the properties associated with RegExp and their description." +
                        "\n\n" +
                        "1. constructor\n" +
                        "Specifies the function that creates an object's prototype.\n" +
                        "\n" +
                        "2. global\n" +
                        "Specifies if the \"g\" modifier is set.\n" +
                        "\n" +
                        "3. ignoreCase\n" +
                        "Specifies if the \"i\" modifier is set.\n" +
                        "\n" +
                        "4. lastIndex\n" +
                        "The index at which to start the next match.\n" +
                        "\n" +
                        "5. multiline\n" +
                        "Specifies if the \"m\" modifier is set.\n" +
                        "\n" +
                        "6. source\n" +
                        "The text of the pattern.",
                "",
                ""
        );
        final LearnDetailsModel l9 = new LearnDetailsModel(
                "RegExp Methods",
                "Here is a list of the methods associated with RegExp along with their description." +
                        "\n\n" +
                        "1. exec()\n" +
                        "Executes a search for a match in its string parameter.\n" +
                        "\n" +
                        "2. test()\n" +
                        "Tests for a match in its string parameter.\n" +
                        "\n" +
                        "3. toSource()\n" +
                        "Returns an object literal representing the specified object; you can use this value to create a new object.\n" +
                        "\n" +
                        "4. toString()\n" +
                        "Returns a string representing the specified object.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        list.add(l9);
        return list;
    }
    //JS Class
    private static List<LearnDetailsModel> JSClass(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Classes",
                "n JavaScript, classes are the special type of functions. We can define the class just like function declarations and function expressions.\n" +
                        "\n" +
                        "The JavaScript class contains various class members within a body including methods or constructor. The class is executed in strict mode. So, the code containing the silent error or mistake throws an error.\n" +
                        "\n" +
                        "The class syntax contains two components:\n" +
                        "\n" +
                        "Class declarations\n" +
                        "Class expressions",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Class Declarations",
                "A class can be defined by using a class declaration. A class keyword is used to declare a class with any particular name. According to JavaScript naming conventions, the name of the class always starts with an uppercase letter." +
                        "\n" +
                        "Let's see a simple example of declaring the class.",
                "<script>  \n" +
                        "class Employee  \n" +
                        "  {  \n" +
                        "    constructor(id,name)  \n" +
                        "    {  \n" +
                        "      this.id=id;  \n" +
                        "      this.name=name;  \n" +
                        "    }  \n" +
                        "    detail()  \n" +
                        "    {  \n" +
                        "  document.writeln(this.id+\" \"+this.name+\"<br>\")  \n" +
                        "    }  \n" +
                        "  }  \n" +
                        "var e1=new Employee(101,\"David Jason\");  \n" +
                        "var e2=new Employee(102,\"Jack William\");  \n" +
                        "e1.detail();\n" +
                        "e2.detail();  \n" +
                        "</script>  ",
                "101 David Jason\n" +
                        "102 Jack William"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Class expressions",
                "Another way to define a class is by using a class expression. Here, it is not mandatory to assign the name of the class. So, the class expression can be named or unnamed. The class expression allows us to fetch the class name. However, this will not be possible with class declaration." +
                        "\n" +
                        "Let's see an example.",
                "<script>  \n" +
                        "var emp = class {  \n" +
                        "  constructor(id, name) {  \n" +
                        "    this.id = id;  \n" +
                        "    this.name = name;  \n" +
                        "  }  \n" +
                        "};  \n" +
                        "document.writeln(emp.name);  \n" +
                        "</script>",
                "emp"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Object
    private static List<LearnDetailsModel> JSObject(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Objects",
                "A javaScript object is an entity having state and behavior (properties and method). For example: car, pen, bike, chair, glass, keyboard, monitor etc.\n" +
                        "\n" +
                        "JavaScript is an object-based language. Everything is an object in JavaScript.\n" +
                        "\n" +
                        "JavaScript is template based not class based. Here, we don't create class to get the object. But, we direct create objects." +
                        "\n" +
                        "There are 3 ways to create objects." +
                        "\n" +
                        "1. By object literal\n" +
                        "2. By creating instance of Object directly (using new keyword)\n" +
                        "3. By using an object constructor (using new keyword)",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Object by object literal",
                "The syntax of creating object using object literal is given below:\n" +
                        "\n" +
                        "object={property1:value1,property2:value2.....propertyN:valueN}  \n" +
                        "As you can see, property and value is separated by : (colon).\n" +
                        "\n" +
                        "Let’s see the simple example of creating object in JavaScript.",
                "<script>  \n" +
                        "emp={id:102,name:\"Anne Moore\",salary:60000}  \n" +
                        "document.write(emp.id+\" \"+emp.name+\" \"+emp.salary);  \n" +
                        "</script>  ",
                "102 Anne Moore 60000"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "By creating instance of Object",
                "The syntax of creating object directly is given below:\n" +
                        "\n" +
                        "var objectName=new Object();  \n" +
                        "Here, new keyword is used to create object.\n" +
                        "\n" +
                        "Let’s see the example of creating object directly.",
                "<script>  \n" +
                        "var emp=new Object();  \n" +
                        "emp.id=104;  \n" +
                        "emp.name=\"Emma Watson\";  \n" +
                        "emp.salary=80000;  \n" +
                        "document.write(emp.id+\" \"+emp.name+\" \"+emp.salary);  \n" +
                        "</script>  ",
                "104 Emma Watson 80000"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "By using an Object constructor",
                "Here, you need to create function with arguments. Each argument value can be assigned in the current object by using this keyword.\n" +
                        "\n" +
                        "\n" +
                        "The this keyword refers to the current object.\n" +
                        "\n" +
                        "The example of creating object by object constructor is given below.",
                "<script>  \n" +
                        "function emp(id,name,salary){  \n" +
                        "this.id=id;  \n" +
                        "this.name=name;  \n" +
                        "this.salary=salary;  \n" +
                        "}  \n" +
                        "e=new emp(103,\"MD. Shahadot Hossain\",44000);  \n" +
                        "  \n" +
                        "document.write(e.id+\" \"+e.name+\" \"+e.salary);  \n" +
                        "</script>",
                "103 MD. Shahadot Hossain 44000"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Defining method in JavaScript Object",
                "We can define method in JavaScript object. But before defining method, we need to add property in the function with same name as method.\n" +
                        "\n" +
                        "The example of defining method in object is given below.",
                "<script>  \n" +
                        "function emp(id,name,salary){  \n" +
                        "this.id=id;  \n" +
                        "this.name=name;  \n" +
                        "this.salary=salary;  \n" +
                        "  \n" +
                        "this.changeSalary=changeSalary;  \n" +
                        "function changeSalary(otherSalary){  \n" +
                        "this.salary=otherSalary;  \n" +
                        "}  \n" +
                        "}  \n" +
                        "e=new emp(103,\"MD. Shahadot Hossain\",44000);  \n" +
                        "document.write(e.id+\" \"+e.name+\" \"+e.salary);  \n" +
                        "e.changeSalary(50000);  \n" +
                        "document.write(\"<br>\"+e.id+\" \"+e.name+\" \"+e.salary);  \n" +
                        "</script>",
                "103 MD. Shahadot Hossain 44000\n" +
                        "103 MD. Shahadot Hossain 50000"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //JS Prototype
    private static List<LearnDetailsModel> JSPrototype(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Prototype Object",
                "JavaScript is a prototype-based language that facilitates the objects to acquire properties and features from one another. Here, each object contains a prototype object.\n" +
                        "\n" +
                        "In JavaScript, whenever a function is created the prototype property is added to that function automatically. This property is a prototype object that holds a constructor property.\n" +
                        "\n" +
                        "Syntax:\n" +
                        "ClassName.prototype.methodName  ",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "What is the requirement of a prototype object?",
                "Whenever an object is created in JavaScript, its corresponding functions are loaded into memory. So, a new copy of the function is created on each object creation.\n" +
                        "\n" +
                        "In a prototype-based approach, all the objects share the same function. This ignores the requirement of creating a new copy of function for each object. Thus, the functions are loaded once into the memory.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Prototype Chaining",
                "In JavaScript, each object contains a prototype object that acquires properties and methods from it. Again an object's prototype object may contain a prototype object that also acquires properties and methods, and so on. It can be seen as prototype chaining." +
                        "\n\n" +
                        "Objects <= Employee <= employee1(inherits from prototype)" +
                        "\n\n" +
                        "JavaScript Prototype Object Example:",
                "<script>  \n" +
                        "function Employee(firstName,lastName)  \n" +
                        "{  \n" +
                        "  this.firstName=firstName;  \n" +
                        "  this.lastName=lastName;  \n" +
                        "}  \n" +
                        "  \n" +
                        "Employee.prototype.fullName=function()  \n" +
                        "  {  \n" +
                        "    return this.firstName+\" \"+this.lastName;  \n" +
                        "  }  \n" +
                        "  \n" +
                        "var employee1=new Employee(\"Anne\",\"Moore\");  \n" +
                        "var employee2=new Employee(\"Jack\", \"William\");  \n" +
                        "document.writeln(employee1.fullName()+\"<br>\");  \n" +
                        "document.writeln(employee2.fullName());  \n" +
                        "</script>",
                "Anne Moore\n" +
                        "Jack William"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Constructor Method
    private static List<LearnDetailsModel> JSConstructorMethod(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Constructor Method",
                "A JavaScript constructor method is a special type of method which is used to initialize and create an object. It is called when memory is allocated for an object.\n" +
                        "\n" +
                        "Points to remember\n" +
                        "The constructor keyword is used to declare a constructor method.\n" +
                        "The class can contain one constructor method only.\n" +
                        "JavaScript allows us to use parent class constructor through super keyword.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Constructor Method Example",
                "Let's see a simple example of a constructor method.",
                "<script>  \n" +
                        "class Employee {  \n" +
                        "  constructor() {  \n" +
                        "    this.id=101;  \n" +
                        "    this.name = \"Anne Moore\";  \n" +
                        "  }   \n" +
                        "}  \n" +
                        "var emp = new Employee();  \n" +
                        "document.writeln(emp.id+\" \"+emp.name);  \n" +
                        "</script>",
                "101 Anne Moore"
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //JS Static Method
    private static List<LearnDetailsModel> JSStaticMethod(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Static Method",
                "The JavaScript provides static methods that belong to the class instead of an instance of that class. So, an instance is not required to call the static method. These methods are called directly on the class itself.\n" +
                        "\n" +
                        "Points to remember\n" +
                        "The static keyword is used to declare a static method.\n" +
                        "The static method can be of any name.\n" +
                        "A class can contain more than one static method.\n" +
                        "If we declare more than one static method with a similar name, the JavaScript always invokes the last one.\n" +
                        "The static method can be used to create utility functions.\n" +
                        "We can use this keyword to call a static method within another static method.\n" +
                        "We cannot use this keyword directly to call a static method within the non-static method. In such case, we can call the static method either using the class name or as the property of the constructor.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript static Method Example",
                "Let's see a simple example of a static method.",
                "<script>  \n" +
                        "class Test  \n" +
                        "{  \n" +
                        "  static display()  \n" +
                        "  {  \n" +
                        "    return \"static method is invoked\"  \n" +
                        "  }  \n" +
                        "}  \n" +
                        "document.writeln(Test.display());  \n" +
                        "</script>",
                "static method is invoked"
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //JS Encapsulation
    private static List<LearnDetailsModel> JSEncapsulation(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Encapsulation",
                "The JavaScript Encapsulation is a process of binding the data (i.e. variables) with the functions acting on that data. It allows us to control the data and validate it. To achieve an encapsulation in JavaScript: -\n" +
                        "\n" +
                        "Use var keyword to make data members private.\n" +
                        "Use setter methods to set the data and getter methods to get that data.\n" +
                        "The encapsulation allows us to handle an object using the following properties:\n" +
                        "\n" +
                        "Read/Write - Here, we use setter methods to write the data and getter methods read that data.\n" +
                        "\n" +
                        "Read Only - In this case, we use getter methods only.\n" +
                        "\n" +
                        "\n" +
                        "Write Only - In this case, we use setter methods only.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript Encapsulation Example",
                "Let's see a simple example of encapsulation that contains two data members with its setter and getter methods.",
                "<script>  \n" +
                        "class Students  \n" +
                        "  {  \n" +
                        "    constructor()\n" +
                        "    {  \n" +
                        "       var name;\n" +
                        "       var marks;\n" +
                        "    }  \n" +
                        "        getName()\n" +
                        "        {  \n" +
                        "          return this.name;\n" +
                        "        }  \n" +
                        "      setName(name)\n" +
                        "      {  \n" +
                        "        this.name=name;\n" +
                        "      }\n" +
                        "        \n" +
                        "      getMarks()\n" +
                        "      {  \n" +
                        "        return this.marks;\n" +
                        "      }  \n" +
                        "    setMarks(marks)\n" +
                        "    {  \n" +
                        "      this.marks=marks;\n" +
                        "    }  \n" +
                        "  \n" +
                        "    }  \n" +
                        "    var student=new Students();\n" +
                        "     student.setName(\"Anne\");\n" +
                        "     student.setMarks(84);  \n" +
                        "     document.writeln(stud.getName()+\" \"+stud.getMarks());\n" +
                        "</script>",
                "Anne 84"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript Encapsulation Example: Prototype-based approach",
                "Here, we perform prototype-based encapsulation.",
                "<script>  \n" +
                        "function Student(name,marks)  \n" +
                        "{  \n" +
                        "  var s_name=name;  \n" +
                        "  var s_marks=marks;  \n" +
                        "  Object.defineProperty(this,\"name\",{  \n" +
                        "    get:function()  \n" +
                        "    {  \n" +
                        "      return s_name;  \n" +
                        "    },  \n" +
                        "  set:function(s_name)  \n" +
                        "  {  \n" +
                        "    this.s_name=s_name;  \n" +
                        "  }  \n" +
                        "    \n" +
                        "});  \n" +
                        "   \n" +
                        "    Object.defineProperty(this,\"marks\",{  \n" +
                        "    get:function()  \n" +
                        "    {  \n" +
                        "      return s_marks;  \n" +
                        "    },  \n" +
                        "  set:function(s_marks)  \n" +
                        "  {  \n" +
                        "    this.s_marks=s_marks;  \n" +
                        "  }  \n" +
                        "    \n" +
                        "});  \n" +
                        "    \n" +
                        "}  \n" +
                        "  var stud=new Student(\"Anne\",84);  \n" +
                        "  document.writeln(stud.name+\" \"+stud.marks);  \n" +
                        "</script>",
                "Anne 84"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Inheritance
    private static List<LearnDetailsModel> JSInheritance(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Inheritance",
                "The JavaScript inheritance is a mechanism that allows us to create new classes on the basis of already existing classes. It provides flexibility to the child class to reuse the methods and variables of a parent class.\n" +
                        "\n" +
                        "The JavaScript extends keyword is used to create a child class on the basis of a parent class. It facilitates child class to acquire all the properties and behavior of its parent class.\n" +
                        "\n" +
                        "Points to remember\n" +
                        "It maintains an IS-A relationship.\n" +
                        "The extends keyword is used in class expressions or class declarations.\n" +
                        "Using extends keyword, we can acquire all the properties and behavior of the inbuilt object as well as custom classes.\n" +
                        "We can also use a prototype-based approach to achieve inheritance.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript extends Example: inbuilt object",
                "In this example, we extends Date object to display today's date.",
                "<script>  \n" +
                        "class Moment extends Date {  \n" +
                        "  constructor() {  \n" +
                        "    super();  \n" +
                        "  }}  \n" +
                        "var m=new Moment();  \n" +
                        "document.writeln(\"Current date:\")  \n" +
                        "document.writeln(m.getDate()+\"-\"+(m.getMonth()+1)+\"-\"+m.getFullYear());  \n" +
                        "</script>",
                "Current date: 01-01-2022"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "JavaScript extends Example: a Prototype-based approach",
                "Here, we perform prototype-based inheritance. In this approach, there is no need to use class and extends keywords.",
                "<script>  \n" +
                        "function Bike(company)  \n" +
                        "{  \n" +
                        "    this.company=company;   \n" +
                        "}  \n" +
                        "  \n" +
                        "Bike.prototype.getCompany=function()  \n" +
                        "{  \n" +
                        "  return this.company;  \n" +
                        "}  \n" +
                        "function Vehicle(name,price) {  \n" +
                        " this.name=name;  \n" +
                        "  this.price=price;  \n" +
                        "  }   \n" +
                        "var bike = new Bike(\"Royal Enfield\");  \n" +
                        "Vehicle.prototype=bike;\n" +
                        "var vehicle=new Vehicle(\"Interceptor\",300000);  \n" +
                        "document.writeln(vehicle.getCompany()+\" \"+vehicle.name+\" \"+vehicle.price);  \n" +
                        "</script>",
                "Royal Enfield Interceptor 300000"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Polymorphism
    private static List<LearnDetailsModel> JSPolymorphism(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Polymorphism",
                "The polymorphism is a core concept of an object-oriented paradigm that provides a way to perform a single action in different forms. It provides an ability to call the same method on different JavaScript objects. As JavaScript is not a type-safe language, we can pass any type of data members with the methods.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript Polymorphism Example",
                "Let's see an example where a child class object invokes the parent class method.",
                "<script>  \n" +
                        "function A()  \n" +
                        "{  \n" +
                        "}  \n" +
                        "A.prototype.display=function()  \n" +
                        "{  \n" +
                        "  return \"A is invoked\";  \n" +
                        "}  \n" +
                        "function B()  \n" +
                        "{  \n" +
                        "    \n" +
                        "}  \n" +
                        "  \n" +
                        "B.prototype=Object.create(A.prototype);  \n" +
                        "  \n" +
                        "var a=[new A(), new B()]  \n" +
                        "  \n" +
                        "a.forEach(function(msg)  \n" +
                        "{  \n" +
                        "  document.writeln(msg.display()+\"<br>\");  \n" +
                        "});  \n" +
                        "<script>",
                "A is invoked\n" +
                        "B is invoked"
        );
        list.add(l1);
        list.add(l2);

        return list;
    }
    //JS Abstraction
    private static List<LearnDetailsModel> JSAbstraction(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Abstraction",
                "An abstraction is a way of hiding the implementation details and showing only the functionality to the users. In other words, it ignores the irrelevant details and shows only the required one.\n" +
                        "\n" +
                        "Points to remember\n" +
                        "We cannot create an instance of Abstract Class.\n" +
                        "It reduces the duplication of code.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "JavaScript Abstraction Example",
                "Let's check whether we can create an instance of Abstract class or not.",
                "<script>  \n" +
                        " function Vehicle()  \n" +
                        "{  \n" +
                        "    this.vehicleName=\"vehicleName\";  \n" +
                        "    throw new Error(\"You cannot create an instance of Abstract Class\");  \n" +
                        "}  \n" +
                        "Vehicle.prototype.display=function()  \n" +
                        "{  \n" +
                        "    return \"Vehicle is: \"+this.vehicleName;  \n" +
                        "}  \n" +
                        "function Bike(vehicleName)  \n" +
                        "{  \n" +
                        "    this.vehicleName=vehicleName;  \n" +
                        "}  \n" +
                        "Bike.prototype=Object.create(Vehicle.prototype);  \n" +
                        "var bike=new Bike(\"Royal Enfield\");  \n" +
                        "document.writeln(bike.display());  \n" +
                        " </script>",
                "Vehicle is: Royal Enfield"
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //DOM
    //HTML DOM
    private static List<LearnDetailsModel> HTMLDOM(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Introductions",
                "With the HTML DOM, JavaScript can access and change all the elements of an HTML document." +
                        "\n" +
                        "When a web page is loaded, the browser creates a Document Object Model of the page. The HTML DOM model is constructed as a tree of Objects" +
                        "\n\n" +
                        "With the object model, JavaScript gets all the power it needs to create dynamic HTML:\n" +
                        "\n" +
                        "JavaScript can change all the HTML elements in the page\n" +
                        "JavaScript can change all the HTML attributes in the page\n" +
                        "JavaScript can change all the CSS styles in the page\n" +
                        "JavaScript can remove existing HTML elements and attributes\n" +
                        "JavaScript can add new HTML elements and attributes\n" +
                        "JavaScript can react to all existing HTML events in the page\n" +
                        "JavaScript can create new HTML events in the page",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "What is the DOM?",
                "The DOM is a W3C (World Wide Web Consortium) standard.\n" +
                        "\n" +
                        "The DOM defines a standard for accessing documents:\n" +
                        "\n" +
                        "\"The W3C Document Object Model (DOM) is a platform and language-neutral interface that allows programs and scripts to dynamically access and update the content, structure, and style of a document.\"\n" +
                        "\n" +
                        "The W3C DOM standard is separated into 3 different parts:\n" +
                        "\n" +
                        "Core DOM - standard model for all document types\n" +
                        "XML DOM - standard model for XML documents\n" +
                        "HTML DOM - standard model for HTML documents",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "What is the HTML DOM?",
                "The HTML DOM is a standard object model and programming interface for HTML. It defines:\n" +
                        "\n" +
                        "The HTML elements as objects\n" +
                        "The properties of all HTML elements\n" +
                        "The methods to access all HTML elements\n" +
                        "The events for all HTML elements\n" +
                        "In other words: The HTML DOM is a standard for how to get, change, add, or delete HTML elements.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //DOM Methods
    private static List<LearnDetailsModel> DOMMethods(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "HTML DOM Methods",
                "HTML DOM methods are actions you can perform (on HTML Elements).\n" +
                        "\n" +
                        "HTML DOM properties are values (of HTML Elements) that you can set or change.\n" +
                        "\n" +
                        "The DOM Programming Interface\n" +
                        "The HTML DOM can be accessed with JavaScript (and with other programming languages).\n" +
                        "\n" +
                        "In the DOM, all HTML elements are defined as objects.\n" +
                        "\n" +
                        "The programming interface is the properties and methods of each object.\n" +
                        "\n" +
                        "A property is a value that you can get or set (like changing the content of an HTML element).\n" +
                        "\n" +
                        "A method is an action you can do (like add or deleting an HTML element).",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example",
                "The following example changes the content (the innerHTML) of the <p> element with id=\"demo\":" +
                        "\n" +
                        "In the example bellow, getElementById is a method, while innerHTML is a property.",
                "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML = \"Hello World!\";\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                "Hello World!"
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //DOM Documents
    private static List<LearnDetailsModel> DOMDocuments(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "HTML DOM Document",
                "The HTML DOM document object is the owner of all other objects in your web page.\n" +
                        "\n" +
                        "The HTML DOM Document Object\n" +
                        "The document object represents your web page.\n" +
                        "\n" +
                        "If you want to access any element in an HTML page, you always start with accessing the document object.\n" +
                        "\n" +
                        "Below are some examples of how you can use the document object to access and manipulate HTML." +
                        "\n\n" +
                        "Finding HTML Elements" +
                        "\n\n" +
                        "document.getElementById(id) => Find an element by element id\n" +
                        "document.getElementsByTagName(name) => Find elements by tag name\n" +
                        "document.getElementsByClassName(name) => Find elements by class name" +
                        "\n\n" +
                        "Changing HTML Elements" +
                        "\n\n" +
                        "element.innerHTML =  new html content => Change the inner HTML of an element\n" +
                        "element.attribute = new value => Change the attribute value of an HTML element\n" +
                        "element.style.property = new style => Change the style of an HTML element" +
                        "\n\n" +
                        "Adding and Deleting Elements" +
                        "\n\n" +
                        "document.createElement(element) => Create an HTML element\n" +
                        "document.removeChild(element) => Remove an HTML element\n" +
                        "document.appendChild(element) => Add an HTML element\n" +
                        "document.replaceChild(new, old) => Replace an HTML element\n" +
                        "document.write(text) => Write into the HTML output stream",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Finding HTML Objects",
                "The first HTML DOM Level 1 (1998), defined 11 HTML objects, object collections, and properties. These are still valid in HTML5.\n" +
                        "\n" +
                        "Later, in HTML DOM Level 3, more objects, collections, and properties were added." +
                        "\n\n" +
                        "document.anchors=> Returns all <a> elements that have a name attribute=> 1\n" +
                        "document.applets=> Deprecated=> 1\n" +
                        "document.baseURI=> Returns the absolute base URI of the document=> 3\n" +
                        "document.body=> Returns the <body> element=> 1\n" +
                        "document.cookie=> Returns the document's cookie=> 1\n" +
                        "document.doctype=> Returns the document's doctype=> 3\n" +
                        "document.documentElement=> Returns the <html> element=> 3\n" +
                        "document.documentMode=> Returns the mode used by the browser=> 3\n" +
                        "document.documentURI=> Returns the URI of the document=> 3\n" +
                        "document.domain=> Returns the domain name of the document server=> 1\n" +
                        "document.domConfig=> Obsolete.=> 3\n" +
                        "document.embeds=> Returns all <embed> elements=> 3\n" +
                        "document.forms=> Returns all <form> elements=> 1\n" +
                        "document.head=> Returns the <head> element=> 3\n" +
                        "document.images=> Returns all <img> elements=> 1\n" +
                        "document.implementation=> Returns the DOM implementation=> 3\n" +
                        "document.inputEncoding=> Returns the document's encoding (character set)=> 3\n" +
                        "document.lastModified=> Returns the date and time the document was updated=> 3\n" +
                        "document.links=> Returns all <area> and <a> elements that have a href attribute=> 1\n" +
                        "document.readyState=> Returns the (loading) status of the document=> 3\n" +
                        "document.referrer=> Returns the URI of the referrer (the linking document)=> 1\n" +
                        "document.scripts=> Returns all <script> elements=> 3\n" +
                        "document.strictErrorChecking=> Returns if error checking is enforced=> 3\n" +
                        "document.title=> Returns the <title> element=> 1\n" +
                        "document.URL=> Returns the complete URL of the document=> 1",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        return list;
    }
    //DOM Elements
    private static List<LearnDetailsModel> DOMElements(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "HTML DOM Elements",
                "This page teaches you how to find and access HTML elements in an HTML page.\n" +
                        "\n" +
                        "Finding HTML Elements\n" +
                        "Often, with JavaScript, you want to manipulate HTML elements.\n" +
                        "\n" +
                        "To do so, you have to find the elements first. There are several ways to do this:\n" +
                        "\n" +
                        "Finding HTML elements by id\n" +
                        "Finding HTML elements by tag name\n" +
                        "Finding HTML elements by class name\n" +
                        "Finding HTML elements by CSS selectors\n" +
                        "Finding HTML elements by HTML object collections\n" +
                        "Finding HTML Element by Id\n" +
                        "The easiest way to find an HTML element in the DOM, is by using the element id.\n" +
                        "\n" +
                        "This example finds the element with id=\"intro\":",
                "const element = document.getElementById(\"intro\");",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Finding HTML Elements by Tag Name",
                "This example finds all <p> elements:",
                "const element = document.getElementsByTagName(\"p\");",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Finding HTML Elements by Class Name",
                "If you want to find all HTML elements with the same class name, use getElementsByClassName().\n" +
                        "This example returns a list of all elements with class=\"intro\".",
                "const x = document.getElementsByClassName(\"intro\");",
                ""
        );final LearnDetailsModel l4 = new LearnDetailsModel(
                "Finding HTML Elements by CSS Selectors",
                "If you want to find all HTML elements that match a specified CSS selector (id, class names, types, attributes, values of attributes, etc), use the querySelectorAll() method.\n" +
                        "This example returns a list of all <p> elements with class=\"intro\".",
                "const x = document.querySelectorAll(\"p.intro\");",
                ""
        );final LearnDetailsModel l5 = new LearnDetailsModel(
                "Finding HTML Elements by HTML Object Collections",
                "This example finds the form element with id=\"frm1\", in the forms collection, and displays all element values:",
                "const x = document.forms[\"frm1\"];\n" +
                        "let text = \"\";\n" +
                        "for (let i = 0; i < x.length; i++) {\n" +
                        "  text += x.elements[i].value + \"<br>\";\n" +
                        "}\n" +
                        "document.getElementById(\"demo\").innerHTML = text;",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //DOM HTML
    private static List<LearnDetailsModel> DOMHTML(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "HTML DOM - Changing HTML",
                "The HTML DOM allows JavaScript to change the content of HTML elements.\n" +
                        "\n" +
                        "Changing HTML Content\n" +
                        "The easiest way to modify the content of an HTML element is by using the innerHTML property.\n" +
                        "\n" +
                        "To change the content of an HTML element, use this syntax:\n" +
                        "\n" +
                        "document.getElementById(id).innerHTML = new HTML\n" +
                        "This example changes the content of a <p> element:",
                "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p id=\"p1\">Hello World!</p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"p1\").innerHTML = \"New text!\";\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                "New text!"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Changing the Value of an Attribute",
                "To change the value of an HTML attribute, use this syntax:\n" +
                        "\n" +
                        "document.getElementById(id).attribute = new value\n" +
                        "This example changes the value of the src attribute of an <img> element:",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<img id=\"myImage\" src=\"smiley.gif\">\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"myImage\").src = \"landscape.jpg\";\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Dynamic HTML content",
                "JavaScript can create dynamic HTML content:\n" +
                        "\n" +
                        "Date : Sat Jan 01 2022 21:46:47 GMT+0600",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML = \"Date : \" + Date(); </script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                "Date : Sat Jan 01 2022 21:50:02 GMT+0600"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "document.write()",
                "In JavaScript, document.write() can be used to write directly to the HTML output stream:",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p>Bla bla bla</p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.write(Date());\n" +
                        "</script>\n" +
                        "\n" +
                        "<p>Bla bla bla</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                "Bla, bla, bla\n" +
                        "\n" +
                        "Sat Jan 01 2022 21:50:27 GMT+0600\n" +
                        "Bla, bla, bla"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //DOM Forms
    private static List<LearnDetailsModel> DOMForms(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Form Validation",
                "HTML form validation can be done by JavaScript.\n" +
                        "\n" +
                        "If a form field (fname) is empty, this function alerts a message, and returns false, to prevent the form from being submitted:",
                "function validateForm() {\n" +
                        "  let x = document.forms[\"myForm\"][\"fname\"].value;\n" +
                        "  if (x == \"\") {\n" +
                        "    alert(\"Name must be filled out\");\n" +
                        "    return false;\n" +
                        "  }\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Automatic HTML Form Validation",
                "HTML form validation can be performed automatically by the browser:\n" +
                        "\n" +
                        "If a form field (fname) is empty, the required attribute prevents this form from being submitted:",
                "<form action=\"/action_page.php\" method=\"post\">\n" +
                        "  <input type=\"text\" name=\"fname\" required>\n" +
                        "  <input type=\"submit\" value=\"Submit\">\n" +
                        "</form>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Data Validation",
                "Data validation is the process of ensuring that user input is clean, correct, and useful.\n" +
                        "\n" +
                        "Typical validation tasks are:\n" +
                        "\n" +
                        "has the user filled in all required fields?\n" +
                        "has the user entered a valid date?\n" +
                        "has the user entered text in a numeric field?\n" +
                        "Most often, the purpose of data validation is to ensure correct user input.\n" +
                        "\n" +
                        "Validation can be defined by many different methods, and deployed in many different ways.\n" +
                        "\n" +
                        "Server side validation is performed by a web server, after input has been sent to the server.\n" +
                        "\n" +
                        "Client side validation is performed by a web browser, before input is sent to a web server.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //DOM CSS
    private static List<LearnDetailsModel> DOMCSS(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "HTML DOM - Changing CSS",
                "The HTML DOM allows JavaScript to change the style of HTML elements.\n" +
                        "\n" +
                        "Changing HTML Style\n" +
                        "To change the style of an HTML element, use this syntax:\n" +
                        "\n" +
                        "document.getElementById(id).style.property = new style\n" +
                        "The following example changes the style of a <p> element:",
                "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p id=\"p2\">Hello World!</p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"p2\").style.color = \"blue\";\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Using Events",
                "The HTML DOM allows you to execute code when an event occurs.\n" +
                        "\n" +
                        "Events are generated by the browser when \"things happen\" to HTML elements:\n" +
                        "\n" +
                        "An element is clicked on\n" +
                        "The page has loaded\n" +
                        "Input fields are changed\n" +
                        "You will learn more about events in the next chapter of this tutorial.\n" +
                        "\n" +
                        "This example changes the style of the HTML element with id=\"id1\", when the user clicks a button:",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1 id=\"id1\">My Heading 1</h1>\n" +
                        "\n" +
                        "<button type=\"button\"\n" +
                        "onclick=\"document.getElementById('id1').style.color = 'red'\">\n" +
                        "Click Me!</button>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //DOM Animations
    private static List<LearnDetailsModel> DOMAnimations(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "A Basic Web Page",
                "Learn to create HTML animations using JavaScript. To demonstrate how to create HTML animations with JavaScript, we will use a simple web page:",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>My First JavaScript Animation</h1>\n" +
                        "\n" +
                        "<div id=\"animation\">My animation will go here</div>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Create an Animation Container",
                "All animations should be relative to a container element.",
                "<div id =\"container\">\n" +
                        "  <div id =\"animate\">My animation will go here</div>\n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Style the Elements",
                "The container element should be created with style = \"position: relative\".\n" +
                        "\n" +
                        "The animation element should be created with style = \"position: absolute\".",
                "#container {\n" +
                        "  width: 400px;\n" +
                        "  height: 400px;\n" +
                        "  position: relative;\n" +
                        "  background: yellow;\n" +
                        "}\n" +
                        "#animate {\n" +
                        "  width: 50px;\n" +
                        "  height: 50px;\n" +
                        "  position: absolute;\n" +
                        "  background: red;\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Animation Code",
                "JavaScript animations are done by programming gradual changes in an element's style.\n" +
                        "\n" +
                        "The changes are called by a timer. When the timer interval is small, the animation looks continuous.\n" +
                        "\n" +
                        "The basic code is:",
                "id = setInterval(frame, 5);\n" +
                        "\n" +
                        "function frame() {\n" +
                        "  if (/* test for finished */) {\n" +
                        "    clearInterval(id);\n" +
                        "  } else {\n" +
                        "    /* code to change the element style */ \n" +
                        "  }\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Full Animation",
                "Create the Full Animation Using JavaScript",
                "function myMove() {\n" +
                        "  let id = null;\n" +
                        "  const elem = document.getElementById(\"animate\");\n" +
                        "  let pos = 0;\n" +
                        "  clearInterval(id);\n" +
                        "  id = setInterval(frame, 5);\n" +
                        "  function frame() {\n" +
                        "    if (pos == 350) {\n" +
                        "      clearInterval(id);\n" +
                        "    } else {\n" +
                        "      pos++;\n" +
                        "      elem.style.top = pos + 'px';\n" +
                        "      elem.style.left = pos + 'px';\n" +
                        "    }\n" +
                        "  }\n" +
                        "}",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //BOM
    //JavaScript Window
    private static List<LearnDetailsModel> JSWindow(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Window",
                "The Browser Object Model (BOM) allows JavaScript to \"talk to\" the browser.\n" +
                        "\n" +
                        "The Browser Object Model (BOM)\n" +
                        "There are no official standards for the Browser Object Model (BOM).\n" +
                        "\n" +
                        "Since modern browsers have implemented (almost) the same methods and properties for JavaScript interactivity, it is often referred to, as methods and properties of the BOM.\n" +
                        "\n" +
                        "The Window Object\n" +
                        "The window object is supported by all browsers. It represents the browser's window.\n" +
                        "\n" +
                        "All global JavaScript objects, functions, and variables automatically become members of the window object.\n" +
                        "\n" +
                        "Global variables are properties of the window object.\n" +
                        "\n" +
                        "Global functions are methods of the window object.\n" +
                        "\n" +
                        "Even the document object (of the HTML DOM) is a property of the window object:\n" +
                        "\n" +
                        "window.document.getElementById(\"header\");\n" +
                        "is the same as:\n" +
                        "\n" +
                        "document.getElementById(\"header\");",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Window Size",
                "Two properties can be used to determine the size of the browser window.\n" +
                        "\n" +
                        "Both properties return the sizes in pixels:\n" +
                        "\n" +
                        "window.innerHeight - the inner height of the browser window (in pixels)\n" +
                        "window.innerWidth - the inner width of the browser window (in pixels)\n" +
                        "The browser window (the browser viewport) is NOT including toolbars and scrollbars.",
                "let w = window.innerWidth;\n" +
                        "let h = window.innerHeight;",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Other Window Methods",
                "Some other methods:\n" +
                        "\n" +
                        "window.open() - open a new window\n" +
                        "window.close() - close the current window\n" +
                        "window.moveTo() - move the current window\n" +
                        "window.resizeTo() - resize the current window",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //JS Screen
    private static List<LearnDetailsModel> JSScreen(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Window Screen",
                "The window.screen object contains information about the user's screen.The window.screen object can be written without the window prefix.\n" +
                        "\n" +
                        "Properties:\n" +
                        "\n" +
                        "screen.width\n" +
                        "screen.height\n" +
                        "screen.availWidth\n" +
                        "screen.availHeight\n" +
                        "screen.colorDepth\n" +
                        "screen.pixelDepth",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Window Screen Width",
                "The screen.width property returns the width of the visitor's screen in pixels.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Screen Width: \" + screen.width;",
                "Screen Width: 1549"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Window Screen Height",
                "The screen.height property returns the height of the visitor's screen in pixels.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Screen Height: \" + screen.height;",
                "Screen Height: 872"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Window Screen Available Width",
                "The screen.availWidth property returns the width of the visitor's screen, in pixels, minus interface features like the Windows Taskbar.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Available Screen Width: \" + screen.availWidth;",
                "Available Screen Width: 1549"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Window Screen Available Height",
                "The screen.availHeight property returns the height of the visitor's screen, in pixels, minus interface features like the Windows Taskbar.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Available Screen Height: \" + screen.availHeight;",
                "Available Screen Height: 848"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Window Screen Color Depth",
                "The screen.colorDepth property returns the number of bits used to display one color.\n" +
                        "\n" +
                        "All modern computers use 24 bit or 32 bit hardware for color resolution:\n" +
                        "\n" +
                        "24 bits =      16,777,216 different \"True Colors\"\n" +
                        "32 bits = 4,294,967,296 different \"Deep Colors\"\n" +
                        "Older computers used 16 bits: 65,536 different \"High Colors\" resolution.\n" +
                        "\n" +
                        "Very old computers, and old cell phones used 8 bits: 256 different \"VGA colors\".",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Screen Color Depth: \" + screen.colorDepth;",
                "Screen Color Depth: 24"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Window Screen Pixel Depth",
                "The screen.pixelDepth property returns the pixel depth of the screen.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Screen Pixel Depth: \" + screen.pixelDepth;",
                "Screen Pixel Depth: 24"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);

        return list;
    }
    //JS Location
    private static List<LearnDetailsModel> JSLocation(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Window Location",
                "The window.location object can be used to get the current page address (URL) and to redirect the browser to a new page." +
                        "\n\n" +
                        "The window.location object can be written without the window prefix.\n" +
                        "\n" +
                        "Some examples:\n" +
                        "\n" +
                        "window.location.href returns the href (URL) of the current page\n" +
                        "window.location.hostname returns the domain name of the web host\n" +
                        "window.location.pathname returns the path and filename of the current page\n" +
                        "window.location.protocol returns the web protocol used (http: or https:)\n" +
                        "window.location.assign() loads a new document",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Window Location Href",
                "The window.location.href property returns the URL of the current page.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Page location is \" + window.location.href;",
                "Page location is https://www.shrcreation.com/"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Window Location Hostname",
                "The window.location.hostname property returns the name of the internet host (of the current page).",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Page hostname is \" + window.location.hostname;",
                "Page hostname is www.shrcreation.com"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Window Location Pathname",
                "The window.location.pathname property returns the pathname of the current page.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Page path is \" + window.location.pathname;",
                "Page path is /js/js_window_location.asp"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Window Location Protocol",
                "The window.location.protocol property returns the web protocol of the page.",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Page protocol is \" + window.location.protocol;",
                "Page protocol is https:"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Window Location Port",
                "The window.location.port property returns the number of the internet host port (of the current page).",
                "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"Port number is \" + window.location.port;",
                "Port number is 443"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Window Location Assign",
                "The window.location.assign() method loads a new document.",
                "<html>\n" +
                        "<head>\n" +
                        "<script>\n" +
                        "function newDoc() {\n" +
                        "  window.location.assign(\"https://www.shrcreation.com\")\n" +
                        "}\n" +
                        "</script>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<input type=\"button\" value=\"Load new document\" onclick=\"newDoc()\">\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                "https://www.shrcreation.com/"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);

        return list;
    }
    //JS History
    private static List<LearnDetailsModel> JSHistory(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Window History",
                "The window.history object contains the browsers history.The window.history object can be written without the window prefix.\n" +
                        "\n" +
                        "To protect the privacy of the users, there are limitations to how JavaScript can access this object.\n" +
                        "\n" +
                        "Some methods:\n" +
                        "\n" +
                        "history.back() - same as clicking back in the browser\n" +
                        "history.forward() - same as clicking forward in the browser",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Window History Back",
                "The history.back() method loads the previous URL in the history list.\n" +
                        "\n" +
                        "This is the same as clicking the Back button in the browser.",
                "<html>\n" +
                        "<head>\n" +
                        "<script>\n" +
                        "function goBack() {\n" +
                        "  window.history.back()\n" +
                        "}\n" +
                        "</script>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<input type=\"button\" value=\"Back\" onclick=\"goBack()\">\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Window History Forward",
                "The history.forward() method loads the next URL in the history list.\n" +
                        "\n" +
                        "This is the same as clicking the Forward button in the browser.",
                "<html>\n" +
                        "<head>\n" +
                        "<script>\n" +
                        "function goForward() {\n" +
                        "  window.history.forward()\n" +
                        "}\n" +
                        "</script>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<input type=\"button\" value=\"Forward\" onclick=\"goForward()\">\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Navigator
    private static List<LearnDetailsModel> JSNavigator(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Window Navigator",
                "The window.navigator object contains information about the visitor's browser.The window.navigator object can be written without the window prefix.\n" +
                        "\n" +
                        "Some examples:\n" +
                        "\n" +
                        "navigator.appName\n" +
                        "navigator.appCodeName\n" +
                        "navigator.platform",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Browser Cookies",
                "The cookieEnabled property returns true if cookies are enabled, otherwise false:",
                "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"cookiesEnabled is \" + navigator.cookieEnabled;\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Browser Application Name",
                "The appName property returns the application name of the browser:",
                "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"navigator.appName is \" + navigator.appName;\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Browser Application Code Name",
                "The appCodeName property returns the application code name of the browser:",
                "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML =\n" +
                        "\"navigator.appCodeName is \" + navigator.appCodeName;\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The Browser Platform",
                "The platform property returns the browser platform (operating system):",
                "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML = navigator.platform;\n" +
                        "</script>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //JS Timing
    private static List<LearnDetailsModel> JSTiming(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Timing Events",
                "The window object allows execution of code at specified time intervals.\n" +
                        "\n" +
                        "These time intervals are called timing events.\n" +
                        "\n" +
                        "The two key methods to use with JavaScript are:\n" +
                        "\n" +
                        "setTimeout(function, milliseconds)\n" +
                        "Executes a function, after waiting a specified number of milliseconds.\n" +
                        "\n" +
                        "setInterval(function, milliseconds)\n" +
                        "Same as setTimeout(), but repeats the execution of the function continuously.\n" +
                        "The setTimeout() and setInterval() are both methods of the HTML DOM Window object.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The setTimeout() Method",
                "The window.setTimeout() method can be written without the window prefix.\n" +
                        "\n" +
                        "The first parameter is a function to be executed.\n" +
                        "\n" +
                        "The second parameter indicates the number of milliseconds before execution." +
                        "\n\n" +
                        "window.setTimeout(function, milliseconds);",
                "<button onclick=\"setTimeout(myFunction, 3000)\">Try it</button>\n" +
                        "\n" +
                        "<script>\n" +
                        "function myFunction() {\n" +
                        "  alert('Hello');\n" +
                        "}\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "How to Stop the Execution?",
                "The clearTimeout() method stops the execution of the function specified in setTimeout().\n" +
                        "\n" +
                        "window.clearTimeout(timeoutVariable)\n" +
                        "The window.clearTimeout() method can be written without the window prefix.\n" +
                        "\n" +
                        "The clearTimeout() method uses the variable returned from setTimeout():\n" +
                        "\n" +
                        "myVar = setTimeout(function, milliseconds);\n" +
                        "clearTimeout(myVar);\n" +
                        "If the function has not already been executed, you can stop the execution by calling the clearTimeout() method:",
                "<button onclick=\"myVar = setTimeout(myFunction, 3000)\">Try it</button>\n" +
                        "\n" +
                        "<button onclick=\"clearTimeout(myVar)\">Stop it</button>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The setInterval() Method",
                "The setInterval() method repeats a given function at every given time-interval.\n" +
                        "\n" +
                        "window.setInterval(function, milliseconds);\n" +
                        "The window.setInterval() method can be written without the window prefix.\n" +
                        "\n" +
                        "The first parameter is the function to be executed.\n" +
                        "\n" +
                        "The second parameter indicates the length of the time-interval between each execution.\n" +
                        "\n" +
                        "This example executes a function called \"myTimer\" once every second (like a digital watch).",
                "setInterval(myTimer, 1000);\n" +
                        "\n" +
                        "function myTimer() {\n" +
                        "  const d = new Date();\n" +
                        "  document.getElementById(\"demo\").innerHTML = d.toLocaleTimeString();\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "How to Stop the Execution?",
                "The clearInterval() method stops the executions of the function specified in the setInterval() method.\n" +
                        "\n" +
                        "window.clearInterval(timerVariable)\n" +
                        "The window.clearInterval() method can be written without the window prefix.\n" +
                        "\n" +
                        "The clearInterval() method uses the variable returned from setInterval():\n" +
                        "\n" +
                        "let myVar = setInterval(function, milliseconds);\n" +
                        "clearInterval(myVar);",
                "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<button onclick=\"clearInterval(myVar)\">Stop time</button>\n" +
                        "\n" +
                        "<script>\n" +
                        "let myVar = setInterval(myTimer, 1000);\n" +
                        "function myTimer() {\n" +
                        "  const d = new Date();\n" +
                        "  document.getElementById(\"demo\").innerHTML = d.toLocaleTimeString();\n" +
                        "}\n" +
                        "</script>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //JS Cookies
    private static List<LearnDetailsModel> JSCookies(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What are Cookies?",
                "Cookies are data, stored in small text files, on your computer.\n" +
                        "\n" +
                        "When a web server has sent a web page to a browser, the connection is shut down, and the server forgets everything about the user.\n" +
                        "\n" +
                        "Cookies were invented to solve the problem \"how to remember information about the user\":\n" +
                        "\n" +
                        "When a user visits a web page, his/her name can be stored in a cookie.\n" +
                        "Next time the user visits the page, the cookie \"remembers\" his/her name.\n" +
                        "Cookies are saved in name-value pairs like:\n" +
                        "\n" +
                        "username = John Doe\n" +
                        "When a browser requests a web page from a server, cookies belonging to the page are added to the request. This way the server gets the necessary data to \"remember\" information about users.\n" +
                        "\n" +
                        "None of the examples below will work if your browser has local cookies support turned off.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Create a Cookie with JavaScript",
                "JavaScript can create, read, and delete cookies with the document.cookie property.\n" +
                        "\n" +
                        "With JavaScript, a cookie can be created like this:\n" +
                        "\n" +
                        "document.cookie = \"username=Anne Moore\";\n" +
                        "You can also add an expiry date (in UTC time). By default, the cookie is deleted when the browser is closed:\n" +
                        "\n" +
                        "document.cookie = \"username=Anne Moore; expires=Thu, 1 Jan 2022 12:00:00 UTC\";\n" +
                        "With a path parameter, you can tell the browser what path the cookie belongs to. By default, the cookie belongs to the current page.\n" +
                        "\n" +
                        "document.cookie = \"username=Anne Moore; expires=Thu, 1 Jan 2022 12:00:00 UTC; path=/\";" +
                        "\n\n" +
                        "Read a Cookie with JavaScript" +
                        "\n\n" +
                        "With JavaScript, cookies can be read like this:\n" +
                        "\n" +
                        "var x = document.cookie;" +
                        "\n\n" +
                        "Change a Cookie with JavaScript" +
                        "\n\n" +
                        "With JavaScript, you can change a cookie the same way as you create it:\n" +
                        "\n" +
                        "document.cookie = \"username=John Smith; expires=Thu, 1 Jan 2022 12:00:00 UTC; path=/\";\n" +
                        "The old cookie is overwritten.\n" +
                        "\n\n" +
                        "Delete a Cookie with JavaScript" +
                        "\n\n" +
                        "Deleting a cookie is very simple.\n" +
                        "\n" +
                        "You don't have to specify a cookie value when you delete a cookie.\n" +
                        "\n" +
                        "Just set the expires parameter to a past date:\n" +
                        "\n" +
                        "document.cookie = \"username=; expires=Thu, 01 Jan 2022 00:00:00 UTC; path=/;\";",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The Cookie String",
                "The document.cookie property looks like a normal text string. But it is not.\n" +
                        "\n" +
                        "Even if you write a whole cookie string to document.cookie, when you read it out again, you can only see the name-value pair of it.\n" +
                        "\n" +
                        "If you set a new cookie, older cookies are not overwritten. The new cookie is added to document.cookie, so if you read document.cookie again you will get something like:\n" +
                        "\n" +
                        "cookie1 = value; cookie2 = value;",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "JavaScript Cookie Example",
                "In the example to follow, we will create a cookie that stores the name of a visitor.\n" +
                        "\n" +
                        "The first time a visitor arrives to the web page, he/she will be asked to fill in his/her name. The name is then stored in a cookie.\n" +
                        "\n" +
                        "The next time the visitor arrives at the same page, he/she will get a welcome message.\n" +
                        "\n" +
                        "For the example we will create 3 JavaScript functions:\n" +
                        "\n" +
                        "A function to set a cookie value\n" +
                        "A function to get a cookie value\n" +
                        "A function to check a cookie value",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "A Function to Set a Cookie",
                "First, we create a function that stores the name of the visitor in a cookie variable:\n\n" +
                        "Example explained:\n" +
                        "\n" +
                        "The parameters of the function above are the name of the cookie (cname), the value of the cookie (cvalue), and the number of days until the cookie should expire (exdays).\n" +
                        "\n" +
                        "The function sets a cookie by adding together the cookiename, the cookie value, and the expires string.",
                "function setCookie(cname, cvalue, exdays) {\n" +
                        "  const d = new Date();\n" +
                        "  d.setTime(d.getTime() + (exdays*24*60*60*1000));\n" +
                        "  let expires = \"expires=\"+ d.toUTCString();\n" +
                        "  document.cookie = cname + \"=\" + cvalue + \";\" + expires + \";path=/\";\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "A Function to Get a Cookie",
                "Then, we create a function that returns the value of a specified cookie:" +
                        "\n\n" +
                        "Function explained:\n" +
                        "\n" +
                        "Take the cookiename as parameter (cname).\n" +
                        "\n" +
                        "Create a variable (name) with the text to search for (cname + \"=\").\n" +
                        "\n" +
                        "Decode the cookie string, to handle cookies with special characters, e.g. '$'\n" +
                        "\n" +
                        "Split document.cookie on semicolons into an array called ca (ca = decodedCookie.split(';')).\n" +
                        "\n" +
                        "Loop through the ca array (i = 0; i < ca.length; i++), and read out each value c = ca[i]).\n" +
                        "\n" +
                        "If the cookie is found (c.indexOf(name) == 0), return the value of the cookie (c.substring(name.length, c.length).\n" +
                        "\n" +
                        "If the cookie is not found, return \"\".",
                "function getCookie(cname) {\n" +
                        "  let name = cname + \"=\";\n" +
                        "  let decodedCookie = decodeURIComponent(document.cookie);\n" +
                        "  let ca = decodedCookie.split(';');\n" +
                        "  for(let i = 0; i <ca.length; i++) {\n" +
                        "    let c = ca[i];\n" +
                        "    while (c.charAt(0) == ' ') {\n" +
                        "      c = c.substring(1);\n" +
                        "    }\n" +
                        "    if (c.indexOf(name) == 0) {\n" +
                        "      return c.substring(name.length, c.length);\n" +
                        "    }\n" +
                        "  }\n" +
                        "  return \"\";\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "A Function to Check a Cookie",
                "Last, we create the function that checks if a cookie is set.\n" +
                        "\n" +
                        "If the cookie is set it will display a greeting.\n" +
                        "\n" +
                        "If the cookie is not set, it will display a prompt box, asking for the name of the user, and stores the username cookie for 365 days, by calling the setCookie function:",
                "function checkCookie() {\n" +
                        "  let username = getCookie(\"username\");\n" +
                        "  if (username != \"\") {\n" +
                        "   alert(\"Welcome again \" + username);\n" +
                        "  } else {\n" +
                        "    username = prompt(\"Please enter your name:\", \"\");\n" +
                        "    if (username != \"\" && username != null) {\n" +
                        "      setCookie(\"username\", username, 365);\n" +
                        "    }\n" +
                        "  }\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "All Together Now",
                "All examples in together.",
                "function setCookie(cname, cvalue, exdays) {\n" +
                        "  const d = new Date();\n" +
                        "  d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));\n" +
                        "  let expires = \"expires=\"+d.toUTCString();\n" +
                        "  document.cookie = cname + \"=\" + cvalue + \";\" + expires + \";path=/\";\n" +
                        "}\n" +
                        "\n" +
                        "function getCookie(cname) {\n" +
                        "  let name = cname + \"=\";\n" +
                        "  let ca = document.cookie.split(';');\n" +
                        "  for(let i = 0; i < ca.length; i++) {\n" +
                        "    let c = ca[i];\n" +
                        "    while (c.charAt(0) == ' ') {\n" +
                        "      c = c.substring(1);\n" +
                        "    }\n" +
                        "    if (c.indexOf(name) == 0) {\n" +
                        "      return c.substring(name.length, c.length);\n" +
                        "    }\n" +
                        "  }\n" +
                        "  return \"\";\n" +
                        "}\n" +
                        "\n" +
                        "function checkCookie() {\n" +
                        "  let user = getCookie(\"username\");\n" +
                        "  if (user != \"\") {\n" +
                        "    alert(\"Welcome again \" + user);\n" +
                        "  } else {\n" +
                        "    user = prompt(\"Please enter your name:\", \"\");\n" +
                        "    if (user != \"\" && user != null) {\n" +
                        "      setCookie(\"username\", user, 365);\n" +
                        "    }\n" +
                        "  }\n" +
                        "}\n",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        return list;
    }
    //Advanced
    //JS Error Handling
    private static List<LearnDetailsModel> JSErrorHandling(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Syntax Errors",
                "Syntax errors, also called parsing errors, occur at compile time in traditional programming languages and at interpret time in JavaScript.\n" +
                        "\n" +
                        "For example, the following line causes a syntax error because it is missing a closing parenthesis.\n" +
                        "\n" +
                        "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      window.print(;\n" +
                        "   //-->\n" +
                        "</script>\n" +
                        "When a syntax error occurs in JavaScript, only the code contained within the same thread as the syntax error is affected and the rest of the code in other threads gets executed assuming nothing in them depends on the code containing the error.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Runtime Errors",
                "Runtime errors, also called exceptions, occur during execution (after compilation/interpretation).\n" +
                        "\n" +
                        "For example, the following line causes a runtime error because here the syntax is correct, but at runtime, it is trying to call a method that does not exist.\n" +
                        "\n" +
                        "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      window.printme();\n" +
                        "   //-->\n" +
                        "</script>\n" +
                        "Exceptions also affect the thread in which they occur, allowing other JavaScript threads to continue normal execution.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Logical Errors",
                "Logic errors can be the most difficult type of errors to track down. These errors are not the result of a syntax or runtime error. Instead, they occur when you make a mistake in the logic that drives your script and you do not get the result you expected.\n" +
                        "\n" +
                        "You cannot catch those errors, because it depends on your business requirement what type of logic you want to put in your program.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The try...catch...finally Statement",
                "The latest versions of JavaScript added exception handling capabilities. JavaScript implements the try...catch...finally construct as well as the throw operator to handle exceptions.\n" +
                        "\n" +
                        "You can catch programmer-generated and runtime exceptions, but you cannot catch JavaScript syntax errors.\n" +
                        "\n" +
                        "Here is the try...catch...finally block syntax −\n" +
                        "\n" +
                        "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      try {\n" +
                        "         // Code to run\n" +
                        "         [break;]\n" +
                        "      } \n" +
                        "      \n" +
                        "      catch ( e ) {\n" +
                        "         // Code to run if an exception occurs\n" +
                        "         [break;]\n" +
                        "      }\n" +
                        "      \n" +
                        "      [ finally {\n" +
                        "         // Code that is always executed regardless of \n" +
                        "         // an exception occurring\n" +
                        "      }]\n" +
                        "   //-->\n" +
                        "</script>\n" +
                        "The try block must be followed by either exactly one catch block or one finally block (or one of both). When an exception occurs in the try block, the exception is placed in e and the catch block is executed. The optional finally block executes unconditionally after try/catch.",
                "<html>\n" +
                        "   <head>      \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            function myFunc() {\n" +
                        "               var a = 100;\n" +
                        "               alert(\"Value of variable a is : \" + a );\n" +
                        "            }\n" +
                        "         //-->\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <p>Click the following to see the result:</p>\n" +
                        "      \n" +
                        "      <form>\n" +
                        "         <input type = \"button\" value = \"Click Me\" onclick = \"myFunc();\" />\n" +
                        "      </form>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The throw Statement",
                "You can use throw statement to raise your built-in exceptions or your customized exceptions. Later these exceptions can be captured and you can take an appropriate action.\n" +
                        "\n" +
                        "Example\n" +
                        "The following example demonstrates how to use a throw statement.",
                "<html>\n" +
                        "   <head>\n" +
                        "      \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            function myFunc() {\n" +
                        "               var a = 100;\n" +
                        "               var b = 0;\n" +
                        "               \n" +
                        "               try {\n" +
                        "                  if ( b == 0 ) {\n" +
                        "                     throw( \"Divide by zero error.\" ); \n" +
                        "                  } else {\n" +
                        "                     var c = a / b;\n" +
                        "                  }\n" +
                        "               }\n" +
                        "               catch ( e ) {\n" +
                        "                  alert(\"Error: \" + e );\n" +
                        "               }\n" +
                        "            }\n" +
                        "         //-->\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </head>\n" +
                        "   <body>\n" +
                        "      <p>Click the following to see the result:</p>\n" +
                        "      \n" +
                        "      <form>\n" +
                        "         <input type = \"button\" value = \"Click Me\" onclick = \"myFunc();\" />\n" +
                        "      </form>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //JS Validations
    private static List<LearnDetailsModel> JSValidations(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript - Form Validation",
                "Form validation normally used to occur at the server, after the client had entered all the necessary data and then pressed the Submit button. If the data entered by a client was incorrect or was simply missing, the server would have to send all the data back to the client and request that the form be resubmitted with correct information. This was really a lengthy process which used to put a lot of burden on the server.\n" +
                        "\n" +
                        "JavaScript provides a way to validate form's data on the client's computer before sending it to the web server. Form validation generally performs two functions.\n" +
                        "\n" +
                        "Basic Validation − First of all, the form must be checked to make sure all the mandatory fields are filled in. It would require just a loop through each field in the form and check for data.\n" +
                        "\n" +
                        "Data Format Validation − Secondly, the data that is entered must be checked for correct form and value. Your code must include appropriate logic to test correctness of data.",
                "<html>   \n" +
                        "   <head>\n" +
                        "      <title>Form Validation</title>      \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            // Form validation code will come here.\n" +
                        "         //-->\n" +
                        "      </script>      \n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <form action = \"/cgi-bin/test.cgi\" name = \"myForm\" onsubmit = \"return(validate());\">\n" +
                        "         <table cellspacing = \"2\" cellpadding = \"2\" border = \"1\">\n" +
                        "            \n" +
                        "            <tr>\n" +
                        "               <td align = \"right\">Name</td>\n" +
                        "               <td><input type = \"text\" name = \"Name\" /></td>\n" +
                        "            </tr>\n" +
                        "            \n" +
                        "            <tr>\n" +
                        "               <td align = \"right\">EMail</td>\n" +
                        "               <td><input type = \"text\" name = \"EMail\" /></td>\n" +
                        "            </tr>\n" +
                        "            \n" +
                        "            <tr>\n" +
                        "               <td align = \"right\">Zip Code</td>\n" +
                        "               <td><input type = \"text\" name = \"Zip\" /></td>\n" +
                        "            </tr>\n" +
                        "            \n" +
                        "            <tr>\n" +
                        "               <td align = \"right\">Country</td>\n" +
                        "               <td>\n" +
                        "                  <select name = \"Country\">\n" +
                        "                     <option value = \"-1\" selected>[choose yours]</option>\n" +
                        "                     <option value = \"1\">USA</option>\n" +
                        "                     <option value = \"2\">UK</option>\n" +
                        "                     <option value = \"3\">BD</option>\n" +
                        "                  </select>\n" +
                        "               </td>\n" +
                        "            </tr>\n" +
                        "            \n" +
                        "            <tr>\n" +
                        "               <td align = \"right\"></td>\n" +
                        "               <td><input type = \"submit\" value = \"Submit\" /></td>\n" +
                        "            </tr>\n" +
                        "            \n" +
                        "         </table>\n" +
                        "      </form>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );final LearnDetailsModel l2 = new LearnDetailsModel(
                "Basic Form Validation",
                "First let us see how to do a basic form validation. In the above form, we are calling validate() to validate data when onsubmit event is occurring. The following code shows the implementation of this validate() function.",
                "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      // Form validation code will come here.\n" +
                        "      function validate() {\n" +
                        "      \n" +
                        "         if( document.myForm.Name.value == \"\" ) {\n" +
                        "            alert( \"Please provide your name!\" );\n" +
                        "            document.myForm.Name.focus() ;\n" +
                        "            return false;\n" +
                        "         }\n" +
                        "         if( document.myForm.EMail.value == \"\" ) {\n" +
                        "            alert( \"Please provide your Email!\" );\n" +
                        "            document.myForm.EMail.focus() ;\n" +
                        "            return false;\n" +
                        "         }\n" +
                        "         if( document.myForm.Zip.value == \"\" || isNaN( document.myForm.Zip.value ) ||\n" +
                        "            document.myForm.Zip.value.length != 5 ) {\n" +
                        "            \n" +
                        "            alert( \"Please provide a zip in the format #####.\" );\n" +
                        "            document.myForm.Zip.focus() ;\n" +
                        "            return false;\n" +
                        "         }\n" +
                        "         if( document.myForm.Country.value == \"-1\" ) {\n" +
                        "            alert( \"Please provide your country!\" );\n" +
                        "            return false;\n" +
                        "         }\n" +
                        "         return( true );\n" +
                        "      }\n" +
                        "   //-->\n" +
                        "</script>",
                ""
        );final LearnDetailsModel l3 = new LearnDetailsModel(
                "Data Format Validation",
                "Now we will see how we can validate our entered form data before submitting it to the web server.\n" +
                        "\n" +
                        "The following example shows how to validate an entered email address. An email address must contain at least a ‘@’ sign and a dot (.). Also, the ‘@’ must not be the first character of the email address, and the last dot must at least be one character after the ‘@’ sign.",
                "<script type = \"text/javascript\">\n" +
                        "   <!--\n" +
                        "      function validateEmail() {\n" +
                        "         var emailID = document.myForm.EMail.value;\n" +
                        "         atPosition = emailID.indexOf(\"@\");\n" +
                        "         dotPosition = emailID.lastIndexOf(\".\");\n" +
                        "         \n" +
                        "         if (atPosition < 1 || ( dotPosition - atPosition < 2 )) {\n" +
                        "            alert(\"Please enter correct email ID\")\n" +
                        "            document.myForm.EMail.focus() ;\n" +
                        "            return false;\n" +
                        "         }\n" +
                        "         return( true );\n" +
                        "      }\n" +
                        "   //-->\n" +
                        "</script>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //JS Multimedia
    private static List<LearnDetailsModel> JSMultimedia(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Multimedia",
                "The JavaScript navigator object includes a child object called plugins. This object is an array, with one entry for each plug-in installed on the browser. The navigator.plugins object is supported only by Netscape, Firefox, and Mozilla only." +
                        "\n" +
                        "Here is an example that shows how to list down all the plug-on installed in your browser −",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>List of Plug-Ins</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <table border = \"1\">\n" +
                        "         <tr>\n" +
                        "            <th>Plug-in Name</th>\n" +
                        "            <th>Filename</th>\n" +
                        "            <th>Description</th>\n" +
                        "         </tr>\n" +
                        "         \n" +
                        "         <script language = \"JavaScript\" type = \"text/javascript\">\n" +
                        "            for (i = 0; i<navigator.plugins.length; i++) {\n" +
                        "               document.write(\"<tr><td>\");\n" +
                        "               document.write(navigator.plugins[i].name);\n" +
                        "               document.write(\"</td><td>\");\n" +
                        "               document.write(navigator.plugins[i].filename);\n" +
                        "               document.write(\"</td><td>\");\n" +
                        "               document.write(navigator.plugins[i].description);\n" +
                        "               document.write(\"</td></tr>\");\n" +
                        "            }\n" +
                        "         </script>\n" +
                        "      </table>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Checking for Plug-Ins",
                "Each plug-in has an entry in the array. Each entry has the following properties −\n" +
                        "\n" +
                        "name − is the name of the plug-in.\n" +
                        "\n" +
                        "filename − is the executable file that was loaded to install the plug-in.\n" +
                        "\n" +
                        "description − is a description of the plug-in, supplied by the developer.\n" +
                        "\n" +
                        "mimeTypes − is an array with one entry for each MIME type supported by the plug-in.\n" +
                        "\n" +
                        "You can use these properties in a script to find out the installed plug-ins, and then using JavaScript, you can play appropriate multimedia file. Take a look at the following example.",
                "<html>   \n" +
                        "   <head>\n" +
                        "      <title>Using Plug-Ins</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>   \n" +
                        "      <script language = \"JavaScript\" type = \"text/javascript\">\n" +
                        "         media = navigator.mimeTypes[\"video/quicktime\"];\n" +
                        "         \n" +
                        "         if (media) {\n" +
                        "            document.write(\"<embed src = 'quick.mov' height = 100 width = 100>\");\n" +
                        "         } else {\n" +
                        "            document.write(\"<img src = 'quick.gif' height = 100 width = 100>\");\n" +
                        "         }\n" +
                        "      </script>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Controlling Multimedia",
                "Let us take one real example which works in almost all the browsers −",
                "<html>   \n" +
                        "   <head>\n" +
                        "      <title>Using Embeded Object</title>\n" +
                        "      \n" +
                        "      <script type = \"text/javascript\">\n" +
                        "         <!--\n" +
                        "            function play() {\n" +
                        "               if (!document.demo.IsPlaying()) {\n" +
                        "                  document.demo.Play();\n" +
                        "               }\n" +
                        "            }\n" +
                        "            function stop() {\n" +
                        "               if (document.demo.IsPlaying()) {\n" +
                        "                  document.demo.StopPlay();\n" +
                        "               }\n" +
                        "            }\n" +
                        "            function rewind() {\n" +
                        "               if (document.demo.IsPlaying()) {\n" +
                        "                  document.demo.StopPlay();\n" +
                        "               }\n" +
                        "               document.demo.Rewind();\n" +
                        "            }\n" +
                        "         //-->\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>      \n" +
                        "      <embed id = \"demo\" name = \"demo\"\n" +
                        "         src = \"http://www.amrood.com/games/kumite.swf\"\n" +
                        "         width = \"318\" height = \"300\" play = \"false\" loop = \"false\"\n" +
                        "         pluginspage = \"http://www.macromedia.com/go/getflashplayer\"\n" +
                        "         swliveconnect = \"true\">\n" +
                        "      \n" +
                        "      <form name = \"form\" id = \"form\" action = \"#\" method = \"get\">\n" +
                        "         <input type = \"button\" value = \"Start\" onclick = \"play();\" />\n" +
                        "         <input type = \"button\" value = \"Stop\" onclick = \"stop();\" />\n" +
                        "         <input type = \"button\" value = \"Rewind\" onclick = \"rewind();\" />\n" +
                        "      </form>      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);

        return list;
    }
    //JS Debugging
    private static List<LearnDetailsModel> JSDebugging(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Debugging",
                "Every now and then, developers commit mistakes while coding. A mistake in a program or a script is referred to as a bug.\n" +
                        "\n" +
                        "The process of finding and fixing bugs is called debugging and is a normal part of the development process. This section covers tools and techniques that can help you with debugging tasks..",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Error Messages in IE",
                "The most basic way to track down errors is by turning on error information in your browser. By default, Internet Explorer shows an error icon in the status bar when an error occurs on the page.\n" +
                        "\n" +
                        "Error Icon\n" +
                        "Double-clicking this icon takes you to a dialog box showing information about the specific error that occurred.\n" +
                        "\n" +
                        "Since this icon is easy to overlook, Internet Explorer gives you the option to automatically show the Error dialog box whenever an error occurs.\n" +
                        "\n" +
                        "To enable this option, select Tools → Internet Options → Advanced tab. and then finally check the \"Display a Notification About Every Script Error\" box option",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Error Messages in Firefox or Mozilla",
                "Other browsers like Firefox, Netscape, and Mozilla send error messages to a special window called the JavaScript Console or Error Console. To view the console, select Tools → Error Console or Web Development.\n" +
                        "\n" +
                        "Unfortunately, since these browsers give no visual indication when an error occurs, you must keep the Console open and watch for errors as your script executes.\n" +
                        "\n" +
                        "Error Console\n" +
                        "Error Notifications\n" +
                        "Error notifications that show up on Console or through Internet Explorer dialog boxes are the result of both syntax and runtime errors. These error notification include the line number at which the error occurred.\n" +
                        "\n" +
                        "If you are using Firefox, then you can click on the error available in the error console to go to the exact line in the script having error.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "How to debug a Script",
                "There are various ways to debug your JavaScript −\n" +
                        "\n" +
                        "Use a JavaScript Validator\n" +
                        "One way to check your JavaScript code for strange bugs is to run it through a program that checks it to make sure it is valid and that it follows the official syntax rules of the language. These programs are called validating parsers or just validators for short, and often come with commercial HTML and JavaScript editors.\n" +
                        "\n" +
                        "Simply visit that web page, paste your JavaScript (Only JavaScript) code into the text area provided, and click the jslint button. This program will parse through your JavaScript code, ensuring that all the variable and function definitions follow the correct syntax. It will also check JavaScript statements, such as if and while, to ensure they too follow the correct format\n" +
                        "\n" +
                        "Add Debugging Code to Your Programs\n" +
                        "You can use the alert() or document.write() methods in your program to debug your code. For example, you might write something as follows −",
                "var debugging = true;\n" +
                        "var whichImage = \"widget\";\n" +
                        "\n" +
                        "if( debugging )\n" +
                        "   alert( \"Calls swapImage() with argument: \" + whichImage );\n" +
                        "   var swapStatus = swapImage( whichImage );\n" +
                        "\n" +
                        "if( debugging )\n" +
                        "   alert( \"Exits swapImage() with swapStatus=\" + swapStatus );",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Useful Tips for Developers",
                "You can keep the following tips in mind to reduce the number of errors in your scripts and simplify the debugging process −\n" +
                        "\n" +
                        "Use plenty of comments. Comments enable you to explain why you wrote the script the way you did and to explain particularly difficult sections of code.\n" +
                        "\n" +
                        "Always use indentation to make your code easy to read. Indenting statements also makes it easier for you to match up beginning and ending tags, curly braces, and other HTML and script elements.\n" +
                        "\n" +
                        "Write modular code. Whenever possible, group your statements into functions. Functions let you group related statements, and test and reuse portions of code with minimal effort.\n" +
                        "\n" +
                        "Be consistent in the way you name your variables and functions. Try using names that are long enough to be meaningful and that describe the contents of the variable or the purpose of the function.\n" +
                        "\n" +
                        "Use consistent syntax when naming variables and functions. In other words, keep them all lowercase or all uppercase; if you prefer Camel-Back notation, use it consistently.\n" +
                        "\n" +
                        "Test long scripts in a modular fashion. In other words, do not try to write the entire script before testing any portion of it. Write a piece and get it to work before adding the next portion of code.\n" +
                        "\n" +
                        "Use descriptive variable and function names and avoid using single-character names.\n" +
                        "\n" +
                        "Watch your quotation marks. Remember that quotation marks are used in pairs around strings and that both quotation marks must be of the same style (either single or double).\n" +
                        "\n" +
                        "Watch your equal signs. You should not used a single = for comparison purpose.\n" +
                        "\n" +
                        "Declare variables explicitly using the var keyword.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //JS Web APIs
    private static List<LearnDetailsModel> JSWebAPIs(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is Web API?",
                "API stands for Application Programming Interface.\n" +
                        "\n" +
                        "A Web API is an application programming interface for the Web.\n" +
                        "\n" +
                        "A Browser API can extend the functionality of a web browser.\n" +
                        "\n" +
                        "A Server API can extend the functionality of a web server.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Browser APIs",
                "All browsers have a set of built-in Web APIs to support complex operations, and to help accessing data.\n" +
                        "\n" +
                        "For example, the Geolocation API can return the coordinates of where the browser is located.",
                "const myElement = document.getElementById(\"demo\");\n" +
                        "\n" +
                        "function getLocation() {\n" +
                        "  if (navigator.geolocation) {\n" +
                        "    navigator.geolocation.getCurrentPosition(showPosition);\n" +
                        "  } else {\n" +
                        "    myElement.innerHTML = \"Geolocation is not supported by this browser.\";\n" +
                        "  }\n" +
                        "}\n" +
                        "\n" +
                        "function showPosition(position) {\n" +
                        "  myElement.innerHTML = \"Latitude: \" + position.coords.latitude +\n" +
                        "  \"<br>Longitude: \" + position.coords.longitude;\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Third Party APIs",
                "Third party APIs are not built into your browser.\n" +
                        "\n" +
                        "To use these APIs, you will have to download the code from the Web.\n" +
                        "\n" +
                        "Examples:\n" +
                        "\n" +
                        "YouTube API - Allows you to display videos on a web site.\n" +
                        "Twitter API - Allows you to display Tweets on a web site.\n" +
                        "Facebook API - Allows you to display Facebook info on a web site.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Web Storage API
    private static List<LearnDetailsModel> WebStorageAPI(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Web Storage API",
                "The Web Storage API is a simple syntax for storing and retrieving data in the browser. It is very easy to use:",
                "localStorage.setItem(\"name\", \"Anne Moore\");\n" +
                        "localStorage.getItem(\"name\");",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The localStorage Object",
                "The localStorage object provides access to a local storage for a particular Web Site. It allows you to store, read, add, modify, and delete data items for that domain.\n" +
                        "\n" +
                        "The data is stored with no expiration date, and will not be deleted when the browser is closed.\n" +
                        "\n" +
                        "The data will be available for days, weeks, and years.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The setItem() Method",
                "The localStorage.setItem() method stores a data item in a storage.\n" +
                        "\n" +
                        "It takes a name and a value as parameters:",
                "localStorage.setItem(\"name\", \"Anne Moore\");",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The getItem() Method",
                "The localStorage.getItem() method retrieves a data item from the storage.\n" +
                        "\n" +
                        "It takes a name as parameter:",
                "localStorage.getItem(\"name\");",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The sessionStorage Object",
                "The sessionStorage object is identical to the localStorage object.\n" +
                        "\n" +
                        "The difference is that the sessionStorage object stores data for one session.\n" +
                        "\n" +
                        "The data is deleted when the browser is closed.",
                "sessionStorage.getItem(\"name\");",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "The setItem() Method",
                "The sessionStorage.setItem() method stores a data item in a storage.\n" +
                        "\n" +
                        "It takes a name and a value as parameters:",
                "sessionStorage.setItem(\"name\", \"Anne Moore\");",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "The getItem() Method",
                "The sessionStorage.getItem() method retrieves a data item from the storage.\n" +
                        "\n" +
                        "It takes a name as parameter:",
                "sessionStorage.getItem(\"name\");",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //Web Workers API
    private static List<LearnDetailsModel> WebWorkersAPI(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is a Web Worker?",
                "A web worker is a JavaScript running in the background, without affecting the performance of the page." +
                        "\n" +
                        "When executing scripts in an HTML page, the page becomes unresponsive until the script is finished.\n" +
                        "\n" +
                        "A web worker is a JavaScript that runs in the background, independently of other scripts, without affecting the performance of the page. You can continue to do whatever you want: clicking, selecting things, etc., while the web worker runs in the background.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Check Web Worker Support",
                "Before creating a web worker, check whether the user's browser supports it:",
                "if (typeof(Worker) !== \"undefined\") {\n" +
                        "  // Yes! Web worker support!\n" +
                        "  // Some code.....\n" +
                        "} else {\n" +
                        "  // Sorry! No Web Worker support..\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Create a Web Worker File",
                "Now, let's create our web worker in an external JavaScript.\n" +
                        "\n" +
                        "Here, we create a script that counts. The script is stored in the \"demo_workers.js\" file:",
                "let i = 0;\n" +
                        "\n" +
                        "function timedCount() {\n" +
                        "  i ++;\n" +
                        "  postMessage(i);\n" +
                        "  setTimeout(\"timedCount()\",500);\n" +
                        "}\n" +
                        "\n" +
                        "timedCount();",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Create a Web Worker Object",
                "Now that we have the web worker file, we need to call it from an HTML page.\n" +
                        "\n" +
                        "The following lines checks if the worker already exists, if not - it creates a new web worker object and runs the code in \"demo_workers.js\":\n" +
                        "\n" +
                        "if (typeof(w) == \"undefined\") {\n" +
                        "  w = new Worker(\"demo_workers.js\");\n" +
                        "}\n" +
                        "Then we can send and receive messages from the web worker.\n" +
                        "\n" +
                        "Add an \"onmessage\" event listener to the web worker.\n" +
                        "\n" +
                        "w.onmessage = function(event){\n" +
                        "  document.getElementById(\"result\").innerHTML = event.data;\n" +
                        "};\n" +
                        "When the web worker posts a message, the code within the event listener is executed. The data from the web worker is stored in event.data.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Terminate a Web Worker",
                "When a web worker object is created, it will continue to listen for messages (even after the external script is finished) until it is terminated.\n" +
                        "\n" +
                        "To terminate a web worker, and free browser/computer resources, use the terminate() method:\n" +
                        "\n" +
                        "w.terminate();" +
                        "\n\n" +
                        "Reuse the Web Worker" +
                        "\n\n" +
                        "If you set the worker variable to undefined, after it has been terminated, you can reuse the code:\n" +
                        "\n" +
                        "w = undefined;",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //JS Graphics
    private static List<LearnDetailsModel> JSGraphics(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "JavaScript Graphics",
                "JavaScript libraries to use for both Artificial Intelligence graphs and other charts:\n" +
                        "\n" +
                        "Plotly.js\n" +
                        "Chart.js\n" +
                        "Google Chart",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Plotly.js",
                "Plotly.js is a charting library that comes with over 40 chart types, 3D charts, statistical graphs, and SVG maps.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Chart.js",
                "Chart.js comes with many built-in chart types:\n" +
                        "\n" +
                        "Scatter\n" +
                        "Line\n" +
                        "Bar\n" +
                        "Radar\n" +
                        "Pie and Doughnut\n" +
                        "Polar Area\n" +
                        "Bubble",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Google Chart",
                "From simple line charts to complex tree maps, Google Chart provides a number of built-in chart types:\n" +
                        "\n" +
                        "Scatter Chart\n" +
                        "Line Chart\n" +
                        "Bar / Column Chart\n" +
                        "Area Chart\n" +
                        "Pie Chart\n" +
                        "Donut Chart\n" +
                        "Org Chart\n" +
                        "Map / Geo Chart",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AJAX
    //Ajax Introduction
    private static List<LearnDetailsModel> AjaxIntroduction(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Why to Learn Ajax?",
                "AJAX stands for Asynchronous JavaScript and XML. AJAX is a new technique for creating better, faster, and more interactive web applications with the help of XML, HTML, CSS, and Java Script.\n" +
                        "\n" +
                        "Ajax uses XHTML for content, CSS for presentation, along with Document Object Model and JavaScript for dynamic content display.\n" +
                        "\n" +
                        "Conventional web applications transmit information to and from the sever using synchronous requests. It means you fill out a form, hit submit, and get directed to a new page with new information from the server.\n" +
                        "\n" +
                        "With AJAX, when you hit submit, JavaScript will make a request to the server, interpret the results, and update the current screen. In the purest sense, the user would never know that anything was even transmitted to the server.\n" +
                        "\n" +
                        "XML is commonly used as the format for receiving server data, although any format, including plain text, can be used.\n" +
                        "\n" +
                        "AJAX is a web browser technology independent of web server software.\n" +
                        "\n" +
                        "A user can continue to use the application while the client program requests information from the server in the background.\n" +
                        "\n" +
                        "Intuitive and natural user interaction. Clicking is not required, mouse movement is a sufficient event trigger.\n" +
                        "\n" +
                        "Data-driven as opposed to page-driven.",
                "",
                ""
        );final LearnDetailsModel l2 = new LearnDetailsModel(
                "Rich Internet Application Technology",
                "AJAX is the most viable Rich Internet Application (RIA) technology so far. It is getting tremendous industry momentum and several tool kit and frameworks are emerging. But at the same time, AJAX has browser incompatibility and it is supported by JavaScript, which is hard to maintain and debug.",
                "",
                ""
        );final LearnDetailsModel l3 = new LearnDetailsModel(
                "AJAX is Based on Open Standards",
                "AJAX is based on the following open standards −\n" +
                        "\n" +
                        "Browser-based presentation using HTML and Cascading Style Sheets (CSS).\n" +
                        "Data is stored in XML format and fetched from the server.\n" +
                        "Behind-the-scenes data fetches using XMLHttpRequest objects in the browser.\n" +
                        "JavaScript to make everything happen.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //Ajax XMLHttp
    private static List<LearnDetailsModel> AjaxXMLHttp(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "The XMLHttpRequest Object",
                "The XMLHttpRequest object is the key to AJAX. It has been available ever since Internet Explorer 5.5 was released in July 2000, but was not fully discovered until AJAX and Web 2.0 in 2005 became popular." +
                        "\n\n" +
                        "The keystone of AJAX is the XMLHttpRequest object.\n" +
                        "\n" +
                        "Create an XMLHttpRequest object\n" +
                        "Define a callback function\n" +
                        "Open the XMLHttpRequest object\n" +
                        "Send a Request to a server",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The XMLHttpRequest Object",
                "All modern browsers support the XMLHttpRequest object.\n" +
                        "\n" +
                        "The XMLHttpRequest object can be used to exchange data with a web server behind the scenes. This means that it is possible to update parts of a web page, without reloading the whole page.\n" +
                        "\n\n" +
                        "Create an XMLHttpRequest Object" +
                        "\n\n" +
                        "All modern browsers (Chrome, Firefox, IE, Edge, Safari, Opera) have a built-in XMLHttpRequest object.\n" +
                        "\n" +
                        "Syntax for creating an XMLHttpRequest object:\n" +
                        "\n" +
                        "variable = new XMLHttpRequest();",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Define a Callback Function",
                "A callback function is a function passed as a parameter to another function.\n" +
                        "\n" +
                        "In this case, the callback function should contain the code to execute when the response is ready.\n" +
                        "\n" +
                        "xhttp.onload = function() {\n" +
                        "  // What to do when the response is ready\n" +
                        "}",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Send a Request",
                "To send a request to a server, you can use the open() and send() methods of the XMLHttpRequest object:\n" +
                        "\n" +
                        "xhttp.open(\"GET\", \"ajax_info.txt\");\n" +
                        "xhttp.send();",
                "// Create an XMLHttpRequest object\n" +
                        "const xhttp = new XMLHttpRequest();\n" +
                        "\n" +
                        "// Define a callback function\n" +
                        "xhttp.onload = function() {\n" +
                        "  // Here you can use the Data\n" +
                        "}\n" +
                        "\n" +
                        "// Send a request\n" +
                        "xhttp.open(\"GET\", \"ajax_info.txt\");\n" +
                        "xhttp.send();",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Access Across Domains",
                "For security reasons, modern browsers do not allow access across domains.\n" +
                        "\n" +
                        "This means that both the web page and the XML file it tries to load, must be located on the same server.\n" +
                        "\n" +
                        "The examples on W3Schools all open XML files located on the W3Schools domain.\n" +
                        "\n" +
                        "If you want to use the example above on one of your own web pages, the XML files you load must be located on your own server.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //AJAX Response
    private static List<LearnDetailsModel> AJAXResponse(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AJAX - Server Response",
                "The responseText Property\n" +
                        "The responseText property returns the server response as a JavaScript string, and you can use it accordingly:",
                "document.getElementById(\"demo\").innerHTML = xhttp.responseText;",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The responseXML Property",
                "The XMLHttpRequest object has an in-built XML parser.\n" +
                        "\n" +
                        "The responseXML property returns the server response as an XML DOM object.\n" +
                        "\n" +
                        "Using this property you can parse the response as an XML DOM object:",
                "const xmlDoc = xhttp.responseXML;\n" +
                        "const x = xmlDoc.getElementsByTagName(\"ARTIST\");\n" +
                        "\n" +
                        "let txt = \"\";\n" +
                        "for (let i = 0; i < x.length; i++) {\n" +
                        "  txt += x[i].childNodes[0].nodeValue + \"<br>\";\n" +
                        "}\n" +
                        "document.getElementById(\"demo\").innerHTML = txt;\n" +
                        "\n" +
                        "xhttp.open(\"GET\", \"cd_catalog.xml\");\n" +
                        "xhttp.send();",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The getAllResponseHeaders() Method",
                "The getAllResponseHeaders() method returns all header information from the server response.",
                "const xhttp = new XMLHttpRequest();\n" +
                        "xhttp.onload = function() {\n" +
                        "    document.getElementById(\"demo\").innerHTML =\n" +
                        "    this.getAllResponseHeaders();\n" +
                        "}\n" +
                        "xhttp.open(\"GET\", \"ajax_info.txt\");\n" +
                        "xhttp.send();",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The getResponseHeader() Method",
                "The getResponseHeader() method returns specific header information from the server response.",
                "const xhttp = new XMLHttpRequest();\n" +
                        "xhttp.onload = function() {\n" +
                        "    document.getElementById(\"demo\").innerHTML =\n" +
                        "    this.getResponseHeader(\"Last-Modified\");\n" +
                        "}\n" +
                        "xhttp.open(\"GET\", \"ajax_info.txt\");\n" +
                        "xhttp.send();",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //AJAXPHP
    private static List<LearnDetailsModel> AJAXPHP(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AJAX PHP Example",
                "AJAX is used to create more interactive applications.The following example demonstrates how a web page can communicate with a web server while a user types characters in an input field:" +
                        "\n\n" +
                        "Start typing a name in the input field below:\n" +
                        "\n" +
                        "Suggestions:\n" +
                        "\n" +
                        "First name: \n",
                "<p>Start typing a name in the input field below:</p>\n" +
                        "<p>Suggestions: <span id=\"txtHint\"></span></p>\n" +
                        "\n" +
                        "<form>\n" +
                        "First name: <input type=\"text\" onkeyup=\"showHint(this.value)\">\n" +
                        "</form>\n" +
                        "\n" +
                        "<script>\n" +
                        "function showHint(str) {\n" +
                        "  if (str.length == 0) {\n" +
                        "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
                        "    return;\n" +
                        "  } else {\n" +
                        "    const xmlhttp = new XMLHttpRequest();\n" +
                        "    xmlhttp.onload = function() {\n" +
                        "      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
                        "    }\n" +
                        "  xmlhttp.open(\"GET\", \"gethint.php?q=\" + str);\n" +
                        "  xmlhttp.send();\n" +
                        "  }\n" +
                        "}\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The PHP File - \"gethint.php\"",
                "The PHP file checks an array of names, and returns the corresponding name(s) to the browser:",
                "<?php\n" +
                        "// Array with names\n" +
                        "$a[] = \"Anna\";\n" +
                        "$a[] = \"Brittany\";\n" +
                        "$a[] = \"Cinderella\";\n" +
                        "$a[] = \"Diana\";\n" +
                        "$a[] = \"Eva\";\n" +
                        "$a[] = \"Fiona\";\n" +
                        "$a[] = \"Gunda\";\n" +
                        "$a[] = \"Hege\";\n" +
                        "$a[] = \"Inga\";\n" +
                        "$a[] = \"Johanna\";\n" +
                        "$a[] = \"Kitty\";\n" +
                        "$a[] = \"Linda\";\n" +
                        "$a[] = \"Nina\";\n" +
                        "$a[] = \"Ophelia\";\n" +
                        "$a[] = \"Petunia\";\n" +
                        "$a[] = \"Amanda\";\n" +
                        "$a[] = \"Raquel\";\n" +
                        "$a[] = \"Cindy\";\n" +
                        "$a[] = \"Doris\";\n" +
                        "$a[] = \"Eve\";\n" +
                        "$a[] = \"Evita\";\n" +
                        "$a[] = \"Sunniva\";\n" +
                        "$a[] = \"Tove\";\n" +
                        "$a[] = \"Unni\";\n" +
                        "$a[] = \"Violet\";\n" +
                        "$a[] = \"Liza\";\n" +
                        "$a[] = \"Elizabeth\";\n" +
                        "$a[] = \"Ellen\";\n" +
                        "$a[] = \"Wenche\";\n" +
                        "$a[] = \"Vicky\";\n" +
                        "\n" +
                        "// get the q parameter from URL\n" +
                        "$q = $_REQUEST[\"q\"];\n" +
                        "\n" +
                        "$hint = \"\";\n" +
                        "\n" +
                        "// lookup all hints from array if $q is different from \"\"\n" +
                        "if ($q !== \"\") {\n" +
                        "  $q = strtolower($q);\n" +
                        "  $len=strlen($q);\n" +
                        "  foreach($a as $name) {\n" +
                        "    if (stristr($q, substr($name, 0, $len))) {\n" +
                        "      if ($hint === \"\") {\n" +
                        "        $hint = $name;\n" +
                        "      } else {\n" +
                        "        $hint .= \", $name\";\n" +
                        "      }\n" +
                        "    }\n" +
                        "  }\n" +
                        "}\n" +
                        "\n" +
                        "// Output \"no suggestion\" if no hint was found or output correct values\n" +
                        "echo $hint === \"\" ? \"no suggestion\" : $hint;\n" +
                        "?>",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AJAX ASP
    private static List<LearnDetailsModel> AJAXASP(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AJAX ASP Example",
                "The following example will demonstrate how a web page can communicate with a web server while a user type characters in an input field:" +
                        "\n\n" +
                        "Start typing a name in the input field below:\n" +
                        "\n" +
                        "Suggestions:\n" +
                        "\n" +
                        "First name:",
                "<p>Start typing a name in the input field below:</p>\n" +
                        "<p>Suggestions: <span id=\"txtHint\"></span></p>\n" +
                        "\n" +
                        "<form>\n" +
                        "First name: <input type=\"text\" onkeyup=\"showHint(this.value)\">\n" +
                        "</form>\n" +
                        "\n" +
                        "<script>\n" +
                        "function showHint(str) {\n" +
                        "  if (str.length == 0) {\n" +
                        "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
                        "    return;\n" +
                        "  } else {\n" +
                        "    const xmlhttp = new XMLHttpRequest();\n" +
                        "    xmlhttp.onload = function() {\n" +
                        "      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
                        "    }\n" +
                        "  xmlhttp.open(\"GET\", \"gethint.asp?q=\" + str);\n" +
                        "  xmlhttp.send();\n" +
                        "  }\n" +
                        "}\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The ASP File - \"gethint.asp\"",
                "The ASP file checks an array of names, and returns the corresponding name(s) to the browser:",
                "<%\n" +
                        "response.expires=-1\n" +
                        "dim a(30)\n" +
                        "'Fill up array with names\n" +
                        "a(1)=\"Anna\"\n" +
                        "a(2)=\"Brittany\"\n" +
                        "a(3)=\"Cinderella\"\n" +
                        "a(4)=\"Diana\"\n" +
                        "a(5)=\"Eva\"\n" +
                        "a(6)=\"Fiona\"\n" +
                        "a(7)=\"Gunda\"\n" +
                        "a(8)=\"Hege\"\n" +
                        "a(9)=\"Inga\"\n" +
                        "a(10)=\"Johanna\"\n" +
                        "a(11)=\"Kitty\"\n" +
                        "a(12)=\"Linda\"\n" +
                        "a(13)=\"Nina\"\n" +
                        "a(14)=\"Ophelia\"\n" +
                        "a(15)=\"Petunia\"\n" +
                        "a(16)=\"Amanda\"\n" +
                        "a(17)=\"Raquel\"\n" +
                        "a(18)=\"Cindy\"\n" +
                        "a(19)=\"Doris\"\n" +
                        "a(20)=\"Eve\"\n" +
                        "a(21)=\"Evita\"\n" +
                        "a(22)=\"Sunniva\"\n" +
                        "a(23)=\"Tove\"\n" +
                        "a(24)=\"Unni\"\n" +
                        "a(25)=\"Violet\"\n" +
                        "a(26)=\"Liza\"\n" +
                        "a(27)=\"Elizabeth\"\n" +
                        "a(28)=\"Ellen\"\n" +
                        "a(29)=\"Wenche\"\n" +
                        "a(30)=\"Vicky\"\n" +
                        "\n" +
                        "'get the q parameter from URL\n" +
                        "q=ucase(request.querystring(\"q\"))\n" +
                        "\n" +
                        "'lookup all hints from array if length of q>0\n" +
                        "if len(q)>0 then\n" +
                        "  hint=\"\"\n" +
                        "  for i=1 to 30\n" +
                        "    if q=ucase(mid(a(i),1,len(q))) then\n" +
                        "      if hint=\"\" then\n" +
                        "        hint=a(i)\n" +
                        "      else\n" +
                        "        hint=hint & \" , \" & a(i)\n" +
                        "      end if\n" +
                        "    end if\n" +
                        "  next\n" +
                        "end if\n" +
                        "\n" +
                        "'Output \"no suggestion\" if no hint were found\n" +
                        "'or output the correct values\n" +
                        "if hint=\"\" then\n" +
                        "  response.write(\"no suggestion\")\n" +
                        "else\n" +
                        "  response.write(hint)\n" +
                        "end if\n" +
                        "%>",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AJAX Database
    private static List<LearnDetailsModel> AJAXDatabase(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AJAX Database Example",
                "AJAX can be used for interactive communication with a database.The following example will demonstrate how a web page can fetch information from a database with AJAX:" +
                        "\n\n" +
                        "",
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<style>\n" +
                        "th,td {\n" +
                        "  padding: 5px;\n" +
                        "}\n" +
                        "</style>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2>The XMLHttpRequest Object</h2>\n" +
                        "\n" +
                        "<form action=\"\"> \n" +
                        "  <select name=\"customers\" onchange=\"showCustomer(this.value)\">\n" +
                        "    <option value=\"\">Select a customer:</option>\n" +
                        "    <option value=\"ALFKI\">Alfreds Futterkiste</option>\n" +
                        "    <option value=\"NORTS \">North/South</option>\n" +
                        "    <option value=\"WOLZA\">Wolski Zajazd</option>\n" +
                        "  </select>\n" +
                        "</form>\n" +
                        "<br>\n" +
                        "<div id=\"txtHint\">Customer info will be listed here...</div>\n" +
                        "\n" +
                        "<script>\n" +
                        "function showCustomer(str) {\n" +
                        "  if (str == \"\") {\n" +
                        "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
                        "    return;\n" +
                        "  }\n" +
                        "  const xhttp = new XMLHttpRequest();\n" +
                        "  xhttp.onload = function() {\n" +
                        "    document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
                        "  }\n" +
                        "  xhttp.open(\"GET\", \"getcustomer.php?q=\"+str);\n" +
                        "  xhttp.send();\n" +
                        "}\n" +
                        "</script>\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The AJAX Server Page",
                "The page on the server called by the JavaScript above is a PHP file called \"getcustomer.php\".\n" +
                        "\n" +
                        "The source code in \"getcustomer.php\" runs a query against a database, and returns the result in an HTML table:",
                "<?php\n" +
                        "$mysqli = new mysqli(\"servername\", \"username\", \"password\", \"dbname\");\n" +
                        "if($mysqli->connect_error) {\n" +
                        "  exit('Could not connect');\n" +
                        "}\n" +
                        "\n" +
                        "$sql = \"SELECT customerid, companyname, contactname, address, city, postalcode, country\n" +
                        "FROM customers WHERE customerid = ?\";\n" +
                        "\n" +
                        "$stmt = $mysqli->prepare($sql);\n" +
                        "$stmt->bind_param(\"s\", $_GET['q']);\n" +
                        "$stmt->execute();\n" +
                        "$stmt->store_result();\n" +
                        "$stmt->bind_result($cid, $cname, $name, $adr, $city, $pcode, $country);\n" +
                        "$stmt->fetch();\n" +
                        "$stmt->close();\n" +
                        "\n" +
                        "echo \"<table>\";\n" +
                        "echo \"<tr>\";\n" +
                        "echo \"<th>CustomerID</th>\";\n" +
                        "echo \"<td>\" . $cid . \"</td>\";\n" +
                        "echo \"<th>CompanyName</th>\";\n" +
                        "echo \"<td>\" . $cname . \"</td>\";\n" +
                        "echo \"<th>ContactName</th>\";\n" +
                        "echo \"<td>\" . $name . \"</td>\";\n" +
                        "echo \"<th>Address</th>\";\n" +
                        "echo \"<td>\" . $adr . \"</td>\";\n" +
                        "echo \"<th>City</th>\";\n" +
                        "echo \"<td>\" . $city . \"</td>\";\n" +
                        "echo \"<th>PostalCode</th>\";\n" +
                        "echo \"<td>\" . $pcode . \"</td>\";\n" +
                        "echo \"<th>Country</th>\";\n" +
                        "echo \"<td>\" . $country . \"</td>\";\n" +
                        "echo \"</tr>\";\n" +
                        "echo \"</table>\";\n" +
                        "?>",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AJAX Applications
    private static List<LearnDetailsModel> AJAXApplications(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "XML Applications",
                "This chapter demonstrates some HTML applications using XML, HTTP, DOM, and JavaScript." +
                        "\n\n" +
                        "Display XML Data in an HTML Table\n" +
                        "This example loops through each <CD> element, and displays the values of the <ARTIST> and the <TITLE> elements in an HTML table:",
                "<table id=\"demo\"></table>\n" +
                        "\n" +
                        "<script>\n" +
                        "function loadXMLDoc() {\n" +
                        "  const xmlhttp = new XMLHttpRequest();\n" +
                        "  xmlhttp.onload = function() {\n" +
                        "    const xmlDoc = xml.responseXML;\n" +
                        "    const cd = xmlDoc.getElementsByTagName(\"CD\");\n" +
                        "    myFunction(cd);\n" +
                        "  }\n" +
                        "  xmlhttp.open(\"GET\", \"cd_catalog.xml\");\n" +
                        "  xmlhttp.send();\n" +
                        "}\n" +
                        "\n" +
                        "function myFunction(cd) {\n" +
                        "  let table=\"<tr><th>Artist</th><th>Title</th></tr>\";\n" +
                        "  for (let i = 0; i < cd.length; i++) {\n" +
                        "    table += \"<tr><td>\" +\n" +
                        "    cd[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
                        "    \"</td><td>\" +\n" +
                        "    cd[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
                        "    \"</td></tr>\";\n" +
                        "  }\n" +
                        "  document.getElementById(\"demo\").innerHTML = table;\n" +
                        "}\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Display the First CD in an HTML div Element",
                "This example uses a function to display the first CD element in an HTML element with id=\"showCD\":",
                "const xhttp = new XMLHttpRequest();\n" +
                        "xhttp.onload = function() {\n" +
                        "  const xmlDoc = xhttp.responseXML;\n" +
                        "  const cd = xmlDoc.getElementsByTagName(\"CD\");\n" +
                        "  myFunction(cd, 0);\n" +
                        "}\n" +
                        "xhttp.open(\"GET\", \"cd_catalog.xml\");\n" +
                        "xhttp.send();\n" +
                        "\n" +
                        "function myFunction(cd, i) {\n" +
                        "  document.getElementById(\"showCD\").innerHTML =\n" +
                        "  \"Artist: \" +\n" +
                        "  cd[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
                        "  \"<br>Title: \" +\n" +
                        "  cd[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
                        "  \"<br>Year: \" +\n" +
                        "  cd[i].getElementsByTagName(\"YEAR\")[0].childNodes[0].nodeValue;\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Navigate Between the CDs",
                "To navigate between the CDs in the example above, create a next() and previous() function:",
                "function next() {\n" +
                        "  // display the next CD, unless you are on the last CD\n" +
                        "  if (i < len-1) {\n" +
                        "    i++;\n" +
                        "    displayCD(i);\n" +
                        "  }\n" +
                        "}\n" +
                        "\n" +
                        "function previous() {\n" +
                        "  // display the previous CD, unless you are on the first CD\n" +
                        "  if (i > 0) {\n" +
                        "    i--;\n" +
                        "    displayCD(i);\n" +
                        "  }\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Show Album Information When Clicking On a CD",
                "The last example shows how you can show album information when the user clicks on a CD:",
                "function displayCD(i) {\n" +
                        "  document.getElementById(\"showCD\").innerHTML =\n" +
                        "  \"Artist: \" +\n" +
                        "  cd[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
                        "  \"<br>Title: \" +\n" +
                        "  cd[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
                        "  \"<br>Year: \" +\n" +
                        "  cd[i].getElementsByTagName(\"YEAR\")[0].childNodes[0].nodeValue;\n" +
                        "}",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //Typescript
    //Typescript Introduction
    private static List<LearnDetailsModel> TypescriptIntroduction(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is TypeScript?",
                "By definition, “TypeScript is JavaScript for application-scale development.”\n" +
                        "\n" +
                        "TypeScript is a strongly typed, object oriented, compiled language. It was designed by Anders Hejlsberg (designer of C#) at Microsoft. TypeScript is both a language and a set of tools. TypeScript is a typed superset of JavaScript compiled to JavaScript. In other words, TypeScript is JavaScript plus some additional features.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Features of TypeScript",
                "TypeScript is just JavaScript. TypeScript starts with JavaScript and ends with JavaScript. Typescript adopts the basic building blocks of your program from JavaScript. Hence, you only need to know JavaScript to use TypeScript. All TypeScript code is converted into its JavaScript equivalent for the purpose of execution.\n" +
                        "\n" +
                        "TypeScript supports other JS libraries. Compiled TypeScript can be consumed from any JavaScript code. TypeScript-generated JavaScript can reuse all of the existing JavaScript frameworks, tools, and libraries.\n" +
                        "\n" +
                        "JavaScript is TypeScript. This means that any valid .js file can be renamed to .ts and compiled with other TypeScript files.\n" +
                        "\n" +
                        "TypeScript is portable. TypeScript is portable across browsers, devices, and operating systems. It can run on any environment that JavaScript runs on. Unlike its counterparts, TypeScript doesn't need a dedicated VM or a specific runtime environment to execute.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "TypeScript and ECMAScript",
                "The ECMAScript specification is a standardized specification of a scripting language. There are six editions of ECMA-262 published. Version 6 of the standard is codenamed \"Harmony\". TypeScript is aligned with the ECMAScript6 specification.\n" +
                        "\n" +
                        "TypeScript adopts its basic language features from the ECMAScript5 specification, i.e., the official specification for JavaScript. TypeScript language features like Modules and class-based orientation are in line with the EcmaScript 6 specification. Additionally, TypeScript also embraces features like generics and type annotations that aren't a part of the EcmaScript6 specification.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Why Use TypeScript?",
                "TypeScript is superior to its other counterparts like CoffeeScript and Dart programming languages in a way that TypeScript is extended JavaScript. In contrast, languages like Dart, CoffeeScript are new languages in themselves and require language-specific execution environment.\n" +
                        "\n" +
                        "The benefits of TypeScript include −\n" +
                        "\n" +
                        "Compilation − JavaScript is an interpreted language. Hence, it needs to be run to test that it is valid. It means you write all the codes just to find no output, in case there is an error. Hence, you have to spend hours trying to find bugs in the code. The TypeScript transpiler provides the error-checking feature. TypeScript will compile the code and generate compilation errors, if it finds some sort of syntax errors. This helps to highlight errors before the script is run.\n" +
                        "\n" +
                        "Strong Static Typing − JavaScript is not strongly typed. TypeScript comes with an optional static typing and type inference system through the TLS (TypeScript Language Service). The type of a variable, declared with no type, may be inferred by the TLS based on its value.\n" +
                        "\n" +
                        "TypeScript supports type definitions for existing JavaScript libraries. TypeScript Definition file (with .d.ts extension) provides definition for external JavaScript libraries. Hence, TypeScript code can contain these libraries.\n" +
                        "\n" +
                        "TypeScript supports Object Oriented Programming concepts like classes, interfaces, inheritance, etc.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Components of TypeScript",
                "At its heart, TypeScript has the following three components −\n" +
                        "\n" +
                        "Language − It comprises of the syntax, keywords, and type annotations.\n" +
                        "\n" +
                        "The TypeScript Compiler − The TypeScript compiler (tsc) converts the instructions written in TypeScript to its JavaScript equivalent.\n" +
                        "\n" +
                        "The TypeScript Language Service − The \"Language Service\" exposes an additional layer around the core compiler pipeline that are editor-like applications. The language service supports the common set of a typical editor operations like statement completions, signature help, code formatting and outlining, colorization, etc.",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "TypeScript Advantages",
                "1. TypeScript is an open-source language with continuous development and maintenance by Microsoft.\n\n" +
                        "2. TypeScript runs on any browser or JavaScript engine.\n\n" +
                        "3. TypeScript is similar to JavaScript and uses the same syntax and semantics. All of TypeScript's code finally gets converted into JavaScript. This allows a quicker learning curve for front-end developers currently coding in JavaScript.\n\n" +
                        "4. TypeScript is also closer in syntax to backend languages like Java and Scala. This helps backend developers write front-end code faster.\n\n" +
                        "5. TypeScript code can be called from an existing JavaScript code. TypeScript also works with existing JavaScript frameworks and libraries without any issues.\n\n" +
                        "6. The TypeScript Definition file, with .d.ts extension, provides support for existing JavaScript libraries like Jquery, D3.js, etc. So, TypeScript code can add JavaScript libraries using type definitions to avail the benefits of type-checking, code autocompletion, and documentation in existing dynamically-typed JavaScript libraries.\n\n" +
                        "7. TypeScript has support for the latest JavaScript features from ECMAScript 2015 . It includes features from ES6 and ES7 that can run in ES5-level JavaScript engines like Node.js. This offers a massive advantage of using features from future JavaScript versions in current JavaScript engines.\n\n" +
                        "8. TypeScript has easy integration with task runner tools like Grunt and Gulp to automate the workflow.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }
    //TypeScript Basic Syntax
    private static List<LearnDetailsModel> TypeScriptBasicSyntax(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Basic Syntax",
                "Syntax defines a set of rules for writing programs. Every language specification defines its own syntax. A TypeScript program is composed of −\n" +
                        "\n" +
                        "Modules\n" +
                        "Functions\n" +
                        "Variables\n" +
                        "Statements and Expressions\n" +
                        "Comments" +
                        "\n\n" +
                        "Your First TypeScript Code" +
                        "\n\n" +
                        "Let us start with the traditional “Hello World!” example −\n" +
                        "\n" +
                        "var message:string = \"Hello World!\" \n" +
                        "console.log(message)\n\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var message = \"Hello World!\";\n" +
                        "console.log(message);\n\n" +
                        "Line 1 declares a variable by the name message. Variables are a mechanism to store values in a program.\n" +
                        "\n" +
                        "Line 2 prints the variable’s value to the prompt. Here, console refers to the terminal window. The function log () is used to display text on the screen.",
                "var message = \"Hello World!\";\n" +
                        "console.log(message);",
                "Hello World!"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Identifiers in TypeScript",
                "Identifiers are names given to elements in a program like variables, functions etc. The rules for identifiers are −\n" +
                        "\n" +
                        "Identifiers can include both, characters and digits. However, the identifier cannot begin with a digit.\n" +
                        "\n" +
                        "Identifiers cannot include special symbols except for underscore (_) or a dollar sign ($).\n" +
                        "\n" +
                        "Identifiers cannot be keywords.\n" +
                        "\n" +
                        "They must be unique.\n" +
                        "\n" +
                        "Identifiers are case-sensitive.\n" +
                        "\n" +
                        "Identifiers cannot contain spaces.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Whitespace and Line Breaks",
                "TypeScript ignores spaces, tabs, and newlines that appear in programs. You can use spaces, tabs, and newlines freely in your program and you are free to format and indent your programs in a neat and consistent way that makes the code easy to read and understand.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "TypeScript is Case-sensitive",
                "TypeScript is case-sensitive. This means that TypeScript differentiates between uppercase and lowercase characters.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Semicolons are optional",
                "Each line of instruction is called a statement. Semicolons are optional in TypeScript.\n" +
                        "\n" +
                        "Example\n" +
                        "\n" +
                        "console.log(\"hello world\")\n" +
                        "console.log(\"We are learning TypeScript\")\n" +
                        "A single line can contain multiple statements. However, these statements must be separated by a semicolon.",
                "console.log(\"hello world\")\n" +
                        "console.log(\"We are learning TypeScript\")",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Comments in TypeScript",
                "Comments are a way to improve the readability of a program. Comments can be used to include additional information about a program like author of the code, hints about a function/ construct etc. Comments are ignored by the compiler.\n" +
                        "\n" +
                        "TypeScript supports the following types of comments −\n" +
                        "\n" +
                        "Single-line comments ( // ) − Any text between a // and the end of a line is treated as a comment\n" +
                        "\n" +
                        "Multi-line comments (/* */) − These comments may span multiple lines.\n" +
                        "\n" +
                        "Example\n" +
                        "\n" +
                        "//this is single line comment \n" +
                        " \n" +
                        "/* This is a  \n" +
                        "   Multi-line comment \n" +
                        "*/",
                "//this is single line comment \n" +
                        " \n" +
                        "/* This is a  \n" +
                        "   Multi-line comment \n" +
                        "*/",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "TypeScript and Object Orientation",
                "TypeScript is Object-Oriented JavaScript. Object Orientation is a software development paradigm that follows real-world modelling. Object Orientation considers a program as a collection of objects that communicate with each other via mechanism called methods. TypeScript supports these object oriented components too.\n" +
                        "\n" +
                        "Object − An object is a real time representation of any entity. According to Grady Brooch, every object must have three features −\n" +
                        "\n" +
                        "State − described by the attributes of an object\n" +
                        "\n" +
                        "Behavior − describes how the object will act\n" +
                        "\n" +
                        "Identity − a unique value that distinguishes an object from a set of similar such objects.\n" +
                        "\n" +
                        "Class − A class in terms of OOP is a blueprint for creating objects. A class encapsulates data for the object.\n" +
                        "\n" +
                        "Method − Methods facilitate communication between objects.\n" +
                        "\n" +
                        "Example: TypeScript and Object Orientation\n" +
                        "\n" +
                        "class Greeting { \n" +
                        "   greet():void { \n" +
                        "      console.log(\"Hello World!!!\") \n" +
                        "   } \n" +
                        "} \n" +
                        "var obj = new Greeting(); \n" +
                        "obj.greet();\n\n" +
                        "The above example defines a class Greeting. The class has a method greet (). The method prints the string “Hello World” on the terminal. The new keyword creates an object of the class (obj). The object invokes the method greet ().\n" +
                        "\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var Greeting = (function () {\n" +
                        "   function Greeting() {\n" +
                        "   }\n" +
                        "   Greeting.prototype.greet = function () {\n" +
                        "      console.log(\"Hello World!!!\");\n" +
                        "   };\n" +
                        "\treturn Greeting;\n" +
                        "}());\n" +
                        "\n" +
                        "var obj = new Greeting();\n" +
                        "obj.greet()",
                "var Greeting = (function () {\n" +
                        "   function Greeting() {\n" +
                        "   }\n" +
                        "   Greeting.prototype.greet = function () {\n" +
                        "      console.log(\"Hello World!!!\");\n" +
                        "   };\n" +
                        "\treturn Greeting;\n" +
                        "}());\n" +
                        "\n" +
                        "var obj = new Greeting();\n" +
                        "obj.greet()",
                "Hello World!!!"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //TypeScript Types
    private static List<LearnDetailsModel> TypeScriptTypes(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Types",
                "The Type System represents the different types of values supported by the language. The Type System checks the validity of the supplied values, before they are stored or manipulated by the program. This ensures that the code behaves as expected. The Type System further allows for richer code hinting and automated documentation too.\n" +
                        "\n" +
                        "TypeScript provides data types as a part of its optional Type System. The data type classification is as given below −" +
                        "\n\n" +
                        "1. Any type\n" +
                        "2. Built-in Types\n" +
                        "3. User-defined Types" +
                        "\n\n" +
                        "The Any type:\n" +
                        "The any data type is the super type of all types in TypeScript. It denotes a dynamic type. Using the any type is equivalent to opting out of type checking for a variable.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Built-in types",
                "The following table illustrates all the built-in types in TypeScript −" +
                        "\n\n" +
                        "1. number => Double precision 64-bit floating point values. It can be used to represent both, integers and fractions.\n\n" +
                        "2. string => Represents a sequence of Unicode characters\n\n" +
                        "3. boolean => Represents logical values, true and false\n\n" +
                        "4. void => Used on function return types to represent non-returning functions\n\n" +
                        "5. null => Represents an intentional absence of an object value.\n\n" +
                        "6. undefined => Denotes value given to all uninitialized variables" +
                        "\n\n" +
                        "Note − There is no integer type in TypeScript and JavaScript.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Null and undefined ─ Are they the same?",
                "The null and the undefined datatype are often a source of confusion. The null and undefined cannot be used to reference the data type of a variable. They can only be assigned as values to a variable.\n" +
                        "\n" +
                        "However, null and undefined are not the same. A variable initialized with undefined means that the variable has no value or object assigned to it while null means that the variable has been set to an object whose value is undefined.\n" +
                        "\n" +
                        "User-defined Types:\n\n" +
                        "User-defined types include Enumerations (enums), classes, interfaces, arrays, and tuple. These are discussed in detail in the later chapters.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //TypeScript Variables
    private static List<LearnDetailsModel> TypeScriptVariables(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Variables",
                "A variable, by definition, is “a named space in the memory” that stores values. In other words, it acts as a container for values in a program. TypeScript variables must follow the JavaScript naming rules −\n" +
                        "\n" +
                        "Variable names can contain alphabets and numeric digits.\n" +
                        "\n" +
                        "They cannot contain spaces and special characters, except the underscore (_) and the dollar ($) sign.\n" +
                        "\n" +
                        "Variable names cannot begin with a digit.\n" +
                        "\n" +
                        "A variable must be declared before it is used. Use the var keyword to declare variables.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Variable Declaration in TypeScript",
                "The type syntax for declaring a variable in TypeScript is to include a colon (:) after the variable name, followed by its type. Just as in JavaScript, we use the var keyword to declare a variable.\n" +
                        "\n" +
                        "When you declare a variable, you have four options −\n" +
                        "\n" +
                        "Declare its type and value in one statement.\n" +
                        "\n" +
                        "Declare Type\n" +
                        "Declare its type but no value. In this case, the variable will be set to undefined.\n" +
                        "\n" +
                        "Undefined\n" +
                        "Declare its value but no type. The variable type will be set to the data type of the assigned value.\n" +
                        "\n" +
                        "Any\n" +
                        "Declare neither value not type. In this case, the data type of the variable will be any and will be initialized to undefined.\n" +
                        "\n" +
                        "Any and Undefined\n" +
                        "The following table illustrates the valid syntax for variable declaration as discussed above −" +
                        "\n\n" +
                        "var name:string = ”mary”\n" +
                        "\n" +
                        "The variable stores a value of type string" +
                        "\n\n" +
                        "var name:string;\n" +
                        "\n" +
                        "The variable is a string variable. The variable’s value is set to undefined by default" +
                        "\n\n" +
                        "var name = ”mary”\n" +
                        "\n" +
                        "The variable’s type is inferred from the data type of the value. Here, the variable is of the type string" +
                        "\n\n" +
                        "var name;\n" +
                        "\n" +
                        "The variable’s data type is any. Its value is set to undefined by default." +
                        "\n\n\n" +
                        "Example: Variables in TypeScript\n" +
                        "var name:string = \"Anne\"; \n" +
                        "var score1:number = 50;\n" +
                        "var score2:number = 42.50\n" +
                        "var sum = score1 + score2 \n" +
                        "console.log(\"name\"+name) \n" +
                        "console.log(\"first score: \"+score1) \n" +
                        "console.log(\"second score: \"+score2) \n" +
                        "console.log(\"sum of the scores: \"+sum)\n\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var name = \"Anne\";\n" +
                        "var score1 = 50;\n" +
                        "var score2 = 42.50;\n" +
                        "var sum = score1 + score2;\n" +
                        "console.log(\"name\" + name);\n" +
                        "console.log(\"first score: \" + score1);\n" +
                        "console.log(\"second score : \" + score2);\n" +
                        "console.log(\"sum of the scores: \" + sum);",
                "var name = \"Anne\";\n" +
                        "var score1 = 50;\n" +
                        "var score2 = 42.50;\n" +
                        "var sum = score1 + score2;\n" +
                        "console.log(\"name\" + name);\n" +
                        "console.log(\"first score: \" + score1);\n" +
                        "console.log(\"second score : \" + score2);\n" +
                        "console.log(\"sum of the scores: \" + sum);",
                "name:Anne \n" +
                        "first score:50 \n" +
                        "second score:42.50 \n" +
                        "sum of the scores:92.50"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Type Assertion in TypeScript",
                "TypeScript allows changing a variable from one type to another. TypeScript refers to this process as Type Assertion. The syntax is to put the target type between < > symbols and place it in front of the variable or expression. The following example explains this concept −\n" +
                        "\n" +
                        "Example\n" +
                        "var str = '1' \n" +
                        "var str2:number = <number> <any> str   //str is now of type number \n" +
                        "console.log(typeof(str2))\n\n" +
                        "If you hover the mouse pointer over the type assertion statement in Visual Studio Code, it displays the change in the variable’s data type. Basically it allows the assertion from type S to T succeed if either S is a subtype of T or T is a subtype of S.\n" +
                        "\n" +
                        "The reason why it's not called \"type casting\" is that casting generally implies some sort of runtime support while, “type assertions” are purely a compile time construct and a way for you to provide hints to the compiler on how you want your code to be analyzed.\n" +
                        "\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "\"use strict\";\n" +
                        "var str = '1';\n" +
                        "var str2 = str; //str is now of type number \n" +
                        "console.log(typeof (str2));",
                "\"use strict\";\n" +
                        "var str = '1';\n" +
                        "var str2 = str;\n" +
                        "console.log(typeof (str2));",
                "string"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Inferred Typing in TypeScript",
                "Given the fact that, Typescript is strongly typed, this feature is optional. TypeScript also encourages dynamic typing of variables. This means that, TypeScript encourages declaring a variable without a type. In such cases, the compiler will determine the type of the variable on the basis of the value assigned to it. TypeScript will find the first usage of the variable within the code, determine the type to which it has been initially set and then assume the same type for this variable in the rest of your code block.\n" +
                        "\n" +
                        "The same is explained in the following code snippet −\n" +
                        "\n" +
                        "Example: Inferred Typing\n" +
                        "var num = 2;    // data type inferred as  number \n" +
                        "console.log(\"value of num \"+num); \n" +
                        "num = \"12\";\n" +
                        "console.log(num);\n\n" +
                        "In the above code snippet −\n" +
                        "\n" +
                        "The code declares a variable and sets its value to 2. Note that the variable declaration doesn't specify the data type. Hence, the program uses inferred typing to determine the data type of the variable, i.e., it assigns the type of the first value that the variable is set to. In this case, num is set to the type number.\n" +
                        "\n" +
                        "When the code tries to set the variable’s value to string. The compiler throws an error as the variable’s type is already set to number.",
                "var num = 2;\n" +
                        "console.log(\"value of num \"+num); \n" +
                        "num = \"12\";\n" +
                        "console.log(num);",
                "error TS2011: Cannot convert 'string' to 'number'."
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "TypeScript Variable Scope",
                "The scope of a variable specifies where the variable is defined. The availability of a variable within a program is determined by its scope. TypeScript variables can be of the following scopes −\n" +
                        "\n" +
                        "Global Scope − Global variables are declared outside the programming constructs. These variables can be accessed from anywhere within your code.\n" +
                        "\n" +
                        "Class Scope − These variables are also called fields. Fields or class variables are declared within the class but outside the methods. These variables can be accessed using the object of the class. Fields can also be static. Static fields can be accessed using the class name.\n" +
                        "\n" +
                        "Local Scope − Local variables, as the name suggests, are declared within the constructs like methods, loops etc. Local variables are accessible only within the construct where they are declared.",
                "var global_num = 12\n" +
                        "class Numbers { \n" +
                        "   num_val = 13;\n" +
                        "   static sval = 10;\n" +
                        "   \n" +
                        "   storeNum():void { \n" +
                        "      var local_num = 14;\n" +
                        "   } \n" +
                        "} \n" +
                        "console.log(\"Global num: \"+global_num)  \n" +
                        "console.log(Numbers.sval)\n" +
                        "var obj = new Numbers(); \n" +
                        "console.log(\"Global num: \"+obj.num_val) ",
                "Global num: 12\n" +
                        "10\n" +
                        "Global num: 13"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //TypeScript Operators
    private static List<LearnDetailsModel> TypeScriptOperators(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "What is an Operator?",
                "An operator defines some function that will be performed on the data. The data on which operators work are called operands. Consider the following expression −\n" +
                        "\n" +
                        "7 + 5 = 12\n" +
                        "\n" +
                        "Here, the values 7, 5, and 12 are operands, while + and = are operators.\n" +
                        "\n" +
                        "The major operators in TypeScript can be classified as −\n" +
                        "\n" +
                        "Arithmetic operators\n" +
                        "Logical operators\n" +
                        "Relational operators\n" +
                        "Bitwise operators\n" +
                        "Assignment operators\n" +
                        "Ternary/conditional operator\n" +
                        "String operator\n" +
                        "Type Operator",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Arithmetic Operators",
                "Assume the values in variables a and b are 10 and 5 respectively." +
                        "\n\n" +
                        "1. + (Addition) => returns the sum of the operands(a + b is 15)\n\n" +
                        "2. - (Subtraction) => returns the difference of the values(a - b is 5)\n\n" +
                        "3. * (Multiplication) => returns the product of the values(a * b is 50)\n\n" +
                        "4. / (Division) => performs division operation and returns the quotient(a / b is 2)\n\n" +
                        "5. % (Modulus) => performs division operation and returns the remainder(a % b is 0)\n\n" +
                        "6. ++ (Increment) => Increments the value of the variable by one(a++ is 11)\n\n" +
                        "7. -- (Decrement) => Decrements the value of the variable by one(a-- is 9)",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Relational Operators",
                "Relational Operators test or define the kind of relationship between two entities. Relational operators return a Boolean value, i.e., true/ false.\n" +
                        "\n" +
                        "Assume the value of A is 10 and B is 20." +
                        "\n\n" +
                        "(>) Greater than => (A > B) is False\n\n" +
                        "(<) Lesser than => (A < B) is True\n\n" +
                        "(>=) Greater than or equal to => (A >= B) is False\n\n" +
                        "(<=) Lesser than or equal to => (A <= B) is True\n\n" +
                        "(==) Equality => (A == B) is false\n\n" +
                        "(!=) Not equal => (A != B) is True",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Logical Operators",
                "Logical Operators are used to combine two or more conditions. Logical operators too return a Boolean value. Assume the value of variable A is 10 and B is 20." +
                        "\n\n" +
                        "&& (And) => The operator returns true only if all the expressions specified return true (A > 10 && B > 10) is False\n\n" +
                        "|| (OR) => The operator returns true if at least one of the expressions specified return true (A > 10 || B >10) is True\n\n" +
                        "! (NOT) => The operator returns the inverse of the expression’s result. For E.g.: !(>5) returns false !(A >10 ) is True",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Bitwise Operators",
                "Assume variable A = 2 and B = 3" +
                        "\n\n" +
                        "& (Bitwise AND) => It performs a Boolean AND operation on each bit of its integer arguments. (A & B) is 2\n\n" +
                        "| (BitWise OR) => It performs a Boolean OR operation on each bit of its integer arguments. (A | B) is 3\n\n" +
                        "^ (Bitwise XOR) => It performs a Boolean exclusive OR operation on each bit of its integer arguments. Exclusive OR means that either operand one is true or operand two is true, but not both. (A ^ B) is 1\n\n" +
                        "~ (Bitwise Not) => It is a unary operator and operates by reversing all the bits in the operand. (~B) is -4\n\n" +
                        "<< (Left Shift) => It moves all the bits in its first operand to the left by the number of places specified in the second operand. New bits are filled with zeros. Shifting a value left by one position is equivalent to multiplying it by 2, shifting two positions is equivalent to multiplying by 4, and so on. (A << 1) is 4\n\n" +
                        ">> (Right Shift) => Binary Right Shift Operator. The left operand’s value is moved right by the number of bits specified by the right operand. (A >> 1) is 1\n\n" +
                        ">>> (Right shift with Zero) => This operator is just like the >> operator, except that the bits shifted in on the left are always zero. (A >>> 1) is 1",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Assignment Operators",
                "Note − Same logic applies to Bitwise operators, so they will become <<=, >>=, >>=, &=, |= and ^=. Bellow are Assignment Operators:" +
                        "\n\n" +
                        "= (Simple Assignment) => Assigns values from the right side operand to the left side operand \nC = A + B will assign the value of A + B into C\n\n" +
                        "+= (Add and Assignment) => It adds the right operand to the left operand and assigns the result to the left operand.\nC += A is equivalent to C = C + A\n\n" +
                        "-= (Subtract and Assignment) => It subtracts the right operand from the left operand and assigns the result to the left operand.\nC -= A is equivalent to C = C - A\n\n" +
                        "*= (Multiply and Assignment) => It multiplies the right operand with the left operand and assigns the result to the left operand.\nC *= A is equivalent to C = C * A\n\n" +
                        "/= (Divide and Assignment) => It divides the left operand with the right operand and assigns the result to the left operand.",
                "",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "The negation operator (-)",
                "Changes the sign of a value. Let’s take an example.\n" +
                        "\n" +
                        "var x:number = 4 \n" +
                        "var y = -x; \n" +
                        "console.log(\"value of x: \",x);   //outputs 4 \n" +
                        "console.log(\"value of y: \",y);   //outputs -4\n\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var x = 4;\n" +
                        "var y = -x;\n" +
                        "console.log(\"value of x: \", x);   //outputs 4\n" +
                        "console.log(\"value of y: \", y);   //outputs -4",
                "var x:number = 4 \n" +
                        "var y = -x; \n" +
                        "console.log(\"value of x: \",x);\n" +
                        "console.log(\"value of y: \",y);",
                "value of x:  4 \n" +
                        "value of y:  -4"
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "String Operators: Concatenation operator (+)",
                "The + operator when applied to strings appends the second string to the first. The following example helps us to understand this concept.\n" +
                        "\n" +
                        "var msg:string = \"hello\"+\"world\" \n" +
                        "console.log(msg)\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var msg = \"hello\" + \"world\";\n" +
                        "console.log(msg);",
                "var msg:string = \"hello\"+\"world\" \n" +
                        "console.log(msg)",
                "helloworld"
        );
        final LearnDetailsModel l9 = new LearnDetailsModel(
                "Conditional Operator (?)",
                "This operator is used to represent a conditional expression. The conditional operator is also sometimes referred to as the ternary operator. The syntax is as given below −\n" +
                        "\n" +
                        "Test ? expr1 : expr2\n" +
                        "Test − refers to the conditional expression\n" +
                        "\n" +
                        "expr1 − value returned if the condition is true\n" +
                        "\n" +
                        "expr2 − value returned if the condition is false\n" +
                        "\n" +
                        "Let’s take a look at the following code −\n" +
                        "\n" +
                        "var num:number = -2 \n" +
                        "var result = num > 0 ?\"positive\":\"non-positive\" \n" +
                        "console.log(result)\n\n" +
                        "Line 2 checks whether the value in the variable num is greater than zero. If num is set to a value greater than zero, it returns the string “positive” else the string “non-positive” is returned.\n" +
                        "\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var num = -2;\n" +
                        "var result = num > 0 ? \"positive\" : \"non-positive\";\n" +
                        "console.log(result);",
                "var num:number = -2 \n" +
                        "var result = num > 0 ?\"positive\":\"non-positive\" \n" +
                        "console.log(result)",
                "non-positive"
        );

        final LearnDetailsModel l10 = new LearnDetailsModel(
                "Type Operators",
                "typeof operator\n" +
                        "It is a unary operator. This operator returns the data type of the operand. Take a look at the following example −\n" +
                        "\n" +
                        "var num = 12 \n" +
                        "console.log(typeof num);   //output: number\n\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var num = 12;\n" +
                        "console.log(typeof num);   //output: number",
                "var num = 12 \n" +
                        "console.log(typeof num);",
                "number"
        );
        final LearnDetailsModel l11 = new LearnDetailsModel(
                "instanceof",
                "This operator can be used to test if an object is of a specified type or not. The use of instanceof operator is discussed in the chapter classes.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        list.add(l9);
        list.add(l10);
        list.add(l11);
        return list;
    }
    //TypeScript Decision Making
    private static List<LearnDetailsModel> TypeScriptDecisionMaking(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Decision Making",
                "Decision-making structures require that the programmer specifies one or more conditions to be evaluated or tested by the program, along with a statement or statements to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false.",
                "",
                ""
        );final LearnDetailsModel l2 = new LearnDetailsModel(
                "Statements",
                "A decision-making construct evaluates a condition before the instructions are executed. Decision-making constructs in TypeScript are classified as follows −" +
                        "\n\n" +
                        "1.if statement\n" +
                        "An ‘if’ statement consists of a Boolean expression followed by one or more statements.\n" +
                        "\n" +
                        "2.if...else statement\n" +
                        "An ‘if’ statement can be followed by an optional ‘else’ statement, which executes when the Boolean expression is false.\n" +
                        "\n" +
                        "3.else…if and nested if statements\n" +
                        "You can use one ‘if’ or ‘else if’ statement inside another ‘if’ or ‘else if’ statement(s).\n" +
                        "\n" +
                        "4.switch statement\n" +
                        "A ‘switch’ statement allows a variable to be tested against a list of values.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //TypeScript Loops
    private static List<LearnDetailsModel> TypeScriptLoops(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Loops",
                "You may encounter situations, when a block of code needs to be executed several number of times. " +
                        "In general, statements are executed sequentially: The first statement in a function is executed first, followed by the second, and so on.\n" +
                        "\n" +
                        "Programming languages provide various control structures that allow for more complicated execution paths.\n" +
                        "A loop statement allows us to execute a statement or group of statements multiple times.\n" +
                        "TypeScript provides different types of loops to handle looping requirements.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Definite Loop",
                "A loop whose number of iterations are definite/fixed is termed as a definite loop. The for loop is an implementation of a definite loop." +
                        "\n\n" +
                        "1. for loop\n" +
                        "The for loop is an implementation of a definite loop.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Indefinite Loop",
                "An indefinite loop is used when the number of iterations in a loop is indeterminate or unknown.\n" +
                        "\n" +
                        "Indefinite loops can be implemented using −" +
                        "\n\n" +
                        "1. while loop\n" +
                        "The while loop executes the instructions each time the condition specified evaluates to true.\n" +
                        "\n" +
                        "2. do… while\n" +
                        "The do…while loop is similar to the while loop except that the do...while loop doesn't evaluate the condition for the first time the loop executes.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Example: while versus do..while",
                "The example initially declares a while loop. The loop is entered only if the expression passed to while evaluates to true. In this example, the value of n is not greater than zero, hence the expression returns false and the loop is skipped.\n" +
                        "\n" +
                        "On the other hand, the do…while loop executes statement once. This is because the initial iteration does not consider the Boolean expression. However, for the subsequent iteration, the while checks the condition and takes the control out of the loop.",
                "var n:number = 5 \n" +
                        "while(n > 5) { \n" +
                        "   console.log(\"Entered while\") \n" +
                        "} \n" +
                        "do { \n" +
                        "   console.log(\"Entered do…while\") \n" +
                        "} \n" +
                        "while(n>5)",
                "Entered do…while"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "The break Statement",
                "The break statement is used to take the control out of a construct. Using break in a loop causes the program to exit the loop. Its syntax is as follows −\n" +
                        "\n" +
                        "Syntax: " +
                        "break" +
                        "\n\n" +
                        "Example\n" +
                        "Now, take a look at the following example code −\n" +
                        "\n" +
                        "var i:number = 1 \n" +
                        "while(i<=10) { \n" +
                        "   if (i % 5 == 0) {   \n" +
                        "      console.log (\"The first multiple of 5  between 1 and 10 is : \"+i) \n" +
                        "      break     //exit the loop if the first multiple is found \n" +
                        "   } \n" +
                        "   i++ \n" +
                        "}  //outputs 5 and exits the loop",
                "var i:number = 1 \n" +
                        "while(i<=10) { \n" +
                        "   if (i % 5 == 0) {   \n" +
                        "      console.log (\"The first multiple of 5  between 1 and 10 is : \"+i) \n" +
                        "      break\n" +
                        "   } \n" +
                        "   i++ \n" +
                        "}",
                "The first multiple of 5  between 1 and 10 is : 5"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "The continue Statement",
                "The continue statement skips the subsequent statements in the current iteration and takes the control back to the beginning of the loop. Unlike the break statement, the continue doesn’t exit the loop. It terminates the current iteration and starts the subsequent iteration.\n" +
                        "\n" +
                        "Syntax: " +
                        "continue" +
                        "\n\n" +
                        "Example\n" +
                        "An example of the continue statement is given below −\n" +
                        "\n" +
                        "var num:number = 0\n" +
                        "var count:number = 0;\n" +
                        "\n" +
                        "for(num=0;num<=20;num++) {\n" +
                        "   if (num % 2==0) {\n" +
                        "      continue\n" +
                        "   }\n" +
                        "   count++\n" +
                        "}\n" +
                        "console.log (\" The count of odd values between 0 and 20 is: \"+count)    //outputs 10 \n\n" +
                        "The above example displays the number of odd values between 0 and 20. The loop exits the current iteration if the number is even. This is achieved using the continue statement.\n" +
                        "\n" +
                        "On compiling, it will generate following JavaScript code.\n" +
                        "\n" +
                        "//Generated by typescript 1.8.10\n" +
                        "var num = 0;\n" +
                        "var count = 0;\n" +
                        "\n" +
                        "for (num = 0; num <= 20; num++) {\n" +
                        "   if (num % 2 == 0) {\n" +
                        "      continue;\n" +
                        "   }\n" +
                        "   count++;\n" +
                        "}\n" +
                        "console.log(\" The count of odd values between 0 and 20 is: \" + count);     //outputs 10",
                "var num:number = 0\n" +
                        "var count:number = 0;\n" +
                        "\n" +
                        "for(num=0;num<=20;num++) {\n" +
                        "   if (num % 2==0) {\n" +
                        "      continue\n" +
                        "   }\n" +
                        "   count++\n" +
                        "}\n" +
                        "console.log (\" The count of odd values between 0 and 20 is: \"+count)",
                "The count of odd values between 0 and 20 is: 10"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "The Infinite Loop",
                "An infinite loop is a loop that runs endlessly. The for loop and the while loop can be used to make an endless loop.\n" +
                        "\n" +
                        "Syntax: Infinite Loop using for loop\n" +
                        "for(;;) { \n" +
                        "   //statements \n" +
                        "}\n\n" +
                        "Example: Infinite loop using for loop\n" +
                        "for(;;) { \n" +
                        "   console.log(“This is an endless loop”) \n" +
                        "}\n\n" +
                        "Syntax: Infinite loop using while loop\n" +
                        "while(true) { \n" +
                        "   //statements \n" +
                        "} \n\n" +
                        "Example: Infinite loop using while loop\n" +
                        "while(true) { \n" +
                        "   console.log(“This is an endless loop”) \n" +
                        "}",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //TypeScript Functions
    private static List<LearnDetailsModel> TypeScriptFunctions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Functions",
                "Functions are the building blocks of readable, maintainable, and reusable code. A function is a set of statements to perform a specific task. Functions organize the program into logical blocks of code. Once defined, functions may be called to access code. This makes the code reusable. Moreover, functions make it easy to read and maintain the program’s code.\n" +
                        "\n" +
                        "A function declaration tells the compiler about a function's name, return type, and parameters. A function definition provides the actual body of the function." +
                        "\n\n" +
                        "1. Defining a Function\n" +
                        "A function definition specifies what and how a specific task would be done.\n" +
                        "\n" +
                        "2. Calling a Function\n" +
                        "A function must be called so as to execute it.\n" +
                        "\n" +
                        "3. Returning Functions\n" +
                        "Functions may also return value along with control, back to the caller.\n" +
                        "\n" +
                        "4. Parameterized Function\n" +
                        "Parameters are a mechanism to pass values to functions.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Optional Parameters",
                "Optional parameters can be used when arguments need not be compulsorily passed for a function’s execution. A parameter can be marked optional by appending a question mark to its name. The optional parameter should be set as the last argument in a function. The syntax to declare a function with optional parameter is as given below −\n" +
                        "\n" +
                        "function function_name (param1[:type], param2[:type], param3[:type])",
                "function disp_details(id:number,name:string,mail_id?:string) { \n" +
                        "   console.log(\"ID:\", id); \n" +
                        "   console.log(\"Name\",name); \n" +
                        "   \n" +
                        "   if(mail_id!=undefined)  \n" +
                        "   console.log(\"Email Id\",mail_id); \n" +
                        "}\n" +
                        "disp_details(123,\"Anne\");\n" +
                        "disp_details(111,\"Luke\",\"luke@xyz.com\");",
                "ID:123 \n" +
                        "Name Anne \n" +
                        "ID: 111 \n" +
                        "Name  Luke \n" +
                        "Email Id luke@xyz.com"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Rest Parameters",
                "Rest parameters are similar to variable arguments in Java. Rest parameters don’t restrict the number of values that you can pass to a function. However, the values passed must all be of the same type. In other words, rest parameters act as placeholders for multiple arguments of the same type.\n" +
                        "\n" +
                        "To declare a rest parameter, the parameter name is prefixed with three periods. Any nonrest parameter should come before the rest parameter.",
                "function addNumbers(...nums:number[]) {  \n" +
                        "   var i;   \n" +
                        "   var sum:number = 0; \n" +
                        "   \n" +
                        "   for(i = 0;i<nums.length;i++) { \n" +
                        "      sum = sum + nums[i]; \n" +
                        "   } \n" +
                        "   console.log(\"sum of the numbers\",sum) \n" +
                        "} \n" +
                        "addNumbers(1,2,3) \n" +
                        "addNumbers(10,10,10,10,10)",
                "sum of numbers 6\n" +
                        "sum of numbers 50"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Default Parameters",
                "Function parameters can also be assigned values by default. However, such parameters can also be explicitly passed values.\n" +
                        "\n" +
                        "Syntax:\n" +
                        "function function_name(param1[:type],param2[:type] = default_value) { \n" +
                        "}\n" +
                        "Note − A parameter cannot be declared optional and default at the same time.",
                "function calculate_discount(price:number,rate:number = 0.50) { \n" +
                        "   var discount = price * rate; \n" +
                        "   console.log(\"Discount Amount: \",discount); \n" +
                        "} \n" +
                        "calculate_discount(1000) \n" +
                        "calculate_discount(1000,0.30)",
                "Discount amount : 500 \n" +
                        "Discount amount : 300"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Anonymous Function",
                "Functions that are not bound to an identifier (function name) are called as anonymous functions. These functions are dynamically declared at runtime. Anonymous functions can accept inputs and return outputs, just as standard functions do. An anonymous function is usually not accessible after its initial creation.\n" +
                        "\n" +
                        "Variables can be assigned an anonymous function. Such an expression is called a function expression.\n" +
                        "\n" +
                        "Syntax:\n" +
                        "var res = function( [arguments] ) { ... }",
                "var msg = function() { \n" +
                        "   return \"hello world\";  \n" +
                        "} \n" +
                        "console.log(msg())",
                "hello world"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "The Function Constructor",
                "ypeScript also supports defining a function with the built-in JavaScript constructor called Function ().\n" +
                        "\n" +
                        "Syntax:\n" +
                        "var res = new Function( [arguments] ) { ... }.",
                "var myFunction = new Function(\"a\", \"b\", \"return a * b\"); \n" +
                        "var x = myFunction(4, 3); \n" +
                        "console.log(x);",
                "12"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Recursion and TypeScript Functions",
                "Recursion is a technique for iterating over an operation by having a function call to itself repeatedly until it arrives at a result. Recursion is best applied when you need to call the same function repeatedly with different parameters from within a loop.",
                "function factorial(number) {\n" +
                        "   if (number <= 0) {\n" +
                        "      return 1; \n" +
                        "   } else {     \n" +
                        "      return (number * factorial(number - 1));\n" +
                        "   } \n" +
                        "}; \n" +
                        "console.log(factorial(6));",
                "720"
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "Lambda Functions",
                "Lambda refers to anonymous functions in programming. Lambda functions are a concise mechanism to represent anonymous functions. These functions are also called as Arrow functions.\n" +
                        "\n" +
                        "Lambda Function - Anatomy\n" +
                        "There are 3 parts to a Lambda function −\n" +
                        "\n" +
                        "Parameters − A function may optionally have parameters\n" +
                        "\n" +
                        "The fat arrow notation/lambda notation (=>) − It is also called as the goes to operator\n" +
                        "\n" +
                        "Statements − represent the function’s instruction set\n" +
                        "\n" +
                        "Tip − By convention, the use of single letter parameter is encouraged for a compact and precise function declaration.\n" +
                        "\n" +
                        "Lambda Expression\n" +
                        "It is an anonymous function expression that points to a single line of code. Its syntax is as follows −\n" +
                        "\n" +
                        "( [param1, parma2,…param n] )=>statement;",
                "var foo = (x:number)=>10 + x \n" +
                        "console.log(foo(100))",
                "110"
        );
        final LearnDetailsModel l9 = new LearnDetailsModel(
                "Function Overloads",
                "Functions have the capability to operate differently on the basis of the input provided to them. In other words, a program can have multiple methods with the same name with different implementation. This mechanism is termed as Function Overloading. TypeScript provides support for function overloading.\n" +
                        "\n" +
                        "To overload a function in TypeScript, you need to follow the steps given below −\n" +
                        "\n" +
                        "Step 1 − Declare multiple functions with the same name but different function signature. Function signature includes the following.\n" +
                        "\n" +
                        "The data type of the parameter\n" +
                        "\n" +
                        "function disp(string):void; \n" +
                        "function disp(number):void;\n" +
                        "The number of parameters\n" +
                        "\n" +
                        "function disp(n1:number):void; \n" +
                        "function disp(x:number,y:number):void;\n" +
                        "The sequence of parameters\n" +
                        "\n" +
                        "function disp(n1:number,s1:string):void; \n" +
                        "function disp(s:string,n:number):void;\n" +
                        "Note − The function signature doesn't include the function’s return type.\n" +
                        "\n" +
                        "Step 2 − The declaration must be followed by the function definition. The parameter types should be set to any if the parameter types differ during overload. Additionally, for case b explained above, you may consider marking one or more parameters as optional during the function definition.\n" +
                        "\n" +
                        "Step 3 − Finally, you must invoke the function to make it functional.",
                "function disp(s1:string):void; \n" +
                        "function disp(n1:number,s1:string):void; \n" +
                        "\n" +
                        "function disp(x:any,y?:any):void { \n" +
                        "   console.log(x); \n" +
                        "   console.log(y); \n" +
                        "} \n" +
                        "disp(\"abc\") \n" +
                        "disp(1,\"xyz\");",
                "abc\n" +
                        "1\n" +
                        "xyz"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        list.add(l9);

        return list;
    }
    //TypeScript Numbers
    private static List<LearnDetailsModel> TypeScriptNumbers(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Numbers",
                "TypeScript like JavaScript supports numeric values as Number objects. A number object converts numeric literal to an instance of the number class. The Number class acts as a wrapper and enables manipulation of numeric literals as they were objects.\n" +
                        "\n" +
                        "Syntax\n" +
                        "var var_name = new Number(value)\n" +
                        "In case a non-numeric argument is passed as an argument to the Number’s constructor, it returns NaN (Not–a–Number)",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example: MAX_VALUE & MIN_VALUE",
                "On compiling, it will generate the same code in JavaScript.",
                "console.log(\"TypeScript Number Properties: \"); \n" +
                        "console.log(\"Maximum value that a number variable can hold: \" + Number.MAX_VALUE); \n" +
                        "console.log(\"The least value that a number variable can hold: \" + Number.MIN_VALUE); \n" +
                        "console.log(\"Value of Negative Infinity: \" + Number.NEGATIVE_INFINITY); \n" +
                        "console.log(\"Value of Negative Infinity:\" + Number.POSITIVE_INFINITY);",
                "TypeScript Number Properties:  \n" +
                        "Maximum value that a number variable can hold: 1.7976931348623157e+308 \n" +
                        "The least value that a number variable can hold: 5e-324 \n" +
                        "Value of Negative Infinity: -Infinity \n" +
                        "Value of Negative Infinity:Infinity"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Example: NaN",
                "On compiling, it will generate the same code in JavaScript.",
                "var month = 0 \n" +
                        "if( month<=0 || month >12) { \n" +
                        "   month = Number.NaN \n" +
                        "   console.log(\"Month is \"+ month) \n" +
                        "} else { \n" +
                        "   console.log(\"Value Accepted..\") \n" +
                        "}",
                "Month is NaN"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Example: prototype",
                "On compiling, it will generate the following JavaScript code −",
                "function employee(id:number,name:string) { \n" +
                        "   this.id = id \n" +
                        "   this.name = name \n" +
                        "} \n" +
                        "\n" +
                        "var emp = new employee(123,\"Smith\") \n" +
                        "employee.prototype.email = \"smith@abc.com\" \n" +
                        "\n" +
                        "console.log(\"Employee 's Id: \"+emp.id) \n" +
                        "console.log(\"Employee's name: \"+emp.name) \n" +
                        "console.log(\"Employee's Email ID: \"+emp.email)",
                "Employee’s Id: 123 \n" +
                        "Employee's name: Smith \n" +
                        "Employee’s Email ID: smith@abc.com"
        );final LearnDetailsModel l5 = new LearnDetailsModel(
                "Number Methods",
                "The Number object contains only the default methods that are a part of every object's definition. Some of the commonly used methods are listed below −" +
                        "\n\n" +
                        "1.toExponential()\n" +
                        "Forces a number to display in exponential notation, even if the number is in the range in which JavaScript normally uses standard notation.\n" +
                        "\n" +
                        "2.toFixed()\n" +
                        "Formats a number with a specific number of digits to the right of the decimal.\n" +
                        "\n" +
                        "3.toLocaleString()\n" +
                        "Returns a string value version of the current number in a format that may vary according to a browser's local settings.\n" +
                        "\n" +
                        "4.toPrecision()\n" +
                        "Defines how many total digits (including digits to the left and right of the decimal) to display of a number. A negative precision will throw an error.\n" +
                        "\n" +
                        "5.toString()\n" +
                        "Returns the string representation of the number's value. The function is passed the radix, an integer between 2 and 36 specifying the base to use for representing numeric values.\n" +
                        "\n" +
                        "6.valueOf()\n" +
                        "Returns the number's primitive value.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //TypeScript Strings
    private static List<LearnDetailsModel> TypeScriptStrings(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Strings",
                "The String object lets you work with a series of characters. It wraps the string primitive data type with a number of helper methods.\n" +
                        "\n" +
                        "Syntax\n" +
                        "var var_name = new String(string);" +
                        "\n\n" +
                        "A list of the methods available in String object along with their description is given below −" +
                        "\n\n" +
                        "1.Constructor\n" +
                        "Returns a reference to the String function that created the object.\n" +
                        "\n" +
                        "2.Length\n" +
                        "Returns the length of the string.\n" +
                        "\n" +
                        "3.Prototype\n" +
                        "The prototype property allows you to add properties and methods to an object.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "String Methods",
                "A list of the methods available in String object along with their description is given below −" +
                        "\n\n" +
                        "1.charAt()\n" +
                        "Returns the character at the specified index.\n" +
                        "\n" +
                        "2.charCodeAt()\n" +
                        "Returns a number indicating the Unicode value of the character at the given index.\n" +
                        "\n" +
                        "3.concat()\n" +
                        "Combines the text of two strings and returns a new string.\n" +
                        "\n" +
                        "4.indexOf()\n" +
                        "Returns the index within the calling String object of the first occurrence of the specified value, or -1 if not found.\n" +
                        "\n" +
                        "5.lastIndexOf()\n" +
                        "Returns the index within the calling String object of the last occurrence of the specified value, or -1 if not found.\n" +
                        "\n" +
                        "6.localeCompare()\n" +
                        "Returns a number indicating whether a reference string comes before or after or is the same as the given string in sort order.\n" +
                        "\n" +
                        "7.match()\n" +
                        "Used to match a regular expression against a string.\n" +
                        "\n" +
                        "8.replace()\n" +
                        "Used to find a match between a regular expression and a string, and to replace the matched substring with a new substring.\n" +
                        "\n" +
                        "9.search()\n" +
                        "Executes the search for a match between a regular expression and a specified string.\n" +
                        "\n" +
                        "10.slice()\n" +
                        "Extracts a section of a string and returns a new string.\n" +
                        "\n" +
                        "11.split()\n" +
                        "Splits a String object into an array of strings by separating the string into substrings.\n" +
                        "\n" +
                        "12.substr()\n" +
                        "Returns the characters in a string beginning at the specified location through the specified number of characters.\n" +
                        "\n" +
                        "13.substring()\n" +
                        "Returns the characters in a string between two indexes into the string.\n" +
                        "\n" +
                        "14.toLocaleLowerCase()\n" +
                        "The characters within a string are converted to lower case while respecting the current locale.\n" +
                        "\n" +
                        "15.toLocaleUpperCase()\n" +
                        "The characters within a string are converted to upper case while respecting the current locale.\n" +
                        "\n" +
                        "16.toLowerCase()\n" +
                        "Returns the calling string value converted to lower case.\n" +
                        "\n" +
                        "17.toString()\n" +
                        "Returns a string representing the specified object.\n" +
                        "\n" +
                        "18.toUpperCase()\n" +
                        "Returns the calling string value converted to uppercase.\n" +
                        "\n" +
                        "19.valueOf()\n" +
                        "Returns the primitive value of the specified object.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        return list;
    }
    //TypeScript Arrays
    private static List<LearnDetailsModel> TypeScriptArrays(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Arrays",
                "The use of variables to store values poses the following limitations −\n" +
                        "\n" +
                        "Variables are scalar in nature. In other words, a variable declaration can only contain a single at a time. This means that to store n values in a program n variable declarations will be needed. Hence, the use of variables is not feasible when one needs to store a larger collection of values.\n" +
                        "\n" +
                        "Variables in a program are allocated memory in random order, thereby making it difficult to retrieve/read the values in the order of their declaration.\n" +
                        "\n" +
                        "TypeScript introduces the concept of arrays to tackle the same. An array is a homogenous collection of values. To simplify, an array is a collection of values of the same data type. It is a user defined type." +
                        "\n\n" +
                        "Features of an Array\n\n" +
                        "Here is a list of the features of an array −\n" +
                        "\n" +
                        "An array declaration allocates sequential memory blocks.\n" +
                        "\n" +
                        "Arrays are static. This means that an array once initialized cannot be resized.\n" +
                        "\n" +
                        "Each memory block represents an array element.\n" +
                        "\n" +
                        "Array elements are identified by a unique integer called as the subscript / index of the element.\n" +
                        "\n" +
                        "Like variables, arrays too, should be declared before they are used. Use the var keyword to declare an array.\n" +
                        "\n" +
                        "Array initialization refers to populating the array elements.\n" +
                        "\n" +
                        "Array element values can be updated or modified but cannot be deleted.\n" +
                        "\n" +
                        "Declaring and Initializing Arrays\n\n" +
                        "To declare an initialize an array in Typescript use the following syntax −\n" +
                        "\n" +
                        "Syntax:\n" +
                        "var array_name[:datatype];        //declaration \n" +
                        "array_name = [val1,val2,valn..]   //initialization\n" +
                        "An array declaration without the data type is deemed to be of the type any. The type of such an array is inferred from the data type of the array’s first element during initialization.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Accessing Array Elements",
                "The array name followed by the subscript is used refer to an array element. Its syntax is as follows −\n" +
                        "\n" +
                        "array_name[subscript] = value",
                "var alphas:string[]; \n" +
                        "alphas = [\"1\",\"2\",\"3\",\"4\"] \n" +
                        "console.log(alphas[0]); \n" +
                        "console.log(alphas[1]);",
                "1\n" +
                        "2 "
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Array Object",
                "An array can also be created using the Array object. The Array constructor can be passed.\n" +
                        "\n" +
                        "A numeric value that represents the size of the array or\n" +
                        "\n" +
                        "A list of comma separated values.\n" +
                        "\n" +
                        "The following example shows how to create an array using this method.",
                "var arr_names:number[] = new Array(4)  \n" +
                        "\n" +
                        "for(var i = 0;i<arr_names.length;i++) { \n" +
                        "   arr_names[i] = i * 2 \n" +
                        "   console.log(arr_names[i]) \n" +
                        "}",
                "0 \n" +
                        "2 \n" +
                        "4 \n" +
                        "6"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Array Methods",
                "A list of the methods of the Array object along with their description is given below." +
                        "\n\n" +
                        "1.concat()\n" +
                        "Returns a new array comprised of this array joined with other array(s) and/or value(s).\n" +
                        "\n" +
                        "2.every()\n" +
                        "Returns true if every element in this array satisfies the provided testing function.\n" +
                        "\n" +
                        "3.filter()\n" +
                        "Creates a new array with all of the elements of this array for which the provided filtering function returns true.\n" +
                        "\n" +
                        "4.forEach()\n" +
                        "Calls a function for each element in the array.\n" +
                        "\n" +
                        "5.indexOf()\n" +
                        "Returns the first (least) index of an element within the array equal to the specified value, or -1 if none is found.\n" +
                        "\n" +
                        "6.join()\n" +
                        "Joins all elements of an array into a string.\n" +
                        "\n" +
                        "7.lastIndexOf()\n" +
                        "Returns the last (greatest) index of an element within the array equal to the specified value, or -1 if none is found.\n" +
                        "\n" +
                        "8.map()\n" +
                        "Creates a new array with the results of calling a provided function on every element in this array.\n" +
                        "\n" +
                        "9.pop()\n" +
                        "Removes the last element from an array and returns that element.\n" +
                        "\n" +
                        "10.push()\n" +
                        "Adds one or more elements to the end of an array and returns the new length of the array.\n" +
                        "\n" +
                        "11.reduce()\n" +
                        "Apply a function simultaneously against two values of the array (from left-to-right) as to reduce it to a single value.\n" +
                        "\n" +
                        "12.reduceRight()\n" +
                        "Apply a function simultaneously against two values of the array (from right-to-left) as to reduce it to a single value.\n" +
                        "\n" +
                        "13.reverse()\n" +
                        "Reverses the order of the elements of an array -- the first becomes the last, and the last becomes the first.\n" +
                        "\n" +
                        "14.shift()\n" +
                        "Removes the first element from an array and returns that element.\n" +
                        "\n" +
                        "15.slice()\n" +
                        "Extracts a section of an array and returns a new array.\n" +
                        "\n" +
                        "16.some()\n" +
                        "Returns true if at least one element in this array satisfies the provided testing function.\n" +
                        "\n" +
                        "17.sort()\n" +
                        "Sorts the elements of an array.\n" +
                        "\n" +
                        "18.splice()\n" +
                        "Adds and/or removes elements from an array.\n" +
                        "\n" +
                        "19.toString()\n" +
                        "Returns a string representing the array and its elements.\n" +
                        "\n" +
                        "20.unshift()\n" +
                        "Adds one or more elements to the front of an array and returns the new length of the array.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Array Destructuring",
                "Refers to breaking up the structure of an entity. TypeScript supports destructuring when used in the context of an array.",
                "var arr:number[] = [12,13] \n" +
                        "var[x,y] = arr \n" +
                        "console.log(x) \n" +
                        "console.log(y)",
                "12 \n" +
                        "13"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Array Traversal using for…in loop",
                "One can use the for…in loop to traverse through an array.",
                "var j:any; \n" +
                        "var nums:number[] = [1001,1002,1003,1004] \n" +
                        "\n" +
                        "for(j in nums) { \n" +
                        "   console.log(nums[j]) \n" +
                        "}",
                "1001 \n" +
                        "1002 \n" +
                        "1003 \n" +
                        "1004"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Arrays in TypeScript",
                "TypeScript supports the following concepts in arrays −",
                "1.Multi-dimensional arrays\n" +
                        "TypeScript supports multidimensional arrays. The simplest form of the multidimensional array is the twodimensional array.\n" +
                        "\n" +
                        "2.Passing arrays to functions\n" +
                        "You can pass to the function a pointer to an array by specifying the array's name without an index.\n" +
                        "\n" +
                        "3.Return array from functions\n" +
                        "Allows a function to return an array",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //TypeScript Tuples
    private static List<LearnDetailsModel> TypeScriptTuples(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Tuples",
                "At times, there might be a need to store a collection of values of varied types. Arrays will not serve this purpose. TypeScript gives us a data type called tuple that helps to achieve such a purpose.\n" +
                        "\n" +
                        "It represents a heterogeneous collection of values. In other words, tuples enable storing multiple fields of different types. Tuples can also be passed as parameters to functions.\n" +
                        "\n" +
                        "Syntax:\n" +
                        "var tuple_name = [value1,value2,value3,…value n]",
                "var myTuple = [10,\"Hello\"];",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Accessing values in Tuples",
                "Tuple values are individually called items. Tuples are index based. This means that items in a tuple can be accessed using their corresponding numeric index. Tuple item’s index starts from zero and extends up to n-1(where n is the tuple’s size).\n" +
                        "\n" +
                        "Syntax:\n" +
                        "tuple_name[index]",
                "var myTuple = [10,\"Hello\"];\n" +
                        "console.log(myTuple[0]) \n" +
                        "console.log(myTuple[1])",
                "10 \n" +
                        "Hello"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Tuple Operations",
                "Tuples in TypeScript supports various operations like pushing a new item, removing an item from the tuple, etc." +
                        "\n\n" +
                        "The push() appends an item to the tuple\n" +
                        "\n" +
                        "The pop() removes and returns the last value in the tuple",
                "var myTuple = [10,\"Hello\",\"World\",\"typeScript\"]; \n" +
                        "console.log(\"Items before push \"+myTuple.length)\n" +
                        "\n" +
                        "myTuple.push(12)\n" +
                        "console.log(\"Items after push \"+myTuple.length) \n" +
                        "console.log(\"Items before pop \"+myTuple.length) \n" +
                        "console.log(myTuple.pop()+\" popped from the tuple\")\n" +
                        "  \n" +
                        "console.log(\"Items after pop \"+myTuple.length)",
                "Items before push 4 \n" +
                        "Items after push 5 \n" +
                        "Items before pop 5 \n" +
                        "12 popped from the tuple \n" +
                        "Items after pop 4"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Updating Tuples",
                "Tuples are mutable which means you can update or change the values of tuple elements.",
                "var mytuple = [10,\"Hello\",\"World\",\"typeScript\"];\n" +
                        "console.log(\"Tuple value at index 0 \"+mytuple[0]) \n" +
                        "\n" +
                        "mytuple[0] = 121     \n" +
                        "console.log(\"Tuple value at index 0 changed to   \"+mytuple[0])",
                "Tuple value at index 0 10 \n" +
                        "Tuple value at index 0 changed to 121"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Destructuring a Tuple",
                "Destructuring refers to breaking up the structure of an entity. TypeScript supports destructuring when used in the context of a tuple.",
                "var a =[10,\"hello\"] \n" +
                        "var [b,c] = a \n" +
                        "console.log( b )\n" +
                        "console.log( c )",
                "10 \n" +
                        "hello"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //TypeScript Union
    private static List<LearnDetailsModel> TypeScriptUnion(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Union",
                "TypeScript 1.4 gives programs the ability to combine one or two types. Union types are a powerful way to express a value that can be one of the several types. Two or more data types are combined using the pipe symbol (|) to denote a Union Type. In other words, a union type is written as a sequence of types separated by vertical bars.\n" +
                        "\n" +
                        "Syntax: Union literal\n" +
                        "Type1|Type2|Type3 ",
                "var val:string|number \n" +
                        "val = 12 \n" +
                        "console.log(\"numeric value of val \"+val) \n" +
                        "val = \"This is a string\" \n" +
                        "console.log(\"string value of val \"+val)",
                "numeric value of val  12 \n" +
                        "string value of val this is a string"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example: Union Type and function parameter",
                "The function disp() can accept argument either of the type string or a string array.",
                "function disp(name:string|string[]) { \n" +
                        "   if(typeof name == \"string\") { \n" +
                        "      console.log(name) \n" +
                        "   } else { \n" +
                        "      var i; \n" +
                        "      \n" +
                        "      for(i = 0;i<name.length;i++) { \n" +
                        "         console.log(name[i])\n" +
                        "      } \n" +
                        "   } \n" +
                        "} \n" +
                        "disp(\"anne\") \n" +
                        "console.log(\"Printing names array....\") \n" +
                        "disp([\"Mark\",\"Tom\",\"Mary\",\"John\"])",
                "anne \n" +
                        "Printing names array…. \n" +
                        "anne \n" +
                        "Tom\n" +
                        "Mary\n" +
                        "John"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Union Type and Arrays",
                "Union types can also be applied to arrays, properties and interfaces. The following illustrates the use of union type with an array.",
                "var arr:number[]|string[]; \n" +
                        "var i:number; \n" +
                        "arr = [1,2,4] \n" +
                        "console.log(\"**numeric array**\")  \n" +
                        "\n" +
                        "for(i = 0;i<arr.length;i++) { \n" +
                        "   console.log(arr[i]) \n" +
                        "}  \n" +
                        "\n" +
                        "arr = [\"USA\",\"UK\",\"Paris\"] \n" +
                        "console.log(\"**string array**\")  \n" +
                        "\n" +
                        "for(i = 0;i<arr.length;i++) { \n" +
                        "   console.log(arr[i]) \n" +
                        "}",
                "**numeric array** \n" +
                        "1 \n" +
                        "2 \n" +
                        "4 \n" +
                        "**string array** \n" +
                        "USA \n" +
                        "UK \n" +
                        "Paris"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //TypeScript Interfaces
    private static List<LearnDetailsModel> TypeScriptInterfaces(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Interfaces",
                "An interface is a syntactical contract that an entity should conform to. In other words, an interface defines the syntax that any entity must adhere to.\n" +
                        "\n" +
                        "Interfaces define properties, methods, and events, which are the members of the interface. Interfaces contain only the declaration of the members. It is the responsibility of the deriving class to define the members. It often helps in providing a standard structure that the deriving classes would follow.",
                "var person = { \n" +
                        "   FirstName:\"Anne\", \n" +
                        "   LastName:\"Moore\", \n" +
                        "   sayHi: ()=>{ return \"Hi\"} \n" +
                        "};",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Declaring Interfaces",
                "The interface keyword is used to declare an interface. Here is the syntax to declare an interface −\n" +
                        "\n" +
                        "Syntax:\n" +
                        "interface interface_name { \n" +
                        "}" +
                        "\n\n" +
                        "The example defines an interface. The customer object is of the type IPerson. Hence, it will now be binding on the object to define all properties as specified by the interface.\n" +
                        "\n" +
                        "Another object with following signature, is still considered as IPerson because that object is treated by its size or signature.",
                "interface IPerson { \n" +
                        "   firstName:string, \n" +
                        "   lastName:string, \n" +
                        "   sayHi: ()=>string \n" +
                        "} \n" +
                        "\n" +
                        "var customer:IPerson = { \n" +
                        "   firstName:\"Anne\",\n" +
                        "   lastName:\"Moore\", \n" +
                        "   sayHi: ():string =>{return \"Hi there\"} \n" +
                        "} \n" +
                        "\n" +
                        "console.log(\"Customer Object \") \n" +
                        "console.log(customer.firstName) \n" +
                        "console.log(customer.lastName) \n" +
                        "console.log(customer.sayHi())  \n" +
                        "\n" +
                        "var employee:IPerson = { \n" +
                        "   firstName:\"Emma\",\n" +
                        "   lastName:\"Watson\", \n" +
                        "   sayHi: ():string =>{return \"Hello!!!\"} \n" +
                        "} \n" +
                        "  \n" +
                        "console.log(\"Employee  Object \") \n" +
                        "console.log(employee.firstName);\n" +
                        "console.log(employee.lastName);",
                "Customer object \n" +
                        "Anne \n" +
                        "Moore \n" +
                        "Hi there \n" +
                        "Employee  object \n" +
                        "Emma  \n" +
                        "Watson \n" +
                        "Hello!!!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Union Type and Interface",
                "The following example shows the use of Union Type and Interface −",
                "interface RunOptions { \n" +
                        "   program:string; \n" +
                        "   commandline:string[]|string|(()=>string); \n" +
                        "} \n" +
                        "\n" +
                        "var options:RunOptions = {program:\"test1\",commandline:\"Hello\"}; \n" +
                        "console.log(options.commandline)  \n" +
                        "\n" +
                        "options = {program:\"test1\",commandline:[\"Hello\",\"World\"]}; \n" +
                        "console.log(options.commandline[0]); \n" +
                        "console.log(options.commandline[1]);  \n" +
                        "\n" +
                        "options = {program:\"test1\",commandline:()=>{return \"**Hello World**\";}}; \n" +
                        "\n" +
                        "var fn:any = options.commandline; \n" +
                        "console.log(fn());",
                "Hello \n" +
                        "Hello \n" +
                        "World \n" +
                        "**Hello World**"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Interfaces and Arrays",
                "Interface can define both the kind of key an array uses and the type of entry it contains. Index can be of type string or type number.",
                "interface namelist { \n" +
                        "   [index:number]:string \n" +
                        "} \n" +
                        "\n" +
                        "var list2:namelist = [\"Anne\",1,\"Bran\"] //Error. 1 is not type string  \n" +
                        "interface ages { \n" +
                        "   [index:string]:number \n" +
                        "} \n" +
                        "\n" +
                        "var agelist:ages; \n" +
                        "agelist[\"Anne\"] = 15   // Ok \n" +
                        "agelist[2] = \"nine\"   // Error",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Interfaces and Inheritance",
                "An interface can be extended by other interfaces. In other words, an interface can inherit from other interface. Typescript allows an interface to inherit from multiple interfaces.\n" +
                        "\n" +
                        "Use the extends keyword to implement inheritance among interfaces.\n" +
                        "\n" +
                        "Syntax: Single Interface Inheritance\n\n" +
                        "Child_interface_name extends super_interface_name\n\n" +
                        "Syntax: Multiple Interface Inheritance\n\n" +
                        "Child_interface_name extends super_interface1_name, \n" +
                        "super_interface2_name,…,super_interfaceN_name",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Simple Interface Inheritance",
                "Example: Simple Interface Inheritance",
                "interface Person { \n" +
                        "   age:number \n" +
                        "} \n" +
                        "\n" +
                        "interface Musician extends Person { \n" +
                        "   instrument:string \n" +
                        "} \n" +
                        "\n" +
                        "var guitar = <Musician>{}; \n" +
                        "guitar.age = 21 \n" +
                        "guitar.instrument = \"Guitar\" \n" +
                        "console.log(\"Age:  \"+guitar.age) console.log(\"Instrument:  \"+guitar.instrument)",
                "Age: 21 \n" +
                        "Instrument: Guitar"
        );final LearnDetailsModel l7 = new LearnDetailsModel(
                "Multiple Interface Inheritance",
                "Example: Multiple Interface Inheritance" +
                        "\n\n" +
                        "The object Iobj is of the type interface leaf. The interface leaf by the virtue of inheritance now has two attributes- v1 and v2 respectively. Hence, the object Iobj must now contain these attributes.",
                "interface IParent1 { \n" +
                        "   v1:number \n" +
                        "} \n" +
                        "\n" +
                        "interface IParent2 { \n" +
                        "   v2:number \n" +
                        "} \n" +
                        "\n" +
                        "interface Child extends IParent1, IParent2 { } \n" +
                        "var Iobj:Child = { v1:12, v2:23} \n" +
                        "console.log(\"value 1: \"+this.v1+\" value 2: \"+this.v2)",
                "value 1: 12   value 2: 23"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //TypeScript Classes
    private static List<LearnDetailsModel> TypeScriptClasses(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Classes",
                "TypeScript is object oriented JavaScript. TypeScript supports object-oriented programming features like classes, interfaces, etc. A class in terms of OOP is a blueprint for creating objects. A class encapsulates data for the object. Typescript gives built in support for this concept called class. JavaScript ES5 or earlier didn’t support classes. Typescript gets this feature from ES6.\n" +
                        "\n" +
                        "Creating classes\n" +
                        "Use the class keyword to declare a class in TypeScript. The syntax for the same is given below −\n" +
                        "\n" +
                        "Syntax\n" +
                        "class class_name { \n" +
                        "   //class scope \n" +
                        "}\n" +
                        "The class keyword is followed by the class name. The rules for identifiers must be considered while naming a class.\n" +
                        "\n" +
                        "A class definition can include the following −\n" +
                        "\n" +
                        "Fields − A field is any variable declared in a class. Fields represent data pertaining to objects\n" +
                        "\n" +
                        "Constructors − Responsible for allocating memory for the objects of the class\n" +
                        "\n" +
                        "Functions − Functions represent actions an object can take. They are also at times referred to as methods\n" +
                        "\n" +
                        "These components put together are termed as the data members of the class.\n" +
                        "\n" +
                        "Consider a class Person in typescript.\n" +
                        "\n" +
                        "class Person {\n" +
                        "}",
                "class Car { \n" +
                        "   //field \n" +
                        "   engine:string; \n" +
                        " \n" +
                        "   //constructor \n" +
                        "   constructor(engine:string) { \n" +
                        "      this.engine = engine \n" +
                        "   }  \n" +
                        "\n" +
                        "   //function \n" +
                        "   disp():void { \n" +
                        "      console.log(\"Engine is  :   \"+this.engine) \n" +
                        "   } \n" +
                        "}",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Creating Instance objects",
                "To create an instance of the class, use the new keyword followed by the class name. The syntax for the same is given below −\n" +
                        "\n" +
                        "Syntax\n" +
                        "var object_name = new class_name([ arguments ])\n" +
                        "The new keyword is responsible for instantiation.\n" +
                        "\n" +
                        "The right-hand side of the expression invokes the constructor. The constructor should be passed values if it is parameterized.\n" +
                        "\n" +
                        "Example: Instantiating a class\n" +
                        "var obj = new Car(\"Engine 1\")",
                "var obj = new Car(\"Engine 1\")",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Accessing Attributes and Functions",
                "A class’s attributes and functions can be accessed through the object. Use the ‘ . ’ dot notation (called as the period) to access the data members of a class.\n" +
                        "\n" +
                        "//accessing an attribute \n" +
                        "obj.field_name \n" +
                        "\n" +
                        "//accessing a function \n" +
                        "obj.function_name()",
                "class Car { \n" +
                        "   //field \n" +
                        "   engine:string; \n" +
                        "   \n" +
                        "   //constructor \n" +
                        "   constructor(engine:string) { \n" +
                        "      this.engine = engine \n" +
                        "   }  \n" +
                        "   \n" +
                        "   //function \n" +
                        "   disp():void { \n" +
                        "      console.log(\"Function displays Engine is  :   \"+this.engine) \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "//create an object \n" +
                        "var obj = new Car(\"XXSY1\")\n" +
                        "\n" +
                        "//access the field \n" +
                        "console.log(\"Reading attribute value Engine as :  \"+obj.engine)  \n" +
                        "\n" +
                        "//access the function\n" +
                        "obj.disp()",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Class Inheritance",
                "TypeScript supports the concept of Inheritance. Inheritance is the ability of a program to create new classes from an existing class. The class that is extended to create newer classes is called the parent class/super class. The newly created classes are called the child/sub classes.\n" +
                        "\n" +
                        "A class inherits from another class using the ‘extends’ keyword. Child classes inherit all properties and methods except private members and constructors from the parent class.\n" +
                        "\n" +
                        "Syntax\n" +
                        "class child_class_name extends parent_class_name",
                "class Shape { \n" +
                        "   Area:number \n" +
                        "   \n" +
                        "   constructor(a:number) { \n" +
                        "      this.Area = a \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "class Circle extends Shape { \n" +
                        "   disp():void { \n" +
                        "      console.log(\"Area of the circle:  \"+this.Area) \n" +
                        "   } \n" +
                        "}\n" +
                        "  \n" +
                        "var obj = new Circle(223); \n" +
                        "obj.disp()",
                "Area of the Circle: 223"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Class inheritance and Method Overriding",
                "Method Overriding is a mechanism by which the child class redefines the superclass’s method. The following example illustrates the same −" +
                        "\n\n" +
                        "The super keyword is used to refer to the immediate parent of a class. The keyword can be used to refer to the super class version of a variable, property or method. Line 13 invokes the super class version of the doWork() function." +
                        "",
                "class PrinterClass { \n" +
                        "   doPrint():void {\n" +
                        "      console.log(\"doPrint() from Parent called…\") \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "class StringPrinter extends PrinterClass { \n" +
                        "   doPrint():void { \n" +
                        "      super.doPrint() \n" +
                        "      console.log(\"doPrint() is printing a string…\")\n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "var obj = new StringPrinter() \n" +
                        "obj.doPrint()",
                "doPrint() from Parent called… \n" +
                        "doPrint() is printing a string…"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "The static Keyword",
                "The static keyword can be applied to the data members of a class. A static variable retains its values till the program finishes execution. Static members are referenced by the class name.",
                "class StaticMem {  \n" +
                        "   static num:number; \n" +
                        "   \n" +
                        "   static disp():void { \n" +
                        "      console.log(\"The value of num is\"+ StaticMem.num) \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "StaticMem.num = 12\n" +
                        "StaticMem.disp()",
                "The value of num is 12"
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "The instanceof operator",
                "The instanceof operator returns true if the object belongs to the specified type.",
                "class Person{ } \n" +
                        "var obj = new Person() \n" +
                        "var isPerson = obj instanceof Person; \n" +
                        "console.log(\" obj is an instance of Person \" + isPerson);",
                "obj is an instance of Person True"
        );
        final LearnDetailsModel l8 = new LearnDetailsModel(
                "Data Hiding",
                "A class can control the visibility of its data members to members of other classes. This capability is termed as Data Hiding or Encapsulation.\n" +
                        "\n" +
                        "Object Orientation uses the concept of access modifiers or access specifiers to implement the concept of Encapsulation. The access specifiers/modifiers define the visibility of a class’s data members outside its defining class.\n" +
                        "\n" +
                        "The access modifiers supported by TypeScript are −" +
                        "\n\n" +
                        "1.public\n" +
                        "\n" +
                        "A public data member has universal accessibility. Data members in a class are public by default.\n" +
                        "\n" +
                        "2.private\n" +
                        "\n" +
                        "Private data members are accessible only within the class that defines these members. If an external class member tries to access a private member, the compiler throws an error.\n" +
                        "\n" +
                        "3.protected\n" +
                        "\n" +
                        "A protected data member is accessible by the members within the same class as that of the former and also by the members of the child classes.",
                "class Encapsulate { \n" +
                        "   str:string = \"hello\" \n" +
                        "   private str2:string = \"world\" \n" +
                        "}\n" +
                        " \n" +
                        "var obj = new Encapsulate() \n" +
                        "console.log(obj.str)     //accessible \n" +
                        "console.log(obj.str2)   //compilation Error as str2 is private",
                ""
        );final LearnDetailsModel l9 = new LearnDetailsModel(
                "Classes and Interfaces",
                "Classes can also implement interfaces.The class AgriLoan implements the interface Loan. Hence, it is now binding on the class to include the property interest as its member.",
                "interface ILoan { \n" +
                        "   interest:number \n" +
                        "} \n" +
                        "\n" +
                        "class AgriLoan implements ILoan { \n" +
                        "   interest:number \n" +
                        "   rebate:number \n" +
                        "   \n" +
                        "   constructor(interest:number,rebate:number) { \n" +
                        "      this.interest = interest \n" +
                        "      this.rebate = rebate \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "var obj = new AgriLoan(10,1) \n" +
                        "console.log(\"Interest is : \"+obj.interest+\" Rebate is : \"+obj.rebate )",
                "Interest is : 10 Rebate is : 1"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        list.add(l9);

        return list;
    }
    //TypeScript Objects
    private static List<LearnDetailsModel> TypeScriptObjects(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Objects",
                "An object is an instance which contains set of key value pairs. The values can be scalar values or functions or even array of other objects. The syntax is given below −\n" +
                        "\n" +
                        "Syntax:\n" +
                        "var object_name = { \n" +
                        "   key1: “value1”, //scalar value \n" +
                        "   key2: “value”,  \n" +
                        "   key3: function() {\n" +
                        "      //functions \n" +
                        "   }, \n" +
                        "   key4:[“content1”, “content2”] //collection  \n" +
                        "};\n" +
                        "As shown above, an object can contain scalar values, functions and structures like arrays and tuples.",
                "var person = { \n" +
                        "   firstname:\"Anne\", \n" +
                        "   lastname:\"Moore\" \n" +
                        "}; \n" +
                        "console.log(person.firstname) \n" +
                        "console.log(person.lastname)",
                "Anne\n" +
                        "Moore"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "TypeScript Type Template",
                "Let’s say you created an object literal in JavaScript as −\n" +
                        "\n" +
                        "var person = { \n" +
                        "   firstname:\"Tom\", \n" +
                        "   lastname:\"Hanks\" \n" +
                        "};\n" +
                        "In case you want to add some value to an object, JavaScript allows you to make the necessary modification. Suppose we need to add a function to the person object later this is the way you can do this.\n" +
                        "\n" +
                        "person.sayHello = function(){ return \"hello\";}\n" +
                        "If you use the same code in Typescript the compiler gives an error. This is because in Typescript, concrete objects should have a type template. Objects in Typescript must be an instance of a particular type.\n" +
                        "\n" +
                        "You can solve this by using a method template in declaration.",
                "var person = {\n" +
                        "   firstName:\"Anne\", \n" +
                        "   lastName:\"Moore\", \n" +
                        "   sayHello:function() {  }\n" +
                        "} \n" +
                        "person.sayHello = function() {  \n" +
                        "   console.log(\"hello \"+person.firstName)\n" +
                        "}  \n" +
                        "person.sayHello()",
                "hello Anne"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Objects as function parameters",
                "Example: Objects as function parameters.The example declares an object literal. The function expression is invoked passing person object.",
                "var person = { \n" +
                        "   firstname:\"Anne\", \n" +
                        "   lastname:\"Moore\" \n" +
                        "}; \n" +
                        "var invokeperson = function(obj: { firstname:string, lastname :string }) { \n" +
                        "   console.log(\"first name :\"+obj.firstname) \n" +
                        "   console.log(\"last name :\"+obj.lastname) \n" +
                        "} \n" +
                        "invokeperson(person)",
                "first name :Anne \n" +
                        "last name :Moore"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Anonymous Object",
                "Example: Anonymous Object",
                "var invokeperson = function(obj:{ firstname:string, lastname :string}) { \n" +
                        "   console.log(\"first name :\"+obj.firstname) \n" +
                        "   console.log(\"last name :\"+obj.lastname) \n" +
                        "} \n" +
                        "invokeperson({firstname:\"Harry\",lastname:\"Potter\"});",
                "first name :Harry \n" +
                        "last name :Potter"
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Duck-typing",
                "In duck-typing, two objects are considered to be of the same type if both share the same set of properties. Duck-typing verifies the presence of certain properties in the objects, rather than their actual type, to check their suitability. The concept is generally explained by the following phrase −\n" +
                        "\n" +
                        "“When I see a bird that walks like a duck and swims like a duck and quacks like a duck, I call that bird a duck.”\n" +
                        "\n" +
                        "The TypeScript compiler implements the duck-typing system that allows object creation on the fly while keeping type safety. The following example shows how we can pass objects that don’t explicitly implement an interface but contain all of the required members to a function.",
                "interface IPoint { \n" +
                        "   x:number \n" +
                        "   y:number \n" +
                        "} \n" +
                        "function addPoints(p1:IPoint,p2:IPoint):IPoint { \n" +
                        "   var x = p1.x + p2.x \n" +
                        "   var y = p1.y + p2.y \n" +
                        "   return {x:x,y:y} \n" +
                        "} \n" +
                        "\n" +
                        "//Valid \n" +
                        "var newPoint = addPoints({x:3,y:4},{x:5,y:1})  \n" +
                        "\n" +
                        "//Error \n" +
                        "var newPoint2 = addPoints({x:1},{x:4,y:3})",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

        return list;
    }
    //TypeScript Namespaces
    private static List<LearnDetailsModel> TypeScriptNamespaces(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Namespaces",
                "A namespace is a way to logically group related code. This is inbuilt into TypeScript unlike in JavaScript where variables declarations go into a global scope and if multiple JavaScript files are used within same project there will be possibility of overwriting or misconstruing the same variables, which will lead to the “global namespace pollution problem” in JavaScript.\n" +
                        "\n" +
                        "Defining a Namespace\n" +
                        "A namespace definition begins with the keyword namespace followed by the namespace name as follows −\n" +
                        "\n" +
                        "namespace SomeNameSpaceName { \n" +
                        "   export interface ISomeInterfaceName {      }  \n" +
                        "   export class SomeClassName {      }  \n" +
                        "} \n" +
                        "The classes or interfaces which should be accessed outside the namespace should be marked with keyword export.\n" +
                        "\n" +
                        "To access the class or interface in another namespace, the syntax will be namespaceName.className\n" +
                        "\n" +
                        "SomeNameSpaceName.SomeClassName;\n" +
                        "If the first namespace is in separate TypeScript file, then it should be referenced using triple slash reference syntax.\n" +
                        "\n" +
                        "/// <reference path = \"SomeFileName.ts\" />",
                "FileName :IShape.ts \n" +
                        "---------- \n" +
                        "namespace Drawing { \n" +
                        "   export interface IShape { \n" +
                        "      draw(); \n" +
                        "   }\n" +
                        "}  \n" +
                        "\n" +
                        "FileName :Circle.ts \n" +
                        "---------- \n" +
                        "/// <reference path = \"IShape.ts\" /> \n" +
                        "namespace Drawing { \n" +
                        "   export class Circle implements IShape { \n" +
                        "      public draw() { \n" +
                        "         console.log(\"Circle is drawn\"); \n" +
                        "      }  \n" +
                        "      \n" +
                        "      FileName :Triangle.ts \n" +
                        "      ---------- \n" +
                        "      /// <reference path = \"IShape.ts\" /> \n" +
                        "      namespace Drawing { \n" +
                        "         export class Triangle implements IShape { \n" +
                        "            public draw() { \n" +
                        "               console.log(\"Triangle is drawn\"); \n" +
                        "            } \n" +
                        "         } \n" +
                        "         \n" +
                        "         FileName : TestShape.ts \n" +
                        "         /// <reference path = \"IShape.ts\" />   \n" +
                        "         /// <reference path = \"Circle.ts\" /> \n" +
                        "         /// <reference path = \"Triangle.ts\" />  \n" +
                        "         function drawAllShapes(shape:Drawing.IShape) { \n" +
                        "            shape.draw(); \n" +
                        "         } \n" +
                        "         drawAllShapes(new Drawing.Circle());\n" +
                        "         drawAllShapes(new Drawing.Triangle());\n" +
                        "      }\n" +
                        "   }\n" +
                        "}",
                "Circle is drawn \n" +
                        "Triangle is drawn"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Nested Namespaces",
                "You can define one namespace inside another namespace as follows −",
                "namespace namespace_name1 { \n" +
                        "   export namespace namespace_name2 {\n" +
                        "      export class class_name {    } \n" +
                        "   } \n" +
                        "}",
                ""
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //TypeScript Modules
    private static List<LearnDetailsModel> TypeScriptModules(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "TypeScript Modules",
                "A module is designed with the idea to organize code written in TypeScript. Modules are broadly divided into −\n" +
                        "\n" +
                        "Internal Modules\n" +
                        "External Modules",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Internal Module",
                "Internal modules came in earlier version of Typescript. This was used to logically group classes, interfaces, functions into one unit and can be exported in another module. This logical grouping is named namespace in latest version of TypeScript. So internal modules are obsolete instead we can use namespace. Internal modules are still supported, but its recommended to use namespace over internal modules.\n" +
                        "\n" +
                        "Internal Module Syntax (Old)\n" +
                        "module shrCreation { \n" +
                        "   export function add(x, y) {  \n" +
                        "      console.log(x+y); \n" +
                        "   } \n" +
                        "}\n" +
                        "Namespace Syntax (New)\n" +
                        "namespace shrCreation { \n" +
                        "   export function add(x, y) { console.log(x + y);} \n" +
                        "}",
                "var shrCreation; \n" +
                        "(function (shrCreation) { \n" +
                        "   function add(x, y) { \n" +
                        "      console.log(x + y); \n" +
                        "   } \n" +
                        "   shrCreation.add = add; \n" +
                        "})(shrCreation || (shrCreation = {}));",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "External Module",
                "External modules in TypeScript exists to specify and load dependencies between multiple external js files. If there is only one js file used, then external modules are not relevant. Traditionally dependency management between JavaScript files was done using browser script tags (<script></script>). But that’s not extendable, as its very linear while loading modules. That means instead of loading files one after other there is no asynchronous option to load modules. When you are programming js for the server for example NodeJs you don’t even have script tags.\n" +
                        "\n" +
                        "There are two scenarios for loading dependents js files from a single main JavaScript file.\n" +
                        "\n" +
                        "Client Side - RequireJs\n" +
                        "Server Side - NodeJs\n" +
                        "Selecting a Module Loader\n" +
                        "To support loading external JavaScript files, we need a module loader. This will be another js library. For browser the most common library used is RequieJS. This is an implementation of AMD (Asynchronous Module Definition) specification. Instead of loading files one after the other, AMD can load them all separately, even when they are dependent on each other.\n" +
                        "\n" +
                        "Defining External Module\n" +
                        "When defining external module in TypeScript targeting CommonJS or AMD, each file is considered as a module. So it’s optional to use internal module with in external module.\n" +
                        "\n" +
                        "If you are migrating TypeScript from AMD to CommonJs module systems, then there is no additional work needed. The only thing you need to change is just the compiler flag Unlike in JavaScript there is an overhead in migrating from CommonJs to AMD or vice versa.\n" +
                        "\n" +
                        "The syntax for declaring an external module is using keyword ‘export’ and ‘import’.\n" +
                        "\n" +
                        "Syntax\n" +
                        "//FileName : SomeInterface.ts \n" +
                        "export interface SomeInterface { \n" +
                        "   //code declarations \n" +
                        "}\n" +
                        "To use the declared module in another file, an import keyword is used as given below. The file name is only specified no extension used.\n" +
                        "\n" +
                        "import someInterfaceRef = require(“./SomeInterface”);",
                "// IShape.ts \n" +
                        "export interface IShape { \n" +
                        "   draw(); \n" +
                        "}\n" +
                        "\n" +
                        "// Circle.ts \n" +
                        "import shape = require(\"./IShape\"); \n" +
                        "export class Circle implements shape.IShape { \n" +
                        "   public draw() { \n" +
                        "      console.log(\"Cirlce is drawn (external module)\"); \n" +
                        "   } \n" +
                        "} \n" +
                        "\n" +
                        "// Triangle.ts \n" +
                        "import shape = require(\"./IShape\"); \n" +
                        "export class Triangle implements shape.IShape { \n" +
                        "   public draw() { \n" +
                        "      console.log(\"Triangle is drawn (external module)\"); \n" +
                        "   } \n" +
                        "}\n" +
                        "   \n" +
                        "// TestShape.ts \n" +
                        "import shape = require(\"./IShape\"); \n" +
                        "import circle = require(\"./Circle\"); \n" +
                        "import triangle = require(\"./Triangle\");  \n" +
                        "\n" +
                        "function drawAllShapes(shapeToDraw: shape.IShape) {\n" +
                        "   shapeToDraw.draw(); \n" +
                        "} \n" +
                        "\n" +
                        "drawAllShapes(new circle.Circle()); \n" +
                        "drawAllShapes(new triangle.Triangle()); ",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //AngularJS
    //AngularJS Introduction
    private static List<LearnDetailsModel> AngularJSIntroduction(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Why to Learn AngularJS?",
                "AngularJS is an open-source web application framework. It was originally developed in 2009 by Misko Hevery and Adam Abrons. It is now maintained by Google. Its latest version is 1.2.21.\n" +
                        "\n" +
                        "AngularJS is a efficient framework that can create Rich Internet Applications (RIA).\n" +
                        "\n" +
                        "AngularJS provides developers an options to write client side applications using JavaScript in a clean Model View Controller (MVC) way.\n" +
                        "\n" +
                        "Applications written in AngularJS are cross-browser compliant. AngularJS automatically handles JavaScript code suitable for each browser.\n" +
                        "\n" +
                        "AngularJS is open source, completely free, and used by thousands of developers around the world. It is licensed under the Apache license version 2.0.\n" +
                        "\n" +
                        "Overall, AngularJS is a framework to build large scale, high-performance, and easyto-maintain web applications.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Hello World using AngularJS.",
                "Just to give you a little excitement about AngularJS, I'm going to give you a small conventional AngularJS Hello World program, You can try it using Demo link.",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>AngularJS First Application</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h1>Sample Application</h1>\n" +
                        "      \n" +
                        "      <div ng-app = \"\">\n" +
                        "         <p>Enter your Name: <input type = \"text\" ng-model = \"name\"></p>\n" +
                        "         <p>Hello <span ng-bind = \"name\"></span>!</p>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "General Features",
                "The general features of AngularJS are as follows −\n" +
                        "\n" +
                        "AngularJS is a efficient framework that can create Rich Internet Applications (RIA).\n" +
                        "\n" +
                        "AngularJS provides developers an options to write client side applications using JavaScript in a clean Model View Controller (MVC) way.\n" +
                        "\n" +
                        "Applications written in AngularJS are cross-browser compliant. AngularJS automatically handles JavaScript code suitable for each browser.\n" +
                        "\n" +
                        "AngularJS is open source, completely free, and used by thousands of developers around the world. It is licensed under the Apache license version 2.0.\n" +
                        "\n" +
                        "Overall, AngularJS is a framework to build large scale, high-performance, and easyto-maintain web applications.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Core Features",
                "The core features of AngularJS are as follows −\n" +
                        "\n" +
                        "Data-binding − It is the automatic synchronization of data between model and view components.\n" +
                        "\n" +
                        "Scope − These are objects that refer to the model. They act as a glue between controller and view.\n" +
                        "\n" +
                        "Controller − These are JavaScript functions bound to a particular scope.\n" +
                        "\n" +
                        "Services − AngularJS comes with several built-in services such as $http to make a XMLHttpRequests. These are singleton objects which are instantiated only once in app.\n" +
                        "\n" +
                        "Filters − These select a subset of items from an array and returns a new array.\n" +
                        "\n" +
                        "Directives − Directives are markers on DOM elements such as elements, attributes, css, and more. These can be used to create custom HTML tags that serve as new, custom widgets. AngularJS has built-in directives such as ngBind, ngModel, etc.\n" +
                        "\n" +
                        "Templates − These are the rendered view with information from the controller and model. These can be a single file (such as index.html) or multiple views in one page using partials.\n" +
                        "\n" +
                        "Routing − It is concept of switching views.\n" +
                        "\n" +
                        "Model View Whatever − MVW is a design pattern for dividing an application into different parts called Model, View, and Controller, each with distinct responsibilities. AngularJS does not implement MVC in the traditional sense, but rather something closer to MVVM (Model-View-ViewModel). The Angular JS team refers it humorously as Model View Whatever.\n" +
                        "\n" +
                        "Deep Linking − Deep linking allows to encode the state of application in the URL so that it can be bookmarked. The application can then be restored from the URL to the same state.\n" +
                        "\n" +
                        "Dependency Injection − AngularJS has a built-in dependency injection subsystem that helps the developer to create, understand, and test the applications easily.",
                "",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Advantages of AngularJS",
                "The advantages of AngularJS are −\n" +
                        "\n" +
                        "It provides the capability to create Single Page Application in a very clean and maintainable way.\n" +
                        "\n" +
                        "It provides data binding capability to HTML. Thus, it gives user a rich and responsive experience.\n" +
                        "\n" +
                        "AngularJS code is unit testable.\n" +
                        "\n" +
                        "AngularJS uses dependency injection and make use of separation of concerns.\n" +
                        "\n" +
                        "AngularJS provides reusable components.\n" +
                        "\n" +
                        "With AngularJS, the developers can achieve more functionality with short code.\n" +
                        "\n" +
                        "In AngularJS, views are pure html pages, and controllers written in JavaScript do the business processing.\n" +
                        "\n" +
                        "On the top of everything, AngularJS applications can run on all major browsers and smart phones, including Android and iOS based phones/tablets.",
                "",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Disadvantages of AngularJS",
                "Though AngularJS comes with a lot of merits, here are some points of concern −\n" +
                        "\n" +
                        "Not Secure − Being JavaScript only framework, application written in AngularJS are not safe. Server side authentication and authorization is must to keep an application secure.\n" +
                        "\n" +
                        "Not degradable − If the user of your application disables JavaScript, then nothing would be visible, except the basic page.",
                "",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "AngularJS Directives",
                "The AngularJS framework can be divided into three major parts −\n" +
                        "\n" +
                        "ng-app − This directive defines and links an AngularJS application to HTML.\n" +
                        "\n" +
                        "ng-model − This directive binds the values of AngularJS application data to HTML input controls.\n" +
                        "\n" +
                        "ng-bind − This directive binds the AngularJS application data to HTML tags.",
                "",
                ""
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);

        return list;
    }
    //AngularJS MVC Architecture
    private static List<LearnDetailsModel> AngularJSMVCArchitecture(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS MVC Architecture",
                "Model View Controller or MVC as it is popularly called, is a software design pattern for developing web applications. A Model View Controller pattern is made up of the following three parts −\n" +
                        "\n" +
                        "Model − It is the lowest level of the pattern responsible for maintaining data.\n" +
                        "\n" +
                        "View − It is responsible for displaying all or a portion of the data to the user.\n" +
                        "\n" +
                        "Controller − It is a software Code that controls the interactions between the Model and View.\n" +
                        "\n" +
                        "MVC is popular because it isolates the application logic from the user interface layer and supports separation of concerns. The controller receives all requests for the application and then works with the model to prepare any data needed by the view. The view then uses the data prepared by the controller to generate a final presentable response. The MVC abstraction can be graphically represented.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "The Model",
                "The model is responsible for managing application data. It responds to the request from view and to the instructions from controller to update itself.",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "The View",
                "A presentation of data in a particular format, triggered by the controller's decision to present the data. They are script-based template systems such as JSP, ASP, PHP and very easy to integrate with AJAX technology.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "The Controller",
                "The controller responds to user input and performs interactions on the data model objects. The controller receives input, validates it, and then performs business operations that modify the state of the data model.\n" +
                        "\n" +
                        "AngularJS is a MVC based framework. In the coming chapters, we will see how AngularJS uses MVC methodology.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS First Application
    private static List<LearnDetailsModel> AngularJSFirstApplication(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS First Application",
                "Before creating actual Hello World ! application using AngularJS, let us see the parts of a AngularJS application. An AngularJS application consists of following three important parts −\n" +
                        "\n" +
                        "ng-app − This directive defines and links an AngularJS application to HTML.\n" +
                        "\n" +
                        "ng-model − This directive binds the values of AngularJS application data to HTML input controls.\n" +
                        "\n" +
                        "ng-bind − This directive binds the AngularJS Application data to HTML tags.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Creating AngularJS Application",
                "Step 1: Load framework\n" +
                        "Being a pure JavaScript framework, it can be added using <Script> tag.\n" +
                        "\n" +
                        "<script \n" +
                        "   src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "</script>\n\n" +
                        "Step 2: Define AngularJS application using ng-app directive\n" +
                        "<div ng-app = \"\">\n" +
                        "   ...\n" +
                        "</div>\n\n" +
                        "Step 3: Define a model name using ng-model directive\n" +
                        "<p>Enter your Name: <input type = \"text\" ng-model = \"name\"></p>\n\n" +
                        "Step 4: Bind the value of above model defined using ng-bind directive\n" +
                        "<p>Hello <span ng-bind = \"name\"></span>!</p>",
                "",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Executing AngularJS Application",
                "Use the above-mentioned three steps in an HTML page.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>AngularJS First Application</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h1>Sample Application</h1>\n" +
                        "      \n" +
                        "      <div ng-app = \"\">\n" +
                        "         <p>Enter your Name: <input type = \"text\" ng-model = \"name\"></p>\n" +
                        "         <p>Hello <span ng-bind = \"name\"></span>!</p>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "How AngularJS Integrates with HTML",
                "The ng-app directive indicates the start of AngularJS application.\n" +
                        "\n" +
                        "The ng-model directive creates a model variable named name, which can be used with the HTML page and within the div having ng-app directive.\n" +
                        "\n" +
                        "The ng-bind then uses the name model to be displayed in the HTML <span> tag whenever user enters input in the text box.\n" +
                        "\n" +
                        "Closing</div> tag indicates the end of AngularJS application.",
                "",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS Directives
    private static List<LearnDetailsModel> AngularJSDirectives(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Directives",
                "AngularJS directives are used to extend HTML. They are special attributes starting with ng-prefix. Let us discuss the following directives −\n" +
                        "\n" +
                        "ng-app − This directive starts an AngularJS Application.\n" +
                        "\n" +
                        "ng-init − This directive initializes application data.\n" +
                        "\n" +
                        "ng-model − This directive defines the model that is variable to be used in AngularJS.\n" +
                        "\n" +
                        "ng-repeat − This directive repeats HTML elements for each item in a collection.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "ng-app directive",
                "The ng-app directive starts an AngularJS Application. It defines the root element. It automatically initializes or bootstraps the application when the web page containing AngularJS Application is loaded. It is also used to load various AngularJS modules in AngularJS Application. In the following example, we define a default AngularJS application using ng-app attribute of a <div> element.",
                "<div ng-app = \"\">\n" +
                        "   ...\n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "ng-init directive",
                "The ng-init directive initializes an AngularJS Application data. It is used to assign values to the variables. In the following example, we initialize an array of countries. We use JSON syntax to define the array of countries.",
                "<div ng-app = \"\" ng-init = \"countries = [{locale:'en-US',name:'United States'}, \n" +
                        "   {locale:'en-GB',name:'United Kingdom'}, {locale:'en-FR',name:'France'}]\">\n" +
                        "   ...\n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "ng-model directive",
                "The ng-model directive defines the model/variable to be used in AngularJS Application. In the following example, we define a model named name.",
                "<div ng-app = \"\">\n" +
                        "   ...\n" +
                        "   <p>Enter your Name: <input type = \"text\" ng-model = \"name\"></p>\n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "ng-repeat directive",
                "The ng-repeat directive repeats HTML elements for each item in a collection. In the following example, we iterate over the array of countries.",
                "<div ng-app = \"\">\n" +
                        "   ...\n" +
                        "   <p>List of Countries with locale:</p>\n" +
                        "   \n" +
                        "   <ol>\n" +
                        "      <li ng-repeat = \"country in countries\">\n" +
                        "         {{ 'Country: ' + country.name + ', Locale: ' + country.locale }}\n" +
                        "      </li>\n" +
                        "   </ol>\n" +
                        "</div>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        return list;
    }
    //AngularJS Expressions
    private static List<LearnDetailsModel> AngularJSExpressions(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Expressions",
                "Expressions are used to bind application data to HTML. Expressions are written inside double curly braces such as in {{ expression}}. Expressions behave similar to ngbind directives. AngularJS expressions are pure JavaScript expressions and output the data where they are used.\n" +
                        "\n" +
                        "Using numbers\n" +
                        "<p>Expense on Books : {{cost * quantity}} Rs</p>\n\n" +
                        "Using Strings\n" +
                        "<p>Hello {{student.firstname + \" \" + student.lastname}}!</p>\n\n" +
                        "Using Object\n" +
                        "<p>Roll No: {{student.rollno}}</p>\n\n" +
                        "Using Array\n" +
                        "<p>Marks(Math): {{marks[3]}}</p>",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of all the above-mentioned expressions −\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>AngularJS Expressions</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h1>Sample Application</h1>\n" +
                        "      \n" +
                        "      <div ng-app = \"\" ng-init = \"quantity = 1;cost = 24; \n" +
                        "         student = {firstname:'Anne',lastname:'Moore',rollno:101};\n" +
                        "         marks = [80,90,75,73,60]\">\n" +
                        "         <p>Hello {{student.firstname + \" \" + student.lastname}}!</p>\n" +
                        "         <p>Expense on Books : {{cost * quantity}} USD</p>\n" +
                        "         <p>Roll No: {{student.rollno}}</p>\n" +
                        "         <p>Marks(Math): {{marks[3]}}</p>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AngularJS Controllers
    private static List<LearnDetailsModel> AngularJSControllers(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Controllers",
                "AngularJS application mainly relies on controllers to control the flow of data in the application. A controller is defined using ng-controller directive. A controller is a JavaScript object that contains attributes/properties, and functions. Each controller accepts $scope as a parameter, which refers to the application/module that the controller needs to handle.\n" +
                        "\n" +
                        "<div ng-app = \"\" ng-controller = \"studentController\">\n" +
                        "   ...\n" +
                        "</div>\n" +
                        "Here, we declare a controller named studentController, using the ng-controller directive. We define it as follows −\n" +
                        "\n" +
                        "<script>\n" +
                        "   function studentController($scope) {\n" +
                        "      $scope.student = {\n" +
                        "         firstName: \"Mahesh\",\n" +
                        "         lastName: \"Parashar\",\n" +
                        "         \n" +
                        "         fullName: function() {\n" +
                        "            var studentObject;\n" +
                        "            studentObject = $scope.student;\n" +
                        "            return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "         }\n" +
                        "      };\n" +
                        "   }\n" +
                        "</script>\n" +
                        "The studentController is defined as a JavaScript object with $scope as an argument.\n" +
                        "\n" +
                        "The $scope refers to application which uses the studentController object.\n" +
                        "\n" +
                        "The $scope.student is a property of studentController object.\n" +
                        "\n" +
                        "The firstName and the lastName are two properties of $scope.student object. We pass the default values to them.\n" +
                        "\n" +
                        "The property fullName is the function of $scope.student object, which returns the combined name.\n" +
                        "\n" +
                        "In the fullName function, we get the student object and then return the combined name.\n" +
                        "\n" +
                        "As a note, we can also define the controller object in a separate JS file and refer that file in the HTML page.\n" +
                        "\n" +
                        "Now we can use studentController's student property using ng-model or using expressions as follows −\n" +
                        "\n" +
                        "Enter first name: <input type = \"text\" ng-model = \"student.firstName\"><br>\n" +
                        "Enter last name: <input type = \"text\" ng-model = \"student.lastName\"><br>\n" +
                        "<br>\n" +
                        "You are entering: {{student.fullName()}}\n" +
                        "We bound student.firstName and student.lastname to two input boxes.\n" +
                        "\n" +
                        "We bound student.fullName() to HTML.\n" +
                        "\n" +
                        "Now whenever you type anything in first name and last name input boxes, you can see the full name getting updated automatically.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of controller −\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Controller</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "         Enter first name: <input type = \"text\" ng-model = \"student.firstName\"><br>\n" +
                        "         <br>\n" +
                        "         Enter last name: <input type = \"text\" ng-model = \"student.lastName\"><br>\n" +
                        "         <br>\n" +
                        "         You are entering: {{student.fullName()}}\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller('studentController', function($scope) {\n" +
                        "            $scope.student = {\n" +
                        "               firstName: \"Anne\",\n" +
                        "               lastName: \"Moore\",\n" +
                        "               \n" +
                        "               fullName: function() {\n" +
                        "                  var studentObject;\n" +
                        "                  studentObject = $scope.student;\n" +
                        "                  return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "               }\n" +
                        "            };\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AngularJS Filters
    private static List<LearnDetailsModel> AngularJSFilters(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Filters",
                "Filters are used to modify the data. They can be clubbed in expression or directives using pipe (|) character. The following list shows the commonly used filters." +
                        "\n\n" +
                        "1. uppercase\n" +
                        "\n" +
                        "converts a text to upper case text.\n" +
                        "\n" +
                        "2. lowercase\n" +
                        "\n" +
                        "converts a text to lower case text.\n" +
                        "\n" +
                        "3. currency\n" +
                        "\n" +
                        "formats text in a currency format.\n" +
                        "\n" +
                        "4. filter\n" +
                        "\n" +
                        "filter the array to a subset of it based on provided criteria.\n" +
                        "\n" +
                        "5. orderby\n" +
                        "\n" +
                        "orders the array based on provided criteria.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Uppercase Filter",
                "Add uppercase filter to an expression using pipe character. Here we've added uppercase filter to print student name in all capital letters.",
                "Enter first name:<input type = \"text\" ng-model = \"student.firstName\">\n" +
                        "Enter last name: <input type = \"text\" ng-model = \"student.lastName\">\n" +
                        "Name in Upper Case: {{student.fullName() | uppercase}}",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Lowercase Filter",
                "Add lowercase filter to an expression using pipe character. Here we've added lowercase filter to print student name in all lowercase letters.",
                "Enter first name:<input type = \"text\" ng-model = \"student.firstName\">\n" +
                        "Enter last name: <input type = \"text\" ng-model = \"student.lastName\">\n" +
                        "Name in Lower Case: {{student.fullName() | lowercase}}",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Currency Filter",
                "Add currency filter to an expression returning number using pipe character. Here we've added currency filter to print fees using currency format.",
                "Enter fees: <input type = \"text\" ng-model = \"student.fees\">\n" +
                        "fees: {{student.fees | currency}}",
                ""
        );final LearnDetailsModel l5 = new LearnDetailsModel(
                "Filter",
                "To display only required subjects, we use subjectName as filter.",
                "Enter subject: <input type = \"text\" ng-model = \"subjectName\">\n" +
                        "Subject:\n" +
                        "<ul>\n" +
                        "   <li ng-repeat = \"subject in student.subjects | filter: subjectName\">\n" +
                        "      {{ subject.name + ', marks:' + subject.marks }}\n" +
                        "   </li>\n" +
                        "</ul>",
                ""
        );final LearnDetailsModel l6 = new LearnDetailsModel(
                "OrderBy Filter",
                "To order subjects by marks, we use orderBy marks.",
                "Subject:\n" +
                        "<ul>\n" +
                        "   <li ng-repeat = \"subject in student.subjects | orderBy:'marks'\">\n" +
                        "      {{ subject.name + ', marks:' + subject.marks }}\n" +
                        "   </li>\n" +
                        "</ul>",
                ""
        );final LearnDetailsModel l7 = new LearnDetailsModel(
                "Example",
                "The following example shows use of all the above mentioned filters.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Filters</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "         <table border = \"0\">\n" +
                        "            <tr>\n" +
                        "               <td>Enter first name:</td>\n" +
                        "               <td><input type = \"text\" ng-model = \"student.firstName\"></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Enter last name: </td>\n" +
                        "               <td><input type = \"text\" ng-model = \"student.lastName\"></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Enter fees: </td>\n" +
                        "               <td><input type = \"text\" ng-model = \"student.fees\"></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Enter subject: </td>\n" +
                        "               <td><input type = \"text\" ng-model = \"subjectName\"></td>\n" +
                        "            </tr>\n" +
                        "         </table>\n" +
                        "         <br/>\n" +
                        "         \n" +
                        "         <table border = \"0\">\n" +
                        "            <tr>\n" +
                        "               <td>Name in Upper Case: </td><td>{{student.fullName() | uppercase}}</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Name in Lower Case: </td><td>{{student.fullName() | lowercase}}</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>fees: </td><td>{{student.fees | currency}}\n" +
                        "               </td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Subject:</td>\n" +
                        "               <td>\n" +
                        "                  <ul>\n" +
                        "                     <li ng-repeat = \"subject in student.subjects | filter: subjectName |orderBy:'marks'\">\n" +
                        "                        {{ subject.name + ', marks:' + subject.marks }}\n" +
                        "                     </li>\n" +
                        "                  </ul>\n" +
                        "               </td>\n" +
                        "            </tr>\n" +
                        "         </table>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller('studentController', function($scope) {\n" +
                        "            $scope.student = {\n" +
                        "               firstName: \"Anne\",\n" +
                        "               lastName: \"Moore\",\n" +
                        "               fees:500,\n" +
                        "               \n" +
                        "               subjects:[\n" +
                        "                  {name:'Physics',marks:70},\n" +
                        "                  {name:'Chemistry',marks:80},\n" +
                        "                  {name:'Math',marks:65}\n" +
                        "               ],\n" +
                        "               fullName: function() {\n" +
                        "                  var studentObject;\n" +
                        "                  studentObject = $scope.student;\n" +
                        "                  return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "               }\n" +
                        "            };\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser. See the result.\n\n" +
                        "Name in Upper Case:\tANNE MOORE\n" +
                        "Name in Lower Case:\tanne moore\n" +
                        "fees:\t$500.00\n" +
                        "Subject:\t\n" +
                        "Math, marks:65\n" +
                        "Physics, marks:70\n" +
                        "Chemistry, marks:80\n"
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //AngularJS Tables
    private static List<LearnDetailsModel> AngularJSTables(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Tables",
                "Table data is generally repeatable. The ng-repeat directive can be used to draw table easily. The following example shows the use of ng-repeat directive to draw a table −",
                "<table>\n" +
                        "   <tr>\n" +
                        "      <th>Name</th>\n" +
                        "      <th>Marks</th>\n" +
                        "   </tr>\n" +
                        "   \n" +
                        "   <tr ng-repeat = \"subject in student.subjects\">\n" +
                        "      <td>{{ subject.name }}</td>\n" +
                        "      <td>{{ subject.marks }}</td>\n" +
                        "   </tr>\n" +
                        "</table>" +
                        "\n\n\n" +
                        "<style>\n" +
                        "   table, th , td {\n" +
                        "      border: 1px solid grey;\n" +
                        "      border-collapse: collapse;\n" +
                        "      padding: 5px;\n" +
                        "   }\n" +
                        "   table tr:nth-child(odd) {\n" +
                        "      background-color: #f2f2f2;\n" +
                        "   }\n" +
                        "   table tr:nth-child(even) {\n" +
                        "      background-color: #ffffff;\n" +
                        "   }\n" +
                        "</style>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of all the above-mentioned directives.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Table</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"></script>\n" +
                        "      \n" +
                        "      <style>\n" +
                        "         table, th , td {\n" +
                        "            border: 1px solid grey;\n" +
                        "            border-collapse: collapse;\n" +
                        "            padding: 5px;\n" +
                        "         }\n" +
                        "         table tr:nth-child(odd) {\n" +
                        "            background-color: #f2f2f2;\n" +
                        "         }\n" +
                        "         table tr:nth-child(even) {\n" +
                        "            background-color: #ffffff;\n" +
                        "         }\n" +
                        "      </style>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "         \n" +
                        "         <table border = \"0\">\n" +
                        "            <tr>\n" +
                        "               <td>Enter first name:</td>\n" +
                        "               <td><input type = \"text\" ng-model = \"student.firstName\"></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Enter last name: </td>\n" +
                        "               <td>\n" +
                        "                  <input type = \"text\" ng-model = \"student.lastName\">\n" +
                        "               </td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Name: </td>\n" +
                        "               <td>{{student.fullName()}}</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td>Subject:</td>\n" +
                        "               \n" +
                        "               <td>\n" +
                        "                  <table>\n" +
                        "                     <tr>\n" +
                        "                        <th>Name</th>.\n" +
                        "                        <th>Marks</th>\n" +
                        "                     </tr>\n" +
                        "                     <tr ng-repeat = \"subject in student.subjects\">\n" +
                        "                        <td>{{ subject.name }}</td>\n" +
                        "                        <td>{{ subject.marks }}</td>\n" +
                        "                     </tr>\n" +
                        "                  </table>\n" +
                        "               </td>\n" +
                        "            </tr>\n" +
                        "         </table>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller('studentController', function($scope) {\n" +
                        "            $scope.student = {\n" +
                        "               firstName: \"Anne\",\n" +
                        "               lastName: \"Moore\",\n" +
                        "               fees:500,\n" +
                        "               \n" +
                        "               subjects:[\n" +
                        "                  {name:'Physics',marks:70},\n" +
                        "                  {name:'Chemistry',marks:80},\n" +
                        "                  {name:'Math',marks:65},\n" +
                        "                  {name:'English',marks:75},\n" +
                        "                  {name:'Hindi',marks:67}\n" +
                        "               ],\n" +
                        "               fullName: function() {\n" +
                        "                  var studentObject;\n" +
                        "                  studentObject = $scope.student;\n" +
                        "                  return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "               }\n" +
                        "            };\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AngularJS HTML DOM
    private static List<LearnDetailsModel> AngularJSHTMLDOM(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS HTML DOM",
                "The following directives are used to bind application data to the attributes of HTML DOM elements −" +
                        "\n\n" +
                        "1. ng-disabled\n" +
                        "\n" +
                        "disables a given control.\n" +
                        "\n" +
                        "2. ng-show\n" +
                        "\n" +
                        "shows a given control.\n" +
                        "\n" +
                        "3. ng-hide\n" +
                        "\n" +
                        "hides a given control.\n" +
                        "\n" +
                        "4. ng-click\n" +
                        "\n" +
                        "represents a AngularJS click event.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "ng-disabled Directive",
                "Add ng-disabled attribute to an HTML button and pass it a model. Bind the model to a checkbox and see the variation.",
                "<input type = \"checkbox\" ng-model = \"enableDisableButton\">Disable Button\n" +
                        "<button ng-disabled = \"enableDisableButton\">Click Me!</button>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "ng-show Directive",
                "Add ng-show attribute to an HTML button and pass it a model. Bind the model to a checkbox and see the variation.",
                "<input type = \"checkbox\" ng-model = \"showHide1\">Show Button\n" +
                        "<button ng-show = \"showHide1\">Click Me!</button>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "ng-hide Directive",
                "Add ng-hide attribute to an HTML button and pass it a model. Bind the model to a checkbox and see the variation.",
                "<input type = \"checkbox\" ng-model = \"showHide2\">Hide Button\n" +
                        "<button ng-hide = \"showHide2\">Click Me!</button>",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "ng-click Directive",
                "Add ng-click attribute to an HTML button and update a model. Bind the model to HTML and see the variation.",
                "<p>Total click: {{ clickCounter }}</p>\n" +
                        "<button ng-click = \"clickCounter = clickCounter + 1\">Click Me!</button>",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Example",
                "The following example shows use of all the above mentioned directives.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>AngularJS HTML DOM</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"\">\n" +
                        "         <table border = \"0\">\n" +
                        "            <tr>\n" +
                        "               <td><input type = \"checkbox\" ng-model = \"enableDisableButton\">Disable Button</td>\n" +
                        "               <td><button ng-disabled = \"enableDisableButton\">Click Me!</button></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td><input type = \"checkbox\" ng-model = \"showHide1\">Show Button</td>\n" +
                        "               <td><button ng-show = \"showHide1\">Click Me!</button></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td><input type = \"checkbox\" ng-model = \"showHide2\">Hide Button</td>\n" +
                        "               <td><button ng-hide = \"showHide2\">Click Me!</button></td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "               <td><p>Total click: {{ clickCounter }}</p></td>\n" +
                        "               <td><button ng-click = \"clickCounter = clickCounter + 1\">Click Me!</button></td>\n" +
                        "            </tr>\n" +
                        "         </table>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        return list;
    }
    //AngularJS Modules
    private static List<LearnDetailsModel> AngularJSModules(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Modules",
                "AngularJS supports modular approach. Modules are used to separate logic such as services, controllers, application etc. from the code and maintain the code clean. We define modules in separate js files and name them as per the module.js file. In the following example, we are going to create two modules −\n" +
                        "\n" +
                        "Application Module − used to initialize an application with controller(s).\n" +
                        "\n" +
                        "Controller Module − used to define the controller.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Application Module",
                "Here is a file named mainApp.js that contains the following code −" +
                        "\n\n" +
                        "Here, we declare an application mainApp module using angular.module function and pass an empty array to it. This array generally contains dependent modules.",
                "var mainApp = angular.module(\"mainApp\", []);",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Controller Module",
                "Here, we declare a controller studentController module using mainApp.controller function." +
                        "\n" +
                        "studentController.js",
                "mainApp.controller(\"studentController\", function($scope) {\n" +
                        "   $scope.student = {\n" +
                        "      firstName: \"Anne\",\n" +
                        "      lastName: \"Moore\",\n" +
                        "      fees:500,\n" +
                        "      \n" +
                        "      subjects:[\n" +
                        "         {name:'Physics',marks:70},\n" +
                        "         {name:'Chemistry',marks:80},\n" +
                        "         {name:'Math',marks:65},\n" +
                        "         {name:'English',marks:75},\n" +
                        "         {name:'Hindi',marks:67}\n" +
                        "      ],\n" +
                        "      fullName: function() {\n" +
                        "         var studentObject;\n" +
                        "         studentObject = $scope.student;\n" +
                        "         return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "      }\n" +
                        "   };\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Use Modules",
                "Here, we use application module using ng-app directive, and controller using ngcontroller directive. We import the mainApp.js and studentController.js in the main HTML page.",
                "<div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "   ...\n" +
                        "   <script src = \"mainApp.js\"></script>\n" +
                        "   <script src = \"studentController.js\"></script>\n" +
                        "\t\n" +
                        "</div>",
                ""
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS Forms
    private static List<LearnDetailsModel> AngularJSForms(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Forms",
                "AngularJS enriches form filling and validation. We can use ng-click event to handle the click button and use $dirty and $invalid flags to do the validation in a seamless way. Use novalidate with a form declaration to disable any browser-specific validation. The form controls make heavy use of AngularJS events. Let us have a look at the events first.\n" +
                        "\n" +
                        "Events\n" +
                        "AngularJS provides multiple events associated with the HTML controls. For example, ng-click directive is generally associated with a button. AngularJS supports the following events −\n" +
                        "\n" +
                        "ng-click\n" +
                        "ng-dbl-click\n" +
                        "ng-mousedown\n" +
                        "ng-mouseup\n" +
                        "ng-mouseenter\n" +
                        "ng-mouseleave\n" +
                        "ng-mousemove\n" +
                        "ng-mouseover\n" +
                        "ng-keydown\n" +
                        "ng-keyup\n" +
                        "ng-keypress\n" +
                        "ng-change",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "ng-click",
                "Reset data of a form using on-click directive of a button.",
                "<input name = \"firstname\" type = \"text\" ng-model = \"firstName\" required>\n" +
                        "<input name = \"lastname\" type = \"text\" ng-model = \"lastName\" required>\n" +
                        "<input name = \"email\" type = \"email\" ng-model = \"email\" required>\n" +
                        "<button ng-click = \"reset()\">Reset</button>\n" +
                        "\n" +
                        "<script>\n" +
                        "   function studentController($scope) { \n" +
                        "      $scope.reset = function() {\n" +
                        "         $scope.firstName = \"Anne\";\n" +
                        "         $scope.lastName = \"Moore\";\n" +
                        "         $scope.email = \"AnneMoore@shrcreation.com\";\n" +
                        "      }   \n" +
                        "      \n" +
                        "      $scope.reset();\n" +
                        "   }\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Validate Data",
                "The following can be used to track error.\n" +
                        "\n" +
                        "$dirty − states that value has been changed.\n" +
                        "\n" +
                        "$invalid − states that value entered is invalid.\n" +
                        "\n" +
                        "$error − states the exact error.",
                "",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Example",
                "The following example will showcase all the above-mentioned directives.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Forms</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"></script>\n" +
                        "      \n" +
                        "      <style>\n" +
                        "         table, th , td {\n" +
                        "            border: 1px solid grey;\n" +
                        "            border-collapse: collapse;\n" +
                        "            padding: 5px;\n" +
                        "         }\n" +
                        "         table tr:nth-child(odd) {\n" +
                        "            background-color: #f2f2f2;\n" +
                        "         }\n" +
                        "         table tr:nth-child(even) {\n" +
                        "            background-color: #ffffff;\n" +
                        "         }\n" +
                        "      </style>\n" +
                        "      \n" +
                        "   </head>\n" +
                        "   <body>\n" +
                        "      \n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "         \n" +
                        "         <form name = \"studentForm\" novalidate>\n" +
                        "            <table border = \"0\">\n" +
                        "               <tr>\n" +
                        "                  <td>Enter first name:</td>\n" +
                        "                  <td><input name = \"firstname\" type = \"text\" ng-model = \"firstName\" required>\n" +
                        "                     <span style = \"color:red\" ng-show = \"studentForm.firstname.$dirty && studentForm.firstname.$invalid\">\n" +
                        "                        <span ng-show = \"studentForm.firstname.$error.required\">First Name is required.</span>\n" +
                        "                     </span>\n" +
                        "                  </td>\n" +
                        "               </tr>\n" +
                        "               \n" +
                        "               <tr>\n" +
                        "                  <td>Enter last name: </td>\n" +
                        "                  <td><input name = \"lastname\"  type = \"text\" ng-model = \"lastName\" required>\n" +
                        "                     <span style = \"color:red\" ng-show = \"studentForm.lastname.$dirty && studentForm.lastname.$invalid\">\n" +
                        "                        <span ng-show = \"studentForm.lastname.$error.required\">Last Name is required.</span>\n" +
                        "                     </span>\n" +
                        "                  </td>\n" +
                        "               </tr>\n" +
                        "               \n" +
                        "               <tr>\n" +
                        "                  <td>Email: </td><td><input name = \"email\" type = \"email\" ng-model = \"email\" length = \"100\" required>\n" +
                        "                     <span style = \"color:red\" ng-show = \"studentForm.email.$dirty && studentForm.email.$invalid\">\n" +
                        "                        <span ng-show = \"studentForm.email.$error.required\">Email is required.</span>\n" +
                        "                        <span ng-show = \"studentForm.email.$error.email\">Invalid email address.</span>\n" +
                        "                     </span>\n" +
                        "                  </td>\n" +
                        "               </tr>\n" +
                        "               \n" +
                        "               <tr>\n" +
                        "                  <td>\n" +
                        "                     <button ng-click = \"reset()\">Reset</button>\n" +
                        "                  </td>\n" +
                        "                  <td>\n" +
                        "                     <button ng-disabled = \"studentForm.firstname.$dirty &&\n" +
                        "                        studentForm.firstname.$invalid || studentForm.lastname.$dirty &&\n" +
                        "                        studentForm.lastname.$invalid || studentForm.email.$dirty &&\n" +
                        "                        studentForm.email.$invalid\" ng-click=\"submit()\">Submit</button>\n" +
                        "                  </td>\n" +
                        "               </tr>\n" +
                        "\t\t\t\t\t\n" +
                        "            </table>\n" +
                        "         </form>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller('studentController', function($scope) {\n" +
                        "            $scope.reset = function() {\n" +
                        "               $scope.firstName = \"Anne\";\n" +
                        "               $scope.lastName = \"Moore\";\n" +
                        "               $scope.email = \"AnneMoore@shrcreation.com\";\n" +
                        "            }\n" +
                        "            \n" +
                        "            $scope.reset();\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS Includes
    private static List<LearnDetailsModel> AngularJSIncludes(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Includes",
                "HTML does not support embedding HTML pages within the HTML page. To achieve this functionality, we can use one of the following options −\n" +
                        "\n" +
                        "Using Ajax − Make a server call to get the corresponding HTML page and set it in the innerHTML of HTML control.\n" +
                        "\n" +
                        "Using Server Side Includes − JSP, PHP and other web side server technologies can include HTML pages within a dynamic page.\n" +
                        "\n" +
                        "Using AngularJS, we can embed HTML pages within an HTML page using ng-include directive.",
                "<div ng-app = \"\" ng-controller = \"studentController\">\n" +
                        "   <div ng-include = \"'main.htm'\"></div>\n" +
                        "   <div ng-include = \"'subjects.htm'\"></div>\n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Example",
                "The following example will showcase all the case." +
                        "\n\n" +
                        "main.htm\n\n" +
                        "<table border = \"0\">\n" +
                        "   <tr>\n" +
                        "      <td>Enter first name:</td>\n" +
                        "      <td><input type = \"text\" ng-model = \"student.firstName\"></td>\n" +
                        "   </tr>\n" +
                        "   \n" +
                        "   <tr>\n" +
                        "      <td>Enter last name: </td>\n" +
                        "      <td><input type = \"text\" ng-model = \"student.lastName\"></td>\n" +
                        "   </tr>\n" +
                        "   \n" +
                        "   <tr>\n" +
                        "      <td>Name: </td>\n" +
                        "      <td>{{student.fullName()}}</td>\n" +
                        "   </tr>\n" +
                        "</table>" +
                        "\n\n" +
                        "subjects.htm\n\n" +
                        "<p>Subjects:</p>\n" +
                        "<table>\n" +
                        "   <tr>\n" +
                        "      <th>Name</th>\n" +
                        "      <th>Marks</th>\n" +
                        "   </tr>\n" +
                        "   \n" +
                        "   <tr ng-repeat = \"subject in student.subjects\">\n" +
                        "      <td>{{ subject.name }}</td>\n" +
                        "      <td>{{ subject.marks }}</td>\n" +
                        "   </tr>\n" +
                        "</table>",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Includes</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <style>\n" +
                        "         table, th , td {\n" +
                        "            border: 1px solid grey;\n" +
                        "            border-collapse: collapse;\n" +
                        "            padding: 5px;\n" +
                        "         }\n" +
                        "         table tr:nth-child(odd) {\n" +
                        "            background-color: #f2f2f2;\n" +
                        "         }\n" +
                        "         table tr:nth-child(even) {\n" +
                        "            background-color: #ffffff;\n" +
                        "         }\n" +
                        "      </style>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"studentController\">\n" +
                        "         <div ng-include = \"'/angularjs/src/include/main.htm'\"></div>\n" +
                        "         <div ng-include = \"'/angularjs/src/include/subjects.htm'\"></div>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller('studentController', function($scope) {\n" +
                        "            $scope.student = {\n" +
                        "               firstName: \"Anne\",\n" +
                        "               lastName: \"Moore\",\n" +
                        "               fees:500,\n" +
                        "               \n" +
                        "               subjects:[\n" +
                        "                  {name:'Physics',marks:70},\n" +
                        "                  {name:'Chemistry',marks:80},\n" +
                        "                  {name:'Math',marks:65},\n" +
                        "                  {name:'English',marks:75},\n" +
                        "                  {name:'Hindi',marks:67}\n" +
                        "               ],\n" +
                        "               fullName: function() {\n" +
                        "                  var studentObject;\n" +
                        "                  studentObject = $scope.student;\n" +
                        "                  return studentObject.firstName + \" \" + studentObject.lastName;\n" +
                        "               }\n" +
                        "            };\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "To execute this example, you need to deploy testAngularJS.htm, \n" +
                        "main.htm, and subjects.htm to a web server. Open the file \n" +
                        "testAngularJS.htm using the URL of your server in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AngularJS Ajax
    private static List<LearnDetailsModel> AngularJSAjax(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Ajax",
                "AngularJS provides $http control which works as a service to read data from the server. The server makes a database call to get the desired records. AngularJS needs data in JSON format. Once the data is ready, $http can be used to get the data from server in the following manner −" +
                        "\n\n" +
                        "Here, the file data.txt contains student records. $http service makes an ajax call and sets response to its property students. students model can be used to draw tables in HTML.",
                "function studentController($scope,$https:) {\n" +
                        "   var url = \"data.txt\";\n" +
                        "\n" +
                        "   $https:.get(url).success( function(response) {\n" +
                        "      $scope.students = response; \n" +
                        "   });\n" +
                        "}",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Examples",
                "The following example will showcase all the case.\n\n" +
                        "data.txt\n" +
                        "[\n" +
                        "   {\n" +
                        "      \"Name\" : \"Anne Moore\",\n" +
                        "      \"RollNo\" : 101,\n" +
                        "      \"Percentage\" : \"80%\"\n" +
                        "   },\n" +
                        "   {\n" +
                        "      \"Name\" : \"Emma Watson\",\n" +
                        "      \"RollNo\" : 201,\n" +
                        "      \"Percentage\" : \"70%\"\n" +
                        "   },\n" +
                        "   {\n" +
                        "      \"Name\" : \"Robert\",\n" +
                        "      \"RollNo\" : 191,\n" +
                        "      \"Percentage\" : \"75%\"\n" +
                        "   },\n" +
                        "   {\n" +
                        "      \"Name\" : \"Duke Joe\",\n" +
                        "      \"RollNo\" : 111,\n" +
                        "      \"Percentage\" : \"77%\"\n" +
                        "   }\n" +
                        "]",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Includes</title>\n" +
                        "      \n" +
                        "      <style>\n" +
                        "         table, th , td {\n" +
                        "            border: 1px solid grey;\n" +
                        "            border-collapse: collapse;\n" +
                        "            padding: 5px;\n" +
                        "         }\n" +
                        "         table tr:nth-child(odd) {\n" +
                        "            background-color: #f2f2f2;\n" +
                        "         }\n" +
                        "         table tr:nth-child(even) {\n" +
                        "            background-color: #ffffff;\n" +
                        "         }\n" +
                        "      </style>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      <div ng-app = \"\" ng-controller = \"studentController\">\n" +
                        "      \n" +
                        "         <table>\n" +
                        "            <tr>\n" +
                        "               <th>Name</th>\n" +
                        "               <th>Roll No</th>\n" +
                        "               <th>Percentage</th>\n" +
                        "            </tr>\n" +
                        "         \n" +
                        "            <tr ng-repeat = \"student in students\">\n" +
                        "               <td>{{ student.Name }}</td>\n" +
                        "               <td>{{ student.RollNo }}</td>\n" +
                        "               <td>{{ student.Percentage }}</td>\n" +
                        "            </tr>\n" +
                        "         </table>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         function studentController($scope,$http) {\n" +
                        "            var url = \"/data.txt\";\n" +
                        "\n" +
                        "            $http.get(url).then( function(response) {\n" +
                        "               $scope.students = response.data;\n" +
                        "            });\n" +
                        "         }\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "To execute this example, you need to deploy testAngularJS." +
                        "\nhtm and data.txt file to a web server. Open the file testAngularJS." +
                        "\nhtm using the URL of your server in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        return list;
    }
    //AngularJS Views
    private static List<LearnDetailsModel> AngularJSViews(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Views",
                "AngularJS supports Single Page Application via multiple views on a single page. To do this, AngularJS has provided ng-view and ng-template directives, and $routeProvider services.\n" +
                        "\n" +
                        "ng-view Directive\n" +
                        "The ng-view directive simply creates a place holder where a corresponding view (HTML or ng-template view) can be placed based on the configuration.\n" +
                        "\n" +
                        "Usage\n" +
                        "Define a div with ng-view within the main module.",
                "<div ng-app = \"mainApp\">\n" +
                        "   ...\n" +
                        "   <div ng-view></div>\n" +
                        "\n" +
                        "</div> ",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "ng-template Directive",
                "The ng-template directive is used to create an HTML view using script tag. It contains id attribute which is used by $routeProvider to map a view with a controller.\n" +
                        "\n" +
                        "Usage\n" +
                        "Define a script block with type as ng-template within the main module.",
                "<div ng-app = \"mainApp\">\n" +
                        "   ...\n" +
                        "\t\n" +
                        "   <script type = \"text/ng-template\" id = \"addStudent.htm\">\n" +
                        "      <h2> Add Student </h2>\n" +
                        "      {{message}}\n" +
                        "   </script>\n" +
                        "\n" +
                        "</div>  ",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "$routeProvider Service",
                "The $routeProvider is a key service which sets the configuration of URLs, maps them with the corresponding HTML page or ng-template, and attaches a controller with the same.\n" +
                        "\n" +
                        "Usage\n" +
                        "Define a script block with type as ng-template within the main module.",
                "<div ng-app = \"mainApp\"> \n" +
                        "   ... \n" +
                        "   <script type = \"text/ng-template\" id = \"addStudent.htm\"> \n" +
                        "      <h2> Add Student </h2> \n" +
                        "      {{message}} \n" +
                        "   </script>  \n" +
                        "</div>",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of all the above-mentioned directives.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Views</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"></script>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-route.min.js\">\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      <div ng-app = \"mainApp\">\n" +
                        "         <p><a href = \"#addStudent\">Add Student</a></p>\n" +
                        "         <p><a href = \"#viewStudents\">View Students</a></p>\n" +
                        "         <div ng-view></div>\n" +
                        "         \n" +
                        "         <script type = \"text/ng-template\" id = \"addStudent.htm\">\n" +
                        "            <h2> Add Student </h2>\n" +
                        "            {{message}}\n" +
                        "         </script>\n" +
                        "         \n" +
                        "         <script type = \"text/ng-template\" id = \"viewStudents.htm\">\n" +
                        "            <h2> View Students </h2>\n" +
                        "            {{message}}\n" +
                        "         </script>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", ['ngRoute']);\n" +
                        "         mainApp.config(['$routeProvider', function($routeProvider) {\n" +
                        "            $routeProvider\n" +
                        "            \n" +
                        "            .when('/addStudent', {\n" +
                        "               templateUrl: 'addStudent.htm',\n" +
                        "               controller: 'AddStudentController'\n" +
                        "            })\n" +
                        "            .when('/viewStudents', {\n" +
                        "               templateUrl: 'viewStudents.htm',\n" +
                        "               controller: 'ViewStudentsController'\n" +
                        "            })\n" +
                        "            .otherwise({\n" +
                        "               redirectTo: '/addStudent'\n" +
                        "            });\n" +
                        "         }]);\n" +
                        "         mainApp.controller('AddStudentController', function($scope) {\n" +
                        "            $scope.message = \"This page will be used to display add student form\";\n" +
                        "         });\n" +
                        "         mainApp.controller('ViewStudentsController', function($scope) {\n" +
                        "            $scope.message = \"This page will be used to display all the students\";\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS Scopes
    private static List<LearnDetailsModel> AngularJSScopes(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Scopes",
                "Scope is a special JavaScript object that connects controller with views. Scope contains model data. In controllers, model data is accessed via $scope object." +
                        "\n\n" +
                        "The following important points are considered in above example −\n" +
                        "\n" +
                        "The $scope is passed as first argument to controller during its constructor definition.\n" +
                        "\n" +
                        "The $scope.message and $scope.type are the models which are used in the HTML page.\n" +
                        "\n" +
                        "We assign values to models that are reflected in the application module, whose controller is shapeController.\n" +
                        "\n" +
                        "We can define functions in $scope.",
                "<script>\n" +
                        "   var mainApp = angular.module(\"mainApp\", []);\n" +
                        "   \n" +
                        "   mainApp.controller(\"shapeController\", function($scope) {\n" +
                        "      $scope.message = \"In shape controller\";\n" +
                        "      $scope.type = \"Shape\";\n" +
                        "   });\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Scope Inheritance",
                "Scope is controller-specific. If we define nested controllers, then the child controller inherits the scope of its parent controller." +
                        "\n\n" +
                        "The following important points are considered in above example −\n" +
                        "\n" +
                        "We assign values to the models in shapeController.\n" +
                        "\n" +
                        "We override message in child controller named circleController. When message is used within the module of controller named circleController, the overridden message is used.",
                "<script>\n" +
                        "   var mainApp = angular.module(\"mainApp\", []);\n" +
                        "   \n" +
                        "   mainApp.controller(\"shapeController\", function($scope) {\n" +
                        "      $scope.message = \"In shape controller\";\n" +
                        "      $scope.type = \"Shape\";\n" +
                        "   });\n" +
                        "   mainApp.controller(\"circleController\", function($scope) {\n" +
                        "      $scope.message = \"In circle controller\";\n" +
                        "   });\n" +
                        "\t\n" +
                        "</script>",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Example",
                "The following example shows use of all the above mentioned directives.\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Forms</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"shapeController\">\n" +
                        "         <p>{{message}} <br/> {{type}} </p>\n" +
                        "         \n" +
                        "         <div ng-controller = \"circleController\">\n" +
                        "            <p>{{message}} <br/> {{type}} </p>\n" +
                        "         </div>\n" +
                        "         \n" +
                        "         <div ng-controller = \"squareController\">\n" +
                        "            <p>{{message}} <br/> {{type}} </p>\n" +
                        "         </div>\n" +
                        "\t\t\t\n" +
                        "      </div>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.controller(\"shapeController\", function($scope) {\n" +
                        "            $scope.message = \"In shape controller\";\n" +
                        "            $scope.type = \"Shape\";\n" +
                        "         });\n" +
                        "         mainApp.controller(\"circleController\", function($scope) {\n" +
                        "            $scope.message = \"In circle controller\";\n" +
                        "         });\n" +
                        "         mainApp.controller(\"squareController\", function($scope) {\n" +
                        "            $scope.message = \"In square controller\";\n" +
                        "            $scope.type = \"Square\";\n" +
                        "         });\n" +
                        "\t\t\t\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }
    //AngularJS Services
    private static List<LearnDetailsModel> AngularJSServices(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Services",
                "AngularJS supports the concept of Separation of Concerns using services architecture. Services are JavaScript functions, which are responsible to perform only specific tasks. This makes them individual entities which are maintainable and testable. The controllers and filters can call them on requirement basis. Services are normally injected using the dependency injection mechanism of AngularJS.\n" +
                        "\n" +
                        "AngularJS provides many inbuilt services. For example, $http, $route, $window, $location, etc. Each service is responsible for a specific task such as the $http is used to make ajax call to get the server data, the $route is used to define the routing information, and so on. The inbuilt services are always prefixed with $ symbol.\n" +
                        "\n" +
                        "There are two ways to create a service −\n" +
                        "\n" +
                        "Factory\n" +
                        "Service",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Using Factory Method",
                "In this method, we first define a factory and then assign method to it.",
                "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "mainApp.factory('MathService', function() {\n" +
                        "   var factory = {};\n" +
                        "   \n" +
                        "   factory.multiply = function(a, b) {\n" +
                        "      return a * b\n" +
                        "   }\n" +
                        "   \n" +
                        "   return factory;\n" +
                        "}); ",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Using Service Method",
                "In this method, we define a service and then assign method to it. We also inject an already available service to it.",
                "mainApp.service('CalcService', function(MathService) {\n" +
                        "   this.square = function(a) {\n" +
                        "      return MathService.multiply(a,a);\n" +
                        "   }\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Example",
                "The following example shows use of all the above mentioned directives −\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Services</title>\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"CalcController\">\n" +
                        "         <p>Enter a number: <input type = \"number\" ng-model = \"number\" /></p>\n" +
                        "         <button ng-click = \"square()\">X<sup>2</sup></button>\n" +
                        "         <p>Result: {{result}}</p>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.factory('MathService', function() {\n" +
                        "            var factory = {};\n" +
                        "            \n" +
                        "            factory.multiply = function(a, b) {\n" +
                        "               return a * b\n" +
                        "            }\n" +
                        "            return factory;\n" +
                        "         });\n" +
                        "         mainApp.service('CalcService', function(MathService) {\n" +
                        "            this.square = function(a) {\n" +
                        "               return MathService.multiply(a,a);\n" +
                        "            }\n" +
                        "         });\n" +
                        "         mainApp.controller('CalcController', function($scope, CalcService) {\n" +
                        "            $scope.square = function() {\n" +
                        "               $scope.result = CalcService.square($scope.number);\n" +
                        "            }\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open the file testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        return list;
    }
    //AngularJS Dependency Injection
    private static List<LearnDetailsModel> AngularJSInjection(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Dependency Injection",
                "Dependency Injection is a software design in which components are given their dependencies instead of hard coding them within the component. It relieves a component from locating the dependency and makes dependencies configurable. It also helps in making components reusable, maintainable and testable.\n" +
                        "\n" +
                        "AngularJS provides a supreme Dependency Injection mechanism. It provides following core components which can be injected into each other as dependencies.\n" +
                        "\n" +
                        "Value\n" +
                        "Factory\n" +
                        "Service\n" +
                        "Provider\n" +
                        "Constant",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Value",
                "Value is a simple JavaScript object, which is required to pass values to the controller during config phase (config phase is when AngularJS bootstraps itself).",
                "//define a module\n" +
                        "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "\n" +
                        "//create a value object as \"defaultInput\" and pass it a data.\n" +
                        "mainApp.value(\"defaultInput\", 5);\n" +
                        "...\n" +
                        "\n" +
                        "//inject the value in the controller using its name \"defaultInput\"\n" +
                        "mainApp.controller('CalcController', function($scope, CalcService, defaultInput) {\n" +
                        "   $scope.number = defaultInput;\n" +
                        "   $scope.result = CalcService.square($scope.number);\n" +
                        "   \n" +
                        "   $scope.square = function() {\n" +
                        "      $scope.result = CalcService.square($scope.number);\n" +
                        "   }\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Factory",
                "Factory is a function which is used to return value. It creates a value on demand whenever a service or a controller requires it. It generally uses a factory function to calculate and return the value.",
                "//define a module\n" +
                        "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "\n" +
                        "//create a factory \"MathService\" which provides a method multiply to return multiplication of two numbers\n" +
                        "mainApp.factory('MathService', function() {\n" +
                        "   var factory = {};\n" +
                        "   \n" +
                        "   factory.multiply = function(a, b) {\n" +
                        "      return a * b\n" +
                        "   }\n" +
                        "   return factory;\n" +
                        "}); \n" +
                        "\n" +
                        "//inject the factory \"MathService\" in a service to utilize the multiply method of factory.\n" +
                        "mainApp.service('CalcService', function(MathService) {\n" +
                        "   this.square = function(a) {\n" +
                        "      return MathService.multiply(a,a);\n" +
                        "   }\n" +
                        "});\n" +
                        "...",
                ""
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Service",
                "Service is a singleton JavaScript object containing a set of functions to perform certain tasks. Service is defined using service() function and it is then injected into the controllers.",
                "//define a module\n" +
                        "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "...\n" +
                        "\n" +
                        "//create a service which defines a method square to return square of a number.\n" +
                        "mainApp.service('CalcService', function(MathService) {\n" +
                        "   this.square = function(a) {\n" +
                        "      return MathService.multiply(a,a); \n" +
                        "   }\n" +
                        "});\n" +
                        "\n" +
                        "//inject the service \"CalcService\" into the controller\n" +
                        "mainApp.controller('CalcController', function($scope, CalcService, defaultInput) {\n" +
                        "   $scope.number = defaultInput;\n" +
                        "   $scope.result = CalcService.square($scope.number);\n" +
                        "   \n" +
                        "   $scope.square = function() {\n" +
                        "      $scope.result = CalcService.square($scope.number);\n" +
                        "   }\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l5 = new LearnDetailsModel(
                "Provider",
                "Provider is used by AngularJS internally to create services, factory, etc. during the config phase. The following script can be used to create MathService that we created earlier. Provider is a special factory method with get() method which is used to return the value/service/factory.",
                "//define a module\n" +
                        "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "...\n" +
                        "\n" +
                        "//create a service using provider which defines a method square to return square of a number.\n" +
                        "mainApp.config(function($provide) {\n" +
                        "   $provide.provider('MathService', function() {\n" +
                        "      this.$get = function() {\n" +
                        "         var factory = {};  \n" +
                        "         \n" +
                        "         factory.multiply = function(a, b) {\n" +
                        "            return a * b; \n" +
                        "         }\n" +
                        "         return factory;\n" +
                        "      };\n" +
                        "   });\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Constant",
                "Constants are used to pass values at the config phase considering the fact that value cannot be used during the config phase.",
                "mainApp.constant(\"configParam\", \"constant value\");",
                ""
        );
        final LearnDetailsModel l7 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of all the above-mentioned directives −\n" +
                        "\n" +
                        "testAngularJS.htm",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>AngularJS Dependency Injection</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"CalcController\">\n" +
                        "         <p>Enter a number: <input type = \"number\" ng-model = \"number\" /></p>\n" +
                        "         <button ng-click = \"square()\">X<sup>2</sup></button>\n" +
                        "         <p>Result: {{result}}</p>\n" +
                        "      </div>\n" +
                        "      \n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.config(function($provide) {\n" +
                        "            $provide.provider('MathService', function() {\n" +
                        "               this.$get = function() {\n" +
                        "                  var factory = {};\n" +
                        "                  \n" +
                        "                  factory.multiply = function(a, b) {\n" +
                        "                     return a * b;\n" +
                        "                  }\n" +
                        "                  return factory;\n" +
                        "               };\n" +
                        "            });\n" +
                        "         });\n" +
                        "\t\t\t\n" +
                        "         mainApp.value(\"defaultInput\", 5);\n" +
                        "         \n" +
                        "         mainApp.factory('MathService', function() {\n" +
                        "            var factory = {};\n" +
                        "            \n" +
                        "            factory.multiply = function(a, b) {\n" +
                        "               return a * b;\n" +
                        "            }\n" +
                        "            return factory;\n" +
                        "         });\n" +
                        "         mainApp.service('CalcService', function(MathService) {\n" +
                        "            this.square = function(a) {\n" +
                        "               return MathService.multiply(a,a);\n" +
                        "            }\n" +
                        "         });\n" +
                        "         mainApp.controller('CalcController', function($scope, CalcService, defaultInput) {\n" +
                        "            $scope.number = defaultInput;\n" +
                        "            $scope.result = CalcService.square($scope.number);\n" +
                        "\n" +
                        "            $scope.square = function() {\n" +
                        "               $scope.result = CalcService.square($scope.number);\n" +
                        "            }\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open testAngularJS.htm in a web browser and see the result."
        );
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        return list;
    }
    //AngularJS Custom Directives
    private static List<LearnDetailsModel> AngularJSCustomDirectives(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "AngularJS Custom Directives",
                "Custom directives are used in AngularJS to extend the functionality of HTML. Custom directives are defined using \"directive\" function. A custom directive simply replaces the element for which it is activated. AngularJS application during bootstrap finds the matching elements and do one time activity using its compile() method of the custom directive then process the element using link() method of the custom directive based on the scope of the directive. AngularJS provides support to create custom directives for following type of elements.\n" +
                        "\n" +
                        "Element directives − Directive activates when a matching element is encountered.\n" +
                        "\n" +
                        "Attribute − Directive activates when a matching attribute is encountered.\n" +
                        "\n" +
                        "CSS − Directive activates when a matching css style is encountered.\n" +
                        "\n" +
                        "Comment − Directive activates when a matching comment is encountered.",
                "",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Understanding Custom Directive",
                "Define custom html tags.\n" +
                        "\n" +
                        "<student name = \"Anne\"></student><br/>\n" +
                        "<student name = \"Emma\"></student>" +
                        "\n\n" +
                        "Define controller to update the scope for directive. Here we are using name attribute's value as scope's child.\n" +
                        "\n" +
                        "mainApp.controller('StudentController', function($scope) {\n" +
                        "   $scope.Mahesh = {};\n" +
                        "   $scope.Mahesh.name = \"Mahesh Parashar\";\n" +
                        "   $scope.Mahesh.rollno  = 1;\n" +
                        "   \n" +
                        "   $scope.Piyush = {};\n" +
                        "   $scope.Piyush.name = \"Piyush Parashar\";\n" +
                        "   $scope.Piyush.rollno  = 2;\n" +
                        "});" +
                        "\n\n" +
                        "Define custom directive to handle above custom html tags bellow codes.",
                "var mainApp = angular.module(\"mainApp\", []);\n" +
                        "\n" +
                        "//Create a directive, first parameter is the html element to be attached.\t  \n" +
                        "//We are attaching student html tag. \n" +
                        "//This directive will be activated as soon as any student element is encountered in html\n" +
                        "\n" +
                        "mainApp.directive('student', function() {\n" +
                        "   //define the directive object\n" +
                        "   var directive = {};\n" +
                        "   \n" +
                        "   //restrict = E, signifies that directive is Element directive\n" +
                        "   directive.restrict = 'E';\n" +
                        "   \n" +
                        "   //template replaces the complete element with its text. \n" +
                        "   directive.template = \"Student: <b>{{student.name}}</b> , \n" +
                        "      Roll No: <b>{{student.rollno}}</b>\";\n" +
                        "   \n" +
                        "   //scope is used to distinguish each student element based on criteria.\n" +
                        "   directive.scope = {\n" +
                        "      student : \"=name\"\n" +
                        "   }\n" +
                        "   \n" +
                        "   //compile is called during application initialization. AngularJS calls \n" +
                        "      it once when html page is loaded.\n" +
                        "\t\n" +
                        "   directive.compile = function(element, attributes) {\n" +
                        "      element.css(\"border\", \"1px solid #cccccc\");\n" +
                        "      \n" +
                        "      //linkFunction is linked with each element with scope to get the element specific data.\n" +
                        "      var linkFunction = function($scope, element, attributes) {\n" +
                        "         element.html(\"Student: <b>\"+$scope.student.name +\"</b> , \n" +
                        "            Roll No: <b>\"+$scope.student.rollno+\"</b><br/>\");\n" +
                        "         element.css(\"background-color\", \"#ff00ff\");\n" +
                        "      }\n" +
                        "      return linkFunction;\n" +
                        "   }\n" +
                        "   \n" +
                        "   return directive;\n" +
                        "});",
                ""
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Example",
                "The following example shows the use of all the above-mentioned directives",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Angular JS Custom Directives</title>\n" +
                        "   </head>\n" +
                        "   \n" +
                        "   <body>\n" +
                        "      <h2>AngularJS Sample Application</h2>\n" +
                        "      \n" +
                        "      <div ng-app = \"mainApp\" ng-controller = \"StudentController\">\n" +
                        "         <student name = \"Mahesh\"></student><br/>\n" +
                        "         <student name = \"Piyush\"></student>\n" +
                        "      </div>\n" +
                        "\t\t\n" +
                        "      <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\">\n" +
                        "      </script>\n" +
                        "      \n" +
                        "      <script>\n" +
                        "         var mainApp = angular.module(\"mainApp\", []);\n" +
                        "         \n" +
                        "         mainApp.directive('student', function() {\n" +
                        "            var directive = {};\n" +
                        "            directive.restrict = 'E';\n" +
                        "            directive.template = \"Student: <b>{{student.name}}</b> , \n" +
                        "               Roll No: <b>{{student.rollno}}</b>\";\n" +
                        "            \n" +
                        "            directive.scope = {\n" +
                        "               student : \"=name\"\n" +
                        "            }\n" +
                        "            directive.compile = function(element, attributes) {\n" +
                        "               element.css(\"border\", \"1px solid #cccccc\");\n" +
                        "               \n" +
                        "               var linkFunction = function($scope, element, attributes) {\n" +
                        "                  element.html(\"Student: <b>\"+$scope.student.name +\"</b> , \n" +
                        "                     Roll No: <b>\"+$scope.student.rollno+\"</b><br/>\");\n" +
                        "                  element.css(\"background-color\", \"#ff00ff\");\n" +
                        "               }\n" +
                        "               return linkFunction;\n" +
                        "            }\n" +
                        "            \n" +
                        "            return directive;\n" +
                        "         });\n" +
                        "         mainApp.controller('StudentController', function($scope) {\n" +
                        "            $scope.Mahesh = {};\n" +
                        "            $scope.Mahesh.name = \"Mahesh Parashar\";\n" +
                        "            $scope.Mahesh.rollno  = 1;\n" +
                        "\n" +
                        "            $scope.Piyush = {};\n" +
                        "            $scope.Piyush.name = \"Piyush Parashar\";\n" +
                        "            $scope.Piyush.rollno  = 2;\n" +
                        "         });\n" +
                        "      </script>\n" +
                        "      \n" +
                        "   </body>\n" +
                        "</html>",
                "Open textAngularJS.htm in a web browser. See the result."
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        return list;
    }



    /*final LearnDetailsModel l1 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l2 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l3 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l4 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l5 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l6 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l7 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );
    final LearnDetailsModel l8 = new LearnDetailsModel(
            "",
            "",
            "",
            ""
    );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);
        list.add(l8);
        return list;*/

    //default
    private static List<LearnDetailsModel> defaultT() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "",
                "",
                "",
                ""
        );

        list.add(l1);

        return list;
    }
    //get list topics
    public static List<LearnDetailsModel> getTopics(String selectedTopicName) {
        switch (selectedTopicName) {
            //fundamentals
            case "Fundamental Introduction":
                return Introduction();
            case "Code structure":
                return CodeStructure();
            case "The modern mode":
                return useStrict();
            case "Variables":
                return Variables();
            case "Data types":
                return DataTypes();
            case "Interaction: alert, prompt, confirm":
                return Interaction();
            case "Type conversion":
                return TypeConversion();
            case "Operators":
                return Operators();
            case "Comparisons":
                return Comparisons();
            case "Conditionals":
                return Conditionals();
            case "Loops":
                return Loops();
            case "Functions":
                return Functions();
            case "Arrow functions":
                return ArrowFunctions();
            //Basics
            case "Basic Introduction":
                return BasicIntroduction();
            case "Syntax":
                return Syntax();
            case "Enabling":
                return Enabling();
            case "Placement":
                return Placement();
            case "Basic Variables":
                return BasicVariables();
            case "Basic Data Types":
                return BasicDataTypes();
            case "Basic Operators":
                return BasicOperators();
            case "Basic Conditions":
                return BasicConditions();
            case "Switch":
                return Switch();
            case "Basic Loops":
                return BasicLoops();
            case "Basic Functions":
                return BasicFunctions();
            case "Events":
                return Events();
            //Objects
            case "Learn Objects":
                return LearnObjects();
            case "Number Objects":
                return NumberObjects();
            case "Boolean Objects":
                return BooleanObjects();
            case "Strings Objects":
                return StringsObjects();
            case "Arrays Objects":
                return ArraysObjects();
            case "Date Objects":
                return DateObjects();
            case "Math Objects":
                return MathObjects();
            case "RegExp Objects":
                return RegExpObjects();
            //OOPs
            case "JS Class":
                return JSClass();
            case "JS Object":
                return JSObject();
            case "JS Prototype":
                return JSPrototype();
            case "JS Constructor Method":
                return JSConstructorMethod();
            case "JS Static Method":
                return JSStaticMethod();
            case "JS Encapsulation":
                return JSEncapsulation();
            case "JS Inheritance":
                return JSInheritance();
            case "JS Polymorphism":
                return JSPolymorphism();
            case "JS Abstraction":
                return JSAbstraction();
            //DOM
            case "HTML DOM":
                return HTMLDOM();
            case "DOM Methods":
                return DOMMethods();
            case "DOM Documents":
                return DOMDocuments();
            case "DOM Elements":
                return DOMElements();
            case "DOM HTML":
                return DOMHTML();
            case "DOM Forms":
                return DOMForms();
            case "DOM CSS":
                return DOMCSS();
            case "DOM Animations":
                return DOMAnimations();
            //BOM
            case "JS Window":
                return JSWindow();
            case "JS Screen":
                return JSScreen();
            case "JS Location":
                return JSLocation();
            case "JS History":
                return JSHistory();
            case "JS Navigator":
                return JSNavigator();
            case "JS Timing":
                return JSTiming();
            case "JS Cookies":
                return JSCookies();
            //advanced
            case "JS Error Handling":
                return JSErrorHandling();
            case "JS Validations":
                return JSValidations();
            case "JS Multimedia":
                return JSMultimedia();
            case "JS Debugging":
                return JSDebugging();
            case "JS Web APIs":
                return JSWebAPIs();
            case "Web Storage API":
                return WebStorageAPI();
            case "Web Workers API":
                return WebWorkersAPI();
            case "JS Graphics":
                return JSGraphics();
            //AJAX
            case "AJAX Introduction":
                return AjaxIntroduction();
            case "AJAX XMLHttp":
                return AjaxXMLHttp();
            case "AJAX Response":
                return AJAXResponse();
            case "AJAX PHP":
                return AJAXPHP();
            case "AJAX ASP":
                return AJAXASP();
            case "AJAX Database":
                return AJAXDatabase();
            case "AJAX Applications":
                return AJAXApplications();
            //Typescript
            case "Typescript Introduction":
                return TypescriptIntroduction();
            case "TypeScript Basic Syntax":
                return TypeScriptBasicSyntax();
            case "TypeScript Types":
                return TypeScriptTypes();
            case "TypeScript Variables":
                return TypeScriptVariables();
            case "TypeScript Operators":
                return TypeScriptOperators();
            case "TypeScript Decision Making":
                return TypeScriptDecisionMaking();
            case "TypeScript Loops":
                return TypeScriptLoops();
            case "TypeScript Functions":
                return TypeScriptFunctions();
            case "TypeScript Numbers":
                return TypeScriptNumbers();
            case "TypeScript Strings":
                return TypeScriptStrings();
            case "TypeScript Arrays":
                return TypeScriptArrays();
            case "TypeScript Tuples":
                return TypeScriptTuples();
            case "TypeScript Union":
                return TypeScriptUnion();
            case "TypeScript Interfaces":
                return TypeScriptInterfaces();
            case "TypeScript Classes":
                return TypeScriptClasses();
            case "TypeScript Objects":
                return TypeScriptObjects();
            case "TypeScript Namespaces":
                return TypeScriptNamespaces();
            case "TypeScript Modules":
                return TypeScriptModules();
            //AngularJS
            case "AngularJS Introduction":
                return AngularJSIntroduction();
            case "AngularJS MVC Architecture":
                return AngularJSMVCArchitecture();
            case "AngularJS First Application":
                return AngularJSFirstApplication();
            case "AngularJS Directives":
                return AngularJSDirectives();
            case "AngularJS Expressions":
                return AngularJSExpressions();
            case "AngularJS Controllers":
                return AngularJSControllers();
            case "AngularJS Filters":
                return AngularJSFilters();
            case "AngularJS Tables":
                return AngularJSTables();
            case "AngularJS HTML DOM":
                return AngularJSHTMLDOM();
            case "AngularJS Modules":
                return AngularJSModules();
            case "AngularJS Forms":
                return AngularJSForms();
            case "AngularJS Includes":
                return AngularJSIncludes();
            case "AngularJS Ajax":
                return AngularJSAjax();
            case "AngularJS Views":
                return AngularJSViews();
            case "AngularJS Scopes":
                return AngularJSScopes();
            case "AngularJS Services":
                return AngularJSServices();
            case "AngularJS Dependency Injection":
                return AngularJSInjection();
            case "AngularJS Custom Directives":
                return AngularJSCustomDirectives();

            default:
                return defaultT();


        }
    }

}
    /*private static List<LearnDetailsModel> AngularJSCustomDirectives(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel();

        return list;
    }*/