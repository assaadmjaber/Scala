# Scala: Using the Scala Interpreter 
Download using: `brew install scala` (make sure you install homebrew first!)

If you already installed homebrew and you get an error that says:
> warning: > /opt/homebrew/bin is not in your PATH.

, try this command: `export PATH=/opt/homebrew/bin:$PATH` and then try again.

# Running Scala scripts
I installed scala-cli to run the hello.scala script from the command line in the Terminal app (also using homebrew): `brew install Virtuslab/scala-cli/scala-cli` after I ran into this error: 

<img width="588" alt="Screenshot 2023-12-06 at 12 25 42" src="https://github.com/assaadmjaber/Scala/assets/149254059/754148b3-0288-4655-a5b8-0b79a74fca6b">

I changed the file extension in my hello script `.sc` so I could run it with scala-cli like this, `scala-cli hello.sc`

> Hello, world, from a script!

<img width="1173" alt="Screenshot 2023-12-06 at 12 12 56" src="https://github.com/assaadmjaber/Scala/assets/149254059/e22d93f6-3604-455a-a487-93e468e23ce9">

# Functional style programming

Using the iterative .foreach constructor in Scala, we can come up with a concise way to do something like print each item in a collection on a new line (see Pa.scala). 


