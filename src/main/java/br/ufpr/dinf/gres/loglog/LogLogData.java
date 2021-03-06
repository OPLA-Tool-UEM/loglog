package br.ufpr.dinf.gres.loglog;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LogLogData {
	private static List<String> logs = new LinkedList<>();

	public static String printLog() {
		return (String) logs.get(0);
	}

	public static List<String> getLogs() {
		return Collections.unmodifiableList(logs);
	}

	public static void addLog(String message) {
		logs.add(message);
	}

	public static void addLog(String message, Level level) {
		logs.add("[" + level.getLevel() + "] - " + message);
	}

	public static void addLog(String message, Level level, String obj) {
		logs.add(obj + " | [" + level.getLevel() + "] - " + message);
	}

	public static void clear() {
		logs.clear();
	}

	public static void remove() {
		logs.remove(0);
	}
}
