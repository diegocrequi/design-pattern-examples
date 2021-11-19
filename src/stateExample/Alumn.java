package stateExample;

public class Alumn {
	public static void main(String[] args) {
		Enrollment enrollment = new Enrollment();
		
		State firstState = new FirstState();
		State secondState = new SecondState();
		State thirdState = new ThirdState();
		
		Subject ade = new Subject("Administración de Empresas", thirdState, 6);
		enrollment.addSubject(ade);
		Subject adda = new Subject("Análisis y Diseño de Datos y Algoritmos", secondState, 12);
		enrollment.addSubject(adda);
		Subject ac = new Subject("Arquitectura de Computadores", secondState, 6);
		enrollment.addSubject(ac);
		Subject aiss = new Subject("Arquitectura e Integración de Sistemas Software", secondState, 6);
		enrollment.addSubject(aiss);
		Subject md = new Subject("Matemática Discreta", secondState, 6);
		enrollment.addSubject(md);
		Subject ir = new Subject("Ingeniería de Requisitos", firstState, 6);
		enrollment.addSubject(ir);
		Subject msn = new Subject("Modelado y Simulación Numérica", firstState, 6);
		enrollment.addSubject(msn);
		Subject psm = new Subject("Procesamiento y Señales Multimedia", firstState, 6);
		enrollment.addSubject(psm);
		Subject iissi2 = new Subject("Introducción a la Ingeniería del Software y los Sistemas de Información 2", secondState, 6);
		enrollment.addSubject(iissi2);
		
		System.out.println(enrollment.toString());
		
		psm.setState(secondState);
		ac.setState(thirdState);
		
		System.out.println();
		System.out.println(enrollment.toString());
		
	}
}
