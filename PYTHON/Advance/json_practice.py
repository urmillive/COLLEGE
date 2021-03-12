book={}

book['urmil']={
    'name': 'urmil',
    'city':'hathigadh',
    'phone':'123'
}
book['smit']={
    'name': 'smit',
    'city':'damnagar',
    'phone':'789'
}

import json
s = json.dumps(book)
with open('h://BCA//PYTHON//Advance//contacts.txt','w') as f:
    f.write(s)

book = json.loads(s)
print(book)

