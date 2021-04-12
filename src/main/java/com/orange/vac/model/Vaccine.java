package com.orange.vac.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Vaccine {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  @JsonFormat(pattern="yyyy-MM-dd")
  private Date date;

  @ManyToOne
  @JoinColumn(nullable = false)
  private User user;

  public Vaccine() {
  }

  public Vaccine(Long id, String name, Date date, User user) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.user = user;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vaccine)) {
            return false;
        }
        Vaccine vaccine = (Vaccine) o;
        return Objects.equals(id, vaccine.id) && Objects.equals(name, vaccine.name) && Objects.equals(date, vaccine.date) && Objects.equals(user, vaccine.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, date, user);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", date='" + getDate() + "'" +
      ", user='" + getUser() + "'" +
      "}";
  }

}
