package personagem;
import habilidades.AtqForte;

import habilidades.MovDevagar;



/**
 * Escreva uma descrição da classe Personagem_03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_05 extends Personagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
	public Personagem_05(){
		this.setPosX(250);
		this.setPosY(250);
        this.setA(AtqForte.getInstancia());
        this.setM(MovDevagar.getInstancia());
    }
}
