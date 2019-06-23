package bridge;

public class App {
    public static void main(String[] args) {
        // .NET平台下的Database log
        Log dbLog = new DatabaseLog();
        dbLog.setImplementor(new NImpLog());
        dbLog.Write(".NET平台");
        // JAVA平台下的Text File log
        Log txtLog = new TextFileLog();
        txtLog.setImplementor(new JImpLog());
        txtLog.Write("JAVA平台");
    }
}
