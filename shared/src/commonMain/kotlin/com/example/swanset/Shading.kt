package com.example.swanset

enum class Shading : Property {
  NONE {
    override fun getValue(): Int {
      return 1; }
  },
  PARTIAL {
    override fun getValue(): Int {
      return 2; }
  },
  FULL {
    override fun getValue(): Int {
      return 3; }
  },
}
