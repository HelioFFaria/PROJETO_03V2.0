/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.itons;

import java.util.ArrayList;

/**
 *
 * @author a
 */
public class Artista {
    private String nome;
    private String gênero;
    private String[] integrantes;
    private ArrayList<Disco> discos = new ArrayList<>();

    public Artista() {
    }

    public Artista(String nome, String gênero, String[] integrantes) {
        this.nome = nome;
        this.gênero = gênero;
        this.integrantes = integrantes;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }
    
}
