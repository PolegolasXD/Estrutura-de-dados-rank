/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author fábio
 */
public class ListaRank {

    private static final ArrayList<Elemento> listaPosicaoUm = new ArrayList<>();
    private static final ArrayList<Elemento> listaPosicaoDois = new ArrayList<>();
    private static final ArrayList<Elemento> listaPosicaoTres = new ArrayList<>();
    private static String listaPosicaoTitulo;

    public static void setRank(String nomePosicaoUm, String nomePosicaoDois, String nomePosicaoTres) {
        Elemento elementoUm = new Elemento(nomePosicaoUm); 
        Elemento elementoDois = new Elemento(nomePosicaoDois);        
        Elemento elementoTres = new Elemento(nomePosicaoTres);            
                
        ListaRank.listaPosicaoUm.add(elementoUm);
        ListaRank.listaPosicaoDois.add(elementoDois);
        ListaRank.listaPosicaoTres.add(elementoTres);
    }

    public static void setTitulo(String posicaoTitulo) {
        ListaRank.listaPosicaoTitulo = posicaoTitulo;
    }

    public static Elemento getPosicaoUm() {
        return ListaRank.listaPosicaoUm.get(listaPosicaoUm.size() - 1);
    }

    public static Elemento getPosicaoDois() {
        return ListaRank.listaPosicaoDois.get(listaPosicaoDois.size() - 1);
    }

    public static Elemento getPosicaoTres() {
        return ListaRank.listaPosicaoTres.get(listaPosicaoTres.size() - 1);
    }

    public static String getPosicaoTitulo() {
        return ListaRank.listaPosicaoTitulo;
    }

    public static ArrayList<Elemento> getListaPosicaoUm() {
        return listaPosicaoUm;
    }

    public static ArrayList<Elemento> getListaPosicaoDois() {
        return listaPosicaoDois;
    }

    public static ArrayList<Elemento> getListaPosicaoTres() {
        return listaPosicaoTres;
    }

    public ListaRank() {
    }

}
