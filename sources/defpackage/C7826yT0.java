package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7826yT0 extends AbstractC4723jh1<long[]> {

    @NotNull
    public long[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.a = jArrCopyOf;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
