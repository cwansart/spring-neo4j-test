package de.cwansart.springneo4jtest.springneo4jtest.repositories;

import de.cwansart.springneo4jtest.springneo4jtest.entities.GeneVariant;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface GeneVariantRepository extends Neo4jRepository<GeneVariant, String> {
}
