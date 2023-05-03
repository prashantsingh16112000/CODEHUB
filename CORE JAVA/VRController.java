

public class VRController : MonoBehaviour
{
    // The camera that will be used for VR rendering
    public Camera vrCamera;

    // The Transform of the controller
    public Transform controllerTransform;

    // The Transform of the object that will be grabbed
    public Transform objectTransform;

    // A boolean that indicates whether the object is being grabbed or not
    private bool isGrabbing;

    void Update()
    {
        // Check if the user is pressing the "grab" button
        if (Input.GetButtonDown("Grab"))
        {
            // If the object is not being grabbed, start grabbing it
            if (!isGrabbing)
            {
                objectTransform.parent = controllerTransform;
                isGrabbing = true;
            }
            // If the object is already being grabbed, release it
            else
            {
                objectTransform.parent = null;
                isGrabbing = false;
            }
        }
    }
}
