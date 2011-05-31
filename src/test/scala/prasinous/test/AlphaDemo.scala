package prasinous.test

import com.novus.salat._
import com.novus.salat.global._
import org.specs2.mutable.Specification
import com.mongodb.casbah.Imports._
import prasinous.Alpha

class AlphaDemo extends Specification {
  "An instance of Alpha" should {
    val a = Alpha(x = "Hello world!")
    "serialize" in {
      val dbo: MongoDBObject = grater[Alpha].asDBObject(a)
      dbo must havePair("x", "Hello world!")
    }
    "deserialize" in {
      val dbo = MongoDBObject("x" -> "Hello world!")
      val a_* = grater[Alpha].asObject(dbo)
      a_* must_== a
    }
  }
}