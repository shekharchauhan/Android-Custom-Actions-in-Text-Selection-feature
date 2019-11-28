# Android-Custom-Actions-in-Text-Selection-feature
Android text selection feature provides limited options of cut/copy/paste .. However of late there are few more functionalities are getting added . 
The use case which i tried to build through this repository is that when user select a text he should be able to listen the text . The code is very simple for this , we just need to define a intenet filter "android.intent.action.PROCESS_TEXT" for the activity so that it is able to respond to the action .
. Need to define label and intent filter ( refer manifest file). 
      
 In the activity we can fetch  selected string and can pass it on to Text to Speech Engine for voice.
