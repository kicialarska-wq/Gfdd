"""
Zagadka o przeprawie przez rzekę (River Crossing Puzzle)

Rolnik, owca, wilk i siano muszą przeprawić się na drugi brzeg rzeki.
Zasady:
- Łódka mieści rolnika + 1 pasażera/przedmiot
- Wilk nie może zostać sam z owcą (zje ją)
- Owca nie może zostać sama z sianem (zje je)
"""

from collections import deque


LEFT = "lewy brzeg"
RIGHT = "prawy brzeg"

ENTITIES = ("rolnik", "wilk", "owca", "siano")

FORBIDDEN_PAIRS = [
    frozenset({"wilk", "owca"}),
    frozenset({"owca", "siano"}),
]


def is_safe(side: frozenset[str]) -> bool:
    if "rolnik" in side:
        return True
    for pair in FORBIDDEN_PAIRS:
        if pair.issubset(side):
            return False
    return True


def solve():
    start = (frozenset(ENTITIES), frozenset())  # (left, right)
    goal_right = frozenset(ENTITIES)
    queue = deque([(start, [])])
    visited = set()
    visited.add(start)

    while queue:
        (left, right), moves = queue.popleft()

        if right == goal_right:
            return moves

        farmer_side, other_side = (left, right) if "rolnik" in left else (right, left)
        direction = "→" if "rolnik" in left else "←"

        passengers = [None] + [e for e in farmer_side if e != "rolnik"]

        for passenger in passengers:
            new_farmer = farmer_side - {"rolnik"}
            new_other = other_side | {"rolnik"}

            if passenger:
                new_farmer = new_farmer - {passenger}
                new_other = new_other | {passenger}

            if "rolnik" in left:
                new_state = (frozenset(new_farmer), frozenset(new_other))
            else:
                new_state = (frozenset(new_other), frozenset(new_farmer))

            if new_state in visited:
                continue

            if not is_safe(new_state[0]) or not is_safe(new_state[1]):
                continue

            if passenger:
                desc = f"Rolnik zabiera: {passenger} {direction}"
            else:
                desc = f"Rolnik płynie sam {direction}"

            visited.add(new_state)
            queue.append((new_state, moves + [(desc, new_state)]))

    return None


def format_state(left, right):
    l = sorted(left) if left else ["(pusto)"]
    r = sorted(right) if right else ["(pusto)"]
    return f"  {LEFT}: {', '.join(l)}  |  {RIGHT}: {', '.join(r)}"


def main():
    print("=" * 55)
    print("  ZAGADKA: Przeprawa przez rzekę")
    print("=" * 55)
    print()
    print("Rolnik, owca, wilk i siano chcą przeprawić się")
    print("na drugi brzeg rzeki.")
    print("Łódka mieści rolnika + 1 pasażera.")
    print("Wilk nie może zostać sam z owcą.")
    print("Owca nie może zostać sama z sianem.")
    print()

    solution = solve()

    if not solution:
        print("Brak rozwiązania!")
        return

    print(f"Rozwiązanie w {len(solution)} krokach:")
    print("-" * 55)

    start_left = frozenset(ENTITIES)
    print(f"  Start:")
    print(format_state(start_left, frozenset()))
    print()

    for i, (desc, (left, right)) in enumerate(solution, 1):
        print(f"  Krok {i}: {desc}")
        print(format_state(left, right))
        print()

    print("=" * 55)
    print("  Wszyscy bezpiecznie na drugim brzegu! Smacznego!")
    print("=" * 55)


if __name__ == "__main__":
    main()
