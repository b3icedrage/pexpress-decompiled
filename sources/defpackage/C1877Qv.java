package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1877Qv extends AbstractC4723jh1<byte[]> {

    @NotNull
    public byte[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.a = bArrCopyOf;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
