package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KO0 extends UO0 {

    @NotNull
    public final FE0 n;

    @NotNull
    public final GO0 o;

    @NotNull
    public final InterfaceC5868p71<Set<String>> p;

    @NotNull
    public final VY0<a, FC> q;

    public static final class a {

        @NotNull
        public final C5638o21 a;

        @Nullable
        public final InterfaceC2902bE0 b;

        public a(@NotNull C5638o21 name, @Nullable InterfaceC2902bE0 interfaceC2902bE0) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.a = name;
            this.b = interfaceC2902bE0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                return Intrinsics.a(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static abstract class b {

        public static final class a extends b {

            @NotNull
            public final FC a;

            public a(@NotNull FC descriptor) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.a = descriptor;
            }
        }

        /* JADX INFO: renamed from: KO0$b$b, reason: collision with other inner class name */
        public static final class C0074b extends b {

            @NotNull
            public static final C0074b a = new C0074b();
        }

        public static final class c extends b {

            @NotNull
            public static final c a = new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KO0(@NotNull LO0 c, @NotNull FE0 jPackage, @NotNull GO0 ownerDescriptor) {
        super(c);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.n = jPackage;
        this.o = ownerDescriptor;
        C2720aS0 c2720aS0 = c.a.a;
        IO0 io0 = new IO0(this, c);
        c2720aS0.getClass();
        this.p = new C2720aS0.f(c2720aS0, io0);
        this.q = c2720aS0.f(new JO0(this, c));
    }

    @Override // defpackage.QO0, defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return C5653o60.d;
    }

    @Override // defpackage.QO0, defpackage.RY0, defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(LY.l | LY.e)) {
            return C5653o60.d;
        }
        Collection<InterfaceC4675jU> collectionInvoke = this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            InterfaceC4675jU interfaceC4675jU = (InterfaceC4675jU) obj;
            if (interfaceC4675jU instanceof FC) {
                C5638o21 name = ((FC) interfaceC4675jU).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    public final InterfaceC5044lD f(C5638o21 name, JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return v(name, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.QO0
    @NotNull
    public final Set h(@NotNull LY kindFilter, @Nullable QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.a(LY.e)) {
            return C6702t60.d;
        }
        Set<String> setInvoke = this.p.invoke();
        Function1 function1 = qy;
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(C5638o21.k((String) it.next()));
            }
            return hashSet;
        }
        if (qy == null) {
            function1 = C3846fk0.e;
        }
        C5653o60<InterfaceC2902bE0> c5653o60R = this.n.r(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC2902bE0 interfaceC2902bE0 : c5653o60R) {
            interfaceC2902bE0.getClass();
            OP0[] op0Arr = OP0.d;
            C5638o21 name = interfaceC2902bE0.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set i(@NotNull LY kindFilter, @Nullable QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return C6702t60.d;
    }

    @Override // defpackage.QO0
    @NotNull
    public final InterfaceC6148qU k() {
        return InterfaceC6148qU.a.a;
    }

    @Override // defpackage.QO0
    public final void m(@NotNull LinkedHashSet result, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set o(@NotNull LY kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return C6702t60.d;
    }

    @Override // defpackage.QO0
    public final InterfaceC4675jU q() {
        return this.o;
    }

    public final FC v(C5638o21 name, InterfaceC2902bE0 interfaceC2902bE0) {
        C5638o21 c5638o21 = C6761tO1.a;
        Intrinsics.checkNotNullParameter(name, "name");
        String strE = name.e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        if (strE.length() <= 0 || name.e) {
            return null;
        }
        Set<String> setInvoke = this.p.invoke();
        if (interfaceC2902bE0 == null && setInvoke != null && !setInvoke.contains(name.e())) {
            return null;
        }
        return this.q.invoke(new a(name, interfaceC2902bE0));
    }

    public final C7793yI0 w() {
        return C5027l8.t(this.b.a.d.c().c);
    }
}
