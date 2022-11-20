- [API Specification](#api-specification)
  - [Request](#request)
    - [Request Field](#request-field)
    - [Request Example](#request-example)
  - [Result](#result)
    - [Result Field](#result-field)
    - [Result Example](#result-example)

## API Specification

| properties | values         |
| ---------- | -------------- |
| Url        | /user/register |

### Request

#### Request Field

| Field          | Type   | Mandatory |
| -------------- | ------ | --------- |
| email          | string | Y         |
| username       | string | Y         |
| password       | string | Y         |
| profilePicture | String | N         |

#### Request Example

```json
{
    "email": "email@email.com",
    "username": "username", 
    "password": "password",
    "profilePicture": "base64 encode profilepicture"
}
```

### Result

#### Result Field
| Field | Type |
|-|-|
| success | boolean |
| errorMsg | String |
| errorCode | String |

#### Result Example 
```json
{
    "sucess": true
}
```