/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoreforco;

/**
 *
 * @author User
 */
public class Lanche {

    String nome;
    Double preco;
    boolean isVegano;

    public Lanche(String nome, Double preco, boolean isVegano) {
        this.nome = nome;
        this.preco = preco;
        this.isVegano = isVegano;
    }

    public Lanche() {
    }

    Double precoComImposto() {
        return preco * 2;
    }

    String obterAviso() {
        String retorno;
        if (isVegano) {
            //return "AVISO! Este lanche é vegano.";
            retorno = "AVISO! Este lanche é vegano.";
        } else {
            //return "AVISO! Este lanche não é vegano.";
            retorno = "AVISO! Este lanche não é vegano.";
        }
        return retorno;
    }

    String avisoAnuncio() {
        return "O lanche " + nome + " esta custando " + preco;
    }

    void adcionarCarne() {
        nome = nome + " com carne";

        if (isVegano) {//O lanche é vegano ? Se sim, ele vai entrar dentro das chaves
            isVegano = false; //O lanche deixou de ser vegano.
        }
    }
}
