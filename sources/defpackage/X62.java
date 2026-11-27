package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class X62 {
    public static final X62 b = e(T62.a);

    @NotNull
    public final T62 a;

    public static final class a extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("NO_CONFLICT", 0);
            d = bVar;
            b bVar2 = new b("IN_IN_OUT_POSITION", 1);
            e = bVar2;
            b bVar3 = new b("OUT_IN_IN_POSITION", 2);
            g = bVar3;
            h = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }
    }

    public X62(@NotNull T62 t62) {
        if (t62 != null) {
            this.a = t62;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 34:
            case 37:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 29:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 34:
            case 37:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                    break;
                                default:
                                    switch (i) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static EnumC3610ed2 b(@NotNull EnumC3610ed2 enumC3610ed2, @NotNull EnumC3610ed2 enumC3610ed3) {
        if (enumC3610ed2 == null) {
            a(38);
            throw null;
        }
        if (enumC3610ed3 == null) {
            a(39);
            throw null;
        }
        EnumC3610ed2 enumC3610ed4 = EnumC3610ed2.INVARIANT;
        if (enumC3610ed2 == enumC3610ed4) {
            if (enumC3610ed3 != null) {
                return enumC3610ed3;
            }
            a(40);
            throw null;
        }
        if (enumC3610ed3 == enumC3610ed4) {
            if (enumC3610ed2 != null) {
                return enumC3610ed2;
            }
            a(41);
            throw null;
        }
        if (enumC3610ed2 == enumC3610ed3) {
            if (enumC3610ed3 != null) {
                return enumC3610ed3;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC3610ed2 + "' and projection kind '" + enumC3610ed3 + "' cannot be combined");
    }

    public static b c(EnumC3610ed2 enumC3610ed2, EnumC3610ed2 enumC3610ed3) {
        EnumC3610ed2 enumC3610ed4 = EnumC3610ed2.IN_VARIANCE;
        if (enumC3610ed2 == enumC3610ed4 && enumC3610ed3 == EnumC3610ed2.OUT_VARIANCE) {
            return b.g;
        }
        return (enumC3610ed2 == EnumC3610ed2.OUT_VARIANCE && enumC3610ed3 == enumC3610ed4) ? b.e : b.d;
    }

    @NotNull
    public static X62 d(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        if (abstractC4649jL0 == null) {
            a(6);
            throw null;
        }
        return e(AbstractC7124v62.b.a(abstractC4649jL0.V0(), abstractC4649jL0.T0()));
    }

    @NotNull
    public static X62 e(@NotNull T62 t62) {
        if (t62 != null) {
            return new X62(t62);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static X62 f(@NotNull T62 first, @NotNull T62 second) {
        if (first == null) {
            a(3);
            throw null;
        }
        if (second == null) {
            a(4);
            throw null;
        }
        int i = Y10.d;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.f()) {
            first = second;
        } else if (!second.f()) {
            first = new Y10(first, second);
        }
        return e(first);
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (C7279vr.k(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    @NotNull
    public final T62 g() {
        T62 t62 = this.a;
        if (t62 != null) {
            return t62;
        }
        a(8);
        throw null;
    }

    @NotNull
    public final AbstractC4649jL0 h(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull EnumC3610ed2 enumC3610ed2) {
        if (abstractC4649jL0 == null) {
            a(9);
            throw null;
        }
        if (this.a.f()) {
            return abstractC4649jL0;
        }
        try {
            AbstractC4649jL0 type = k(new P62(abstractC4649jL0, enumC3610ed2), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (a e) {
            return R70.c(Q70.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    @Nullable
    public final AbstractC4649jL0 j(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull EnumC3610ed2 enumC3610ed2) {
        if (abstractC4649jL0 == null) {
            a(14);
            throw null;
        }
        if (enumC3610ed2 == null) {
            a(15);
            throw null;
        }
        N62 p62 = new P62(g().g(abstractC4649jL0, enumC3610ed2), enumC3610ed2);
        T62 t62 = this.a;
        if (!t62.f()) {
            try {
                p62 = k(p62, null, 0);
            } catch (a unused) {
                p62 = null;
            }
        }
        if (t62.a() || t62.b()) {
            boolean zB = t62.b();
            if (p62 == null) {
                p62 = null;
            } else if (!p62.c()) {
                AbstractC4649jL0 type = p62.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (C3089c72.c(type, C2276Vy.e, null)) {
                    EnumC3610ed2 enumC3610ed2B = p62.b();
                    Intrinsics.checkNotNullExpressionValue(enumC3610ed2B, "getProjectionKind(...)");
                    if (enumC3610ed2B == EnumC3610ed2.OUT_VARIANCE) {
                        p62 = new P62(C2462Xy.a(type).b, enumC3610ed2B);
                    } else if (zB) {
                        p62 = new P62(C2462Xy.a(type).a, enumC3610ed2B);
                    } else {
                        X62 x62E = e(new C2358Wy());
                        Intrinsics.checkNotNullExpressionValue(x62E, "create(...)");
                        if (!x62E.a.f()) {
                            try {
                                p62 = x62E.k(p62, null, 0);
                            } catch (a unused2) {
                                p62 = null;
                            }
                        }
                    }
                }
            }
        }
        if (p62 == null) {
            return null;
        }
        return p62.getType();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:104:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x022f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0235  */
    /* JADX WARN: Code duplicated, block: B:113:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x023b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0258  */
    /* JADX WARN: Code duplicated, block: B:126:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x029f  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @NotNull
    public final N62 k(@NotNull N62 n62, @Nullable H62 h62, int i) throws a {
        AbstractC4649jL0 type;
        EnumC3610ed2 enumC3610ed2B;
        P92 p92Y0;
        C6886u c6886u;
        AbstractC5706oM1 abstractC5706oM1;
        List<H62> listB;
        List<N62> newArguments;
        ArrayList arrayList;
        boolean z;
        AbstractC4649jL0 abstractC4649jL0C;
        H62 h63;
        N62 n63;
        N62 n62K;
        int iOrdinal;
        char c;
        EnumC3610ed2 enumC3610ed2S;
        EnumC3610ed2 enumC3610ed2;
        X62 x62;
        b bVarC;
        InterfaceC0726Cc interfaceC0726CcY0;
        HR hr;
        AbstractC4649jL0 abstractC4649jL0I;
        InterfaceC2396Xc interfaceC2396XcD;
        int iOrdinal2;
        X62 x63 = this;
        int i2 = 0;
        AbstractC4649jL0 abstractC4649jL0J = null;
        if (n62 == null) {
            a(18);
            throw null;
        }
        T62 t62 = x63.a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + i(n62) + "; substitution: " + i(t62));
        }
        if (!n62.c()) {
            AbstractC4649jL0 type2 = n62.getType();
            if (type2 instanceof InterfaceC3928g72) {
                InterfaceC3928g72 interfaceC3928g72 = (InterfaceC3928g72) type2;
                P92 p92N0 = interfaceC3928g72.N0();
                AbstractC4649jL0 abstractC4649jL0N = interfaceC3928g72.N();
                N62 n62K2 = x63.k(new P62(p92N0, n62.b()), h62, i + 1);
                return n62K2.c() ? n62K2 : new P62(C6621sj.r(n62K2.getType().Y0(), x63.j(abstractC4649jL0N, n62.b())), n62K2.b());
            }
            if (!Z40.a(type2) && !(type2.Y0() instanceof C2242Vm1)) {
                N62 n62E = t62.e(type2);
                if (n62E == null) {
                    n62E = null;
                } else if (type2.k().P(C4194hP1.a.y)) {
                    InterfaceC6494s62 interfaceC6494s62V0 = n62E.getType().V0();
                    if (interfaceC6494s62V0 instanceof C5436n41) {
                        N62 n64 = ((C5436n41) interfaceC6494s62V0).a;
                        EnumC3610ed2 enumC3610ed2B2 = n64.b();
                        b bVarC2 = c(n62.b(), enumC3610ed2B2);
                        b bVar = b.g;
                        if (bVarC2 == bVar) {
                            n62E = new P62(n64.getType());
                        } else if (h62 != null && c(h62.S(), enumC3610ed2B2) == bVar) {
                            n62E = new P62(n64.getType());
                        }
                    }
                }
                EnumC3610ed2 enumC3610ed2B3 = n62.b();
                if (n62E == null && C6621sj.j(type2)) {
                    Intrinsics.checkNotNullParameter(type2, "<this>");
                    InterfaceC0726Cc interfaceC0726CcY1 = type2.Y0();
                    HR hr2 = interfaceC0726CcY1 instanceof HR ? (HR) interfaceC0726CcY1 : null;
                    if (!(hr2 != null ? hr2.H0() : false)) {
                        Intrinsics.checkNotNullParameter(type2, "<this>");
                        AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) type2.Y0();
                        AbstractC5706oM1 abstractC5706oM2 = abstractC2299We0.e;
                        int i3 = i + 1;
                        N62 n62K3 = x63.k(new P62(abstractC5706oM2, enumC3610ed2B3), h62, i3);
                        AbstractC5706oM1 abstractC5706oM3 = abstractC2299We0.g;
                        N62 n62K4 = x63.k(new P62(abstractC5706oM3, enumC3610ed2B3), h62, i3);
                        EnumC3610ed2 enumC3610ed2B4 = n62K3.b();
                        if (n62K3.getType() != abstractC5706oM2 || n62K4.getType() != abstractC5706oM3) {
                            return new P62(C5492nL0.a(V62.a(n62K3.getType()), V62.a(n62K4.getType())), enumC3610ed2B4);
                        }
                    } else if (!RK0.E(type2)) {
                        if (n62E != null) {
                            bVarC = c(enumC3610ed2B3, n62E.b());
                            Intrinsics.checkNotNullParameter(type2, "<this>");
                            if (!(type2.V0() instanceof InterfaceC2540Yy)) {
                                iOrdinal2 = bVarC.ordinal();
                                if (iOrdinal2 != 1) {
                                    return new P62(type2.V0().t().o(), EnumC3610ed2.OUT_VARIANCE);
                                }
                                if (iOrdinal2 == 2) {
                                    throw new a("Out-projection in in-position");
                                }
                            }
                            Intrinsics.checkNotNullParameter(type2, "<this>");
                            interfaceC0726CcY0 = type2.Y0();
                            if (interfaceC0726CcY0 instanceof HR) {
                                hr = (HR) interfaceC0726CcY0;
                            } else {
                                hr = null;
                            }
                            if (hr != null) {
                                hr = null;
                            } else {
                                hr = null;
                            }
                            if (n62E.c()) {
                                return n62E;
                            }
                            if (hr != null) {
                                abstractC4649jL0I = hr.G0(n62E.getType());
                            } else {
                                abstractC4649jL0I = C3089c72.i(n62E.getType(), type2.W0());
                            }
                            if (!type2.k().isEmpty()) {
                                interfaceC2396XcD = t62.d(type2.k());
                                if (interfaceC2396XcD != null) {
                                    a(33);
                                    throw null;
                                }
                                if (interfaceC2396XcD.P(C4194hP1.a.y)) {
                                    interfaceC2396XcD = new C7228vd0(interfaceC2396XcD, new W62());
                                }
                                abstractC4649jL0I = C0564Aa.u(abstractC4649jL0I, new DH(abstractC4649jL0I.k(), interfaceC2396XcD));
                            }
                            if (bVarC == b.d) {
                                enumC3610ed2B3 = b(enumC3610ed2B3, n62E.b());
                            }
                            return new P62(abstractC4649jL0I, enumC3610ed2B3);
                        }
                        type = n62.getType();
                        enumC3610ed2B = n62.b();
                        if (!(type.V0().c() instanceof H62)) {
                            Intrinsics.checkNotNullParameter(type, "<this>");
                            Intrinsics.checkNotNullParameter(type, "<this>");
                            p92Y0 = type.Y0();
                            if (p92Y0 instanceof C6886u) {
                                c6886u = (C6886u) p92Y0;
                            } else {
                                c6886u = null;
                            }
                            if (c6886u != null) {
                                abstractC5706oM1 = c6886u.g;
                            } else {
                                abstractC5706oM1 = null;
                            }
                            if (abstractC5706oM1 != null) {
                                if (t62 instanceof C1258Ix0) {
                                    x62 = x63;
                                } else {
                                    x62 = x63;
                                }
                                abstractC4649jL0J = x62.j(abstractC5706oM1, EnumC3610ed2.INVARIANT);
                            }
                            listB = type.V0().b();
                            newArguments = type.T0();
                            arrayList = new ArrayList(listB.size());
                            z = false;
                            while (i2 < listB.size()) {
                                h63 = listB.get(i2);
                                n63 = newArguments.get(i2);
                                n62K = x63.k(n63, h63, i + 1);
                                iOrdinal = c(h63.S(), n62K.b()).ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        c = 2;
                                        if (iOrdinal == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    n62K = C3089c72.k(h63);
                                } else {
                                    c = 2;
                                    enumC3610ed2S = h63.S();
                                    enumC3610ed2 = EnumC3610ed2.INVARIANT;
                                    if (enumC3610ed2S != enumC3610ed2) {
                                        n62K = new P62(n62K.getType(), enumC3610ed2);
                                    }
                                }
                                if (n62K != n63) {
                                    z = true;
                                }
                                arrayList.add(n62K);
                                i2++;
                                x63 = this;
                            }
                            if (z) {
                                newArguments = arrayList;
                            }
                            InterfaceC2396Xc newAnnotations = t62.d(type.k());
                            Intrinsics.checkNotNullParameter(type, "<this>");
                            Intrinsics.checkNotNullParameter(newArguments, "newArguments");
                            Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
                            abstractC4649jL0C = V62.c(type, newArguments, newAnnotations, 4);
                            if (abstractC4649jL0C instanceof AbstractC5706oM1) {
                                abstractC4649jL0C = C6971uO1.c((AbstractC5706oM1) abstractC4649jL0C, (AbstractC5706oM1) abstractC4649jL0J);
                            }
                            return new P62(abstractC4649jL0C, enumC3610ed2B);
                        }
                    }
                } else if (!RK0.E(type2) && !C3686f.n(type2)) {
                    if (n62E != null) {
                        bVarC = c(enumC3610ed2B3, n62E.b());
                        Intrinsics.checkNotNullParameter(type2, "<this>");
                        if (!(type2.V0() instanceof InterfaceC2540Yy)) {
                            iOrdinal2 = bVarC.ordinal();
                            if (iOrdinal2 != 1) {
                                return new P62(type2.V0().t().o(), EnumC3610ed2.OUT_VARIANCE);
                            }
                            if (iOrdinal2 == 2) {
                                throw new a("Out-projection in in-position");
                            }
                        }
                        Intrinsics.checkNotNullParameter(type2, "<this>");
                        interfaceC0726CcY0 = type2.Y0();
                        if (interfaceC0726CcY0 instanceof HR) {
                            hr = (HR) interfaceC0726CcY0;
                        } else {
                            hr = null;
                        }
                        if (hr != null || !hr.H0()) {
                            hr = null;
                        }
                        if (n62E.c()) {
                            return n62E;
                        }
                        if (hr != null) {
                            abstractC4649jL0I = hr.G0(n62E.getType());
                        } else {
                            abstractC4649jL0I = C3089c72.i(n62E.getType(), type2.W0());
                        }
                        if (!type2.k().isEmpty()) {
                            interfaceC2396XcD = t62.d(type2.k());
                            if (interfaceC2396XcD != null) {
                                a(33);
                                throw null;
                            }
                            if (interfaceC2396XcD.P(C4194hP1.a.y)) {
                                interfaceC2396XcD = new C7228vd0(interfaceC2396XcD, new W62());
                            }
                            abstractC4649jL0I = C0564Aa.u(abstractC4649jL0I, new DH(abstractC4649jL0I.k(), interfaceC2396XcD));
                        }
                        if (bVarC == b.d) {
                            enumC3610ed2B3 = b(enumC3610ed2B3, n62E.b());
                        }
                        return new P62(abstractC4649jL0I, enumC3610ed2B3);
                    }
                    type = n62.getType();
                    enumC3610ed2B = n62.b();
                    if (!(type.V0().c() instanceof H62)) {
                        Intrinsics.checkNotNullParameter(type, "<this>");
                        Intrinsics.checkNotNullParameter(type, "<this>");
                        p92Y0 = type.Y0();
                        if (p92Y0 instanceof C6886u) {
                            c6886u = (C6886u) p92Y0;
                        } else {
                            c6886u = null;
                        }
                        if (c6886u != null) {
                            abstractC5706oM1 = c6886u.g;
                        } else {
                            abstractC5706oM1 = null;
                        }
                        if (abstractC5706oM1 != null) {
                            if ((t62 instanceof C1258Ix0) || !t62.b()) {
                                x62 = x63;
                            } else {
                                C1258Ix0 c1258Ix0 = (C1258Ix0) t62;
                                x62 = new X62(new C1258Ix0(c1258Ix0.b, c1258Ix0.c, false));
                            }
                            abstractC4649jL0J = x62.j(abstractC5706oM1, EnumC3610ed2.INVARIANT);
                        }
                        listB = type.V0().b();
                        newArguments = type.T0();
                        arrayList = new ArrayList(listB.size());
                        z = false;
                        while (i2 < listB.size()) {
                            h63 = listB.get(i2);
                            n63 = newArguments.get(i2);
                            n62K = x63.k(n63, h63, i + 1);
                            iOrdinal = c(h63.S(), n62K.b()).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    c = 2;
                                    if (iOrdinal == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                n62K = C3089c72.k(h63);
                            } else {
                                c = 2;
                                enumC3610ed2S = h63.S();
                                enumC3610ed2 = EnumC3610ed2.INVARIANT;
                                if (enumC3610ed2S != enumC3610ed2 && !n62K.c()) {
                                    n62K = new P62(n62K.getType(), enumC3610ed2);
                                }
                            }
                            if (n62K != n63) {
                                z = true;
                            }
                            arrayList.add(n62K);
                            i2++;
                            x63 = this;
                        }
                        if (z) {
                            newArguments = arrayList;
                        }
                        InterfaceC2396Xc newAnnotations2 = t62.d(type.k());
                        Intrinsics.checkNotNullParameter(type, "<this>");
                        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
                        Intrinsics.checkNotNullParameter(newAnnotations2, "newAnnotations");
                        abstractC4649jL0C = V62.c(type, newArguments, newAnnotations2, 4);
                        if ((abstractC4649jL0C instanceof AbstractC5706oM1) && (abstractC4649jL0J instanceof AbstractC5706oM1)) {
                            abstractC4649jL0C = C6971uO1.c((AbstractC5706oM1) abstractC4649jL0C, (AbstractC5706oM1) abstractC4649jL0J);
                        }
                        return new P62(abstractC4649jL0C, enumC3610ed2B);
                    }
                }
            }
        }
        return n62;
    }
}
