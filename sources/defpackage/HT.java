package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HT implements InterfaceC6145qT, InterfaceC2966bZ1, Sb2, InterfaceC2928bN<HT> {

    @NotNull
    public final C7929yx0 a;

    @NotNull
    public final C8139zx0 b;

    @NotNull
    public final C0712Bx0 c;

    @Nullable
    public String d;

    public HT() {
        this(0);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void A(@Nullable Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.Sb2
    public final void B(@Nullable Integer num) {
        this.c.b = num;
    }

    @Override // defpackage.Sb2
    public final void C(@Nullable Integer num) {
        this.c.d = num;
    }

    @Override // defpackage.InterfaceC2928bN
    public final HT a() {
        C7929yx0 c7929yx0 = this.a;
        C7929yx0 c7929yx1 = new C7929yx0(c7929yx0.a, c7929yx0.b, c7929yx0.c, c7929yx0.d);
        C8139zx0 c8139zx0 = this.b;
        C8139zx0 c8139zx1 = new C8139zx0(c8139zx0.a, c8139zx0.b, c8139zx0.c, c8139zx0.d, c8139zx0.e, c8139zx0.f);
        C0712Bx0 c0712Bx0 = this.c;
        return new HT(c7929yx1, c8139zx1, new C0712Bx0(c0712Bx0.a, c0712Bx0.b, c0712Bx0.c, c0712Bx0.d), this.d);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void b(@Nullable C3997gU c3997gU) {
        this.b.b(c3997gU);
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Q9 c() {
        return this.b.c;
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer d() {
        return this.c.b;
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void e(@Nullable Integer num) {
        this.b.b = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HT)) {
            return false;
        }
        HT ht = (HT) obj;
        return Intrinsics.a(ht.a, this.a) && Intrinsics.a(ht.b, this.b) && Intrinsics.a(ht.c, this.c) && Intrinsics.a(ht.d, this.d);
    }

    @Override // defpackage.InterfaceC6145qT
    public final void f(@Nullable Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer g() {
        return this.c.d;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer h() {
        return this.b.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        String str = this.d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void i(@Nullable Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer j() {
        return this.a.a;
    }

    @Override // defpackage.InterfaceC6145qT
    public final void k(@Nullable Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final C3997gU l() {
        return this.b.l();
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer m() {
        return this.b.b;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer n() {
        return this.a.d;
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void o(@Nullable Q9 q9) {
        this.b.c = q9;
    }

    @Override // defpackage.InterfaceC6145qT
    public final void p(@Nullable Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer q() {
        return this.c.c;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer r() {
        return this.a.c;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer s() {
        return this.a.b;
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void t(@Nullable Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.InterfaceC6145qT
    public final void u(@Nullable Integer num) {
        this.a.d = num;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer v() {
        return this.b.a;
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Boolean w() {
        return this.c.a;
    }

    @Override // defpackage.Sb2
    public final void x(@Nullable Boolean bool) {
        this.c.a = bool;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer y() {
        return this.b.e;
    }

    @Override // defpackage.Sb2
    public final void z(@Nullable Integer num) {
        this.c.c = num;
    }

    public HT(@NotNull C7929yx0 date, @NotNull C8139zx0 time, @NotNull C0712Bx0 offset, @Nullable String str) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.a = date;
        this.b = time;
        this.c = offset;
        this.d = str;
    }

    public /* synthetic */ HT(int i) {
        this(new C7929yx0(null, null, null, null), new C8139zx0(0), new C0712Bx0(null, null, null, null), null);
    }
}
