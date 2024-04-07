# aggregate 저장을 위해 json 사용하기

## Concept

Aggregate 란 서로 관련 있는 도메인 모델의 집합을 의미합니다.

aggregate 내에는 하나 이상의 entity 와 value 로 구성될 수 있습니다.

이러한 aggregate 내에서 domain model 의 일관성을 책임지는 특별한 entity 가 존재합니다. 이를 Aggregate Root 라는 이름으로 부릅니다. 

도메인 모델의 일관성을 위하여 Aggregate 에 접근하기 위해서는 Aggregate Root Entity 를 통해서만 접근할 수 있어야 합니다.

영속의 관점에서 본다면 Aggregate 는 영속될 때, Aggregate Root 의 id 만 노출하고 내부에 포함된 domain model 은 모두 data 혹은 value 로 취급합니다.

결국 Aggregate 가 Database 의 record 로 변경될 때, aggregate 를 json 으로 변경해도 무방하다는 것을 의미합니다.

이리하여 위의 컨셉을 이용한다면 data schema 구조를 고려하지 않는 순수 domain focused 개발이 가능해집니다.

### References

- [The ideal ddd aggregate store - Vaughn Vernon, kalele](https://kalele.io/the-ideal-domain-driven-design-aggregate-store/)

