package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class QJ0 {
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Type inference failed for: r0v34, types: [fO0, java.lang.Object] */
    public static final InterfaceC2355Wx a(OJ0.a aVar, boolean z) {
        AbstractC7373wI0.e eVar;
        Method method;
        InterfaceC2355Wx aVar2;
        FI0.b bVar;
        InterfaceC2355Wx cVar;
        Method unboxMethod;
        if (AbstractC5906pJ0.d.d(aVar.v().k)) {
            return SY1.a;
        }
        QC qc = DB1.a;
        EI0 ei0B = DB1.b(aVar.v().o());
        if (ei0B instanceof EI0.c) {
            EI0.c cVar2 = (EI0.c) ei0B;
            Method methodK = null;
            FI0.c cVar3 = cVar2.c;
            if (z) {
                if ((cVar3.e & 4) == 4) {
                    bVar = cVar3.i;
                } else {
                    bVar = null;
                }
            } else if ((cVar3.e & 8) == 8) {
                bVar = cVar3.j;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                AbstractC5906pJ0 abstractC5906pJ0 = aVar.v().i;
                int i = bVar.g;
                InterfaceC5848p21 interfaceC5848p21 = cVar2.d;
                methodK = abstractC5906pJ0.k(interfaceC5848p21.getString(i), interfaceC5848p21.getString(bVar.h));
            }
            if (methodK != null) {
                if (!Modifier.isStatic(methodK.getModifiers())) {
                    cVar = aVar.t() ? new AbstractC2615Zx.g.a(methodK, d(aVar)) : new AbstractC2615Zx.g.e(methodK);
                } else if (aVar.v().o().k().P(C7437wc2.a)) {
                    cVar = aVar.t() ? new AbstractC2615Zx.g.b(methodK) : new AbstractC2615Zx.g.f(methodK);
                } else {
                    cVar = aVar.t() ? new AbstractC2615Zx.g.c(methodK, d(aVar)) : new AbstractC2615Zx.g.C0212g(methodK);
                }
                aVar2 = cVar;
            } else if (C7138vA0.e(aVar.v().o()) && Intrinsics.a(aVar.v().o().d(), C5323mZ.d)) {
                Class clsA = N7.A(aVar.v().o().e());
                if (clsA == null || (unboxMethod = N7.n(clsA, aVar.v().o())) == null) {
                    throw new C3761fL0("Underlying property of inline class " + aVar.v() + " should have a field");
                }
                if (aVar.t()) {
                    aVar2 = new AbstractC2896bC0.a(unboxMethod, d(aVar));
                } else {
                    Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
                    aVar2 = new AbstractC2896bC0.b(unboxMethod, VE.c(unboxMethod.getDeclaringClass()));
                }
            } else {
                Field field = (Field) aVar.v().m.getValue();
                if (field == null) {
                    throw new C3761fL0("No accessors or field is found for property " + aVar.v());
                }
                aVar2 = b(aVar, z, field);
            }
        } else if (ei0B instanceof EI0.a) {
            aVar2 = b(aVar, z, ((EI0.a) ei0B).a);
        } else {
            if (!(ei0B instanceof EI0.b)) {
                if (!(ei0B instanceof EI0.d)) {
                    throw new C6489s51();
                }
                if (z) {
                    eVar = ((EI0.d) ei0B).a;
                } else {
                    eVar = ((EI0.d) ei0B).b;
                    if (eVar == null) {
                        throw new C3761fL0("No setter found for property " + aVar.v());
                    }
                }
                AbstractC5906pJ0 abstractC5906pJ1 = aVar.v().i;
                AbstractC7583xI0.b bVar2 = eVar.a;
                Method methodK2 = abstractC5906pJ1.k(bVar2.a, bVar2.b);
                if (methodK2 != null) {
                    Modifier.isStatic(methodK2.getModifiers());
                    return aVar.t() ? new AbstractC2615Zx.g.a(methodK2, d(aVar)) : new AbstractC2615Zx.g.e(methodK2);
                }
                throw new C3761fL0("No accessor found for property " + aVar.v());
            }
            if (z) {
                method = ((EI0.b) ei0B).a;
            } else {
                EI0.b bVar3 = (EI0.b) ei0B;
                method = bVar3.b;
                if (method == null) {
                    throw new C3761fL0("No source found for setter of Java method property: " + bVar3.a);
                }
            }
            aVar2 = aVar.t() ? new AbstractC2615Zx.g.a(method, d(aVar)) : new AbstractC2615Zx.g.e(method);
        }
        return N7.c(aVar2, aVar.u(), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    public static final AbstractC2615Zx<Field> b(OJ0.a<?, ?> aVar, boolean z, Field field) {
        InterfaceC0671Bj1 interfaceC0671Bj1O = aVar.v().o();
        InterfaceC4675jU interfaceC4675jUE = interfaceC0671Bj1O.e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        if (C4432iZ.l(interfaceC4675jUE)) {
            InterfaceC4675jU interfaceC4675jUE2 = interfaceC4675jUE.e();
            if ((C4432iZ.n(interfaceC4675jUE2, SC.e) || C4432iZ.n(interfaceC4675jUE2, SC.i)) && (!(interfaceC0671Bj1O instanceof C2850b00) || !GI0.d(((C2850b00) interfaceC0671Bj1O).E))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (aVar.v().o().k().P(C7437wc2.a)) {
                        if (z) {
                            Intrinsics.checkNotNullParameter(field, "field");
                            return new AbstractC2615Zx.e.C0211e(field, false);
                        }
                        boolean zC = c(aVar);
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new AbstractC2615Zx.f.e(field, zC, false);
                    }
                    if (z) {
                        if (aVar.t()) {
                            Intrinsics.checkNotNullParameter(field, "field");
                            return new AbstractC2615Zx.e.b(field, false);
                        }
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new AbstractC2615Zx.e.d(field, true);
                    }
                    if (aVar.t()) {
                        boolean zC2 = c(aVar);
                        Intrinsics.checkNotNullParameter(field, "field");
                        return new AbstractC2615Zx.f.b(field, zC2, false);
                    }
                    boolean zC3 = c(aVar);
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new AbstractC2615Zx.f.d(field, zC3, true);
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (aVar.v().o().k().P(C7437wc2.a)) {
                if (z) {
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new AbstractC2615Zx.e.C0211e(field, false);
                }
                boolean zC4 = c(aVar);
                Intrinsics.checkNotNullParameter(field, "field");
                return new AbstractC2615Zx.f.e(field, zC4, false);
            }
            if (z) {
                if (aVar.t()) {
                    Intrinsics.checkNotNullParameter(field, "field");
                    return new AbstractC2615Zx.e.b(field, false);
                }
                Intrinsics.checkNotNullParameter(field, "field");
                return new AbstractC2615Zx.e.d(field, true);
            }
            if (aVar.t()) {
                boolean zC5 = c(aVar);
                Intrinsics.checkNotNullParameter(field, "field");
                return new AbstractC2615Zx.f.b(field, zC5, false);
            }
            boolean zC6 = c(aVar);
            Intrinsics.checkNotNullParameter(field, "field");
            return new AbstractC2615Zx.f.d(field, zC6, true);
        }
        if (z) {
            if (aVar.t()) {
                return new AbstractC2615Zx.e.a(field, d(aVar));
            }
            Intrinsics.checkNotNullParameter(field, "field");
            return new AbstractC2615Zx.e.c(field, true);
        }
        if (aVar.t()) {
            return new AbstractC2615Zx.f.a(field, c(aVar), d(aVar));
        }
        boolean zC7 = c(aVar);
        Intrinsics.checkNotNullParameter(field, "field");
        return new AbstractC2615Zx.f.c(field, zC7, true);
    }

    public static final boolean c(OJ0.a<?, ?> aVar) {
        return !C3089c72.e(aVar.v().o().getType());
    }

    @Nullable
    public static final Object d(@NotNull OJ0.a<?, ?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        OJ0<?> oj0V = aVar.v();
        return N7.b(oj0V.l, oj0V.o());
    }
}
