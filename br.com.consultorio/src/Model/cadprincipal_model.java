/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controll.cadprincipal_control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class cadprincipal_model {

    public String Nome_model, Telefone_model, CPF_model, perfil_model, email_model, senha_model, sit_model;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //recebendo inforrmações do control
    public String receber_control_nome() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_nome();
        String rec_nome = x.Nome_control;
        Nome_model = rec_nome;
        return Nome_model;
    }
    //recebendo inforrmações do control

    public String receber_control_telefone() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_telefone();
        String rec_tel = x.Telefone_control;
        Telefone_model = rec_tel;
        return Telefone_model;
    }
    //recebendo inforrmações do control

    public String receber_control_cpf() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_CPF();
        String rec_cpf = x.CPF_control;
        CPF_model = rec_cpf;
        return CPF_model;
    }
    //recebendo inforrmações do control

    public String receber_control_perfil() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_perfil();
        String rec_perfil = x.perfil_control;
        perfil_model = rec_perfil;
        return perfil_model;
    }
    //recebendo inforrmações do control

    public String receber_control_email() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_email();
        String rec_email = x.email_control;
        email_model = rec_email;
        return email_model;
    }

    //recebendo inforrmações do control
    public String receber_control_senha() {
        cadprincipal_control x = new cadprincipal_control();
        //pegando a informação do control
        x.receber_view_senha();
        String rec_senha = x.senha_control;
        senha_model = rec_senha;
        return senha_model;
    }
//inserindo dados no banco de dados

    public void adicionar() {

        String sql = "insert into equipe ( Nome , Telefone   , Cpf   , Perfil   , Email, Senha) values (?,?,?,?,?,?)";
        conexao = DAO.conector();
        try {
            pst = conexao.prepareStatement(sql);

            pst.setString(1, Nome_model);

            pst.setString(2, Telefone_model);

            pst.setString(3, CPF_model);
            //linha abaixo referente ao combobox
            pst.setString(4, perfil_model);

            pst.setString(5, email_model);

            pst.setString(6, senha_model);
            //System.out.println(pst);

            //Validação dos campos obrigatorios
            cadprincipal_control x = new cadprincipal_control();
            
            x.validacao();
            //System.out.println("aqui"+x.resposta_vazio);
            if (x.resposta_vazio==true) {
                JOptionPane.showMessageDialog(null, "Preenhca todos os campos");
                if(x.resposta_senha==false){
                JOptionPane.showMessageDialog(null, "Confirmação de senha não correspondente");
            }    
            
            }else {  
             

                // a linha abaixo atualiza a tabela ususario com os dados do formulario
                // mensagem de confirmação
                int adicionado = pst.executeUpdate();

                //System.out.println(adicionado); checkgaem para desenvolvedor
                if (adicionado > 0) {
                    //enviando confirmaçao para o control de inserção de dados ou não
                    sit_model = "true";

                } else {
                    sit_model = "false";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
