var canFinish = function(numCourses, prerequisites) {
    // Step 1: Build graph and in-degree array
    let graph = Array.from({ length: numCourses }, () => []);
    let inDegree = new Array(numCourses).fill(0);
    
    for (let [course, prereq] of prerequisites) {
        graph[prereq].push(course); // prereq -> course
        inDegree[course]++;
    }
    
    // Step 2: Initialize queue with courses having 0 in-degree
    let queue = [];
    for (let i = 0; i < numCourses; i++) {
        if (inDegree[i] === 0) queue.push(i);
    }
    
    // Step 3: Process queue
    let count = 0;
    while (queue.length > 0) {
        let curr = queue.shift();
        count++;
        for (let next of graph[curr]) {
            inDegree[next]--;
            if (inDegree[next] === 0) queue.push(next);
        }
    }
    
    // Step 4: If we could process all courses, return true
    return count === numCourses;
};