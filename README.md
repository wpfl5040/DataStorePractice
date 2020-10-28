# DataStorePractice
 - DataStore API 연습 프로젝트
 - 현재 1.0.0-alpha01 버전
 
 ## DataStore 란?
 - DataStore는 Kotlin, Coroutines 및 Flow를 사용하여 일관성 및 트랜잭션 지원으로 데이터를 비동기 적으로 저장
 
 
 ## set up
 ```
 dependencies {
  // Preferences DataStore
  implementation "androidx.datastore:datastore-preferences:1.0.0-alpha01"

  // Proto DataStore
  implementation "androidx.datastore:datastore-core:1.0.0-alpha01"
}
 ```
 
 ## DataStore 종류
 - Preference DataStore :  키-값 쌍을 사용하여 데이터를 저장, 그러나 형식 안전성을 제공하지 않습니다.
 - Proto DataStore : Protocol buffers를 사용하여 지정된 스키마를 사용하여 데이터를 사용자 정의 유형으로 저장
 
 
 
 ## 참고 자료
- https://developer.android.com/topic/libraries/architecture/datastore
- https://medium.com/scalereal/hello-datastore-bye-sharedpreferences-android-f46c610b81d5
- https://medium.com/scalereal/hello-datastore-bye-sharedpreferences-android-part-2-proto-datastore-2716fbfd4783
