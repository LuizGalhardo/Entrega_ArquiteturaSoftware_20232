package PdChain;

/**
 *
 * @author Luiz Galhardo
 */

class CsvCidade extends Cidade {
    @Override
    public void escrever(String formato) {
        if (formato.equals("CSV")) {
            System.out.println("Lista de cidades em formato CSV:");
            StringBuilder csvData = new StringBuilder();
            for (String cidade : listaDeCidades) {
                csvData.append(cidade).append(",");
            }
            System.out.println(csvData.toString());
        } else {
            super.escrever(formato);
        }
    }
}
