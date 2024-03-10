## API Endpointleri

| Endpoint                     | Method | Açıklama                                                 | Örnek Kullanım                                              |
|------------------------------|--------|----------------------------------------------------------|-------------------------------------------------------------|
| /api/authors                 | GET    | Tüm yazarları listeler.                                  | GET http://localhost:8080/v1/authors?page=0&pageSize=10       |
| /api/authors/{id}            | GET    | Id'si verilen yazarın detaylarını getirir.               | GET http://localhost:8080/v1/authors/1                      |
| /api/authors                 | POST   | Yeni bir yazar ekler.                                    | POST http://localhost:8080/v1/authors                       |
| /api/authors/{id}            | PUT    | Id'si verilen yazarın bilgilerini günceller.               | PUT http://localhost:8080/v1/authors/1                      |
| /api/authors/{id}            | DELETE | Id'si verilen yazarı siler.                                | DELETE http://localhost:8080/v1/authors/1                   |
| /api/books                   | GET    | Tüm kitapları listeler.                                  | GET http://localhost:8080/v1/books?page=0&pageSize=10        |
| /api/books/{id}              | GET    | Id'si verilen kitabın detaylarını getirir.                 | GET http://localhost:8080/v1/books/1                       |
| /api/books                   | POST   | Yeni bir kitap ekler.                                    | POST http://localhost:8080/v1/books                        |
| /api/books/{id}              | PUT    | Id'si verilen kitabın bilgilerini günceller.               | PUT http://localhost:8080/v1/books/1                       |
| /api/books/{id}              | DELETE | Id'si verilen kitabı siler.                                | DELETE http://localhost:8080/v1/books/1                    |
| /api/bookborrowings          | GET    | Tüm kitap ödünç işlemlerini listeler.                    | GET http://localhost:8080/v1/bookborrowings?page=0&pageSize=10 |
| /api/bookborrowings/{id}     | GET    | Id'si verilen kitap ödünç işleminin detaylarını getirir.   | GET http://localhost:8080/v1/bookborrowings/1          |
| /api/bookborrowings          | POST   | Yeni bir kitap ödünç işlemi oluşturur.                   | POST http://localhost:8080/v1/bookborrowings              |
| /api/bookborrowings/{id}     | PUT    | Id'si verilen kitap ödünç işleminin bilgilerini günceller. | PUT http://localhost:8080/v1/bookborrowings/1         |
| /api/bookborrowings/{id}     | DELETE | Id'si verilen kitap ödünç işlemini siler.                  | DELETE http://localhost:8080/v1/bookborrowings/1           |
| /api/publishers              | GET    | Tüm yayınevlerini listeler.                              | GET http://localhost:8080/v1/publishers?page=0&pageSize=10   |
| /api/publishers/{id}         | GET    | Id'si verilen yayınevinin detaylarını getirir.             | GET http://localhost:8080/v1/publishers/1                 |
| /api/publishers              | POST   | Yeni bir yayınevi ekler.                                 | POST http://localhost:8080/v1/publishers                   |
| /api/publishers/{id}         | PUT    | Id'si verilen yayınevinin bilgilerini günceller.           | PUT http://localhost:8080/v1/publishers/1                  |
| /api/publishers/{id}         | DELETE | Id'si verilen yayınevini siler.                            | DELETE http://localhost:8080/v1/publishers/1               |
| /api/categories              | GET    | Tüm kategorileri listeler.                               | GET http://localhost:8080/v1/categories?page=0&pageSize=10   |
| /api/categories/{id}         | GET    | Id'si verilen kategorinin detaylarını getirir.             | GET http://localhost:8080/v1/categories/1                 |
| /api/categories              | POST   | Yeni bir kategori ekler.                                 | POST http://localhost:8080/v1/categories                   |
| /api/categories/{id}         | PUT    | Id'si verilen kategorinin bilgilerini günceller.           | PUT http://localhost:8080/v1/categories/1                  |
| /api/categories/{id}         | DELETE | Id'si verilen kategoriyi siler.                            
