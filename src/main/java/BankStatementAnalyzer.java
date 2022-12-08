import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzer {
    public double calculateTotalAmount(final List<BankTransaction> bankTransactions){
        double total = 0d;
        for (final BankTransaction bankTransaction:
                bankTransactions) {
            total +=bankTransaction.getAmount();
        }
        return total;
    }

    public  List<BankTransaction> selectInMonth(List<BankTransaction> bankTransactionList, Month month){
        final List<BankTransaction> bankTransactions = new ArrayList<>();
        for (final BankTransaction bankTransaction:bankTransactionList) {
            if(bankTransaction.getDate().getMonth()==month){
                bankTransactions.add(bankTransaction);
            }
        }
        return bankTransactions;
    }
}
