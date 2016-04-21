# Observer Patterns

GoF Definition: Define a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updatad automatically.

# Concept

In this pattern, there are many observers(objects) which are observing a particular subject(object).
Observers are basically interested and want to be notified when there is a change made inside that subject.
So, they register themselves to that subject. When they lose interest in the subject they simply unregister
from the subject. Sometimes this model is also referred to as the Publisher-Subscriber model.

# Real-Life Example

We can think about a celebrity who has manay fans. Each of these fans wants to get all the latest updates of his/her favorite celebrity.
So, he/she can follow the celebrity as long as his/her interest persists. When he loses interest, he simply stops following that celebrity.
Here we can think of the fan as an observer and the celebrity as a subject.

# Computer World Example

In the world of computer science, consider a simple UI-based example, where this UI is connected whith some database (or business logic).
A user can execute some query through that UI and after searching the database, the result is reflected back in the UI. In most of the cases we
segregate the UI with the database. If a change occurs in the dabase, the UI should be notified so that it can update its display according to the change.

