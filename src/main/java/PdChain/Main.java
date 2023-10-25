package PdChain;

/**
 *
 * @author Luiz Galhardo
 */


public class Main {
    public static void main(String[] args) {
        Cidade xmlCidade = new XmlCidade();
        Cidade csvCidade = new CsvCidade();
        Cidade htmlCidade = new HtmlCidade();
        Cidade jsonCidade = new JsonCidade();

        // Encadeie as classes na ordem desejada
        xmlCidade.setNext(csvCidade);
        csvCidade.setNext(htmlCidade);
        htmlCidade.setNext(jsonCidade);

        // Adicione cidades à lista
        xmlCidade.adicionarCidade("São Paulo");
        xmlCidade.adicionarCidade("Rio de Janeiro");
        xmlCidade.adicionarCidade("Belo Horizonte");

        // Escreva a lista de cidades em diferentes formatos
        xmlCidade.escrever("XML");
        xmlCidade.escrever("CSV");
        xmlCidade.escrever("HTML");
        xmlCidade.escrever("JSON");
    }
}








