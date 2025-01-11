# Hibernate_Mapping

## Introduction

This repository showcases various examples of Hibernate mappings, demonstrating how different types of relationships between entities can be implemented using Hibernate ORM. Hibernate mappings are crucial for defining how Java objects correspond to database tables and their relationships.

The examples include:

- **One-to-One Mapping**
- **One-to-Many Mapping**
- **Many-to-Many Mapping**

## Understanding Hibernate Mappings

### One-to-One Mapping

In a one-to-one relationship, each entity in the relationship has a unique association with another entity. For example, a `User` entity may have a one-to-one relationship with a `Profile` entity.

- **Implementation**: Using `@OneToOne` annotation.
- **Use Case**: Ideal for scenarios where one entity is tightly coupled with another entity.

### One-to-Many Mapping

A one-to-many relationship exists when a single entity is related to multiple instances of another entity. For example, a `Department` can have many `Employees`.

- **Implementation**: Using `@OneToMany` and `@ManyToOne` annotations.
- **Use Case**: Suitable for scenarios like a parent-child relationship.

### Many-to-Many Mapping

In a many-to-many relationship, multiple entities can be associated with multiple instances of another entity. For example, a `Student` can enroll in multiple `Courses`, and each `Course` can have multiple `Students`.

- **Implementation**: Using `@ManyToMany` annotation and a join table.
- **Use Case**: Common in scenarios like tagging systems or product-category relationships.

## Project Structure

- **Hibernate_OneToOne**: Example illustrating a one-to-one relationship between two entities.
- **Hibernate_OneToMany**: Example demonstrating a one-to-many relationship.
- **Hibernate_ManyToMany**: Example showcasing a many-to-many relationship between entities.

