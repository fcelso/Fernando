
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
public class Cadastrar {

    private ArrayList<Aluno> alunos;

    public Cadastrar() {
        alunos = new ArrayList<Aluno>();
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno pesquisaCurso(String curso) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCurso() != null) {

                System.out.println("***************************");
                System.out.println("RGM: " + alunos.get(i).getRgm());
                System.out.println("Nome: " + alunos.get(i).getNome());
                System.out.println("Idade: " + alunos.get(i).getIdade());
                System.out.println("Curso: " + alunos.get(i).getCurso());
                System.out.println("Semestre: " + alunos.get(i).getSemestre());
                System.out.println("Média final: " + (alunos.get(i).getNota1() + alunos.get(i).getNota2()) / 2);
                System.out.println("***************************");
            } else {
                break;
            }
        }
        return null;
    }

    public Aluno pesquisaRgm(String rgm) {

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRgm().equalsIgnoreCase(rgm)) {
                return alunos.get(i);
            }
        }
        return null;
    }

   /* public Aluno alterarDados() {

        Scanner ler = new Scanner(System.in);

        String rgm, nome, curso, semestre;

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCurso() != null) {

                System.out.println("Cadastro alterado");

                System.out.println("Qual o nome do aluno? ");
                nome = ler.next();
                alunos.get(i).getNome() = nome;

            }
        }
        return null;
    }*/

    public ArrayList<Aluno> pesquisaFaixaEtaria(int idadeInicial, int idadeFinal) {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getIdade() >= idadeInicial && alunos.get(i).getIdade() <= idadeFinal) {
                lista.add(alunos.get(i));
            }
        }
        return lista;
    }

    public void limparCadastro() {
        alunos.clear();
    }

}
