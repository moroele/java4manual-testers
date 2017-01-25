package loggerdemo2;

public class Logger {
    private Saver saver;

    public Logger(Saver saver) {
        this.saver = saver;
    }

    public void log(String message) {
        if (filter(message)) {
            saver.save(message);
        }
    }

    protected boolean filter(String message) {
        return true;
    }
}

class AltFilterLogger extends Logger {
    public AltFilterLogger(Saver saver) {
        super(saver);
    }

    @Override
    protected boolean filter(String message) {
        return super.filter(message);
    }
}
