import java.io.ByteArrayInputStream

trait IterableInputStream extends java.io.InputStream with Iterable[Byte] {

  class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
    def hasNext: Boolean = outer.available() > 0
    def next: Byte = outer.read().toByte
  }

  def iterator: Iterator[Byte] = new InputStreamIterator(this)
}


val f = new ByteArrayInputStream("Hello World".getBytes("UTF-8")) with IterableInputStream

for(b <- f) println(b.toChar)