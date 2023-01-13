package com.example.myapp.ui;

public enum StatusJsonFiles {
  Red_Green_Blue_Yellow("Red_Green_Blue_Yellow"),
  Gold_Silver_Crystal("Gold_Silver_Crystal"),
  Ruby_Sapphire_Emerald("Ruby_Sapphire_Emerald"),
  Diamond_Pearl_Platinum("Diamond_Pearl_Platinum"),
  Black2_White2("Black2_White2"),
  X_Y("X_Y"),
  Sun_Moon("Sun_Moon"),
  Sword_Shield("Sword_Shield"),
  Scarlet_Violet("Scarlet_Violet");

  private String text;
  private StatusJsonFiles(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return this.text;
  }
}
