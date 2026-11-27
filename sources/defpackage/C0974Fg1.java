package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0974Fg1 {

    @NotNull
    public static final C0974Fg1 a = new C0974Fg1();

    /* JADX INFO: renamed from: Fg1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C1364Kg1.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    @Nullable
    public final Y11 a(@NotNull FileInputStream input) throws VN {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            C1208Ig1 c1208Ig1U = C1208Ig1.u(input);
            Intrinsics.checkNotNullExpressionValue(c1208Ig1U, "{\n                Prefer…From(input)\n            }");
            Y11 y11A = C0896Eg1.a(new AbstractC0662Bg1.b[0]);
            Map<String, C1364Kg1> mapS = c1208Ig1U.s();
            Intrinsics.checkNotNullExpressionValue(mapS, "preferencesProto.preferencesMap");
            for (Map.Entry<String, C1364Kg1> entry : mapS.entrySet()) {
                String name = entry.getKey();
                C1364Kg1 value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                C1364Kg1.b bVarI = value.I();
                switch (bVarI == null ? -1 : a.a[bVarI.ordinal()]) {
                    case -1:
                        throw new VN("Value case is null.", 0);
                    case 0:
                    default:
                        throw new C6489s51();
                    case 1:
                        AbstractC0662Bg1.a<Boolean> key = C1052Gg1.a(name);
                        Boolean boolValueOf = Boolean.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(key, "key");
                        y11A.d(key, boolValueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        AbstractC0662Bg1.a<?> key2 = new AbstractC0662Bg1.a<>(name);
                        Float fValueOf = Float.valueOf(value.D());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        y11A.d(key2, fValueOf);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        AbstractC0662Bg1.a<?> key3 = new AbstractC0662Bg1.a<>(name);
                        Double dValueOf = Double.valueOf(value.C());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        y11A.d(key3, dValueOf);
                        break;
                    case 4:
                        AbstractC0662Bg1.a<Integer> key4 = C1052Gg1.b(name);
                        Integer numValueOf = Integer.valueOf(value.E());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        y11A.d(key4, numValueOf);
                        break;
                    case 5:
                        AbstractC0662Bg1.a<Long> key5 = C1052Gg1.c(name);
                        Long lValueOf = Long.valueOf(value.F());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        y11A.d(key5, lValueOf);
                        break;
                    case 6:
                        AbstractC0662Bg1.a<String> key6 = C1052Gg1.d(name);
                        String strG = value.G();
                        Intrinsics.checkNotNullExpressionValue(strG, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        y11A.d(key6, strG);
                        break;
                    case 7:
                        AbstractC0662Bg1.a<Set<String>> key7 = C1052Gg1.e(name);
                        VB0.c cVarT = value.H().t();
                        Intrinsics.checkNotNullExpressionValue(cVarT, "value.stringSet.stringsList");
                        Set setH0 = CollectionsKt.h0(cVarT);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        y11A.d(key7, setH0);
                        break;
                    case 8:
                        Intrinsics.checkNotNullParameter(name, "name");
                        AbstractC0662Bg1.a<?> key8 = new AbstractC0662Bg1.a<>(name);
                        AbstractC1565Mw abstractC1565MwA = value.A();
                        int size = abstractC1565MwA.size();
                        if (size == 0) {
                            bArr = VB0.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            abstractC1565MwA.d(size, bArr2);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        y11A.d(key8, bArr);
                        break;
                    case 9:
                        throw new VN("Value not set.", 0);
                }
            }
            return new Y11(PW0.l(y11A.a()), true);
        } catch (C6724tC0 e) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new VN("Unable to parse preferences proto.", e);
        }
    }

    public final Unit b(Object obj, C6922u82 c6922u82) throws IOException {
        C1364Kg1 c1364Kg1H;
        Map<AbstractC0662Bg1.a<?>, Object> mapA = ((AbstractC0662Bg1) obj).a();
        C1208Ig1.a aVarT = C1208Ig1.t();
        for (Map.Entry<AbstractC0662Bg1.a<?>, Object> entry : mapA.entrySet()) {
            AbstractC0662Bg1.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            if (value instanceof Boolean) {
                C1364Kg1.a aVarJ = C1364Kg1.J();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarJ.j();
                C1364Kg1.w((C1364Kg1) aVarJ.e, zBooleanValue);
                c1364Kg1H = aVarJ.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                C1364Kg1.a aVarJ2 = C1364Kg1.J();
                float fFloatValue = ((Number) value).floatValue();
                aVarJ2.j();
                C1364Kg1.x((C1364Kg1) aVarJ2.e, fFloatValue);
                c1364Kg1H = aVarJ2.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                C1364Kg1.a aVarJ3 = C1364Kg1.J();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarJ3.j();
                C1364Kg1.t((C1364Kg1) aVarJ3.e, dDoubleValue);
                c1364Kg1H = aVarJ3.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                C1364Kg1.a aVarJ4 = C1364Kg1.J();
                int iIntValue = ((Number) value).intValue();
                aVarJ4.j();
                C1364Kg1.y((C1364Kg1) aVarJ4.e, iIntValue);
                c1364Kg1H = aVarJ4.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                C1364Kg1.a aVarJ5 = C1364Kg1.J();
                long jLongValue = ((Number) value).longValue();
                aVarJ5.j();
                C1364Kg1.q((C1364Kg1) aVarJ5.e, jLongValue);
                c1364Kg1H = aVarJ5.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                C1364Kg1.a aVarJ6 = C1364Kg1.J();
                aVarJ6.j();
                C1364Kg1.r((C1364Kg1) aVarJ6.e, (String) value);
                c1364Kg1H = aVarJ6.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                C1364Kg1.a aVarJ7 = C1364Kg1.J();
                C1286Jg1.a aVarU = C1286Jg1.u();
                Intrinsics.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                aVarU.j();
                C1286Jg1.r((C1286Jg1) aVarU.e, (Set) value);
                aVarJ7.j();
                C1364Kg1.s((C1364Kg1) aVarJ7.e, aVarU.h());
                c1364Kg1H = aVarJ7.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                C1364Kg1.a aVarJ8 = C1364Kg1.J();
                byte[] bArr = (byte[]) value;
                AbstractC1565Mw.f fVar = AbstractC1565Mw.e;
                AbstractC1565Mw.f fVarC = AbstractC1565Mw.c(bArr, 0, bArr.length);
                aVarJ8.j();
                C1364Kg1.u((C1364Kg1) aVarJ8.e, fVarC);
                c1364Kg1H = aVarJ8.h();
                Intrinsics.checkNotNullExpressionValue(c1364Kg1H, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            aVarT.getClass();
            str.getClass();
            aVarT.j();
            C1208Ig1.r((C1208Ig1) aVarT.e).put(str, c1364Kg1H);
        }
        C1208Ig1 c1208Ig1H = aVarT.h();
        int iF = c1208Ig1H.f(null);
        Logger logger = GE.f;
        if (iF > 4096) {
            iF = 4096;
        }
        GE.d dVar = new GE.d(c6922u82, iF);
        c1208Ig1H.b(dVar);
        if (dVar.j > 0) {
            dVar.h0();
        }
        return Unit.a;
    }
}
