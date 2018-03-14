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
            Student student = new Student(ran.nextBoolean(), ran.nextBoolean(), ran.nextBoolean(), ran.nextBoolean());
            students.add(student);
        }
        
        for (Student student : students) {
            System.out.println(student.toString() + " - " + dt.checkStudent(student));
        }
    }
    
}
