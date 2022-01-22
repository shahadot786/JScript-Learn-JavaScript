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
    public static final String codes84 = "";
    public static final String codes85 = "";
    public static final String codes86 = "";
    public static final String codes87 = "";
    public static final String codes88 = "";
    public static final String codes89 = "";
    public static final String codes90 = "";
    public static final String codes91 = "";
    public static final String codes92 = "";
    public static final String codes93 = "";
    public static final String codes94 = "";
    public static final String codes95 = "";
    public static final String codes96 = "";
    public static final String codes97 = "";
    public static final String codes98 = "";
    public static final String codes99 = "";
    public static final String codes100 = "";
    public static final String codes101 = "";
    public static final String codes102 = "";
    public static final String codes103 = "";
    public static final String codes104 = "";
    public static final String codes105 = "";
    public static final String codes106 = "";
    public static final String codes107 = "";
    public static final String codes108 = "";
    public static final String codes109 = "";
    public static final String codes110 = "";
    public static final String codes111 = "";
    public static final String codes112 = "";
    public static final String codes113 = "";
    public static final String codes114 = "";
    public static final String codes115 = "";
    public static final String codes116 = "";
    public static final String codes117 = "";
    public static final String codes118 = "";
    public static final String codes119 = "";
    public static final String codes120 = "";
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

