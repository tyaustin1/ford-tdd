# An Exercise in Test Driven Development (TDD)!

You are a software engineer working on a new ride sharing application! The application contains an empty `Vehicle` class that will manage all its riders.

The `Vehicle` class contains an empty primitive array of Strings (`passengers`), but it requires methods in order for it to work! That's where you come in!
Your job will be to implement the basic functionality for this class through TDD.

## What exactly is TDD?

Test-Driven Development (TDD) is a software development approach where you write a failing automated test for a small piece of functionality before you write the actual code that implements that functionality. This process helps ensure that your code is well-designed, robust, and correctly solves the problem it's intended for.

### The "Red, Green, Refactor" Cycle

We will implement TDD through a development cycle known as "Red, Green, Refactor".

1.  **Red:** First, write a small, focused test that defines a new piece of functionality and immediately fails because the code doesn't exist yet.
2.  **Green:** Next, write the simplest possible code to make that failing test pass, without worrying too much about perfect design.
3.  **Refactor:** Finally, improve the design of your code, removing duplication and clarifying structure, while continuously running all tests to ensure no existing functionality breaks.

By taking small, incremental steps in creating tests and adding functionality, we ensure we maintain the integrity of our code as it grows bigger. Our unit tests act as a safety harness; by running them after every change, we ensure we do not break existing functionality.

## Rules & Requirements

*   `Vehicle` class must utilize the primitive array of strings to store passengers (no Sets, Lists, Dictionaries, etc.).
*   Maximum capacity of the vehicle is 5 (it's a 6-seater, but we don't count the driver!).
*   Structure of the array after removing passengers is up to you. You can leave gaps, shift, swap, whatever you like!
*   Implementation code should have 100% code coverage (all lines of code run at some point during any of the tests).

## Methods to Implement

Implement the following methods in your `Vehicle` class:

*   Add a passenger
*   Remove a passenger
*   Find a passenger (by name, index, or both!)
*   Get number of passengers
