#!/bin/bash

echo -e "Add new Entry \n"
read
curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Berlin",
    "degree": 10
      }'

curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Vienna",
    "degree": 12
      }'

curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Paris",
    "degree": 19
      }'

echo -e "Get all new Entries \n"
read
curl -X GET \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json'

