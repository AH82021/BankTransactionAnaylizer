import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.logging.Log;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankStatementReader  implements BankStatementParser{

  private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public BankTransaction parseFromCSV(String line){
     String[] columns = line.split(",");

      final  double amount = Double.parseDouble(columns[0]);
       final String description = columns[1];
        final LocalDate date = LocalDate.parse(columns[2],df);

        return  new BankTransaction(date,amount,description);
    }


    @Override
    public List<BankTransaction> parseLinesFromCSV(final List<String> lines){
        final List<BankTransaction> bankTransactions = new ArrayList<>();
        for (String line:lines) {
            bankTransactions.add(parseFromCSV(line));
        }
        return bankTransactions;
    }

    }




