/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsexercisetwo;

/**
 *
 * @author philliphbrink
 */
public class DecsionTree {
    
    Node root;
    Node subTree;
    
    public DecsionTree(){
        //First
        root = new Node("Hand-In");
        root.setRight(new Node("You could easily fail the exam"));
        root.setLeft(new Node("Read textbook"));
        //Second
        root.getLeft().setRight(new Node("Attend lectures"));
        root.getLeft().setLeft(new Node("Make exercises"));
        //Third No
        root.getLeft().getRight().setRight(new Node("You could easily fail the exam"));
        root.getLeft().getRight().setLeft(new Node("You should be able to pass the exam"));
        //Third Yes
        root.getLeft().getLeft().setRight(new Node("Attend lectures"));
        root.getLeft().getLeft().setLeft(new Node("You should be able to pass the exam"));
        //Fourth
        root.getLeft().getLeft().getRight().setRight(new Node("You could easily fail the exam"));
        root.getLeft().getLeft().getRight().setLeft(new Node("You should be able to pass the exam"));
    }

    public String checkStudent(Student student) {
        subTree = root;
        boolean[] list = student.getArray();
        for (boolean b : list) {
            if(subTree.isEmpty()){
                return subTree.getValue();
            } else if (b){
                subTree = subTree.getLeft();
            } else {
                subTree = subTree.getRight();
            }
        }
        return subTree.getValue();
    }
    
}
