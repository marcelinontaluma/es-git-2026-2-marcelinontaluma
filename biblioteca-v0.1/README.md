# Atividade prática — Princípios de projeto

Ponto de partida: versão **v0.1**, que distribui as responsabilidades entre `Main`, `Menu`, `Biblioteca`, `Livro`, `Usuario` (com as subclasses `Aluno`, `Professor` e `Comunidade`) e `Emprestimo`.

**Regra geral:** a cada exercício, compile, rode a verificação, faça um commit e troque o driver.

**Entrega:** o link do repositório com o código final.

## 04/11/2026

## Exercício 0 — Preparação e caracterização

1. Crie um novo repositório no GitHub para esta atividade e clone-o na máquina.
2. Copie para a pasta `src/` do repositório todos os arquivos de `codigo-base/v0.1/src`.
3. Copie `codigo-base/exercicios/cap5/entrada.txt` para a raiz do repositório. Ele contém um roteiro fixo de 22 operações: listagens, empréstimos, devoluções, erros de ID e o relatório de multas.
4. Na raiz do repositório, compile e rode o roteiro, guardando a saída:

   ```powershell
   $arquivosJava = @((Get-ChildItem src -Filter *.java).FullName)
   javac -encoding UTF-8 -d out $arquivosJava
   Get-Content entrada.txt | java -cp out Main > saida-antes.txt
   ```

5. Abra `saida-antes.txt` e confira se ela contém `Devolucao realizada. Multa: R$ 3.0`, `Devolucao realizada. Multa: R$ -4.0` e `Total de multas arrecadadas: R$ -1.0`.
6. Faça o primeiro commit (sem a pasta `out/`): `git add src entrada.txt saida-antes.txt` e `git commit -m "Ponto de partida v0.1"`.
**Como verificar cada exercício:** depois de cada mudança, compile e rode de novo, gerando `saida-depois.txt`, e compare:

```powershell
$arquivosJava = @((Get-ChildItem src -Filter *.java).FullName)
javac -encoding UTF-8 -d out $arquivosJava
Get-Content entrada.txt | java -cp out Main > saida-depois.txt
Compare-Object (Get-Content saida-antes.txt) (Get-Content saida-depois.txt)
```

Se `Compare-Object` não imprimir nada, as saídas são idênticas.