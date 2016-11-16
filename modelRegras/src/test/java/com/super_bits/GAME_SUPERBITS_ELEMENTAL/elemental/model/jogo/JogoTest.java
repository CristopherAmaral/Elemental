/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.FabPosicao;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador.Jogador;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario.Usuario;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import org.junit.Test;

/**
 *
 * @author cristopher
 */
public class JogoTest {

    @Test
    public void testeFluxo() {

        try {

            // PRIMEIRO UM USUARIO ENTRA NO JOGO
            //
            Usuario usuario1 = new Usuario();
            usuario1.setEmail("usuaio1@elemental.com");
            usuario1.setNome("PLAYER 1");

            // USUARIO INICIA O JOGO
            //
            Jogo jogo = new Jogo(usuario1);

            // O JOGADOR 1 É DEFINIDO PARA O USUARIO QUE INICIOU A PARTIDA
            //
            Jogador jogador1 = new Jogador(usuario1);

            // O JOGADOR DO USUARIO É ADICIONADO AO JOGO ( O JOGADOR PODER SER ATRIBUIDO AO INSTANCIAR UM JOGO )
            //
            jogo.setJogador1(jogador1);

            // ENTRA UM SEGUNDO USUARIO
            //
            Usuario usuario2 = new Usuario();
            usuario2.setEmail("usuario2@elemental.com");

            // O JOGADOR 2 É DEFINIDO PARA O NOVO USUARIO
            //
            Jogador jogador2 = new Jogador(usuario2);

            // JOGO RECEBE O SEGUNDO JOGADOR
            //
            jogo.setJogador2(jogador2);

            // SE O JOGO CONTEM 2 JOGADORES E OS 2 JOGADORES SELECIONARAM SEU BARALHO INICIA PARTIDA
            //
            jogador1.setBaralhoPartida(jogador1.getUsuario().getBaralhos().get(0));

            jogador2.setBaralhoPartida(jogador2.getUsuario().getBaralhos().get(0));

            // ENTÃO A PARTIDA É INICIADA
            //
            jogo.iniciarPartida();

//
// INICIO DO TURNO DO PRIMEIRO JOGADOR
//
            jogo.iniciarTurno();

            // JOGADOR ESCOLHE UMA CARTA PARA REALIZAR ACAO
            //
            jogo.getTurnoAtual().getJogadaAtual().setCartaAcao(jogador1.getMao().get(0));

            jogo.getTurnoAtual().getJogador().getCartaAcao().setPosicao(FabPosicao.DEFESA_OCULTA.getRegistro());

            // JOGADOR COLOCAR A CARTA NO CAMPO NA POSICAO INFORMADA
            //
            jogo.getTurnoAtual().getJogadaAtual().colocarCartaNoCampo(jogo.getTurnoAtual().getJogador().getCartaAcao(), jogo.getTurnoAtual().getJogador().getCartaAcao().getPosicao());

            // JOGADOR ESCOLHE A POSICAO DA CARTA
            //
            jogo.getJogadorAtual().getCartaAcao().setPosicao(posicaoSelecionada);

            // JOGADOR ESCOLHE UMA ACAO
            //
            Acao acaoSelecionada = new Acao();

            acaoSelecionada.setNome("passar vez");

            //
            //
            // O JOGADOR ENTÃO REALIZA UMA JOGADA
            //
            jogo.jogar(jogo.getAcaoSelecionada(), null, null, null);

            // JOGADOR FINALIZA SUA JOGADA
            //
            jogador1.finalizarJogada();

//
// FIM DO TURNO DO PRIMEIRO JOGADOR
//
//
//
//
//
// INICIO DO TURNO DO SEGUNDO JOGADOR
//
            // O JOGO DEFINE O JOGADOR ATUAL COMO O JOGADOR SEGUINTE
            //
            jogo.setJogadorAtual(jogador2);

            // DEFINE TURNO ATUAL
            //
            jogo.iniciaTurno();

            // JOGADOR ESCOLHE UMA CARTA PARA REALIZAR ACAO
            //
            jogo.setCartaAcao(jogador2.getMao().get(0));

            // JOGADOR ESCOLHE A POSICAO DA CARTA
            //
            posicaoSelecionada.setNome("ataque");

            jogo.getCartaAcao().setPosicao(posicaoSelecionada);

            // JOGADOR COLOCAR A CARTA NO CAMPO NA POSICAO INFORMADA
            //
            jogador2.colocarCartaNoCampo(jogo.getCartaAcao(), jogo.getCartaAcao().getPosicao());

            // JOGADOR ESCOLHE UMA ACAO
            //
            acaoSelecionada.setNome("passar vez");

            // O JOGADOR ENTÃO REALIZA UMA JOGADA
            //
            jogo.jogar(jogo.getAcaoSelecionada(), null, null, null);

            // JOGADOR FINALIZA SUA JOGADA
            //
            jogador2.finalizarJogada();

//
// FIM DO TURNO DO SEGUNDO JOGADOR
//
//
//
//
//
// INICIO DO TURNO DO PRIMEIRO JOGADOR
//
            // DEFINE JOGADOR ATUAL
            //
            jogo.setJogadorAtual(jogador1);

            // DEFINE TURNO ATUAL
            //
            jogo.iniciaTurno();

            // JOGADOR SELECIONA UMA CARTA
            //
            jogo.setCartaAcao(jogador1.getMao().get(0));

            // JOGADOR SELECIONA A POSICAO DA CARTA
            //
            posicaoSelecionada.setNome("defesa");

            jogo.getCartaAcao().setPosicao(posicaoSelecionada);

            // JOGADOR COLOCA CARTA NO CAMPO
            //
            jogador1.colocarCartaNoCampo(jogo.getCartaAcao(), posicaoSelecionada);

            // JOGADOR SELECIONA AÇÃO
            //
            acaoSelecionada.setNome("passar vez");

            jogo.setAcaoSelecionada(acaoSelecionada);

            // JOGADOR EFETUA JOGADA
            //
            jogo.jogar(acaoSelecionada, null, null, null);

            jogador1.finalizarJogada();

//
// FIM DO TURNO DO PRIMEIRO JOGADOR
//
//
//
//
//
// INICIO DO TURNO DO SEGUNDO JOGADOR
//
            // DEFINE JOGADOR ATUAL
            //
            jogo.setJogadorAtual(jogador2);

            // DEFINE TURNO ATUAL
            //
            jogo.getJogadorAtual().iniciaTurno();

            // O JOGADOR DO TURNO SACA CARTA COMO É O PRIMEIRO TURNO RECEBE 5 CARTAS
            //
            jogo.sacarCarta(jogo.getJogadorAtual());

            // JOGADOR ESCOLHE UMA CARTA PARA REALIZAR ACAO
            //
            jogo.setCartaAcao(jogador2.getMao().get(0));

            // JOGADOR ESCOLHE A POSICAO DA CARTA
            //
            posicaoSelecionada.setNome("ataque");

            jogo.getCartaAcao().setPosicao(posicaoSelecionada);

            // JOGADOR COLOCAR A CARTA NO CAMPO NA POSICAO INFORMADA
            //
            jogador2.colocarCartaNoCampo(jogo.getCartaAcao(), jogo.getCartaAcao().getPosicao());

            // JOGADOR ESCOLHE UMA ACAO
            //
            acaoSelecionada.setNome("atacar");

            // JOGADOR DEFINE O TIPO DO ALVO
            //
            TipoAlvo tipoAlvoAtual = new TipoAlvo();
            tipoAlvoAtual.setNome("monstro");

            jogo.setTipoAlvo(tipoAlvoAtual);

            // JOGADOR DEFINE A CARTA ALVO
            //
            jogo.setCartaAlvo(jogo.getCartasMesaJogador1().get(0));

            // O JOGADOR ENTÃO REALIZA UMA JOGADA
            //
            jogo.jogar(jogo.getAcaoSelecionada(), jogo.getCartaAcao(), jogo.getTipoAlvo(), jogo.getCartaAlvo());

            // JOGADOR FINALIZA SUA JOGADA
            //
            jogador2.finalizarJogada();

        } catch (Throwable t) {

            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Aconteceu um erro inesperado ao testar o fluxo da partida!", t);

        }
    }

}
