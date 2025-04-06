# 📘 Explicação dos Padrões

**Uso do Strategy:**  
Utilizei o padrão **Strategy** para definir diferentes versões do cálculo de frete, dependendo da **modalidade de entrega** escolhida. Isso facilita o controle de qual lógica aplicar para cada tipo de frete, tornando o sistema mais flexível e escalável.

Para isso, criei uma interface chamada `FreteStrategy`, que define dois métodos: `calcular()` e `modalidade()`. Sempre que crio uma nova modalidade de entrega, basta criar uma classe que **implemente essa interface**, garantindo que ela siga o mesmo padrão de comportamento.

Dessa forma, posso adicionar novas modalidades sem alterar o código existente — basta criar uma nova classe com sua própria lógica de cálculo.

---

**Uso do Adapter:**  
Já para o padrão **Adapter**, criei uma classe chamada `EntregaExterna`, que representa uma transportadora com um padrão diferente do utilizado no meu sistema — e que não pode ser alterado. Para integrá-la corretamente, criei a classe `EntregaAdapter`.

Nesse adaptador, implementei a interface `FreteStrategy`, assim como nas outras estratégias, adaptando os métodos da `EntregaExterna` para o formato esperado pelo sistema.  
Com isso, consigo utilizar essa transportadora externa como se fosse qualquer outra modalidade de entrega interna, mantendo a **coerência e reutilização** do código.