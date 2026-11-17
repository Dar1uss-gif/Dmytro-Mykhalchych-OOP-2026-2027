package com.app;

interface SomeOne {
	void Change(String val);
}

class Person implements SomeOne { // Вказали реалізацію
 
	String name;
	float happiness;
	int age;
 
	Person(String name, float happiness, int age) {
		this.name = name;
		this.happiness = happiness;
		this.age = age;
	}

	// Обов'язково повинні реалізувати всі методи з інтерфейсу
	// Для реалізації прописуємо слово @Override
	@Override
	public void Change (String val) {
		// Функціонал може бути будь-яким, але повинен відповідати описаному методу
		// Наприклад, ця функція нічого не повинна повертати, оскільки тип даних у неї void
		this.name = val;
		System.out.print("Тепер людину звуть - " + val);
	}
}