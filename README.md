# Order Management System

> Sistema de gerenciamento de pedidos via terminal desenvolvido em Java.

---

## 📋 Sobre o projeto

O sistema permite cadastrar um cliente, criar um pedido com múltiplos itens e calcular o valor total automaticamente, exibindo um resumo completo ao final diretamente no terminal.

---

## 🚀 Como executar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/order-management-system

# Abra no IntelliJ IDEA e execute o Main.java
```

---

## 💡 Conceitos aplicados

### Composição
O projeto foi desenvolvido com foco em **Composição**, um dos pilares da Orientação a Objetos. A relação entre as classes segue o princípio de "tem um":

Order ──tem vários──► OrderItem

### Demais conceitos
- 📌 **Enums** — `OrderStatus` controla o status do pedido (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`)
- 📦 **Coleções** — `List<OrderItem>` armazena dinamicamente os itens do pedido
- 💻 **Terminal** — toda interação com o usuário é feita via `Scanner`, sem interface gráfica
- 📅 **SimpleDateFormat** — formatação e leitura de datas no padrão `DD/MM/YYYY`

---
## 📁 Estrutura do projeto

```
src/
│
├── Main.java
│
└── entities/
    │
    ├── Client.java
    │
    ├── Order.java
    │
    ├── OrderItem.java
    │
    └── enums/
        │
        └── OrderStatus.java
```

## 🛠️ Tecnologias

![Java](https://img.shields.io/badge/Java-21-orange) ![IntelliJ](https://img.shields.io/badge/IntelliJ-IDEA-blue)
