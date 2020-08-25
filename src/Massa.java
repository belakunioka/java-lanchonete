/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellakunioka
 */
public abstract class Massa extends Lanche {
    private String molho;
	private String tipoDeMassa;

	public String getTipoDeMassa() {
		return tipoDeMassa;
	}

	public void setTipoDeMassa(String tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}
	
    /**
     *
     * @param distancia
     * @return
     */
    @Override
	public int tempoDeEntrega (int distancia) {
		return super.tempoDeEntrega(distancia) + 30;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
}
