package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2964bZ extends XY implements InterfaceC3383dZ {
    public static final /* synthetic */ int f = 0;

    @NotNull
    public final C3802fZ d;

    @NotNull
    public final KW1 e;

    /* JADX INFO: renamed from: bZ$a */
    public final class a implements InterfaceC5518nU<Unit, StringBuilder> {
        public a() {
        }

        @Override // defpackage.InterfaceC5518nU
        public final Object a(C0983Fj1 descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            h(descriptor, builder, "getter");
            return Unit.a;
        }

        @Override // defpackage.InterfaceC5518nU
        public final Object b(C1687Oj1 descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            h(descriptor, builder, "setter");
            return Unit.a;
        }

        @Override // defpackage.InterfaceC5518nU
        public final Object c(C0749Cj1 descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            C2964bZ.n(C2964bZ.this, descriptor, builder);
            return Unit.a;
        }

        @Override // defpackage.InterfaceC5518nU
        public final /* bridge */ /* synthetic */ Unit d(InterfaceC2076Tj0 interfaceC2076Tj0, StringBuilder sb) {
            g(interfaceC2076Tj0, sb);
            return Unit.a;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0053  */
        @Override // defpackage.InterfaceC5518nU
        public final Object e(AC constructorDescriptor, Object obj) {
            boolean z;
            InterfaceC7984zC interfaceC7984zCX;
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            C2964bZ c2964bZ = C2964bZ.this;
            c2964bZ.getClass();
            c2964bZ.y(builder, constructorDescriptor, null);
            C3802fZ c3802fZ = c2964bZ.d;
            c3802fZ.getClass();
            IJ0<Object>[] ij0Arr = C3802fZ.Y;
            if (((Boolean) c3802fZ.o.b(ij0Arr[13], c3802fZ)).booleanValue() || constructorDescriptor.H().q() != C01.g) {
                AbstractC5533nZ abstractC5533nZD = constructorDescriptor.d();
                Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, "getVisibility(...)");
                if (c2964bZ.j0(abstractC5533nZD, builder)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            c2964bZ.K(constructorDescriptor, builder);
            boolean zBooleanValue = ((Boolean) c3802fZ.P.b(ij0Arr[40], c3802fZ)).booleanValue();
            boolean z2 = constructorDescriptor.I;
            boolean z3 = zBooleanValue || !z2 || z;
            if (z3) {
                builder.append(c2964bZ.J("constructor"));
            }
            FC fcF1 = constructorDescriptor.e();
            Intrinsics.checkNotNullExpressionValue(fcF1, "getContainingDeclaration(...)");
            if (((Boolean) c3802fZ.A.b(ij0Arr[25], c3802fZ)).booleanValue()) {
                if (z3) {
                    builder.append(" ");
                }
                c2964bZ.Q(fcF1, builder, true);
                List<H62> listW = constructorDescriptor.w();
                Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
                c2964bZ.e0(builder, listW, false);
            }
            List<Xc2> listJ = constructorDescriptor.j();
            Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
            c2964bZ.i0(builder, listJ, constructorDescriptor.L());
            if (((Boolean) c3802fZ.q.b(ij0Arr[15], c3802fZ)).booleanValue() && !z2 && fcF1 != null && (interfaceC7984zCX = fcF1.X()) != null) {
                List<Xc2> listJ2 = interfaceC7984zCX.j();
                Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listJ2) {
                    Xc2 xc2 = (Xc2) obj2;
                    if (!xc2.z0() && xc2.q0() == null) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    builder.append(" : ");
                    builder.append(c2964bZ.J("this"));
                    builder.append(CollectionsKt.J(arrayList, ", ", "(", ")", C2276Vy.g, 24));
                }
            }
            if (((Boolean) c3802fZ.A.b(C3802fZ.Y[25], c3802fZ)).booleanValue()) {
                List<H62> listW2 = constructorDescriptor.w();
                Intrinsics.checkNotNullExpressionValue(listW2, "getTypeParameters(...)");
                c2964bZ.k0(builder, listW2);
            }
            return Unit.a;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x0231  */
        public final Object f(O01 classifier, StringBuilder builder) {
            StringBuilder sb;
            InterfaceC7984zC interfaceC7984zCX;
            String str;
            Intrinsics.checkNotNullParameter(classifier, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            C2964bZ c2964bZ = C2964bZ.this;
            c2964bZ.getClass();
            boolean z = classifier.h() == SC.h;
            if (!c2964bZ.r()) {
                List<InterfaceC1076Go1> listO0 = classifier.O0();
                Intrinsics.checkNotNullExpressionValue(listO0, "getContextReceivers(...)");
                c2964bZ.C(builder, listO0);
                c2964bZ.y(builder, classifier, null);
                if (!z) {
                    AbstractC5533nZ abstractC5533nZD = classifier.d();
                    Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, "getVisibility(...)");
                    c2964bZ.j0(abstractC5533nZD, builder);
                }
                if ((classifier.h() != SC.e || classifier.q() != C01.i) && (!classifier.h().b() || classifier.q() != C01.e)) {
                    C01 c01Q = classifier.q();
                    Intrinsics.checkNotNullExpressionValue(c01Q, "getModality(...)");
                    c2964bZ.M(c01Q, builder, C2964bZ.v(classifier));
                }
                c2964bZ.L(classifier, builder);
                c2964bZ.O(builder, c2964bZ.q().contains(EnumC3173cZ.INNER) && classifier.R(), "inner");
                c2964bZ.O(builder, c2964bZ.q().contains(EnumC3173cZ.DATA) && classifier.Q0(), "data");
                c2964bZ.O(builder, c2964bZ.q().contains(EnumC3173cZ.INLINE) && classifier.m(), "inline");
                c2964bZ.O(builder, c2964bZ.q().contains(EnumC3173cZ.VALUE) && classifier.s(), AppMeasurementSdk.ConditionalUserProperty.VALUE);
                c2964bZ.O(builder, c2964bZ.q().contains(EnumC3173cZ.FUN) && classifier.I(), "fun");
                Intrinsics.checkNotNullParameter(classifier, "classifier");
                if (classifier instanceof InterfaceC3714f62) {
                    str = "typealias";
                } else if (classifier.E()) {
                    str = "companion object";
                } else {
                    int iOrdinal = classifier.h().ordinal();
                    if (iOrdinal == 0) {
                        str = "class";
                    } else if (iOrdinal == 1) {
                        str = "interface";
                    } else if (iOrdinal == 2) {
                        str = "enum class";
                    } else if (iOrdinal == 3) {
                        str = "enum entry";
                    } else if (iOrdinal == 4) {
                        str = "annotation class";
                    } else {
                        if (iOrdinal != 5) {
                            throw new C6489s51();
                        }
                        str = "object";
                    }
                }
                builder.append(c2964bZ.J(str));
            }
            boolean zL = C4432iZ.l(classifier);
            C3802fZ c3802fZ = c2964bZ.d;
            if (zL) {
                if (((Boolean) c3802fZ.G.b(C3802fZ.Y[31], c3802fZ)).booleanValue()) {
                    if (c2964bZ.r()) {
                        builder.append("companion object");
                    }
                    C2964bZ.Y(builder);
                    InterfaceC4675jU interfaceC4675jUE = classifier.e();
                    if (interfaceC4675jUE != null) {
                        builder.append("of ");
                        C5638o21 name = interfaceC4675jUE.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        builder.append(c2964bZ.P(name, false));
                    }
                }
                if (c2964bZ.u() || !Intrinsics.a(classifier.getName(), C6761tO1.b)) {
                    if (!c2964bZ.r()) {
                        C2964bZ.Y(builder);
                    }
                    C5638o21 name2 = classifier.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    builder.append(c2964bZ.P(name2, true));
                }
            } else {
                if (!c2964bZ.r()) {
                    C2964bZ.Y(builder);
                }
                c2964bZ.Q(classifier, builder, true);
            }
            if (!z) {
                List<H62> listA = classifier.A();
                Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
                c2964bZ.e0(builder, listA, false);
                c2964bZ.A(classifier, builder);
                if (!classifier.h().b() && ((Boolean) c3802fZ.i.b(C3802fZ.Y[7], c3802fZ)).booleanValue() && (interfaceC7984zCX = classifier.X()) != null) {
                    builder.append(" ");
                    c2964bZ.y(builder, interfaceC7984zCX, null);
                    AbstractC5533nZ abstractC5533nZD2 = interfaceC7984zCX.d();
                    Intrinsics.checkNotNullExpressionValue(abstractC5533nZD2, "getVisibility(...)");
                    c2964bZ.j0(abstractC5533nZD2, builder);
                    builder.append(c2964bZ.J("constructor"));
                    List<Xc2> listJ = interfaceC7984zCX.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    c2964bZ.i0(builder, listJ, interfaceC7984zCX.L());
                }
                if (((Boolean) c3802fZ.x.b(C3802fZ.Y[22], c3802fZ)).booleanValue() || RK0.E(classifier.y())) {
                    sb = builder;
                } else {
                    Collection<AbstractC4649jL0> collectionA = classifier.p().a();
                    Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                    if (collectionA.isEmpty() || (collectionA.size() == 1 && RK0.x(collectionA.iterator().next()))) {
                        sb = builder;
                    } else {
                        C2964bZ.Y(builder);
                        builder.append(": ");
                        sb = builder;
                        CollectionsKt.I(collectionA, sb, ", ", null, null, new Q(c2964bZ, 1), 60);
                    }
                }
                c2964bZ.k0(sb, listA);
            }
            return Unit.a;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:56:0x01af  */
        /* JADX WARN: Code duplicated, block: B:58:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
        public final void g(@NotNull InterfaceC2076Tj0 descriptor, @NotNull StringBuilder builder) {
            String strZ;
            boolean z;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            C2964bZ c2964bZ = C2964bZ.this;
            boolean zR = c2964bZ.r();
            C3802fZ c3802fZ = c2964bZ.d;
            if (!zR) {
                C3592eZ c3592eZ = c3802fZ.g;
                IJ0<Object>[] ij0Arr = C3802fZ.Y;
                if (!((Boolean) c3592eZ.b(ij0Arr[5], c3802fZ)).booleanValue()) {
                    List<InterfaceC1076Go1> listW0 = descriptor.w0();
                    Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
                    c2964bZ.C(builder, listW0);
                    c2964bZ.y(builder, descriptor, null);
                    AbstractC5533nZ abstractC5533nZD = descriptor.d();
                    Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, "getVisibility(...)");
                    c2964bZ.j0(abstractC5533nZD, builder);
                    c2964bZ.N(descriptor, builder);
                    if (((Boolean) c3802fZ.T.b(ij0Arr[44], c3802fZ)).booleanValue()) {
                        c2964bZ.L(descriptor, builder);
                    }
                    c2964bZ.T(descriptor, builder);
                    if (((Boolean) c3802fZ.T.b(ij0Arr[44], c3802fZ)).booleanValue()) {
                        boolean z2 = false;
                        if (descriptor.W()) {
                            Collection<? extends InterfaceC1490Lx> collectionU = descriptor.u();
                            Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
                            Collection<? extends InterfaceC1490Lx> collection = collectionU;
                            if (!collection.isEmpty()) {
                                Iterator<T> it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((InterfaceC2076Tj0) it.next()).W()) {
                                            if (!((Boolean) c3802fZ.O.b(C3802fZ.Y[39], c3802fZ)).booleanValue()) {
                                                z = false;
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (descriptor.P0()) {
                            Collection<? extends InterfaceC1490Lx> collectionU2 = descriptor.u();
                            Intrinsics.checkNotNullExpressionValue(collectionU2, "getOverriddenDescriptors(...)");
                            Collection<? extends InterfaceC1490Lx> collection2 = collectionU2;
                            if (!collection2.isEmpty()) {
                                Iterator<T> it2 = collection2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((InterfaceC2076Tj0) it2.next()).P0()) {
                                            if (!((Boolean) c3802fZ.O.b(C3802fZ.Y[39], c3802fZ)).booleanValue()) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = true;
                            break;
                        }
                        c2964bZ.O(builder, descriptor.V(), "tailrec");
                        c2964bZ.O(builder, descriptor.z(), "suspend");
                        c2964bZ.O(builder, descriptor.m(), "inline");
                        c2964bZ.O(builder, z2, "infix");
                        c2964bZ.O(builder, z, "operator");
                    } else {
                        c2964bZ.O(builder, descriptor.z(), "suspend");
                    }
                    c2964bZ.K(descriptor, builder);
                    if (c2964bZ.u()) {
                        if (descriptor.C0()) {
                            builder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (descriptor.J0()) {
                            builder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                builder.append(c2964bZ.J("fun"));
                builder.append(" ");
                List<H62> listW = descriptor.w();
                Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
                c2964bZ.e0(builder, listW, true);
                c2964bZ.W(descriptor, builder);
            }
            c2964bZ.Q(descriptor, builder, true);
            List<Xc2> listJ = descriptor.j();
            Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
            c2964bZ.i0(builder, listJ, descriptor.L());
            c2964bZ.X(descriptor, builder);
            AbstractC4649jL0 abstractC4649jL0N = descriptor.n();
            C3592eZ c3592eZ2 = c3802fZ.l;
            IJ0<Object>[] ij0Arr2 = C3802fZ.Y;
            if (!((Boolean) c3592eZ2.b(ij0Arr2[10], c3802fZ)).booleanValue()) {
                if (((Boolean) c3802fZ.k.b(ij0Arr2[9], c3802fZ)).booleanValue() || abstractC4649jL0N == null) {
                    builder.append(": ");
                    if (abstractC4649jL0N == null) {
                        strZ = "[NULL]";
                    } else {
                        strZ = c2964bZ.Z(abstractC4649jL0N);
                    }
                    builder.append(strZ);
                } else {
                    C5638o21 c5638o21 = RK0.e;
                    if (!RK0.D(abstractC4649jL0N, C4194hP1.a.d)) {
                        builder.append(": ");
                        if (abstractC4649jL0N == null) {
                            strZ = "[NULL]";
                        } else {
                            strZ = c2964bZ.Z(abstractC4649jL0N);
                        }
                        builder.append(strZ);
                    }
                }
            }
            List<H62> listW2 = descriptor.w();
            Intrinsics.checkNotNullExpressionValue(listW2, "getTypeParameters(...)");
            c2964bZ.k0(builder, listW2);
        }

        public final void h(InterfaceC7043uj1 interfaceC7043uj1, StringBuilder sb, String str) {
            C2964bZ c2964bZ = C2964bZ.this;
            C3802fZ c3802fZ = c2964bZ.d;
            int iOrdinal = ((EnumC7464wj1) c3802fZ.H.b(C3802fZ.Y[32], c3802fZ)).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    g(interfaceC7043uj1, sb);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        throw new C6489s51();
                    }
                    return;
                }
            }
            c2964bZ.L(interfaceC7043uj1, sb);
            sb.append(str.concat(" for "));
            InterfaceC0671Bj1 interfaceC0671Bj1I0 = interfaceC7043uj1.I0();
            Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1I0, "getCorrespondingProperty(...)");
            C2964bZ.n(c2964bZ, interfaceC0671Bj1I0, sb);
        }
    }

    public C2964bZ(@NotNull C3802fZ options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.d = options;
        this.e = XO0.b(new YY(this, 0));
    }

    public static void Y(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean l0(AbstractC4649jL0 abstractC4649jL0) {
        if (!C3427dk0.h(abstractC4649jL0)) {
            return false;
        }
        List<N62> listT0 = abstractC4649jL0.T0();
        if (listT0 != null && listT0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listT0.iterator();
        while (it.hasNext()) {
            if (((N62) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(C2964bZ c2964bZ, InterfaceC0671Bj1 interfaceC0671Bj1, StringBuilder sb) {
        if (!c2964bZ.r()) {
            C3802fZ c3802fZ = c2964bZ.d;
            C3592eZ c3592eZ = c3802fZ.g;
            IJ0<Object>[] ij0Arr = C3802fZ.Y;
            if (!((Boolean) c3592eZ.b(ij0Arr[5], c3802fZ)).booleanValue()) {
                List<InterfaceC1076Go1> listW0 = interfaceC0671Bj1.w0();
                Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
                c2964bZ.C(sb, listW0);
                if (c2964bZ.q().contains(EnumC3173cZ.ANNOTATIONS)) {
                    c2964bZ.y(sb, interfaceC0671Bj1, null);
                    C6384rc0 c6384rc0V0 = interfaceC0671Bj1.v0();
                    if (c6384rc0V0 != null) {
                        c2964bZ.y(sb, c6384rc0V0, EnumC2132Uc.FIELD);
                    }
                    C6384rc0 c6384rc0S0 = interfaceC0671Bj1.s0();
                    if (c6384rc0S0 != null) {
                        c2964bZ.y(sb, c6384rc0S0, EnumC2132Uc.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((EnumC7464wj1) c3802fZ.H.b(ij0Arr[32], c3802fZ)) == EnumC7464wj1.e) {
                        C0983Fj1 c0983Fj1F = interfaceC0671Bj1.f();
                        if (c0983Fj1F != null) {
                            c2964bZ.y(sb, c0983Fj1F, EnumC2132Uc.PROPERTY_GETTER);
                        }
                        InterfaceC1609Nj1 interfaceC1609Nj1G = interfaceC0671Bj1.g();
                        if (interfaceC1609Nj1G != null) {
                            c2964bZ.y(sb, interfaceC1609Nj1G, EnumC2132Uc.PROPERTY_SETTER);
                            List<Xc2> listJ = interfaceC1609Nj1G.j();
                            Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                            Xc2 xc2 = (Xc2) CollectionsKt.U(listJ);
                            Intrinsics.checkNotNull(xc2);
                            c2964bZ.y(sb, xc2, EnumC2132Uc.SETTER_PARAMETER);
                        }
                    }
                }
                AbstractC5533nZ abstractC5533nZD = interfaceC0671Bj1.d();
                Intrinsics.checkNotNullExpressionValue(abstractC5533nZD, "getVisibility(...)");
                c2964bZ.j0(abstractC5533nZD, sb);
                c2964bZ.O(sb, c2964bZ.q().contains(EnumC3173cZ.CONST) && interfaceC0671Bj1.F(), "const");
                c2964bZ.L(interfaceC0671Bj1, sb);
                c2964bZ.N(interfaceC0671Bj1, sb);
                c2964bZ.T(interfaceC0671Bj1, sb);
                c2964bZ.O(sb, c2964bZ.q().contains(EnumC3173cZ.LATEINIT) && interfaceC0671Bj1.x0(), "lateinit");
                c2964bZ.K(interfaceC0671Bj1, sb);
            }
            c2964bZ.g0(interfaceC0671Bj1, sb, false);
            List<H62> listW = interfaceC0671Bj1.w();
            Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
            c2964bZ.e0(sb, listW, true);
            c2964bZ.W(interfaceC0671Bj1, sb);
        }
        c2964bZ.Q(interfaceC0671Bj1, sb, true);
        sb.append(": ");
        AbstractC4649jL0 type = interfaceC0671Bj1.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb.append(c2964bZ.Z(type));
        c2964bZ.X(interfaceC0671Bj1, sb);
        c2964bZ.I(interfaceC0671Bj1, sb);
        List<H62> listW2 = interfaceC0671Bj1.w();
        Intrinsics.checkNotNullExpressionValue(listW2, "getTypeParameters(...)");
        c2964bZ.k0(sb, listW2);
    }

    public static C01 v(GY0 gy0) {
        if (gy0 instanceof FC) {
            return ((FC) gy0).h() == SC.e ? C01.i : C01.e;
        }
        InterfaceC4675jU interfaceC4675jUE = gy0.e();
        FC fc = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
        if (fc == null) {
            return C01.e;
        }
        if (!(gy0 instanceof InterfaceC1490Lx)) {
            return C01.e;
        }
        InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) gy0;
        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC1490Lx.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        if (!collectionU.isEmpty() && fc.q() != C01.e) {
            return C01.h;
        }
        if (fc.h() != SC.e || Intrinsics.a(interfaceC1490Lx.d(), C5323mZ.a)) {
            return C01.e;
        }
        C01 c01Q = interfaceC1490Lx.q();
        C01 c01 = C01.i;
        return c01Q == c01 ? c01 : C01.h;
    }

    public final void A(InterfaceC5257mD interfaceC5257mD, StringBuilder sb) {
        List<H62> listA = interfaceC5257mD.A();
        Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
        List<H62> listB = interfaceC5257mD.p().b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        if (u() && interfaceC5257mD.R() && listB.size() > listA.size()) {
            sb.append(" /*captured type parameters: ");
            d0(sb, listB.subList(listA.size(), listB.size()));
            sb.append("*/");
        }
    }

    public final String B(CK<?> ck) {
        C3802fZ c3802fZ = this.d;
        Function1 function1 = (Function1) c3802fZ.v.b(C3802fZ.Y[20], c3802fZ);
        if (function1 != null) {
            return (String) function1.invoke(ck);
        }
        if (ck instanceof C1059Gj) {
            Iterable iterable = (Iterable) ((C1059Gj) ck).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strB = B((CK) it.next());
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            return CollectionsKt.J(arrayList, ", ", "{", "}", null, 56);
        }
        if (ck instanceof C2292Wc) {
            return StringsKt.M(x((InterfaceC1583Nc) ((C2292Wc) ck).a, null), "@");
        }
        if (!(ck instanceof C3965gJ0)) {
            return ck.toString();
        }
        C3965gJ0.a aVar = (C3965gJ0.a) ((C3965gJ0) ck).a;
        if (aVar instanceof C3965gJ0.a.C0360a) {
            return ((C3965gJ0.a.C0360a) aVar).a + "::class";
        }
        if (!(aVar instanceof C3965gJ0.a.b)) {
            throw new C6489s51();
        }
        C3965gJ0.a.b bVar = (C3965gJ0.a.b) aVar;
        String strB2 = bVar.a.a.a().b();
        Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
        int i = bVar.a.b;
        for (int i2 = 0; i2 < i; i2++) {
            strB2 = C1742Pc.d('>', "kotlin.Array<", strB2);
        }
        return Z0.c(strB2, "::class");
    }

    public final void C(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            InterfaceC1076Go1 interfaceC1076Go1 = (InterfaceC1076Go1) it.next();
            y(sb, interfaceC1076Go1, EnumC2132Uc.RECEIVER);
            AbstractC4649jL0 type = interfaceC1076Go1.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(G(type));
            if (i == WE.e(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void D(StringBuilder sb, AbstractC5706oM1 type) {
        y(sb, type, null);
        BW bw = type instanceof BW ? (BW) type : null;
        AbstractC5706oM1 abstractC5706oM1 = bw != null ? bw.e : null;
        if (C3686f.n(type)) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z = type instanceof O70;
            boolean z2 = z && ((O70) type).h.e;
            C3802fZ c3802fZ = this.d;
            if (z2 && ((Boolean) c3802fZ.V.b(C3802fZ.Y[47], c3802fZ)).booleanValue()) {
                R70 r70 = R70.a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(type, "type");
                if (z) {
                    boolean z3 = ((O70) type).h.e;
                }
                InterfaceC6494s62 interfaceC6494s62V0 = type.V0();
                Intrinsics.c(interfaceC6494s62V0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(E(((P70) interfaceC6494s62V0).b[0]));
            } else {
                if (!z || ((Boolean) c3802fZ.X.b(C3802fZ.Y[49], c3802fZ)).booleanValue()) {
                    sb.append(type.V0().toString());
                } else {
                    sb.append(((O70) type).l);
                }
                sb.append(a0(type.T0()));
            }
        } else {
            if (type instanceof XT1) {
                throw null;
            }
            if (abstractC5706oM1 instanceof XT1) {
                ((XT1) abstractC5706oM1).getClass();
                throw null;
            }
            InterfaceC6494s62 interfaceC6494s62V1 = type.V0();
            Intrinsics.checkNotNullParameter(type, "<this>");
            InterfaceC5044lD interfaceC5044lDC = type.V0().c();
            C2065Tf1 c2065Tf1D = C3476e.d(type, interfaceC5044lDC instanceof InterfaceC5257mD ? (InterfaceC5257mD) interfaceC5044lDC : null, 0);
            if (c2065Tf1D == null) {
                sb.append(b0(interfaceC6494s62V1));
                sb.append(a0(type.T0()));
            } else {
                V(sb, c2065Tf1D);
            }
            Unit unit = Unit.a;
        }
        if (type.W0()) {
            sb.append("?");
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type instanceof BW) {
            sb.append(" & Any");
        }
    }

    public final String E(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return C1039Gc0.d("<font color=red><b>", str, "</b></font>");
        }
        throw new C6489s51();
    }

    @NotNull
    public final String F(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull RK0 builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (Cm2.r(lowerRendered, upperRendered)) {
            return d.o(upperRendered, "(", false) ? C1039Gc0.d("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        InterfaceC5467nD interfaceC5467nDP = p();
        builtIns.getClass();
        FC fcI = builtIns.i(C4194hP1.a.C);
        Intrinsics.checkNotNullExpressionValue(fcI, "getCollection(...)");
        String strY = StringsKt.Y(interfaceC5467nDP.a(fcI, this), "Collection");
        String strM = Cm2.m(lowerRendered, Z0.c(strY, "Mutable"), upperRendered, strY, Z0.c(strY, "(Mutable)"));
        if (strM != null) {
            return strM;
        }
        String strM2 = Cm2.m(lowerRendered, Z0.c(strY, "MutableMap.MutableEntry"), upperRendered, Z0.c(strY, "Map.Entry"), Z0.c(strY, "(Mutable)Map.(Mutable)Entry"));
        if (strM2 != null) {
            return strM2;
        }
        InterfaceC5467nD interfaceC5467nDP2 = p();
        FC fcJ = builtIns.j("Array");
        Intrinsics.checkNotNullExpressionValue(fcJ, "getArray(...)");
        String strY2 = StringsKt.Y(interfaceC5467nDP2.a(fcJ, this), "Array");
        StringBuilder sbF = C1039Gc0.f(strY2);
        sbF.append(o("Array<"));
        String string = sbF.toString();
        StringBuilder sbF2 = C1039Gc0.f(strY2);
        sbF2.append(o("Array<out "));
        String string2 = sbF2.toString();
        StringBuilder sbF3 = C1039Gc0.f(strY2);
        sbF3.append(o("Array<(out) "));
        String strM3 = Cm2.m(lowerRendered, string, upperRendered, string2, sbF3.toString());
        if (strM3 != null) {
            return strM3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String G(AbstractC4649jL0 abstractC4649jL0) {
        String strZ = Z(abstractC4649jL0);
        return ((!l0(abstractC4649jL0) || C3089c72.e(abstractC4649jL0)) && !(abstractC4649jL0 instanceof BW)) ? strZ : C1742Pc.d(')', "(", strZ);
    }

    @NotNull
    public final String H(@NotNull C1836Qh0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<C5638o21> listE = fqName.e();
        Intrinsics.checkNotNullExpressionValue(listE, "pathSegments(...)");
        return o(Cm2.l(listE));
    }

    public final void I(InterfaceC2982bd2 interfaceC2982bd2, StringBuilder sb) {
        CK<?> ckD0;
        String strB;
        C3802fZ c3802fZ = this.d;
        if (!((Boolean) c3802fZ.u.b(C3802fZ.Y[19], c3802fZ)).booleanValue() || (ckD0 = interfaceC2982bd2.d0()) == null || (strB = B(ckD0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(strB));
    }

    public final String J(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            C3802fZ c3802fZ = this.d;
            if (!((Boolean) c3802fZ.W.b(C3802fZ.Y[48], c3802fZ)).booleanValue()) {
                return C1039Gc0.d("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void K(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        if (q().contains(EnumC3173cZ.MEMBER_KIND) && u() && interfaceC1490Lx.h() != InterfaceC1490Lx.a.d) {
            sb.append("/*");
            sb.append(C3686f.r(interfaceC1490Lx.h().name()));
            sb.append("*/ ");
        }
    }

    public final void L(GY0 gy0, StringBuilder sb) {
        O(sb, gy0.D(), "external");
        boolean z = false;
        O(sb, q().contains(EnumC3173cZ.EXPECT) && gy0.Q(), "expect");
        if (q().contains(EnumC3173cZ.ACTUAL) && gy0.M0()) {
            z = true;
        }
        O(sb, z, "actual");
    }

    public final void M(C01 c01, StringBuilder sb, C01 c02) {
        C3802fZ c3802fZ = this.d;
        if (((Boolean) c3802fZ.p.b(C3802fZ.Y[14], c3802fZ)).booleanValue() || c01 != c02) {
            O(sb, q().contains(EnumC3173cZ.MODALITY), C3686f.r(c01.name()));
        }
    }

    public final void N(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        if (C4432iZ.s(interfaceC1490Lx) && interfaceC1490Lx.q() == C01.e) {
            return;
        }
        C3802fZ c3802fZ = this.d;
        if (((EnumC1268Ja1) c3802fZ.B.b(C3802fZ.Y[26], c3802fZ)) == EnumC1268Ja1.d && interfaceC1490Lx.q() == C01.h && !interfaceC1490Lx.u().isEmpty()) {
            return;
        }
        C01 c01Q = interfaceC1490Lx.q();
        Intrinsics.checkNotNullExpressionValue(c01Q, "getModality(...)");
        M(c01Q, sb, v(interfaceC1490Lx));
    }

    public final void O(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(J(str));
            sb.append(" ");
        }
    }

    @NotNull
    public final String P(@NotNull C5638o21 name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strO = o(Cm2.k(name));
        C3802fZ c3802fZ = this.d;
        return (((Boolean) c3802fZ.W.b(C3802fZ.Y[48], c3802fZ)).booleanValue() && s() == EnumC1397Kr1.e && z) ? C1039Gc0.d("<b>", strO, "</b>") : strO;
    }

    public final void Q(InterfaceC4675jU interfaceC4675jU, StringBuilder sb, boolean z) {
        C5638o21 name = interfaceC4675jU.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(P(name, z));
    }

    public final void R(StringBuilder sb, AbstractC4649jL0 abstractC4649jL0) {
        P92 p92Y0 = abstractC4649jL0.Y0();
        C6886u c6886u = p92Y0 instanceof C6886u ? (C6886u) p92Y0 : null;
        if (c6886u == null) {
            S(sb, abstractC4649jL0);
            return;
        }
        C3802fZ c3802fZ = this.d;
        C3592eZ c3592eZ = c3802fZ.R;
        IJ0<Object>[] ij0Arr = C3802fZ.Y;
        boolean zBooleanValue = ((Boolean) c3592eZ.b(ij0Arr[42], c3802fZ)).booleanValue();
        AbstractC5706oM1 abstractC5706oM1 = c6886u.g;
        AbstractC5706oM1 abstractC5706oM2 = c6886u.e;
        if (zBooleanValue) {
            S(sb, abstractC5706oM2);
            if (((Boolean) c3802fZ.S.b(ij0Arr[43], c3802fZ)).booleanValue()) {
                EnumC1397Kr1 enumC1397Kr1S = s();
                EnumC1397Kr1.a aVar = EnumC1397Kr1.e;
                if (enumC1397Kr1S == aVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                S(sb, abstractC5706oM1);
                sb.append(" */");
                if (s() == aVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        S(sb, abstractC5706oM1);
        if (((Boolean) c3802fZ.Q.b(ij0Arr[41], c3802fZ)).booleanValue()) {
            EnumC1397Kr1 enumC1397Kr1S2 = s();
            EnumC1397Kr1.a aVar2 = EnumC1397Kr1.e;
            if (enumC1397Kr1S2 == aVar2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            S(sb, abstractC5706oM2);
            sb.append(" */");
            if (s() == aVar2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void S(StringBuilder sb, AbstractC4649jL0 abstractC4649jL0) {
        C5638o21 c5638o21C;
        String strO;
        boolean z = abstractC4649jL0 instanceof AbstractC3223cl2;
        C3802fZ c3802fZ = this.d;
        if (z && c3802fZ.n() && !((AbstractC3223cl2) abstractC4649jL0).a1()) {
            sb.append("<Not computed yet>");
            return;
        }
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            sb.append(((AbstractC2299We0) p92Y0).d1(this, this));
            return;
        }
        if (!(p92Y0 instanceof AbstractC5706oM1)) {
            throw new C6489s51();
        }
        AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) p92Y0;
        if (abstractC5706oM1.equals(C3089c72.b) || abstractC5706oM1.V0() == C3089c72.a.e) {
            sb.append("???");
            return;
        }
        InterfaceC6494s62 interfaceC6494s62V0 = abstractC5706oM1.V0();
        if ((interfaceC6494s62V0 instanceof P70) && ((P70) interfaceC6494s62V0).a == Q70.UNINFERRED_TYPE_VARIABLE) {
            if (!((Boolean) c3802fZ.t.b(C3802fZ.Y[18], c3802fZ)).booleanValue()) {
                sb.append("???");
                return;
            }
            InterfaceC6494s62 interfaceC6494s62V1 = abstractC5706oM1.V0();
            Intrinsics.c(interfaceC6494s62V1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(E(((P70) interfaceC6494s62V1).b[0]));
            return;
        }
        if (C3686f.n(abstractC5706oM1)) {
            D(sb, abstractC5706oM1);
            return;
        }
        if (!l0(abstractC5706oM1)) {
            D(sb, abstractC5706oM1);
            return;
        }
        int length = sb.length();
        ((C2964bZ) this.e.getValue()).y(sb, abstractC5706oM1, null);
        boolean z2 = sb.length() != length;
        AbstractC4649jL0 abstractC4649jL0F = C3427dk0.f(abstractC5706oM1);
        List<AbstractC4649jL0> listD = C3427dk0.d(abstractC5706oM1);
        boolean zI = C3427dk0.i(abstractC5706oM1);
        boolean zW0 = abstractC5706oM1.W0();
        boolean z3 = zW0 || (z2 && abstractC4649jL0F != null);
        if (z3) {
            if (zI) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    CharsKt.c(KS1.A(sb));
                    if (sb.charAt(StringsKt.E(sb) - 1) != ')') {
                        sb.insert(StringsKt.E(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        if (!listD.isEmpty()) {
            sb.append("context(");
            Iterator<AbstractC4649jL0> it = listD.subList(0, WE.e(listD)).iterator();
            while (it.hasNext()) {
                R(sb, it.next());
                sb.append(", ");
            }
            R(sb, (AbstractC4649jL0) CollectionsKt.L(listD));
            sb.append(") ");
        }
        O(sb, zI, "suspend");
        if (abstractC4649jL0F != null) {
            boolean z4 = (l0(abstractC4649jL0F) && !abstractC4649jL0F.W0()) || C3427dk0.i(abstractC4649jL0F) || !abstractC4649jL0F.k().isEmpty() || (abstractC4649jL0F instanceof BW);
            if (z4) {
                sb.append("(");
            }
            R(sb, abstractC4649jL0F);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        if (!C3427dk0.h(abstractC5706oM1) || abstractC5706oM1.k().p(C4194hP1.a.p) == null || abstractC5706oM1.T0().size() > 1) {
            int i = 0;
            for (N62 n62 : C3427dk0.g(abstractC5706oM1)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (((Boolean) c3802fZ.U.b(C3802fZ.Y[45], c3802fZ)).booleanValue()) {
                    AbstractC4649jL0 type = n62.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    c5638o21C = C3427dk0.c(type);
                } else {
                    c5638o21C = null;
                }
                if (c5638o21C != null) {
                    sb.append(P(c5638o21C, false));
                    sb.append(": ");
                }
                sb.append(f0(n62));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            strO = o("->");
        } else {
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            strO = "&rarr;";
        }
        sb.append(strO);
        sb.append(" ");
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        C3427dk0.h(abstractC5706oM1);
        AbstractC4649jL0 type2 = ((N62) CollectionsKt.L(abstractC5706oM1.T0())).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        R(sb, type2);
        if (z3) {
            sb.append(")");
        }
        if (zW0) {
            sb.append("?");
        }
    }

    public final void T(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        if (q().contains(EnumC3173cZ.OVERRIDE) && !interfaceC1490Lx.u().isEmpty()) {
            C3802fZ c3802fZ = this.d;
            if (((EnumC1268Ja1) c3802fZ.B.b(C3802fZ.Y[26], c3802fZ)) != EnumC1268Ja1.e) {
                O(sb, true, "override");
                if (u()) {
                    sb.append("/*");
                    sb.append(interfaceC1490Lx.u().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void U(C1758Ph0 c1758Ph0, String str, StringBuilder sb) {
        sb.append(J(str));
        C1836Qh0 c1836Qh0I = c1758Ph0.i();
        Intrinsics.checkNotNullExpressionValue(c1836Qh0I, "toUnsafe(...)");
        String strH = H(c1836Qh0I);
        if (strH.length() > 0) {
            sb.append(" ");
            sb.append(strH);
        }
    }

    public final void V(StringBuilder sb, C2065Tf1 c2065Tf1) {
        C2065Tf1 c2065Tf2 = c2065Tf1.c;
        InterfaceC5257mD interfaceC5257mD = c2065Tf1.a;
        if (c2065Tf2 != null) {
            V(sb, c2065Tf2);
            sb.append(JwtParser.SEPARATOR_CHAR);
            C5638o21 name = interfaceC5257mD.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb.append(P(name, false));
        } else {
            InterfaceC6494s62 interfaceC6494s62P = interfaceC5257mD.p();
            Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
            sb.append(b0(interfaceC6494s62P));
        }
        sb.append(a0(c2065Tf1.b));
    }

    public final void W(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        InterfaceC1076Go1 interfaceC1076Go1R0 = interfaceC1490Lx.r0();
        if (interfaceC1076Go1R0 != null) {
            y(sb, interfaceC1076Go1R0, EnumC2132Uc.RECEIVER);
            AbstractC4649jL0 type = interfaceC1076Go1R0.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(G(type));
            sb.append(".");
        }
    }

    public final void X(InterfaceC1490Lx interfaceC1490Lx, StringBuilder sb) {
        InterfaceC1076Go1 interfaceC1076Go1R0;
        C3802fZ c3802fZ = this.d;
        if (((Boolean) c3802fZ.F.b(C3802fZ.Y[30], c3802fZ)).booleanValue() && (interfaceC1076Go1R0 = interfaceC1490Lx.r0()) != null) {
            sb.append(" on ");
            AbstractC4649jL0 type = interfaceC1076Go1R0.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(Z(type));
        }
    }

    @NotNull
    public final String Z(@NotNull AbstractC4649jL0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb = new StringBuilder();
        C3802fZ c3802fZ = this.d;
        R(sb, (AbstractC4649jL0) ((Function1) c3802fZ.y.b(C3802fZ.Y[23], c3802fZ)).invoke(type));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void a() {
        this.d.a();
    }

    @NotNull
    public final String a0(@NotNull List<? extends N62> typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        CollectionsKt.I(typeArguments, sb, ", ", null, null, new C2740aZ(this, 0), 60);
        sb.append(o(">"));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void b() {
        this.d.b();
    }

    @NotNull
    public final String b0(@NotNull InterfaceC6494s62 typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        InterfaceC5044lD klass = typeConstructor.c();
        if ((klass instanceof H62) || (klass instanceof FC) || (klass instanceof InterfaceC3714f62)) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            return R70.f(klass) ? klass.p().toString() : p().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof C4622jC0 ? ((C4622jC0) typeConstructor).h(ZY.e) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void c() {
        this.d.c();
    }

    public final void c0(H62 h62, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(h62.l());
            sb.append("*/ ");
        }
        O(sb, h62.K(), "reified");
        String str = h62.S().d;
        boolean z2 = true;
        O(sb, str.length() > 0, str);
        y(sb, h62, null);
        Q(h62, sb, z);
        int size = h62.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC4649jL0 next = h62.getUpperBounds().iterator().next();
            if (next == null) {
                RK0.a(142);
                throw null;
            }
            if (!RK0.x(next) || !next.W0()) {
                sb.append(" : ");
                Intrinsics.checkNotNull(next);
                sb.append(Z(next));
            }
        } else if (z) {
            for (AbstractC4649jL0 abstractC4649jL0 : h62.getUpperBounds()) {
                if (abstractC4649jL0 == null) {
                    RK0.a(142);
                    throw null;
                }
                if (!RK0.x(abstractC4649jL0) || !abstractC4649jL0.W0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    Intrinsics.checkNotNull(abstractC4649jL0);
                    sb.append(Z(abstractC4649jL0));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o(">"));
        }
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void d(@NotNull Set<? extends EnumC3173cZ> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.d.d(set);
    }

    public final void d0(StringBuilder sb, List<? extends H62> list) {
        Iterator<? extends H62> it = list.iterator();
        while (it.hasNext()) {
            c0(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void e(@NotNull LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.d.e(linkedHashSet);
    }

    public final void e0(StringBuilder sb, List list, boolean z) {
        C3802fZ c3802fZ = this.d;
        if (((Boolean) c3802fZ.w.b(C3802fZ.Y[21], c3802fZ)).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        d0(sb, list);
        sb.append(o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void f() {
        this.d.f();
    }

    @NotNull
    public final String f0(@NotNull N62 typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        CollectionsKt.I(VE.c(typeProjection), sb, ", ", null, null, new C2740aZ(this, 0), 60);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void g(@NotNull InterfaceC5467nD interfaceC5467nD) {
        Intrinsics.checkNotNullParameter(interfaceC5467nD, "<set-?>");
        this.d.g(interfaceC5467nD);
    }

    public final void g0(InterfaceC2982bd2 interfaceC2982bd2, StringBuilder sb, boolean z) {
        if (z || !(interfaceC2982bd2 instanceof Xc2)) {
            sb.append(J(interfaceC2982bd2.p0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void h(@NotNull EnumC1897Rb1 enumC1897Rb1) {
        Intrinsics.checkNotNullParameter(enumC1897Rb1, "<set-?>");
        this.d.h(enumC1897Rb1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final void h0(Xc2 xc2, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(J("value-parameter"));
            sb.append(" ");
        }
        if (u()) {
            sb.append("/*");
            sb.append(xc2.l());
            sb.append("*/ ");
        }
        y(sb, xc2, null);
        O(sb, xc2.j0(), "crossinline");
        O(sb, xc2.f0(), "noinline");
        C3802fZ c3802fZ = this.d;
        C3592eZ c3592eZ = c3802fZ.r;
        IJ0<Object>[] ij0Arr = C3802fZ.Y;
        boolean z4 = false;
        if (((Boolean) c3592eZ.b(ij0Arr[16], c3802fZ)).booleanValue()) {
            InterfaceC1335Jx interfaceC1335JxE = xc2.e();
            InterfaceC7984zC interfaceC7984zC = interfaceC1335JxE instanceof InterfaceC7984zC ? (InterfaceC7984zC) interfaceC1335JxE : null;
            if (interfaceC7984zC == null || !interfaceC7984zC.G()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            O(sb, ((Boolean) c3802fZ.s.b(ij0Arr[17], c3802fZ)).booleanValue(), "actual");
        }
        AbstractC4649jL0 type = xc2.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        AbstractC4649jL0 abstractC4649jL0Q0 = xc2.q0();
        AbstractC4649jL0 abstractC4649jL0 = abstractC4649jL0Q0 == null ? type : abstractC4649jL0Q0;
        O(sb, abstractC4649jL0Q0 != null, "vararg");
        if (z3 || (z2 && !r())) {
            g0(xc2, sb, z3);
        }
        if (z) {
            Q(xc2, sb, z2);
            sb.append(": ");
        }
        sb.append(Z(abstractC4649jL0));
        I(xc2, sb);
        if (u() && abstractC4649jL0Q0 != null) {
            sb.append(" /*");
            sb.append(Z(type));
            sb.append("*/");
        }
        if (((Function1) c3802fZ.z.b(ij0Arr[24], c3802fZ)) != null) {
            if (c3802fZ.n() ? xc2.z0() : C4900kZ.a(xc2)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            Function1 function1 = (Function1) c3802fZ.z.b(ij0Arr[24], c3802fZ);
            Intrinsics.checkNotNull(function1);
            sb2.append((String) function1.invoke(xc2));
            sb.append(sb2.toString());
        }
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void i() {
        this.d.i();
    }

    public final void i0(StringBuilder sb, List list, boolean z) {
        C3802fZ c3802fZ = this.d;
        int iOrdinal = ((EnumC1897Rb1) c3802fZ.E.b(C3802fZ.Y[29], c3802fZ)).ordinal();
        boolean z2 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C6489s51();
                }
            } else if (z) {
            }
            z2 = false;
        }
        int size = list.size();
        t().b(sb);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Xc2 xc2 = (Xc2) it.next();
            t().d(xc2, sb);
            h0(xc2, z2, sb, false);
            t().a(xc2, i, size, sb);
            i++;
        }
        t().c(sb);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void j() {
        this.d.j();
    }

    public final boolean j0(AbstractC5533nZ abstractC5533nZ, StringBuilder sb) {
        if (!q().contains(EnumC3173cZ.VISIBILITY)) {
            return false;
        }
        C3802fZ c3802fZ = this.d;
        C3592eZ c3592eZ = c3802fZ.n;
        IJ0<Object>[] ij0Arr = C3802fZ.Y;
        if (((Boolean) c3592eZ.b(ij0Arr[12], c3802fZ)).booleanValue()) {
            abstractC5533nZ = abstractC5533nZ.d();
        }
        if (!((Boolean) c3802fZ.o.b(ij0Arr[13], c3802fZ)).booleanValue() && Intrinsics.a(abstractC5533nZ, C5323mZ.k)) {
            return false;
        }
        sb.append(J(abstractC5533nZ.b()));
        sb.append(" ");
        return true;
    }

    @Override // defpackage.InterfaceC3383dZ
    @NotNull
    public final Set<C1758Ph0> k() {
        return this.d.k();
    }

    public final void k0(StringBuilder sb, List list) {
        C3802fZ c3802fZ = this.d;
        if (((Boolean) c3802fZ.w.b(C3802fZ.Y[21], c3802fZ)).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H62 h62 = (H62) it.next();
            List<AbstractC4649jL0> upperBounds = h62.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (AbstractC4649jL0 abstractC4649jL0 : CollectionsKt.A(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                C5638o21 name = h62.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb2.append(P(name, false));
                sb2.append(" : ");
                Intrinsics.checkNotNull(abstractC4649jL0);
                sb2.append(Z(abstractC4649jL0));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(J("where"));
        sb.append(" ");
        CollectionsKt.I(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void l() {
        Intrinsics.checkNotNullParameter(EnumC1397Kr1.e, "<set-?>");
        this.d.l();
    }

    @Override // defpackage.InterfaceC3383dZ
    public final void m() {
        this.d.m();
    }

    public final String o(String str) {
        return s().b(str);
    }

    @NotNull
    public final InterfaceC5467nD p() {
        C3802fZ c3802fZ = this.d;
        return (InterfaceC5467nD) c3802fZ.b.b(C3802fZ.Y[0], c3802fZ);
    }

    @NotNull
    public final Set<EnumC3173cZ> q() {
        C3802fZ c3802fZ = this.d;
        return (Set) c3802fZ.e.b(C3802fZ.Y[3], c3802fZ);
    }

    public final boolean r() {
        C3802fZ c3802fZ = this.d;
        return ((Boolean) c3802fZ.f.b(C3802fZ.Y[4], c3802fZ)).booleanValue();
    }

    @NotNull
    public final EnumC1397Kr1 s() {
        C3802fZ c3802fZ = this.d;
        return (EnumC1397Kr1) c3802fZ.D.b(C3802fZ.Y[28], c3802fZ);
    }

    @NotNull
    public final XY.b t() {
        C3802fZ c3802fZ = this.d;
        return (XY.b) c3802fZ.C.b(C3802fZ.Y[27], c3802fZ);
    }

    public final boolean u() {
        C3802fZ c3802fZ = this.d;
        return ((Boolean) c3802fZ.j.b(C3802fZ.Y[8], c3802fZ)).booleanValue();
    }

    @NotNull
    public final String w(@NotNull InterfaceC4675jU declarationDescriptor) {
        InterfaceC4675jU interfaceC4675jUE;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.e0(new a(), sb);
        C3802fZ c3802fZ = this.d;
        C3592eZ c3592eZ = c3802fZ.c;
        IJ0<Object>[] ij0Arr = C3802fZ.Y;
        if (((Boolean) c3592eZ.b(ij0Arr[1], c3802fZ)).booleanValue() && !(declarationDescriptor instanceof InterfaceC2392Xa1) && !(declarationDescriptor instanceof InterfaceC5752ob1) && (interfaceC4675jUE = declarationDescriptor.e()) != null && !(interfaceC4675jUE instanceof S01)) {
            sb.append(" ");
            String str = "defined in";
            Intrinsics.checkNotNullParameter("defined in", "message");
            int iOrdinal = s().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new C6489s51();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C1836Qh0 c1836Qh0G = C4432iZ.g(interfaceC4675jUE);
            Intrinsics.checkNotNullExpressionValue(c1836Qh0G, "getFqName(...)");
            sb.append(c1836Qh0G.a.isEmpty() ? "root package" : H(c1836Qh0G));
            if (((Boolean) c3802fZ.d.b(ij0Arr[2], c3802fZ)).booleanValue() && (interfaceC4675jUE instanceof InterfaceC2392Xa1) && (declarationDescriptor instanceof InterfaceC5728oU)) {
                ((InterfaceC5728oU) declarationDescriptor).i().a();
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String x(@NotNull InterfaceC1583Nc annotation, @Nullable EnumC2132Uc enumC2132Uc) {
        InterfaceC7984zC interfaceC7984zCX;
        List<Xc2> listJ;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC2132Uc != null) {
            sb.append(enumC2132Uc.d + ':');
        }
        AbstractC4649jL0 type = annotation.getType();
        sb.append(Z(type));
        C3802fZ c3802fZ = this.d;
        c3802fZ.getClass();
        IJ0<Object>[] ij0Arr = C3802fZ.Y;
        IJ0<Object> ij0 = ij0Arr[38];
        C3592eZ c3592eZ = c3802fZ.N;
        if (((EnumC1038Gc) c3592eZ.b(ij0, c3802fZ)).d) {
            Map<C5638o21, CK<?>> mapJ = annotation.j();
            List list = null;
            FC fcD = ((Boolean) c3802fZ.I.b(ij0Arr[33], c3802fZ)).booleanValue() ? C4900kZ.d(annotation) : null;
            if (fcD != null && (interfaceC7984zCX = fcD.X()) != null && (listJ = interfaceC7984zCX.j()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listJ) {
                    if (((Xc2) obj).z0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Xc2) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = C5653o60.d;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapJ.containsKey((C5638o21) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(XE.m(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C5638o21) it2.next()).e() + " = ...");
            }
            Set<Map.Entry<C5638o21, CK<?>>> setEntrySet = mapJ.entrySet();
            ArrayList arrayList5 = new ArrayList(XE.m(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                C5638o21 c5638o21 = (C5638o21) entry.getKey();
                CK<?> ck = (CK) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c5638o21.e());
                sb2.append(" = ");
                sb2.append(!list.contains(c5638o21) ? B(ck) : "...");
                arrayList5.add(sb2.toString());
            }
            List listY = CollectionsKt.Y(CollectionsKt.Q(arrayList4, arrayList5));
            if (((EnumC1038Gc) c3592eZ.b(C3802fZ.Y[38], c3802fZ)).e || !listY.isEmpty()) {
                CollectionsKt.I(listY, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (C3686f.n(type) || (type.V0().c() instanceof G51.b))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void y(StringBuilder sb, InterfaceC0726Cc interfaceC0726Cc, EnumC2132Uc enumC2132Uc) {
        if (q().contains(EnumC3173cZ.ANNOTATIONS)) {
            boolean z = interfaceC0726Cc instanceof AbstractC4649jL0;
            C3802fZ c3802fZ = this.d;
            Set<C1758Ph0> setK = z ? c3802fZ.k() : (Set) c3802fZ.K.b(C3802fZ.Y[35], c3802fZ);
            Function1 function1 = (Function1) c3802fZ.M.b(C3802fZ.Y[37], c3802fZ);
            for (InterfaceC1583Nc interfaceC1583Nc : interfaceC0726Cc.k()) {
                if (!CollectionsKt.z(setK, interfaceC1583Nc.c()) && !Intrinsics.a(interfaceC1583Nc.c(), C4194hP1.a.r) && (function1 == null || ((Boolean) function1.invoke(interfaceC1583Nc)).booleanValue())) {
                    sb.append(x(interfaceC1583Nc, enumC2132Uc));
                    if (((Boolean) c3802fZ.J.b(C3802fZ.Y[34], c3802fZ)).booleanValue()) {
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
