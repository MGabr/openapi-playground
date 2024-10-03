
# OpenAPI playground

Simple project for analyzing issues in the OpenAPI spec and client generation with
  * `springdoc-openapi` to generate an OpenAPI spec from a Spring backend
  * `orval` to generate a TypeScript client from the OpenAPI spec

## How to run

 * Start backend `OpenapiPlaygroundApplication`.
 * Get OpenAPI spec for backend at http://localhost:8080/v3/api-docs.yaml.
 * Install Orval with `npm i orval -D`.
 * Generate client with `npx orval --input ./api-docs.yaml --output api.ts` 
or `npx orval --config ./orval.config.js`.
 * Install Axios with `npm i axios`.
 * Install TypeScript with `npm i typescript -D`.
 * Run TypeScript compiler with `npx tsc api.ts` or `npx tsc api.ts api-types-test.ts`.
 * View potential TypeScript errors.
