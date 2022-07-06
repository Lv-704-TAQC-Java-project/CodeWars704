package com.org.ita.utils;

public enum Tasks {
    TASK_8_1(1, "Keep Hydrated!",
            "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value."),
    TASK_8_2(2, "Volume of a cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.\n" +
                    "Write a function to help Bob with this calculation."),
    TASK_8_3(3, "Miles per gallon to kilometers per liter",
            "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input)."),
    TASK_8_4(4, "To square root or no to square",
            "Write a method, that will get an integer array as parameter and will process every number from this array.\n" +
                    "Return a new array with processing every number of the input-array like this:\n" +
                    "If the number has an integer square root, take this, otherwise square the number."),
    TASK_8_5(5, "Count of positives / sum of negatives",
            "Given an array of integers." +
                    "\n" +
                    "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers." +
                    "\n" +
                    "If the input array is empty or null, return an empty array."),
    TASK_8_6(6, "Convert a String to a Number!",
            "We need a function that can transform a string into a number. What ways of achieving this do you know?"),
    TASK_8_7(7, "Willson primes",
            "Wilson primes satisfy the following condition. Let P represent a prime number." +
                    "\n" +
                    "Then ((P-1)! + 1) / (P * P) should give a whole number." +
                    "\n" +
                    "Your task is to create a function that returns true if the given number is a Wilson prime."),
    TASK_8_8(8, "Formatting decimal places",
            "Each number should be formatted that it is rounded to two decimal places.\n" +
                    "You don't need to check whether the input is a valid number because only valid numbers are used in the tests."),
    TASK_8_9(9, "Find numbers which are divisible by given number",
            "Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.\n" +
                    "First argument is an array of numbers and the second is the divisor."),
    TASK_7_1(10, "Looking for a benefactor",
            "The accounts of the \"Fat to Fit Club (FFC)\" association are supervised by John as a volunteered accountant.\n" +
                    "The association is funded through financial donations from generous benefactors.\n" +
                    "John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15]." +
                    "\nHe wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30.\n" +
                    "After doing the math he found 149. He thinks that he made a mistake. Could you help him?\n" +
                    "\n" +
                    "if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149\n" +
                    "\n" +
                    "The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer) that will permit to reach the average navg.\n" +
                    "\n" +
                    "Should the last donation be a non positive number (<= 0) John wants us to throw (or raise) an error or\n" +
                    "\n" +
                    "return Nothing in Haskell\n" +
                    "return None in F#, Ocaml, Scala\n" +
                    "return -1 in C, Fortran, Nim, PowerShell, Go, Pascal, Prolog, Lua, Perl\n" +
                    "echo ERROR in Shell\n" +
                    "raise-argument-error in Racket\n" +
                    "so that he clearly sees that his expectations are not great enough.\n" +
                    "\n" +
                    "Notes:\n" +
                    "\n" +
                    "all donations and navg are numbers (integers or floats), arr can be empty."),
    TASK_7_2(11, "Sum of the first nth term of Series",
            "Your task is to write a function which returns the sum of following series upto nth term(parameter).\n" +
                    "\n" +
                    "Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...\n" +
                    "Rules:\n" +
                    "You need to round the answer to 2 decimal places and return it as String.\n" +
                    "\n" +
                    "If the given value is 0 then it should return 0.00\n" +
                    "\n" +
                    "You will only be given Natural Numbers as arguments."),
    TASK_7_3(12, "Where is Vasya?",
            "Vasya stands in line with number of people p (including Vasya), but he doesn't know exactly which position he occupies." +
                    "\nHe can say that there are no less than b people standing in front of him and no more than a people standing behind him." +
                    "\nFind the number of different positions Vasya can occupy.\n" +
                    "\n" +
                    "Input\n" +
                    "As an input you have 3 numbers:\n" +
                    "\n" +
                    "1. Total amount of people in the line;\n" +
                    "\n" +
                    "2. Number of people standing in front of him\n" +
                    "\n" +
                    "3. Number of people standing behind him"),
    TASK_6_1(13, "Build a pile of Cubes",
            "Your task is to construct a building which will be a pile of n cubes." +
                    "\nThe cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.\n" +
                    "\n" +
                    "You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?\n" +
                    "\n" +
                    "The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m\nand you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n."),
    TASK_6_2(14, "Easy balance checking",
            "You are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string:\n" +
                    "\n" +
                    "\"1000.00\n" +
                    "125 Market 125.45\n" +
                    "126 Hardware 34.95\n" +
                    "127 Video 7.45\n" +
                    "128 Book 14.32\n" +
                    "129 Gasoline 16.10\"\n" +
                    "The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount.\n(Input form may change depending on the language).\n" +
                    "\n" +
                    "First you have to clean the lines keeping only letters, digits, dots and spaces.\n" +
                    "\n" +
                    "Then return a report as a string (underscores show spaces -- don't put them in your solution." +
                    "\nThey are there so you can see them and how many of them you need to have):\n" +
                    "\n" +
                    "\"Original_Balance:_1000.00\n" +
                    "125_Market_125.45_Balance_874.55\n" +
                    "126_Hardware_34.95_Balance_839.60\n" +
                    "127_Video_7.45_Balance_832.15\n" +
                    "128_Book_14.32_Balance_817.83\n" +
                    "129_Gasoline_16.10_Balance_801.73\n" +
                    "Total_expense__198.27\n" +
                    "Average_expense__39.65\"\n" +
                    "On each line of the report you have to add the new balance and then in the last two lines the total expense and the average expense." +
                    "\nSo as not to have a too long result string we don't ask for a properly formatted result.\n" +
                    "\n" +
                    "Notes\n" +
                    "See input examples in Sample Tests.\n" +
                    "It may happen that one (or more) line(s) is (are) blank.\n" +
                    "Round to 2 decimals your results.\n" +
                    "The line separator of results may depend on the language \\n or \\r\\n. See examples in the \"Sample tests\".\n" +
                    "R language: Don't use R's base function \"mean()\" that could give results slightly different from expected ones."),
    TASK_6_3(15, "Floating-point Approximation (I)",
            "Consider the function\n" +
                    "\n" +
                    "f: x -> sqrt(1 + x) - 1 at x = 1e-15.\n" +
                    "\n" +
                    "We get: f(x) = 4.44089209850062616e-16\n" +
                    "\n" +
                    "or something around that, depending on the language.\n" +
                    "\n" +
                    "This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region." +
                    "\nUsing pow instead of sqrt doesn't give better results.\n" +
                    "\n" +
                    "A \"good\" answer is 4.99999999999999875... * 1e-16.\n" +
                    "\n" +
                    "Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?\n" +
                    "\n" +
                    "Note:\n" +
                    "Don't round or truncate your results. See the testing function in Sample Tests:."),
    TASK_6_4(16, "Rainfall",
            "dataand data1 are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by \\n." +
                    "\nThe name of each town is followed by :.\n" +
                    "\n" +
                    "data and towns can be seen in \"Your Test Cases:\".\n" +
                    "\n" +
                    "Task:\n" +
                    "function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).\n" +
                    "function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.\n" +
                    "Examples:\n" +
                    "mean(\"London\", data), 51.19(9999999999996) \n" +
                    "variance(\"London\", data), 57.42(833333333374)\n" +
                    "Notes:\n" +
                    "if functions mean or variance have as parameter town a city which has no records return -1 or -1.0 (depending on the language)\n" +
                    "Don't truncate or round: the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.\n" +
                    "Shell tests only variance"),
    TASK_6_5(17, "Ranking NBA",
            "You are given a string with results of NBA teams (see the data in \"Sample Tests\") separated by commas e.g:\n" +
                    "\n" +
                    "r = Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112, Los Angeles Clippers 100 Boston Celtics 120.\n" +
                    "\n" +
                    "A team name is composed of one, two or more words built with letters or digits: Atlanta Hawks, Philadelphia 76ers...\n" +
                    "\n" +
                    "Given a string of results and the name of a team (parameter : to_find) your function nba_cup (or nbaCup or ...) will return as a string\n" +
                    "\n" +
                    "the name of the team followed by : and\n" +
                    "the number of matches won by the team\n" +
                    "the number of draws\n" +
                    "the number of matches lost by the team\n" +
                    "the total number of points scored by the team\n" +
                    "the total number of points conceded by the team\n" +
                    "and finally a kind of marks in our ranking system\n" +
                    "\n" +
                    "a team marks 3 if it is a win\n" +
                    "a team marks 1 if it is a draw\n" +
                    "a team marks 0 if it is a loss.\n" +
                    "The return format is:\n" +
                    "\n" +
                    "\"Team Name:W=nb of wins;D=nb of draws;L=nb of losses;Scored=nb;Conceded=nb;Points=nb\"\n" +
                    "Remarks:\n" +
                    "The team name \"\" returns \"\".\n" +
                    "\n" +
                    "If a team name can't be found in the given string of results you will return \"Team Name:This team didn't play!\" (See examples below).\n" +
                    "\n" +
                    "The scores must be integers. If a score is a float number (abc.xyz...) you will return: \"Error(float number):the concerned string\""),
    TASK_6_6(18, "Help the bookseller!",
            "A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more characters." +
                    "\nThe 1st character of a code is a capital letter which defines the book category.\n" +
                    "\n" +
                    "In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.\n" +
                    "\n" +
                    "For example an extract of a stocklist could be:\n" +
                    "\n" +
                    "L = {\"ABART 20\", \"CDXEF 50\", \"BKWRK 25\", \"BTSQZ 89\", \"DRTYM 60\"}.\n" +
                    "or\n" +
                    "L = [\"ABART 20\", \"CDXEF 50\", \"BKWRK 25\", \"BTSQZ 89\", \"DRTYM 60\"] or ....\n" +
                    "You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :\n" +
                    "\n" +
                    "M = {\"A\", \"B\", \"C\", \"W\"} \n" +
                    "or\n" +
                    "M = [\"A\", \"B\", \"C\", \"W\"] or ...\n" +
                    "and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.\n" +
                    "\n" +
                    "For the lists L and M of example you have to return the string (in Haskell/Clojure/Racket a list of pairs):\n" +
                    "\n" +
                    "(A : 20) - (B : 114) - (C : 50) - (W : 0)\n" +
                    "where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum corresponding to \"BKWRK\" and \"BTSQZ\"," +
                    "\n50 corresponding to \"CDXEF\" and 0 to category 'W' since there are no code beginning with W.\n" +
                    "\n" +
                    "If L or M are empty return string is \"\" (Clojure and Racket should return an empty array/list instead).\n" +
                    "\n" +
                    "Note:\n" +
                    "In the result codes and their values are in the same order as in M."),
    TASK_5_1(19, "Artificial Rain",
            "Little Petya often visits his grandmother in the countryside. The grandmother has a large vertical garden, which can be represented as a set of n rectangles of varying height.\nDue to the newest irrigation system we can create artificial rain above them.\n" +
                    "\n" +
                    "Creating artificial rain is an expensive operation. That's why we limit ourselves to creating the artificial rain only above one section.\nThe water will then flow to the neighbouring sections but only if each of their heights does not exceed the height of the previous watered section.\n" +
                    "\n"),
    TASK_5_2(20, "Gap in Primes",
            "The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4." +
                    "\nBetween 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43\n" +
                    "\n" +
                    "A prime gap of length n is a run of n-1 consecutive composite numbers between two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).\n" +
                    "\n" +
                    "We will write a function gap with parameters:\n" +
                    "\n" +
                    "g (integer >= 2) which indicates the gap we are looking for\n" +
                    "\n" +
                    "m (integer > 2) which gives the start of the search (m inclusive)\n" +
                    "\n" +
                    "n (integer >= m) which gives the end of the search (n inclusive)\n" +
                    "\n" +
                    "n won't go beyond 1100000.\n" +
                    "\n" +
                    "In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.\n" +
                    "\n" +
                    "So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these numbers exist" +
                    "\notherwise `nil or null or None or Nothing (or ... depending on the language)."),
    TASK_5_3(21, "Trailing zeros in factorial",
            "Write a program that will calculate the number of trailing zeros in a factorial of a given number.\n" +
                    "\n" +
                    "N! = 1 * 2 * 3 * ... * N\n" +
                    "\n" +
                    "Be careful 1000! has 2568 digits..."),
    TASK_5_4(22, "Perimeter of squares in a rectangle",
            "The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares is :" +
                    "\n4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80\n" +
                    "\nThe function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.\n" +
                    "\n" +
                    "perimeter(5)  should return 80\n" +
                    "perimeter(7)  should return 216"),
    TASK_5_5(23, "Which x for that sum?",
            "Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.\n" +
                    "\n" +
                    "When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.\n" +
                    "\n" +
                    "Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).\n" +
                    "\n" +
                    "Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity."),
    TASK_5_6(24, "Find the smallest",
            "You have a positive number n consisting of digits. You can do at most one operation:" +
                    "\nChoosing the index of a digit in the number, remove this digit at that index and insert it back to another" +
                    "\nor at the same place in the number in order to find the smallest number you can get.\n" +
                    "\n" +
                    "Task:\n" +
                    "Return an array or a tuple or a string depending on the language (see \"Sample Tests\") with\n" +
                    "\n" +
                    "1. the smallest number you got\n" +
                    "2. the index i of the digit d you took, i as small as possible\n" +
                    "3. the index j (as small as possible) where you insert this digit d to have the smallest number.");

    private final int id;
    private final String taskName;
    private final String description;

    Tasks(int id, String taskName, String description) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public static Tasks getTaskById(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task;
            }
        }
        return null;
    }

    public static String getDescriptionById(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task.description;
            }
        }
        return " ";
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }
}