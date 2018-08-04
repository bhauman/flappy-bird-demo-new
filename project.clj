(defproject flappy-bird-demo-new "0.1.0-SNAPSHOT"
  :description "The original figwheel flappybird demo redone for figwheel.main"

  :url "http://rigsomelight.com/2014/05/01/interactive-programming-flappy-bird-clojurescript.html"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.312"]
                 [org.clojure/core.async "0.4.474"]
                 [cljsjs/react-dom-server "15.3.1-0"]  ;; for sablono
                 [cljsjs/react-dom "15.3.1-0"] ;; for sablono
                 [cljsjs/react "15.3.1-0"] ;; for sablono
                 [sablono "0.7.5"]]

  :resource-paths ["resources" "target"]
  
  :clean-targets ^{:protect false} ["target/public"]
  
  :profiles {:dev {:dependencies [[com.bhauman/figwheel-main "0.1.5"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]]}}

  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]
            "fig:build" ["trampoline" "run" "-m" "figwheel.main" "-b" "flappy" "-r"]})
