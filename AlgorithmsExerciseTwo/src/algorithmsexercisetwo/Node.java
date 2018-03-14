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
public class Node {
    
    private Node left;
    private Node right;
    private String value;
    
    public Node(String value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }
    
    public boolean isEmpty(){
        return right == null && left == null;
    }
    
}
