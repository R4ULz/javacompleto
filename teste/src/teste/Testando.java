package teste;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Testando {

    public static void main(String[] args) {
        Login l1 = new Login();
        int i, j, k;

        i = JOptionPane.showConfirmDialog(null, "você gostaria de realizar um cadastro?", "Cadastrar", JOptionPane.YES_NO_OPTION);

        if (i == 0) {
            if (i == 0) {
                String nomeCadastro = JOptionPane.showInputDialog(null, "Digite seu nome:", "Cadastro", 3);
                l1.setNome(nomeCadastro);            
                String usuarioCadastro = JOptionPane.showInputDialog(null, "Digite seu nome de usuário:", "Cadastro", 3);
                l1.setLogin(usuarioCadastro);
                String senhaCadastro = JOptionPane.showInputDialog(null, "Digite sua senha:", "Cadastro", 3);
                l1.setSenha(senhaCadastro);
                String emailCadastro = JOptionPane.showInputDialog(null, "Digite seu email:", "Cadastro", 3);
                l1.setEmail(emailCadastro);
              
             
                j = JOptionPane.showConfirmDialog(null, "Você gostaria de fazer login?", "Login", JOptionPane.YES_NO_OPTION);
               
                if (j == 0) {
                    String repetir = null;

                    do {
                        String usuarioLogin = JOptionPane.showInputDialog(null, "Usuário", "Login", 3);
                        String senhaLogin = JOptionPane.showInputDialog(null, "Senha", "Login", 3);

                        if ((l1.getUsuario().equals(usuarioLogin)) && (l1.getSenha().equals(senhaLogin))) {
                            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");

                            String escolha, repeticao = null;

                            do {
                                escolha = JOptionPane.showInputDialog(null, "1- Cadastrar curso. \n2- Ver meus dados.\n3- Ver curso cadastrado. \n4- Sair");
                                String decisao = null, desc = null;
                                switch (escolha) {
                                    case "1":
                                        decisao = JOptionPane.showInputDialog(null, "Qual o nome do curso?");
                                        l1.setDecisao(decisao);
                                        desc = JOptionPane.showInputDialog(null, "Descreva um pouco do curso");
                                        l1.setDesc(desc);
                                        repeticao = JOptionPane.showInputDialog(null, "Deseja voltar ao inicio?? (sim ou não)");
                                        if (repeticao.equalsIgnoreCase("não")) {
                                            System.exit(0);
                                        }
                                        break;
                                    case "2":
                                        JOptionPane.showMessageDialog(null, l1.getNome() + "\n" + l1.getEmail() + "\n" + l1.getUsuario());
                                        repeticao = JOptionPane.showInputDialog(null, "Deseja voltar ao inicio?? (sim ou não)");
                                        if (repeticao.equalsIgnoreCase("não")) {
                                            System.exit(0);
                                        }
                                        break;
                                    case "3":
                                        if((l1.getDecisao() == null) && (l1.getDesc() == null)){
                                            JOptionPane.showMessageDialog(null, "Você ainda não cadastrou nenhum curso!");
                                            repeticao = "sim";
                                        }else{
                                            JOptionPane.showMessageDialog(null, l1.getDecisao() + "\n" + l1.getDesc() + "\n");
                                            repeticao = JOptionPane.showInputDialog(null, "Deseja voltar ao inicio?? (sim ou não)");
                                            if (repeticao.equalsIgnoreCase("não")) {
                                                System.exit(0);
                                            }
                                        }    
                                        break;
                                    case "4":
                                        JOptionPane.showMessageDialog(null, "Obrigado pela sua atenção!!");
                                        System.exit(0);
                                }
                            } while (repeticao.equalsIgnoreCase("sim"));

                            /* UIManager.put("OptionPane.cancelButtonText", "Sair"); 
                            UIManager.put("OptionPane.noButtonText", "teste"); 
                            UIManager.put("OptionPane.yesButtonText", "Ver múltiplos");

                            k = JOptionPane.showConfirmDialog(null, "O que gostaria de fazer a seguir? ","teste", JOptionPane.YES_NO_CANCEL_OPTION);
                            if(k == 0){
                                                



                            }else if(k == 1){
                                JOptionPane.showMessageDialog(null, "teste");
                            }
                            else{                       
                                JOptionPane.showMessageDialog(null, "Tudo bem, espero te ver em breve!!");
                            }*/
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos!!", "Dados Errados", JOptionPane.WARNING_MESSAGE);
                            repetir = JOptionPane.showInputDialog(null, "Deseja tentar novamente? (sim ou não)");
                        }
                    } while (repetir.equalsIgnoreCase("sim"));

                } else {
                    JOptionPane.showMessageDialog(null, "Espero te ver em breve");
                    System.exit(0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Espero te ver em breve");
                System.exit(0);
            }

        }else {
                JOptionPane.showMessageDialog(null, "Espero te ver em breve");
                System.exit(0);
            }

    }
}
