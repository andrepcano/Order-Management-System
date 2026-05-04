Order Management System
Sistema de gerenciamento de pedidos desenvolvido em Java, rodando diretamente no terminal.
Sobre o projeto
O sistema permite cadastrar um cliente, criar um pedido com múltiplos itens e calcular o valor total automaticamente, exibindo um resumo completo ao final.
Como executar

Clone o repositório
Abra o projeto no IntelliJ IDEA
Execute o arquivo Main.java
Siga as instruções no terminal

Conceitos aplicados
O projeto foi desenvolvido com foco em Composição, um dos pilares da Orientação a Objetos. A relação entre as classes segue o princípio de "tem um" — um Order tem um Client, e um Order tem vários OrderItem. Cada classe é responsável pela sua própria lógica, tornando o código organizado e fácil de manter.
Além da composição, foram aplicados os seguintes conceitos:

Enums — OrderStatus controla o status do pedido com valores fixos como PENDING_PAYMENT, PROCESSING, SHIPPED e DELIVERED
Coleções — List<OrderItem> armazena dinamicamente os itens do pedido
Scanner — toda a interação com o usuário é feita via terminal, sem interface gráfica
SimpleDateFormat — formatação e leitura de datas no padrão DD/MM/YYYY

Estrutura do projeto
src/
├── Main.java
└── entities/
    ├── Client.java
    ├── Order.java
    ├── OrderItem.java
    └── enums/
        └── OrderStatus.java
Tecnologias

Java 21
IntelliJ IDEA
