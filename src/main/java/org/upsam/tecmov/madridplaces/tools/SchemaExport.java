package org.upsam.tecmov.madridplaces.tools;

import org.hibernate.cfg.AnnotationConfiguration;
import org.upsam.tecmov.madridplaces.domain.calificacion.Calificacion;
import org.upsam.tecmov.madridplaces.domain.calificacion.NivelPeligrosidad;
import org.upsam.tecmov.madridplaces.domain.codpostal.CodPostal;
import org.upsam.tecmov.madridplaces.domain.linea.Linea;
import org.upsam.tecmov.madridplaces.domain.linea.Parada;
import org.upsam.tecmov.madridplaces.domain.user.User;

public class SchemaExport {

	private static final String FILENAME = System.getProperty("java.io.tmpdir") + "script.sql";

	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(User.class);
		config.addAnnotatedClass(CodPostal.class);
		config.addAnnotatedClass(Linea.class);
		config.addAnnotatedClass(Parada.class);
		config.addAnnotatedClass(NivelPeligrosidad.class);
		config.addAnnotatedClass(Calificacion.class);
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		config.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		config.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/madridplaces");
		config.setProperty("hibernate.connection.username", "postgres");
		config.setProperty("hibernate.connection.password", "postgres");
		org.hibernate.tool.hbm2ddl.SchemaExport schemaExport = new org.hibernate.tool.hbm2ddl.SchemaExport(config);
		schemaExport.setOutputFile(FILENAME);
		schemaExport.create(true, false);
		System.out.println("Fichero creado en: " + FILENAME);
	}
}
