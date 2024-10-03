 module.exports = {
   'petstore-file': {
     input: './api-docs.yaml',
     output: {
       target: './api.ts',
       override: {
         useNativeEnums: true,
       }
     }
   },
 };