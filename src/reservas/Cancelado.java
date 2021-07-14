package reservas;

import java.time.LocalDate;

import sitio.Sitio;

public class Cancelado extends Estado {

	@Override
	protected void confirmarEn(Reserva reserva, Sitio sitio) {
		
	}

	@Override
	protected void cancelarReserva(Reserva reserva, LocalDate fechaACtual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean esfechaOcupada(Reserva reserva, LocalDate dia) {
		return false;
	}

	@Override
	protected boolean estaConfirmada() {
		return false;
	}

	@Override
	protected boolean ocupaFechaDeRango(Reserva reserva, LocalDate fechaInicio, LocalDate fechaFin) {
		return false;
	}
	
}
