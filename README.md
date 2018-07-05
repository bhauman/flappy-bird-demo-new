# flappy-bird-demo

This is the original Flappy Bird Demo updated to use the latest
incarnation of Figwheel.

![screenshot](https://user-images.githubusercontent.com/2624/42334602-b4e0cc1a-804b-11e8-9d44-4b38ee4697f6.png)

Read the [blog post](http://rigsomelight.com/2014/05/01/interactive-programming-flappy-bird-clojurescript.html) about this flappy bird demo.

Watch the 6 minute [video](https://www.youtube.com/watch?v=KZjFVdU8VLI)

Checkout the documentation on [figwheel-main](https://github.com/bhauman/figwheel-main) to go further!

## Usage

### Leiningen

Make sure you have the [latest version of leiningen installed](https://github.com/technomancy/leiningen#installation).

Clone this repo:

```shell
$ git clone https://github.com/bhauman/flappy-bird-demo-new.git
```

Change into the flappy-bird-demo-new directory and run:

```shell
$ lein fig:build
```

### Clojure Tools

First we will want to [install](CLI tools) the `clj` and `clojure` [command line
tools][CLI tools].

Clone this repo:

```shell
$ git clone https://github.com/bhauman/flappy-bird-demo-new.git
```

Change into the flappy-bird-demo-new directory and run:

```shell
$ clj -A:build
```

## License

Copyright © 2018 Bruce Hauman

Distributed under the [Eclipse Public License](LICENSE) either version 1.0 or any
later version.
