# defdebug

A Clojure debugging utility that gives two macros: defnDEBUG and letDEBUG.

The idea is that if you are having trouble with a function ``(defn foo [x y] (* x y))``, you can swith it to be ``(defnTEST foo ...)`` which expands into ``(defn foo [x y] (def x x) (def y y) (* x y))``.

This means you can inspect the body of the function with your repl with all the values filled in. This is meant to be paired with a git commit hook which prevents any defnTEST's from getting into production.

## License

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
