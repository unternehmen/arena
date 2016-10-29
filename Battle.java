class Battle {
	Fighter alpha, beta;
	
	public Battle(Fighter alpha, Fighter beta) {
		this.alpha = alpha;
		this.beta = beta;
	}

	public boolean run() {
		Fighter current, opposite, temp;
		
		/* Run the battle. */
		current = fighterOne;
		opposite = fighterTwo;
		while (!current.isDead()) {
			current.performTurn(opposite);
			
			/* In case the fighter's own move killed it. */
			if (current.isDead()) break;
			
			/* Switch the combatants. */
			temp = current;
			current = opposite;
			opposite = temp;
		}
		
		opposite.respondToVictory();
		
		return current != fighterOne;
	}
}
