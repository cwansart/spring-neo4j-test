package de.cwansart.springneo4jtest.springneo4jtest.entities;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("GeneVariant")
public class GeneVariant {

    @Id
    private final String name;

    @Property("type")
    private final VariantType type;

    public GeneVariant(String name, VariantType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public VariantType getType() {
        return type;
    }
}
