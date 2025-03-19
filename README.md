стандартный 8080 порт, end-point ```/numbers/increment```


пример запроса
```
curl --location --request POST 'localhost:8080/numbers/increment' \
--header 'Content-Type: application/json' \
--data-raw '{
"numbers": [
-1,
1,
0
]
}'
```
