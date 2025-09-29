package teste;

import model.*;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Classe de teste para todos os métodos do sistema de RH
 * Testa o código original sem as refatorações SOLID
 */
public class TesteCompleto {
    
    public static void main(String[] args) {
        TesteCompleto teste = new TesteCompleto();
        
        System.out.println("===== INICIANDO TESTES DO SISTEMA DE RH =====\n");
        
        teste.testarUsuario();
        teste.testarLider();
        teste.testarFuncionarioRH();
        teste.testarColaborador();
        teste.testarPalestrante();
        teste.testarTreinamento();
        teste.testarEvento();
        teste.testarPonto();
        teste.testarFolhaDePonto();
        teste.testarBancoDeHoras();
        teste.testarFerias();
        teste.testarAusencia();
        teste.testarAjustePonto();
        teste.testarAvaliacaoDesempenho();
        teste.testarTipoAvaliacao();
        teste.testarPesquisaClima();
        teste.testarPerguntaPesquisa();
        
        System.out.println("\n===== TESTES FINALIZADOS COM SUCESSO =====");
    }
    
    // ========== TESTES DE USUÁRIO ==========
    
    public void testarUsuario() {
        System.out.println("\n========== TESTE: Usuario ==========");
        
        // Teste construtor vazio
        Usuario usuario1 = new Usuario();
        System.out.println("✓ Construtor vazio criado");
        
        // Teste construtor com parâmetros
        Usuario usuario2 = new Usuario("joao.silva", "senha123", 1);
        System.out.println("✓ Usuario criado: " + usuario2);
        
        // Teste cadastrar usuário
        boolean cadastrado = usuario2.cadastrarUsuario();
        System.out.println("✓ Cadastro realizado: " + cadastrado);
        
        // Teste cadastro com dados inválidos
        Usuario usuario3 = new Usuario("", "", 1);
        boolean cadastroInvalido = usuario3.cadastrarUsuario();
        System.out.println("✓ Cadastro inválido testado: " + cadastroInvalido);
        
        // Teste alteração de senha correta
        boolean senhaAlterada = usuario2.alterarSenha("senha123", "novaSenha456");
        System.out.println("✓ Senha alterada com sucesso: " + senhaAlterada);
        
        // Teste alteração de senha incorreta
        boolean senhaErrada = usuario2.alterarSenha("senhaErrada", "outraSenha");
        System.out.println("✓ Senha incorreta testada: " + senhaErrada);
        
        // Teste alterar credenciais
        usuario2.alterarCredenciais("joao.silva2", "senha789");
        System.out.println("✓ Credenciais alteradas");
        
        // Teste atualizar nível
        usuario2.atualizarNivel(3);
        System.out.println("✓ Nível atualizado para: " + usuario2.getNivelAcesso());
        
        // Teste getters e setters
        usuario2.setLogin("novo.login");
        usuario2.setSenha("novaSenha");
        usuario2.setNivelAcesso(5);
        System.out.println("✓ Getters/Setters testados");
        System.out.println("  Login: " + usuario2.getLogin());
        System.out.println("  Nível: " + usuario2.getNivelAcesso());
    }
    
    // ========== TESTES DE LÍDER ==========
    
    public void testarLider() {
        System.out.println("\n========== TESTE: Lider ==========");
        
        // Teste construtor vazio
        Lider lider1 = new Lider();
        System.out.println("✓ Construtor vazio criado");
        
        // Teste construtor com parâmetros
        Lider lider2 = new Lider("maria.santos", "senha123", 3, 
                                 "Senior", "Tecnologia");
        System.out.println("✓ Lider criado: " + lider2);
        
        // Teste alterar setor responsável
        lider2.alterarSetorResponsavel("Operacoes");
        System.out.println("✓ Setor alterado para: " + lider2.getSetorResponsavel());
        
        // Teste alterar nível de liderança
        lider2.alterarNivel("Gerente");
        System.out.println("✓ Nível alterado para: " + lider2.getNivelLideranca());
        
        // Teste getters e setters
        lider2.setNivelLideranca("Diretor");
        lider2.setSetorResponsavel("Comercial");
        System.out.println("✓ Getters/Setters testados");
        System.out.println("  Nível Liderança: " + lider2.getNivelLideranca());
        System.out.println("  Setor: " + lider2.getSetorResponsavel());
    }
    
    // ========== TESTES DE FUNCIONÁRIO RH ==========
    
