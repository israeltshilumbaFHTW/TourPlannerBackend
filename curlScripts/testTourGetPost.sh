#!/bin/bash

echo -e "Post tours\n"
curl -X POST \
  http://localhost:8080/tours \
  -H 'Content-Type: application/json' \
  -d '{
        "name": "Tour de Paris",
        "description": "A tour of the beautiful city of Paris",
        "fromLocation": "Paris, France",
        "toLocation": "Eiffel Tower, Paris, France",
        "transportType": "Walking",
        "distance": 5.0,
        "estimatedTime": 1.5,
        "routeImage": {
            "imageUrl": "https://www.example.com/image.jpg",
            "imageType": "jpg"
        }
    }' | jq .

curl -X POST \
  http://localhost:8080/tours \
  -H 'Content-Type: application/json' \
  -d '{
        "name": "Walking Tour of Rome",
        "description": "A walking tour of Romes historic landmarks",
        "fromLocation": "Rome, Italy",
        "toLocation": "Colosseum, Rome, Italy",
        "transportType": "Walking",
        "distance": 3.0,
        "estimatedTime": 1.0,
        "routeImage": {
            "imageUrl": "https://www.example.com/image.jpg",
            "imageType": "jpg"
        }
    }' | jq .

curl -X POST \
  http://localhost:8080/tours \
  -H 'Content-Type: application/json' \
  -d '{
        "name": "Road Trip through California",
        "description": "A scenic road trip through Californias highways",
        "fromLocation": "San Francisco, CA, USA",
        "toLocation": "Los Angeles, CA, USA",
        "transportType": "Driving",
        "distance": 600.0,
        "estimatedTime": 10.0,
        "routeImage": {
            "imageUrl": "https://www.example.com/image.jpg",
            "imageType": "jpg"
        }
    }' | jq .

curl http://localhost:8080/tours | jq .