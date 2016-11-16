/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoClasse.FabTipoClasse;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoElemento.FabTipoElemento;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabCartaMonstro implements ItfFabrica {

    GUERREIRO_FOGO,
    GUERREIRO_TERRA,
    GUERREIRO_AGUA,
    GUERREIRO_AR,
    GUERREIRO_NEUTRO,
    MAGO_FOGO,
    MAGO_TERRA,
    MAGO_AGUA,
    MAGO_AR,
    MAGO_NEUTRO,
    BESTA_FOGO,
    BESTA_TERRA,
    BESTA_AGUA,
    BESTA_AR,
    BESTA_NEUTRO,
    DRAGAO_FOGO,
    DRAGAO_TERRA,
    DRAGAO_AGUA,
    DRAGAO_AR,
    DRAGAO_NEUTRO,
    TITA_FOGO,
    TITA_TERRA,
    TITA_AGUA,
    TITA_AR,
    TITA_NEUTRO,
    MAQUINA_FOGO,
    MAQUINA_TERRA,
    MAQUINA_AGUA,
    MAQUINA_AR,
    MAQUINA_NEUTRO,
    FANTASMA_FOGO,
    FANTASMA_TERRA,
    FANTASMA_AGUA,
    FANTASMA_AR,
    FANTASMA_NEUTRO,
    ANJO_FOGO,
    ANJO_TERRA,
    ANJO_AGUA,
    ANJO_AR,
    ANJO_NEUTRO,
    DEMONIO_FOGO,
    DEMONIO_TERRA,
    DEMONIO_AGUA,
    DEMONIO_AR,
    DEMONIO_NEUTRO,
    SEMI_DEUS_FOGO,
    SEMI_DEUS_TERRA,
    SEMI_DEUS_AGUA,
    SEMI_DEUS_AR,
    SEMI_DEUS_NEUTRO,
    DEUS_FOGO,
    DEUS_TERRA,
    DEUS_AGUA,
    DEUS_AR,
    DEUS_NEUTRO;

    // ORDEM DE PODER POR CLASSE
    //
    //
    // 01 PODER ATK E DEF ENTRE 80 - 100                 (DEUS)
    //
    // 02 PODER ATK E DEF ENTRE 60 - 80                  (SEMI-DEUS)
    //
    // 03 PODER ATK ENTRE 60 - 70 / DEF ENTRE 70 - 90    (TITÃ)
    //
    // 04 PODER ATK E DEF ENTRE 55 - 75                  (DRAGAO)
    //
    // 05 PODER ATK E DEF ENTRE 45 - 75                  (MAGO)
    //
    // 06.1 PODER ATK ENTRE 10 - 20 / DEF ENTRE 45 - 65  (ANJO)
    //
    // 06.2 PODER ATK ENTRE 45 - 65 / DEF ENTRE 10 - 20  (DEMONIO)
    //
    // 07 PODER ATK ENTRE 20 - 30 / DEF ENTRE 35 - 50    (MAQUINA)
    //
    // 08 PODER ATK E DEF ENTRE 25 - 50                  (GUERREIRO)
    //
    // 09 PODER ATK ENTRE 05 - 15 / DEF ENTRE 25 - 50    (FANTASMA)
    //
    // 10 PODER ATK ENTRE 10 - 30 / DEF ENTRE 15 - 35    (BESTA)
    //
    //
    // OBS: TODOS OS MONSTROS DO ELEMENTO NEUTRO TEM ATK E DEF O MINIMO DA CLASSE
    //
    //
    @Override
    public Object getRegistro() {

        Monstro monstroAtual = new Monstro();
        monstroAtual.setTipoCarta(FabTipoCarta.MONSTRO.getRegistro());

        switch (this) {

            case GUERREIRO_FOGO:

                monstroAtual.setNome("Guerreiro das Chamas");
                monstroAtual.setDescricao("Um Monstro Guerreiro do Elemento Fogo");
                monstroAtual.setTipoClasse(FabTipoClasse.GUERREIRO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.FOGO.getRegistro());
                monstroAtual.setAtk(35);
                monstroAtual.setDef(35);

                return monstroAtual;

            case GUERREIRO_TERRA:

                monstroAtual.setNome("Guerreiro das Planicies");
                monstroAtual.setDescricao("Um Monstro Guerreiro do Elemento Terra");
                monstroAtual.setTipoClasse(FabTipoClasse.GUERREIRO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.TERRA.getRegistro());
                monstroAtual.setAtk(35);
                monstroAtual.setDef(35);

                return monstroAtual;

            case GUERREIRO_AGUA:

                monstroAtual.setNome("Guerreiro das Ondas");
                monstroAtual.setDescricao("Um Monstro Guerreiro do Elemento Agua");
                monstroAtual.setTipoClasse(FabTipoClasse.GUERREIRO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.AGUA.getRegistro());
                monstroAtual.setAtk(35);
                monstroAtual.setDef(35);

                return monstroAtual;

            case GUERREIRO_AR:

                monstroAtual.setNome("Guerreiro das Vibrações");
                monstroAtual.setDescricao("Um Monstro Guerreiro do Elemento Ar");
                monstroAtual.setTipoClasse(FabTipoClasse.GUERREIRO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.AR.getRegistro());
                monstroAtual.setAtk(35);
                monstroAtual.setDef(35);

                return monstroAtual;

            case GUERREIRO_NEUTRO:

                monstroAtual.setNome("Guerreiro das Armas");
                monstroAtual.setDescricao("Um Monstro Guerreiro do Elemento Neutro");
                monstroAtual.setTipoClasse(FabTipoClasse.GUERREIRO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.FOGO.getRegistro());
                monstroAtual.setAtk(25);
                monstroAtual.setDef(25);

                return monstroAtual;

            case MAGO_FOGO:

                monstroAtual.setNome("Mago das Chamas");
                monstroAtual.setDescricao("Um Monstro Mago do Elemento Fogo");
                monstroAtual.setTipoClasse(FabTipoClasse.MAGO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.FOGO.getRegistro());
                monstroAtual.setAtk(55);
                monstroAtual.setDef(55);

                return monstroAtual;

            case MAGO_TERRA:

                monstroAtual.setNome("Mago das Planicies");
                monstroAtual.setDescricao("Um Monstro Mago do Elemento Terra");
                monstroAtual.setTipoClasse(FabTipoClasse.MAGO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.TERRA.getRegistro());
                monstroAtual.setAtk(55);
                monstroAtual.setDef(55);

                return monstroAtual;

            case MAGO_AGUA:

                monstroAtual.setNome("Mago das Ondas");
                monstroAtual.setDescricao("Um Monstro Mago do Elemento Agua");
                monstroAtual.setTipoClasse(FabTipoClasse.MAGO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.AGUA.getRegistro());
                monstroAtual.setAtk(55);
                monstroAtual.setDef(55);

                return monstroAtual;

            case MAGO_AR:

                monstroAtual.setNome("Mago das Vibrações");
                monstroAtual.setDescricao("Um Monstro Mago do Elemento Ar");
                monstroAtual.setTipoClasse(FabTipoClasse.MAGO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.AR.getRegistro());
                monstroAtual.setAtk(55);
                monstroAtual.setDef(55);

                return monstroAtual;

            case MAGO_NEUTRO:

                monstroAtual.setNome("Mago da Guerra");
                monstroAtual.setDescricao("Um Monstro Mago do Elemento Neutro");
                monstroAtual.setTipoClasse(FabTipoClasse.MAGO.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.NEUTRO.getRegistro());
                monstroAtual.setAtk(45);
                monstroAtual.setDef(45);

                return monstroAtual;

            case BESTA_FOGO:

                monstroAtual.setNome("Besta das Chamas");
                monstroAtual.setDescricao("Um Monstro Besta do Elemento Fogo");
                monstroAtual.setTipoClasse(FabTipoClasse.BESTA.getRegistro());
                monstroAtual.setTipoElemento(FabTipoElemento.FOGO.getRegistro());
                monstroAtual.setAtk(15);
                monstroAtual.setDef(20);

                return monstroAtual;

            case BESTA_TERRA:
                break;
            case BESTA_AGUA:
                break;
            case BESTA_AR:
                break;
            case BESTA_NEUTRO:
                break;
            case DRAGAO_FOGO:
                break;
            case DRAGAO_TERRA:
                break;
            case DRAGAO_AGUA:
                break;
            case DRAGAO_AR:
                break;
            case DRAGAO_NEUTRO:
                break;
            case TITA_FOGO:
                break;
            case TITA_TERRA:
                break;
            case TITA_AGUA:
                break;
            case TITA_AR:
                break;
            case TITA_NEUTRO:
                break;
            case MAQUINA_FOGO:
                break;
            case MAQUINA_TERRA:
                break;
            case MAQUINA_AGUA:
                break;
            case MAQUINA_AR:
                break;
            case MAQUINA_NEUTRO:
                break;
            case FANTASMA_FOGO:
                break;
            case FANTASMA_TERRA:
                break;
            case FANTASMA_AGUA:
                break;
            case FANTASMA_AR:
                break;
            case FANTASMA_NEUTRO:
                break;
            case ANJO_FOGO:
                break;
            case ANJO_TERRA:
                break;
            case ANJO_AGUA:
                break;
            case ANJO_AR:
                break;
            case ANJO_NEUTRO:
                break;
            case DEMONIO_FOGO:
                break;
            case DEMONIO_TERRA:
                break;
            case DEMONIO_AGUA:
                break;
            case DEMONIO_AR:
                break;
            case DEMONIO_NEUTRO:
                break;
            case SEMI_DEUS_FOGO:
                break;
            case SEMI_DEUS_TERRA:
                break;
            case SEMI_DEUS_AGUA:
                break;
            case SEMI_DEUS_AR:
                break;
            case SEMI_DEUS_NEUTRO:
                break;
            case DEUS_FOGO:
                break;
            case DEUS_TERRA:
                break;
            case DEUS_AGUA:
                break;
            case DEUS_AR:
                break;
            case DEUS_NEUTRO:
                break;
            default:
                throw new AssertionError(this.name());

        }

    }

}
