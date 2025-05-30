/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.alunos
 */
public class Usuario {

//Atributos:
int id;
String membro_nome;
int idade;
String endereco;
boolean em_atraso;
List<Livro> livrosEmprestados = new ArrayList<>();

//Métodos
public boolean emprestar_livro(){};
public void devolver_livro(){};
}
