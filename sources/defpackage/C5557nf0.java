package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: nf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5557nf0 implements TypeEvaluator<Float> {
    public FloatEvaluator a;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float fFloatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
