package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC1784Pq;

/* JADX INFO: renamed from: Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1784Pq<T extends AbstractC1784Pq<T>> implements Cloneable {
    public int d;
    public int h;
    public boolean m;
    public boolean r;
    public Resources.Theme s;
    public boolean t;
    public boolean u;
    public boolean w;

    @NonNull
    public AbstractC2634a20 e = AbstractC2634a20.d;

    @NonNull
    public EnumC7035uh1 g = EnumC7035uh1.g;
    public boolean i = true;
    public int j = -1;
    public int k = -1;

    @NonNull
    public InterfaceC3129cK0 l = C6912u60.b;
    public boolean n = true;

    @NonNull
    public C4227ha1 o = new C4227ha1();

    @NonNull
    public C6667sx p = new C6667sx();

    @NonNull
    public Class<?> q = Object.class;
    public boolean v = true;

    public static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    public AbstractC1784Pq A() {
        if (this.t) {
            return clone().A();
        }
        this.i = false;
        this.d |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        x();
        return this;
    }

    @NonNull
    public T B(Resources.Theme theme) {
        if (this.t) {
            return (T) clone().B(theme);
        }
        this.s = theme;
        if (theme != null) {
            this.d |= 32768;
            return (T) y(C5185lt1.b, theme);
        }
        this.d &= -32769;
        return (T) w(C5185lt1.b);
    }

    @NonNull
    public AbstractC1784Pq C(@NonNull C5624nz c5624nz) {
        return F(c5624nz, true);
    }

    @NonNull
    public final AbstractC1784Pq E(@NonNull AbstractC6270r30.d dVar, @NonNull C5624nz c5624nz) {
        if (this.t) {
            return clone().E(dVar, c5624nz);
        }
        j(dVar);
        return C(c5624nz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T F(@NonNull InterfaceC6486s42<Bitmap> interfaceC6486s42, boolean z) {
        if (this.t) {
            return (T) clone().F(interfaceC6486s42, z);
        }
        L30 l30 = new L30(interfaceC6486s42, z);
        G(Bitmap.class, interfaceC6486s42, z);
        G(Drawable.class, l30, z);
        G(BitmapDrawable.class, l30, z);
        G(C0988Fl0.class, new C1144Hl0(interfaceC6486s42), z);
        x();
        return this;
    }

    @NonNull
    public final <Y> T G(@NonNull Class<Y> cls, @NonNull InterfaceC6486s42<Y> interfaceC6486s42, boolean z) {
        if (this.t) {
            return (T) clone().G(cls, interfaceC6486s42, z);
        }
        UE.d(interfaceC6486s42);
        this.p.put(cls, interfaceC6486s42);
        int i = this.d;
        this.n = true;
        this.d = 67584 | i;
        this.v = false;
        if (z) {
            this.d = i | 198656;
            this.m = true;
        }
        x();
        return this;
    }

    @NonNull
    public AbstractC1784Pq H() {
        if (this.t) {
            return clone().H();
        }
        this.w = true;
        this.d |= 1048576;
        x();
        return this;
    }

    @NonNull
    public T a(@NonNull AbstractC1784Pq<?> abstractC1784Pq) {
        if (this.t) {
            return (T) clone().a(abstractC1784Pq);
        }
        int i = abstractC1784Pq.d;
        if (k(abstractC1784Pq.d, 1048576)) {
            this.w = abstractC1784Pq.w;
        }
        if (k(abstractC1784Pq.d, 4)) {
            this.e = abstractC1784Pq.e;
        }
        if (k(abstractC1784Pq.d, 8)) {
            this.g = abstractC1784Pq.g;
        }
        if (k(abstractC1784Pq.d, 16)) {
            this.d &= -33;
        }
        if (k(abstractC1784Pq.d, 32)) {
            this.d &= -17;
        }
        if (k(abstractC1784Pq.d, 64)) {
            this.h = 0;
            this.d &= -129;
        }
        if (k(abstractC1784Pq.d, UserVerificationMethods.USER_VERIFY_PATTERN)) {
            this.h = abstractC1784Pq.h;
            this.d &= -65;
        }
        if (k(abstractC1784Pq.d, UserVerificationMethods.USER_VERIFY_HANDPRINT)) {
            this.i = abstractC1784Pq.i;
        }
        if (k(abstractC1784Pq.d, UserVerificationMethods.USER_VERIFY_NONE)) {
            this.k = abstractC1784Pq.k;
            this.j = abstractC1784Pq.j;
        }
        if (k(abstractC1784Pq.d, UserVerificationMethods.USER_VERIFY_ALL)) {
            this.l = abstractC1784Pq.l;
        }
        if (k(abstractC1784Pq.d, 4096)) {
            this.q = abstractC1784Pq.q;
        }
        if (k(abstractC1784Pq.d, 8192)) {
            this.d &= -16385;
        }
        if (k(abstractC1784Pq.d, 16384)) {
            this.d &= -8193;
        }
        if (k(abstractC1784Pq.d, 32768)) {
            this.s = abstractC1784Pq.s;
        }
        if (k(abstractC1784Pq.d, 65536)) {
            this.n = abstractC1784Pq.n;
        }
        if (k(abstractC1784Pq.d, 131072)) {
            this.m = abstractC1784Pq.m;
        }
        if (k(abstractC1784Pq.d, 2048)) {
            this.p.putAll(abstractC1784Pq.p);
            this.v = abstractC1784Pq.v;
        }
        if (k(abstractC1784Pq.d, 524288)) {
            this.u = abstractC1784Pq.u;
        }
        if (!this.n) {
            this.p.clear();
            int i2 = this.d;
            this.m = false;
            this.d = i2 & (-133121);
            this.v = true;
        }
        this.d |= abstractC1784Pq.d;
        this.o.b.j(abstractC1784Pq.o.b);
        x();
        return this;
    }

    @NonNull
    public T b() {
        if (this.r && !this.t) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.t = true;
        return (T) l();
    }

    @NonNull
    public T d() {
        return (T) E(AbstractC6270r30.c, new C5624nz());
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            C4227ha1 c4227ha1 = new C4227ha1();
            t.o = c4227ha1;
            c4227ha1.b.j(this.o.b);
            C6667sx c6667sx = new C6667sx();
            t.p = c6667sx;
            c6667sx.putAll(this.p);
            t.r = false;
            t.t = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1784Pq)) {
            return false;
        }
        AbstractC1784Pq abstractC1784Pq = (AbstractC1784Pq) obj;
        abstractC1784Pq.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = C6177qc2.a;
        return this.h == abstractC1784Pq.h && this.i == abstractC1784Pq.i && this.j == abstractC1784Pq.j && this.k == abstractC1784Pq.k && this.m == abstractC1784Pq.m && this.n == abstractC1784Pq.n && this.u == abstractC1784Pq.u && this.e.equals(abstractC1784Pq.e) && this.g == abstractC1784Pq.g && this.o.equals(abstractC1784Pq.o) && this.p.equals(abstractC1784Pq.p) && this.q.equals(abstractC1784Pq.q) && C6177qc2.b(this.l, abstractC1784Pq.l) && C6177qc2.b(this.s, abstractC1784Pq.s);
    }

    @NonNull
    public T g(@NonNull Class<?> cls) {
        if (this.t) {
            return (T) clone().g(cls);
        }
        this.q = cls;
        this.d |= 4096;
        x();
        return this;
    }

    @NonNull
    public T h(@NonNull AbstractC2634a20 abstractC2634a20) {
        if (this.t) {
            return (T) clone().h(abstractC2634a20);
        }
        UE.e(abstractC2634a20, "Argument must not be null");
        this.e = abstractC2634a20;
        this.d |= 4;
        x();
        return this;
    }

    public int hashCode() {
        char[] cArr = C6177qc2.a;
        return C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.g(this.u ? 1 : 0, C6177qc2.g(0, C6177qc2.g(this.n ? 1 : 0, C6177qc2.g(this.m ? 1 : 0, C6177qc2.g(this.k, C6177qc2.g(this.j, C6177qc2.g(this.i ? 1 : 0, C6177qc2.h(C6177qc2.g(0, C6177qc2.h(C6177qc2.g(this.h, C6177qc2.h(C6177qc2.g(0, C6177qc2.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.e), this.g), this.o), this.p), this.q), this.l), this.s);
    }

    @NonNull
    public T i() {
        if (this.t) {
            return (T) clone().i();
        }
        this.p.clear();
        int i = this.d;
        this.m = false;
        this.n = false;
        this.d = (i & (-133121)) | 65536;
        this.v = true;
        x();
        return this;
    }

    @NonNull
    public T j(@NonNull AbstractC6270r30 abstractC6270r30) {
        Z91 z91 = AbstractC6270r30.f;
        UE.e(abstractC6270r30, "Argument must not be null");
        return (T) y(z91, abstractC6270r30);
    }

    @NonNull
    public T l() {
        this.r = true;
        return this;
    }

    @NonNull
    public AbstractC1784Pq m() {
        if (this.t) {
            return clone().m();
        }
        this.u = true;
        this.d |= 524288;
        x();
        return this;
    }

    @NonNull
    public T n() {
        return (T) r(AbstractC6270r30.c, new C5624nz());
    }

    @NonNull
    public T o() {
        T t = (T) r(AbstractC6270r30.b, new C5834oz());
        t.v = true;
        return t;
    }

    @NonNull
    public T p() {
        T t = (T) r(AbstractC6270r30.a, new C1512Me0());
        t.v = true;
        return t;
    }

    @NonNull
    public final AbstractC1784Pq r(@NonNull AbstractC6270r30 abstractC6270r30, @NonNull AbstractC1242Is abstractC1242Is) {
        if (this.t) {
            return clone().r(abstractC6270r30, abstractC1242Is);
        }
        j(abstractC6270r30);
        return F(abstractC1242Is, false);
    }

    @NonNull
    public T s(int i, int i2) {
        if (this.t) {
            return (T) clone().s(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.d |= UserVerificationMethods.USER_VERIFY_NONE;
        x();
        return this;
    }

    @NonNull
    public T t(int i) {
        if (this.t) {
            return (T) clone().t(i);
        }
        this.h = i;
        this.d = (this.d | UserVerificationMethods.USER_VERIFY_PATTERN) & (-65);
        x();
        return this;
    }

    @NonNull
    public T v(@NonNull EnumC7035uh1 enumC7035uh1) {
        if (this.t) {
            return (T) clone().v(enumC7035uh1);
        }
        UE.e(enumC7035uh1, "Argument must not be null");
        this.g = enumC7035uh1;
        this.d |= 8;
        x();
        return this;
    }

    public final T w(@NonNull Z91<?> z91) {
        if (this.t) {
            return (T) clone().w(z91);
        }
        this.o.b.remove(z91);
        x();
        return this;
    }

    @NonNull
    public final void x() {
        if (this.r) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @NonNull
    public <Y> T y(@NonNull Z91<Y> z91, @NonNull Y y) {
        if (this.t) {
            return (T) clone().y(z91, y);
        }
        UE.d(z91);
        UE.d(y);
        this.o.b.put(z91, y);
        x();
        return this;
    }

    @NonNull
    public T z(@NonNull InterfaceC3129cK0 interfaceC3129cK0) {
        if (this.t) {
            return (T) clone().z(interfaceC3129cK0);
        }
        this.l = interfaceC3129cK0;
        this.d |= UserVerificationMethods.USER_VERIFY_ALL;
        x();
        return this;
    }
}
