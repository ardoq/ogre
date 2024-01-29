(defproject com.ardoq/ogre "3.0.0.0-beta2"
  :description "Clojure dialect of the Gremlin graph processing language"
  :url "https://github.com/clojurewerkz/ogre"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot :all
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [potemkin "0.4.3"]
                 [org.apache.tinkerpop/gremlin-core "3.5.4"]
                 [org.apache.tinkerpop/gremlin-test "3.5.4"  :scope "test"]
                 [org.apache.tinkerpop/tinkergraph-gremlin "3.5.4" :scope "test"]
                 [org.slf4j/slf4j-log4j12 "1.7.21" :scope "test"]]
  :source-paths ["src/clojure"]
  :profiles {:dev    { :global-vars {*assert* true}
                       :dependencies [[clojurewerkz/support "1.1.0" :exclusions [org.clojure/clojure]]
                                      [commons-io/commons-io "2.4"]]
                      :java-source-paths ["test/java"]
                      :resource-paths ["test/resources"]}
             :1.7    {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.9.0-master-SNAPSHOT"]]}}
  :aliases {"all" ["with-profile" "dev:dev,master:dev,1.7"]}
  ;; As of TinkerPop 3.5.4, org.apache.tinkerpop.gremlin.process.traversal.dsl.GremlinDslProcessor
  ;; specifies RELEASE_8
  :javac-options ["-target" "8" "-source" "8"]
  :plugins [[lein-junit "1.1.8"]]
  :junit ["test/java"]
  :test-paths ["test/clojure"]
  :global-vars {*warn-on-reflection* true
                *assert* false})
