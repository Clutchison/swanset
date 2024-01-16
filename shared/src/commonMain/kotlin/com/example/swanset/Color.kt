package com.example.swanset

enum class Color : Property {
  GREEN {
    override fun getValue(): Int {
      return 1; }
  },
  PURPLE {
    override fun getValue(): Int {
      return 2; }
  },
  ORANGE {
    override fun getValue(): Int {
      return 3; }
  },
}