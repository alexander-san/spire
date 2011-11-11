package numerics.math

trait ConvertableTo[@specialized A] {
  def fromByte(a:Byte): A
  def fromShort(a:Short): A
  def fromInt(a:Int): A
  def fromLong(a:Long): A
  def fromFloat(a:Float): A
  def fromDouble(a:Double): A
  def fromBigInt(a:BigInt): A
  def fromBigDecimal(a:BigDecimal): A
  def fromRat(a:Rat): A
}

trait ConvertableToByte extends ConvertableTo[Byte] {
  def fromByte(a:Byte): Byte = a
  def fromShort(a:Short): Byte = a.toByte
  def fromInt(a:Int): Byte = a.toByte
  def fromLong(a:Long): Byte = a.toByte
  def fromFloat(a:Float): Byte = a.toByte
  def fromDouble(a:Double): Byte = a.toByte
  def fromBigInt(a:BigInt): Byte = a.toByte
  def fromBigDecimal(a:BigDecimal): Byte = a.toByte
  def fromRat(a:Rat): Byte = a.toBigInt.toByte
}

trait ConvertableToShort extends ConvertableTo[Short] {
  def fromByte(a:Byte): Short = a.toShort
  def fromShort(a:Short): Short = a
  def fromInt(a:Int): Short = a.toShort
  def fromLong(a:Long): Short = a.toShort
  def fromFloat(a:Float): Short = a.toShort
  def fromDouble(a:Double): Short = a.toShort
  def fromBigInt(a:BigInt): Short = a.toShort
  def fromBigDecimal(a:BigDecimal): Short = a.toShort
  def fromRat(a:Rat): Short = a.toBigInt.toShort
}

trait ConvertableToInt extends ConvertableTo[Int] {
  def fromByte(a:Byte): Int = a.toInt
  def fromShort(a:Short): Int = a.toInt
  def fromInt(a:Int): Int = a
  def fromLong(a:Long): Int = a.toInt
  def fromFloat(a:Float): Int = a.toInt
  def fromDouble(a:Double): Int = a.toInt
  def fromBigInt(a:BigInt): Int = a.toInt
  def fromBigDecimal(a:BigDecimal): Int = a.toInt
  def fromRat(a:Rat): Int = a.toBigInt.toInt
}

trait ConvertableToLong extends ConvertableTo[Long] {
  def fromByte(a:Byte): Long = a.toLong
  def fromShort(a:Short): Long = a.toLong
  def fromInt(a:Int): Long = a.toLong
  def fromLong(a:Long): Long = a
  def fromFloat(a:Float): Long = a.toLong
  def fromDouble(a:Double): Long = a.toLong
  def fromBigInt(a:BigInt): Long = a.toLong
  def fromBigDecimal(a:BigDecimal): Long = a.toLong
  def fromRat(a:Rat): Long = a.toBigInt.toLong
}

trait ConvertableToFloat extends ConvertableTo[Float] {
  def fromByte(a:Byte): Float = a.toFloat
  def fromShort(a:Short): Float = a.toFloat
  def fromInt(a:Int): Float = a.toFloat
  def fromLong(a:Long): Float = a.toFloat
  def fromFloat(a:Float): Float = a
  def fromDouble(a:Double): Float = a.toFloat
  def fromBigInt(a:BigInt): Float = a.toFloat
  def fromBigDecimal(a:BigDecimal): Float = a.toFloat
  def fromRat(a:Rat): Float = a.toBigDecimal.toFloat
}

trait ConvertableToDouble extends ConvertableTo[Double] {
  def fromByte(a:Byte): Double = a.toDouble
  def fromShort(a:Short): Double = a.toDouble
  def fromInt(a:Int): Double = a.toDouble
  def fromLong(a:Long): Double = a.toDouble
  def fromFloat(a:Float): Double = a.toDouble
  def fromDouble(a:Double): Double = a
  def fromBigInt(a:BigInt): Double = a.toDouble
  def fromBigDecimal(a:BigDecimal): Double = a.toDouble
  def fromRat(a:Rat): Double = a.toBigDecimal.toDouble
}

trait ConvertableToBigInt extends ConvertableTo[BigInt] {
  def fromByte(a:Byte): BigInt = BigInt(a)
  def fromShort(a:Short): BigInt = BigInt(a)
  def fromInt(a:Int): BigInt = BigInt(a)
  def fromLong(a:Long): BigInt = BigInt(a)
  def fromFloat(a:Float): BigInt = BigInt(a.toLong)
  def fromDouble(a:Double): BigInt = BigInt(a.toLong)
  def fromBigInt(a:BigInt): BigInt = a
  def fromBigDecimal(a:BigDecimal): BigInt = a.toBigInt
  def fromRat(a:Rat): BigInt = a.toBigInt
}

