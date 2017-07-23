package br.ufpr.dinf.gres.loglog;

import java.util.ArrayList;
import java.util.List;

public class LogLog {

	private boolean autoFlush = true;
	private List<Listener> listeners = new ArrayList<>();

	public void putLog(String message) {
		LogLogData.addLog(message);
		if (this.autoFlush) {
			notifyListeners();
		}
	}

	public void putLog(String message, Level level) {
		LogLogData.addLog(message, level);
		if (this.autoFlush) {
			notifyListeners();
		}
	}

	public void putLog(String message, Level level, String obj) {
		LogLogData.addLog(message, level, obj);
		if (this.autoFlush) {
			notifyListeners();
		}
	}

	private void notifyListeners() {
		for (Listener listener : this.listeners) {
			listener.message();
		}
		if (this.autoFlush) {
			LogLogData.remove();
		}
	}

	public void addListner(Listener listener) {
		this.listeners.add(listener);
	}

	public void autoFlush(boolean b) {
		this.autoFlush = b;
	}

	public void flushLogs() {
		for (int i = 0; i < LogLogData.getLogs().size(); i++) {
			for (Listener listener : this.listeners) {
				listener.message();
			}
		}
		LogLogData.clear();
	}

}
