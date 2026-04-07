# Radiany i ruch po okręgu

## 1. Po co nam radiany?

Znasz już stopnie — pełny obrót to 360°, kąt prosty to 90°. Ale skąd wzięło się akurat 360? To umowna liczba, wymyślona tysiące lat temu przez Babilończyków (lubili liczbę 360, bo ma dużo dzielników).

Radiany to inna jednostka mierzenia kątów. Nie jest wymyślona umownie — wynika wprost z geometrii koła. Dzięki temu wzory w fizyce i matematyce stają się prostsze i bardziej naturalne.

---

## 2. Czym jest radian?

Wyobraź sobie koło o promieniu **r**. Teraz weź sznurek o długości dokładnie równej promieniowi i przyłóż go do okręgu (do jego krawędzi). Sznurek wyznaczy pewien łuk na okręgu.

**Kąt środkowy, który odpowiada temu łukowi, to dokładnie 1 radian.**

Innymi słowy: jeśli długość łuku jest równa promieniowi, to kąt wynosi 1 radian.

Ogólny wzór:

```
        długość łuku       s
kąt = ────────────── = ─────
         promień           r
```

albo krócej:

> **α = s / r**

gdzie:
- **α** (alfa) — kąt w radianach
- **s** — długość łuku
- **r** — promień koła

Zauważ, że radian jest **bezwymiarowy** — to stosunek dwóch długości (centymetry dzielone przez centymetry dają "nic"), dlatego czasem przy radianach nie piszemy jednostki, albo piszemy "rad".

---

## 3. Ile radianów ma pełny okrąg?

Skoro znasz wzór na obwód koła:

> Obwód = 2πr

to pełen obrót (cały okrąg) w radianach wynosi:

```
α = s / r = 2πr / r = 2π
```

**Pełny obrót = 2π radianów** (czyli około 6,28 rad)

Stąd łatwo wyliczyć inne ważne kąty:

| Stopnie | Radiany | Jak to wyliczyć |
|---------|---------|-----------------|
| 360°    | 2π rad  | pełny obrót |
| 180°    | π rad   | 2π / 2 = π |
| 90°     | π/2 rad | 2π / 4 = π/2 |
| 60°     | π/3 rad | 2π / 6 = π/3 |
| 45°     | π/4 rad | 2π / 8 = π/4 |
| 30°     | π/6 rad | 2π / 12 = π/6 |

Warto zapamiętać przynajmniej: **π rad = 180°**. Z tego da się wyliczyć wszystko inne.

---

## 4. Przeliczanie stopni na radiany (i odwrotnie)

### Stopnie na radiany

Skoro 180° = π rad, to:

> **radiany = stopnie × (π / 180)**

### Radiany na stopnie

> **stopnie = radiany × (180 / π)**

### Przykład 1: Zamień 120° na radiany

```
α = 120 × (π / 180) = 120π / 180 = 2π/3 rad
```

Odpowiedź: **120° = 2π/3 rad** (czyli ok. 2,09 rad)

### Przykład 2: Zamień 3π/4 rad na stopnie

```
stopnie = (3π/4) × (180/π) = 3 × 180 / 4 = 540 / 4 = 135°
```

Odpowiedź: **3π/4 rad = 135°**

### Przykład 3: Zamień 1 radian na stopnie

```
stopnie = 1 × (180/π) = 180/π ≈ 57,3°
```

Odpowiedź: **1 rad ≈ 57,3°** — to przydatna wartość do zapamiętania.

---

## 5. Długość łuku

Ze wzoru α = s/r wynika, że:

> **s = α × r**

Jeśli znasz kąt w radianach i promień — od razu masz długość łuku. Bez żadnych dodatkowych przeliczeń. To właśnie dlatego radiany są takie wygodne!

### Przykład

Koło ma promień r = 10 cm. Jaka jest długość łuku odpowiadającego kątowi 3π/4 rad?

```
s = α × r = (3π/4) × 10 = 30π/4 = 7,5π ≈ 23,6 cm
```

---

## 6. Ruch po okręgu — prędkość kątowa

Wyobraź sobie wskazówkę zegara, karuzelę albo koło rowerowe. Każdy punkt na takim obracającym się obiekcie porusza się po okręgu.

### Czym jest prędkość kątowa?

**Prędkość kątowa** (oznaczana grecką literą **ω** — "omega") mówi, o jaki kąt (w radianach) obraca się obiekt w ciągu sekundy.

> **ω = Δα / Δt**

gdzie:
- **ω** — prędkość kątowa [rad/s]
- **Δα** — zmiana kąta [rad]
- **Δt** — czas [s]

### Pełny obrót

Jeśli obiekt robi pełen obrót (2π rad) w czasie **T** (okres), to:

> **ω = 2π / T**

### Przykład: Wskazówka minutowa zegara

Wskazówka minutowa robi pełen obrót w 60 minut = 3600 s.

```
ω = 2π / 3600 ≈ 0,00175 rad/s
```

To mała wartość — wskazówka obraca się powoli.

### Przykład: Koło rowerowe

Koło rowerowe obraca się 2 razy na sekundę (2 obroty/s).

```
ω = 2 × 2π = 4π ≈ 12,57 rad/s
```

---

