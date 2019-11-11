
import java.util.ArrayList;


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
            if (alunos.get(i).getCurso().equals(curso)) {

               return alunos.get(i);
                /*System.out.println("***************************");
                System.out.println("RGM: " + getRgm());
                System.out.println("Nome: " + alunos.get(i).getNome());
                System.out.println("Idade: " + alunos.get(i).getIdade());
                System.out.println("Curso: " + alunos.get(i).getCurso());
                System.out.println("Semestre: " + alunos.get(i).getSemestre());
                System.out.println("Média final: " + (alunos.get(i).getNota1() + alunos.get(i).getNota2()) / 2);
                System.out.println("***************************");
            } else {
                break;*/
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

   public Aluno alterarDados(String rgmV,String rgmN, String nome, int idade, String curso, String semestre, float nota1, float nota2) {
 
       for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getRgm().equals(rgmV))
                alunos.get(i).setNome(nome);
                alunos.get(i).setRgm(rgmN);
                alunos.get(i).setCurso(curso);
                alunos.get(i).setIdade(idade);
                alunos.get(i).setSemestre(semestre);
                alunos.get(i).setNota1(nota1);
                alunos.get(i).setNota2(nota2);

       }
       return null;
   }
    public ArrayList<Aluno> pesquisaFaixaEtaria(int idadeInicial, int idadeFinal) {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getIdade() >= idadeInicial && alunos.get(i).getIdade() <= idadeFinal) {
                lista.add(alunos.get(i));
            }
        }
        return lista;
    }
    
    public void maiorMedia(){
       
        if(alunos.size() == 0){
            System.out.println("Nenhum registro encontrado.");
        }else{
        float x = 0;
        for(int i = 0;i < alunos.size();i++){
           
            if(x < (alunos.get(i).getNota1()+alunos.get(i).getNota2())/2){
                x = (alunos.get(i).getNota1()+alunos.get(i).getNota2())/2;
            }            
        }
        for(int i = 0;i < alunos.size();i++){
           if(x == (alunos.get(i).getNota1()+alunos.get(i).getNota2())/2){
               System.out.println("Maior media:"+x);
           
        }
        }
    }
    }

    public void limparCadastro() {
        alunos.clear();
    }

}
