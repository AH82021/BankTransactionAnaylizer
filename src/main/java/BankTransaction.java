import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;


import java.time.LocalDate;

public class BankTransaction {
    @CsvBindByName(column = "date")
  @CsvDate("dd-MM-yyyy")
    private LocalDate date;

    @CsvBindByName
    private double amount;

    @CsvBindByName
    private String description;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BankTransaction: {" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}