
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
    private ArrayList <Aluno> alunos;
    
    public Cadastrar(){
        alunos = new  ArrayList<Aluno>();
    }

    /**
     * @return the alunos
     */
    public ArrayList <Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList <Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public Aluno pesquisaCurso(String curso){
        for(int i = 0; i<alunos.size(); i++){
            if(alunos.get(i).getCurso() .equalsIgnoreCase(curso)){
                return alunos.get(i);
            }
        }
        return null;
    }
    
    public Aluno pesquisaRgm(String rgm){
        //ArrayList<Aluno> lista = new ArrayList<Aluno> ();
        
       for(int i = 0; i<alunos.size(); i++){
            if(alunos.get(i).getRgm() .equalsIgnoreCase(rgm)){
                return alunos.get(i);
            }
        }
        return null;
        
    }
    public void limparCadastro(){
        alunos.clear();
    }
   
   
}
