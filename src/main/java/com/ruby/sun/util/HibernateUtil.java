package com.ruby.sun.util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static final Logger log = LoggerFactory.getLogger(HibernateUtil.class);

	private static StandardServiceRegistry standardRegistry;
	private static String dbConfigFile = System.getProperty("user.dir") + "\\src\\main\\resources\\hibernate.cfg.xml";
	static {

		try {
			File f = new File(dbConfigFile);
			standardRegistry = new StandardServiceRegistryBuilder().configure(f).build();
			Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			sessionFactory = metaData.getSessionFactoryBuilder().build();
		} catch (Throwable th) {

			log.error("Initial SessionFactory creation failed", th);
			throw new ExceptionInInitializerError(th);

		}
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}

	public static void setDbConfigFile(String dbConfigFile) {
		HibernateUtil.dbConfigFile = dbConfigFile;
	}

	public static void close() throws Exception {

		StandardServiceRegistryBuilder.destroy(standardRegistry);

		if (sessionFactory.isOpen()) {
			sessionFactory.close();
		}

	}

}
