package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6297rA extends AbstractC5878pA {
    public final int d;
    public final int e;
    public boolean g;
    public int h;

    public C6297rA(char c, char c2, int i) {
        this.d = i;
        this.e = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.e(c, c2) >= 0 : Intrinsics.e(c, c2) <= 0) {
            z = true;
        }
        this.g = z;
        this.h = z ? c : c2;
    }

    @Override // defpackage.AbstractC5878pA
    public final char b() {
        int i = this.h;
        if (i != this.e) {
            this.h = this.d + i;
        } else {
            if (!this.g) {
                throw new NoSuchElementException();
            }
            this.g = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }
}
