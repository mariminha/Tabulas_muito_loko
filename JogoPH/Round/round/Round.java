package round;
import entities.*;

public class Round {
	
	
	/*constants - indica as casas especiais*/
	private int[] dont_play_houses = {10,25,38};
	private int[] surprise_house = {13};
	private int[] luck_houses = {5,15,30};
	private int[] choose_to_init_houses = {17,27};
	private int[] magic_houses = {20,35};
	
	/*attributes*/
	private Persons[] player;//onde os jogadores ficarão armazenados
	
	/*constructor*/
	public Round(Persons[] person) {
		this.player = person;
		
		
		
	}
	
	/*gets and sets*/
	public Persons[] getPerson() {
		return player;
	}
	public void setPerson(Persons[] person) {
		this.player = person;
	}
	
	/*methods*/
	
	public boolean IsIn(int number, int[] arr) {
		for(int element : arr) {
			if(number == element) {
				return true;
			}
		}
		return false;
	}
	
	public void makeRound(int num_player) {//onde o jogador fará sua jogada.
		player[num_player].rollDice();//anda
		player[num_player].walk();
		int house = player[num_player].getHouse();
		player[num_player].setDont_play(IsIn(house, this.dont_play_houses));
		player[num_player].setSurprise(IsIn(house, this.surprise_house)); 
		player[num_player].setLuck(IsIn(house, this.luck_houses));
		player[num_player].setMagic(IsIn(house, this.magic_houses));
		player[num_player].setChooseToInit(IsIn(house, this.choose_to_init_houses));
	}
	
	
	
	
	
}
