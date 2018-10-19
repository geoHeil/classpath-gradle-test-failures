package foo
import org.scalatest.{FlatSpec, Matchers}
import com.holdenkarau.spark.testing.{DatasetSuiteBase, SharedSparkContext}

class Test2 extends FlatSpec with Matchers with SharedSparkContext with DatasetSuiteBase{

  "foo2" should "test fine" in {
	import spark.implicits._
    val df = Seq(1,2,3,4).toDF
    df.printSchema
    df.show

    assert(true, true)
  }


}
