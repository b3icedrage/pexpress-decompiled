package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7562xB0 extends AbstractC4723jh1<int[]> {

    @NotNull
    public int[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
