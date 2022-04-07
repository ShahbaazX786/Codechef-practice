#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        double x;
        cin >> x;
        x = x / 4;
        cout << ceil(x) << endl;
    }
    return 0;
}
