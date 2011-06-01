package prasinous

import com.novus.salat.global._
import com.novus.salat.annotations._
import com.mongodb.casbah.Imports._
import com.novus.salat.dao.SalatDAO

case class Theta(id: ObjectId = new ObjectId, x: String, y: String)

object ThetaDAO extends SalatDAO[Theta, ObjectId](collection = MongoConnection()("mongonyc2011-salat-example")("theta"))