package pt.iade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;





@Entity
@Table(name = "budgets")
public class Budget {
    @Id
    @Column(name = "bud_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bud_value")
    private int budgetValue;
    @Column(name = "bud_dateStart")
    private String dateStart;
    @Column(name = "bud_dateEnd")
    private String dateEnd;
    @Column(name = "bud_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "bud_user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "bud_cat_id")
    private Category category;

    public Budget(int id, int budgetValue, String dateStart, String dateEnd, String name, Category category, User user) {
        this.id = id;
        this.budgetValue = budgetValue;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.name = name;
        this.user = user;
        this.category = category;
        
        
        //this.ownerId = ownerId;
    }
    
    public Budget() {    
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDateStart() {
        return dateStart;
    }
    public String getDateEnd() {
        return dateEnd;
    }
    public int getBudgetValue() {
        return budgetValue;
    }
    public User getUser() {
        return user;
    }
    public Category getCategory() {
        return category;
    }
    
    public String getCategoryName() {
        return category.getName();
    }
    public String getUserName() {
        return user.getName();
    }
    
    /*public int getOwnerId() {
        return ownerId;
    }*/
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
    public void setBudgetValue(int budgetValue) {
        this.budgetValue = budgetValue;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setCategoryName( String categoryName) {
        this.category.setName(categoryName);
    }
    public void setUserName( String userName) {
        this.user.setName(userName);
    }
    /*public void setCommId(Community community) {
        this.community = community;
    }*/
    /*public void setCatId( Category category) {
        this.category = category;
    }*/
    /*public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }*/

    
    

   
    
}
