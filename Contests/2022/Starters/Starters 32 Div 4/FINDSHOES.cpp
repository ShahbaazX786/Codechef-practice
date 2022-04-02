#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int a, b, temp = 0;
        cin >> a >> b;
        if (a > b)
        {
            temp = abs(a - b);
            temp += a;
        }
        else
        {
            temp = a;
        }
        cout << temp << endl;
    }
    return 0;
}
