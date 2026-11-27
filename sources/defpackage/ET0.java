package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ET0 extends DT0 {
    public final long d;
    public final long e;
    public boolean g;
    public long h;

    public ET0(long j, long j2, long j3) {
        this.d = j3;
        this.e = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.g = z;
        this.h = z ? j : j2;
    }

    @Override // defpackage.DT0
    public final long b() {
        long j = this.h;
        if (j != this.e) {
            this.h = this.d + j;
            return j;
        }
        if (!this.g) {
            throw new NoSuchElementException();
        }
        this.g = false;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }
}
