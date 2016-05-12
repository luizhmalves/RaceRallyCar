/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racerallycar;

/**
 *
 * @author Luiz Alves
 */
public interface Carro {
    void setVelocidade(int velocidade);
    int getVelocidade();
    void setAceleracao(int aceleracao);
    int getAceleracao();
    void setDirigibilidade(int direcao);
    int getDirigibilidade();
    void setFrenagem(int freio);
    int getFrenagem();
}
