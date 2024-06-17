package com.example.parcial_lab2;

import com.example.parcial_lab2.entities.*;
import com.example.parcial_lab2.entities.enums.Rol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ParcialLab2Application implements CommandLineRunner {

	@Autowired
	private EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(ParcialLab2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			UsuarioCliente uc = new UsuarioCliente();
			uc.setUsername("usuario_mortadela");

			ImagenCliente ic = new ImagenCliente();
			ic.setDenominacion("imagen_mortadela");

			UsuarioCliente usuarioCliente = new UsuarioCliente();
			ImagenCliente imagenCliente = new ImagenCliente();
			UsuarioEmpleado usuarioEmpleado = new UsuarioEmpleado();
			ImagenEmpleado imagenEmpleado = new ImagenEmpleado();

			Cliente cliente = new Cliente();
			cliente.setNombre("Juan");
			cliente.setUsuarioCliente(uc);
			cliente.setImagenCliente(ic);

			Empleado empleado = new Empleado();
			cliente.setNombre("Leandro");

			ArticuloInsumo articuloInsumo = new ArticuloInsumo();

			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

		System.out.println();
		System.out.println(" - BIENVENIDOS A HAMBURGUESITAS DB");
	}
}
