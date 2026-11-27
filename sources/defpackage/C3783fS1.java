package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3783fS1 implements VG0, D60, GH {

    @NotNull
    public final C7789yH a;

    @NotNull
    public final AbstractC5267mG0 b;

    @NotNull
    public final EnumC3852fl2 c;

    @Nullable
    public final VG0[] d;

    @NotNull
    public final WH1 e;

    @NotNull
    public final C7577xG0 f;
    public boolean g;

    @Nullable
    public String h;

    public C3783fS1(@NotNull C7789yH composer, @NotNull AbstractC5267mG0 json, @NotNull EnumC3852fl2 mode, @Nullable VG0[] vg0Arr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.a = composer;
        this.b = json;
        this.c = mode;
        this.d = vg0Arr;
        this.e = json.b;
        this.f = json.a;
        int iOrdinal = mode.ordinal();
        if (vg0Arr != null) {
            VG0 vg0 = vg0Arr[iOrdinal];
            if (vg0 == null && vg0 == this) {
                return;
            }
            vg0Arr[iOrdinal] = this;
        }
    }

    @Override // defpackage.GH
    @NotNull
    public final D60 A(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        return m(descriptor.i(i));
    }

    @Override // defpackage.D60
    public final void B(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.h(value);
    }

    @NotNull
    public final GH C(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return c(descriptor);
    }

    public final void D(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iOrdinal = this.c.ordinal();
        boolean z = true;
        C7789yH c7789yH = this.a;
        if (iOrdinal == 1) {
            if (!c7789yH.b) {
                c7789yH.c(',');
            }
            c7789yH.a();
            return;
        }
        if (iOrdinal == 2) {
            if (c7789yH.b) {
                this.g = true;
                c7789yH.a();
                return;
            }
            if (i % 2 == 0) {
                c7789yH.c(',');
                c7789yH.a();
            } else {
                c7789yH.c(':');
                c7789yH.i();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.g = true;
            }
            if (i == 1) {
                c7789yH.c(',');
                c7789yH.i();
                this.g = false;
                return;
            }
            return;
        }
        if (!c7789yH.b) {
            c7789yH.c(',');
        }
        c7789yH.a();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        AbstractC5267mG0 json = this.b;
        Intrinsics.checkNotNullParameter(json, "json");
        C4847kH0.c(json, descriptor);
        B(descriptor.f(i));
        c7789yH.c(':');
        c7789yH.i();
    }

    @Override // defpackage.D60
    @NotNull
    public final G1 a() {
        return this.e;
    }

    @Override // defpackage.GH
    public final void b(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC3852fl2 enumC3852fl2 = this.c;
        C7789yH c7789yH = this.a;
        c7789yH.getClass();
        c7789yH.b = false;
        c7789yH.c(enumC3852fl2.e);
    }

    @Override // defpackage.D60
    @NotNull
    public final GH c(@NotNull MH1 descriptor) {
        VG0 vg0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC5267mG0 abstractC5267mG0 = this.b;
        EnumC3852fl2 enumC3852fl2B = C4062gl2.b(abstractC5267mG0, descriptor);
        C7789yH c7789yH = this.a;
        c7789yH.c(enumC3852fl2B.d);
        c7789yH.b = true;
        if (this.h != null) {
            c7789yH.a();
            String str = this.h;
            Intrinsics.checkNotNull(str);
            B(str);
            c7789yH.c(':');
            B(descriptor.a());
            this.h = null;
        }
        if (this.c == enumC3852fl2B) {
            return this;
        }
        VG0[] vg0Arr = this.d;
        return (vg0Arr == null || (vg0 = vg0Arr[enumC3852fl2B.ordinal()]) == null) ? new C3783fS1(c7789yH, abstractC5267mG0, enumC3852fl2B, vg0Arr) : vg0;
    }

    @Override // defpackage.GH
    public final void d(@NotNull C4933kh1 descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        g(d);
    }

    @Override // defpackage.D60
    public final void e() {
        this.a.f("null");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    @Override // defpackage.D60
    public final <T> void f(@NotNull RJ0 serializer, T t) {
        String strA;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        AbstractC5267mG0 abstractC5267mG0 = this.b;
        C7577xG0 c7577xG0 = abstractC5267mG0.a;
        boolean z = serializer instanceof T0;
        if (!z) {
            int iOrdinal = c7577xG0.j.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    VH1 vh1H = serializer.c().h();
                    strA = (Intrinsics.a(vh1H, RS1.a.a) || Intrinsics.a(vh1H, RS1.d.a)) ? C7658xf1.a(abstractC5267mG0, serializer.c()) : null;
                } else if (iOrdinal != 2) {
                    throw new C6489s51();
                }
            }
        } else if (c7577xG0.j != LC.d) {
        }
        if (z) {
            T0 t0 = (T0) serializer;
            if (t == null) {
                throw new IllegalArgumentException(("Value for serializer " + ((C8078zf1) serializer).c() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            serializer = C3057c.f(t0, this, t);
            VH1 kind = serializer.c().h();
            Intrinsics.checkNotNullParameter(kind, "kind");
            if (kind instanceof VH1.b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof AbstractC5356mh1) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof AbstractC7448wf1) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
        }
        if (strA != null) {
            this.h = strA;
        }
        serializer.a(this, t);
    }

    @Override // defpackage.D60
    public final void g(double d) {
        boolean z = this.g;
        C7789yH c7789yH = this.a;
        if (z) {
            B(String.valueOf(d));
        } else {
            c7789yH.a.c(String.valueOf(d));
        }
        if (this.f.h) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw C1874Qu.b(Double.valueOf(d), c7789yH.a.toString());
        }
    }

    @Override // defpackage.D60
    public final void h(short s) {
        if (this.g) {
            B(String.valueOf((int) s));
        } else {
            this.a.g(s);
        }
    }

    @Override // defpackage.GH
    public final void i(@NotNull MH1 descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        y(i2);
    }

    @Override // defpackage.GH
    public final void j(@NotNull MH1 descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        z(j);
    }

    @Override // defpackage.D60
    public final void k(byte b) {
        if (this.g) {
            B(String.valueOf((int) b));
        } else {
            this.a.b(b);
        }
    }

    @Override // defpackage.D60
    public final void l(boolean z) {
        if (this.g) {
            B(String.valueOf(z));
        } else {
            this.a.a.c(String.valueOf(z));
        }
    }

    @Override // defpackage.D60
    @NotNull
    public final D60 m(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean zA = C3993gS1.a(descriptor);
        EnumC3852fl2 enumC3852fl2 = this.c;
        AbstractC5267mG0 abstractC5267mG0 = this.b;
        C7789yH c7999zH = this.a;
        if (zA) {
            if (!(c7999zH instanceof AH)) {
                c7999zH = new AH(c7999zH.a, this.g);
            }
            return new C3783fS1(c7999zH, abstractC5267mG0, enumC3852fl2, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (!descriptor.m() || !descriptor.equals(MG0.a)) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return this;
        }
        if (!(c7999zH instanceof C7999zH)) {
            c7999zH = new C7999zH(c7999zH.a, this.g);
        }
        return new C3783fS1(c7999zH, abstractC5267mG0, enumC3852fl2, null);
    }

    @Override // defpackage.GH
    public final void n(@NotNull MH1 descriptor, int i, @NotNull RJ0 serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        D(descriptor, i);
        f(serializer, obj);
    }

    @Override // defpackage.D60
    public final void o(float f) {
        boolean z = this.g;
        C7789yH c7789yH = this.a;
        if (z) {
            B(String.valueOf(f));
        } else {
            c7789yH.a.c(String.valueOf(f));
        }
        if (this.f.h) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw C1874Qu.b(Float.valueOf(f), c7789yH.a.toString());
        }
    }

    @Override // defpackage.GH
    public final void p(@NotNull C6188qf1 descriptor, int i, @NotNull RJ0 serializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f.e) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            D(descriptor, i);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.c().c()) {
                f(serializer, obj);
            } else if (obj == null) {
                e();
            } else {
                f(serializer, obj);
            }
        }
    }

    @Override // defpackage.GH
    public final void q(@NotNull C4933kh1 descriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        k(b);
    }

    @Override // defpackage.D60
    public final void r(char c) {
        B(String.valueOf(c));
    }

    @Override // defpackage.GH
    public final void s(@NotNull C4933kh1 descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        o(f);
    }

    @Override // defpackage.D60
    public final void t(@NotNull MH1 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        B(enumDescriptor.f(i));
    }

    @Override // defpackage.GH
    public final void u(@NotNull C4933kh1 descriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        h(s);
    }

    @Override // defpackage.GH
    public final void v(@NotNull C4933kh1 descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        l(z);
    }

    @Override // defpackage.GH
    public final void w(@NotNull MH1 descriptor, int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        D(descriptor, i);
        B(value);
    }

    @Override // defpackage.GH
    public final void x(@NotNull C4933kh1 descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D(descriptor, i);
        r(c);
    }

    @Override // defpackage.D60
    public final void y(int i) {
        if (this.g) {
            B(String.valueOf(i));
        } else {
            this.a.d(i);
        }
    }

    @Override // defpackage.D60
    public final void z(long j) {
        if (this.g) {
            B(String.valueOf(j));
        } else {
            this.a.e(j);
        }
    }
}
