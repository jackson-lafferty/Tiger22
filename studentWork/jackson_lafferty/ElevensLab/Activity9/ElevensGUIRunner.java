package studentWork.jackson_lafferty.ElevensLab.Activity9;
import studentWork.jackson_lafferty.ElevensLab.Activity7.ElevensBoard;

public class ElevensGUIRunner {
	public static void main(String[] args) {
		ElevensBoard board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
