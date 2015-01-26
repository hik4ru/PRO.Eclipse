package _02ejemplos._08excepcionesUsuario;

import java.util.Scanner;

public class _08Fecha {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce fecha: (dd/mm/aaaa)");
		String fecha = tec.next();

		try {
			validarFecha(fecha);
		} catch (AnyoIncorrectoException e) {
			System.out.println("");
		} catch (FechaException e) {
			e.getMessage();
		}
	}

	public static void validarFecha(String fecha)
			throws DiaIncorrectoException, MesIncorrectoException,
			AnyoIncorrectoException, FechaException {
		String sDia = fecha.substring(0, fecha.indexOf('/'));
		String sMes = fecha.substring(fecha.indexOf('/') + 1,
				fecha.lastIndexOf('/'));
		String sAnyo = fecha.substring(fecha.lastIndexOf('/') + 1);
		try {
			int iDia = Integer.parseInt(sDia);
			int iMes = Integer.parseInt(sMes);
			int iAnyo = Integer.parseInt(sAnyo);

			if (iDia < 0 || iDia > 31) {
				throw new DiaIncorrectoException("El dia es inválido");

			} else if (iMes < 0 || iMes < 12) {
				throw new MesIncorrectoException("El mes es inválido");

			} else if (iAnyo < 0)
			throw new AnyoIncorrectoException("El año es inválido");
		} catch (NumberFormatException e) {
			throw new FechaException("Formato de fecha inválido");
		} catch (StringIndexOutOfBoundsException e) {
			throw new FechaException("Formato de fecha inválido");
		}
	}

}
