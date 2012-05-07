/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.swift.codec;

@ThriftStruct("Bonk")
public class BonkBean {
  private String message;
  private int type;

  public BonkBean() {
  }

  public BonkBean(String message, int type) {
    this.message = message;
    this.type = type;
  }

  @ThriftField(1)
  public String getMessage() {
    return message;
  }

  @ThriftField
  public void setMessage(String message) {
    this.message = message;
  }

  @ThriftField(2)
  public int getType() {
    return type;
  }

  @ThriftField
  public void setType(int type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BonkBean bonkBean = (BonkBean) o;

    if (type != bonkBean.type) {
      return false;
    }
    if (message != null ? !message.equals(bonkBean.message) : bonkBean.message != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = message != null ? message.hashCode() : 0;
    result = 31 * result + type;
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("BonkBean");
    sb.append("{message='").append(message).append('\'');
    sb.append(", type=").append(type);
    sb.append('}');
    return sb.toString();
  }
}