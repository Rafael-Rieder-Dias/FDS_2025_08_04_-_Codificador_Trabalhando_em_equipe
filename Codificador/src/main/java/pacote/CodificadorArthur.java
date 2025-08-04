package pacote;

import java.time.LocalDate;

public class CodificacaoArthur implements Codificador {//+2 para pares e -3 para impares
    public String getNome() {
        return "CodificacaoArthur";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 8, 4);
    }

    public int getNivelSeguranca() {
        return 3;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                encoded.append((char) (c + 2));
            } else {
                encoded.append((char) (c - 3));
            }
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                decoded.append((char) (c - 2));
            } else {
                decoded.append((char) (c + 3));
            }
        }

        return decoded.toString();
    }
}
