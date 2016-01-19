package demo.classes.example2

/**
 * Created by kziomek on 19/07/2015.
 */
abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree
