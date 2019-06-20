/**
 * Usuario.js
 *
 * @description :: A model definition represents a database table/collection.
 * @docs        :: https://sailsjs.com/docs/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
	nombreAtributo: {
    type: 'string',
    
	},
	nombre:{
		type:'string',
		required: true,
		unique:true,
		minLength:3
	},
	username:{
		type:'string',
		required: true,
		unique:true
	},
	fechaNacimiento:{
		type:'string',
	},
	sueldo:{
		type:'number',
		min: 100.00,
		max: 5000,
		defaultsTo: 100.00
	},
	estaCasado:{
		type:'boolean',
		defaultsTo:false
	},
	latitudCasa:{
		type:'string'
	},
	longitudCasa:{
		type:'string'
	},
	tipoUsuario:{
		type:'string',
		enum:['normal','pendiente']
	},
	correo:{
		type: 'string',
		isEmail:true
	}
  },
  
  // Estandar restful
  
  // CREAR
  // http://localhost:1337/usuario
  // METODO HTTP: POST
  // Body Params: usuario

  // ACTUALIZAR
  // http://localhost:1337/usuario/:id
  // Ej: http://localhost:1337/usuario/1
  // METODO HTTP: PUT
  // Body Params: usuario
  
  // Borrar
  // http://localhost:1337/usuario/:id
  // Ej: http://localhost:1337/usuario/1
  // METODO HTTP: DELETE
  
  // BUSCAR POR ID
  // http://localhost:1337/usuario/:id
  // Ej: http://localhost:1337/usuario/1
  // METODO HTTP: GET
  
  // Obtener todos (enviar parametros de busqueda)
  // http://localhost:1337/usuario
  // METODO HTTP: GET
  

};

