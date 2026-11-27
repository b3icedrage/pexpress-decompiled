package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: da1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3388da1<T> implements InterfaceC7750y51<T> {

    @NotNull
    public final String a;

    @NotNull
    public final PH b;

    @NotNull
    public final ArrayList c;

    /* JADX INFO: renamed from: da1$a */
    public static final class a<T, E> {

        @NotNull
        public final InterfaceC6475s2<T, E> a;
        public final E b;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6475s2 interfaceC6475s2, Object obj) {
            this.a = interfaceC6475s2;
            this.b = obj;
        }
    }

    /* JADX INFO: renamed from: da1$b */
    public /* synthetic */ class b extends C2784ak0 implements Function1<T, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((InterfaceC5139lg1) this.e).test(obj));
        }
    }

    /* JADX INFO: renamed from: da1$c */
    public /* synthetic */ class c extends C2784ak0 implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            ((C6490s52) this.e).getClass();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: da1$d */
    public static final class d extends ML0 implements Function1<T, Unit> {
        public final /* synthetic */ C3388da1<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C3388da1<? super T> c3388da1) {
            super(1);
            this.d = c3388da1;
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(java.lang.Object r4) {
            /*
                r3 = this;
                da1<T> r0 = r3.d
                java.util.ArrayList r0 = r0.c
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                da1$a r1 = (defpackage.C3388da1.a) r1
                s2<T, E> r2 = r1.a
                E r1 = r1.b
                r2.c(r4, r1)
                goto L8
            L1c:
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3388da1.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C3388da1(@NotNull String onZero, @NotNull PH format) {
        Intrinsics.checkNotNullParameter(onZero, "onZero");
        Intrinsics.checkNotNullParameter(format, "format");
        this.a = onZero;
        this.b = format;
        CQ0 cq0B = VE.b();
        C3057c.b(cq0B, format);
        CQ0 cq0A = VE.a(cq0B);
        ArrayList arrayList = new ArrayList(XE.m(cq0A, 10));
        ListIterator listIterator = cq0A.listIterator(0);
        while (true) {
            CQ0.c cVar = (CQ0.c) listIterator;
            if (!cVar.hasNext()) {
                break;
            } else {
                arrayList.add(((InterfaceC7014uc0) cVar.next()).c());
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        List<InterfaceC0883Ec0> listE0 = CollectionsKt.e0(CollectionsKt.g0(arrayList));
        ArrayList arrayList2 = new ArrayList(XE.m(listE0, 10));
        for (InterfaceC0883Ec0 field : listE0) {
            Intrinsics.checkNotNullParameter(field, "field");
            Object objA = field.a();
            if (objA == null) {
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }
            arrayList2.add(new a(field.b(), objA));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final InterfaceC1210Ih0<T> a() {
        InterfaceC1210Ih0<T> interfaceC1210Ih0A = this.b.a();
        ArrayList<a> arrayList = this.c;
        ArrayList predicates = new ArrayList(XE.m(arrayList, 10));
        for (a aVar : arrayList) {
            predicates.add(new AG(aVar.b, new C3178ca1(1, aVar.a, InterfaceC6475s2.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
        }
        Intrinsics.checkNotNullParameter(predicates, "predicates");
        Object c5695oJ = predicates.isEmpty() ? C6490s52.a : predicates.size() == 1 ? (InterfaceC5139lg1) CollectionsKt.U(predicates) : new C5695oJ(predicates);
        boolean z = c5695oJ instanceof C6490s52;
        String string = this.a;
        if (z) {
            Intrinsics.checkNotNullParameter(string, "string");
            return new BK();
        }
        b bVar = new b(1, c5695oJ, InterfaceC5139lg1.class, "test", "test(Ljava/lang/Object;)Z", 0);
        Intrinsics.checkNotNullParameter(string, "string");
        return new C2689aI(WE.f(new Pair(bVar, new BK()), new Pair(new c(1, C6490s52.a, C6490s52.class, "test", "test(Ljava/lang/Object;)Z", 0), interfaceC1210Ih0A)));
    }

    @Override // defpackage.InterfaceC1132Hh0
    @NotNull
    public final C7436wc1<T> b() {
        C5653o60 c5653o60 = C5653o60.d;
        return new C7436wc1<>(c5653o60, WE.f(this.b.b(), UE.h(WE.f(new C8008zK(this.a).b(), new C7436wc1(this.c.isEmpty() ? c5653o60 : VE.c(new C7132v82(new d(this))), c5653o60)))));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3388da1)) {
            return false;
        }
        C3388da1 c3388da1 = (C3388da1) obj;
        return this.a.equals(c3388da1.a) && this.b.equals(c3388da1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
