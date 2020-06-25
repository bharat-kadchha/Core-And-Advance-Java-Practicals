package langPackageExample;

public class CompilerClassDemo {

	private static class CompilerClass {
		public CompilerClass() {
		}
	}

	public static void main(String[] args) {

		CompilerClass compilerClass = new CompilerClass();
		Compiler.enable();
		// The Compiler class is provided to support Java-to-native-code compilers and
		// related services

		Object g = Compiler.command("javac CompilerClass");
		System.out.println("Value : " + g);

		boolean check = Compiler.compileClass(compilerClass.getClass());
		System.out.println("\ncompilation successful ? : " + check);

		String str = "CompilerClass";
		boolean check1 = Compiler.compileClasses(str);

		System.out.println("\ncompilation using str ? : " + check1);
		Compiler.disable();

	}

}
