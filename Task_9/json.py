import requests
import json


url = 'http://localhost:8080/api/v1/clients'
resp = requests.get(url)
print(resp.text())

client = {1: 'John Doe'}
resp1 = requests.post(url, json=client)

resp2 = requests.delete(url, json=client)