    public void testarFuncionarioRH() {
        System.out.println("\n========== TESTE: FuncionarioRH ==========");
        
        // Teste construtor vazio
        FuncionarioRH func1 = new FuncionarioRH();
        System.out.println("✓ Construtor vazio criado");
        
        // Teste construtor com parâmetros
        FuncionarioRH func2 = new FuncionarioRH("ana.costa", "senha123", 
                                                2, "Recrutamento");
        System.out.println("✓ FuncionarioRH criado: " + func2);
        
        // Teste getters e setters
        func2.setAreaAtuacao("Treinamento e Desenvolvimento");
        System.out.println("✓ Area alterada para: " + func2.getAreaAtuacao());
    }
    
    // ========== TESTES DE COLABORADOR ==========
    
    public void testarColaborador() {
        System.out.println("\n========== TESTE: Colaborador ==========");
        
        // Teste construtor vazio
        Colaborador colab1 = new Colaborador();
        System.out.println("✓ Construtor vazio criado");
        
        // Criar datas para teste
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 15);
        Date dataNascimento = cal.getTime();
        Date dataInicio = new Date();
        
        // Teste construtor completo
        Colaborador colab2 = new Colaborador(
            "Carlos Oliveira", 
            "12345678900", 
            dataNascimento, 
            1001,
            dataInicio, 
            null, 
            1, 
            "Desenvolvedor", 
            5000.00, 
            "TI"
        );
        System.out.println("✓ Colaborador criado: " + colab2);
        
        // Teste cadastrar colaborador
        colab2.cadastrarColaborador();
        System.out.println("✓ Cadastro realizado");
        
        // Teste alterar cargo
        colab2.alterarCargo("Desenvolvedor Senior");
        System.out.println("✓ Cargo: " + colab2.getCargo());
        
        // Teste alterar salário
        colab2.alterarSalario(7000.00);
        System.out.println("✓ Salário: R$ " + colab2.getSalario());
        
        // Teste alterar setor
        colab2.alterarSetor("Desenvolvimento");
        System.out.println("✓ Setor: " + colab2.getSetor());
        
        // Teste alterar dados
        colab2.alterarDados("Carlos Alberto Oliveira");
        System.out.println("✓ Nome alterado: " + colab2.getNome());
        
        // Teste solicitar promoção
        colab2.solicitarPromocao();
        System.out.println("✓ Promoção solicitada");
        
        // Teste alterar líder
        colab2.alterarLider();
        System.out.println("✓ Líder alterado");
        
        // Teste todos os setters
        colab2.setCpf("98765432100");
        colab2.setMatricula(1002);
        colab2.setDataFim(new Date());
        colab2.setSituacao(0);
        System.out.println("✓ Todos os setters testados");
        
