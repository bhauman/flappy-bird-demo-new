# flappy-bird-demo

This is the original Flappy Bird Demo updated to use the newer versions
of Figwheel and ClojureScript.

![screenshot](https://user-images.githubusercontent.com/2624/42334602-b4e0cc1a-804b-11e8-9d44-4b38ee4697f6.png)

Read the [blog post][flappy-bird-blog-post] about this flappy bird demo.

Watch the 6 minute [video][figwheel-demo-video]

Checkout the documentation on [figwheel-main][figwheel-main] to go further!

## Usage

#### Via Leiningen

Make sure you have the [latest version of leiningen installed][install-lein]

Clone this repo:

```shell
$ git clone https://github.com/bhauman/flappy-bird-demo-new.git
```

Change into the flappy-bird-demo-new directory and run:

```shell
$ lein fig:build
```
#### Via Clojure Tools

First we will want to [install][CLI tools] the `clj` and `clojure` [command line
tools][CLI tools].

Clone this repo:

```shell
$ git clone https://github.com/bhauman/flappy-bird-demo-new.git
```

Change into the flappy-bird-demo-new directory and run:

```shell
$ clj -M:build
```

## Edit the code and see real time updates

You can now open the
`flappy-bird-demo-new/src/flappy_bird_demo/core.cls` file in your
favorite text editor. If you make a change and save the file you should
see the changes in the running flappy bird game immediately.

For example on find the word `"START"` and change it to `"HEY"` and
watch it change immediately without reloading the program.

## License

Copyright © 2022 Bruce Hauman

Distributed under the [Eclipse Public License](LICENSE) either version 1.0 or any
later version.

[figwheel-demo-video]: https://www.youtube.com/watch?v=KZjFVdU8VLI 
[flappy-bird-blog-post]: http://rigsomelight.com/2014/05/01/interactive-programming-flappy-bird-clojurescript.html
[figwheel-main]: https://github.com/bhauman/figwheel-main
[install-lein]: https://github.com/technomancy/leiningen#installation
[CLI Tools]: https://clojure.org/guides/getting_started#_installation_on_mac_via_code_brew_code
