# 안드로이드 아키텍처 연습

![mvc-mvp-mvvm](https://github.com/unso99/PracticeAndroid/assets/94777814/1e4f6309-cfb4-44b1-97f1-e31f0c1c4c82)

## 1. mvc 패턴
- Model : 어플에서 사용되는 실제 데이터 및 데이터 조작 로직 처리부분, View에 의존 x
- View : 사용자에게 제공되는 UI부분
- Controller : 사용자의 입력을 받고 처리하는 부분, 주로 Activity나 Fragment이다. Model의 데이터 변화에 따라 View를 선택
 ###### 작동순서
 - 사용자의 action들은 controller에 들어온다.
 - controller는 사용자의 action을 확인하고, model을 update
 - controller는 model을 나타내줄 view를 선택
 - view는 모델을 이용하여 화면에 나타나게한다.
###### 특징
- Controller가 여러개의 View를 선택 가능 1:n
- Controller가 model에 직접 영향이 가능
###### 장점
- 단순한 패턴
###### 단점
- view와 model사이의 의존성이 존재 -> test가 힘들다
- controller에 코드가 모이게 되어있어서 Activity가 비대해진다.

## 2. mvp 패턴
- Presenter : View에서 요청한 정보를 model로부터 가공하여 view로 전달하는 부분, view와 model 사이를 이어주는 역할
 ###### 작동순서
 - 사용자의 action들은 view를 통해 들어온다.
 - view는 데이터를 presenter에 요청
 - presenter는 model에게 데이터를 요청
 - model은 presenter에게 요청받은 데이터를 응답
 - presenter는 view에게 데이터를 응답
 - view는 presenter가 응답한 데이터를 이용하여 화면을 나타냄
###### 특징
- presenter와 view는 1:1구조
- view와 model은 서로를 전혀 알 필요 x
###### 장점
- view와 model 의존성 x
- mvc단점 해결 , 테스트 용이
###### 단점
- view와 presenter가 1:1로 의존성이 있기에 각각의 view마다 presenter가 존재해야해서 코드량이 많아져 유지보수가 힘들 수 도있다.

## 3. mvvm 패턴
- ViewModel : view에 사용되는 데이터를 관리하는 view를 위한 model, view에 종속 x
 ###### 작동순서
- view에 입력이 들어오면 command 형태로 viewmodel에 명령 전달
- viewmodel은 필요한 데이터를 model에 요청
- model은 viewmodel에 필요한 데이터를 응답
- viewmodel은 응답받은 데이터를 가공해서 저장
###### 특징
- view는 viewmodel을 알지만, viewmodel은 view를 알지를 못한다. viewmodel은 model을 알지만 viewmodel을 알지 못한다.
- 한쪽 방향으로만 의존관계가 있어서 각 모듈 별로 분리하여 개발을 할 수 있다.
###### 장점
- view와 model사이의 의존성 x
- 테스트 용이
###### 단점
- learning curve가 높다

## 4. mvi 패턴
![www charlezz com-android-mvi--2022-12-28--11 03 23-1024x546](https://github.com/unso99/PracticeAndroid/assets/94777814/a777015a-54e5-4745-9ec8-198a9b5c6bf8)
- Model : UI에 반영될 state를 의미한다. MVP 또는 MVVM 모델의 정의와는 다르다.
- View : UI 그 자체
- Intent : view에서 발생한 사용자의 액션을 model에 전달, intent는 불변의 데이터 구조로 구현된다. view에서 intent를 발생시켜 model에 전달하고, model에서 intent를 처리하여 state를 변경함.
###### 특징
- mvi 패턴에서는 state가 중심이 되며, 데이터는 불변의 구조로 구성된다.
###### 장점
- state가 변할 때마다 필요한 view만 update
- 코드의 안정성 ↑ 테스트 용이
###### 단점
- learning curve가 높다
- mvc, mvp에 비해 복잡하다.
- state 관련 코드가 많아 코드 양이 많아진다.

  
