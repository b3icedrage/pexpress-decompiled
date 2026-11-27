package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IH implements InterfaceC2973bb1 {

    @NotNull
    public final List<InterfaceC2548Za1> a;

    @NotNull
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public IH(@NotNull List<? extends InterfaceC2548Za1> providers, @NotNull String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.a = providers;
        this.b = debugName;
        providers.size();
        CollectionsKt.h0(providers).size();
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final List<InterfaceC2392Xa1> a(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC2548Za1> it = this.a.iterator();
        while (it.hasNext()) {
            C5027l8.i(it.next(), fqName, arrayList);
        }
        return CollectionsKt.e0(arrayList);
    }

    @Override // defpackage.InterfaceC2973bb1
    public final boolean b(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<InterfaceC2548Za1> list = this.a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C5027l8.s((InterfaceC2548Za1) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC2973bb1
    public final void c(@NotNull C1758Ph0 fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator<InterfaceC2548Za1> it = this.a.iterator();
        while (it.hasNext()) {
            C5027l8.i(it.next(), fqName, packageFragments);
        }
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final Collection<C1758Ph0> o(@NotNull C1758Ph0 fqName, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC2548Za1> it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().o(fqName, nameFilter));
        }
        return hashSet;
    }

    @NotNull
    public final String toString() {
        return this.b;
    }
}
