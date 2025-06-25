object AnalyseDonut {
  def main(args: Array[String]): Unit = {
    val input = "Vanilla Donut 10 2.25"

    // Découper la chaîne selon les espaces
    val elements = input.split(" ")

    // Reconstituer le nom (ici deux mots, mais pourrait être plus)
    val nomDonut = elements.slice(0, elements.length - 2).mkString(" ")
    val quantite = elements(elements.length - 2).toInt
    val prix = elements(elements.length - 1).toDouble

    // Affichage
    println(s"Nom du donut (String): $nomDonut")
    println(s"Quantité achetée (Int): $quantite")
    println(s"Prix unitaire (Double): $prix")
  }
}
