# Java Client Management System 📊

## Overview
This comprehensive Java program manages client information, offering features to register clients, list their details, calculate credit limits based on monthly income, and handle product-related functionalities.

## Classes
- **Cliente (Client):**
  - Attributes: `id`, `Nome` (Name), `Endereco` (Address), `Email`, `RendaMensal` (Monthly Income), `LimiteCredito` (Credit Limit).
  - Methods: `CadastrarCliente` (Register Client), `ListarCliente` (List Client), `CalcularLimite` (Calculate Credit Limit).

- **Produto (Product):**
  - Attributes: `Id`, `Descricao` (Description), `EstoqueDisponivel` (Available Stock), `PrecoUnitario` (Unit Price).
  - Methods: `CadastrarProduto` (Register Product), `ListarProduto` (List Product), `Pedido` (Order Product), `Vender` (Sell Product).

- **Principal (Main):**
  - The main class interacts with both the `Cliente` and `Produto` classes, providing options to manage clients and products effectively.

## Usage 🚀
1. Run the program.
2. Choose an option from the menu:
   - 📝 **1:** Register a new client.
   - 📋 **2:** List client details.
   - 💳 **3:** Calculate credit limit based on monthly income.
   - 📦 **4:** Register a new product.
   - 📜 **5:** List product details.
   - 🛒 **6:** Place an order and sell a product.
   - 🚪 **0:** Exit the program.

Feel free to explore and enhance the functionality of this client management system with integrated product features. Contributions are welcome!

## Author 👨‍💻
- [CarlosEduardoBr04](https://github.com/CarlosEduardoBr04) 🚀
