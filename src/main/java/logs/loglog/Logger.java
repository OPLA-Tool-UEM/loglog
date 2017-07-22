package logs.loglog;

public class Logger {

	private static LogLog logger = null;

	public static void addListener(Listener listener) {
		getLogger().addListner(listener);
	}

	public static LogLog getLogger() {
		if (logger == null) {
			logger = new LogLog();
		}
		return logger;
	}
}
