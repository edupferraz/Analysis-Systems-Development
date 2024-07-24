# Classe abstrata
- Pode conter atributos, métodos concretos e métodos abstratos porém sem ser instanciada
- Caso não sobrescreva os métodos/atributos logo não irá rodar

# Interface
- Semelhante a uma classe abstrata

# Polimorfismo
- Capacidade de um objeto poder ser referenciado de várias formas
- Facilidade para o desenvolvimento de sistemas que sejam facilmente extensíveis

```mermaid

classDiagram
    class Employee {
        <<Abstract>>
        - String name
        - String cpf
        - double paymentFixed

        + receivePayment()
        + calcPayment(): double
    }

    class FixedMonthly {
        + calcPayment(): double
    }

    class Hourly {
        + calcPayment(): double
    }

    class Commissioned {
        + calcPayment(): double
    }

    class CommissionedEffective {
        + calcPayment(): double
    }

    Employee <|-- FixedMonthly
    Employee <|-- Hourly
    Employee <|-- Commissioned
    Employee <|-- CommissionedEffective


    class Commissioned {
        + calcPayment(): double
    }

    class CommissionedEffective {
        + calcPayment(): double
    }

    Employee <-- FixedMonthly
    Employee <-- Hourly
    Employee <-- Commissioned
    Employee <-- CommissionedEffective


