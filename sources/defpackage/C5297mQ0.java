package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5297mQ0 implements Iterator<String>, InterfaceC6745tJ0 {

    @NotNull
    public final String d;
    public int e;
    public int g;
    public int h;
    public int i;

    public C5297mQ0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.d = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.i < 0) {
            this.e = 2;
            return false;
        }
        String str = this.d;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.g; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.e = 1;
                this.i = i;
                this.h = length;
                return true;
            }
        }
        i = -1;
        this.e = 1;
        this.i = i;
        this.h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = 0;
        int i = this.h;
        int i2 = this.g;
        this.g = this.i + i;
        return this.d.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
