import java.io.IOException;

public class AppDriver {
    public static void main(String[] args) throws IOException {
        String fileName = "data.csv";
        BankTransactionAnalyzer bankTransactionAnalyzer = new BankTransactionAnalyzer();
        BankStatementParser bankStatementParser = new BankStatementReader();
        bankTransactionAnalyzer.analyze(fileName,bankStatementParser);

    }
}
