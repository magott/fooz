import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.query.Imports._

class Fooz {

  def fooz = {
    val db = MongoConnection("localhost", 27017)("test")
    db("fooz").update(MongoDBObject("name" -> "fooz"), $set(Seq("address" -> "bar" ))) //<-- works
    db("fooz").update(MongoDBObject("name" -> "fooz"), $set("address" -> "bar" )) //<-- Used to work
  }

}
