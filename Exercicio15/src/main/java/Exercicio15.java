/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */

  
import javax.swing.JOptionPane;

public class Exercicio15 {
  public static void main(String[] args) {
    String nome;
    int idade;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    if ((idade > 15) && (idade < 25)) {
      JOptionPane.showMessageDialog(null, nome + " ACEITA! ");
    } else {
      JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA! ");
    }    
  
  }
 }
  


