package demo.genericity

/**
 * Created by kziomek on 19/07/2015.
 */
class Reference[T] {
  private var contents: T = _
  def set(value: T) { contents = value }
  def get: T = contents
}
