package prasinous

import com.novus.salat.global._
import com.novus.salat.annotations._
import com.mongodb.casbah.Imports._
import com.novus.salat.dao.SalatDAO

case class Nu(x: String, y: String)
case class Kappa(@Key("_id") id: ObjectId = new ObjectId, k: String, nu: Nu)

object KappaDAO extends SalatDAO[Kappa, ObjectId](collection = MongoConnection()("mongonyc2011-salat-example")("kappa"))