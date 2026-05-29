/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {


    *returnSize = 2;
    int *arr = malloc(sizeof(int) * (*returnSize));


    for(int i = 0; i < numsSize; i++){
        for(int x = i+1; x < numsSize; x++){
            if((nums[i] + nums[x]) == target){

                arr[0] = i;
                arr[1] = x;

                return arr;
            }

        }
    }
    


    return 0;
}