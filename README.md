# scalablyTypedDemo
minimal reproduce for an error in sbt-converter `1.0.0-beta30`

# Issue with quill https://quilljs.com/

Steps:
1. `./sbt fastOptJS:webpack`
2. open `app.html` in a browser. You should see:
```
quill.js:1088 Uncaught TypeError: Cannot read property 'imports' of undefined
    at _import (quill.js:1088)
    at $c_Lexample_Main$.main__AT__V (web-monaco-fastopt.js:606)
    at $s_Lexample_Main__main__AT__V (web-monaco-fastopt.js:602)
    at eval (web-monaco-fastopt.js:1698)
    at Object../web-monaco-fastopt.js (app-bundled.js:165)
    at __webpack_require__ (app-bundled.js:20)
    at eval (web-monaco-fastopt.js:1)
    at Object.0 (app-bundled.js:176)
    at __webpack_require__ (app-bundled.js:20)
    at app-bundled.js:84
```

at the browser console.

Note that the issue does not exist on `1.0.0-beta29.2`

related to: https://github.com/evanw/esbuild/issues/876