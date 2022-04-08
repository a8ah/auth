package com.demo.auth.arch.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Entity {

  UUID getId();

  void setId(UUID id);

  LocalDateTime getCreated();

  void setCreated(LocalDateTime created);

  LocalDateTime getModified();

  void setModified(LocalDateTime modifited);

  boolean isDeleted();

  void setDeleted(boolean deleted);
  
}
