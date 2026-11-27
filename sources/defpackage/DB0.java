package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class DB0 extends CB0 {
    public final int d;
    public final int e;
    public boolean g;
    public int h;

    public DB0(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.g = z;
        this.h = z ? i : i2;
    }

    @Override // defpackage.CB0
    public final int b() {
        int i = this.h;
        if (i != this.e) {
            this.h = this.d + i;
            return i;
        }
        if (!this.g) {
            throw new NoSuchElementException();
        }
        this.g = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }
}
