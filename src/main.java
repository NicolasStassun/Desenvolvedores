import javax.swing.*;
import java.util.ArrayList;

public class main {

    static ArrayList<Desenvolvedor> devs = new ArrayList<>();

    public static void main(String[] args) {
        int teste4 = 7;
        do {
            menu();
        } while (teste4 == 7);

    }
    public static void menu(){

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

    }
    static Desenvolvedor Logado = new Desenvolvedor(null,null,null,null,0,null,null,null,null,0.0);
    static String senhaLogado;
    static String cpfLogado;


    public static void login(){

        String cpf = JOptionPane.showInputDialog("CPF");


        for (Desenvolvedor i:
             devs) {

            if(i.cpf.equals(cpf)){

                int erros = 0;
                do {

                    String senha = JOptionPane.showInputDialog("Senha");

                    for (Desenvolvedor j:
                            devs) {

                        if(i.senha.equals(senha)){

                            Logado = j;
                            senhaLogado = j.senha;
                            cpfLogado = j.cpf;

                             Logado.index = devs.indexOf(j);

                            menuDev();

                        }

                    }
                    erros++;

                }while (erros!=3);

            }
            JOptionPane.showMessageDialog(null,"CPF Inválido");
            menu();

        }



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
        String parar = "";

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
            String pararWhile = JOptionPane.showInputDialog("""
                    Deseja informar mais alguma?
                    
                         Sim           Não
                         
                    """);
            parar = pararWhile;

        }while(parar.equals("sim") || parar.equals("Sim"));

        email = JOptionPane.showInputDialog("Informe seu email");
        telefone = JOptionPane.showInputDialog("Informe seu telefone");
        vaga_que_pretende = JOptionPane.showInputDialog("Informe a vaga que pretende trabalhar");
        pretencao_salarial = Double.parseDouble(JOptionPane.showInputDialog("Informe sua preteção salarial"));
        for (Desenvolvedor i:
                devs) {

            if(i.cpf.equals(cpf)){

                JOptionPane.showMessageDialog(null,"CPF já cadastrado");
                return;

            }

        }

        Desenvolvedor dev = new Desenvolvedor(cpf,senha,nome,sobrenome,idade,lista_de_linguagens_que_sabe_programar,email,telefone,vaga_que_pretende,pretencao_salarial);
        devs.add(dev);
        JOptionPane.showMessageDialog(null, "O Dev foi registrado");

    }


    public static void menuDev(){

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                
                1 - Editar perfil
                2 - Remover Conta
                3 - Informações dos Usuários
                4 - Logout 
                """));
        if(opcao == 1){

            editarPerfil();

        }
        else if(opcao == 2){

            remove();

        }
        else if(opcao == 3){

            infGeral();

        }
        else if(opcao == 4){

            logout();

        }



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
            String oldCpf = Logado.cpf;
            String cpf = JOptionPane.showInputDialog("Informe seu novo CPF");
            Logado.cpf = (cpf);
            for (Desenvolvedor i:
                    devs) {

                if(i.senha.equals(oldCpf)){
                    i.cpf = cpf;
                }

            }
            menuDev();
        }
        else if (opcao.equals("2")){
            String oldSenha = Logado.senha;
            String senha = JOptionPane.showInputDialog("Informe sua nova senha");
            Logado.cpf = (senha);
            for (Desenvolvedor i:
                    devs) {

                if(i.senha.equals(oldSenha)){
                    i.senha = senha;
                }

            }
            menuDev();
        }
        else if (opcao.equals("3")){

            String nome = JOptionPane.showInputDialog("Informe seu novo nome");
            Logado.nome = (nome);
            menuDev();
        }
        else if (opcao.equals("4")){

            String sobrenome = JOptionPane.showInputDialog("Informe seu novo sobrenome");
            Logado.sobrenome = (sobrenome);
            menuDev();
        }
        else if (opcao.equals("5")){

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nova idade"));
            Logado.idade = (idade);
            menuDev();
        }
        else if (opcao.equals("6")) {
            String parar;
            ArrayList<String> lista_de_linguagens_que_sabe_programar2 = new ArrayList<>();
            do {

                ArrayList<String> lista_de_linguagens_que_sabe_programar = new ArrayList<>();

                lista_de_linguagens_que_sabe_programar2 = lista_de_linguagens_que_sabe_programar;

                lista_de_linguagens_que_sabe_programar.add(JOptionPane.showInputDialog("Qual liguem de programação você sabe?"));
                String pararWhile = JOptionPane.showInputDialog("""
                        Deseja informar mais alguma?
                                            
                             Sim           Não
                             
                        """);
                parar = pararWhile;


            } while (parar.equals("sim") || parar.equals("Sim"));

            Logado.lista_de_linguagens_que_sabe_programar = (lista_de_linguagens_que_sabe_programar2);
            menuDev();

        }
        else if (opcao.equals("7")){

            String email = JOptionPane.showInputDialog("Informe seu novo email");
            Logado.email = (email);
            menuDev();
        }
        else if (opcao.equals("8")){

            String telefone = JOptionPane.showInputDialog("Informe seu novo telefone");
            Logado.telefone = (telefone);
            menuDev();
        }
        else if (opcao.equals("9")){

            String vaga_que_pretende = JOptionPane.showInputDialog("Informe sua vaga de interesse");
            Logado.vaga_que_pretende = (vaga_que_pretende);
            menuDev();
        }
        else if (opcao.equals("10")){

            double pretancao_salarial = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nova idade"));
            Logado.pretencao_salarial = (pretancao_salarial);
            menuDev();
        }
        else{
            menuDev();
        }

    }

    public static void remove(){

        devs.remove(Logado.index);
        JOptionPane.showMessageDialog(null,"Seu usuário foi removido");
        menu();

    }
    public static void infGeral(){

        Desenvolvedor.informacoesGeral(devs);
        menuDev();

    }
    public static void logout() {

        for (Desenvolvedor i :
                devs) {
            if (i.cpf.equals(cpfLogado)) {


                for (Desenvolvedor j :
                        devs) {

                    if (j.senha.equals(senhaLogado)) {

                        j = Logado;

                    }

                }
            }
        }
        menu();
    }

}

