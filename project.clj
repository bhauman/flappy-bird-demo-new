(defproject flappy-bird-demo-new "0.1.0-SNAPSHOT"
  :description "The original figwheel flappybird demo redone for figwheel.main"

  :url "http://rigsomelight.com/2014/05/01/interactive-programming-flappy-bird-clojurescript.html"

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.4"]
                 [cljsjs/react-dom "16.6.0-0"] ;; for sablono
                 [cljsjs/react "16.6.0-0"] ;; for sablono
                 [sablono/sablono "0.8.6"]]

  :resource-paths ["resources" "target"]
  
  :clean-targets ^{:protect false} ["target/public"]
  
  :profiles {:dev {:dependencies [[com.bhauman/figwheel-main "0.2.17"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  ;; to silence SL4J warnings
                                  [org.slf4j/slf4j-nop "1.7.30"] 
                                  ]}}

  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]
            "fig:build" ["trampoline" "run" "-m" "figwheel.main" "-b" "flappy" "-r"]})
