def call() {
	sh(libraryResource('eu/inuits/python.sh'))
}
#	sh """find . -name '*.py' -print0 |
#		xargs -0 -t -L 1 python2 -m py_compile"""
