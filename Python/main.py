from account import Account
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))

    car2 = Car("WQE567", Account("Martha", "DAS897"))
    print(vars(car2))