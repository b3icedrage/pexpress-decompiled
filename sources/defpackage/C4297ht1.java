package defpackage;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ht1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4297ht1 implements InterfaceC3129cK0 {
    public static final QU0<Class<?>, byte[]> j = new QU0<>(50);
    public final OU0 b;
    public final InterfaceC3129cK0 c;
    public final InterfaceC3129cK0 d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final C4227ha1 h;
    public final InterfaceC6486s42<?> i;

    public C4297ht1(OU0 ou0, InterfaceC3129cK0 interfaceC3129cK0, InterfaceC3129cK0 interfaceC3129cK1, int i, int i2, InterfaceC6486s42 interfaceC6486s42, Class cls, C4227ha1 c4227ha1) {
        this.b = ou0;
        this.c = interfaceC3129cK0;
        this.d = interfaceC3129cK1;
        this.e = i;
        this.f = i2;
        this.i = interfaceC6486s42;
        this.g = cls;
        this.h = c4227ha1;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        Object objF;
        OU0 ou0 = this.b;
        synchronized (ou0) {
            OU0.b bVar = ou0.b;
            InterfaceC0971Ff1 interfaceC0971Ff1B = (InterfaceC0971Ff1) ((ArrayDeque) bVar.b).poll();
            if (interfaceC0971Ff1B == null) {
                interfaceC0971Ff1B = bVar.b();
            }
            OU0.a aVar = (OU0.a) interfaceC0971Ff1B;
            aVar.b = 8;
            aVar.c = byte[].class;
            objF = ou0.f(aVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC6486s42<?> interfaceC6486s42 = this.i;
        if (interfaceC6486s42 != null) {
            interfaceC6486s42.b(messageDigest);
        }
        this.h.b(messageDigest);
        QU0<Class<?>, byte[]> qu0 = j;
        Class<?> cls = this.g;
        byte[] bArrA = qu0.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(InterfaceC3129cK0.a);
            qu0.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        ou0.h(bArr);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof C4297ht1) {
            C4297ht1 c4297ht1 = (C4297ht1) obj;
            if (this.f == c4297ht1.f && this.e == c4297ht1.e && C6177qc2.b(this.i, c4297ht1.i) && this.g.equals(c4297ht1.g) && this.c.equals(c4297ht1.c) && this.d.equals(c4297ht1.d) && this.h.equals(c4297ht1.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        InterfaceC6486s42<?> interfaceC6486s42 = this.i;
        if (interfaceC6486s42 != null) {
            iHashCode = (iHashCode * 31) + interfaceC6486s42.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
