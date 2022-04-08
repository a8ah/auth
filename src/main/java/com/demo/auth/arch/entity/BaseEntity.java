package com.demo.auth.arch.entity;

import com.demo.auth.arch.utils.DateFormatterUtil;
import com.demo.auth.arch.utils.FieldConstrain;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity implements Entity {
  
  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(name = "id", updatable = false, nullable = false, length = FieldConstrain.UUID)
  private UUID id;
  
  @CreatedDate
  @Column(nullable = false, updatable = false)
  protected LocalDateTime created;

  @JsonIgnore
  @LastModifiedDate
  private LocalDateTime modified;

  @Column
  protected boolean deleted;


  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public void setId( UUID id) {
    this.id = id;
  }

  @Override
  public LocalDateTime getCreated() {
    return created;
  }

  @Override
  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  @Override
  public LocalDateTime getModified() {
    return modified;
  }

  @Override
  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  @Override
  public boolean isDeleted() {
    return deleted;
  }

  @Override
  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }

  public String getCreatedFormatted() {
    return DateFormatterUtil.format(this.getCreated());
  }

  public String getModifitedFormatted() {
    if (this.getModified() == null) 
      return null; 

    return DateFormatterUtil.format(this.getModified());
  }

}
