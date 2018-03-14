# AlgorithmsDecisionTree
A decision tree is used for classification problems.A  decision  tree  consists  of  internal nodes  (nodes  with  subtrees)  and  leaves  (terminal  nodes,  nodes without subtrees).
The links from the root node to a leaf is called a branch.You have a collection of information when you use the tree. Each internal node contains a question, and the supplied information will determine which link to follow from the node. 

In the general case there  can  be  several  answers  and  different  questions  in  the  different  branches  and  branches  of  different length. The leaves will contain the final classification.In the simple case we will use here with a binary tree there will be two   answers (yes/no – 1/0) and the questions will be the same in each branch.

Make a decision tree for warning students.A  student  will  come  with  4  items  of  information:
 - **“Read  textbook”**
 - **“Hand  ins  made  in  time”**
 - **“Attend lectures”**
 - **“Make exercises”** 
 
E.g. for a nice student (yes, yes, yes, yes).

- The classification should be “You could easily fail the exam” in the following cases:
 - **“Hand ins made in time = no“**
 - **“Attend lectures and Read textbook = no”**
 - **“Attend lectures and Make exercises = no”**
 - **The classification should be “You should be able to pass the exam” in all other cases**
