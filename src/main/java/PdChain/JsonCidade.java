package PdChain;

/**
 *
 * @author Luiz Galhardo
 */

class JsonCidade extends Cidade {
    @Override
    public void escrever(String formato) {
        if (formato.equals("JSON")) {
            System.out.println("Lista de cidades em formato JSON:");
            StringBuilder jsonData = new StringBuilder("[");
            for (String cidade : listaDeCidades) {
                jsonData.append("\"").append(cidade).append("\", ");
            }
            jsonData.append("]");
            System.out.println(jsonData.toString());
        } else {
            super.escrever(formato);
        }
    }
}