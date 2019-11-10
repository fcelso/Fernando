
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author logonlb
 */
public class MenuCadastro {

    public static int montaMenu() {
        int opcao;

        System.out.println("1) Cadastrar Aluno");
        System.out.println("2) Pesquisar por curso");
        System.out.println("3) Pesquisr por RGM");
        System.out.println("4) Limpar Cadastro");
        System.out.println("5) Sair");

        Scanner ler = new Scanner(System.in);
        opcao = ler.nextInt();
        return opcao;
    }

    public static void main(String[] args) {

        int opcao;
        Cadastrar cadastro = new Cadastrar();
        Scanner ler = new Scanner(System.in);
        ler.useDelimiter("\n");
        do {
            opcao = montaMenu();

            switch (opcao) {
                case 1:
                    String rgm,
                     nome, curso, semestre;
                    int idade;
                    float nota1, nota2;

                    System.out.println("Qual o RGM? ");
                    rgm = ler.next();

                    System.out.println("Qual o nome? ");
                    nome = ler.next();

                    System.out.println("Qual a idade? ");
                    idade = ler.nextInt();
                    
                    System.out.println("Qual o curso? ");
                    curso = ler.next();
                    
                    System.out.println("Qual o semestre? ");
                    semestre = ler.next();
                    
                    System.out.println("Qual a nota 1? ");
                    nota1 = ler.nextFloat();
                    
                    System.out.println("Qual a nota 2? ");
                    nota2 = ler.nextFloat();


                    cadastro.adicionarAluno(new Aluno(rgm, nome, idade, curso, semestre));

                    break;
                case 2:

                    System.out.println("Qual o curso do aluno?");
                    curso = ler.next();
                    Aluno a = cadastro.pesquisaCurso(curso);
                    if (a == null) {
                        System.out.println("Não encontrei");
                    } else {
                        a.print();
                    }
                    break;
                case 3:

                    System.out.println("Qual o RGM do aluno? ");
                    rgm = ler.next();
                    Aluno b = cadastro.pesquisaRgm(rgm);
                    if (b == null) {
                        System.out.println("Não encontrei");
                    } else {
                        b.print();
                    }
                    break;

                case 4:
                    cadastro.limparCadastro();
                    break;
                case 5:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção Incorreta!");

            }
        } while (opcao != 5);
    }

}
