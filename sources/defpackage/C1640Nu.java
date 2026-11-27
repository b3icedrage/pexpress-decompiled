package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1640Nu {

    @NotNull
    public final ByteBuffer a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final int f;

    public C1640Nu(ByteBuffer memory) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.a = memory;
        this.e = memory.limit();
        this.f = memory.limit();
    }

    public final void a(int i) {
        int i2 = this.c;
        int i3 = i2 + i;
        if (i < 0 || i3 > this.e) {
            C0564Aa.c(i, this.e - i2);
            throw null;
        }
        this.c = i3;
    }

    public final void b(int i) throws EOFException {
        int i2 = this.e;
        int i3 = this.c;
        if (i < i3) {
            C0564Aa.c(i - i3, i2 - i3);
            throw null;
        }
        if (i < i2) {
            this.c = i;
        } else if (i == i2) {
            this.c = i;
        } else {
            C0564Aa.c(i - i3, i2 - i3);
            throw null;
        }
    }

    public final void c(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.b;
        int i3 = i2 + i;
        if (i < 0 || i3 > this.c) {
            C0564Aa.g(i, this.c - i2);
            throw null;
        }
        this.b = i3;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(EK.e(i, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i > this.b) {
            StringBuilder sbC = C1332Jw.c(i, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbC.append(this.b);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        this.b = i;
        if (this.d > i) {
            this.d = i;
        }
    }

    public final void e() {
        int i = this.f;
        int i2 = i - 8;
        int i3 = this.c;
        if (i2 >= i3) {
            this.e = i2;
            return;
        }
        if (i2 < 0) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            throw new IllegalArgumentException(EK.e(i, "End gap 8 is too big: capacity is "));
        }
        if (i2 < this.d) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            throw new IllegalArgumentException(SK.b(new StringBuilder("End gap 8 is too big: there are already "), this.d, " bytes reserved in the beginning"));
        }
        if (this.b == i3) {
            this.e = i2;
            this.b = i2;
            this.c = i2;
        } else {
            Intrinsics.checkNotNullParameter(this, "<this>");
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.c - this.b) + " content bytes at offset " + this.b);
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer[0x");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        sb.append("](");
        sb.append(this.c - this.b);
        sb.append(" used, ");
        sb.append(this.e - this.c);
        sb.append(" free, ");
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        sb.append((i3 - i2) + i);
        sb.append(" reserved of ");
        sb.append(i3);
        sb.append(')');
        return sb.toString();
    }
}
