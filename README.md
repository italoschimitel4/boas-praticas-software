# Refatoração e Boas Práticas

## 1. Qual era o principal problema do código original?
O código original carecia de legibilidade e coesão. As variáveis tinham nomes sem significado (n, a, b, c), dificultando o entendimento do que representavam. Além disso, toda a lógica (cálculo, verificação e impressão) estava concentrada em um único método (main), ferindo o princípio de responsabilidade única e tornando a manutenção difícil.

## 2. Quais melhorias você realizou?
- **Renomeação:** Substituí variáveis genéricas por nomes autoexplicativos (ex: `n` para `nomeAluno`, `c` para `mediaFinal`).
- **Modularização:** Extraí blocos lógicos para métodos específicos (`calcularMedia`, `verificarSituacao`, `apresentarResultados`).
- **Padronização:** Apliquei o padrão camelCase para variáveis/métodos, PascalCase para a classe, e corrigi a indentação para refletir a hierarquia do código.

## 3. Como a modularização facilitou a organização do código?
Ao separar o programa em métodos com responsabilidades únicas, o método `main` passou a funcionar apenas como um orquestrador, lendo-se como um passo a passo. Isso facilita a localização de bugs, permite o reaproveitamento de código e torna a leitura mais fluida, sem precisar comentar linha por linha.

## 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu criar uma branch isolada (`melhoria-boas-praticas`) para reescrever o código com segurança, sem quebrar ou alterar a versão original (`main`). Ele manteve o histórico exato de como o código era antes e, através do Pull Request, possibilitou uma revisão estruturada das melhorias antes de integrá-las à linha principal.
