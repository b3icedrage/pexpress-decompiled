package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AN {

    public static final class a extends ML0 implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext.Element element2 = element;
            return element2 instanceof InterfaceC3137cN ? coroutineContext2.t(((InterfaceC3137cN) element2).Z()) : coroutineContext2.t(element2);
        }
    }

    public static final class b extends ML0 implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        public final /* synthetic */ C3027bp1<CoroutineContext> d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3027bp1<CoroutineContext> c3027bp1, boolean z) {
            super(2);
            this.d = c3027bp1;
            this.e = z;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof InterfaceC3137cN)) {
                return coroutineContext2.t(element2);
            }
            C3027bp1<CoroutineContext> c3027bp1 = this.d;
            if (c3027bp1.d.p(element2.getKey()) != null) {
                c3027bp1.d = c3027bp1.d.L(element2.getKey());
                return coroutineContext2.t(((InterfaceC3137cN) element2).U0());
            }
            InterfaceC3137cN interfaceC3137cNZ = (InterfaceC3137cN) element2;
            if (this.e) {
                interfaceC3137cNZ = interfaceC3137cNZ.Z();
            }
            return coroutineContext2.t(interfaceC3137cNZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        BN bn = BN.d;
        boolean zBooleanValue = ((Boolean) coroutineContext.R0(bool, bn)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.R0(bool, bn)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.t(coroutineContext2);
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = coroutineContext2;
        e eVar = e.d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.R0(eVar, new b(c3027bp1, z));
        if (zBooleanValue2) {
            c3027bp1.d = ((CoroutineContext) c3027bp1.d).R0(eVar, a.d);
        }
        return coroutineContext3.t((CoroutineContext) c3027bp1.d);
    }

    @NotNull
    public static final CoroutineContext b(@NotNull KN kn, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(kn.getE(), coroutineContext, true);
        RV rv = C6266r20.a;
        return (coroutineContextA == rv || coroutineContextA.p(d.f) != null) ? coroutineContextA : coroutineContextA.t(rv);
    }

    @Nullable
    public static final C7973z82<?> c(@NotNull JM<?> jm, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        C7973z82<?> c7973z82 = null;
        if ((jm instanceof NN) && coroutineContext.p(A82.d) != null) {
            NN callerFrame = (NN) jm;
            while (!(callerFrame instanceof C5217m20) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof C7973z82) {
                    c7973z82 = (C7973z82) callerFrame;
                    break;
                }
            }
            if (c7973z82 != null) {
                c7973z82.u0(coroutineContext, obj);
            }
        }
        return c7973z82;
    }
}
