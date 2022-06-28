/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao's computer
 */
public class Usuario {
    private static ArrayList<String> nome = new ArrayList<>(Arrays.asList("teste"));
    private static ArrayList<String> email = new ArrayList<>(Arrays.asList("teste"));
    private static ArrayList<String> senha = new ArrayList<>(Arrays.asList("teste"));
    private static ArrayList<Integer> id = new ArrayList<>();
    
    public Usuario(){}
    
    public Boolean logar(String jtfEmail, String jtfSenha){
    
        for(int i = 0; i < nome.size(); i++) {
            if(email.get(i).equals(jtfEmail) && senha.get(i).equals(jtfSenha))
               return true;
        }
        mensagemLoginInvalido();
        return false;
        
    }
    
   
  
    
     private Boolean verificarExistenciaDeUsuario(String jtfNome, String jtfEmail){
         for (int i = 0; i < nome.size(); i++) {
             System.out.println("Nice");
             if(nome.get(i).equals(jtfNome)){
                 mensagemQueUsuarioJaCadastrado();
                return true;
             }
             if(email.get(i).equals(jtfEmail)){
                 mensagemQueEmailJaCadastrado();
                return true;
             }
         }
         return false;
    }
       public void cadastrarUsuario(String jtfNome, String jtfEmail,String jtfSenha,String jtfConSenha){
        if(jtfSenha.equals(jtfConSenha)){
            if(!verificarExistenciaDeUsuario(jtfNome, jtfEmail)){
            nome.add(jtfNome);
            senha.add(jtfSenha);
            email.add(jtfEmail);
            mensagemQueFoiCadastradoComSucesso();
            }
        }
        else
            mensagemSenhaIncorreta();
    }
       
    private void mensagemQueUsuarioJaCadastrado(){
        JOptionPane.showMessageDialog(null,"Esse usuário já existe!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
    private void mensagemQueEmailJaCadastrado(){
        JOptionPane.showMessageDialog(null,"Esse email já esta cadastrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
    private void mensagemQueFoiCadastradoComSucesso(){
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    private void mensagemSenhaIncorreta(){
        JOptionPane.showMessageDialog(null,"Senha incorretas!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
    private void mensagemLoginInvalido(){
        JOptionPane.showMessageDialog(null,"Email ou senha incorreta!", "Aviso", JOptionPane.WARNING_MESSAGE);
    }

     
         
    

    public static ArrayList<String> getNome() {
        return nome;
    }

    public static void setNome(ArrayList<String> nome) {
        Usuario.nome = nome;
    }

    public static ArrayList<String> getEmail() {
        return email;
    }

    public static void setEmail(ArrayList<String> email) {
        Usuario.email = email;
    }

    public static ArrayList<String> getSenha() {
        return senha;
    }

    public static void setSenha(ArrayList<String> senha) {
        Usuario.senha = senha;
    }

    public static ArrayList<Integer> getId() {
        return id;
    }

    public static void setId(ArrayList<Integer> id) {
        Usuario.id = id;
    }
    
}