package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.DAO;

import java.sql.SQLException;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;

/**
 * Interfaccia della classe DAO utilizzata per memorizzare i dati relativi ad un
 * utente e poterne fare la registrazione all'interno dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface UtenteDAOI {
	/**
	 * Registra l'utente, dato come parametro del metodo, all'applicazione.
	 * 
	 * @param utente
	 *            - l'utente da dover registrare all'applicazione
	 * @return true se la registrazione ha avuto successo, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean registrati(Utente utente) throws ClassNotFoundException,
			SQLException;

	/**
	 * Effettua la riattivazione dell'account di un utente che era registrato
	 * all'applicazione come cliente.
	 * 
	 * @param utente
	 *            - l'utente del quale riattivare l'account
	 * @return true se la riattivazione ha avuto successo, false altrimenti
	 */
	public boolean riattivaAccount(Utente utente);
}
