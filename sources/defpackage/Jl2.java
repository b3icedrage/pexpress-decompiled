package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Jl2 extends AbstractC4743jm1 implements Serializable {

    @NotNull
    private static final a m = new a(null);
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // defpackage.AbstractC4743jm1
    public final int a(int i) {
        return ((-i) >> 31) & (c() >>> (32 - i));
    }

    public final int c() {
        int i = this.g;
        int i2 = i ^ (i >>> 2);
        this.g = this.h;
        this.h = this.i;
        this.i = this.j;
        int i3 = this.k;
        this.j = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.k = i4;
        int i5 = this.l + 362437;
        this.l = i5;
        return i4 + i5;
    }
}
