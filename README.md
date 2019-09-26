# Google Interview Question Practice

LabK Instructions: 
Write an application that a driver can use at the entrance of a parking structure to to reserve a parking space. Create a complete Java program that does the following:

Using a 3-dimensional array of chars, store information about a parking structure of 3 floors with each floor having the size 8 * 8
An element in the map array can be either a road block, a parking space block, or a building block (say, an elevator shaft). People can only park in parking space blocks. Each car takes up one space.
Each cell should have a unique identifier so the user can remember which spot they picked. For example, 215 can represent a parking space at floor 2, row 1, column 5.  Use the array indices, which are 0-based.
The program should allow users to print the map of each floor and see which spots are occupied and which spots are empty. Different types of blocks should display differently. The row and column numbers should also be printed somewhere in the printout.
The program should allow users to pick a parking spot from a floor using the unique identifier. Print out the map so the user can see which spots are available. Once the spot is picked, the spot becomes unavailable. 
After the user picks the spot, the program should display the parking information.
The program should present the users with a reasonable menu. After the users perform each action, it should return to the menu.
Use Scanners and System.out.printf and System.out.println() for I/O
