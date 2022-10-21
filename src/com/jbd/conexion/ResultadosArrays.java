/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbd.conexion;

import com.jbd.Exeption.ExeptionPrinter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jp
 */
public class ResultadosArrays implements ExeptionPrinter {

    public ArrayList<Object[]> getArrayListObjects(ResultSet rs, int columnas) {
        try {
            try (rs) {
                ArrayList<Object[]> lista = new ArrayList<>();
                return whileRun(rs, lista, columnas);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(pwExeption);
            closeExeptionBuffer();
        }
        return null;
    }

    public <T> ArrayList<T[]> whileRun(ResultSet rs, ArrayList<T[]> lista, int col) throws SQLException {
        while (rs.next()) {
            lista.add(forRun(rs, col));
        }
        return lista;
    }

    public <T> T[] forRun(ResultSet rs, int col) throws SQLException {
        Object[] o = new Object[col];
        for (int i = 0; i < col; i++) {
            o[i] = rs.getObject(i);
        }
        return (T[]) o;

    }

}
