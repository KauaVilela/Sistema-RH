package model;
import java.util.Arrays;
import java.util.Date;

public class FolhaDePonto {
    
    private Date dtInicio, dtFim;
    private int qtdDias;
    private Ponto[][] pontos;
    


    public FolhaDePonto(Date dtInicio, Date dtFim) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;

         // Diferença em milissegundos
        float diffEmMillis = dtFim.getTime() - dtInicio.getTime();

        // Converter para dias
        float diffEmDias = diffEmMillis / (1000 * 60 * 60 * 24);

        int difDias = (int) diffEmDias;

        this.qtdDias = difDias;

        this.pontos = new Ponto[this.qtdDias][4];

    }

    // Getters and Setters

    public Date getDtInicio() {
        return dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public Ponto[][] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto ponto, Date data, int numero) {

        // Diferença em milissegundos
        float diffEmMillis = data.getTime() - dtInicio.getTime();

        // Converter para dias
        float diffEmDias = diffEmMillis / (1000 * 60 * 60 * 24);

        int difDias = (int) diffEmDias;

        this.pontos[difDias][numero] = ponto;
    }

    @Override
    public String toString() {
        return "FolhaDePonto [dtInicio=" + dtInicio + ", dtFim=" + dtFim + ", qtdDias=" + qtdDias + ", pontos="
                + Arrays.toString(pontos) + "]";
    }

    

}
