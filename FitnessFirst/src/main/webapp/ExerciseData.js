/**
 * 
 */
for (let i = 1; i < 21; i++) {
    fetch('https://wger.de/api/v2/exercise/?language=2&amp;page=' + i)
        .then(resp => resp.json())
        .then(data => {
            data.results.forEach(exercise => {
                if (workout.equipment.length === 0) {
                    console.log(`INSERT INTO exercise(EXERCISE_ID, EXERCISE_NAME, MUSCLE, EXERCISE_TYPE, EXERCISE_DESCRIPTION) 
                    VALUES(EXERCISE_ID_SEQ.nextval, '${exercise.name}', '${exercise.category}', 0, '${exercise.description}');`)
                } else {
                    workout.equipment.forEach(element => {
                        console.log(`INSERT INTO exercise(EXERCISE_ID, EXERCISE_NAME, MUSCLE, EXERCISE_TYPE, EXERCISE_DESCRIPTION)`)
                        console.log(`VALUES(EXERCISE_ID_SEQ.nextval, '${exercise.name}', '${exercise.category}', '${element}', '${exercise.description}');`)
                    });
                }
            });
            // console.log(data);
        })
        .catch(console.log);
}