package controller;

public class Ex3 {
    public Ex3(){
        super();
    }
    public String frecinvertepalavra(String palavra, int tamanho){
        if (tamanho == 1) {
            //A condição de parada foi realizada pensando no primeira letra da palavra. Com a recursiva eu vou excluindo os demais
            // caracteres e paro quando chegar na última letra, fazendo com que ela seja a primeira letra.
            return palavra;
        }
        //Aqui chamo a recursiva excluindo a primeira letra e vou diminuindo o tamanho da palavra. O charAt retorna o caractere na posição 0.
        return frecinvertepalavra(palavra.substring(1), tamanho -1) + palavra.charAt(0);

    }
}
