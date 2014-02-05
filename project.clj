(defproject simple-checking "0.1.0-SNAPSHOT"
  :description "Playing with SimpleCheck"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [reiddraper/simple-check "0.5.6"]
                 [midje "1.6.0"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
