
## Puppies API backend with Spring boot

In this exercise you will create a puppy API with Spring boot. Here is the link for the front end of this [app](https://github.com/Jakhongir222/puppies-api-frontend.git)
 

### The task

Your task is to create a RESTful API with the following endpoints:

- GET: `api/puppies`. This should return a list of all puppies in JSON-format.
- GET: `api/puppies/:id`. This should return one puppy in JSON-format.
- POST: `api/puppies`. This should create and return the newly added puppy.
- PUT: `api/puppies/:id`. This should put one puppy down (jk, just update the specific puppy).
- DELETE: `api/puppies/:id`. This should actually put one puppy down aka delete it.

The database for this task can just be a local array or a real database, it is up to you.

Each `puppy` should have the following attributes:
- id
- breed
- name
- birth date

### Testing

We have supplied a starter tests to get going, please add more as TDD rules!
