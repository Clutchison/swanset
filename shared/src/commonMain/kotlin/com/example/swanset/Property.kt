package com.example.swanset

interface Property {
  fun getValue(): Int;

  companion object Matcher {
    private val matchTotals = arrayOf(3, 6, 9);
    public fun matches(set: Set<Property>): Boolean {
      return matchTotals.contains(set.sumOf { it.getValue() });
    }
  }
}
