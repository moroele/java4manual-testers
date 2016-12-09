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

abstract class LoggerSaver {
    public abstract void save(String message);
    public void foo() {}
}

class FileLoggerSaver extends LoggerSaver {
    @Override
    public void save(String message) {
        System.out.println("FileSaver");
    }

    @Override
    public void foo() {
        //..
        super.foo();
        //..
    }
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