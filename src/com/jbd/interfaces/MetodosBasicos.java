/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jbd.interfaces;
import java.sql.ResultSet;
/**
 *
 * @author jp
 */
public interface MetodosBasicos {

    boolean insert(String tabla, String campos, String datos);

    boolean update(String tabla, String campos, String datos);

    boolean delete(String tabla, String where);

    ResultSet select(String tabla, String campos, String where);

}
