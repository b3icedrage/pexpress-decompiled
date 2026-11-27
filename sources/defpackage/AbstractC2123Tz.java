package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2123Tz<T> implements InterfaceC4475ik0<T> {

    @NotNull
    public final CoroutineContext d;
    public final int e;

    @NotNull
    public final EnumC1796Pu g;

    public AbstractC2123Tz(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        this.d = coroutineContext;
        this.e = i;
        this.g = enumC1796Pu;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objD = LN.d(new C1967Rz(interfaceC6606sf0, this, null), jm);
        return objD == MN.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.InterfaceC4475ik0
    @NotNull
    public final InterfaceC6396rf0<T> f(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        CoroutineContext coroutineContext2 = this.d;
        CoroutineContext coroutineContextT = coroutineContext.t(coroutineContext2);
        EnumC1796Pu enumC1796Pu2 = EnumC1796Pu.d;
        EnumC1796Pu enumC1796Pu3 = this.g;
        int i2 = this.e;
        if (enumC1796Pu == enumC1796Pu2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            enumC1796Pu = enumC1796Pu3;
        }
        return (Intrinsics.a(coroutineContextT, coroutineContext2) && i == i2 && enumC1796Pu == enumC1796Pu3) ? this : k(coroutineContextT, i, enumC1796Pu);
    }

    @Nullable
    public String g() {
        return null;
    }

    @Nullable
    public abstract Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm);

    @NotNull
    public abstract AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu);

    @Nullable
    public InterfaceC6396rf0<T> l() {
        return null;
    }

    @NotNull
    public InterfaceC0764Co1<T> m(@NotNull KN kn) {
        int i = this.e;
        if (i == -3) {
            i = -2;
        }
        ON on = ON.g;
        Function2 c2045Sz = new C2045Sz(this, null);
        C1055Gh1 c1055Gh1 = new C1055Gh1(AN.b(kn, this.d), C2889bA.a(i, 4, this.g), true, true);
        c1055Gh1.s0(on, c1055Gh1, c2045Sz);
        return c1055Gh1;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        e eVar = e.d;
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != eVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC1796Pu enumC1796Pu = EnumC1796Pu.d;
        EnumC1796Pu enumC1796Pu2 = this.g;
        if (enumC1796Pu2 != enumC1796Pu) {
            arrayList.add("onBufferOverflow=" + enumC1796Pu2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C1039Gc0.e(sb, CollectionsKt.J(arrayList, ", ", null, null, null, 62), ']');
    }
}
