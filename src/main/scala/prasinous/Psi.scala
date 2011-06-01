package prasinous

import com.novus.salat.annotations._

case class Psi(x: String) {
  @Persist val reversed = x.reverse
}