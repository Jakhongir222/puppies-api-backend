
## Puppies API backend with Spring boot

 I have created a puppy API with Spring boot. It ia s website that where one can adopt puppies from.
 Here is the link for the front end of this [app](https://github.com/Jakhongir222/puppies-api-frontend.git)
 

### The task

I have createed a RESTful API with the following endpoints:

- GET: `api/puppies`. This should return a list of all puppies in JSON-format.
- GET: `api/puppies/:id`. This should return one puppy in JSON-format.
- POST: `api/puppies`. This should create and return the newly added puppy.
- PUT: `api/puppies/:id`. This should put one puppy down (jk, just update the specific puppy).
- DELETE: `api/puppies/:id`. This should actually put one puppy down aka delete it.

The database for this app is Postgres SQL. 

Each `puppy` have the following attributes:
- id
- breed
- name
- birth date

### Testing

I have written some tests, Feel free to contribute add more test according to TDD rules!
