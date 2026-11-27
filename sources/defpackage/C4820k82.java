package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4820k82 extends AbstractC4723jh1<C4610j82> {

    @NotNull
    public short[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final C4610j82 a() {
        short[] storage = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C4610j82(storage);
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] storage = Arrays.copyOf(sArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.a = storage;
        }
    }

    @Override // defpackage.AbstractC4723jh1
    public final int d() {
        return this.b;
    }
}
