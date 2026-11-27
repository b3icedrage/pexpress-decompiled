package defpackage;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LL implements IK1, InterfaceC5056lH, J71, InterfaceC6027pt0 {

    @NotNull
    public static final LL e = new LL(3);

    @NotNull
    public static final LL g = new LL(4);

    @NotNull
    public static final MH1[] h = new MH1[0];
    public static final /* synthetic */ LL i = new LL(7);
    public final /* synthetic */ int d;

    public /* synthetic */ LL(int i2) {
        this.d = i2;
    }

    @NotNull
    public static final Set b(@NotNull MH1 mh1) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        if (mh1 instanceof InterfaceC6877tx) {
            return ((InterfaceC6877tx) mh1).b();
        }
        HashSet hashSet = new HashSet(mh1.e());
        int iE = mh1.e();
        for (int i2 = 0; i2 < iE; i2++) {
            hashSet.add(mh1.f(i2));
        }
        return hashSet;
    }

    @NotNull
    public static final MH1[] f(@Nullable List list) {
        MH1[] mh1Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (mh1Arr = (MH1[]) list.toArray(new MH1[0])) == null) ? h : mh1Arr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object g(@NotNull ArrayList arrayList, @NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull A62 a62, @NotNull Charset charset, @NotNull LM lm) throws FL {
        JL jl;
        if (lm instanceof JL) {
            jl = (JL) lm;
            int i2 = jl.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jl.h = i2 - Integer.MIN_VALUE;
            } else {
                jl = new JL(lm);
            }
        } else {
            jl = new JL(lm);
        }
        Object objR = jl.g;
        MN mn = MN.d;
        int i3 = jl.h;
        if (i3 == 0) {
            C1795Pt1.b(objR);
            IL il = new IL(new C0580Af0(arrayList), charset, a62, interfaceC0942Ew);
            KL kl = new KL(interfaceC0942Ew, null);
            jl.d = interfaceC0942Ew;
            jl.e = a62;
            jl.h = 1;
            objR = C4466ii.r(il, kl, jl);
            if (objR == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a62 = jl.e;
            interfaceC0942Ew = jl.d;
            C1795Pt1.b(objR);
        }
        if (objR != null) {
            return objR;
        }
        if (!interfaceC0942Ew.k()) {
            return interfaceC0942Ew;
        }
        SJ0 sj0 = a62.c;
        if (sj0 != null && sj0.a()) {
            return LE.h;
        }
        throw new FL("No suitable converter found for " + a62, null);
    }

    public static final boolean h(@NotNull InterfaceC0671Bj1 interfaceC0671Bj1) {
        Intrinsics.checkNotNullParameter(interfaceC0671Bj1, "<this>");
        return interfaceC0671Bj1.f() == null;
    }

    @NotNull
    public static final RI0 i(@NotNull SJ0 sj0) {
        Intrinsics.checkNotNullParameter(sj0, "<this>");
        InterfaceC4853kJ0 interfaceC4853kJ0G = sj0.g();
        if (interfaceC4853kJ0G instanceof RI0) {
            return (RI0) interfaceC4853kJ0G;
        }
        if (!(interfaceC4853kJ0G instanceof XJ0)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC4853kJ0G);
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC4853kJ0G + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC4853kJ0G + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC4853kJ0G + JwtParser.SEPARATOR_CHAR);
    }

    public static C3270d01 j(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j2; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C3270d01 c3270d01 = new C3270d01();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c3270d01.b = byteBufferDuplicate;
                    c3270d01.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c3270d01.c = i7;
                    c3270d01.d = c3270d01.b.getShort(i7);
                    return c3270d01;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    @NotNull
    public static final void k(@NotNull RI0 ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        String className = ri0.f();
        if (className == null) {
            className = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(className, "className");
        throw new ZH1("Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final int l(@NotNull EnumC2121Ty0 enumC2121Ty0) {
        Intrinsics.checkNotNullParameter(enumC2121Ty0, "<this>");
        int iOrdinal = enumC2121Ty0.ordinal();
        if (iOrdinal == 0) {
            return R.string.popular_title;
        }
        if (iOrdinal == 1) {
            return R.string.oscillator_tag;
        }
        if (iOrdinal == 2) {
            return R.string.trading_tag;
        }
        if (iOrdinal == 3) {
            return R.string.advanced_ai_indicator_title;
        }
        throw new C6489s51();
    }

    @Override // defpackage.IK1
    @NotNull
    public InterfaceC6396rf0 a(@NotNull FP1 fp1) {
        return new C0658Bf0(GK1.d);
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c1480Lt1);
    }

    @Override // defpackage.InterfaceC6027pt0
    public FS0 d(String str) {
        return C5428n21.d;
    }

    @Override // defpackage.J71
    public Object e() {
        return new TreeSet();
    }

    public String toString() {
        switch (this.d) {
            case 6:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
