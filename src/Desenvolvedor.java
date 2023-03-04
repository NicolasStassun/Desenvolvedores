import javax.swing.*;
import java.util.ArrayList;

public class Desenvolvedor {

    int index;

    String cpf;
    String senha;
    static String nome;
    static String sobrenome;
    int idade;
    static ArrayList<String> lista_de_linguagens_que_sabe_programar = new ArrayList<>();
    String email;
    String telefone;
    String vaga_que_pretende;
    double pretencao_salarial;

    public Desenvolvedor(String cpf, String senha, String nome, String sobrenome, int idade, ArrayList<String> lista_de_linguagens_que_sabe_programar, String email, String telefone, String vaga_que_pretende, double pretencao_salarial) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.lista_de_linguagens_que_sabe_programar = lista_de_linguagens_que_sabe_programar;
        this.email = email;
        this.telefone = telefone;
        this.vaga_que_pretende = vaga_que_pretende;
        this.pretencao_salarial = pretencao_salarial;
    }

    public Desenvolvedor(int index, String cpf, String senha, int idade, String email, String telefone, String vaga_que_pretende, double pretencao_salarial) {
        this.index = index;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.vaga_que_pretende = vaga_que_pretende;
        this.pretencao_salarial = pretencao_salarial;
    }

    public static void informacoesGeral(ArrayList<Desenvolvedor>devs) {

        for (Desenvolvedor i:
             devs) {
            JOptionPane.showMessageDialog(null,"Nome: " + i.nome + '\'' +
                    "Sobrenome:" + i.sobrenome + '\'' +
                    "Linguagens: " + i.lista_de_linguagens_que_sabe_programar.toString());
            String opcao = JOptionPane.showInputDialog("Deseja ver mais informações?\n" +
                                                       "     Sim         Não");
            if (opcao.equals("Sim")){

                    Desenvolvedor teste = devs.get(i.index);

                    JOptionPane.showMessageDialog(null,teste.toString());

                }

            }
        }
    }


