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
    root.setRight(new Node("Failed"));
    root.setLeft(new Node("Read textbook"));
    
    //Second
    root.getLeft().setRight(new Node("Attend lectures"));
    root.getLeft().setLeft(new Node("Make exercises"));
    
    //Third No
    root.getLeft().getRight().setRight(new Node("Failed"));
    root.getLeft().getRight().setLeft(new Node("Passed"));
    
    //Third Yes
    root.getLeft().getLeft().setRight(new Node("Attend lectures"));
    root.getLeft().getLeft().setLeft(new Node("Passed"));
    
    //Fourth
    root.getLeft().getLeft().getRight().setRight(new Node("Failed"));
    root.getLeft().getLeft().getRight().setLeft(new Node("Passed"));
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
