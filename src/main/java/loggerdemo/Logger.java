package loggerdemo;

public class Logger {
    private LoggerFilter filter = new LoggerFilter();
    private LoggerSaver saver;

    public Logger(LoggerSaver saver) { //DI
        this.saver = saver;
    }

    public void log(String message) {
        if (filter.filter(message)) {
            saver.save(message);
        }
    }
}

interface LoggerSaver {
    void save(String message);
}

class FileLoggerSaver  implements LoggerSaver {
    @Override
    public void save(String message) {
        System.out.println("FileSaver");
    }

    public void saveToFile() {}
}

class LoggerFilter {
    public boolean filter(String message) {
        return true;
    }
}


class LoggerTest {
    public static void main(String[] args) {
        new Logger(new FileLoggerSaver()).log("qqq");
    }
}