package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7093uz implements QY0 {

    @NotNull
    public final String b;

    @NotNull
    public final QY0[] c;

    /* JADX INFO: renamed from: uz$a */
    public static final class a {
        @NotNull
        public static QY0 a(@NotNull String debugName, @NotNull List scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            C3558eN1 scopes2 = new C3558eN1();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                QY0 qy0 = (QY0) it.next();
                if (qy0 != QY0.b.b) {
                    if (qy0 instanceof C7093uz) {
                        C2904bF.p(scopes2, ((C7093uz) qy0).c);
                    } else {
                        scopes2.add(qy0);
                    }
                }
            }
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes2, "scopes");
            int i = scopes2.d;
            if (i != 0) {
                return i != 1 ? new C7093uz(debugName, (QY0[]) scopes2.toArray(new QY0[0])) : (QY0) scopes2.get(0);
            }
            return QY0.b.b;
        }
    }

    public C7093uz(String str, QY0[] qy0Arr) {
        this.b = str;
        this.c = qy0Arr;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (QY0 qy0 : this.c) {
            C2904bF.o(linkedHashSet, qy0.a());
        }
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        QY0[] qy0Arr = this.c;
        int length = qy0Arr.length;
        if (length == 0) {
            return C5653o60.d;
        }
        if (length == 1) {
            return qy0Arr[0].b(name, location);
        }
        Collection collectionA = null;
        for (QY0 qy0 : qy0Arr) {
            collectionA = QD1.a(collectionA, qy0.b(name, location));
        }
        return collectionA == null ? C6702t60.d : collectionA;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (QY0 qy0 : this.c) {
            C2904bF.o(linkedHashSet, qy0.c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        QY0[] qy0Arr = this.c;
        int length = qy0Arr.length;
        if (length == 0) {
            return C5653o60.d;
        }
        if (length == 1) {
            return qy0Arr[0].d(name, location);
        }
        Collection<InterfaceC3765fM1> collectionA = null;
        for (QY0 qy0 : qy0Arr) {
            collectionA = QD1.a(collectionA, qy0.d(name, location));
        }
        return collectionA == null ? C6702t60.d : collectionA;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        QY0[] qy0Arr = this.c;
        int length = qy0Arr.length;
        if (length == 0) {
            return C5653o60.d;
        }
        if (length == 1) {
            return qy0Arr[0].e(kindFilter, nameFilter);
        }
        Collection<InterfaceC4675jU> collectionA = null;
        for (QY0 qy0 : qy0Arr) {
            collectionA = QD1.a(collectionA, qy0.e(kindFilter, nameFilter));
        }
        return collectionA == null ? C6702t60.d : collectionA;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC5044lD interfaceC5044lD = null;
        for (QY0 qy0 : this.c) {
            InterfaceC5044lD interfaceC5044lDF = qy0.f(name, location);
            if (interfaceC5044lDF != null) {
                if (!(interfaceC5044lDF instanceof InterfaceC5257mD) || !((GY0) interfaceC5044lDF).Q()) {
                    return interfaceC5044lDF;
                }
                if (interfaceC5044lD == null) {
                    interfaceC5044lD = interfaceC5044lDF;
                }
            }
        }
        return interfaceC5044lD;
    }

    @Override // defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        return SY0.a(C1526Mj.h(this.c));
    }

    @NotNull
    public final String toString() {
        return this.b;
    }
}
