package com.khatija.groceryapp1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account {
	 public static final String ROLE_MANAGER = "MANAGER";
	    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
	    
	    @Id
	    @Column(name = "User_Name", length = 20, nullable = false)
	    private String userName;
	 
	    @Column(name = "Password", length = 128, nullable = false)
	    private String Password;
	 
	    @Column(name = "Active", length = 1, nullable = false)
	    private boolean active;
	 
	    @Column(name = "User_Role", length = 20, nullable = false)
	    private String userRole;
	    
	    public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getPassword() {
	        return Password;
	    }
	 
	    public void setPassword(String Password) {
	        this.Password = Password;
	    }
	 
	    public boolean isActive() {
	        return active;
	    }
	 
	    public void setActive(boolean active) {
	        this.active = active;
	    }
	 
	    public String getUserRole() {
	        return userRole;
	    }
	 
	    public void setUserRole(String userRole) {
	        this.userRole = userRole;
	    }
	 
	    @Override
	    public String toString() {
	        return "[" + this.userName + "," + this.Password + "," + this.userRole + "]";
	    }


}
