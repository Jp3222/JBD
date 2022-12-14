/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jbd.Exeption;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jp
 */
public interface ExeptionPrinter {

    final BufferedOutputStream bosExeption = new BufferedOutputStream(System.out);
    final PrintWriter pwExeption = new PrintWriter(bosExeption);

    default void closeExeptionBuffer() {
        try {
            pwExeption.close();
            bosExeption.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
