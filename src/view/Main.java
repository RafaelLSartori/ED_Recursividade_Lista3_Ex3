package view;

import controller.Ex3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex3 m = new Ex3();
        String palavra = JOptionPane.showInputDialog("Digite a palavra a ser invertida: ");
        int tamanho = palavra.length();
        System.out.println(m.frecinvertepalavra(palavra, tamanho));
    }
}