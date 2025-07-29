#include <jni.h>
#include <windows.h>  // Pour MessageBox
#include <stdio.h>
#include "nativecall_NativeHello.h"

JNIEXPORT void JNICALL Java_nativecall_NativeHello_hello(JNIEnv *env, jclass cls) {
    MessageBox(NULL, "Bonjour depuis la DLL native !", "DLL Native", MB_OK);
}
