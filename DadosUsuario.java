/**
 * Este programa pergunta o nome do usuário e um número, e retorna a letra
 * com base na posição do caractere escolhido através da clase String.
 * 
 * @author Tauany Rodrigues
*/

import java.util.Scanner;

class Usuario {
    String nome;
    char caractere;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public String getNome() {
        return this.nome;
    }

    public char getCaractere() {
        return this.caractere;
    }
}

class DadosUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instancia usuário
        Usuario usuario = new Usuario();

        // Pergunta o nome do usuário
        System.out.print("Seu nome: ");

        // Obtém o nome do usuário através da classe String
        String usuario_nome = new String(input.next());

        // Define o nome do usuário
        usuario.setNome(usuario_nome);

        // Pergunta o número
        System.out.print("Numero: ");

        // Obtém o número
        int numero = input.nextInt();
    
        // Verifica se a posição escolhida não é maior que o nome do usuário
        if (usuario_nome.length() > numero) {
            // Define a letra através do nome e do número
            usuario.setCaractere(usuario_nome.charAt(numero));

            // Fecha o scanner
            input.close();

            // Retorna os dados
            System.out.println("Letra: " + usuario.getCaractere());
        } else {
            System.out.println("Posicao Invalida");
        }
    }
}
