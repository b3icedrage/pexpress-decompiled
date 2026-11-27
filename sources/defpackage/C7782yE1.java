package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7782yE1 {

    @NotNull
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;

    @Nullable
    public C7782yE1 f;

    @Nullable
    public C7782yE1 g;

    public C7782yE1() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    @Nullable
    public final C7782yE1 a() {
        C7782yE1 c7782yE1 = this.f;
        if (c7782yE1 == this) {
            c7782yE1 = null;
        }
        C7782yE1 c7782yE2 = this.g;
        Intrinsics.checkNotNull(c7782yE2);
        c7782yE2.f = this.f;
        C7782yE1 c7782yE3 = this.f;
        Intrinsics.checkNotNull(c7782yE3);
        c7782yE3.g = this.g;
        this.f = null;
        this.g = null;
        return c7782yE1;
    }

    @NotNull
    public final void b(@NotNull C7782yE1 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        C7782yE1 c7782yE1 = this.f;
        Intrinsics.checkNotNull(c7782yE1);
        c7782yE1.g = segment;
        this.f = segment;
    }

    @NotNull
    public final C7782yE1 c() {
        this.d = true;
        return new C7782yE1(this.a, this.b, this.c, true, false);
    }

    public final void d(@NotNull C7782yE1 sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.c;
        int i3 = i2 + i;
        byte[] bArr = sink.a;
        if (i3 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            C1371Kj.c(0, i4, i2, bArr, bArr);
            sink.c -= sink.b;
            sink.b = 0;
        }
        int i5 = sink.c;
        int i6 = this.b;
        C1371Kj.c(i5, i6, i6 + i, this.a, bArr);
        sink.c += i;
        this.b += i;
    }

    public C7782yE1(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
