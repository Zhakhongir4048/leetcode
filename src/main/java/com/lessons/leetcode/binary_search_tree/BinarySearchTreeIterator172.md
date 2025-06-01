### Решение. 1 подход

## 📚 Цель
Класс BSTIterator позволяет пошагово обходить бинарное дерево поиска (BST) в порядке возрастания, то есть в in-order traversal:
лево → корень → право

### 🔹 Конструктор BSTIterator(TreeNode root)
```
stack = new ArrayDeque<>();
addLeftChilds(root);
```
Что делает?
1. Инициализирует стек.
2. Кладёт в стек всех левых потомков, начиная с корня: на вершине стека будет наименьший элемент (левый край дерева).
3. Почему? при in-order обходе первым должен обрабатываться самый левый элемент.

### Пример работы:
```
addLeftChilds(7):
→ push 7
→ move to 3
→ push 3
→ move to null → выход

→ стек: [7, 3] (верх — 3)
```

### 🔹 Метод addLeftChilds(TreeNode node)
```
while (node != null) {
    stack.push(node);
    node = node.left;
}
```
Что делает?
Это ключевая часть: она идёт по левым потомкам дерева, начиная с node, и кладёт каждый узел в стек.
Это нужно, чтобы на вершине стека всегда находился следующий элемент в in-order обходе.

Когда вызывается?
1) в конструкторе — для начальной инициализации;

2) после обработки очередного узла, если у него есть правый потомок:
in-order: обработали корень → идём в правое поддерево.

### 🔹 Метод next()
```
TreeNode current = stack.pop();       // берём следующий элемент
addLeftChilds(current.right);         // идём в его правое поддерево
return current.val;                   // возвращаем его значение
```

Разбор:

1) Берём верхушку стека → это наименьший ещё не обработанный элемент.
2) Затем:
если у него есть правый ребёнок, мы не идём туда сразу.
мы спускаемся по всем левым от current.right, кладя их в стек.
3) Возвращаем значение current.val.

Таким образом, стек всегда содержит путь к следующему элементу in-order

### 🔹 Метод hasNext()
```
return !stack.isEmpty();
```
Проверка:

Есть ли ещё элементы?
Если стек не пуст, то значит, следующий элемент уже готов.

### Пример работы:

```
     7
    / \
   3   15
      /  \
     9    20
```

| Операция    | Стек (верх справа) | Вывод | Пояснение                                            |
|-------------|--------------------|-------|------------------------------------------------------|
| start       | \[7, 3]            |       | после конструктора                                   |
| `next()`    | \[7]               | 3     | pop(3), 3 не имеет правого поддерева                 |
| `next()`    | \[15, 9]           | 7     | pop(7), вызываем `addLeftChilds(15)` → стек += 15, 9 |
| `next()`    | \[15]              | 9     | pop(9), нет правого поддерева                        |
| `next()`    | \[20]              | 15    | pop(15), вызываем `addLeftChilds(20)`                |
| `next()`    | \[]                | 20    | pop(20), нет правого                                 |
| `hasNext()` | \[]                | false | стек пуст                                            |

### Решение
## Java
```
class BSTIterator {

    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        addLeftChilds(root);
    }

    public int next() {
        TreeNode current = stack.pop();
        addLeftChilds(current.right);
        return current.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void addLeftChilds(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
```

## Kotlin
```
import java.util.ArrayDeque

class BSTIterator(root: TreeNode?) {

    private val stack = ArrayDeque<TreeNode>()

    init {
        addLeftChildren(root)
    }

    fun next(): Int {
        val current = stack.pop()
        addLeftChildren(current.right)
        return current.`val`
    }

    fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    private fun addLeftChildren(node: TreeNode?) {
        var curr = node
        while (curr != null) {
            stack.push(curr)
            curr = curr.left
        }
    }
}
```