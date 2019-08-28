package com.roman.onlinemagazine.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "BET_TABLE")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal sum;
    private Timestamp timestamp;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne (optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "matchId" )
    private Match match;


    public Bet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id +
                ", sum=" + sum +
                ", timestamp='" + timestamp + '\'' +
//                ", match='" + match + '\'' +
                '}';
    }
}
