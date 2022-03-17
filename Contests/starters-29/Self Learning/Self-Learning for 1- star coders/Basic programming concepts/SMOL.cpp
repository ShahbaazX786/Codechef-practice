#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    long long int n, k;
    cin >> t;
    while (t--)
    {
        cin >> n >> k;
        if (k == 0)
        {
            cout << n << endl;
        }
        else
        {
            cout << n % k << endl;
        }
    }
    return 0;
}
