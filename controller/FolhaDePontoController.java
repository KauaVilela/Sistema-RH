package controller;
import java.util.Date;
import model.FolhaDePonto;
import model.Ponto;
import java.time.ZoneId;

public class FolhaDePontoController {
    
    private FolhaDePonto folha;

    public FolhaDePontoController(Date dtInicio, Date dtFim){
        folha = new FolhaDePonto(dtInicio, dtFim);
    }

    public void adicionarPonto(Ponto ponto, int numero){

        Date data = Date.from(ponto.getMarcacao().atZone(ZoneId.systemDefault()).toInstant());

        folha.setPontos(ponto, data, numero);

    }

    public String visualizarFolha(){
        return folha.toString();
    }

}
