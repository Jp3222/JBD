/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbd.conexion;

import com.jbd.Exeption.ExeptionPrinter;
import com.jbd.sql.SQL;
import java.io.PrintStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jp
 */
public abstract class BD implements ExeptionPrinter {

    protected Connection cn;
    protected Statement st;
    protected ResultSet rs;
    protected final SQL sql;
    //
    private Properties propiedades;
    private String usuario, contra;
    private final String url;
    private final int opcion;

    protected BD(String url) {
        this.url = url;
        this.opcion = 0;
        this.sql = new SQL();
        this.conectar();
    }

    protected BD(Properties propiedades, String url) {
        this.propiedades = propiedades;
        this.url = url;
        this.opcion = 1;
        this.sql = new SQL();
        this.conectar();
    }

    protected BD(String usuario, String contra, String url) {
        this.usuario = usuario;
        this.contra = contra;
        this.url = url;
        this.opcion = 2;
        this.sql = new SQL();
        this.conectar();
    }

    public synchronized final void conectar() {
        conectar(opcion);
    }

    private synchronized void conectar(int i) {
        try {
            switch (i) {
                case 0:
                    cn = DriverManager.getConnection(url);
                    break;
                case 1:
                    cn = DriverManager.getConnection(url, propiedades);
                    break;
                case 2:
                    cn = DriverManager.getConnection(url, usuario, contra);
                    break;
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());
            e.printStackTrace(pwExeption);
            closeExeptionBuffer();
        }
    }

    public void desconectar() {
        try {
            this.cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(pwExeption);
            closeExeptionBuffer();
        }
    }

}
