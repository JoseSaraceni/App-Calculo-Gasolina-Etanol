package devandroid.saraceni.appgaseta2.model;

public class Pessoa {

    //Atributos ###############

    private String nome;
    private String sobrenome;
    private String cursoDesejado;
    private String telefone;



    // Construtor ###################

    public Pessoa(){

    }


    // Getters e Setters ###############

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
