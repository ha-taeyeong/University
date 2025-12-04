// C++ 기본형         
// 1단계 전역변수 코드를 활용할 수 있다.
// 

#include <iostream>

class CMyAdd{
    private: 

    public:  
        int arr[2];
        int result=0; 
        void myadd()
        {            
            result = arr[0] + arr[1];
        }

};
int main(void)
{
    CMyAdd myadd1; //클래스 변수 선언 --> 객체생성
    myadd1.arr[0] = 3;
    myadd1.arr[1] = 4;

    myadd1.myadd();

    // printf("%d", myadd1.result);
    std::cout << myadd1.result << std::endl;

    return 0;
}