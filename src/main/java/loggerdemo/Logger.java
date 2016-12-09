package loggerdemo;

public class Logger {
    private LoggerFilter filter = new LoggerFilter();
    private LoggerSaver saver = LoggerSaverFactory.create();

    public void log(String message) {
        if (filter.filter(message)) {
            saver.saveToFile(message);
        }
    }
}

abstract class LoggerSaver {
    public abstract void saveToFile(String message);
}

class FileLoggerSaver extends LoggerSaver {
    @Override
    public void saveToFile(String message) {
        System.out.println("FileSaver");
    }
}

class LoggerFilter {
    public boolean filter(String message) {
        return true;
    }
}


class LoggerTest {
    public static void main(String[] args) {
        new Logger().log("qqq");
    }
}