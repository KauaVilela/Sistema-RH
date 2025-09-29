package interfaces;

public interface IAprovavel {
    boolean isAprovado();
    void aprovar();
    void reprovar(String motivo);
    String getStatus();
}
