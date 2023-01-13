package com.example.myapp.ui;

public enum ItemFiles {
  Item("item"),
  ItemBall("item_ball"),
  ItemBattle("item_battle"),
  ItemImportant("item_important"),
  ItemMail("item_mail"),
  ItemRecovery("item_recovery");

  private String text;
  private ItemFiles(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return this.text;
  }
}
