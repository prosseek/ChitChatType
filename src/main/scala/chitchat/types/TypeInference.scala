package chitchat.types

class TypeInference {

  def getType(label:String, value:Array[Byte] = null) = {
    "string"

    if (value != null) {
      getTypeFromValue(value)
    }
  }

  private def getTypeFromValue(value:Array[Byte]) = {
    "string"
  }
}