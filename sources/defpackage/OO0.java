package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OO0 implements Function1 {
    public final QO0 d;

    public OO0(QO0 qo0) {
        this.d = qo0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [Cj1, HE0, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [Cj1, T] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        C5638o21 name = (C5638o21) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        QO0 qo0 = this.d;
        FO0 fo0 = qo0.c;
        if (fo0 != null) {
            return fo0.g.invoke(name);
        }
        InterfaceC6520sE0 interfaceC6520sE0D = qo0.e.invoke().d(name);
        if (interfaceC6520sE0D == null || interfaceC6520sE0D.G()) {
            return null;
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        boolean z = !interfaceC6520sE0D.b();
        LO0 lo0 = qo0.b;
        C6970uO0 c6970uO0H = C3043bv.h(lo0, interfaceC6520sE0D);
        InterfaceC4675jU interfaceC4675jUQ = qo0.q();
        C01.a aVar = C01.d;
        AbstractC5533nZ abstractC5533nZA = Hc2.a(interfaceC6520sE0D.d());
        C5638o21 name2 = interfaceC6520sE0D.getName();
        KE0 ke0 = lo0.a;
        ?? B1 = HE0.b1(interfaceC4675jUQ, c6970uO0H, abstractC5533nZA, z, name2, ke0.j.a(interfaceC6520sE0D), interfaceC6520sE0D.b() && interfaceC6520sE0D.i());
        Intrinsics.checkNotNullExpressionValue(B1, "create(...)");
        c3027bp1.d = B1;
        B1.Y0(null, null, null, null);
        AbstractC4649jL0 abstractC4649jL0D = lo0.e.d(interfaceC6520sE0D.getType(), C3686f.q(EnumC2880b72.e, false, null, 7));
        if ((RK0.G(abstractC4649jL0D) || RK0.H(abstractC4649jL0D)) && interfaceC6520sE0D.b()) {
            interfaceC6520sE0D.i();
        }
        C0749Cj1 c0749Cj1 = (C0749Cj1) c3027bp1.d;
        C5653o60 c5653o60 = C5653o60.d;
        c0749Cj1.a1(abstractC4649jL0D, c5653o60, qo0.p(), null, c5653o60);
        InterfaceC4675jU interfaceC4675jUQ2 = qo0.q();
        FC fc = interfaceC4675jUQ2 instanceof FC ? (FC) interfaceC4675jUQ2 : null;
        if (fc != null) {
            ?? r9 = (C0749Cj1) c3027bp1.d;
            ke0.x.d(fc, r9, lo0);
            c3027bp1.d = r9;
        }
        Object obj2 = c3027bp1.d;
        InterfaceC2982bd2 interfaceC2982bd2 = (InterfaceC2982bd2) obj2;
        AbstractC4649jL0 type = ((C0749Cj1) obj2).getType();
        if (interfaceC2982bd2 == null) {
            C4432iZ.a(66);
            throw null;
        }
        if (type == null) {
            C4432iZ.a(67);
            throw null;
        }
        int i2 = C4432iZ.a;
        if (!interfaceC2982bd2.p0() && !C3686f.n(type)) {
            if (C3089c72.b(type)) {
                ((C0749Cj1) c3027bp1.d).U0(null, new MO0(qo0, interfaceC6520sE0D, c3027bp1, i));
            } else {
                RK0 rk0E = C4900kZ.e(interfaceC2982bd2);
                if (RK0.G(type)) {
                    ((C0749Cj1) c3027bp1.d).U0(null, new MO0(qo0, interfaceC6520sE0D, c3027bp1, i));
                } else {
                    C7115v41 c7115v41 = InterfaceC4859kL0.a;
                    if (c7115v41.c(rk0E.u(), type) || c7115v41.c(rk0E.j("Number").y(), type) || c7115v41.c(rk0E.e(), type) || C7977z92.a(type)) {
                        ((C0749Cj1) c3027bp1.d).U0(null, new MO0(qo0, interfaceC6520sE0D, c3027bp1, i));
                    }
                }
            }
        }
        InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) c3027bp1.d;
        ke0.g.getClass();
        if (interfaceC0671Bj1 != null) {
            return (InterfaceC0671Bj1) c3027bp1.d;
        }
        Object[] objArr = new Object[3];
        switch (6) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (6) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
