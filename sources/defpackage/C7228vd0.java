package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7228vd0 implements InterfaceC2396Xc {

    @NotNull
    public final InterfaceC2396Xc d;

    @NotNull
    public final W62 e;

    public C7228vd0() {
        throw null;
    }

    public C7228vd0(@NotNull InterfaceC2396Xc delegate, @NotNull W62 fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.d = delegate;
        this.e = fqNameFilter;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.e.invoke(fqName)).booleanValue()) {
            return this.d.P(fqName);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        InterfaceC2396Xc interfaceC2396Xc = this.d;
        if ((interfaceC2396Xc instanceof Collection) && ((Collection) interfaceC2396Xc).isEmpty()) {
            return false;
        }
        Iterator<InterfaceC1583Nc> it = interfaceC2396Xc.iterator();
        while (it.hasNext()) {
            C1758Ph0 c1758Ph0C = it.next().c();
            if (c1758Ph0C != null && ((Boolean) this.e.invoke(c1758Ph0C)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1583Nc interfaceC1583Nc : this.d) {
            C1758Ph0 c1758Ph0C = interfaceC1583Nc.c();
            if (c1758Ph0C != null && ((Boolean) this.e.invoke(c1758Ph0C)).booleanValue()) {
                arrayList.add(interfaceC1583Nc);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.InterfaceC2396Xc
    @Nullable
    public final InterfaceC1583Nc p(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.e.invoke(fqName)).booleanValue()) {
            return this.d.p(fqName);
        }
        return null;
    }
}
