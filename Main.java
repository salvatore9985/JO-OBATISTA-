import java.util.Scanner;

class AgenteLogico {
    private double pesoPreco;
    private double pesoQualidade;
    private double limiarDecisao;

    public AgenteLogico(double pesoPreco, double pesoQualidade, double limiarDecisao) {
        this.pesoPreco = pesoPreco;
        this.pesoQualidade = pesoQualidade;
        this.limiarDecisao = limiarDecisao;
    }

    public String decidirCompra(double preco, double qualidade) {
        double utilidade = this.pesoPreco * preco + this.pesoQualidade * qualidade;

        if (utilidade >= this.limiarDecisao) {
            return "Comprar";
        } else {
            return "Não comprar";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoPreco = 0.6;
        double pesoQualidade = 0.4;
        double limiarDecisao = 0.7;

        AgenteLogico agente = new AgenteLogico(pesoPreco, pesoQualidade, limiarDecisao);

        String[] perguntas = {
                "Qual é o preço do item? ",
                "Qual é a qualidade do item (em uma escala de 0 a 1)? "
        };

        String[] respostas = {
                "O agente recomenda: Comprar",
                "O agente recomenda: Não comprar"
        };

        System.out.println("Bem-vindo ao sistema de decisão de compra!");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            double respostaUsuario = scanner.nextDouble();
            System.out.println(respostas[i]);
        }
    }
}

