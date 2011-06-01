package prasinous

import com.novus.salat.annotations._
import com.mongodb.casbah.Imports._

case class Omicron(@Key("_id") id: ObjectId = new ObjectId(), o: String)