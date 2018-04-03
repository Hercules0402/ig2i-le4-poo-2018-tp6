package algo;

import java.util.ArrayList;
import java.util.List;
import metier.Instance;
import metier.Planning;

/**
 * Représente une recherche tabou.
 * @author user
 */
public class RechercheTabou {
	private Instance instance;
	private List<MouvementTabou> ensMouvementsTabou;

	/**
	 * Constructeur par données.
	 * @param instance TODO
	 */
	public RechercheTabou(Instance instance) {
		this.instance = instance;
		this.ensMouvementsTabou = new ArrayList<>();
	}

	public void rechercheTabou() {
		if (this.instance != null) {
			int i = 0;
			Planning p = this.instance.getCopiePlanning();
			Planning pBest = this.instance.getCopiePlanning();
			while (i < 1000) {
				p = null;
				this.ensMouvementsTabou.add(this.instance.bestMove(ensMouvementsTabou));
				this.instance.setPlanning(p);
				if (p.getCout() < pBest.getCout()) {
					pBest = new Planning(p);
				}
				i++;
			}
		}
	}

}
