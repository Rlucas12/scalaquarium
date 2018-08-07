trait Carnivore extends Poisson

case class Merou(name: String, sexe: Sexe) extends Carnivore {
  override def manger(n: Mangeable): Unit = ???
}

case class Thon(name: String, sexe: Sexe) extends Carnivore {
  override def manger(n: Mangeable): Unit = ???
}

case class Poissonclown(name: String, sexe: Sexe) extends Carnivore {
  override def manger(n: Mangeable): Unit = ???
}