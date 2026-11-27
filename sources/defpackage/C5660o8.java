package defpackage;

/* JADX INFO: renamed from: o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5660o8 {
    public final String a;
    public final int b;
    public transient String c;

    public C5660o8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        if (this.c == null) {
            this.c = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        }
        return this.c;
    }
}
