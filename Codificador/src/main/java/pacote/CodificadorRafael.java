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

        int index = 0;
        for(char c: str.toCharArray()){
            if(index % 2 == 0){
                encoded.append((char) c + 2);
            }else{
                encoded.append((char) c + 3);
            }
            index++;
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        int index = 0;
        for(char c: str.toCharArray()) {
            if(index % 2 == 0){
                encoded.append((char) c - 2);
            }else{
                encoded.append((char) c - 3);
            }
            index++;
        }
        
        return encoded.toString();
    }
}