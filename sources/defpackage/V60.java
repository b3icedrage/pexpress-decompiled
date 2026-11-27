package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class V60 implements InterfaceC3129cK0 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final InterfaceC3129cK0 g;
    public final C6667sx h;
    public final C4227ha1 i;
    public int j;

    public V60(Object obj, InterfaceC3129cK0 interfaceC3129cK0, int i, int i2, C6667sx c6667sx, Class cls, Class cls2, C4227ha1 c4227ha1) {
        UE.e(obj, "Argument must not be null");
        this.b = obj;
        UE.e(interfaceC3129cK0, "Signature must not be null");
        this.g = interfaceC3129cK0;
        this.c = i;
        this.d = i2;
        UE.e(c6667sx, "Argument must not be null");
        this.h = c6667sx;
        UE.e(cls, "Resource class must not be null");
        this.e = cls;
        UE.e(cls2, "Transcode class must not be null");
        this.f = cls2;
        UE.e(c4227ha1, "Argument must not be null");
        this.i = c4227ha1;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (!(obj instanceof V60)) {
            return false;
        }
        V60 v60 = (V60) obj;
        return this.b.equals(v60.b) && this.g.equals(v60.g) && this.d == v60.d && this.c == v60.c && this.h.equals(v60.h) && this.e.equals(v60.e) && this.f.equals(v60.f) && this.i.equals(v60.i);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
