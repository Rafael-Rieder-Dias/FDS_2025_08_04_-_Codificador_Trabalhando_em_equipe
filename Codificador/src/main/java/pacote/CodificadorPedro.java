package pacote;

import java.time.LocalDate;

public class CodificadorPedro implements Codificador{
    public String getNome(){
        return "Codificador Pedro";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 04);
    }

    public int getNivelSeguranca(){
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 14));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 14));
        }
        
        return encoded.toString();
    }
}