trait ConvertableToBigDecimal extends ConvertableTo[BigDecimal] {
  def fromByte(a:Byte): BigDecimal = BigDecimal(a)
  def fromShort(a:Short): BigDecimal = BigDecimal(a)
  def fromInt(a:Int): BigDecimal = BigDecimal(a)
  def fromLong(a:Long): BigDecimal = BigDecimal(a)
  def fromFloat(a:Float): BigDecimal = BigDecimal(a)
  def fromDouble(a:Double): BigDecimal = BigDecimal(a)
  def fromBigInt(a:BigInt): BigDecimal = BigDecimal(a)
  def fromBigDecimal(a:BigDecimal): BigDecimal = a
  def fromRat(a:Rat): BigDecimal = a.toBigDecimal
}

trait ConvertableToRat extends ConvertableTo[Rat] {
  def fromByte(a:Byte): Rat = Rat(a)
  def fromShort(a:Short): Rat = Rat(a)
  def fromInt(a:Int): Rat = Rat(a)
  def fromLong(a:Long): Rat = Rat(a)
  def fromFloat(a:Float): Rat = Rat(a)
  def fromDouble(a:Double): Rat = Rat(a)
  def fromBigInt(a:BigInt): Rat = Rat(a)
  def fromBigDecimal(a:BigDecimal): Rat = Rat(a)
  def fromRat(a:Rat) = a
}

object ConvertableTo {
  implicit object ConvertableToByte extends ConvertableToByte
  implicit object ConvertableToShort extends ConvertableToShort
  implicit object ConvertableToInt extends ConvertableToInt
  implicit object ConvertableToLong extends ConvertableToLong
  implicit object ConvertableToFloat extends ConvertableToFloat
  implicit object ConvertableToDouble extends ConvertableToDouble
  implicit object ConvertableToBigInt extends ConvertableToBigInt
  implicit object ConvertableToBigDecimal extends ConvertableToBigDecimal
  implicit object ConvertableToRat extends ConvertableToRat
}

trait ConvertableFrom[@specialized A] {
  def toByte(a:A): Byte
  def toShort(a:A): Short
  def toInt(a:A): Int
  def toLong(a:A): Long
  def toFloat(a:A): Float
  def toDouble(a:A): Double
  def toBigInt(a:A): BigInt
  def toBigDecimal(a:A): BigDecimal
  def toRat(a:A): Rat

  def toString(a:A): String
}

trait ConvertableFromByte extends ConvertableFrom[Byte] {
  def toByte(a:Byte): Byte = a
  def toShort(a:Byte): Short = a.toShort
  def toInt(a:Byte): Int = a.toInt
  def toLong(a:Byte): Long = a.toLong
  def toFloat(a:Byte): Float = a.toFloat
  def toDouble(a:Byte): Double = a.toDouble
  def toBigInt(a:Byte): BigInt = BigInt(a)
  def toBigDecimal(a:Byte): BigDecimal = BigDecimal(a)
  def toRat(a:Byte): Rat = Rat(a)

  def toString(a:Byte): String = a.toString
}

trait ConvertableFromShort extends ConvertableFrom[Short] {
  def toByte(a:Short): Byte = a.toByte
  def toShort(a:Short): Short = a
  def toInt(a:Short): Int = a.toInt
  def toLong(a:Short): Long = a.toLong
  def toFloat(a:Short): Float = a.toFloat
  def toDouble(a:Short): Double = a.toDouble
  def toBigInt(a:Short): BigInt = BigInt(a)
  def toBigDecimal(a:Short): BigDecimal = BigDecimal(a)
  def toRat(a:Short): Rat = Rat(a)

  def toString(a:Short): String = a.toString
}

trait ConvertableFromInt extends ConvertableFrom[Int] {
  def toByte(a:Int): Byte = a.toByte
  def toShort(a:Int): Short = a.toShort
  def toInt(a:Int): Int = a
  def toLong(a:Int): Long = a.toLong
  def toFloat(a:Int): Float = a.toFloat
  def toDouble(a:Int): Double = a.toDouble
  def toBigInt(a:Int): BigInt = BigInt(a)
  def toBigDecimal(a:Int): BigDecimal = BigDecimal(a)
  def toRat(a:Int): Rat = Rat(a)

  def toString(a:Int): String = a.toString
}

