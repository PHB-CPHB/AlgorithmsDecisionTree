# AlgorithmsDecisionTree

## Assignment

A decision tree is used for classification problems.A  decision  tree  consists  of  internal nodes  (nodes  with  subtrees)  and  leaves  (terminal  nodes,  nodes without subtrees).
The links from the root node to a leaf is called a branch.You have a collection of information when you use the tree. Each internal node contains a question, and the supplied information will determine which link to follow from the node. 

In the general case there  can  be  several  answers  and  different  questions  in  the  different  branches  and  branches  of  different length. The leaves will contain the final classification.In the simple case we will use here with a binary tree there will be two   answers (yes/no – 1/0) and the questions will be the same in each branch.

Make a decision tree for warning students.A  student  will  come  with  4  items  of  information:
 - **“Read  textbook”**
 - **“Hand  ins  made  in  time”**
 - **“Attend lectures”**
 - **“Make exercises”** 
 
E.g. for a nice student (yes, yes, yes, yes).

The classification should be “You could easily fail the exam” in the following cases:
 - **“Hand ins made in time = no“**
 - **“Attend lectures and Read textbook = no”**
 - **“Attend lectures and Make exercises = no”**
 
The classification should be “You should be able to pass the exam” in all other cases

## Decsion Tree

I made the decsion tree like this

![alt text](https://github.com/philliphb/AlgorithmsDecisionTree/blob/master/DecsionTree.png "Decsion Tree")

## Requirements
- Java
- Netbeans

## Instalition
- Use Git clone or fork the project to your own machine.

## Usage
- Open the project in Netbeans
- Run the file AlgorithmsExerciseTwo this is where the main is

## Short info

This is short about the 4 .java files

### Student
 - Student is an object consisting of 4 booleans.
 - Student has a constructor which takes 4 booleans.
 - Student has 2 methodes getArray() and toString().

### Node
- Node is an object consisting of a String, a left node and right node.
- Node has getters and setter for the nodes, a getValue() and a isEmpty().

### DecsionTree
- DecsionTree is where i make the decsion tree i have a root and a subTree.
- DecsionTree has checkStudents(student).

### AlgorithmsExerciseTwo
- AlgorithmsExerciseTwo has a main where an exsample is shown and can be run.
