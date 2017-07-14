package com.docker.schema;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;

import org.hibernate.MappingException;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerateSchema {
	/* public static void main(String[] args) throws MappingException, IOException {
		ServiceRegistry serviceRegistry = buildCfg();
		EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.SCRIPT, TargetType.STDOUT);
		MetadataImplementor metadata = (MetadataImplementor) new MetadataSources(serviceRegistry).buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		File file = new File("src/main/resources/model.sql");
		file.delete();
		schemaExport.setOutputFile(file.getAbsolutePath());
		schemaExport.setDelimiter(";");
		schemaExport.setFormat(true);
		schemaExport.create(targetTypes, metadata);

		System.exit(0);
	}

	public static StandardServiceRegistryImpl buildCfg() {
		return (StandardServiceRegistryImpl) new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
	} */
}
