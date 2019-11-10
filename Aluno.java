/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonlb
 */
public class Aluno {

    private String nome;
    private String rgm;
    private int idade;
    private String curso;
    private String semestre;
    private int nota1;
    private int nota2;

    public Aluno(String rgm, String nome, int idade, String curso, String semestre) {
        this.rgm = rgm;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.semestre = semestre;
        
    }

    public Aluno() {
        this("", "", 0, "", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.nome = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.nome = semestre;
    }
    
    public float getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    
    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    public float calculaMedia(){
        float media;
        media = nota1 + nota2 / 2;
        
        return media;
    }

    public void print() {
        System.out.println("***************************");
        System.out.println("RGM: " + this.rgm);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Média final: " + calculaMedia());
        System.out.println("***************************");

    }

}
