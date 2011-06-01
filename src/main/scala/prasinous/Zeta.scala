package prasinous

import com.novus.salat.annotations._

@Salat
trait Zeta {
  val x: String
}
case class Eta(x: String) extends Zeta
case class Iota(z: Zeta)