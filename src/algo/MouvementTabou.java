package algo;

/**
 * Classe représentant un mouvement tabou.
 * @author user
 */
public class MouvementTabou {
	private IntraTourneeInfos intraTourneeInfos;

	/**
	 * Constructeur par données.
	 * @param intraTourneeInfos TODO
	 */
	public MouvementTabou(IntraTourneeInfos intraTourneeInfos) {
		this.intraTourneeInfos = intraTourneeInfos;
	}

	public IntraTourneeInfos getIntraTourneeInfos() {
		return intraTourneeInfos;
	}

}
