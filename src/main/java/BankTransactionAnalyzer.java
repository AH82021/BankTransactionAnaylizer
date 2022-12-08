

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;



public class BankTransactionAnalyzer {

    private static final String RESOURCES ="src/main/resources/";

    public void analyze(final String fileName,final BankStatementParser bankStatementParser) throws IOException{
        final Path path = Paths.get(RESOURCES+fileName);
        List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
        collectSummary(bankStatementProcessor);
    }

        private static void collectSummary(BankStatementProcessor bankStatementProcessor){
            System.out.println("The total for all Transactions is: $"
                    + bankStatementProcessor.calculateTotalAmount()
                    +"\nThe total for all Transactions in January is: $"+ bankStatementProcessor.selectInMonth(Month.JANUARY)
            +"\nThe total for all Transactions in February is: $"+ bankStatementProcessor.selectInMonth(Month.FEBRUARY)
                    +"\nThe total for all Transactions in March is: $"+ bankStatementProcessor.selectInMonth(Month.MARCH));
        }









}
