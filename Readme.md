Data

{
    "name": "Juan Mata",
    "email": "abc@dominio.cl",
    "password": "Maaa22",
    "phones": [
        {
            "number": "75474575",
            "citycode": "2",
            "contrycode": "22"
        }
    ]
}

DataType and  patterns
name:       String
email:      aaaaaaaa@dominio.cl   (unique)
password:   [A-Z][a-z]*[0-9]{2,}
number:     [1-9][0-9]{4,}
citycode:   digits or null
contrycode: digits or null