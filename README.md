# DistinctLettersCount

## Description:
Count the minimum number of letters that must be deleted from a word to create a word in which no two letters occur the same number of times.


## Constraints:

1. The minimum character number of the input line is 1.
2. The maximum character number of the input line is 300000.
3. The string value consists of only lowercase letters (a-z).

## Program Specification:

Write a program in Java, which can be run on the command line in order to solve this problem. 
The program should take one command line argument, which contains the path to a text file. 
This text file should contain several lines, each line describing one test case for the problem.


Each line contains a word S consisting of N lowercase letters. 
The minimum number of letters should be returned that must be deleted to obtain a word in which every letter occurs a unique number of times. 
The occurences of letters that appear at least one in result are the only considered ones.


In case of a constraint violation, your program should indicate this fact to the user, 
for example by throwing an exception with a descriptive message, allowing the user to address this problem.


### Sample Input

A sample input file looks like this:


```

aaaabbbb

ccaaffddecee

eeee

example

```


### Sample Output

The solution for each test case should be printed out on a single line. 
On this line you should print the line number and the solution value. 
If there is no need to delete any character then print 0.


The sample output for the sample input file above should look like this:



```

1- 1

2- 6

3- 0

4- 4

```


## Concluding Remarks


Apply best software design, development, clean code and test practices and document your approach, 
in particular regarding the algorithms and data structures you choose. Don't forget to put comments into your source files. 
