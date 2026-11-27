package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5782oj implements CharSequence {

    @NotNull
    public final char[] d;
    public int e;

    public C5782oj(@NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.d = buffer;
        this.e = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final CharSequence subSequence(int i, int i2) {
        return d.f(this.d, i, Math.min(i2, this.e));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final String toString() {
        int i = this.e;
        return d.f(this.d, 0, Math.min(i, i));
    }
}
