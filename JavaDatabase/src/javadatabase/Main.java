/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

/**
 *
 * @author mfaja
 */
public class Main extends LoginForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginForm v = new LoginForm();
        v.setVisible(true);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(RegisterForm.EXIT_ON_CLOSE);
        
    }
    
}
