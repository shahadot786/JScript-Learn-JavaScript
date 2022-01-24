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
    public static final String codes32 ="function _keys(obj) \n" +
            " {\n" +
            "    if (!isObject(obj)) return [];\n" +
            "    if (Object.keys) return Object.keys(obj);\n" +
            "    var keys = [];\n" +
            "    for (var key in obj) if (_.has(obj, key)) keys.push(key);\n" +
            "    return keys;\n" +
            "  }\n" +
            "function isObject(obj) \n" +
            "{\n" +
            "    var type = typeof obj;\n" +
            "    return type === 'function' || type === 'object' && !!obj;\n" +
            "  }\n" +
            "console.log(_keys({red: \"#FF0000\", green: \"#00FF00\", white: \"#FFFFFF\"}));\n";
    public static final String codes33 ="var student =  { \n" +
            "  name : \"Anne Moore\", \n" +
            "  sclass : \"VI\", \n" +
            "  rollno : 12  };\n" +
            "console.log(student);\n" +
            "delete student.rollno;\n" +
            "console.log(student);\n";
    public static final String codes34 ="//Write a JavaScript program to get the length of a JavaScript object.\n" +
            "\n" +
            "Object.objsize = function(Myobj) {\n" +
            "    var osize = 0, key;\n" +
            "    for (key in Myobj) {\n" +
            "        if (Myobj.hasOwnProperty(key)) osize++;\n" +
            "    }\n" +
            "    return osize;\n" +
            "};\n" +
            "\n" +
            "var student = { \n" +
            "name : \"Anne Moore\", \n" +
            "sclass : \"VI\", \n" +
            "rollno : 12 };\n" +
            "\n" +
            "var objsize = Object.objsize(student);\n" +
            "console.log('Size of the current object : '+objsize);\n";
    public static final String codes35 ="var library = [ \n" +
            "    {\n" +
            "        title: 'Bill Gates',\n" +
            "        author: 'The Road Ahead',\n" +
            "        readingStatus: true\n" +
            "    },\n" +
            "    {\n" +
            "        title: 'Steve Jobs',\n" +
            "        author: 'Walter Isaacson',\n" +
            "        readingStatus: true\n" +
            "    },\n" +
            "    {\n" +
            "        title: 'Mockingjay: The Final Book of The Hunger Games',\n" +
            "        author: 'Suzanne Collins',\n" +
            "        readingStatus: false\n" +
            "    }];\n" +
            "\n" +
            "for (var i = 0; i < library.length; i++) \n" +
            "   {\n" +
            "    var book = \"'\" + library[i].title + \"'\" + ' by ' + library[i].author + \".\";\n" +
            "    if (library[i].readingStatus) {\n" +
            "      console.log(\"Already read \" + book);\n" +
            "    } else\n" +
            "    {\n" +
            "     console.log(\"You still need to read \" + book);\n" +
            "    }\n" +
            "   }\n" +
            "   ";
    public static final String codes36 ="function Cylinder(cyl_height, cyl_diameter) {\n" +
            "  this.cyl_height = cyl_height;\n" +
            "  this.cyl_diameter = cyl_diameter;\n" +
            "}\n" +
            "\n" +
            "Cylinder.prototype.Volume = function () {\n" +
            "  var radius = this.cyl_diameter / 2;\n" +
            "  return this.cyl_height * Math.PI * radius * radius;\n" +
            "};\n" +
            "\n" +
            "var cyl = new Cylinder(7, 4);\n" +
            "// Volume of the cylinder with four decimal places.\n" +
            "console.log('volume =', cyl.Volume().toFixed(4));\n";
    public static final String codes37 ="Array.prototype.bubbleSort_algo = function() \n" +
            "{\n" +
            "var is_sorted = false;\n" +
            " while (!is_sorted) \n" +
            " {\n" +
            "    is_sorted = true;\n" +
            "    for (var n = 0; n < this.length - 1; n++) \n" +
            "    {\n" +
            "      if (this[n] > this[n+1]){\n" +
            "        var x = this[n+1];\n" +
            "        this[n+1] = this[n];\n" +
            "        this[n] = x;\n" +
            "        is_sorted = false;\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "  return this;\n" +
            "};\n" +
            "\n" +
            "console.log([6,4,0, 3,-2,1].bubbleSort_algo());\n";
    public static final String codes38 ="String.prototype.sub_String = function() \n" +
            "{\n" +
            "  var subset = [];\n" +
            "  for (var m = 0; m < this.length; m++) \n" +
            "  {\n" +
            "    for (var n = m+1; n<this.length+1; n++) \n" +
            "    {\n" +
            "      subset.push(this.slice(m,n));\n" +
            "    }\n" +
            "  }\n" +
            "  return subset;\n" +
            "};\n" +
            "\n" +
            "console.log(\"dog\".sub_String());\n";
    public static final String codes39 ="function my_Clock() \n" +
            "  {\n" +
            "  this.cur_date = new Date();\n" +
            "  this.hours = this.cur_date.getHours();\n" +
            "  this.minutes = this.cur_date.getMinutes();\n" +
            "  this.seconds = this.cur_date.getSeconds();\n" +
            "  }\n" +
            "my_Clock.prototype.run = function ()\n" +
            "  {\n" +
            "  setInterval(this.update.bind(this), 1000);\n" +
            "  };\n" +
            "my_Clock.prototype.update = function () \n" +
            "  {\n" +
            "  this.updateTime(1);\n" +
            "  console.log(this.hours + \":\" + this.minutes + \":\" + this.seconds);\n" +
            "  };\n" +
            "my_Clock.prototype.updateTime = function (secs) \n" +
            "  {\n" +
            "  this.seconds+= secs;\n" +
            " if (this.seconds >= 60)\n" +
            "  {\n" +
            "  this.minutes++;\n" +
            "  this.seconds= 0;\n" +
            "  }\n" +
            " if (this.minutes >= 60)\n" +
            "  {\n" +
            "  this.hours++;\n" +
            "  this.minutes=0;\n" +
            "  }\n" +
            "if (this.hours >= 24)\n" +
            "  {\n" +
            "  this.hours = 0;\n" +
            "  }\n" +
            "};\n" +
            "var clock = new my_Clock();\n" +
            "  clock.run();\n" +
            "  ";
    public static final String codes40 = "function circle(radius)\n" +
            "{\n" +
            "    this.radius = radius;\n" +
            "  // area method\n" +
            "    this.area = function () \n" +
            "    {\n" +
            "        return Math.PI * this.radius * this.radius;\n" +
            "    };\n" +
            "  // perimeter method\n" +
            "    this.perimeter = function ()\n" +
            "    {\n" +
            "        return 2*Math.PI*this.radius;\n" +
            "    };\n" +
            "}\n" +
            "var c = new circle(3);\n" +
            "console.log('Area =', c.area().toFixed(2));\n" +
            "console.log('perimeter =', c.perimeter().toFixed(2));\n";
    public static final String codes41 = "var library = [ \n" +
            "   {\n" +
            "       title: 'Bill Gates',\n" +
            "       author: 'The Road Ahead',\n" +
            "       libraryID: 1254\n" +
            "   },\n" +
            "   {\n" +
            "       title: 'Steve Jobs',\n" +
            "       author: 'Walter Isaacson',\n" +
            "       libraryID: 4264\n" +
            "   },\n" +
            "   {\n" +
            "       title: 'Mockingjay: The Final Book of The Hunger Games',\n" +
            "       author: 'Suzanne Collins',\n" +
            "       libraryID: 3245\n" +
            "   }];\n" +
            "\n" +
            "var sort_by = function(field_name, reverse, initial){\n" +
            "\n" +
            "   var key = initial ?\n" +
            "       function(x)\n" +
            "             {\n" +
            "               return initial(x[field_name]);\n" +
            "             } :\n" +
            "       function(x) \n" +
            "             {\n" +
            "               return x[field_name];\n" +
            "             };\n" +
            "\n" +
            "   reverse = !reverse ? 1 : -1;\n" +
            "\n" +
            "   return function (x, y) {\n" +
            "       return x = key(x), y = key(y), reverse * ((x > y) - (y > x));\n" +
            "     } ;\n" +
            "};\n" +
            "\n" +
            "\n" +
            "var newobj = library.sort(sort_by('libraryID', true, parseInt));\n" +
            "\n" +
            "console.log(newobj);\n";
    public static final String codes42 = "function FindAllMethods(obj) {\n" +
            "    return Object.getOwnPropertyNames(obj).filter(function(property) {\n" +
            "        return typeof obj[property] == \"function\";\n" +
            "    });\n" +
            "}\n" +
            "//above code finds methods only\n" +
            "//Following code finds both properties and methods \n" +
            "console.log(FindAllMethods(Math));\n" +
            "console.log(FindAllMethods(Array));\n" +
            "function all_properties(obj) \n" +
            "{\n" +
            " return Object.getOwnPropertyNames(obj);\n" +
            "}\n" +
            "\n" +
            "console.log(all_properties(Math));\n" +
            "\n" +
            "console.log(all_properties(Array));\n";
    public static final String codes43 = "function parse_URL(url) {\n" +
            "    var a = document.createElement('a');\n" +
            "    a.href = url;\n" +
            "    return {\n" +
            "        source: url,\n" +
            "        protocol: a.protocol.replace(':', ''),\n" +
            "        host: a.hostname,\n" +
            "        port: a.port,\n" +
            "        query: a.search,\n" +
            "        params: (function () {\n" +
            "            var ret = {},\n" +
            "                seg = a.search.replace(/^\\?/, '').split('&'),\n" +
            "                len = seg.length,\n" +
            "                i = 0,\n" +
            "                s;\n" +
            "            for (; i < len; i++) {\n" +
            "                if (!seg[i]) {\n" +
            "                    continue;\n" +
            "                }\n" +
            "                s = seg[i].split('=');\n" +
            "                ret[s[0]] = s[1];\n" +
            "            }\n" +
            "            return ret;\n" +
            "        })(),\n" +
            "        file: (a.pathname.match(/\\/([^\\/?#]+)$/i) || [, ''])[1],\n" +
            "        hash: a.hash.replace('#', ''),\n" +
            "        path: a.pathname.replace(/^([^\\/])/, '/$1'),\n" +
            "        relative: (a.href.match(/tps?:\\/\\/[^\\/]+(.+)/) || [, ''])[1],\n" +
            "        segments: a.pathname.replace(/^\\//, '').split('/')\n" +
            "    };\n" +
            "}\n" +
            "\n" +
            "console.log(parse_URL('https://github.com/pubnub/python/search?utf8=%E2%9C%93&q=python'));\n";
    public static final String codes44 = "function allKeys(obj) {\n" +
            "    if (!isObject(obj)) return [];\n" +
            "    var keys = [];\n" +
            "    for (var key in obj) keys.push(key);\n" +
            "    return keys;\n" +
            "}\n" +
            "function isObject(obj) \n" +
            "{\n" +
            "    var type = typeof obj;\n" +
            "    return type === 'function' || type === 'object' && !!obj;\n" +
            "  }\n" +
            "function Student(name) {\n" +
            "  this.name = name;\n" +
            "}\n" +
            "Student.prototype.rollno = true;\n" +
            "console.log(allKeys(new Student(\"Sara\")));\n";
    public static final String codes45 = "function all_values(obj) {\n" +
            "    var keys = _keys(obj);\n" +
            "    var length = keys.length;\n" +
            "    var values = Array(length);\n" +
            "    for (var i = 0; i < length; i++) {\n" +
            "      values[i] = obj[keys[i]];\n" +
            "    }\n" +
            "    return values;\n" +
            "  }\n" +
            "function _keys(obj) \n" +
            " {\n" +
            "    if (!isObject(obj)) return [];\n" +
            "    if (Object.keys) return Object.keys(obj);\n" +
            "    var keys = [];\n" +
            "    for (var key in obj) if (_.has(obj, key)) keys.push(key);\n" +
            "    return keys;\n" +
            "  }\n" +
            "function isObject(obj)   \n" +
            "{  \n" +
            "    var type = typeof obj;  \n" +
            "    return type === 'function' || type === 'object' && !!obj;  \n" +
            "  } \n" +
            "console.log(all_values({red: \"#FF0000\", green: \"#00FF00\", white: \"#FFFFFF\"}));\n";
    public static final String codes46 = "function key_value_pairs(obj) \n" +
            "   {\n" +
            "    var keys = _keys(obj);\n" +
            "    var length = keys.length;\n" +
            "    var pairs = Array(length);\n" +
            "    for (var i = 0; i < length; i++) \n" +
            "    {\n" +
            "      pairs[i] = [keys[i], obj[keys[i]]];\n" +
            "    }\n" +
            "    return pairs;\n" +
            "  }\n" +
            "\n" +
            "function _keys(obj) \n" +
            "  {\n" +
            "    if (!isObject(obj)) return [];\n" +
            "    if (Object.keys) return Object.keys(obj);\n" +
            "    var keys = [];\n" +
            "    for (var key in obj) if (_.has(obj, key)) keys.push(key);\n" +
            "    return keys;\n" +
            "  }\n" +
            "function isObject(obj) \n" +
            " {\n" +
            "    var type = typeof obj;\n" +
            "    return type === 'function' || type === 'object' && !!obj;\n" +
            "  }\n" +
            "console.log(key_value_pairs({red: \"#FF0000\", green: \"#00FF00\", white: \"#FFFFFF\"}));\n";
    public static final String codes47 = "function invert_key_value(obj) {\n" +
            "    var result = {};\n" +
            "    var keys = _keys(obj);\n" +
            "    for (var i = 0, length = keys.length; i < length; i++) {\n" +
            "      result[obj[keys[i]]] = keys[i];\n" +
            "    }\n" +
            "    return result;\n" +
            "  }\n" +
            "function _keys(obj) \n" +
            "  {\n" +
            "    if (!isObject(obj)) return [];\n" +
            "    if (Object.keys) return Object.keys(obj);\n" +
            "    var keys = [];\n" +
            "    for (var key in obj) if (_.has(obj, key)) keys.push(key);\n" +
            "    return keys;\n" +
            "  }\n" +
            "function isObject(obj) \n" +
            " {\n" +
            "    var type = typeof obj;\n" +
            "    return type === 'function' || type === 'object' && !!obj;\n" +
            "  }\n" +
            "console.log(invert_key_value({red: \"#FF0000\", green: \"#00FF00\", white: \"#FFFFFF\"}));\n";
    public static final String codes48 = "function hasKey(obj, key) {\n" +
            "    return obj != null && hasOwnProperty.call(obj, key);\n" +
            "  }\n" +
            "console.log(hasKey({red: \"#FF0000\", green: \"#00FF00\", white: \"#FFFFFF\"}, \"green\"));\n";
    public static final String codes49 = "function is_dom_element(obj) {\n" +
            "    return !!(obj && obj.nodeType === 1);\n" +
            "  }\n" +
            "console.log(is_dom_element(jQuery('body')[0]));\n";
    public static final String codes50 = "const extend_Hex = shortHex =>\n" +
            "  '#' +\n" +
            "  shortHex\n" +
            "    .slice(shortHex.startsWith('#') ? 1 : 0)\n" +
            "    .split('')\n" +
            "    .map(x => x + x)\n" +
            "    .join('');\n" +
            "\n" +
            "console.log(extend_Hex('#03f'));\n" +
            "console.log(extend_Hex('05a'));";
    public static final String codes51 = "const over = (...fns) => (...args) => fns.map(fn => fn.apply(null, args));\n" +
            "const minMax = over(Math.min, Math.max);\n" +
            "console.log(minMax(1, 2, 3, 4, 5)); \n" +
            "console.log(minMax(1, 2, 5, 4, 3)); \n" +
            "console.log(minMax(1, 2, 5, -4, 3));";
    public static final String codes52 = "const filter_Non_UniqueBy = (arr, fn) =>\n" +
            "  arr.filter((v, i) => arr.every((x, j) => (i === j) === fn(v, x, i, j)));\n" +
            "\n" +
            "console.log(filter_Non_UniqueBy(\n" +
            "  [\n" +
            "    { id: 0, value: 'a' },\n" +
            "    { id: 1, value: 'b' },\n" +
            "    { id: 2, value: 'c' },\n" +
            "    { id: 1, value: 'd' },\n" +
            "    { id: 0, value: 'e' }\n" +
            "  ],\n" +
            "  (a, b) => a.id == b.id\n" +
            ")); ";
    public static final String codes53 = "const time_taken = callback => {\n" +
            "  const result = callback();\n" +
            "  return result;\n" +
            "};\n" +
            "console.log(\"Time taken: \" + time_taken(() => Math.pow(2, 10))+\" ms\"); \n" +
            "console.log(\"Time taken: \" + time_taken(() => Math.sqrt(225))+\" ms\");\n" +
            "console.log(\"Time taken: \" + time_taken(() => Math.sqrt((5 * 5) + (6 * 6)))+\" ms\");\n";
    public static final String codes54 = "const omit = (obj, arr) =>\n" +
            "  Object.keys(obj)\n" +
            "    .filter(k => !arr.includes(k))\n" +
            "    .reduce((acc, key) => ((acc[key] = obj[key]), acc), {});\n" +
            "\n" +
            "console.log(omit({ a: 1, b: '2', c: 3 }, ['b']));\n" +
            "console.log(omit({ a: 1, b: 2, c: 3 }, ['c']));";
    public static final String codes55 = "const collectInto = fn => (...args) => fn(args);\n" +
            "const Pall = collectInto(Promise.all.bind(Promise));\n" +
            "let p1 = Promise.resolve(1);\n" +
            "let p2 = Promise.resolve(2);\n" +
            "let p3 = new Promise(resolve => setTimeout(resolve, 2000, 3));\n" +
            "Pall(p1, p2, p3).then(console.log); // [1, 2, 3] (after about 2 seconds)";
    public static final String codes56 = "const bifurcate = (arr, filter) =>\n" +
            "  arr.reduce((acc, val, i) => (acc[filter[i] ? 0 : 1].push(val), acc), [[], []]);\n" +
            "console.log(bifurcate(['beep', 'boop', 'foo', 'bar'], [true, true, false, true]));";
    public static final String codes57 = "const equals = (a, b) => {\n" +
            "  if (a === b) return true;\n" +
            "  if (a instanceof Date && b instanceof Date) return a.getTime() === b.getTime();\n" +
            "  if (!a || !b || (typeof a !== 'object' && typeof b !== 'object')) return a === b;\n" +
            "  if (a === null || a === undefined || b === null || b === undefined) return false;\n" +
            "  if (a.prototype !== b.prototype) return false;\n" +
            "  let keys = Object.keys(a);\n" +
            "  if (keys.length !== Object.keys(b).length) return false;\n" +
            "  return keys.every(k => equals(a[k], b[k]));\n" +
            "};\n" +
            "\n" +
            "console.log(equals({ a: [2, { e: 3 }], b: [4], c: 'foo' }, { a: [2, { e: 3 }], b: [4], c: 'foo' }));";
    public static final String codes58 = "const get = (from, ...selectors) =>\n" +
            "  [...selectors].map(s =>\n" +
            "    s\n" +
            "      .replace(/\\[([^\\[\\]]*)\\]/g, '.$1.')\n" +
            "      .split('.')\n" +
            "      .filter(t => t !== '')\n" +
            "      .reduce((prev, cur) => prev && prev[cur], from)\n" +
            "  );\n" +
            "const obj = { selector: { to: { val: 'val to select' } }, target: [1, 2, { a: 'test' }] };\n" +
            "\n" +
            "console.log(get(obj, 'selector.to.val', 'target[0]', 'target[2].a')); ";
    public static final String codes59 = "const averageBy = (arr, fn) =>\n" +
            "  arr.map(typeof fn === 'function' ? fn : val => val[fn]).reduce((acc, val) => acc + val, 0) /\n" +
            "  arr.length;\n" +
            "\n" +
            "console.log(averageBy([{ a: 40 }, { a: 20 }, { a: 80 }, { a: 60 }], o => o.a));\n" +
            "console.log(averageBy([{ a: 4 }, { a: 2 }, { a: 8 }, { a: 6 }], 'a'));";
    public static final String codes60 = "const deepClone = obj => {\n" +
            "  let clone = Object.assign({}, obj);\n" +
            "  Object.keys(clone).forEach(\n" +
            "    key => (clone[key] = typeof obj[key] === 'object' ? deepClone(obj[key]) : obj[key])\n" +
            "  );\n" +
            "  return Array.isArray(obj) ? (clone.length = obj.length) && Array.from(clone) : clone;\n" +
            "};\n" +
            "const a = { foo: 'bar', obj: { a: 1, b: 2 } };\n" +
            "const b = deepClone(a); // a !== b, a.obj !== b.obj\n" +
            "console.log(b)";
    public static final String codes61 = "const longestItem = (...vals) => [...vals].sort((a, b) => b.length - a.length)[0];\n" +
            "console.log(longestItem('this', 'is', 'a', 'testcase'));\n" +
            "console.log(longestItem(...['a', 'ab', 'abc']));\n" +
            "console.log(longestItem(...['a', 'ab', 'abc'], 'abcd'));\n" +
            "console.log(longestItem([1, 2, 3], [1, 2], [1, 2, 3, 4, 5]));\n" +
            "console.log(longestItem([1, 2, 3], 'foobar'));";
    public static final String codes62 = "const mapKeys = (obj, fn) =>\n" +
            "  Object.keys(obj).reduce((acc, k) => {\n" +
            "    acc[fn(obj[k], k, obj)] = obj[k];\n" +
            "    return acc;\n" +
            "  }, {});\n" +
            "console.log(mapKeys({ a: 1, b: 2 }, (val, key) => key + val));";
    public static final String codes63 = "const median = arr => {\n" +
            "  const mid = Math.floor(arr.length / 2),\n" +
            "    nums = [...arr].sort((a, b) => a - b);\n" +
            "  return arr.length % 2 !== 0 ? nums[mid] : (nums[mid - 1] + nums[mid]) / 2;\n" +
            "};\n" +
            "console.log(median([5, 6, 50, 1, -5]));\n" +
            "console.log(median([1, 2, 3, 4, 5]));";
    public static final String codes64 = "const negate = func => (...args) => !func(...args);\n" +
            "console.log([1, 2, 3, 4, 5, 6].filter(negate(n => n % 2 === 0)));";
    public static final String codes65 = "const nest = (items, id = null, link = 'parent_id') =>\n" +
            "  items\n" +
            "    .filter(item => item[link] === id)\n" +
            "    .map(item => ({ ...item, children: nest(items, item.id) }));\n" +
            "// One top level comment\n" +
            "const comments = [\n" +
            "  { id: 1, parent_id: null },\n" +
            "  { id: 2, parent_id: 1 },\n" +
            "  { id: 3, parent_id: 1 },\n" +
            "  { id: 4, parent_id: 2 },\n" +
            "  { id: 5, parent_id: 4 }\n" +
            "];\n" +
            "const nestedComments = nest(comments); \n" +
            "console.log(nestedComments);";
    public static final String codes66 = "const off = (el, evt, fn, opts = false) => el.removeEventListener(evt, fn, opts);\n" +
            "const fn = () => console.log('!');\n" +
            "document.body.addEventListener('click', fn);\n" +
            "console.log(off(document.body, 'click', fn)); ";
    public static final String codes67 = "const pickBy = (obj, fn) =>\n" +
            "  Object.keys(obj)\n" +
            "    .filter(k => fn(obj[k], k))\n" +
            "    .reduce((acc, key) => ((acc[key] = obj[key]), acc), {});\n" +
            "console.log(pickBy({ a: 1, b: '2', c: 3 }, x => typeof x === 'number'));";
    public static final String codes68 = "const unescapeHTML = str =>\n" +
            "  str.replace(\n" +
            "    /&|<|>|'|\"/g,\n" +
            "    tag =>\n" +
            "      ({\n" +
            "        '&': '&',\n" +
            "        '<': '<',\n" +
            "        '>': '>',\n" +
            "        ''': \"'\",\n" +
            "        '\"': '\"'\n" +
            "      }[tag] || tag)\n" +
            "  );\n" +
            "console.log(unescapeHTML('<a href=\"#\">Me & you</a>'));";
    public static final String codes69 = "const uncurry = (fn, n = 1) => (...args) => {\n" +
            "  const next = acc => args => args.reduce((x, y) => x(y), acc);\n" +
            "  if (n > args.length) throw new RangeError('Arguments too few!');\n" +
            "  return next(fn)(args.slice(0, n));\n" +
            "};\n" +
            "const add = x => y => z => x + y + z;\n" +
            "const uncurriedAdd = uncurry(add, 3);\n" +
            "console.log(uncurriedAdd(1, 2, 3));";
    public static final String codes70 = "const transform = (obj, fn, acc) => Object.keys(obj).reduce((a, k) => fn(a, obj[k], k, obj), acc);\n" +
            "console.log(transform(\n" +
            "  { a: 1, b: 2, c: 1 },\n" +
            "  (r, v, k) => {\n" +
            "    (r[v] || (r[v] = [])).push(k);\n" +
            "    return r;\n" +
            "  },\n" +
            "  {}\n" +
            "));";
    public static final String codes71 = "function js_style() \n" +
            "{\n" +
            "//font styles added by JS:\n" +
            " text.style.fontSize = \"14pt\";\n" +
            " text.style.fontFamily = \"Comic Sans MS\";\n" +
            " text.style.color = \"green\";\n" +
            "}\n";
    public static final String codes72 = "function getFormvalue()\n" +
            "{\n" +
            "  var x=document.getElementById(\"form1\");\n" +
            "  for (var i=0;i<x.length;i++)\n" +
            "  {\n" +
            "   if (x.elements[i].value!='Submit')\n" +
            "    {  \n" +
            "      console.log(x.elements[i].value);\n" +
            "     }  \n" +
            "   }\n" +
            "}\n";
    public static final String codes73 = "function set_background() {\n" +
            " docBody = document.getElementsByTagName(\"body\")[0];\n" +
            "  //Get all the p elements that are descendants of the body\n" +
            "  myBodyElements = docBody.getElementsByTagName(\"p\");\n" +
            "// get the first p elements\n" +
            "  myp1 = myBodyElements[0];\n" +
            "  myp1.style.background = \"rgb(255,0,0)\";\n" +
            "// get the second p elements\n" +
            "  myp2 = myBodyElements[1];\n" +
            "  myp2.style.background = \"rgb(255,255,0)\";\n" +
            "}\n";
    public static final String codes74 = "function getAttributes()\n" +
            "{\n" +
            " var u = document.getElementById(\"shr\").href;\n" +
            " alert('The value of the href attribute of the link is : '+u);\n" +
            " var v = document.getElementById(\"shr\").hreflang;   \n" +
            " alert('The value of the hreflang attribute of the link is : '+v);\n" +
            " var w = document.getElementById(\"shr\").rel; \n" +
            "  alert('The value of the rel attribute of the link is : '+w);\n" +
            " var x = document.getElementById(\"shr\").target; \n" +
            "  alert('The value of the taget attribute of the link is : '+x);\n" +
            " var y = document.getElementById(\"shr\").type; \n" +
            "  alert('The value of the type attribute of the link is : '+y);  \n" +
            "}\n";
    public static final String codes75 = "function insert_Row()\n" +
            "{\n" +
            "var x=document.getElementById('sampleTable').insertRow(0);\n" +
            "var y = x.insertCell(0);\n" +
            "var z = x.insertCell(1);\n" +
            "y.innerHTML=\"New Cell1\";\n" +
            "z.innerHTML=\"New Cell2\";\n" +
            "}\n";
    public static final String codes76 = "function changeContent()\n" +
            "{\n" +
            "rn = window.prompt(\"Input the Row number(0,1,2)\", \"0\");\n" +
            "cn = window.prompt(\"Input the Column number(0,1)\",\"0\");\n" +
            "content = window.prompt(\"Input the Cell content\");  \n" +
            "var x=document.getElementById('myTable').rows[parseInt(rn,10)].cells;\n" +
            "x[parseInt(cn,10)].innerHTML=content;\n" +
            "}\n";
    public static final String codes77 = "function createTable()\n" +
            "{\n" +
            "rn = window.prompt(\"Input number of rows\", 1);\n" +
            "cn = window.prompt(\"Input number of columns\",1);\n" +
            "  \n" +
            " for(var r=0;r<parseInt(rn,10);r++)\n" +
            "  {\n" +
            "   var x=document.getElementById('myTable').insertRow(r);\n" +
            "   for(var c=0;c<parseInt(cn,10);c++)  \n" +
            "    {\n" +
            "     var y=  x.insertCell(c);\n" +
            "     y.innerHTML=\"Row-\"+r+\" Column-\"+c; \n" +
            "    }\n" +
            "   }\n" +
            "}\n";
    public static final String codes78 = "function removecolor()\n" +
            "{\n" +
            "var x=document.getElementById(\"colorSelect\");\n" +
            "x.remove(x.selectedIndex);\n" +
            "}\n";
    public static final String codes79 = "function getOptions()\n" +
            "{\n" +
            "var x=document.getElementById(\"mySelect\");\n" +
            "var txt1 = \"No. of items : \";\n" +
            "var i;\n" +
            "l=document.getElementById(\"mySelect\").length;  \n" +
            "txt1 = txt1+l;\n" +
            "for (i=0;i<x.length;i++)\n" +
            "  {\n" +
            "    txt1 = txt1 + \"\\n\" + x.options[i].text;\n" +
            "  }\n" +
            "alert(txt1);\n" +
            "}\n";
    public static final String codes80 = "function volume_sphere()\n" +
            " {\n" +
            "  var volume;\n" +
            "  var radius = document.getElementById('radius').value;\n" +
            "  radius = Math.abs(radius);\n" +
            "  volume = (4/3) * Math.PI * Math.pow(radius, 3);\n" +
            "  volume = volume.toFixed(4);\n" +
            "  document.getElementById('volume').value = volume;\n" +
            "  return false;\n" +
            " } \n" +
            "window.onload = document.getElementById('MyForm').onsubmit = volume_sphere;\n";
    public static final String codes81 = "function display_random_image() \n" +
            "{\n" +
            "     var theImages = [{\n" +
            "        src: \"http://farm4.staticflickr.com/3691/11268502654_f28f05966c_m.jpg\",\n" +
            "        width: \"240\",\n" +
            "        height: \"160\"\n" +
            "    }, {\n" +
            "        src: \"http://farm1.staticflickr.com/33/45336904_1aef569b30_n.jpg\",\n" +
            "        width: \"320\",\n" +
            "        height: \"195\"\n" +
            "    }, {\n" +
            "        src: \"http://farm6.staticflickr.com/5211/5384592886_80a512e2c9.jpg\",\n" +
            "        width: \"500\",\n" +
            "        height: \"343\"\n" +
            "    }];\n" +
            "    \n" +
            "    var preBuffer = [];\n" +
            "    for (var i = 0, j = theImages.length; i < j; i++) {\n" +
            "        preBuffer[i] = new Image();\n" +
            "        preBuffer[i].src = theImages[i].src;\n" +
            "        preBuffer[i].width = theImages[i].width;\n" +
            "        preBuffer[i].height = theImages[i].height;\n" +
            "    }\n" +
            "   \n" +
            "// create random image number\n" +
            "  function getRandomInt(min,max) \n" +
            "    {\n" +
            "      //  return Math.floor(Math.random() * (max - min + 1)) + min;\n" +
            "    \n" +
            "imn = Math.floor(Math.random() * (max - min + 1)) + min;\n" +
            "    return preBuffer[imn];\n" +
            "    }  \n" +
            "\n" +
            "// 0 is first image,   preBuffer.length - 1) is  last image\n" +
            "  \n" +
            "var newImage = getRandomInt(0, preBuffer.length - 1);\n" +
            " \n" +
            "// remove the previous images\n" +
            "var images = document.getElementsByTagName('img');\n" +
            "var l = images.length;\n" +
            "for (var p = 0; p < l; p++) {\n" +
            "    images[0].parentNode.removeChild(images[0]);\n" +
            "}\n" +
            "// display the image  \n" +
            "document.body.appendChild(newImage);\n" +
            "}\n";
    public static final String codes82 = "//First create a list of all bold items \n" +
            "var bold_Items;\n" +
            "window.onload = getBold_items();\n" +
            " \n" +
            "// Collect all <strong> tags\n" +
            "function getBold_items() \n" +
            "{\n" +
            "  bold_Items = document.getElementsByTagName('strong'); \n" +
            "}\n" +
            "// iterate all bold tags and change color  \n" +
            "function highlight() \n" +
            "{\n" +
            "   for (var i=0; i<bold_Items.length; i++)\n" +
            "   {                                                    \n" +
            "    bold_Items[i].style.color = \"green\";\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "// On mouse out highlighted words become black\n" +
            "function return_normal()\n" +
            "{\n" +
            "  for (var i=0; i<bold_Items.length; i++) \n" +
            "  {\n" +
            "       bold_Items[i].style.color = \"black\";\n" +
            "  }\n" +
            "}\n";
    public static final String codes83 = "function getSize()\n" +
            "{\n" +
            "var w = document.documentElement.clientWidth;\n" +
            "var h = document.documentElement.clientHeight;\n" +
            "        \n" +
            "// put the result into a h1 tag\n" +
            " document.getElementById('wh').innerHTML = \"<h1>Width: \" + w + \" â€¢ Height: \" + h + \"</h1>\";\n" +
            "}\n";
    public static final String codes84 = "// Write a JavaScript function that checks whether a passed string is palindrome or not? \n" +
            "\n" +
            "function check_Palindrome(str_entry){\n" +
            "// Change the string into lower case and remove  all non-alphanumeric characters\n" +
            "   var cstr = str_entry.toLowerCase().replace(/[^a-zA-Z0-9]+/g,'');\n" +
            "\tvar ccount = 0;\n" +
            "// Check whether the string is empty or not\n" +
            "\tif(cstr===\"\") {\n" +
            "\t\tconsole.log(\"Nothing found!\");\n" +
            "\t\treturn false;\n" +
            "\t}\n" +
            "// Check if the length of the string is even or odd \n" +
            "\tif ((cstr.length) % 2 === 0) {\n" +
            "\t\tccount = (cstr.length) / 2;\n" +
            "\t} else {\n" +
            "// If the length of the string is 1 then it becomes a palindrome\n" +
            "\t\tif (cstr.length === 1) {\n" +
            "\t\t\tconsole.log(\"Entry is a palindrome.\");\n" +
            "\t\t\treturn true;\n" +
            "\t\t} else {\n" +
            "// If the length of the string is odd ignore middle character\n" +
            "\t\t\tccount = (cstr.length - 1) / 2;\n" +
            "\t\t}\n" +
            "\t}\n" +
            "// Loop through to check the first character to the last character and then move next\n" +
            "\tfor (var x = 0; x < ccount; x++) {\n" +
            "// Compare characters and drop them if they do not match \n" +
            "\t\tif (cstr[x] != cstr.slice(-1-x)[0]) {\n" +
            "\t\t\tconsole.log(\"Entry is not a palindrome.\");\n" +
            "\t\t\treturn false;\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\tconsole.log(\"The entry is a palindrome.\");\n" +
            "\treturn true;\n" +
            "}\n" +
            "check_Palindrome('madam');\n" +
            "check_Palindrome('nurses run');\n" +
            "check_Palindrome('fox');\n";
    public static final String codes85 = "//Write a JavaScript function that generates all combinations of a string.\n" +
            "function substrings(str1)\n" +
            "{\n" +
            "var array1 = [];\n" +
            "  for (var x = 0, y=1; x < str1.length; x++,y++) \n" +
            "  {\n" +
            "   array1[x]=str1.substring(x, y);\n" +
            "    }\n" +
            "var combi = [];\n" +
            "var temp= \"\";\n" +
            "var slent = Math.pow(2, array1.length);\n" +
            "\n" +
            "for (var i = 0; i < slent ; i++)\n" +
            "{\n" +
            "    temp= \"\";\n" +
            "    for (var j=0;j<array1.length;j++) {\n" +
            "        if ((i & Math.pow(2,j))){ \n" +
            "            temp += array1[j];\n" +
            "        }\n" +
            "    }\n" +
            "    if (temp !== \"\")\n" +
            "    {\n" +
            "        combi.push(temp);\n" +
            "    }\n" +
            "}\n" +
            "  console.log(combi.join(\"\\n\"));\n" +
            "}\n" +
            "\n" +
            "substrings(\"dog\");\n";
    public static final String codes86 = "function alphabet_order(str)\n" +
            "  {\n" +
            "return str.split('').sort().join('');\n" +
            "  }\n" +
            "console.log(alphabet_order(\"webmaster\"));\n";
    public static final String codes87 = "function test_prime(n)\n" +
            "{\n" +
            "\n" +
            "  if (n===1)\n" +
            "  {\n" +
            "    return false;\n" +
            "  }\n" +
            "  else if(n === 2)\n" +
            "  {\n" +
            "    return true;\n" +
            "  }else\n" +
            "  {\n" +
            "    for(var x = 2; x < n; x++)\n" +
            "    {\n" +
            "      if(n % x === 0)\n" +
            "      {\n" +
            "        return false;\n" +
            "      }\n" +
            "    }\n" +
            "    return true;  \n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "console.log(test_prime(37));\n";
    public static final String codes88 = "function array_binarySearch(narray, delement) {\n" +
            "   var mposition = Math.floor(narray.length / 2);\n" +
            "\n" +
            "   if (narray[mposition] === delement){\n" +
            "      return mposition;\n" +
            "   }\n" +
            "   else if (narray.length === 1) \n" +
            "   {\n" +
            "      return null;\n" +
            "   }\n" +
            "   else if (narray[mposition] < delement) {\n" +
            "      var arr = narray.slice(mposition + 1);\n" +
            "      var res = array_binarySearch(arr, delement);\n" +
            "      if (res === null)\n" +
            "      {\n" +
            "         return null;\n" +
            "      }\n" +
            "      else {\n" +
            "         return mposition + 1 + res;\n" +
            "      }\n" +
            "   }\n" +
            "   else {\n" +
            "      var arr1 = narray.slice(0, mposition);\n" +
            "      return array_binarySearch(arr1, delement);\n" +
            "   }\n" +
            "}\n" +
            "\n" +
            " var myArray = [1, 2, 3, 5, 6, 7, 10, 11, 14, 15, 17, 19, 20, 22, 23];\n" +
            " console.log(array_binarySearch(myArray, 6));\n" +
            " ";
    public static final String codes89 = "function bubble_Sort(a)\n" +
            "{\n" +
            "    var swapp;\n" +
            "    var n = a.length-1;\n" +
            "    var x=a;\n" +
            "    do {\n" +
            "        swapp = false;\n" +
            "        for (var i=0; i < n; i++)\n" +
            "        {\n" +
            "            if (x[i] < x[i+1])\n" +
            "            {\n" +
            "               var temp = x[i];\n" +
            "               x[i] = x[i+1];\n" +
            "               x[i+1] = temp;\n" +
            "               swapp = true;\n" +
            "            }\n" +
            "        }\n" +
            "        n--;\n" +
            "    } while (swapp);\n" +
            " return x; \n" +
            "}\n" +
            "\n" +
            "console.log(bubble_Sort([12, 345, 4, 546, 122, 84, 98, 64, 9, 1, 3223, 455, 23, 234, 213]));\n";
    public static final String codes90 = "function factorial(x) \n" +
            "{ \n" +
            "\n" +
            "  if (x === 0)\n" +
            " {\n" +
            "    return 1;\n" +
            " }\n" +
            "  return x * factorial(x-1);\n" +
            "         \n" +
            "}\n" +
            "console.log(factorial(5));\n";
    public static final String codes91 = "var fibonacci_series = function (n) \n" +
            "{\n" +
            "  if (n===1) \n" +
            "  {\n" +
            "    return [0, 1];\n" +
            "  } \n" +
            "  else \n" +
            "  {\n" +
            "    var s = fibonacci_series(n - 1);\n" +
            "    s.push(s[s.length - 1] + s[s.length - 2]);\n" +
            "    return s;\n" +
            "  }\n" +
            "};\n" +
            "\n" +
            " console.log(fibonacci_series(8));\n" +
            " ";
    public static final String codes92 = "Array.prototype.merge_Sort = function () {\n" +
            "  if (this.length <= 1) \n" +
            "  {\n" +
            "    return this;\n" +
            "  }\n" +
            "\n" +
            "  var half = parseInt(this.length / 2);\n" +
            "  var left = this.slice(0, half).merge_Sort();\n" +
            "  var right = this.slice(half,     this.length).merge_Sort();\n" +
            "  var merge = function (left, right) \n" +
            "  {\n" +
            "  var arry = [];\n" +
            "  while (left.length > 0 && right.length > 0)\n" +
            "  {\n" +
            "    arry.push((left[0] <= right[0]) ? left.shift() : right.shift());\n" +
            "  }\n" +
            "    return arry.concat(left).concat(right);\n" +
            "  };\n" +
            "\n" +
            "  return merge(left, right);\n" +
            "};\n" +
            "\n" +
            "var a = [34,7,23,32,5,62];\n" +
            "console.log(a.merge_Sort());\n";
    public static final String codes93 = "function bin_to_dec(bstr) { \n" +
            "    return parseInt((bstr + '')\n" +
            "    .replace(/[^01]/gi, ''), 2);\n" +
            "}\n" +
            "console.log(bin_to_dec('110011'));\n" +
            "console.log(bin_to_dec('100'));\n";
    public static final String codes94 = "function gcd_two_numbers(x, y) {\n" +
            "  if ((typeof x !== 'number') || (typeof y !== 'number')) \n" +
            "    return false;\n" +
            "  x = Math.abs(x);\n" +
            "  y = Math.abs(y);\n" +
            "  while(y) {\n" +
            "    var t = y;\n" +
            "    y = x % y;\n" +
            "    x = t;\n" +
            "  }\n" +
            "  return x;\n" +
            "}\n" +
            "\n" +
            "console.log(gcd_two_numbers(12, 13));\n" +
            "console.log(gcd_two_numbers(9, 3));\n";
    public static final String codes95 = "function pythagorean_theorem(x, y) {\n" +
            "  if ((typeof x !== 'number') || (typeof y !== 'number')) \n" +
            "return false; \n" +
            "\t\treturn Math.sqrt(x * x + y * y);\n" +
            "\t}\n" +
            "\n" +
            "console.log(pythagorean_theorem(2, 4));\n" +
            "console.log(pythagorean_theorem(3, 4));\n";
    public static final String codes96 = "function binomial(n, k) {\n" +
            "     if ((typeof n !== 'number') || (typeof k !== 'number')) \n" +
            "  return false; \n" +
            "    var coeff = 1;\n" +
            "    for (var x = n-k+1; x <= n; x++) coeff *= x;\n" +
            "    for (x = 1; x <= k; x++) coeff /= x;\n" +
            "    return coeff;\n" +
            "}\n" +
            "\n" +
            "console.log(binomial(8,3));\n" +
            "console.log(binomial(10,2));\n";
    public static final String codes97 = "function integer_to_roman(num) {\n" +
            "if (typeof num !== 'number') \n" +
            "return false; \n" +
            "\n" +
            "var digits = String(+num).split(\"\"),\n" +
            "key = [\"\",\"C\",\"CC\",\"CCC\",\"CD\",\"D\",\"DC\",\"DCC\",\"DCCC\",\"CM\",\n" +
            "\"\",\"X\",\"XX\",\"XXX\",\"XL\",\"L\",\"LX\",\"LXX\",\"LXXX\",\"XC\",\n" +
            "\"\",\"I\",\"II\",\"III\",\"IV\",\"V\",\"VI\",\"VII\",\"VIII\",\"IX\"],\n" +
            "roman_num = \"\",\n" +
            "i = 3;\n" +
            "while (i--)\n" +
            "roman_num = (key[+digits.pop() + (i * 10)] || \"\") + roman_num;\n" +
            "return Array(+digits.join(\"\") + 1).join(\"M\") + roman_num;\n" +
            "}\n" +
            "\n" +
            "console.log(integer_to_roman(27));\n";
    public static final String codes98 = "function create_UUID(){\n" +
            "    var dt = new Date().getTime();\n" +
            "    var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {\n" +
            "        var r = (dt + Math.random()*16)%16 | 0;\n" +
            "        dt = Math.floor(dt/16);\n" +
            "        return (c=='x' ? r :(r&0x3|0x8)).toString(16);\n" +
            "    });\n" +
            "    return uuid;\n" +
            "}\n" +
            "\n" +
            "console.log(create_UUID());\n";
    public static final String codes99 = "function product_Range(a,b) {\n" +
            "  var prd = a,i = a;\n" +
            " \n" +
            "  while (i++< b) {\n" +
            "    prd*=i;\n" +
            "  }\n" +
            "  return prd;\n" +
            "}\n" +
            "\n" +
            "\n" +
            "function combinations(n, r) \n" +
            "{\n" +
            "  if (n==r) \n" +
            "  {\n" +
            "    return 1;\n" +
            "  } \n" +
            "  else \n" +
            "  {\n" +
            "    r=(r < n-r) ? n-r : r;\n" +
            "    return product_Range(r+1, n)/product_Range(1,n-r);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "\n" +
            "console.log(combinations(6, 2));\n" +
            "console.log(combinations(5, 3));\n";
    public static final String codes100 = "function Hamming(n) {\n" +
            "        var succession = [1];\n" +
            "        var length = succession.length;\n" +
            "        var candidate = 2;\n" +
            "        while (length < n) {\n" +
            "            if (isHammingNumber(candidate)) {\n" +
            "                succession[length] = candidate;\n" +
            "                length++;\n" +
            "            }\n" +
            "            candidate++;\n" +
            "        }\n" +
            "        return succession;\n" +
            "  }\n" +
            " function isHammingNumber(num) {\n" +
            "        while (num % 5 === 0) num /= 5;\n" +
            "        while (num % 3 === 0) num /= 3;\n" +
            "        while (num % 2 === 0) num /= 2;\n" +
            "\n" +
            "        return num == 1;\n" +
            "    }\n" +
            "\n" +
            "console.log(Hamming(20));\n";
    public static final String codes101 = "function Lanczos_Gamma(num) \n" +
            "{\n" +
            "  var p = [\n" +
            "    0.99999999999980993, 676.5203681218851, -1259.1392167224028,\n" +
            "    771.32342877765313, -176.61502916214059, 12.507343278686905, -0.13857109526572012, 9.9843695780195716e-6, 1.5056327351493116e-7\n" +
            "  ];\n" +
            "  var i;\n" +
            "  var g = 7;\n" +
            "  if (num < 0.5) return Math.PI / (Math.sin(Math.PI * num) * calculus.LanczosGamma(1 - num));\n" +
            "  num -= 1;\n" +
            "  var a = p[0];\n" +
            "  var t = num + g + 0.5;\n" +
            "  for (i = 1; i < p.length; i++) {\n" +
            "    a += p[i] / (num + i);\n" +
            "  }\n" +
            "  return Math.sqrt(2 * Math.PI) * Math.pow(t, num + 0.5) * Math.exp(-t) * a;\n" +
            "}\n" +
            "console.log(Lanczos_Gamma(5));\n";
    public static final String codes102 = "var arr1=[3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];\n" +
            "var mf = 1;\n" +
            "var m = 0;\n" +
            "var item;\n" +
            "for (var i=0; i<arr1.length; i++)\n" +
            "{\n" +
            "        for (var j=i; j<arr1.length; j++)\n" +
            "        {\n" +
            "                if (arr1[i] == arr1[j])\n" +
            "                 m++;\n" +
            "                if (mf<m)\n" +
            "                {\n" +
            "                  mf=m; \n" +
            "                  item = arr1[i];\n" +
            "                }\n" +
            "        }\n" +
            "        m=0;\n" +
            "}\n" +
            "console.log(item+\" ( \" +mf +\" times ) \") ;\n";
    public static final String codes103 = "var flatten = function(a, shallow,r){\n" +
            "  if(!r){ r = []}\n" +
            "   \n" +
            "if (shallow) {\n" +
            "  return r.concat.apply(r,a);\n" +
            "  }\n" +
            "      \n" +
            "   for(var i=0; i<a.length; i++){\n" +
            "        if(a[i].constructor == Array){\n" +
            "            flatten(a[i],shallow,r);\n" +
            "        }else{\n" +
            "            r.push(a[i]);\n" +
            "        }\n" +
            "    }\n" +
            "    return r;\n" +
            "}\n" +
            "\n" +
            "console.log(flatten([1, [2], [3, [[4]]],[5,6]]));\n" +
            "\n" +
            "console.log(flatten([1, [2], [3, [[4]]],[5,6]], true));\n";
    public static final String codes104 = "var library = [ \n" +
            "   { author: 'Bill Gates', title: 'The Road Ahead', libraryID: 1254},\n" +
            "   { author: 'Steve Jobs', title: 'Walter Isaacson', libraryID: 4264},\n" +
            "   { author: 'Suzanne Collins', title: 'Mockingjay: The Final Book of The Hunger Games', libraryID: 3245}\n" +
            "   ];\n" +
            "\n" +
            "function compare_to_sort(x,y) \n" +
            " {\n" +
            "  if (x.title < y.title)\n" +
            "    return -1;\n" +
            "  if (x.title > y.title)\n" +
            "    return 1;\n" +
            "  return 0;\n" +
            " }\n" +
            "\n" +
            "console.log(library.sort(compare_to_sort));\n";
    public static final String codes105 = "//unzip\n" +
            "const unzip = arr =>\n" +
            "  arr.reduce(\n" +
            "    (acc, val) => (val.forEach((v, i) => acc[i].push(v)), acc),\n" +
            "    Array.from({\n" +
            "      length: Math.max(...arr.map(x => x.length))\n" +
            "    }).map(x => [])\n" +
            "  );\n" +
            "console.log(unzip([['a', 1, true], ['b', 2, false]]));\n" +
            "console.log(unzip([['a', 1, true], ['b', 2]]));";
    public static final String codes106 = "Date.shortDays = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];\n" +
            "\n" +
            "function short_Days(dt)\n" +
            "{ \n" +
            "   return Date.shortDays[dt.getDay()];\n" +
            "}\n" +
            "\n" +
            "dt = new Date();\n" +
            "console.log(short_Days(dt));\n" +
            "\n" +
            "dt = new Date(2015, 10, 1);\n" +
            "console.log(short_Days(dt));\n";
    public static final String codes107 = "function Unix_timestamp(t)\n" +
            "{\n" +
            "var dt = new Date(t*1000);\n" +
            "var hr = dt.getHours();\n" +
            "var m = \"0\" + dt.getMinutes();\n" +
            "var s = \"0\" + dt.getSeconds();\n" +
            "return hr+ ':' + m.substr(-2) + ':' + s.substr(-2);  \n" +
            "}\n" +
            "\n" +
            "console.log(Unix_timestamp(1412743274));\n";
    public static final String codes108 = "function quick_Sort(origArray) {\n" +
            "\tif (origArray.length <= 1) { \n" +
            "\t\treturn origArray;\n" +
            "\t} else {\n" +
            "\n" +
            "\t\tvar left = [];\n" +
            "\t\tvar right = [];\n" +
            "\t\tvar newArray = [];\n" +
            "\t\tvar pivot = origArray.pop();\n" +
            "\t\tvar length = origArray.length;\n" +
            "\n" +
            "\t\tfor (var i = 0; i < length; i++) {\n" +
            "\t\t\tif (origArray[i] <= pivot) {\n" +
            "\t\t\t\tleft.push(origArray[i]);\n" +
            "\t\t\t} else {\n" +
            "\t\t\t\tright.push(origArray[i]);\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\n" +
            "\t\treturn newArray.concat(quick_Sort(left), pivot, quick_Sort(right));\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "var myArray = [3, 0, 2, 5, -1, 4, 1 ];\n" +
            "\n" +
            "console.log(\"Original array: \" + myArray);\n" +
            "var sortedArray = quick_Sort(myArray);\n" +
            "console.log(\"Sorted array: \" + sortedArray);\n";
    public static final String codes109 = "function merge_sort(left_part,right_part) \n" +
            "{\n" +
            "\tvar i = 0;\n" +
            "\tvar j = 0;\n" +
            "\tvar results = [];\n" +
            "\n" +
            "\twhile (i < left_part.length || j < right_part.length) {\n" +
            "\t\tif (i === left_part.length) {\n" +
            "\t\t\t// j is the only index left_part\n" +
            "\t\t\tresults.push(right_part[j]);\n" +
            "\t\t\tj++;\n" +
            "\t\t} \n" +
            "      else if (j === right_part.length || left_part[i] <= right_part[j]) {\n" +
            "\t\t\tresults.push(left_part[i]);\n" +
            "\t\t\ti++;\n" +
            "\t\t} else {\n" +
            "\t\t\tresults.push(right_part[j]);\n" +
            "\t\t\tj++;\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\treturn results;\n" +
            "}\n" +
            "\n" +
            "console.log(merge_sort([1,3,4], [3,7,9]));\n";
    public static final String codes110 = "  var array_length;\n" +
            "/* to create MAX  array */  \n" +
            "function heap_root(input, i) {\n" +
            "    var left = 2 * i + 1;\n" +
            "    var right = 2 * i + 2;\n" +
            "    var max = i;\n" +
            "\n" +
            "    if (left < array_length && input[left] > input[max]) {\n" +
            "        max = left;\n" +
            "    }\n" +
            "\n" +
            "    if (right < array_length && input[right] > input[max])     {\n" +
            "        max = right;\n" +
            "    }\n" +
            "\n" +
            "    if (max != i) {\n" +
            "        swap(input, i, max);\n" +
            "        heap_root(input, max);\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "function swap(input, index_A, index_B) {\n" +
            "    var temp = input[index_A];\n" +
            "\n" +
            "    input[index_A] = input[index_B];\n" +
            "    input[index_B] = temp;\n" +
            "}\n" +
            "\n" +
            "function heapSort(input) {\n" +
            "    \n" +
            "    array_length = input.length;\n" +
            "\n" +
            "    for (var i = Math.floor(array_length / 2); i >= 0; i -= 1)      {\n" +
            "        heap_root(input, i);\n" +
            "      }\n" +
            "\n" +
            "    for (i = input.length - 1; i > 0; i--) {\n" +
            "        swap(input, 0, i);\n" +
            "        array_length--;\n" +
            "      \n" +
            "      \n" +
            "        heap_root(input, 0);\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "var arr = [3, 0, 2, 5, -1, 4, 1];\n" +
            "heapSort(arr);\n" +
            "console.log(arr);\n";
    public static final String codes111 = "const insertion_Sort = (nums) => {\n" +
            "  for (let i = 1; i < nums.length; i++) {\n" +
            "    let j = i - 1\n" +
            "    let temp = nums[i]\n" +
            "    while (j >= 0 && nums[j] > temp) {\n" +
            "      nums[j + 1] = nums[j]\n" +
            "      j--\n" +
            "    }\n" +
            "    nums[j+1] = temp\n" +
            "  }\n" +
            "  return nums\n" +
            "}\n" +
            "console.log(insertion_Sort([3, 0, 2, 5, -1, 4, 1]));\n" +
            "console.log(insertion_Sort([2,6,5,12,-1,3,8,7,1,-4,0,23,1,-55,20,37,54,210,-23,7,483,9339,29,-3,90,-2,81,54,7372,-92,93,93,18,-43,21]));\n";
    public static final String codes112 = "function flash_sort(arr) \n" +
            "  {\n" +
            "    var max = 0, min = arr[0];\n" +
            "    var n = arr.length;\n" +
            "    var m = ~~(0.45 * n);\n" +
            "    var l = new Array(m);\n" +
            " \n" +
            "    for (var i = 1; i < n; ++i) {\n" +
            "        if (arr[i] < min) {\n" +
            "            min = arr[i];\n" +
            "        }\n" +
            "        if (arr[i] > arr[max]) {\n" +
            "            max = i;\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "     if (min === arr[max]) {\n" +
            "        return arr;\n" +
            "    }\n" +
            " \n" +
            "    var c1 = (m - 1) / (arr[max] - min);\n" +
            " \n" +
            " \n" +
            "    for (var k = 0; k < m; k++) {\n" +
            "        l[k] = 0;\n" +
            "    }\n" +
            "    for (var j = 0; j < n; ++j) {\n" +
            "        k = ~~(c1 * (arr[j] - min));\n" +
            "        ++l[k];\n" +
            "    }\n" +
            " \n" +
            "    for (var p = 1; p < m; ++p) {\n" +
            "        l[p] = l[p] + l[p - 1];\n" +
            "    }\n" +
            " \n" +
            "    var hold = arr[max];\n" +
            "    arr[max] = arr[0];\n" +
            "    arr[0] = hold;\n" +
            " \n" +
            "    //permutation\n" +
            "    var move = 0, t, flash;\n" +
            "    j = 0; \n" +
            "    k = m - 1;\n" +
            "  \n" +
            "    while (move < (n - 1)) {\n" +
            "        while (j > (l[k] - 1)) {\n" +
            "            ++j;\n" +
            "            k = ~~(c1 * (arr[j] - min));\n" +
            "        }\n" +
            "        if (k < 0) break;\n" +
            "        flash = arr[j];\n" +
            "        while (j !== l[k]) {\n" +
            "            k = ~~(c1 * (flash - min));\n" +
            "            hold = arr[t = --l[k]];\n" +
            "            arr[t] = flash;\n" +
            "            flash = hold;\n" +
            "            ++move;\n" +
            "        }\n" +
            "    }\n" +
            " \n" +
            "    //insertion\n" +
            "    for (j = 1; j < n; j++) {\n" +
            "        hold = arr[j];\n" +
            "         i = j - 1;\n" +
            "        while (i >= 0 && arr[i] > hold) {\n" +
            "            arr[i + 1] = arr[i--];\n" +
            "        }\n" +
            "        arr[i + 1] = hold;\n" +
            "    }\n" +
            "    return arr;\n" +
            "}\n" +
            "var arra = [3, 0, 2, 5, -1, 4, 1]; \n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(flash_sort(arra, 0, 5));\n";
    public static final String codes113 = "function pancake_sort(arr) {\n" +
            "    for (var i = arr.length - 1; i >= 1; i--) {\n" +
            "        // find the index of the largest element not yet sorted\n" +
            "        var max_idx = 0;\n" +
            "        var max = arr[0];\n" +
            "        for (var j = 1; j <= i; j++) {\n" +
            "            if (arr[j] > max) {\n" +
            "                max = arr[j];\n" +
            "                max_idx = j;\n" +
            "            }\n" +
            "        }\n" +
            " \n" +
            "        if (max_idx == i) \n" +
            "            continue; // element already in place\n" +
            " \n" +
            "        var new_slice;\n" +
            " \n" +
            "        // flip arr max element to index 0\n" +
            "        if (max_idx > 0) {\n" +
            "            new_slice = arr.slice(0, max_idx+1).reverse();\n" +
            "            for ( j = 0; j <= max_idx; j++) \n" +
            "                arr[j] = new_slice[j];\n" +
            "        }\n" +
            " \n" +
            "        // then flip the max element to its place\n" +
            "        new_slice = arr.slice(0, i+1).reverse();\n" +
            "        for ( j = 0; j <= i; j++) \n" +
            "            arr[j] = new_slice[j];\n" +
            "    }\n" +
            "    return arr;\n" +
            "}\n" +
            "\n" +
            "var arra = [3, 0, 2, 5, -1, 4, 1]; \n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(pancake_sort(arra, 0, 5));\n";
    public static final String codes114 = "function shellSort(arr) {\n" +
            "    var increment = arr.length / 2;\n" +
            "    while (increment > 0) {\n" +
            "        for (i = increment; i < arr.length; i++) {\n" +
            "            var j = i;\n" +
            "            var temp = arr[i];\n" +
            "    \n" +
            "            while (j >= increment && arr[j-increment] > temp) {\n" +
            "                arr[j] = arr[j-increment];\n" +
            "                j = j - increment;\n" +
            "            }\n" +
            "    \n" +
            "            arr[j] = temp;\n" +
            "        }\n" +
            "    \n" +
            "        if (increment == 2) {\n" +
            "            increment = 1;\n" +
            "        } else {\n" +
            "            increment = parseInt(increment*5 / 11);\n" +
            "        }\n" +
            "    }\n" +
            "  return arr;\n" +
            "}\n" +
            "\n" +
            "console.log(shellSort([3, 0, 2, 5, -1, 4, 1]));\n";
    public static final String codes115 = "let nums = [4, 9, 0, 3, 1, 5];\n" +
            "console.log(\"Original array:\");\n" +
            "console.log(nums);\n" +
            "let is_Sorted = true;\n" +
            "while (is_Sorted){\n" +
            "   for (let i = 0; i< nums.length - 1; i++){\n" +
            "           if (nums[i] > nums[i + 1])\n" +
            "            {\n" +
            "               let temp = nums[i];\n" +
            "               nums[i] = nums[i + 1];\n" +
            "               nums[i+1] = temp;\n" +
            "               is_Sorted = true;\n" +
            "            }\n" +
            "   }\n" +
            "\n" +
            "   if (!is_Sorted)\n" +
            "       break;\n" +
            "\n" +
            "   is_Sorted = false;\n" +
            "\n" +
            "   for (let j = nums.length - 1; j > 0; j--){\n" +
            "           if (nums[j-1] > nums[j])\n" +
            "            {\n" +
            "               let temp = nums[j];\n" +
            "               nums[j] = nums[j - 1];\n" +
            "               nums[j - 1] = temp;\n" +
            "               is_Sorted = true;\n" +
            "            }\n" +
            "   }\n" +
            "}\n" +
            "console.log(\"Sorted array:\")\n" +
            "console.log(nums);\n";
    public static final String codes116 = "function combsort(arr)\n" +
            "{\n" +
            " function is_array_sorted(arr) {\n" +
            "      var sorted = true;\n" +
            "      for (var i = 0; i < arr.length - 1; i++) {\n" +
            "          if (arr[i] > arr[i + 1]) {\n" +
            "              sorted = false;\n" +
            "              break;\n" +
            "          }\n" +
            "      }\n" +
            "      return sorted;\n" +
            "  }\n" +
            " \n" +
            "  var iteration_count = 0;\n" +
            "  var gap = arr.length - 2;\n" +
            "  var decrease_factor = 1.25;\n" +
            " \n" +
            "  // Repeat iterations Until array is not sorted\n" +
            "  \n" +
            "  while (!is_array_sorted(arr)) \n" +
            "  {\n" +
            "      // If not first gap  Calculate gap\n" +
            "      if (iteration_count > 0)\n" +
            "         gap = (gap == 1) ? gap : Math.floor(gap / decrease_factor);\n" +
            " \n" +
            "  // Set front and back elements and increment to a gap\n" +
            "      var front = 0;\n" +
            "      var back = gap;\n" +
            "      while (back <= arr.length - 1) \n" +
            "      {\n" +
            "          // Swap the elements if they are not ordered\n" +
            "        \n" +
            "          if (arr[front] > arr[back])\n" +
            "          {\n" +
            "              var temp = arr[front];\n" +
            "              arr[front] = arr[back];\n" +
            "              arr[back] = temp;\n" +
            "          }\n" +
            " \n" +
            "          // Increment and re-run swapping\n" +
            "        \n" +
            "          front += 1;\n" +
            "          back += 1;\n" +
            "      }\n" +
            "      iteration_count += 1;\n" +
            "  }\n" +
            "  return arr;\n" +
            "}\n" +
            "  \n" +
            " var arra = [3, 0, 2, 5, -1, 4, 1]; \n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(combsort(arra));\n";
    public static final String codes117 = "function gnomeSort(arr) \n" +
            "{\n" +
            "    function moveBack(i) \n" +
            "  {\n" +
            "        for( ; i > 0 && arr[i-1] > arr[i]; i--)\n" +
            "        {\n" +
            "            var t = arr[i];\n" +
            "            arr[i] = arr[i-1];\n" +
            "            arr[i-1] = t;\n" +
            "        }\n" +
            "    }\n" +
            "    for (var i = 1; i < arr.length; i++) \n" +
            "    {\n" +
            "        if (arr[i-1] > arr[i]) moveBack(i);\n" +
            "    }\n" +
            "    return arr;\n" +
            "}\n" +
            "\n" +
            "var arra = [3, 0, 2, 5, -1, 4, 1]; \n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(gnomeSort(arra));\n";
    public static final String codes118 = "function countingSort(arr, min, max)\n" +
            "  {\n" +
            "    var i, z = 0, count = [];\n" +
            " \n" +
            "    for (i = min; i <= max; i++) {\n" +
            "        count[i] = 0;\n" +
            "    }\n" +
            " \n" +
            "    for (i=0; i < arr.length; i++) {\n" +
            "        count[arr[i]]++;\n" +
            "    }\n" +
            " \n" +
            "    for (i = min; i <= max; i++) {\n" +
            "        while (count[i]-- > 0) {\n" +
            "            arr[z++] = i;\n" +
            "        }\n" +
            "    }\n" +
            " return arr;\n" +
            "}\n" +
            "var arra = [3, 0, 2, 5, 4, 1]; \n" +
            "console.log(arra.length);\n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(countingSort(arra, 0, 5));\n";
    public static final String codes119 = "function Bogosort(arr){\n" +
            "    var isSorted = function(arr){\n" +
            "        for(var i = 1; i < arr.length; i++){\n" +
            "            if (arr[i-1] > arr[i]) {\n" +
            "                return false;\n" +
            "            }\n" +
            "        }\n" +
            "        return true;\n" +
            "    };\n" +
            "\n" +
            "    function shuffle(arr){\n" +
            "        var count = arr.length, temp, index;\n" +
            "\n" +
            "        while(count > 0){\n" +
            "            index = Math.floor(Math.random() * count);\n" +
            "            count--;\n" +
            "\n" +
            "            temp = arr[count];\n" +
            "            arr[count] = arr[index];\n" +
            "            arr[index] = temp;\n" +
            "        }\n" +
            "\n" +
            "        return arr;\n" +
            "    }\n" +
            "\n" +
            "   function sort(arr){\n" +
            "        var sorted = false;\n" +
            "        while(!sorted){\n" +
            "            arr = shuffle(arr);\n" +
            "            sorted = isSorted(arr);\n" +
            "        }\n" +
            "        return arr;\n" +
            "    }\n" +
            "\n" +
            "    return sort(arr);\n" +
            "}\n" +
            "\n" +
            "\n" +
            "var arra = [3, 0, 2, 5, -1, 4, 1]; \n" +
            "console.log(\"Original Array Elements\"); \n" +
            "console.log(arra); \n" +
            "console.log(\"Sorted Array Elements\"); \n" +
            "console.log(Bogosort(arra));\n";
    public static final String codes120 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\">\n" +
            "<title>JavaScript Ajax GET Demo</title>\n" +
            "<script>\n" +
            "function displayFullName() {\n" +
            "    // Creating the XMLHttpRequest object\n" +
            "    var request = new XMLHttpRequest();\n" +
            "\n" +
            "    // Instantiating the request object\n" +
            "    request.open(\"GET\", \"greet.php?fname=John&lname=Clark\");\n" +
            "\n" +
            "    // Defining event listener for readystatechange event\n" +
            "    request.onreadystatechange = function() {\n" +
            "        // Check if the request is compete and was successful\n" +
            "        if(this.readyState === 4 && this.status === 200) {\n" +
            "            // Inserting the response from server into an HTML element\n" +
            "            document.getElementById(\"result\").innerHTML = this.responseText;\n" +
            "        }\n" +
            "    };\n" +
            "\n" +
            "    // Sending the request to the server\n" +
            "    request.send();\n" +
            "}\n" +
            "</script>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <div id=\"result\">\n" +
            "        <p>Content of the result DIV box will be replaced by the server response</p>\n" +
            "    </div>\n" +
            "    <button type=\"button\" onclick=\"displayFullName()\">Display Full Name</button>\n" +
            "</body>\n" +
            "</html>";
    public static final String codes121 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\">\n" +
            "<title>JavaScript Ajax POST Demo</title>\n" +
            "<script>\n" +
            "function postComment() {\n" +
            "    // Creating the XMLHttpRequest object\n" +
            "    var request = new XMLHttpRequest();\n" +
            "    \n" +
            "    // Instantiating the request object\n" +
            "    request.open(\"POST\", \"confirmation.php\");\n" +
            "    \n" +
            "    // Defining event listener for readystatechange event\n" +
            "    request.onreadystatechange = function() {\n" +
            "        // Check if the request is compete and was successful\n" +
            "        if(this.readyState === 4 && this.status === 200) {\n" +
            "            // Inserting the response from server into an HTML element\n" +
            "            document.getElementById(\"result\").innerHTML = this.responseText;\n" +
            "        }\n" +
            "    };\n" +
            "    \n" +
            "    // Retrieving the form data\n" +
            "    var myForm = document.getElementById(\"myForm\");\n" +
            "    var formData = new FormData(myForm);\n" +
            "\n" +
            "    // Sending the request to the server\n" +
            "    request.send(formData);\n" +
            "}\n" +
            "</script>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <form id=\"myForm\">\n" +
            "        <label>Name:</label>\n" +
            "        <div><input type=\"text\" name=\"name\"></div>\n" +
            "        <br>\n" +
            "        <label>Comment:</label>\n" +
            "        <div><textarea name=\"comment\"></textarea></div>\n" +
            "        <p><button type=\"button\" onclick=\"postComment()\">Post Comment</button></p>\n" +
            "    </form>    \n" +
            "    <div id=\"result\">\n" +
            "        <p>Content of the result DIV box will be replaced by the server response</p>\n" +
            "    </div>    \n" +
            "</body>\n" +
            "</html>";
    public static final String codes122 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<p>The getAllResponseHeaders() function returns all the header information of a resource, like length, server-type, content-type, last-modified, etc:</p>\n" +
            "\n" +
            "<p id=\"demo\"></p>\n" +
            "\n" +
            "<script>\n" +
            "var xhttp = new XMLHttpRequest();\n" +
            "xhttp.onreadystatechange = function() {\n" +
            "  if (this.readyState == 4 && this.status == 200) {\n" +
            "    document.getElementById(\"demo\").innerHTML =\n" +
            "    this.getAllResponseHeaders();\n" +
            "  }\n" +
            "};\n" +
            "xhttp.open(\"GET\", \"ajax_info.txt\", true);\n" +
            "xhttp.send();\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes123 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<p>The getResponseHeader() function is used to return specific header information from a resource, like length, server-type, content-type, last-modified, etc:</p>\n" +
            "\n" +
            "<p>Last modified: <span id=\"demo\"></span></p>\n" +
            "\n" +
            "<script>\n" +
            "var xhttp=new XMLHttpRequest();\n" +
            "xhttp.onreadystatechange = function() {\n" +
            "  if (this.readyState == 4 && this.status == 200) {\n" +
            "    document.getElementById(\"demo\").innerHTML =\n" +
            "    this.getResponseHeader(\"Last-Modified\");\n" +
            "  }\n" +
            "};\n" +
            "xhttp.open(\"GET\", \"ajax_info.txt\", true);\n" +
            "xhttp.send();\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes124= "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<h2>Retrieve data from XML file</h2>\n" +
            "\n" +
            "<p><b>Status:</b> <span id=\"A1\"></span></p>\n" +
            "<p><b>Status text:</b> <span id=\"A2\"></span></p>\n" +
            "<p><b>Response:</b> <span id=\"A3\"></span></p>\n" +
            "\n" +
            "<button onclick=\"loadDoc('note.xml')\">Get XML data</button>\n" +
            "\n" +
            "<script>\n" +
            "function loadDoc(url) {\n" +
            "  var xhttp = new XMLHttpRequest();\n" +
            "  xhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      document.getElementById('A1').innerHTML = this.status;\n" +
            "      document.getElementById('A2').innerHTML = this.statusText;\n" +
            "      document.getElementById('A3').innerHTML = this.responseText;\n" +
            "    }\n" +
            "  };\n" +
            "  xhttp.open(\"GET\", url, true);\n" +
            "  xhttp.send();\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes125 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table,th,td {\n" +
            "  border : 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "}\n" +
            "th,td {\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "</style>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<button type=\"button\" onclick=\"loadDoc()\">Get my CD collection</button>\n" +
            "<br><br>\n" +
            "<table id=\"demo\"></table>\n" +
            "\n" +
            "<script>\n" +
            "function loadDoc() {\n" +
            "  var xhttp = new XMLHttpRequest();\n" +
            "  xhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      myFunction(this);\n" +
            "    }\n" +
            "  };\n" +
            "  xhttp.open(\"GET\", \"cd_catalog.xml\", true);\n" +
            "  xhttp.send();\n" +
            "}\n" +
            "function myFunction(xml) {\n" +
            "  var i;\n" +
            "  var xmlDoc = xml.responseXML;\n" +
            "  var table=\"<tr><th>Artist</th><th>Title</th></tr>\";\n" +
            "  var x = xmlDoc.getElementsByTagName(\"CD\");\n" +
            "  for (i = 0; i <x.length; i++) { \n" +
            "    table += \"<tr><td>\" +\n" +
            "    x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
            "    \"</td><td>\" +\n" +
            "    x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
            "    \"</td></tr>\";\n" +
            "  }\n" +
            "  document.getElementById(\"demo\").innerHTML = table;\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes126 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<h3>Start typing a name in the input field below:</h3>\n" +
            "\n" +
            "<form action=\"\"> \n" +
            "First name: <input type=\"text\" id=\"txt1\" onkeyup=\"showHint(this.value)\">\n" +
            "</form>\n" +
            "\n" +
            "<p>Suggestions: <span id=\"txtHint\"></span></p> \n" +
            "\n" +
            "<script>\n" +
            "function showHint(str) {\n" +
            "  var xhttp;\n" +
            "  if (str.length == 0) { \n" +
            "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
            "    return;\n" +
            "  }\n" +
            "  xhttp = new XMLHttpRequest();\n" +
            "  xhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
            "    }\n" +
            "  };\n" +
            "  xhttp.open(\"GET\", \"gethint.php?q=\"+str, true);\n" +
            "  xhttp.send();   \n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes127 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<h3>Start typing a name in the input field below:</h3>\n" +
            "\n" +
            "<form action=\"\"> \n" +
            "First name: <input type=\"text\" id=\"txt1\" onkeyup=\"showHint(this.value)\">\n" +
            "</form>\n" +
            "\n" +
            "<p>Suggestions: <span id=\"txtHint\"></span></p> \n" +
            "\n" +
            "<script>\n" +
            "function showHint(str) {\n" +
            "  var xhttp;\n" +
            "  if (str.length == 0) { \n" +
            "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
            "    return;\n" +
            "  }\n" +
            "  xhttp = new XMLHttpRequest();\n" +
            "  xhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
            "    }\n" +
            "  };\n" +
            "  xhttp.open(\"GET\", \"gethint.asp?q=\"+str, true);\n" +
            "  xhttp.send();\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes128 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table,th,td {\n" +
            "  border : 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "}\n" +
            "th,td {\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "</style>\n" +
            "<body>\n" +
            "\n" +
            "<h1>The XMLHttpRequest Object</h1>\n" +
            "\n" +
            "<form action=\"\"> \n" +
            "<select name=\"customers\" onchange=\"showCustomer(this.value)\">\n" +
            "<option value=\"\">Select a customer:</option>\n" +
            "<option value=\"ALFKI\">Alfreds Futterkiste</option>\n" +
            "<option value=\"NORTS \">North/South</option>\n" +
            "<option value=\"WOLZA\">Wolski Zajazd</option>\n" +
            "</select>\n" +
            "</form>\n" +
            "<br>\n" +
            "<div id=\"txtHint\">Customer info will be listed here...</div>\n" +
            "\n" +
            "<script>\n" +
            "function showCustomer(str) {\n" +
            "  var xhttp;    \n" +
            "  if (str == \"\") {\n" +
            "    document.getElementById(\"txtHint\").innerHTML = \"\";\n" +
            "    return;\n" +
            "  }\n" +
            "  xhttp = new XMLHttpRequest();\n" +
            "  xhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n" +
            "    }\n" +
            "  };\n" +
            "  xhttp.open(\"GET\", \"getcustomer.php?q=\"+str, true);\n" +
            "  xhttp.send();\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes129 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table,th,td {\n" +
            "  border : 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "}\n" +
            "th,td {\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "</style>\n" +
            "<body>\n" +
            "\n" +
            "<button type=\"button\" onclick=\"loadXMLDoc()\">Get my CD collection</button>\n" +
            "<br><br>\n" +
            "<table id=\"demo\"></table>\n" +
            "\n" +
            "<script>\n" +
            "function loadXMLDoc() {\n" +
            "  var xmlhttp = new XMLHttpRequest();\n" +
            "  xmlhttp.onreadystatechange = function() {\n" +
            "    if (this.readyState == 4 && this.status == 200) {\n" +
            "      myFunction(this);\n" +
            "    }\n" +
            "  };\n" +
            "  xmlhttp.open(\"GET\", \"cd_catalog.xml\", true);\n" +
            "  xmlhttp.send();\n" +
            "}\n" +
            "function myFunction(xml) {\n" +
            "  var i;\n" +
            "  var xmlDoc = xml.responseXML;\n" +
            "  var table=\"<tr><th>Artist</th><th>Title</th></tr>\";\n" +
            "  var x = xmlDoc.getElementsByTagName(\"CD\");\n" +
            "  for (i = 0; i <x.length; i++) { \n" +
            "    table += \"<tr><td>\" +\n" +
            "    x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
            "    \"</td><td>\" +\n" +
            "    x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
            "    \"</td></tr>\";\n" +
            "  }\n" +
            "  document.getElementById(\"demo\").innerHTML = table;\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes130 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<div id='showCD'></div>\n" +
            "\n" +
            "<script>\n" +
            "displayCD(0);\n" +
            "\n" +
            "function displayCD(i) {\n" +
            "    var xmlhttp = new XMLHttpRequest();\n" +
            "    xmlhttp.onreadystatechange = function() {\n" +
            "        if (this.readyState == 4 && this.status == 200) {\n" +
            "            myFunction(this, i);\n" +
            "        }\n" +
            "    };\n" +
            "    xmlhttp.open(\"GET\", \"cd_catalog.xml\", true);\n" +
            "    xmlhttp.send();\n" +
            "}\n" +
            "\n" +
            "function myFunction(xml, i) {\n" +
            "    var xmlDoc = xml.responseXML; \n" +
            "    x = xmlDoc.getElementsByTagName(\"CD\");\n" +
            "    document.getElementById(\"showCD\").innerHTML =\n" +
            "    \"Artist: \" +\n" +
            "    x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
            "    \"<br>Title: \" +\n" +
            "    x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
            "    \"<br>Year: \" + \n" +
            "    x[i].getElementsByTagName(\"YEAR\")[0].childNodes[0].nodeValue;\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes131 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "\n" +
            "<div id='showCD'></div><br>\n" +
            "<input type=\"button\" onclick=\"previous()\" value=\"<<\">\n" +
            "<input type=\"button\" onclick=\"next()\" value=\">>\">\n" +
            "\n" +
            "<script>\n" +
            "var i = 0;\n" +
            "var x;\n" +
            "displayCD(i);\n" +
            "\n" +
            "function displayCD(i) {\n" +
            "    var xmlhttp = new XMLHttpRequest();\n" +
            "    xmlhttp.onreadystatechange = function() {\n" +
            "        if (this.readyState == 4 && this.status == 200) {\n" +
            "            myFunction(this, i);\n" +
            "        }\n" +
            "    };\n" +
            "    xmlhttp.open(\"GET\", \"cd_catalog.xml\", true);\n" +
            "    xmlhttp.send();\n" +
            "}\n" +
            "\n" +
            "function myFunction(xml, i) {\n" +
            "    var xmlDoc = xml.responseXML; \n" +
            "    x = xmlDoc.getElementsByTagName(\"CD\");\n" +
            "    document.getElementById(\"showCD\").innerHTML =\n" +
            "    \"Artist: \" +\n" +
            "    x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
            "    \"<br>Title: \" +\n" +
            "    x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
            "    \"<br>Year: \" + \n" +
            "    x[i].getElementsByTagName(\"YEAR\")[0].childNodes[0].nodeValue;\n" +
            "}\n" +
            "\n" +
            "function next() {\n" +
            "if (i < x.length-1) {\n" +
            "  i++;\n" +
            "  displayCD(i);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "function previous() {\n" +
            "if (i > 0) {\n" +
            "  i--;\n" +
            "  displayCD(i);\n" +
            "  }\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes132 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table,th,td {\n" +
            "  border : 1px solid black;\n" +
            "  border-collapse: collapse;\n" +
            "}\n" +
            "th,td {\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "</style>\n" +
            "<body>\n" +
            "\n" +
            "<p>Click on a CD to display album information.</p>\n" +
            "<p id='showCD'></p>\n" +
            "<table id=\"demo\"></table>\n" +
            "\n" +
            "<script>\n" +
            "var x,xmlhttp,xmlDoc\n" +
            "xmlhttp = new XMLHttpRequest();\n" +
            "xmlhttp.open(\"GET\", \"cd_catalog.xml\", false);\n" +
            "xmlhttp.send();\n" +
            "xmlDoc = xmlhttp.responseXML; \n" +
            "x = xmlDoc.getElementsByTagName(\"CD\");\n" +
            "table=\"<tr><th>Artist</th><th>Title</th></tr>\";\n" +
            "for (i = 0; i <x.length; i++) { \n" +
            "  table += \"<tr onclick='displayCD(\" + i + \")'><td>\";\n" +
            "  table += x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue;\n" +
            "  table += \"</td><td>\";\n" +
            "  table +=  x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue;\n" +
            "  table += \"</td></tr>\";\n" +
            "}\n" +
            "document.getElementById(\"demo\").innerHTML = table;\n" +
            "\n" +
            "function displayCD(i) {\n" +
            "  document.getElementById(\"showCD\").innerHTML =\n" +
            "  \"Artist: \" +\n" +
            "  x[i].getElementsByTagName(\"ARTIST\")[0].childNodes[0].nodeValue +\n" +
            "  \"<br>Title: \" +\n" +
            "  x[i].getElementsByTagName(\"TITLE\")[0].childNodes[0].nodeValue +\n" +
            "  \"<br>Year: \" + \n" +
            "  x[i].getElementsByTagName(\"YEAR\")[0].childNodes[0].nodeValue;\n" +
            "}\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes133 = "let years: Array<number> = [ 2016, 2017, 2018, 2019,2020,2021,2022]; \n" +
            "for (let i=0;i<=years.length; i++) {\n" +
            "     console.log(years[i]);\n" +
            "}";
    public static final String codes134 = "let years: Array<number> = [ 2016, 2017, 2018, 2019,2020,2021,2022]; \n" +
            "for (let i in years) {\n" +
            "     console.log(years[i])\n" +
            "}";
    public static final String codes135 = "let years: Array<number> = [ 2016, 2017, 2018, 2019,2020,2021,2022]; \n" +
            "for (let  i of years) {\n" +
            "     console.log(i)\n" +
            "}";
    public static final String codes136 = "let years: Array<number> = [ 2016, 2017, 2018, 2019,2020,2021,2022]; \n" +
            "years.forEach(function(yrs, i) {\n" +
            "  console.log(yrs);\n" +
            "});";
    public static final String codes137 = "let months: Array<string> = [\"Jan\", \"Feb\", \"March\", \"April\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]; //array with all string values.\n" +
            "\n" +
            "console.log(months.length);";
    public static final String codes138 = "let months: Array<string> = [\"Jan\", \"Feb\", \"March\", \"April\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]; //array with all string values.\n" +
            "\n" +
            "console.log(months.reverse());";
    public static final String codes139 = "let months: Array<string> = [\"Jan\", \"Feb\", \"March\", \"April\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]; //array with all string values.\n" +
            "\n" +
            "console.log(months.sort());";
    public static final String codes140 = "let months: Array<string> = [\"Jan\", \"Feb\", \"March\", \"April\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]; //array with all string values.\t\t\t\t\n" +
            "\n" +
            "console.log(months.pop());";
    public static final String codes141 = "let months: Array<string> = [\"Jan\", \"Feb\", \"March\", \"April\", \"May\", \"June\", \"July\", \"Aug\", \"Sept\", \"Oct\", \"Nov\", \"Dec\"]; //array with all string values.\t\t\t\n" +
            "\n" +
            "console.log(months.shift());";
    public static final String codes142 = "let years: Array<number> = [2015,2016,2017,2018,2019,2020,2021]; //array will all numbers\t\t\t\n" +
            "console.log(years.push(2022)); \t\t\t\n" +
            "years.forEach(function(yrs, i) {\t\t\t\n" +
            "  console.log(yrs);\n" +
            "});";
    public static final String codes143 = "class Students {\n" +
            "    age : number;\n" +
            "    name : string;\n" +
            "    roll_no : number;\n" +
            "    \n" +
            "    constructor(age: number, name:string, roll_no: number) {\n" +
            "        this.age = age;\n" +
            "        this.name = name;\n" +
            "        this.roll_no = roll_no;\n" +
            "    }\n" +
            "\n" +
            "    getRollNo(): number {\n" +
            "        return this.roll_no;\n" +
            "    }\n" +
            "\n" +
            "    getName() : string {\n" +
            "        return this.name;\n" +
            "    }\n" +
            "\n" +
            "    getAge() : number {\n" +
            "        return this.age;\n" +
            "    }\n" +
            "}";
    public static final String codes144 = "class Person {\n" +
            "    name: string;\n" +
            "    age: number;\n" +
            "\n" +
            "    constructor(name: string, age: number) {\n" +
            "        this.name = name;\n" +
            "        this.age = age;\n" +
            "    }\n" +
            "\n" +
            "    getName(): string {\n" +
            "        return this.name;\n" +
            "    }\n" +
            "\n" +
            "    getAge(): number {\n" +
            "        return this.age;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Student extends Person {\n" +
            "    tmarks: number;\n" +
            "    getMarks(): number {\n" +
            "        return this.tmarks;\n" +
            "    }\n" +
            "\n" +
            "    setMarks(tmarks) {\n" +
            "        this.tmarks = tmarks;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "let _std1 = new Student('Sheena', 21);\n" +
            "_std1.getAge();\n" +
            "_std1.setMarks(500);\n" +
            "_std1.getMarks();";
    public static final String codes145 = "class Person {\n" +
            "    protected name: string;\n" +
            "    protected age: number;\n" +
            "\n" +
            "    constructor(name: string, age: number) {\n" +
            "        this.name = name;\n" +
            "        this.age = age;\n" +
            "    }\n" +
            "\n" +
            "    private getName(): string {\n" +
            "        return this.name;\n" +
            "    }\n" +
            "\n" +
            "    getDetails(): string {\n" +
            "        return \"Name is \"+ this.getName();\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Student extends Person {\n" +
            "    tmarks: number;\n" +
            "    constructor(name: string, age: number, tmarks: number) {\n" +
            "        super(name, age);  \n" +
            "        this.tmarks = tmarks;    \n" +
            "    }\n" +
            "    getMarks(): number {\n" +
            "        return this.tmarks;\n" +
            "    }\n" +
            "\n" +
            "    getFullName(): string {\n" +
            "        return this.name;\n" +
            "    }\n" +
            "    \n" +
            "    setMarks(tmarks) {\n" +
            "        this.tmarks = tmarks;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "let _std1 = new Student('Anne', 21, 500);\n" +
            "_std1.getMarks();\n" +
            "_std1.getFullName();\n" +
            "_std1.getDetails();";
    public static final String codes146 = "interface Dimension {\n" +
            "    width: string;\n" +
            "    height: string;\n" +
            "}\n" +
            "\n" +
            "function getDimension(dim: Dimension) : string {\n" +
            "    let finaldim  = dim.width +\"-\"+ dim.height;\n" +
            "    return finaldim;\n" +
            "}\n" +
            "\n" +
            "getDimension({width:\"300px\", height:\"250px\"});";
    public static final String codes147 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<p>Try to change the names.</p>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"myCtrl\">\n" +
            "\n" +
            "First Name: <input type=\"text\" ng-model=\"firstName\"><br>\n" +
            "Last Name: <input type=\"text\" ng-model=\"lastName\"><br>\n" +
            "<br>\n" +
            "Full Name: {{firstName + \" \" + lastName}}\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('myCtrl', function($scope) {\n" +
            "    $scope.firstName= \"Anne\";\n" +
            "    $scope.lastName= \"Moore\";\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes148 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"personCtrl\">\n" +
            "\n" +
            "First Name: <input type=\"text\" ng-model=\"person.firstName\"><br>\n" +
            "Last Name: <input type=\"text\" ng-model=\"person.lastName\"><br>\n" +
            "<br>\n" +
            "Full Name: {{fullName()}}\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller(\"personCtrl\",function($scope) {\n" +
            "    $scope.person = {\n" +
            "        firstName: \"Anne\",\n" +
            "        lastName: \"Moore\",\n" +
            "    };\n" +
            "    $scope.fullName = function() {\n" +
            "        var x = $scope.person;\n" +
            "        return x.firstName + \" \" + x.lastName;\n" +
            "    };\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes149 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"myCtrl\">\n" +
            "\n" +
            "<ul>\n" +
            "  <li ng-repeat=\"x in names\">{{x}}</li>\n" +
            "</ul>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "\n" +
            "app.controller('myCtrl', function($scope) {\n" +
            "    $scope.names = [\"Emil\", \"Tobias\", \"Linus\"];\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "<p>The variable \"x\" has a different value for each repetition, proving that each repetition has its own scope.</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes150 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body ng-app=\"myApp\">\n" +
            "\n" +
            "<p>The rootScope's favorite color:</p>\n" +
            "<h1>{{color}}</h1>\n" +
            "\n" +
            "<div ng-controller=\"myCtrl\">\n" +
            "\n" +
            "<p>The scope of the controller's favorite color:</p>\n" +
            "<h1>{{color}}</h1>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<p>The rootScope's favorite color is still:</p>\n" +
            "<h1>{{color}}</h1>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.run(function($rootScope) {\n" +
            "    $rootScope.color = 'blue';\n" +
            "});\n" +
            "app.controller('myCtrl', function($scope) {\n" +
            "    $scope.color = \"red\";\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "<p>Notice that controller's color variable does not overwrite the rootScope's color value.</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes151 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"namesCtrl\">\n" +
            "\n" +
            "<p>Looping with objects:</p>\n" +
            "<ul>\n" +
            "  <li ng-repeat=\"x in names | orderBy:'country'\">\n" +
            "    {{ x.name + ', ' + x.country }}\n" +
            "  </li>\n" +
            "</ul>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "angular.module('myApp', []).controller('namesCtrl', function($scope) {\n" +
            "    $scope.names = [\n" +
            "        {name:'Jani',country:'Norway'},\n" +
            "        {name:'Carl',country:'Sweden'},\n" +
            "        {name:'Margareth',country:'England'},\n" +
            "        {name:'Hege',country:'Norway'},\n" +
            "        {name:'Joe',country:'Denmark'},\n" +
            "        {name:'Gustav',country:'Sweden'},\n" +
            "        {name:'Birgit',country:'Denmark'},\n" +
            "        {name:'Mary',country:'England'},\n" +
            "        {name:'Kai',country:'Norway'}\n" +
            "        ];\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes152 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"namesCtrl\">\n" +
            "\n" +
            "<p>Type a letter in the input field:</p>\n" +
            "\n" +
            "<p><input type=\"text\" ng-model=\"test\"></p>\n" +
            "\n" +
            "<ul>\n" +
            "  <li ng-repeat=\"x in names | filter:test\">\n" +
            "    {{ x }}\n" +
            "  </li>\n" +
            "</ul>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "angular.module('myApp', []).controller('namesCtrl', function($scope) {\n" +
            "    $scope.names = [\n" +
            "        'Jani',\n" +
            "        'Carl',\n" +
            "        'Margareth',\n" +
            "        'Hege',\n" +
            "        'Joe',\n" +
            "        'Gustav',\n" +
            "        'Birgit',\n" +
            "        'Mary',\n" +
            "        'Kai'\n" +
            "    ];\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "<p>The list will only consists of names matching the filter.</p>\n" +
            "\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    public static final String codes153 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"customersCtrl\"> \n" +
            "\n" +
            "<ul>\n" +
            "  <li ng-repeat=\"x in myData\">\n" +
            "    {{ x.Name + ', ' + x.Country }}\n" +
            "  </li>\n" +
            "</ul>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('customersCtrl', function($scope, $http) {\n" +
            "  $http.get(\"customers.php\").then(function (response) {\n" +
            "      $scope.myData = response.data.records;\n" +
            "  });\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes154 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table, th , td  {\n" +
            "  border: 1px solid grey;\n" +
            "  border-collapse: collapse;\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "table tr:nth-child(odd) {\n" +
            "  background-color: #f1f1f1;\n" +
            "}\n" +
            "table tr:nth-child(even) {\n" +
            "  background-color: #ffffff;\n" +
            "}\n" +
            "</style>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"customersCtrl\"> \n" +
            "\n" +
            "<table>\n" +
            "  <tr ng-repeat=\"x in names\">\n" +
            "    <td>{{ x.Name }}</td>\n" +
            "    <td>{{ x.Country }}</td>\n" +
            "  </tr>\n" +
            "</table>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('customersCtrl', function($scope, $http) {\n" +
            "    $http.get(\"customers.php\")\n" +
            "    .then(function (response) {$scope.names = response.data.records;});\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes155 = "<!DOCTYPE html>\n" +
            "<html >\n" +
            "<style>\n" +
            "table, th , td  {\n" +
            "  border: 1px solid grey;\n" +
            "  border-collapse: collapse;\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "table tr:nth-child(odd) {\n" +
            "  background-color: #f1f1f1;\n" +
            "}\n" +
            "table tr:nth-child(even) {\n" +
            "  background-color: #ffffff;\n" +
            "}\n" +
            "</style>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            " \n" +
            "<div ng-app=\"myApp\" ng-controller=\"customersCtrl\">\n" +
            " \n" +
            "<table>\n" +
            "  <tr ng-repeat=\"x in names\">\n" +
            "    <td>{{ x.Name }}</td>\n" +
            "    <td>{{ x.Country }}</td>\n" +
            "  </tr>\n" +
            "</table>\n" +
            " \n" +
            "</div>\n" +
            " \n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('customersCtrl', function($scope, $http) {\n" +
            "   $http.get(\"customers_mysql.php\")\n" +
            "   .then(function (response) {$scope.names = response.data.records;});\n" +
            "});\n" +
            "</script>\n" +
            " \n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes156 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "table, th, td {\n" +
            "  border: 1px solid grey;\n" +
            "  border-collapse: collapse;\n" +
            "  padding: 5px;\n" +
            "}\n" +
            "table tr:nth-child(odd) {\n" +
            "  background-color: #f1f1f1;\n" +
            "}\n" +
            "table tr:nth-child(even) {\n" +
            "  background-color: #ffffff;\n" +
            "}\n" +
            "</style>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"customersCtrl\">\n" +
            "\n" +
            "<table>\n" +
            "  <tr ng-repeat=\"x in names\">\n" +
            "    <td>{{ x.Name }}</td>\n" +
            "    <td>{{ x.Country }}</td>\n" +
            "  </tr>\n" +
            "</table>\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('customersCtrl', function($scope, $http) {\n" +
            "    $http.get(\"customers_sql.aspx\")\n" +
            "    .then(function (response) {$scope.names = response.data.records;});\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes157 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"formCtrl\">\n" +
            "  <form novalidate>\n" +
            "    First Name:<br>\n" +
            "    <input type=\"text\" ng-model=\"user.firstName\"><br>\n" +
            "    Last Name:<br>\n" +
            "    <input type=\"text\" ng-model=\"user.lastName\">\n" +
            "    <br><br>\n" +
            "    <button ng-click=\"reset()\">RESET</button>\n" +
            "  </form>\n" +
            "  <p>form = {{user}}</p>\n" +
            "  <p>master = {{master}}</p>\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('formCtrl', function($scope) {\n" +
            "    $scope.master = {firstName:\"John\", lastName:\"Doe\"};\n" +
            "    $scope.reset = function() {\n" +
            "        $scope.user = angular.copy($scope.master);\n" +
            "    };\n" +
            "    $scope.reset();\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes158 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>  \n" +
            "<body>\n" +
            "\n" +
            "<h2>Validation Example</h2>\n" +
            "\n" +
            "<form ng-app=\"myApp\" ng-controller=\"validateCtrl\" \n" +
            "name=\"myForm\" novalidate>\n" +
            "\n" +
            "<p>Username:<br>\n" +
            "<input type=\"text\" name=\"user\" ng-model=\"user\" required>\n" +
            "<span style=\"color:red\" ng-show=\"myForm.user.$dirty && myForm.user.$invalid\">\n" +
            "<span ng-show=\"myForm.user.$error.required\">Username is required.</span>\n" +
            "</span>\n" +
            "</p>\n" +
            "\n" +
            "<p>Email:<br>\n" +
            "<input type=\"email\" name=\"email\" ng-model=\"email\" required>\n" +
            "<span style=\"color:red\" ng-show=\"myForm.email.$dirty && myForm.email.$invalid\">\n" +
            "<span ng-show=\"myForm.email.$error.required\">Email is required.</span>\n" +
            "<span ng-show=\"myForm.email.$error.email\">Invalid email address.</span>\n" +
            "</span>\n" +
            "</p>\n" +
            "\n" +
            "<p>\n" +
            "<input type=\"submit\"\n" +
            "ng-disabled=\"myForm.user.$dirty && myForm.user.$invalid ||  \n" +
            "myForm.email.$dirty && myForm.email.$invalid\">\n" +
            "</p>\n" +
            "\n" +
            "</form>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('validateCtrl', function($scope) {\n" +
            "    $scope.user = 'John Doe';\n" +
            "    $scope.email = 'john.doe@gmail.com';\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes159 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"myCtrl\">\n" +
            "<p>{{ x1 }}</p>\n" +
            "<p>{{ x2 }}</p>\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('myCtrl', function($scope) {\n" +
            "    $scope.x1 = \"JOHN\";\n" +
            "    $scope.x2 = angular.isString($scope.x1);\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes160 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "<div ng-app=\"myApp\" ng-controller=\"myCtrl\">\n" +
            "<p>{{ x1 }}</p>\n" +
            "<p>{{ x2 }}</p>\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []);\n" +
            "app.controller('myCtrl', function($scope) {\n" +
            "    $scope.x1 = \"JOHN\";\n" +
            "    $scope.x2 = angular.isNumber($scope.x1);\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes161 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "div {\n" +
            "  transition: all linear 0.5s;\n" +
            "  background-color: lightblue;\n" +
            "  height: 100px;\n" +
            "  width: 100%;\n" +
            "  position: relative;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "}\n" +
            "\n" +
            ".ng-hide {\n" +
            "  height: 0;\n" +
            "  width: 0;\n" +
            "  background-color: transparent;\n" +
            "  top:-200px;\n" +
            "  left: 200px;\n" +
            "}\n" +
            "\n" +
            "</style>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-animate.js\"></script>\n" +
            "\n" +
            "<body ng-app=\"ngAnimate\">\n" +
            "\n" +
            "<h1>Hide the DIV: <input type=\"checkbox\" ng-model=\"myCheck\"></h1>\n" +
            "\n" +
            "<div ng-hide=\"myCheck\"></div>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes162 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<style>\n" +
            "div {\n" +
            "  transition: all linear 0.5s;\n" +
            "  background-color: lightblue;\n" +
            "  height: 100px;\n" +
            "}\n" +
            "\n" +
            ".ng-hide {\n" +
            "  height: 0;\n" +
            "}\n" +
            "\n" +
            "</style>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-animate.js\"></script>\n" +
            "\n" +
            "<body ng-app=\"myApp\">\n" +
            "\n" +
            "<h1>Hide the DIV: <input type=\"checkbox\" ng-model=\"myCheck\"></h1>\n" +
            "\n" +
            "<div ng-hide=\"myCheck\"></div>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', ['ngAnimate']);\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes163 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body ng-app=\"myNoteApp\" ng-controller=\"myNoteCtrl\">\n" +
            "\n" +
            "<h2>My Note</h2>\n" +
            "\n" +
            "\n" +
            "<textarea ng-model=\"message\" cols=\"40\" rows=\"10\"></textarea>\n" +
            "\n" +
            "<p>\n" +
            "<button ng-click=\"save()\">Save</button>\n" +
            "<button ng-click=\"clear()\">Clear</button>\n" +
            "</p>\n" +
            "\n" +
            "<p>Number of characters left: <span ng-bind=\"left()\"></span></p>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module(\"myNoteApp\", []); \n" +
            "app.controller(\"myNoteCtrl\", function($scope) {\n" +
            "    $scope.message = \"\";\n" +
            "    $scope.left = function() {\n" +
            "        return 100 - $scope.message.length;\n" +
            "    };\n" +
            "    $scope.clear = function() {\n" +
            "        $scope.message = \"\";\n" +
            "    };\n" +
            "    $scope.save = function() {\n" +
            "        alert(\"Note Saved\");\n" +
            "    };\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes164 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n" +
            "<body ng-app=\"myApp\" ng-controller=\"todoCtrl\">\n" +
            "\n" +
            "<h2>My Todo List</h2>\n" +
            "\n" +
            "<form ng-submit=\"todoAdd()\">\n" +
            "    <input type=\"text\" ng-model=\"todoInput\" size=\"50\" placeholder=\"Add New\">\n" +
            "    <input type=\"submit\" value=\"Add New\">\n" +
            "</form>\n" +
            "\n" +
            "<br>\n" +
            "\n" +
            "<div ng-repeat=\"x in todoList\">\n" +
            "    <input type=\"checkbox\" ng-model=\"x.done\"> <span ng-bind=\"x.todoText\"></span>\n" +
            "</div>\n" +
            "\n" +
            "<p><button ng-click=\"remove()\">Remove marked</button></p>\n" +
            "\n" +
            "<script>\n" +
            "var app = angular.module('myApp', []); \n" +
            "app.controller('todoCtrl', function($scope) {\n" +
            "    $scope.todoList = [{todoText:'Clean House', done:false}];\n" +
            "\n" +
            "    $scope.todoAdd = function() {\n" +
            "        $scope.todoList.push({todoText:$scope.todoInput, done:false});\n" +
            "        $scope.todoInput = \"\";\n" +
            "    };\n" +
            "\n" +
            "    $scope.remove = function() {\n" +
            "        var oldList = $scope.todoList;\n" +
            "        $scope.todoList = [];\n" +
            "        angular.forEach(oldList, function(x) {\n" +
            "            if (!x.done) $scope.todoList.push(x);\n" +
            "        });\n" +
            "    };\n" +
            "});\n" +
            "</script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static final String codes165 = "//Password should contain atleast 8 chacters, \none lowercase letter, one uppercase letter, \nOne number, and one special character." +
            "\n\n" +
            "Vue.component('password-helper',{\n" +
            "        data() {\n" +
            "            return {\n" +
            "                password: '',\n" +
            "                has_minimum_lenth: false,\n" +
            "                has_number: false,\n" +
            "                has_lowercsae: false,\n" +
            "                has_uppercase: false,\n" +
            "                has_special: false,\n" +
            "            }\n" +
            "        },\n" +
            "        watch:{\n" +
            "            password(){\n" +
            "                this.has_minimum_lenth = (this.password.length > 8);\n" +
            "                this.has_number    = /\\d/.test(this.password);\n" +
            "                this.has_lowercase = /[a-z]/.test(this.password);\n" +
            "                this.has_uppercase = /[A-Z]/.test(this.password);\n" +
            "                this.has_special   = /[!@#\\$%\\^\\&*\\)\\(+=._-]/.test(this.password);\n" +
            "            }\n" +
            "        }\n" +
            "    });\n" +
            "\n" +
            "    var app = new Vue({\n" +
            "       el: '#app' \n" +
            "    });" +
            "\n" +
            "//Add the below CSS to change the text styling." +
            "\n" +
            ".has_required{\n" +
            "    text-decoration: line-through;\n" +
            "    color:#689868;\n" +
            "}";
    public static final String codes166 = "<html>\n" +
            "   <head>\n" +
            "      <title>VueJs Instance</title>\n" +
            "      <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "      <div id = \"computed_props\">\n" +
            "        Celsius : <input type = \"text\" v-model = \"celsius\">\n" +
            "        <br> <br>\n" +
            "        Fahrenheit : <input type = \"text\" v-model = \"fahrenheit\">\n" +
            "    </div>\n" +
            "      <script type = \"text/javascript\">\n" +
            "          var vm = new Vue({\n" +
            "            el: '#computed_props',\n" +
            "            data: {\n" +
            "            celsius : 0,\n" +
            "            fahrenheit: 0\n" +
            "            },\n" +
            "            methods: {\n" +
            "            },\n" +
            "            computed :{\n" +
            "            },\n" +
            "            watch : {\n" +
            "            celsius:function(val) {\n" +
            "                this.celsius = val;\n" +
            "                this.fahrenheit = val*1.8 + 32;             },\n" +
            "            fahrenheit : function (val) {\n" +
            "                this.celsius = (val-32)/1.8;\n" +
            "                this.fahrenheit = val;\n" +
            "            }\n" +
            "            }\n" +
            "        });\n" +
            "      </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes167 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <style>\n" +
            "        .active {\n" +
            "            background: yellow;\n" +
            "        }\n" +
            "    </style>\n" +
            " \n" +
            "    <div id = \"classbinding\">     //HTML Class binding\n" +
            "        <div v-bind:class = \"{active:isactive}\"><b>{{title}}</b></div>\n" +
            "    </div>\n" +
            " \n" +
            "        <div id = \"databinding\">      //Inline CSS binding\n" +
            "        <div v-bind:style = \"{ color: activeColor, fontSize: fontSize + 'px' }\">{{title}}</div>\n" +
            "    </div>\n" +
            " \n" +
            "    <div id = \"formbinding\">      //Form element binding\n" +
            "        <h3>Radio</h3>\n" +
            "        <input type = \"radio\" id = \"black\" value = \"Black\" v-model = \"picked\">Black\n" +
            "        <input type = \"radio\" id = \"white\" value = \"White\" v-model = \"picked\">White\n" +
            "        <h3>Radio element clicked : {{picked}} </h3>\n" +
            "        <hr/>\n" +
            "        <h3>Select</h3>\n" +
            "        <select v-model = \"languages\">\n" +
            "            <option disabled value = \"\">Please select one</option>\n" +
            "            <option>Angular</option>\n" +
            "            <option>React</option>\n" +
            "            <option>Vue</option>\n" +
            "            <option>Vanilla</option>\n" +
            "        </select>\n" +
            "        <h3>Framework Selected is : {{ languages }}</h3>\n" +
            "        <hr/>\n" +
            "    </div>\n" +
            "     <script type = \"text/javascript\">\n" +
            "          var vm = new Vue({\n" +
            "            el: '#classbinding',\n" +
            "            data: {\n" +
            "            title : \"HTML BINDING\",\n" +
            "            isactive : true\n" +
            "            }\n" +
            "        });\n" +
            "          \n" +
            "         var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            title : \"Inline Style Binding\",\n" +
            "            activeColor: 'blue',\n" +
            "            fontSize :'30'\n" +
            "            }\n" +
            "        });  \n" +
            "          \n" +
            "         var vm = new Vue({\n" +
            "            el: '#formbinding',\n" +
            "            data: {\n" +
            "            picked : 'White',\n" +
            "            languages : \"Vanilla\"\n" +
            "            }\n" +
            "        });" +
            "      </script>" +
            "   </body>\n" +
            "</html>";
    public static final String codes168 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\">\n" +
            "        <input type = \"text\" v-on:keyup.enter = \"showinputvalue\" v-bind:style =\n" +
            "\"styleobj\" placeholder = \"Value you want to enter/> <!-- key modifier .enter used -->\n" +
            "        <h3> {{name}}</h3>\n" +
            "    </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "        var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            Name:'',\n" +
            "            styleobj: {\n" +
            "                width: \"30%\",\n" +
            "                padding: \"12px 20px\",\n" +
            "                margin: \"8px 0\",\n" +
            "                boxSizing: \"border-box\"\n" +
            "            }\n" +
            "            },\n" +
            "            methods : {\n" +
            "            showinputvalue : function(event) {\n" +
            "                this.name=event.target.value + “ was entered.”;\n" +
            "            }\n" +
            "            }\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes169 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\">\n" +
            "        <button v-on:click = \"showdata\" v-bind:style = \"styleobj\">Click Me</button>\n" +
            "        <span style = \"font-size:25px;\"><b>{{show}}</b></span>\n" +
            "        <h1 v-if = \"show\">This is h1 if </h1> <!-- if condn -->\n" +
            "        <h2 v-else>This is h2 else </h2>        <!-- else condn -->\n" +
            "        <h3 v-show = \"show\">This is h3 show </h3>   <!-- show condition -->\n" +
            "         </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "      var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "        data: {\n" +
            "            show: true,\n" +
            "            styleobj: {\n" +
            "                backgroundColor: '#2196F3!important',\n" +
            "                cursor: 'pointer',\n" +
            "                padding: '8px 16px',\n" +
            "                verticalAlign: 'middle',\n" +
            "            }\n" +
            "            },\n" +
            "            methods : {\n" +
            "            showdata : function() {\n" +
            "                this.show = !this.show;\n" +
            "            }\n" +
            "            },\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes170 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\">\n" +
            "        <input type = \"text\" v-on:keyup.enter = \"showinputvalue\"\n" +
            "            v-bind:style = \"styleobj\" placeholder = \"Enter Countries\"/>  <!-- v-for triggered with key event .enter -->\n" +
            "        <h1 v-if = \"items.length>0\">Display Countries</h1>\n" +
            "        <ul>\n" +
            "            <li v-for = \"a in items\">{{a}}</li> \n" +
            "        </ul>   <!-- v-for rendered as a list item -->\n" +
            "    </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "        var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            items:[],\n" +
            "            styleobj: {\n" +
            "                width: \"30%\",\n" +
            "                padding: \"12px 20px\",\n" +
            "                margin: \"8px 0\",\n" +
            "                boxSizing: \"border-box\"\n" +
            "            }\n" +
            "            },\n" +
            "            methods : {\n" +
            "            showinputvalue : function(event) {\n" +
            "                this.items.push(event.target.value);\n" +
            "            }\n" +
            "            },\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes171 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\"></div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "      var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            },\n" +
            "            methods : {\n" +
            "            },\n" +
            "        });\n" +
            "        var myMixin = {\n" +
            "            created: function () {\n" +
            "            this.startmixin()\n" +
            "            },\n" +
            "            methods: {\n" +
            "            startmixin: function () {\n" +
            "                alert(\"Mixin Popup!\");\n" +
            "            }\n" +
            "            }\n" +
            "        };\n" +
            "        var Component = Vue.extend({\n" +
            "            mixins: [myMixin]\n" +
            "        })\n" +
            "        var component = new Component();\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>\n";
    public static final String codes172 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\">\n" +
            "        <div v-changestyle>VueJS Directive</div>\n" +
            "    </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "        Vue.directive(\"changestyle\",{\n" +
            "            bind(e1,binding, vnode) {\n" +
            "            console.log(e1);\n" +
            "            e1.style.color = \"blue\";\n" +
            "            e1.style.fontSize = \"35px\";\n" +
            "            }\n" +
            "        });\n" +
            "        var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            },\n" +
            "            methods : {\n" +
            "            },\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes173 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"databinding\">\n" +
            "        <input  v-model = \"name\" placeholder = \"Enter Name\" /><br/>\n" +
            "        <span style = \"font-size:25px;\"><b>Number of letters are : {{name |\n" +
            "countletters}}</b></span>\n" +
            "    </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "        var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            name : \"\"\n" +
            "            },\n" +
            "            filters : {\n" +
            "            countletters : function(value) {\n" +
            "                return value.length;\n" +
            "            }\n" +
            "            }\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes174 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue.js\"></script>\n" +
            "    <script type = \"text/javascript\" src = \"js/vue-router.js\"></script>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <div id = \"app\">\n" +
            "        <h1>Routing Example</h1>\n" +
            "        <p>\n" +
            "            <router-link to = \"/route1\">Router Link 1</router-link>\n" +
            "            <router-link to = \"/route2\">Router Link 2</router-link>\n" +
            "        </p>\n" +
            "        <!-- route outlet →\n" +
            "        <!-- component matched by the route will render here →\n" +
            "        <router-view></router-view>\n" +
            "    </div>\n" +
            "    <script type = \"text/javascript\">\n" +
            "        const Route1 = { template: '<div style =\n" +
            "\"border-radius:20px;background-color:cyan;width:200px;height:50px;margin:10px;font-size:25px;padding:10px;\">This is router 1</div>' }\n" +
            "    const Route2 = { template: '<div style = \"border-radius:20px;background-color:green;width:200px;height:50px;margin:10px;font-size:25px;padding:10px;\">This is router 2</div>' }\n" +
            "        const routes = [\n" +
            "            { path: '/route1', component: Route1 },\n" +
            "            { path: '/route2', component: Route2 }\n" +
            "        ];\n" +
            "        const router = new VueRouter({\n" +
            "            routes // short for `routes: routes`\n" +
            "        });\n" +
            "        var vm = new Vue({\n" +
            "            el: '#app',\n" +
            "            Router\n" +
            "        });\n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes175 = "<html>\n" +
            "   <head>\n" +
            "    <title>VueJs Instance</title>\n" +
            "   </head>\n" +
            "   <body>\n" +
            "    <style>\n" +
            "        #databinding{\n" +
            "            padding: 20px 15px 15px 15px;\n" +
            "            margin: 0 0 25px 0;\n" +
            "            width: auto;\n" +
            "        }\n" +
            "        span, option, input {\n" +
            "            font-size:20px;\n" +
            "        }\n" +
            "        .Table{\n" +
            "            display: table;\n" +
            "            width:80%;\n" +
            "        }\n" +
            "        .Title{\n" +
            "            display: table-caption;\n" +
            "            text-align: center;\n" +
            "            font-weight: bold;\n" +
            "            font-size: larger;\n" +
            "        }\n" +
            "        .Heading{\n" +
            "            display: table-row;\n" +
            "            font-weight: bold;\n" +
            "            text-align: center;\n" +
            "        }\n" +
            "        .Row{\n" +
            "            display: table-row;\n" +
            "        }\n" +
            "        .Cell{\n" +
            "            display: table-cell;\n" +
            "            border: solid;\n" +
            "            border-width: thin;\n" +
            "            padding-left: 5px;\n" +
            "            padding-right: 5px;\n" +
            "            width:30%;\n" +
            "        }\n" +
            "    </style>\n" +
            "      \n" +
            "    <div id = \"databinding\" style = \"\">\n" +
            "        <h1>Furniture Inventory</h1>\n" +
            "        <span>Item name</span>\n" +
            "        <input type = \"text\" placeholder = \"Enter Item Name\" v-model = \"item\"/><br>\n" +
            "        <span>Warehouse No.</span>\n" +
            "        <input type = \"text\" placeholder = \"Enter Warehouse No.\" v-model = \"warehouse\"/><br>\n" +
            "        <span>Quantity</span>\n" +
            "        <input type = \"text\" placeholder = \"Enter Quantity\" v-model = \"quantity\"/><br>\n" +
            "        <button v-on:click = \"showdata\" v-bind:style = \"styleobj\">Add</button>\n" +
            "        <br/>\n" +
            "        <br/>\n" +
            "        <inventorycomponent\n" +
            "            v-for = \"(i, index) in invdet\"\n" +
            "            v-bind:item = \"i\"\n" +
            "            v-bind:index = \"index\"\n" +
            "            v-bind:itr = \"i\"\n" +
            "            v-bind:key = \"i.item\"\n" +
            "            v-on:removeelement = \"invdet.splice(index, 1)\">\n" +
            "        </inventorycomponent>\n" +
            "    </div>\n" +
            "      \n" +
            "    <script type = \"text/javascript\">\n" +
            "       Vue.component('inventorycomponent',{\n" +
            "            template : '<div class = \"Table\"><div class = \"Row\"  v-bind:style = \"styleobj\"><div class = \"Cell\"><p>{{itr.item}}</p></div><div class = \"Cell\"><p>{{itr.warehouse}}</p></div><div class = \"Cell\"><p>{{itr.quantity}}</p></div><div class = \"Cell\"><p><button v-on:click = \"$emit(\\'removeelement\\')\">X</button></p></div></div></div>',\n" +
            "            props: ['itr', 'index'],\n" +
            "            data: function() {\n" +
            "            return {\n" +
            "                styleobj : {\n" +
            "                    backgroundColor:this.getcolor(),\n" +
            "                    fontSize : 20\n" +
            "                }\n" +
            "            }\n" +
            "            },\n" +
            "            methods:{\n" +
            "            getcolor : function() {\n" +
            "                if (this.index % 2) {\n" +
            "                    return \"#66CDAA\";\n" +
            "                } else {\n" +
            "                    return \"#90EE90\";\n" +
            "                }\n" +
            "            }\n" +
            "            }\n" +
            "        });\n" +
            "        var vm = new Vue({\n" +
            "            el: '#databinding',\n" +
            "            data: {\n" +
            "            item:'',\n" +
            "            warehouse:'',\n" +
            "            quantity : '',\n" +
            "            invdet:[],\n" +
            "            styleobj: {\n" +
            "                backgroundColor: '#2196F3!important',\n" +
            "                cursor: 'pointer',\n" +
            "                padding: '8px 16px',\n" +
            "                verticalAlign: 'middle',\n" +
            "            }\n" +
            "            },\n" +
            "            methods :{\n" +
            "            showdata : function() {\n" +
            "                this.invdet.push({\n" +
            "                    item: this.item,\n" +
            "                    warehouse: this.warehouse,\n" +
            "                    quantity : this.quantity\n" +
            "                });\n" +
            "                this.item = \"\";\n" +
            "                this.warehouse = \"\";\n" +
            "                this.quantity = \"\";\n" +
            "            }\n" +
            "            }\n" +
            "        });" +
            "      \n" +
            "    </script>\n" +
            "   </body>\n" +
            "</html>";
    public static final String codes176 = "import React, { useState } from \"react\";\n" +
            "import ReactDOM from \"react-dom\";\n" +
            "\n" +
            "import \"./styles.css\";\n" +
            "\n" +
            "function App() {\n" +
            "\n" +
            "  const list = [\n" +
            "    \"Banana\",\n" +
            "    \"Apple\",\n" +
            "    \"Orange\",\n" +
            "    \"Mango\",\n" +
            "    \"Pineapple\",\n" +
            "    \"Watermelon\"\n" +
            "  ];\n" +
            "\n" +
            "  const [filterList, setFilterList] = useState(list);\n" +
            "\n" +
            "  const handleSearch = (event) => {\n" +
            "\n" +
            "    if (event.target.value === \"\") {\n" +
            "      setFilterList(list);\n" +
            "      return;\n" +
            "    }\n" +
            "    const filteredValues = list.filter(\n" +
            "      (item) =>\n" +
            "        item.toLowerCase().indexOf(event.target.value.toLowerCase()) !== -1\n" +
            "    );\n" +
            "    setFilterList(filteredValues);\n" +
            "  };\n" +
            "  return (\n" +
            "    <div className=\"app\">\n" +
            "      <div>\n" +
            "        Search: <input name=\"query\" type=\"text\" onChange={handleSearch} />\n" +
            "      </div>\n" +
            "      {filterList &&\n" +
            "        filterList.map((item) => (\n" +
            "          <div>{item}</div> //Display each item\n" +
            "        ))}\n" +
            "    </div>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "const rootElement = document.getElementById(\"root\");\n" +
            "ReactDOM.render(<App />, rootElement);";
    public static final String codes177 = "const { useState } = React;\n" +
            "\n" +
            "function App() {\n" +
            "  const [count, setCount] = useState(0);\n" +
            "\n" +
            "  return (\n" +
            "    <div className=\"app\">\n" +
            "      {\n" +
            "        // if else statement to determine color of the counter\n" +
            "      }\n" +
            "      <h1 className={count > 0 ? \"positive\" : count < 0 ? \"negative\" : null}>\n" +
            "        {count}\n" +
            "      </h1>\n" +
            "      <div className=\"button__wrapper\">\n" +
            "        <button onClick={() => setCount(count - 1)}>-</button>\n" +
            "        <button onClick={() => setCount(count + 1)}>+</button>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<App />, document.getElementById(\"root\"));\n";
    public static final String codes178 = "import React, {Component} from 'react';\n" +
            "import 'highlight.js/scss/darcula.scss'; // your favourite theme\n" +
            "import blade from './blade'; // TODO: Figure out exact path in package\n" +
            "import hljs from 'highlight.js';\n" +
            "\n" +
            "hljs.registerLanguage('blade', blade);\n" +
            "\n" +
            "class Highlighter extends Component {\n" +
            "    constructor(props) {\n" +
            "        super(props);\n" +
            "        hljs.initHighlightingOnLoad();\n" +
            "    }\n" +
            "\n" +
            "    render() {\n" +
            "        let {children} = this.props;\n" +
            "        return\n" +
            "        {\n" +
            "            <pre ref={(node) => this.node = node}>\n" +
            "                <code className=\"blade\">\n" +
            "                    {children}\n" +
            "                </code>\n" +
            "            </pre>\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "export default Highlighter;";
    public static final String codes179 = "function Person(\n" +
            "props\n" +
            ") {\n" +
            "  return <h1>Hi, I'm {\n" +
            "props\n" +
            ".name}!</h1>;\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<Person name=\"Jesse\"/>, document.getElementById('root'));";
    public static final String codes180 = "function Person(props) {\n" +
            "  return <h2>I'm { props.name }!</h2>;\n" +
            "}\n" +
            "\n" +
            "function Greeting() {\n" +
            "  const name = \"Jesse\"\n" +
            "  return (\n" +
            "    <>\n" +
            "      <h1>Hello!</h1>\n" +
            "      <Person name=\n" +
            "{\n" +
            " name \n" +
            "}\n" +
            " />\n" +
            "    </>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<Greeting />, document.getElementById('root'));";
    public static final String codes181 = "function App({isLoggedIn}) {\n" +
            "  return (\n" +
            "    <>\n" +
            "      <h1>My Application</h1>\n" +
            "      {isLoggedIn \n" +
            "&&\n" +
            " <Profile /> }\n" +
            "    </>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<App />, document.getElementById('root'));";
    public static final String codes182 = "function GroceryList() {\n" +
            "  const items = [\n" +
            "    {id: 1, name: 'bread'},\n" +
            "    {id: 2, name: 'milk'},\n" +
            "    {id: 3, name: 'eggs'}\n" +
            "  ];\n" +
            "\n" +
            "  return (\n" +
            "    <>\n" +
            "      <h1>Grocery List</h1>\n" +
            "      <ul>\n" +
            "        {items.map((item) => <li \n" +
            "key\n" +
            "={item.id}>{item.name}</li>)}\n" +
            "      </ul>\n" +
            "    </>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<GroceryList />, document.getElementById('root'));";
    public static final String codes183 = "import { useState, useEffect } from \"react\";\n" +
            "import ReactDOM from \"react-dom\";\n" +
            "\n" +
            "function App() {\n" +
            "  const [data, setData] = useState([]);\n" +
            "\n" +
            "  useEffect(() => {\n" +
            "    setData(getData())\n" +
            "  }, \n" +
            "[]\n" +
            ");\n" +
            "\n" +
            "  return <DisplayData data={data} />;\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<App />, document.getElementById('root'));";
    public static final String codes184 = "const Header = () => {\n" +
            "  return (\n" +
            "    <>\n" +
            "      <h1 style=\n" +
            "{{backgroundColor: \"yellow\"}}\n" +
            ">Hello Style!</h1>\n" +
            "      <p>Add a little style!</p>\n" +
            "    </>\n" +
            "  );\n" +
            "}";
    public static final String codes185 = "import { useState } from \"react\";\n" +
            "import ReactDOM from 'react-dom';\n" +
            "\n" +
            "function MyForm() {\n" +
            "  const [name, setName] = useState(\"\");\n" +
            "\n" +
            "  return (\n" +
            "    <form>\n" +
            "      <label>Enter your name:\n" +
            "        <input\n" +
            "          type=\"text\" \n" +
            "          value={name}\n" +
            "          onChange={(e) => setName(e.target.value)}\n" +
            "        />\n" +
            "      </label>\n" +
            "    </form>\n" +
            "  )\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<MyForm />, document.getElementById('root'));";
    public static final String codes186 = "import ReactDOM from \"react-dom\";\n" +
            "import { BrowserRouter, Routes, Route } from \"react-router-dom\";\n" +
            "import Layout from \"./pages/Layout\";\n" +
            "import Home from \"./pages/Home\";\n" +
            "import Blogs from \"./pages/Blogs\";\n" +
            "import Contact from \"./pages/Contact\";\n" +
            "import NoPage from \"./pages/NoPage\";\n" +
            "\n" +
            "export default function App() {\n" +
            "  return (\n" +
            "    <BrowserRouter>\n" +
            "      <Routes>\n" +
            "        <Route path=\"/\" element={<Layout />}>\n" +
            "          <Route index element={<Home />} />\n" +
            "          <Route path=\"blogs\" element={<Blogs />} />\n" +
            "          <Route path=\"contact\" element={<Contact />} />\n" +
            "          <Route path=\"*\" element={<NoPage />} />\n" +
            "        </Route>\n" +
            "      </Routes>\n" +
            "    </BrowserRouter>\n" +
            "  );\n" +
            "}\n" +
            "\n" +
            "ReactDOM.render(<App />, document.getElementById(\"root\"));";
    public static final String codes187 = "import Ember from 'ember';\n" +
            "\n" +
            "export default function() {\n" +
            "   var Car = Ember.Object.extend ({\n" +
            "      \n" +
            "      //The values for below variables will be supplied by 'create' method\n" +
            "      CarName: null,\n" +
            "      CarModel: null,\n" +
            "      carDetails: Ember.computed('CarName', 'CarModel', function() {\n" +
            "\n" +
            "         //returns values to the computed property function 'carDetails'\n" +
            "         return ' Car Name: ' + this.get('CarName') + '<br>' + \n" +
            "            ' Car Model: ' + this.get('CarModel');\n" +
            "      })\n" +
            "   });\n" +
            "\n" +
            "   var mycar = Car.create ({\n" +
            "      //initializing the values of Car variables\n" +
            "      CarName: \"Alto\",\n" +
            "      CarModel: \"800\",\n" +
            "   });\n" +
            "   \n" +
            "   //Displaying the information of the car\n" +
            "   document.write(\"<h2>Details of the car: <br></h2>\");\n" +
            "   document.write(mycar.get('carDetails'));\n" +
            "}";
    public static final String codes188 = "import Ember from 'ember';\n" +
            "\n" +
            "export default function() {\n" +
            "   //reopen() method for instances\n" +
            "   var Person = Ember.Object.extend ({\n" +
            "      firstName: null,\n" +
            "      lastName:  null,\n" +
            "   });\n" +
            "\n" +
            "   //adding new variable to the Person class\n" +
            "   Person.reopen ({\n" +
            "      middleName: 'Smith',\n" +
            "   });\n" +
            "\n" +
            "   document.write('Middle Name: '+Person.create().get('middleName'));\n" +
            "   document.write(\"<br>\");\n" +
            "\n" +
            "   //reopenClass() method for classes\n" +
            "   Person.reopenClass ({\n" +
            "      //creating new function for class Person\n" +
            "      openClass: function() {\n" +
            "         return Person.create({isMan: true});\n" +
            "      }\n" +
            "   });\n" +
            "\n" +
            "   document.write('isMan: '+Person.openClass().get('isMan'));\n" +
            "}";
    public static final String codes189 = "import Ember from 'ember';   //import ember module\n" +
            "export default function() {\n" +
            "   \n" +
            "   //new ember object\n" +
            "   const Demo = Ember.Object.extend ({\n" +
            "      init() {\n" +
            "         alert('The default property of stateOn is : ' + this.get('stateOn'));\n" +
            "      },\n" +
            "      stateOn: false\n" +
            "   });\n" +
            "\n" +
            "   const state = Demo.create();   //new instance from object with create() method\n" +
            "   state.set('stateOn', true);\n" +
            "   console.log(state.get('stateOn'));\n" +
            "}";
    public static final String codes190 = "import Ember from 'ember';\n" +
            "\n" +
            "export default function() {\n" +
            "   var Person = Ember.Object.extend ({\n" +
            "      \n" +
            "      //todos is an array which holds the boolean values\n" +
            "      todos: [\n" +
            "         Ember.Object.create ({\n" +
            "            isDone: true\n" +
            "         }),\n" +
            "         Ember.Object.create ({\n" +
            "            isDone: false\n" +
            "         }),\n" +
            "         Ember.Object.create ({\n" +
            "            isDone: true\n" +
            "         })\n" +
            "      ],\n" +
            "      \n" +
            "      //dispaly the remaining values of todos\n" +
            "      remaining: Ember.computed('todos.@each.isDone', function() {\n" +
            "         var todos = this.get('todos');\n" +
            "         \n" +
            "         //return the todos array\n" +
            "         return todos.filterBy('isDone', false).get('length');\n" +
            "      }),\n" +
            "   });\n" +
            "   \n" +
            "   var car_obj = Person.create();\n" +
            "   document.write(\"The remaining number of cars in todo list: \" + car_obj.get('remaining'));\n" +
            "}";
    public static final String codes191 = "import Ember from 'ember';\n" +
            "\n" +
            "export default function() {\n" +
            "   var CarOne = Ember.Object.create ({\n" +
            "      //primary value\n" +
            "      TotalPrice: 860600\n" +
            "   });\n" +
            "\n" +
            "   var Car = Ember.Object.extend ({\n" +
            "      //creates property which is an alias for another property\n" +
            "      TotalPrice: Ember.computed.alias('CarOne.TotalPrice')\n" +
            "   });\n" +
            "\n" +
            "   var CarTwo = Car.create ({\n" +
            "      CarOne: CarOne\n" +
            "   });\n" +
            "   document.write('Value of car before updating: ' + CarTwo.get('TotalPrice'));\n" +
            "   \n" +
            "   //sets the car price\n" +
            "   CarTwo.set('TotalPrice', 930000);\n" +
            "   \n" +
            "   //above car price effects the CarOne\n" +
            "   document.write('<br>Value of car after updating: ' + CarOne.get('TotalPrice'));\n" +
            "}";
    public static final String codes192 = "import Ember from 'ember';\n" +
            "\n" +
            "export default function() {\n" +
            "   var Person = Ember.Object.extend ({\n" +
            "      Name: null,\n" +
            "      \n" +
            "      //Defining the Details1 and Details2 computed property function\n" +
            "      Details1: Ember.computed('Name', function() {\n" +
            "         \n" +
            "         //get the Name value\n" +
            "         var Name = this.get('Name');\n" +
            "         //return the Name value\n" +
            "         return Name;\n" +
            "      }),\n" +
            "\n" +
            "      Details2: Ember.observer('Details1', function() {\n" +
            "         this.set('Name','Steve Waugh');\n" +
            "      })\n" +
            "   });\n" +
            "\n" +
            "   //initializing the Person details\n" +
            "   var person = Person.create ({\n" +
            "      //initial value of Name varialble\n" +
            "      Name: 'Mark Waugh'\n" +
            "   });\n" +
            "\n" +
            "   //updating the value for 'firstName' using set() method\n" +
            "   document.write('<strong>The updated name : </strong>' +person.get('Details1'));\n" +
            "}";
    public static final String codes193 = "<table" +
            "class=\"table\"" +
            ">\n" +
            "  <tr>\n" +
            "    <td>John</td>\n" +
            "    <td>Doe</td>\n" +
            "    <td>john@example.com</td>\n" +
            "  </tr>\n" +
            "  <tr>\n" +
            "    <td>Mary</td>\n" +
            "    <td>Moe</td>\n" +
            "    <td>mary@example.com</td>\n" +
            "  </tr>\n" +
            "  <tr>\n" +
            "    <td>July</td>\n" +
            "    <td>Dooley</td>\n" +
            "    <td>july@example.com</td>\n" +
            "  </tr>\n" +
            "</table>";
    public static final String codes194 = "<div class=\"" +
            "alert alert-success" +
            "\">\n" +
            "  This alert box could indicate a successful or positive action.\n" +
            "</div>\n" +
            "<div class=\"" +
            "alert alert-info" +
            "\">\n" +
            "  This alert box could indicate a neutral informative change or action.\n" +
            "</div>\n" +
            "<div class=\"" +
            "alert alert-warning" +
            "\">\n" +
            "  This alert box could indicate a warning that might need attention.\n" +
            "</div>\n" +
            "<div class=\"" +
            "alert alert-danger" +
            "\">\n" +
            "  This alert box could indicate a dangerous or potentially negative action.\n" +
            "</div>";
    public static final String codes195 = "<div class=\"" +
            "btn-group-vertical" +
            "\">\n" +
            "  <button class=\"btn btn-primary\">Apple</button>\n" +
            "  <button class=\"btn btn-primary\">Samsung</button>\n" +
            "  <button class=\"btn btn-primary\">Sony</button>\n" +
            "</div>";
    public static final String codes196 = "<div class=\"progress\">\n" +
            "  <div class=\"progress-bar \n" +
            "bg-success\n" +
            "\"\n" +
            "    style=\"width:70%\">\n" +
            "  </div>\n" +
            "</div>";
    public static final String codes197 = "<ul class=\"pagination\">\n" +
            "  <li class=\"page-item \n" +
            "active\n" +
            "\"><a class=\"page-link\" href=\"#\">1</a></li>\n" +
            "  <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n" +
            "  <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n" +
            "</ul>";
    public static final String codes198 = "<ul class=\"" +
            "list-group\n" +
            " \n" +
            "list-group-horizontal" +
            "\">\n" +
            "  <li class=\"list-group-item\">First item</li>\n" +
            "  <li class=\"list-group-item\">Second item</li>\n" +
            "  <li class=\"list-group-item\">Third item</li>\n" +
            "</ul>";
    public static final String codes199 = "<div class=\"" +
            "card" +
            "\">\n" +
            "  <div class=\"" +
            "card-header" +
            "\">Header</div>\n" +
            "  <div class=\"" +
            "card-body" +
            "\">Content</div>\n" +
            "  <div class=\"" +
            "card-footer" +
            "\">Footer</div>\n" +
            "</div>";
    public static final String codes200 = "<div class=\"" +
            "dropdown" +
            "\">\n" +
            "  <button " +
            "data-toggle=\"dropdown\"" +
            "\n" +
            "  class=\"btn btn-primary " +
            "dropdown-toggle" +
            "\">\n" +
            "  Dropdown Example\n" +
            "  <div class=\"dropdown-menu\">\n" +
            "    <a class=\"dropdown-item\" href=\"#\">Link 1</a>\n" +
            "    <a class=\"dropdown-item\" href=\"#\">Link 2</a>\n" +
            "    <a class=\"dropdown-item\" href=\"#\">Link 3</a>\n" +
            "  </div>\n" +
            "</div>";
    public static final String codes201 = "<ul class=\"" +
            "nav" +
            " " +
            "nav-pills" +
            "\">\n" +
            "  <li class=\"" +
            "nav-item" +
            "\">\n" +
            "    <a class=\"" +
            "nav-link" +
            "\" href=\"#\">Link</a>" +
            "  </li>\n" +
            "  <li class=\"" +
            "nav-item" +
            "\">\n" +
            "    <a class=\"" +
            "nav-link" +
            "\" href=\"#\">Link</a>" +
            "  </li>\n" +
            "</ul>";
    public static final String codes202 = "<nav class=\"navbar navbar-expand-sm bg-light " +
            "fixed-top" +
            "\">\n" +
            "  <ul class=\"navbar-nav\">\n" +
            "    <li class=\"nav-item\">\n" +
            "      <a class=\"nav-link\" href=\"#\">Link 1</a>\n" +
            "    </li>\n" +
            "    <li class=\"nav-item\">\n" +
            "      <a class=\"nav-link\" href=\"#\">Link 2</a>\n" +
            "    </li>\n" +
            "  </ul>\n" +
            "</nav>";
    public static final String codes203 = "var http = require('http');\n" +
            "http.request({\n" +
            "host: 'www.google.com',\n" +
            "method: 'GET',\n" +
            "path: \"/\"\n" +
            "}, function(response) {\n" +
            "response.setEncoding(\"utf8\");\n" +
            "response.on(\"readable\", function() {\n" +
            "console.log(response.read())\n" +
            "});\n" +
            "}).end();";
    public static final String codes204 = "var http = require('http');\n" +
            "var url = require('url');\n" +
            "var server = http.createServer(function(request, response) {\n" +
            "var cookies = request.headers.cookie;\n" +
            "if(!cookies) {\n" +
            "var cookieName = \"session\";\n" +
            "var cookieValue = \"123456\";\n" +
            "var expiryDate = new Date();\n" +
            "expiryDate.setDate(expiryDate.getDate() + 1);\n" +
            "var cookieText = cookieName + '=' + cookieValue + ';expires='\n" +
            "+ expiryDate.toUTCString() + ';';\n" +
            "response.setHeader('Set-Cookie', cookieText);\n" +
            "response.writeHead(302, {\n" +
            "'Location': '/'\n" +
            "});\n" +
            "return response.end();\n" +
            "}\n" +
            "cookies.split(';').forEach(function(cookie) {\n" +
            "var m = cookie.match(/(.*?)=(.*)$/);\n" +
            "cookies[m[1].trim()] = (m[2] || '').trim();\n" +
            "});\n" +
            "response.end(\"Cookie set: \" + cookies.toString());\n" +
            "}).listen(8080);";
    public static final String codes205 = "var user = {\n" +
            "first_name: \"John\",\n" +
            "last_name: \"Smith\",\n" +
            "age: \"38\",\n" +
            "department: \"Software\"\n" +
            "};\n" +
            "console.log(user);\n" +
            "console.log(Object.keys(user).length);\n" +
            "delete user.last_name;\n" +
            "console.log(user);\n" +
            "console.log(Object.keys(user).length);";
    public static final String codes206 = "var dirToJson = require('dir-to-json');\n" +
            " \n" +
            "dirToJson( \"./album\", function( err, dirTree ){\n" +
            "    if( err ){\n" +
            "        throw err;\n" +
            "    }else{\n" +
            "        console.log( dirTree );\n" +
            "    }\n" +
            "});";
    public static final String codes207 = "var mysql = require(\"mysql\");\n" +
            "var con = mysql.createConnection({\n" +
            "    host: \"hostname\",\n" +
            "    user: \"username\",\n" +
            "    password: \"password\",\n" +
            "    database: \"database\"\n" +
            "});\n" +
            "con.connect(function(err){\n" +
            "    if(err) {\n" +
            "        console.log('Error connecting to Db');\n" +
            "        return;\n" +
            "    }\n" +
            "    console.log('Connection Established');\n" +
            "})\n" +
            "con.end(function(err) { \n" +
            "});";
    public static final String codes208 = "const arr = ['fish', 'crab', 'dolphin', 'whale', 'starfish'];\n" +
            "arr.forEach(element => {\n" +
            "  console.log(element);\n" +
            "});";
    public static final String codes209 = "var readline = require('readline');\n" +
            "var fs = require('fs');\n" +
            "\n" +
            "var file= readline.createInterface({\n" +
            "  input: fs.createReadStream('demo.html')\n" +
            "});\n" +
            "\n" +
            "var lineno = 0;\n" +
            "file.on('line', function (line) {\n" +
            "  lineno++;\n" +
            "  console.log('Line number ' + lineno + ': ' + line);\n" +
            "});";
    public static final String codes210 = "var MongoClient = require('mongodb').MongoClient;\n" +
            "var url = \"mongodb://localhost:27017/mydb\";\n" +
            "\n" +
            "MongoClient.connect(url, function(err, db) {\n" +
            "  if (err) throw err;\n" +
            "  console.log(\"Database created!\");\n" +
            "  db.close();\n" +
            "});";
    public static final String codes211 = "var zlib = require('zlib');\n" +
            "var fs = require('fs');\n" +
            "\n" +
            "var gzip = zlib.createGzip();\n" +
            "var r = fs.createReadStream('./demofile.txt');\n" +
            "var w = fs.createWriteStream('./demogzipfile.txt.gz');\n" +
            "r.pipe(gzip).pipe(w);";
    public static final String codes212 = "var fs = require('fs');\n" +
            " \n" +
            "try{\n" +
            "    // file not presenet\n" +
            "    var data = fs.readFileSync('demo.html');\n" +
            "} catch (err){\n" +
            "    console.log(err);\n" +
            "}";
    public static final String codes213 = "mailer = require('nodemailer');\n" +
            "\n" +
            "smtpProtocol = mailer.createTransport({\n" +
            "    service: \"Gmail\",\n" +
            "    auth: {\n" +
            "        user: \"sender@gmail.com\",\n" +
            "        pass: \"password\"\n" +
            "    }\n" +
            "});\n" +
            "\n" +
            "var mailoption = {\n" +
            "    from: \"sender@gmail.com\",\n" +
            "    to: \"receiver@gmail.com\",\n" +
            "    subject: \"Test Mail\",\n" +
            "    html: 'Good Morning!'\n" +
            "}\n" +
            "\n" +
            "smtpProtocol.sendMail(mailoption, function(err, response){\n" +
            "    if(err) {\n" +
            "        console.log(err);\n" +
            "    } \n" +
            "    console.log('Message Sent' + response.message);\n" +
            "    smtpProtocol.close();\n" +
            "});";
    public static final String codes214 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../..');\n" +
            "var hash = require('pbkdf2-password')()\n" +
            "var path = require('path');\n" +
            "var session = require('express-session');\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// config\n" +
            "\n" +
            "app.set('view engine', 'ejs');\n" +
            "app.set('views', path.join(__dirname, 'views'));\n" +
            "\n" +
            "// middleware\n" +
            "\n" +
            "app.use(express.urlencoded({ extended: false }))\n" +
            "app.use(session({\n" +
            "  resave: false, // don't save session if unmodified\n" +
            "  saveUninitialized: false, // don't create session until something stored\n" +
            "  secret: 'shhhh, very secret'\n" +
            "}));\n" +
            "\n" +
            "// Session-persisted message middleware\n" +
            "\n" +
            "app.use(function(req, res, next){\n" +
            "  var err = req.session.error;\n" +
            "  var msg = req.session.success;\n" +
            "  delete req.session.error;\n" +
            "  delete req.session.success;\n" +
            "  res.locals.message = '';\n" +
            "  if (err) res.locals.message = '<p class=\"msg error\">' + err + '</p>';\n" +
            "  if (msg) res.locals.message = '<p class=\"msg success\">' + msg + '</p>';\n" +
            "  next();\n" +
            "});\n" +
            "\n" +
            "// dummy database\n" +
            "\n" +
            "var users = {\n" +
            "  tj: { name: 'tj' }\n" +
            "};\n" +
            "\n" +
            "// when you create a user, generate a salt\n" +
            "// and hash the password ('foobar' is the pass here)\n" +
            "\n" +
            "hash({ password: 'foobar' }, function (err, pass, salt, hash) {\n" +
            "  if (err) throw err;\n" +
            "  // store the salt & hash in the \"db\"\n" +
            "  users.tj.salt = salt;\n" +
            "  users.tj.hash = hash;\n" +
            "});\n" +
            "\n" +
            "\n" +
            "// Authenticate using our plain-object database of doom!\n" +
            "\n" +
            "function authenticate(name, pass, fn) {\n" +
            "  if (!module.parent) console.log('authenticating %s:%s', name, pass);\n" +
            "  var user = users[name];\n" +
            "  // query the db for the given username\n" +
            "  if (!user) return fn(new Error('cannot find user'));\n" +
            "  // apply the same algorithm to the POSTed password, applying\n" +
            "  // the hash against the pass / salt, if there is a match we\n" +
            "  // found the user\n" +
            "  hash({ password: pass, salt: user.salt }, function (err, pass, salt, hash) {\n" +
            "    if (err) return fn(err);\n" +
            "    if (hash === user.hash) return fn(null, user)\n" +
            "    fn(new Error('invalid password'));\n" +
            "  });\n" +
            "}\n" +
            "\n" +
            "function restrict(req, res, next) {\n" +
            "  if (req.session.user) {\n" +
            "    next();\n" +
            "  } else {\n" +
            "    req.session.error = 'Access denied!';\n" +
            "    res.redirect('/login');\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.redirect('/login');\n" +
            "});\n" +
            "\n" +
            "app.get('/restricted', restrict, function(req, res){\n" +
            "  res.send('Wahoo! restricted area, click to <a href=\"/logout\">logout</a>');\n" +
            "});\n" +
            "\n" +
            "app.get('/logout', function(req, res){\n" +
            "  // destroy the user's session to log them out\n" +
            "  // will be re-created next request\n" +
            "  req.session.destroy(function(){\n" +
            "    res.redirect('/');\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "app.get('/login', function(req, res){\n" +
            "  res.render('login');\n" +
            "});\n" +
            "\n" +
            "app.post('/login', function(req, res){\n" +
            "  authenticate(req.body.username, req.body.password, function(err, user){\n" +
            "    if (user) {\n" +
            "      // Regenerate session when signing in\n" +
            "      // to prevent fixation\n" +
            "      req.session.regenerate(function(){\n" +
            "        // Store the user's primary key\n" +
            "        // in the session store to be retrieved,\n" +
            "        // or in this case the entire user object\n" +
            "        req.session.user = user;\n" +
            "        req.session.success = 'Authenticated as ' + user.name\n" +
            "          + ' click to <a href=\"/logout\">logout</a>. '\n" +
            "          + ' You may now access <a href=\"/restricted\">/restricted</a>.';\n" +
            "        res.redirect('back');\n" +
            "      });\n" +
            "    } else {\n" +
            "      req.session.error = 'Authentication failed, please check your '\n" +
            "        + ' username and password.'\n" +
            "        + ' (use \"tj\" and \"foobar\")';\n" +
            "      res.redirect('/login');\n" +
            "    }\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes215 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var cookieSession = require('cookie-session');\n" +
            "var express = require('../../');\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// add req.session cookie support\n" +
            "app.use(cookieSession({ secret: 'manny is cool' }));\n" +
            "\n" +
            "// do something with the session\n" +
            "app.use(count);\n" +
            "\n" +
            "// custom middleware\n" +
            "function count(req, res) {\n" +
            "  req.session.count = (req.session.count || 0) + 1\n" +
            "  res.send('viewed ' + req.session.count + ' times\\n')\n" +
            "}\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes216 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "var app = module.exports = express();\n" +
            "var logger = require('morgan');\n" +
            "var cookieParser = require('cookie-parser');\n" +
            "\n" +
            "// custom log format\n" +
            "if (process.env.NODE_ENV !== 'test') app.use(logger(':method :url'))\n" +
            "\n" +
            "// parses request cookies, populating\n" +
            "// req.cookies and req.signedCookies\n" +
            "// when the secret is passed, used\n" +
            "// for signing the cookies.\n" +
            "app.use(cookieParser('my secret here'));\n" +
            "\n" +
            "// parses x-www-form-urlencoded\n" +
            "app.use(express.urlencoded({ extended: false }))\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  if (req.cookies.remember) {\n" +
            "    res.send('Remembered :). Click to <a href=\"/forget\">forget</a>!.');\n" +
            "  } else {\n" +
            "    res.send('<form method=\"post\"><p>Check to <label>'\n" +
            "      + '<input type=\"checkbox\" name=\"remember\"/> remember me</label> '\n" +
            "      + '<input type=\"submit\" value=\"Submit\"/>.</p></form>');\n" +
            "  }\n" +
            "});\n" +
            "\n" +
            "app.get('/forget', function(req, res){\n" +
            "  res.clearCookie('remember');\n" +
            "  res.redirect('back');\n" +
            "});\n" +
            "\n" +
            "app.post('/', function(req, res){\n" +
            "  var minute = 60000;\n" +
            "  if (req.body.remember) res.cookie('remember', 1, { maxAge: minute });\n" +
            "  res.redirect('back');\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes217 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "var path = require('path');\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.send('<ul>' +\n" +
            "    '<li>Download <a href=\"/files/notes/groceries.txt\">notes/groceries.txt</a>.</li>' +\n" +
            "    '<li>Download <a href=\"/files/amazing.txt\">amazing.txt</a>.</li>' +\n" +
            "    '<li>Download <a href=\"/files/missing.txt\">missing.txt</a>.</li>' +\n" +
            "    '<li>Download <a href=\"/files/CCTV大赛上海分赛区.txt\">CCTV大赛上海分赛区.txt</a>.</li>' +\n" +
            "    '</ul>')\n" +
            "});\n" +
            "\n" +
            "// /files/* is accessed via req.params[0]\n" +
            "// but here we name it :file\n" +
            "app.get('/files/:file(*)', function(req, res, next){\n" +
            "  var filePath = path.join(__dirname, 'files', req.params.file);\n" +
            "\n" +
            "  res.download(filePath, function (err) {\n" +
            "    if (!err) return; // file sent\n" +
            "    if (err.status !== 404) return next(err); // non-404 error\n" +
            "    // file for download not found\n" +
            "    res.statusCode = 404;\n" +
            "    res.send('Cant find that file, sorry!');\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes218 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "var path = require('path');\n" +
            "var app = module.exports = express();\n" +
            "var logger = require('morgan');\n" +
            "var silent = process.env.NODE_ENV === 'test'\n" +
            "\n" +
            "// general config\n" +
            "app.set('views', path.join(__dirname, 'views'));\n" +
            "app.set('view engine', 'ejs');\n" +
            "\n" +
            "// our custom \"verbose errors\" setting\n" +
            "// which we can use in the templates\n" +
            "// via settings['verbose errors']\n" +
            "app.enable('verbose errors');\n" +
            "\n" +
            "// disable them in production\n" +
            "// use $ NODE_ENV=production node examples/error-pages\n" +
            "if (app.settings.env === 'production') app.disable('verbose errors')\n" +
            "\n" +
            "silent || app.use(logger('dev'));\n" +
            "\n" +
            "// Routes\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.render('index.ejs');\n" +
            "});\n" +
            "\n" +
            "app.get('/404', function(req, res, next){\n" +
            "  // trigger a 404 since no other middleware\n" +
            "  // will match /404 after this one, and we're not\n" +
            "  // responding here\n" +
            "  next();\n" +
            "});\n" +
            "\n" +
            "app.get('/403', function(req, res, next){\n" +
            "  // trigger a 403 error\n" +
            "  var err = new Error('not allowed!');\n" +
            "  err.status = 403;\n" +
            "  next(err);\n" +
            "});\n" +
            "\n" +
            "app.get('/500', function(req, res, next){\n" +
            "  // trigger a generic (500) error\n" +
            "  next(new Error('keyboard cat!'));\n" +
            "});\n" +
            "\n" +
            "// Error handlers\n" +
            "\n" +
            "// Since this is the last non-error-handling\n" +
            "// middleware use()d, we assume 404, as nothing else\n" +
            "// responded.\n" +
            "\n" +
            "// $ curl http://localhost:3000/notfound\n" +
            "// $ curl http://localhost:3000/notfound -H \"Accept: application/json\"\n" +
            "// $ curl http://localhost:3000/notfound -H \"Accept: text/plain\"\n" +
            "\n" +
            "app.use(function(req, res, next){\n" +
            "  res.status(404);\n" +
            "\n" +
            "  res.format({\n" +
            "    html: function () {\n" +
            "      res.render('404', { url: req.url })\n" +
            "    },\n" +
            "    json: function () {\n" +
            "      res.json({ error: 'Not found' })\n" +
            "    },\n" +
            "    default: function () {\n" +
            "      res.type('txt').send('Not found')\n" +
            "    }\n" +
            "  })\n" +
            "});\n" +
            "\n" +
            "// error-handling middleware, take the same form\n" +
            "// as regular middleware, however they require an\n" +
            "// arity of 4, aka the signature (err, req, res, next).\n" +
            "// when connect has an error, it will invoke ONLY error-handling\n" +
            "// middleware.\n" +
            "\n" +
            "// If we were to next() here any remaining non-error-handling\n" +
            "// middleware would then be executed, or if we next(err) to\n" +
            "// continue passing the error, only error-handling middleware\n" +
            "// would remain being executed, however here\n" +
            "// we simply respond with an error page.\n" +
            "\n" +
            "app.use(function(err, req, res, next){\n" +
            "  // we may use properties of the error object\n" +
            "  // here and next(err) appropriately, or if\n" +
            "  // we possibly recovered from the error, simply next().\n" +
            "  res.status(err.status || 500);\n" +
            "  res.render('500', { error: err });\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes219 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var escapeHtml = require('escape-html');\n" +
            "var express = require('../..');\n" +
            "var fs = require('fs');\n" +
            "var marked = require('marked');\n" +
            "var path = require('path');\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// register .md as an engine in express view system\n" +
            "\n" +
            "app.engine('md', function(path, options, fn){\n" +
            "  fs.readFile(path, 'utf8', function(err, str){\n" +
            "    if (err) return fn(err);\n" +
            "    var html = marked.parse(str).replace(/\\{([^}]+)\\}/g, function(_, name){\n" +
            "      return escapeHtml(options[name] || '');\n" +
            "    });\n" +
            "    fn(null, html);\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "app.set('views', path.join(__dirname, 'views'));\n" +
            "\n" +
            "// make it the default so we dont need .md\n" +
            "app.set('view engine', 'md');\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.render('index', { title: 'Markdown Example' });\n" +
            "});\n" +
            "\n" +
            "app.get('/fail', function(req, res){\n" +
            "  res.render('missing', { title: 'Markdown Example' });\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes220 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../..');\n" +
            "var multiparty = require('multiparty');\n" +
            "var format = require('util').format;\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.send('<form method=\"post\" enctype=\"multipart/form-data\">'\n" +
            "    + '<p>Title: <input type=\"text\" name=\"title\" /></p>'\n" +
            "    + '<p>Image: <input type=\"file\" name=\"image\" /></p>'\n" +
            "    + '<p><input type=\"submit\" value=\"Upload\" /></p>'\n" +
            "    + '</form>');\n" +
            "});\n" +
            "\n" +
            "app.post('/', function(req, res, next){\n" +
            "  // create a form to begin parsing\n" +
            "  var form = new multiparty.Form();\n" +
            "  var image;\n" +
            "  var title;\n" +
            "\n" +
            "  form.on('error', next);\n" +
            "  form.on('close', function(){\n" +
            "    res.send(format('\\nuploaded %s (%d Kb) as %s'\n" +
            "      , image.filename\n" +
            "      , image.size / 1024 | 0\n" +
            "      , title));\n" +
            "  });\n" +
            "\n" +
            "  // listen on field event for title\n" +
            "  form.on('field', function(name, val){\n" +
            "    if (name !== 'title') return;\n" +
            "    title = val;\n" +
            "  });\n" +
            "\n" +
            "  // listen on part event for image file\n" +
            "  form.on('part', function(part){\n" +
            "    if (!part.filename) return;\n" +
            "    if (part.name !== 'image') return part.resume();\n" +
            "    image = {};\n" +
            "    image.filename = part.filename;\n" +
            "    image.size = 0;\n" +
            "    part.on('data', function(buf){\n" +
            "      image.size += buf.length;\n" +
            "    });\n" +
            "  });\n" +
            "\n" +
            "\n" +
            "  // parse the form\n" +
            "  form.parse(req);\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(4000);\n" +
            "  console.log('Express started on port 4000');\n" +
            "}";
    public static final String codes221 = "\n" +
            "// install redis first:\n" +
            "// https://redis.io/\n" +
            "\n" +
            "// then:\n" +
            "// $ npm install redis online\n" +
            "// $ redis-server\n" +
            "\n" +
            "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../..');\n" +
            "var online = require('online');\n" +
            "var redis = require('redis');\n" +
            "var db = redis.createClient();\n" +
            "\n" +
            "// online\n" +
            "\n" +
            "online = online(db);\n" +
            "\n" +
            "// app\n" +
            "\n" +
            "var app = express();\n" +
            "\n" +
            "// activity tracking, in this case using\n" +
            "// the UA string, you would use req.user.id etc\n" +
            "\n" +
            "app.use(function(req, res, next){\n" +
            "  // fire-and-forget\n" +
            "  online.add(req.headers['user-agent']);\n" +
            "  next();\n" +
            "});\n" +
            "\n" +
            "/**\n" +
            " * List helper.\n" +
            " */\n" +
            "\n" +
            "function list(ids) {\n" +
            "  return '<ul>' + ids.map(function(id){\n" +
            "    return '<li>' + id + '</li>';\n" +
            "  }).join('') + '</ul>';\n" +
            "}\n" +
            "\n" +
            "/**\n" +
            " * GET users online.\n" +
            " */\n" +
            "\n" +
            "app.get('/', function(req, res, next){\n" +
            "  online.last(5, function(err, ids){\n" +
            "    if (err) return next(err);\n" +
            "    res.send('<p>Users online: ' + ids.length + '</p>' + list(ids));\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes222 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// Faux database\n" +
            "\n" +
            "var users = [\n" +
            "  { name: 'tj' }\n" +
            "  , { name: 'tobi' }\n" +
            "  , { name: 'loki' }\n" +
            "  , { name: 'jane' }\n" +
            "  , { name: 'bandit' }\n" +
            "];\n" +
            "\n" +
            "// Create HTTP error\n" +
            "\n" +
            "function createError(status, message) {\n" +
            "  var err = new Error(message);\n" +
            "  err.status = status;\n" +
            "  return err;\n" +
            "}\n" +
            "\n" +
            "// Convert :to and :from to integers\n" +
            "\n" +
            "app.param(['to', 'from'], function(req, res, next, num, name){\n" +
            "  req.params[name] = parseInt(num, 10);\n" +
            "  if( isNaN(req.params[name]) ){\n" +
            "    next(createError(400, 'failed to parseInt '+num));\n" +
            "  } else {\n" +
            "    next();\n" +
            "  }\n" +
            "});\n" +
            "\n" +
            "// Load user by id\n" +
            "\n" +
            "app.param('user', function(req, res, next, id){\n" +
            "  if (req.user = users[id]) {\n" +
            "    next();\n" +
            "  } else {\n" +
            "    next(createError(404, 'failed to find user'));\n" +
            "  }\n" +
            "});\n" +
            "\n" +
            "/**\n" +
            " * GET index.\n" +
            " */\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.send('Visit /user/0 or /users/0-2');\n" +
            "});\n" +
            "\n" +
            "/**\n" +
            " * GET :user.\n" +
            " */\n" +
            "\n" +
            "app.get('/user/:user', function(req, res, next){\n" +
            "  res.send('user ' + req.user.name);\n" +
            "});\n" +
            "\n" +
            "/**\n" +
            " * GET users :from - :to.\n" +
            " */\n" +
            "\n" +
            "app.get('/users/:from-:to', function(req, res, next){\n" +
            "  var from = req.params.from;\n" +
            "  var to = req.params.to;\n" +
            "  var names = users.map(function(user){ return user.name; });\n" +
            "  res.send('users ' + names.slice(from, to + 1).join(', '));\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes223 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// Ad-hoc example resource method\n" +
            "\n" +
            "app.resource = function(path, obj) {\n" +
            "  this.get(path, obj.index);\n" +
            "  this.get(path + '/:a..:b.:format?', function(req, res){\n" +
            "    var a = parseInt(req.params.a, 10);\n" +
            "    var b = parseInt(req.params.b, 10);\n" +
            "    var format = req.params.format;\n" +
            "    obj.range(req, res, a, b, format);\n" +
            "  });\n" +
            "  this.get(path + '/:id', obj.show);\n" +
            "  this.delete(path + '/:id', function(req, res){\n" +
            "    var id = parseInt(req.params.id, 10);\n" +
            "    obj.destroy(req, res, id);\n" +
            "  });\n" +
            "};\n" +
            "\n" +
            "// Fake records\n" +
            "\n" +
            "var users = [\n" +
            "  { name: 'tj' }\n" +
            "  , { name: 'ciaran' }\n" +
            "  , { name: 'aaron' }\n" +
            "  , { name: 'guillermo' }\n" +
            "  , { name: 'simon' }\n" +
            "  , { name: 'tobi' }\n" +
            "];\n" +
            "\n" +
            "// Fake controller.\n" +
            "\n" +
            "var User = {\n" +
            "  index: function(req, res){\n" +
            "    res.send(users);\n" +
            "  },\n" +
            "  show: function(req, res){\n" +
            "    res.send(users[req.params.id] || { error: 'Cannot find user' });\n" +
            "  },\n" +
            "  destroy: function(req, res, id){\n" +
            "    var destroyed = id in users;\n" +
            "    delete users[id];\n" +
            "    res.send(destroyed ? 'destroyed' : 'Cannot find user');\n" +
            "  },\n" +
            "  range: function(req, res, a, b, format){\n" +
            "    var range = users.slice(a, b + 1);\n" +
            "    switch (format) {\n" +
            "      case 'json':\n" +
            "        res.send(range);\n" +
            "        break;\n" +
            "      case 'html':\n" +
            "      default:\n" +
            "        var html = '<ul>' + range.map(function(user){\n" +
            "          return '<li>' + user.name + '</li>';\n" +
            "        }).join('\\n') + '</ul>';\n" +
            "        res.send(html);\n" +
            "        break;\n" +
            "    }\n" +
            "  }\n" +
            "};\n" +
            "\n" +
            "// curl http://localhost:3000/users     -- responds with all users\n" +
            "// curl http://localhost:3000/users/1   -- responds with user 1\n" +
            "// curl http://localhost:3000/users/4   -- responds with error\n" +
            "// curl http://localhost:3000/users/1..3 -- responds with several users\n" +
            "// curl -X DELETE http://localhost:3000/users/1  -- deletes the user\n" +
            "\n" +
            "app.resource('/users', User);\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.send([\n" +
            "    '<h1>Examples:</h1> <ul>'\n" +
            "    , '<li>GET /users</li>'\n" +
            "    , '<li>GET /users/1</li>'\n" +
            "    , '<li>GET /users/3</li>'\n" +
            "    , '<li>GET /users/1..3</li>'\n" +
            "    , '<li>GET /users/1..3.json</li>'\n" +
            "    , '<li>DELETE /users/4</li>'\n" +
            "    , '</ul>'\n" +
            "  ].join('\\n'));\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes224 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var escapeHtml = require('escape-html')\n" +
            "var express = require('../../lib/express');\n" +
            "\n" +
            "var verbose = process.env.NODE_ENV !== 'test'\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "app.map = function(a, route){\n" +
            "  route = route || '';\n" +
            "  for (var key in a) {\n" +
            "    switch (typeof a[key]) {\n" +
            "      // { '/path': { ... }}\n" +
            "      case 'object':\n" +
            "        app.map(a[key], route + key);\n" +
            "        break;\n" +
            "      // get: function(){ ... }\n" +
            "      case 'function':\n" +
            "        if (verbose) console.log('%s %s', key, route);\n" +
            "        app[key](route, a[key]);\n" +
            "        break;\n" +
            "    }\n" +
            "  }\n" +
            "};\n" +
            "\n" +
            "var users = {\n" +
            "  list: function(req, res){\n" +
            "    res.send('user list');\n" +
            "  },\n" +
            "\n" +
            "  get: function(req, res){\n" +
            "    res.send('user ' +  escapeHtml(req.params.uid))\n" +
            "  },\n" +
            "\n" +
            "  delete: function(req, res){\n" +
            "    res.send('delete users');\n" +
            "  }\n" +
            "};\n" +
            "\n" +
            "var pets = {\n" +
            "  list: function(req, res){\n" +
            "    res.send('user ' + escapeHtml(req.params.uid) + '\\'s pets')\n" +
            "  },\n" +
            "\n" +
            "  delete: function(req, res){\n" +
            "    res.send('delete ' + escapeHtml(req.params.uid) + '\\'s pet ' + escapeHtml(req.params.pid))\n" +
            "  }\n" +
            "};\n" +
            "\n" +
            "app.map({\n" +
            "  '/users': {\n" +
            "    get: users.list,\n" +
            "    delete: users.delete,\n" +
            "    '/:uid': {\n" +
            "      get: users.get,\n" +
            "      '/pets': {\n" +
            "        get: pets.list,\n" +
            "        '/:pid': {\n" +
            "          delete: pets.delete\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes225 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../lib/express');\n" +
            "\n" +
            "var app = express();\n" +
            "\n" +
            "// Example requests:\n" +
            "//     curl http://localhost:3000/user/0\n" +
            "//     curl http://localhost:3000/user/0/edit\n" +
            "//     curl http://localhost:3000/user/1\n" +
            "//     curl http://localhost:3000/user/1/edit (unauthorized since this is not you)\n" +
            "//     curl -X DELETE http://localhost:3000/user/0 (unauthorized since you are not an admin)\n" +
            "\n" +
            "// Dummy users\n" +
            "var users = [\n" +
            "  { id: 0, name: 'tj', email: 'tj@vision-media.ca', role: 'member' }\n" +
            "  , { id: 1, name: 'ciaran', email: 'ciaranj@gmail.com', role: 'member' }\n" +
            "  , { id: 2, name: 'aaron', email: 'aaron.heckmann+github@gmail.com', role: 'admin' }\n" +
            "];\n" +
            "\n" +
            "function loadUser(req, res, next) {\n" +
            "  // You would fetch your user from the db\n" +
            "  var user = users[req.params.id];\n" +
            "  if (user) {\n" +
            "    req.user = user;\n" +
            "    next();\n" +
            "  } else {\n" +
            "    next(new Error('Failed to load user ' + req.params.id));\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "function andRestrictToSelf(req, res, next) {\n" +
            "  // If our authenticated user is the user we are viewing\n" +
            "  // then everything is fine :)\n" +
            "  if (req.authenticatedUser.id === req.user.id) {\n" +
            "    next();\n" +
            "  } else {\n" +
            "    // You may want to implement specific exceptions\n" +
            "    // such as UnauthorizedError or similar so that you\n" +
            "    // can handle these can be special-cased in an error handler\n" +
            "    // (view ./examples/pages for this)\n" +
            "    next(new Error('Unauthorized'));\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "function andRestrictTo(role) {\n" +
            "  return function(req, res, next) {\n" +
            "    if (req.authenticatedUser.role === role) {\n" +
            "      next();\n" +
            "    } else {\n" +
            "      next(new Error('Unauthorized'));\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "// Middleware for faux authentication\n" +
            "// you would of course implement something real,\n" +
            "// but this illustrates how an authenticated user\n" +
            "// may interact with middleware\n" +
            "\n" +
            "app.use(function(req, res, next){\n" +
            "  req.authenticatedUser = users[0];\n" +
            "  next();\n" +
            "});\n" +
            "\n" +
            "app.get('/', function(req, res){\n" +
            "  res.redirect('/user/0');\n" +
            "});\n" +
            "\n" +
            "app.get('/user/:id', loadUser, function(req, res){\n" +
            "  res.send('Viewing user ' + req.user.name);\n" +
            "});\n" +
            "\n" +
            "app.get('/user/:id/edit', loadUser, andRestrictToSelf, function(req, res){\n" +
            "  res.send('Editing user ' + req.user.name);\n" +
            "});\n" +
            "\n" +
            "app.delete('/user/:id', loadUser, andRestrictTo('admin'), function(req, res){\n" +
            "  res.send('Deleted user ' + req.user.name);\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes226 = "/**\n" +
            " * Module dependencies.\n" +
            " */\n" +
            "\n" +
            "var express = require('../../');\n" +
            "\n" +
            "var app = module.exports = express();\n" +
            "\n" +
            "// create an error with .status. we\n" +
            "// can then use the property in our\n" +
            "// custom error handler (Connect respects this prop as well)\n" +
            "\n" +
            "function error(status, msg) {\n" +
            "  var err = new Error(msg);\n" +
            "  err.status = status;\n" +
            "  return err;\n" +
            "}\n" +
            "\n" +
            "// if we wanted to supply more than JSON, we could\n" +
            "// use something similar to the content-negotiation\n" +
            "// example.\n" +
            "\n" +
            "// here we validate the API key,\n" +
            "// by mounting this middleware to /api\n" +
            "// meaning only paths prefixed with \"/api\"\n" +
            "// will cause this middleware to be invoked\n" +
            "\n" +
            "app.use('/api', function(req, res, next){\n" +
            "  var key = req.query['api-key'];\n" +
            "\n" +
            "  // key isn't present\n" +
            "  if (!key) return next(error(400, 'api key required'));\n" +
            "\n" +
            "  // key is invalid\n" +
            "  if (!~apiKeys.indexOf(key)) return next(error(401, 'invalid api key'));\n" +
            "\n" +
            "  // all good, store req.key for route access\n" +
            "  req.key = key;\n" +
            "  next();\n" +
            "});\n" +
            "\n" +
            "// map of valid api keys, typically mapped to\n" +
            "// account info with some sort of database like redis.\n" +
            "// api keys do _not_ serve as authentication, merely to\n" +
            "// track API usage or help prevent malicious behavior etc.\n" +
            "\n" +
            "var apiKeys = ['foo', 'bar', 'baz'];\n" +
            "\n" +
            "// these two objects will serve as our faux database\n" +
            "\n" +
            "var repos = [\n" +
            "  { name: 'express', url: 'https://github.com/expressjs/express' },\n" +
            "  { name: 'stylus', url: 'https://github.com/learnboost/stylus' },\n" +
            "  { name: 'cluster', url: 'https://github.com/learnboost/cluster' }\n" +
            "];\n" +
            "\n" +
            "var users = [\n" +
            "  { name: 'tobi' }\n" +
            "  , { name: 'loki' }\n" +
            "  , { name: 'jane' }\n" +
            "];\n" +
            "\n" +
            "var userRepos = {\n" +
            "  tobi: [repos[0], repos[1]]\n" +
            "  , loki: [repos[1]]\n" +
            "  , jane: [repos[2]]\n" +
            "};\n" +
            "\n" +
            "// we now can assume the api key is valid,\n" +
            "// and simply expose the data\n" +
            "\n" +
            "// example: http://localhost:3000/api/users/?api-key=foo\n" +
            "app.get('/api/users', function(req, res, next){\n" +
            "  res.send(users);\n" +
            "});\n" +
            "\n" +
            "// example: http://localhost:3000/api/repos/?api-key=foo\n" +
            "app.get('/api/repos', function(req, res, next){\n" +
            "  res.send(repos);\n" +
            "});\n" +
            "\n" +
            "// example: http://localhost:3000/api/user/tobi/repos/?api-key=foo\n" +
            "app.get('/api/user/:name/repos', function(req, res, next){\n" +
            "  var name = req.params.name;\n" +
            "  var user = userRepos[name];\n" +
            "\n" +
            "  if (user) res.send(user);\n" +
            "  else next();\n" +
            "});\n" +
            "\n" +
            "// middleware with an arity of 4 are considered\n" +
            "// error handling middleware. When you next(err)\n" +
            "// it will be passed through the defined middleware\n" +
            "// in order, but ONLY those with an arity of 4, ignoring\n" +
            "// regular middleware.\n" +
            "app.use(function(err, req, res, next){\n" +
            "  // whatever you want here, feel free to populate\n" +
            "  // properties on `err` to treat it differently in here.\n" +
            "  res.status(err.status || 500);\n" +
            "  res.send({ error: err.message });\n" +
            "});\n" +
            "\n" +
            "// our custom JSON 404 middleware. Since it's placed last\n" +
            "// it will be the last middleware called, if all others\n" +
            "// invoke next() and do not respond.\n" +
            "app.use(function(req, res){\n" +
            "  res.status(404);\n" +
            "  res.send({ error: \"Sorry, can't find that\" })\n" +
            "});\n" +
            "\n" +
            "/* istanbul ignore next */\n" +
            "if (!module.parent) {\n" +
            "  app.listen(3000);\n" +
            "  console.log('Express started on port 3000');\n" +
            "}";
    public static final String codes227 = "colors = { \"color1\": \"Red\", \"color2\": \"Green\", 'color3': \"Blue\" };\n" +
            "\n" +
            "$.each(colors, function(key, value) {\n" +
            "    $('#divSelect').append($(\"<option/>\", {\n" +
            "        value: key,\n" +
            "        text: value\n" +
            "    }));\n" +
            "});\n";
    public static final String codes228 = "var obj1 = { what: \"A regular JS object\" },\n" +
            "obj2 = $('body');\n" +
            "\n" +
            "if ( obj1.jquery )\n" +
            "{\n" +
            "     console.log('obj1 is a jQuery object.');    \n" +
            "}\n" +
            "\n" +
            "if (obj2.jquery )\n" +
            "{ \n" +
            "      console.log('obj2 is a jQuery object.');\n" +
            "}\n";
    public static final String codes229 = "var element = $('<h1>',{\n" +
            "    text : \"jQuery\",\n" +
            "    class : \"test\"\n" +
            "});\n" +
            "\n" +
            "$('#output').text( element.get(0).outerHTML);\n";
    public static final String codes230 = "var y = ['Red', 'Green', 'White', 'black', 'Yellow'];\n" +
            "var remove_Item = 'White';\n" +
            "\n" +
            "console.log('Array before removing the element = '+y);\n" +
            "y = $.grep(y, function(value) {\n" +
            "  return value != remove_Item;\n" +
            "});\n" +
            "console.log('Array after removing the element = '+y);\n";
    public static final String codes231 = "$( document ).ajaxComplete(function() {\n" +
            "  $( \".log\" ).text( \"Triggered ajaxComplete handler.\" );\n" +
            "});\n" +
            "\n" +
            "$( \".jquery\" ).click(function() {\n" +
            "  $( \".result\" ).load( \"https://www.w3resource.com/jquery-exercises/jq-ajax-test.html\" );\n" +
            "});\n";
    public static final String codes232 = "// Sample function (f1) to be added to a callbacks list\n" +
            "var f1 = function( value1, value2 ) {\n" +
            "  console.log( \"f1: \" + value1 + \",\" + value2 );\n" +
            "};\n" +
            " \n" +
            "// Another function (f2) to also be added to the list\n" +
            "var f2 = function( value1, value2 ) {\n" +
            "  console.log( \"f2: \" + value1 + \",\" + value2 );\n" +
            "};\n" +
            " \n" +
            "var callbacks = $.Callbacks();\n" +
            " \n" +
            "// Add the two functions\n" +
            "callbacks.add( f1 );\n" +
            "callbacks.add( f2 );\n" +
            " \n" +
            "// Empty all callbacks\n" +
            "callbacks.empty();\n" +
            " \n" +
            "// Test to confirm all callbacks have been removed\n" +
            "console.log( callbacks.has( f1 ) );\n" +
            "console.log( callbacks.has( f2 ) );\n";
    public static final String codes233 = "var f1 = function( value ) {\n" +
            "  console.log( \"f1: \" + value );\n" +
            "};\n" +
            "\n" +
            "var f2 = function( value ) {\n" +
            "  console.log( \"f2: \" + value );\n" +
            "};\n" +
            " \n" +
            "var callbacks = $.Callbacks();\n" +
            " \n" +
            "// Add the function \"f1\" to the list\n" +
            "callbacks.add(f1);\n" +
            " \n" +
            "// Fire the above items\n" +
            "callbacks.fire( \"jQuery\" );\n" +
            "\n" +
            " \n" +
            "// Add the function f2 to the list\n" +
            "callbacks.add(f2 );\n" +
            " \n" +
            "// Fire the above items  again\n" +
            "callbacks.fire( \"Javascript\" );\n" +
            " \n" +
            "// Outputs:\n" +
            "// \"foo: world\"\n" +
            "// \"bar: world\"\n";
    public static final String codes234 = "// A sample function f1 to be added to a callbacks list\n" +
            "var f1 = function( value ) {\n" +
            "  console.log( \"f1:\" + value );\n" +
            "};\n" +
            " \n" +
            "var callbacks = $.Callbacks();\n" +
            " \n" +
            "// Add f1 to the callback list\n" +
            "callbacks.add( f1 );\n" +
            " \n" +
            "// Fire the items on the list, passing an argument\n" +
            "callbacks.fire( \"JavaScript\" );\n" +
            "\n" +
            "\n" +
            "// Lock the callbacks list\n" +
            "callbacks.lock();\n" +
            " \n" +
            "// Try firing the items again\n" +
            "callbacks.fire( \"jQuery\" );\n" +
            "\n" +
            "//As the list was locked, no items were called,\n" +
            "// so \"jQuery\" isn't logged\n";
    public static final String codes235 = "$( \"p\" ).on( \"test.myNamespace\", function( event ) {\n" +
            "console.log(event.namespace );\n" +
            "});\n" +
            "$( \"button\" ).click(function( event ) {\n" +
            "$( \"p\" ).trigger( \"test.myNamespace\" );\n" +
            "});\n";
    public static final String codes236 = "$(\"h3\").each(function(i){\n" +
            "   $(this).on(\"click\", {x:i}, function(event){\n" +
            "     var info = \"Header\" + $(this).index() + \". paragraph has Event data: \" + event.data.x;    \n" +
            "    $(\"<p>\"+info+\"</p>\").appendTo( \"body\" );      \n" +
            "   });\n" +
            "});\n";


}

