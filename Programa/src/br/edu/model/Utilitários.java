/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.model;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */
public class Utilitários {
    public void InserirIcone(JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/LogoGIE.png"));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
