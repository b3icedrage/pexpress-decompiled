package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: hX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4218hX1 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public C4218hX1() {
        if (C8056za.h == null) {
            C8056za.h = new C8056za();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
