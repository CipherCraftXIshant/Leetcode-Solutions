class Solution {
public:
    vector<int> findDuplicates(vector<int>& arr) {
        vector<int> result;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int index = abs(arr[i]) - 1; 

            if (arr[index] < 0) {
                result.push_back(abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }

        return result;
    }
};
