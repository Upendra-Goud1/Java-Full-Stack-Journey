# Day 22 — Has-A Relationship and Wrapper Classes

## 1) Has-A Relationship

Theory:

- > Has-A relationship means one class having a field which is an object of another class
- > Also called Object Composition
## There are 2 types:
## 1) Aggregation
## 2) Composition

## Types of Has-A Relationship

## i) Aggregation — Loosely Coupled
- > When a parent class and child class are very loosely coupled
- > Parent class makes sense without that child class also
- > Child can exist independently of the parent

## Example — Car has Music Player and AC:

- > Without Music Player → Car will still run ✅
- > Without AC → Car will still run ✅
- > So this is loosely coupled = Aggregation

## ii) Composition — Tightly Coupled

- > When a parent class and child class are very tightly coupled
- > Parent class does NOT make sense without that child class
- > Child cannot exist independently — it's part of the parent

## Example — Car has Engine and Steering:

- > Without Engine → Car will NOT run ❌
- > Without Steering → Car will NOT run ❌
- > So this is tightly coupled = Composition
- > Aggregation vs Composition
- > Feature	Aggregation	Composition
- > Coupling	Loosely coupled	Tightly coupled
- > Parent without child	Makes sense ✅	Does NOT make sense ❌
- > Child exists independently?	YES	NO

- > Example	Car has Music Player, AC	Car has Engine, Steering
- > Real-life	Department has Professor	Human has Heart
- > Has-A Relationship Code — POJO Example

What is POJO? Plain Old Java Object — a simple class with private fields, getters, setters, and constructors. No special restrictions.