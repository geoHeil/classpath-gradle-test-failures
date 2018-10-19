Executing:

```bash
git clone git@github.com:geoHeil/classpath-gradle-test-failures.git
cd classpath-gradle-test-failure
gradle test
```

fails with:

```
- should test fine *** FAILED *** (1 second, 952 milliseconds)
  java.lang.IllegalArgumentException: Error while instantiating 'org.apache.spark.sql.hive.HiveSessionStateBuilder':
  at org.apache.spark.sql.SparkSession$.org$apache$spark$sql$SparkSession$$instantiateSessionState(SparkSession.scala:1075)
  at org.apache.spark.sql.SparkSession$$anonfun$sessionState$2.apply(SparkSession.scala:142)
  at org.apache.spark.sql.SparkSession$$anonfun$sessionState$2.apply(SparkSession.scala:141)
  at scala.Option.getOrElse(Option.scala:121)
  at org.apache.spark.sql.SparkSession.sessionState$lzycompute(SparkSession.scala:141)
  at org.apache.spark.sql.SparkSession.sessionState(SparkSession.scala:138)
  at org.apache.spark.sql.Dataset.<init>(Dataset.scala:171)
  at org.apache.spark.sql.Dataset$.apply(Dataset.scala:62)
  at org.apache.spark.sql.SparkSession.createDataset(SparkSession.scala:471)
  at org.apache.spark.sql.SQLContext.createDataset(SQLContext.scala:377)
```
