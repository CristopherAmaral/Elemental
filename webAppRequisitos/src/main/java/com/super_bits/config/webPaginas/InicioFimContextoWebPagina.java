/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfInicioFimAppWP;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;

/**
 *
 * @author Salvio
 */
public class InicioFimContextoWebPagina implements ItfInicioFimAppWP {

    @Override
    public void inicio() {
        System.out.println("Inicio Contexto");
        SBCore.configurar(FabConfiguracoesDeAmbienteelementalRequisitos.HOMOLOGACAO.getConfiguracao());
        SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteelementalRequisitos.HOMOLOGACAO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteelementalRequisitos.HOMOLOGACAO.getConfiguracaoWebPaginas());
    }

    @Override
    public void fim() {
        System.out.println("FIm do contexto para" + SBCore.getNomeProjeto());
    }

}
