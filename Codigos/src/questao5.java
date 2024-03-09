public class questao5 {
    public static void main(String[] args) {
        String teste = "Contrário";
        String resultadoInversao = inverterString(teste);
        System.out.println("String original: " + teste);
        System.out.println("String invertida: " + resultadoInversao);
    }

    /**
     * Função que inverte a String passada como parâmetro e retorna o resultado.
     * @param teste
     * @return String invertida
     */
    public static String inverterString(String teste) {
        char[] testeChar = teste.toCharArray();
        char[] testeCharInvertido = new char[teste.length()];

        for (int i = teste.length() - 1, j = 0; i >= 0; i--, j++) {
            testeCharInvertido[j] = testeChar[i];
        }

        // Construir e retornar a string invertida
        return new String(testeCharInvertido);
    }
}

