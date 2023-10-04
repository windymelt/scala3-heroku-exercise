package io.github.windymelt.scala3herokuexercise

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  override def run: IO[Unit] =
    Scala3herokuexerciseServer.run
