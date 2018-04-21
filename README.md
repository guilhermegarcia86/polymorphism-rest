# polymorphism-rest

Neste exemplo temos uma classe abstrata _Animal_ e _Dog/Cat_ **extends** dela. Foi criado um controller que recebe _Animal_ mas na chamada passamos um _Dog/Cat_ e chamamos o seu **toString**.
Passamos a seguinte estrutura JSON no POST da url **/animal**

```javascript
{
	"@type": "Dog",
	"name": "Doggo",
	"bark": "auau"
}
```
E na url **/zoo/incluir**
```javascript
{
	"animais" : [{
		"@type": "Dog",
		"name": "Doggo",
		"bark": "auau"
	},{
		"@type": "Cat",
		"name": "Cat",
		"meow": "meow"
	}]
}
```
