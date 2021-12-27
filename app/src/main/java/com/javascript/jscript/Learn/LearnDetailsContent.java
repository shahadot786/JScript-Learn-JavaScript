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

            default:
                return defaultT();


        }
    }

}
    /*private static List<LearnDetailsModel> BasicDataTypes(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel();

        return list;
    }*/