/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm_example;

/**
 *
 * @author jmccarthy
 */
public class ORM_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ObjectMapper o = new ObjectMapper();
        //System.out.println(o.getClassName());
        
        Student s = new Student();
                
        s.save();
        s.create();
        s.delete();

    }
    
}
