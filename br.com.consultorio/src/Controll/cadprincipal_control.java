/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controll;

import Model.cadprincipal_model;
import br.com.telas.Cadastro_principal;
import br.com.telas.TelaCadastro;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class cadprincipal_control {

    public String Nome_control, Telefone_control, CPF_control, perfil_control, email_control, senha_control, senha_corf_control;
    public boolean resposta_vazio, resposta_senha;
//recbendo informações do view cadastro principal

    public String receber_view_nome() {
        String rec_nome = Cadastro_principal.txtnome_cad.getText();
        Nome_control = rec_nome;
        //System.out.println("aqui visse " + Nome_control);
        return Nome_control;

    }
//recbendo informações do view cadastro principal

    public String receber_view_telefone() {

        String rec_tel = Cadastro_principal.txttel_cad.getText();
        Telefone_control = rec_tel;
        return Telefone_control;
    }
//recbendo informações do view cadastro principal

    public String receber_view_CPF() {

        String rec_cpf = Cadastro_principal.txtCPFcad.getText();
        CPF_control = rec_cpf;
        return CPF_control;

    }
//recbendo informações do view cadastro principal

    public String receber_view_perfil() {

        String rec_perfil = Cadastro_principal.cboperfol_cad.getSelectedItem().toString();
        perfil_control = rec_perfil;
        return perfil_control;
    }
//recbendo informações do view cadastro principal

    public String receber_view_email() {

        String rec_email = Cadastro_principal.txtemail_cad.getText();
        email_control = rec_email;
        return email_control;
    }
//recbendo informações do view cadastro principal

    public String receber_view_senha() {

        String rec_senha = Cadastro_principal.txtsenha_cad.getText();
        senha_control = rec_senha;
        return senha_control;
    }
    //recbendo informações do view cadastro principal

    public String receber_view_senha_confirm() {

        String rec_senha_cnf = Cadastro_principal.txtsenha_confirm_cad.getText();
        senha_corf_control = rec_senha_cnf;
        return senha_corf_control;
    }

    //junção de todos os dados
    public void junção() {
        receber_view_nome();
        receber_view_telefone();
        receber_view_CPF();
        receber_view_perfil();
        receber_view_email();
        receber_view_senha();
        receber_view_senha_confirm();
    }

    public boolean validacao_vazio() {
        junção();
        boolean val = Nome_control==null || Telefone_control==null || CPF_control==null || perfil_control==null || email_control==null|| senha_control==null;
        if (val==false) {
            //Confirmação campos preenchidos
            //JOptionPane.showMessageDialog(null, "Preenhca todos os campos");
            //se for ok é pq esta tudo certo
            resposta_vazio = true;
            //System.out.println("Campos vazios");
        }

        return resposta_vazio;
    }

    public boolean validacao_senha() {
        junção();
        boolean val =(senha_control!=null && senha_corf_control!=null);
        boolean val2 = senha_control.equals(senha_corf_control) ;
        if (val && val2 == true) {
            //colocar validação para senha e confirmação de senha iguais
            //JOptionPane.showMessageDialog(null, "Confirmação de senha não correspondente");
             //se for ok é pq esta tudo certo
            resposta_senha = true;
            String senha= "Senha compativeis";
            System.out.println(senha);
        }   
        
        return resposta_senha;
    }
    public void validacao(){
        validacao_vazio();
        validacao_senha();
    }

    //recebendo infromações do model
    public void receber_model() {
        cadprincipal_model x = new cadprincipal_model();
        x.receber_control_nome();
        x.receber_control_telefone();
        x.receber_control_cpf();
        x.receber_control_perfil();
        x.receber_control_email();
        x.receber_control_senha();
        x.adicionar();
        if ("true".equals(x.sit_model)) {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado");
            Cadastro_principal cls = new Cadastro_principal();
            cls.fechar();
        }
        if ("false".equals(x.sit_model)) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");
        }

    }

    // qunado for acionado o botão de cadastrar iniciar o processo
    public void view_control() {
        receber_model();
    }

}
