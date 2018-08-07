case class Aquarium(poissons: Seq[Poisson], algues: Seq[Algue]) {

  def ajouterPoisson(poisson: Poisson, poissons: Seq[Poisson]): Seq[Poisson] = poissons :+ poisson

  def ajouterAlgue(algue: Algue, algues: Seq[Algue]): Seq[Algue] = algues :+ algue

  def passerTour(): Unit = {
    println(s"Il y a acuellement ${poissons.size} dans l'aquarium et ${algues.size} algues.")
    poissons.foreach(p => println(s"${p.name}, ${p.sexe.toString}"))
  }

}