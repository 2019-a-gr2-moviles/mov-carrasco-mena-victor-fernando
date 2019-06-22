/**
 * Servicio.js
 *
 * @description :: A model definition represents a database table/collection.
 * @docs        :: https://sailsjs.com/docs/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {

    nombre:{
      type:'string'
    },
    // configuracion del hijo
    fkUsuario:{ // nombre del FK para la relacion
      model:'usuario' //nombre del modelo a relacionar (papa)
      //required:true // OPCIONAL -> Siempre ingresa el FK
    },

  },

};

