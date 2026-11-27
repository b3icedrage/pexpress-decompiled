package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class PH<T> implements InterfaceC1132Hh0<T> {

    @NotNull
    public final ArrayList a;

    public PH(@NotNull ArrayList formats) {
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.a = formats;
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public InterfaceC1210Ih0<T> a() {
        ArrayList arrayList = this.a;
        ArrayList formatters = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            formatters.add(((InterfaceC7750y51) it.next()).a());
        }
        if (formatters.size() == 1) {
            return (InterfaceC1210Ih0) CollectionsKt.U(formatters);
        }
        Intrinsics.checkNotNullParameter(formatters, "formatters");
        return new QH();
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public C7436wc1<T> b() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC7750y51) it.next()).b());
        }
        return UE.h(arrayList2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof PH) {
            return Intrinsics.a(this.a, ((PH) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.e(new StringBuilder("ConcatenatedFormatStructure("), CollectionsKt.J(this.a, ", ", null, null, null, 62), ')');
    }
}
