Merge sort: 
arr = [38,27,43,3,9,82,10];

one = [1,3,5,6]
two = [2,3,4]

Merge sorted array:
[1,2,3,3,4,5,6]

result.length = one.length + two.length;
oneIndex = 0;
twoIndex = 0;
resulIndex = 0;

while(oneIndex < one.length && twoIndex < two.length){
    oneElement = one[oneIndex];  //1  ; 3 ; 3 ; 3 ; 5
    twoElement = two[twoIndex];  //2  ; 2 ; 3 ; 4 ; 4
    if(oneElement < twoElement){
        //тогда помещаем по индексу resulIndex в результирующий массив oneElement  //1 2 3 3
        // oneIndex++; //1 2
    }else{
        //тогда помещаем по индексу resulIndex в результирующий массив twoElement  //1 2 3 3 4
        // twoIndex++; //1 2 3
    }
    resultIndex++; //1 2 3 4 5

}

while(oneIndex < one.length){
    result[resultIndex] = one[oneIndex];
    oneIndex++;
    resultIndex++;
}

while(twoIndex < two.length){
    result[resultIndex] = two[oneIndex];
    twoIndex++;
    resultIndex++;
}




JS
////////////////////////////////////////////////////////////
let one = [1, 3, 5, 6];
let two = [2, 3, 4];

let res = merge(one, two);
console.log(`Array is ${res}`);

function merge(one, two) {
let result = [];
let oneIndex = 0;
let twoIndex = 0;

    while(oneIndex < one.length && twoIndex < two.length) {
        let oneElement = one[oneIndex];
        let twoElement = two[twoIndex];
        if(oneElement < twoElement) {
            result.push(oneElement);
            oneIndex++;
        } else {
            result.push(twoElement);
            twoIndex++;
        }
    }
    while(oneIndex < one.length){
        result.push(one[oneIndex]);
        oneIndex++;
    }
    while(twoIndex < two.length) {
        result.push(two[twoIndex]);
        twoIndex;
    }
    return result;
}
public static int[] merge(int[] one, int[] two) {
int oneIndex = 0;
int twoIndex = 0;
int resultIndex = 0;
int[] result = new int[one.length + two.length];
while (oneIndex < one.length && twoIndex < two.length) {
int oneElement = one[oneIndex];
int twoElement = two[twoIndex];
if (oneElement < twoElement) {
result[resultIndex] = oneElement;
oneIndex++;
} else {
result[resultIndex] = twoElement;
twoIndex++;
}
resultIndex++;
}

    while(oneIndex < one.length) {
        result[resultIndex] = one[oneIndex];
        oneIndex++;
        resultIndex++;
    }

    while(twoIndex < two.length) {
        result[resultIndex] = two[twoIndex];
        twoIndex++;
        resultIndex++;
    }

    return result;
}

let arr = [38,27,43,3,9,82,10];
let sortedArray = mergeSort(arr);
console.log(`Sorted array is ${sortedArray}`);

function mergeSort(arr) {
if(arr.length === 1) {
return arr;
}

    //находим середину нашего массива
    let mid = Math.floor(arr.length / 2);
    // создать два новых массива с (0 до mid - 1) и с (mid до array.length - 1)
    let left = arr.slice(0, mid); //38,27,43,3 // 38 27 // 38 
    let right = arr.slice(mid); // 9,82,10 // 43 3 // 27 

    let resLeft = mergeSort(left); //38,27,43,3
    let resRight = mergeSort(right);// 9,82,10

    return merge(resLeft,resRight);

}