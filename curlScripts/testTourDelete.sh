#!/bin/bash

echo -e "Get all Tours"
curl http://localhost:8080/tours/1
echo -e "Delete Tour\n"
curl -X DELETE \
  http://localhost:8080/tours/1 \
  | jq .
