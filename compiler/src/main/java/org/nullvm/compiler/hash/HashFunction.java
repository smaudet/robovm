/**
 * 
 */
package org.nullvm.compiler.hash;

/**
 * @author niklas
 *
 */
public interface HashFunction<K> {

    int hash(K k);
    
}
