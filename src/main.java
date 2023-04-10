import javax.swing.*;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
            menu();
    }
    public static void menu(){

        do {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Login
                2 - Registrar
                3 - Sair
                """));
            if (opcao == 1) {

                login();

            } else if (opcao == 2) {

                register();

            } else if (opcao == 3) {

                System.exit(0);

            }
        }while (true);


    }
    static Desenvolvedor Logado = new Desenvolvedor(null,null,null,null,0,null,null,null,null,0.0);

    public static void login(){

        String cpf = JOptionPane.showInputDialog("CPF");


        for (Desenvolvedor i: Desenvolvedor.devs) {

            if(i.getCpf().equals(cpf)){

                int erros = 0;
                do {

                    String senha = JOptionPane.showInputDialog("Senha");

                    for (Desenvolvedor j:
                            Desenvolvedor.devs) {

                        if(i.getSenha().equals(senha)){

                            Logado = j;

                             Logado.index = Desenvolvedor.devs.indexOf(j);

                            menuDev();

                        }

                    }
                    erros++;

                }while (erros!=3);

            }


        }

        JOptionPane.showMessageDialog(null,"CPF Inválido");

    }
    public static void register(){

        String cpf;
        String senha;
        String nome;
        String sobrenome;
        int idade;
        ArrayList<String> lista_de_linguagens_que_sabe_programar = new ArrayList<>();
        String email;
        String telefone;
        String vaga_que_pretende;
        double pretencao_salarial;
        String parar;

        cpf = JOptionPane.showInputDialog("""
                Informe seu cpf
                xxx.xxx.xxx-xx
                """);
        senha = JOptionPane.showInputDialog("Informe sua senha");
        nome = JOptionPane.showInputDialog("Informe seu nome");
        sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome");
        idade =Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        do{

            lista_de_linguagens_que_sabe_programar.add(JOptionPane.showInputDialog("Qual liguem de programação você sabe?"));
            parar = JOptionPane.showInputDialog("""
                    Deseja informar mais alguma?
                    
                         Sim           Não
                         
                    """);

        }while(parar.equals("sim") || parar.equals("Sim"));

        email = JOptionPane.showInputDialog("Informe seu email");
        telefone = JOptionPane.showInputDialog("Informe seu telefone");
        vaga_que_pretende = JOptionPane.showInputDialog("Informe a vaga que pretende trabalhar");
        pretencao_salarial = Double.parseDouble(JOptionPane.showInputDialog("Informe sua preteção salarial"));
        for (Desenvolvedor i:
                Desenvolvedor.devs) {

            if(i.getCpf().equals(cpf)){

                JOptionPane.showMessageDialog(null,"CPF já cadastrado");
                return;

            }

        }

        Desenvolvedor dev = new Desenvolvedor(cpf,senha,nome,sobrenome,idade,lista_de_linguagens_que_sabe_programar,email,telefone,vaga_que_pretende,pretencao_salarial);
        Desenvolvedor.devs.add(dev);
        JOptionPane.showMessageDialog(null, "O Dev foi registrado");

    }


    public static void menuDev() {

        boolean logout = false;

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                                    
                    1 - Editar perfil
                    2 - Remover Conta
                    3 - Informações dos Usuários
                    4 - Logout
                    """));
            if (opcao == 1) {

                editarPerfil();

            } else if (opcao == 2) {

                Logado.remove();
                logout = true;

            } else if (opcao == 3) {

                infGeral();

            } else if (opcao == 4) {

                logout = logout();

            }


        } while (!logout);
    }
    public static void editarPerfil(){

        String opcao = JOptionPane.showInputDialog("""
                Oque você deseja editar?
                
                1 - Cpf
                2 - Senha
                3 - Nome
                4 - Sobrenome
                5 - Idade
                6 - Lista de linguagens que sabe programar
                7 - E-mail
                8 - Telefone
                9 - Vaga que pretende
                10 - Pretensão salarial.
                0 - Não desejo alterar.
               
                """);
        if (opcao.equals("1")){
            String cpf = JOptionPane.showInputDialog("Informe seu novo CPF");
            Logado.setCpf(cpf);
        }
        else if (opcao.equals("2")){
            String senha = JOptionPane.showInputDialog("Informe sua nova senha");
            Logado.setSenha(senha);
        }
        else if (opcao.equals("3")){

            String nome = JOptionPane.showInputDialog("Informe seu novo nome");
            Logado.setNome(nome);
        }
        else if (opcao.equals("4")){

            String sobrenome = JOptionPane.showInputDialog("Informe seu novo sobrenome");
            Logado.setSobrenome(sobrenome);
        }
        else if (opcao.equals("5")){

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nova idade"));
            Logado.setIdade(idade);
        }
        else if (opcao.equals("6")) {
            String parar;
            ArrayList<String> lista_de_linguagens_que_sabe_programar2;
            do {

                ArrayList<String> lista_de_linguagens_que_sabe_programar = new ArrayList<>();

                lista_de_linguagens_que_sabe_programar2 = lista_de_linguagens_que_sabe_programar;

                lista_de_linguagens_que_sabe_programar.add(JOptionPane.showInputDialog("Qual liguem de programação você sabe?"));
                parar = JOptionPane.showInputDialog("""
                        Deseja informar mais alguma?
                                            
                             Sim           Não
                             
                        """);


            } while (parar.equals("sim") || parar.equals("Sim"));

            Logado.setLista_de_linguagens_que_sabe_programar(lista_de_linguagens_que_sabe_programar2);
            menuDev();

        }
        else if (opcao.equals("7")){

            String email = JOptionPane.showInputDialog("Informe seu novo email");
            Logado.setEmail(email);
        }
        else if (opcao.equals("8")){

            String telefone = JOptionPane.showInputDialog("Informe seu novo telefone");
            Logado.setTelefone(telefone);
        }
        else if (opcao.equals("9")){

            String vaga_que_pretende = JOptionPane.showInputDialog("Informe sua vaga de interesse");
            Logado.setVaga_que_pretende(vaga_que_pretende);
        }
        else if (opcao.equals("10")){

            double pretancao_salarial = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nova idade"));
            Logado.setPretencao_salarial(pretancao_salarial);
        }
        else{
            menuDev();
        }

    }
    public static void infGeral(){

        Logado.informacoesGeral();
        menuDev();

    }
    public static boolean logout(){

        return true;
    }

}

