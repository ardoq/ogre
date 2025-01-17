## Changes in Ogre 3.0.0

### TinkerPop3 Support

Ogre now targets Gremlin 3.2 and TinkerPop 3. This involves major breaking changes to the API.
Documentation will be updated once targeted development versions of Gremlin and TinkerPop ship
and Ogre API becomes mostly stable again.

## Changes in Ogre 2.5.0.0

 * Bump to support of TinkerPop 2.5.0.
 * Arity 2 `has` and `has-not` filters.
 * Add `into-list!` function.
 * Potemkin dependency is dropped.

## Changes in Ogre 2.3.0.2

* `--E>`\`<E--` have become `-E>`\`<E-`. This enforces all shortened
  traversal methods to only be three characters long.
* `reverse` has been added. This function reverses the order of the
  elements in the pipeline.

## Changes in Ogre 2.3.0.1

* `convert-to-map` is now polymorphic and converts Rows as well.
* Ogre is now a Clojurewerkz project.
* Traversals now take in a list of labels.

## Changes in Ogre 2.3.0.0

Update Gremlin version to 2.3.0. `count` is now `count!` because it
executes the pipeline and returns all the objects. Type hinting has mostly
been added in.

## Changes in Ogre 2.2.0.0

First release. Covers most of the library.
