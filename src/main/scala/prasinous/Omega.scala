package prasinous

import com.mongodb.casbah.Imports._
import com.novus.salat.global._
import com.novus.salat.dao.SalatDAO

case class Omega(_id: ObjectId = new ObjectId, y: String, z: Int)

object OmegaDAO extends SalatDAO[Omega, ObjectId](collection = MongoConnection()("mongonyc2011-salat-example")("omega"))