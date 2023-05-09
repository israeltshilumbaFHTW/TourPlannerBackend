#!/bin/bash

echo -e "Post tours\n"
curl -X POST \
  http://localhost:8080/tourLogs/1 \
  -H 'Content-Type: application/json' \
  -d '{
                         "date": "2023-04-07",
                         "comment": "Test Tour",
                         "difficulty": 1,
                         "totalTime": 10,
                         "rating": 4.9
  }' | jq .

echo -e "GET tours\n"
curl -X GET http://localhost:8080/tourLogs/1 | jq .