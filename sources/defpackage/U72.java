package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class U72 extends AbstractC4723jh1<T72> {

    @NotNull
    public long[] a;
    public int b;

    @Override // defpackage.AbstractC4723jh1
    public final T72 a() {
        long[] storage = Arrays.copyOf(this.a, this.b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new T72(storage);
    }

    @Override // defpackage.AbstractC4723jh1
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] storage = Arrays.copyOf(jArr, i);
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
