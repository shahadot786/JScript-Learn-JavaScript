package com.javascript.jscript.Programs;

public class ProgramsCodes {

    //basics programs codes
    public static final String codes1 ="var today = new Date();\n" +
            "  var day = today.getDay();\n" +
            "  var daylist = [\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday \",\"Thursday\",\"Friday\",\"Saturday\"];\n" +
            "  console.log(\"Today is : \" + daylist[day] + \".\");\n" +
            "  var hour = today.getHours();\n" +
            "  var minute = today.getMinutes();\n" +
            "  var second = today.getSeconds();\n" +
            "  var prepand = (hour >= 12)? \" PM \":\" AM \";\n" +
            "  hour = (hour >= 12)? hour - 12: hour;\n" +
            "  if (hour===0 && prepand===' PM ') \n" +
            "  { \n" +
            "  if (minute===0 && second===0)\n" +
            "  { \n" +
            "  hour=12;\n" +
            "  prepand=' Noon';\n" +
            "  } \n" +
            "  else\n" +
            "  { \n" +
            "  hour=12;\n" +
            "  prepand=' PM';\n" +
            "  } \n" +
            "  } \n" +
            "  if (hour===0 && prepand===' AM ') \n" +
            "  { \n" +
            "  if (minute===0 && second===0)\n" +
            "  { \n" +
            "  hour=12;\n" +
            "  prepand=' Midnight';\n" +
            "  } \n" +
            "  else\n" +
            "  { \n" +
            "  hour=12;\n" +
            "  prepand=' AM';\n" +
            "  } \n" +
            "  } \n" +
            "console.log(\"Current Time : \"+hour + prepand + \" : \" + minute + \" : \" + second);\n";
    public static final String codes2 ="" +
            "//Find the area of a triangle where lengths of the three of its sides are 5, 6, 7" +
            "\n\n" +
            "var side1 = 5; \n" +
            "var side2 = 6; \n" +
            "var side3 = 7; \n" +
            "var s = (side1 + side2 + side3)/2;\n" +
            "var area =  Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));\n" +
            "console.log(area);\n";
    public static final String codes3 ="//Check whether a given year is a leap year in the Gregorian calendar\n\n" +
            "function leapyear(year)\n" +
            "{\n" +
            "return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);\n" +
            "}\n" +
            "console.log(leapyear(2016));\n" +
            "console.log(leapyear(2000));\n" +
            "console.log(leapyear(1700));\n" +
            "console.log(leapyear(1800));\n" +
            "console.log(leapyear(100));\n";
    public static final String codes4 ="//Write a JavaScript program where the program takes a random \ninteger between 1 to 10, the user is then prompted to input a guess \nnumber. If the user input matches with guess number, \nthe program will display a message \"Good Work\" \notherwise display a message \"Not matched\"\n\n" +
            "// Get a random integer from 1 to 10 inclusive\n" +
            " const num = Math.ceil(Math.random() * 10);\n" +
            "console.log(num);\n" +
            " const gnum = prompt('Guess the number between 1 and 10 inclusive');\n" +
            " if (gnum == num)\n" +
            "   console.log('Matched');\n" +
            "  else\n" +
            "   console.log('Not matched, the number was '+gnum);\n" +
            "   ";
    public static final String codes5 ="//Write a JavaScript program to convert temperatures to and from celsius, fahrenheit.\n\n" +
            "function cToF(celsius) \n" +
            "{\n" +
            "  var cTemp = celsius;\n" +
            "  var cToFahr = cTemp * 9 / 5 + 32;\n" +
            "  var message = cTemp+'\\xB0C is ' + cToFahr + ' \\xB0F.';\n" +
            "    console.log(message);\n" +
            "}\n" +
            "\n" +
            "function fToC(fahrenheit) \n" +
            "{\n" +
            "  var fTemp = fahrenheit;\n" +
            "  var fToCel = (fTemp - 32) * 5 / 9;\n" +
            "  var message = fTemp+'\\xB0F is ' + fToCel + '\\xB0C.';\n" +
            "    console.log(message);\n" +
            "} \n" +
            "cToF(60);\n" +
            "fToC(45);\n";
    public static final String codes6 ="//Write a JavaScript exercise to get the extension of a filename.\n\n" +
            "filename = \"system.php\"\n" +
            "console.log(filename.split('.').pop());\n" +
            "filename = \"abc.js\"\n" +
            "console.log(filename.split('.').pop());\n";
    public static final String codes7 ="//Remove a character at the specified position of a given string and return the new string\n\n" +
            "function remove_character(str, char_pos) \n" +
            " {\n" +
            "  part1 = str.substring(0, char_pos);\n" +
            "  part2 = str.substring(char_pos + 1, str.length);\n" +
            "  return (part1 + part2);\n" +
            " }\n" +
            "\n" +
            "console.log(remove_character(\"Python\",0));\n" +
            "console.log(remove_character(\"Python\",3));\n" +
            "console.log(remove_character(\"Python\",5));\n";
    public static final String codes8 ="//Find the largest of three given integers\n\n" +
            "function max_of_three(x, y, z) \n" +
            " {\n" +
            "  max_val = 0;\n" +
            "  if (x > y)\n" +
            "  {\n" +
            "    max_val = x;\n" +
            "  } else\n" +
            "  {\n" +
            "    max_val = y;\n" +
            "  }\n" +
            "  if (z > max_val) \n" +
            "  {\n" +
            "    max_val = z;\n" +
            "  }\n" +
            "  return max_val;\n" +
            "}\n" +
            "\n" +
            "console.log(max_of_three(1,0,1));\n" +
            "console.log(max_of_three(0,-10,-20));\n" +
            "console.log(max_of_three(1000,510,440));";
    public static final String codes9 ="//Check a given string contains 2 to 4 numbers of a specified character\n\n" +
            "function check_char(str1, char)\n" +
            " {\n" +
            "  ctr = 0;\n" +
            "  for (let i = 0; i < str1.length; i++)\n" +
            "  {\n" +
            "    if ((str1.charAt(i) == char) && (i >= 1 && i <= 3))\n" +
            "    {\n" +
            "        ctr=1;\n" +
            "        break;\n" +
            "    }\n" +
            "   }\n" +
            "   if (ctr==1) return true;\n" +
            "   return false;\n" +
            "}\n" +
            "console.log(check_char(\"Python\", \"y\"));\n" +
            "console.log(check_char(\"JavaScript\", \"a\"));\n" +
            "console.log(check_char(\"Console\", \"o\"));\n" +
            "console.log(check_char(\"Console\", \"C\"));\n" +
            "console.log(check_char(\"Console\", \"e\"));\n" +
            "console.log(check_char(\"JavaScript\", \"S\"));\n";
    public static final String codes10 ="//Reverse a given string\n\n" +
            "function string_reverse(str) \n" +
            "{\n" +
            "    return str.split(\"\").reverse().join(\"\");\n" +
            "}\n" +
            "\n" +
            "console.log(string_reverse(\"shrcreation\"));\n" +
            "console.log(string_reverse(\"www\"));\n" +
            "console.log(string_reverse(\"JScript\"));";
    public static final String codes11 ="//Capitalize the first letter of each word of a given string\n\n" +
            "function capital_letter(str) \n" +
            "{\n" +
            "    str = str.split(\" \");\n" +
            "\n" +
            "    for (var i = 0, x = str.length; i < x; i++) {\n" +
            "        str[i] = str[i][0].toUpperCase() + str[i].substr(1);\n" +
            "    }\n" +
            "\n" +
            "    return str.join(\" \");\n" +
            "}\n" +
            "\n" +
            "console.log(capital_letter(\"Write a JavaScript program to capitalize the first letter of each word of a given string.\"));\n";
    public static final String codes12 ="//Convert a given number to hours and minutes\n\n" +
            "function time_convert(num)\n" +
            " { \n" +
            "  var hours = Math.floor(num / 60);  \n" +
            "  var minutes = num % 60;\n" +
            "  return hours + \":\" + minutes;         \n" +
            "}\n" +
            "\n" +
            "console.log(time_convert(71));\n" +
            "console.log(time_convert(450));\n" +
            "console.log(time_convert(1441));\n";
    public static final String codes13 ="//Convert the letters of a given string in alphabetical order\n\n" +
            "function alphabet_Soup(str) { \n" +
            "\n" +
            "    return str.split(\"\").sort().join(\"\");\n" +
            "         \n" +
            "}\n" +
            "\n" +
            "console.log(alphabet_Soup(\"Python\"));\n" +
            "\n" +
            "console.log(alphabet_Soup(\"Exercises\"));\n";
    public static final String codes14 ="//Concatenate two strings except their first character\n\n" +
            "function concatenate(str1, str2) {\n" +
            "  str1 = str1.substring(1, str1.length);\n" +
            "  str2 = str2.substring(1, str2.length);\n" +
            "  return str1 + str2;\n" +
            "}\n" +
            "\n" +
            "console.log(concatenate(\"PHP\",\"JS\"));\n" +
            "console.log(concatenate(\"A\",\"B\"));\n" +
            "console.log(concatenate(\"AA\",\"BB\"));\n";
    public static final String codes15 ="//Rotate the elements left of a given array of integers of length 3\n\n" +
            "function rotate_elements_left(array)\n" +
            "{\n" +
            "    return [array[1], array[2], array[0]];\n" +
            "}\n" +
            "console.log(rotate_elements_left([3, 4, 5]));  \n" +
            "console.log(rotate_elements_left([0, -1, 2]));  \n" +
            "console.log(rotate_elements_left([7, 6, 5])); \n";
    public static final String codes16 ="//Find the maximal difference between any two adjacent elements of a given array of integers\n\n" +
            "function max_difference(arr) {\n" +
            "\tvar max = -1;\n" +
            "    var temp;\n" +
            "\tfor (var i = 0; i < arr.length - 1; i++)\n" +
            "      {\n" +
            "\t\ttemp = Math.abs(arr[i] - arr[i + 1]);\n" +
            "\t\tmax = Math.max(max, temp);\n" +
            "\t  }\n" +
            "\treturn max;\n" +
            "}\n" +
            "\n" +
            "console.log(max_difference([1, 2, 3, 8, 9]))\n" +
            "console.log(max_difference([1, 2, 3, 18, 9]))\n" +
            "console.log(max_difference([13, 2, 3, 8, 9]))\n";
    public static final String codes17 ="//Find the shortest possible string which can create a string to make it a palindrome by adding characters to the end of it\n\n" +
            "function build_Palindrome(new_str) {\n" +
            "  var flag;\n" +
            "  for (var i = new_str.length;; i++) {\n" +
            "    flag = true;\n" +
            "    for (var j = 0; j < i - j - 1; j++) {\n" +
            "      if (i - j - 1 < new_str.length && new_str[j] != new_str[i - j - 1]) {\n" +
            "        flag = false;\n" +
            "        break;\n" +
            "      }\n" +
            "    }\n" +
            "    if (flag) {\n" +
            "      for (var j = new_str.length; j < i; j++) {\n" +
            "        new_str += new_str[i - j - 1];\n" +
            "      }\n" +
            "      return new_str;\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "console.log(build_Palindrome(\"abcddc\"))\n" +
            "console.log(build_Palindrome(\"122\"))\n";
    public static final String codes18 ="//Create the dot products of two given 3D vectors\n\n" +
            "function dot_product(vector1, vector2) {\n" +
            "  var result = 0;\n" +
            "  for (var i = 0; i < 3; i++) {\n" +
            "    result += vector1[i] * vector2[i];\n" +
            "  }\n" +
            "  return result;\n" +
            "}\n" +
            "console.log(dot_product([1,2,3], [1,2,3]))\n" +
            "console.log(dot_product([2,4,6], [2,4,6]))\n" +
            "console.log(dot_product([1,1,1], [0,1,-1]))\n";
    public static final String codes19 ="//Sort an array of all prime numbers between 1 and a given integer\n\n" +
            "function sort_prime(num) {\n" +
            "\n" +
            "  var prime_num1 = [],\n" +
            "      prime_num2 = [];\n" +
            "  for (var i = 0; i <= num; i++) {\n" +
            "    prime_num2.push(true);\n" +
            "  }\n" +
            "  for (var i = 2; i <= num; i++) {\n" +
            "    if (prime_num2[i]) {\n" +
            "      prime_num1.push(i);\n" +
            "      for (var j = 1; i * j <= num; j++) {\n" +
            "        prime_num2[i * j] = false;\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "\n" +
            "  return prime_num1;\n" +
            "}\n" +
            "\n" +
            "console.log(sort_prime(5))\n" +
            "console.log(sort_prime(11))\n" +
            "console.log(sort_prime(19))\n";
    public static final String codes20 ="//Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer\n\n" +
            "function int_sum(num) {\n" +
            "    var s_sum = 0;\n" +
            "    while (num > 0) {\n" +
            "        s_sum += num;\n" +
            "        num = Math.floor(num / 2);\n" +
            "    }\n" +
            "    return s_sum;\n" +
            "}\n" +
            "console.log(int_sum(8))\n" +
            "console.log(int_sum(9))\n" +
            "console.log(int_sum(26))\n";
    public static final String codes21 ="//Check whether a given string represents a correct sentence or not\n\n" +
            "function is_correct_Sentence(input_str) {\n" +
            "    var first_char = input_str[0];\n" +
            "    var last_char = input_str[input_str.length - 1];\n" +
            "    return /[A-Z]/.test(first_char) && last_char == \".\"\n" +
            "}\n" +
            "console.log(is_correct_Sentence(\"This tool will help you write better English and efficiently corrects texts.\"));\n" +
            "console.log(is_correct_Sentence(\"This tool will help you write better English and efficiently corrects texts\"));            \n" +
            "console.log(is_correct_Sentence(\"this tool will help you write better English and efficiently corrects texts.\"));\n";
    public static final String codes22 ="//Check whether a matrix is a diagonal matrix or not\n\n" +
            "function is_diagonal_matrix(user_matrix) {\n" +
            "    for (var i = 0; i < user_matrix.length; i++) {\n" +
            "        for (var j = 0; j < user_matrix.length; j++) {\n" +
            "            if (i !== j && user_matrix[i][j] !== 0) \n" +
            "              return false;\n" +
            "        }\n" +
            "    }\n" +
            "    return true;\n" +
            "}\n" +
            "\n" +
            "\n" +
            "console.log(is_diagonal_matrix([[1, 0, 0], [0, 2, 0], [0, 0, 3] ]));\n" +
            "console.log(is_diagonal_matrix([[1, 0, 0], [0, 2, 3], [0, 0, 3] ]));\n";
    public static final String codes23 ="//Check whether a point lies strictly inside a given circle\n\n" +
            "function check_a_point(a, b, x, y, r) {\n" +
            "    var dist_points = (a - x) * (a - x) + (b - y) * (b - y);\n" +
            "    r *= r;\n" +
            "    if (dist_points < r) {\n" +
            "        return true;\n" +
            "    }\n" +
            "    return false;\n" +
            "}\n" +
            "\n" +
            "console.log(check_a_point(0, 0, 2, 4, 6));\n" +
            "console.log(check_a_point(0, 0, 6, 8, 6));\n";
    public static final String codes24 ="//Check whether a given matrix is lower triangular or not\n\n" +
            "function lower_triangular_matrix(user_matrix) {\n" +
            "    for (var i = 0; i < user_matrix.length; i++) \n" +
            "         {\n" +
            "        for (var j = 0; j < user_matrix[0].length; j++) \n" +
            "            {\n" +
            "            if (j > i && user_matrix[i][j] !== 0)\n" +
            "              return false;\n" +
            "        }\n" +
            "    }\n" +
            "    return true;\n" +
            "}\n" +
            "\n" +
            "console.log(lower_triangular_matrix([[1, 0, 0],[2, 0, 0], [0, 3, 3]]));\n" +
            "console.log(lower_triangular_matrix([[1, 0, 1],[2, 0, 0], [0, 3, 3]]));\n";
    public static final String codes25 ="//Create the value of NOR of two given booleans\n" +
            "function test_logical_Nor(a, b) {\n" +
            "  return (!a && !b)\n" +
            "}\n" +
            "console.log(test_logical_Nor(true, false));\n" +
            "console.log(test_logical_Nor(false, false));\n" +
            "console.log(test_logical_Nor(true, true));\n";
    public static final String codes26 ="//Get the largest even number from an array of integers\n\n" +
            "function max_even(arra) {\n" +
            "\n" +
            "  arra.sort((x, y) => y - x);\n" +
            "\n" +
            "  for (var i = 0; i < arra.length; i++) {\n" +
            "    if (arra[i] % 2 == 0)\n" +
            "      return arra[i];\n" +
            "    }\n" +
            "  }\n" +
            "\n" +
            "console.log(max_even([20, 40, 200]));\n" +
            "console.log(max_even([20, 40, 200, 301]));\n";
    public static final String codes27 ="//Find the smallest prime number strictly greater than a given number\n\n" +
            "function next_Prime_num(num) {\n" +
            "    for (var i = num + 1;; i++) {\n" +
            "        var isPrime = true;\n" +
            "        for (var d = 2; d * d <= i; d++) {\n" +
            "            if (i % d === 0) {\n" +
            "                isPrime = false;\n" +
            "                break;\n" +
            "            }\n" +
            "        }\n" +
            "        if (isPrime) {\n" +
            "            return i;\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "console.log(next_Prime_num(3));\n" +
            "console.log(next_Prime_num(17));\n";
    public static final String codes28 ="//Find all distinct prime factors of a given integer\n\n" +
            "function prime_factors(num) {\n" +
            "  function is_prime(num) {\n" +
            "    for (let i = 2; i <= Math.sqrt(num); i++)\n" +
            "    {\n" +
            "      if (num % i === 0) return false;\n" +
            "    }\n" +
            "    return true;\n" +
            "  }\n" +
            "  const result = [];\n" +
            "  for (let i = 2; i <= num; i++)\n" +
            "  {\n" +
            "    while (is_prime(i) && num % i === 0) \n" +
            "    {\n" +
            "      if (!result.includes(i)) result.push(i);\n" +
            "      num /= i;\n" +
            "    }\n" +
            "  }\n" +
            "  return result;\n" +
            "}\n" +
            "console.log(prime_factors(100));\n" +
            "console.log(prime_factors(101));\n" +
            "console.log(prime_factors(103));\n" +
            "console.log(prime_factors(104));\n" +
            "console.log(prime_factors(105));\n";
    public static final String codes29 ="//Check whether a given fraction is proper or not\n\n" +
            "function proper_improper_test(num) {\n" +
            "  return Math.abs(num[0] / num[1]) < 1\n" +
            "    ? \"Proper fraction.\"\n" +
            "    : \"Improper fraction.\";\n" +
            "}\n" +
            "console.log(proper_improper_test([12, 300]));\n" +
            "console.log(proper_improper_test([2, 4]));\n" +
            "console.log(proper_improper_test([103, 3]));\n" +
            "console.log(proper_improper_test([104, 2]));\n" +
            "console.log(proper_improper_test([5, 40]));\n";
    public static final String codes30 ="//Simplify a given absolute path for a file in Unix-style\n" +
            "function simplify_path(main_path) {\n" +
            "  var parts = main_path.split('/'),\n" +
            "      new_path = [],\n" +
            "      length = 0;\n" +
            "  for (var i = 0; i < parts.length; i++) {\n" +
            "    var part = parts[i];\n" +
            "    if (part === '.' || part === '' || part === '..') {\n" +
            "      if (part === '..' && length > 0) {\n" +
            "        length--;\n" +
            "      }\n" +
            "      continue;\n" +
            "    }\n" +
            "    new_path[length++] = part;\n" +
            "  }\n" +
            "\n" +
            "  if (length === 0) {\n" +
            "    return '/';\n" +
            "  }\n" +
            "\n" +
            "  var result = '';\n" +
            "  for (var i = 0; i < length; i++) {\n" +
            "    result +=  '/'+new_path[i] ;\n" +
            "  }\n" +
            "\n" +
            "  return result;\n" +
            "}\n" +
            "console.log(simplify_path(\"/home/var/./www/../html//sql/\"));\n";
    public static final String codes31 ="//Swap two halves of a given array of integers of even length\n\n" +
            "function halv_array_swap(iarra) {\n" +
            "  if (((iarra.length)%2)!=0)\n" +
            "    {\n" +
            "    return false;\n" +
            "    }\n" +
            "\n" +
            "  for (var i = 0; i < iarra.length / 2; i++) {\n" +
            "    var tmp = iarra[i];\n" +
            "    iarra[i] = iarra[i + iarra.length / 2];\n" +
            "    iarra[i + iarra.length / 2] = tmp;\n" +
            "  }\n" +
            "  return iarra;\n" +
            "}\n" +
            "\n" +
            "console.log(halv_array_swap([1,2,3,4,5,6]))\n" +
            "console.log(halv_array_swap([1,2,3,4,5,6,7]))\n";
    public static final String codes32 ="";
    public static final String codes33 ="";
    public static final String codes34 ="";
    public static final String codes35 ="";
    public static final String codes36 ="";
    public static final String codes37 ="";
    public static final String codes38 ="";
    public static final String codes39 ="";
    public static final String codes40 = "Difference between “==” and “===”?";
    public static final String codes41 = "How to detect the operating system on the client machine?";
    public static final String codes42 = "What do you mean by NULL in Javascript?";
    public static final String codes43 = "What is the use of Void (0)?";
    public static final String codes44 = "How can a page be forced to load another page in JavaScript?";
    public static final String codes45 = "What is the difference between an alert box and a confirmation box?";
    public static final String codes46 = "What are escape characters?";
    public static final String codes47 = "What are JavaScript Cookies?";
    public static final String codes48 = "What a pop()method in JavaScript is?";
    public static final String codes49 = "Does JavaScript has concept level scope?";
    public static final String codes50 = "What are the disadvantages of using innerHTML in JavaScript?";
    public static final String codes51 = "How can generic objects be created?";
    public static final String codes52 = "Which keywords are used to handle exceptions?";
    public static final String codes53 = "What is the use of the blur function?";
    public static final String codes54 = "How to find an operating system in the client machine using JavaScript?";
    public static final String codes55 = "What are the different types of errors in JavaScript?";
    public static final String codes56 = "What is the use of the Push method in JavaScript?";
    public static final String codes57 = "What is the unshift method in JavaScript?";
    public static final String codes58 = "What is the ‘Strict Mode in JavaScript, and how can it be enabled?";
    public static final String codes59 = "How closures work in JavaScript?";
    public static final String codes60 = "How can a value be appended to an array?";
    public static final String codes61 = "What are the important properties of an anonymous function in JavaScript?";
    public static final String codes62 = "What is the difference between .call() and .apply()?";
    public static final String codes63 = "What is event bubbling?";
    public static final String codes64 = "How can a particular frame be targeted, from a hyperlink, in JavaScript?";
    public static final String codes65 = "Why you should not use innerHTML in JavaScript?";
    public static final String codes66 = "What is namespacing in JavaScript, and how is it used?";
    public static final String codes67 = "How can JavaScript codes be hidden from old browsers that do not support JavaScript?";
    public static final String codes68 = "Give an example of JavaScript Multiplication Table";
    public static final String codes69 = "How are object properties assigned?";
    public static final String codes70 = "How to create objects in JavaScript?";
    public static final String codes71 = "What is the method for reading and writing a file in JavaScript?";
    public static final String codes72 = "What are Screen objects?";
    public static final String codes73 = "What is the unshift() method?";
    public static final String codes74 = "What are the important JavaScript Array Method explain with example?";
    public static final String codes75 = "What is Loop Though the Properties of an Object?";
    public static final String codes76 = "In JavaScript what is an argument object?";
    public static final String codes77 = "If we want to return the character from a specific index which method is used?";
    public static final String codes78 = "What is the use of window object?";
    public static final String codes79 = "What is the use of history object?";
    public static final String codes80 = "How to set the cursor to wait in JavaScript?";
    public static final String codes81 = "What is this [[[]]]?";
    public static final String codes82 = "What is the use of Math object in JavaScript?";
    public static final String codes83 = "What is the use of a Date object in JavaScript?";
    public static final String codes84 = "What is the use of a Number object in JavaScript?";
    public static final String codes85 = "What is the use of a Boolean object in JavaScript?";
    public static final String codes86 = "What is the use of a TypedArray object in JavaScript?";
    public static final String codes87 = "What is the use of a Set object in JavaScript?";
    public static final String codes88 = "What is the use of a WeakSet object in JavaScript?";
    public static final String codes89 = "What is the use of a Map object in JavaScript?";
    public static final String codes90 = "What is the use of a WeakMap object in JavaScript?";
    public static final String codes91 = "What is OOPS Concept in JavaScript?";
    public static final String codes92 = "How are event handlers utilized in JavaScript?";
    public static final String codes93 = "What is the role of deferred scripts in JavaScript?";
    public static final String codes94 = "What are the various functional components in JavaScript?";
    public static final String codes95 = "Write about the errors shown in JavaScript?";
    public static final String codes96 = "What is unescape() and escape() functions?";
    public static final String codes97 = "What are the decodeURI() and encodeURI()?";
    public static final String codes98 = "What is JavaScript Unit Testing, and what are the challenges in JavaScript Unit Testing?";
    public static final String codes99 = "What are some important JavaScript Unit Testing Frameworks?";
    public static final String codes100 = "What is QuickSort Algorithm in JavaScript?";
    public static final String codes101 = "How does QuickSort Work?";
    public static final String codes102 = "Difference between Client side JavaScript and Server side JavaScript?";
    public static final String codes103 = "In which location cookies are stored on the hard disk?";
    public static final String codes104 = "What is the requirement of debugging in JavaScript?";
    public static final String codes105 = "What is the use of debugger keyword in JavaScript?";
    public static final String codes106 = "How do you define a class and its constructor?";
    public static final String codes107 = "What is function overloading in JavaScript?";
    public static final String codes108 = "What is  associative arrays in JavaScript?";
    public static final String codes109 = "Why \"self\" is needed instead of \"this\" in JavaScript?";
    public static final String codes110 = "Understanding JavaScript Inheritance with Example";
    public static final String codes111 = "Why asynchronous code is important in JavaScript?";
    public static final String codes112 = "How to empty an array in JavaScript?";
    public static final String codes113 = "What is the difference between let, var, and const?";
    public static final String codes114 = "Is it possible to use JavaScript to change the meta-tags of the page?";
    public static final String codes115 = "How To modify the URL of page without reloading the page?";
    public static final String codes116 = "Name two ways two change the context of a JavaScript method?";
    public static final String codes117 = "How are DOM utilized in JavaScript?";
    public static final String codes118 = "What is DOM in JavaScript?";
    public static final String codes119 = "How to use DOM and Events?";
    public static final String codes120 = "What is External JavaScript?";
    public static final String codes121 = "When to Use Internal and External JavaScript Code?";
    public static final String codes122 = "Is there any difference between window and document?";
    public static final String codes123 = "Does document.onload and window.onload fire at the same time?";
    public static final String codes124= "Is attribute similar to property?";
    public static final String codes125 = "What are the different ways to get an element from DOM?";
    public static final String codes126 = "What is the fastest way to select elements by using css selectors?";
    public static final String codes127 = "How come, I can't use forEach or similar array methods on a NodeList?";
    public static final String codes128 = "If you need to implement getElementByAttribute, how would you implement it?";
    public static final String codes129 = "How would you add a class to an element by query selector?";
    public static final String codes130 = "How could I verify whether one element is child of another?";
    public static final String codes131 = "What is the best way to create a DOM element? Set innherHTML or use createElement?";
    public static final String codes132 = "What is createDocumentFragment and why you might use it?";
    public static final String codes133 = "What is reflow? What causes reflow? How could you reduce reflow?";
    public static final String codes134 = "What is repaint and when does this happen?";
    public static final String codes135 = "How could you make sure to run some javaScript when DOM is ready like $(document).ready?";
    public static final String codes136 = "How would you destroy multiple list items with one click handler?";
    public static final String codes137 = "Create a button that is destroyed by clicking on it but two new buttons are created in it's place.";
    public static final String codes138 = "How could you capture all clicks in a page?";
    public static final String codes139 = "How can you get all the texts in a web page?";
    public static final String codes140 = "What is BOM?";
    public static final String codes141 = "Which is the root element of Bom?";
    public static final String codes142 = "Which object is the top object in BOM?";
    public static final String codes143 = "Why window object is used on BOM?";
    public static final String codes144 = "What is full form of Bom?";
    public static final String codes145 = "Which object is the most important object in the BOM model?";
    public static final String codes146 = "Which object is at the top of the hierarchy in document object model?\n";
    public static final String codes147 = "What is the window object?";
    public static final String codes148 = "How to get web browser window size?";
    public static final String codes149 = "How to detect web browser information?";
    public static final String codes150 = "What is IIFEs (Immediately Invoked Function Expressions)?";
    public static final String codes151 = "Explain the difference between Object.freeze() vs const";
    public static final String codes152 = "What is generator in JS?";
    public static final String codes153 = "When should we use generators in ES6?";
    public static final String codes154 = "What will be the output of the following code?";
    public static final String codes155 = "Explain the Prototype Design Pattern";
    public static final String codes156 = "What is the Temporal Dead Zone in ES6?";
    public static final String codes157 = "Can you describe the main difference between a .forEach loop and a .map() loop and why you would pick one versus the other?";
    public static final String codes158 = "Describe the Revealing Module Pattern design pattern";
    public static final String codes159 = "What is Ajax?";
    public static final String codes160 = "What are Ajax applications?";
    public static final String codes161 = "How many types of triggers are present in update panel?";
    public static final String codes162 = "What are all the controls of Ajax?";
    public static final String codes163 = "What is the name of the DLL that contains Ajax control tool kit?";
    public static final String codes164 = "What role of #&& in querystring?";
    public static final String codes165 = "How to control the duration of an Ajax request?";
    public static final String codes166 = "What are the advantages of Ajax?";
    public static final String codes167 = "What are the disadvantages of Ajax?";
    public static final String codes168 = "What is update panel?";
    public static final String codes169 = "Which are the two methods used for cross domain Ajax calls?";
    public static final String codes170 = "What are all the technologies used by Ajax?";
    public static final String codes171 = "What are all the features of Ajax?";
    public static final String codes172 = "What is JSON in Ajax?";
    public static final String codes173 = "What are the components of the ASP.NET AJAX architecture?";
    public static final String codes174 = "What is AJAX Control Extender Toolkit?";
    public static final String codes175 = "Where AJAX cannot be used?";
    public static final String codes176 = "What are the pre-requisites to execute AJAX applications on a server?";
    public static final String codes177 = "What is AJAX Framework?";
    public static final String codes178 = "Does Ajax work with another language?";
    public static final String codes179 = "What is an asynchronous request in AJAX?";
    public static final String codes180 = "What is a synchronous request in AJAX?";
    public static final String codes181 = "Did adaptive path invent Ajax? Did Google? Did adaptive path help build Google’s Ajax Applications?";
    public static final String codes182 = "What do you need to know to create my own Ajax Functionality?";
    public static final String codes183 = "Should I use Xml or Text, Javascript, or Html as a Return Type?";
    public static final String codes184 = "Are there usability issues with Ajax?";
    public static final String codes185 = "Should I use an Http get or Post for my Ajax Calls?";
    public static final String codes186 = "How do we Debug Javascript?";
    public static final String codes187 = "How do I provide Internationalized Ajax Interactions?";
    public static final String codes188 = "What is TypeScript?";
    public static final String codes189 = "What are the Differences between TypeScript and JavaScript?";
    public static final String codes190 = "Why do we need TypeScript?";
    public static final String codes191 = "Mention some of the features of TypeScript";
    public static final String codes192 = "What are the Benefits of using TypeScript?";
    public static final String codes193 = "What are the Disadvantages of TypeScript?";
    public static final String codes194 = "What are the Components of TypeScript?";
    public static final String codes195 = "Who developed Typescript and what is the current stable version available?";
    public static final String codes196 = "How to install TypeScript?";
    public static final String codes197 = "How do you compile TypeScript files?";
    public static final String codes198 = "Can we combine multiple .ts files into a single .js file?";
    public static final String codes199 = "What are the different types of TypeScript?";
    public static final String codes200 = "List out the built-in data types in TypeScript.";
    public static final String codes201 = "What are Variables in TypeScript and how to create them?";
    public static final String codes202 = "What are the object-oriented terms supported by TypeScript?";
    public static final String codes203 = "What are Interfaces in TypeScript?";
    public static final String codes204 = "What are Classes in TypeScript? List out some of the features.";
    public static final String codes205 = "What are the access modifiers supported by TypeScript?";
    public static final String codes206 = "How is TypeScript an optionally statically typed language?";
    public static final String codes207 = "What are modules in TypeScript?";
    public static final String codes208 = "What is namespace in Typescript and how to declare it?";
    public static final String codes209 = "Does TypeScript support function overloading?";
    public static final String codes210 = "Explain Decorators in TypeScript.";
    public static final String codes211 = "What are Mixins?";
    public static final String codes212 = "How does TypeScript support optional parameters in function?";
    public static final String codes213 = "What is Scope variable?";
    public static final String codes214 = "What is TypeScript Definition Manager and why do we need it?";
    public static final String codes215 = "What is TypeScript Declare Keyword?";
    public static final String codes216 = "What is the Default Parameters Function in TypeScript?";
    public static final String codes217 = "What is tsconfig.json file?";
    public static final String codes218 = "What are Generics in TypeScript?";
    public static final String codes219 = "What is JSX in TypeScript?";
    public static final String codes220 = "What are all the JSX modes TypeScript supports?";
    public static final String codes221 = "What are Ambients in TypeScripts and when to use them?";
    public static final String codes222 = "What is a TypeScript Map file?";
    public static final String codes223 = "What is Type assertions in TypeScript?";
    public static final String codes224 = "Explain Enum in TypeScript.";
    public static final String codes225 = "What is method overriding in TypeScript?";
    public static final String codes226 = "What is Lambda/Arrow function?";
    public static final String codes227 = "What is Angular? Why was it introduced?";
    public static final String codes228 = "What is data binding? Which type of data binding does Angular deploy?";
    public static final String codes229 = "What are Single Page Applications (SPA)?";
    public static final String codes230 = "What are decorators in Angular?";
    public static final String codes231 = "Mention some advantages of Angular.";
    public static final String codes232 = "What are the new updates with Angular10?";
    public static final String codes233 = "What are Templates in Angular?";
    public static final String codes234 = "What are Annotations in Angular?";
    public static final String codes235 = "What are Directives in Angular?";
    public static final String codes236 = "What is an AOT compilation? What are its advantages?";
    public static final String codes237 = "What are Components in Angular?";
    public static final String codes238 = "What are Pipes in Angular?";
    public static final String codes239 = "What is an ngModule?";
    public static final String codes240 = "What are filters in Angular? Name a few of them.";
    public static final String codes241 = "What is view encapsulation in Angular?";
    public static final String codes242 = "What are controllers?";
    public static final String codes243 = "Explain the lifecycle hooks in Angular";
    public static final String codes244 = "What is String Interpolation in Angular?";
    public static final String codes245 = "What is the difference between AOT and JIT?";
    public static final String codes246 = "Explain the @Component Decorator.";
    public static final String codes247 = "What are Services in Angular?";
    public static final String codes248 = "What are Promises and Observables in Angular?";
    public static final String codes249 = "What are Template and Reactive forms?";
    public static final String codes250 = "What is Bootstrap? How is it embedded into Angular?";
    public static final String codes251 = "What type of DOM does Angular implement?";
    public static final String codes252 = "What is Vue.js?";
    public static final String codes253 = "List some features of Vue.js?";
    public static final String codes254 = "Explain Life cycle of Vue Instance?";
    public static final String codes255 = "How to create an instance of Vue js?";
    public static final String codes256 = "Explain the differences between one-way data flow and two-way data binding?";
    public static final String codes257 = "How to create Two-Way Bindings in Vue.js?";
    public static final String codes258 = "What are filters in VUE.js?";
    public static final String codes259 = "How to create a custom filter in Vue.js?";
    public static final String codes260 = "What are Components in Vue.js? How to register a component inside other component?";
    public static final String codes261 = "What are Directives in VUE.js, List some of them you used?";
    public static final String codes262 = "List type of Directive are available in Vue.js?";
    public static final String codes263 = "What is VUE-resource, how can you install Vue Resource?";
    public static final String codes264 = "How to create Constants in Vue.js?";
    public static final String codes265 = "What is virtual dom in Vue.js?";
    public static final String codes266 = "Why we need Vue.js mixins?";
    public static final String codes267 = "What is Vuex?";
    public static final String codes268 = "What are filters in Vue.js?";
    public static final String codes269 = "How to create a component in Vue.js?";
    public static final String codes270 = "How to import js file in the Vue component?";
    public static final String codes271 = "How to call rest API from Vue js?";
    public static final String codes272 = "What is Next.js?";
    public static final String codes273 = "Why is Next.js used for? / Why do world's leading companies prefer Next.js?";
    public static final String codes274 = "What is the process to install Next.js? / How to install Next.js?";
    public static final String codes275 = "What are the most prominent features of Next.js?";
    public static final String codes276 = "Which types of websites most popularly use Next.js?";
    public static final String codes277 = "Is it possible to use Next.js with Redux?";
    public static final String codes278 = "What is the recommended method to fetch data in Next.js?";
    public static final String codes279 = "Give an example to demonstrate how do you set up CDN in Next.js?";
    public static final String codes280 = "Are Create-React-App and Next.js used for the same thing?";
    public static final String codes281 = "How can you disable the etag generation in Next.js?";
    public static final String codes282 = "How can you configure the build-id in Next.js?";
    public static final String codes283 = "How can you create a page directory inside your project?";
    public static final String codes284 = "Give an example to demonstrate how to create a custom error page in Next.js?";
    public static final String codes285 = "What do you understand by code splitting in Next.js?";
    public static final String codes286 = "How can you enable AMP in Next.js?";
    public static final String codes287 = "Is it possible to host Next.js in a web server like Nginx?";
    public static final String codes288 = "Next.js vs gatsby?";
    public static final String codes289 = "What is React?";
    public static final String codes290 = "What are the features of React?";
    public static final String codes291 = "List some of the major advantages of React?";
    public static final String codes292 = "What are the limitations of React?";
    public static final String codes293 = "What is JSX?";
    public static final String codes294 = "What do you understand by Virtual DOM? Explain its works.";
    public static final String codes295 = "Why can’t browsers read JSX?";
    public static final String codes296 = "How different is React’s ES6 syntax when compared to ES5?";
    public static final String codes297 = "“In React, everything is a component.” Explain";
    public static final String codes298 = "What is the purpose of render() in React?";
    public static final String codes299 = "How can you embed two or more components into one?";
    public static final String codes300 = "What is Props?";
    public static final String codes301 = "What is a state in React and how is it used?";
    public static final String codes302 = "How can you update the state of a component?";
    public static final String codes303 = "What is arrow function in React? How is it used?";
    public static final String codes304 = "Explain the lifecycle methods of React components in detail.";
    public static final String codes305 = "What is an event in React?";
    public static final String codes306 = "What do you understand by refs in React?";
    public static final String codes307 = "How do you modularize code in React?";
    public static final String codes308 = "What are Higher Order Components(HOC)?";
    public static final String codes309 = "What is the significance of keys in React?";
    public static final String codes310 = "What were the major problems with MVC framework?";
    public static final String codes311 = "What is Redux?";
    public static final String codes312 = "What are the three principles that Redux follows?";
    public static final String codes313 = "What do you understand by “Single source of truth”?";
    public static final String codes314 = "How are Actions defined in Redux?";
    public static final String codes315 = "What is the significance of Store in Redux?";
    public static final String codes316 = "What is React Router?";
    public static final String codes317 = "Why is switch keyword used in React Router v4?";
    public static final String codes318 = "Why do we need a Router in React?";
    public static final String codes319 = "Explain what Ember.js is and how it works?";
    public static final String codes320 = "List out main components of Ember.js?";
    public static final String codes321 = "Explain what is model in Ember.js?";
    public static final String codes322 = "Explain how ember applications are structured?";
    public static final String codes323 = "What controller does in Ember.js?";
    public static final String codes324 = "Explain how is ember.js is different than traditional web application?";
    public static final String codes325 = "Explain how Router and {{outlet}} tag can be useful in ember.js?";
    public static final String codes326 = "Explain what is the difference between Router and Route in ember.js ?";
    public static final String codes327 = "Explain what is Ember-data ?";
    public static final String codes328 = "Explain the role of adapter and types of adapters ?";
    public static final String codes329 = "Explain what are the two ways of defining and inserting a view?";
    public static final String codes330 = "Explain what is controller in ember.js ?";
    public static final String codes331 = "Mention the template components used in ember.js ?";
    public static final String codes332 = "Explain what is serializer?";
    public static final String codes333 = "How you can define a new ember class?";
    public static final String codes334 = "Explain how you can create an Ember. handlebars  template ?";
    public static final String codes335 = "Explain how you can add data using fixture into an application?";
    public static final String codes336 = "What do you understand by ember route? How can you generate a route in Ember.js?";
    public static final String codes337 = "What is an adapter in Ember.js, and why is it used?";
    public static final String codes338 = "Mention some of the functions used in ember packages/ember run-time/lib and packages/ember metal/lib/utils.js ?";
    public static final String codes339 = "Explain what is Enumerables in ember.js ?";
    public static final String codes340 = "Explain what is Ember.ArrayController and what is the advantage of it ?";
    public static final String codes341 = "Explain what is the use Ember.SortableMixin ?";
    public static final String codes342 = "What do you know by observers in Ember.js?";
    public static final String codes343 = "How to define a view in Ember.js?";
    public static final String codes344 = "What is Bootstrap?";
    public static final String codes345 = "Explain why Bootstrap is preferred for website development.";
    public static final String codes346 = "What are the key components of Bootstrap?";
    public static final String codes347 = "List some features of Bootstrap.";
    public static final String codes348 = "What are Class loaders in Bootstrap?";
    public static final String codes349 = "How many types of layout are available in Bootstrap?";
    public static final String codes350 = "What is Bootstrap Grid System?";
    public static final String codes351 = "Give an example of a basic grid structure in Bootstrap?";
    public static final String codes352 = "Why do we use Jumbotron in Bootstrap?";
    public static final String codes353 = "What are the two codes used for code display in Bootstrap?";
    public static final String codes354 = "Explain the typography and links in Bootstrap.";
    public static final String codes355 = "Explain types of lists supported by Bootstrap.";
    public static final String codes356 = "Explain the uses of carousel plugin in Bootstrap.";
    public static final String codes357 = "What are glyphicons? How to use them?";
    public static final String codes358 = "What are the input groups in Bootstrap?";
    public static final String codes359 = "What is Bootstrap breadcrumb?";
    public static final String codes360 = "What is pagination in bootstrap and how are they classified?";
    public static final String codes361 = "How will you create a Bootstrap Dismissal Alert?";
    public static final String codes362 = "What are the steps to create a progress bar using bootstrap?";
    public static final String codes363 = "What do you mean by column ordering in Bootstrap?";
    public static final String codes364 = "What is Normalize in Bootstrap?";
    public static final String codes365 = "What are Bootstrap panels? Explain how to create a Bootstrap panel with a heading.";
    public static final String codes366 = "What is the purpose of using the Scrollspy plugin?";
    public static final String codes367 = "Why do we use the affix plugin in Bootstrap?";
    public static final String codes368 = "What is Button group and which class is used for basic button group?";
    public static final String codes369 = "What will be the default Bootstrap look of the alert created with this following code:";
    public static final String codes370 = "What are badges? Which class will you use to make your badge look more rounded?";
    public static final String codes371 = "What are the important rules that you should follow while using Grids in Bootstrap?";
    public static final String codes372 = "What is Node.js? Where can you use it?";
    public static final String codes373 = "Why use Node.js?";
    public static final String codes374 = "How does Node.js work?";
    public static final String codes375 = "Why is Node.js Single-threaded?";
    public static final String codes376 = "If Node.js is single-threaded, then how does it handle concurrency?";
    public static final String codes377 = "Explain callback in Node.js.";
    public static final String codes378 = "How is Node.js most frequently used?";
    public static final String codes379 = "What is NPM?";
    public static final String codes380 = "What are the modules in Node.js?";
    public static final String codes381 = "Why is Node.js preferred over other backend technologies like Java and PHP?";
    public static final String codes382 = "Which database is more popularly used with Node.js?";
    public static final String codes383 = "What are some of the most commonly used libraries in Node.js?";
    public static final String codes384 = "What is the command used to import external libraries?";
    public static final String codes385 = "What does event-driven programming mean?";
    public static final String codes386 = "What is an Event Loop in Node.js?";
    public static final String codes387 = "Differentiate between process.nextTick() and setImmediate()?";
    public static final String codes388 = "What is an EventEmitter in Node.js?";
    public static final String codes389 = "What are the two types of API functions in Node.js?";
    public static final String codes390 = "What is the package.json file?";
    public static final String codes391 = "How do you create a simple Express.js application?";
    public static final String codes392 = "What are streams in Node.js?";
    public static final String codes393 = "Explain asynchronous and non-blocking APIs in Node.js.";
    public static final String codes394 = "What is REPL in Node.js?";
    public static final String codes395 = "What is the buffer class in Node.js?";
    public static final String codes396 = "What is piping in Node.js?";
    public static final String codes397 = "What is callback hell?";
    public static final String codes398 = "What is a reactor pattern in Node.js?";
    public static final String codes399 = "For Node.js, why does Google use the V8 engine?";
    public static final String codes400 = "Explain the concept of middleware in Node.js.";
    public static final String codes401 = "What is WASI, and why is it being introduced?";
    public static final String codes402 = "What is Express.js?";
    public static final String codes403 = "What are some distinctive features of Express?";
    public static final String codes404 = "Is Express.js front-end or backend framework?";
    public static final String codes405 = "Why do we use Express.js?";
    public static final String codes406 = "Write the steps for setting up an Express JS application?";
    public static final String codes407 = "What function are arguments available to Express JS route handlers?";
    public static final String codes408 = "How to Config properties in Express JS?";
    public static final String codes409 = "Write a code to get post a query in Express.js";
    public static final String codes410 = "What do you understand by Scaffolding in Express.js?";
    public static final String codes411 = "Do Other MVC frameworks also support scaffolding?";
    public static final String codes412 = "How can you enable debugging in Express.js app?";
    public static final String codes413 = "How Should I Structure my Express JS Application?";
    public static final String codes414 = "How can you deal with error handling in Express.js? Explain with an example.";
    public static final String codes415 = "How can we render a pain HTML?";
    public static final String codes416 = "How to allow CORS in Express JS? Explain with an example?";
    public static final String codes417 = "What is the use of next in Express JS?";
    public static final String codes418 = "How to Redirect 404 Errors to A Page In ExpressJS?";
    public static final String codes419 = "What is Laravel?";
    public static final String codes420 = "What are the pros and cons of Laravel?";
    public static final String codes421 = "What are events in Laravel?";
    public static final String codes422 = "What is validation in Laravel?";
    public static final String codes423 = "How do you install Laravel via composer?";
    public static final String codes424 = "What is a PHP artisan in Laravel?";
    public static final String codes425 = "What is middleware in Laravel?";
    public static final String codes426 = "What template is used by the Laravel engine?";
    public static final String codes427 = "Explain CSRF protection and CSRF token in Laravel.";
    public static final String codes428 = "Explain the Laravel facade.";
    public static final String codes429 = "What is Eloquent in Laravel?";
    public static final String codes430 = "What are the advantages of the Laravel framework?";
    public static final String codes431 = "What are the features of the Laravel framework?";
    public static final String codes432 = "What are the features included in the latest version of Laravel?";
    public static final String codes433 = "What is the project structure of a Laravel project?";
    public static final String codes434 = "What is authentication in Laravel?";
    public static final String codes435 = "What are service providers in Laravel?";
    public static final String codes436 = "What is a homestead in Laravel?";
    public static final String codes437 = "What is dd() in Laravel?";
    public static final String codes438 = "What is yield in Laravel?";
    public static final String codes439 = "What are requests in Laravel?";
    public static final String codes440 = "What are closures in Laravel?";
    public static final String codes441 = "What is soft delete in Laravel?";
    public static final String codes442 = "What is a repository pattern in Laravel?";
    public static final String codes443 = "What is method spoofing in Laravel?";
    public static final String codes444 = "What is tinker in Laravel?";
    public static final String codes445 = "What is the use of the updateOrinsert() method in Laravel?";
    public static final String codes446 = "How do you stop an Artisan server in Laravel?";
    public static final String codes447 = "How can you extend the login expiration time in Auth?";
    public static final String codes448 = "How do you check the current route name?";
    public static final String codes449 = "What is jQuery?";
    public static final String codes450 = "What are the features of jQuery?";
    public static final String codes451 = "Mention some advantages of jQuery.";
    public static final String codes452 = "What are Selectors in jQuery?";
    public static final String codes453 = "What is jQuery.noConflict?";
    public static final String codes454 = "Differentiate among .empty() vs .remove() vs .detach() in jQuery.";
    public static final String codes455 = "What are the methods used to provide effects in jQuery?";
    public static final String codes456 = "What are the various Ajax functions available in jQuery?";
    public static final String codes457 = "Differentiate between width() vs css(‘width’) in jQuery";
    public static final String codes458 = "What is jQuery connect and how to use it?";
    public static final String codes459 = "What is the difference between jquery.size() and jquery.length?";
    public static final String codes460 = "How can events be prevented from stopping to work after an ajax request?";
    public static final String codes461 = "What is the difference between $(window).load and $(document).ready function in jQuery?";
    public static final String codes462 = "What is a CDN? What are the advantages of using CDN?";
    public static final String codes463 = "How can you add a jQuery library in your project?";
    public static final String codes464 = "What is the use of serialize() method in JQuery?";
    public static final String codes465 = "What is jQuery UI?";
    public static final String codes466 = "What is jQuery Datepicker in jQuery?";
    public static final String codes467 = "What is slice() method in jQuery?";
    public static final String codes468 = "What are jQuery plugins?";
    public static final String codes469 = "What is the difference between Map and Grep function in jQuery?";
    public static final String codes470 = "How can jQuery be used in conjunction with another JavaScript library that also uses $ for naming?";
    public static final String codes471 = "What is method chaining in jQuery and what are the advantages?";
    public static final String codes472 = "What is the use of jQuery .each() function?";
    public static final String codes473 = "What is the difference between prop and attr?";
    public static final String codes474 = "What is chaining in jQuery?";
    public static final String codes475 = "What are the features of jQuery used in web applications?";
    public static final String codes = "";


}

