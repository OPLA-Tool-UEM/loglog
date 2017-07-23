package br.ufpr.dinf.gres.loglog;

public class Level {

	public static Level INFO = new Level("INFO");
	public static Level ERROR = new Level("ERROR");
	public static Level DEBUG = new Level("DEBUG");
	public static Level FATAL = new Level("FATAL");
	public static Level WARNING = new Level("WARNING");

	private String level;

	public Level(String level) {
		this.level = level;
	}

	public String getLevel() {
		return this.level;
	}
}
