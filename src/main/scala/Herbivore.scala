trait Herbivore extends Poisson

case class Sole(name: String, sexe: Sexe) extends Herbivore {
  override def manger(n: Mangeable): Unit = ???
}

case class Bar(name: String, sexe: Sexe) extends Herbivore {
  override def manger(n: Mangeable): Unit = ???
}

case class Carpe(name: String, sexe: Sexe) extends Herbivore {
  override def manger(n: Mangeable): Unit = ???
}
