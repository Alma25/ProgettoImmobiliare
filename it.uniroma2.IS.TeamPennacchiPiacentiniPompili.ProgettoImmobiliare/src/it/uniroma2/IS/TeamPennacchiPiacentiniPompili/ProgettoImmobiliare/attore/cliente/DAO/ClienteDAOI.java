package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO;

import java.sql.SQLException;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi al
 * profilo Cliente.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface ClienteDAOI {
	/**
	 * Registra un utente all'applicazione e lo assegna direttamente all'agente
	 * che la effettua.
	 * 
	 * @param agente
	 *            - l'agente che effettua la registrazione dell'utente
	 * @param utente
	 *            - l'utente da dover registrare all'applicazione
	 * @return true se ha registrato l'utente, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean registraCliente(Agente agente, Utente utente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Restituisce la lista dei clienti presenti all'interno dell'applicazione.<br>
	 * Vengono restituiti anche i clienti che sono in fase di eliminazione
	 * account, ovvero che hanno effettuato l'eliminazione ma è ancora possibile
	 * effettuare la riattivazione dell'account.
	 * 
	 * @return List&lt;Cliente&gt; - la lista dei clienti all'interno
	 *         dell'applicazione
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Cliente> visualizzaClienti() throws ClassNotFoundException,
			SQLException;

	/**
	 * Restituisce la lista dei clienti assegnati all'agente passato come
	 * parametro del metodo.<br>
	 * Vengono restituiti anche i clienti che sono in fase di eliminazione
	 * account, ovvero che hanno effettuato l'eliminazione ma è ancora possibile
	 * effettuare la riattivazione dell'account.
	 * 
	 * @param agente
	 *            - l'agente del quale si vogliono visualizzare i clienti
	 * @return List&lt;Cliente&gt; - la lista dei clienti assegnati all'agente
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Cliente> visualizzaClienti(Agente agente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Modifica le informazioni (nome, cognome, telefono, email) del cliente.<br>
	 * Il parametro <i>vecchiaEmail</i> è l'email corrente del cliente al quale
	 * si vogliono apportare le modifiche, mentre il parametro <i>cliente</i> è
	 * un oggetto Cliente istanziato con i nuovi valori che si vogliono
	 * assegnare al cliente.
	 * 
	 * @param vecchiaEmail
	 *            - l'email corrente del cliente al quale si vogliono apportare
	 *            modifiche
	 * @param cliente
	 *            - il cliente con i nuovi campi istanziati
	 * @return true se il cliente è stato modificato, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean modificaCliente(String vecchiaEmail, Cliente cliente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Elimina definitivamente il cliente (dato come parametro)
	 * dall'applicazione.
	 * 
	 * @param cliente
	 *            - il cliente da voler eliminare
	 * @return true se il cliente è stato eliminato, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean eliminaCliente(Cliente cliente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Elimina l'account del Cliente passato come parametro mettendolo in stato
	 * di una eventuale riattivazione dell'account.
	 * 
	 * @param cliente
	 *            - il cliente del quale si deve eliminare l'account
	 * @return true se l'account è stato eliminato con successo, false
	 *         altrimenti
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean eliminaAccount(Cliente cliente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Aggiunge l'immobile identificato dal parametro idImmobile tra la lista
	 * degli immobili preferiti del cliente identificato dal parametro email.
	 * 
	 * @param email
	 *            - email del cliente al quale si deve aggiungere l'immobile tra
	 *            i preferiti
	 * @param idImmobile
	 *            - identificativo dell'immobile da aggiungere tra gli immobili
	 *            preferiti del cliente
	 * @return true se l'immobile è stato aggiunto tra i preferiti, false
	 *         altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean aggiungiPreferiti(String email, int idImmobile)
			throws ClassNotFoundException, SQLException;

	/**
	 * Rimuove l'immobile identificato dal parametro idImmobile dalla lista
	 * degli immobili preferiti del cliente identificato dal parametro email.
	 * 
	 * @param email
	 *            - email del cliente al quale si deve rimuovere l'immobile da i
	 *            preferiti
	 * @param idImmobile
	 *            - identificativo dell'immobile da rimuovere dagli immobili
	 *            preferiti del cliente
	 * @return true se l'immobile è stato rimosso dai preferiti, false
	 *         altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean rimuoviPreferiti(String email, int idImmobile)
			throws ClassNotFoundException, SQLException;

}
