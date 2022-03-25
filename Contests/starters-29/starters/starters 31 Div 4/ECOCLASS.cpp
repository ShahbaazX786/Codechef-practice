#include <iostream>
using namespace std;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        int n = 0;
        cin >> n;
        int s[n];
        int d[n];
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> s[i];
        }
        for (int i = 0; i < n; i++)
        {
            cin >> d[i];
        }
        for (int i = 0; i < n; i++)
        {
            if (s[i] == d[i])
            {
                temp += 1;
            }
        }

        cout << temp << endl;
    }
    return 0;
}
