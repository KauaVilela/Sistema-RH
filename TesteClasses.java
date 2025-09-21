import java.util.Date;

public class TesteClasses {
    public static void main(String[] args) {
        System.out.println("=== TESTE COLABORADOR ===");
        Colaborador colaborador = new Colaborador( "João Silva",  "123.456.789-00",  new Date(2003-7-14) , 1, new Date(2022-7-14), new Date(2025-9-21),1,  "Desenvolvedor", 5000.0, "TI" );
        
        colaborador.cadastrarColaborador();
        colaborador.alterarSalario(5500.0);
        colaborador.solicitarPromocao();
        System.out.println(colaborador);
        
        System.out.println("\n=== TESTE USUARIO ===");
        Usuario usuario = new Usuario("admin", "123456", 3);
        usuario.cadastrarUsuario();
        usuario.alterarSenha("123456", "novasenha123");
        usuario.atualizarNivel(2);
        System.out.println(usuario);
        
        System.out.println("\n=== TESTE LIDER ===");
        Lider lider = new Lider("lider01", "senha123", 2, "Senior", "Desenvolvimento");
        lider.cadastrarUsuario();
        lider.alterarSetorResponsavel("Qualidade");
        lider.alterarNivel("Pleno");
        System.out.println(lider);
        
        System.out.println("\n=== TESTE FUNCIONARIO RH ===");
        FuncionarioRH funcionarioRH = new FuncionarioRH("rh01", "rh123", 3, "Recrutamento e Seleção");
        funcionarioRH.cadastrarUsuario();
        funcionarioRH.setAreaAtuacao("Desenvolvimento Organizacional");
        System.out.println(funcionarioRH);
    }
}
