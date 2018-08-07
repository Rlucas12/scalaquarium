import enumeratum._

sealed trait Sexe extends EnumEntry

object Sexe extends Enum[Sexe] {

  val values = findValues

  case object Male   extends Sexe
  case object Femelle extends Sexe

}