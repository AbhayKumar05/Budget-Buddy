package pt.iade.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "usercommunity")
public class Usercomm{
    @Id
    @Column(name = "usercomm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "usercomm_user_id")
    private int userId;
    @Column(name = "usercomm_comm_id")
    private int commId;

    public Usercomm(int id,int userId, int commId) {
        this.id = id;
        this.userId = userId;
        this.commId = commId;
    }

    public Usercomm() {
        
    }
    public int getId() {
        return id;
    }
    public int getUserId() {
        return userId;
    }
    public int getCommId() {
        return commId;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setCommId(int commId) {
        this.commId = commId;
    }

   
    
}

    