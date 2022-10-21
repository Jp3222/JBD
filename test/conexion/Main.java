/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.jbd.conexion.Conexion;

/**
 *
 * @author jp
 */
public class Main {

    public static void main(String[] args) {
        Conexion cn = Conexion.getInstancia("jp", "12345", "jdbc:mysql://localhost:3306/jblue");
        
    }

}