trait ConvertableFromLong extends ConvertableFrom[Long] {
  def toByte(a:Long): Byte = a.toByte
  def toShort(a:Long): Short = a.toShort
  def toInt(a:Long): Int = a.toInt
  def toLong(a:Long): Long = a
  def toFloat(a:Long): Float = a.toFloat
  def toDouble(a:Long): Double = a.toDouble
  def toBigInt(a:Long): BigInt = BigInt(a)
  def toBigDecimal(a:Long): BigDecimal = BigDecimal(a)
  def toRat(a:Long): Rat = Rat(a)

  def toString(a:Long): String = a.toString
}

trait ConvertableFromFloat extends ConvertableFrom[Float] {
  def toByte(a:Float): Byte = a.toByte
  def toShort(a:Float): Short = a.toShort
  def toInt(a:Float): Int = a.toInt
  def toLong(a:Float): Long = a.toLong
  def toFloat(a:Float): Float = a
  def toDouble(a:Float): Double = a.toDouble
  def toBigInt(a:Float): BigInt = BigInt(a.toLong)
  def toBigDecimal(a:Float): BigDecimal = BigDecimal(a)
  def toRat(a:Float): Rat = Rat(a)

  def toString(a:Float): String = a.toString
}

trait ConvertableFromDouble extends ConvertableFrom[Double] {
  def toByte(a:Double): Byte = a.toByte
  def toShort(a:Double): Short = a.toShort
  def toInt(a:Double): Int = a.toInt
  def toLong(a:Double): Long = a.toLong
  def toFloat(a:Double): Float = a.toFloat
  def toDouble(a:Double): Double = a
  def toBigInt(a:Double): BigInt = BigInt(a.toLong)
  def toBigDecimal(a:Double): BigDecimal = BigDecimal(a)
  def toRat(a:Double): Rat = Rat(a)

  def toString(a:Double): String = a.toString
}

trait ConvertableFromBigInt extends ConvertableFrom[BigInt] {
  def toByte(a:BigInt): Byte = a.toByte
  def toShort(a:BigInt): Short = a.toShort
  def toInt(a:BigInt): Int = a.toInt
  def toLong(a:BigInt): Long = a.toLong
  def toFloat(a:BigInt): Float = a.toFloat
  def toDouble(a:BigInt): Double = a.toDouble
  def toBigInt(a:BigInt): BigInt = a
  def toBigDecimal(a:BigInt): BigDecimal = BigDecimal(a)
  def toRat(a:BigInt): Rat = Rat(a)

  def toString(a:BigInt): String = a.toString
}

trait ConvertableFromBigDecimal extends ConvertableFrom[BigDecimal] {
  def toByte(a:BigDecimal): Byte = a.toByte
  def toShort(a:BigDecimal): Short = a.toShort
  def toInt(a:BigDecimal): Int = a.toInt
  def toLong(a:BigDecimal): Long = a.toLong
  def toFloat(a:BigDecimal): Float = a.toFloat
  def toDouble(a:BigDecimal): Double = a.toDouble
  def toBigInt(a:BigDecimal): BigInt = a.toBigInt
  def toBigDecimal(a:BigDecimal): BigDecimal = a
  def toRat(a:BigDecimal): Rat = Rat(a)

  def toString(a:BigDecimal): String = a.toString
}

trait ConvertableFromRat extends ConvertableFrom[Rat] {
  def toByte(a:Rat): Byte = a.toBigInt.toByte
  def toShort(a:Rat): Short = a.toBigInt.toShort
  def toInt(a:Rat): Int = a.toBigInt.toInt
  def toLong(a:Rat): Long = a.toBigInt.toLong
  def toFloat(a:Rat): Float = a.toBigDecimal.toFloat
  def toDouble(a:Rat): Double = a.toBigDecimal.toDouble
  def toBigInt(a:Rat): BigInt = a.toBigInt
  def toBigDecimal(a:Rat): BigDecimal = a.toBigDecimal
  def toRat(a:Rat): Rat = a

  def toString(a:Rat): String = a.toString
}

object ConvertableFrom {
  implicit object ConvertableFromByte extends ConvertableFromByte
  implicit object ConvertableFromShort extends ConvertableFromShort
  implicit object ConvertableFromInt extends ConvertableFromInt
  implicit object ConvertableFromLong extends ConvertableFromLong
  implicit object ConvertableFromFloat extends ConvertableFromFloat
  implicit object ConvertableFromDouble extends ConvertableFromDouble
  implicit object ConvertableFromBigInt extends ConvertableFromBigInt
  implicit object ConvertableFromBigDecimal extends ConvertableFromBigDecimal
  implicit object ConvertableFromRat extends ConvertableFromRat
}
