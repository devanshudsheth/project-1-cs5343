# project-1-cs5343
I/O, selection

25 points
1. Write a class called "EvaluateTemperature".  Its main method should use a 
   Scanner to input an integer representing a temperature and a string
   of either C or F for Celsius or Fahrenheit.  If Celsius, convert it to 
   Fahrenheit.  Then use the table below to evaluate and print the temperature
   description.

    Fahrenheit ranges
     < 0   Extremely cold
    0-32   Very cold
    33-50  Cold
    51-70  Mild
    71-90  Warm
    91-100 Hot
    > 100  Very hot


Arrays, 1D and 2D

2. Write a class called "Scores".  Its main method should use a Scanner
   to input the name and 5 quiz scores for each of 10 different people.  
   Store the names in a 1D-array, and the scores in a 2D-array.  Then print 
   each name and the average score of the student.  


Classes and Objects

3. Write a class called "Square".  It should store the length of one side.
   It should have two constructors, one that has no parameters and sets
   the side length to one.  The other constructor should take one parameter
   and set the side length to the parameter value.  The class should also
   have a method call "getArea" that returns the area of the square.

   Write a separate class called "TestSquare" that creates two squares, 
   one with each constructor, and prints the area of each.


Generic classes

4.  Write a generic class called "MyFour".  It should use a type parameter
    of "T".  It should have four fields, item1, item2, item3, item4, all of
    type T.  Its constructor receives values for setting all four items.  It
    should have a method "allEqual" that returns true if all four items are
    equal according to their "equals" method.  It should have a method called
    "shiftLeft" that shifts all items up one position, and puts the first
    item's value into the last item.  

    For example, if list has 1, 2, 3, 4, then after shiftLeft, it is 2, 3, 4, 1.

    It should have a "toString" method that returns a String of the items 
    in this format: (item1, item2, item3, item4).

    Finally, add a "main" method.  First it should create a MyFour object 
    of type String, passing it four identical strings.  Print the object, then
    call and print the results of "allEqual".  Next, create an object of four
    different Integers.  Again print the object and print the results of 
    "allEqual".  After that, shift the items left using your method, and 
    print them again.
