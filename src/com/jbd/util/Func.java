/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbd.util;

import java.util.ArrayList;

/**
 *
 * @author jp
 */
public class Func {

    public static String getCampos(String... campos) {
        String s = "";
        for (String campo : campos) {
            s += campo + ",";
        }
        return s;
    }

    public static String getDatos(String... datos) {
        String s = "";
        for (String dato : datos) {
            s += dato + ",";
        }
        return s;
    }

    public static String getCamposDatos(String[] campos, String[] datos) {
        if (campos.length != datos.length) {
            return null;
        }
        String s = "";
        for (int i = 0; i < campos.length; i++) {

        }
        return s;
    }

    public <T> T[] exepto(T[] o, int... exp) {
        ArrayList<T> lista = new ArrayList<>(o.length);
        for (int i = 0; i < o.length; i++) {
            if (!is(exp, i)) {
                lista.add(o[i]);
            }
        }
        return (T[]) lista.toArray();
    }

    public static boolean is(int[] arr, int i) {
        for (int j : arr) {
            if (j == i) {
                return true;
            }
        }
        return false;
    }

}
