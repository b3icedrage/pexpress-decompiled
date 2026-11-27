package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4357iA extends AbstractC4723jh1<char[]> {

    @NotNull
    public char[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.a = cArrCopyOf;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
