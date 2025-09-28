package model;
import java.util.Date;

public class Colaborador {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private int matricula;
    private Date dataInicio;
    private Date dataFim;
    private int situacao;
    private String cargo;
    private double salario;
    private String setor;
    
    public Colaborador() {}
    
    public Colaborador(String nome, String cpf, Date dataNascimento, int matricula,  Date dataInicio, Date dataFim, int situacao, String cargo, double salario, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.dataInicio = dataInicio;   
        this.dataFim = dataFim;
        this.situacao = situacao;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
    }
    
    public void cadastrarColaborador() {
        System.out.println("Colaborador " + this.nome + " cadastrado com sucesso!");
    }
    
    public void demitirColaborador() {
        this.situacao = 0; 
        System.out.println("Colaborador " + this.nome + " foi demitido.");
    }
    
    public void alterarCargo(String novoCargo) {
        this.cargo = novoCargo;
        System.out.println("Cargo alterado para: " + novoCargo);
    }
    
    public void alterarSalario(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Salário alterado para: R$ " + novoSalario);
    }
    
    public void alterarSetor(String novoSetor) {
        this.setor = novoSetor;
        System.out.println("Setor alterado para: " + novoSetor);
    }
    
    public void alterarDados(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
        
        System.out.println("Dados do colaborador atualizados.");
    }
    
    public void solicitarPromocao() {
        System.out.println("Solicitação de promoção enviada para o colaborador: " + this.nome);
    }
    
    public void alterarLider() {
        System.out.println("Líder do colaborador " + this.nome + " foi alterado.");
    }
    

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula;   }

    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }    

    public Date getDataFim() { return dataFim; }
    public void setDataFim(Date dataFim) { this.dataFim = dataFim; }
    
    public int getSituacao() { return situacao; }
    public void setSituacao(int situacao) { this.situacao = situacao; }
    
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
    
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", setor='" + setor + '\'' +
                ", situacao=" + situacao +
                '}';
    }
    
}
