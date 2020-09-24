CREATE DATABASE Proyecto_renta;
USE Proyecto_renta;

CREATE TABLE usuarios
(
  
  id int(11) auto_increment PRIMARY KEY,
  usuario varchar(10) ,
  password varchar(45) ,
  nombre varchar(60) ,
  email varchar(30) ,
  idTipo int(11) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
update usuarios set idTipo= '0'
where id = 2;

/*REGISTRO CLIENTES*/

create table ManteClientes(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
    CodigoNIT varchar (20),
	NCodigoNombre varchar (20),
    CodigoApellido varchar (20),
    CodigoTelefono varchar (20),
    CogigoDireccion varchar (20)
    )ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
    use Proyecto_renta;
	select * from ManteClientes;
    
    
    /*Mantenimiento masrcas y tipo*/
   Create table Mantemarcas(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
    CodigoMarca varchar (20),
	CodigoTipo varchar (20)
    )ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
     /*Mantenimiento Vehiculo*/
	Create table ManteVehiculo(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
    CodigoVehiculo varchar (20),
	CodigoModelo varchar (20),
    CodigoMarca varchar (20),
    CodigoAceitemulti varchar (20),
    CodigoFiltroAceite varchar (20),
    CodigoFiltroAire varchar (20),
    CodigoFiltroGasolina varchar (20),
    CodigoBujias varchar (20),
    CodigoLimpiezaAceleracion varchar (20),
    CodigoLimpiezaPCV varchar (20),
    CodigoInspeccionSeguridad varchar (20),
    CodigoDiagnosticoScanner varchar (20),
    CodigoRevisiondefrenos varchar (20)    
    )ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
    /*DETALLE RENTA*/
    Create table DETALLE_RENTA(
    ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_RENTA int NOT NULL,
	SERIE varchar(10) NOT NULL,
	ID_DETALLE_RENTA int NOT NULL,
	ID_VEHICULO int NULL,
	PRECIO_ALQUILER decimal(8, 2) NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*PRIMARY KEY CLUSTERED 
(
	ID_RENTA ASC,
	SERIE ASC,
	ID_DETALLE_RENTA ASC
)
 WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON PRIMARY
) ON PRIMARY*/

	use Proyecto_renta;
	select * from RENTA;
    
    /*RENTA*/
    CREATE TABLE RENTA(
    ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_RENTA int NOT NULL,
	SERIE varchar(10) NOT NULL,
	ID_CLIENTE int NOT NULL,
	ID_USUARIO int NULL,
	ID_TIPO_PAGO int NULL,
	FECHA_PRESTAMO datetime NULL,
	FECHA_DEVOLUCION datetime NULL,
	TOTAL decimal(10, 2) NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;