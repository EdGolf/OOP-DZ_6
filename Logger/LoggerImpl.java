package Logger;

class LoggerImpl implements Logger {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
