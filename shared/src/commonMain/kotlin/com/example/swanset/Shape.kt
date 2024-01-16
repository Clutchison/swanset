package com.example.swanset

enum class Shape : Property {
  SQUIGGLE {
    override fun getValue(): Int {
      return 1; }
  },
  ROUND {
    override fun getValue(): Int {
      return 2; }
  },
  DIAMOND {
    override fun getValue(): Int {
      return 3; }
  },
}
