# DGS Example Application: GraphQL for Spring Boot

## Schemas
GraphQL's schema are loaded from `src/main/resources/schema` folder. All file with `graphqls` extention are loaded.

## DgsComponent
This annotation makes a class a DGS/Spring component to be load by these frameworks. 

## Data Fetcher
Data Fetcher are classes responsible for retrieving data for a query. This project has all Data Fetchers defined on
package `io.github.ricardosander.dgsexample.datafetchers`.

### DgsData
This annotation makes a method a Data Fetcher. They support the following 
parameters:

#### parentType
Defines the type that contains the field. It can be a GraphQL type (Query, Mutation, Subscription) or a custom type, 
providing support to complex types.

`ShowsDataFetcher`'s parentType is Query because it defines a data fetcher to `shows` Query.
`ActorsDataFetcher`'s parentType is Show because it defines a data fetcher to `actors` field of type Show. 

One can replace parentTypes `Query`, `Mutation` and `Subscription` by its specific DgsData annotations: `@DgsQuery`, 
`DgsMutation` and `DgsSubscription`. 

#### field

Defines the field that the data fetcher is responsible for.

`ShowsDataFetcher`'s field is shows because it defines a data fetcher to `shows` field of Query.
`ActorsDataFetcher`'s field is actors because it defines a data fetcher to the field `actors` of a type Show.

If the field parameter is not set, the method name will be used as the field name.

### Child Data Fetchers

### Input Argument

#### Input Argument with Lists

#### Input Argument with Optional
