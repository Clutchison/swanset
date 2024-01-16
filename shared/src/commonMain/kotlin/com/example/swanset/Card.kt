package com.example.swanset

class Card(
  private val color: Color,
  private val shape: Shape,
  private val shading: Shading,
  private val count: Count
) {

  private fun getSets(subSets: Set<Set<Card>>): MutableSet<Set<Card>> {
    return mutableSetOf();
  }

  companion object Matcher {
    public fun getSets(cards: Set<Card>): Set<Set<Card>> {
      val subsets: Set<Set<Card>> = getSubsets(cards);
      return cards.map { it.getSets(subsets) }
        .fold(mutableSetOf()) { acc, next -> acc.addAll(next); return acc; }
    }

    public fun allCards(): Set<Card> {

    }

    private fun isSet(cards: Set<Card>): Boolean {
      return Property.matches(cards.map { it.color }.toSet()) &&
          Property.matches(cards.map { it.shape }.toSet()) &&
          Property.matches(cards.map { it.shading }.toSet()) &&
          Property.matches(cards.map { it.count }.toSet())
    }

    private fun getSubsets(cards: Set<Card>): Set<Set<Card>> {
      return ComboUtil().getCombination<Card>(cards.toTypedArray(), 3, 9)
    }
  }
}

