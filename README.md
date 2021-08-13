# Intro to Cats-Effect

Cats Effect is a functional side effect library - I'll explain what that means, what it gives you, how to use it, and why you should care.

At Teikametrics we adopted this library in 2018, and I'll discuss how we approach application design using it, both from a green field perspective as well as the techniques we used to migrate a living codebase away from akka-streams without "the big rewrite".

## Slides

[Available online](https://daenyth.github.io/intro-cats-effect/)

## Video recording

Note: This video is for the cats-effect 2 version of the talk. If you want those slides, you'll have to check out an older commit and build them yourself

[On YouTube](https://www.youtube.com/watch?v=83pXEdCpY4A)

## Building

Code in `core` module is accessible in your slides

Raw slides are in `slides/tut/index.html`

### How to compile slides

run `sbt slides/mdoc` to compile slides using [mdoc][mdoc]. 
You can then view the slides by opening `docs/index.html` in your browser.

### How to publish slides with github

When you are ready push the repository to github (including the compiled slides in `docs`).
Then go to project settings -> GitHub Pages and select `master branch /docs folder` for 
the source of github pages.



This project was generated using [Giter8][g8] with template [presentation.g8][presentation.g8]


[g8]: http://www.foundweekends.org/giter8/
[presentation.g8]: https://github.com/julien-truffaut/presentation.g8
[mdoc]: https://scalameta.org/mdoc/
