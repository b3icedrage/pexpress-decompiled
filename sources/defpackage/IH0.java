package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IH0 {

    @NotNull
    public char[] a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.a = cArrCopyOf;
        }
    }

    public final void b() {
        C4615jA c4615jA = C4615jA.c;
        char[] array = this.a;
        c4615jA.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (c4615jA) {
            try {
                int i = c4615jA.b;
                if (array.length + i < C0669Bj.a) {
                    c4615jA.b = i + array.length;
                    c4615jA.a.addLast(array);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        text.getChars(0, text.length(), this.a, this.b);
        this.b += length;
    }

    public final void d(long j) {
        c(String.valueOf(j));
    }

    @NotNull
    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}