## 7. Prędkość liniowa a prędkość kątowa

Punkt na obracającym się kole porusza się po okręgu. Ma zarówno prędkość kątową ω, jak i zwykłą (liniową) prędkość v.

Związek między nimi:

> **v = ω × r**

Im dalej od środka obrotu, tym szybciej porusza się punkt (choć prędkość kątowa jest taka sama dla całego koła).

### Przykład: Karuzela

Karuzela ma promień 4 m i robi pełen obrót w 8 sekund.

Prędkość kątowa:
```
ω = 2π / T = 2π / 8 = π/4 ≈ 0,785 rad/s
```

Prędkość liniowa dziecka siedzącego na brzegu:
```
v = ω × r = (π/4) × 4 = π ≈ 3,14 m/s
```

Dziecko siedzące 2 m od środka:
```
v = (π/4) × 2 = π/2 ≈ 1,57 m/s
```

Widzisz? Ta sama prędkość kątowa, ale dziecko na brzegu jedzie dwa razy szybciej!

---

## 8. Ćwiczenia

### Zadanie 1: Przeliczanie na radiany

Zamień na radiany: a) 150°, b) 270°, c) 45°

<details>
<summary>Rozwiązanie</summary>

a) 150° = 150 × (π/180) = 150π/180 = **5π/6 rad**

b) 270° = 270 × (π/180) = 270π/180 = **3π/2 rad**

c) 45° = 45 × (π/180) = 45π/180 = **π/4 rad**

</details>

---

### Zadanie 2: Przeliczanie na stopnie

Zamień na stopnie: a) 2π/3 rad, b) 5π/4 rad, c) π/6 rad

<details>
<summary>Rozwiązanie</summary>

a) 2π/3 × (180/π) = 2 × 180/3 = **120°**

b) 5π/4 × (180/π) = 5 × 180/4 = **225°**

c) π/6 × (180/π) = 180/6 = **30°**

</details>

---

### Zadanie 3: Długość łuku

Koło ma promień 6 cm. Oblicz długość łuku dla kąta: a) π/3 rad, b) 2 rad

<details>
<summary>Rozwiązanie</summary>

Wzór: s = α × r

a) s = (π/3) × 6 = 2π ≈ **6,28 cm**

b) s = 2 × 6 = **12 cm**

</details>

---

### Zadanie 4: Prędkość kątowa

Wiatrak robi 5 obrotów na sekundę. Ile wynosi jego prędkość kątowa?

<details>
<summary>Rozwiązanie</summary>

Jeden obrót = 2π rad

ω = 5 × 2π = 10π ≈ **31,42 rad/s**

</details>

---

### Zadanie 5: Koło rowerowe

Koło rowerowe ma promień 35 cm (0,35 m). Rowerzysta jedzie z prędkością 7 m/s. Oblicz:
a) prędkość kątową koła,
b) ile pełnych obrotów koło robi w ciągu 10 sekund.

<details>
<summary>Rozwiązanie</summary>

a) Ze wzoru v = ω × r:

ω = v / r = 7 / 0,35 = **20 rad/s**

b) W 10 sekundach koło obraca się o kąt:

Δα = ω × Δt = 20 × 10 = 200 rad

Jeden obrót = 2π ≈ 6,28 rad

Liczba obrotów = 200 / (2π) = 200 / 6,28 ≈ **31,8 obrotów**, czyli **31 pełnych obrotów**

</details>

---

### Zadanie 6: Karuzela

Dziecko siedzi na karuzeli w odległości 3 m od środka. Karuzela robi pełen obrót w 6 sekund. Oblicz:
a) prędkość kątową,
b) prędkość liniową dziecka,
c) jaką drogę (łuk) przebywa dziecko w ciągu 15 sekund.

<details>
<summary>Rozwiązanie</summary>

a) ω = 2π / T = 2π / 6 = **π/3 ≈ 1,05 rad/s**

b) v = ω × r = (π/3) × 3 = **π ≈ 3,14 m/s**

c) Kąt obrotu w 15 s:

Δα = ω × Δt = (π/3) × 15 = 5π rad

Droga (łuk):

s = Δα × r = 5π × 3 = 15π ≈ **47,1 m**

Albo prościej: s = v × t = 3,14 × 15 ≈ **47,1 m**

</details>

---

## 9. Podsumowanie — ściągawka

### Kluczowe wzory

| Wzór | Co oblicza |
|------|-----------|
| α = s / r | kąt w radianach |
| s = α × r | długość łuku |
| ω = 2π / T | prędkość kątowa (z okresu) |
| ω = Δα / Δt | prędkość kątowa (ogólnie) |
| v = ω × r | prędkość liniowa z kątowej |

### Kluczowe wartości

| Stopnie | Radiany |
|---------|---------|
| 360° | 2π ≈ 6,28 |
| 180° | π ≈ 3,14 |
| 90° | π/2 ≈ 1,57 |
| 60° | π/3 ≈ 1,05 |
| 45° | π/4 ≈ 0,79 |
| 30° | π/6 ≈ 0,52 |
| **1 rad** | **≈ 57,3°** |

### Jak przeliczać

- Stopnie na radiany: **pomnóż przez π/180**
- Radiany na stopnie: **pomnóż przez 180/π**
