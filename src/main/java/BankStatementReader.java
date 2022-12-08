import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.logging.Log;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementReader  {
    private static final String RESOURCES ="src/main/resources/data.csv";
    public List<BankTransaction> parseFromCSV()  {
        List bankTransactionList  = null;
        try {
            bankTransactionList =
                    new CsvToBeanBuilder(new FileReader(RESOURCES))
                    .withType(BankTransaction.class)
                    .build().
                    parse();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
       return bankTransactionList;

    }

    }




