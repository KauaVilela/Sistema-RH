package interfaces;

public interface IRepositorio<T> {
    void salvar(T entidade);
    T buscarPorId(int id);
    void atualizar(T entidade);
    void deletar(int id);
}
