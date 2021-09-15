package com.brs.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class User {
@Id
private int userLoginId;
private String userName;
private String password;
private String firstName;
private String lastName;
private long contact;
private String email;
@OneToOne(targetEntity = Reservation.class)
private Reservation reservation;

public int getuserLoginId() {
return userLoginId;
}

public void setuserLoginId(int userloginid) {
this.userLoginId = userloginid;
}

        public String getUsername() {
return userName;
}

public void setUsername(String username) {
this.userName = username;
}
       
        public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}
       
        public String getfirstName() {
return firstName;
}

public void setfirstName(String firstname) {
this.firstName = firstname;
}
       
        public String getlastName() {
return lastName;
}

public void setlastName(String lastName) {
this.lastName = lastName;
}
       
        public long getContact() {
return contact;
}

public void setContact(long contact) {
this.contact = contact;
}

        public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

        public Reservation getReservation() {
return reservation;
}

public void setReservation(Reservation reservation) {
this.reservation = reservation;
}
}