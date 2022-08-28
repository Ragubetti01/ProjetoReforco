/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoreforco;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Pessoa {
    //atributos
    String nome;
    String telefone;
    Integer idade;
   
    //método sem retorno
    void apresentacao(){
        JOptionPane.showMessageDialog(null, "Olá meu nome é "+nome+", meu telefone é "+telefone+" e minha idade é "+idade);
    }
    //método com retorno 
    boolean isMaiorIdade(){
        boolean isMaiorIdade;                
        if (idade > 18){
            isMaiorIdade = true;
        }else{
            isMaiorIdade = false;
        }          
        return isMaiorIdade;
    }
    //Método sem retorno
    void metodoFazNada(){
    }
    //Método com retorno boolean (true/false)
    boolean metodoRetornoBoolean(){
        return true;
    }
    //Método com retorno String (Texto)
    String metodoRetornoString(){
        return "";
    }
    //Método com retorno Integer (Númerico)
    Integer metodoRetornoInteger(){
        return 0;
    }
}
