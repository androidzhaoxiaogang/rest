/******************************************************************************
 * Produto: REST                                                              *
 *                                                                            *
 *    History:                                                                *
 *          Data        Programador              Tarefa                       *
 *          ----------  -----------------        -----------------------------*
 *   Autor  18/05/2015  silvano.pessoa          Classe criada.                *
 *                                                                            *
 *   Comments:                                                                *
 *                                                                            *
 *                                                                            *
 *****************************************************************************/
package br.com.silvanopessoa.rest.lang.base;

import br.com.silvanopessoa.rest.lang.exception.ResourceBusinessException;
import br.com.silvanopessoa.rest.lang.exception.ResourceNotFoundException;
import cz.jirutka.spring.exhandler.messages.ErrorMessage;

/**
 * O(a) Class PreconditionsRest.
 *
 * @author silvano.pessoa
 * @since 26/02/2015 - 22:39:11
 */
public class PreconditionsRest {

    /**
     * Check not found.
     *
     * @param <T> the generic type
     * @param reference o(a) reference
     * @return the t
     */
    public static <T> T checkNotFound(T reference) {
        if (reference == null) {
            throw new ResourceNotFoundException();
        }
        return reference;
    }

    /**
     * Check not found.
     *
     * @param <T> O tipo genérico
     * @param reference O(a)(s) reference
     * @param message O(a)(s) message
     * @return O(a)(s) t
     */
    public static <T> T checkNotFound(T reference, ErrorMessage message) {
        if (reference == null) {
            throw new ResourceNotFoundException(message);
        }
        return reference;
    }
    
    /**
     * Check condition.
     *
     * @param condition O(a)(s) condition
     * @param message O(a)(s) message
     */
    public static void checkCondition(boolean condition, ErrorMessage message){
        if (!condition) {
            throw new ResourceBusinessException(message);
        }
    }
    
    /**
     * Check condition.
     *
     * @param condition O(a)(s) condition
     */
    public static void checkCondition(boolean condition, String message){
        if (!condition) {
            throw new ResourceBusinessException(message);
        }
    }
}
