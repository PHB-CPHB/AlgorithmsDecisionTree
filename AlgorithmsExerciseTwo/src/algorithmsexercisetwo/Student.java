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
class Student {
    
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public Student(boolean a, boolean b, boolean c, boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public boolean[] getArray(){
        boolean[] list = {a,b,c,d};
        return list;
    }

    @Override
    public String toString() {
        return "Student{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    }
    
    
    
}
