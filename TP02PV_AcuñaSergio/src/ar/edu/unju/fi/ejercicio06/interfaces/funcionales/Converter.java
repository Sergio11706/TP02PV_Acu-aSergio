package ar.edu.unju.fi.ejercicio06.interfaces.funcionales;

@FunctionalInterface
public interface Converter<T,T1> {
	T1 converter(T t);

	static <T> boolean isNotNull(T t) {
		return t != null;
	}
	
	default void MostrarObjeto(T1 t1) {
		System.out.println("Objeto: "+t1.toString());
	}
}
