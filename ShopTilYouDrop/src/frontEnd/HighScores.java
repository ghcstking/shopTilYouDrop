package frontEnd;

import gui6.components.TextLabel;

public class HighScores extends TextLabel{
	
	private static String username;
	private static int score;
	private static int rank;

	public HighScores(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		HighScores.username = username;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		HighScores.score = score;
	}

	public static int getRank() {
		return rank;
	}

	public static void setRank(int rank) {
		HighScores.rank = rank;
	}

}
