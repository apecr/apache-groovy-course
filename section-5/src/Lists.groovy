def nums = [1, 2, 3, 6, 7, 8, 4, 5, 3, 8, 9]
println nums
println nums.class.name

println nums.collect(num -> num * 2)

nums.push(1)
nums[0] = 77

println nums + 3
println nums

nums << 66
println nums

println nums.findAll { num -> num >= 3 }
println nums - 3
println nums - [3, 6, 66]
println nums[4]

println nums[1..3]

for (x in nums) {
    println x
}

println nums

nums << [1, 2]
nums << [3, 4, 5]
println nums.flatten()
println nums.unique()
println nums

def numbers = [41, 4, 2, 1, 1, 99, 2, 2, 3, 4, 4, 4, 5, 8, 9] as SortedSet
println numbers.class.name


println numbers

// nums.clear() == nums = []


