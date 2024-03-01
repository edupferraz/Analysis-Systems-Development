# Imagens e Links

- Elementos Genéricos: ```<span>``` e ```<div>```

- Atributos de Identificação: ajudam a identificar os elemtnos da página para alterr o seu comportamento e ajudam a atribuir semântica aos elementos
  - id: atribui um identificador único ao elemento; Não pode haver/ser espaços vazio
  - class: classifica elementos em grupos conceituais; Usado por mais de um elemento
 
- Inserindo Links:
  - ```<a>```:
    - O conteúdo é a parte vísivel do link
    - Qualquer elementos pode ser um link
    - Por padrão é por linha
    - Necessário o atributo href=""
      - Caminhos Relativos: ../index.html
      - Caminhos Absolutos: /recipes/index.html
  - Identificar o destino interno(com o atributo id="...") e gerar o link para o destino utilizando o # antes do id
    - Para utilizar para externo é só colocar o target="..."
    - target="_blank" - Cria uma nova janela ou aba
    - target="blank" - Cria uma nova janela e qualquer outra irá abrir nessa aba
    - target="_parent" - Abre no quadro pai

  - Inserindo Imagens:
    - Imagens podem aparecer como elemento em linha ou como imagem de fundo
    - Principais formatos: PNG, JPG, GIF e SVG
    - Imagens vetorais podem precisar serem colocados na
    - ```<img>```: ```<img src="images/arrow.gif" alt="seta apontando pra cima">```
      - Elemento vazio e de substituição
      - Atributos obrigatórios src e alt
        - src="..." - Fornece a localização do arquivo de imagem (URL)
        - alt="..." - Texto alternativo a sua imagem
    
      
