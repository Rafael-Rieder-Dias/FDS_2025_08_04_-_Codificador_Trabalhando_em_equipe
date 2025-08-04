package pacote;

public class CodificadorRafael implements Codificador{
    public String getNome(){
        return "Codificador Rafael";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 08, 04);
    }

    public int getNivelSeguranca(){
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }
        
        return encoded.toString();
    }
}