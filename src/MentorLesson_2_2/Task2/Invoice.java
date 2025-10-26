package MentorLesson_2_2.Task2;

public class Invoice {
    private String invoiceNumber;
    private String clientName;
    private double amount;

    public Invoice(String invoiceNumber, String clientName, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", clientName='" + clientName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

