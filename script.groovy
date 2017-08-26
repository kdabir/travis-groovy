def message = ['*' * 80, 'hello world! any groovy script can execute here', '*' * 80].join('\n')
println message

println "Access env variables : ${System.env.CI}" 
println "Access command line args : ${args[0]}" 
