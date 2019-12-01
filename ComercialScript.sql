create database if not exists Comercial;
use Comercial;
#tablas

create table if not exists Productos(
Id_Producto int primary key not null AUTO_INCREMENT,
Producto varchar(50),
Serie varchar(10),
Costo decimal(15,2) not null,
Margen decimal(10,2) not null,
Marca_Id int,
descripcion varchar(200),
proveedor_id int
);

create table if not exists  Marca(
Id_marca int primary key not null AUTO_INCREMENT,
marca varchar(50)
);

create table if not exists clientes(
Id_Cliente int primary key not null AUTO_INCREMENT,
Nombres varchar(50),
Apellidos varchar(50),
Edad int,
Telefono int,
Direccion varchar(200),
Usuario_id int
);

create table if not exists Proveedor(
Id_proveedor int primary key not null AUTO_INCREMENT,
Proveedor varchar(50),
edad int
);


Create table if not exists Inventario(
	id_inventario int not null primary key AUTO_INCREMENT,
	Precio decimal(15,2) not null,
	Existencias int not null,
	Producto_Id int
);

create table if not exists ventas(
    id_Venta int not null primary key AUTO_INCREMENT ,
	Fecha Date,
    ClienteId_fk int not null
    );

create table if not exists detallesventas(
DetalleVentaId int not null primary key AUTO_INCREMENT,
ProductoId int,
Cantidad int,
PrecioVenta decimal(15,2),
venta_id int
);

create table if not exists compras(
OrdenId int not null primary key AUTO_INCREMENT,
	Fecha datetime not null,
	Estado int not null,
    Proveedor_Id int
);

create table if not exists detallecompras(
DetalleOCId int not null primary key AUTO_INCREMENT,
	Cantidad int not null,
	Precio  decimal(15,2)  not null,
    OrdenCompra_Id int,
    Producto_Id int
);

create table if not exists usuario(
ID_Usuario int not null primary key AUTO_INCREMENT,
	usuario varchar(50),
    contraseña  varbinary(50),
    correo varchar(50)
    );
    
    create table if not exists empleado(
    ID_empleado int not null primary Key AUTO_INCREMENT,
    empleado varchar(50),
    edad int,
    telefono varchar(50),
    direccion varchar(50),
    Usuario_id int
    );
    
ALTER TABLE Productos
ADD FOREIGN KEY (Marca_Id) REFERENCES Marca(Id_marca); 

ALTER TABLE Productos
ADD FOREIGN KEY (proveedor_id) REFERENCES Proveedor(Id_proveedor);

ALTER TABLE clientes
ADD FOREIGN KEY (Usuario_id) REFERENCES usuario(ID_Usuario); 

ALTER TABLE empleado
ADD FOREIGN KEY (Usuario_id) REFERENCES usuario(ID_Usuario); 

ALTER TABLE inventario
ADD FOREIGN KEY (Producto_Id) REFERENCES Productos(Id_Producto); 

ALTER TABLE ventas
ADD FOREIGN KEY (ClienteId_fk) REFERENCES clientes(Id_Cliente); 

ALTER TABLE detallesventas
ADD FOREIGN KEY (venta_id) REFERENCES ventas( id_Venta); 

ALTER TABLE detallecompras
ADD FOREIGN KEY ( Producto_Id) REFERENCES Productos( Id_Producto); 

ALTER TABLE compras
ADD FOREIGN KEY ( Proveedor_Id) REFERENCES Proveedor( Id_proveedor); 
use comercial ;

call Sp_Logear('alvaro','1234');

select * from usuario;

Set Global time_zone ='-6:00'; 


 
 
 













    
    
    
    

    
    
    
    
    
    

