package uk.co.odinconsultants.ecocats

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    EcocatsServer.stream[IO].compile.drain.as(ExitCode.Success)
}
