# Wabi-Sabi

The Project Wabi-Sabi aims to help special children by employing our very own Machine Learning Model and Interactive Quiz specially designed by our developers.


Goals

To Successfully invent a software that recognizes emotions and compares it with a reference feature to predict if emotion accurate or not

## Software used:

- Python
- Tensorflow or PyTorch
- Keras
- OpenCV
- PyGame
- NLTK(Natural Language Toolkit)
- Flask or Django

## Solution Approach:

- build a emotional thermometer using Childs own emotions.
- building a mode to use camera to point at ppl and tell the emotions showed
- Use a chatbot to help roleplay emotional behaviour.
- daily reminder system for practice.
- create a fun interactive ways to test learning.
- compare emotions of the child and shown feature in realtime and reward points
- points can be used to redeem in app purchases
- teach body language.

## Technical Approach:

Sure! Here's a more detailed description of how to make a Python program to help autistic children understand emotions using AI:

1. **Setting up the Environment:**
    - Install Python: Download and install Python from the official website (https://www.python.org/) based on your operating system.
    - Install Required Libraries: Use the package manager `pip` to install the necessary libraries such as TensorFlow, Keras, OpenCV, NLTK, and Pygame. You can install them by running commands like `pip install tensorflow`, `pip install opencv-python`, `pip install nltk`, etc.
2. **Preparing the Emotion Recognition Model:**
    - Choose a suitable deep learning model architecture for emotion recognition, such as a CNN or RNN. You can explore existing pre-trained models or train your own using appropriate datasets.
    - Load the trained model in your Python program using TensorFlow or Keras.
3. **Building the User Interface:**
    - Decide on the type of user interface you want to create, such as a command-line interface, GUI, or web interface.
    - Use appropriate libraries like Pygame or web frameworks like Flask or Django to create the desired user interface. For example, if you're using Pygame, you can create a game window, buttons, and other interactive elements.
4. **Capturing and Analyzing Facial Expressions:**
    - Prompt the user to input a picture or video containing facial expressions.
    - Use OpenCV to detect faces in the input media. You can utilize the pre-trained Haar cascades or more advanced deep learning-based face detection models.
    - For each detected face:
        - Extract facial landmarks and features using OpenCV. This step helps in capturing important information for emotion analysis.
        - Preprocess the facial data by resizing, normalizing, or applying any other required transformations to make it suitable for inputting into the emotion recognition model.
        - Pass the preprocessed data through the trained emotion recognition model to obtain the predicted emotion.
        - Display the predicted emotion alongside the face image on the user interface.
5. **Incorporating Text and Audio Analysis (Optional):**
    - If you want to enhance emotion understanding by analyzing accompanying text or audio data, use libraries like NLTK for sentiment analysis or speech processing.
    - Process the text or audio data to extract relevant emotional cues and provide additional insights alongside the predicted emotion.
6. **Providing Supplementary Information:**
    - Display additional information or resources related to the predicted emotion. For example, you can show a short description of the emotion, play an audio clip explaining the emotion, or provide relevant educational materials.
7. **Repeat or Exit:**
    - Ask the user if they want to input another picture or video. If yes, go back to step 5; otherwise, proceed to step 9.
8. **Program Termination:**
    - End the program gracefully, closing any open windows or resources.