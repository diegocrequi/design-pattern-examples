package stateExample;

public class Alumn {
	public static void main(String[] args) {
		Enrollment enrollment = new Enrollment();
		
		State firstState = new FirstState();
		State secondState = new SecondState();
		State thirdState = new ThirdState();
		
		Subject ade = new Subject("Administraci�n de Empresas", thirdState, 6);
		enrollment.addSubject(ade);
		Subject adda = new Subject("An�lisis y Dise�o de Datos y Algoritmos", secondState, 12);
		enrollment.addSubject(adda);
		Subject ac = new Subject("Arquitectura de Computadores", secondState, 6);
		enrollment.addSubject(ac);
		Subject aiss = new Subject("Arquitectura e Integraci�n de Sistemas Software", secondState, 6);
		enrollment.addSubject(aiss);
		Subject md = new Subject("Matem�tica Discreta", secondState, 6);
		enrollment.addSubject(md);
		Subject ir = new Subject("Ingenier�a de Requisitos", firstState, 6);
		enrollment.addSubject(ir);
		Subject msn = new Subject("Modelado y Simulaci�n Num�rica", firstState, 6);
		enrollment.addSubject(msn);
		Subject psm = new Subject("Procesamiento y Se�ales Multimedia", firstState, 6);
		enrollment.addSubject(psm);
		Subject iissi2 = new Subject("Introducci�n a la Ingenier�a del Software y los Sistemas de Informaci�n 2", secondState, 6);
		enrollment.addSubject(iissi2);
		
		System.out.println(enrollment.toString());
		
		psm.setState(secondState);
		ac.setState(thirdState);
		
		System.out.println();
		System.out.println(enrollment.toString());
		
	}
}
