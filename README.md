# JetsProject

## Description
This Jets Application displays a menu with options of

- List Fleet
- Fly all jets
- View fastest jet
- View longest range jet
- Load all Cargo jets
- Dogfight!
- Add jet to fleet
- Remove jet from fleet
- Quit

This Jets Application has 5 jets already implemented into the fleet by a text file. 
The user can remove or add as many jets as they would like, as well as viewing 
all of their properties. 

I used an abstract class to define all the methods and properties that jets have in
common, keeping the code DRY.
I also took advantage of interfaces to define the methods of unique types of jets.


# Lessons Learned
I learned how to use error handling with user input in a menu. This prevents the 
program from breaking unexpectedly with user interaction.

I also learned the importance of using polymorphism and inheritance when dealing
with multiples of the same object but with different properties. 

Abstract Classes
- Cannot be instantiated
- They allow the definition of methods and fields shared by subclass classes
- Keeps the boiler plate in one file, making the code more readable
- Subclasses can only have one Superclass

Interface Classes
- Cannot be instantiated
- Allows multiple inheritance
- Does not implement logic into methods
- Defines required methods that a class must implement

# Technologies Used

