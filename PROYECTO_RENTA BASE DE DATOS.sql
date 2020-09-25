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
    CodigoInspeccionSeguridad varchar (20),
	CodigoLimpiezaPCV varchar (20),
    CodigoDiagnosticoScanner varchar (20),
    CodigoRevisiondefrenos varchar (20)    
    )ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
    /*MANTENIMIENTO ESTADO DE VEHICULO DISPONIBLE RENTADO NO DISPONIBLE*/
	Create table ManteEstadoVehiculoDRN(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
    CodigoMarca varchar (20),
	CodigoTipo varchar (20),
    CodigoEstadoVehiculo varchar (20)
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

    
    /*RENTA*/
    CREATE TABLE RENTA(
    ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_RENTA int(10) NOT NULL,
	SERIE varchar(10) NOT NULL,
	ID_CLIENTE int (10) NOT NULL,
	ID_USUARIO int(10) NULL,
	ID_TIPO_PAGO int(10) NULL,
	FECHA_PRESTAMO datetime NULL,
	FECHA_DEVOLUCION datetime NULL,
	TOTAL decimal(10, 2) NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
    /*TIPO_VEHICULO*/
    CREATE TABLE TIPO_VEHICULO(
    ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_TIPO_VEHICULO int NOT NULL,
	DESCRIPCION nvarchar(50) NULL
     ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*PRIMARY KEY CLUSTERED 

	ID_TIPO_VEHICULO ASC
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
 ON [PRIMARY]*/
 
 
 /*VEHICULO*/
 CREATE TABLE VEHICULO(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_VEHICULO int (10) NOT NULL,
	ID_MARCA int (10) NULL,
	ID_TIPO_VEHICULO int (10) NULL,
	ID_VEHICULO_ESTADO int (10) NULL,
	MODELO varchar(50) NULL
     ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/* CONSTRAINT [PK_VEHICULO] PRIMARY KEY CLUSTERED 
(
	[ID_VEHICULO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]*/

CREATE TABLE VEHICULO_ESTADO(
	ID  int (20) auto_increment primary key,
	Codigo varchar (20),
	ID_VEHICULO_ESTADO int (20) NOT NULL,
	DESCRIPCION nvarchar (50) NULL
       ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*PRIMARY KEY CLUSTERED 
(
	[ID_VEHICULO_ESTADO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]*/



    use Proyecto_renta;
	select * from usuarios;