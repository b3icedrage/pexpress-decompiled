package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.JwtParser;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1589Ne implements InterfaceC7604xP0, E60, J71, InterfaceC1322Js1, WO1 {

    @NotNull
    public static final C1589Ne d = new C1589Ne();

    @NotNull
    public static final RJ0[] e = new RJ0[0];

    @NotNull
    public static final GW1 g = new GW1("NO_VALUE");

    @NotNull
    public static final GW1 h = new GW1("NONE");

    @NotNull
    public static final GW1 i = new GW1("PENDING");

    @NotNull
    public static final C6120qK1 g(int i2, int i3, @NotNull EnumC1796Pu enumC1796Pu) {
        if (i2 < 0) {
            throw new IllegalArgumentException(EK.e(i2, "replay cannot be negative, but was ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(EK.e(i3, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i2 <= 0 && i3 <= 0 && enumC1796Pu != EnumC1796Pu.d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC1796Pu).toString());
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return new C6120qK1(i2, i4, enumC1796Pu);
    }

    @NotNull
    public static final GP1 i(Object obj) {
        if (obj == null) {
            obj = C5208m0.h;
        }
        return new GP1(obj);
    }

    public static final Object j(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void k(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final void l(@Nullable C4527a.C0404a c0404a, @Nullable Throwable th) {
        try {
            c0404a.close();
        } catch (Throwable th2) {
            J90.a(th, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    @NotNull
    public static final String m(@NotNull FC classDescriptor, @NotNull C3481e1 typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(classDescriptor, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.getClass();
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        InterfaceC4675jU interfaceC4675jUE = classDescriptor.e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        C5638o21 name = classDescriptor.getName();
        if (name != null) {
            C5638o21 c5638o21 = C6761tO1.a;
            if (name.e) {
                name = C6761tO1.c;
            }
        } else {
            name = C6761tO1.c;
        }
        String strF = name.f();
        Intrinsics.checkNotNullExpressionValue(strF, "getIdentifier(...)");
        if (interfaceC4675jUE instanceof InterfaceC2392Xa1) {
            C1758Ph0 c1758Ph0C = ((InterfaceC2392Xa1) interfaceC4675jUE).c();
            if (c1758Ph0C.d()) {
                return strF;
            }
            StringBuilder sb = new StringBuilder();
            String strB = c1758Ph0C.b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            sb.append(d.l(strB, JwtParser.SEPARATOR_CHAR, '/'));
            sb.append('/');
            sb.append(strF);
            return sb.toString();
        }
        FC classDescriptor2 = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
        if (classDescriptor2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC4675jUE + " for " + classDescriptor);
        }
        Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
        return m(classDescriptor2, typeMappingConfiguration) + '$' + strF;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.text.Regex] */
    @NotNull
    public static String n(@NotNull BufferedReader reader) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter("AppData", "varName");
        ?? sb = new StringBuilder();
        ?? regex = new Regex("var\\s+AppData\\s*=\\s*\\{");
        try {
            boolean z2 = false;
            boolean z3 = false;
            int i2 = 0;
            for (?? r12 : C0648Bc.h(reader)) {
                if (StringsKt.C(r12, "<script", z2)) {
                    z3 = true;
                }
                if (z3) {
                    if (regex.a(r12)) {
                        sb.append(StringsKt.V(r12, "{", r12));
                        boolean z4 = z2;
                        ?? r16 = z4;
                        ?? r13 = z4;
                        while (r13 < r12.length()) {
                            if (r12.charAt(r13) == '{') {
                                r16++;
                            }
                            r13++;
                            r16 = r16;
                        }
                        boolean z5 = z2;
                        ?? r14 = z5;
                        ?? r0 = z5;
                        while (r0 < r12.length()) {
                            if (r12.charAt(r0) == '}') {
                                r14++;
                            }
                            r0++;
                            r14 = r14;
                        }
                        i2 = (r16 - r14) + i2;
                        z = z2;
                    } else if (i2 > 0) {
                        sb.append(r12);
                        boolean z6 = z2;
                        ?? r15 = z6;
                        ?? r1 = z6;
                        while (r1 < r12.length()) {
                            if (r12.charAt(r1) == '{') {
                                r15++;
                            }
                            r1++;
                            r15 = r15;
                        }
                        int i3 = 0;
                        for (int i4 = 0; i4 < r12.length(); i4++) {
                            if (r12.charAt(i4) == '}') {
                                i3++;
                            }
                        }
                        i2 += r15 - i3;
                        if (i2 == 0) {
                            break;
                        }
                    }
                    if (StringsKt.C(r12, "</script>", z)) {
                        z2 = z;
                        z3 = z2;
                    } else {
                        z2 = z;
                    }
                }
                z = false;
                if (StringsKt.C(r12, "</script>", z)) {
                    z2 = z;
                    z3 = z2;
                } else {
                    z2 = z;
                }
            }
            Unit unit = Unit.a;
            reader.close();
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = StringsKt.d0(StringsKt.Z(string, "};", string)).toString();
            if (string2.length() != 0) {
                return C1039Gc0.d("{ ", new Regex(";\\s*$").replace(string2, ""), " }");
            }
            Intrinsics.checkNotNullParameter("AppData", "varName");
            throw new C1511Me("AppData not found in the HTML content");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(reader, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final InterfaceC6396rf0 o(@NotNull InterfaceC5910pK1 interfaceC5910pK1, @NotNull CoroutineContext coroutineContext, int i2, @NotNull EnumC1796Pu enumC1796Pu) {
        return ((i2 == 0 || i2 == -3) && enumC1796Pu == EnumC1796Pu.d) ? interfaceC5910pK1 : new C2465Xz(i2, enumC1796Pu, interfaceC5910pK1, coroutineContext);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:12:0x0103  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x040d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0165  */
    @NotNull
    public static final Object p(@NotNull AbstractC4649jL0 type, @NotNull G62 mode, @NotNull InterfaceC1060Gj0 writeGenericType) {
        QC qcF;
        List<RE0.a> list;
        HI0.c possiblyPrimitiveType;
        boolean z;
        Object possiblyPrimitiveType2;
        FC fc;
        HI0.b bVarB;
        G62 g62;
        Object objP;
        int iOrdinal;
        Object bVar;
        DI0 di0;
        II0 typeFactory = II0.a;
        C3481e1 typeMappingConfiguration = C3481e1.f;
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        Intrinsics.checkNotNullParameter(typeFactory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        Intrinsics.checkNotNullParameter(type, "kotlinType");
        if (C3427dk0.i(type)) {
            T11 t11 = C8046zW1.a;
            Intrinsics.checkNotNullParameter(type, "suspendFunType");
            C3427dk0.i(type);
            RK0 rk0L = C0564Aa.l(type);
            InterfaceC2396Xc interfaceC2396XcK = type.k();
            AbstractC4649jL0 abstractC4649jL0F = C3427dk0.f(type);
            List<AbstractC4649jL0> listD = C3427dk0.d(type);
            List<N62> listG = C3427dk0.g(type);
            ArrayList arrayList = new ArrayList(XE.m(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(((N62) it.next()).getType());
            }
            C5655o62.e.getClass();
            C5655o62 c5655o62 = C5655o62.g;
            InterfaceC6494s62 interfaceC6494s62P = C8046zW1.a.p();
            Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
            Intrinsics.checkNotNullParameter(type, "<this>");
            C3427dk0.h(type);
            AbstractC4649jL0 type2 = ((N62) CollectionsKt.L(type.T0())).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            ArrayList arrayListR = CollectionsKt.R(arrayList, C5492nL0.c(c5655o62, interfaceC6494s62P, VE.c(C0564Aa.b(type2)), false, null));
            AbstractC5706oM1 abstractC5706oM1O = C0564Aa.l(type).o();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1O, "getNullableAnyType(...)");
            return p(C3427dk0.b(rk0L, interfaceC2396XcK, abstractC4649jL0F, listD, arrayListR, abstractC5706oM1O, false).Z0(type.W0()), mode, writeGenericType);
        }
        C3136cM1 c3136cM1 = C3136cM1.a;
        Intrinsics.checkNotNullParameter(c3136cM1, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        InterfaceC6494s62 receiver = c3136cM1.X(type);
        if (InterfaceC4366iD.a.x(receiver)) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof InterfaceC6494s62)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
            }
            InterfaceC5044lD interfaceC5044lDC = receiver.c();
            Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            EnumC6405rh1 primitiveType = RK0.t((FC) interfaceC5044lDC);
            if (primitiveType != null) {
                Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
                switch (primitiveType.ordinal()) {
                    case 0:
                        possiblyPrimitiveType = HI0.a;
                        break;
                    case 1:
                        possiblyPrimitiveType = HI0.b;
                        break;
                    case 2:
                        possiblyPrimitiveType = HI0.c;
                        break;
                    case 3:
                        possiblyPrimitiveType = HI0.d;
                        break;
                    case 4:
                        possiblyPrimitiveType = HI0.e;
                        break;
                    case 5:
                        possiblyPrimitiveType = HI0.f;
                        break;
                    case 6:
                        possiblyPrimitiveType = HI0.g;
                        break;
                    case 7:
                        possiblyPrimitiveType = HI0.h;
                        break;
                    default:
                        throw new C6489s51();
                }
                if (InterfaceC4366iD.a.G(type)) {
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(c3136cM1, "<this>");
                    Intrinsics.checkNotNullParameter(type, "type");
                    C1758Ph0 ENHANCED_NULLABILITY_ANNOTATION = C3333dI0.p;
                    Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (InterfaceC4366iD.a.t(type, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                Intrinsics.checkNotNullParameter(typeFactory, "<this>");
                Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
                possiblyPrimitiveType2 = possiblyPrimitiveType;
                if (z) {
                    Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
                    possiblyPrimitiveType2 = possiblyPrimitiveType;
                    if (possiblyPrimitiveType != null) {
                        DI0 di1 = possiblyPrimitiveType.i;
                        possiblyPrimitiveType2 = possiblyPrimitiveType;
                        if (di1 != null) {
                            C1758Ph0 c1758Ph0 = di1.h;
                            if (c1758Ph0 == null) {
                                DI0.b(15);
                                throw null;
                            }
                            String internalName = C6952uI0.b(c1758Ph0).d();
                            Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
                            Intrinsics.checkNotNullParameter(internalName, "internalName");
                            possiblyPrimitiveType2 = new HI0.b(internalName);
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                if (!(receiver instanceof InterfaceC6494s62)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver);
                    sb2.append(", ");
                    throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb2).toString());
                }
                InterfaceC5044lD interfaceC5044lDC2 = receiver.c();
                Intrinsics.c(interfaceC5044lDC2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                EnumC6405rh1 enumC6405rh1R = RK0.r((FC) interfaceC5044lDC2);
                if (enumC6405rh1R != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    DI0 di2 = (DI0) DI0.r.get(enumC6405rh1R);
                    if (di2 == null) {
                        DI0.b(6);
                        throw null;
                    }
                    sb3.append(di2.f());
                    possiblyPrimitiveType2 = II0.a(sb3.toString());
                } else {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof InterfaceC6494s62)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(receiver);
                        sb4.append(", ");
                        throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb4).toString());
                    }
                    InterfaceC5044lD interfaceC5044lDC3 = receiver.c();
                    if (interfaceC5044lDC3 != null && RK0.J(interfaceC5044lDC3)) {
                        Intrinsics.checkNotNullParameter(receiver, "$receiver");
                        if (!(receiver instanceof InterfaceC6494s62)) {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(receiver);
                            sb5.append(", ");
                            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb5).toString());
                        }
                        InterfaceC5044lD interfaceC5044lDC4 = receiver.c();
                        Intrinsics.c(interfaceC5044lDC4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        C1836Qh0 c1836Qh0H = C4900kZ.h((FC) interfaceC5044lDC4);
                        if (c1836Qh0H != null) {
                            String str = RE0.a;
                            qcF = RE0.f(c1836Qh0H);
                        } else {
                            qcF = null;
                        }
                        if (qcF == null) {
                            possiblyPrimitiveType2 = null;
                        } else {
                            if (!mode.g && ((list = RE0.n) == null || !list.isEmpty())) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((RE0.a) it2.next()).a.equals(qcF)) {
                                            possiblyPrimitiveType2 = null;
                                        }
                                    }
                                }
                            }
                            String strE = C6952uI0.e(qcF);
                            Intrinsics.checkNotNullExpressionValue(strE, "internalNameByClassId(...)");
                            possiblyPrimitiveType2 = typeFactory.b(strE);
                        }
                    } else {
                        possiblyPrimitiveType2 = null;
                    }
                }
            }
        } else {
            possiblyPrimitiveType2 = null;
        }
        if (possiblyPrimitiveType2 != null) {
            Intrinsics.checkNotNullParameter(typeFactory, "<this>");
            Intrinsics.checkNotNullParameter(possiblyPrimitiveType2, "possiblyPrimitiveType");
            if (mode.a) {
                Intrinsics.checkNotNullParameter(possiblyPrimitiveType2, "possiblyPrimitiveType");
                if (!(possiblyPrimitiveType2 instanceof HI0.c) || (di0 = ((HI0.c) possiblyPrimitiveType2).i) == null) {
                    bVar = possiblyPrimitiveType2;
                } else {
                    C1758Ph0 c1758Ph1 = di0.h;
                    if (c1758Ph1 == null) {
                        DI0.b(15);
                        throw null;
                    }
                    String internalName2 = C6952uI0.b(c1758Ph1).d();
                    Intrinsics.checkNotNullExpressionValue(internalName2, "getInternalName(...)");
                    Intrinsics.checkNotNullParameter(internalName2, "internalName");
                    bVar = new HI0.b(internalName2);
                }
            } else {
                bVar = possiblyPrimitiveType2;
            }
            writeGenericType.k(type, bVar, mode);
            return bVar;
        }
        InterfaceC6494s62 interfaceC6494s62V0 = type.V0();
        if (interfaceC6494s62V0 instanceof C4622jC0) {
            C4622jC0 c4622jC0 = (C4622jC0) interfaceC6494s62V0;
            AbstractC4649jL0 abstractC4649jL0 = c4622jC0.a;
            if (abstractC4649jL0 != null) {
                return p(C0564Aa.v(abstractC4649jL0), mode, writeGenericType);
            }
            LinkedHashSet<AbstractC4649jL0> types = c4622jC0.b;
            Intrinsics.checkNotNullParameter(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.J(types, null, null, null, null, 63));
        }
        InterfaceC5044lD interfaceC5044lDC5 = interfaceC6494s62V0.c();
        if (interfaceC5044lDC5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + type);
        }
        if (R70.f(interfaceC5044lDC5)) {
            HI0.b bVarB2 = typeFactory.b("error/NonExistentClass");
            FC descriptor = (FC) interfaceC5044lDC5;
            Intrinsics.checkNotNullParameter(type, "kotlinType");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return bVarB2;
        }
        boolean z2 = interfaceC5044lDC5 instanceof FC;
        boolean z3 = mode.c;
        if (z2 && RK0.y(type)) {
            if (type.T0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            N62 n62 = type.T0().get(0);
            AbstractC4649jL0 type3 = n62.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            if (n62.b() == EnumC3610ed2.IN_VARIANCE) {
                objP = typeFactory.b("java/lang/Object");
            } else {
                EnumC3610ed2 effectiveVariance = n62.b();
                Intrinsics.checkNotNullExpressionValue(effectiveVariance, "getProjectionKind(...)");
                Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
                if (z3 || ((iOrdinal = effectiveVariance.ordinal()) == 0 ? (g62 = mode.i) == null : !(iOrdinal == 1 ? (g62 = mode.h) != null : (g62 = mode.f) != null))) {
                    g62 = mode;
                }
                objP = p(type3, g62, writeGenericType);
            }
            return II0.a("[" + II0.c((HI0) objP));
        }
        if (!z2) {
            if (interfaceC5044lDC5 instanceof H62) {
                AbstractC4649jL0 abstractC4649jL0N = C0564Aa.n((H62) interfaceC5044lDC5);
                if (type.W0()) {
                    abstractC4649jL0N = C0564Aa.s(abstractC4649jL0N);
                }
                return p(abstractC4649jL0N, mode, C4056gk0.d);
            }
            if ((interfaceC5044lDC5 instanceof InterfaceC3714f62) && mode.j) {
                return p(((InterfaceC3714f62) interfaceC5044lDC5).b0(), mode, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + type);
        }
        if (C7138vA0.b(interfaceC5044lDC5) && !mode.b) {
            Intrinsics.checkNotNullParameter(c3136cM1, "<this>");
            Intrinsics.checkNotNullParameter(type, "inlineClassType");
            AbstractC4649jL0 abstractC4649jL1 = (AbstractC4649jL0) UE.g(type, new HashSet());
            if (abstractC4649jL1 != null) {
                return p(abstractC4649jL1, new G62(mode.a, true, mode.c, mode.d, mode.e, mode.f, mode.g, mode.h, mode.i, UserVerificationMethods.USER_VERIFY_NONE), writeGenericType);
            }
        }
        if (z3) {
            C5638o21 c5638o21 = RK0.e;
            if (RK0.b((FC) interfaceC5044lDC5, C4194hP1.a.Q)) {
                Intrinsics.checkNotNullParameter("java/lang/Class", "internalName");
                bVarB = new HI0.b("java/lang/Class");
            } else {
                fc = (FC) interfaceC5044lDC5;
                FC classDescriptor = fc.U0();
                Intrinsics.checkNotNullExpressionValue(classDescriptor, "getOriginal(...)");
                Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                if (fc.h() == SC.h) {
                    InterfaceC4675jU interfaceC4675jUE = fc.e();
                    Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    fc = (FC) interfaceC4675jUE;
                }
                FC fcA = fc.U0();
                Intrinsics.checkNotNullExpressionValue(fcA, "getOriginal(...)");
                bVarB = typeFactory.b(m(fcA, typeMappingConfiguration));
            }
        } else {
            fc = (FC) interfaceC5044lDC5;
            FC classDescriptor2 = fc.U0();
            Intrinsics.checkNotNullExpressionValue(classDescriptor2, "getOriginal(...)");
            Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
            if (fc.h() == SC.h) {
                InterfaceC4675jU interfaceC4675jUE2 = fc.e();
                Intrinsics.c(interfaceC4675jUE2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                fc = (FC) interfaceC4675jUE2;
            }
            FC fcA2 = fc.U0();
            Intrinsics.checkNotNullExpressionValue(fcA2, "getOriginal(...)");
            bVarB = typeFactory.b(m(fcA2, typeMappingConfiguration));
        }
        writeGenericType.k(type, bVarB, mode);
        return bVarB;
    }

    @Nullable
    public static final RJ0 q(@NotNull RI0 rootClass, @NotNull ArrayList serializers, @NotNull Function0 elementClassifierIfArray) {
        RJ0 c5861p52;
        RJ0 c3445dp1;
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        if (Intrinsics.a(rootClass, c2251Vp1.b(Collection.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(List.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(List.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(ArrayList.class))) {
            c5861p52 = new C7462wj((RJ0) serializers.get(0));
        } else if (Intrinsics.a(rootClass, c2251Vp1.b(HashSet.class))) {
            c5861p52 = new C1539Mn0((RJ0) serializers.get(0));
        } else {
            if (Intrinsics.a(rootClass, c2251Vp1.b(Set.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(Set.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(LinkedHashSet.class))) {
                c5861p52 = new C7186vQ0((RJ0) serializers.get(0));
            } else if (Intrinsics.a(rootClass, c2251Vp1.b(HashMap.class))) {
                c5861p52 = new C1384Kn0((RJ0) serializers.get(0), (RJ0) serializers.get(1));
            } else {
                if (Intrinsics.a(rootClass, c2251Vp1.b(Map.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(Map.class)) ? true : Intrinsics.a(rootClass, c2251Vp1.b(LinkedHashMap.class))) {
                    c5861p52 = new C6976uQ0((RJ0) serializers.get(0), (RJ0) serializers.get(1));
                } else {
                    if (Intrinsics.a(rootClass, c2251Vp1.b(Map.Entry.class))) {
                        RJ0 keySerializer = (RJ0) serializers.get(0);
                        RJ0 valueSerializer = (RJ0) serializers.get(1);
                        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                        c3445dp1 = new C6784tW0(keySerializer, valueSerializer);
                    } else if (Intrinsics.a(rootClass, c2251Vp1.b(Pair.class))) {
                        RJ0 keySerializer2 = (RJ0) serializers.get(0);
                        RJ0 valueSerializer2 = (RJ0) serializers.get(1);
                        Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
                        Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
                        c3445dp1 = new C1115Hb1(keySerializer2, valueSerializer2);
                    } else if (Intrinsics.a(rootClass, c2251Vp1.b(C5651o52.class))) {
                        RJ0 aSerializer = (RJ0) serializers.get(0);
                        RJ0 bSerializer = (RJ0) serializers.get(1);
                        RJ0 cSerializer = (RJ0) serializers.get(2);
                        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
                        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
                        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
                        c5861p52 = new C5861p52(aSerializer, bSerializer, cSerializer);
                    } else {
                        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
                        if (C7279vr.g(rootClass).isArray()) {
                            Object objInvoke = elementClassifierIfArray.invoke();
                            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                            RI0 kClass = (RI0) objInvoke;
                            RJ0 elementSerializer = (RJ0) serializers.get(0);
                            Intrinsics.checkNotNullParameter(kClass, "kClass");
                            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
                            c3445dp1 = new C3445dp1(kClass, elementSerializer);
                        } else {
                            c5861p52 = null;
                        }
                    }
                    c5861p52 = c3445dp1;
                }
            }
        }
        if (c5861p52 != null) {
            return c5861p52;
        }
        RJ0[] rj0Arr = (RJ0[]) serializers.toArray(new RJ0[0]);
        return C3476e.g(rootClass, (RJ0[]) Arrays.copyOf(rj0Arr, rj0Arr.length));
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @Nullable
    public static final RJ0 s(@NotNull G1 g1, @NotNull SJ0 type) {
        Intrinsics.checkNotNullParameter(g1, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return C4173hI1.a(g1, type, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public static final RJ0 t(@NotNull RI0 ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        RJ0 rj0G = C3476e.g(ri0, new RJ0[0]);
        if (rj0G != null) {
            return rj0G;
        }
        Object obj = C6615sh1.a;
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        return (RJ0) C6615sh1.a.get(ri0);
    }

    @Nullable
    public static final ArrayList u(@NotNull G1 g1, @NotNull List typeArguments, boolean z) {
        Intrinsics.checkNotNullParameter(g1, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (!z) {
            ArrayList arrayList = new ArrayList(XE.m(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                RJ0 rj0S = s(g1, (SJ0) it.next());
                if (rj0S == null) {
                    return null;
                }
                arrayList.add(rj0S);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(XE.m(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            SJ0 type = (SJ0) it2.next();
            Intrinsics.checkNotNullParameter(g1, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            RJ0<Object> rj0A = C4173hI1.a(g1, type, true);
            if (rj0A == null) {
                RI0 ri0I = LL.i(type);
                Intrinsics.checkNotNullParameter(ri0I, "<this>");
                LL.k(ri0I);
                throw null;
            }
            arrayList2.add(rj0A);
        }
        return arrayList2;
    }

    public static boolean v(InterfaceC4366iD interfaceC4366iD, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6126qM1 interfaceC6126qM2) {
        if (interfaceC4366iD.b(interfaceC6126qM1) == interfaceC4366iD.b(interfaceC6126qM2) && interfaceC4366iD.U(interfaceC6126qM1) == interfaceC4366iD.U(interfaceC6126qM2)) {
            if ((interfaceC4366iD.m0(interfaceC6126qM1) == null) == (interfaceC4366iD.m0(interfaceC6126qM2) == null) && interfaceC4366iD.R(interfaceC4366iD.J(interfaceC6126qM1), interfaceC4366iD.J(interfaceC6126qM2))) {
                if (!interfaceC4366iD.S(interfaceC6126qM1, interfaceC6126qM2)) {
                    int iB = interfaceC4366iD.b(interfaceC6126qM1);
                    for (int i2 = 0; i2 < iB; i2++) {
                        InterfaceC4812k62 interfaceC4812k62G0 = interfaceC4366iD.g0(interfaceC6126qM1, i2);
                        InterfaceC4812k62 interfaceC4812k62G1 = interfaceC4366iD.g0(interfaceC6126qM2, i2);
                        if (interfaceC4366iD.d(interfaceC4812k62G0) == interfaceC4366iD.d(interfaceC4812k62G1) && (interfaceC4366iD.d(interfaceC4812k62G0) || (interfaceC4366iD.f(interfaceC4812k62G0) == interfaceC4366iD.f(interfaceC4812k62G1) && w(interfaceC4366iD, interfaceC4366iD.i(interfaceC4812k62G0), interfaceC4366iD.i(interfaceC4812k62G1))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean w(InterfaceC4366iD interfaceC4366iD, InterfaceC5702oL0 interfaceC5702oL0, InterfaceC5702oL0 interfaceC5702oL1) {
        if (interfaceC5702oL0 == interfaceC5702oL1) {
            return true;
        }
        AbstractC5706oM1 abstractC5706oM1N = interfaceC4366iD.n(interfaceC5702oL0);
        AbstractC5706oM1 abstractC5706oM1N2 = interfaceC4366iD.n(interfaceC5702oL1);
        if (abstractC5706oM1N != null && abstractC5706oM1N2 != null) {
            return v(interfaceC4366iD, abstractC5706oM1N, abstractC5706oM1N2);
        }
        AbstractC2299We0 abstractC2299We0W = interfaceC4366iD.W(interfaceC5702oL0);
        AbstractC2299We0 abstractC2299We0W2 = interfaceC4366iD.W(interfaceC5702oL1);
        return abstractC2299We0W != null && abstractC2299We0W2 != null && v(interfaceC4366iD, interfaceC4366iD.i0(abstractC2299We0W), interfaceC4366iD.i0(abstractC2299We0W2)) && v(interfaceC4366iD, interfaceC4366iD.P(abstractC2299We0W), interfaceC4366iD.P(abstractC2299We0W2));
    }

    public static void x(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }

    @Override // defpackage.WO1
    public StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[UserVerificationMethods.USER_VERIFY_ALL];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, UserVerificationMethods.USER_VERIFY_NONE);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - UserVerificationMethods.USER_VERIFY_NONE, stackTraceElementArr2, UserVerificationMethods.USER_VERIFY_NONE, UserVerificationMethods.USER_VERIFY_NONE);
        return stackTraceElementArr2;
    }

    @Override // defpackage.InterfaceC7604xP0
    public void c(@NonNull DP0 dp0) {
        dp0.onStart();
    }

    @Override // defpackage.J71
    public Object e() {
        return new ArrayList();
    }

    @Override // defpackage.E60
    public boolean f(@NonNull Object obj, @NonNull File file, @NonNull C4227ha1 c4227ha1) {
        try {
            C6035pw.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    @Override // defpackage.InterfaceC7604xP0
    public void a(@NonNull DP0 dp0) {
    }
}
