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

            default:
                return defaultT();


        }
    }

}
    /*private static List<LearnDetailsModel> AJAXApplications(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel();

        return list;
    }*/