class Solution {

public:

    vector<int> productExceptSelf(vector<int>& arr) {

        int N = arr.size();

        vector<int> answer(N, 0);

        int product = 1;

        int zeroCount = 0, zeroIndex = -1;



        for (int I = 0; I < N; I++) {

            if (arr[I] == 0) {

                zeroCount++;

                zeroIndex = I;

                if (zeroCount > 1) return answer; 

            } else {

                product *= arr[I];

            }

        }



        if (zeroCount == 0) {

            for (int I = 0; I < N; I++) {

                answer[I] = product / arr[I];

            }

        } else {

            answer[zeroIndex] = product;

        }



        return answer;

    }

};