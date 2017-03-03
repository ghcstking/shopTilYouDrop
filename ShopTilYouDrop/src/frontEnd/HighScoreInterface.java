package frontEnd;

import gui6.components.Clickable;

public interface HighScoreInterface extends Clickable{
	
	void setUsername(String user);
	void setScore(double score);
	double getScore();
	String getUsername();
}
