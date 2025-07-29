/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {

    this.nums = nums.slice();
    this.prefix = nums.slice();

    for(let i=1;i<nums.length;i++){
        this.prefix[i] += this.prefix[i-1];
    }
    
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
NumArray.prototype.update = function(index, val) {
    let diff = val - this.nums[index];
    this.nums[index] = val;
    for(let i=index;i<this.prefix.length;i++){
        this.prefix[i] += diff;
    }
    };

/** 
 * @param {number} left 
 * @param {number} right
 * @return {number}
 */
NumArray.prototype.sumRange = function(left, right) {
    if(left == 0) return this.prefix[right];

    return this.prefix[right] - this.prefix[left -1];
};

/** 
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * obj.update(index,val)
 * var param_2 = obj.sumRange(left,right)
 */