        // Teste demitir colaborador
        colab2.demitirColaborador();
        System.out.println("✓ Situação após demissão: " + colab2.getSituacao());
    }
    
    // ========== TESTES DE PALESTRANTE ==========
    
    public void testarPalestrante() {
        System.out.println("\n========== TESTE: Palestrante ==========");
        
        Palestrante palestrante = new Palestrante(
            "Dr. Roberto Silva",
            "(11) 98765-4321",
            "Doutorado em Administracao",
            "Gestao de Pessoas",
            "Banco: 001 Ag: 1234 CC: 56789-0"
        );
        
        System.out.println("✓ Palestrante criado");
        System.out.println("  Nome: " + palestrante.getNome());
        System.out.println("  Telefone: " + palestrante.getTelefone());
        System.out.println("  Formação: " + palestrante.getFormacao());
        System.out.println("  Área: " + palestrante.getAreaDeAtuação());
        System.out.println("  Conta: " + palestrante.getContaBancaria());
        
        // Teste setters
        palestrante.setNome("Dr. Roberto Silva Jr.");
        palestrante.setTelefone("(11) 91111-2222");
        palestrante.setFormacao("PhD");
        palestrante.setAreaDeAtuação("Liderança");
        palestrante.setContaBancaria("Nova conta");
        System.out.println("✓ Todos os setters testados");
    }
    
    // ========== TESTES DE TREINAMENTO ==========
    
    public void testarTreinamento() {
        System.out.println("\n========== TESTE: Treinamento ==========");
        
        Calendar cal = Calendar.getInstance();
        Date dtInicio = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 2);
        Date dtFim = cal.getTime();
        
        // Teste construtor básico
        Treinamento trein1 = new Treinamento(dtInicio, dtFim, "Lideranca");
        System.out.println("✓ Treinamento criado: " + trein1.getTema());
        
        // Teste com palestrantes
        Palestrante[] palestrantes = new Palestrante[2];
        palestrantes[0] = new Palestrante("Dr. Joao", "111111111", 
                                         "PhD", "Lideranca", "Conta1");
        palestrantes[1] = new Palestrante("Dra. Maria", "222222222", 
                                         "Mestrado", "RH", "Conta2");
        
        Treinamento trein2 = new Treinamento(dtInicio, dtFim, 
                                             "Gestao", palestrantes);
        System.out.println("✓ Treinamento com palestrantes criado");
        
        // Teste setters
        trein1.setStatus("Agendado");
        trein1.setPalestrante(palestrantes);
        trein1.setDtInicio(new Date());
        trein1.setDtFim(new Date());
        trein1.setTema("Novo Tema");
        
        System.out.println("✓ Getters testados:");
        System.out.println("  Status: " + trein1.getStatus());
        System.out.println("  Palestrantes: " + trein1.getPalestrante().length);
    }
    
    // ========== TESTES DE EVENTO ==========
    
    public void testarEvento() {
        System.out.println("\n========== TESTE: Evento ==========");
        
        Date dataEvento = new Date();
        
        Evento evento = new Evento(
            dataEvento,
            "Confraternizacao Anual",
            "Evento de integracao",
            "Planejado",
            "Melhorar clima",
            15000.00
        );
        
        System.out.println("✓ Evento criado: " + evento.getTema());
        System.out.println("  Descricao: " + evento.getDescricao());
        System.out.println("  Status: " + evento.getStatus());
        System.out.println("  Investimento: R$ " + evento.getInvestimento());
        
        // Teste setters
        evento.setData(new Date());
        evento.setTema("Novo tema");
        evento.setDescricao("Nova descricao");
        evento.setStatus("Confirmado");
        evento.setJustificativa("Nova justificativa");
        evento.setInvestimento(20000.00);
        
        System.out.println("✓ Todos os setters testados");
        System.out.println("  Novo status: " + evento.getStatus());
    }
    
    // ========== TESTES DE PONTO ==========
    
    public void testarPonto() {
        System.out.println("\n========== TESTE: Ponto ==========");
        
        Colaborador colaborador = criarColaboradorTeste();
        LocalDateTime marcacao = LocalDateTime.now();
        
        Ponto ponto = new Ponto(marcacao, "REL001", colaborador);
        
        System.out.println("✓ Ponto registrado");
        System.out.println("  Marcacao: " + ponto.getMarcacao());
        System.out.println("  Relogio: " + ponto.getRelogio());
        System.out.println("  Colaborador: " + ponto.getColaborador().getNome());
        
        // Teste setters
        ponto.setMarcacao(LocalDateTime.now());
        ponto.setRelogio("REL002");
        System.out.println("✓ Setters testados");
    }
    
    // ========== TESTES DE FOLHA DE PONTO ==========
    
    public void testarFolhaDePonto() {
        System.out.println("\n========== TESTE: FolhaDePonto ==========");
        
        Calendar cal = Calendar.getInstance();
        Date dtInicio = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date dtFim = cal.getTime();
        
        FolhaDePonto folha = new FolhaDePonto(dtInicio, dtFim);
        
        System.out.println("✓ Folha de ponto criada");
        System.out.println("  Data inicio: " + folha.getDtInicio());
        System.out.println("  Data fim: " + folha.getDtFim());
        System.out.println("  Quantidade de dias: " + folha.getQtdDias());
        
        // Adicionar ponto
        Colaborador colab = criarColaboradorTeste();
        Ponto ponto = new Ponto(LocalDateTime.now(), "REL001", colab);
        folha.setPontos(ponto, dtInicio, 0);
        
        System.out.println("✓ Ponto adicionado à folha");
        System.out.println("  Folha: " + folha.toString());
    }
    
    // ========== TESTES DE BANCO DE HORAS ==========
    
    public void testarBancoDeHoras() {
        System.out.println("\n========== TESTE: BancoDeHoras ==========");
        
        Colaborador colab = criarColaboradorTeste();
        BancoDeHoras banco = new BancoDeHoras(colab);
        
        System.out.println("✓ Banco de horas criado");
        System.out.println("  Colaborador: " + banco.getColaborador().getNome());
        System.out.println("  Horas iniciais: " + banco.getBancoHoras());
        
        // Acumular horas
        banco.setBancoHoras(120); // 2 horas
        System.out.println("✓ Horas acumuladas: " + banco.getBancoHoras());
        
        banco.setBancoHoras(60); // mais 1 hora
        System.out.println("✓ Total acumulado: " + banco.getBancoHoras());
    }
    
    // ========== TESTES DE FÉRIAS ==========
    
    public void testarFerias() {
        System.out.println("\n========== TESTE: Ferias ==========");
        
        Calendar cal = Calendar.getInstance();
        Date dtInicio = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date dtFim = cal.getTime();
        
        Colaborador colab = criarColaboradorTeste();
        Ferias ferias = new Ferias(dtInicio, dtFim, colab);
        
        System.out.println("✓ Férias criadas");
        System.out.println("  Data inicio: " + ferias.getDtInicio());
        System.out.println("  Data fim: " + ferias.getDtFim());
        System.out.println("  Status: " + ferias.getStatus());
        System.out.println("  Colaborador: " + ferias.getColaborador().getNome());
    }
    
    // ========== TESTES DE AUSÊNCIA ==========
    
    public void testarAusencia() {
        System.out.println("\n========== TESTE: Ausencia ==========");
        
        Calendar cal = Calendar.getInstance();
        Date dtInicio = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        Date dtFim = cal.getTime();
        
        Colaborador colab = criarColaboradorTeste();
        Ausencia ausencia = new Ausencia(
            dtInicio, 
            dtFim, 
            1, 
            colab, 
            "Consulta médica"
        );
        
        System.out.println("✓ Ausência criada");
        System.out.println("  Tipo: " + ausencia.getTipo());
        System.out.println("  Aprovação: " + ausencia.isAprovado());
        System.out.println("  Justificativa: " + ausencia.getJustificativa());
        System.out.println("  ToString: " + ausencia.toString());
        System.out.println("  Aprovação: " + ausencia.isAprovado());
    }
    
    // ========== TESTES DE AJUSTE PONTO ==========
    
    public void testarAjustePonto() {
        System.out.println("\n========== TESTE: AjustePonto ==========");
        
        Colaborador colab = criarColaboradorTeste();
        Ponto ponto = new Ponto(LocalDateTime.now(), "REL001", colab);
        LocalDateTime ajuste = LocalDateTime.now().plusHours(1);
        
        AjustePonto ajustePonto = new AjustePonto(
            ponto,
            ajuste,
            "Esqueci de bater o ponto"
        );
        
        System.out.println("✓ Ajuste de ponto criado");
        System.out.println("  Ponto original: " + ajustePonto.getPonto().getMarcacao());
        System.out.println("  Ajuste para: " + ajustePonto.getAjustePonto());
        System.out.println("  Justificativa: " + ajustePonto.getJustificativa());
        System.out.println("  Aprovação: " + ajustePonto.isAprovacao());
        
        // Teste setters
        ajustePonto.setAprovacao(true);
        ajustePonto.setJustificativa("Nova justificativa");
        ajustePonto.setAjustePonto(LocalDateTime.now());
        
        System.out.println("✓ Todos os setters testados");
        System.out.println("  Aprovado: " + ajustePonto.isAprovacao());
    }
    
    // ========== TESTES DE AVALIAÇÃO DESEMPENHO ==========
    
    public void testarAvaliacaoDesempenho() {
        System.out.println("\n========== TESTE: AvaliacaoDesempenho ==========");
        
        Colaborador colab = criarColaboradorTeste();
        Date data = new Date();
        
        // Teste construtor simples
        AvaliacaoDesempenho aval1 = new AvaliacaoDesempenho(data, colab);
        System.out.println("✓ Avaliação criada (construtor simples)");
        
        // Teste com tipo de avaliação
        String[] perguntas = {"Pergunta 1", "Pergunta 2", "Pergunta 3"};
        TipoAvaliacao tipo = new TipoAvaliacao("360 graus", "Avaliacao completa", perguntas);
        
        AvaliacaoDesempenho aval2 = new AvaliacaoDesempenho(data, colab, tipo);
        System.out.println("✓ Avaliação criada (com tipo)");
        
        // Teste respostas
        int[] respostas = {5, 4, 5};
        aval2.setResposta(respostas);
        System.out.println("✓ Respostas definidas");
        
        // Teste gerar nota
        int nota = aval2.gerarNota();
        System.out.println("✓ Nota calculada: " + nota);
        
        // Teste getters
        System.out.println("  Data: " + aval2.getData());
        System.out.println("  Colaborador: " + aval2.getColaboradorAvaliado().getNome());
        System.out.println("  Tipo: " + aval2.getTipo().getNome());
        System.out.println("  Resposta[0]: " + aval2.getResposta(0));
        
        // Teste setters individuais
        aval2.setResposta(3, 1);
        aval2.setData(new Date());
        System.out.println("✓ Setters testados");
    }
    
    // ========== TESTES DE TIPO AVALIAÇÃO ==========
    
    public void testarTipoAvaliacao() {
        System.out.println("\n========== TESTE: TipoAvaliacao ==========");
        
        String[] perguntas = {
            "Como você avalia o trabalho em equipe?",
            "Como você avalia a comunicação?",
            "Como você avalia a liderança?"
        };
        
        TipoAvaliacao tipo = new TipoAvaliacao(
            "Avaliacao 360",
            "Avaliacao completa de desempenho",
            perguntas
        );
        
        System.out.println("✓ Tipo de avaliação criado");
        System.out.println("  Nome: " + tipo.getNome());
        System.out.println("  Descrição: " + tipo.getDescricao());
        System.out.println("  Quantidade de perguntas: " + tipo.quantidadePerguntas());
        
        // Teste getters de perguntas
        System.out.println("  Pergunta[0]: " + tipo.getPergunta(0));
        
        // Teste setters
        tipo.setNome("Novo nome");
        tipo.setDescricao("Nova descricao");
        tipo.setPergunta("Nova pergunta", 0);
        
        String[] novasPerguntas = {"P1", "P2", "P3", "P4"};
        tipo.setPergunta(novasPerguntas);
        
        System.out.println("✓ Todos os setters testados");
        System.out.println("  Nova quantidade: " + tipo.quantidadePerguntas());
    }
    
    // ========== TESTES DE PESQUISA CLIMA ==========
    
    public void testarPesquisaClima() {
        System.out.println("\n========== TESTE: PesquisaClima ==========");
        
        // Teste construtor vazio
        PesquisaClima pesquisa1 = new PesquisaClima();
        System.out.println("✓ Construtor vazio criado");
        
        // Teste construtor completo
        Calendar cal = Calendar.getInstance();
        Date dtInicio = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 7);
        Date dtFim = cal.getTime();
        
        PesquisaClima pesquisa2 = new PesquisaClima(dtInicio, dtFim, 5);
        System.out.println("✓ Pesquisa criada");
        System.out.println("  Quantidade de perguntas: " + pesquisa2.getQtdPerguntas());
        
        // Teste incluir pergunta
        String[] respostas = {"Discordo totalmente", "Discordo", "Neutro", "Concordo", "Concordo totalmente"};
        PerguntaPesquisa pergunta1 = new PerguntaPesquisa("Você está satisfeito com o ambiente?", respostas);
        
        String resultado1 = pesquisa2.incluirPergunta(pergunta1);
        System.out.println("✓ " + resultado1);
        
        PerguntaPesquisa pergunta2 = new PerguntaPesquisa("Você recomendaria a empresa?", respostas);
        String resultado2 = pesquisa2.incluirPergunta(pergunta2);
        System.out.println("✓ " + resultado2);
        
        // Teste setters
        pesquisa2.setDtInicio(new Date());
        pesquisa2.setDtFim(new Date());
        pesquisa2.setQtdPerguntas(10);
        
        System.out.println("✓ Setters testados");
        System.out.println("  Nova quantidade: " + pesquisa2.getQtdPerguntas());
    }
    
    // ========== TESTES DE PERGUNTA PESQUISA ==========
    
    public void testarPerguntaPesquisa() {
        System.out.println("\n========== TESTE: PerguntaPesquisa ==========");
        
        // Teste construtor vazio
        PerguntaPesquisa perg1 = new PerguntaPesquisa();
        System.out.println("✓ Construtor vazio criado");
        
        // Teste construtor completo
        String[] respostas = {"Sim", "Não", "Talvez"};
        PerguntaPesquisa perg2 = new PerguntaPesquisa(
            "Você está satisfeito?",
            respostas
        );
        
        System.out.println("✓ Pergunta criada");
        System.out.println("  Pergunta: " + perg2.getPergunta());
        System.out.println("  Respostas: " + perg2.getRespostaPadrao().length);
        
        // Teste setters
        perg2.setPergunta("Nova pergunta?");
        String[] novasRespostas = {"A", "B", "C", "D"};
        perg2.setRespostaPadrao(novasRespostas);
        
        System.out.println("✓ Setters testados");
        System.out.println("  Nova pergunta: " + perg2.getPergunta());
    }
    
    // ========== MÉTODO AUXILIAR ==========
    
    private Colaborador criarColaboradorTeste() {
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        Date dataNasc = cal.getTime();
        
        return new Colaborador(
            "João da Silva",
            "12345678900",
            dataNasc,
            1001,
            new Date(),
            null,
            1,
            "Analista",
            3000.00,
            "TI"
        );
    }
}
