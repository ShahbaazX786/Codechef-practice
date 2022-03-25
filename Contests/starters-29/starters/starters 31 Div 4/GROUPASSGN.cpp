#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t, a, b;
    cin >> t;
    while (t--)
    {
        cin >> a >> b;
        a = a * 2 - b + 1;
        cout << a << endl;
    }
    return 0;
}
