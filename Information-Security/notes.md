# Segurança da Informação

- Glossário
  - Botnet
  - DDoS: Distributed Denial of Service,
  - IETF: Internet Engineering Task Force
  - BGPR
  - CVE: Common Vulnerabilities and Exposures
  - CWE: Common Weakness Enumeration
  - Zero-day vulnerability
  - Bug bounty
  - Secutiry by Design
  - WannaCry
  - Cibersegurança
 
- Links de apoio
  - https://www.shodan.io/
  - https://www.cisa.gov/news-events/cybersecurity-advisories
 
- Indicações de filme
  - O Jogo da Imitação
  - Caçada Virtual (Kevin Mitnick)

- Vulnerabilidade, ataques e ameaças

- Propriedades básicas de segurança:
  - Confidencialidade: garantida durante a transmissão, processamento e armazenamento da informações por meio de criptografia e controle de acesso
    - Privacidade x Confidencialidade
  - Integridade: somente partes autorizadas podem alterar a informação; verificada por meio de mecanismos como checksum e assinaturas digitais
  - Disponibilidade: informação deve estar disponível quando necessário; garantir por meio de redundância, gerador de energia e backup

- Classificação de ataques
  - Interceptação
  - Modificação
  - Interrupção
 
- Incidades de Segurança
  - Vazamento de dados: incidente de segurança que compromete a confidencialidade
  - Perda de dados: incidente de segurança que compromete a integridade
  - Indisponibilidade: incidente de segurança que compromete a disponibilidade

- Criptografia Clássica
  - Criptosistema
    - Mé o conjunto de mensagens em texto claro
    - K é o conjunto de chaves
    - C é o conjunto de mensagens cifradas
    - E é o algoritmo para cifrar: C=E(M,K)
    - D é o algoritmo para decifrar M=D(C,K)
  - Criptoanálise: técnicas para quebrar criptosistemas com o objetivo de recuperar a mensagem original
    - Atauqe com o texto cifrado: adverário possui o texto cifrado e através dele tenta obter o texto em claro
    - Araque com o texto em claro: adversário possui o texto cifrado e o texto em claro tedo o objetivo de descobrir a chave
  - Criptografia clássica
    - Cifra de Substituição: Os símbolos do texto claro são substituídos por símbolos; Podem ser monoalfabéticas ou polialfabéticas
      - César: Utilizado por Júlio César na Roma antiga; Usa um alfabeto deslocado de n posições para cifrar o texto claro
      - Vigenère: Usa uma pavra-chave para cifrar o texto em claro; Cifragem feito letra a letra
      - Enigma: Máquina eletromecânica com rotores que faz uso de cifra polialfabética
    - Cifra de Transposição: Os símbolos do texto claro são rearranjados (permutados)
      - Rail Fence: O texto em claro é escrito em uma diagonal vertical em trilhos alternados; Texto cifrado é obtido lendo-se as linhas individuais e concatenando-as
     
- Criptografia Moderna
  - Criptosistema simétrico: AES, DES, 3DES
  - Criptosistema assimétrico: RSA, ElGamal, ECC
    - Curva Elíptica Criptográfica (ECC) x RSA
      - RSA: baseia-se na dificuldade de fatorar o produto de dois números primeiros grandes (n = p x q)
      - ECC: baseia-se na dificuldade de resolver o problema do logaritmo discreto entre pontos em uma curva elíptica
      - ECC é mais eficiente que RSA
