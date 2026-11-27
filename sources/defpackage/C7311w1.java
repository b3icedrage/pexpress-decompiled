package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7311w1 {

    @NotNull
    public static final C7311w1 a = new C7311w1();

    public static final boolean a(InterfaceC4366iD interfaceC4366iD, InterfaceC6126qM1 interfaceC6126qM1) {
        if (interfaceC4366iD.E(interfaceC6126qM1)) {
            return true;
        }
        if (!(interfaceC6126qM1 instanceof InterfaceC3054bz)) {
            return false;
        }
        N62 n62O = interfaceC4366iD.o(interfaceC4366iD.l((InterfaceC3054bz) interfaceC6126qM1));
        return !interfaceC4366iD.d(n62O) && interfaceC4366iD.E(interfaceC4366iD.I(interfaceC4366iD.i(n62O)));
    }

    public static final boolean b(InterfaceC4366iD interfaceC4366iD, C6075q62 c6075q62, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6126qM1 interfaceC6126qM2, boolean z) {
        Set<InterfaceC5702oL0> setV = interfaceC4366iD.v(interfaceC6126qM1);
        if (setV != null && setV.isEmpty()) {
            return false;
        }
        for (InterfaceC5702oL0 interfaceC5702oL0 : setV) {
            if (Intrinsics.a(interfaceC4366iD.X(interfaceC5702oL0), interfaceC4366iD.J(interfaceC6126qM2))) {
                return true;
            }
            if (z && i(a, c6075q62, interfaceC6126qM2, interfaceC5702oL0)) {
                return true;
            }
        }
        return false;
    }

    public static List c(C6075q62 c6075q62, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6704t62 interfaceC6704t62) {
        C6075q62.c cVarB;
        InterfaceC4366iD interfaceC4366iD = c6075q62.c;
        interfaceC4366iD.j0(interfaceC6126qM1, interfaceC6704t62);
        if (!interfaceC4366iD.p(interfaceC6704t62) && interfaceC4366iD.m(interfaceC6126qM1)) {
            return C5653o60.d;
        }
        if (interfaceC4366iD.e0(interfaceC6704t62)) {
            if (!interfaceC4366iD.R(interfaceC4366iD.J(interfaceC6126qM1), interfaceC6704t62)) {
                return C5653o60.d;
            }
            EnumC2120Ty enumC2120Ty = EnumC2120Ty.d;
            AbstractC5706oM1 abstractC5706oM1G = interfaceC4366iD.G(interfaceC6126qM1);
            if (abstractC5706oM1G != null) {
                interfaceC6126qM1 = abstractC5706oM1G;
            }
            return VE.c(interfaceC6126qM1);
        }
        C3558eN1 c3558eN1 = new C3558eN1();
        c6075q62.b();
        ArrayDeque<InterfaceC6126qM1> arrayDeque = c6075q62.g;
        Intrinsics.checkNotNull(arrayDeque);
        C3768fN1 c3768fN1 = c6075q62.h;
        Intrinsics.checkNotNull(c3768fN1);
        arrayDeque.push(interfaceC6126qM1);
        while (!arrayDeque.isEmpty()) {
            if (c3768fN1.b() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC6126qM1 + ". Supertypes = " + CollectionsKt.J(c3768fN1, null, null, null, null, 63)).toString());
            }
            InterfaceC6126qM1 interfaceC6126qM1Pop = arrayDeque.pop();
            Intrinsics.checkNotNull(interfaceC6126qM1Pop);
            if (c3768fN1.add(interfaceC6126qM1Pop)) {
                EnumC2120Ty enumC2120Ty2 = EnumC2120Ty.d;
                InterfaceC6126qM1 interfaceC6126qM1G = interfaceC4366iD.G(interfaceC6126qM1Pop);
                if (interfaceC6126qM1G == null) {
                    interfaceC6126qM1G = interfaceC6126qM1Pop;
                }
                if (interfaceC4366iD.R(interfaceC4366iD.J(interfaceC6126qM1G), interfaceC6704t62)) {
                    c3558eN1.add(interfaceC6126qM1G);
                    cVarB = C6075q62.c.C0474c.a;
                } else {
                    cVarB = interfaceC4366iD.b(interfaceC6126qM1G) == 0 ? C6075q62.c.b.a : interfaceC4366iD.B(interfaceC6126qM1G);
                }
                if (Intrinsics.a(cVarB, C6075q62.c.C0474c.a)) {
                    cVarB = null;
                }
                if (cVarB != null) {
                    Iterator<InterfaceC5702oL0> it = interfaceC4366iD.t(interfaceC4366iD.J(interfaceC6126qM1Pop)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(cVarB.a(c6075q62, it.next()));
                    }
                }
            }
        }
        c6075q62.a();
        return c3558eN1;
    }

    public static List d(C6075q62 c6075q62, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6704t62 interfaceC6704t62) {
        List listC = c(c6075q62, interfaceC6126qM1, interfaceC6704t62);
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                InterfaceC4366iD interfaceC4366iD = c6075q62.c;
                InterfaceC4602j62 interfaceC4602j62G = interfaceC4366iD.g((InterfaceC6126qM1) obj);
                int iE = interfaceC4366iD.e(interfaceC4602j62G);
                int i = 0;
                while (true) {
                    if (i >= iE) {
                        arrayList.add(obj);
                        break;
                    }
                    if (interfaceC4366iD.W(interfaceC4366iD.i(interfaceC4366iD.d0(interfaceC4602j62G, i))) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    public static boolean e(@NotNull C6075q62 state, @NotNull InterfaceC5702oL0 type, @NotNull InterfaceC5702oL0 type2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "a");
        Intrinsics.checkNotNullParameter(type2, "b");
        if (type == type2) {
            return true;
        }
        C7311w1 c7311w1 = a;
        InterfaceC4366iD interfaceC4366iD = state.c;
        if (g(interfaceC4366iD, type) && g(interfaceC4366iD, type2)) {
            Intrinsics.checkNotNullParameter(type, "type");
            AbstractC6331rL0 abstractC6331rL0 = state.e;
            InterfaceC5702oL0 interfaceC5702oL0C = state.c(abstractC6331rL0.t(type));
            Intrinsics.checkNotNullParameter(type2, "type");
            InterfaceC5702oL0 interfaceC5702oL0C2 = state.c(abstractC6331rL0.t(type2));
            AbstractC5706oM1 abstractC5706oM1R = interfaceC4366iD.r(interfaceC5702oL0C);
            if (!interfaceC4366iD.R(interfaceC4366iD.X(interfaceC5702oL0C), interfaceC4366iD.X(interfaceC5702oL0C2))) {
                return false;
            }
            if (interfaceC4366iD.b(abstractC5706oM1R) == 0) {
                return interfaceC4366iD.y(interfaceC5702oL0C) || interfaceC4366iD.y(interfaceC5702oL0C2) || interfaceC4366iD.U(abstractC5706oM1R) == interfaceC4366iD.U(interfaceC4366iD.r(interfaceC5702oL0C2));
            }
        }
        return i(c7311w1, state, type, type2) && i(c7311w1, state, type2, type);
    }

    public static J62 f(InterfaceC4366iD interfaceC4366iD, InterfaceC5702oL0 interfaceC5702oL0, InterfaceC6126qM1 interfaceC6126qM1) {
        P92 p92I;
        int iB = interfaceC4366iD.b(interfaceC5702oL0);
        int i = 0;
        while (true) {
            if (i >= iB) {
                return null;
            }
            InterfaceC4812k62 interfaceC4812k62G0 = interfaceC4366iD.g0(interfaceC5702oL0, i);
            InterfaceC4812k62 interfaceC4812k62 = interfaceC4366iD.d(interfaceC4812k62G0) ? null : interfaceC4812k62G0;
            if (interfaceC4812k62 != null && (p92I = interfaceC4366iD.i(interfaceC4812k62)) != null) {
                boolean z = interfaceC4366iD.K(interfaceC4366iD.f0(interfaceC4366iD.r(p92I))) && interfaceC4366iD.K(interfaceC4366iD.f0(interfaceC4366iD.r(interfaceC6126qM1)));
                if (p92I.equals(interfaceC6126qM1) || (z && Intrinsics.a(interfaceC4366iD.X(p92I), interfaceC4366iD.X(interfaceC6126qM1)))) {
                    return interfaceC4366iD.Q(interfaceC4366iD.X(interfaceC5702oL0), i);
                }
                J62 j62F = f(interfaceC4366iD, p92I, interfaceC6126qM1);
                if (j62F != null) {
                    return j62F;
                }
            }
            i++;
        }
    }

    public static boolean g(InterfaceC4366iD interfaceC4366iD, InterfaceC5702oL0 interfaceC5702oL0) {
        return (!interfaceC4366iD.u(interfaceC4366iD.X(interfaceC5702oL0)) || interfaceC4366iD.h(interfaceC5702oL0) || interfaceC4366iD.z(interfaceC5702oL0) || interfaceC4366iD.T(interfaceC5702oL0) || interfaceC4366iD.h0(interfaceC5702oL0)) ? false : true;
    }

    public static boolean h(@NotNull C6075q62 c6075q62, @NotNull InterfaceC4602j62 capturedSubArguments, @NotNull InterfaceC6126qM1 superType) {
        boolean zI;
        Intrinsics.checkNotNullParameter(c6075q62, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        InterfaceC4366iD interfaceC4366iD = c6075q62.c;
        InterfaceC6494s62 interfaceC6494s62J = interfaceC4366iD.J(superType);
        int iE = interfaceC4366iD.e(capturedSubArguments);
        int iH = interfaceC4366iD.H(interfaceC6494s62J);
        if (iE == iH && iE == interfaceC4366iD.b(superType)) {
            for (int i = 0; i < iH; i++) {
                InterfaceC4812k62 interfaceC4812k62G0 = interfaceC4366iD.g0(superType, i);
                if (!interfaceC4366iD.d(interfaceC4812k62G0)) {
                    P92 p92I = interfaceC4366iD.i(interfaceC4812k62G0);
                    InterfaceC4812k62 interfaceC4812k62D0 = interfaceC4366iD.d0(capturedSubArguments, i);
                    interfaceC4366iD.f(interfaceC4812k62D0);
                    EnumC3718f72 enumC3718f72 = EnumC3718f72.INV;
                    P92 p92I2 = interfaceC4366iD.i(interfaceC4812k62D0);
                    EnumC3718f72 declared = interfaceC4366iD.q(interfaceC4366iD.Q(interfaceC6494s62J, i));
                    EnumC3718f72 useSite = interfaceC4366iD.f(interfaceC4812k62G0);
                    Intrinsics.checkNotNullParameter(declared, "declared");
                    Intrinsics.checkNotNullParameter(useSite, "useSite");
                    if (declared == enumC3718f72) {
                        declared = useSite;
                    } else if (useSite != enumC3718f72 && declared != useSite) {
                        declared = null;
                    }
                    if (declared == null) {
                        return c6075q62.a;
                    }
                    C7311w1 c7311w1 = a;
                    if (declared != enumC3718f72 || (!j(interfaceC4366iD, p92I2, p92I, interfaceC6494s62J) && !j(interfaceC4366iD, p92I, p92I2, interfaceC6494s62J))) {
                        int i2 = c6075q62.f;
                        if (i2 > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + p92I2).toString());
                        }
                        c6075q62.f = i2 + 1;
                        int iOrdinal = declared.ordinal();
                        if (iOrdinal == 0) {
                            zI = i(c7311w1, c6075q62, p92I, p92I2);
                        } else if (iOrdinal == 1) {
                            zI = i(c7311w1, c6075q62, p92I2, p92I);
                        } else {
                            if (iOrdinal != 2) {
                                throw new C6489s51();
                            }
                            zI = e(c6075q62, p92I2, p92I);
                        }
                        c6075q62.f--;
                        if (!zI) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0308  */
    /* JADX WARN: Code duplicated, block: B:204:0x036b  */
    /* JADX WARN: Code duplicated, block: B:381:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:? A[LOOP:11: B:74:0x012c->B:383:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:? A[LOOP:12: B:90:0x016b->B:386:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0182  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean i(C7311w1 c7311w1, C6075q62 state, InterfaceC5702oL0 type, InterfaceC5702oL0 type2) {
        Boolean boolValueOf;
        Boolean bool;
        List<InterfaceC6126qM1> listC;
        C6075q62.c cVar;
        boolean z;
        P92 p92I;
        AbstractC5706oM1 abstractC5706oM1Z;
        InterfaceC6494s62 interfaceC6494s62J;
        InterfaceC6494s62 interfaceC6494s62J2;
        J62 j62F;
        Collection<InterfaceC5702oL0> collectionT;
        Iterator<T> it;
        Collection<InterfaceC5702oL0> collectionT2;
        Iterator<T> it2;
        boolean z2;
        AbstractC5706oM1 abstractC5706oM1Z2;
        AbstractC5706oM1 abstractC5706oM1Z3;
        c7311w1.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "subType");
        Intrinsics.checkNotNullParameter(type2, "superType");
        if (type == type2) {
            return true;
        }
        state.getClass();
        Intrinsics.checkNotNullParameter(type, "subType");
        Intrinsics.checkNotNullParameter(type2, "superType");
        boolean z3 = false;
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC6331rL0 abstractC6331rL0 = state.e;
        InterfaceC5702oL0 subType = state.c(abstractC6331rL0.t(type));
        Intrinsics.checkNotNullParameter(type2, "type");
        InterfaceC5702oL0 superType = state.c(abstractC6331rL0.t(type2));
        InterfaceC4366iD context = state.c;
        AbstractC5706oM1 subType2 = context.r(subType);
        AbstractC5706oM1 abstractC5706oM1I = context.I(superType);
        boolean zW = context.w(subType2);
        C7311w1 c7311w2 = a;
        if (!zW && !context.w(abstractC5706oM1I)) {
            boolean zK = context.k(subType2);
            boolean z4 = state.b;
            if (zK && context.k(abstractC5706oM1I)) {
                BW bwM0 = context.m0(subType2);
                if (bwM0 == null || (abstractC5706oM1Z2 = context.Z(bwM0)) == null) {
                    abstractC5706oM1Z2 = subType2;
                }
                BW bwM1 = context.m0(abstractC5706oM1I);
                if (bwM1 == null || (abstractC5706oM1Z3 = context.Z(bwM1)) == null) {
                    abstractC5706oM1Z3 = abstractC5706oM1I;
                }
                boolValueOf = Boolean.valueOf((context.J(abstractC5706oM1Z2) == context.J(abstractC5706oM1Z3) && ((context.z(subType2) || !context.z(abstractC5706oM1I)) && (!context.U(subType2) || context.U(abstractC5706oM1I)))) || z4);
            } else if (context.A(subType2) || context.A(abstractC5706oM1I)) {
                boolValueOf = Boolean.valueOf(z4);
            } else {
                BW bwM2 = context.m0(abstractC5706oM1I);
                if (bwM2 == null || (abstractC5706oM1Z = context.Z(bwM2)) == null) {
                    abstractC5706oM1Z = abstractC5706oM1I;
                }
                InterfaceC3054bz superType2 = context.L(abstractC5706oM1Z);
                InterfaceC5702oL0 interfaceC5702oL0S = superType2 != null ? context.s(superType2) : null;
                if (superType2 == null || interfaceC5702oL0S == null) {
                    interfaceC6494s62J = context.J(abstractC5706oM1I);
                    if (context.j(interfaceC6494s62J)) {
                        context.U(abstractC5706oM1I);
                        collectionT2 = context.t(interfaceC6494s62J);
                        if (!(collectionT2 instanceof Collection) && collectionT2.isEmpty()) {
                            z2 = true;
                            break;
                        }
                        it2 = collectionT2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = true;
                                break;
                            }
                            if (!i(c7311w2, state, subType2, (InterfaceC5702oL0) it2.next())) {
                                z2 = false;
                                break;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        interfaceC6494s62J2 = context.J(subType2);
                        if (subType2 instanceof InterfaceC3054bz) {
                            j62F = f(context, abstractC5706oM1I, subType2);
                            if (j62F == null && context.a(j62F, context.J(abstractC5706oM1I))) {
                                boolValueOf = Boolean.TRUE;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (context.j(interfaceC6494s62J2)) {
                                collectionT = context.t(interfaceC6494s62J2);
                                if ((collectionT instanceof Collection) || !collectionT.isEmpty()) {
                                    it = collectionT.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            j62F = f(context, abstractC5706oM1I, subType2);
                                            if (j62F == null) {
                                            }
                                        } else if (!(((InterfaceC5702oL0) it.next()) instanceof InterfaceC3054bz)) {
                                        }
                                    }
                                } else {
                                    j62F = f(context, abstractC5706oM1I, subType2);
                                    if (j62F == null) {
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                } else {
                    if (context.U(abstractC5706oM1I)) {
                        interfaceC5702oL0S = context.l0(interfaceC5702oL0S);
                    } else if (context.z(abstractC5706oM1I)) {
                        interfaceC5702oL0S = context.F(interfaceC5702oL0S);
                    }
                    Intrinsics.checkNotNullParameter(subType2, "subType");
                    Intrinsics.checkNotNullParameter(superType2, "superType");
                    C6075q62.b[] bVarArr = C6075q62.b.d;
                    if (i(c7311w2, state, subType2, interfaceC5702oL0S)) {
                        boolValueOf = Boolean.TRUE;
                    } else {
                        interfaceC6494s62J = context.J(abstractC5706oM1I);
                        if (context.j(interfaceC6494s62J)) {
                            context.U(abstractC5706oM1I);
                            collectionT2 = context.t(interfaceC6494s62J);
                            if (!(collectionT2 instanceof Collection)) {
                                it2 = collectionT2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z2 = true;
                                        break;
                                    }
                                    if (!i(c7311w2, state, subType2, (InterfaceC5702oL0) it2.next())) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            } else {
                                it2 = collectionT2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z2 = true;
                                        break;
                                    }
                                    if (!i(c7311w2, state, subType2, (InterfaceC5702oL0) it2.next())) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z2);
                        } else {
                            interfaceC6494s62J2 = context.J(subType2);
                            if (subType2 instanceof InterfaceC3054bz) {
                                j62F = f(context, abstractC5706oM1I, subType2);
                                if (j62F == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                if (context.j(interfaceC6494s62J2)) {
                                    collectionT = context.t(interfaceC6494s62J2);
                                    if (collectionT instanceof Collection) {
                                        it = collectionT.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                j62F = f(context, abstractC5706oM1I, subType2);
                                                if (j62F == null) {
                                                }
                                            } else if (!(((InterfaceC5702oL0) it.next()) instanceof InterfaceC3054bz)) {
                                            }
                                        }
                                    } else {
                                        it = collectionT.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                j62F = f(context, abstractC5706oM1I, subType2);
                                                if (j62F == null) {
                                                }
                                            } else if (!(((InterfaceC5702oL0) it.next()) instanceof InterfaceC3054bz)) {
                                            }
                                        }
                                    }
                                }
                                boolValueOf = null;
                            }
                        }
                    }
                }
            }
        } else if (state.a) {
            boolValueOf = Boolean.TRUE;
        } else if (!context.U(subType2) || context.U(abstractC5706oM1I)) {
            AbstractC5706oM1 a2 = context.C(subType2, false);
            AbstractC5706oM1 b = context.C(abstractC5706oM1I, false);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            boolValueOf = Boolean.valueOf(C1589Ne.w(context, a2, b));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(superType, "superType");
            return zBooleanValue;
        }
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        InterfaceC6126qM1 subType3 = context.r(subType);
        AbstractC5706oM1 superType3 = context.I(superType);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType3, "subType");
        Intrinsics.checkNotNullParameter(superType3, "superType");
        boolean zU = context.U(superType3);
        int i = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        if (!zU && !context.z(subType3) && !context.T(subType3) && ((!(subType3 instanceof InterfaceC3054bz) || !context.b0((InterfaceC3054bz) subType3)) && !O0.a(state, subType3, C6075q62.c.b.a))) {
            if (context.z(superType3) || O0.a(state, superType3, C6075q62.c.d.a) || context.m(subType3)) {
                return false;
            }
            InterfaceC6494s62 end = context.J(superType3);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(subType3, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            if (!O0.b(state, subType3, end)) {
                state.b();
                ArrayDeque<InterfaceC6126qM1> arrayDeque = state.g;
                Intrinsics.checkNotNull(arrayDeque);
                C3768fN1 c3768fN1 = state.h;
                Intrinsics.checkNotNull(c3768fN1);
                arrayDeque.push(subType3);
                loop0: while (true) {
                    if (arrayDeque.isEmpty()) {
                        state.a();
                        return false;
                    }
                    if (c3768fN1.b() > i) {
                        throw new IllegalStateException(("Too many supertypes for type: " + subType3 + ". Supertypes = " + CollectionsKt.J(c3768fN1, null, null, null, null, 63)).toString());
                    }
                    InterfaceC6126qM1 interfaceC6126qM1Pop = arrayDeque.pop();
                    Intrinsics.checkNotNull(interfaceC6126qM1Pop);
                    if (c3768fN1.add(interfaceC6126qM1Pop)) {
                        C6075q62.c cVar2 = context.U(interfaceC6126qM1Pop) ? C6075q62.c.C0474c.a : C6075q62.c.b.a;
                        if (Intrinsics.a(cVar2, C6075q62.c.C0474c.a)) {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            Iterator<InterfaceC5702oL0> it3 = context.t(context.J(interfaceC6126qM1Pop)).iterator();
                            while (it3.hasNext()) {
                                InterfaceC6126qM1 interfaceC6126qM1A = cVar2.a(state, it3.next());
                                if (O0.b(state, interfaceC6126qM1A, end)) {
                                    state.a();
                                    break loop0;
                                }
                                arrayDeque.add(interfaceC6126qM1A);
                            }
                        }
                        i = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    }
                }
            }
        }
        AbstractC5706oM1 abstractC5706oM1R = context.r(subType3);
        AbstractC5706oM1 abstractC5706oM1I2 = context.I(superType3);
        if (!context.E(abstractC5706oM1R) && !context.E(abstractC5706oM1I2)) {
            bool = null;
        } else if (a(context, abstractC5706oM1R) && a(context, abstractC5706oM1I2)) {
            bool = Boolean.TRUE;
        } else if (context.E(abstractC5706oM1R)) {
            if (b(context, state, abstractC5706oM1R, abstractC5706oM1I2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (context.E(abstractC5706oM1I2)) {
            InterfaceC6494s62 interfaceC6494s62J3 = context.J(abstractC5706oM1R);
            if (interfaceC6494s62J3 instanceof InterfaceC4832kC0) {
                Collection<InterfaceC5702oL0> collectionT3 = context.t(interfaceC6494s62J3);
                if (!(collectionT3 instanceof Collection) || !collectionT3.isEmpty()) {
                    Iterator<T> it4 = collectionT3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            AbstractC5706oM1 abstractC5706oM1N = context.n((InterfaceC5702oL0) it4.next());
                            if (abstractC5706oM1N != null && context.E(abstractC5706oM1N)) {
                            }
                        } else if (!b(context, state, abstractC5706oM1I2, abstractC5706oM1R, true)) {
                            bool = null;
                        }
                    }
                } else if (!b(context, state, abstractC5706oM1I2, abstractC5706oM1R, true)) {
                    bool = null;
                }
            } else if (!b(context, state, abstractC5706oM1I2, abstractC5706oM1R, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            Intrinsics.checkNotNullParameter(subType3, "subType");
            Intrinsics.checkNotNullParameter(superType3, "superType");
            return zBooleanValue2;
        }
        InterfaceC6494s62 superConstructor = context.J(superType3);
        if ((context.R(context.J(subType3), superConstructor) && context.H(superConstructor) == 0) || context.a0(context.J(superType3))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType3, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        if (context.m(subType3)) {
            listC = d(state, subType3, superConstructor);
        } else if (context.p(superConstructor) || context.Y(superConstructor)) {
            C3558eN1<InterfaceC6126qM1> c3558eN1 = new C3558eN1();
            state.b();
            ArrayDeque<InterfaceC6126qM1> arrayDeque2 = state.g;
            Intrinsics.checkNotNull(arrayDeque2);
            C3768fN1 c3768fN2 = state.h;
            Intrinsics.checkNotNull(c3768fN2);
            arrayDeque2.push(subType3);
            while (!arrayDeque2.isEmpty()) {
                if (c3768fN2.b() > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + subType3 + ". Supertypes = " + CollectionsKt.J(c3768fN2, null, null, null, null, 63)).toString());
                }
                InterfaceC6126qM1 interfaceC6126qM1Pop2 = arrayDeque2.pop();
                Intrinsics.checkNotNull(interfaceC6126qM1Pop2);
                if (c3768fN2.add(interfaceC6126qM1Pop2)) {
                    if (context.m(interfaceC6126qM1Pop2)) {
                        c3558eN1.add(interfaceC6126qM1Pop2);
                        cVar = C6075q62.c.C0474c.a;
                    } else {
                        cVar = C6075q62.c.b.a;
                    }
                    if (Intrinsics.a(cVar, C6075q62.c.C0474c.a)) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        Iterator<InterfaceC5702oL0> it5 = context.t(context.J(interfaceC6126qM1Pop2)).iterator();
                        while (it5.hasNext()) {
                            arrayDeque2.add(cVar.a(state, it5.next()));
                        }
                    }
                }
            }
            state.a();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC6126qM1 interfaceC6126qM1 : c3558eN1) {
                Intrinsics.checkNotNull(interfaceC6126qM1);
                C2904bF.o(arrayList, d(state, interfaceC6126qM1, superConstructor));
            }
            listC = arrayList;
        } else {
            listC = c(state, subType3, superConstructor);
        }
        listC.size();
        int i2 = 10;
        ArrayList<InterfaceC6126qM1> arrayList2 = new ArrayList(XE.m(listC, 10));
        for (InterfaceC6126qM1 interfaceC6126qM2 : listC) {
            AbstractC5706oM1 abstractC5706oM1N2 = context.n(state.c(interfaceC6126qM2));
            if (abstractC5706oM1N2 != null) {
                interfaceC6126qM2 = abstractC5706oM1N2;
            }
            arrayList2.add(interfaceC6126qM2);
        }
        int size = arrayList2.size();
        if (size == 0) {
            InterfaceC6494s62 interfaceC6494s62J4 = context.J(subType3);
            if (context.p(interfaceC6494s62J4)) {
                return context.c0(interfaceC6494s62J4);
            }
            if (context.c0(context.J(subType3))) {
                return true;
            }
            state.b();
            ArrayDeque<InterfaceC6126qM1> arrayDeque3 = state.g;
            Intrinsics.checkNotNull(arrayDeque3);
            C3768fN1 c3768fN3 = state.h;
            Intrinsics.checkNotNull(c3768fN3);
            arrayDeque3.push(subType3);
            while (!arrayDeque3.isEmpty()) {
                if (c3768fN3.b() > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + subType3 + ". Supertypes = " + CollectionsKt.J(c3768fN3, null, null, null, null, 63)).toString());
                }
                InterfaceC6126qM1 interfaceC6126qM1Pop3 = arrayDeque3.pop();
                Intrinsics.checkNotNull(interfaceC6126qM1Pop3);
                if (c3768fN3.add(interfaceC6126qM1Pop3)) {
                    C6075q62.c cVar3 = context.m(interfaceC6126qM1Pop3) ? C6075q62.c.C0474c.a : C6075q62.c.b.a;
                    if (Intrinsics.a(cVar3, C6075q62.c.C0474c.a)) {
                        cVar3 = null;
                    }
                    if (cVar3 == null) {
                        continue;
                    } else {
                        Iterator<InterfaceC5702oL0> it6 = context.t(context.J(interfaceC6126qM1Pop3)).iterator();
                        while (it6.hasNext()) {
                            InterfaceC6126qM1 interfaceC6126qM1A2 = cVar3.a(state, it6.next());
                            if (context.c0(context.J(interfaceC6126qM1A2))) {
                                state.a();
                                return true;
                            }
                            arrayDeque3.add(interfaceC6126qM1A2);
                        }
                    }
                }
            }
            state.a();
            return false;
        }
        if (size == 1) {
            return h(state, context.g((InterfaceC6126qM1) CollectionsKt.E(arrayList2)), superType3);
        }
        C4261hj c4261hj = new C4261hj(context.H(superConstructor));
        int iH = context.H(superConstructor);
        int i3 = 0;
        boolean z5 = false;
        while (i3 < iH) {
            z5 = (z5 || context.q(context.Q(superConstructor, i3)) != EnumC3718f72.OUT) ? true : z3;
            if (z5) {
                z = z3;
            } else {
                ArrayList arrayList3 = new ArrayList(XE.m(arrayList2, i2));
                for (InterfaceC6126qM1 interfaceC6126qM3 : arrayList2) {
                    InterfaceC4812k62 interfaceC4812k62V = context.V(interfaceC6126qM3, i3);
                    if (interfaceC4812k62V != null) {
                        boolean z6 = z3;
                        if (context.f(interfaceC4812k62V) != EnumC3718f72.INV) {
                            interfaceC4812k62V = null;
                        }
                        if (interfaceC4812k62V != null && (p92I = context.i(interfaceC4812k62V)) != null) {
                            arrayList3.add(p92I);
                            z3 = z6;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + interfaceC6126qM3 + ", subType: " + subType3 + ", superType: " + superType3).toString());
                }
                z = z3;
                c4261hj.add(context.O(context.N(arrayList3)));
            }
            i3++;
            z3 = z;
            i2 = 10;
        }
        if (!z5 && h(state, c4261hj, superType3)) {
            return true;
        }
        C6891u1 block = new C6891u1(arrayList2, state, context, superType3);
        Intrinsics.checkNotNullParameter(block, "block");
        C6075q62.a.C0473a c0473a = new C6075q62.a.C0473a();
        block.invoke(c0473a);
        return c0473a.a;
    }

    public static boolean j(InterfaceC4366iD interfaceC4366iD, InterfaceC5702oL0 interfaceC5702oL0, InterfaceC5702oL0 interfaceC5702oL1, InterfaceC6704t62 interfaceC6704t62) {
        H62 h62D;
        InterfaceC0726Cc interfaceC0726CcN = interfaceC4366iD.n(interfaceC5702oL0);
        if (!(interfaceC0726CcN instanceof InterfaceC3054bz)) {
            return false;
        }
        InterfaceC3054bz interfaceC3054bz = (InterfaceC3054bz) interfaceC0726CcN;
        if (interfaceC4366iD.c(interfaceC3054bz) || !interfaceC4366iD.d(interfaceC4366iD.o(interfaceC4366iD.l(interfaceC3054bz))) || interfaceC4366iD.x(interfaceC3054bz) != EnumC2120Ty.d) {
            return false;
        }
        InterfaceC6494s62 interfaceC6494s62X = interfaceC4366iD.X(interfaceC5702oL1);
        InterfaceC3508e72 interfaceC3508e72 = interfaceC6494s62X instanceof InterfaceC3508e72 ? (InterfaceC3508e72) interfaceC6494s62X : null;
        return (interfaceC3508e72 == null || (h62D = interfaceC4366iD.D(interfaceC3508e72)) == null || !interfaceC4366iD.a(h62D, interfaceC6704t62)) ? false : true;
    }
}
