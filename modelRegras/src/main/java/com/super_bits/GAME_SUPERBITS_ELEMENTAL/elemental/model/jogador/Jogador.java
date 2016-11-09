/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.baralho.Baralho;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Carta;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.CartaMesa;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario.Usuario;
import java.util.List;

/**
 *
 * @author cristopher
 */
public class Jogador {

    public Jogador(Usuario pUsuario) {

        usuario = pUsuario;

    }

    private int id;

    private int vida;

    private Usuario usuario;

    private List<Carta> mao;

    private List<CartaMesa> cartasMesa;

    private Baralho baralhoPartida;

    private Carta cartaAcao;

    private int qtdTurno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void setMao(List<Carta> mao) {
        this.mao = mao;
    }

    public List<CartaMesa> getCartasMesa() {
        return cartasMesa;
    }

    public void setCartasMesa(List<CartaMesa> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }

    public Baralho getBaralhoPartida() {
        return baralhoPartida;
    }

    public void setBaralhoPartida(Baralho baralhoPartida) {
        this.baralhoPartida = baralhoPartida;
    }

    public void finalizarJogada() {

    }

    public int getQtdTurno() {
        return qtdTurno;
    }

    public void incrementarQtdTurnos() {
        qtdTurno++;
    }

    public Carta getCartaAcao() {
        return cartaAcao;
    }

    public void setCartaAcao(Carta cartaAcao) {
        this.cartaAcao = cartaAcao;
    }

}
