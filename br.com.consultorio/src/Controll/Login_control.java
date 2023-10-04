/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controll;

import Model.Login_model;
import br.com.telas.TelaLogin_2;
import br.com.telas.TelaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Login_control {

    public  static String usu_log, senha_log;
    //Recebendo informações do view

    public String captador_usu() {
        String usu = TelaLogin_2.txtemail_log.getText();
        usu_log = usu;
        //System.out.println(usu);
        return usu_log;

    }
    

    //Recebendo informações do view
    public String captador_senha() {
        String senha = TelaLogin_2.txtsenha_log.getText();
        senha_log = senha;
        return senha_log;
    }
//recebe as infromações do model e envia autorização para o view
    public void receber_model() {
        Login_model x = new Login_model();
        x.db_senha();
        x.db_usu();
        x.db_geral();
        if ("true".equals(x.aut_model)) {
            JOptionPane.showMessageDialog(null, "Bem-vindo(a) "+x.nome_model);
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            
        }else{
             JOptionPane.showMessageDialog(null, "Usuário e/ou senha não correspondentes");
        }
    }

}
