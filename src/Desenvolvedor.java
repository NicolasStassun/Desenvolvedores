import javax.swing.*;
import java.util.ArrayList;

public class Desenvolvedor {

    static ArrayList<Desenvolvedor> devs = new ArrayList<>();

    int index;

    private String cpf;
    private String senha;
    private String nome;
    private String sobrenome;
    private int idade;
    private ArrayList<String> lista_de_linguagens_que_sabe_programar;
    private String email;
    private String telefone;
    private String vaga_que_pretende;
    private double pretencao_salarial;

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


    public void remove(){

        Desenvolvedor.devs.remove(this.index);
        JOptionPane.showMessageDialog(null,"Seu usuário foi removido");

    }

    public void informacoesGeral() {

        for (Desenvolvedor i:
             devs) {
            JOptionPane.showMessageDialog(null,"Nome: " + i.nome + "\n" +
                    "Sobrenome:" + i.sobrenome + "\n" +
                    "Linguagens: " + i.lista_de_linguagens_que_sabe_programar.toString());
            String opcao = JOptionPane.showInputDialog("Deseja ver mais informações?\n" +
                                                       "     Sim         Não");
            if (opcao.equals("Sim")){

                    JOptionPane.showMessageDialog(null,i.toString());

                }

            }
        }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLista_de_linguagens_que_sabe_programar(ArrayList<String> lista_de_linguagens_que_sabe_programar) {
        this.lista_de_linguagens_que_sabe_programar = lista_de_linguagens_que_sabe_programar;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setVaga_que_pretende(String vaga_que_pretende) {
        this.vaga_que_pretende = vaga_que_pretende;
    }

    public void setPretencao_salarial(double pretencao_salarial) {
        this.pretencao_salarial = pretencao_salarial;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return  "Cpf: " + cpf + "\n" +
                "Idade: " + idade +"\n" +
                "E-mail: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Vaga que pretende: " + vaga_que_pretende + "\n" +
                "Pretenção salarial: " + pretencao_salarial;
    }
}



