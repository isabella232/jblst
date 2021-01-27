package tech.pegasys.teku.bls.impl.blst.swig;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class P2_Affine {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected P2_Affine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(P2_Affine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blstJNI.delete_P2_Affine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public P2_Affine() {
    this(blstJNI.new_P2_Affine__SWIG_0(), true);
  }

  public P2_Affine(byte[] in) {
    this(blstJNI.new_P2_Affine__SWIG_1(in), true);
  }

  public P2_Affine(P2 jacobian) {
    this(blstJNI.new_P2_Affine__SWIG_2(P2.getCPtr(jacobian), jacobian), true);
  }

  public P2_Affine dup() {
    return new P2_Affine(blstJNI.P2_Affine_dup(swigCPtr, this), true);
  }

  public P2 to_jacobian() {
    return new P2(blstJNI.P2_Affine_to_jacobian(swigCPtr, this), true);
  }

  public byte[] serialize() { return blstJNI.P2_Affine_serialize(swigCPtr, this); }

  public byte[] compress() { return blstJNI.P2_Affine_compress(swigCPtr, this); }

  public boolean on_curve() {
    return blstJNI.P2_Affine_on_curve(swigCPtr, this);
  }

  public boolean in_group() {
    return blstJNI.P2_Affine_in_group(swigCPtr, this);
  }

  public boolean is_inf() {
    return blstJNI.P2_Affine_is_inf(swigCPtr, this);
  }

  public boolean is_equal(P2_Affine p) {
    return blstJNI.P2_Affine_is_equal(swigCPtr, this, P2_Affine.getCPtr(p), p);
  }

  public BLST_ERROR core_verify(P1_Affine pk, boolean hash_or_encode, byte[] msg, String DST, byte[] aug) {
    return BLST_ERROR.swigToEnum(blstJNI.P2_Affine_core_verify__SWIG_0(swigCPtr, this, P1_Affine.getCPtr(pk), pk, hash_or_encode, msg, DST, aug));
  }

  public BLST_ERROR core_verify(P1_Affine pk, boolean hash_or_encode, byte[] msg, String DST) {
    return BLST_ERROR.swigToEnum(blstJNI.P2_Affine_core_verify__SWIG_2(swigCPtr, this, P1_Affine.getCPtr(pk), pk, hash_or_encode, msg, DST));
  }

  public BLST_ERROR core_verify(P1_Affine pk, boolean hash_or_encode, byte[] msg) {
    return BLST_ERROR.swigToEnum(blstJNI.P2_Affine_core_verify__SWIG_3(swigCPtr, this, P1_Affine.getCPtr(pk), pk, hash_or_encode, msg));
  }

  public static P2_Affine generator() {
    return new P2_Affine(blstJNI.P2_Affine_generator(), true);
  }

}
