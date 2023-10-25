package PdChain;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Luiz Galhardo
 */
class Cidade {
    protected Cidade next;
    protected List<String> listaDeCidades = new ArrayList<>();

    public void setNext(Cidade next) {
        this.next = next;
    }

    public void adicionarCidade(String cidade) {
        listaDeCidades.add(cidade);
    }

    public void removerCidade(String cidade) {
        listaDeCidades.remove(cidade);
    }

    public void escrever(String formato) {
        if (next != null) {
            next.escrever(formato);
        }
    }
}