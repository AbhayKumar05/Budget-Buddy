package pt.iade.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "challengeuser")
public class ChallengeUser {

    @Id
    @Column(name = "challuser_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "challuser_chall_id")
    private int challId;
    @Column(name = "challuser_user_id")
    private int userId;

    public ChallengeUser(int id, int challId, int userId) {
        this.id = id;
        this.challId = challId;
        this.userId = userId;
    }

    public ChallengeUser() {

    }

    public int getId() {
        return id;
    }

    public int getChallId() {
        return challId;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChallId(int challId) {
        this.challId = challId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    
}

    