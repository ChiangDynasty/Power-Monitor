/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_lanternsoftware_pigpio_PIGPIO */

#ifndef _Included_com_lanternsoftware_pigpio_PIGPIO
#define _Included_com_lanternsoftware_pigpio_PIGPIO
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioInitialise
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioInitialise
  (JNIEnv *, jclass);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioTerminate
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioTerminate
  (JNIEnv *, jclass);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioSetMode
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioSetMode
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioGetMode
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioGetMode
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioSetPullUpDown
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioSetPullUpDown
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioRead
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioRead
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    gpioWrite
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_gpioWrite
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    spiOpen
 * Signature: (III)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_spiOpen
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    spiClose
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_spiClose
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    spiRead
 * Signature: (I[BII)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_spiRead
  (JNIEnv *, jclass, jint, jbyteArray, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    spiWrite
 * Signature: (I[BII)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_spiWrite
  (JNIEnv *, jclass, jint, jbyteArray, jint, jint);

/*
 * Class:     com_lanternsoftware_pigpio_PIGPIO
 * Method:    spiXfer
 * Signature: (I[BI[BII)I
 */
JNIEXPORT jint JNICALL Java_com_lanternsoftware_pigpio_PIGPIO_spiXfer
  (JNIEnv *, jclass, jint, jbyteArray, jint, jbyteArray, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
