# DrawScript

---
### Autores:

- Gabriela Lacouture, nº 99447
- Diogo Carvalho, nº 98358

### Diagrama de classes


---
## Estrutura do ficheiro

> O script é dividido em 3 secções obrigatórias separadas por 3 hifens `---`. 
> - Na primeira secção serão declaradas todas as constantes, obrigatóriamente em letras maiúsculas, seguido de dois pontos 
> e o seu respetivo valor (Literal ou Color) `WHITE: |255|`, `SIDE: 40`.
> - Na segunda secção há a opção de determinar as propriedades iniciais da figura: **background**, **dimension** e **origin**; 
> que representam a cor de fundo, dimensão da figura e origem em relação à janela, respetivamente. (É possível determinar propriedades
> utilizando expressões aritméticas e constantes.)
> - Por último, na terceira secção, é possível utilizar as instruções abaixo definidas, pintar figuras e fazer expressões aritméticas
> com o auxílio de constantes e variáveis.
> 
 #### Script exemplo
```N: 8
SIDE: 40
MARGIN: 5
BLACK: |0|
WHITE: |255|
GRAY: |128|
---
dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2
backgroud: GRAY
---
for l in [0,N[ {
  for c in [0,N[ {
    if (l + c) % 2 = 0 {
      fill WHITE
    } else {
      fill BLACK
    }
    square (c * SIDE + MARGIN,l * SIDE + MARGIN) SIDE
  }
}

 ```


### Tipos de dados
| Tipo      | Notação                                                                    |
|-----------|----------------------------------------------------------------------------|
| Literal   | 0, 1, 2, 3, ...  (números naturais)                                        |
| Point2D   | (5, 10)                                                                    |
| Dimension | 500 ~ 500                                                                  |
| Interval  | [0, 10[<br/> [50, 60]                                                      |
| Color     | 255&#124;0&#124;0 <br/>&#124;120&#124; = 120&#124;120&#124;120  (cinzento) |
| Bool      | i + 1 = 30                                                                 |

### Operadores
| Operador |
|----------|
| +        |
| -        |
| /        |
| *        |
| %        |

### Instruções
| Nome     | Argumentos                                         | Exemplo                                                                                                                                   | Explicação                        |
|----------|----------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------|
| fill     | - Color ou Constante                               | `fill 250`&#124;`130`&#124;`60` ou `fill GRAY`                                                                                            | Determina a cor da próxima figura |                                                                                              
| border   | - Figura                                           | `border square (15, 30) SIDE`                                                                                                             | Desenha apenas a borda da figura  |
| for-loop | - variável com o nome em minúsculo<br/> - Interval | `for i in [0, 10[ {`<br/> `fill BLACK`<br/>`...`<br/>`}`                                                                                  | for-loop comum                    |
| if-else  | - Bool                                             | `if i % 2 = 0 {`<br/> `fill WHITE`<br/> `}`  <br/>ou<br/>  `if i % 2 = 0 {`<br/> `fill WHITE`<br/> `} else {` <br/> `fill BLACK`<br/> `}` | if-else comum                     |

### Figuras
| Nome      | Argumentos                                           | Exemplo                 |
|-----------|------------------------------------------------------|-------------------------|
| square    | - ponto de origem<br/>- largura                      | square (10, 10) 40      |
| rectangle | - ponto de origem<br/>- Dimension (largura e altura) | rectangle (0,0) 30 ~ 20 |
| line      | - pontos de origem e de destino                      | line (0,0) (0, 10)      |
| circle    | - ponto de origem<br/>- raio                         | circle (10, 30) 20      |
| elipse    | - ponto de origem<br/>- Dimension (largura e altura) | elipse (25, 17) 5 ~ 9   |