package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class P9<T> implements InterfaceC7750y51<T> {

    @NotNull
    public final PH a;

    @NotNull
    public final ArrayList b;

    public P9(@NotNull PH mainFormat, @NotNull ArrayList formats) {
        Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.a = mainFormat;
        this.b = formats;
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        C5653o60 c5653o60 = C5653o60.d;
        CQ0 cq0B = VE.b();
        cq0B.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            cq0B.add(((InterfaceC1132Hh0) it.next()).b());
        }
        return new C7436wc1<>(c5653o60, VE.a(cq0B));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof P9)) {
            return false;
        }
        P9 p9 = (P9) obj;
        return this.a.equals(p9.a) && this.b.equals(p9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
