package daenyth.talk.ce

import cats.effect.IO

import cats.effect.unsafe.implicits.global

object MdocConsoleWorkaround {
  implicit class IOOps[A](fa: IO[A]) {
    def unsafeRunSyncWithRedirect(): A = {
      val oldOut = System.out
      val newOut = Console.out // important to do this on the calling thread!
      try {
        System.setOut(newOut)
        fa.unsafeRunSync()
      } finally System.setOut(oldOut)
    }
  }
}

