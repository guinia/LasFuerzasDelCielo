package com.tup.buensabor;
import com.tup.buensabor.enums.*;
import com.tup.buensabor.entities.*;
import com.tup.buensabor.repositories.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class BuensaborApplication {
	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	ArticuloInsumoRepository articuloInsumoRepository;

	@Autowired
	ArticuloManufacturadoRepository articuloManufacturadoRepository;

	//@Autowired
	//DetalleArticuloManufacturadoRepository detalleArticuloManufacturadoRepository;

	//@Autowired
	//DetalleFacturaRepository detalleFacturaRepository;

	//@Autowired
	//DetallePedidoRepository detallePedidoRepository;

	//@Autowired
	//FacturaRepository facturaRepository;

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	RubroArticuloRepository rubroArticuloRepository;

	@Autowired
	UnidadMedidaRepository unidadMedidaRepository;

	public static void main(String[] args) {
		SpringApplication.run(
				BuensaborApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository, ArticuloInsumoRepository articuloInsumoRepository, ArticuloManufacturadoRepository articuloManufacturadoRepository, PedidoRepository pedidoRepository, RubroArticuloRepository rubroArticuloRepository, UnidadMedidaRepository unidadMedidaRepository) {
		return args -> {
			System.out.println("----------------ESTOY----FUNCIONANDO---------------------");
			SimpleDateFormat formatoFecha = new SimpleDateFormat ("yyyy-MM-dd");
			String fechaString = "2023-09-09";
			// Parsear la cadena en un objeto Date

			Date fecha = formatoFecha.parse(fechaString);

			Usuario usuario1 = Usuario.builder()
					.username("tomas.guinazu")
					.auth0Id("1")
					.build();
			Usuario usuario2 = Usuario.builder()
					.username("lucia.burky")
					.auth0Id("2")
					.build();
            Usuario usuario3 = Usuario.builder()
                    .username("tomas.mezza")
                    .auth0Id("3")
                    .build();
            Usuario usuario4 = Usuario.builder()
                    .username("citro.cami")
                    .auth0Id("4")
                    .build();
            Usuario usuario5 = Usuario.builder()
                    .username("maxi.costa")
                    .auth0Id("5")
                    .build();
            Usuario usuario6 = Usuario.builder()
                    .username("santi.vicent")
                    .auth0Id("6")
                    .build();
            Usuario usuario7 = Usuario.builder()
                    .username("zarate.sofi")
                    .auth0Id("7")
                    .build();
            Usuario usuario8 = Usuario.builder()
                    .username("lucas.ortiz")
                    .auth0Id("8")
                    .build();
            Usuario usuario9 = Usuario.builder()
                    .username("emiliano.cisterna")
                    .auth0Id("9")
                    .build();
            Usuario usuario10 = Usuario.builder()
                    .username("jadur.dolores")
                    .auth0Id("10")
                    .build();
            Usuario usuario11 = Usuario.builder()
                    .username("velasco.victoria")
                    .auth0Id("11")
                    .build();
            Usuario usuario12 = Usuario.builder()
                    .username("yacante.pablo")
                    .auth0Id("12")
                    .build();
			Usuario usuario13 = Usuario.builder()
					.username("agustina.linares")
					.auth0Id("13")
					.build();

			usuario1.setFechaAlta(fecha);
			usuario2.setFechaAlta(fecha);
			usuario3.setFechaAlta(fecha);
			usuario4.setFechaAlta(fecha);
			usuario5.setFechaAlta(fecha);
			usuario6.setFechaAlta(fecha);
			usuario7.setFechaAlta(fecha);
			usuario8.setFechaAlta(fecha);
			usuario9.setFechaAlta(fecha);
			usuario10.setFechaAlta(fecha);
			usuario11.setFechaAlta(fecha);
			usuario12.setFechaAlta(fecha);


			Domicilio domicilio1 = Domicilio.builder()
					.calle("Suipacha")
					.numero(189)
					.codigoPostal(5597)
					.localidad("Guaymallen")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio2 = Domicilio.builder()
					.calle("Suipacha")
					.numero(190)
					.codigoPostal(5597)
					.localidad("Guaymallen")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio3 = Domicilio.builder()
					.calle("Cnel. Rodriguez")
					.numero(1835)
					.codigoPostal(5500)
					.localidad("Mendoza")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio4 = Domicilio.builder()
					.calle("Patricias Mendocinas")
					.numero(2521)
					.codigoPostal(5500)
					.localidad("Mendoza")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio5 = Domicilio.builder()
					.calle("San Martín")
					.numero(1394)
					.codigoPostal(5500)
					.localidad("Mendoza")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio6 = Domicilio.builder()
					.calle("Araoz")
					.numero(512)
					.codigoPostal(5540)
					.localidad("Lujan")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio7 = Domicilio.builder()
					.calle("San Martín")
					.numero(423)
					.codigoPostal(5540)
					.localidad("Lujan")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio8 = Domicilio.builder()
					.calle("Pedro Vargas")
					.numero(723)
					.codigoPostal(5597)
					.localidad("Guaymallen")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio9 = Domicilio.builder()
					.calle("Miguel Azcuenaga")
					.numero(2440)
					.codigoPostal(5597)
					.localidad("Guaymallen")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio10 = Domicilio.builder()
					.calle("Colón")
					.numero(1302)
					.codigoPostal(5505)
					.localidad("Godoy Cruz")
					.build();
			Domicilio domicilio11 = Domicilio.builder()
					.calle("Bernardo Ortiz")
					.numero(843)
					.codigoPostal(5505)
					.localidad("Godoy Cruz")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio12 = Domicilio.builder()
					.calle("Gral. Paz")
					.numero(145)
					.codigoPostal(5505)
					.localidad("Godoy Cruz")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio13 = Domicilio.builder()
					.calle("Alzaga")
					.numero(402)
					.codigoPostal(5540)
					.localidad("Lujan")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio14 = Domicilio.builder()
					.calle("Perú")
					.numero(533)
					.codigoPostal(5520)
					.localidad("Las Heras")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio15 = Domicilio.builder()
					.calle("Palacios César")
					.numero(1022)
					.codigoPostal(5520)
					.localidad("Las Heras")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();
			Domicilio domicilio16 = Domicilio.builder()
					.calle("Italia")
					.numero(602)
					.codigoPostal(5540)
					.localidad("Lujan")
					.pisoDpto(null)
					.numeroDpto(null)
					.build();

			domicilio1.setFechaAlta(fecha);
			domicilio2.setFechaAlta(fecha);
			domicilio3.setFechaAlta(fecha);
			domicilio4.setFechaAlta(fecha);
			domicilio5.setFechaAlta(fecha);
			domicilio6.setFechaAlta(fecha);
			domicilio7.setFechaAlta(fecha);
			domicilio8.setFechaAlta(fecha);
			domicilio9.setFechaAlta(fecha);
			domicilio10.setFechaAlta(fecha);
			domicilio11.setFechaAlta(fecha);
			domicilio12.setFechaAlta(fecha);
			domicilio13.setFechaAlta(fecha);
			domicilio14.setFechaAlta(fecha);
			domicilio15.setFechaAlta(fecha);
			domicilio16.setFechaAlta(fecha);

			Cliente cliente1 = Cliente.builder()
					.apellido("Gonzales")
					.nombre("Juan")
					.telefono("2617842914")
					.email("gonzales_juani@gmail.com")
					.build();
			Cliente cliente2 = Cliente.builder()
					.apellido("Rodriguez")
					.nombre("Julian")
					.telefono("2611111111")
					.email("rodriguezjulian@gmail.com")
					.build();
			Cliente cliente3 = Cliente.builder()
					.apellido("Guiñazu")
					.nombre("Félix")
					.telefono("2612222222")
					.email("Guiniazufelix@gmail.com")
					.build();
			Cliente cliente4 = Cliente.builder()
					.apellido("Navarta")
					.nombre("Emilia")
					.telefono("2613333333")
					.email("eminavarta@gmail.com")
					.build();
			Cliente cliente5 = Cliente.builder()
					.apellido("Zeferino")
					.nombre("Eliana")
					.telefono("2614444444")
					.email("elizeferino@gmail.com")
					.build();
			Cliente cliente6 = Cliente.builder()
					.apellido("Mobilia")
					.nombre("Agustina")
					.telefono("2615555555")
					.email("agustinamobilia@gmail.com")
					.build();
			Cliente cliente7 = Cliente.builder()
					.apellido("Santi")
					.nombre("Carmen")
					.telefono("2616666666")
					.email("carmensanti@gmail.com")
					.build();
			Cliente cliente8 = Cliente.builder()
					.apellido("Orrico")
					.nombre("Marcela")
					.telefono("2617777777")
					.email("orricomarce@gmail.com")
					.build();
			Cliente cliente9 = Cliente.builder()
					.apellido("Honguito")
					.nombre("Pepe")
					.telefono("2618888888")
					.email("hongopepe@gmail.com")
					.build();
			Cliente cliente10 = Cliente.builder()
					.apellido("Merlín")
					.nombre("Tomás")
					.telefono("2619999999")
					.email("merlinelmago@gmail.com")
					.build();
			Cliente cliente11 = Cliente.builder()
					.apellido("Soto")
					.nombre("Tomás")
					.telefono("2610000000")
					.email("sototomas@gmail.com")
					.build();
			Cliente cliente12 = Cliente.builder()
					.apellido("Mateo")
					.nombre("Rodriguez")
					.telefono("2611212121")
					.email("rodriguezmateo@gmail.com")
					.build();

			cliente1.setFechaAlta(fecha);
			cliente2.setFechaAlta(fecha);
			cliente3.setFechaAlta(fecha);
			cliente4.setFechaAlta(fecha);
			cliente5.setFechaAlta(fecha);
			cliente6.setFechaAlta(fecha);
			cliente7.setFechaAlta(fecha);
			cliente8.setFechaAlta(fecha);
			cliente9.setFechaAlta(fecha);
			cliente10.setFechaAlta(fecha);
			cliente11.setFechaAlta(fecha);
			cliente12.setFechaAlta(fecha);

			cliente1.agregarDomicilio(domicilio1);
			cliente1.agregarDomicilio(domicilio2);
			cliente2.agregarDomicilio(domicilio3);
			cliente3.agregarDomicilio(domicilio4);
			cliente4.agregarDomicilio(domicilio5);
			cliente4.agregarDomicilio(domicilio6);
			cliente5.agregarDomicilio(domicilio7);
			cliente5.agregarDomicilio(domicilio8);
			cliente6.agregarDomicilio(domicilio9);
			cliente7.agregarDomicilio(domicilio10);
			cliente8.agregarDomicilio(domicilio11);
			cliente9.agregarDomicilio(domicilio12);
			cliente10.agregarDomicilio(domicilio13);
			cliente10.agregarDomicilio(domicilio14);
			cliente11.agregarDomicilio(domicilio15);
			cliente12.agregarDomicilio(domicilio16);

			cliente1.setUsuario(usuario1);
			cliente2.setUsuario(usuario2);
			cliente3.setUsuario(usuario3);
			cliente4.setUsuario(usuario4);
			cliente5.setUsuario(usuario5);
			cliente6.setUsuario(usuario6);
			cliente7.setUsuario(usuario7);
			cliente8.setUsuario(usuario8);
			cliente9.setUsuario(usuario9);
			cliente10.setUsuario(usuario10);
			cliente11.setUsuario(usuario11);
			cliente12.setUsuario(usuario12);

			clienteRepository.save(cliente1);
			clienteRepository.save(cliente2);
			clienteRepository.save(cliente3);
			clienteRepository.save(cliente4);
			clienteRepository.save(cliente5);
			clienteRepository.save(cliente6);
			clienteRepository.save(cliente7);
			clienteRepository.save(cliente8);
			clienteRepository.save(cliente9);
			clienteRepository.save(cliente10);
			clienteRepository.save(cliente11);
			clienteRepository.save(cliente12);

			System.out.println("----------------ESTOY----FUNCIONANDO---------------------");

			RubroArticulo rubro1 = RubroArticulo.builder()
					.denominacion("Hamburguesas")
					.build();
			RubroArticulo rubro2 = RubroArticulo.builder()
					.denominacion("Pizzas")
					.build();
			RubroArticulo rubro3 = RubroArticulo.builder()
					.denominacion("Comida Rapida")
					.build();

			// rubro es de manufactura o insumo????
			// creo de ambas por las dudas

			RubroArticulo rubro4 = RubroArticulo.builder()
					.denominacion("Verdura")
					.build();
			RubroArticulo rubro5 = RubroArticulo.builder()
					.denominacion("Carnes")
					.build();

			rubro1.setFechaAlta(fecha);
			rubro2.setFechaAlta(fecha);
			rubro3.setFechaAlta(fecha);
			rubro4.setFechaAlta(fecha);
			rubro5.setFechaAlta(fecha);

			rubro1.setRubroPadre(rubro3);
			rubro2.setRubroPadre(rubro3);

			//cambiar la manera de cargar la list a como esta en pedido-detalle pedido

			/*List<RubroArticulo> comidarapida = new ArrayList<RubroArticulo>();

			comidarapida.add(rubro1);
			comidarapida.add(rubro2);*/

			//rubro3.agregarSubRubro(rubro1);
			//rubro3.agregarSubRubro(rubro2);

			rubroArticuloRepository.save(rubro3);
			rubroArticuloRepository.save(rubro1);
			rubroArticuloRepository.save(rubro2);
			rubroArticuloRepository.save(rubro4);
			rubroArticuloRepository.save(rubro5);

			UnidadMedida unidad1 = UnidadMedida.builder()
					.denominacion("kilogramos")
					.abreviatura("kg")
					.build();
			UnidadMedida unidad2 = UnidadMedida.builder()
					.denominacion("Unidades")
					.abreviatura("U")
					.build();

			unidad1.setFechaAlta(fecha);
			unidad2.setFechaAlta(fecha);

			unidadMedidaRepository.save(unidad1);
			unidadMedidaRepository.save(unidad2);

			ArticuloInsumo articuloInsumo1 = ArticuloInsumo.builder()
					.denominacion("lechuga")
					.precioCompra(BigDecimal.valueOf(300))
					.stockActual(BigDecimal.valueOf(10))
					.stockMinimo(BigDecimal.valueOf(3))
					.urlImagen("")
					.build();
			ArticuloInsumo articuloInsumo2 = ArticuloInsumo.builder()
					.denominacion("tomate")
					.precioCompra(BigDecimal.valueOf(400))
					.stockActual(BigDecimal.valueOf(13))
					.stockMinimo(BigDecimal.valueOf(2))
					.urlImagen("")
					.build();
			ArticuloInsumo articuloInsumo3 = ArticuloInsumo.builder()
					.denominacion("panceta")
					.precioCompra(BigDecimal.valueOf(2600))
					.stockActual(BigDecimal.valueOf(4))
					.stockMinimo(BigDecimal.valueOf(1))
					.urlImagen("")
					.build();
			ArticuloInsumo articuloInsumo4 = ArticuloInsumo.builder()
					.denominacion("carne")
					.precioCompra(BigDecimal.valueOf(1700))
					.stockActual(BigDecimal.valueOf(23))
					.stockMinimo(BigDecimal.valueOf(8))
					.urlImagen("")
					.build();
			ArticuloInsumo articuloInsumo5 = ArticuloInsumo.builder()
					.denominacion("cebolla")
					.precioCompra(BigDecimal.valueOf(700))
					.stockActual(BigDecimal.valueOf(14))
					.stockMinimo(BigDecimal.valueOf(5))
					.urlImagen("")
					.build();
			ArticuloInsumo articuloInsumo6 = ArticuloInsumo.builder()
					.denominacion("pan")
					.precioCompra(BigDecimal.valueOf(550))
					.stockActual(BigDecimal.valueOf(50))
					.stockMinimo(BigDecimal.valueOf(20))
					.urlImagen("")
					.build();

			articuloInsumo1.setFechaAlta(fecha);
			articuloInsumo2.setFechaAlta(fecha);
			articuloInsumo3.setFechaAlta(fecha);
			articuloInsumo4.setFechaAlta(fecha);
			articuloInsumo5.setFechaAlta(fecha);
			articuloInsumo6.setFechaAlta(fecha);

			//no se si poner los rubros pq no se si son de insumos
			//articuloInsumo1.setRubroArticulo(rubro1);

			articuloInsumo1.setUnidadMedida(unidad1);
			articuloInsumo2.setUnidadMedida(unidad1);
			articuloInsumo3.setUnidadMedida(unidad1);
			articuloInsumo4.setUnidadMedida(unidad1);
			articuloInsumo5.setUnidadMedida(unidad1);
			articuloInsumo6.setUnidadMedida(unidad2);

			articuloInsumoRepository.save(articuloInsumo1);
			articuloInsumoRepository.save(articuloInsumo2);
			articuloInsumoRepository.save(articuloInsumo3);
			articuloInsumoRepository.save(articuloInsumo4);
			articuloInsumoRepository.save(articuloInsumo5);
			articuloInsumoRepository.save(articuloInsumo6);
			DetalleArticuloManufacturado detalleArticuloManufacturado1_2 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.2))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado2_2 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.2))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado3_1 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.1))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado4_1 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.3))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado4_2 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.3))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado5_1 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.1))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado5_2 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(0.1))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado6_1 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(1))
					.build();
			DetalleArticuloManufacturado detalleArticuloManufacturado6_2 = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(1))
					.build();

			detalleArticuloManufacturado1_2.setFechaAlta(fecha);
			detalleArticuloManufacturado2_2.setFechaAlta(fecha);
			detalleArticuloManufacturado3_1.setFechaAlta(fecha);
			detalleArticuloManufacturado4_1.setFechaAlta(fecha);
			detalleArticuloManufacturado4_2.setFechaAlta(fecha);
			detalleArticuloManufacturado5_1.setFechaAlta(fecha);
			detalleArticuloManufacturado5_2.setFechaAlta(fecha);
			detalleArticuloManufacturado6_1.setFechaAlta(fecha);
			detalleArticuloManufacturado6_2.setFechaAlta(fecha);

			detalleArticuloManufacturado1_2.setArticuloInsumo(articuloInsumo1);
			detalleArticuloManufacturado2_2.setArticuloInsumo(articuloInsumo2);
			detalleArticuloManufacturado3_1.setArticuloInsumo(articuloInsumo3);
			detalleArticuloManufacturado4_1.setArticuloInsumo(articuloInsumo4);
			detalleArticuloManufacturado4_2.setArticuloInsumo(articuloInsumo4);
			detalleArticuloManufacturado5_1.setArticuloInsumo(articuloInsumo5);
			detalleArticuloManufacturado5_2.setArticuloInsumo(articuloInsumo5);
			detalleArticuloManufacturado6_1.setArticuloInsumo(articuloInsumo6);
			detalleArticuloManufacturado6_2.setArticuloInsumo(articuloInsumo6);

			ArticuloManufacturado hamburguesa1 = ArticuloManufacturado.builder()
					.denominacion("Hamburguesa Americana")
					.descripcion("Hamburugesa re picada re rica")
					.precioVenta(BigDecimal.valueOf(3200))
					.tiempoEstimadoCocina(20)
					.urlImagen("")
					.build();
			ArticuloManufacturado hamburguesa2 = ArticuloManufacturado.builder()
					.denominacion("Hamburguesa Fresh")
					.descripcion("Hamburugesa re picada re rica re fresh")
					.precioVenta(BigDecimal.valueOf(3350))
					.tiempoEstimadoCocina(15)
					.urlImagen("")
					.build();

			hamburguesa1.setFechaAlta(fecha);
			hamburguesa2.setFechaAlta(fecha);

			//cambiar la manera de cargar la list a como esta en pedido-detalle pedido

			//List<DetalleArticuloManufacturado> detalleHamburguesa1 = new ArrayList<DetalleArticuloManufacturado>();


			//detalleHamburguesa1.add(detalleArticuloManufacturado3_1);
			//detalleHamburguesa1.add(detalleArticuloManufacturado4_1);
			//detalleHamburguesa1.add(detalleArticuloManufacturado5_1);
			//detalleHamburguesa1.add(detalleArticuloManufacturado6_1);

			//List<DetalleArticuloManufacturado> detalleHamburguesa2 = new ArrayList<DetalleArticuloManufacturado>();

			//detalleHamburguesa2.add(detalleArticuloManufacturado1_2);
			//detalleHamburguesa2.add(detalleArticuloManufacturado2_2);
			//detalleHamburguesa2.add(detalleArticuloManufacturado4_2);
			//detalleHamburguesa2.add(detalleArticuloManufacturado5_2);
			//detalleHamburguesa2.add(detalleArticuloManufacturado6_2);

			hamburguesa1.agregarDetalle(detalleArticuloManufacturado3_1);
			hamburguesa1.agregarDetalle(detalleArticuloManufacturado4_1);
			hamburguesa1.agregarDetalle(detalleArticuloManufacturado5_1);
			hamburguesa1.agregarDetalle(detalleArticuloManufacturado6_1);

			hamburguesa2.agregarDetalle(detalleArticuloManufacturado1_2);
			hamburguesa2.agregarDetalle(detalleArticuloManufacturado2_2);
			hamburguesa2.agregarDetalle(detalleArticuloManufacturado4_2);
			hamburguesa2.agregarDetalle(detalleArticuloManufacturado5_2);
			hamburguesa2.agregarDetalle(detalleArticuloManufacturado6_2);

			articuloManufacturadoRepository.save(hamburguesa1);
			articuloManufacturadoRepository.save(hamburguesa2);

			//no se que es subtotalCOSTO, le puse lo mismo en detalle y en pedido 500 mas que el total

			//se lee: detalle n _ del pedido n
			DetallePedido detallePedido1_1 = DetallePedido.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(6700))
					.subtotalCosto(BigDecimal.valueOf(6700))
					.build();
			DetallePedido detallePedido1_2 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(BigDecimal.valueOf(3200))
					.subtotalCosto(BigDecimal.valueOf(3200))
					.build();
			DetallePedido detallePedido1_3 = DetallePedido.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(6400))
					.subtotalCosto(BigDecimal.valueOf(6400))
					.build();
			DetallePedido detallePedido2_3 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(BigDecimal.valueOf(3350))
					.subtotalCosto(BigDecimal.valueOf(3350))
					.build();

			detallePedido1_1.setFechaAlta(fecha);
			detallePedido1_2.setFechaAlta(fecha);
			detallePedido1_3.setFechaAlta(fecha);
			detallePedido2_3.setFechaAlta(fecha);

			detallePedido1_1.setArticuloManufacturado(hamburguesa2);
			detallePedido1_2.setArticuloManufacturado(hamburguesa1);
			detallePedido1_3.setArticuloManufacturado(hamburguesa1);
			detallePedido2_3.setArticuloManufacturado(hamburguesa2);

			//se lee: detalle n _ de la factura n

			DetalleFactura detalleFactura1_1 = DetalleFactura.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(6700))
					.build();
			DetalleFactura detalleFactura1_2 = DetalleFactura.builder()
					.cantidad(1)
					.subtotal(BigDecimal.valueOf(3200))
					.build();
			DetalleFactura detalleFactura1_3 = DetalleFactura.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(6400))
					.build();
			DetalleFactura detalleFactura2_3 = DetalleFactura.builder()
					.cantidad(1)
					.subtotal(BigDecimal.valueOf(3350))
					.build();

			detalleFactura1_1.setFechaAlta(fecha);
			detalleFactura1_2.setFechaAlta(fecha);
			detalleFactura1_3.setFechaAlta(fecha);
			detalleFactura2_3.setFechaAlta(fecha);

			detalleFactura1_1.setArticuloManufacturado(hamburguesa2);
			detalleFactura1_2.setArticuloManufacturado(hamburguesa1);
			detalleFactura1_3.setArticuloManufacturado(hamburguesa1);
			detalleFactura1_3.setArticuloManufacturado(hamburguesa2);

			Factura factura1 = Factura.builder()
					.fechaFacturacion(fecha)
					.mpMerchantOrderId(Long.valueOf(11111111))
					.mpPaymentId(Long.valueOf(11111111))
					.totalVenta(BigDecimal.valueOf(6700))
					.formaPago(FormaPago.EFECTIVO)
					.mpPaymentType("?")
					.mpPreferenceId("?")
					.build();
			Factura factura2 = Factura.builder()
					.fechaFacturacion(fecha)
					.mpMerchantOrderId(Long.valueOf(11111111))
					.mpPaymentId(Long.valueOf(11111111))
					.totalVenta(BigDecimal.valueOf(3200))
					.formaPago(FormaPago.EFECTIVO)
					.mpPaymentType("?")
					.mpPreferenceId("?")
					.build();
			Factura factura3 = Factura.builder()
					.fechaFacturacion(fecha)
					.mpMerchantOrderId(Long.valueOf(11111111))
					.mpPaymentId(Long.valueOf(11111111))
					.totalVenta(BigDecimal.valueOf(9750))
					.formaPago(FormaPago.MERCADO_PAGO)
					.mpPaymentType("?")
					.mpPreferenceId("?")
					.build();

			factura1.setFechaAlta(fecha);
			factura2.setFechaAlta(fecha);
			factura3.setFechaAlta(fecha);

			factura1.agregarDetalle(detalleFactura1_1);
			factura2.agregarDetalle(detalleFactura1_2);
			factura3.agregarDetalle(detalleFactura1_3);
			factura3.agregarDetalle(detalleFactura2_3);


			//no se que es subtotalCOSTO, le puse lo mismo en detalle y en pedido 500 mas que el total
			//se lee: pedido nro n _ q es del cliente n
			Pedido pedido1_1 = Pedido.builder()
					.estado(EstadoPedido.PREPARACION)
					.fechaPedido(fecha)
					.formaPago(FormaPago.EFECTIVO)
					.horaEstimadaFinalizacion(fecha)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.total(BigDecimal.valueOf(6700))
					.totalCosto(BigDecimal.valueOf(7200))
					.build();
			Pedido pedido2_1 = Pedido.builder()
					.estado(EstadoPedido.COMPLETADO)
					.fechaPedido(fecha)
					.formaPago(FormaPago.EFECTIVO)
					.horaEstimadaFinalizacion(fecha)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.total(BigDecimal.valueOf(3200))
					.totalCosto(BigDecimal.valueOf(3700))
					.build();
			Pedido pedido3_2 = Pedido.builder()
					.estado(EstadoPedido.EN_CAMINO)
					.fechaPedido(fecha)
					.formaPago(FormaPago.MERCADO_PAGO)
					.horaEstimadaFinalizacion(fecha)
					.tipoEnvio(TipoEnvio.TAKE_AWAY)
					.total(BigDecimal.valueOf(9750))
					.totalCosto(BigDecimal.valueOf(10250))
					.build();

			pedido1_1.setFechaAlta(fecha);
			pedido2_1.setFechaAlta(fecha);
			pedido3_2.setFechaAlta(fecha);

			pedido1_1.setCliente(cliente1);
			pedido2_1.setCliente(cliente1);
			pedido3_2.setCliente(cliente2);

			pedido1_1.setDomicilioEntrega(domicilio1);
			pedido2_1.setDomicilioEntrega(domicilio2);
			pedido3_2.setDomicilioEntrega(domicilio3);

			pedido1_1.agregarDetalle(detallePedido1_1);
			pedido2_1.agregarDetalle(detallePedido1_2);
			pedido3_2.agregarDetalle(detallePedido1_3);
			pedido3_2.agregarDetalle(detallePedido2_3);

			pedido1_1.setFactura(factura1);
			pedido2_1.setFactura(factura2);
			pedido3_2.setFactura(factura3);

			pedidoRepository.save(pedido1_1);
			pedidoRepository.save(pedido2_1);
			pedidoRepository.save(pedido3_2);

		};
	}
}