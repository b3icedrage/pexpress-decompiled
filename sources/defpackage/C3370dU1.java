package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3370dU1 extends RY0 {

    @NotNull
    public final S01 b;

    @NotNull
    public final C1758Ph0 c;

    public C3370dU1(@NotNull S01 moduleDescriptor, @NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.b = moduleDescriptor;
        this.c = fqName;
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(LY.h)) {
            return C5653o60.d;
        }
        C1758Ph0 c1758Ph0 = this.c;
        if (c1758Ph0.d()) {
            if (kindFilter.a.contains(KY.b.a)) {
                return C5653o60.d;
            }
        }
        S01 s01 = this.b;
        Collection<C1758Ph0> collectionO = s01.o(c1758Ph0, nameFilter);
        ArrayList arrayList = new ArrayList(collectionO.size());
        Iterator<C1758Ph0> it = collectionO.iterator();
        while (it.hasNext()) {
            C5638o21 name = it.next().f();
            Intrinsics.checkNotNullExpressionValue(name, "shortName(...)");
            if (nameFilter.invoke(name).booleanValue()) {
                Intrinsics.checkNotNullParameter(name, "name");
                InterfaceC5752ob1 interfaceC5752ob1 = null;
                if (!name.e) {
                    C1758Ph0 c1758Ph0C = c1758Ph0.c(name);
                    Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
                    InterfaceC5752ob1 interfaceC5752ob1A0 = s01.A0(c1758Ph0C);
                    if (!interfaceC5752ob1A0.isEmpty()) {
                        interfaceC5752ob1 = interfaceC5752ob1A0;
                    }
                }
                UE.b(arrayList, interfaceC5752ob1);
            }
        }
        return arrayList;
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> g() {
        return C6702t60.d;
    }

    @NotNull
    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
