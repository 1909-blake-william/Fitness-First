export class Exercise {
    exerciseId:number;
    exerciseName:String;
    muscle:String; 
    exerciseType:number; 
    description:String;
    difficulty:number

    constructor(exerciseId:number, exerciseName:String, muscle:String, exerciseType:number, description:String,
        difficulty:number){
        this.exerciseId = exerciseId;
		this.exerciseName = exerciseName;
		this.muscle = muscle;
		this.exerciseType = exerciseType;
		this.description = description;
		this.difficulty = difficulty;

    }
        
}