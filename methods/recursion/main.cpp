#include<iostream>
#include<string>

std::string rem_dups(std::string s) {
    if(s.length() <= 1) return s;
    // s = s[0] + s[1] + s[2] + . . .
    if(s[0] == s[1])
       return rem_dups(s.substr(1));
    return s[0] + rem_dups(s.substr(1));
}

int main() {
    std::cout << rem_dups("aaaabbbbbcccccdddddeeeeffffhhhhiiiijjjj") << std::endl;
    return 0;
}
