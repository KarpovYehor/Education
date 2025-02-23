Find peak element:

arr = {0,1,2,3,4,5,10,9,8,7,6};

arr = [0,1,2,3,4,5,10,9,8,7,6];
console.log(`Peak is  ${getPeak(arr,0,arr.length - 1)}`);
console.log(`End `);

function getPeak(arr, left, right) {
let mid = Math.floor((left + right) / 2);

    if(arr[mid - 1] < arr[mid] && arr[mid]> arr[mid+1]) {
        return arr[mid];
    }

    if(arr[mid-1] < arr[mid] && arr[mid] <arr[mid+1]) {
        return getPeak(arr, mid + 1, right);
    } else {
        return getPeak(arr,left, mid - 1);
    }

}
