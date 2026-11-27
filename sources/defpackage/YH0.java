package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YH0 implements Closeable, Flushable {
    public boolean i;
    public int d = 0;
    public int[] e = new int[32];
    public String[] g = new String[32];
    public int[] h = new int[32];
    public int j = -1;

    public abstract YH0 A(double d);

    public abstract YH0 C(long j);

    public abstract YH0 D(@Nullable Float f);

    public abstract YH0 G(@Nullable String str);

    public abstract YH0 L(boolean z);

    public abstract YH0 c();

    public abstract YH0 f();

    public final void g() {
        int i = this.d;
        int[] iArr = this.e;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new EG0("Nesting too deep at " + p() + ": circular reference?");
        }
        this.e = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.g;
        this.g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.h;
        this.h = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof XH0) {
            XH0 xh0 = (XH0) this;
            Object[] objArr = xh0.k;
            xh0.k = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract YH0 k();

    public abstract YH0 l();

    @CheckReturnValue
    public final String p() {
        return C5208m0.l(this.d, this.e, this.g, this.h);
    }

    public abstract YH0 q(String str);

    public abstract YH0 t();

    public final int u() {
        int i = this.d;
        if (i != 0) {
            return this.e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void v(int i) {
        int[] iArr = this.e;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
