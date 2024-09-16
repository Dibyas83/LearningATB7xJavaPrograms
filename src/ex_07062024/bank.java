package ex_07062024;

public class bank {
    private String currency;
    private Integer amount;

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(bank bankName) {
        if (!bankName.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("currency not matching");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //custom exception calling logic mismatch

        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

}