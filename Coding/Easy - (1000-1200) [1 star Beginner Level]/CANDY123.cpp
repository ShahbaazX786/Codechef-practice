#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int a, b, c = 0, c1 = 0, c2 = 0;
        cin >> a >> b;
        while (c1 <= a and c2 <= b)
        {
            c += 1;
            c1 += c;
            c += 1;
            c2 += c;
        }
        if (c1 > a and c2 > b)
        {
            cout << "Bob" << endl;
        }
        else if (c1 > a)
        {
            cout << "Bob" << endl;
        }
        else if (c2 > b)
        {
            cout << "Limak" << endl;
        }
    }
    return 0;
}
