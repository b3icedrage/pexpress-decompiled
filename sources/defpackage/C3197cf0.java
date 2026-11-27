package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3197cf0 extends AbstractC4723jh1<float[]> {

    @NotNull
    public float[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.a = fArrCopyOf;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
