
import java.time.Month;

import java.util.List;



public class BankTransactionAnalyzer {
    private static final String RESOURCES ="src/main/resources/data.csv";
    public static void main( String[] args)  {

    BankStatementReader bankStatementReader = new BankStatementReader();
    List<BankTransaction> bankTransactions = bankStatementReader.parseFromCSV();
    BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();



      System.out.println("The total for all bankTransactions is: $"+bankStatementAnalyzer.calculateTotalAmount(bankTransactions));
        System.out.println("Transactions in FEBRUARY: ");
        bankStatementAnalyzer.selectInMonth(bankTransactions,Month.FEBRUARY).forEach(System.out::println);



        }









}
