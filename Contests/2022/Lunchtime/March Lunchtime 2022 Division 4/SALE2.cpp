#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, n, x;
    cin >> t;
    while (t--)
    {
        int temp = 0, flag = -1;
        cin >> n >> x;
        if (n % 3 == 2)
            cout << ((n / 3 * 2) + 2) * x << endl;
        else if (n % 3 == 0)
            cout << n / 3 * 2 * x << endl;
        else
            cout << ((n / 3 * 2) + 1) * x << endl;
    }
    return 0;
}