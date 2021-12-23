package com.javascript.jscript.Learn;

import com.javascript.jscript.Model.LearnDetailsModel;

import java.util.ArrayList;
import java.util.List;

public class LearnTopicsBank {
    //introductions
    private static List<LearnDetailsModel> Introduction() {
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel("Hello, world!",
                "JavaScript programs can be inserted almost anywhere into an HTML document using the <script> tag.\n" +
                        "You can place the <script> tags, containing your JavaScript, anywhere within your web page, but it is normally recommended that you should keep it within the <head> tags."
                , "<html>\n" +
                "   <body>   \n" +
                "      <script language = \"javascript\" type = \"text/javascript\">\n" +
                "         <!--\n" +
                "            document.write(\"Hello World!\")\n" +
                "         //-->\n" +
                "      </script>      \n" +
                "   </body>\n" +
                "</html>",
                "Hello World!");

        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Whitespace and Line Breaks",
                "JavaScript ignores spaces, tabs, and newlines that appear in JavaScript programs. You can use spaces, tabs, and newlines freely in your program and you are free to format and indent your programs in a neat and consistent way that makes the code easy to read and understand.",
                "",
                ""
        );

        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Case Sensitivity",
                "JavaScript is a case-sensitive language. This means that the language keywords, variables, function names, and any other identifiers must always be typed with a consistent capitalization of letters.\n" +
                        "\n" +
                        "So the identifiers Time and TIME will convey different meanings in JavaScript.",
                "",
                ""
        );

        final LearnDetailsModel l4 = new LearnDetailsModel(
                "External scripts",
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
                "Statements are syntax constructs and commands that perform actions. We can have as many statements in our code as we want. Statements can be separated with a semicolon.",
                "document.write(\"Hello World!\");\n" +
                        "document.write(\"Hello World!\");",
                "Hello World!\nHello World!"
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "Without Semicolons",
                "A semicolon may be omitted in most cases when a line break exists. This would also work:",
                "document.write(\"Hello World!\")\n" +
                        "document.write(\"Hello World!\")",
                "Hello World!\nHello World!"
        );
        final LearnDetailsModel l3 = new LearnDetailsModel(
                "Single Line Comment",
                "As time goes on, programs become more and more complex. It becomes necessary to add comments which describe what the code does and why. " +
                        "\nOne-line comments start with two forward slash characters //.",
                "// This comment occupies a line of its own\n" +
                        "document.write(\"Hello World!\");\n" +
                        "\n" +
                        "document.write(\"Hello World!\"); // This comment follows the statement",
                "Hello World!\nHello World!"
        );
        final LearnDetailsModel l4 = new LearnDetailsModel(
                "Multiline Comments",
                "Multiline comments start with a forward slash and an asterisk /* and end with an asterisk and a forward slash */. Like this:",
                "/* An example with two messages.\n" +
                        "This is a multiline comment.\n" +
                        "*/\n" +
                        "document.write(\"Hello World!\");\n" +
                        "document.write(\"Hello World!\");",
                "Hello World!\nHello World!"
        );

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        return list;
    }
    //useStrict
    private static List<LearnDetailsModel> useStrict(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "“use strict”",
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

        list.add(l1);
        list.add(l2);

        return list;
    }
    //Variables
    private static List<LearnDetailsModel> Variables(){
        final List<LearnDetailsModel> list = new ArrayList<>();
        final LearnDetailsModel l1 = new LearnDetailsModel(
                "Variables",
                "Variables are placeholders for information. Think of it is a memory container that holds your data." +
                        "\nTo create a variable in JavaScript, use the let keyword.",
                "let user = 'John';\n" +
                        "let age = 25;\n" +
                        "let message = 'Hello';",
                ""
        );
        final LearnDetailsModel l2 = new LearnDetailsModel(
                "A real-life analogy",
                "We can easily grasp the concept of a “variable” if we imagine it as a “box” for data, with a uniquely-named sticker on it.\n" +
                        "\n" +
                        "For instance, the variable message can be imagined as a box labeled \"message\" with the value \"Hello!\" in it and\n" +
                        "We can put any value in the box. We can also change it as many times as we want and remember \n" +
                        "When the value is changed, the old data is removed from the variable.",
                "let message;\n" +
                        "\n" +
                        "message = 'Hello!';\n" +
                        "\n" +
                        "message = 'World!'; // value changed\n" +
                        "\n" +
                        "document.write(message);// World!" +
                        "\n" +
                        "let hello = 'Hello world!';\n" +
                        "\n" +
                        "let message;" +
                        "// copy 'Hello world' from hello into message\n" +
                        "message = hello;\n" +
                        "\n" +
                        "// now two variables hold the same data\n" +
                        "document.write(hello); // Hello world!\n" +
                        "document.write(message); // Hello world!",
                "World!\n" +
                        "Hello world!" +
                        "\nHello world!"
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
                        "// ...when we need to pick a color\n" +
                        "let color = COLOR_ORANGE;\n" +
                        "alert(color); // #FF7F00",
                "#FF7F00"
        );
        final LearnDetailsModel l6 = new LearnDetailsModel(
                "Name things right",
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
        final LearnDetailsModel l9 = new LearnDetailsModel(
                "",
                "",
                "",
                ""
        );
        final LearnDetailsModel l10 = new LearnDetailsModel(
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
        list.add(l9);
        list.add(l10);

        return list;
    }

    private static List<LearnDetailsModel> advancedTopics() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript advancedTopics", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    private static List<LearnDetailsModel> angularTopics() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript angularTopics", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    private static List<LearnDetailsModel> lastTopics() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript lastTopics",
                "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written." +
                        "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "", "");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    private static List<LearnDetailsModel> angular() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript lastTopics", "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written." +
                "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "", "");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "", "");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    private static List<LearnDetailsModel> Vue() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript angularTopics", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    private static List<LearnDetailsModel> defaultT() {
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel("Learn JavaScript angularTopics", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l2 = new LearnDetailsModel("Learn JavaScript2", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l3 = new LearnDetailsModel("Learn JavaScript3", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l4 = new LearnDetailsModel("Learn JavaScript4", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l5 = new LearnDetailsModel("Learn JavaScript5", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");
        final LearnDetailsModel l6 = new LearnDetailsModel("Learn JavaScript6", "The statements are executed, one by one, in the same order as they are written."
                , "document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\";", "Hello Dolly.");

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);

        return list;
    }

    public static List<LearnDetailsModel> getTopics(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Introduction":
                return Introduction();
            case "Code structure":
                return CodeStructure();
            case "The modern mode":
                return useStrict();
            case "Variables":
                return Variables();
            case "Data types":
                return DataTypes();
            case "Learn Objects":
                return advancedTopics();
            case "Learn advanced":
                return angularTopics();
            case "Typescript":
                return lastTopics();
            case "Learn angular":
                return angular();
            case "Vue Js":
                return Vue();
            default:
                return defaultT();


        }
    }

}
    /*private static List<LearnDetailsModel> useStrict(){
        final List<LearnDetailsModel> list = new ArrayList<>();

        final LearnDetailsModel l1 = new LearnDetailsModel();

        return list;
    }*/