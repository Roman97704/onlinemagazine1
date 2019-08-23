package com.roman.onlinemagazine.DTO;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class BetDTO {

    private BigDecimal sum;
    private Timestamp timestamp;


    public BetDTO() {
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "BetDTO{" +
                "sum=" + sum +
                ", timestamp=" + timestamp +
                '}';
    }
}
