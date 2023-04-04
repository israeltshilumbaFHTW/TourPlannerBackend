#!/bin/bash

echo -e "Add new Entry \n"
curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Berlin",
    "degree": 10
      }' | jq .

curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Vienna",
    "degree": 12
      }'  | jq .

curl -X POST \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' \
  -d '{
    "location": "Paris",
    "degree": 19
      }' | jq .

echo -e "Get all new Entries \n"
read

curl -X GET \
  http://localhost:8080/weather/ \
  -H 'Content-Type: application/json' | jq .

curl -X GET \
  http://localhost:8080/weather/2 \
  -H 'Content-Type: application/json' | jq .

