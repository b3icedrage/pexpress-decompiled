package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class B62 extends AbstractC3062c1 {

    @NotNull
    public final QY0 b;

    public static final class a {
        @NotNull
        public static QY0 a(@NotNull Collection types, @NotNull String debugName) {
            QY0 c7093uz;
            Intrinsics.checkNotNullParameter(debugName, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(XE.m(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC4649jL0) it.next()).v());
            }
            C3558eN1 scopes = QD1.b(arrayList);
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            int i = scopes.d;
            if (i != 0) {
                c7093uz = i != 1 ? new C7093uz(debugName, (QY0[]) scopes.toArray(new QY0[0])) : (QY0) scopes.get(0);
            } else {
                c7093uz = QY0.b.b;
            }
            return scopes.d <= 1 ? c7093uz : new B62(c7093uz);
        }
    }

    public B62(QY0 qy0) {
        this.b = qy0;
    }

    @Override // defpackage.AbstractC3062c1, defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return C1738Pa1.a(super.b(name, location), C1017Fv.h);
    }

    @Override // defpackage.AbstractC3062c1, defpackage.QY0
    @NotNull
    public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return C1738Pa1.a(super.d(name, location), C0939Ev.g);
    }

    @Override // defpackage.AbstractC3062c1, defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<InterfaceC4675jU> collectionE = super.e(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionE) {
            if (((InterfaceC4675jU) obj) instanceof InterfaceC1335Jx) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.Q(C1738Pa1.a(arrayList, C8021zO0.h), arrayList2);
    }

    @Override // defpackage.AbstractC3062c1
    @NotNull
    public final QY0 i() {
        return this.b;
    }
}
