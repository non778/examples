package org.tensorflow.lite.examples.posenet

class BodyLocation {

    private var frame = ArrayList<String>()
    private var bodyLocation : String = ""

    public fun setFrame(bodyLoc : String)
    {
        frame?.add(bodyLoc)
    }
    public fun getFrame() : ArrayList<String>
    {
        return this.frame
    }
    public fun setBodyLocation(loc : String)
    {
        this.bodyLocation = loc
    }
    public fun getBodyLocation() : String
    {
        return this.bodyLocation
    }
    public fun bodyLocationClear()
    {
        this.bodyLocation = ""
    }


    /*
    private var nose : String = "0-"
    private var leftEye : String = "1-"
    private var rightEye : String = "2-"
    private var leftEar : String = "3-"
    private var rightEar : String = "4-"
    private var leftShoulder : String = "5-"
    private var rightShoulder : String = "6-"
    private var leftElbow : String = "7-"
    private var rightElbow : String = "8-"
    private var leftWrist : String = "9-"
    private var rightWrist : String = "10-"
    private var leftHip : String = "11-"
    private var rightHip : String = "12-"
    private var leftKnee : String = "13-"
    private var rightKnee : String = "14-"
    private var leftAnkle : String = "15-"
    private var rightAnkle : String = "16-"

    public fun setNose(nose : String)
    {
        this.nose += nose
    }
    public fun setLeftEye(eye : String)
    {
        this.leftEye += eye
    }
    public fun setRightEye(eye : String)
    {
        this.rightEye += eye
    }
    public fun setLeftEar(ear : String)
    {
        this.leftEar += ear
    }
    public fun setRightEar(ear : String)
    {
        this.rightEar += ear
    }
    public fun setLeftShoulder(shoulder : String)
    {
        this.leftShoulder += shoulder
    }
    public fun setRightShoulder(shoulder : String)
    {
        this.rightShoulder += shoulder
    }
    public fun setLeftElbow(elbow : String)
    {
        this.leftElbow += elbow
    }
    public fun setRightElbow(elbow : String)
    {
        this.rightElbow += elbow
    }
    public fun setLeftWrist(wrist : String)
    {
        this.leftWrist += wrist
    }
    public fun getLeftWrist() : String
    {
        return this.leftWrist
    }
    public fun setRightWrist(wrist : String)
    {
        this.rightWrist += wrist
    }
    public fun getRightWrist() : String
    {
        return this.rightWrist
    }
    public fun setLeftHip(hip : String)
    {
        this.leftHip += hip
    }
    public fun setRightHip(hip : String)
    {
        this.rightHip += hip
    }
    public fun setLefKnee(knee : String)
    {
        this.leftKnee += knee
    }
    public fun setRightKnee(knee : String)
    {
        this.rightKnee += knee
    }
    public fun setLefAnkle(Ankle : String)
    {
        this.leftAnkle += Ankle
    }
    public fun setRightAnkle(Ankle : String)
    {
        this.rightAnkle += Ankle
    }
    */
}