package com.example.swanset

enum class Count : Property {
  ONE {
    override fun getValue(): Int {
      return 1; }
  },
  TWO {
    override fun getValue(): Int {
      return 2; }
  },
  THREE {
    override fun getValue(): Int {
      return 3; }
  },
}
