public class Pessoa {
    // Atributos da classe
    public String nome;
    public String sobrenome;
    // Métodos da classe
    public void falar(){
        System.out.println("falei");

    }
    // sobrecarga do metodo falar()
    public String falar(String volume ){
        return "falei" + volume;
    }
}
