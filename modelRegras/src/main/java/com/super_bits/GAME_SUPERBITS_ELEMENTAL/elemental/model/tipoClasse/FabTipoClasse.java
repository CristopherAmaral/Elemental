/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoClasse;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabTipoClasse implements ItfFabrica {

    GUERREIRO,//// 08
    MAGO,///////// 05
    BESTA,//////// 10
    DRAGAO,/////// 04
    TITA,///////// 03
    MAQUINA,////// 07
    FANTASMA,///// 09
    ANJO,///////// 06.1
    DEMONIO,////// 06.2
    SEMI_DEUS,//// 02
    DEUS;///////// 01

    // ORDEM DE PODER POR CLASSE
    //
    //
    // 01 PODER ATK E DEF ENTRE 80 - 100                 (DEUS)
    // 02 PODER ATK E DEF ENTRE 60 - 80                  (SEMI-DEUS)
    // 03 PODER ATK ENTRE 60 - 70 / DEF ENTRE 70 - 90    (TITÃ)
    // 04 PODER ATK E DEF ENTRE 55 - 75                  (DRAGAO)
    // 05 PODER ATK E DEF ENTRE 45 - 75                  (MAGO)
    // 06.1 PODER ATK ENTRE 10 - 20 / DEF ENTRE 45 - 65  (ANJO)
    // 06.2 PODER ATK ENTRE 45 - 65 / DEF ENTRE 10 - 20  (DEMONIO)
    // 07 PODER ATK ENTRE 25 - 35 / DEF ENTRE 40 - 55    (MAQUINA)
    // 08 PODER ATK E DEF ENTRE 25 - 50                  (GUERREIRO)
    // 09 PODER ATK ENTRE 05 - 15 / DEF ENTRE 25 - 50    (FANTASMA)
    // 10 PODER ATK ENTRE 10 - 30 / DEF ENTRE 15 - 35    (BESTA)
    //
    //
    @Override
    public TipoClasse getRegistro() {

        TipoClasse tipoClasseAtual = new TipoClasse();

        switch (this) {
            case GUERREIRO:

                tipoClasseAtual.setNome("Guerreiro");
                tipoClasseAtual.setDescricao("Os Guerreiros são lutadores muito corajosos com Ataque e Desefesa geralmente equilibrados");

                return tipoClasseAtual;

            case MAGO:

                tipoClasseAtual.setNome("Mago");
                tipoClasseAtual.setDescricao("Os Magos são especialistas muito inteligentes, capacitados em atacar ou defender com grande poder");

                return tipoClasseAtual;

            case BESTA:

                tipoClasseAtual.setNome("Besta");
                tipoClasseAtual.setDescricao("As Bestas são animais misticos muito habilidosos, geralmente de baixo poder porem muito adaptativos");

                return tipoClasseAtual;

            case DRAGAO:

                tipoClasseAtual.setNome("Dragão");
                tipoClasseAtual.setDescricao("Os Dragões são criaturas muito poderosas, capacitados a atacar e defender com grande poder");

                return tipoClasseAtual;

            case TITA:

                tipoClasseAtual.setNome("Titã");
                tipoClasseAtual.setDescricao("Os Titãs são criaturas gigantes e estrondosas, guardiões quase imbativeis, possuem enorme poder destrutivo e uma defesa vigorosa");

                return tipoClasseAtual;

            case MAQUINA:

                tipoClasseAtual.setNome("Maquina");
                tipoClasseAtual.setDescricao("As Maquinas são invenções muito uteis, possuem facilidade em aprimoramento podendo aumentar seu ataque e geralmente possuem boa defesa");

                return tipoClasseAtual;

            case FANTASMA:

                tipoClasseAtual.setNome("Fantasma");
                tipoClasseAtual.setDescricao("Os Fantasmas são espectros de almas das vidas que foram levadas, apesar de possuirem baixo poder de ataque não podem ser atingidos fisicamente");

                return tipoClasseAtual;

            case ANJO:

                tipoClasseAtual.setNome("Anjo");
                tipoClasseAtual.setDescricao("Anjos são divindades aladas, possuem poderes defensivos milagrosos");

                return tipoClasseAtual;

            case DEMONIO:

                tipoClasseAtual.setNome("Demonio");
                tipoClasseAtual.setDescricao("Os Demonios são seres do submundo, possuem poderes ofensivos aterrorizantes");

                return tipoClasseAtual;

            case SEMI_DEUS:

                tipoClasseAtual.setNome("Semi-Deus");
                tipoClasseAtual.setDescricao("Os Semi-Deuses são guerreiros de imenso poder, com enorme poder de Ataque e Defesa são praticamente indestrutiveis");

                return tipoClasseAtual;

            case DEUS:

                tipoClasseAtual.setNome("Deus");
                tipoClasseAtual.setDescricao("Os Deuses são os seres supremos, criadores de tudo são capazes de destruir tudo que a ele se opor");

                return tipoClasseAtual;

            default:
                throw new AssertionError(this.name());

        }

    }

}
