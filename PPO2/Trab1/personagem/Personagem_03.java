package personagem;
import habilidades.AtqForte;
import habilidades.AtqMedio;
import habilidades.MovMedio;
import habilidades.MovRapido;
import habilidades.PuloBaixo;

/**
 * Escreva uma descrição da classe Personagem_03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_03 extends Personagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
	public Personagem_03(){
        this.setA(AtqForte.getInstancia());
        this.setM(MovMedio.getInstancia());
    }
}
