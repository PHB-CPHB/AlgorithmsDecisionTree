/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsexercisetwo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author philliphbrink
 */
public class AlgorithmsExerciseTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Student> students = new ArrayList();
        DecsionTree dt = new DecsionTree();
        for (int i = 0; i < 10; i++) {
            boolean a = ran.nextBoolean();
            boolean b = ran.nextBoolean();
            boolean c = ran.nextBoolean();
            boolean d = ran.nextBoolean();
            Student student = new Student(a, b, c, d);
            students.add(student);
        }
        
        for (Student student : students) {
            System.out.println(student.toString() + " - " + dt.checkStudent(student));
        }
    }
    
}
