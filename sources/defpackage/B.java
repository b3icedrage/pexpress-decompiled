package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B<A> implements InterfaceC1898Rc<A> {

    @NotNull
    public final C6661sv a;

    public B(@NotNull C6661sv protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.a = protocol;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> b(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.a.getClass();
        C5653o60 c5653o60 = C5653o60.d;
        ArrayList arrayList = new ArrayList(XE.m(c5653o60, 10));
        Iterator<E> it = c5653o60.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList c(@NotNull C4267hk1 proto, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.k(this.a.k);
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList e(@NotNull C4735jk1 proto, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.k(this.a.l);
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> f(@NotNull AbstractC6208qk1 container, @NotNull C2419Xj1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.k(this.a.h);
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> g(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.a.getClass();
        C5653o60 c5653o60 = C5653o60.d;
        ArrayList arrayList = new ArrayList(XE.m(c5653o60, 10));
        Iterator<E> it = c5653o60.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List h(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c callableProto, @NotNull EnumC0804Dc kind, int i, @NotNull C5155lk1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.k(this.a.j);
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List i(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c proto, @NotNull EnumC0804Dc kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z = proto instanceof C2575Zj1;
        C6661sv c6661sv = this.a;
        if (z) {
            c6661sv.getClass();
        } else {
            if (!(proto instanceof C3637ek1)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = kind.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            c6661sv.getClass();
        }
        C5653o60 c5653o60 = C5653o60.d;
        ArrayList arrayList = new ArrayList(XE.m(c5653o60, 10));
        Iterator<E> it = c5653o60.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List j(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c proto, @NotNull EnumC0804Dc kind) {
        List list;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z = proto instanceof C2155Uj1;
        C6661sv c6661sv = this.a;
        if (z) {
            list = (List) ((C2155Uj1) proto).k(c6661sv.b);
        } else if (proto instanceof C2575Zj1) {
            list = (List) ((C2575Zj1) proto).k(c6661sv.d);
        } else {
            if (!(proto instanceof C3637ek1)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((C3637ek1) proto).k(c6661sv.e);
            } else if (iOrdinal == 2) {
                list = (List) ((C3637ek1) proto).k(c6661sv.f);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C3637ek1) proto).k(c6661sv.g);
            }
        }
        if (list == null) {
            list = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList k(@NotNull AbstractC6208qk1.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Iterable iterable = (List) container.d.k(this.a.c);
        if (iterable == null) {
            iterable = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0960Fc) this).l((C1999Sj1) it.next(), container.a));
        }
        return arrayList;
    }
}
