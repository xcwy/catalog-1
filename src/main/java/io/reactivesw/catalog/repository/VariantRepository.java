package io.reactivesw.catalog.repository;

import io.reactivesw.catalog.domain.Variant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * this is repository interface for variant.
 * @author Davis
 *
 */
@Repository("variantRepository")
public interface VariantRepository extends CrudRepository<Variant, Long> {

}