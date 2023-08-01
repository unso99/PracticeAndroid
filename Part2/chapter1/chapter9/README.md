
# 위치공유앱 (part2-chapter9)

![1](./screenshot/1.png)
![2](./screenshot/2.png)

## 이 챕터를 통해 배우는 것

1. GoogleMap
2. GPS 사용 (FusedLocationClient)
3. Kakao Auth SDK
4. Firebase Realtime Database
5. Firebase Auth
6. Glide
7. Lottie Animation
8. View Animation

## Google Map

[https://developers.google.com/maps/documentation/android-sdk?hl=ko](https://developers.google.com/maps/documentation/android-sdk?hl=ko)

Android 용 Maps SDK를 사용해 Android 앱에 지도를 추가해보세요. 

또한 마커, 다각형, 오버레이를 지도에 추가하여 지도 위치에 대한 정보를 추가로 제공하거나 사용자 상호작용을 지원할 수도 있습니다.

**Google Map 요금 청구 방식**

[https://developers.google.com/maps/documentation/android-sdk/usage-and-billing?hl=ko](https://developers.google.com/maps/documentation/android-sdk/usage-and-billing?hl=ko)

지도 객체 사용 : 회당 0달러

추가 기능 사용 : 회당 추가 비용 결제 

지도 API 를 사용하기 위해선 결제 계정 등록이 필수이며, 조건을 충족할 경우 지도 API 에 대해서는 매월 200달러의 크레딧을 받을 수 있다. (정책에 따라 변동 가능)

오남용되는 API Key 사용을 막기 위한 정책도 있다.

## GPS 사용

- *`ACCESS_FINE_LOCATION`* 권한 받아오기
- *`ACCESS_COARSE_LOCATION`* 권한 받아오기
- FusedLocationClient 가져오기
- requestLocationUpdates 로 현재 위치 가져오기
- lastLocation 을 통해 마지막 위치 가져오기

## Kakao Auth SDK

[https://developers.kakao.com/docs/latest/ko/kakaologin/android](https://developers.kakao.com/docs/latest/ko/kakaologin/android)

- 카카오 로그인을 이용해 OAuth 로그인 구현
- OAuth 는 비밀번호를 제공하지 않고, 다른 웹사이트 상의 정보에 대해 접근 권한을 부여할 수 있는 공통적인 수단으로 사용되는, 접근 위임을 위한 개방형 표준이다.
- 구글 로그인, 페이스북 로그인, 카카오톡 로그인, 애플 로그인 등이 이에 해당하며, OAuth 로그인을 통해 발급받은 토큰을 통해 해당 서버에서 부여받은 권한에 따른 정보를 얻어올 수 있다.
